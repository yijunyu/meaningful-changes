/**
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.edit.parts.labels;

import java.text.FieldPosition;
import java.text.MessageFormat;
import java.text.ParsePosition;
import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.internal.runtime.lite.Activator;
import org.eclipse.gmf.runtime.lite.services.ParserUtil;
import org.eclipse.jface.viewers.ICellEditorValidator;

/**
 * An implementation of {@link ILabelTextDisplayer} that is based on a {@link MessageFormat format} and 
 * a number of {@link EStructuralFeature structural features} of the source object.
 */
public class SimpleLabelTextDisplayer extends AbstractLabelTextDisplayer implements ICellEditorValidator {
	private final String myViewPattern;
	private final String myEditPattern;

	private MessageFormat myViewProcessor;
	private MessageFormat myEditProcessor;

	private final EStructuralFeature[] myFeatures;

	private static final String EMPTY_STRING = "";	//$NON-NLS-1$

	/**
	 * Creates a text displayer which uses the given view pattern and will operate on the given features.
	 * The label is not editable.
	 */
	public SimpleLabelTextDisplayer(String viewPattern, EStructuralFeature... features) {
		this(viewPattern, null, features);
	}

	/**
	 * Creates a text displayer which uses the given view and edit patterns and will operate on the given features.
	 * If the edit pattern is <code>null</code>, the label will not be editable.
	 */
	public SimpleLabelTextDisplayer(String viewPattern, String editPattern, EStructuralFeature... features) {
		myViewPattern = viewPattern;
		myEditPattern = editPattern;
		myFeatures = features;
	}

	public String getDisplayText(EObject source) {
		if (source == null) {
			return null;
		}
		String result = buildTextByPattern(source, getViewPatternProcessor());
		if (result == null || result.length() == 0) {
			return null;
		}
		return result;
	}

	@Override
	public String getEditText(EObject source) {
		if (source == null) {
			return EMPTY_STRING;
		}
		String result = buildTextByPattern(source, getEditPatternProcessor());
		if (result == null) {
			return EMPTY_STRING;
		}
		return result;
	}

	private String buildTextByPattern(EObject source, MessageFormat format) {
		if (format == null) {
			return null;
		}
		Object[] arguments = new Object[myFeatures.length];
		try {
			for(int i = 0; i < myFeatures.length; i++) {
				arguments[i] = getValidValue(myFeatures[i], source.eGet(myFeatures[i]));
				if (arguments[i] == null) {
					return null;
				}
			}
		} catch (Exception e) {
			//This may happen e.g., if the source is an unresolved proxy.
			Activator.getDefault().logError("Exception occurred while building text for a label", e);
			return null;
		}
		return format.format(arguments, new StringBuffer(), new FieldPosition(0)).toString();
	}

	protected final MessageFormat getViewPatternProcessor() {
		if (myViewProcessor == null) {
			myViewProcessor = createViewPatternProcessor(myViewPattern);
		}
		return myViewProcessor;
	}

	protected final MessageFormat getEditPatternProcessor() {
		if (myEditPattern == null) {
			return null;
		}
		if (myEditProcessor == null) {
			myEditProcessor = createEditPatternProcessor(myEditPattern);
		}
		return myEditProcessor;
	}

	protected MessageFormat createViewPatternProcessor(String viewPattern) {
		return new MessageFormat(viewPattern);
	}

	protected MessageFormat createEditPatternProcessor(String editPattern) {
		return new MessageFormat(editPattern);
	}

	/**
	 * Allows the given value to be replaced. By default, <code>null</code> strings are converted to empty strings, 
	 * no other replacements are performed. Subclasses may extend or reimplement.
	 */
	protected Object getValidValue(EStructuralFeature feature, Object value) {
		if (value == null) {
			EClassifier type = feature.getEType();
			if (type instanceof EDataType && String.class.equals(type.getInstanceClass())) {
				return EMPTY_STRING;
			}
		}
		return value;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Command getApplyCommand(EObject source, String newValue) {
		if (getEditPatternProcessor() == null) {
			return UnexecutableCommand.INSTANCE;
		}
		ParsePosition pos = new ParsePosition(0);
		Object[] values;
		if (myFeatures.length == 1 && EMPTY_STRING.equals(newValue)) {
			values = new Object[] {null};
		} else {
			values = getEditPatternProcessor().parse(newValue, pos);
		}
		if (values == null || values.length != myFeatures.length) {
			return UnexecutableCommand.INSTANCE;
		}
		try {
			for (int i = 0; i < myFeatures.length; i++) {
				values[i] = getValidNewValue(myFeatures[i], values[i]);
			}
		} catch (IllegalArgumentException e) {
			return UnexecutableCommand.INSTANCE;
		}
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(source);
		CompoundCommand result = new CompoundCommand();
		for (int i = 0; i < myFeatures.length; i++) {
			if (myFeatures[i].isMany()) {
				EList valuesList = new BasicEList();
				valuesList.addAll((Collection) source.eGet(myFeatures[i]));
				result.append(RemoveCommand.create(editingDomain, source, myFeatures[i], valuesList));
				if (values[i] != null) {
					result.append(AddCommand.create(editingDomain, source, myFeatures[i], values[i]));
				}
			} else {
				result.append(SetCommand.create(editingDomain, source, myFeatures[i], values[i] == null ? SetCommand.UNSET_VALUE : values[i]));
			}
		}
		return result.unwrap();
	}

	public boolean isAffectingEvent(Notification notification) {
		if (notification == null || notification.isTouch()) {
			return false;
		}
		Object feature = notification.getFeature();
		for (EStructuralFeature nextFeature : myFeatures) {
			if (nextFeature.equals(feature)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public ICellEditorValidator getValidator() {
		return this;
	}

	public String isValid(Object value) {
		if (false == value instanceof String) {
			return "String value expected";
		}
		if (getEditPatternProcessor() == null) {
			return "The label cannot be edited";
		}
		String stringValue = (String) value;
		ParsePosition pos = new ParsePosition(0);
		Object[] values = getEditPatternProcessor().parse(stringValue, pos);
		if (values == null) {
			return MessageFormat.format("Invalid input at {0}", pos.getErrorIndex());
		}
		if (values.length != myFeatures.length) {
			return "Unable to parse input";
		}
		for(int i = 0; i < myFeatures.length; i++) {
			try {
				values[i] = getValidNewValue(myFeatures[i], values[i]);
			} catch (IllegalArgumentException e) {
				MessageFormat.format("Invalid input at {0}: {1}", i, e.getLocalizedMessage());
			}
		}
		return null;
	}

	/**
	 * Allows the parsed value to be replaced (e.g., to match the type of the structural feature).
	 * @throws IllegalArgumentException if the value cannot be parsed for the type of the given structural feature.
	 */
	protected Object getValidNewValue(EStructuralFeature structuralFeature, Object value) throws IllegalArgumentException {
		if (EMPTY_STRING.equals(value) && shouldReplaceEmptyStringsWithNulls(structuralFeature)) {
			return null;
		}
		if (structuralFeature instanceof EAttribute) {
			return ParserUtil.parseValue((EAttribute) structuralFeature, value);
		}
		return null;
	}

	/**
	 * Returns whether empty strings should be replaced with <code>null</code>s when applied.
	 */
	protected boolean shouldReplaceEmptyStringsWithNulls(EStructuralFeature structuralFeature) {
		return !structuralFeature.isRequired();
	}

	
	/**
	 * Returns the features used by this displayer.
	 */
	protected EStructuralFeature[] getFeatures() {
		return myFeatures;
	}
}

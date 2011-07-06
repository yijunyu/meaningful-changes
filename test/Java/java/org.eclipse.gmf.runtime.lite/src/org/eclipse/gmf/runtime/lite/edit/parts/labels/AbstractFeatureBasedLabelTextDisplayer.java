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

import java.text.MessageFormat;
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
 * An implementation of {@link ILabelTextDisplayer} that is based on a 
 * number of {@link EStructuralFeature structural features} of the source object.
 */
public abstract class AbstractFeatureBasedLabelTextDisplayer extends AbstractLabelTextDisplayer implements ICellEditorValidator {
	private final EStructuralFeature[] myFeatures;

	protected static final String EMPTY_STRING = "";	//$NON-NLS-1$

	public AbstractFeatureBasedLabelTextDisplayer(EStructuralFeature... features) {
		myFeatures = features;
	}

	public String getDisplayText(EObject source) {
		if (source == null) {
			return null;
		}
		Object[] values = getValues(source);
		if (values == null) {
			return null;
		}
		String result = buildDisplayText(values);
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
		Object[] values = getValues(source);
		if (values == null) {
			return EMPTY_STRING;
		}
		String result = buildEditText(values);
		if (result == null) {
			return EMPTY_STRING;
		}
		return result;
	}

	protected Object[] getValues(EObject source) {
		Object[] result = new Object[myFeatures.length];
		try {
			for(int i = 0; i < myFeatures.length; i++) {
				result[i] = getValidValue(myFeatures[i], source.eGet(myFeatures[i]));
				if (result[i] == null) {
					return null;
				}
			}
		} catch (Exception e) {
			//This may happen e.g., if the source is an unresolved proxy.
			Activator.getDefault().logError("Exception occurred while building text for a label", e);
			return null;
		}
		return result;
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

	@SuppressWarnings("unchecked")
	@Override
	public Command getApplyCommand(EObject source, String newValue) {
		Object[] parsedValues;
		Object[] newValues;
		try {
			parsedValues = parseEditedValues(newValue);
			if (parsedValues == null || parsedValues.length != myFeatures.length) {
				return UnexecutableCommand.INSTANCE;
			}
			newValues = new Object[myFeatures.length];
			for (int i = 0; i < myFeatures.length; i++) {
				newValues[i] = getValidNewValue(myFeatures[i], parsedValues[i]);
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
				if (newValues[i] != null) {
					result.append(AddCommand.create(editingDomain, source, myFeatures[i], newValues[i]));
				}
			} else {
				result.append(SetCommand.create(editingDomain, source, myFeatures[i], newValues[i] == null ? SetCommand.UNSET_VALUE : newValues[i]));
			}
		}
		return result.unwrap();
	}

	@Override
	public ICellEditorValidator getValidator() {
		return this;
	}

	public String isValid(Object value) {
		if (false == value instanceof String) {
			return "String value expected";
		}
		String stringValue = (String) value;
		Object[] values;
		try {
			values = parseEditedValues(stringValue);
		} catch (IllegalArgumentException e) {
			return "Unable to parse input";
		}
		if (values == null || values.length != myFeatures.length) {
			return "Unable to parse input";
		}
		for(int i = 0; i < myFeatures.length; i++) {
			try {
				getValidNewValue(myFeatures[i], values[i]);
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

	/**
	 * Returns the text to be displayed by this label processor for the given values.
	 */
	protected abstract String buildDisplayText(Object[] featureValues);

	/**
	 * Returns the initial edit text to be displayed by this label processor for the given values.
	 */
	protected abstract String buildEditText(Object[] featureValues);

	/**
	 * Returns the values that should be set to the corresponding features. 
	 * @throws IllegalArgumentException If the given string is invalid.
	 */
	protected abstract Object[] parseEditedValues(String newString) throws IllegalArgumentException;
}

/**
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.properties;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gmf.runtime.lite.parts.CommandStackAdapterManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public abstract class AdvancedPropertySection extends org.eclipse.ui.views.properties.tabbed.AdvancedPropertySection {
	public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);
		myPropertySheetEntry = new RootUndoablePropertySheetEntry(null, page);
		myPropertySheetEntry.setPropertySourceProvider(getPropertySourceProvider());
		page.setRootEntry(myPropertySheetEntry);
	}

	public void setInput(IWorkbenchPart part, ISelection selection) {
		if (selection.isEmpty()
				|| false == selection instanceof StructuredSelection) {
			super.setInput(part, selection);
			return;
		}
		final StructuredSelection structuredSelection = ((StructuredSelection) selection);
		ArrayList<Object> transformedSelection = new ArrayList<Object>(structuredSelection.size());
		for (Iterator<?> it = structuredSelection.iterator(); it.hasNext(); ) {
			Object r = transformSelection(it.next());
			if (r != null) {
				transformedSelection.add(r);
			}
		}
		CommandStack commandStack = getCommandStack(transformedSelection);
		myPropertySheetEntry.setCommandStack(commandStack);
		super.setInput(part, new StructuredSelection(transformedSelection));
	}

	protected CommandStack getCommandStack(ArrayList<?> selection) {
		CommandStack result = null;
		for(Object next : selection) {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(next);
			if (editingDomain == null) {
				return null;
			}
			CommandStack nextStackCandidate = getCommandStack(editingDomain);
			if (nextStackCandidate == null) {
				return null;
			}
			if (result == null) {
				result = nextStackCandidate;
			} else if (result != nextStackCandidate) {
				return null;
			}
		}
		return result;
	}

	static CommandStack getCommandStack(TransactionalEditingDomain editingDomain) {
		if (editingDomain == null) {
			return null;
		}
		CommandStackAdapterManager adapterManager = (CommandStackAdapterManager) EcoreUtil.getExistingAdapter(editingDomain.getResourceSet(), CommandStackAdapterManager.class);
		if (adapterManager == null || adapterManager.isReleased()) {
			return null;
		}
		return adapterManager.getCommandStack();
	}

	protected PropertySourceProvider getPropertySourceProvider() {
		if (myPropertySourceProvider == null) {
			myPropertySourceProvider = new PropertySourceProvider(getItemProvidersAdapterFactory());
		}
		return myPropertySourceProvider;
	}

	protected abstract AdapterFactory getItemProvidersAdapterFactory();
	/**
	 * Allows the subclasses to unwrap or otherwise modify the contents of the selection. The <code>null</code> result may be returned,
	 * in this case it will be ignored.
	 * <p/>By default, the passed object is returned untouched.
	 */
	protected Object transformSelection(Object selected) {
		return selected;
	}

	@Override
	public void refresh() {
		page.refresh();
	}

	private PropertySourceProvider myPropertySourceProvider;
	private RootUndoablePropertySheetEntry myPropertySheetEntry;
}

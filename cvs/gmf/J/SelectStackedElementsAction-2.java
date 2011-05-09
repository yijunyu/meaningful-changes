/*
 * Copyright (c) 2006, 2007 Borland Software Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 */
package org.eclipse.gmf.graphdef.editor.edit.parts;

import java.text.Collator;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MenuEvent;
import org.eclipse.swt.events.MenuListener;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class SelectStackedElementsAction extends Action implements IMenuCreator, MenuListener, IObjectActionDelegate {
	public static final String EMPTY_STRING = ""; //$NON-NLS-1$

	/**
	 * The menu created by this action
	 */
	private Menu myMenu;
		
	private AbstractFigureEditPart mySelectedElement;

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		action.setMenuCreator(getMenuCreator());
	}

	public IMenuCreator getMenuCreator() {
		return this;
	}

	public Menu getMenu(Control parent) {
		return createMenu(parent);
	}

	public Menu getMenu(Menu parent) {
		return createMenu(parent);
	}

	protected Menu createMenu(Widget parent) {
		if (parent == null) {
			return null;
		}
		if (myMenu != null) {
			myMenu.dispose();
		}
		myMenu = createMenuFromMenuOrControlParent(parent);
		myMenu.addMenuListener(this);
		return myMenu;
	}

	public void menuShown(MenuEvent e) {
		clearMenu(myMenu);
		fillMenu(myMenu, mySelectedElement);
	}
	
	public void menuHidden(MenuEvent e) {
	}

	public void dispose() {
		if (myMenu != null) {
			myMenu.dispose();
		}
		myMenu = null;
	}

	private void clearMenu(Menu menu) {
		MenuItem[] actions = menu.getItems();
		for (int i=0; i<actions.length; i++) {
			actions[i].dispose();
		}
	}
	
	private static Menu createMenuFromMenuOrControlParent(Widget parent) {
		Menu result = null;
		if (parent instanceof Menu) {
			result = new Menu((Menu)parent);
		} else if (parent instanceof Control) {
			result = new Menu((Control) parent);
		}
		return result;
	}
	
	private static void fillMenu(Menu menu, EditPart selectedElement) {
		if (selectedElement == null) {
			return;
		}
		int numChildren = selectedElement.getChildren().size();
		IAction[] selectChildActions = new IAction[numChildren];
		List expandChildrenActions = new ArrayList(numChildren);
		for (int i=0; i<numChildren; i++) {
			final EditPart next = (EditPart) selectedElement.getChildren().get(i);
			String className = next.getClass().getName();
			String preciseName = String.valueOf(i);
			if (next instanceof AbstractFigureEditPart) {
				View model = (View) ((AbstractFigureEditPart) next).getModel();
				Figure modelElement = (Figure) model.getElement();
				className = modelElement.eClass().getName();
				String elementName = modelElement.getName();
				if (elementName != null && elementName.length() != 0) {
					preciseName = elementName;
				}
			}
			String selectChildCommandName = MessageFormat.format("{0}:{1}", new Object[] {className, preciseName});
			selectChildActions[i] = new SelectChildAction(next, selectChildCommandName);
			if (next.getChildren().size() > 0) {
				String expandChildrenCommandName = numChildren > 1 ? MessageFormat.format("Select Children of {0}", new Object[] {selectChildCommandName}) : "Select Children";
				expandChildrenActions.add(new ExpandChildrenAction(next, expandChildrenCommandName));
			}
		}
		for (int i=0; i<selectChildActions.length; i++) {
			ActionContributionItem item = new ActionContributionItem(selectChildActions[i]);
			item.fill(menu, -1);
		}
		int numExpandableCommands = expandChildrenActions.size();
		if (numExpandableCommands > 0) {
			new MenuItem(menu, SWT.SEPARATOR, selectChildActions.length);
			for (int i=0; i<numExpandableCommands; i++) {
				IAction next = (IAction) expandChildrenActions.get(i);
				ActionContributionItem item = new ActionContributionItem(next);
				item.fill(menu, selectChildActions.length + i + 1);
			}
		}
	}

	public void run(IAction action) {
		//do nothing, this action just creates a cascading menu.
	}

	public void selectionChanged(IAction action, ISelection selection) {
		mySelectedElement = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() == 1 && structuredSelection.getFirstElement() instanceof AbstractFigureEditPart) {
				mySelectedElement = (AbstractFigureEditPart) structuredSelection.getFirstElement();
			}
		}
		action.setEnabled(isEnabled());
	}

	public boolean isEnabled() {
		return mySelectedElement != null && mySelectedElement.getChildren().size() > 0;
	}

	private static class SelectChildAction extends Action implements Comparable {
		private final EditPart myTarget;
		private final String myName;
		
		public SelectChildAction(EditPart target, String name) {
			super(name, IAction.AS_PUSH_BUTTON);
			myName = name;
			myTarget = target;
		}
		
		public EditPart getTargetPart() {
			return myTarget;
		}
		
		public String getName() {
			return myName;
		}
		
		public void run() {
			myTarget.getViewer().select(myTarget);
		}
		
		public int compareTo(Object o) {
			if (!(o instanceof SelectChildAction)) {
				return -1;
			}
			String otherName = ((SelectChildAction)o).getName();
			return Collator.getInstance().compare(getName(), otherName);
		}
	}

	private static class ExpandChildrenAction extends Action implements IMenuCreator, Comparable {
		private final EditPart myTarget;
		private final String myName;
		private Menu myMenu;
		
		public ExpandChildrenAction(EditPart target, String name) {
			super(name, IAction.AS_DROP_DOWN_MENU);
			myName = name;
			myTarget = target;
		}
		
		public IMenuCreator getMenuCreator() {
			return this;
		}

		public EditPart getTargetPart() {
			return myTarget;
		}
		
		public String getName() {
			return myName;
		}
		
		public void run() {
			//do nothing, this action just creates a cascading menu.
		}
		
		public int compareTo(Object o) {
			if (!(o instanceof SelectChildAction)) {
				return -1;
			}
			String otherName = ((SelectChildAction)o).getName();
			return Collator.getInstance().compare(getName(), otherName);
		}

		public void dispose() {
			if (myMenu != null) {
				myMenu.dispose();
			}
			myMenu = null;
		}

		public Menu getMenu(Control parent) {
			return createMenu(parent);
		}

		public Menu getMenu(Menu parent) {
			return createMenu(parent);
		}

		private Menu createMenu(Widget parent) {
			if (myMenu == null) {
				if (parent == null) {
					return null;
				}
				myMenu = SelectStackedElementsAction.createMenuFromMenuOrControlParent(parent);
				SelectStackedElementsAction.fillMenu(myMenu, myTarget);
			}
			return myMenu;
		}
	}
}

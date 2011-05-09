/**
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.parts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EventObject;
import java.util.Iterator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.KeyHandler;
import org.eclipse.gef.KeyStroke;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.commands.CommandStackListener;
import org.eclipse.gef.editparts.RootTreeEditPart;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.editparts.ScalableRootEditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.gef.ui.actions.StackAction;
import org.eclipse.gef.ui.actions.UpdateAction;
import org.eclipse.gef.ui.actions.WorkbenchPartAction;
import org.eclipse.gef.ui.parts.ContentOutlinePage;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.gef.ui.parts.TreeViewer;
import org.eclipse.gmf.internal.runtime.lite.Activator;
import org.eclipse.gmf.runtime.lite.edit.parts.tree.DiagramTreeEditPartFactory;
import org.eclipse.gmf.runtime.lite.properties.PropertySourceProvider;
import org.eclipse.gmf.runtime.lite.properties.UndoablePropertySheetEntry;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;

/**
 * Common functionality of all diagram editors generated with the lite generator.
 */
public abstract class DiagramEditor extends GraphicalEditorWithFlyoutPalette {
	private static class UpdatableActionGroup {
		public void addAction(UpdateAction action) {
			assert action != null;
			myActions.add(action);
		}

		public void removeAction(UpdateAction action) {
			myActions.remove(action);
		}

		public void update() {
			for (Iterator it = myActions.iterator(); it.hasNext();) {
				UpdateAction next = (UpdateAction) it.next();
				next.update();
			}
		}

		private ArrayList myActions = new ArrayList();
	}

	private TransactionalEditingDomain editingDomain;

	private boolean isDirty = false;

	private PaletteRoot paletteRoot;

	private PropertySheetPage undoablePropertySheetPage;

	private UpdatableActionGroup stackActions = new UpdatableActionGroup();

	private CommandStackListener commandStackListener = new CommandStackListener() {
		public void commandStackChanged(EventObject event) {
			stackActions.update();
			setDirty(((CommandStack) event.getSource()).isDirty());
		}
	};

	private UpdatableActionGroup editPartActions = new UpdatableActionGroup();

	private ISelectionListener selectionListener = new ISelectionListener() {
		public void selectionChanged(IWorkbenchPart part, ISelection selection) {
			editPartActions.update();
		}
	};

	private UpdatableActionGroup editorActions = new UpdatableActionGroup();

	protected void firePropertyChange(int propertyId) {
		super.firePropertyChange(propertyId);
		editorActions.update();
	}

	/**
	 * Adds an action to this editor's <code>ActionRegistry</code>. (This is
	 * a helper method.)
	 * 
	 * @param action
	 *            the action to add.
	 */
	protected void addAction(IAction action) {
		getActionRegistry().registerAction(action);
	}

	/**
	 * Adds an editor action to this editor.
	 * 
	 * <p>
	 * Editor actions are actions that depend and work on the editor.
	 * 
	 * @param action
	 *            the editor action
	 */
	protected void addEditorAction(WorkbenchPartAction action) {
		getActionRegistry().registerAction(action);
		editorActions.addAction(action);
	}

	/**
	 * Adds an <code>EditPart</code> action to this editor.
	 * 
	 * <p>
	 * <code>EditPart</code> actions are actions that depend and work on the
	 * selected <code>EditPart</code>s.
	 * 
	 * @param action
	 *            the <code>EditPart</code> action
	 */
	protected void addEditPartAction(SelectionAction action) {
		getActionRegistry().registerAction(action);
		editPartActions.addAction(action);
	}

	/**
	 * Adds an <code>CommandStack</code> action to this editor.
	 * 
	 * <p>
	 * <code>CommandStack</code> actions are actions that depend and work on
	 * the <code>CommandStack</code>.
	 * 
	 * @param action
	 *            the <code>CommandStack</code> action
	 */
	protected void addStackAction(StackAction action) {
		getActionRegistry().registerAction(action);
		stackActions.addAction(action);
	}

	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		setSite(site);
		setInput(input);
		setEditDomain(new DefaultEditDomain(this));

		// add CommandStackListener
		getCommandStack().addCommandStackListener(getStackActionsListener());

		// add selection change listener
		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(getSelectionListener());
	}

	public void dispose() {
		// remove CommandStackListener
		getCommandStack().removeCommandStackListener(getStackActionsListener());

		// remove selection listener
		getSite().getWorkbenchWindow().getSelectionService().removeSelectionListener(getSelectionListener());

		// dispose the ActionRegistry (will dispose all actions)
		getActionRegistry().dispose();

	}

	protected void save(IProgressMonitor progressMonitor) throws CoreException {
		if (progressMonitor == null) {
			progressMonitor = new NullProgressMonitor();
		}
		progressMonitor.beginTask("Saving", getEditingDomain().getResourceSet().getResources().size());
		try {
			for(Iterator it = getEditingDomain().getResourceSet().getResources().iterator(); it.hasNext(); ) {
				Resource next = (Resource)it.next();
				if (next.isLoaded() && (next.isModified() || !next.isTrackingModification())) {
					next.save(Collections.EMPTY_MAP);
				}
				progressMonitor.worked(1);
			}
		} catch (IOException e) {
			IStatus status = new Status(IStatus.ERROR, Activator.getDefault().getBundle().getSymbolicName(), 0, "Error writing file.", e);
			throw new CoreException(status);
		} finally {
			progressMonitor.done();
		}
	}

	public boolean isSaveAsAllowed() {
		// TODO: should be allowed.
		return false;
	}

	public void doSaveAs() {
		// TODO: Implement.
	}

	public Object getAdapter(Class type) {
		if (type == IPropertySheetPage.class) {
			return getPropertySheetPage();
		} else if (type == IContentOutlinePage.class) {
			return getOutlinePage();
		} else if (type == ZoomManager.class) {
			return getZoomManager();
		}
		return super.getAdapter(type);
	}

	protected ZoomManager getZoomManager() {
		return getZoomManager(getGraphicalViewer());
	}

	private ZoomManager getZoomManager(GraphicalViewer viewer) {
		// get zoom manager from root edit part
		RootEditPart rootEditPart = viewer.getRootEditPart();
		ZoomManager zoomManager = null;
		if (rootEditPart instanceof ScalableFreeformRootEditPart) {
			zoomManager = ((ScalableFreeformRootEditPart) rootEditPart).getZoomManager();
		} else if (rootEditPart instanceof ScalableRootEditPart) {
			zoomManager = ((ScalableRootEditPart) rootEditPart).getZoomManager();
		}
		return zoomManager;
	}

	protected PaletteRoot getPaletteRoot() {
		if (paletteRoot == null) {
			paletteRoot = new PaletteRoot();
			configurePalette(paletteRoot);
		}
		return paletteRoot;
	}

	protected abstract void configurePalette(PaletteRoot paletteRoot);

	protected CommandStackListener getStackActionsListener() {
		return commandStackListener;
	}

	protected IContentOutlinePage getOutlinePage() {
		final TreeViewer treeViewer = new TreeViewer();
		treeViewer.setRootEditPart(new RootTreeEditPart());
		treeViewer.setEditDomain(getEditDomain());
		treeViewer.setEditPartFactory(new DiagramTreeEditPartFactory(getGraphicalViewer()));
		getSelectionSynchronizer().addViewer(treeViewer);
		configureTreeViewer(treeViewer);
		return new ContentOutlinePage(treeViewer) {
			public void createControl(Composite parent) {
				super.createControl(parent);
				treeViewer.setContents(getGraphicalViewer().getContents().getModel());
			}
		};
	}

	protected void configureTreeViewer(TreeViewer treeViewer) {
		KeyHandler keyHandler = new KeyHandler();
		keyHandler.put(KeyStroke.getPressed(SWT.DEL, 127, 0),
				getActionRegistry().getAction(ActionFactory.DELETE.getId()));
		keyHandler.put(KeyStroke.getPressed(SWT.F2, 0), getActionRegistry()
				.getAction(GEFActionConstants.DIRECT_EDIT));
		treeViewer.setKeyHandler(keyHandler);
	}

	protected PropertySheetPage getPropertySheetPage() {
		if (undoablePropertySheetPage == null) {
			undoablePropertySheetPage = new PropertySheetPage();
			UndoablePropertySheetEntry rootEntry = new UndoablePropertySheetEntry(getCommandStack());
			rootEntry.setPropertySourceProvider(new PropertySourceProvider(getDomainAdapterFactory()));
			undoablePropertySheetPage.setRootEntry(rootEntry);
		}

		return undoablePropertySheetPage;
	}

	private ISelectionListener getSelectionListener() {
		return selectionListener;
	}

	public boolean isDirty() {
		return isDirty;
	}

	private void setDirty(boolean dirty) {
		if (isDirty != dirty) {
			isDirty = dirty;
			firePropertyChange(IEditorPart.PROP_DIRTY);
		}
	}

	protected TransactionalEditingDomain getEditingDomain() {
		if (editingDomain == null) {
			editingDomain = WorkspaceEditingDomainFactory.INSTANCE.createEditingDomain();
			//editingDomain.setAdapterFactory(getDomainAdapterFactory());
			editingDomain.getResourceSet().eAdapters().add(new AdapterFactoryEditingDomain.EditingDomainProvider(editingDomain));
		}
		return editingDomain;
	}

	protected abstract AdapterFactory getDomainAdapterFactory();

	public void setFocus() {
		getGraphicalViewer().getControl().setFocus();
	}

	public final void createPartControl(Composite parent) {
		super.createPartControl(parent);
		// initialize actions
		createActions();
	}

}

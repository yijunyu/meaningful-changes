/**
 * Copyright (c) 2006, 2007 Borland Software Corporation
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

import java.util.Collection;
import java.util.Collections;
import java.util.EventObject;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.commands.CommandStackEvent;
import org.eclipse.gef.commands.CommandStackEventListener;
import org.eclipse.gef.commands.CommandStackListener;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.gef.ui.actions.StackAction;
import org.eclipse.gef.ui.actions.WorkbenchPartAction;
import org.eclipse.gef.ui.views.palette.PalettePage;
import org.eclipse.gmf.runtime.lite.services.DefaultDiagramLayouter;
import org.eclipse.gmf.runtime.lite.services.IDiagramLayouter;
import org.eclipse.jface.action.IAction;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorMatchingStrategy;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;

/**
 * This class serves as the base class for the generated diagram editors. 
 * @author bblajer
 */
public abstract class DiagramEditor extends EditorPart implements IDiagramManager {
	private DiagramDisplayer myDiagramDisplayer;
	private boolean myIsDirty = false;

	private CommandStackListener commandStackListener = new CommandStackListener() {
		public void commandStackChanged(EventObject event) {
			setDirty(((CommandStack) event.getSource()).isDirty());
		}
	};

	private CommandStackEventListener mySaveListener = new CommandStackEventListener() {
		public void stackChanged(CommandStackEvent event) {
			if (event.isPostChangeEvent() && isSaved()) {
				getCommandStack().markSaveLocation();
			}
		}
		private boolean isSaved() {
			for(Resource next : getEditingDomain().getResourceSet().getResources()) {
				if (!next.isLoaded()) {
					continue;
				}
				if (!next.isTrackingModification() || next.isModified()) {
					return false;
				}
			}
			return true;
		}
	};

	protected void save(IProgressMonitor monitor) throws CoreException {
		myDiagramDisplayer.save(getSaveOptions(), monitor);
	}

	/**
	 * Returns the options with which the resources will be saved. Subclasses should override.
	 */
	protected Map<?, ?> getSaveOptions() {
		return Collections.emptyMap();
	}

	public final TransactionalEditingDomain getEditingDomain() {
		return myDiagramDisplayer.getEditingDomain();
	}

	protected final EditDomain getEditDomain() {
		return myDiagramDisplayer.getEditDomain();
	}

	protected final CommandStack getCommandStack() {
		return getEditDomain().getCommandStack();
	}

	protected final ZoomManager getZoomManager() {
		return myDiagramDisplayer.getZoomManager();
	}

	protected final ActionRegistry getActionRegistry() {
		return myDiagramDisplayer.getActionRegistry();
	}

	protected final GraphicalViewer getGraphicalViewer() {
		return myDiagramDisplayer.getGraphicalViewer();
	}

	protected IPropertySheetPage getPropertySheetPage() {
		return myDiagramDisplayer.getPropertySheetPage();
	}

	protected IContentOutlinePage getOutlinePage() {
		return new DiagramContentOutlinePage(myDiagramDisplayer, getDefaultOutlineViewMode());
	}

	protected IDiagramLayouter getDiagramLayouter() {
		return new DefaultDiagramLayouter();
	}

	/**
	 * Returns the initial display mode for the outline page to be shown. Possible values are <code>DiagramContentOutlinePage.ID_OUTLINE</code> and 
	 * <code>DiagramContentOutlinePage.ID_OVERVIEW</code>.
	 * By default, the outline page starts in the overview mode. Subclasses may reimplement.
	 */
	protected int getDefaultOutlineViewMode() {
		return DiagramContentOutlinePage.ID_OVERVIEW;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO: should be allowed.
		return false;
	}

	@Override
	public void doSaveAs() {
		// TODO: Implement.
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		setSite(site);
		TransactionalEditingDomain editingDomain = getEditingDomain(input);
		if (editingDomain == null) {
			editingDomain = reuseEditingDomain(input);
		}
		if (editingDomain == null) {
			editingDomain = createEditingDomain();
		}
		ForceTrackingModificationAdapter adapter = (ForceTrackingModificationAdapter) EcoreUtil.getExistingAdapter(editingDomain.getResourceSet(), ForceTrackingModificationAdapter.class);
		if (adapter == null) {
			adapter = new ForceTrackingModificationAdapter();
			editingDomain.getResourceSet().eAdapters().add(adapter);
		}
		adapter.acquire();
		myDiagramDisplayer = new DiagramDisplayer(this, createEditDomain(), editingDomain);
		getCommandStack().addCommandStackListener(commandStackListener);
		getCommandStack().addCommandStackEventListener(mySaveListener);
		setInput(input);
	}

	@Override
	public void dispose() {
		if (myDiagramDisplayer != null) {
			getCommandStack().removeCommandStackEventListener(mySaveListener);
			getCommandStack().removeCommandStackListener(commandStackListener);
			ForceTrackingModificationAdapter adapter = (ForceTrackingModificationAdapter) EcoreUtil.getExistingAdapter(getEditingDomain().getResourceSet(), ForceTrackingModificationAdapter.class);
			if (adapter != null) {
				adapter.release();
				if (adapter.isReleased()) {
					getEditingDomain().getResourceSet().eAdapters().remove(adapter);
				}
			}
			myDiagramDisplayer.dispose();
			myDiagramDisplayer = null;
		}
		super.dispose();
	}

	@Override
	public Object getAdapter(Class type) {
		if (type == IPropertySheetPage.class) {
			return getPropertySheetPage();
		} else if (type == IContentOutlinePage.class) {
			return getOutlinePage();
		} else if (type == ZoomManager.class) {
			return getZoomManager();
		} else if (type == IDiagramLayouter.class) {
			return getDiagramLayouter();
		} else if (type == PalettePage.class) {
			return myDiagramDisplayer.getPalettePage();
		} else if (type == GraphicalViewer.class) {
			return getGraphicalViewer();
		} else if (type == CommandStack.class) {
			return getCommandStack();
		} else if (type == ActionRegistry.class) {
			return getActionRegistry();
		} else if (type == EditPart.class && getGraphicalViewer() != null) {
			return getGraphicalViewer().getRootEditPart();
		} else if (type == IFigure.class && getGraphicalViewer() != null) {
			return ((GraphicalEditPart)getGraphicalViewer().getRootEditPart()).getFigure();
		}
		return super.getAdapter(type);
	}

	private void setDirty(boolean isDirty) {
		if (isDirty != myIsDirty) {
			myIsDirty = isDirty;
			firePropertyChange(PROP_DIRTY);
		}
	}

	@Override
	public boolean isDirty() {
		return myIsDirty;
	}

	/**
	 * Adds an action to this editor's <code>ActionRegistry</code>. (This is
	 * a helper method.)
	 * 
	 * @param action
	 *            the action to add.
	 */
	protected void addAction(IAction action) {
		myDiagramDisplayer.addAction(action);
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
		myDiagramDisplayer.addEditorAction(action);
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
		myDiagramDisplayer.addEditPartAction(action);
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
		myDiagramDisplayer.addStackAction(action);
	}

	@Override
	public void createPartControl(Composite parent) {
		myDiagramDisplayer.createViewer(parent);
		createActions();
	}

	@Override
	public void setFocus() {
		myDiagramDisplayer.setFocus();
	}

	/**
	 * Returns the editing domain instance to be used for the specified input. If this method returns <code>null</code>, 
	 * a {@link #createEditDomain() default instance} will be created and used.
	 * By default, return <code>null</code>. Subclasses may reimplement.
	 */
	protected TransactionalEditingDomain getEditingDomain(IEditorInput input) {
		if (input instanceof DiagramEditorInput) {
			TransactionalEditingDomain result = TransactionUtil.getEditingDomain(((DiagramEditorInput) input).getDiagram());
			return result;
		}
		return null;
	}

	/**
	 * Returns the editing domain that is used by other editors with the same input. This is done to correctly support 
	 * "New Editor" operation that is available in the context menu of the editor tab.
	 * @return
	 */
	protected TransactionalEditingDomain reuseEditingDomain(IEditorInput input) {
		IEditorRegistry editorRegistry = PlatformUI.getWorkbench().getEditorRegistry();
		IEditorDescriptor editorDesc = editorRegistry.findEditor(getSite().getId());
		IEditorMatchingStrategy matchingStrategy = editorDesc.getEditorMatchingStrategy();
		IEditorReference[] editorRefs = getEditorSite().getPage().getEditorReferences();
		for (int i = 0; i < editorRefs.length; i++) {
			if (matches(matchingStrategy, editorRefs[i], input)) {
				DiagramEditor anotherEditor = (DiagramEditor) editorRefs[i].getEditor(false);
				if (anotherEditor != null) {
					return anotherEditor.getEditingDomain();
				}
			}
		}
		return null;
	}

	private boolean matches(IEditorMatchingStrategy strategy, IEditorReference editorRef, IEditorInput input) {
		if (strategy == null) {
			if (getSite().getId().equals(editorRef.getId())) {
				try {
					return input.equals(editorRef.getEditorInput());
				} catch (PartInitException e) {
					return false;
				}
			}
			return false;
		} else {
			return strategy.matches(editorRef, input);
		}
	}

	/**
	 * Returns the editing domain instance to be used for the diagram if none may be {@link #getEditingDomain(IEditorInput) inferred} from the input.
	 * Subclasses may extend or reimplement.
	 */
	protected TransactionalEditingDomain createEditingDomain() {
		TransactionalEditingDomain editingDomain = WorkspaceEditingDomainFactory.INSTANCE.createEditingDomain();
		editingDomain.getResourceSet().eAdapters().add(new AdapterFactoryEditingDomain.EditingDomainProvider(editingDomain));
		return editingDomain;
	}

	public void configureGraphicalViewer() {
		getGraphicalViewer().getControl().setBackground(ColorConstants.listBackground);
	}

	protected double[] getZoomLevels() {
		double[] result = {.05, .1, .25, .5, .75, 1, 1.25, 1.5, 1.75, 2, 4};
		return result;
	}

	public abstract void configurePalette(PaletteRoot paletteRoot);

	/**
	 * Creates edit domain that will be used for the editor. 
	 * Subclasses may extend.
	 */
	protected EditDomain createEditDomain() {
		DefaultEditDomain domain = new DefaultEditDomain(this);
		return domain;
	}

	public abstract void initializeGraphicalViewer();

	public abstract AdapterFactory getDomainAdapterFactory();

	public abstract boolean isFlyoutPalette();

	protected abstract void createActions();

	private static class ForceTrackingModificationAdapter extends AdapterImpl {
		@Override
		public void setTarget(Notifier newTarget) {
			super.setTarget(newTarget);
			if (newTarget instanceof ResourceSet) {
				ResourceSet resourceSet = (ResourceSet) newTarget;
				for(Resource next : resourceSet.getResources()) {
					next.setTrackingModification(true);
				}
			}
		}

		@Override
		public void notifyChanged(Notification msg) {
			if (msg.getNotifier() == getTarget() && msg.getFeatureID(ResourceSet.class) == ResourceSet.RESOURCE_SET__RESOURCES) {
				switch (msg.getEventType()) {
				case Notification.ADD:
				{
					Resource resource = (Resource) msg.getNewValue();
					resource.setTrackingModification(true);
				}
				break;
				case Notification.ADD_MANY:
				{
					@SuppressWarnings("unchecked") Collection<Resource> resources = (Collection<Resource>) msg.getNewValue();
					for(Resource next : resources) {
						next.setTrackingModification(true);
					}
				}
				}
			}
		}
		@Override
		public boolean isAdapterForType(Object type) {
			return ForceTrackingModificationAdapter.class.equals(type);
		}
		public void acquire() {
			myRefCount++;
		}

		public void release() {
			if (myRefCount == 0) {
				throw new IllegalStateException();
			}
			myRefCount--;
		}

		public boolean isReleased() {
			return myRefCount == 0;
		}

		private int myRefCount;
	}
}

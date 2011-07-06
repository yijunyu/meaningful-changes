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

import java.io.IOException;
import java.util.Collections;
import java.util.EventObject;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.commands.CommandStackListener;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.editparts.ScalableRootEditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.gef.ui.actions.StackAction;
import org.eclipse.gef.ui.actions.WorkbenchPartAction;
import org.eclipse.gef.ui.palette.FlyoutPaletteComposite;
import org.eclipse.gef.ui.palette.PaletteViewerProvider;
import org.eclipse.gef.ui.palette.FlyoutPaletteComposite.FlyoutPreferences;
import org.eclipse.gef.ui.parts.GraphicalEditor;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.gef.ui.parts.SelectionSynchronizer;
import org.eclipse.gef.ui.views.palette.PaletteViewerPage;
import org.eclipse.gmf.internal.runtime.lite.Activator;
import org.eclipse.gmf.runtime.lite.properties.PropertySourceProvider;
import org.eclipse.gmf.runtime.lite.properties.RootUndoablePropertySheetEntry;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.PropertySheetPage;

/**
 * @author bblajer
 */
public class DiagramDisplayer implements IDiagramOutlineHost {
	private TransactionalEditingDomain editingDomain;
	private PaletteRoot paletteRoot;
	private PropertySheetPage undoablePropertySheetPage;
	private GraphicalViewer graphicalViewer;
	private ActionRegistry actionRegistry;
	private UpdatableActionGroup stackActions = new UpdatableActionGroup();
	private EditDomain myEditDomain;
	private IDiagramManager myDiagramManager;
	private FlyoutPaletteComposite mySplitter;
	private PaletteViewerProvider myPaletteViewerProvider;
	private PaletteViewerPage myPalettePage;
	private SelectionSynchronizer synchronizer;
	private Control myTopLevelControl;

	private CommandStackListener commandStackListener = new CommandStackListener() {
		public void commandStackChanged(EventObject event) {
			stackActions.update();
		}
	};

	private UpdatableActionGroup editPartActions = new UpdatableActionGroup();

	private ISelectionListener selectionListener = new ISelectionListener() {
		public void selectionChanged(IWorkbenchPart part, ISelection selection) {
			editPartActions.update();
		}
	};

	private UpdatableActionGroup propertyActions = new UpdatableActionGroup();

	private IPropertyListener propertyListener = new IPropertyListener() {
		public void propertyChanged(Object source, int propId) {
			propertyActions.update();
		}
	};

	/**
	 * Constructs a new instance of the diagram displayer. 
	 */
	public DiagramDisplayer(IDiagramManager diagramManager, EditDomain gefEditDomain, TransactionalEditingDomain emfEditingDomain) {
		myDiagramManager = diagramManager;
		assert gefEditDomain != null;
		assert emfEditingDomain != null;
		setEditDomain(gefEditDomain);
		editingDomain = emfEditingDomain;

		gefEditDomain.setCommandStack(createCommandStack());
		getCommandStack().addCommandStackListener(commandStackListener);
		myDiagramManager.getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(selectionListener);
		myDiagramManager.getSite().getPart().addPropertyListener(propertyListener);
	}

	private CommandStack createCommandStack() {
		CommandStackAdapterManager manager = (CommandStackAdapterManager) EcoreUtil.getExistingAdapter(editingDomain.getResourceSet(), CommandStackAdapterManager.class);
		if (manager == null) {
			manager = new CommandStackAdapterManager();
			editingDomain.getResourceSet().eAdapters().add(manager);
		}
		manager.acquire();
		return manager.getCommandStack();
	}

	public void dispose() {
		// remove CommandStackListener
		getCommandStack().removeCommandStackListener(commandStackListener);

		// remove selection listener
		myDiagramManager.getSite().getWorkbenchWindow().getSelectionService().removeSelectionListener(selectionListener);

		myDiagramManager.getSite().getPart().removePropertyListener(propertyListener);

		getEditDomain().setActiveTool(null);

		CommandStackAdapterManager manager = (CommandStackAdapterManager) EcoreUtil.getExistingAdapter(getEditingDomain().getResourceSet(), CommandStackAdapterManager.class);
		assert manager != null;
		manager.release();
		if (manager.isReleased()) {
			getEditingDomain().getResourceSet().eAdapters().remove(manager);
		}

		// dispose the ActionRegistry (will dispose all actions)
		getActionRegistry().dispose();
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
			myDiagramManager.configurePalette(paletteRoot);
		}
		return paletteRoot;
	}

	public CommandStack getCommandStack() {
		return myEditDomain.getCommandStack();
	}

	protected PropertySheetPage getPropertySheetPage() {
		if (undoablePropertySheetPage == null) {
			undoablePropertySheetPage = new PropertySheetPage();
			RootUndoablePropertySheetEntry rootEntry = new RootUndoablePropertySheetEntry(getCommandStack(), undoablePropertySheetPage);
			rootEntry.setPropertySourceProvider(new PropertySourceProvider(myDiagramManager.getDomainAdapterFactory()));
			undoablePropertySheetPage.setRootEntry(rootEntry);
		}

		return undoablePropertySheetPage;
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
		propertyActions.addAction(action);
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

	public ActionRegistry getActionRegistry() {
		if (actionRegistry == null)
			actionRegistry = new ActionRegistry();
		return actionRegistry;
	}

	public TransactionalEditingDomain getEditingDomain() {
		return editingDomain;
	}

	public void createViewer(Composite parent) {
		if (myDiagramManager.isFlyoutPalette()) {
			mySplitter = new FlyoutPaletteComposite(parent, SWT.NONE, myDiagramManager.getSite().getPage(), getPaletteViewerProvider(), getPalettePreferences());
			createGraphicalViewer(mySplitter);
			myTopLevelControl = mySplitter;
		} else {
			SashForm sashForm = new SashForm(parent, SWT.HORIZONTAL);
			createGraphicalViewer(sashForm);
			getPaletteViewerProvider().createPaletteViewer(sashForm);
			sashForm.setWeights(new int[] {85, 15});	//TODO: allow customization and persistence
			myTopLevelControl = sashForm;
		}
	}

	/**
	 * Creates the GraphicalViewer on the specified <code>Composite</code>.
	 * @param parent the parent composite
	 */
	protected void createGraphicalViewer(Composite parent) {
		GraphicalViewer viewer = new ScrollingGraphicalViewer();
		viewer.createControl(parent);
		setGraphicalViewer(viewer);
		hookGraphicalViewer();
		myDiagramManager.configureGraphicalViewer();
		initializeGraphicalViewer();
	}

	/**
	 * Sets the graphicalViewer for this diagram displayer.
	 * @param viewer the graphical viewer
	 */
	protected void setGraphicalViewer(GraphicalViewer viewer) {
		myEditDomain.addViewer(viewer);
		graphicalViewer = viewer;
		if (mySplitter != null) {
			mySplitter.setGraphicalControl(graphicalViewer.getControl());
		}
	}

	public GraphicalViewer getGraphicalViewer() {
		return graphicalViewer;
	}

	/**
	 * Hooks the GraphicalViewer to the rest of the Editor.  By default, the viewer
	 * is added to the SelectionSynchronizer, which can be used to keep 2 or more
	 * EditPartViewers in sync.  The viewer is also registered as the ISelectionProvider
	 * for the Editor's PartSite.
	 */
	protected void hookGraphicalViewer() {
		getSelectionSynchronizer().addViewer(getGraphicalViewer());
		myDiagramManager.getSite().setSelectionProvider(getGraphicalViewer());
	}

	/**
	 * @see	GraphicalEditor#initializeGraphicalViewer()
	 */
	protected void initializeGraphicalViewer() {
		if (mySplitter != null) {
			mySplitter.hookDropTargetListener(getGraphicalViewer());
		}
		myDiagramManager.initializeGraphicalViewer();
	}

	/**
	 * Returns the selection syncronizer object. The synchronizer can be used to sync the
	 * selection of 2 or more EditPartViewers.
	 * @return the syncrhonizer
	 */
	public final SelectionSynchronizer getSelectionSynchronizer() {
		if (synchronizer == null)
			synchronizer = new SelectionSynchronizer();
		return synchronizer;
	}

	public void setFocus() {
		getGraphicalViewer().getControl().setFocus();
	}

	private PaletteViewerProvider getPaletteViewerProvider() {
		if (myPaletteViewerProvider == null)
			myPaletteViewerProvider = createPaletteViewerProvider();
		return myPaletteViewerProvider;
	}

	/**
	 * Creates a PaletteViewerProvider that will be used to create palettes for the view
	 * and the flyout.
	 * 
	 * @return	the palette provider
	 */
	protected PaletteViewerProvider createPaletteViewerProvider() {
		return new PaletteViewerProvider(myEditDomain);
	}

	protected void setEditDomain(EditDomain ed) {
		myEditDomain = ed;
		myEditDomain.setPaletteRoot(getPaletteRoot());
	}

	public EditDomain getEditDomain() {
		return myEditDomain;
	}

	public Control getTopLevelControl() {
		return myTopLevelControl;
	}

	public Control getGraphicalControl() {
		return getGraphicalViewer().getControl();
	}

	/**
	 * Returns a FlyoutPreferences object that stores the flyout
	 * settings in the lite runtime plugin. 
	 * @return	the FlyoutPreferences object used to save the flyout palette's preferences 
	 */
	private FlyoutPreferences getPalettePreferences() {
		return FlyoutPaletteComposite
				.createFlyoutPreferences(Activator.getDefault().getPluginPreferences());
	}

	public PaletteViewerPage getPalettePage() {
		if (myPalettePage == null) {
			myPalettePage = new CustomPalettePage(getPaletteViewerProvider());
		}
		return myPalettePage;
	}

	private class CustomPalettePage extends PaletteViewerPage {
		public CustomPalettePage(PaletteViewerProvider provider) {
			super(provider);
		}
		public void createControl(Composite parent) {
			super.createControl(parent);
			if (mySplitter != null)
				mySplitter.setExternalViewer(viewer);
		}
		public void dispose() {
			if (mySplitter != null)
				mySplitter.setExternalViewer(null);
			super.dispose();
		}
	}

	/**
	 * @deprecated Use {@link #save(Map, IProgressMonitor)} instead.
	 */
	public void save(IProgressMonitor progressMonitor) throws CoreException {
		save(Collections.emptyMap(), progressMonitor);
	}

	public void save(Map<?, ?> options, IProgressMonitor progressMonitor) throws CoreException {
		if (progressMonitor == null) {
			progressMonitor = new NullProgressMonitor();
		}
		progressMonitor.beginTask("Saving", getEditingDomain().getResourceSet().getResources().size());
		try {
			for(Resource next : getEditingDomain().getResourceSet().getResources()) {
				if (next.isLoaded() && !getEditingDomain().isReadOnly(next)) {
					next.save(options);
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
}

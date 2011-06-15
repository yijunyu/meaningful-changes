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
package org.eclipse.gmf.runtime.lite.parts;

import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.Viewport;
import org.eclipse.draw2d.parts.ScrollableThumbnail;
import org.eclipse.draw2d.parts.Thumbnail;
import org.eclipse.gef.KeyHandler;
import org.eclipse.gef.KeyStroke;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.editparts.FreeformGraphicalRootEditPart;
import org.eclipse.gef.editparts.RootTreeEditPart;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.gef.ui.parts.ContentOutlinePage;
import org.eclipse.gef.ui.parts.TreeViewer;
import org.eclipse.gmf.internal.runtime.lite.Activator;
import org.eclipse.gmf.runtime.lite.edit.parts.tree.DiagramTreeEditPartFactory;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.part.Page;
import org.eclipse.ui.part.PageBook;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

/**
 * The diagram outline. 
 */
public class DiagramContentOutlinePage extends Page implements IContentOutlinePage {
	public static final int ID_OVERVIEW = 0;
	public static final int ID_OUTLINE = 1;

	private final int myDefaultMode;
	private ContentOutlinePage myOutlinePage;
	private Canvas myOverview;
	private PageBook myPageBook;
	private IAction myShowOutlineAction;
	private IAction myShowOverviewAction;
	private Thumbnail myThumbnail;
	private TreeViewer myTreeViewer;
	private DisposeListener myDisposeListener;
	private final IDiagramOutlineHost myHost;

	public DiagramContentOutlinePage(IDiagramOutlineHost host, int defaultMode) {
		myHost = host;
		myDefaultMode = defaultMode;
	}

	@Override
	public void init(IPageSite pageSite) {
		super.init(pageSite);
		ActionRegistry registry = myHost.getActionRegistry();
		IActionBars bars = pageSite.getActionBars();
		String id = ActionFactory.UNDO.getId();
		bars.setGlobalActionHandler(id, registry.getAction(id));
		id = ActionFactory.REDO.getId();
		bars.setGlobalActionHandler(id, registry.getAction(id));
		id = ActionFactory.DELETE.getId();
		bars.setGlobalActionHandler(id, registry.getAction(id));
		bars.updateActionBars();
		
		// Toolbar refresh to solve linux defect RATLC525198
		bars.getToolBarManager().markDirty();
	}

	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		if (myOutlinePage != null) {
			myOutlinePage.addSelectionChangedListener(listener);
		}
	}

	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		if (myOutlinePage != null) {
			myOutlinePage.removeSelectionChangedListener(listener);
		}
	}

	public ISelection getSelection() {
		if (myOutlinePage != null) {
			return myOutlinePage.getSelection();
		}
		return StructuredSelection.EMPTY;
	}

	public void setSelection(ISelection selection) {
		if (myOutlinePage != null) {
			myOutlinePage.setSelection(selection);
		}
	}

	@Override
	public void createControl(Composite parent) {
		myPageBook = new PageBook(parent, SWT.NONE);
		myTreeViewer = new TreeViewer();
		myTreeViewer.setRootEditPart(new RootTreeEditPart());
		myTreeViewer.setEditDomain(myHost.getEditDomain());
		myTreeViewer.setEditPartFactory(new DiagramTreeEditPartFactory(myHost.getGraphicalViewer()));
		configureTreeViewer(myTreeViewer);
		myOutlinePage = new ContentOutlinePage(myTreeViewer);
		myOutlinePage.createControl(myPageBook);
		myTreeViewer.setContents(myHost.getGraphicalViewer().getContents().getModel());
		hookOutlineViewer(myTreeViewer);
		configureOutlinePage();
		showPage(myDefaultMode);
	}

	protected void hookOutlineViewer(TreeViewer viewer) {
		myHost.getSelectionSynchronizer().addViewer(viewer);
	}

	protected void unhookOutlineViewer(TreeViewer viewer) {
		myHost.getSelectionSynchronizer().removeViewer(viewer);
	}

	protected void configureOutlinePage() {
		IToolBarManager tbm = this.getSite().getActionBars().getToolBarManager();
		myShowOutlineAction = new Action() {
			public void run() {
				showPage(ID_OUTLINE);
			}
		};
		myShowOutlineAction.setImageDescriptor(Activator.getImageDescriptor("icons/outline.gif"));	//$NON-NLS-1$
		myShowOutlineAction.setToolTipText("Show Outline");
		tbm.add(myShowOutlineAction);
		myShowOverviewAction = new Action() {
			public void run() {
				showPage(ID_OVERVIEW);
			}
		};
		myShowOverviewAction.setImageDescriptor(Activator.getImageDescriptor("icons/overview.gif"));	//$NON-NLS-1$
		myShowOverviewAction.setToolTipText("Show Overview");
		tbm.add(myShowOverviewAction);
	}

	protected void configureTreeViewer(TreeViewer treeViewer) {
		KeyHandler keyHandler = new KeyHandler();
		keyHandler.put(KeyStroke.getPressed(SWT.DEL, 127, 0),
				myHost.getActionRegistry().getAction(ActionFactory.DELETE.getId()));
		keyHandler.put(KeyStroke.getPressed(SWT.F2, 0), myHost.getActionRegistry()
				.getAction(GEFActionConstants.DIRECT_EDIT));
		treeViewer.setKeyHandler(keyHandler);
	}

	protected void showPage(int pageId) {
		switch (pageId) {
		case ID_OUTLINE:
			myShowOutlineAction.setChecked(true);
			myShowOverviewAction.setChecked(false);
			myPageBook.showPage(myOutlinePage.getControl());
			if (myThumbnail != null) {
				myThumbnail.setVisible(false);
			}
			break;
		case ID_OVERVIEW:
			myShowOutlineAction.setChecked(false);
			myShowOverviewAction.setChecked(true);
			if (myOverview == null || myOverview.isDisposed()) {
				initializeOverview();
			}
			myPageBook.showPage(myOverview);
			if (myThumbnail != null) {
				myThumbnail.setVisible(true);
			}
		}
	}

	protected void initializeOverview() {
		myOverview = new Canvas(myPageBook, SWT.NONE);
		LightweightSystem lws = new LightweightSystem(myOverview);
		FreeformGraphicalRootEditPart root = (FreeformGraphicalRootEditPart) myHost.getGraphicalViewer().getRootEditPart();
		myThumbnail = new ScrollableThumbnail((Viewport) root.getFigure());
		myThumbnail.setSource(root.getLayer(LayerConstants.SCALABLE_LAYERS));
		lws.setContents(myThumbnail);
		myDisposeListener = new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				if (myThumbnail != null) {
					myThumbnail.deactivate();
					myThumbnail = null;
				}
			}
		};
		myHost.getGraphicalControl().addDisposeListener(myDisposeListener);
	}

	@Override
	public Control getControl() {
		return myPageBook;
	}

	@Override
	public void setFocus() {
		if (myOutlinePage != null) {
			myOutlinePage.setFocus();
		}
	}

	@Override
	public void dispose() {
		if (myOutlinePage != null) {
			myOutlinePage.dispose();
		}
		unhookOutlineViewer(myTreeViewer);
		if (myThumbnail != null) {
			myThumbnail.deactivate();
			myThumbnail = null;
		}
		if (myDisposeListener != null) {
			myHost.getGraphicalControl().removeDisposeListener(myDisposeListener);
		}
		myOverview = null;
		super.dispose();
	}
}

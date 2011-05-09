package org.eclipse.gmf.graphdef.editor.sheet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.gmfgraph.Dimension;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.GMFGraphFactory;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.Layoutable;
import org.eclipse.gmf.gmfgraph.Point;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public class SizeSection extends AbstractPropertySection implements ChangeTracker, Listener {

	private org.eclipse.emf.common.notify.Adapter[] myModelListeners;

	private boolean myIsCommit;

	private boolean myIsRefresh;

	private Object myInput;

	private Group myLocationGroup;

	private Group myPreferredSizeGroup;

	private Group myMaximumSizeGroup;

	private Group myMinimumSizeGroup;

	private Button mySetLocation;

	private Spinner myLocationX;

	private Spinner myLocationY;

	private Button mySetPreferredSize;

	private Spinner myPreferredSizeX;

	private Spinner myPreferredSizeY;

	private Button mySetMaximumSize;

	private Spinner myMaximumSizeX;

	private Spinner myMaximumSizeY;

	private Button mySetMinimumSize;

	private Spinner myMinimumSizeX;

	private Spinner myMinimumSizeY;

	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage page) {
		super.createControls(parent, page);
		getWidgetFactory().paintBordersFor(parent);
		myLocationGroup = createGroup(parent, "Location");
		mySetLocation = getWidgetFactory().createButton(myLocationGroup, "Define", SWT.CHECK);
		org.eclipse.jface.layout.GridDataFactory.swtDefaults().align(SWT.BEGINNING, SWT.BEGINNING).span(2, 1).applyTo(mySetLocation);
		createLabel(myLocationGroup, "X");
		myLocationX = new Spinner(myLocationGroup, SWT.FLAT);
		myLocationX.setMinimum(0);
		myLocationX.setMaximum(2147483647);
		myLocationX.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER); // @see
																					// #145837
		createLabel(myLocationGroup, "Y");
		myLocationY = new Spinner(myLocationGroup, SWT.FLAT);
		myLocationY.setMinimum(0);
		myLocationY.setMaximum(2147483647);
		myLocationY.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER); // @see
																					// #145837
		myLocationGroup.setLayout(new org.eclipse.swt.layout.GridLayout(2, false));
		myPreferredSizeGroup = createGroup(parent, "Preferred Size");
		mySetPreferredSize = getWidgetFactory().createButton(myPreferredSizeGroup, "Define", SWT.CHECK);
		org.eclipse.jface.layout.GridDataFactory.swtDefaults().align(SWT.BEGINNING, SWT.BEGINNING).span(2, 1).applyTo(mySetPreferredSize);
		createLabel(myPreferredSizeGroup, "Width");
		myPreferredSizeX = new Spinner(myPreferredSizeGroup, SWT.FLAT);
		myPreferredSizeX.setMinimum(0);
		myPreferredSizeX.setMaximum(2147483647);
		myPreferredSizeX.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER); // @see
																						// #145837
		createLabel(myPreferredSizeGroup, "Height");
		myPreferredSizeY = new Spinner(myPreferredSizeGroup, SWT.FLAT);
		myPreferredSizeY.setMinimum(0);
		myPreferredSizeY.setMaximum(2147483647);
		myPreferredSizeY.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER); // @see
																						// #145837
		myPreferredSizeGroup.setLayout(new org.eclipse.swt.layout.GridLayout(2, false));
		myMaximumSizeGroup = createGroup(parent, "Maximum Size");
		mySetMaximumSize = getWidgetFactory().createButton(myMaximumSizeGroup, "Define", SWT.CHECK);
		org.eclipse.jface.layout.GridDataFactory.swtDefaults().align(SWT.BEGINNING, SWT.BEGINNING).span(2, 1).applyTo(mySetMaximumSize);
		createLabel(myMaximumSizeGroup, "Width");
		myMaximumSizeX = new Spinner(myMaximumSizeGroup, SWT.FLAT);
		myMaximumSizeX.setMinimum(0);
		myMaximumSizeX.setMaximum(2147483647);
		myMaximumSizeX.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER); // @see
																						// #145837
		createLabel(myMaximumSizeGroup, "Height");
		myMaximumSizeY = new Spinner(myMaximumSizeGroup, SWT.FLAT);
		myMaximumSizeY.setMinimum(0);
		myMaximumSizeY.setMaximum(2147483647);
		myMaximumSizeY.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER); // @see
																						// #145837
		myMaximumSizeGroup.setLayout(new org.eclipse.swt.layout.GridLayout(2, false));
		myMinimumSizeGroup = createGroup(parent, "Minimum Size");
		mySetMinimumSize = getWidgetFactory().createButton(myMinimumSizeGroup, "Define", SWT.CHECK);
		org.eclipse.jface.layout.GridDataFactory.swtDefaults().align(SWT.BEGINNING, SWT.BEGINNING).span(2, 1).applyTo(mySetMinimumSize);
		createLabel(myMinimumSizeGroup, "Width");
		myMinimumSizeX = new Spinner(myMinimumSizeGroup, SWT.FLAT);
		myMinimumSizeX.setMinimum(0);
		myMinimumSizeX.setMaximum(2147483647);
		myMinimumSizeX.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER); // @see
																						// #145837
		createLabel(myMinimumSizeGroup, "Height");
		myMinimumSizeY = new Spinner(myMinimumSizeGroup, SWT.FLAT);
		myMinimumSizeY.setMinimum(0);
		myMinimumSizeY.setMaximum(2147483647);
		myMinimumSizeY.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER); // @see
																						// #145837
		myMinimumSizeGroup.setLayout(new org.eclipse.swt.layout.GridLayout(2, false));

		parent.setLayout(new org.eclipse.swt.layout.FormLayout());
		org.eclipse.swt.layout.FormData fd;
		fd = new org.eclipse.swt.layout.FormData();
		fd.left = new org.eclipse.swt.layout.FormAttachment(0, 10);
		myLocationGroup.setLayoutData(fd);
		fd = new org.eclipse.swt.layout.FormData();
		fd.left = new org.eclipse.swt.layout.FormAttachment(myLocationGroup, 20, SWT.RIGHT);
		myPreferredSizeGroup.setLayoutData(fd);
		fd = new org.eclipse.swt.layout.FormData();
		fd.left = new org.eclipse.swt.layout.FormAttachment(myPreferredSizeGroup, 20, SWT.RIGHT);
		myMaximumSizeGroup.setLayoutData(fd);
		fd = new org.eclipse.swt.layout.FormData();
		fd.left = new org.eclipse.swt.layout.FormAttachment(myMaximumSizeGroup, 20, SWT.RIGHT);
		myMinimumSizeGroup.setLayoutData(fd);

		for (Spinner s : new Spinner[] { myLocationX, myLocationY, myPreferredSizeX, myPreferredSizeY, myMaximumSizeX, myMaximumSizeY, myMinimumSizeX, myMinimumSizeY }) {
			s.addListener(SWT.Modify, this);
			s.addListener(SWT.FocusOut, this);
		}
		for (Widget w : new Widget[] { mySetLocation, mySetPreferredSize, mySetMaximumSize, mySetMinimumSize }) {
			w.addListener(SWT.Selection, this);
		}
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		Object newInput = null;
		if (selection instanceof IStructuredSelection && ((IStructuredSelection) selection).size() == 1) {
			newInput = unwrap(((IStructuredSelection) selection).getFirstElement());
		}
		if (newInput != myInput) {
			if (myInput != null) {
				detach();
			}
			myInput = newInput;
			if (newInput != null) {
				attach();
			}
		}
	}

	protected void commit() {

		if (myLocationX.isEnabled() && myLocationY.isEnabled()) {
			getInput().setLocation(GMFGraphFactory.eINSTANCE.createPoint());
			getInput().getLocation().setX(myLocationX.getSelection());
			getInput().getLocation().setY(myLocationY.getSelection());
		} else {
			getInput().setLocation(null);
		}
		if (myPreferredSizeX.isEnabled() && myPreferredSizeY.isEnabled()) {
			getInput().setPreferredSize(GMFGraphFactory.eINSTANCE.createDimension());
			getInput().getPreferredSize().setDx(myPreferredSizeX.getSelection());
			getInput().getPreferredSize().setDy(myPreferredSizeY.getSelection());
		} else {
			getInput().setPreferredSize(null);
		}
		if (myMaximumSizeX.isEnabled() && myMaximumSizeY.isEnabled()) {
			getInput().setMaximumSize(GMFGraphFactory.eINSTANCE.createDimension());
			getInput().getMaximumSize().setDx(myMaximumSizeX.getSelection());
			getInput().getMaximumSize().setDy(myMaximumSizeY.getSelection());
		} else {
			getInput().setMaximumSize(null);
		}
		if (myMinimumSizeX.isEnabled() && myMinimumSizeY.isEnabled()) {
			getInput().setMinimumSize(GMFGraphFactory.eINSTANCE.createDimension());
			getInput().getMinimumSize().setDx(myMinimumSizeX.getSelection());
			getInput().getMinimumSize().setDy(myMinimumSizeY.getSelection());
		} else {
			getInput().setMinimumSize(null);
		}

	}

	@Override
	public void refresh() {
		myIsRefresh = true;

		if (getInput().getLocation() instanceof Point) {
			if (getInput().getLocation() != null) {
				myLocationX.setSelection(getInput().getLocation().getX());
				myLocationY.setSelection(getInput().getLocation().getY());
			}
			mySetLocation.setSelection(true);
			myLocationX.setEnabled(true);
			myLocationY.setEnabled(true);
		} else {
			mySetLocation.setSelection(false);
			myLocationX.setEnabled(false);
			myLocationY.setEnabled(false);
		}
		if (getInput().getPreferredSize() instanceof Dimension) {
			if (getInput().getPreferredSize() != null) {
				myPreferredSizeX.setSelection(getInput().getPreferredSize().getDx());
				myPreferredSizeY.setSelection(getInput().getPreferredSize().getDy());
			}
			mySetPreferredSize.setSelection(true);
			myPreferredSizeX.setEnabled(true);
			myPreferredSizeY.setEnabled(true);
		} else {
			mySetPreferredSize.setSelection(false);
			myPreferredSizeX.setEnabled(false);
			myPreferredSizeY.setEnabled(false);
		}
		if (getInput().getMaximumSize() instanceof Dimension) {
			if (getInput().getMaximumSize() != null) {
				myMaximumSizeX.setSelection(getInput().getMaximumSize().getDx());
				myMaximumSizeY.setSelection(getInput().getMaximumSize().getDy());
			}
			mySetMaximumSize.setSelection(true);
			myMaximumSizeX.setEnabled(true);
			myMaximumSizeY.setEnabled(true);
		} else {
			mySetMaximumSize.setSelection(false);
			myMaximumSizeX.setEnabled(false);
			myMaximumSizeY.setEnabled(false);
		}
		if (getInput().getMinimumSize() instanceof Dimension) {
			if (getInput().getMinimumSize() != null) {
				myMinimumSizeX.setSelection(getInput().getMinimumSize().getDx());
				myMinimumSizeY.setSelection(getInput().getMinimumSize().getDy());
			}
			mySetMinimumSize.setSelection(true);
			myMinimumSizeX.setEnabled(true);
			myMinimumSizeY.setEnabled(true);
		} else {
			mySetMinimumSize.setSelection(false);
			myMinimumSizeX.setEnabled(false);
			myMinimumSizeY.setEnabled(false);
		}

		myIsRefresh = false;
	}

	@Override
	public void aboutToBeHidden() {
		if (myInput != null) {
			detach();
		}
	}

	public void handleEvent(Event event) {
		if (myIsRefresh) {
			return;
		}

		if (event.type == SWT.Modify) {
			// XXX also override isDirty to compare values if they
			// match model's and to clear dirty state in case like aaa^H^H^H
			markDirty();
		} else if (event.type == SWT.FocusOut) {
			applyChanges();
		} else if (event.type == SWT.KeyDown) {
			if (event.keyCode == SWT.ESC) {
				discardChanges();
			} else if (event.keyCode == SWT.CR) {
				applyChanges();
			}
		}
		if (event.type == SWT.Selection) {
			if (mySetLocation == event.widget) {
				if (mySetLocation.getSelection()) {
					myLocationX.setEnabled(true);
					myLocationY.setEnabled(true);
					myLocationX.setEnabled(true);
					myLocationY.setEnabled(true);
					applyChanges(); // Commit; View to Model
					if (getInput().getLocation() != null) {
						myLocationX.setSelection(getInput().getLocation().getX());
						myLocationY.setSelection(getInput().getLocation().getY());
					}
				} else {
					myLocationX.setEnabled(false);
					myLocationY.setEnabled(false);
					applyChanges(); // Commit; View to Model
				}
			} else if (mySetPreferredSize == event.widget) {
				if (mySetPreferredSize.getSelection()) {
					myPreferredSizeX.setEnabled(true);
					myPreferredSizeY.setEnabled(true);
					myPreferredSizeX.setEnabled(true);
					myPreferredSizeY.setEnabled(true);
					applyChanges(); // Commit; View to Model
					if (getInput().getPreferredSize() != null) {
						myPreferredSizeX.setSelection(getInput().getPreferredSize().getDx());
						myPreferredSizeY.setSelection(getInput().getPreferredSize().getDy());
					}
				} else {
					myPreferredSizeX.setEnabled(false);
					myPreferredSizeY.setEnabled(false);
					applyChanges(); // Commit; View to Model
				}
			} else if (mySetMaximumSize == event.widget) {
				if (mySetMaximumSize.getSelection()) {
					myMaximumSizeX.setEnabled(true);
					myMaximumSizeY.setEnabled(true);
					myMaximumSizeX.setEnabled(true);
					myMaximumSizeY.setEnabled(true);
					applyChanges(); // Commit; View to Model
					if (getInput().getMaximumSize() != null) {
						myMaximumSizeX.setSelection(getInput().getMaximumSize().getDx());
						myMaximumSizeY.setSelection(getInput().getMaximumSize().getDy());
					}
				} else {
					myMaximumSizeX.setEnabled(false);
					myMaximumSizeY.setEnabled(false);
					applyChanges(); // Commit; View to Model
				}
			} else if (mySetMinimumSize == event.widget) {
				if (mySetMinimumSize.getSelection()) {
					myMinimumSizeX.setEnabled(true);
					myMinimumSizeY.setEnabled(true);
					myMinimumSizeX.setEnabled(true);
					myMinimumSizeY.setEnabled(true);
					applyChanges(); // Commit; View to Model
					if (getInput().getMinimumSize() != null) {
						myMinimumSizeX.setSelection(getInput().getMinimumSize().getDx());
						myMinimumSizeY.setSelection(getInput().getMinimumSize().getDy());
					}
				} else {
					myMinimumSizeX.setEnabled(false);
					myMinimumSizeY.setEnabled(false);
					applyChanges(); // Commit; View to Model
				}
			}

		}
	}

	public void modelChanged(Notification msg) {
		if (!myIsCommit && Display.getCurrent() != null) {
			refresh();
		}
	}

	private void markDirty() {
		// NO-OP, need that to share Update::handleEvent template with IFormPart
		// which has same method
		// Perhaps, clients may find this method useful for some purpose?
	}

	protected void applyChanges() {
		final java.util.List<org.eclipse.core.resources.IFile> files = java.util.Collections.singletonList(org.eclipse.emf.workspace.util.WorkspaceSynchronizer.getFile(getInput().eResource()));
		org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand cmd = new org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand(
				org.eclipse.emf.transaction.util.TransactionUtil.getEditingDomain(getInput()), "", files) {

			@Override
			protected org.eclipse.gmf.runtime.common.core.command.CommandResult doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.runtime.IAdaptable info)
					throws org.eclipse.core.commands.ExecutionException {
				commit();
				return org.eclipse.gmf.runtime.common.core.command.CommandResult.newOKCommandResult();
			}
		};
		try {
			myIsCommit = true;
			org.eclipse.core.commands.operations.OperationHistoryFactory.getOperationHistory().execute(cmd, new org.eclipse.core.runtime.NullProgressMonitor(), null);
		} catch (org.eclipse.core.commands.ExecutionException ex) {
			ex.printStackTrace();
		} finally {
			myIsCommit = false;
		}
	}

	protected void discardChanges() {
		refresh();
	}

	private Object unwrap(Object element) {
		Object rv = null;
		if (element instanceof org.eclipse.gef.EditPart) {
			Object model = ((org.eclipse.gef.EditPart) element).getModel();
			rv = model instanceof org.eclipse.gmf.runtime.notation.View ? ((org.eclipse.gmf.runtime.notation.View) model).getElement() : null;
		} else if (element instanceof org.eclipse.gmf.runtime.notation.View) {
			rv = ((org.eclipse.gmf.runtime.notation.View) element).getElement();
		} else if (element instanceof org.eclipse.core.runtime.IAdaptable) {
			org.eclipse.gmf.runtime.notation.View view = (org.eclipse.gmf.runtime.notation.View) ((org.eclipse.core.runtime.IAdaptable) element)
					.getAdapter(org.eclipse.gmf.runtime.notation.View.class);
			if (view != null) {
				rv = view.getElement();
			}
		}
		if (rv instanceof Layoutable) {
			return rv;
		}
		return null;
	}

	private void attach() {
		myModelListeners = new org.eclipse.emf.common.notify.Adapter[] { new AttachAdapter(GMFGraphPackage.eINSTANCE.getFigure_Location(), new ChangeTracker() {

			public void modelChanged(org.eclipse.emf.common.notify.Notification n) {
				// FIXME enable/disable widget(s) -- HOWEVER, need access to
				// Binding/Widget here, so can't share the template with e.g.
				// Alex's ItemProviders
			}
		}, new FeatureTracker(this, GMFGraphPackage.eINSTANCE.getPoint_X(), GMFGraphPackage.eINSTANCE.getPoint_Y())),
				new AttachAdapter(GMFGraphPackage.eINSTANCE.getFigure_PreferredSize(), new ChangeTracker() {

					public void modelChanged(org.eclipse.emf.common.notify.Notification n) {
						// FIXME enable/disable widget(s) -- HOWEVER, need
						// access to Binding/Widget here, so can't share the
						// template with e.g. Alex's ItemProviders
					}
				}, new FeatureTracker(this, GMFGraphPackage.eINSTANCE.getDimension_Dx(), GMFGraphPackage.eINSTANCE.getDimension_Dy())),
				new AttachAdapter(GMFGraphPackage.eINSTANCE.getFigure_MaximumSize(), new ChangeTracker() {

					public void modelChanged(org.eclipse.emf.common.notify.Notification n) {
						// FIXME enable/disable widget(s) -- HOWEVER, need
						// access to Binding/Widget here, so can't share the
						// template with e.g. Alex's ItemProviders
					}
				}, new FeatureTracker(this, GMFGraphPackage.eINSTANCE.getDimension_Dx(), GMFGraphPackage.eINSTANCE.getDimension_Dy())),
				new AttachAdapter(GMFGraphPackage.eINSTANCE.getFigure_MinimumSize(), new ChangeTracker() {

					public void modelChanged(org.eclipse.emf.common.notify.Notification n) {
						// FIXME enable/disable widget(s) -- HOWEVER, need
						// access to Binding/Widget here, so can't share the
						// template with e.g. Alex's ItemProviders
					}
				}, new FeatureTracker(this, GMFGraphPackage.eINSTANCE.getDimension_Dx(), GMFGraphPackage.eINSTANCE.getDimension_Dy())) };
		getInput().eAdapters().addAll(java.util.Arrays.asList(myModelListeners));

	}

	private void detach() {
		if (myModelListeners != null) {
			getInput().eAdapters().removeAll(java.util.Arrays.asList(myModelListeners));
			myModelListeners = null;
		}

	}

	private Figure getInput() {
		// TODO implement;
		return (Figure) myInput;
	}

	private org.eclipse.swt.widgets.Label createLabel(org.eclipse.swt.widgets.Composite parent, String label) {
		org.eclipse.swt.widgets.Label l = new org.eclipse.swt.widgets.Label(parent, SWT.NONE);
		if (label != null)
			l.setText(label);
		getWidgetFactory().adapt(l, false, false);
		return l;
	}

	private org.eclipse.swt.widgets.Group createGroup(org.eclipse.swt.widgets.Composite parent, String label) {
		org.eclipse.swt.widgets.Group g = new org.eclipse.swt.widgets.Group(parent, SWT.SHADOW_NONE);
		if (label != null)
			g.setText(label);
		getWidgetFactory().adapt(g, false, false);
		getWidgetFactory().paintBordersFor(g);
		return g;
	}

}

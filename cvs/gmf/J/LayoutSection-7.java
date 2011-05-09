/*
 * Copyright (c) 2008 Borland Software Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.graphdef.editor.sheet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.gmfgraph.Alignment;
import org.eclipse.gmf.gmfgraph.BorderLayout;
import org.eclipse.gmf.gmfgraph.CustomClass;
import org.eclipse.gmf.gmfgraph.CustomLayout;
import org.eclipse.gmf.gmfgraph.FlowLayout;
import org.eclipse.gmf.gmfgraph.GMFGraphFactory;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.GridLayout;
import org.eclipse.gmf.gmfgraph.Layoutable;
import org.eclipse.gmf.gmfgraph.StackLayout;
import org.eclipse.gmf.gmfgraph.XYLayout;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public class LayoutSection extends AbstractPropertySection implements ChangeTracker, Listener {

	private org.eclipse.emf.common.notify.Adapter[] myModelListeners;

	private boolean myIsCommit;
	private boolean myIsRefresh;
	private Object myInput;

	private Group myLayoutKindRadios;
	private Group myFlowLayoutDetails;
	private Group myBorderLayoutDetails;
	private Group myGridLayoutDetails;
	private Composite myCustomLayoutDetails;
	private Button myR1;
	private Button myR2;
	private Button myR3;
	private Button myR4;
	private Button myR5;
	private Button myR6;
	private Button myR7;
	private Button myFlowLayoutIsVertical;
	private Button myFlowLayoutMatchMinor;
	private Button myFlowLayoutForceSingle;
	private Spinner myFlowLayoutMajSpacing;
	private Spinner myFlowLayoutMinSpacing;
	private Group myFlowLayoutAlign;
	private Spinner myBorderLayoutSpacingX;
	private Spinner myBorderLayoutSpacingY;
	private Spinner myGridLayoutColumns;
	private Button myGridLayoutSameWidth;
	private Group myGridLayoutMargins;
	private Group myGridLayoutSpacing;
	private Text myCustomLayoutClass;
	private Combo myFlowLayoutMajAlign;
	private Combo myFlowLayoutMinAlign;
	private Spinner myGridLayoutMarginX;
	private Spinner myGridLayoutMarginY;
	private Spinner myGridLayoutSpacingX;
	private Spinner myGridLayoutSpacingY;

	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage page) {
		super.createControls(parent, page);
		getWidgetFactory().paintBordersFor(parent);
		myLayoutKindRadios = createGroup(parent, "Layout");
		myR1 = getWidgetFactory().createButton(myLayoutKindRadios, "Flow Layout", SWT.RADIO);
		myR2 = getWidgetFactory().createButton(myLayoutKindRadios, "Border Layout", SWT.RADIO);
		myR3 = getWidgetFactory().createButton(myLayoutKindRadios, "Grid Layout", SWT.RADIO);
		myR4 = getWidgetFactory().createButton(myLayoutKindRadios, "Stack Layout", SWT.RADIO);
		myR5 = getWidgetFactory().createButton(myLayoutKindRadios, "XY Layout", SWT.RADIO);
		myR6 = getWidgetFactory().createButton(myLayoutKindRadios, "Custom Layout", SWT.RADIO);
		myR7 = getWidgetFactory().createButton(myLayoutKindRadios, "None", SWT.RADIO);
		myLayoutKindRadios.setLayout(new org.eclipse.swt.layout.FillLayout(org.eclipse.swt.SWT.VERTICAL));
		myFlowLayoutDetails = createGroup(parent, "Details");
		myFlowLayoutIsVertical = getWidgetFactory().createButton(myFlowLayoutDetails, "Is Vertical", SWT.CHECK);
		myFlowLayoutMatchMinor = getWidgetFactory().createButton(myFlowLayoutDetails, "Match minor size", SWT.CHECK);
		myFlowLayoutForceSingle = getWidgetFactory().createButton(myFlowLayoutDetails, "Force single line", SWT.CHECK);
		createLabel(myFlowLayoutDetails, "Major Spacing");
		myFlowLayoutMajSpacing = new Spinner(myFlowLayoutDetails, SWT.FLAT);
		myFlowLayoutMajSpacing.setMinimum(0);
		myFlowLayoutMajSpacing.setMaximum(2147483647);
		myFlowLayoutMajSpacing.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER); // @see #145837
		createLabel(myFlowLayoutDetails, "Minor Spacing");
		myFlowLayoutMinSpacing = new Spinner(myFlowLayoutDetails, SWT.FLAT);
		myFlowLayoutMinSpacing.setMinimum(0);
		myFlowLayoutMinSpacing.setMaximum(2147483647);
		myFlowLayoutMinSpacing.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER); // @see #145837
		myFlowLayoutAlign = createGroup(myFlowLayoutDetails, "Alignment");
		createLabel(myFlowLayoutAlign, "Major");
		myFlowLayoutMajAlign = new Combo(myFlowLayoutAlign, SWT.FLAT | SWT.READ_ONLY);
		myFlowLayoutMajAlign.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		getWidgetFactory().adapt(myFlowLayoutMajAlign, false, false);
		createLabel(myFlowLayoutAlign, "Minor");
		myFlowLayoutMinAlign = new Combo(myFlowLayoutAlign, SWT.FLAT | SWT.READ_ONLY);
		myFlowLayoutMinAlign.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		getWidgetFactory().adapt(myFlowLayoutMinAlign, false, false);
		myFlowLayoutAlign.setLayout(new org.eclipse.swt.layout.FillLayout(org.eclipse.swt.SWT.VERTICAL));
		myFlowLayoutDetails.setLayout(new org.eclipse.swt.layout.GridLayout(2, false));
		org.eclipse.jface.layout.GridDataFactory.swtDefaults().align(SWT.BEGINNING, SWT.BEGINNING).span(2, 1).applyTo(myFlowLayoutIsVertical);
		org.eclipse.jface.layout.GridDataFactory.swtDefaults().align(SWT.BEGINNING, SWT.BEGINNING).span(2, 1).applyTo(myFlowLayoutMatchMinor);
		org.eclipse.jface.layout.GridDataFactory.swtDefaults().align(SWT.BEGINNING, SWT.BEGINNING).span(2, 1).applyTo(myFlowLayoutForceSingle);
		myBorderLayoutDetails = createGroup(parent, "Spacing");
		createLabel(myBorderLayoutDetails, "Horizontal");
		myBorderLayoutSpacingX = new Spinner(myBorderLayoutDetails, SWT.FLAT);
		myBorderLayoutSpacingX.setMinimum(0);
		myBorderLayoutSpacingX.setMaximum(2147483647);
		myBorderLayoutSpacingX.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER); // @see #145837
		createLabel(myBorderLayoutDetails, "Vertical");
		myBorderLayoutSpacingY = new Spinner(myBorderLayoutDetails, SWT.FLAT);
		myBorderLayoutSpacingY.setMinimum(0);
		myBorderLayoutSpacingY.setMaximum(2147483647);
		myBorderLayoutSpacingY.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER); // @see #145837
		myBorderLayoutDetails.setLayout(new org.eclipse.swt.layout.GridLayout(2, false));
		myGridLayoutDetails = createGroup(parent, "Details");
		createLabel(myGridLayoutDetails, "Columns #");
		myGridLayoutColumns = new Spinner(myGridLayoutDetails, SWT.FLAT);
		myGridLayoutColumns.setMinimum(1);
		myGridLayoutColumns.setMaximum(2147483647);
		myGridLayoutColumns.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER); // @see #145837
		myGridLayoutSameWidth = getWidgetFactory().createButton(myGridLayoutDetails, "Equal", SWT.CHECK);
		myGridLayoutMargins = createGroup(myGridLayoutDetails, "Margins");
		createLabel(myGridLayoutMargins, "dx");
		myGridLayoutMarginX = new Spinner(myGridLayoutMargins, SWT.FLAT);
		myGridLayoutMarginX.setMinimum(0);
		myGridLayoutMarginX.setMaximum(2147483647);
		myGridLayoutMarginX.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER); // @see #145837
		createLabel(myGridLayoutMargins, "dy");
		myGridLayoutMarginY = new Spinner(myGridLayoutMargins, SWT.FLAT);
		myGridLayoutMarginY.setMinimum(0);
		myGridLayoutMarginY.setMaximum(2147483647);
		myGridLayoutMarginY.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER); // @see #145837
		myGridLayoutMargins.setLayout(new org.eclipse.swt.layout.GridLayout(2, false));
		myGridLayoutSpacing = createGroup(myGridLayoutDetails, "Spacing");
		createLabel(myGridLayoutSpacing, "dx");
		myGridLayoutSpacingX = new Spinner(myGridLayoutSpacing, SWT.FLAT);
		myGridLayoutSpacingX.setMinimum(0);
		myGridLayoutSpacingX.setMaximum(2147483647);
		myGridLayoutSpacingX.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER); // @see #145837
		createLabel(myGridLayoutSpacing, "dy");
		myGridLayoutSpacingY = new Spinner(myGridLayoutSpacing, SWT.FLAT);
		myGridLayoutSpacingY.setMinimum(0);
		myGridLayoutSpacingY.setMaximum(2147483647);
		myGridLayoutSpacingY.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER); // @see #145837
		myGridLayoutSpacing.setLayout(new org.eclipse.swt.layout.GridLayout(2, false));
		myGridLayoutDetails.setLayout(new org.eclipse.swt.layout.GridLayout(2, false));
		org.eclipse.jface.layout.GridDataFactory.swtDefaults().align(SWT.BEGINNING, SWT.BEGINNING).span(2, 1).applyTo(myGridLayoutSameWidth);
		myCustomLayoutDetails = getWidgetFactory().createComposite(parent);
		getWidgetFactory().paintBordersFor(myCustomLayoutDetails);
		createLabel(myCustomLayoutDetails, "Qualified class name:");
		myCustomLayoutClass = getWidgetFactory().createText(myCustomLayoutDetails, null);

		parent.setLayout(new org.eclipse.swt.layout.FormLayout());
		org.eclipse.swt.layout.FormData fd;
		fd = new org.eclipse.swt.layout.FormData();
		fd.left = new org.eclipse.swt.layout.FormAttachment(0, 20);
		myLayoutKindRadios.setLayoutData(fd);
		fd = new org.eclipse.swt.layout.FormData();
		fd.left = new org.eclipse.swt.layout.FormAttachment(myLayoutKindRadios, 20, org.eclipse.swt.SWT.RIGHT);
		myFlowLayoutDetails.setLayoutData(fd);
		fd = new org.eclipse.swt.layout.FormData();
		fd.left = new org.eclipse.swt.layout.FormAttachment(myLayoutKindRadios, 20, org.eclipse.swt.SWT.RIGHT);
		myBorderLayoutDetails.setLayoutData(fd);
		fd = new org.eclipse.swt.layout.FormData();
		fd.left = new org.eclipse.swt.layout.FormAttachment(myLayoutKindRadios, 20, org.eclipse.swt.SWT.RIGHT);
		myGridLayoutDetails.setLayoutData(fd);
		// TODO myFlowLayoutMajAlign.setItems(VALUES.toString().toArray());
		for (org.eclipse.emf.common.util.Enumerator e : Alignment.VALUES) {
			myFlowLayoutMajAlign.add(e.getName());
		}
		// TODO myFlowLayoutMinAlign.setItems(VALUES.toString().toArray());
		for (org.eclipse.emf.common.util.Enumerator e : Alignment.VALUES) {
			myFlowLayoutMinAlign.add(e.getName());
		}

		for (Text t : new Text[] { myCustomLayoutClass }) {
			t.addListener(SWT.Modify, this);
			t.addListener(SWT.FocusOut, this);
			t.addListener(SWT.KeyDown, this);
		}
		for (Spinner s : new Spinner[] { myFlowLayoutMajSpacing, myFlowLayoutMinSpacing, myBorderLayoutSpacingX, myBorderLayoutSpacingY, myGridLayoutColumns, myGridLayoutMarginX, myGridLayoutMarginY,
				myGridLayoutSpacingX, myGridLayoutSpacingY }) {
			s.addListener(SWT.Modify, this);
			s.addListener(SWT.FocusOut, this);
		}
		for (Widget w : new Widget[] { myR1, myR2, myR3, myR4, myR5, myR6, myR7, myFlowLayoutIsVertical, myFlowLayoutMatchMinor, myFlowLayoutForceSingle, myGridLayoutSameWidth, myFlowLayoutMajAlign,
				myFlowLayoutMinAlign }) {
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

		if (myFlowLayoutDetails.isVisible()) {
			getInput().setLayout(GMFGraphFactory.eINSTANCE.createFlowLayout());
			((FlowLayout) getInput().getLayout()).setVertical(myFlowLayoutIsVertical.getSelection());
			((FlowLayout) getInput().getLayout()).setMatchMinorSize(myFlowLayoutMatchMinor.getSelection());
			((FlowLayout) getInput().getLayout()).setForceSingleLine(myFlowLayoutForceSingle.getSelection());
			((FlowLayout) getInput().getLayout()).setMajorSpacing(myFlowLayoutMajSpacing.getSelection());
			((FlowLayout) getInput().getLayout()).setMinorSpacing(myFlowLayoutMinSpacing.getSelection());
			((FlowLayout) getInput().getLayout()).setMinorAlignment(Alignment.get(myFlowLayoutMajAlign.getSelectionIndex()));
			((FlowLayout) getInput().getLayout()).setMajorAlignment(Alignment.get(myFlowLayoutMinAlign.getSelectionIndex()));
		}
		if (myBorderLayoutDetails.isVisible()) {
			getInput().setLayout(GMFGraphFactory.eINSTANCE.createBorderLayout());
			if (((BorderLayout) getInput().getLayout()).getSpacing() == null) {
				((BorderLayout) getInput().getLayout()).setSpacing(GMFGraphFactory.eINSTANCE.createDimension());
			}
			((BorderLayout) getInput().getLayout()).getSpacing().setDx(myBorderLayoutSpacingX.getSelection());
			((BorderLayout) getInput().getLayout()).getSpacing().setDy(myBorderLayoutSpacingY.getSelection());
		}
		if (myGridLayoutDetails.isVisible()) {
			getInput().setLayout(GMFGraphFactory.eINSTANCE.createGridLayout());
			((GridLayout) getInput().getLayout()).setNumColumns(myGridLayoutColumns.getSelection());
			((GridLayout) getInput().getLayout()).setEqualWidth(myGridLayoutSameWidth.getSelection());
			if (((GridLayout) getInput().getLayout()).getMargins() == null) {
				((GridLayout) getInput().getLayout()).setMargins(GMFGraphFactory.eINSTANCE.createDimension());
			}
			if (((GridLayout) getInput().getLayout()).getSpacing() == null) {
				((GridLayout) getInput().getLayout()).setSpacing(GMFGraphFactory.eINSTANCE.createDimension());
			}
			((GridLayout) getInput().getLayout()).getMargins().setDx(myGridLayoutMarginX.getSelection());
			((GridLayout) getInput().getLayout()).getMargins().setDy(myGridLayoutMarginY.getSelection());
			((GridLayout) getInput().getLayout()).getSpacing().setDx(myGridLayoutSpacingX.getSelection());
			((GridLayout) getInput().getLayout()).getSpacing().setDy(myGridLayoutSpacingY.getSelection());
		}
		if (myR4.getSelection()) {
			getInput().setLayout(GMFGraphFactory.eINSTANCE.createStackLayout());
		}
		if (myR5.getSelection()) {
			getInput().setLayout(GMFGraphFactory.eINSTANCE.createXYLayout());
		}
		if (myCustomLayoutDetails.isVisible()) {
			getInput().setLayout(GMFGraphFactory.eINSTANCE.createCustomLayout());
			((CustomClass) getInput().getLayout()).setQualifiedClassName(/* Bridge.fieldGet(myCustomLayoutClass) */myCustomLayoutClass.getText());
		}
		if (myR7.getSelection()) {
			getInput().setLayout(null);
		}

	}

	@Override
	public void refresh() {
		myIsRefresh = true;

		if (getInput().getLayout() instanceof FlowLayout) {
			if (getInput().getLayout() != null) {
				myFlowLayoutIsVertical.setSelection(((FlowLayout) getInput().getLayout()).isVertical());
				myFlowLayoutMatchMinor.setSelection(((FlowLayout) getInput().getLayout()).isMatchMinorSize());
				myFlowLayoutForceSingle.setSelection(((FlowLayout) getInput().getLayout()).isForceSingleLine());
				myFlowLayoutMajSpacing.setSelection(((FlowLayout) getInput().getLayout()).getMajorSpacing());
				myFlowLayoutMinSpacing.setSelection(((FlowLayout) getInput().getLayout()).getMinorSpacing());
				myFlowLayoutMajAlign.select(((FlowLayout) getInput().getLayout()).getMinorAlignment().getValue());
				myFlowLayoutMinAlign.select(((FlowLayout) getInput().getLayout()).getMajorAlignment().getValue());
			}
			myR1.setSelection(true);
			myFlowLayoutDetails.setVisible(true);
		} else {
			myR1.setSelection(false);
			myFlowLayoutDetails.setVisible(false);
		}
		if (getInput().getLayout() instanceof BorderLayout) {
			if (getInput().getLayout() != null && ((BorderLayout) getInput().getLayout()).getSpacing() != null) {
				myBorderLayoutSpacingX.setSelection(((BorderLayout) getInput().getLayout()).getSpacing().getDx());
				myBorderLayoutSpacingY.setSelection(((BorderLayout) getInput().getLayout()).getSpacing().getDy());
			}
			myR2.setSelection(true);
			myBorderLayoutDetails.setVisible(true);
		} else {
			myR2.setSelection(false);
			myBorderLayoutDetails.setVisible(false);
		}
		if (getInput().getLayout() instanceof GridLayout) {
			if (getInput().getLayout() != null) {
				myGridLayoutColumns.setSelection(((GridLayout) getInput().getLayout()).getNumColumns());
				myGridLayoutSameWidth.setSelection(((GridLayout) getInput().getLayout()).isEqualWidth());
			}
			if (getInput().getLayout() != null && ((GridLayout) getInput().getLayout()).getMargins() != null) {
				myGridLayoutMarginX.setSelection(((GridLayout) getInput().getLayout()).getMargins().getDx());
				myGridLayoutMarginY.setSelection(((GridLayout) getInput().getLayout()).getMargins().getDy());
			}
			if (getInput().getLayout() != null && ((GridLayout) getInput().getLayout()).getSpacing() != null) {
				myGridLayoutSpacingX.setSelection(((GridLayout) getInput().getLayout()).getSpacing().getDx());
				myGridLayoutSpacingY.setSelection(((GridLayout) getInput().getLayout()).getSpacing().getDy());
			}
			myR3.setSelection(true);
			myGridLayoutDetails.setVisible(true);
		} else {
			myR3.setSelection(false);
			myGridLayoutDetails.setVisible(false);
		}
		if (getInput().getLayout() instanceof StackLayout) {
			myR4.setSelection(true);
		} else {
			myR4.setSelection(false);
		}
		if (getInput().getLayout() instanceof XYLayout) {
			myR5.setSelection(true);
		} else {
			myR5.setSelection(false);
		}
		if (getInput().getLayout() instanceof CustomLayout) {
			if (getInput().getLayout() != null) {
				myCustomLayoutClass.setText(((CustomClass) getInput().getLayout()).getQualifiedClassName());/*
																											 * Bridge.fieldSet(myCustomLayoutClass, ((CustomClass)
																											 * getInput().getLayout()).getQualifiedClassName());
																											 */
			}
			myR6.setSelection(true);
			myCustomLayoutDetails.setVisible(true);
		} else {
			myR6.setSelection(false);
			myCustomLayoutDetails.setVisible(false);
		}
		if (getInput().getLayout() == null) {
			myR7.setSelection(true);
		} else {
			myR7.setSelection(false);
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
			if (myFlowLayoutIsVertical == event.widget) {
				applyChanges(); // Commit; View to Model
				// Optimization? Instead of full refresh, just dependant widgets should get updated
			} else if (myFlowLayoutMatchMinor == event.widget) {
				applyChanges(); // Commit; View to Model
				// Optimization? Instead of full refresh, just dependant widgets should get updated
			} else if (myFlowLayoutForceSingle == event.widget) {
				applyChanges(); // Commit; View to Model
				// Optimization? Instead of full refresh, just dependant widgets should get updated
			} else if (myGridLayoutSameWidth == event.widget) {
				applyChanges(); // Commit; View to Model
				// Optimization? Instead of full refresh, just dependant widgets should get updated
			}
			if (myR1 == event.widget) {
				if (myR1.getSelection()) {
					myFlowLayoutDetails.setVisible(true);
					myBorderLayoutDetails.setVisible(false);
					myGridLayoutDetails.setVisible(false);
					myCustomLayoutDetails.setVisible(false);
					applyChanges(); // Commit; View to Model
					if (getInput().getLayout() != null) {
						myFlowLayoutIsVertical.setSelection(((FlowLayout) getInput().getLayout()).isVertical());
						myFlowLayoutMatchMinor.setSelection(((FlowLayout) getInput().getLayout()).isMatchMinorSize());
						myFlowLayoutForceSingle.setSelection(((FlowLayout) getInput().getLayout()).isForceSingleLine());
						myFlowLayoutMajSpacing.setSelection(((FlowLayout) getInput().getLayout()).getMajorSpacing());
						myFlowLayoutMinSpacing.setSelection(((FlowLayout) getInput().getLayout()).getMinorSpacing());
						myFlowLayoutMajAlign.select(((FlowLayout) getInput().getLayout()).getMinorAlignment().getValue());
						myFlowLayoutMinAlign.select(((FlowLayout) getInput().getLayout()).getMajorAlignment().getValue());
					}
				} else {
					myFlowLayoutDetails.setVisible(false);
				}
			} else if (myR2 == event.widget) {
				if (myR2.getSelection()) {
					myBorderLayoutDetails.setVisible(true);
					myFlowLayoutDetails.setVisible(false);
					myGridLayoutDetails.setVisible(false);
					myCustomLayoutDetails.setVisible(false);
					applyChanges(); // Commit; View to Model
					if (getInput().getLayout() != null && ((BorderLayout) getInput().getLayout()).getSpacing() != null) {
						myBorderLayoutSpacingX.setSelection(((BorderLayout) getInput().getLayout()).getSpacing().getDx());
						myBorderLayoutSpacingY.setSelection(((BorderLayout) getInput().getLayout()).getSpacing().getDy());
					}
				} else {
					myBorderLayoutDetails.setVisible(false);
				}
			} else if (myR3 == event.widget) {
				if (myR3.getSelection()) {
					myGridLayoutDetails.setVisible(true);
					myFlowLayoutDetails.setVisible(false);
					myBorderLayoutDetails.setVisible(false);
					myCustomLayoutDetails.setVisible(false);
					applyChanges(); // Commit; View to Model
					if (getInput().getLayout() != null) {
						myGridLayoutColumns.setSelection(((GridLayout) getInput().getLayout()).getNumColumns());
						myGridLayoutSameWidth.setSelection(((GridLayout) getInput().getLayout()).isEqualWidth());
					}
					if (getInput().getLayout() != null && ((GridLayout) getInput().getLayout()).getMargins() != null) {
						myGridLayoutMarginX.setSelection(((GridLayout) getInput().getLayout()).getMargins().getDx());
						myGridLayoutMarginY.setSelection(((GridLayout) getInput().getLayout()).getMargins().getDy());
					}
					if (getInput().getLayout() != null && ((GridLayout) getInput().getLayout()).getSpacing() != null) {
						myGridLayoutSpacingX.setSelection(((GridLayout) getInput().getLayout()).getSpacing().getDx());
						myGridLayoutSpacingY.setSelection(((GridLayout) getInput().getLayout()).getSpacing().getDy());
					}
				} else {
					myGridLayoutDetails.setVisible(false);
				}
			} else if (myR4 == event.widget) {
				if (myR4.getSelection()) {
					myFlowLayoutDetails.setVisible(false);
					myBorderLayoutDetails.setVisible(false);
					myGridLayoutDetails.setVisible(false);
					myCustomLayoutDetails.setVisible(false);
					applyChanges(); // Commit; View to Model
				}
			} else if (myR5 == event.widget) {
				if (myR5.getSelection()) {
					myFlowLayoutDetails.setVisible(false);
					myBorderLayoutDetails.setVisible(false);
					myGridLayoutDetails.setVisible(false);
					myCustomLayoutDetails.setVisible(false);
					applyChanges(); // Commit; View to Model
				}
			} else if (myR6 == event.widget) {
				if (myR6.getSelection()) {
					myCustomLayoutDetails.setVisible(true);
					myFlowLayoutDetails.setVisible(false);
					myBorderLayoutDetails.setVisible(false);
					myGridLayoutDetails.setVisible(false);
					applyChanges(); // Commit; View to Model
					if (getInput().getLayout() != null) {
						myCustomLayoutClass.setText(((CustomClass) getInput().getLayout()).getQualifiedClassName());/*
																													 * Bridge.fieldSet(myCustomLayoutClass, ((CustomClass)
																													 * getInput().getLayout()).getQualifiedClassName());
																													 */
					}
				} else {
					myCustomLayoutDetails.setVisible(false);
				}
			} else if (myR7 == event.widget) {
				if (myR7.getSelection()) {
					myFlowLayoutDetails.setVisible(false);
					myBorderLayoutDetails.setVisible(false);
					myGridLayoutDetails.setVisible(false);
					myCustomLayoutDetails.setVisible(false);
					applyChanges(); // Commit; View to Model
				}
			}
			if (myFlowLayoutMajAlign == event.widget || myFlowLayoutMinAlign == event.widget) {
				applyChanges();
			}

		}
	}

	public void modelChanged(Notification msg) {
		if (!myIsCommit && Display.getCurrent() != null) {
			refresh();
		}
	}

	private void markDirty() {
		// NO-OP, need that to share Update::handleEvent template with IFormPart which has same method
		// Perhaps, clients may find this method useful for some purpose?
	}

	protected void applyChanges() {
		try {
			myIsCommit = true;
			commit();
		} finally {
			myIsCommit = false;
		}
	}

	protected void discardChanges() {
		refresh();
	}

	protected Object unwrap(Object element) {
		// TODO may need to adapt selected element to smth else,
		// do it here
		return element;
	}

	private void attach() {
		myModelListeners = new org.eclipse.emf.common.notify.Adapter[] { new AttachAdapter(GMFGraphPackage.eINSTANCE.getLayoutable_Layout(), new ChangeTracker() {

			public void modelChanged(org.eclipse.emf.common.notify.Notification n) {
				// FIXME enable/disable widget(s) -- HOWEVER, need access to Binding/Widget here, so can't share the template with e.g. Alex's ItemProviders
			}
		}, new FeatureTracker(this, GMFGraphPackage.eINSTANCE.getFlowLayout_Vertical(), GMFGraphPackage.eINSTANCE.getFlowLayout_MatchMinorSize(), GMFGraphPackage.eINSTANCE
				.getFlowLayout_ForceSingleLine(), GMFGraphPackage.eINSTANCE.getFlowLayout_MajorSpacing(), GMFGraphPackage.eINSTANCE.getFlowLayout_MinorSpacing(), GMFGraphPackage.eINSTANCE
				.getGridLayout_NumColumns(), GMFGraphPackage.eINSTANCE.getGridLayout_EqualWidth(), GMFGraphPackage.eINSTANCE.getCustomClass_QualifiedClassName(), GMFGraphPackage.eINSTANCE
				.getFlowLayout_MinorAlignment(), GMFGraphPackage.eINSTANCE.getFlowLayout_MajorAlignment()), new AttachAdapter(GMFGraphPackage.eINSTANCE.getBorderLayout_Spacing(), new FeatureTracker(
				this, GMFGraphPackage.eINSTANCE.getDimension_Dx(), GMFGraphPackage.eINSTANCE.getDimension_Dy())), new AttachAdapter(GMFGraphPackage.eINSTANCE.getGridLayout_Margins(),
				new FeatureTracker(this, GMFGraphPackage.eINSTANCE.getDimension_Dx(), GMFGraphPackage.eINSTANCE.getDimension_Dy())), new AttachAdapter(GMFGraphPackage.eINSTANCE
				.getGridLayout_Spacing(), new FeatureTracker(this, GMFGraphPackage.eINSTANCE.getDimension_Dx(), GMFGraphPackage.eINSTANCE.getDimension_Dy()))) };
		getInput().eAdapters().addAll(java.util.Arrays.asList(myModelListeners));

	}

	private void detach() {
		if (myModelListeners != null) {
			getInput().eAdapters().removeAll(java.util.Arrays.asList(myModelListeners));
			myModelListeners = null;
		}

	}

	protected Layoutable getInput() {
		// TODO implement;
		return (Layoutable) myInput;
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

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
package org.eclipse.gmf.runtime.lite.properties;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gmf.internal.runtime.lite.PluginImages;
import org.eclipse.gmf.runtime.lite.commands.WrappingCommand;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.CompositeImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.accessibility.AccessibleAdapter;
import org.eclipse.swt.accessibility.AccessibleEvent;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.ColorDialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

/**
 * Property section that displays properties for views' font and colors.
 */
public class ColorsAndFontsPropertySection extends AbstractPropertySection {
	protected CCombo fontFamilyCombo;

	private CCombo fontSizeCombo;

	private Button fontBoldButton;
	private Button fontItalicButton;

	protected Button fontColorButton;
    protected Button lineColorButton;
	protected Button fillColorButton;

	protected RGB fontColorRGB;
    protected RGB lineColorRGB;
	protected RGB fillColorRGB;

	private Group colorsAndFontsGroup;

	private ResourceSetListener myResourceSetListener = new ResourceSetListenerImpl() {
		@Override
		public void resourceSetChanged(ResourceSetChangeEvent event) {
			refresh();
		}
	};

	/**
	 * Command stack to execute commands with. If <code>null</code>, all items are read-only.
	 */
	private CommandStack myCommandStack;

	private TransactionalEditingDomain myEditingDomain;

	private Collection<View> myViews;

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		if (selection.isEmpty() || false == selection instanceof StructuredSelection) {
			super.setInput(part, selection);
			return;
		}
		final StructuredSelection structuredSelection = ((StructuredSelection) selection);
		myViews = new ArrayList<View>(structuredSelection.size());
		for (Iterator<?> it = structuredSelection.iterator(); it.hasNext();) {
			Object r = transformSelection(it.next());
			if (r instanceof View) {
				myViews.add((View) r);
			}
		}
		myEditingDomain = getEditingDomain(myViews);
		myCommandStack = AdvancedPropertySection.getCommandStack(myEditingDomain);
		super.setInput(part, new StructuredSelection(myViews));
	}

	private TransactionalEditingDomain getEditingDomain(Collection<View> transformedSelection) {
		TransactionalEditingDomain result = null;
		for (View next : transformedSelection) {
			TransactionalEditingDomain candidate = TransactionUtil.getEditingDomain(next);
			if (candidate == null) {
				return null;
			}
			if (result != null && result != candidate) {
				return null;
			}
			result = candidate;
		}
		return result;
	}

	/**
	 * Allows the subclasses to unwrap or otherwise modify the contents of the selection. The <code>null</code> result may be returned,
	 * in this case it will be ignored.
	 * <p/>By default, the passed object is returned untouched.
	 */
	protected Object transformSelection(Object selected) {
		if (selected instanceof EditPart) {
			EditPart ep = (EditPart) selected;
			return ep.getModel() instanceof View ? ep.getModel() : null;
		}
		if (selected instanceof View) {
			return selected;
		}
		if (selected instanceof IAdaptable) {
			return ((IAdaptable) selected).getAdapter(View.class);
		}
		return null;
	}

	@Override
	public void aboutToBeShown() {
		if (myEditingDomain != null) {
			myEditingDomain.addResourceSetListener(getListener());
		}
	}

	@Override
	public void aboutToBeHidden() {
		if (myEditingDomain != null) {
			myEditingDomain.addResourceSetListener(getListener());
		}
	}

	protected final ResourceSetListener getListener() {
		return myResourceSetListener;
	}

	@Override
	public void dispose() {
		disposeImageFor(fillColorButton, PluginImages.IMG_FILL_COLOR);
		disposeImageFor(fontColorButton, PluginImages.IMG_FONT_COLOR);
		disposeImageFor(lineColorButton, PluginImages.IMG_LINE_COLOR);
		myViews = null;
		myEditingDomain = null;
		myCommandStack = null;
		super.dispose();
	}

	/**
	 * Disposes the image associated with the given button iff it is not a standard image.
	 * @param button
	 * @param key
	 */
	protected final void disposeImageFor(Button button, String key) {
		if (button == null || button.isDisposed()) {
			return;
		}
		Image img = button.getImage();
		if (img == PluginImages.get(key)) {
			//Shared image, do not dispose
			return;
		}
		img.dispose();
	}

	@Override
	public void refresh() {
		if (myEditingDomain != null) {
			boolean isReadOnly = isReadOnly();
			refresh(fontFamilyCombo, isReadOnly, NotationPackage.eINSTANCE.getFontStyle_FontName(), ID_CONVERTER);
			refresh(fontSizeCombo, isReadOnly, NotationPackage.eINSTANCE.getFontStyle_FontHeight(), FROM_INT_CONVERTER);
			refresh(fontBoldButton, isReadOnly, NotationPackage.eINSTANCE.getFontStyle_Bold());
			refresh(fontItalicButton, isReadOnly, NotationPackage.eINSTANCE.getFontStyle_Italic());
			fontColorRGB = refreshColor(fontColorButton, isReadOnly, NotationPackage.eINSTANCE.getFontStyle_FontColor(), PluginImages.IMG_FONT_COLOR);
			lineColorRGB = refreshColor(lineColorButton, isReadOnly, NotationPackage.eINSTANCE.getLineStyle_LineColor(), PluginImages.IMG_LINE_COLOR);
			fillColorRGB = refreshColor(fillColorButton, isReadOnly, NotationPackage.eINSTANCE.getFillStyle_FillColor(), PluginImages.IMG_FILL_COLOR);
		}
		super.refresh();
	}

	private boolean isReadOnly() {
		if (myCommandStack == null) {
			return true;
		}
		for (View next : myViews) {
			if (next.eResource() == null || myEditingDomain.isReadOnly(next.eResource())) {
				return true;
			}
		}
		return false;
	}

	protected void refresh(CCombo combo, boolean isReadOnly, final EStructuralFeature feature, IValueConverter<String> converter) {
		if (!hasStyles(feature.getEContainingClass())) {
			combo.setEnabled(false);
			combo.select(-1);
			return;
		}
		combo.setEnabled(!isReadOnly);
		String result = getStructuralFeatureValue(feature, converter);
		if (result == null) {
			combo.select(-1);
		} else {
			combo.select(combo.indexOf(result));
		}
	}

	protected void refresh(Button button, boolean isReadOnly, EStructuralFeature feature) {
		if (!hasStyles(feature.getEContainingClass())) {
			button.setEnabled(false);
			button.setSelection(false);
			return;
		}
		button.setEnabled(!isReadOnly);
		button.setSelection(getStructuralFeatureValue(feature, TO_BOOLEAN_CONVERTER));
	}

	protected RGB refreshColor(Button button, boolean isReadOnly, EStructuralFeature feature, String baseImageKey) {
		RGB rgb;
		if (!hasStyles(feature.getEContainingClass())) {
			button.setEnabled(false);
			rgb = null;
		} else {
			button.setEnabled(!isReadOnly);
			rgb = getStructuralFeatureValue(feature, TO_RGB_CONVERTER);
		}
		disposeImageFor(button, baseImageKey);
		if (rgb == null) {
			button.setImage(PluginImages.get(baseImageKey));
		} else {
			button.setImage(new ColorOverlayImageDescriptor(PluginImages.get(baseImageKey).getImageData(), rgb).createImage());
		}
		//TODO: Update button image based on rgb value
		return rgb;
	}

	protected final boolean hasStyles(EClass styleClass) {
		for (View next : myViews) {
			if (next.getStyle(styleClass) == null) {
				return false;
			}
		}
		return true;
	}

	protected <E> E getStructuralFeatureValue(EStructuralFeature feature, IValueConverter<E> converter) {
		E result = null;
		for (View next : myViews) {
			Style style = next.getStyle(feature.getEContainingClass());
			if (style == null) {
				return null;
			}
			E nextResult = converter.convertFromStyleValue(style.eGet(feature));
			if (nextResult == null) {
				return null;
			}
			if (result == null) {
				result = nextResult;
			} else if (!result.equals(nextResult)) {
				return null;
			}
		}
		return result;
	}

	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);
		Composite composite = getWidgetFactory().createFlatFormComposite(parent);
		FormLayout layout = (FormLayout) composite.getLayout();
		layout.spacing = 3;
		createFontsAndColorsGroups(composite);
	}

	/**
	 * Create  fonts and colors group
	 * @param parent - parent composite
	 */
	protected Group createFontsAndColorsGroups(Composite parent) {
		colorsAndFontsGroup = getWidgetFactory().createGroup(parent, "Fonts and Colors");
		colorsAndFontsGroup.setLayout(new GridLayout(1, false));
		createFontsGroup(colorsAndFontsGroup);
		return colorsAndFontsGroup;

	}

	/**
	 * Create font tool bar group
	 * @param parent - parent composite
	 * @return - font tool bar
	 */
	protected Composite createFontsGroup(Composite parent) {
		Composite familySize = getWidgetFactory().createComposite(parent);
		GridLayout layout = new GridLayout(2, false);
		layout.horizontalSpacing = 0;
		layout.verticalSpacing = 0;
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		familySize.setLayout(layout);

		fontFamilyCombo = getWidgetFactory().createCCombo(familySize, SWT.DROP_DOWN | SWT.READ_ONLY | SWT.BORDER);
		fontFamilyCombo.setItems(getFontFamilyNames());
		fontFamilyCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				change(fontFamilyCombo, NotationPackage.eINSTANCE.getFontStyle_FontName(), ID_CONVERTER, "Change font family");
			}
		});

		fontSizeCombo = getWidgetFactory().createCCombo(familySize,SWT.DROP_DOWN | SWT.READ_ONLY | SWT.BORDER);
		fontSizeCombo.setItems(getFontSizes());
		fontSizeCombo.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				change(fontSizeCombo, NotationPackage.eINSTANCE.getFontStyle_FontHeight(), FROM_INT_CONVERTER, "Change font size");
			}
		});

		Composite toolBar = new Composite(parent, SWT.SHADOW_NONE);
		toolBar.setLayout(new GridLayout(5, false));
		toolBar.setBackground(parent.getBackground());

		fontBoldButton = new Button(toolBar, SWT.TOGGLE);
		fontBoldButton.setLayoutData(new GridData(GridData.CENTER, GridData.CENTER, false, false));
		fontBoldButton.setImage(PluginImages.get(PluginImages.IMG_BOLD));
        fontBoldButton.getAccessible().addAccessibleListener(new AccessibleAdapter() {
            public void getName(AccessibleEvent e) {
                e.result = "Bold Font Style";
            }
        });
	
		fontBoldButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				change(fontBoldButton, NotationPackage.eINSTANCE.getFontStyle_Bold(), TO_BOOLEAN_CONVERTER, "Change font bold");
			}
		});

		fontItalicButton = new Button(toolBar, SWT.TOGGLE );
		fontItalicButton.setLayoutData(new GridData(GridData.CENTER, GridData.CENTER, false, false));
		fontItalicButton.setImage(PluginImages.get(PluginImages.IMG_ITALIC));
        fontItalicButton.getAccessible().addAccessibleListener(new AccessibleAdapter() {
            public void getName(AccessibleEvent e) {
                e.result = "Italic Font Style";
            }
        });

		fontItalicButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				change(fontItalicButton, NotationPackage.eINSTANCE.getFontStyle_Italic(), TO_BOOLEAN_CONVERTER, "Change font italic");
			}
		});

		fontColorButton = new Button(toolBar, SWT.PUSH);
		GridData fontColorButtonGridData = new GridData(GridData.CENTER, GridData.CENTER, false, false);
		fontColorButtonGridData.horizontalIndent = 5;
		fontColorButton.setLayoutData(fontColorButtonGridData);
		fontColorButton.setImage(PluginImages.get(PluginImages.IMG_FONT_COLOR));
        fontColorButton.getAccessible().addAccessibleListener(new AccessibleAdapter() {
            public void getName(AccessibleEvent e) {
                e.result = "Font Color";
            }
        });
		fontColorButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				changeColor(fontColorButton, fontColorRGB, NotationPackage.eINSTANCE.getFontStyle_FontColor(), "Change font color");
			}
		});

		lineColorButton = new Button(toolBar, SWT.PUSH);
		GridData lineColorButtonGridData = new GridData(GridData.CENTER, GridData.CENTER, false, false);
		lineColorButtonGridData.horizontalIndent = 5;
		fontColorButton.setLayoutData(lineColorButtonGridData);
		lineColorButton.setImage(PluginImages.get(PluginImages.IMG_LINE_COLOR));
        lineColorButton.getAccessible().addAccessibleListener(new AccessibleAdapter() {
            public void getName(AccessibleEvent e) {
                e.result = "Line Color";
            }
        });
		lineColorButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				changeColor(lineColorButton, lineColorRGB, NotationPackage.eINSTANCE.getLineStyle_LineColor(), "Change line color");
			}
		});

		fillColorButton = new Button(toolBar, SWT.PUSH);
		fillColorButton.setLayoutData(new GridData(GridData.CENTER, GridData.CENTER, false, false));
		fillColorButton.setImage(PluginImages.get(PluginImages.IMG_FILL_COLOR));
		fillColorButton.getAccessible().addAccessibleListener(new AccessibleAdapter() {
            public void getName(AccessibleEvent e) {
                e.result = "Fill Color";
            }
        });
		fillColorButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				changeColor(fillColorButton, fillColorRGB, NotationPackage.eINSTANCE.getFillStyle_FillColor(), "Change fill color");
			}
		});

		return toolBar;
	}

	protected void change(CCombo combo, EStructuralFeature feature, IValueConverter<String> converter, String commandName) {
		if (combo.getSelectionIndex() == -1) {
			return;
		}
		String selectedValue = combo.getText();
		if (selectedValue == null || selectedValue.length() == 0) {
			selectedValue = null;
		}
		Object value = converter.convertToStyleValue(selectedValue);
		executeChange(commandName, feature, value);
	}

	protected void change(Button button, EStructuralFeature feature, IValueConverter<Boolean> converter, String commandName) {
		boolean isSelected = button.getSelection();
		Object value = converter.convertToStyleValue(isSelected);
		executeChange(commandName, feature, value);
	}

	protected void changeColor(Button button, RGB currentRGB, EStructuralFeature feature, String commandName) {
		//TODO: make it possible to revert to default color (reuse from parent)
		ColorDialog colorDialog = new ColorDialog(button.getShell());
		colorDialog.setRGB(currentRGB);
		RGB newRGB = colorDialog.open();
		if (newRGB == null || newRGB.equals(currentRGB)) {
			return;
		}
		Object featureValue = TO_RGB_CONVERTER.convertToStyleValue(newRGB);
		executeChange(commandName, feature, featureValue);
	}

	/**
	 * Creates and executes the command that updates the styles of the given views
	 */
	protected void executeChange(String commandName, EStructuralFeature feature, Object value) {
		if (feature.isRequired() && value == null) {
			value = SetCommand.UNSET_VALUE;
		}
		CompoundCommand cc = new CompoundCommand(commandName);
		for (View next : myViews) {
			Style style = next.getStyle(feature.getEContainingClass());
			Command command = SetCommand.create(myEditingDomain, style, feature, value);
			cc.append(command);
		}
		if (cc.canExecute()) {
			myCommandStack.execute(new WrappingCommand(myEditingDomain, cc));
		}
	}

	private static String[] getFontFamilyNames() {
		if (FONT_FAMILY_NAMES == null) {
			FontData[] fontFamilies = Display.getDefault().getFontList(null, true);
			Set<String> fontFamilyNames = new HashSet<String>(fontFamilies.length * 3/2);
			for (FontData next : fontFamilies) {
				fontFamilyNames.add(next.getName());
			}
			fontFamilyNames.remove(null);	//in case it was there
			fontFamilyNames.add("");	//$NON-NLS-1$	//to denote the default font
			FONT_FAMILY_NAMES = fontFamilyNames.toArray(new String[fontFamilyNames.size()]);
			Arrays.sort(FONT_FAMILY_NAMES);
			
		}
		return FONT_FAMILY_NAMES;
	}

	private static String[] FONT_FAMILY_NAMES;

	private static String[] getFontSizes() {
		return FONT_SIZES;
	}

	private static final String[] FONT_SIZES = new String[] {
		String.valueOf(8), 
		String.valueOf(9), 
		String.valueOf(10), 
		String.valueOf(11), 
		String.valueOf(12), 
		String.valueOf(14), 
		String.valueOf(16), 
		String.valueOf(18), 
		String.valueOf(20), 
		String.valueOf(22), 
		String.valueOf(24), 
		String.valueOf(26), 
		String.valueOf(28), 
		String.valueOf(36), 
		String.valueOf(48), 
		String.valueOf(72), 
	};

	protected static interface IValueConverter<E> {
		E convertFromStyleValue(Object styleValue);
		Object convertToStyleValue(E literalValue);
	}

	private static final IValueConverter<Boolean> TO_BOOLEAN_CONVERTER = new IValueConverter<Boolean>() {
		public Boolean convertFromStyleValue(Object value) {
			return value instanceof Boolean ? (Boolean) value : Boolean.FALSE;
		}
		public Object convertToStyleValue(Boolean literalValue) {
			return literalValue;
		}
	};

	private static final IValueConverter<RGB> TO_RGB_CONVERTER = new IValueConverter<RGB>() {
		public RGB convertFromStyleValue(Object styleValue) {
			int value = ((Integer) styleValue).intValue();
			return new RGB((value & 0x000000FF), (value & 0x0000FF00) >> 8, (value & 0x00FF0000) >> 16);
		}
		public Object convertToStyleValue(RGB rgb) {
			return new Integer((rgb.blue << 16) | (rgb.green << 8) | rgb.red);
		}
	};

	private static final IValueConverter<String> FROM_INT_CONVERTER = new IValueConverter<String>() {
		public String convertFromStyleValue(Object styleValue) {
			if (styleValue == null) {
				return null;
			}
			return String.valueOf(styleValue);
		}
		public Object convertToStyleValue(String literalValue) {
			if (literalValue == null) {
				return null;
			}
			return Integer.parseInt(literalValue);
		}
	};

	private static final IValueConverter<String> ID_CONVERTER = new IValueConverter<String>() {
		public String convertFromStyleValue(Object styleValue) {
			return (String) styleValue;
		}
		public Object convertToStyleValue(String literalValue) {
			return literalValue;
		}
	};

	/**
	 * Image descriptor which draws a uniform color underneath the lower portion of the given image.
	 * <p>This class is a copy of org.eclipse.gmf.runtime.diagram.ui.properties.sections.appearance.ColorsAndFontsPropertySection.ColorOverlayImageDescriptor with little modification.
	 */
	protected static class ColorOverlayImageDescriptor extends CompositeImageDescriptor {
		private final ImageData myOriginal;
		private final RGB mySubstrate;
		private final Point mySize;

		public ColorOverlayImageDescriptor(ImageData original, RGB substrate) {
			myOriginal = original;
			mySubstrate = substrate;
			mySize = new Point(myOriginal.width, myOriginal.height);
		}
		@Override
		protected Point getSize() {
			return mySize;
		}
		@Override
		protected void drawCompositeImage(int width, int height) {
			ImageData substrate = new ImageData(width, height/5, 1, new PaletteData(new RGB[] {mySubstrate}));
			drawImage(substrate, 0, height - substrate.height);
			drawImage(myOriginal, 0, 0);
		}
	}
}

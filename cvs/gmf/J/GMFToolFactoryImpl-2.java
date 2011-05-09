/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.tooldef.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.gmf.tooldef.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GMFToolFactoryImpl extends EFactoryImpl implements GMFToolFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GMFToolFactory init() {
		try {
			GMFToolFactory theGMFToolFactory = (GMFToolFactory) EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/gmf/2005/ToolDefinition");
			if (theGMFToolFactory != null) {
				return theGMFToolFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GMFToolFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFToolFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case GMFToolPackage.TOOL_REGISTRY:
			return createToolRegistry();
		case GMFToolPackage.PALETTE_SEPARATOR:
			return createPaletteSeparator();
		case GMFToolPackage.TOOL_GROUP:
			return createToolGroup();
		case GMFToolPackage.PALETTE:
			return createPalette();
		case GMFToolPackage.STANDARD_TOOL:
			return createStandardTool();
		case GMFToolPackage.CREATION_TOOL:
			return createCreationTool();
		case GMFToolPackage.GENERIC_TOOL:
			return createGenericTool();
		case GMFToolPackage.SEPARATOR:
			return createSeparator();
		case GMFToolPackage.PREDEFINED_ITEM:
			return createPredefinedItem();
		case GMFToolPackage.PREDEFINED_MENU:
			return createPredefinedMenu();
		case GMFToolPackage.MENU_ACTION:
			return createMenuAction();
		case GMFToolPackage.ITEM_REF:
			return createItemRef();
		case GMFToolPackage.CONTEXT_MENU:
			return createContextMenu();
		case GMFToolPackage.POPUP_MENU:
			return createPopupMenu();
		case GMFToolPackage.MAIN_MENU:
			return createMainMenu();
		case GMFToolPackage.TOOLBAR:
			return createToolbar();
		case GMFToolPackage.DEFAULT_IMAGE:
			return createDefaultImage();
		case GMFToolPackage.BUNDLE_IMAGE:
			return createBundleImage();
		case GMFToolPackage.GENERIC_STYLE_SELECTOR:
			return createGenericStyleSelector();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case GMFToolPackage.STANDARD_TOOL_KIND:
			return createStandardToolKindFromString(eDataType, initialValue);
		case GMFToolPackage.ACTION_KIND:
			return createActionKindFromString(eDataType, initialValue);
		case GMFToolPackage.APPEARANCE_STYLE:
			return createAppearanceStyleFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case GMFToolPackage.STANDARD_TOOL_KIND:
			return convertStandardToolKindToString(eDataType, instanceValue);
		case GMFToolPackage.ACTION_KIND:
			return convertActionKindToString(eDataType, instanceValue);
		case GMFToolPackage.APPEARANCE_STYLE:
			return convertAppearanceStyleToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolRegistry createToolRegistry() {
		ToolRegistryImpl toolRegistry = new ToolRegistryImpl();
		return toolRegistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaletteSeparator createPaletteSeparator() {
		PaletteSeparatorImpl paletteSeparator = new PaletteSeparatorImpl();
		return paletteSeparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolGroup createToolGroup() {
		ToolGroupImpl toolGroup = new ToolGroupImpl();
		return toolGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Palette createPalette() {
		PaletteImpl palette = new PaletteImpl();
		return palette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardTool createStandardTool() {
		StandardToolImpl standardTool = new StandardToolImpl();
		return standardTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreationTool createCreationTool() {
		CreationToolImpl creationTool = new CreationToolImpl();
		return creationTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericTool createGenericTool() {
		GenericToolImpl genericTool = new GenericToolImpl();
		return genericTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Separator createSeparator() {
		SeparatorImpl separator = new SeparatorImpl();
		return separator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredefinedItem createPredefinedItem() {
		PredefinedItemImpl predefinedItem = new PredefinedItemImpl();
		return predefinedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredefinedMenu createPredefinedMenu() {
		PredefinedMenuImpl predefinedMenu = new PredefinedMenuImpl();
		return predefinedMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuAction createMenuAction() {
		MenuActionImpl menuAction = new MenuActionImpl();
		return menuAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemRef createItemRef() {
		ItemRefImpl itemRef = new ItemRefImpl();
		return itemRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextMenu createContextMenu() {
		ContextMenuImpl contextMenu = new ContextMenuImpl();
		return contextMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopupMenu createPopupMenu() {
		PopupMenuImpl popupMenu = new PopupMenuImpl();
		return popupMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainMenu createMainMenu() {
		MainMenuImpl mainMenu = new MainMenuImpl();
		return mainMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Toolbar createToolbar() {
		ToolbarImpl toolbar = new ToolbarImpl();
		return toolbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultImage createDefaultImage() {
		DefaultImageImpl defaultImage = new DefaultImageImpl();
		return defaultImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleImage createBundleImage() {
		BundleImageImpl bundleImage = new BundleImageImpl();
		return bundleImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericStyleSelector createGenericStyleSelector() {
		GenericStyleSelectorImpl genericStyleSelector = new GenericStyleSelectorImpl();
		return genericStyleSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardToolKind createStandardToolKindFromString(EDataType eDataType, String initialValue) {
		StandardToolKind result = StandardToolKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStandardToolKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionKind createActionKindFromString(EDataType eDataType, String initialValue) {
		ActionKind result = ActionKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppearanceStyle createAppearanceStyleFromString(EDataType eDataType, String initialValue) {
		AppearanceStyle result = AppearanceStyle.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAppearanceStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFToolPackage getGMFToolPackage() {
		return (GMFToolPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static GMFToolPackage getPackage() {
		return GMFToolPackage.eINSTANCE;
	}

} //GMFToolFactoryImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.tooldef.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gmf.tooldef.AbstractTool;
import org.eclipse.gmf.tooldef.ActionKind;
import org.eclipse.gmf.tooldef.AppearanceStyle;
import org.eclipse.gmf.tooldef.BundleImage;
import org.eclipse.gmf.tooldef.ContextMenu;
import org.eclipse.gmf.tooldef.ContributionItem;
import org.eclipse.gmf.tooldef.CreationTool;
import org.eclipse.gmf.tooldef.DefaultImage;
import org.eclipse.gmf.tooldef.GMFToolFactory;
import org.eclipse.gmf.tooldef.GMFToolPackage;
import org.eclipse.gmf.tooldef.GenericStyleSelector;
import org.eclipse.gmf.tooldef.GenericTool;
import org.eclipse.gmf.tooldef.Image;
import org.eclipse.gmf.tooldef.ItemBase;
import org.eclipse.gmf.tooldef.ItemRef;
import org.eclipse.gmf.tooldef.MainMenu;
import org.eclipse.gmf.tooldef.Menu;
import org.eclipse.gmf.tooldef.MenuAction;
import org.eclipse.gmf.tooldef.Palette;
import org.eclipse.gmf.tooldef.PaletteSeparator;
import org.eclipse.gmf.tooldef.PopupMenu;
import org.eclipse.gmf.tooldef.PredefinedItem;
import org.eclipse.gmf.tooldef.PredefinedMenu;
import org.eclipse.gmf.tooldef.Separator;
import org.eclipse.gmf.tooldef.StandardTool;
import org.eclipse.gmf.tooldef.StandardToolKind;
import org.eclipse.gmf.tooldef.StyleSelector;
import org.eclipse.gmf.tooldef.ToolContainer;
import org.eclipse.gmf.tooldef.ToolGroup;
import org.eclipse.gmf.tooldef.ToolRegistry;
import org.eclipse.gmf.tooldef.Toolbar;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GMFToolPackageImpl extends EPackageImpl implements GMFToolPackage {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paletteSeparatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paletteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creationToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass separatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predefinedItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predefinedMenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contributionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextMenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass popupMenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainMenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolbarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericStyleSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum standardToolKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum appearanceStyleEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.gmf.tooldef.GMFToolPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GMFToolPackageImpl() {
		super(eNS_URI, GMFToolFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GMFToolPackage init() {
		if (isInited)
			return (GMFToolPackage) EPackage.Registry.INSTANCE.getEPackage(GMFToolPackage.eNS_URI);

		// Obtain or create and register package
		GMFToolPackageImpl theGMFToolPackage = (GMFToolPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof GMFToolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI)
				: new GMFToolPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGMFToolPackage.createPackageContents();

		// Initialize created meta-data
		theGMFToolPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGMFToolPackage.freeze();

		return theGMFToolPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolRegistry() {
		return toolRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolRegistry_SharedActions() {
		return (EReference) toolRegistryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolRegistry_AllMenus() {
		return (EReference) toolRegistryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolRegistry_Palette() {
		return (EReference) toolRegistryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTool() {
		return abstractToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTool_SmallIcon() {
		return (EReference) abstractToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTool_LargeIcon() {
		return (EReference) abstractToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTool_Title() {
		return (EAttribute) abstractToolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTool_Description() {
		return (EAttribute) abstractToolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolContainer() {
		return toolContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolContainer_Tools() {
		return (EReference) toolContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaletteSeparator() {
		return paletteSeparatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolGroup() {
		return toolGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolGroup_Collapsible() {
		return (EAttribute) toolGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolGroup_Stack() {
		return (EAttribute) toolGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolGroup_Active() {
		return (EReference) toolGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPalette() {
		return paletteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPalette_Default() {
		return (EReference) paletteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardTool() {
		return standardToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardTool_ToolKind() {
		return (EAttribute) standardToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreationTool() {
		return creationToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericTool() {
		return genericToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericTool_ToolClass() {
		return (EAttribute) genericToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemBase() {
		return itemBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenu() {
		return menuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenu_Items() {
		return (EReference) menuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeparator() {
		return separatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeparator_Name() {
		return (EAttribute) separatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredefinedItem() {
		return predefinedItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredefinedItem_Identifier() {
		return (EAttribute) predefinedItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredefinedMenu() {
		return predefinedMenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContributionItem() {
		return contributionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContributionItem_Icon() {
		return (EReference) contributionItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContributionItem_Title() {
		return (EAttribute) contributionItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenuAction() {
		return menuActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenuAction_Kind() {
		return (EAttribute) menuActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenuAction_HotKey() {
		return (EAttribute) menuActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemRef() {
		return itemRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemRef_Item() {
		return (EReference) itemRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextMenu() {
		return contextMenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextMenu_Default() {
		return (EReference) contextMenuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPopupMenu() {
		return popupMenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPopupMenu_ID() {
		return (EAttribute) popupMenuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainMenu() {
		return mainMenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMainMenu_Title() {
		return (EAttribute) mainMenuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolbar() {
		return toolbarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultImage() {
		return defaultImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleImage() {
		return bundleImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBundleImage_Path() {
		return (EAttribute) bundleImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBundleImage_Bundle() {
		return (EAttribute) bundleImageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleSelector() {
		return styleSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericStyleSelector() {
		return genericStyleSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericStyleSelector_Values() {
		return (EAttribute) genericStyleSelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStandardToolKind() {
		return standardToolKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActionKind() {
		return actionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAppearanceStyle() {
		return appearanceStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFToolFactory getGMFToolFactory() {
		return (GMFToolFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		toolRegistryEClass = createEClass(TOOL_REGISTRY);
		createEReference(toolRegistryEClass, TOOL_REGISTRY__SHARED_ACTIONS);
		createEReference(toolRegistryEClass, TOOL_REGISTRY__ALL_MENUS);
		createEReference(toolRegistryEClass, TOOL_REGISTRY__PALETTE);

		abstractToolEClass = createEClass(ABSTRACT_TOOL);
		createEReference(abstractToolEClass, ABSTRACT_TOOL__SMALL_ICON);
		createEReference(abstractToolEClass, ABSTRACT_TOOL__LARGE_ICON);
		createEAttribute(abstractToolEClass, ABSTRACT_TOOL__TITLE);
		createEAttribute(abstractToolEClass, ABSTRACT_TOOL__DESCRIPTION);

		toolContainerEClass = createEClass(TOOL_CONTAINER);
		createEReference(toolContainerEClass, TOOL_CONTAINER__TOOLS);

		paletteSeparatorEClass = createEClass(PALETTE_SEPARATOR);

		toolGroupEClass = createEClass(TOOL_GROUP);
		createEAttribute(toolGroupEClass, TOOL_GROUP__COLLAPSIBLE);
		createEAttribute(toolGroupEClass, TOOL_GROUP__STACK);
		createEReference(toolGroupEClass, TOOL_GROUP__ACTIVE);

		paletteEClass = createEClass(PALETTE);
		createEReference(paletteEClass, PALETTE__DEFAULT);

		standardToolEClass = createEClass(STANDARD_TOOL);
		createEAttribute(standardToolEClass, STANDARD_TOOL__TOOL_KIND);

		creationToolEClass = createEClass(CREATION_TOOL);

		genericToolEClass = createEClass(GENERIC_TOOL);
		createEAttribute(genericToolEClass, GENERIC_TOOL__TOOL_CLASS);

		itemBaseEClass = createEClass(ITEM_BASE);

		menuEClass = createEClass(MENU);
		createEReference(menuEClass, MENU__ITEMS);

		separatorEClass = createEClass(SEPARATOR);
		createEAttribute(separatorEClass, SEPARATOR__NAME);

		predefinedItemEClass = createEClass(PREDEFINED_ITEM);
		createEAttribute(predefinedItemEClass, PREDEFINED_ITEM__IDENTIFIER);

		predefinedMenuEClass = createEClass(PREDEFINED_MENU);

		contributionItemEClass = createEClass(CONTRIBUTION_ITEM);
		createEReference(contributionItemEClass, CONTRIBUTION_ITEM__ICON);
		createEAttribute(contributionItemEClass, CONTRIBUTION_ITEM__TITLE);

		menuActionEClass = createEClass(MENU_ACTION);
		createEAttribute(menuActionEClass, MENU_ACTION__KIND);
		createEAttribute(menuActionEClass, MENU_ACTION__HOT_KEY);

		itemRefEClass = createEClass(ITEM_REF);
		createEReference(itemRefEClass, ITEM_REF__ITEM);

		contextMenuEClass = createEClass(CONTEXT_MENU);
		createEReference(contextMenuEClass, CONTEXT_MENU__DEFAULT);

		popupMenuEClass = createEClass(POPUP_MENU);
		createEAttribute(popupMenuEClass, POPUP_MENU__ID);

		mainMenuEClass = createEClass(MAIN_MENU);
		createEAttribute(mainMenuEClass, MAIN_MENU__TITLE);

		toolbarEClass = createEClass(TOOLBAR);

		imageEClass = createEClass(IMAGE);

		defaultImageEClass = createEClass(DEFAULT_IMAGE);

		bundleImageEClass = createEClass(BUNDLE_IMAGE);
		createEAttribute(bundleImageEClass, BUNDLE_IMAGE__PATH);
		createEAttribute(bundleImageEClass, BUNDLE_IMAGE__BUNDLE);

		styleSelectorEClass = createEClass(STYLE_SELECTOR);

		genericStyleSelectorEClass = createEClass(GENERIC_STYLE_SELECTOR);
		createEAttribute(genericStyleSelectorEClass, GENERIC_STYLE_SELECTOR__VALUES);

		// Create enums
		standardToolKindEEnum = createEEnum(STANDARD_TOOL_KIND);
		actionKindEEnum = createEEnum(ACTION_KIND);
		appearanceStyleEEnum = createEEnum(APPEARANCE_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		toolContainerEClass.getESuperTypes().add(this.getAbstractTool());
		paletteSeparatorEClass.getESuperTypes().add(this.getAbstractTool());
		toolGroupEClass.getESuperTypes().add(this.getToolContainer());
		paletteEClass.getESuperTypes().add(this.getToolContainer());
		standardToolEClass.getESuperTypes().add(this.getAbstractTool());
		creationToolEClass.getESuperTypes().add(this.getAbstractTool());
		genericToolEClass.getESuperTypes().add(this.getAbstractTool());
		separatorEClass.getESuperTypes().add(this.getItemBase());
		predefinedItemEClass.getESuperTypes().add(this.getItemBase());
		predefinedMenuEClass.getESuperTypes().add(this.getMenu());
		predefinedMenuEClass.getESuperTypes().add(this.getPredefinedItem());
		contributionItemEClass.getESuperTypes().add(this.getItemBase());
		menuActionEClass.getESuperTypes().add(this.getContributionItem());
		itemRefEClass.getESuperTypes().add(this.getItemBase());
		contextMenuEClass.getESuperTypes().add(this.getMenu());
		popupMenuEClass.getESuperTypes().add(this.getMenu());
		popupMenuEClass.getESuperTypes().add(this.getContributionItem());
		mainMenuEClass.getESuperTypes().add(this.getMenu());
		toolbarEClass.getESuperTypes().add(this.getMenu());
		defaultImageEClass.getESuperTypes().add(this.getImage());
		bundleImageEClass.getESuperTypes().add(this.getImage());
		genericStyleSelectorEClass.getESuperTypes().add(this.getStyleSelector());

		// Initialize classes and features; add operations and parameters
		initEClass(toolRegistryEClass, ToolRegistry.class, "ToolRegistry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToolRegistry_SharedActions(), this.getMenuAction(), null, "sharedActions", null, 0, -1, ToolRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolRegistry_AllMenus(), this.getMenu(), null, "allMenus", null, 0, -1, ToolRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolRegistry_Palette(), this.getPalette(), null, "palette", null, 0, 1, ToolRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractToolEClass, AbstractTool.class, "AbstractTool", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractTool_SmallIcon(), this.getImage(), null, "smallIcon", null, 0, 1, AbstractTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTool_LargeIcon(), this.getImage(), null, "largeIcon", null, 0, 1, AbstractTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTool_Title(), ecorePackage.getEString(), "title", null, 0, 1, AbstractTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTool_Description(), ecorePackage.getEString(), "description", null, 0, 1, AbstractTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolContainerEClass, ToolContainer.class, "ToolContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToolContainer_Tools(), this.getAbstractTool(), null, "tools", null, 0, -1, ToolContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paletteSeparatorEClass, PaletteSeparator.class, "PaletteSeparator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(toolGroupEClass, ToolGroup.class, "ToolGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToolGroup_Collapsible(), ecorePackage.getEBoolean(), "collapsible", null, 0, 1, ToolGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolGroup_Stack(), ecorePackage.getEBoolean(), "stack", null, 0, 1, ToolGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getToolGroup_Active(), this.getAbstractTool(), null, "active", null, 0, 1, ToolGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paletteEClass, Palette.class, "Palette", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPalette_Default(), this.getAbstractTool(), null, "default", null, 0, 1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(standardToolEClass, StandardTool.class, "StandardTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStandardTool_ToolKind(), this.getStandardToolKind(), "toolKind", null, 0, 1, StandardTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(creationToolEClass, CreationTool.class, "CreationTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genericToolEClass, GenericTool.class, "GenericTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericTool_ToolClass(), ecorePackage.getEString(), "toolClass", null, 1, 1, GenericTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemBaseEClass, ItemBase.class, "ItemBase", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(menuEClass, Menu.class, "Menu", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenu_Items(), this.getItemBase(), null, "items", null, 0, -1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(separatorEClass, Separator.class, "Separator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeparator_Name(), ecorePackage.getEString(), "name", null, 0, 1, Separator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(predefinedItemEClass, PredefinedItem.class, "PredefinedItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPredefinedItem_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, PredefinedItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predefinedMenuEClass, PredefinedMenu.class, "PredefinedMenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contributionItemEClass, ContributionItem.class, "ContributionItem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContributionItem_Icon(), this.getImage(), null, "icon", null, 0, 1, ContributionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContributionItem_Title(), ecorePackage.getEString(), "title", null, 0, 1, ContributionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuActionEClass, MenuAction.class, "MenuAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMenuAction_Kind(), this.getActionKind(), "kind", null, 0, 1, MenuAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMenuAction_HotKey(), ecorePackage.getEString(), "hotKey", null, 0, 1, MenuAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(itemRefEClass, ItemRef.class, "ItemRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemRef_Item(), this.getItemBase(), null, "item", null, 1, 1, ItemRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextMenuEClass, ContextMenu.class, "ContextMenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextMenu_Default(), this.getMenuAction(), null, "default", null, 0, 1, ContextMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(popupMenuEClass, PopupMenu.class, "PopupMenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPopupMenu_ID(), ecorePackage.getEString(), "iD", null, 0, 1, PopupMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(mainMenuEClass, MainMenu.class, "MainMenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMainMenu_Title(), ecorePackage.getEString(), "title", null, 0, 1, MainMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(toolbarEClass, Toolbar.class, "Toolbar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(imageEClass, Image.class, "Image", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(defaultImageEClass, DefaultImage.class, "DefaultImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bundleImageEClass, BundleImage.class, "BundleImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBundleImage_Path(), ecorePackage.getEString(), "path", null, 0, 1, BundleImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBundleImage_Bundle(), ecorePackage.getEString(), "bundle", null, 0, 1, BundleImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(styleSelectorEClass, StyleSelector.class, "StyleSelector", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(styleSelectorEClass, ecorePackage.getEBoolean(), "isOk", 0, 1);
		addEParameter(op, ecorePackage.getEJavaObject(), "style", 0, 1);

		initEClass(genericStyleSelectorEClass, GenericStyleSelector.class, "GenericStyleSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericStyleSelector_Values(), this.getAppearanceStyle(), "values", null, 1, -1, GenericStyleSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(standardToolKindEEnum, StandardToolKind.class, "StandardToolKind");
		addEEnumLiteral(standardToolKindEEnum, StandardToolKind.SELECT_LITERAL);
		addEEnumLiteral(standardToolKindEEnum, StandardToolKind.SELECT_PAN_LITERAL);
		addEEnumLiteral(standardToolKindEEnum, StandardToolKind.MARQUEE_LITERAL);
		addEEnumLiteral(standardToolKindEEnum, StandardToolKind.ZOOM_PAN_LITERAL);
		addEEnumLiteral(standardToolKindEEnum, StandardToolKind.ZOOM_IN_LITERAL);
		addEEnumLiteral(standardToolKindEEnum, StandardToolKind.ZOOM_OUT_LITERAL);

		initEEnum(actionKindEEnum, ActionKind.class, "ActionKind");
		addEEnumLiteral(actionKindEEnum, ActionKind.CREATE_LITERAL);
		addEEnumLiteral(actionKindEEnum, ActionKind.PROPCHANGE_LITERAL);
		addEEnumLiteral(actionKindEEnum, ActionKind.MODIFY_LITERAL);
		addEEnumLiteral(actionKindEEnum, ActionKind.PROCESS_LITERAL);
		addEEnumLiteral(actionKindEEnum, ActionKind.CUSTOM_LITERAL);

		initEEnum(appearanceStyleEEnum, AppearanceStyle.class, "AppearanceStyle");
		addEEnumLiteral(appearanceStyleEEnum, AppearanceStyle.FONT_LITERAL);
		addEEnumLiteral(appearanceStyleEEnum, AppearanceStyle.FILL_LITERAL);
		addEEnumLiteral(appearanceStyleEEnum, AppearanceStyle.LINE_LITERAL);

		// Create resource
		createResource(eNS_URI);
	}

} //GMFToolPackageImpl

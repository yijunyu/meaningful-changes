/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.tooldef;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.tooldef.GMFToolFactory
 * @model kind="package"
 * @generated
 */
public interface GMFToolPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tooldef";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/gmf/2005/ToolDefinition";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gmftool";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GMFToolPackage eINSTANCE = org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.impl.ToolRegistryImpl <em>Tool Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.impl.ToolRegistryImpl
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getToolRegistry()
	 * @generated
	 */
	int TOOL_REGISTRY = 0;

	/**
	 * The feature id for the '<em><b>Shared Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_REGISTRY__SHARED_ACTIONS = 0;

	/**
	 * The feature id for the '<em><b>All Menus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_REGISTRY__ALL_MENUS = 1;

	/**
	 * The feature id for the '<em><b>Palette</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_REGISTRY__PALETTE = 2;

	/**
	 * The number of structural features of the '<em>Tool Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_REGISTRY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.impl.AbstractToolImpl <em>Abstract Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.impl.AbstractToolImpl
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getAbstractTool()
	 * @generated
	 */
	int ABSTRACT_TOOL = 1;

	/**
	 * The feature id for the '<em><b>Small Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__SMALL_ICON = 0;

	/**
	 * The feature id for the '<em><b>Large Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__LARGE_ICON = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Abstract Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.impl.ToolContainerImpl <em>Tool Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.impl.ToolContainerImpl
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getToolContainer()
	 * @generated
	 */
	int TOOL_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Small Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_CONTAINER__SMALL_ICON = ABSTRACT_TOOL__SMALL_ICON;

	/**
	 * The feature id for the '<em><b>Large Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_CONTAINER__LARGE_ICON = ABSTRACT_TOOL__LARGE_ICON;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_CONTAINER__TITLE = ABSTRACT_TOOL__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_CONTAINER__DESCRIPTION = ABSTRACT_TOOL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_CONTAINER__TOOLS = ABSTRACT_TOOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tool Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_CONTAINER_FEATURE_COUNT = ABSTRACT_TOOL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.impl.PaletteSeparatorImpl <em>Palette Separator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.impl.PaletteSeparatorImpl
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getPaletteSeparator()
	 * @generated
	 */
	int PALETTE_SEPARATOR = 3;

	/**
	 * The feature id for the '<em><b>Small Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_SEPARATOR__SMALL_ICON = ABSTRACT_TOOL__SMALL_ICON;

	/**
	 * The feature id for the '<em><b>Large Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_SEPARATOR__LARGE_ICON = ABSTRACT_TOOL__LARGE_ICON;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_SEPARATOR__TITLE = ABSTRACT_TOOL__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_SEPARATOR__DESCRIPTION = ABSTRACT_TOOL__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Palette Separator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_SEPARATOR_FEATURE_COUNT = ABSTRACT_TOOL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.impl.ToolGroupImpl <em>Tool Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.impl.ToolGroupImpl
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getToolGroup()
	 * @generated
	 */
	int TOOL_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Small Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__SMALL_ICON = TOOL_CONTAINER__SMALL_ICON;

	/**
	 * The feature id for the '<em><b>Large Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__LARGE_ICON = TOOL_CONTAINER__LARGE_ICON;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__TITLE = TOOL_CONTAINER__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__DESCRIPTION = TOOL_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__TOOLS = TOOL_CONTAINER__TOOLS;

	/**
	 * The feature id for the '<em><b>Collapsible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__COLLAPSIBLE = TOOL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Active</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__ACTIVE = TOOL_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tool Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP_FEATURE_COUNT = TOOL_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.impl.PaletteImpl <em>Palette</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.impl.PaletteImpl
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getPalette()
	 * @generated
	 */
	int PALETTE = 5;

	/**
	 * The feature id for the '<em><b>Small Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE__SMALL_ICON = TOOL_CONTAINER__SMALL_ICON;

	/**
	 * The feature id for the '<em><b>Large Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE__LARGE_ICON = TOOL_CONTAINER__LARGE_ICON;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE__TITLE = TOOL_CONTAINER__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE__DESCRIPTION = TOOL_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE__TOOLS = TOOL_CONTAINER__TOOLS;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE__DEFAULT = TOOL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Palette</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_FEATURE_COUNT = TOOL_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.impl.StandardToolImpl <em>Standard Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.impl.StandardToolImpl
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getStandardTool()
	 * @generated
	 */
	int STANDARD_TOOL = 6;

	/**
	 * The feature id for the '<em><b>Small Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TOOL__SMALL_ICON = ABSTRACT_TOOL__SMALL_ICON;

	/**
	 * The feature id for the '<em><b>Large Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TOOL__LARGE_ICON = ABSTRACT_TOOL__LARGE_ICON;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TOOL__TITLE = ABSTRACT_TOOL__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TOOL__DESCRIPTION = ABSTRACT_TOOL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Tool Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TOOL__TOOL_KIND = ABSTRACT_TOOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Standard Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TOOL_FEATURE_COUNT = ABSTRACT_TOOL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.impl.CreationToolImpl <em>Creation Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.impl.CreationToolImpl
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getCreationTool()
	 * @generated
	 */
	int CREATION_TOOL = 7;

	/**
	 * The feature id for the '<em><b>Small Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_TOOL__SMALL_ICON = ABSTRACT_TOOL__SMALL_ICON;

	/**
	 * The feature id for the '<em><b>Large Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_TOOL__LARGE_ICON = ABSTRACT_TOOL__LARGE_ICON;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_TOOL__TITLE = ABSTRACT_TOOL__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_TOOL__DESCRIPTION = ABSTRACT_TOOL__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Creation Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_TOOL_FEATURE_COUNT = ABSTRACT_TOOL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.impl.GenericToolImpl <em>Generic Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.impl.GenericToolImpl
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getGenericTool()
	 * @generated
	 */
	int GENERIC_TOOL = 8;

	/**
	 * The feature id for the '<em><b>Small Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TOOL__SMALL_ICON = ABSTRACT_TOOL__SMALL_ICON;

	/**
	 * The feature id for the '<em><b>Large Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TOOL__LARGE_ICON = ABSTRACT_TOOL__LARGE_ICON;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TOOL__TITLE = ABSTRACT_TOOL__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TOOL__DESCRIPTION = ABSTRACT_TOOL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Tool Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TOOL__TOOL_CLASS = ABSTRACT_TOOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generic Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TOOL_FEATURE_COUNT = ABSTRACT_TOOL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.ItemBase <em>Item Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.ItemBase
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getItemBase()
	 * @generated
	 */
	int ITEM_BASE = 9;

	/**
	 * The number of structural features of the '<em>Item Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_BASE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.impl.MenuImpl
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 10;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.impl.SeparatorImpl <em>Separator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.impl.SeparatorImpl
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getSeparator()
	 * @generated
	 */
	int SEPARATOR = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__NAME = ITEM_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Separator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR_FEATURE_COUNT = ITEM_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.impl.PredefinedItemImpl <em>Predefined Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.impl.PredefinedItemImpl
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getPredefinedItem()
	 * @generated
	 */
	int PREDEFINED_ITEM = 12;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_ITEM__IDENTIFIER = ITEM_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predefined Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_ITEM_FEATURE_COUNT = ITEM_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.impl.PredefinedMenuImpl <em>Predefined Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.impl.PredefinedMenuImpl
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getPredefinedMenu()
	 * @generated
	 */
	int PREDEFINED_MENU = 13;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_MENU__ITEMS = MENU__ITEMS;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_MENU__IDENTIFIER = MENU_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predefined Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_MENU_FEATURE_COUNT = MENU_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.ContributionItem <em>Contribution Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.ContributionItem
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getContributionItem()
	 * @generated
	 */
	int CONTRIBUTION_ITEM = 14;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_ITEM__ICON = ITEM_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_ITEM__TITLE = ITEM_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Contribution Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_ITEM_FEATURE_COUNT = ITEM_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.impl.MenuActionImpl <em>Menu Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.impl.MenuActionImpl
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getMenuAction()
	 * @generated
	 */
	int MENU_ACTION = 15;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ACTION__ICON = CONTRIBUTION_ITEM__ICON;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ACTION__TITLE = CONTRIBUTION_ITEM__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ACTION__KIND = CONTRIBUTION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hot Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ACTION__HOT_KEY = CONTRIBUTION_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Menu Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ACTION_FEATURE_COUNT = CONTRIBUTION_ITEM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.impl.ItemRefImpl <em>Item Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.impl.ItemRefImpl
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getItemRef()
	 * @generated
	 */
	int ITEM_REF = 16;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_REF__ITEM = ITEM_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Item Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_REF_FEATURE_COUNT = ITEM_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.impl.ContextMenuImpl <em>Context Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.impl.ContextMenuImpl
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getContextMenu()
	 * @generated
	 */
	int CONTEXT_MENU = 17;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MENU__ITEMS = MENU__ITEMS;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MENU__DEFAULT = MENU_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Context Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MENU_FEATURE_COUNT = MENU_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.impl.PopupMenuImpl <em>Popup Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.impl.PopupMenuImpl
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getPopupMenu()
	 * @generated
	 */
	int POPUP_MENU = 18;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_MENU__ITEMS = MENU__ITEMS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_MENU__ICON = MENU_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_MENU__TITLE = MENU_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_MENU__ID = MENU_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Popup Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_MENU_FEATURE_COUNT = MENU_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.impl.MainMenuImpl <em>Main Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.impl.MainMenuImpl
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getMainMenu()
	 * @generated
	 */
	int MAIN_MENU = 19;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_MENU__ITEMS = MENU__ITEMS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_MENU__TITLE = MENU_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Main Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_MENU_FEATURE_COUNT = MENU_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.impl.ToolbarImpl <em>Toolbar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.impl.ToolbarImpl
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getToolbar()
	 * @generated
	 */
	int TOOLBAR = 20;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR__ITEMS = MENU__ITEMS;

	/**
	 * The number of structural features of the '<em>Toolbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR_FEATURE_COUNT = MENU_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.Image <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.Image
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 21;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.impl.DefaultImageImpl <em>Default Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.impl.DefaultImageImpl
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getDefaultImage()
	 * @generated
	 */
	int DEFAULT_IMAGE = 22;

	/**
	 * The number of structural features of the '<em>Default Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_IMAGE_FEATURE_COUNT = IMAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.impl.BundleImageImpl <em>Bundle Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.impl.BundleImageImpl
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getBundleImage()
	 * @generated
	 */
	int BUNDLE_IMAGE = 23;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_IMAGE__PATH = IMAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bundle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_IMAGE__BUNDLE = IMAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bundle Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_IMAGE_FEATURE_COUNT = IMAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.StyleSelector <em>Style Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.StyleSelector
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getStyleSelector()
	 * @generated
	 */
	int STYLE_SELECTOR = 24;

	/**
	 * The number of structural features of the '<em>Style Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SELECTOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.impl.GenericStyleSelectorImpl <em>Generic Style Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.impl.GenericStyleSelectorImpl
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getGenericStyleSelector()
	 * @generated
	 */
	int GENERIC_STYLE_SELECTOR = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_STYLE_SELECTOR__VALUE = STYLE_SELECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generic Style Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_STYLE_SELECTOR_FEATURE_COUNT = STYLE_SELECTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.StandardToolKind <em>Standard Tool Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.StandardToolKind
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getStandardToolKind()
	 * @generated
	 */
	int STANDARD_TOOL_KIND = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.ActionKind <em>Action Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.ActionKind
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getActionKind()
	 * @generated
	 */
	int ACTION_KIND = 27;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.tooldef.AppearanceStyle <em>Appearance Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.tooldef.AppearanceStyle
	 * @see org.eclipse.gmf.tooldef.impl.GMFToolPackageImpl#getAppearanceStyle()
	 * @generated
	 */
	int APPEARANCE_STYLE = 28;

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.tooldef.ToolRegistry <em>Tool Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Registry</em>'.
	 * @see org.eclipse.gmf.tooldef.ToolRegistry
	 * @generated
	 */
	EClass getToolRegistry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.tooldef.ToolRegistry#getSharedActions <em>Shared Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shared Actions</em>'.
	 * @see org.eclipse.gmf.tooldef.ToolRegistry#getSharedActions()
	 * @see #getToolRegistry()
	 * @generated
	 */
	EReference getToolRegistry_SharedActions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.tooldef.ToolRegistry#getAllMenus <em>All Menus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Menus</em>'.
	 * @see org.eclipse.gmf.tooldef.ToolRegistry#getAllMenus()
	 * @see #getToolRegistry()
	 * @generated
	 */
	EReference getToolRegistry_AllMenus();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.tooldef.ToolRegistry#getPalette <em>Palette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Palette</em>'.
	 * @see org.eclipse.gmf.tooldef.ToolRegistry#getPalette()
	 * @see #getToolRegistry()
	 * @generated
	 */
	EReference getToolRegistry_Palette();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.tooldef.AbstractTool <em>Abstract Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Tool</em>'.
	 * @see org.eclipse.gmf.tooldef.AbstractTool
	 * @generated
	 */
	EClass getAbstractTool();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.tooldef.AbstractTool#getSmallIcon <em>Small Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Small Icon</em>'.
	 * @see org.eclipse.gmf.tooldef.AbstractTool#getSmallIcon()
	 * @see #getAbstractTool()
	 * @generated
	 */
	EReference getAbstractTool_SmallIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.tooldef.AbstractTool#getLargeIcon <em>Large Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Large Icon</em>'.
	 * @see org.eclipse.gmf.tooldef.AbstractTool#getLargeIcon()
	 * @see #getAbstractTool()
	 * @generated
	 */
	EReference getAbstractTool_LargeIcon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.tooldef.AbstractTool#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.gmf.tooldef.AbstractTool#getTitle()
	 * @see #getAbstractTool()
	 * @generated
	 */
	EAttribute getAbstractTool_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.tooldef.AbstractTool#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.gmf.tooldef.AbstractTool#getDescription()
	 * @see #getAbstractTool()
	 * @generated
	 */
	EAttribute getAbstractTool_Description();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.tooldef.ToolContainer <em>Tool Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Container</em>'.
	 * @see org.eclipse.gmf.tooldef.ToolContainer
	 * @generated
	 */
	EClass getToolContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.tooldef.ToolContainer#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tools</em>'.
	 * @see org.eclipse.gmf.tooldef.ToolContainer#getTools()
	 * @see #getToolContainer()
	 * @generated
	 */
	EReference getToolContainer_Tools();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.tooldef.PaletteSeparator <em>Palette Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Palette Separator</em>'.
	 * @see org.eclipse.gmf.tooldef.PaletteSeparator
	 * @generated
	 */
	EClass getPaletteSeparator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.tooldef.ToolGroup <em>Tool Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Group</em>'.
	 * @see org.eclipse.gmf.tooldef.ToolGroup
	 * @generated
	 */
	EClass getToolGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.tooldef.ToolGroup#isCollapsible <em>Collapsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collapsible</em>'.
	 * @see org.eclipse.gmf.tooldef.ToolGroup#isCollapsible()
	 * @see #getToolGroup()
	 * @generated
	 */
	EAttribute getToolGroup_Collapsible();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.tooldef.ToolGroup#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active</em>'.
	 * @see org.eclipse.gmf.tooldef.ToolGroup#getActive()
	 * @see #getToolGroup()
	 * @generated
	 */
	EReference getToolGroup_Active();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.tooldef.Palette <em>Palette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Palette</em>'.
	 * @see org.eclipse.gmf.tooldef.Palette
	 * @generated
	 */
	EClass getPalette();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.tooldef.Palette#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default</em>'.
	 * @see org.eclipse.gmf.tooldef.Palette#getDefault()
	 * @see #getPalette()
	 * @generated
	 */
	EReference getPalette_Default();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.tooldef.StandardTool <em>Standard Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Tool</em>'.
	 * @see org.eclipse.gmf.tooldef.StandardTool
	 * @generated
	 */
	EClass getStandardTool();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.tooldef.StandardTool#getToolKind <em>Tool Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool Kind</em>'.
	 * @see org.eclipse.gmf.tooldef.StandardTool#getToolKind()
	 * @see #getStandardTool()
	 * @generated
	 */
	EAttribute getStandardTool_ToolKind();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.tooldef.CreationTool <em>Creation Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creation Tool</em>'.
	 * @see org.eclipse.gmf.tooldef.CreationTool
	 * @generated
	 */
	EClass getCreationTool();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.tooldef.GenericTool <em>Generic Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Tool</em>'.
	 * @see org.eclipse.gmf.tooldef.GenericTool
	 * @generated
	 */
	EClass getGenericTool();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.tooldef.GenericTool#getToolClass <em>Tool Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool Class</em>'.
	 * @see org.eclipse.gmf.tooldef.GenericTool#getToolClass()
	 * @see #getGenericTool()
	 * @generated
	 */
	EAttribute getGenericTool_ToolClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.tooldef.ItemBase <em>Item Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Base</em>'.
	 * @see org.eclipse.gmf.tooldef.ItemBase
	 * @generated
	 */
	EClass getItemBase();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.tooldef.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see org.eclipse.gmf.tooldef.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.tooldef.Menu#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.eclipse.gmf.tooldef.Menu#getItems()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Items();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.tooldef.Separator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Separator</em>'.
	 * @see org.eclipse.gmf.tooldef.Separator
	 * @generated
	 */
	EClass getSeparator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.tooldef.Separator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmf.tooldef.Separator#getName()
	 * @see #getSeparator()
	 * @generated
	 */
	EAttribute getSeparator_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.tooldef.PredefinedItem <em>Predefined Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predefined Item</em>'.
	 * @see org.eclipse.gmf.tooldef.PredefinedItem
	 * @generated
	 */
	EClass getPredefinedItem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.tooldef.PredefinedItem#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.gmf.tooldef.PredefinedItem#getIdentifier()
	 * @see #getPredefinedItem()
	 * @generated
	 */
	EAttribute getPredefinedItem_Identifier();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.tooldef.PredefinedMenu <em>Predefined Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predefined Menu</em>'.
	 * @see org.eclipse.gmf.tooldef.PredefinedMenu
	 * @generated
	 */
	EClass getPredefinedMenu();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.tooldef.ContributionItem <em>Contribution Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contribution Item</em>'.
	 * @see org.eclipse.gmf.tooldef.ContributionItem
	 * @generated
	 */
	EClass getContributionItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.tooldef.ContributionItem#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see org.eclipse.gmf.tooldef.ContributionItem#getIcon()
	 * @see #getContributionItem()
	 * @generated
	 */
	EReference getContributionItem_Icon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.tooldef.ContributionItem#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.gmf.tooldef.ContributionItem#getTitle()
	 * @see #getContributionItem()
	 * @generated
	 */
	EAttribute getContributionItem_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.tooldef.MenuAction <em>Menu Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Action</em>'.
	 * @see org.eclipse.gmf.tooldef.MenuAction
	 * @generated
	 */
	EClass getMenuAction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.tooldef.MenuAction#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.gmf.tooldef.MenuAction#getKind()
	 * @see #getMenuAction()
	 * @generated
	 */
	EAttribute getMenuAction_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.tooldef.MenuAction#getHotKey <em>Hot Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hot Key</em>'.
	 * @see org.eclipse.gmf.tooldef.MenuAction#getHotKey()
	 * @see #getMenuAction()
	 * @generated
	 */
	EAttribute getMenuAction_HotKey();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.tooldef.ItemRef <em>Item Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Ref</em>'.
	 * @see org.eclipse.gmf.tooldef.ItemRef
	 * @generated
	 */
	EClass getItemRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.tooldef.ItemRef#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item</em>'.
	 * @see org.eclipse.gmf.tooldef.ItemRef#getItem()
	 * @see #getItemRef()
	 * @generated
	 */
	EReference getItemRef_Item();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.tooldef.ContextMenu <em>Context Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Menu</em>'.
	 * @see org.eclipse.gmf.tooldef.ContextMenu
	 * @generated
	 */
	EClass getContextMenu();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.tooldef.ContextMenu#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default</em>'.
	 * @see org.eclipse.gmf.tooldef.ContextMenu#getDefault()
	 * @see #getContextMenu()
	 * @generated
	 */
	EReference getContextMenu_Default();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.tooldef.PopupMenu <em>Popup Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Popup Menu</em>'.
	 * @see org.eclipse.gmf.tooldef.PopupMenu
	 * @generated
	 */
	EClass getPopupMenu();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.tooldef.PopupMenu#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.eclipse.gmf.tooldef.PopupMenu#getID()
	 * @see #getPopupMenu()
	 * @generated
	 */
	EAttribute getPopupMenu_ID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.tooldef.MainMenu <em>Main Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Menu</em>'.
	 * @see org.eclipse.gmf.tooldef.MainMenu
	 * @generated
	 */
	EClass getMainMenu();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.tooldef.MainMenu#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.gmf.tooldef.MainMenu#getTitle()
	 * @see #getMainMenu()
	 * @generated
	 */
	EAttribute getMainMenu_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.tooldef.Toolbar <em>Toolbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toolbar</em>'.
	 * @see org.eclipse.gmf.tooldef.Toolbar
	 * @generated
	 */
	EClass getToolbar();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.tooldef.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see org.eclipse.gmf.tooldef.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.tooldef.DefaultImage <em>Default Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Image</em>'.
	 * @see org.eclipse.gmf.tooldef.DefaultImage
	 * @generated
	 */
	EClass getDefaultImage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.tooldef.BundleImage <em>Bundle Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Image</em>'.
	 * @see org.eclipse.gmf.tooldef.BundleImage
	 * @generated
	 */
	EClass getBundleImage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.tooldef.BundleImage#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.eclipse.gmf.tooldef.BundleImage#getPath()
	 * @see #getBundleImage()
	 * @generated
	 */
	EAttribute getBundleImage_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.tooldef.BundleImage#getBundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bundle</em>'.
	 * @see org.eclipse.gmf.tooldef.BundleImage#getBundle()
	 * @see #getBundleImage()
	 * @generated
	 */
	EAttribute getBundleImage_Bundle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.tooldef.StyleSelector <em>Style Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Selector</em>'.
	 * @see org.eclipse.gmf.tooldef.StyleSelector
	 * @generated
	 */
	EClass getStyleSelector();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.tooldef.GenericStyleSelector <em>Generic Style Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Style Selector</em>'.
	 * @see org.eclipse.gmf.tooldef.GenericStyleSelector
	 * @generated
	 */
	EClass getGenericStyleSelector();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.tooldef.GenericStyleSelector#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.gmf.tooldef.GenericStyleSelector#getValue()
	 * @see #getGenericStyleSelector()
	 * @generated
	 */
	EAttribute getGenericStyleSelector_Value();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.tooldef.StandardToolKind <em>Standard Tool Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Standard Tool Kind</em>'.
	 * @see org.eclipse.gmf.tooldef.StandardToolKind
	 * @generated
	 */
	EEnum getStandardToolKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.tooldef.ActionKind <em>Action Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Kind</em>'.
	 * @see org.eclipse.gmf.tooldef.ActionKind
	 * @generated
	 */
	EEnum getActionKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.tooldef.AppearanceStyle <em>Appearance Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Appearance Style</em>'.
	 * @see org.eclipse.gmf.tooldef.AppearanceStyle
	 * @generated
	 */
	EEnum getAppearanceStyle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GMFToolFactory getGMFToolFactory();

} //GMFToolPackage

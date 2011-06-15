/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.tooldef;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.tooldef.GMFToolPackage
 * @generated
 */
public interface GMFToolFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GMFToolFactory eINSTANCE = org.eclipse.gmf.tooldef.impl.GMFToolFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tool Registry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool Registry</em>'.
	 * @generated
	 */
	ToolRegistry createToolRegistry();

	/**
	 * Returns a new object of class '<em>Palette Separator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Palette Separator</em>'.
	 * @generated
	 */
	PaletteSeparator createPaletteSeparator();

	/**
	 * Returns a new object of class '<em>Tool Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool Group</em>'.
	 * @generated
	 */
	ToolGroup createToolGroup();

	/**
	 * Returns a new object of class '<em>Palette</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Palette</em>'.
	 * @generated
	 */
	Palette createPalette();

	/**
	 * Returns a new object of class '<em>Standard Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Tool</em>'.
	 * @generated
	 */
	StandardTool createStandardTool();

	/**
	 * Returns a new object of class '<em>Creation Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Creation Tool</em>'.
	 * @generated
	 */
	CreationTool createCreationTool();

	/**
	 * Returns a new object of class '<em>Generic Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Tool</em>'.
	 * @generated
	 */
	GenericTool createGenericTool();

	/**
	 * Returns a new object of class '<em>Separator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Separator</em>'.
	 * @generated
	 */
	Separator createSeparator();

	/**
	 * Returns a new object of class '<em>Predefined Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predefined Item</em>'.
	 * @generated
	 */
	PredefinedItem createPredefinedItem();

	/**
	 * Returns a new object of class '<em>Predefined Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predefined Menu</em>'.
	 * @generated
	 */
	PredefinedMenu createPredefinedMenu();

	/**
	 * Returns a new object of class '<em>Menu Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Action</em>'.
	 * @generated
	 */
	MenuAction createMenuAction();

	/**
	 * Returns a new object of class '<em>Item Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Ref</em>'.
	 * @generated
	 */
	ItemRef createItemRef();

	/**
	 * Returns a new object of class '<em>Context Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Menu</em>'.
	 * @generated
	 */
	ContextMenu createContextMenu();

	/**
	 * Returns a new object of class '<em>Popup Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Popup Menu</em>'.
	 * @generated
	 */
	PopupMenu createPopupMenu();

	/**
	 * Returns a new object of class '<em>Main Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Main Menu</em>'.
	 * @generated
	 */
	MainMenu createMainMenu();

	/**
	 * Returns a new object of class '<em>Toolbar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Toolbar</em>'.
	 * @generated
	 */
	Toolbar createToolbar();

	/**
	 * Returns a new object of class '<em>Default Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Image</em>'.
	 * @generated
	 */
	DefaultImage createDefaultImage();

	/**
	 * Returns a new object of class '<em>Bundle Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Image</em>'.
	 * @generated
	 */
	BundleImage createBundleImage();

	/**
	 * Returns a new object of class '<em>Generic Style Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Style Selector</em>'.
	 * @generated
	 */
	GenericStyleSelector createGenericStyleSelector();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GMFToolPackage getGMFToolPackage();

} //GMFToolFactory

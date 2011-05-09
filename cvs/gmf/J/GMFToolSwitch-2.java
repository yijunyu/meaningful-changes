/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.tooldef.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.tooldef.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.tooldef.GMFToolPackage
 * @generated
 */
public class GMFToolSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GMFToolPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFToolSwitch() {
		if (modelPackage == null) {
			modelPackage = GMFToolPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch((EClass) eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case GMFToolPackage.TOOL_REGISTRY: {
			ToolRegistry toolRegistry = (ToolRegistry) theEObject;
			Object result = caseToolRegistry(toolRegistry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.ABSTRACT_TOOL: {
			AbstractTool abstractTool = (AbstractTool) theEObject;
			Object result = caseAbstractTool(abstractTool);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.TOOL_CONTAINER: {
			ToolContainer toolContainer = (ToolContainer) theEObject;
			Object result = caseToolContainer(toolContainer);
			if (result == null)
				result = caseAbstractTool(toolContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.PALETTE_SEPARATOR: {
			PaletteSeparator paletteSeparator = (PaletteSeparator) theEObject;
			Object result = casePaletteSeparator(paletteSeparator);
			if (result == null)
				result = caseAbstractTool(paletteSeparator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.TOOL_GROUP: {
			ToolGroup toolGroup = (ToolGroup) theEObject;
			Object result = caseToolGroup(toolGroup);
			if (result == null)
				result = caseToolContainer(toolGroup);
			if (result == null)
				result = caseAbstractTool(toolGroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.PALETTE: {
			Palette palette = (Palette) theEObject;
			Object result = casePalette(palette);
			if (result == null)
				result = caseToolContainer(palette);
			if (result == null)
				result = caseAbstractTool(palette);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.STANDARD_TOOL: {
			StandardTool standardTool = (StandardTool) theEObject;
			Object result = caseStandardTool(standardTool);
			if (result == null)
				result = caseAbstractTool(standardTool);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.CREATION_TOOL: {
			CreationTool creationTool = (CreationTool) theEObject;
			Object result = caseCreationTool(creationTool);
			if (result == null)
				result = caseAbstractTool(creationTool);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.GENERIC_TOOL: {
			GenericTool genericTool = (GenericTool) theEObject;
			Object result = caseGenericTool(genericTool);
			if (result == null)
				result = caseAbstractTool(genericTool);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.ITEM_BASE: {
			ItemBase itemBase = (ItemBase) theEObject;
			Object result = caseItemBase(itemBase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.MENU: {
			Menu menu = (Menu) theEObject;
			Object result = caseMenu(menu);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.SEPARATOR: {
			Separator separator = (Separator) theEObject;
			Object result = caseSeparator(separator);
			if (result == null)
				result = caseItemBase(separator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.PREDEFINED_ITEM: {
			PredefinedItem predefinedItem = (PredefinedItem) theEObject;
			Object result = casePredefinedItem(predefinedItem);
			if (result == null)
				result = caseItemBase(predefinedItem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.PREDEFINED_MENU: {
			PredefinedMenu predefinedMenu = (PredefinedMenu) theEObject;
			Object result = casePredefinedMenu(predefinedMenu);
			if (result == null)
				result = caseMenu(predefinedMenu);
			if (result == null)
				result = casePredefinedItem(predefinedMenu);
			if (result == null)
				result = caseItemBase(predefinedMenu);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.CONTRIBUTION_ITEM: {
			ContributionItem contributionItem = (ContributionItem) theEObject;
			Object result = caseContributionItem(contributionItem);
			if (result == null)
				result = caseItemBase(contributionItem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.MENU_ACTION: {
			MenuAction menuAction = (MenuAction) theEObject;
			Object result = caseMenuAction(menuAction);
			if (result == null)
				result = caseContributionItem(menuAction);
			if (result == null)
				result = caseItemBase(menuAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.ITEM_REF: {
			ItemRef itemRef = (ItemRef) theEObject;
			Object result = caseItemRef(itemRef);
			if (result == null)
				result = caseItemBase(itemRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.CONTEXT_MENU: {
			ContextMenu contextMenu = (ContextMenu) theEObject;
			Object result = caseContextMenu(contextMenu);
			if (result == null)
				result = caseMenu(contextMenu);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.POPUP_MENU: {
			PopupMenu popupMenu = (PopupMenu) theEObject;
			Object result = casePopupMenu(popupMenu);
			if (result == null)
				result = caseMenu(popupMenu);
			if (result == null)
				result = caseContributionItem(popupMenu);
			if (result == null)
				result = caseItemBase(popupMenu);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.MAIN_MENU: {
			MainMenu mainMenu = (MainMenu) theEObject;
			Object result = caseMainMenu(mainMenu);
			if (result == null)
				result = caseMenu(mainMenu);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.TOOLBAR: {
			Toolbar toolbar = (Toolbar) theEObject;
			Object result = caseToolbar(toolbar);
			if (result == null)
				result = caseMenu(toolbar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.IMAGE: {
			Image image = (Image) theEObject;
			Object result = caseImage(image);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.DEFAULT_IMAGE: {
			DefaultImage defaultImage = (DefaultImage) theEObject;
			Object result = caseDefaultImage(defaultImage);
			if (result == null)
				result = caseImage(defaultImage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.BUNDLE_IMAGE: {
			BundleImage bundleImage = (BundleImage) theEObject;
			Object result = caseBundleImage(bundleImage);
			if (result == null)
				result = caseImage(bundleImage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.STYLE_SELECTOR: {
			StyleSelector styleSelector = (StyleSelector) theEObject;
			Object result = caseStyleSelector(styleSelector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.GENERIC_STYLE_SELECTOR: {
			GenericStyleSelector genericStyleSelector = (GenericStyleSelector) theEObject;
			Object result = caseGenericStyleSelector(genericStyleSelector);
			if (result == null)
				result = caseStyleSelector(genericStyleSelector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Tool Registry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Tool Registry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseToolRegistry(ToolRegistry object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Abstract Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Abstract Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractTool(AbstractTool object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Tool Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Tool Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseToolContainer(ToolContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Palette Separator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Palette Separator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePaletteSeparator(PaletteSeparator object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Tool Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Tool Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseToolGroup(ToolGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Palette</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Palette</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePalette(Palette object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Standard Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Standard Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStandardTool(StandardTool object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Creation Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Creation Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCreationTool(CreationTool object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Generic Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Generic Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenericTool(GenericTool object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Item Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Item Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseItemBase(ItemBase object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMenu(Menu object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Separator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Separator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSeparator(Separator object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Predefined Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Predefined Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePredefinedItem(PredefinedItem object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Predefined Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Predefined Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePredefinedMenu(PredefinedMenu object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Contribution Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Contribution Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseContributionItem(ContributionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Menu Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Menu Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMenuAction(MenuAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Item Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Item Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseItemRef(ItemRef object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Context Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Context Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseContextMenu(ContextMenu object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Popup Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Popup Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePopupMenu(PopupMenu object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Main Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Main Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMainMenu(MainMenu object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Toolbar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Toolbar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseToolbar(Toolbar object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Default Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Default Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDefaultImage(DefaultImage object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Bundle Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Bundle Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBundleImage(BundleImage object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Style Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Style Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStyleSelector(StyleSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Generic Style Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Generic Style Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenericStyleSelector(GenericStyleSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //GMFToolSwitch

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
public class GMFToolSwitch<T> {
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
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case GMFToolPackage.TOOL_REGISTRY: {
			ToolRegistry toolRegistry = (ToolRegistry) theEObject;
			T result = caseToolRegistry(toolRegistry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.ABSTRACT_TOOL: {
			AbstractTool abstractTool = (AbstractTool) theEObject;
			T result = caseAbstractTool(abstractTool);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.TOOL_CONTAINER: {
			ToolContainer toolContainer = (ToolContainer) theEObject;
			T result = caseToolContainer(toolContainer);
			if (result == null)
				result = caseAbstractTool(toolContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.PALETTE_SEPARATOR: {
			PaletteSeparator paletteSeparator = (PaletteSeparator) theEObject;
			T result = casePaletteSeparator(paletteSeparator);
			if (result == null)
				result = caseAbstractTool(paletteSeparator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.TOOL_GROUP: {
			ToolGroup toolGroup = (ToolGroup) theEObject;
			T result = caseToolGroup(toolGroup);
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
			T result = casePalette(palette);
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
			T result = caseStandardTool(standardTool);
			if (result == null)
				result = caseAbstractTool(standardTool);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.CREATION_TOOL: {
			CreationTool creationTool = (CreationTool) theEObject;
			T result = caseCreationTool(creationTool);
			if (result == null)
				result = caseAbstractTool(creationTool);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.GENERIC_TOOL: {
			GenericTool genericTool = (GenericTool) theEObject;
			T result = caseGenericTool(genericTool);
			if (result == null)
				result = caseAbstractTool(genericTool);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.ITEM_BASE: {
			ItemBase itemBase = (ItemBase) theEObject;
			T result = caseItemBase(itemBase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.MENU: {
			Menu menu = (Menu) theEObject;
			T result = caseMenu(menu);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.SEPARATOR: {
			Separator separator = (Separator) theEObject;
			T result = caseSeparator(separator);
			if (result == null)
				result = caseItemBase(separator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.PREDEFINED_ITEM: {
			PredefinedItem predefinedItem = (PredefinedItem) theEObject;
			T result = casePredefinedItem(predefinedItem);
			if (result == null)
				result = caseItemBase(predefinedItem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.PREDEFINED_MENU: {
			PredefinedMenu predefinedMenu = (PredefinedMenu) theEObject;
			T result = casePredefinedMenu(predefinedMenu);
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
			T result = caseContributionItem(contributionItem);
			if (result == null)
				result = caseItemBase(contributionItem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.MENU_ACTION: {
			MenuAction menuAction = (MenuAction) theEObject;
			T result = caseMenuAction(menuAction);
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
			T result = caseItemRef(itemRef);
			if (result == null)
				result = caseItemBase(itemRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.CONTEXT_MENU: {
			ContextMenu contextMenu = (ContextMenu) theEObject;
			T result = caseContextMenu(contextMenu);
			if (result == null)
				result = caseMenu(contextMenu);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.POPUP_MENU: {
			PopupMenu popupMenu = (PopupMenu) theEObject;
			T result = casePopupMenu(popupMenu);
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
			T result = caseMainMenu(mainMenu);
			if (result == null)
				result = caseMenu(mainMenu);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.TOOLBAR: {
			Toolbar toolbar = (Toolbar) theEObject;
			T result = caseToolbar(toolbar);
			if (result == null)
				result = caseMenu(toolbar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.IMAGE: {
			Image image = (Image) theEObject;
			T result = caseImage(image);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.DEFAULT_IMAGE: {
			DefaultImage defaultImage = (DefaultImage) theEObject;
			T result = caseDefaultImage(defaultImage);
			if (result == null)
				result = caseImage(defaultImage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.BUNDLE_IMAGE: {
			BundleImage bundleImage = (BundleImage) theEObject;
			T result = caseBundleImage(bundleImage);
			if (result == null)
				result = caseImage(bundleImage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.STYLE_SELECTOR: {
			StyleSelector styleSelector = (StyleSelector) theEObject;
			T result = caseStyleSelector(styleSelector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GMFToolPackage.GENERIC_STYLE_SELECTOR: {
			GenericStyleSelector genericStyleSelector = (GenericStyleSelector) theEObject;
			T result = caseGenericStyleSelector(genericStyleSelector);
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
	public T caseToolRegistry(ToolRegistry object) {
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
	public T caseAbstractTool(AbstractTool object) {
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
	public T caseToolContainer(ToolContainer object) {
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
	public T casePaletteSeparator(PaletteSeparator object) {
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
	public T caseToolGroup(ToolGroup object) {
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
	public T casePalette(Palette object) {
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
	public T caseStandardTool(StandardTool object) {
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
	public T caseCreationTool(CreationTool object) {
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
	public T caseGenericTool(GenericTool object) {
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
	public T caseItemBase(ItemBase object) {
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
	public T caseMenu(Menu object) {
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
	public T caseSeparator(Separator object) {
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
	public T casePredefinedItem(PredefinedItem object) {
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
	public T casePredefinedMenu(PredefinedMenu object) {
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
	public T caseContributionItem(ContributionItem object) {
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
	public T caseMenuAction(MenuAction object) {
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
	public T caseItemRef(ItemRef object) {
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
	public T caseContextMenu(ContextMenu object) {
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
	public T casePopupMenu(PopupMenu object) {
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
	public T caseMainMenu(MainMenu object) {
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
	public T caseToolbar(Toolbar object) {
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
	public T caseImage(Image object) {
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
	public T caseDefaultImage(DefaultImage object) {
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
	public T caseBundleImage(BundleImage object) {
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
	public T caseStyleSelector(StyleSelector object) {
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
	public T caseGenericStyleSelector(GenericStyleSelector object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //GMFToolSwitch

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.tooldef.StyleSelector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appearance Steward</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.AppearanceSteward#getAppearanceStyle <em>Appearance Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getAppearanceSteward()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AppearanceSteward extends EObject {
	/**
	 * Returns the value of the '<em><b>Appearance Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appearance Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appearance Style</em>' reference.
	 * @see #setAppearanceStyle(StyleSelector)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getAppearanceSteward_AppearanceStyle()
	 * @model
	 * @generated
	 */
	StyleSelector getAppearanceStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.AppearanceSteward#getAppearanceStyle <em>Appearance Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appearance Style</em>' reference.
	 * @see #getAppearanceStyle()
	 * @generated
	 */
	void setAppearanceStyle(StyleSelector value);

} // AppearanceSteward

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.tooldef;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Style Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.tooldef.GenericStyleSelector#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.tooldef.GMFToolPackage#getGenericStyleSelector()
 * @model
 * @generated
 */
public interface GenericStyleSelector extends StyleSelector {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.gmf.tooldef.AppearanceStyle}.
	 * The literals are from the enumeration {@link org.eclipse.gmf.tooldef.AppearanceStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see org.eclipse.gmf.tooldef.AppearanceStyle
	 * @see org.eclipse.gmf.tooldef.GMFToolPackage#getGenericStyleSelector_Values()
	 * @model type="org.eclipse.gmf.tooldef.AppearanceStyle" required="true"
	 * @generated
	 */
	EList<AppearanceStyle> getValues();

} // GenericStyleSelector

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.tooldef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Style Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.tooldef.GenericStyleSelector#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.tooldef.GMFToolPackage#getGenericStyleSelector()
 * @model
 * @generated
 */
public interface GenericStyleSelector extends StyleSelector {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.tooldef.AppearanceStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.gmf.tooldef.AppearanceStyle
	 * @see #setValue(AppearanceStyle)
	 * @see org.eclipse.gmf.tooldef.GMFToolPackage#getGenericStyleSelector_Value()
	 * @model
	 * @generated
	 */
	AppearanceStyle getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.tooldef.GenericStyleSelector#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.gmf.tooldef.AppearanceStyle
	 * @see #getValue()
	 * @generated
	 */
	void setValue(AppearanceStyle value);

} // GenericStyleSelector

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.CustomAttribute#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.CustomAttribute#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.CustomAttribute#isDirectAccess <em>Direct Access</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.CustomAttribute#isMultiStatementValue <em>Multi Statement Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getCustomAttribute()
 * @model
 * @generated
 */
public interface CustomAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getCustomAttribute_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.CustomAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getCustomAttribute_Value()
	 * @model default="null" required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.CustomAttribute#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Direct Access</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direct Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direct Access</em>' attribute.
	 * @see #setDirectAccess(boolean)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getCustomAttribute_DirectAccess()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isDirectAccess();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.CustomAttribute#isDirectAccess <em>Direct Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direct Access</em>' attribute.
	 * @see #isDirectAccess()
	 * @generated
	 */
	void setDirectAccess(boolean value);

	/**
	 * Returns the value of the '<em><b>Multi Statement Value</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Statement Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Statement Value</em>' attribute.
	 * @see #setMultiStatementValue(boolean)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getCustomAttribute_MultiStatementValue()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isMultiStatementValue();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.CustomAttribute#isMultiStatementValue <em>Multi Statement Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Statement Value</em>' attribute.
	 * @see #isMultiStatementValue()
	 * @generated
	 */
	void setMultiStatementValue(boolean value);

} // CustomAttribute

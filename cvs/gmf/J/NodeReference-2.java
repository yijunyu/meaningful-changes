/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.NodeReference#getChildrenFeature <em>Children Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getNodeReference()
 * @model abstract="true"
 * @generated
 */
public interface NodeReference extends NeedsContainment {
	/**
	 * Returns the value of the '<em><b>Children Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children Feature</em>' reference.
	 * @see #setChildrenFeature(EReference)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getNodeReference_ChildrenFeature()
	 * @model
	 * @generated
	 */
	EReference getChildrenFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.NodeReference#getChildrenFeature <em>Children Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Children Feature</em>' reference.
	 * @see #getChildrenFeature()
	 * @generated
	 */
	void setChildrenFeature(EReference value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	NodeMapping getChild();

} // NodeReference

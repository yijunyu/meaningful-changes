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
 *   <li>{@link org.eclipse.gmf.mappings.NodeReference#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getNodeReference()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='not containmentFeature.oclIsUndefined() implies containmentFeature.eReferenceType.isSuperTypeOf(child.domainMetaElement)' description='\'Containment Feature\' must reference the same class or super type of \'Domain Meta Element\' of the referenced node'"
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
	 * @model annotation="http://www.eclipse.org/gmf/2005/constraints ocl='not childrenFeature.oclIsUndefined() implies childrenFeature.eReferenceType.isSuperTypeOf(child.domainMetaElement)' description='\'Children Feature\' must reference the same class or super type of \'Domain Meta Element\' of the referenced node'"
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
	 * Returns the value of the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #isSetChild()
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getNodeReference_Child()
	 * @model resolveProxies="false" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	NodeMapping getChild();

	/**
	 * Returns whether the value of the '{@link org.eclipse.gmf.mappings.NodeReference#getChild <em>Child</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Child</em>' reference is set.
	 * @see #getChild()
	 * @generated
	 */
	boolean isSetChild();

} // NodeReference

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Domain Element Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Target for rules applied on domain model elements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDomainElementTarget#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDomainElementTarget()
 * @model
 * @generated
 */
public interface GenDomainElementTarget extends GenAuditable, GenMeasurable {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Targeted domain model element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(GenClass)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDomainElementTarget_Element()
	 * @model required="true"
	 * @generated
	 */
	GenClass getElement();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDomainElementTarget#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(GenClass value);

} // GenDomainElementTarget

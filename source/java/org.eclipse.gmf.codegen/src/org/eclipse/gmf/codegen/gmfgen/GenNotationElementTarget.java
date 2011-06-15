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
 * A representation of the model object '<em><b>Gen Notation Element Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Target for rules applied on diagram notation model elements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNotationElementTarget#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNotationElementTarget()
 * @model
 * @generated
 */
public interface GenNotationElementTarget extends GenAuditable, GenMeasurable {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Targeted diagram notation model element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(GenClass)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNotationElementTarget_Element()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='element.ecoreClass.eAllSuperTypes->including(element.ecoreClass)->one(ePackage.name = \'notation\' and name = \'View\')' description='\'notation::View\' or its sub-class must be set to NotationElement target'"
	 * @generated
	 */
	GenClass getElement();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenNotationElementTarget#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(GenClass value);

} // GenNotationElementTarget

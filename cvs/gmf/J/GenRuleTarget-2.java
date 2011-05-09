/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Rule Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The target against which a rule can be evaluated
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenRuleTarget#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenRuleTarget()
 * @model abstract="true"
 * @generated
 */
public interface GenRuleTarget extends EObject {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenRuleBase#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rule bound this rule target
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule</em>' container reference.
	 * @see #setRule(GenRuleBase)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenRuleTarget_Rule()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenRuleBase#getTarget
	 * @model opposite="target" required="true"
	 * @generated
	 */
	GenRuleBase getRule();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenRuleTarget#getRule <em>Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' container reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(GenRuleBase value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets identifier of the validation client context for this target. It's guaranteed as a valid java identifier.
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getClientContextID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets the class to be used as this rule target evaluation context
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	GenClass getContext();

} // GenRuleTarget

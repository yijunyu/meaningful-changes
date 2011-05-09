/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Rule Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for rule like audit, metric rules...
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenRuleBase#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenRuleBase()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GenRuleBase extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenRuleTarget#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target representing the context this rule is evaluated in
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(GenRuleTarget)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenRuleBase_Target()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenRuleTarget#getRule
	 * @model opposite="rule" containment="true" required="true"
	 * @generated
	 */
	GenRuleTarget getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenRuleBase#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(GenRuleTarget value);

} // GenRuleBase

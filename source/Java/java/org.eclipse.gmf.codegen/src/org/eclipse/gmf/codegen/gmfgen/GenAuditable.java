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
 * A representation of the model object '<em><b>Gen Auditable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Target suitable for auditing
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenAuditable#getContextSelector <em>Context Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenAuditable()
 * @model abstract="true"
 * @generated
 */
public interface GenAuditable extends GenRuleTarget {
	/**
	 * Returns the value of the '<em><b>Context Selector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditContext#getRuleTargets <em>Rule Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To apply audit to this target, we need to select appropriate input, and here's selector that helps with that
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Selector</em>' reference.
	 * @see #setContextSelector(GenAuditContext)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenAuditable_ContextSelector()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditContext#getRuleTargets
	 * @model opposite="ruleTargets"
	 * @generated
	 */
	GenAuditContext getContextSelector();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditable#getContextSelector <em>Context Selector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Selector</em>' reference.
	 * @see #getContextSelector()
	 * @generated
	 */
	void setContextSelector(GenAuditContext value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets the validation target class in terms of EMFT validation framework.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	GenClass getTargetClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Consists of ecore meta-model only package names and target class simple name
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getTargetClassModelQualifiedName();

} // GenAuditable

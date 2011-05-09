/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Auditable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Target suitable for auditing
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenAuditable()
 * @model abstract="true"
 * @generated
 */
public interface GenAuditable extends GenRuleTarget {
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

} // GenAuditable

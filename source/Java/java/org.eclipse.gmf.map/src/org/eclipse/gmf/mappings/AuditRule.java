/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.AuditRule#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.AuditRule#getRule <em>Rule</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.AuditRule#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.AuditRule#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.AuditRule#isUseInLiveMode <em>Use In Live Mode</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.AuditRule#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.AuditRule#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getAuditRule()
 * @model
 * @generated
 */
public interface AuditRule extends RuleBase {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier of this audit rule
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getAuditRule_Id()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='not id.oclIsUndefined() implies container.audits->one(i | i.id = self.id)' description='Audit rule with the same ID already exists'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.AuditRule#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A boolean type condition which if not satisfied indicates this audit rule violation. It is evaluated in the context of the target
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(Constraint)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getAuditRule_Rule()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints/meta def='context' ref='target'"
	 * @generated
	 */
	Constraint getRule();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.AuditRule#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Constraint value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target representing the context this audit is evaluated in
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Auditable)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getAuditRule_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Auditable getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.AuditRule#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Auditable value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The default value is <code>"ERROR"</code>.
	 * The literals are from the enumeration {@link org.eclipse.gmf.mappings.Severity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the severity of this audit rule violation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see org.eclipse.gmf.mappings.Severity
	 * @see #setSeverity(Severity)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getAuditRule_Severity()
	 * @model default="ERROR"
	 * @generated
	 */
	Severity getSeverity();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.AuditRule#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see org.eclipse.gmf.mappings.Severity
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(Severity value);

	/**
	 * Returns the value of the '<em><b>Use In Live Mode</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if this audit should be evaluated also in Live mode. If 'false', only Batch mode is applicable
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use In Live Mode</em>' attribute.
	 * @see #setUseInLiveMode(boolean)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getAuditRule_UseInLiveMode()
	 * @model default="false"
	 * @generated
	 */
	boolean isUseInLiveMode();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.AuditRule#isUseInLiveMode <em>Use In Live Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use In Live Mode</em>' attribute.
	 * @see #isUseInLiveMode()
	 * @generated
	 */
	void setUseInLiveMode(boolean value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The text message to be reported in case of this audit violation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getAuditRule_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.AuditRule#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.mappings.AuditContainer#getAudits <em>Audits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The containing audit container of this audit rule
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(AuditContainer)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getAuditRule_Container()
	 * @see org.eclipse.gmf.mappings.AuditContainer#getAudits
	 * @model opposite="audits" required="true" transient="false"
	 * @generated
	 */
	AuditContainer getContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.AuditRule#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(AuditContainer value);

} // AuditRule

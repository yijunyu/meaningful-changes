/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Audit Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Auditing rule in the form of a constraint evaluated against its target
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getRoot <em>Root</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getRule <em>Rule</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#isUseInLiveMode <em>Use In Live Mode</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#isRequiresConstraintAdapter <em>Requires Constraint Adapter</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenAuditRule()
 * @model
 * @generated
 */
public interface GenAuditRule extends GenRuleBase {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRoot#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' container reference.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenAuditRule_Root()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditRoot#getRules
	 * @model opposite="rules" resolveProxies="false" required="true" transient="false" changeable="false"
	 * @generated
	 */
	GenAuditRoot getRoot();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier of this audit rule
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenAuditRule_Id()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='not id.oclIsUndefined() implies root.rules->one(i | i.id = self.id)' description='Audit rule with the same ID already exists'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The text message to be reported in case of this audit violation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenAuditRule_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A boolean type condition which if not satisfied indicates this audit rule violation. It is evaluated in the context of the target
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule</em>' reference.
	 * @see #setRule(GenConstraint)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenAuditRule_Rule()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints/meta def='context' ocl='target.getContext()'"
	 * @generated
	 */
	GenConstraint getRule();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getRule <em>Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(GenConstraint value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target representing the context this audit is evaluated in
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(GenAuditable)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenAuditRule_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GenAuditable getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(GenAuditable value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The default value is <code>"ERROR"</code>.
	 * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.GenSeverity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the severity of this audit rule violation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenSeverity
	 * @see #setSeverity(GenSeverity)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenAuditRule_Severity()
	 * @model default="ERROR"
	 * @generated
	 */
	GenSeverity getSeverity();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenSeverity
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(GenSeverity value);

	/**
	 * Returns the value of the '<em><b>Use In Live Mode</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use In Live Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if this audit should be evaluated also in Live mode. If 'false', only Batch mode is applicable
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use In Live Mode</em>' attribute.
	 * @see #setUseInLiveMode(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenAuditRule_UseInLiveMode()
	 * @model default="false"
	 * @generated
	 */
	boolean isUseInLiveMode();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#isUseInLiveMode <em>Use In Live Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use In Live Mode</em>' attribute.
	 * @see #isUseInLiveMode()
	 * @generated
	 */
	void setUseInLiveMode(boolean value);

	/**
	 * Returns the value of the '<em><b>Requires Constraint Adapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires Constraint Adapter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires Constraint Adapter</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenAuditRule_RequiresConstraintAdapter()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isRequiresConstraintAdapter();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getAudits <em>Audits</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(GenAuditContainer)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenAuditRule_Category()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getAudits
	 * @model opposite="audits" required="true"
	 * @generated
	 */
	GenAuditContainer getCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(GenAuditContainer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getConstraintAdapterQualifiedClassName();

	String getConstraintAdapterLocalClassName();
	String getConstraintAdapterClassName();
	
} // GenAuditRule

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenAuditContainer;
import org.eclipse.gmf.codegen.gmfgen.GenAuditRule;
import org.eclipse.gmf.codegen.gmfgen.GenAuditable;
import org.eclipse.gmf.codegen.gmfgen.GenConstraint;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenDomainAttributeTarget;
import org.eclipse.gmf.codegen.gmfgen.GenSeverity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Audit Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditRuleImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditRuleImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditRuleImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditRuleImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditRuleImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditRuleImpl#isUseInLiveMode <em>Use In Live Mode</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditRuleImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditRuleImpl#isRequiresConstraintAdapter <em>Requires Constraint Adapter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenAuditRuleImpl extends GenRuleBaseImpl implements GenAuditRule {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected GenConstraint rule = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected GenAuditable target = null;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final GenSeverity SEVERITY_EDEFAULT = GenSeverity.ERROR_LITERAL;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected GenSeverity severity = SEVERITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseInLiveMode() <em>Use In Live Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseInLiveMode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_IN_LIVE_MODE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseInLiveMode() <em>Use In Live Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseInLiveMode()
	 * @generated
	 * @ordered
	 */
	protected boolean useInLiveMode = USE_IN_LIVE_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequiresConstraintAdapter() <em>Requires Constraint Adapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequiresConstraintAdapter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRES_CONSTRAINT_ADAPTER_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenAuditRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenAuditRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenAuditable getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(GenAuditable newTarget, NotificationChain msgs) {
		GenAuditable oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_AUDIT_RULE__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(GenAuditable newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_AUDIT_RULE__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_AUDIT_RULE__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_AUDIT_RULE__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_AUDIT_RULE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_AUDIT_RULE__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenConstraint getRule() {
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(GenConstraint newRule, NotificationChain msgs) {
		GenConstraint oldRule = rule;
		rule = newRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_AUDIT_RULE__RULE, oldRule, newRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(GenConstraint newRule) {
		if (newRule != rule) {
			NotificationChain msgs = null;
			if (rule != null)
				msgs = ((InternalEObject)rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_AUDIT_RULE__RULE, null, msgs);
			if (newRule != null)
				msgs = ((InternalEObject)newRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_AUDIT_RULE__RULE, null, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_AUDIT_RULE__RULE, newRule, newRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenSeverity getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(GenSeverity newSeverity) {
		GenSeverity oldSeverity = severity;
		severity = newSeverity == null ? SEVERITY_EDEFAULT : newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_AUDIT_RULE__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseInLiveMode() {
		return useInLiveMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseInLiveMode(boolean newUseInLiveMode) {
		boolean oldUseInLiveMode = useInLiveMode;
		useInLiveMode = newUseInLiveMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_AUDIT_RULE__USE_IN_LIVE_MODE, oldUseInLiveMode, useInLiveMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenAuditContainer getContainer() {
		if (eContainerFeatureID != GMFGenPackage.GEN_AUDIT_RULE__CONTAINER) return null;
		return (GenAuditContainer)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(GenAuditContainer newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, GMFGenPackage.GEN_AUDIT_RULE__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(GenAuditContainer newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID != GMFGenPackage.GEN_AUDIT_RULE__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, GMFGenPackage.GEN_AUDIT_CONTAINER__AUDITS, GenAuditContainer.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_AUDIT_RULE__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getContextSelectorClassName() {
		if(getTarget() == null || getDiagram() == null) {
			return null;
		}
		return getDiagram().getValidationProviderClassName() + "$" + getContextSelectorLocalClassName(); //$NON-NLS-1$  
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getContextSelectorQualifiedClassName() {
		if(getTarget() == null || getDiagram() == null) {
			return null;
		}
		return getDiagram().getValidationProviderQualifiedClassName() + "$" + getContextSelectorLocalClassName(); //$NON-NLS-1$ 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getContextSelectorLocalClassName() {
		if(getTarget() == null) {
			return "NoCtx"; //$NON-NLS-1$
		}
		return getTarget().getClientContextID(); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getConstraintAdapterClassName() {
		if(getDiagram() == null || getConstraintAdapterLocalClassName() == null) {
			return null;
		}		
		return getDiagram().getValidationProviderClassName() + "$" + getConstraintAdapterLocalClassName(); //$NON-NLS-1$
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getConstraintAdapterLocalClassName() {
		if(getContainer() == null) {
			return null;
		}
		StringBuffer buf = new StringBuffer();
		for(GenAuditContainer container = getContainer(); container != null;) {
			GenAuditContainer parent = container.getParentContainer();
			if(parent != null) {
				buf.insert(0, parent.getChildContainers().indexOf(container) + 1);
			}
			container = parent;
		}
		buf.insert(0, "Adapter"); //$NON-NLS-1$
		buf.append(getContainer().getAudits().indexOf(this) + 1);
		return buf.toString(); 
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */	
	public String getConstraintAdapterQualifiedClassName() {
		if(getDiagram() == null) {
			return null;
		}
		return getDiagram().getValidationProviderQualifiedClassName() + "$" + getConstraintAdapterLocalClassName(); //$NON-NLS-1$
	}
	
	private GenDiagram getDiagram() {
		if(getContainer() != null && getContainer().getEditor() != null) {
			return getContainer().getEditor().getDiagram();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */	
	public boolean isRequiresConstraintAdapter() {
		if(getRule() != null) {
			if(!getRule().isOCLExpression() || getTarget() instanceof GenDomainAttributeTarget) {
				return true;
			} else if(getTarget() != null && getTarget().getContext() != null) {
				return getTarget().getContext() != getTarget().getTargetClass();
			}
		}
		return false;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_AUDIT_RULE__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((GenAuditContainer)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_AUDIT_RULE__RULE:
				return basicSetRule(null, msgs);
			case GMFGenPackage.GEN_AUDIT_RULE__TARGET:
				return basicSetTarget(null, msgs);
			case GMFGenPackage.GEN_AUDIT_RULE__CONTAINER:
				return basicSetContainer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case GMFGenPackage.GEN_AUDIT_RULE__CONTAINER:
				return eInternalContainer().eInverseRemove(this, GMFGenPackage.GEN_AUDIT_CONTAINER__AUDITS, GenAuditContainer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.GEN_AUDIT_RULE__ID:
				return getId();
			case GMFGenPackage.GEN_AUDIT_RULE__RULE:
				return getRule();
			case GMFGenPackage.GEN_AUDIT_RULE__TARGET:
				return getTarget();
			case GMFGenPackage.GEN_AUDIT_RULE__MESSAGE:
				return getMessage();
			case GMFGenPackage.GEN_AUDIT_RULE__SEVERITY:
				return getSeverity();
			case GMFGenPackage.GEN_AUDIT_RULE__USE_IN_LIVE_MODE:
				return isUseInLiveMode() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_AUDIT_RULE__CONTAINER:
				return getContainer();
			case GMFGenPackage.GEN_AUDIT_RULE__REQUIRES_CONSTRAINT_ADAPTER:
				return isRequiresConstraintAdapter() ? Boolean.TRUE : Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMFGenPackage.GEN_AUDIT_RULE__ID:
				setId((String)newValue);
				return;
			case GMFGenPackage.GEN_AUDIT_RULE__RULE:
				setRule((GenConstraint)newValue);
				return;
			case GMFGenPackage.GEN_AUDIT_RULE__TARGET:
				setTarget((GenAuditable)newValue);
				return;
			case GMFGenPackage.GEN_AUDIT_RULE__MESSAGE:
				setMessage((String)newValue);
				return;
			case GMFGenPackage.GEN_AUDIT_RULE__SEVERITY:
				setSeverity((GenSeverity)newValue);
				return;
			case GMFGenPackage.GEN_AUDIT_RULE__USE_IN_LIVE_MODE:
				setUseInLiveMode(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_AUDIT_RULE__CONTAINER:
				setContainer((GenAuditContainer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case GMFGenPackage.GEN_AUDIT_RULE__ID:
				setId(ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_AUDIT_RULE__RULE:
				setRule((GenConstraint)null);
				return;
			case GMFGenPackage.GEN_AUDIT_RULE__TARGET:
				setTarget((GenAuditable)null);
				return;
			case GMFGenPackage.GEN_AUDIT_RULE__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case GMFGenPackage.GEN_AUDIT_RULE__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case GMFGenPackage.GEN_AUDIT_RULE__USE_IN_LIVE_MODE:
				setUseInLiveMode(USE_IN_LIVE_MODE_EDEFAULT);
				return;
			case GMFGenPackage.GEN_AUDIT_RULE__CONTAINER:
				setContainer((GenAuditContainer)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GMFGenPackage.GEN_AUDIT_RULE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GMFGenPackage.GEN_AUDIT_RULE__RULE:
				return rule != null;
			case GMFGenPackage.GEN_AUDIT_RULE__TARGET:
				return target != null;
			case GMFGenPackage.GEN_AUDIT_RULE__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case GMFGenPackage.GEN_AUDIT_RULE__SEVERITY:
				return severity != SEVERITY_EDEFAULT;
			case GMFGenPackage.GEN_AUDIT_RULE__USE_IN_LIVE_MODE:
				return useInLiveMode != USE_IN_LIVE_MODE_EDEFAULT;
			case GMFGenPackage.GEN_AUDIT_RULE__CONTAINER:
				return getContainer() != null;
			case GMFGenPackage.GEN_AUDIT_RULE__REQUIRES_CONSTRAINT_ADAPTER:
				return isRequiresConstraintAdapter() != REQUIRES_CONSTRAINT_ADAPTER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", message: ");
		result.append(message);
		result.append(", severity: ");
		result.append(severity);
		result.append(", useInLiveMode: ");
		result.append(useInLiveMode);
		result.append(')');
		return result.toString();
	}

} //GenAuditRuleImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenAuditContainer;
import org.eclipse.gmf.codegen.gmfgen.GenAuditRule;
import org.eclipse.gmf.codegen.gmfgen.GenDiagramElementTarget;
import org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer;
import org.eclipse.gmf.codegen.gmfgen.GenJavaExpressionProvider;
import org.eclipse.gmf.codegen.gmfgen.GenNotationElementTarget;
import org.eclipse.gmf.codegen.gmfgen.GenRuleTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Audit Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditContainerImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditContainerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditContainerImpl#getParentContainer <em>Parent Container</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditContainerImpl#getAudits <em>Audits</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditContainerImpl#getChildContainers <em>Child Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenAuditContainerImpl extends GenRuleContainerBaseImpl implements GenAuditContainer {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAudits() <em>Audits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudits()
	 * @generated
	 * @ordered
	 */
	protected EList audits = null;

	/**
	 * The cached value of the '{@link #getChildContainers() <em>Child Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildContainers()
	 * @generated
	 * @ordered
	 */
	protected EList childContainers = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenAuditContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenAuditContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAudits() {
		if (audits == null) {
			audits = new EObjectContainmentWithInverseEList(GenAuditRule.class, this, GMFGenPackage.GEN_AUDIT_CONTAINER__AUDITS, GMFGenPackage.GEN_AUDIT_RULE__CONTAINER);
		}
		return audits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getChildContainers() {
		if (childContainers == null) {
			childContainers = new EObjectContainmentWithInverseEList(GenAuditContainer.class, this, GMFGenPackage.GEN_AUDIT_CONTAINER__CHILD_CONTAINERS, GMFGenPackage.GEN_AUDIT_CONTAINER__PARENT_CONTAINER);
		}
		return childContainers;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_AUDIT_CONTAINER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_AUDIT_CONTAINER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_AUDIT_CONTAINER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenAuditContainer getParentContainer() {
		if (eContainerFeatureID != GMFGenPackage.GEN_AUDIT_CONTAINER__PARENT_CONTAINER) return null;
		return (GenAuditContainer)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentContainer(GenAuditContainer newParentContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentContainer, GMFGenPackage.GEN_AUDIT_CONTAINER__PARENT_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentContainer(GenAuditContainer newParentContainer) {
		if (newParentContainer != eInternalContainer() || (eContainerFeatureID != GMFGenPackage.GEN_AUDIT_CONTAINER__PARENT_CONTAINER && newParentContainer != null)) {
			if (EcoreUtil.isAncestor(this, newParentContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentContainer != null)
				msgs = ((InternalEObject)newParentContainer).eInverseAdd(this, GMFGenPackage.GEN_AUDIT_CONTAINER__CHILD_CONTAINERS, GenAuditContainer.class, msgs);
			msgs = basicSetParentContainer(newParentContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_AUDIT_CONTAINER__PARENT_CONTAINER, newParentContainer, newParentContainer));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getAllAuditRules() {
		return getAllRulesInContainer(this, new BasicEList());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getAllAuditContainers() {
		EList containerList = new BasicEList();
		containerList.add(this);
		return getAllChildContainers(this, containerList);
	}
		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getPath() {
		GenAuditContainer parent = this;
		EList elements = new BasicEList();
		while(parent != null) {
			elements.add(0, parent);
			parent = parent.getParentContainer();
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Map getAllRulesToTargetContextMap() {
		HashMap ctx2ruleMap = new HashMap();
		EList allRules = getAllAuditRules();
		for (Iterator it = allRules.iterator(); it.hasNext();) {
			GenAuditRule nextRule = (GenAuditRule) it.next();
			String key = (nextRule.getTarget() != null) ? nextRule.getTarget().getClientContextID() : null;
			if(key != null) {
				List rulesInCtx = null;
				if(ctx2ruleMap.containsKey(key)) {
					rulesInCtx = (List)ctx2ruleMap.get(key);
				} else {
					rulesInCtx = new BasicEList();
					ctx2ruleMap.put(key, rulesInCtx);
				}
				rulesInCtx.add(nextRule);
			}
		}
		return ctx2ruleMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getAllTargetedModelPackages() {
		Set packages = new HashSet();
		EList allRules = getAllAuditRules();
		for (Iterator it = allRules.iterator(); it.hasNext();) {
			GenAuditRule nextRule = (GenAuditRule) it.next();
			if(nextRule.getTarget() != null && nextRule.getTarget().getTargetClass() != null) {
				packages.add(nextRule.getTarget().getTargetClass().getGenPackage());
			}
		}
		return new BasicEList(packages);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean hasDiagramElementRule() {
		EList rules = getAllAuditRules();
		for (Iterator it = rules.iterator(); it.hasNext();) {
			GenAuditRule nextRule = (GenAuditRule) it.next();
			GenRuleTarget target = nextRule.getTarget(); 
			if(target instanceof GenDiagramElementTarget ||
				target instanceof GenNotationElementTarget) {
				return true; 
			}
		}
		return false;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */	
	public List getAllContextSelectorsLocalClassNames() {
		HashSet<String> classNames = new HashSet<String>();
		EList allRules = getAllAuditRules();
		for (Iterator it = allRules.iterator(); it.hasNext();) {
			String nextClassName = ((GenAuditRule) it.next()).getContextSelectorLocalClassName();
			if(nextClassName != null) {
				classNames.add(nextClassName);
			}			
		}
		return new ArrayList<String>(classNames);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List getAllRequiredConstraintAdaptersLocalClassNames() {
		HashSet<String> classNames = new HashSet<String>();
		EList allRules = getAllAuditRules();
		for (Iterator it = allRules.iterator(); it.hasNext();) {
			GenAuditRule nextAudit = (GenAuditRule) it.next();
			if(nextAudit.isRequiresConstraintAdapter()) {
				String nextClassName = nextAudit.getConstraintAdapterLocalClassName();
				if(nextClassName != null) {
					classNames.add(nextClassName);
				}
			}
		}
		return new ArrayList<String>(classNames);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */	
	public List getAllJavaLangAudits() {
		List<GenAuditRule> audits = new ArrayList<GenAuditRule>();
		if(getEditor() == null || getEditor().getExpressionProviders() == null) {
			return audits;
		}
		GenExpressionProviderContainer exprProviders = getEditor().getExpressionProviders();
		for (Iterator it = getAllAuditRules().iterator(); it.hasNext();) {
			GenAuditRule nextAudit = (GenAuditRule) it.next();
			if(nextAudit.getRule() != null && 
				exprProviders.getProvider(nextAudit.getRule()) instanceof GenJavaExpressionProvider) {
				audits.add(nextAudit);
			}
		}
		return audits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_AUDIT_CONTAINER__PARENT_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentContainer((GenAuditContainer)otherEnd, msgs);
			case GMFGenPackage.GEN_AUDIT_CONTAINER__AUDITS:
				return ((InternalEList)getAudits()).basicAdd(otherEnd, msgs);
			case GMFGenPackage.GEN_AUDIT_CONTAINER__CHILD_CONTAINERS:
				return ((InternalEList)getChildContainers()).basicAdd(otherEnd, msgs);
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
			case GMFGenPackage.GEN_AUDIT_CONTAINER__PARENT_CONTAINER:
				return basicSetParentContainer(null, msgs);
			case GMFGenPackage.GEN_AUDIT_CONTAINER__AUDITS:
				return ((InternalEList)getAudits()).basicRemove(otherEnd, msgs);
			case GMFGenPackage.GEN_AUDIT_CONTAINER__CHILD_CONTAINERS:
				return ((InternalEList)getChildContainers()).basicRemove(otherEnd, msgs);
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
			case GMFGenPackage.GEN_AUDIT_CONTAINER__PARENT_CONTAINER:
				return eInternalContainer().eInverseRemove(this, GMFGenPackage.GEN_AUDIT_CONTAINER__CHILD_CONTAINERS, GenAuditContainer.class, msgs);
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
			case GMFGenPackage.GEN_AUDIT_CONTAINER__ID:
				return getId();
			case GMFGenPackage.GEN_AUDIT_CONTAINER__NAME:
				return getName();
			case GMFGenPackage.GEN_AUDIT_CONTAINER__DESCRIPTION:
				return getDescription();
			case GMFGenPackage.GEN_AUDIT_CONTAINER__PARENT_CONTAINER:
				return getParentContainer();
			case GMFGenPackage.GEN_AUDIT_CONTAINER__AUDITS:
				return getAudits();
			case GMFGenPackage.GEN_AUDIT_CONTAINER__CHILD_CONTAINERS:
				return getChildContainers();
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
			case GMFGenPackage.GEN_AUDIT_CONTAINER__ID:
				setId((String)newValue);
				return;
			case GMFGenPackage.GEN_AUDIT_CONTAINER__NAME:
				setName((String)newValue);
				return;
			case GMFGenPackage.GEN_AUDIT_CONTAINER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case GMFGenPackage.GEN_AUDIT_CONTAINER__PARENT_CONTAINER:
				setParentContainer((GenAuditContainer)newValue);
				return;
			case GMFGenPackage.GEN_AUDIT_CONTAINER__AUDITS:
				getAudits().clear();
				getAudits().addAll((Collection)newValue);
				return;
			case GMFGenPackage.GEN_AUDIT_CONTAINER__CHILD_CONTAINERS:
				getChildContainers().clear();
				getChildContainers().addAll((Collection)newValue);
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
			case GMFGenPackage.GEN_AUDIT_CONTAINER__ID:
				setId(ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_AUDIT_CONTAINER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_AUDIT_CONTAINER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GMFGenPackage.GEN_AUDIT_CONTAINER__PARENT_CONTAINER:
				setParentContainer((GenAuditContainer)null);
				return;
			case GMFGenPackage.GEN_AUDIT_CONTAINER__AUDITS:
				getAudits().clear();
				return;
			case GMFGenPackage.GEN_AUDIT_CONTAINER__CHILD_CONTAINERS:
				getChildContainers().clear();
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
			case GMFGenPackage.GEN_AUDIT_CONTAINER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GMFGenPackage.GEN_AUDIT_CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GMFGenPackage.GEN_AUDIT_CONTAINER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case GMFGenPackage.GEN_AUDIT_CONTAINER__PARENT_CONTAINER:
				return getParentContainer() != null;
			case GMFGenPackage.GEN_AUDIT_CONTAINER__AUDITS:
				return audits != null && !audits.isEmpty();
			case GMFGenPackage.GEN_AUDIT_CONTAINER__CHILD_CONTAINERS:
				return childContainers != null && !childContainers.isEmpty();
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
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

	private static EList getAllRulesInContainer(GenAuditContainer container, EList rules) {
		rules.addAll(container.getAudits());
		for (Iterator it = container.getChildContainers().iterator(); it.hasNext();) {
			GenAuditContainer nextContainer = (GenAuditContainer) it.next();
			getAllRulesInContainer(nextContainer, rules);
		}
		return rules;
	}
	
	private static EList getAllChildContainers(GenAuditContainer container, EList containers) {
		containers.addAll(container.getChildContainers());
		for (Iterator it = container.getChildContainers().iterator(); it.hasNext();) {
			GenAuditContainer nextContainer = (GenAuditContainer) it.next();
			getAllChildContainers(nextContainer, containers);
		}
		return containers;
	}
} //GenAuditContainerImpl
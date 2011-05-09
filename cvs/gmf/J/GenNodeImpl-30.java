/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.Collection;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.codegen.gmfgen.ElementType;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenChildContainer;
import org.eclipse.gmf.codegen.gmfgen.GenChildNode;
import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.GenNodeLabel;
import org.eclipse.gmf.codegen.gmfgen.TypeModelFacet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getEditHelperClassName <em>Edit Helper Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getModelFacet <em>Model Facet</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getGraphicalNodeEditPolicyClassName <em>Graphical Node Edit Policy Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenNodeImpl extends GenChildContainerImpl implements GenNode {
	/**
	 * The default value of the '{@link #getEditHelperClassName() <em>Edit Helper Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditHelperClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String EDIT_HELPER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditHelperClassName() <em>Edit Helper Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditHelperClassName()
	 * @generated
	 * @ordered
	 */
	protected String editHelperClassName = EDIT_HELPER_CLASS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModelFacet() <em>Model Facet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelFacet()
	 * @generated
	 * @ordered
	 */
	protected TypeModelFacet modelFacet = null;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList labels = null;

	/**
	 * The cached value of the '{@link #getCompartments() <em>Compartments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartments()
	 * @generated
	 * @ordered
	 */
	protected EList compartments = null;

	/**
	 * The default value of the '{@link #getGraphicalNodeEditPolicyClassName() <em>Graphical Node Edit Policy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicalNodeEditPolicyClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGraphicalNodeEditPolicyClassName() <em>Graphical Node Edit Policy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicalNodeEditPolicyClassName()
	 * @generated
	 * @ordered
	 */
	protected String graphicalNodeEditPolicyClassName = GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditHelperClassNameGen() {
		return editHelperClassName;
	}

	public String getEditHelperClassName() {
		String value = getEditHelperClassNameGen();
		if (isEmpty(value)) {
			value = getClassNamePart() + ElementType.EDIT_HELPER_SUFFIX;
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditHelperClassName(String newEditHelperClassName) {
		String oldEditHelperClassName = editHelperClassName;
		editHelperClassName = newEditHelperClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NODE__EDIT_HELPER_CLASS_NAME, oldEditHelperClassName, editHelperClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GenClass getDomainMetaClass() {
		return getModelFacet() == null ? null : getModelFacet().getMetaClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getGraphicalNodeEditPolicyQualifiedClassName() {
		return getDiagram().getEditPoliciesPackageName() + '.' + getGraphicalNodeEditPolicyClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isListContainerEntry() {
		if (this instanceof GenChildNode) {
			GenChildNode childNode = (GenChildNode) this;
			if (childNode.getContainers().size() > 0) {
				return ((GenChildContainer) childNode.getContainers().get(0)).isListLayout();
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
			case GMFGenPackage.GEN_NODE__LABELS:
				return ((InternalEList)getLabels()).basicAdd(otherEnd, msgs);
			case GMFGenPackage.GEN_NODE__COMPARTMENTS:
				return ((InternalEList)getCompartments()).basicAdd(otherEnd, msgs);
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
			case GMFGenPackage.GEN_NODE__MODEL_FACET:
				return basicSetModelFacet(null, msgs);
			case GMFGenPackage.GEN_NODE__LABELS:
				return ((InternalEList)getLabels()).basicRemove(otherEnd, msgs);
			case GMFGenPackage.GEN_NODE__COMPARTMENTS:
				return ((InternalEList)getCompartments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.GEN_NODE__EDIT_HELPER_CLASS_NAME:
				return getEditHelperClassName();
			case GMFGenPackage.GEN_NODE__MODEL_FACET:
				return getModelFacet();
			case GMFGenPackage.GEN_NODE__LABELS:
				return getLabels();
			case GMFGenPackage.GEN_NODE__COMPARTMENTS:
				return getCompartments();
			case GMFGenPackage.GEN_NODE__GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME:
				return getGraphicalNodeEditPolicyClassName();
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
			case GMFGenPackage.GEN_NODE__EDIT_HELPER_CLASS_NAME:
				setEditHelperClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_NODE__MODEL_FACET:
				setModelFacet((TypeModelFacet)newValue);
				return;
			case GMFGenPackage.GEN_NODE__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection)newValue);
				return;
			case GMFGenPackage.GEN_NODE__COMPARTMENTS:
				getCompartments().clear();
				getCompartments().addAll((Collection)newValue);
				return;
			case GMFGenPackage.GEN_NODE__GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME:
				setGraphicalNodeEditPolicyClassName((String)newValue);
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
			case GMFGenPackage.GEN_NODE__EDIT_HELPER_CLASS_NAME:
				setEditHelperClassName(EDIT_HELPER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NODE__MODEL_FACET:
				setModelFacet((TypeModelFacet)null);
				return;
			case GMFGenPackage.GEN_NODE__LABELS:
				getLabels().clear();
				return;
			case GMFGenPackage.GEN_NODE__COMPARTMENTS:
				getCompartments().clear();
				return;
			case GMFGenPackage.GEN_NODE__GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME:
				setGraphicalNodeEditPolicyClassName(GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME_EDEFAULT);
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
			case GMFGenPackage.GEN_NODE__EDIT_HELPER_CLASS_NAME:
				return EDIT_HELPER_CLASS_NAME_EDEFAULT == null ? editHelperClassName != null : !EDIT_HELPER_CLASS_NAME_EDEFAULT.equals(editHelperClassName);
			case GMFGenPackage.GEN_NODE__MODEL_FACET:
				return modelFacet != null;
			case GMFGenPackage.GEN_NODE__LABELS:
				return labels != null && !labels.isEmpty();
			case GMFGenPackage.GEN_NODE__COMPARTMENTS:
				return compartments != null && !compartments.isEmpty();
			case GMFGenPackage.GEN_NODE__GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME:
				return GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME_EDEFAULT == null ? graphicalNodeEditPolicyClassName != null : !GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME_EDEFAULT.equals(graphicalNodeEditPolicyClassName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == ElementType.class) {
			switch (derivedFeatureID) {
				case GMFGenPackage.GEN_NODE__EDIT_HELPER_CLASS_NAME: return GMFGenPackage.ELEMENT_TYPE__EDIT_HELPER_CLASS_NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == ElementType.class) {
			switch (baseFeatureID) {
				case GMFGenPackage.ELEMENT_TYPE__EDIT_HELPER_CLASS_NAME: return GMFGenPackage.GEN_NODE__EDIT_HELPER_CLASS_NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLabels() {
		if (labels == null) {
			labels = new EObjectContainmentWithInverseEList(GenNodeLabel.class, this, GMFGenPackage.GEN_NODE__LABELS, GMFGenPackage.GEN_NODE_LABEL__NODE);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCompartments() {
		if (compartments == null) {
			compartments = new EObjectWithInverseResolvingEList(GenCompartment.class, this, GMFGenPackage.GEN_NODE__COMPARTMENTS, GMFGenPackage.GEN_COMPARTMENT__NODE);
		}
		return compartments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGraphicalNodeEditPolicyClassNameGen() {
		return graphicalNodeEditPolicyClassName;
	}

	public String getGraphicalNodeEditPolicyClassName() {
		String value = getGraphicalNodeEditPolicyClassNameGen();
		if (isEmpty(value)) {
			value = getClassNamePart() + GRAPHICAL_NODE_EDIT_POLICY_SUFFIX;
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphicalNodeEditPolicyClassName(String newGraphicalNodeEditPolicyClassName) {
		String oldGraphicalNodeEditPolicyClassName = graphicalNodeEditPolicyClassName;
		graphicalNodeEditPolicyClassName = newGraphicalNodeEditPolicyClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NODE__GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME, oldGraphicalNodeEditPolicyClassName, graphicalNodeEditPolicyClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditHelperQualifiedClassName() {
		return getDiagram().getEditHelpersPackageName() + '.' + getEditHelperClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeModelFacet getModelFacet() {
		return modelFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelFacet(TypeModelFacet newModelFacet, NotificationChain msgs) {
		TypeModelFacet oldModelFacet = modelFacet;
		modelFacet = newModelFacet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NODE__MODEL_FACET, oldModelFacet, newModelFacet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelFacet(TypeModelFacet newModelFacet) {
		if (newModelFacet != modelFacet) {
			NotificationChain msgs = null;
			if (modelFacet != null)
				msgs = ((InternalEObject)modelFacet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_NODE__MODEL_FACET, null, msgs);
			if (newModelFacet != null)
				msgs = ((InternalEObject)newModelFacet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_NODE__MODEL_FACET, null, msgs);
			msgs = basicSetModelFacet(newModelFacet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NODE__MODEL_FACET, newModelFacet, newModelFacet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (editHelperClassName: ");
		result.append(editHelperClassName);
		result.append(", graphicalNodeEditPolicyClassName: ");
		result.append(graphicalNodeEditPolicyClassName);
		result.append(')');
		return result.toString();
	}

	public String getClassNamePrefix() {
		return getDomainMetaClass() == null ? "Node" + hashCode() : getDomainMetaClass().getName();
	}

	public String getUniqueIdentifier() {
		return getDomainMetaClass().getInterfaceName() + "_" + getVisualID();
	}
	
} //GenNodeImpl

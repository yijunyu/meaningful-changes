/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.codegen.gmfgen.FeatureLinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.GenNodeLabel;
import org.eclipse.gmf.codegen.gmfgen.TypeLinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.TypeModelFacet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getModelFacet <em>Model Facet</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getPrimaryDragEditPolicyQualifiedClassName <em>Primary Drag Edit Policy Qualified Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getGraphicalNodeEditPolicyClassName <em>Graphical Node Edit Policy Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getCreateCommandClassName <em>Create Command Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getReorientedIncomingLinks <em>Reoriented Incoming Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenNodeImpl extends GenChildContainerImpl implements GenNode {
	/**
	 * The cached value of the '{@link #getModelFacet() <em>Model Facet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelFacet()
	 * @generated
	 * @ordered
	 */
	protected TypeModelFacet modelFacet;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<GenNodeLabel> labels;

	/**
	 * The cached value of the '{@link #getCompartments() <em>Compartments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartments()
	 * @generated
	 * @ordered
	 */
	protected EList<GenCompartment> compartments;

	/**
	 * The default value of the '{@link #getPrimaryDragEditPolicyQualifiedClassName() <em>Primary Drag Edit Policy Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryDragEditPolicyQualifiedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_DRAG_EDIT_POLICY_QUALIFIED_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryDragEditPolicyQualifiedClassName() <em>Primary Drag Edit Policy Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryDragEditPolicyQualifiedClassName()
	 * @generated
	 * @ordered
	 */
	protected String primaryDragEditPolicyQualifiedClassName = PRIMARY_DRAG_EDIT_POLICY_QUALIFIED_CLASS_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getCreateCommandClassName() <em>Create Command Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateCommandClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATE_COMMAND_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreateCommandClassName() <em>Create Command Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateCommandClassName()
	 * @generated
	 * @ordered
	 */
	protected String createCommandClassName = CREATE_COMMAND_CLASS_NAME_EDEFAULT;

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
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenNode();
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
	public String getCreateCommandQualifiedClassName() {
		return getDiagram().getEditCommandsPackageName() + '.' + getCreateCommandClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_NODE__LABELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLabels()).basicAdd(otherEnd, msgs);
			case GMFGenPackage.GEN_NODE__COMPARTMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompartments()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_NODE__MODEL_FACET:
				return basicSetModelFacet(null, msgs);
			case GMFGenPackage.GEN_NODE__LABELS:
				return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
			case GMFGenPackage.GEN_NODE__COMPARTMENTS:
				return ((InternalEList<?>)getCompartments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.GEN_NODE__MODEL_FACET:
				return getModelFacet();
			case GMFGenPackage.GEN_NODE__LABELS:
				return getLabels();
			case GMFGenPackage.GEN_NODE__COMPARTMENTS:
				return getCompartments();
			case GMFGenPackage.GEN_NODE__PRIMARY_DRAG_EDIT_POLICY_QUALIFIED_CLASS_NAME:
				return getPrimaryDragEditPolicyQualifiedClassName();
			case GMFGenPackage.GEN_NODE__GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME:
				return getGraphicalNodeEditPolicyClassName();
			case GMFGenPackage.GEN_NODE__CREATE_COMMAND_CLASS_NAME:
				return getCreateCommandClassName();
			case GMFGenPackage.GEN_NODE__REORIENTED_INCOMING_LINKS:
				return getReorientedIncomingLinks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMFGenPackage.GEN_NODE__MODEL_FACET:
				setModelFacet((TypeModelFacet)newValue);
				return;
			case GMFGenPackage.GEN_NODE__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends GenNodeLabel>)newValue);
				return;
			case GMFGenPackage.GEN_NODE__COMPARTMENTS:
				getCompartments().clear();
				getCompartments().addAll((Collection<? extends GenCompartment>)newValue);
				return;
			case GMFGenPackage.GEN_NODE__PRIMARY_DRAG_EDIT_POLICY_QUALIFIED_CLASS_NAME:
				setPrimaryDragEditPolicyQualifiedClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_NODE__GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME:
				setGraphicalNodeEditPolicyClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_NODE__CREATE_COMMAND_CLASS_NAME:
				setCreateCommandClassName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GMFGenPackage.GEN_NODE__MODEL_FACET:
				setModelFacet((TypeModelFacet)null);
				return;
			case GMFGenPackage.GEN_NODE__LABELS:
				getLabels().clear();
				return;
			case GMFGenPackage.GEN_NODE__COMPARTMENTS:
				getCompartments().clear();
				return;
			case GMFGenPackage.GEN_NODE__PRIMARY_DRAG_EDIT_POLICY_QUALIFIED_CLASS_NAME:
				setPrimaryDragEditPolicyQualifiedClassName(PRIMARY_DRAG_EDIT_POLICY_QUALIFIED_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NODE__GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME:
				setGraphicalNodeEditPolicyClassName(GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NODE__CREATE_COMMAND_CLASS_NAME:
				setCreateCommandClassName(CREATE_COMMAND_CLASS_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GMFGenPackage.GEN_NODE__MODEL_FACET:
				return modelFacet != null;
			case GMFGenPackage.GEN_NODE__LABELS:
				return labels != null && !labels.isEmpty();
			case GMFGenPackage.GEN_NODE__COMPARTMENTS:
				return compartments != null && !compartments.isEmpty();
			case GMFGenPackage.GEN_NODE__PRIMARY_DRAG_EDIT_POLICY_QUALIFIED_CLASS_NAME:
				return PRIMARY_DRAG_EDIT_POLICY_QUALIFIED_CLASS_NAME_EDEFAULT == null ? primaryDragEditPolicyQualifiedClassName != null : !PRIMARY_DRAG_EDIT_POLICY_QUALIFIED_CLASS_NAME_EDEFAULT.equals(primaryDragEditPolicyQualifiedClassName);
			case GMFGenPackage.GEN_NODE__GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME:
				return GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME_EDEFAULT == null ? graphicalNodeEditPolicyClassName != null : !GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME_EDEFAULT.equals(graphicalNodeEditPolicyClassName);
			case GMFGenPackage.GEN_NODE__CREATE_COMMAND_CLASS_NAME:
				return CREATE_COMMAND_CLASS_NAME_EDEFAULT == null ? createCommandClassName != null : !CREATE_COMMAND_CLASS_NAME_EDEFAULT.equals(createCommandClassName);
			case GMFGenPackage.GEN_NODE__REORIENTED_INCOMING_LINKS:
				return !getReorientedIncomingLinks().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenNodeLabel> getLabels() {
		if (labels == null) {
			labels = new EObjectContainmentWithInverseEList<GenNodeLabel>(GenNodeLabel.class, this, GMFGenPackage.GEN_NODE__LABELS, GMFGenPackage.GEN_NODE_LABEL__NODE);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenCompartment> getCompartments() {
		if (compartments == null) {
			compartments = new EObjectWithInverseResolvingEList<GenCompartment>(GenCompartment.class, this, GMFGenPackage.GEN_NODE__COMPARTMENTS, GMFGenPackage.GEN_COMPARTMENT__NODE);
		}
		return compartments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrimaryDragEditPolicyQualifiedClassName() {
		return primaryDragEditPolicyQualifiedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryDragEditPolicyQualifiedClassName(String newPrimaryDragEditPolicyQualifiedClassName) {
		String oldPrimaryDragEditPolicyQualifiedClassName = primaryDragEditPolicyQualifiedClassName;
		primaryDragEditPolicyQualifiedClassName = newPrimaryDragEditPolicyQualifiedClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NODE__PRIMARY_DRAG_EDIT_POLICY_QUALIFIED_CLASS_NAME, oldPrimaryDragEditPolicyQualifiedClassName, primaryDragEditPolicyQualifiedClassName));
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
		return getValidClassName(getGraphicalNodeEditPolicyClassNameGen(), this, GRAPHICAL_NODE_EDIT_POLICY_SUFFIX);
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
	public String getCreateCommandClassNameGen() {
		return createCommandClassName;
	}

	public String getCreateCommandClassName() {
		return GenCommonBaseImpl.getValidClassName(getCreateCommandClassNameGen(), this, CREATE_COMMAND_SUFFIX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateCommandClassName(String newCreateCommandClassName) {
		String oldCreateCommandClassName = createCommandClassName;
		createCommandClassName = newCreateCommandClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NODE__CREATE_COMMAND_CLASS_NAME, oldCreateCommandClassName, createCommandClassName));
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
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (primaryDragEditPolicyQualifiedClassName: ");
		result.append(primaryDragEditPolicyQualifiedClassName);
		result.append(", graphicalNodeEditPolicyClassName: ");
		result.append(graphicalNodeEditPolicyClassName);
		result.append(", createCommandClassName: ");
		result.append(createCommandClassName);
		result.append(')');
		return result.toString();
	}

	public String getClassNamePrefix() {
		// should be consistent with ClassNamingStrategy
		if (getDomainMetaClass() != null) {
			String name = getDomainMetaClass().getName();
			if (!isEmpty(name)) {
				return getValidClassName(name);
			}
		}
		return CLASS_NAME_PREFIX;
	}

	@Override
	public EList<GenNode> getAssistantNodes() {
		BasicEList<GenNode> nodes = new BasicEList<GenNode>(super.getAssistantNodes());
		for (GenCompartment compartment : getCompartments()) {
			if (compartment.isListLayout()) {
				nodes.addAll(compartment.getContainedNodes());
			}
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<GenLink> getReorientedIncomingLinks() {
		if (getModelFacet() == null || getModelFacet().getMetaClass() == null || getModelFacet().getMetaClass().getEcoreClass() == null) {
			return ECollections.emptyEList();
		}
		// [artem] XXX not sure there might be two equal links in the genDiagram.links
		// but 'set' was there in the original template. legacy is the only reason i kept it,
		Set<GenLink> reorientedLinks = new HashSet<GenLink>();
		for (GenLink genLink : getDiagram().getLinks()) {
			if (!genLink.isViewDirectionAlignedWithModel() || genLink.getModelFacet() == null) {
				continue;
			}
			GenClass incomingClass;
			GenClass outgoingClass;
			if (genLink.getModelFacet() instanceof TypeLinkModelFacet) {
				TypeLinkModelFacet modelFacet = (TypeLinkModelFacet) genLink.getModelFacet();
				outgoingClass = modelFacet.getSourceMetaFeature() == null
					? modelFacet.getContainmentMetaFeature().getGenClass()
					: modelFacet.getSourceMetaFeature().getTypeGenClass();
				incomingClass = modelFacet.getTargetMetaFeature().getTypeGenClass();
			} else if (genLink.getModelFacet() instanceof FeatureLinkModelFacet) {
				GenFeature metaFeature = ((FeatureLinkModelFacet) genLink.getModelFacet()).getMetaFeature();
				outgoingClass = metaFeature.getGenClass();
				incomingClass = metaFeature.getTypeGenClass();
			} else {
				continue;
			}
			if (incomingClass == null || incomingClass.getEcoreClass() == null || outgoingClass == null || outgoingClass.getEcoreClass() == null) {
				continue;
			}
			GenClass nodeMetaClass = getModelFacet().getMetaClass();
			boolean canBeSource = outgoingClass.getEcoreClass().isSuperTypeOf(nodeMetaClass.getEcoreClass());
			boolean canBeTarget = incomingClass.getEcoreClass().isSuperTypeOf(nodeMetaClass.getEcoreClass());
/*
 * This logic is currently alligned with the logic in NodeItemSemanticEditPolicy.javajet i.e.:
 *
 * - we do not perform link rotation if this link could be drawn from instance of this EP 
 *   to the instance of this EP.
 *
 * - if link could be created in "opposite" direction (genLink.isIncomingCreationAllowed() == true)
 *   and this EP could be only a source of the link then we should reverse link at the end of link 
 *   creation
 *
 */
			if (canBeSource && canBeTarget) {
				continue;
			}
			if (genLink.isIncomingCreationAllowed() && canBeSource) {
				reorientedLinks.add(genLink);
			}
		}
		return new EcoreEList.UnmodifiableEList<GenLink>(this, GMFGenPackage.eINSTANCE.getGenNode_ReorientedIncomingLinks(), reorientedLinks.size(), reorientedLinks.toArray());
	}
	
	public boolean isSansDomain() {
		return getModelFacet() == null;
	}
} //GenNodeImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.Collection;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.codegen.gmfgen.FeatureModelFacet;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenLinkConstraints;
import org.eclipse.gmf.codegen.gmfgen.GenLinkLabel;
import org.eclipse.gmf.codegen.gmfgen.LinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.TypeLinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.Viewmap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#getModelFacet <em>Model Facet</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#isOutgoingCreationAllowed <em>Outgoing Creation Allowed</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#isIncomingCreationAllowed <em>Incoming Creation Allowed</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#isViewDirectionAlignedWithModel <em>View Direction Aligned With Model</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#getCreationConstraints <em>Creation Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenLinkImpl extends GenCommonBaseImpl implements GenLink {
	/**
	 * The cached value of the '{@link #getModelFacet() <em>Model Facet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelFacet()
	 * @generated
	 * @ordered
	 */
	protected LinkModelFacet modelFacet = null;

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
	 * The default value of the '{@link #isOutgoingCreationAllowed() <em>Outgoing Creation Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutgoingCreationAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OUTGOING_CREATION_ALLOWED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isOutgoingCreationAllowed() <em>Outgoing Creation Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutgoingCreationAllowed()
	 * @generated
	 * @ordered
	 */
	protected boolean outgoingCreationAllowed = OUTGOING_CREATION_ALLOWED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIncomingCreationAllowed() <em>Incoming Creation Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncomingCreationAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCOMING_CREATION_ALLOWED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIncomingCreationAllowed() <em>Incoming Creation Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncomingCreationAllowed()
	 * @generated
	 * @ordered
	 */
	protected boolean incomingCreationAllowed = INCOMING_CREATION_ALLOWED_EDEFAULT;

	/**
	 * The default value of the '{@link #isViewDirectionAlignedWithModel() <em>View Direction Aligned With Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isViewDirectionAlignedWithModel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VIEW_DIRECTION_ALIGNED_WITH_MODEL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isViewDirectionAlignedWithModel() <em>View Direction Aligned With Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isViewDirectionAlignedWithModel()
	 * @generated
	 * @ordered
	 */
	protected boolean viewDirectionAlignedWithModel = VIEW_DIRECTION_ALIGNED_WITH_MODEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCreationConstraints() <em>Creation Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationConstraints()
	 * @generated
	 * @ordered
	 */
	protected GenLinkConstraints creationConstraints = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenLink();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDiagram getDiagram() {
		if (eContainerFeatureID != GMFGenPackage.GEN_LINK__DIAGRAM) return null;
		return (GenDiagram)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkModelFacet getModelFacet() {
		return modelFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelFacet(LinkModelFacet newModelFacet, NotificationChain msgs) {
		LinkModelFacet oldModelFacet = modelFacet;
		modelFacet = newModelFacet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_LINK__MODEL_FACET, oldModelFacet, newModelFacet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelFacet(LinkModelFacet newModelFacet) {
		if (newModelFacet != modelFacet) {
			NotificationChain msgs = null;
			if (modelFacet != null)
				msgs = ((InternalEObject)modelFacet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_LINK__MODEL_FACET, null, msgs);
			if (newModelFacet != null)
				msgs = ((InternalEObject)newModelFacet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_LINK__MODEL_FACET, null, msgs);
			msgs = basicSetModelFacet(newModelFacet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_LINK__MODEL_FACET, newModelFacet, newModelFacet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLabels() {
		if (labels == null) {
			labels = new EObjectContainmentWithInverseEList(GenLinkLabel.class, this, GMFGenPackage.GEN_LINK__LABELS, GMFGenPackage.GEN_LINK_LABEL__LINK);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOutgoingCreationAllowed() {
		return outgoingCreationAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutgoingCreationAllowed(boolean newOutgoingCreationAllowed) {
		boolean oldOutgoingCreationAllowed = outgoingCreationAllowed;
		outgoingCreationAllowed = newOutgoingCreationAllowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_LINK__OUTGOING_CREATION_ALLOWED, oldOutgoingCreationAllowed, outgoingCreationAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncomingCreationAllowed() {
		return incomingCreationAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncomingCreationAllowed(boolean newIncomingCreationAllowed) {
		boolean oldIncomingCreationAllowed = incomingCreationAllowed;
		incomingCreationAllowed = newIncomingCreationAllowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_LINK__INCOMING_CREATION_ALLOWED, oldIncomingCreationAllowed, incomingCreationAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isViewDirectionAlignedWithModel() {
		return viewDirectionAlignedWithModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewDirectionAlignedWithModel(boolean newViewDirectionAlignedWithModel) {
		boolean oldViewDirectionAlignedWithModel = viewDirectionAlignedWithModel;
		viewDirectionAlignedWithModel = newViewDirectionAlignedWithModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_LINK__VIEW_DIRECTION_ALIGNED_WITH_MODEL, oldViewDirectionAlignedWithModel, viewDirectionAlignedWithModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenLinkConstraints getCreationConstraints() {
		return creationConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreationConstraints(GenLinkConstraints newCreationConstraints, NotificationChain msgs) {
		GenLinkConstraints oldCreationConstraints = creationConstraints;
		creationConstraints = newCreationConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_LINK__CREATION_CONSTRAINTS, oldCreationConstraints, newCreationConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationConstraints(GenLinkConstraints newCreationConstraints) {
		if (newCreationConstraints != creationConstraints) {
			NotificationChain msgs = null;
			if (creationConstraints != null)
				msgs = ((InternalEObject)creationConstraints).eInverseRemove(this, GMFGenPackage.GEN_LINK_CONSTRAINTS__LINK, GenLinkConstraints.class, msgs);
			if (newCreationConstraints != null)
				msgs = ((InternalEObject)newCreationConstraints).eInverseAdd(this, GMFGenPackage.GEN_LINK_CONSTRAINTS__LINK, GenLinkConstraints.class, msgs);
			msgs = basicSetCreationConstraints(newCreationConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_LINK__CREATION_CONSTRAINTS, newCreationConstraints, newCreationConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGenPackage.GEN_LINK__DIAGRAM:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, GMFGenPackage.GEN_LINK__DIAGRAM, msgs);
				case GMFGenPackage.GEN_LINK__LABELS:
					return ((InternalEList)getLabels()).basicAdd(otherEnd, msgs);
				case GMFGenPackage.GEN_LINK__CREATION_CONSTRAINTS:
					if (creationConstraints != null)
						msgs = ((InternalEObject)creationConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_LINK__CREATION_CONSTRAINTS, null, msgs);
					return basicSetCreationConstraints((GenLinkConstraints)otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGenPackage.GEN_LINK__VIEWMAP:
					return basicSetViewmap(null, msgs);
				case GMFGenPackage.GEN_LINK__DIAGRAM:
					return eBasicSetContainer(null, GMFGenPackage.GEN_LINK__DIAGRAM, msgs);
				case GMFGenPackage.GEN_LINK__MODEL_FACET:
					return basicSetModelFacet(null, msgs);
				case GMFGenPackage.GEN_LINK__LABELS:
					return ((InternalEList)getLabels()).basicRemove(otherEnd, msgs);
				case GMFGenPackage.GEN_LINK__CREATION_CONSTRAINTS:
					return basicSetCreationConstraints(null, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case GMFGenPackage.GEN_LINK__DIAGRAM:
					return eContainer.eInverseRemove(this, GMFGenPackage.GEN_DIAGRAM__LINKS, GenDiagram.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.GEN_LINK__DIAGRAM_RUN_TIME_CLASS:
				if (resolve) return getDiagramRunTimeClass();
				return basicGetDiagramRunTimeClass();
			case GMFGenPackage.GEN_LINK__VISUAL_ID:
				return new Integer(getVisualID());
			case GMFGenPackage.GEN_LINK__EDIT_PART_CLASS_NAME:
				return getEditPartClassName();
			case GMFGenPackage.GEN_LINK__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				return getItemSemanticEditPolicyClassName();
			case GMFGenPackage.GEN_LINK__NOTATION_VIEW_FACTORY_CLASS_NAME:
				return getNotationViewFactoryClassName();
			case GMFGenPackage.GEN_LINK__VIEWMAP:
				return getViewmap();
			case GMFGenPackage.GEN_LINK__DIAGRAM:
				return getDiagram();
			case GMFGenPackage.GEN_LINK__MODEL_FACET:
				return getModelFacet();
			case GMFGenPackage.GEN_LINK__LABELS:
				return getLabels();
			case GMFGenPackage.GEN_LINK__OUTGOING_CREATION_ALLOWED:
				return isOutgoingCreationAllowed() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_LINK__INCOMING_CREATION_ALLOWED:
				return isIncomingCreationAllowed() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_LINK__VIEW_DIRECTION_ALIGNED_WITH_MODEL:
				return isViewDirectionAlignedWithModel() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_LINK__CREATION_CONSTRAINTS:
				return getCreationConstraints();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.GEN_LINK__DIAGRAM_RUN_TIME_CLASS:
				setDiagramRunTimeClass((GenClass)newValue);
				return;
			case GMFGenPackage.GEN_LINK__VISUAL_ID:
				setVisualID(((Integer)newValue).intValue());
				return;
			case GMFGenPackage.GEN_LINK__EDIT_PART_CLASS_NAME:
				setEditPartClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_LINK__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				setItemSemanticEditPolicyClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_LINK__NOTATION_VIEW_FACTORY_CLASS_NAME:
				setNotationViewFactoryClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_LINK__VIEWMAP:
				setViewmap((Viewmap)newValue);
				return;
			case GMFGenPackage.GEN_LINK__MODEL_FACET:
				setModelFacet((LinkModelFacet)newValue);
				return;
			case GMFGenPackage.GEN_LINK__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection)newValue);
				return;
			case GMFGenPackage.GEN_LINK__OUTGOING_CREATION_ALLOWED:
				setOutgoingCreationAllowed(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_LINK__INCOMING_CREATION_ALLOWED:
				setIncomingCreationAllowed(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_LINK__VIEW_DIRECTION_ALIGNED_WITH_MODEL:
				setViewDirectionAlignedWithModel(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_LINK__CREATION_CONSTRAINTS:
				setCreationConstraints((GenLinkConstraints)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.GEN_LINK__DIAGRAM_RUN_TIME_CLASS:
				setDiagramRunTimeClass((GenClass)null);
				return;
			case GMFGenPackage.GEN_LINK__VISUAL_ID:
				setVisualID(VISUAL_ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_LINK__EDIT_PART_CLASS_NAME:
				setEditPartClassName(EDIT_PART_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_LINK__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				setItemSemanticEditPolicyClassName(ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_LINK__NOTATION_VIEW_FACTORY_CLASS_NAME:
				setNotationViewFactoryClassName(NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_LINK__VIEWMAP:
				setViewmap((Viewmap)null);
				return;
			case GMFGenPackage.GEN_LINK__MODEL_FACET:
				setModelFacet((LinkModelFacet)null);
				return;
			case GMFGenPackage.GEN_LINK__LABELS:
				getLabels().clear();
				return;
			case GMFGenPackage.GEN_LINK__OUTGOING_CREATION_ALLOWED:
				setOutgoingCreationAllowed(OUTGOING_CREATION_ALLOWED_EDEFAULT);
				return;
			case GMFGenPackage.GEN_LINK__INCOMING_CREATION_ALLOWED:
				setIncomingCreationAllowed(INCOMING_CREATION_ALLOWED_EDEFAULT);
				return;
			case GMFGenPackage.GEN_LINK__VIEW_DIRECTION_ALIGNED_WITH_MODEL:
				setViewDirectionAlignedWithModel(VIEW_DIRECTION_ALIGNED_WITH_MODEL_EDEFAULT);
				return;
			case GMFGenPackage.GEN_LINK__CREATION_CONSTRAINTS:
				setCreationConstraints((GenLinkConstraints)null);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.GEN_LINK__DIAGRAM_RUN_TIME_CLASS:
				return diagramRunTimeClass != null;
			case GMFGenPackage.GEN_LINK__VISUAL_ID:
				return visualID != VISUAL_ID_EDEFAULT;
			case GMFGenPackage.GEN_LINK__EDIT_PART_CLASS_NAME:
				return EDIT_PART_CLASS_NAME_EDEFAULT == null ? editPartClassName != null : !EDIT_PART_CLASS_NAME_EDEFAULT.equals(editPartClassName);
			case GMFGenPackage.GEN_LINK__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				return ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME_EDEFAULT == null ? itemSemanticEditPolicyClassName != null : !ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME_EDEFAULT.equals(itemSemanticEditPolicyClassName);
			case GMFGenPackage.GEN_LINK__NOTATION_VIEW_FACTORY_CLASS_NAME:
				return NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT == null ? notationViewFactoryClassName != null : !NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT.equals(notationViewFactoryClassName);
			case GMFGenPackage.GEN_LINK__VIEWMAP:
				return viewmap != null;
			case GMFGenPackage.GEN_LINK__DIAGRAM:
				return getDiagram() != null;
			case GMFGenPackage.GEN_LINK__MODEL_FACET:
				return modelFacet != null;
			case GMFGenPackage.GEN_LINK__LABELS:
				return labels != null && !labels.isEmpty();
			case GMFGenPackage.GEN_LINK__OUTGOING_CREATION_ALLOWED:
				return outgoingCreationAllowed != OUTGOING_CREATION_ALLOWED_EDEFAULT;
			case GMFGenPackage.GEN_LINK__INCOMING_CREATION_ALLOWED:
				return incomingCreationAllowed != INCOMING_CREATION_ALLOWED_EDEFAULT;
			case GMFGenPackage.GEN_LINK__VIEW_DIRECTION_ALIGNED_WITH_MODEL:
				return viewDirectionAlignedWithModel != VIEW_DIRECTION_ALIGNED_WITH_MODEL_EDEFAULT;
			case GMFGenPackage.GEN_LINK__CREATION_CONSTRAINTS:
				return creationConstraints != null;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (outgoingCreationAllowed: ");
		result.append(outgoingCreationAllowed);
		result.append(", incomingCreationAllowed: ");
		result.append(incomingCreationAllowed);
		result.append(", viewDirectionAlignedWithModel: ");
		result.append(viewDirectionAlignedWithModel);
		result.append(')');
		return result.toString();
	}

	public String getClassNamePrefix() {
		LinkModelFacet aModelFacet = getModelFacet();
		if (aModelFacet instanceof FeatureModelFacet) {
			GenFeature metaFeature = ((FeatureModelFacet) aModelFacet).getMetaFeature();
			return metaFeature.getGenClass().getName() + metaFeature.getCapName();
		} else if (aModelFacet instanceof TypeLinkModelFacet) {
			GenClass metaClass = ((TypeLinkModelFacet) aModelFacet).getMetaClass();
			return metaClass.getName();
		}
		return "Link$" + hashCode();
	}

	public String getClassNameSuffux() {
		return "Link";
	}

	public String getUniqueIdentifier() {
		return getClassNamePrefix() + "_" + getVisualID();
	}

} //GenLinkImpl

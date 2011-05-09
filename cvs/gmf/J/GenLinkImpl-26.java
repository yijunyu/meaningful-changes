/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.codegen.gmfgen.ElementType;
import org.eclipse.gmf.codegen.gmfgen.FeatureLinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenLinkConstraints;
import org.eclipse.gmf.codegen.gmfgen.GenLinkLabel;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.LinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.TypeLinkModelFacet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#getEditHelperClassName <em>Edit Helper Class Name</em>}</li>
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
	protected static final boolean INCOMING_CREATION_ALLOWED_EDEFAULT = false;

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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_LINK__EDIT_HELPER_CLASS_NAME, oldEditHelperClassName, editHelperClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDiagram getDiagram() {
		if (eContainerFeatureID != GMFGenPackage.GEN_LINK__DIAGRAM) return null;
		return (GenDiagram)eContainer();
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
	 * @generated NOT
	 */
	public String getEditHelperQualifiedClassName() {
		return getDiagram().getEditHelpersPackageName() + '.' + getEditHelperClassName();
	}

	protected EList getParticipants(EList participantTypes) {
		BasicEList participants = new BasicEList();
		for (Iterator nodes = getDiagram().getAllNodes().iterator(); nodes.hasNext();) {
			GenNode node = (GenNode) nodes.next();
			if (node.getModelFacet() != null) {
				GenClass nodeType = node.getModelFacet().getMetaClass();
				if (participantTypes.contains(nodeType)) {
					participants.add(node);
				}
			}
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getSources() {
		if (getModelFacet() == null) {
			return new BasicEList();
		}
		return getParticipants(getModelFacet().getSourceTypes());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getTargets() {
		if (getModelFacet() == null) {
			return new BasicEList();
		}
		return getParticipants(getModelFacet().getTargetTypes());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_LINK__DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, GMFGenPackage.GEN_LINK__DIAGRAM, msgs);
			case GMFGenPackage.GEN_LINK__LABELS:
				return ((InternalEList)getLabels()).basicAdd(otherEnd, msgs);
			case GMFGenPackage.GEN_LINK__CREATION_CONSTRAINTS:
				if (creationConstraints != null)
					msgs = ((InternalEObject)creationConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_LINK__CREATION_CONSTRAINTS, null, msgs);
				return basicSetCreationConstraints((GenLinkConstraints)otherEnd, msgs);
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
			case GMFGenPackage.GEN_LINK__DIAGRAM:
				return eBasicSetContainer(null, GMFGenPackage.GEN_LINK__DIAGRAM, msgs);
			case GMFGenPackage.GEN_LINK__MODEL_FACET:
				return basicSetModelFacet(null, msgs);
			case GMFGenPackage.GEN_LINK__LABELS:
				return ((InternalEList)getLabels()).basicRemove(otherEnd, msgs);
			case GMFGenPackage.GEN_LINK__CREATION_CONSTRAINTS:
				return basicSetCreationConstraints(null, msgs);
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
			case GMFGenPackage.GEN_LINK__DIAGRAM:
				return eInternalContainer().eInverseRemove(this, GMFGenPackage.GEN_DIAGRAM__LINKS, GenDiagram.class, msgs);
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
			case GMFGenPackage.GEN_LINK__EDIT_HELPER_CLASS_NAME:
				return getEditHelperClassName();
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
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMFGenPackage.GEN_LINK__EDIT_HELPER_CLASS_NAME:
				setEditHelperClassName((String)newValue);
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
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case GMFGenPackage.GEN_LINK__EDIT_HELPER_CLASS_NAME:
				setEditHelperClassName(EDIT_HELPER_CLASS_NAME_EDEFAULT);
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
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GMFGenPackage.GEN_LINK__EDIT_HELPER_CLASS_NAME:
				return EDIT_HELPER_CLASS_NAME_EDEFAULT == null ? editHelperClassName != null : !EDIT_HELPER_CLASS_NAME_EDEFAULT.equals(editHelperClassName);
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
				case GMFGenPackage.GEN_LINK__EDIT_HELPER_CLASS_NAME: return GMFGenPackage.ELEMENT_TYPE__EDIT_HELPER_CLASS_NAME;
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
				case GMFGenPackage.ELEMENT_TYPE__EDIT_HELPER_CLASS_NAME: return GMFGenPackage.GEN_LINK__EDIT_HELPER_CLASS_NAME;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (editHelperClassName: ");
		result.append(editHelperClassName);
		result.append(", outgoingCreationAllowed: ");
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
		if (aModelFacet instanceof FeatureLinkModelFacet) {
			GenFeature metaFeature = ((FeatureLinkModelFacet) aModelFacet).getMetaFeature();
			return metaFeature.getGenClass().getName() + metaFeature.getCapName();
		} else if (aModelFacet instanceof TypeLinkModelFacet) {
			GenClass metaClass = ((TypeLinkModelFacet) aModelFacet).getMetaClass();
			return metaClass.getName();
		}
		return "Unknown";
	}

	public String getClassNameSuffux() {
		return "Link";
	}

	public String getUniqueIdentifier() {
		return getClassNamePrefix() + "_" + getVisualID();
	}

} //GenLinkImpl

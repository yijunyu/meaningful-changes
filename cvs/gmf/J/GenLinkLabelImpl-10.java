/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.codegen.gmfgen.FeatureModelFacet;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenLinkLabel;
import org.eclipse.gmf.codegen.gmfgen.LinkLabelAlignment;
import org.eclipse.gmf.codegen.gmfgen.Viewmap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Link Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkLabelImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkLabelImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkLabelImpl#getTextEditPartClassName <em>Text Edit Part Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkLabelImpl#getTextNotationViewFactoryClassName <em>Text Notation View Factory Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenLinkLabelImpl extends GenLabelImpl implements GenLinkLabel {
	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final LinkLabelAlignment ALIGNMENT_EDEFAULT = LinkLabelAlignment.MIDDLE_LITERAL;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected LinkLabelAlignment alignment = ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextEditPartClassName() <em>Text Edit Part Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextEditPartClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDIT_PART_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextEditPartClassName() <em>Text Edit Part Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextEditPartClassName()
	 * @generated
	 * @ordered
	 */
	protected String textEditPartClassName = TEXT_EDIT_PART_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextNotationViewFactoryClassName() <em>Text Notation View Factory Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextNotationViewFactoryClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextNotationViewFactoryClassName() <em>Text Notation View Factory Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextNotationViewFactoryClassName()
	 * @generated
	 * @ordered
	 */
	protected String textNotationViewFactoryClassName = TEXT_NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenLinkLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenLinkLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenLink getLink() {
		if (eContainerFeatureID != GMFGenPackage.GEN_LINK_LABEL__LINK) return null;
		return (GenLink)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(GenLink newLink) {
		if (newLink != eContainer || (eContainerFeatureID != GMFGenPackage.GEN_LINK_LABEL__LINK && newLink != null)) {
			if (EcoreUtil.isAncestor(this, newLink))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLink != null)
				msgs = ((InternalEObject)newLink).eInverseAdd(this, GMFGenPackage.GEN_LINK__LABELS, GenLink.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newLink, GMFGenPackage.GEN_LINK_LABEL__LINK, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_LINK_LABEL__LINK, newLink, newLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkLabelAlignment getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment(LinkLabelAlignment newAlignment) {
		LinkLabelAlignment oldAlignment = alignment;
		alignment = newAlignment == null ? ALIGNMENT_EDEFAULT : newAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_LINK_LABEL__ALIGNMENT, oldAlignment, alignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextEditPartClassNameGen() {
		return textEditPartClassName;
	}

	public String getTextEditPartClassName() {
		String value = getTextEditPartClassNameGen();
		if (isEmpty(value)) {
			value = getClassNamePart() + TEXT_EDIT_PART_SUFFIX;
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextEditPartClassName(String newTextEditPartClassName) {
		String oldTextEditPartClassName = textEditPartClassName;
		textEditPartClassName = newTextEditPartClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_LINK_LABEL__TEXT_EDIT_PART_CLASS_NAME, oldTextEditPartClassName, textEditPartClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextNotationViewFactoryClassNameGen() {
		return textNotationViewFactoryClassName;
	}

	public String getTextNotationViewFactoryClassName() {
		String value = getTextNotationViewFactoryClassNameGen();
		if (isEmpty(value)) {
			value = getClassNamePart() + TEXT_NOTATION_VIEW_FACTORY_SUFFIX;
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextNotationViewFactoryClassName(String newTextNotationViewFactoryClassName) {
		String oldTextNotationViewFactoryClassName = textNotationViewFactoryClassName;
		textNotationViewFactoryClassName = newTextNotationViewFactoryClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_LINK_LABEL__TEXT_NOTATION_VIEW_FACTORY_CLASS_NAME, oldTextNotationViewFactoryClassName, textNotationViewFactoryClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getTextEditPartQualifiedClassName() {
		return getDiagram().getEditPartsPackageName() + '.' + getTextEditPartClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getTextNotationViewFactoryQualifiedClassName() {
		return getDiagram().getNotationViewFactoriesPackageName() + '.' + getTextNotationViewFactoryClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getSemanticHintLabelFieldName() {
		return GenCommonBaseImpl.asJavaConstantName(getUniqueIdentifier()) + "_LABEL"; //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGenPackage.GEN_LINK_LABEL__LINK:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, GMFGenPackage.GEN_LINK_LABEL__LINK, msgs);
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
				case GMFGenPackage.GEN_LINK_LABEL__VIEWMAP:
					return basicSetViewmap(null, msgs);
				case GMFGenPackage.GEN_LINK_LABEL__MODEL_FACET:
					return basicSetModelFacet(null, msgs);
				case GMFGenPackage.GEN_LINK_LABEL__LINK:
					return eBasicSetContainer(null, GMFGenPackage.GEN_LINK_LABEL__LINK, msgs);
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
				case GMFGenPackage.GEN_LINK_LABEL__LINK:
					return eContainer.eInverseRemove(this, GMFGenPackage.GEN_LINK__LABELS, GenLink.class, msgs);
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
			case GMFGenPackage.GEN_LINK_LABEL__DIAGRAM_RUN_TIME_CLASS:
				if (resolve) return getDiagramRunTimeClass();
				return basicGetDiagramRunTimeClass();
			case GMFGenPackage.GEN_LINK_LABEL__VISUAL_ID:
				return new Integer(getVisualID());
			case GMFGenPackage.GEN_LINK_LABEL__EDIT_PART_CLASS_NAME:
				return getEditPartClassName();
			case GMFGenPackage.GEN_LINK_LABEL__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				return getItemSemanticEditPolicyClassName();
			case GMFGenPackage.GEN_LINK_LABEL__NOTATION_VIEW_FACTORY_CLASS_NAME:
				return getNotationViewFactoryClassName();
			case GMFGenPackage.GEN_LINK_LABEL__VIEWMAP:
				return getViewmap();
			case GMFGenPackage.GEN_LINK_LABEL__READ_ONLY:
				return isReadOnly() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_LINK_LABEL__MODEL_FACET:
				return getModelFacet();
			case GMFGenPackage.GEN_LINK_LABEL__LINK:
				return getLink();
			case GMFGenPackage.GEN_LINK_LABEL__ALIGNMENT:
				return getAlignment();
			case GMFGenPackage.GEN_LINK_LABEL__TEXT_EDIT_PART_CLASS_NAME:
				return getTextEditPartClassName();
			case GMFGenPackage.GEN_LINK_LABEL__TEXT_NOTATION_VIEW_FACTORY_CLASS_NAME:
				return getTextNotationViewFactoryClassName();
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
			case GMFGenPackage.GEN_LINK_LABEL__DIAGRAM_RUN_TIME_CLASS:
				setDiagramRunTimeClass((GenClass)newValue);
				return;
			case GMFGenPackage.GEN_LINK_LABEL__VISUAL_ID:
				setVisualID(((Integer)newValue).intValue());
				return;
			case GMFGenPackage.GEN_LINK_LABEL__EDIT_PART_CLASS_NAME:
				setEditPartClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_LINK_LABEL__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				setItemSemanticEditPolicyClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_LINK_LABEL__NOTATION_VIEW_FACTORY_CLASS_NAME:
				setNotationViewFactoryClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_LINK_LABEL__VIEWMAP:
				setViewmap((Viewmap)newValue);
				return;
			case GMFGenPackage.GEN_LINK_LABEL__READ_ONLY:
				setReadOnly(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_LINK_LABEL__MODEL_FACET:
				setModelFacet((FeatureModelFacet)newValue);
				return;
			case GMFGenPackage.GEN_LINK_LABEL__LINK:
				setLink((GenLink)newValue);
				return;
			case GMFGenPackage.GEN_LINK_LABEL__ALIGNMENT:
				setAlignment((LinkLabelAlignment)newValue);
				return;
			case GMFGenPackage.GEN_LINK_LABEL__TEXT_EDIT_PART_CLASS_NAME:
				setTextEditPartClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_LINK_LABEL__TEXT_NOTATION_VIEW_FACTORY_CLASS_NAME:
				setTextNotationViewFactoryClassName((String)newValue);
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
			case GMFGenPackage.GEN_LINK_LABEL__DIAGRAM_RUN_TIME_CLASS:
				setDiagramRunTimeClass((GenClass)null);
				return;
			case GMFGenPackage.GEN_LINK_LABEL__VISUAL_ID:
				setVisualID(VISUAL_ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_LINK_LABEL__EDIT_PART_CLASS_NAME:
				setEditPartClassName(EDIT_PART_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_LINK_LABEL__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				setItemSemanticEditPolicyClassName(ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_LINK_LABEL__NOTATION_VIEW_FACTORY_CLASS_NAME:
				setNotationViewFactoryClassName(NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_LINK_LABEL__VIEWMAP:
				setViewmap((Viewmap)null);
				return;
			case GMFGenPackage.GEN_LINK_LABEL__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case GMFGenPackage.GEN_LINK_LABEL__MODEL_FACET:
				setModelFacet((FeatureModelFacet)null);
				return;
			case GMFGenPackage.GEN_LINK_LABEL__LINK:
				setLink((GenLink)null);
				return;
			case GMFGenPackage.GEN_LINK_LABEL__ALIGNMENT:
				setAlignment(ALIGNMENT_EDEFAULT);
				return;
			case GMFGenPackage.GEN_LINK_LABEL__TEXT_EDIT_PART_CLASS_NAME:
				setTextEditPartClassName(TEXT_EDIT_PART_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_LINK_LABEL__TEXT_NOTATION_VIEW_FACTORY_CLASS_NAME:
				setTextNotationViewFactoryClassName(TEXT_NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT);
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
			case GMFGenPackage.GEN_LINK_LABEL__DIAGRAM_RUN_TIME_CLASS:
				return diagramRunTimeClass != null;
			case GMFGenPackage.GEN_LINK_LABEL__VISUAL_ID:
				return visualID != VISUAL_ID_EDEFAULT;
			case GMFGenPackage.GEN_LINK_LABEL__EDIT_PART_CLASS_NAME:
				return EDIT_PART_CLASS_NAME_EDEFAULT == null ? editPartClassName != null : !EDIT_PART_CLASS_NAME_EDEFAULT.equals(editPartClassName);
			case GMFGenPackage.GEN_LINK_LABEL__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				return ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME_EDEFAULT == null ? itemSemanticEditPolicyClassName != null : !ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME_EDEFAULT.equals(itemSemanticEditPolicyClassName);
			case GMFGenPackage.GEN_LINK_LABEL__NOTATION_VIEW_FACTORY_CLASS_NAME:
				return NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT == null ? notationViewFactoryClassName != null : !NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT.equals(notationViewFactoryClassName);
			case GMFGenPackage.GEN_LINK_LABEL__VIEWMAP:
				return viewmap != null;
			case GMFGenPackage.GEN_LINK_LABEL__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
			case GMFGenPackage.GEN_LINK_LABEL__MODEL_FACET:
				return modelFacet != null;
			case GMFGenPackage.GEN_LINK_LABEL__LINK:
				return getLink() != null;
			case GMFGenPackage.GEN_LINK_LABEL__ALIGNMENT:
				return alignment != ALIGNMENT_EDEFAULT;
			case GMFGenPackage.GEN_LINK_LABEL__TEXT_EDIT_PART_CLASS_NAME:
				return TEXT_EDIT_PART_CLASS_NAME_EDEFAULT == null ? textEditPartClassName != null : !TEXT_EDIT_PART_CLASS_NAME_EDEFAULT.equals(textEditPartClassName);
			case GMFGenPackage.GEN_LINK_LABEL__TEXT_NOTATION_VIEW_FACTORY_CLASS_NAME:
				return TEXT_NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT == null ? textNotationViewFactoryClassName != null : !TEXT_NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT.equals(textNotationViewFactoryClassName);
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
		result.append(" (alignment: ");
		result.append(alignment);
		result.append(", textEditPartClassName: ");
		result.append(textEditPartClassName);
		result.append(", textNotationViewFactoryClassName: ");
		result.append(textNotationViewFactoryClassName);
		result.append(')');
		return result.toString();
	}

	public GenDiagram getDiagram() {
		return getLink().getDiagram();
	}

	public String getClassNameSuffux() {
		return "LinkLabel";
	}

	protected String getHostName() {
		return getLink().getClassNamePrefix();
	}

} //GenLinkLabelImpl

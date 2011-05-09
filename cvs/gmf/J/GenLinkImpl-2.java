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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#getDomainLinkTargetFeature <em>Domain Link Target Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#getFigureQualifiedClassName <em>Figure Qualified Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#getSourceDecorationFigureQualifiedClassName <em>Source Decoration Figure Qualified Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#getTargetDecorationFigureQualifiedClassName <em>Target Decoration Figure Qualified Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenLinkImpl extends GenBaseElementImpl implements GenLink {
	/**
	 * The cached value of the '{@link #getDomainLinkTargetFeature() <em>Domain Link Target Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainLinkTargetFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature domainLinkTargetFeature = null;

	/**
	 * The default value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected String lineStyle = LINE_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFigureQualifiedClassName() <em>Figure Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigureQualifiedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIGURE_QUALIFIED_CLASS_NAME_EDEFAULT = "org.eclipse.draw2d.PolylineConnection";

	/**
	 * The cached value of the '{@link #getFigureQualifiedClassName() <em>Figure Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigureQualifiedClassName()
	 * @generated
	 * @ordered
	 */
	protected String figureQualifiedClassName = FIGURE_QUALIFIED_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceDecorationFigureQualifiedClassName() <em>Source Decoration Figure Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDecorationFigureQualifiedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_DECORATION_FIGURE_QUALIFIED_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceDecorationFigureQualifiedClassName() <em>Source Decoration Figure Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDecorationFigureQualifiedClassName()
	 * @generated
	 * @ordered
	 */
	protected String sourceDecorationFigureQualifiedClassName = SOURCE_DECORATION_FIGURE_QUALIFIED_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetDecorationFigureQualifiedClassName() <em>Target Decoration Figure Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDecorationFigureQualifiedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_DECORATION_FIGURE_QUALIFIED_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetDecorationFigureQualifiedClassName() <em>Target Decoration Figure Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDecorationFigureQualifiedClassName()
	 * @generated
	 * @ordered
	 */
	protected String targetDecorationFigureQualifiedClassName = TARGET_DECORATION_FIGURE_QUALIFIED_CLASS_NAME_EDEFAULT;

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
	public EStructuralFeature getDomainLinkTargetFeature() {
		if (domainLinkTargetFeature != null && domainLinkTargetFeature.eIsProxy()) {
			EStructuralFeature oldDomainLinkTargetFeature = domainLinkTargetFeature;
			domainLinkTargetFeature = (EStructuralFeature)eResolveProxy((InternalEObject)domainLinkTargetFeature);
			if (domainLinkTargetFeature != oldDomainLinkTargetFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.GEN_LINK__DOMAIN_LINK_TARGET_FEATURE, oldDomainLinkTargetFeature, domainLinkTargetFeature));
			}
		}
		return domainLinkTargetFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetDomainLinkTargetFeature() {
		return domainLinkTargetFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainLinkTargetFeature(EStructuralFeature newDomainLinkTargetFeature) {
		EStructuralFeature oldDomainLinkTargetFeature = domainLinkTargetFeature;
		domainLinkTargetFeature = newDomainLinkTargetFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_LINK__DOMAIN_LINK_TARGET_FEATURE, oldDomainLinkTargetFeature, domainLinkTargetFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLineStyle() {
		return lineStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineStyle(String newLineStyle) {
		String oldLineStyle = lineStyle;
		lineStyle = newLineStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_LINK__LINE_STYLE, oldLineStyle, lineStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFigureQualifiedClassName() {
		return figureQualifiedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFigureQualifiedClassName(String newFigureQualifiedClassName) {
		String oldFigureQualifiedClassName = figureQualifiedClassName;
		figureQualifiedClassName = newFigureQualifiedClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_LINK__FIGURE_QUALIFIED_CLASS_NAME, oldFigureQualifiedClassName, figureQualifiedClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceDecorationFigureQualifiedClassName() {
		return sourceDecorationFigureQualifiedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDecorationFigureQualifiedClassName(String newSourceDecorationFigureQualifiedClassName) {
		String oldSourceDecorationFigureQualifiedClassName = sourceDecorationFigureQualifiedClassName;
		sourceDecorationFigureQualifiedClassName = newSourceDecorationFigureQualifiedClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_LINK__SOURCE_DECORATION_FIGURE_QUALIFIED_CLASS_NAME, oldSourceDecorationFigureQualifiedClassName, sourceDecorationFigureQualifiedClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetDecorationFigureQualifiedClassName() {
		return targetDecorationFigureQualifiedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDecorationFigureQualifiedClassName(String newTargetDecorationFigureQualifiedClassName) {
		String oldTargetDecorationFigureQualifiedClassName = targetDecorationFigureQualifiedClassName;
		targetDecorationFigureQualifiedClassName = newTargetDecorationFigureQualifiedClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_LINK__TARGET_DECORATION_FIGURE_QUALIFIED_CLASS_NAME, oldTargetDecorationFigureQualifiedClassName, targetDecorationFigureQualifiedClassName));
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
				case GMFGenPackage.GEN_LINK__DIAGRAM:
					return eBasicSetContainer(null, GMFGenPackage.GEN_LINK__DIAGRAM, msgs);
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
			case GMFGenPackage.GEN_LINK__META_INFO_PROVIDER_CLASS_NAME:
				return getMetaInfoProviderClassName();
			case GMFGenPackage.GEN_LINK__DOMAIN_NAME_FEATURE:
				if (resolve) return getDomainNameFeature();
				return basicGetDomainNameFeature();
			case GMFGenPackage.GEN_LINK__FOREGROUND_COLOR:
				return getForegroundColor();
			case GMFGenPackage.GEN_LINK__CONTAINMENT_META_FEATURE:
				if (resolve) return getContainmentMetaFeature();
				return basicGetContainmentMetaFeature();
			case GMFGenPackage.GEN_LINK__DIAGRAM:
				return getDiagram();
			case GMFGenPackage.GEN_LINK__DOMAIN_LINK_TARGET_FEATURE:
				if (resolve) return getDomainLinkTargetFeature();
				return basicGetDomainLinkTargetFeature();
			case GMFGenPackage.GEN_LINK__LINE_STYLE:
				return getLineStyle();
			case GMFGenPackage.GEN_LINK__FIGURE_QUALIFIED_CLASS_NAME:
				return getFigureQualifiedClassName();
			case GMFGenPackage.GEN_LINK__SOURCE_DECORATION_FIGURE_QUALIFIED_CLASS_NAME:
				return getSourceDecorationFigureQualifiedClassName();
			case GMFGenPackage.GEN_LINK__TARGET_DECORATION_FIGURE_QUALIFIED_CLASS_NAME:
				return getTargetDecorationFigureQualifiedClassName();
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
			case GMFGenPackage.GEN_LINK__META_INFO_PROVIDER_CLASS_NAME:
				setMetaInfoProviderClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_LINK__DOMAIN_NAME_FEATURE:
				setDomainNameFeature((EAttribute)newValue);
				return;
			case GMFGenPackage.GEN_LINK__FOREGROUND_COLOR:
				setForegroundColor((String)newValue);
				return;
			case GMFGenPackage.GEN_LINK__CONTAINMENT_META_FEATURE:
				setContainmentMetaFeature((EReference)newValue);
				return;
			case GMFGenPackage.GEN_LINK__DOMAIN_LINK_TARGET_FEATURE:
				setDomainLinkTargetFeature((EStructuralFeature)newValue);
				return;
			case GMFGenPackage.GEN_LINK__LINE_STYLE:
				setLineStyle((String)newValue);
				return;
			case GMFGenPackage.GEN_LINK__FIGURE_QUALIFIED_CLASS_NAME:
				setFigureQualifiedClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_LINK__SOURCE_DECORATION_FIGURE_QUALIFIED_CLASS_NAME:
				setSourceDecorationFigureQualifiedClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_LINK__TARGET_DECORATION_FIGURE_QUALIFIED_CLASS_NAME:
				setTargetDecorationFigureQualifiedClassName((String)newValue);
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
			case GMFGenPackage.GEN_LINK__META_INFO_PROVIDER_CLASS_NAME:
				setMetaInfoProviderClassName(META_INFO_PROVIDER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_LINK__DOMAIN_NAME_FEATURE:
				setDomainNameFeature((EAttribute)null);
				return;
			case GMFGenPackage.GEN_LINK__FOREGROUND_COLOR:
				setForegroundColor(FOREGROUND_COLOR_EDEFAULT);
				return;
			case GMFGenPackage.GEN_LINK__CONTAINMENT_META_FEATURE:
				setContainmentMetaFeature((EReference)null);
				return;
			case GMFGenPackage.GEN_LINK__DOMAIN_LINK_TARGET_FEATURE:
				setDomainLinkTargetFeature((EStructuralFeature)null);
				return;
			case GMFGenPackage.GEN_LINK__LINE_STYLE:
				setLineStyle(LINE_STYLE_EDEFAULT);
				return;
			case GMFGenPackage.GEN_LINK__FIGURE_QUALIFIED_CLASS_NAME:
				setFigureQualifiedClassName(FIGURE_QUALIFIED_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_LINK__SOURCE_DECORATION_FIGURE_QUALIFIED_CLASS_NAME:
				setSourceDecorationFigureQualifiedClassName(SOURCE_DECORATION_FIGURE_QUALIFIED_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_LINK__TARGET_DECORATION_FIGURE_QUALIFIED_CLASS_NAME:
				setTargetDecorationFigureQualifiedClassName(TARGET_DECORATION_FIGURE_QUALIFIED_CLASS_NAME_EDEFAULT);
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
			case GMFGenPackage.GEN_LINK__META_INFO_PROVIDER_CLASS_NAME:
				return META_INFO_PROVIDER_CLASS_NAME_EDEFAULT == null ? metaInfoProviderClassName != null : !META_INFO_PROVIDER_CLASS_NAME_EDEFAULT.equals(metaInfoProviderClassName);
			case GMFGenPackage.GEN_LINK__DOMAIN_NAME_FEATURE:
				return domainNameFeature != null;
			case GMFGenPackage.GEN_LINK__FOREGROUND_COLOR:
				return FOREGROUND_COLOR_EDEFAULT == null ? foregroundColor != null : !FOREGROUND_COLOR_EDEFAULT.equals(foregroundColor);
			case GMFGenPackage.GEN_LINK__CONTAINMENT_META_FEATURE:
				return containmentMetaFeature != null;
			case GMFGenPackage.GEN_LINK__DIAGRAM:
				return getDiagram() != null;
			case GMFGenPackage.GEN_LINK__DOMAIN_LINK_TARGET_FEATURE:
				return domainLinkTargetFeature != null;
			case GMFGenPackage.GEN_LINK__LINE_STYLE:
				return LINE_STYLE_EDEFAULT == null ? lineStyle != null : !LINE_STYLE_EDEFAULT.equals(lineStyle);
			case GMFGenPackage.GEN_LINK__FIGURE_QUALIFIED_CLASS_NAME:
				return FIGURE_QUALIFIED_CLASS_NAME_EDEFAULT == null ? figureQualifiedClassName != null : !FIGURE_QUALIFIED_CLASS_NAME_EDEFAULT.equals(figureQualifiedClassName);
			case GMFGenPackage.GEN_LINK__SOURCE_DECORATION_FIGURE_QUALIFIED_CLASS_NAME:
				return SOURCE_DECORATION_FIGURE_QUALIFIED_CLASS_NAME_EDEFAULT == null ? sourceDecorationFigureQualifiedClassName != null : !SOURCE_DECORATION_FIGURE_QUALIFIED_CLASS_NAME_EDEFAULT.equals(sourceDecorationFigureQualifiedClassName);
			case GMFGenPackage.GEN_LINK__TARGET_DECORATION_FIGURE_QUALIFIED_CLASS_NAME:
				return TARGET_DECORATION_FIGURE_QUALIFIED_CLASS_NAME_EDEFAULT == null ? targetDecorationFigureQualifiedClassName != null : !TARGET_DECORATION_FIGURE_QUALIFIED_CLASS_NAME_EDEFAULT.equals(targetDecorationFigureQualifiedClassName);
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
		result.append(" (lineStyle: ");
		result.append(lineStyle);
		result.append(", figureQualifiedClassName: ");
		result.append(figureQualifiedClassName);
		result.append(", sourceDecorationFigureQualifiedClassName: ");
		result.append(sourceDecorationFigureQualifiedClassName);
		result.append(", targetDecorationFigureQualifiedClassName: ");
		result.append(targetDecorationFigureQualifiedClassName);
		result.append(')');
		return result.toString();
	}

} //GenLinkImpl

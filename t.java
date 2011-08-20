/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenBaseElement;
/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Base Element</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenBaseElementImpl#getDomainNameFeature <em>Domain Name Feature</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenBaseElementImpl#getForegroundColor <em>Foreground Color</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenBaseElementImpl#getContainmentMetaFeature <em>Containment Meta Feature</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */
abstract public class GenBaseElementImpl extends GenCommonBaseImpl implements GenBaseElement {
    /**
       * The cached value of the '{@link #getDomainNameFeature() <em>Domain Name Feature</em>}' reference.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see #getDomainNameFeature()
       * @generated
       * @ordered
       */ protected EAttribute domainNameFeature = null;
    /**
       * The default value of the '{@link #getForegroundColor() <em>Foreground Color</em>}' attribute.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see #getForegroundColor()
       * @generated
       * @ordered
       */ final protected static String FOREGROUND_COLOR_EDEFAULT = null;
    /**
       * The cached value of the '{@link #getForegroundColor() <em>Foreground Color</em>}' attribute.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see #getForegroundColor()
       * @generated
       * @ordered
       */ protected String foregroundColor = FOREGROUND_COLOR_EDEFAULT;
    /**
       * The cached value of the '{@link #getContainmentMetaFeature() <em>Containment Meta Feature</em>}' reference.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see #getContainmentMetaFeature()
       * @generated
       * @ordered
       */ protected EReference containmentMetaFeature = null;
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    protected GenBaseElementImpl () {

        super ();}

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    protected EClass eStaticClass () {

        return GMFGenPackage.eINSTANCE.getGenBaseElement ();
    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public EAttribute getDomainNameFeature () {

        if (domainNameFeature != null && domainNameFeature.eIsProxy ()) {

            EAttribute oldDomainNameFeature = domainNameFeature;

            domainNameFeature = (EAttribute) eResolveProxy ((InternalEObject) domainNameFeature);
            if (domainNameFeature != oldDomainNameFeature) {

                if (eNotificationRequired ()) eNotify (new ENotificationImpl (this, Notification.RESOLVE, GMFGenPackage.GEN_BASE_ELEMENT__DOMAIN_NAME_FEATURE, oldDomainNameFeature, domainNameFeature));
            }

        }

        return domainNameFeature;
    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public EAttribute basicGetDomainNameFeature () {

        return domainNameFeature;
    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public void setDomainNameFeature (EAttribute newDomainNameFeature) {

        EAttribute oldDomainNameFeature = domainNameFeature;

        domainNameFeature = newDomainNameFeature;
        if (eNotificationRequired ()) eNotify (new ENotificationImpl (this, Notification.SET, GMFGenPackage.GEN_BASE_ELEMENT__DOMAIN_NAME_FEATURE, oldDomainNameFeature, domainNameFeature));
    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public String getForegroundColor () {

        return foregroundColor;
    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public void setForegroundColor (String newForegroundColor) {

        String oldForegroundColor = foregroundColor;

        foregroundColor = newForegroundColor;
        if (eNotificationRequired ()) eNotify (new ENotificationImpl (this, Notification.SET, GMFGenPackage.GEN_BASE_ELEMENT__FOREGROUND_COLOR, oldForegroundColor, foregroundColor));
    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public EReference getContainmentMetaFeature () {

        if (containmentMetaFeature != null && containmentMetaFeature.eIsProxy ()) {

            EReference oldContainmentMetaFeature = containmentMetaFeature;

            containmentMetaFeature = (EReference) eResolveProxy ((InternalEObject) containmentMetaFeature);
            if (containmentMetaFeature != oldContainmentMetaFeature) {

                if (eNotificationRequired ()) eNotify (new ENotificationImpl (this, Notification.RESOLVE, GMFGenPackage.GEN_BASE_ELEMENT__CONTAINMENT_META_FEATURE, oldContainmentMetaFeature, containmentMetaFeature));
            }

        }

        return containmentMetaFeature;
    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public EReference basicGetContainmentMetaFeature () {

        return containmentMetaFeature;
    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public void setContainmentMetaFeature (EReference newContainmentMetaFeature) {

        EReference oldContainmentMetaFeature = containmentMetaFeature;

        containmentMetaFeature = newContainmentMetaFeature;
        if (eNotificationRequired ()) eNotify (new ENotificationImpl (this, Notification.SET, GMFGenPackage.GEN_BASE_ELEMENT__CONTAINMENT_META_FEATURE, oldContainmentMetaFeature, containmentMetaFeature));
    }

    /**
       * <!-- begin-user-doc -->
       public boolean hasNameToEdit () {return getDomainNameFeature () != null;}
       * <!-- end-user-doc -->
       * @generated 
       */
    public boolean hasNameToEdit () {

        return getDomainNameFeature () != null;
    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public Object eGet (EStructuralFeature eFeature, boolean resolve) {

        switch (eDerivedStructuralFeatureID (eFeature)) {
            case GMFGenPackage.GEN_BASE_ELEMENT__DIAGRAM_RUN_TIME_CLASS :

                if (resolve) return getDiagramRunTimeClass ();

                return basicGetDiagramRunTimeClass ();
            case GMFGenPackage.GEN_BASE_ELEMENT__VISUAL_ID :

                return new Integer (getVisualID ());
            case GMFGenPackage.GEN_BASE_ELEMENT__EDIT_PART_CLASS_NAME :

                return getEditPartClassName ();
            case GMFGenPackage.GEN_BASE_ELEMENT__META_INFO_PROVIDER_CLASS_NAME :

                return getMetaInfoProviderClassName ();
            case GMFGenPackage.GEN_BASE_ELEMENT__DOMAIN_NAME_FEATURE :

                if (resolve) return getDomainNameFeature ();

                return basicGetDomainNameFeature ();
            case GMFGenPackage.GEN_BASE_ELEMENT__FOREGROUND_COLOR :

                return getForegroundColor ();
            case GMFGenPackage.GEN_BASE_ELEMENT__CONTAINMENT_META_FEATURE :

                if (resolve) return getContainmentMetaFeature ();

                return basicGetContainmentMetaFeature ();
        }

        return eDynamicGet (eFeature, resolve);
    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public void eSet (EStructuralFeature eFeature, Object newValue) {

        switch (eDerivedStructuralFeatureID (eFeature)) {
            case GMFGenPackage.GEN_BASE_ELEMENT__DIAGRAM_RUN_TIME_CLASS :

                setDiagramRunTimeClass ((GenClass) newValue);
                return;
            case GMFGenPackage.GEN_BASE_ELEMENT__VISUAL_ID :

                setVisualID (((Integer) newValue).intValue ());
                return;
            case GMFGenPackage.GEN_BASE_ELEMENT__EDIT_PART_CLASS_NAME :

                setEditPartClassName ((String) newValue);
                return;
            case GMFGenPackage.GEN_BASE_ELEMENT__META_INFO_PROVIDER_CLASS_NAME :

                setMetaInfoProviderClassName ((String) newValue);
                return;
            case GMFGenPackage.GEN_BASE_ELEMENT__DOMAIN_NAME_FEATURE :

                setDomainNameFeature ((EAttribute) newValue);
                return;
            case GMFGenPackage.GEN_BASE_ELEMENT__FOREGROUND_COLOR :

                setForegroundColor ((String) newValue);
                return;
            case GMFGenPackage.GEN_BASE_ELEMENT__CONTAINMENT_META_FEATURE :

                setContainmentMetaFeature ((EReference) newValue);
                return;
        }

        eDynamicSet (eFeature, newValue);}

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public void eUnset (EStructuralFeature eFeature) {

        switch (eDerivedStructuralFeatureID (eFeature)) {
            case GMFGenPackage.GEN_BASE_ELEMENT__DIAGRAM_RUN_TIME_CLASS :

                setDiagramRunTimeClass ((GenClass) null);
                return;
            case GMFGenPackage.GEN_BASE_ELEMENT__VISUAL_ID :

                setVisualID (VISUAL_ID_EDEFAULT);
                return;
            case GMFGenPackage.GEN_BASE_ELEMENT__EDIT_PART_CLASS_NAME :

                setEditPartClassName (EDIT_PART_CLASS_NAME_EDEFAULT);
                return;
            case GMFGenPackage.GEN_BASE_ELEMENT__META_INFO_PROVIDER_CLASS_NAME :

                setMetaInfoProviderClassName (META_INFO_PROVIDER_CLASS_NAME_EDEFAULT);
                return;
            case GMFGenPackage.GEN_BASE_ELEMENT__DOMAIN_NAME_FEATURE :

                setDomainNameFeature ((EAttribute) null);
                return;
            case GMFGenPackage.GEN_BASE_ELEMENT__FOREGROUND_COLOR :

                setForegroundColor (FOREGROUND_COLOR_EDEFAULT);
                return;
            case GMFGenPackage.GEN_BASE_ELEMENT__CONTAINMENT_META_FEATURE :

                setContainmentMetaFeature ((EReference) null);
                return;
        }

        eDynamicUnset (eFeature);}

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public boolean eIsSet (EStructuralFeature eFeature) {

        switch (eDerivedStructuralFeatureID (eFeature)) {
            case GMFGenPackage.GEN_BASE_ELEMENT__DIAGRAM_RUN_TIME_CLASS :

                return diagramRunTimeClass != null;
            case GMFGenPackage.GEN_BASE_ELEMENT__VISUAL_ID :

                return visualID != VISUAL_ID_EDEFAULT;
            case GMFGenPackage.GEN_BASE_ELEMENT__EDIT_PART_CLASS_NAME :

                return EDIT_PART_CLASS_NAME_EDEFAULT == null ? editPartClassName != null : ! EDIT_PART_CLASS_NAME_EDEFAULT.equals (editPartClassName);
            case GMFGenPackage.GEN_BASE_ELEMENT__META_INFO_PROVIDER_CLASS_NAME :

                return META_INFO_PROVIDER_CLASS_NAME_EDEFAULT == null ? metaInfoProviderClassName != null : ! META_INFO_PROVIDER_CLASS_NAME_EDEFAULT.equals (metaInfoProviderClassName);
            case GMFGenPackage.GEN_BASE_ELEMENT__DOMAIN_NAME_FEATURE :

                return domainNameFeature != null;
            case GMFGenPackage.GEN_BASE_ELEMENT__FOREGROUND_COLOR :

                return FOREGROUND_COLOR_EDEFAULT == null ? foregroundColor != null : ! FOREGROUND_COLOR_EDEFAULT.equals (foregroundColor);
            case GMFGenPackage.GEN_BASE_ELEMENT__CONTAINMENT_META_FEATURE :

                return containmentMetaFeature != null;
        }

        return eDynamicIsSet (eFeature);
    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public String toString () {

        if (eIsProxy ()) return super.toString ();

        StringBuffer result = new StringBuffer (super.toString ());

        result.append (" (foregroundColor: ");
        result.append (foregroundColor);
        result.append (')');
        return result.toString ();
    }

}

//GenBaseElementImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Common Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl#getDiagramRunTimeClass <em>Diagram Run Time Class</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl#getVisualID <em>Visual ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl#getEditPartClassName <em>Edit Part Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl#getMetaInfoProviderClassName <em>Meta Info Provider Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenCommonBaseImpl extends EObjectImpl implements GenCommonBase {
	/**
	 * The cached value of the '{@link #getDiagramRunTimeClass() <em>Diagram Run Time Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramRunTimeClass()
	 * @generated
	 * @ordered
	 */
	protected GenClass diagramRunTimeClass = null;

	/**
	 * The default value of the '{@link #getVisualID() <em>Visual ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualID()
	 * @generated
	 * @ordered
	 */
	protected static final int VISUAL_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVisualID() <em>Visual ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualID()
	 * @generated
	 * @ordered
	 */
	protected int visualID = VISUAL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditPartClassName() <em>Edit Part Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditPartClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String EDIT_PART_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditPartClassName() <em>Edit Part Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditPartClassName()
	 * @generated
	 * @ordered
	 */
	protected String editPartClassName = EDIT_PART_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetaInfoProviderClassName() <em>Meta Info Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaInfoProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String META_INFO_PROVIDER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaInfoProviderClassName() <em>Meta Info Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaInfoProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected String metaInfoProviderClassName = META_INFO_PROVIDER_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenCommonBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenCommonBase();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClass getDiagramRunTimeClass() {
		if (diagramRunTimeClass != null && diagramRunTimeClass.eIsProxy()) {
			GenClass oldDiagramRunTimeClass = diagramRunTimeClass;
			diagramRunTimeClass = (GenClass)eResolveProxy((InternalEObject)diagramRunTimeClass);
			if (diagramRunTimeClass != oldDiagramRunTimeClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.GEN_COMMON_BASE__DIAGRAM_RUN_TIME_CLASS, oldDiagramRunTimeClass, diagramRunTimeClass));
			}
		}
		return diagramRunTimeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClass basicGetDiagramRunTimeClass() {
		return diagramRunTimeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramRunTimeClass(GenClass newDiagramRunTimeClass) {
		GenClass oldDiagramRunTimeClass = diagramRunTimeClass;
		diagramRunTimeClass = newDiagramRunTimeClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_COMMON_BASE__DIAGRAM_RUN_TIME_CLASS, oldDiagramRunTimeClass, diagramRunTimeClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVisualIDGen() {
		return visualID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getVisualID() {
		int value = getVisualIDGen();
		// eIsSet
		if (value == VISUAL_ID_EDEFAULT) {
			// XXX breaking 'no changes on read' contract
			setVisualID(hashCode());
		}
		return getVisualIDGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisualID(int newVisualID) {
		int oldVisualID = visualID;
		visualID = newVisualID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_COMMON_BASE__VISUAL_ID, oldVisualID, visualID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditPartClassNameGen() {
		return editPartClassName;
	}

	public String getEditPartClassName() {
		String value = getEditPartClassNameGen();
		if (value == null || value.length() == 0) {
			return getClassNamePrefix() + getClassNameSuffux() + "EditPart";
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditPartClassName(String newEditPartClassName) {
		String oldEditPartClassName = editPartClassName;
		editPartClassName = newEditPartClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_COMMON_BASE__EDIT_PART_CLASS_NAME, oldEditPartClassName, editPartClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetaInfoProviderClassNameGen() {
		return metaInfoProviderClassName;
	}

	public String getMetaInfoProviderClassName() {
		String value = getMetaInfoProviderClassNameGen();
		if (value == null || value.length() == 0) {
			return getClassNamePrefix() + getClassNameSuffux() + "MetaInfoProvider";
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaInfoProviderClassName(String newMetaInfoProviderClassName) {
		String oldMetaInfoProviderClassName = metaInfoProviderClassName;
		metaInfoProviderClassName = newMetaInfoProviderClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_COMMON_BASE__META_INFO_PROVIDER_CLASS_NAME, oldMetaInfoProviderClassName, metaInfoProviderClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getMetaInfoProviderQualifiedClassName() {
		return getDiagram().getEditProvidersPackageName() + '.' + getMetaInfoProviderClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract String getClassNamePrefix();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract String getClassNameSuffux();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getEditPartQualifiedClassName() {
		return getDiagram().getEditPartsPackageName() + '.' + getEditPartClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract GenDiagram getDiagram();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.GEN_COMMON_BASE__DIAGRAM_RUN_TIME_CLASS:
				if (resolve) return getDiagramRunTimeClass();
				return basicGetDiagramRunTimeClass();
			case GMFGenPackage.GEN_COMMON_BASE__VISUAL_ID:
				return new Integer(getVisualID());
			case GMFGenPackage.GEN_COMMON_BASE__EDIT_PART_CLASS_NAME:
				return getEditPartClassName();
			case GMFGenPackage.GEN_COMMON_BASE__META_INFO_PROVIDER_CLASS_NAME:
				return getMetaInfoProviderClassName();
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
			case GMFGenPackage.GEN_COMMON_BASE__DIAGRAM_RUN_TIME_CLASS:
				setDiagramRunTimeClass((GenClass)newValue);
				return;
			case GMFGenPackage.GEN_COMMON_BASE__VISUAL_ID:
				setVisualID(((Integer)newValue).intValue());
				return;
			case GMFGenPackage.GEN_COMMON_BASE__EDIT_PART_CLASS_NAME:
				setEditPartClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_COMMON_BASE__META_INFO_PROVIDER_CLASS_NAME:
				setMetaInfoProviderClassName((String)newValue);
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
			case GMFGenPackage.GEN_COMMON_BASE__DIAGRAM_RUN_TIME_CLASS:
				setDiagramRunTimeClass((GenClass)null);
				return;
			case GMFGenPackage.GEN_COMMON_BASE__VISUAL_ID:
				setVisualID(VISUAL_ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_COMMON_BASE__EDIT_PART_CLASS_NAME:
				setEditPartClassName(EDIT_PART_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_COMMON_BASE__META_INFO_PROVIDER_CLASS_NAME:
				setMetaInfoProviderClassName(META_INFO_PROVIDER_CLASS_NAME_EDEFAULT);
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
			case GMFGenPackage.GEN_COMMON_BASE__DIAGRAM_RUN_TIME_CLASS:
				return diagramRunTimeClass != null;
			case GMFGenPackage.GEN_COMMON_BASE__VISUAL_ID:
				return visualID != VISUAL_ID_EDEFAULT;
			case GMFGenPackage.GEN_COMMON_BASE__EDIT_PART_CLASS_NAME:
				return EDIT_PART_CLASS_NAME_EDEFAULT == null ? editPartClassName != null : !EDIT_PART_CLASS_NAME_EDEFAULT.equals(editPartClassName);
			case GMFGenPackage.GEN_COMMON_BASE__META_INFO_PROVIDER_CLASS_NAME:
				return META_INFO_PROVIDER_CLASS_NAME_EDEFAULT == null ? metaInfoProviderClassName != null : !META_INFO_PROVIDER_CLASS_NAME_EDEFAULT.equals(metaInfoProviderClassName);
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
		result.append(" (visualID: ");
		result.append(visualID);
		result.append(", editPartClassName: ");
		result.append(editPartClassName);
		result.append(", metaInfoProviderClassName: ");
		result.append(metaInfoProviderClassName);
		result.append(')');
		return result.toString();
	}

} //GenCommonBaseImpl

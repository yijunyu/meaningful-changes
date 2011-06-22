/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.codegen.gmfgen.FeatureLinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.LinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.MetamodelType;
import org.eclipse.gmf.codegen.gmfgen.SpecializationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialization Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.SpecializationTypeImpl#getMetamodelType <em>Metamodel Type</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.SpecializationTypeImpl#getEditHelperAdviceClassName <em>Edit Helper Advice Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecializationTypeImpl extends ElementTypeImpl implements SpecializationType {
	/**
	 * The cached value of the '{@link #getMetamodelType() <em>Metamodel Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelType()
	 * @generated
	 * @ordered
	 */
	protected MetamodelType metamodelType;

	/**
	 * The default value of the '{@link #getEditHelperAdviceClassName() <em>Edit Helper Advice Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditHelperAdviceClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String EDIT_HELPER_ADVICE_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditHelperAdviceClassName() <em>Edit Helper Advice Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditHelperAdviceClassName()
	 * @generated
	 * @ordered
	 */
	protected String editHelperAdviceClassName = EDIT_HELPER_ADVICE_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getSpecializationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelType getMetamodelType() {
		if (metamodelType != null && metamodelType.eIsProxy()) {
			InternalEObject oldMetamodelType = (InternalEObject)metamodelType;
			metamodelType = (MetamodelType)eResolveProxy(oldMetamodelType);
			if (metamodelType != oldMetamodelType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.SPECIALIZATION_TYPE__METAMODEL_TYPE, oldMetamodelType, metamodelType));
			}
		}
		return metamodelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelType basicGetMetamodelType() {
		return metamodelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodelType(MetamodelType newMetamodelType) {
		MetamodelType oldMetamodelType = metamodelType;
		metamodelType = newMetamodelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.SPECIALIZATION_TYPE__METAMODEL_TYPE, oldMetamodelType, metamodelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditHelperAdviceClassName() {
		return editHelperAdviceClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditHelperAdviceClassName(String newEditHelperAdviceClassName) {
		String oldEditHelperAdviceClassName = editHelperAdviceClassName;
		editHelperAdviceClassName = newEditHelperAdviceClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.SPECIALIZATION_TYPE__EDIT_HELPER_ADVICE_CLASS_NAME, oldEditHelperAdviceClassName, editHelperAdviceClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GenClass getMetamodelClass() {
		GenClass metaClass = null;
		if (getMetamodelType() != null) {
			metaClass = getMetamodelType().getMetaClass();
		}
		if (getDiagramElement() instanceof GenLink) {
			LinkModelFacet modelFacet = ((GenLink) getDiagramElement()).getModelFacet();
			if (modelFacet instanceof FeatureLinkModelFacet) {
				GenFeature metaFeature = ((FeatureLinkModelFacet) modelFacet).getMetaFeature();
				metaClass = metaFeature.getGenClass();
			}
		}
		return metaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getEditHelperAdviceQualifiedClassName() {
		return getDiagramElement().getDiagram().getEditHelpersPackageName() + '.' + getEditHelperAdviceClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.SPECIALIZATION_TYPE__METAMODEL_TYPE:
				if (resolve) return getMetamodelType();
				return basicGetMetamodelType();
			case GMFGenPackage.SPECIALIZATION_TYPE__EDIT_HELPER_ADVICE_CLASS_NAME:
				return getEditHelperAdviceClassName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMFGenPackage.SPECIALIZATION_TYPE__METAMODEL_TYPE:
				setMetamodelType((MetamodelType)newValue);
				return;
			case GMFGenPackage.SPECIALIZATION_TYPE__EDIT_HELPER_ADVICE_CLASS_NAME:
				setEditHelperAdviceClassName((String)newValue);
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
			case GMFGenPackage.SPECIALIZATION_TYPE__METAMODEL_TYPE:
				setMetamodelType((MetamodelType)null);
				return;
			case GMFGenPackage.SPECIALIZATION_TYPE__EDIT_HELPER_ADVICE_CLASS_NAME:
				setEditHelperAdviceClassName(EDIT_HELPER_ADVICE_CLASS_NAME_EDEFAULT);
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
			case GMFGenPackage.SPECIALIZATION_TYPE__METAMODEL_TYPE:
				return metamodelType != null;
			case GMFGenPackage.SPECIALIZATION_TYPE__EDIT_HELPER_ADVICE_CLASS_NAME:
				return EDIT_HELPER_ADVICE_CLASS_NAME_EDEFAULT == null ? editHelperAdviceClassName != null : !EDIT_HELPER_ADVICE_CLASS_NAME_EDEFAULT.equals(editHelperAdviceClassName);
		}
		return super.eIsSet(featureID);
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
		result.append(" (editHelperAdviceClassName: ");
		result.append(editHelperAdviceClassName);
		result.append(')');
		return result.toString();
	}

} //SpecializationTypeImpl
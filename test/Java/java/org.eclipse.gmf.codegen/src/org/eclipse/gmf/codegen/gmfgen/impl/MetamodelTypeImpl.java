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
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.LinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.MetamodelType;
import org.eclipse.gmf.codegen.gmfgen.TypeModelFacet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metamodel Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.MetamodelTypeImpl#getEditHelperClassName <em>Edit Helper Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetamodelTypeImpl extends ElementTypeImpl implements MetamodelType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetamodelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getMetamodelType();
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
		return GenCommonBaseImpl.getValidClassName(getEditHelperClassNameGen(), getDiagramElement(), EDIT_HELPER_SUFFIX);
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.METAMODEL_TYPE__EDIT_HELPER_CLASS_NAME, oldEditHelperClassName, editHelperClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getEditHelperQualifiedClassName() {
		return getDiagramElement().getDiagram().getEditHelpersPackageName() + '.' + getEditHelperClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GenClass getMetaClass() {
		if (getDiagramElement() instanceof GenNode) {
			return ((GenNode) getDiagramElement()).getModelFacet().getMetaClass();
		} else if (getDiagramElement() instanceof GenLink) {
			LinkModelFacet modelFacet = ((GenLink) getDiagramElement()).getModelFacet();
			if (modelFacet instanceof TypeModelFacet) {
				return ((TypeModelFacet) modelFacet).getMetaClass();
			}
		} else if (getDiagramElement() instanceof GenDiagram) {
			return ((GenDiagram) getDiagramElement()).getDomainDiagramElement();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.METAMODEL_TYPE__EDIT_HELPER_CLASS_NAME:
				return getEditHelperClassName();
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
			case GMFGenPackage.METAMODEL_TYPE__EDIT_HELPER_CLASS_NAME:
				setEditHelperClassName((String)newValue);
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
			case GMFGenPackage.METAMODEL_TYPE__EDIT_HELPER_CLASS_NAME:
				setEditHelperClassName(EDIT_HELPER_CLASS_NAME_EDEFAULT);
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
			case GMFGenPackage.METAMODEL_TYPE__EDIT_HELPER_CLASS_NAME:
				return EDIT_HELPER_CLASS_NAME_EDEFAULT == null ? editHelperClassName != null : !EDIT_HELPER_CLASS_NAME_EDEFAULT.equals(editHelperClassName);
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
		result.append(" (editHelperClassName: ");
		result.append(editHelperClassName);
		result.append(')');
		return result.toString();
	}

} //MetamodelTypeImpl
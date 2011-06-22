/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;


import org.eclipse.emf.codegen.ecore.genmodel.GenClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Element type based on ecore type
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.MetamodelType#getEditHelperClassName <em>Edit Helper Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getMetamodelType()
 * @model
 * @generated
 */
public interface MetamodelType extends ElementType {

	public static final String EDIT_HELPER_SUFFIX = "EditHelper"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Edit Helper Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit Helper Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Helper Class Name</em>' attribute.
	 * @see #setEditHelperClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getMetamodelType_EditHelperClassName()
	 * @model
	 * @generated
	 */
	String getEditHelperClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.MetamodelType#getEditHelperClassName <em>Edit Helper Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Helper Class Name</em>' attribute.
	 * @see #getEditHelperClassName()
	 * @generated
	 */
	void setEditHelperClassName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getEditHelperQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	GenClass getMetaClass();

} // MetamodelType
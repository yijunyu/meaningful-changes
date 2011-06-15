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
 * A representation of the model object '<em><b>Specialization Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specialization of metamodel type
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.SpecializationType#getMetamodelType <em>Metamodel Type</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.SpecializationType#getEditHelperAdviceClassName <em>Edit Helper Advice Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getSpecializationType()
 * @model
 * @generated
 */
public interface SpecializationType extends ElementType {

	public static final String EDIT_HELPER_ADVICE_SUFFIX = "EditHelperAdvice"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Metamodel Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel Type</em>' reference.
	 * @see #setMetamodelType(MetamodelType)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getSpecializationType_MetamodelType()
	 * @model
	 * @generated
	 */
	MetamodelType getMetamodelType();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.SpecializationType#getMetamodelType <em>Metamodel Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel Type</em>' reference.
	 * @see #getMetamodelType()
	 * @generated
	 */
	void setMetamodelType(MetamodelType value);

	/**
	 * Returns the value of the '<em><b>Edit Helper Advice Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit Helper Advice Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Helper Advice Class Name</em>' attribute.
	 * @see #setEditHelperAdviceClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getSpecializationType_EditHelperAdviceClassName()
	 * @model
	 * @generated
	 */
	String getEditHelperAdviceClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.SpecializationType#getEditHelperAdviceClassName <em>Edit Helper Advice Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Helper Advice Class Name</em>' attribute.
	 * @see #getEditHelperAdviceClassName()
	 * @generated
	 */
	void setEditHelperAdviceClassName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	GenClass getMetamodelClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getEditHelperAdviceQualifiedClassName();

} // SpecializationType
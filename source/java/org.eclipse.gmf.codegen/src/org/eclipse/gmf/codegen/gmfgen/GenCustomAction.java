/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Custom Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Action from org.eclipse.ui.actions.ActionFactory
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCustomAction#getQualifiedClassName <em>Qualified Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCustomAction#isGenerateBoilerplate <em>Generate Boilerplate</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCustomAction#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCustomAction()
 * @model
 * @generated
 */
public interface GenCustomAction extends GenContributionItem {
	/**
	 * Returns the value of the '<em><b>Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Class Name</em>' attribute.
	 * @see #setQualifiedClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCustomAction_QualifiedClassName()
	 * @model required="true"
	 * @generated
	 */
	String getQualifiedClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenCustomAction#getQualifiedClassName <em>Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Class Name</em>' attribute.
	 * @see #getQualifiedClassName()
	 * @generated
	 */
	void setQualifiedClassName(String value);

	/**
	 * Returns the value of the '<em><b>Generate Boilerplate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate Boilerplate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Boilerplate</em>' attribute.
	 * @see #setGenerateBoilerplate(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCustomAction_GenerateBoilerplate()
	 * @model default="false"
	 * @generated
	 */
	boolean isGenerateBoilerplate();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenCustomAction#isGenerateBoilerplate <em>Generate Boilerplate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Boilerplate</em>' attribute.
	 * @see #isGenerateBoilerplate()
	 * @generated
	 */
	void setGenerateBoilerplate(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCustomAction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenCustomAction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // GenCustomAction

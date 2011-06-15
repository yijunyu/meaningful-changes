/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Custom Preference Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCustomPreferencePage#getQualifiedClassName <em>Qualified Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCustomPreferencePage#isGenerateBoilerplate <em>Generate Boilerplate</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCustomPreferencePage#getPreferences <em>Preferences</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCustomPreferencePage()
 * @model
 * @generated
 */
public interface GenCustomPreferencePage extends GenPreferencePage {
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
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCustomPreferencePage_QualifiedClassName()
	 * @model required="true"
	 * @generated
	 */
	String getQualifiedClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenCustomPreferencePage#getQualifiedClassName <em>Qualified Class Name</em>}' attribute.
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
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCustomPreferencePage_GenerateBoilerplate()
	 * @model default="false"
	 * @generated
	 */
	boolean isGenerateBoilerplate();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenCustomPreferencePage#isGenerateBoilerplate <em>Generate Boilerplate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Boilerplate</em>' attribute.
	 * @see #isGenerateBoilerplate()
	 * @generated
	 */
	void setGenerateBoilerplate(boolean value);

	/**
	 * Returns the value of the '<em><b>Preferences</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenPreference}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenPreference#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferences</em>' containment reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCustomPreferencePage_Preferences()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenPreference#getPage
	 * @model opposite="page" containment="true"
	 * @generated
	 */
	EList<GenPreference> getPreferences();

} // GenCustomPreferencePage

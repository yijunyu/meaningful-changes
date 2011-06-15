/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Custom Property Tab</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCustomPropertyTab#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCustomPropertyTab#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCustomPropertyTab()
 * @model
 * @generated
 */
public interface GenCustomPropertyTab extends GenPropertyTab {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCustomPropertyTab_ClassName()
	 * @model required="true"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenCustomPropertyTab#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenPropertyTabFilter#getTab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(GenPropertyTabFilter)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCustomPropertyTab_Filter()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenPropertyTabFilter#getTab
	 * @model opposite="tab" containment="true"
	 * @generated
	 */
	GenPropertyTabFilter getFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenCustomPropertyTab#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(GenPropertyTabFilter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getQualifiedClassName();

} // GenCustomPropertyTab
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predefined Parser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Use one of GMF-provided parser implementations
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.PredefinedParser#getViewMethod <em>View Method</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.PredefinedParser#getEditMethod <em>Edit Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getPredefinedParser()
 * @model
 * @generated
 */
public interface PredefinedParser extends GenParserImplementation {
	/**
	 * Returns the value of the '<em><b>View Method</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.LabelTextAccessMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Method</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.LabelTextAccessMethod
	 * @see #setViewMethod(LabelTextAccessMethod)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getPredefinedParser_ViewMethod()
	 * @model
	 * @generated
	 */
	LabelTextAccessMethod getViewMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.PredefinedParser#getViewMethod <em>View Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Method</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.LabelTextAccessMethod
	 * @see #getViewMethod()
	 * @generated
	 */
	void setViewMethod(LabelTextAccessMethod value);

	/**
	 * Returns the value of the '<em><b>Edit Method</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.LabelTextAccessMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Method</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.LabelTextAccessMethod
	 * @see #setEditMethod(LabelTextAccessMethod)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getPredefinedParser_EditMethod()
	 * @model
	 * @generated
	 */
	LabelTextAccessMethod getEditMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.PredefinedParser#getEditMethod <em>Edit Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Method</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.LabelTextAccessMethod
	 * @see #getEditMethod()
	 * @generated
	 */
	void setEditMethod(LabelTextAccessMethod value);

} // PredefinedParser

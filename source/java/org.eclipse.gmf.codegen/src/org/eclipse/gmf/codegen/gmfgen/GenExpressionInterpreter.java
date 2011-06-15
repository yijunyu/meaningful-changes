/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenExpressionInterpreter.java,v 1.4 2007/05/22 17:27:35 atikhomirov Exp $
 */
package org.eclipse.gmf.codegen.gmfgen;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Expression Interpreter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenExpressionInterpreter#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenExpressionInterpreter#getClassName <em>Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenExpressionInterpreter()
 * @model
 * @generated
 */
public interface GenExpressionInterpreter extends GenExpressionProviderBase {
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
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenExpressionInterpreter_ClassName()
	 * @model
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenExpressionInterpreter#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.GenLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLanguage
	 * @see #setLanguage(GenLanguage)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenExpressionInterpreter_Language()
	 * @model required="true"
	 * @generated
	 */
	GenLanguage getLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenExpressionInterpreter#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLanguage
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(GenLanguage value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	String getExpressionAccessor(ValueExpression expression);

} // GenExpressionInterpreter

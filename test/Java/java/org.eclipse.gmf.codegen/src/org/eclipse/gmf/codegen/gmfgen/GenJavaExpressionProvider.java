/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenJavaExpressionProvider.java,v 1.3 2008/05/07 13:56:01 atikhomirov Exp $
 */
package org.eclipse.gmf.codegen.gmfgen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Java Expression Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenJavaExpressionProvider#isThrowException <em>Throw Exception</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenJavaExpressionProvider#isInjectExpressionBody <em>Inject Expression Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenJavaExpressionProvider()
 * @model
 * @generated
 */
public interface GenJavaExpressionProvider extends GenExpressionProviderBase {
	/**
	 * Returns the value of the '<em><b>Throw Exception</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throw Exception</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throw Exception</em>' attribute.
	 * @see #setThrowException(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenJavaExpressionProvider_ThrowException()
	 * @model default="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel documentaion='Whether to generate default implementation that rises RuntimeException to signal unimplemented method'"
	 * @generated
	 */
	boolean isThrowException();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenJavaExpressionProvider#isThrowException <em>Throw Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throw Exception</em>' attribute.
	 * @see #isThrowException()
	 * @generated
	 */
	void setThrowException(boolean value);

	/**
	 * Returns the value of the '<em><b>Inject Expression Body</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inject Expression Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inject Expression Body</em>' attribute.
	 * @see #setInjectExpressionBody(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenJavaExpressionProvider_InjectExpressionBody()
	 * @model default="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel documentaion='When \'true\', body of associated ValueExpression would get injected into Java code as-is, thus allowing to provide method implementations right within the model. Note, if body is empty, default implementation would be generated instead.'"
	 * @generated
	 */
	boolean isInjectExpressionBody();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenJavaExpressionProvider#isInjectExpressionBody <em>Inject Expression Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inject Expression Body</em>' attribute.
	 * @see #isInjectExpressionBody()
	 * @generated
	 */
	void setInjectExpressionBody(boolean value);

} // GenJavaExpressionProvider

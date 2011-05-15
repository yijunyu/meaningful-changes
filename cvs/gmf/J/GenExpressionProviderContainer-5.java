/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenExpressionProviderContainer.java,v 1.4 2007/03/14 14:39:36 atikhomirov Exp $
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Expression Provider Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer#getExpressionsPackageName <em>Expressions Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer#getAbstractExpressionClassName <em>Abstract Expression Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer#getProviders <em>Providers</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer#getEditorGen <em>Editor Gen</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenExpressionProviderContainer()
 * @model
 * @generated
 */
public interface GenExpressionProviderContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Expressions Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions Package Name</em>' attribute.
	 * @see #setExpressionsPackageName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenExpressionProviderContainer_ExpressionsPackageName()
	 * @model
	 * @generated
	 */
	String getExpressionsPackageName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer#getExpressionsPackageName <em>Expressions Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expressions Package Name</em>' attribute.
	 * @see #getExpressionsPackageName()
	 * @generated
	 */
	void setExpressionsPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Abstract Expression Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Expression Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Expression Class Name</em>' attribute.
	 * @see #setAbstractExpressionClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenExpressionProviderContainer_AbstractExpressionClassName()
	 * @model
	 * @generated
	 */
	String getAbstractExpressionClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer#getAbstractExpressionClassName <em>Abstract Expression Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Expression Class Name</em>' attribute.
	 * @see #getAbstractExpressionClassName()
	 * @generated
	 */
	void setAbstractExpressionClassName(String value);

	/**
	 * Returns the value of the '<em><b>Providers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderBase}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderBase#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providers</em>' containment reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenExpressionProviderContainer_Providers()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderBase#getContainer
	 * @model type="org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderBase" opposite="container" containment="true"
	 * @generated
	 */
	EList<GenExpressionProviderBase> getProviders();

	/**
	 * Returns the value of the '<em><b>Editor Gen</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getExpressionProviders <em>Expression Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor Gen</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor Gen</em>' container reference.
	 * @see #setEditorGen(GenEditorGenerator)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenExpressionProviderContainer_EditorGen()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getExpressionProviders
	 * @model opposite="expressionProviders" required="true"
	 * @generated
	 */
	GenEditorGenerator getEditorGen();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer#getEditorGen <em>Editor Gen</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editor Gen</em>' container reference.
	 * @see #getEditorGen()
	 * @generated
	 */
	void setEditorGen(GenEditorGenerator value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	GenExpressionProviderBase getProvider(ValueExpression expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getAbstractExpressionQualifiedClassName();

	boolean isCopy(ValueExpression expression); // Indicates whether the 'expression' represents a copy resulting from transformation of a reused mapping to gmfgen model 	

} // GenExpressionProviderContainer
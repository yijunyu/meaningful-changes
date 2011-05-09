/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenExpressionProviderBase.java,v 1.11 2008/03/04 16:50:38 atikhomirov Exp $
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Expression Provider Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderBase#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderBase#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenExpressionProviderBase()
 * @model abstract="true"
 * @generated
 */
public interface GenExpressionProviderBase extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	GenLanguage getLanguage();

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.ValueExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenExpressionProviderBase_Expressions()
	 * @model
	 * @generated
	 */
	EList<ValueExpression> getExpressions();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer#getProviders <em>Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenExpressionProviderBase_Container()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer#getProviders
	 * @model opposite="providers" resolveProxies="false" required="true" transient="false" suppressedSetVisibility="true"
	 * @generated
	 */
	GenExpressionProviderContainer getContainer();

} // GenExpressionProviderBase

/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenJavaExpressionProviderImpl.java,v 1.1 2006/04/13 15:41:17 radvorak Exp $
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenJavaExpressionProvider;
import org.eclipse.gmf.codegen.gmfgen.ValueExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Java Expression Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GenJavaExpressionProviderImpl extends GenExpressionProviderBaseImpl implements GenJavaExpressionProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenJavaExpressionProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenJavaExpressionProvider();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getLanguage() {
		return "java"; //$NON-NLS-1$
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getOperationName(ValueExpression expression) {
		if(expression.getBody() == null) {
			return "Null"; //$NON-NLS-1$
		}
		return CodeGenUtil.validJavaIdentifier(expression.getBody());
	}

} //GenJavaExpressionProviderImpl

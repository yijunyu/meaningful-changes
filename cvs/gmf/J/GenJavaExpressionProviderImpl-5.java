/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenJavaExpressionProviderImpl.java,v 1.4 2007/05/22 17:27:35 atikhomirov Exp $
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenJavaExpressionProvider;
import org.eclipse.gmf.codegen.gmfgen.GenLanguage;
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
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenJavaExpressionProvider();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GenLanguage getLanguage() {
		return GenLanguage.JAVA_LITERAL;
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

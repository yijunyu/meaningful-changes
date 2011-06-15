/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenLanguage;
import org.eclipse.gmf.codegen.gmfgen.GenLiteralExpressionProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Literal Expression Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GenLiteralExpressionProviderImpl extends GenExpressionProviderBaseImpl implements GenLiteralExpressionProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenLiteralExpressionProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenLiteralExpressionProvider();
	}

	@Override
	public GenLanguage getLanguage() {
		return GenLanguage.LITERAL_LITERAL;
	}
} //GenLiteralExpressionProviderImpl

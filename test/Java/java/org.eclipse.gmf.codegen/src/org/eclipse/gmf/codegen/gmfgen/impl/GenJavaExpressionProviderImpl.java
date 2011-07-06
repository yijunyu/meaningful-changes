/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenJavaExpressionProviderImpl.java,v 1.5 2008/05/05 21:06:41 atikhomirov Exp $
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenJavaExpressionProvider;
import org.eclipse.gmf.codegen.gmfgen.GenLanguage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Java Expression Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenJavaExpressionProviderImpl#isThrowException <em>Throw Exception</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenJavaExpressionProviderImpl#isInjectExpressionBody <em>Inject Expression Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenJavaExpressionProviderImpl extends GenExpressionProviderBaseImpl implements GenJavaExpressionProvider {
	/**
	 * The default value of the '{@link #isThrowException() <em>Throw Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThrowException()
	 * @generated
	 * @ordered
	 */
	protected static final boolean THROW_EXCEPTION_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isThrowException() <em>Throw Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThrowException()
	 * @generated
	 * @ordered
	 */
	protected boolean throwException = THROW_EXCEPTION_EDEFAULT;
	/**
	 * The default value of the '{@link #isInjectExpressionBody() <em>Inject Expression Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInjectExpressionBody()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INJECT_EXPRESSION_BODY_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isInjectExpressionBody() <em>Inject Expression Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInjectExpressionBody()
	 * @generated
	 * @ordered
	 */
	protected boolean injectExpressionBody = INJECT_EXPRESSION_BODY_EDEFAULT;

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
	 * @generated
	 */
	public boolean isThrowException() {
		return throwException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThrowException(boolean newThrowException) {
		boolean oldThrowException = throwException;
		throwException = newThrowException;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_JAVA_EXPRESSION_PROVIDER__THROW_EXCEPTION, oldThrowException, throwException));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInjectExpressionBody() {
		return injectExpressionBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInjectExpressionBody(boolean newInjectExpressionBody) {
		boolean oldInjectExpressionBody = injectExpressionBody;
		injectExpressionBody = newInjectExpressionBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_JAVA_EXPRESSION_PROVIDER__INJECT_EXPRESSION_BODY, oldInjectExpressionBody, injectExpressionBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.GEN_JAVA_EXPRESSION_PROVIDER__THROW_EXCEPTION:
				return isThrowException() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_JAVA_EXPRESSION_PROVIDER__INJECT_EXPRESSION_BODY:
				return isInjectExpressionBody() ? Boolean.TRUE : Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMFGenPackage.GEN_JAVA_EXPRESSION_PROVIDER__THROW_EXCEPTION:
				setThrowException(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_JAVA_EXPRESSION_PROVIDER__INJECT_EXPRESSION_BODY:
				setInjectExpressionBody(((Boolean)newValue).booleanValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GMFGenPackage.GEN_JAVA_EXPRESSION_PROVIDER__THROW_EXCEPTION:
				setThrowException(THROW_EXCEPTION_EDEFAULT);
				return;
			case GMFGenPackage.GEN_JAVA_EXPRESSION_PROVIDER__INJECT_EXPRESSION_BODY:
				setInjectExpressionBody(INJECT_EXPRESSION_BODY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GMFGenPackage.GEN_JAVA_EXPRESSION_PROVIDER__THROW_EXCEPTION:
				return throwException != THROW_EXCEPTION_EDEFAULT;
			case GMFGenPackage.GEN_JAVA_EXPRESSION_PROVIDER__INJECT_EXPRESSION_BODY:
				return injectExpressionBody != INJECT_EXPRESSION_BODY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (throwException: ");
		result.append(throwException);
		result.append(", injectExpressionBody: ");
		result.append(injectExpressionBody);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GenLanguage getLanguage() {
		return GenLanguage.JAVA_LITERAL;
	}
} //GenJavaExpressionProviderImpl

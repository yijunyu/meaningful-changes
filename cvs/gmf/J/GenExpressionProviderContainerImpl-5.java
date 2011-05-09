/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenExpressionProviderContainerImpl.java,v 1.4 2006/07/20 17:40:06 ashatalin Exp $
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderBase;
import org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer;
import org.eclipse.gmf.codegen.gmfgen.ValueExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Expression Provider Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenExpressionProviderContainerImpl#getExpressionsPackageName <em>Expressions Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenExpressionProviderContainerImpl#getAbstractExpressionClassName <em>Abstract Expression Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenExpressionProviderContainerImpl#getProviders <em>Providers</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenExpressionProviderContainerImpl#getEditorGen <em>Editor Gen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenExpressionProviderContainerImpl extends EObjectImpl implements GenExpressionProviderContainer {
	/**
	 * The default value of the '{@link #getExpressionsPackageName() <em>Expressions Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionsPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSIONS_PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpressionsPackageName() <em>Expressions Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionsPackageName()
	 * @generated
	 * @ordered
	 */
	protected String expressionsPackageName = EXPRESSIONS_PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbstractExpressionClassName() <em>Abstract Expression Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractExpressionClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSTRACT_EXPRESSION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstractExpressionClassName() <em>Abstract Expression Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractExpressionClassName()
	 * @generated
	 * @ordered
	 */
	protected String abstractExpressionClassName = ABSTRACT_EXPRESSION_CLASS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProviders() <em>Providers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviders()
	 * @generated
	 * @ordered
	 */
	protected EList providers = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenExpressionProviderContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenExpressionProviderContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpressionsPackageNameGen() {
		return expressionsPackageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getExpressionsPackageName() {
		String value = getExpressionsPackageNameGen();
		if(GenCommonBaseImpl.isEmpty(value)) {
			value = getEditorGen().getPackageNamePrefix() + ".expressions"; //$NON-NLS-1$
		}
		return value;
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionsPackageName(String newExpressionsPackageName) {
		String oldExpressionsPackageName = expressionsPackageName;
		expressionsPackageName = newExpressionsPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__EXPRESSIONS_PACKAGE_NAME, oldExpressionsPackageName, expressionsPackageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbstractExpressionClassNameGen() {
		return abstractExpressionClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getAbstractExpressionClassName() {
		String value = getAbstractExpressionClassNameGen();
		if(GenCommonBaseImpl.isEmpty(value)) {
			String prefix = ((GenEditorGeneratorImpl) getEditorGen()).getDomainModelCapName();
			value = prefix + "AbstractExpression"; //$NON-NLS-1$
		}
		return value;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractExpressionClassName(String newAbstractExpressionClassName) {
		String oldAbstractExpressionClassName = abstractExpressionClassName;
		abstractExpressionClassName = newAbstractExpressionClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__ABSTRACT_EXPRESSION_CLASS_NAME, oldAbstractExpressionClassName, abstractExpressionClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProviders() {
		if (providers == null) {
			providers = new EObjectContainmentWithInverseEList(GenExpressionProviderBase.class, this, GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__PROVIDERS, GMFGenPackage.GEN_EXPRESSION_PROVIDER_BASE__CONTAINER);
		}
		return providers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenEditorGenerator getEditorGen() {
		if (eContainerFeatureID != GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__EDITOR_GEN) return null;
		return (GenEditorGenerator)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEditorGen(GenEditorGenerator newEditorGen, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEditorGen, GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__EDITOR_GEN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditorGen(GenEditorGenerator newEditorGen) {
		if (newEditorGen != eInternalContainer() || (eContainerFeatureID != GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__EDITOR_GEN && newEditorGen != null)) {
			if (EcoreUtil.isAncestor(this, newEditorGen))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEditorGen != null)
				msgs = ((InternalEObject)newEditorGen).eInverseAdd(this, GMFGenPackage.GEN_EDITOR_GENERATOR__EXPRESSION_PROVIDERS, GenEditorGenerator.class, msgs);
			msgs = basicSetEditorGen(newEditorGen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__EDITOR_GEN, newEditorGen, newEditorGen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */	
	public boolean isCopy(ValueExpression expression) {
		GenExpressionProviderBase provider = getProvider(expression);
		if(provider != null) {
			return !provider.getExpressions().contains(expression); 
		}
		return false;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GenExpressionProviderBase getProvider(ValueExpression expression) {
		for (Iterator it = getProviders().iterator(); it.hasNext();) {
			GenExpressionProviderBase nextProvider = (GenExpressionProviderBase) it.next();
			if(nextProvider.getExpressions().contains(expression)) {
				return nextProvider;
			}
		}
		// Note: lookup by expression language is performed in order to handle multiple
		// copies of expression coming from single node mapping reuse as only a single instance 
		// of ValueExpression is included in the 'expressions' feature.
		for (Iterator it = getProviders().iterator(); it.hasNext();) {
			GenExpressionProviderBase nextProvider = (GenExpressionProviderBase) it.next();
			if(expression != null && expression.getLanguage() != null && 
				expression.getLanguage().equals(nextProvider.getLanguage())) {
				return nextProvider;
			}
		}		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getAbstractExpressionQualifiedClassName() {
		return getExpressionsPackageName() + "." + getAbstractExpressionClassName(); //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__PROVIDERS:
				return ((InternalEList)getProviders()).basicAdd(otherEnd, msgs);
			case GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__EDITOR_GEN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEditorGen((GenEditorGenerator)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__PROVIDERS:
				return ((InternalEList)getProviders()).basicRemove(otherEnd, msgs);
			case GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__EDITOR_GEN:
				return basicSetEditorGen(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__EDITOR_GEN:
				return eInternalContainer().eInverseRemove(this, GMFGenPackage.GEN_EDITOR_GENERATOR__EXPRESSION_PROVIDERS, GenEditorGenerator.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__EXPRESSIONS_PACKAGE_NAME:
				return getExpressionsPackageName();
			case GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__ABSTRACT_EXPRESSION_CLASS_NAME:
				return getAbstractExpressionClassName();
			case GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__PROVIDERS:
				return getProviders();
			case GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__EDITOR_GEN:
				return getEditorGen();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__EXPRESSIONS_PACKAGE_NAME:
				setExpressionsPackageName((String)newValue);
				return;
			case GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__ABSTRACT_EXPRESSION_CLASS_NAME:
				setAbstractExpressionClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__PROVIDERS:
				getProviders().clear();
				getProviders().addAll((Collection)newValue);
				return;
			case GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__EDITOR_GEN:
				setEditorGen((GenEditorGenerator)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__EXPRESSIONS_PACKAGE_NAME:
				setExpressionsPackageName(EXPRESSIONS_PACKAGE_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__ABSTRACT_EXPRESSION_CLASS_NAME:
				setAbstractExpressionClassName(ABSTRACT_EXPRESSION_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__PROVIDERS:
				getProviders().clear();
				return;
			case GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__EDITOR_GEN:
				setEditorGen((GenEditorGenerator)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__EXPRESSIONS_PACKAGE_NAME:
				return EXPRESSIONS_PACKAGE_NAME_EDEFAULT == null ? expressionsPackageName != null : !EXPRESSIONS_PACKAGE_NAME_EDEFAULT.equals(expressionsPackageName);
			case GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__ABSTRACT_EXPRESSION_CLASS_NAME:
				return ABSTRACT_EXPRESSION_CLASS_NAME_EDEFAULT == null ? abstractExpressionClassName != null : !ABSTRACT_EXPRESSION_CLASS_NAME_EDEFAULT.equals(abstractExpressionClassName);
			case GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__PROVIDERS:
				return providers != null && !providers.isEmpty();
			case GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__EDITOR_GEN:
				return getEditorGen() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (expressionsPackageName: ");
		result.append(expressionsPackageName);
		result.append(", abstractExpressionClassName: ");
		result.append(abstractExpressionClassName);
		result.append(')');
		return result.toString();
	}

} //GenExpressionProviderContainerImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer;
import org.eclipse.gmf.codegen.gmfgen.GenFeatureInitializer;
import org.eclipse.gmf.codegen.gmfgen.GenFeatureSeqInitializer;
import org.eclipse.gmf.codegen.gmfgen.GenFeatureValueSpec;
import org.eclipse.gmf.codegen.gmfgen.GenJavaExpressionProvider;
import org.eclipse.gmf.codegen.gmfgen.GenReferenceNewElementSpec;
import org.eclipse.gmf.codegen.gmfgen.TypeModelFacet;
import org.eclipse.gmf.common.codegen.ImportAssistant;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Feature Seq Initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenFeatureSeqInitializerImpl#getTypeModelFacet <em>Type Model Facet</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenFeatureSeqInitializerImpl#getInitializers <em>Initializers</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenFeatureSeqInitializerImpl#getElementClass <em>Element Class</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenFeatureSeqInitializerImpl#getCreatingInitializer <em>Creating Initializer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenFeatureSeqInitializerImpl extends EObjectImpl implements GenFeatureSeqInitializer {
	/**
	 * The cached value of the '{@link #getInitializers() <em>Initializers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializers()
	 * @generated
	 * @ordered
	 */
	protected EList<GenFeatureInitializer> initializers;

	/**
	 * The cached value of the '{@link #getElementClass() <em>Element Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementClass()
	 * @generated
	 * @ordered
	 */
	protected GenClass elementClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenFeatureSeqInitializerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenFeatureSeqInitializer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeModelFacet getTypeModelFacet() {
		TypeModelFacet typeModelFacet = basicGetTypeModelFacet();
		return typeModelFacet != null && typeModelFacet.eIsProxy() ? (TypeModelFacet)eResolveProxy((InternalEObject)typeModelFacet) : typeModelFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenFeatureInitializer> getInitializers() {
		if (initializers == null) {
			initializers = new EObjectContainmentWithInverseEList<GenFeatureInitializer>(GenFeatureInitializer.class, this, GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__INITIALIZERS, GMFGenPackage.GEN_FEATURE_INITIALIZER__FEATURE_SEQ_INITIALIZER);
		}
		return initializers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GenClass getElementClass() {
		if(getCreatingInitializer() == null) {
			return (getTypeModelFacet() != null) ? getTypeModelFacet().getMetaClass() : null;
		}
		GenClass genClass = getElementClassGen();
		if(genClass != null) {
			return genClass;
		}
		return (getCreatingInitializer().getFeature() != null) ? getCreatingInitializer().getFeature().getTypeGenClass() : null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClass getElementClassGen() {
		if (elementClass != null && elementClass.eIsProxy()) {
			InternalEObject oldElementClass = (InternalEObject)elementClass;
			elementClass = (GenClass)eResolveProxy(oldElementClass);
			if (elementClass != oldElementClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__ELEMENT_CLASS, oldElementClass, elementClass));
			}
		}
		return elementClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TypeModelFacet basicGetTypeModelFacet() {
		EObject container = eContainer();
		while(container != null && !(container instanceof TypeModelFacet)) {
			container = container.eContainer();
		}
		return (container != null) ? (TypeModelFacet)container : null;
	}	
		
	/**
	 * @generated NOT
	 */
	public String getInitializerFieldName(String elementID) {
		StringBuffer buf = new StringBuffer();
		if (getCreatingInitializer() != null && getCreatingInitializer().getFeatureSeqInitializer() != null) {
			GenFeatureSeqInitializer parentFSeqInitializer = getCreatingInitializer().getFeatureSeqInitializer();
			if(parentFSeqInitializer.getCreatingInitializer() != null) {
				buf.append(parentFSeqInitializer.getInitializerFieldName(elementID)).append('_');
			}
			if(getCreatingInitializer().getFeature() != null) {
				buf.append(getCreatingInitializer().getFeature().getName());
				EList<GenFeatureSeqInitializer> siblingInitalizers = getCreatingInitializer().getNewElementInitializers();		
				if(siblingInitalizers.size() > 1) {
					int pos = siblingInitalizers.indexOf(this);
					buf.append('_').append(pos + 1);
				}				
			}
		} else {
			buf.append(elementID);
		}
		return buf.toString();
	}

	/**
	 * @generated NOT
	 */	
	public List<GenFeatureSeqInitializer> getAllFeatureSeqInitializers() {
		List<GenFeatureSeqInitializer> result = new ArrayList<GenFeatureSeqInitializer>();
		result.add(this);
		for (GenFeatureInitializer nextFeatureInit : getInitializers()) {
			result.addAll(nextFeatureInit.getAllFeatureSeqInitializers());
		}
		return Collections.unmodifiableList(result);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getElementClassAccessorName() {
		GenClass genClass = getElementClass();
		return (genClass != null) ? genClass.getClassifierAccessorName() : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getElementQualifiedPackageInterfaceName() {
		GenClass genClass = getElementClass();
		return (genClass != null) ? genClass.getGenPackage().getQualifiedPackageInterfaceName() : null;		
	}
		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getElementClassAccessor() {
		return getElementClassAccessor(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getFeatureAccessor(GenFeatureInitializer ftInitializer) {
		return getFeatureAccessor(ftInitializer, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<GenFeatureValueSpec> getJavaExpressionFeatureInitializersList(GenExpressionProviderContainer expressionProviders) {
		return new BasicEList<GenFeatureValueSpec>(getJavaExpressionFeatureInitializers(expressionProviders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__INITIALIZERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInitializers()).basicAdd(otherEnd, msgs);
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__CREATING_INITIALIZER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__CREATING_INITIALIZER, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__INITIALIZERS:
				return ((InternalEList<?>)getInitializers()).basicRemove(otherEnd, msgs);
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__CREATING_INITIALIZER:
				return eBasicSetContainer(null, GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__CREATING_INITIALIZER, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__CREATING_INITIALIZER:
				return eInternalContainer().eInverseRemove(this, GMFGenPackage.GEN_REFERENCE_NEW_ELEMENT_SPEC__NEW_ELEMENT_INITIALIZERS, GenReferenceNewElementSpec.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__TYPE_MODEL_FACET:
				if (resolve) return getTypeModelFacet();
				return basicGetTypeModelFacet();
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__INITIALIZERS:
				return getInitializers();
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__ELEMENT_CLASS:
				if (resolve) return getElementClass();
				return basicGetElementClass();
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__CREATING_INITIALIZER:
				return getCreatingInitializer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__INITIALIZERS:
				getInitializers().clear();
				getInitializers().addAll((Collection<? extends GenFeatureInitializer>)newValue);
				return;
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__ELEMENT_CLASS:
				setElementClass((GenClass)newValue);
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
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__INITIALIZERS:
				getInitializers().clear();
				return;
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__ELEMENT_CLASS:
				setElementClass((GenClass)null);
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
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__TYPE_MODEL_FACET:
				return basicGetTypeModelFacet() != null;
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__INITIALIZERS:
				return initializers != null && !initializers.isEmpty();
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__ELEMENT_CLASS:
				return elementClass != null;
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__CREATING_INITIALIZER:
				return getCreatingInitializer() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClass basicGetElementClass() {
		return elementClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setElementClass(GenClass newElementClass) {
		if(getCreatingInitializer() == null && eContainer() != null) {
			return;
		}
		setElementClassGen(newElementClass);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementClassGen(GenClass newElementClass) {
		GenClass oldElementClass = elementClass;
		elementClass = newElementClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__ELEMENT_CLASS, oldElementClass, elementClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenReferenceNewElementSpec getCreatingInitializer() {
		if (eContainerFeatureID != GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__CREATING_INITIALIZER) return null;
		return (GenReferenceNewElementSpec)eContainer();
	}

	public String getElementClassAccessor(ImportAssistant importAssistant) {
		if(getElementClass() == null) {
			return ""; //$NON-NLS-1$
		}
		StringBuffer buf = new StringBuffer();
		buf.append(getElementQualifiedPackageInterfaceName())
			.append(".eINSTANCE.get") //$NON-NLS-1$
			.append(getElementClass().getClassifierAccessorName())
			.append("()"); //$NON-NLS-1$
		return buf.toString();
	}
	
	public String getFeatureAccessor(GenFeatureInitializer featureInitializer, ImportAssistant importAssistant) {
		if(featureInitializer.getFeature() == null) {
			return ""; //$NON-NLS-1$
		}
		StringBuffer buf = new StringBuffer();
		String fqn = featureInitializer.getFeatureQualifiedPackageInterfaceName();
		if (importAssistant != null) {
			fqn = importAssistant.getImportedName(fqn);
		}
		buf.append(fqn)
			.append(".eINSTANCE.get") //$NON-NLS-1$
			.append(featureInitializer.getFeature().getFeatureAccessorName())
			.append("()"); //$NON-NLS-1$
		return buf.toString();
	}
	
	public LinkedHashSet<GenFeatureValueSpec> getJavaExpressionFeatureInitializers(GenExpressionProviderContainer expressionProviders) {
		LinkedHashSet<GenFeatureValueSpec> result = new LinkedHashSet<GenFeatureValueSpec>();
		if(expressionProviders != null) {
			for (GenFeatureInitializer next : getInitializers()) {
				if(next instanceof GenFeatureValueSpec) {
					GenFeatureValueSpec featureValueSpec = (GenFeatureValueSpec) next;				
					if(expressionProviders.getProvider(featureValueSpec) instanceof GenJavaExpressionProvider && 
						!expressionProviders.isCopy(featureValueSpec)) {
						result.add(featureValueSpec);
					}
				} else {					
					for (GenFeatureSeqInitializer ftSeqInitializer : next.getAllFeatureSeqInitializers()) {
						result.addAll(ftSeqInitializer.getJavaExpressionFeatureInitializers(expressionProviders));
					}					
				}
			}
		}
		return result;
	}

} //GenFeatureSeqInitializerImpl

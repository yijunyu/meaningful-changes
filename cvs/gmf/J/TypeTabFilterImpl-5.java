/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenCustomPropertyTab;
import org.eclipse.gmf.codegen.gmfgen.GenNavigator;
import org.eclipse.gmf.codegen.gmfgen.GeneratedType;
import org.eclipse.gmf.codegen.gmfgen.TypeTabFilter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Tab Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.TypeTabFilterImpl#getTab <em>Tab</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.TypeTabFilterImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.TypeTabFilterImpl#getGeneratedTypes <em>Generated Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTabFilterImpl extends EObjectImpl implements TypeTabFilter {
	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> types;

	/**
	 * The cached value of the '{@link #getGeneratedTypes() <em>Generated Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratedType> generatedTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTabFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getTypeTabFilter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCustomPropertyTab getTab() {
		if (eContainerFeatureID != GMFGenPackage.TYPE_TAB_FILTER__TAB) return null;
		return (GenCustomPropertyTab)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTypes() {
		if (types == null) {
			types = new EDataTypeUniqueEList<String>(String.class, this, GMFGenPackage.TYPE_TAB_FILTER__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratedType> getGeneratedTypes() {
		if (generatedTypes == null) {
			generatedTypes = new EDataTypeUniqueEList<GeneratedType>(GeneratedType.class, this, GMFGenPackage.TYPE_TAB_FILTER__GENERATED_TYPES);
		}
		return generatedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getAllTypes() {
		ArrayList<String> result = new ArrayList<String>();
		result.addAll(getTypes());
		if (getGeneratedTypes().size() > 0) {
			for (GeneratedType nextGeneratedType : getGeneratedTypes()) {
				if (nextGeneratedType == GeneratedType.ABSTRACT_NAVIGATOR_ITEM_LITERAL) {
					GenNavigator navigator = getTab().getSheet().getEditorGen().getNavigator();
					if (navigator != null) {
						result.add(navigator.getAbstractNavigatorItemQualifiedClassName());	
					}
				}
			}
		}
		return new BasicEList.UnmodifiableEList<String>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.TYPE_TAB_FILTER__TAB:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, GMFGenPackage.TYPE_TAB_FILTER__TAB, msgs);
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
			case GMFGenPackage.TYPE_TAB_FILTER__TAB:
				return eBasicSetContainer(null, GMFGenPackage.TYPE_TAB_FILTER__TAB, msgs);
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
			case GMFGenPackage.TYPE_TAB_FILTER__TAB:
				return eInternalContainer().eInverseRemove(this, GMFGenPackage.GEN_CUSTOM_PROPERTY_TAB__FILTER, GenCustomPropertyTab.class, msgs);
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
			case GMFGenPackage.TYPE_TAB_FILTER__TAB:
				return getTab();
			case GMFGenPackage.TYPE_TAB_FILTER__TYPES:
				return getTypes();
			case GMFGenPackage.TYPE_TAB_FILTER__GENERATED_TYPES:
				return getGeneratedTypes();
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
			case GMFGenPackage.TYPE_TAB_FILTER__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends String>)newValue);
				return;
			case GMFGenPackage.TYPE_TAB_FILTER__GENERATED_TYPES:
				getGeneratedTypes().clear();
				getGeneratedTypes().addAll((Collection<? extends GeneratedType>)newValue);
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
			case GMFGenPackage.TYPE_TAB_FILTER__TYPES:
				getTypes().clear();
				return;
			case GMFGenPackage.TYPE_TAB_FILTER__GENERATED_TYPES:
				getGeneratedTypes().clear();
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
			case GMFGenPackage.TYPE_TAB_FILTER__TAB:
				return getTab() != null;
			case GMFGenPackage.TYPE_TAB_FILTER__TYPES:
				return types != null && !types.isEmpty();
			case GMFGenPackage.TYPE_TAB_FILTER__GENERATED_TYPES:
				return generatedTypes != null && !generatedTypes.isEmpty();
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
		result.append(" (types: ");
		result.append(types);
		result.append(", generatedTypes: ");
		result.append(generatedTypes);
		result.append(')');
		return result.toString();
	}

} //TypeTabFilterImpl
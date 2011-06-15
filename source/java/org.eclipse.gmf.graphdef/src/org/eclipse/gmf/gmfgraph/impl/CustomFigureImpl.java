/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.gmfgraph.CustomAttribute;
import org.eclipse.gmf.gmfgraph.CustomClass;
import org.eclipse.gmf.gmfgraph.CustomFigure;
import org.eclipse.gmf.gmfgraph.FigureAccessor;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Figure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl#getQualifiedClassName <em>Qualified Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl#getCustomChildren <em>Custom Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomFigureImpl extends RealFigureImpl implements CustomFigure {
	/**
	 * The default value of the '{@link #getQualifiedClassName() <em>Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifiedClassName() <em>Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedClassName()
	 * @generated
	 * @ordered
	 */
	protected String qualifiedClassName = QUALIFIED_CLASS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomAttribute> attributes;

	/**
	 * The cached value of the '{@link #getCustomChildren() <em>Custom Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<FigureAccessor> customChildren;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomFigureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getCustomFigure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedClassName() {
		return qualifiedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedClassName(String newQualifiedClassName) {
		String oldQualifiedClassName = qualifiedClassName;
		qualifiedClassName = newQualifiedClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__QUALIFIED_CLASS_NAME, oldQualifiedClassName, qualifiedClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<CustomAttribute>(CustomAttribute.class, this, GMFGraphPackage.CUSTOM_FIGURE__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FigureAccessor> getCustomChildren() {
		if (customChildren == null) {
			customChildren = new EObjectContainmentEList<FigureAccessor>(FigureAccessor.class, this, GMFGraphPackage.CUSTOM_FIGURE__CUSTOM_CHILDREN);
		}
		return customChildren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGraphPackage.CUSTOM_FIGURE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case GMFGraphPackage.CUSTOM_FIGURE__CUSTOM_CHILDREN:
				return ((InternalEList<?>)getCustomChildren()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGraphPackage.CUSTOM_FIGURE__QUALIFIED_CLASS_NAME:
				return getQualifiedClassName();
			case GMFGraphPackage.CUSTOM_FIGURE__ATTRIBUTES:
				return getAttributes();
			case GMFGraphPackage.CUSTOM_FIGURE__CUSTOM_CHILDREN:
				return getCustomChildren();
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
			case GMFGraphPackage.CUSTOM_FIGURE__QUALIFIED_CLASS_NAME:
				setQualifiedClassName((String)newValue);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends CustomAttribute>)newValue);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__CUSTOM_CHILDREN:
				getCustomChildren().clear();
				getCustomChildren().addAll((Collection<? extends FigureAccessor>)newValue);
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
			case GMFGraphPackage.CUSTOM_FIGURE__QUALIFIED_CLASS_NAME:
				setQualifiedClassName(QUALIFIED_CLASS_NAME_EDEFAULT);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__CUSTOM_CHILDREN:
				getCustomChildren().clear();
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
			case GMFGraphPackage.CUSTOM_FIGURE__QUALIFIED_CLASS_NAME:
				return QUALIFIED_CLASS_NAME_EDEFAULT == null ? qualifiedClassName != null : !QUALIFIED_CLASS_NAME_EDEFAULT.equals(qualifiedClassName);
			case GMFGraphPackage.CUSTOM_FIGURE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case GMFGraphPackage.CUSTOM_FIGURE__CUSTOM_CHILDREN:
				return customChildren != null && !customChildren.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CustomClass.class) {
			switch (derivedFeatureID) {
				case GMFGraphPackage.CUSTOM_FIGURE__QUALIFIED_CLASS_NAME: return GMFGraphPackage.CUSTOM_CLASS__QUALIFIED_CLASS_NAME;
				case GMFGraphPackage.CUSTOM_FIGURE__ATTRIBUTES: return GMFGraphPackage.CUSTOM_CLASS__ATTRIBUTES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CustomClass.class) {
			switch (baseFeatureID) {
				case GMFGraphPackage.CUSTOM_CLASS__QUALIFIED_CLASS_NAME: return GMFGraphPackage.CUSTOM_FIGURE__QUALIFIED_CLASS_NAME;
				case GMFGraphPackage.CUSTOM_CLASS__ATTRIBUTES: return GMFGraphPackage.CUSTOM_FIGURE__ATTRIBUTES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (qualifiedClassName: ");
		result.append(qualifiedClassName);
		result.append(')');
		return result.toString();
	}

} //CustomFigureImpl

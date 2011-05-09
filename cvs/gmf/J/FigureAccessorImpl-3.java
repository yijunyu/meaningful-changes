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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gmf.gmfgraph.CustomFigure;
import org.eclipse.gmf.gmfgraph.DiagramElement;
import org.eclipse.gmf.gmfgraph.FigureAccessor;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Figure Accessor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.FigureAccessorImpl#getReferencingElements <em>Referencing Elements</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.FigureAccessorImpl#getAccessor <em>Accessor</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.FigureAccessorImpl#getTypedFigure <em>Typed Figure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FigureAccessorImpl extends EObjectImpl implements FigureAccessor {
	/**
	 * The cached value of the '{@link #getReferencingElements() <em>Referencing Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencingElements()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagramElement> referencingElements = null;

	/**
	 * The default value of the '{@link #getAccessor() <em>Accessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessor()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESSOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessor() <em>Accessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessor()
	 * @generated
	 * @ordered
	 */
	protected String accessor = ACCESSOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypedFigure() <em>Typed Figure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedFigure()
	 * @generated
	 * @ordered
	 */
	protected CustomFigure typedFigure = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FigureAccessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getFigureAccessor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagramElement> getReferencingElements() {
		if (referencingElements == null) {
			referencingElements = new EObjectWithInverseResolvingEList<DiagramElement>(DiagramElement.class, this, GMFGraphPackage.FIGURE_ACCESSOR__REFERENCING_ELEMENTS, GMFGraphPackage.DIAGRAM_ELEMENT__FIGURE);
		}
		return referencingElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessor() {
		return accessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessor(String newAccessor) {
		String oldAccessor = accessor;
		accessor = newAccessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.FIGURE_ACCESSOR__ACCESSOR, oldAccessor, accessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomFigure getTypedFigure() {
		if (typedFigure != null && typedFigure.eIsProxy()) {
			InternalEObject oldTypedFigure = (InternalEObject)typedFigure;
			typedFigure = (CustomFigure)eResolveProxy(oldTypedFigure);
			if (typedFigure != oldTypedFigure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGraphPackage.FIGURE_ACCESSOR__TYPED_FIGURE, oldTypedFigure, typedFigure));
			}
		}
		return typedFigure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomFigure basicGetTypedFigure() {
		return typedFigure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedFigure(CustomFigure newTypedFigure) {
		CustomFigure oldTypedFigure = typedFigure;
		typedFigure = newTypedFigure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.FIGURE_ACCESSOR__TYPED_FIGURE, oldTypedFigure, typedFigure));
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
			case GMFGraphPackage.FIGURE_ACCESSOR__REFERENCING_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencingElements()).basicAdd(otherEnd, msgs);
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
			case GMFGraphPackage.FIGURE_ACCESSOR__REFERENCING_ELEMENTS:
				return ((InternalEList<?>)getReferencingElements()).basicRemove(otherEnd, msgs);
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
			case GMFGraphPackage.FIGURE_ACCESSOR__REFERENCING_ELEMENTS:
				return getReferencingElements();
			case GMFGraphPackage.FIGURE_ACCESSOR__ACCESSOR:
				return getAccessor();
			case GMFGraphPackage.FIGURE_ACCESSOR__TYPED_FIGURE:
				if (resolve) return getTypedFigure();
				return basicGetTypedFigure();
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
			case GMFGraphPackage.FIGURE_ACCESSOR__REFERENCING_ELEMENTS:
				getReferencingElements().clear();
				getReferencingElements().addAll((Collection<? extends DiagramElement>)newValue);
				return;
			case GMFGraphPackage.FIGURE_ACCESSOR__ACCESSOR:
				setAccessor((String)newValue);
				return;
			case GMFGraphPackage.FIGURE_ACCESSOR__TYPED_FIGURE:
				setTypedFigure((CustomFigure)newValue);
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
			case GMFGraphPackage.FIGURE_ACCESSOR__REFERENCING_ELEMENTS:
				getReferencingElements().clear();
				return;
			case GMFGraphPackage.FIGURE_ACCESSOR__ACCESSOR:
				setAccessor(ACCESSOR_EDEFAULT);
				return;
			case GMFGraphPackage.FIGURE_ACCESSOR__TYPED_FIGURE:
				setTypedFigure((CustomFigure)null);
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
			case GMFGraphPackage.FIGURE_ACCESSOR__REFERENCING_ELEMENTS:
				return referencingElements != null && !referencingElements.isEmpty();
			case GMFGraphPackage.FIGURE_ACCESSOR__ACCESSOR:
				return ACCESSOR_EDEFAULT == null ? accessor != null : !ACCESSOR_EDEFAULT.equals(accessor);
			case GMFGraphPackage.FIGURE_ACCESSOR__TYPED_FIGURE:
				return typedFigure != null;
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
		result.append(" (accessor: ");
		result.append(accessor);
		result.append(')');
		return result.toString();
	}

} //FigureAccessorImpl
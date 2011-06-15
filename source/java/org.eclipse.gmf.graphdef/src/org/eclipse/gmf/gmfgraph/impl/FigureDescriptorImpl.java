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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.gmfgraph.ChildAccess;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FigureDescriptor;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Figure Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.FigureDescriptorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.FigureDescriptorImpl#getActualFigure <em>Actual Figure</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.FigureDescriptorImpl#getAccessors <em>Accessors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FigureDescriptorImpl extends EObjectImpl implements FigureDescriptor {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActualFigure() <em>Actual Figure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualFigure()
	 * @generated
	 * @ordered
	 */
	protected Figure actualFigure;

	/**
	 * The cached value of the '{@link #getAccessors() <em>Accessors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<ChildAccess> accessors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FigureDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getFigureDescriptor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.FIGURE_DESCRIPTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Figure getActualFigure() {
		return actualFigure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActualFigure(Figure newActualFigure, NotificationChain msgs) {
		Figure oldActualFigure = actualFigure;
		actualFigure = newActualFigure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.FIGURE_DESCRIPTOR__ACTUAL_FIGURE, oldActualFigure, newActualFigure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualFigure(Figure newActualFigure) {
		if (newActualFigure != actualFigure) {
			NotificationChain msgs = null;
			if (actualFigure != null)
				msgs = ((InternalEObject)actualFigure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.FIGURE_DESCRIPTOR__ACTUAL_FIGURE, null, msgs);
			if (newActualFigure != null)
				msgs = ((InternalEObject)newActualFigure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.FIGURE_DESCRIPTOR__ACTUAL_FIGURE, null, msgs);
			msgs = basicSetActualFigure(newActualFigure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.FIGURE_DESCRIPTOR__ACTUAL_FIGURE, newActualFigure, newActualFigure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChildAccess> getAccessors() {
		if (accessors == null) {
			accessors = new EObjectContainmentWithInverseEList<ChildAccess>(ChildAccess.class, this, GMFGraphPackage.FIGURE_DESCRIPTOR__ACCESSORS, GMFGraphPackage.CHILD_ACCESS__OWNER);
		}
		return accessors;
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
			case GMFGraphPackage.FIGURE_DESCRIPTOR__ACCESSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccessors()).basicAdd(otherEnd, msgs);
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
			case GMFGraphPackage.FIGURE_DESCRIPTOR__ACTUAL_FIGURE:
				return basicSetActualFigure(null, msgs);
			case GMFGraphPackage.FIGURE_DESCRIPTOR__ACCESSORS:
				return ((InternalEList<?>)getAccessors()).basicRemove(otherEnd, msgs);
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
			case GMFGraphPackage.FIGURE_DESCRIPTOR__NAME:
				return getName();
			case GMFGraphPackage.FIGURE_DESCRIPTOR__ACTUAL_FIGURE:
				return getActualFigure();
			case GMFGraphPackage.FIGURE_DESCRIPTOR__ACCESSORS:
				return getAccessors();
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
			case GMFGraphPackage.FIGURE_DESCRIPTOR__NAME:
				setName((String)newValue);
				return;
			case GMFGraphPackage.FIGURE_DESCRIPTOR__ACTUAL_FIGURE:
				setActualFigure((Figure)newValue);
				return;
			case GMFGraphPackage.FIGURE_DESCRIPTOR__ACCESSORS:
				getAccessors().clear();
				getAccessors().addAll((Collection<? extends ChildAccess>)newValue);
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
			case GMFGraphPackage.FIGURE_DESCRIPTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GMFGraphPackage.FIGURE_DESCRIPTOR__ACTUAL_FIGURE:
				setActualFigure((Figure)null);
				return;
			case GMFGraphPackage.FIGURE_DESCRIPTOR__ACCESSORS:
				getAccessors().clear();
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
			case GMFGraphPackage.FIGURE_DESCRIPTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GMFGraphPackage.FIGURE_DESCRIPTOR__ACTUAL_FIGURE:
				return actualFigure != null;
			case GMFGraphPackage.FIGURE_DESCRIPTOR__ACCESSORS:
				return accessors != null && !accessors.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FigureDescriptorImpl

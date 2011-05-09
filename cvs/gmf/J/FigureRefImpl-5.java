/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FigureRef;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.Layout;
import org.eclipse.gmf.gmfgraph.LayoutData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Figure Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.FigureRefImpl#getLayoutData <em>Layout Data</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.FigureRefImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.FigureRefImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.FigureRefImpl#getFigure <em>Figure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FigureRefImpl extends EObjectImpl implements FigureRef {
	/**
	 * The cached value of the '{@link #getLayoutData() <em>Layout Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutData()
	 * @generated
	 * @ordered
	 */
	protected LayoutData layoutData = null;

	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected Layout layout = null;

	/**
	 * The cached value of the '{@link #getFigure() <em>Figure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigure()
	 * @generated
	 * @ordered
	 */
	protected Figure figure = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FigureRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getFigureRef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutData getLayoutData() {
		return layoutData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayoutData(LayoutData newLayoutData, NotificationChain msgs) {
		LayoutData oldLayoutData = layoutData;
		layoutData = newLayoutData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.FIGURE_REF__LAYOUT_DATA, oldLayoutData, newLayoutData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutData(LayoutData newLayoutData) {
		if (newLayoutData != layoutData) {
			NotificationChain msgs = null;
			if (layoutData != null)
				msgs = ((InternalEObject)layoutData).eInverseRemove(this, GMFGraphPackage.LAYOUT_DATA__OWNER, LayoutData.class, msgs);
			if (newLayoutData != null)
				msgs = ((InternalEObject)newLayoutData).eInverseAdd(this, GMFGraphPackage.LAYOUT_DATA__OWNER, LayoutData.class, msgs);
			msgs = basicSetLayoutData(newLayoutData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.FIGURE_REF__LAYOUT_DATA, newLayoutData, newLayoutData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout getLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout(Layout newLayout, NotificationChain msgs) {
		Layout oldLayout = layout;
		layout = newLayout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.FIGURE_REF__LAYOUT, oldLayout, newLayout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout(Layout newLayout) {
		if (newLayout != layout) {
			NotificationChain msgs = null;
			if (layout != null)
				msgs = ((InternalEObject)layout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.FIGURE_REF__LAYOUT, null, msgs);
			if (newLayout != null)
				msgs = ((InternalEObject)newLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.FIGURE_REF__LAYOUT, null, msgs);
			msgs = basicSetLayout(newLayout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.FIGURE_REF__LAYOUT, newLayout, newLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Figure getParent() {
		if (eContainerFeatureID != GMFGraphPackage.FIGURE_REF__PARENT) return null;
		return (Figure)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Figure getFigure() {
		if (figure != null && figure.eIsProxy()) {
			InternalEObject oldFigure = (InternalEObject)figure;
			figure = (Figure)eResolveProxy(oldFigure);
			if (figure != oldFigure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGraphPackage.FIGURE_REF__FIGURE, oldFigure, figure));
			}
		}
		return figure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Figure basicGetFigure() {
		return figure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFigure(Figure newFigure) {
		Figure oldFigure = figure;
		figure = newFigure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.FIGURE_REF__FIGURE, oldFigure, figure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGraphPackage.FIGURE_REF__LAYOUT_DATA:
				if (layoutData != null)
					msgs = ((InternalEObject)layoutData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.FIGURE_REF__LAYOUT_DATA, null, msgs);
				return basicSetLayoutData((LayoutData)otherEnd, msgs);
			case GMFGraphPackage.FIGURE_REF__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, GMFGraphPackage.FIGURE_REF__PARENT, msgs);
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
			case GMFGraphPackage.FIGURE_REF__LAYOUT_DATA:
				return basicSetLayoutData(null, msgs);
			case GMFGraphPackage.FIGURE_REF__LAYOUT:
				return basicSetLayout(null, msgs);
			case GMFGraphPackage.FIGURE_REF__PARENT:
				return eBasicSetContainer(null, GMFGraphPackage.FIGURE_REF__PARENT, msgs);
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
			case GMFGraphPackage.FIGURE_REF__PARENT:
				return eInternalContainer().eInverseRemove(this, GMFGraphPackage.FIGURE__CHILDREN, Figure.class, msgs);
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
			case GMFGraphPackage.FIGURE_REF__LAYOUT_DATA:
				return getLayoutData();
			case GMFGraphPackage.FIGURE_REF__LAYOUT:
				return getLayout();
			case GMFGraphPackage.FIGURE_REF__PARENT:
				return getParent();
			case GMFGraphPackage.FIGURE_REF__FIGURE:
				if (resolve) return getFigure();
				return basicGetFigure();
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
			case GMFGraphPackage.FIGURE_REF__LAYOUT_DATA:
				setLayoutData((LayoutData)newValue);
				return;
			case GMFGraphPackage.FIGURE_REF__LAYOUT:
				setLayout((Layout)newValue);
				return;
			case GMFGraphPackage.FIGURE_REF__FIGURE:
				setFigure((Figure)newValue);
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
			case GMFGraphPackage.FIGURE_REF__LAYOUT_DATA:
				setLayoutData((LayoutData)null);
				return;
			case GMFGraphPackage.FIGURE_REF__LAYOUT:
				setLayout((Layout)null);
				return;
			case GMFGraphPackage.FIGURE_REF__FIGURE:
				setFigure((Figure)null);
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
			case GMFGraphPackage.FIGURE_REF__LAYOUT_DATA:
				return layoutData != null;
			case GMFGraphPackage.FIGURE_REF__LAYOUT:
				return layout != null;
			case GMFGraphPackage.FIGURE_REF__PARENT:
				return getParent() != null;
			case GMFGraphPackage.FIGURE_REF__FIGURE:
				return figure != null;
		}
		return super.eIsSet(featureID);
	}

} //FigureRefImpl

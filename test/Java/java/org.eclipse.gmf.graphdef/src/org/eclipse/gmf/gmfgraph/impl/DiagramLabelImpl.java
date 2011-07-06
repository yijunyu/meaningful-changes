/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.gmfgraph.ChildAccess;
import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.DiagramLabelImpl#isElementIcon <em>Element Icon</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.DiagramLabelImpl#getAccessor <em>Accessor</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.DiagramLabelImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.DiagramLabelImpl#isExternal <em>External</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramLabelImpl extends NodeImpl implements DiagramLabel {
	/**
	 * The default value of the '{@link #isElementIcon() <em>Element Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElementIcon()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ELEMENT_ICON_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isElementIcon() <em>Element Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElementIcon()
	 * @generated
	 * @ordered
	 */
	protected boolean elementIcon = ELEMENT_ICON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccessor() <em>Accessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessor()
	 * @generated
	 * @ordered
	 */
	protected ChildAccess accessor;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected ChildAccess container;

	/**
	 * The default value of the '{@link #isExternal() <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTERNAL_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getDiagramLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isElementIcon() {
		return elementIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementIcon(boolean newElementIcon) {
		boolean oldElementIcon = elementIcon;
		elementIcon = newElementIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.DIAGRAM_LABEL__ELEMENT_ICON, oldElementIcon, elementIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildAccess getAccessor() {
		if (accessor != null && accessor.eIsProxy()) {
			InternalEObject oldAccessor = (InternalEObject)accessor;
			accessor = (ChildAccess)eResolveProxy(oldAccessor);
			if (accessor != oldAccessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGraphPackage.DIAGRAM_LABEL__ACCESSOR, oldAccessor, accessor));
			}
		}
		return accessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildAccess basicGetAccessor() {
		return accessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessor(ChildAccess newAccessor) {
		ChildAccess oldAccessor = accessor;
		accessor = newAccessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.DIAGRAM_LABEL__ACCESSOR, oldAccessor, accessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildAccess getContainer() {
		if (container != null && container.eIsProxy()) {
			InternalEObject oldContainer = (InternalEObject)container;
			container = (ChildAccess)eResolveProxy(oldContainer);
			if (container != oldContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGraphPackage.DIAGRAM_LABEL__CONTAINER, oldContainer, container));
			}
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildAccess basicGetContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(ChildAccess newContainer) {
		ChildAccess oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.DIAGRAM_LABEL__CONTAINER, oldContainer, container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isExternal() {
		ChildAccess labelAccessor = getAccessor();
		return labelAccessor == null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGraphPackage.DIAGRAM_LABEL__ELEMENT_ICON:
				return isElementIcon() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.DIAGRAM_LABEL__ACCESSOR:
				if (resolve) return getAccessor();
				return basicGetAccessor();
			case GMFGraphPackage.DIAGRAM_LABEL__CONTAINER:
				if (resolve) return getContainer();
				return basicGetContainer();
			case GMFGraphPackage.DIAGRAM_LABEL__EXTERNAL:
				return isExternal() ? Boolean.TRUE : Boolean.FALSE;
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
			case GMFGraphPackage.DIAGRAM_LABEL__ELEMENT_ICON:
				setElementIcon(((Boolean)newValue).booleanValue());
				return;
			case GMFGraphPackage.DIAGRAM_LABEL__ACCESSOR:
				setAccessor((ChildAccess)newValue);
				return;
			case GMFGraphPackage.DIAGRAM_LABEL__CONTAINER:
				setContainer((ChildAccess)newValue);
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
			case GMFGraphPackage.DIAGRAM_LABEL__ELEMENT_ICON:
				setElementIcon(ELEMENT_ICON_EDEFAULT);
				return;
			case GMFGraphPackage.DIAGRAM_LABEL__ACCESSOR:
				setAccessor((ChildAccess)null);
				return;
			case GMFGraphPackage.DIAGRAM_LABEL__CONTAINER:
				setContainer((ChildAccess)null);
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
			case GMFGraphPackage.DIAGRAM_LABEL__ELEMENT_ICON:
				return elementIcon != ELEMENT_ICON_EDEFAULT;
			case GMFGraphPackage.DIAGRAM_LABEL__ACCESSOR:
				return accessor != null;
			case GMFGraphPackage.DIAGRAM_LABEL__CONTAINER:
				return container != null;
			case GMFGraphPackage.DIAGRAM_LABEL__EXTERNAL:
				return isExternal() != EXTERNAL_EDEFAULT;
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
		result.append(" (elementIcon: ");
		result.append(elementIcon);
		result.append(')');
		return result.toString();
	}

} //DiagramLabelImpl

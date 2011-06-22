/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenChildLabelNode;
import org.eclipse.gmf.codegen.gmfgen.LabelModelFacet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Child Label Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenChildLabelNodeImpl#isLabelReadOnly <em>Label Read Only</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenChildLabelNodeImpl#isLabelElementIcon <em>Label Element Icon</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenChildLabelNodeImpl#getLabelModelFacet <em>Label Model Facet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenChildLabelNodeImpl extends GenChildNodeImpl implements GenChildLabelNode {
	/**
	 * The default value of the '{@link #isLabelReadOnly() <em>Label Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLabelReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LABEL_READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLabelReadOnly() <em>Label Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLabelReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean labelReadOnly = LABEL_READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isLabelElementIcon() <em>Label Element Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLabelElementIcon()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LABEL_ELEMENT_ICON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLabelElementIcon() <em>Label Element Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLabelElementIcon()
	 * @generated
	 * @ordered
	 */
	protected boolean labelElementIcon = LABEL_ELEMENT_ICON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLabelModelFacet() <em>Label Model Facet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelModelFacet()
	 * @generated
	 * @ordered
	 */
	protected LabelModelFacet labelModelFacet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenChildLabelNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenChildLabelNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLabelReadOnly() {
		return labelReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelReadOnly(boolean newLabelReadOnly) {
		boolean oldLabelReadOnly = labelReadOnly;
		labelReadOnly = newLabelReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_CHILD_LABEL_NODE__LABEL_READ_ONLY, oldLabelReadOnly, labelReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLabelElementIcon() {
		return labelElementIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelElementIcon(boolean newLabelElementIcon) {
		boolean oldLabelElementIcon = labelElementIcon;
		labelElementIcon = newLabelElementIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_CHILD_LABEL_NODE__LABEL_ELEMENT_ICON, oldLabelElementIcon, labelElementIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelModelFacet getLabelModelFacet() {
		return labelModelFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelModelFacet(LabelModelFacet newLabelModelFacet, NotificationChain msgs) {
		LabelModelFacet oldLabelModelFacet = labelModelFacet;
		labelModelFacet = newLabelModelFacet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_CHILD_LABEL_NODE__LABEL_MODEL_FACET, oldLabelModelFacet, newLabelModelFacet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelModelFacet(LabelModelFacet newLabelModelFacet) {
		if (newLabelModelFacet != labelModelFacet) {
			NotificationChain msgs = null;
			if (labelModelFacet != null)
				msgs = ((InternalEObject)labelModelFacet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_CHILD_LABEL_NODE__LABEL_MODEL_FACET, null, msgs);
			if (newLabelModelFacet != null)
				msgs = ((InternalEObject)newLabelModelFacet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_CHILD_LABEL_NODE__LABEL_MODEL_FACET, null, msgs);
			msgs = basicSetLabelModelFacet(newLabelModelFacet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_CHILD_LABEL_NODE__LABEL_MODEL_FACET, newLabelModelFacet, newLabelModelFacet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<GenFeature> getLabelMetaFeatures() {
		return GenLabelImpl.getMetaFeatures(getLabelModelFacet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_CHILD_LABEL_NODE__LABEL_MODEL_FACET:
				return basicSetLabelModelFacet(null, msgs);
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
			case GMFGenPackage.GEN_CHILD_LABEL_NODE__LABEL_READ_ONLY:
				return isLabelReadOnly() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_CHILD_LABEL_NODE__LABEL_ELEMENT_ICON:
				return isLabelElementIcon() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_CHILD_LABEL_NODE__LABEL_MODEL_FACET:
				return getLabelModelFacet();
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
			case GMFGenPackage.GEN_CHILD_LABEL_NODE__LABEL_READ_ONLY:
				setLabelReadOnly(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_CHILD_LABEL_NODE__LABEL_ELEMENT_ICON:
				setLabelElementIcon(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_CHILD_LABEL_NODE__LABEL_MODEL_FACET:
				setLabelModelFacet((LabelModelFacet)newValue);
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
			case GMFGenPackage.GEN_CHILD_LABEL_NODE__LABEL_READ_ONLY:
				setLabelReadOnly(LABEL_READ_ONLY_EDEFAULT);
				return;
			case GMFGenPackage.GEN_CHILD_LABEL_NODE__LABEL_ELEMENT_ICON:
				setLabelElementIcon(LABEL_ELEMENT_ICON_EDEFAULT);
				return;
			case GMFGenPackage.GEN_CHILD_LABEL_NODE__LABEL_MODEL_FACET:
				setLabelModelFacet((LabelModelFacet)null);
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
			case GMFGenPackage.GEN_CHILD_LABEL_NODE__LABEL_READ_ONLY:
				return labelReadOnly != LABEL_READ_ONLY_EDEFAULT;
			case GMFGenPackage.GEN_CHILD_LABEL_NODE__LABEL_ELEMENT_ICON:
				return labelElementIcon != LABEL_ELEMENT_ICON_EDEFAULT;
			case GMFGenPackage.GEN_CHILD_LABEL_NODE__LABEL_MODEL_FACET:
				return labelModelFacet != null;
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
		result.append(" (labelReadOnly: ");
		result.append(labelReadOnly);
		result.append(", labelElementIcon: ");
		result.append(labelElementIcon);
		result.append(')');
		return result.toString();
	}

} //GenChildLabelNodeImpl
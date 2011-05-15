/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Compartment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCompartmentImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCompartmentImpl#isCanCollapse <em>Can Collapse</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCompartmentImpl#isHideIfEmpty <em>Hide If Empty</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCompartmentImpl#isNeedsTitle <em>Needs Title</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCompartmentImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCompartmentImpl#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenCompartmentImpl extends GenChildContainerImpl implements GenCompartment {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCanCollapse() <em>Can Collapse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanCollapse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_COLLAPSE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCanCollapse() <em>Can Collapse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanCollapse()
	 * @generated
	 * @ordered
	 */
	protected boolean canCollapse = CAN_COLLAPSE_EDEFAULT;

	/**
	 * The default value of the '{@link #isHideIfEmpty() <em>Hide If Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideIfEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDE_IF_EMPTY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isHideIfEmpty() <em>Hide If Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideIfEmpty()
	 * @generated
	 * @ordered
	 */
	protected boolean hideIfEmpty = HIDE_IF_EMPTY_EDEFAULT;

	/**
	 * The default value of the '{@link #isNeedsTitle() <em>Needs Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsTitle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEEDS_TITLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isNeedsTitle() <em>Needs Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsTitle()
	 * @generated
	 * @ordered
	 */
	protected boolean needsTitle = NEEDS_TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected GenNode node = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenCompartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenCompartment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_COMPARTMENT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanCollapse() {
		return canCollapse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanCollapse(boolean newCanCollapse) {
		boolean oldCanCollapse = canCollapse;
		canCollapse = newCanCollapse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_COMPARTMENT__CAN_COLLAPSE, oldCanCollapse, canCollapse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHideIfEmpty() {
		return hideIfEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHideIfEmpty(boolean newHideIfEmpty) {
		boolean oldHideIfEmpty = hideIfEmpty;
		hideIfEmpty = newHideIfEmpty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_COMPARTMENT__HIDE_IF_EMPTY, oldHideIfEmpty, hideIfEmpty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeedsTitle() {
		return needsTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedsTitle(boolean newNeedsTitle) {
		boolean oldNeedsTitle = needsTitle;
		needsTitle = newNeedsTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_COMPARTMENT__NEEDS_TITLE, oldNeedsTitle, needsTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDiagram getDiagram() {
		if (eContainerFeatureID != GMFGenPackage.GEN_COMPARTMENT__DIAGRAM) return null;
		return (GenDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenNode getNode() {
		if (node != null && node.eIsProxy()) {
			InternalEObject oldNode = (InternalEObject)node;
			node = (GenNode)eResolveProxy(oldNode);
			if (node != oldNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.GEN_COMPARTMENT__NODE, oldNode, node));
			}
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenNode basicGetNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode(GenNode newNode, NotificationChain msgs) {
		GenNode oldNode = node;
		node = newNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_COMPARTMENT__NODE, oldNode, newNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getSemanticHintFieldName() {
		return GenCommonBaseImpl.asJavaConstantName(getUniqueIdentifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_COMPARTMENT__DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, GMFGenPackage.GEN_COMPARTMENT__DIAGRAM, msgs);
			case GMFGenPackage.GEN_COMPARTMENT__NODE:
				if (node != null)
					msgs = ((InternalEObject)node).eInverseRemove(this, GMFGenPackage.GEN_NODE__COMPARTMENTS, GenNode.class, msgs);
				return basicSetNode((GenNode)otherEnd, msgs);
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
			case GMFGenPackage.GEN_COMPARTMENT__DIAGRAM:
				return eBasicSetContainer(null, GMFGenPackage.GEN_COMPARTMENT__DIAGRAM, msgs);
			case GMFGenPackage.GEN_COMPARTMENT__NODE:
				return basicSetNode(null, msgs);
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
			case GMFGenPackage.GEN_COMPARTMENT__DIAGRAM:
				return eInternalContainer().eInverseRemove(this, GMFGenPackage.GEN_DIAGRAM__COMPARTMENTS, GenDiagram.class, msgs);
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
			case GMFGenPackage.GEN_COMPARTMENT__TITLE:
				return getTitle();
			case GMFGenPackage.GEN_COMPARTMENT__CAN_COLLAPSE:
				return isCanCollapse() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_COMPARTMENT__HIDE_IF_EMPTY:
				return isHideIfEmpty() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_COMPARTMENT__NEEDS_TITLE:
				return isNeedsTitle() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_COMPARTMENT__DIAGRAM:
				return getDiagram();
			case GMFGenPackage.GEN_COMPARTMENT__NODE:
				if (resolve) return getNode();
				return basicGetNode();
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
			case GMFGenPackage.GEN_COMPARTMENT__TITLE:
				setTitle((String)newValue);
				return;
			case GMFGenPackage.GEN_COMPARTMENT__CAN_COLLAPSE:
				setCanCollapse(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_COMPARTMENT__HIDE_IF_EMPTY:
				setHideIfEmpty(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_COMPARTMENT__NEEDS_TITLE:
				setNeedsTitle(((Boolean)newValue).booleanValue());
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
			case GMFGenPackage.GEN_COMPARTMENT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case GMFGenPackage.GEN_COMPARTMENT__CAN_COLLAPSE:
				setCanCollapse(CAN_COLLAPSE_EDEFAULT);
				return;
			case GMFGenPackage.GEN_COMPARTMENT__HIDE_IF_EMPTY:
				setHideIfEmpty(HIDE_IF_EMPTY_EDEFAULT);
				return;
			case GMFGenPackage.GEN_COMPARTMENT__NEEDS_TITLE:
				setNeedsTitle(NEEDS_TITLE_EDEFAULT);
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
			case GMFGenPackage.GEN_COMPARTMENT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case GMFGenPackage.GEN_COMPARTMENT__CAN_COLLAPSE:
				return canCollapse != CAN_COLLAPSE_EDEFAULT;
			case GMFGenPackage.GEN_COMPARTMENT__HIDE_IF_EMPTY:
				return hideIfEmpty != HIDE_IF_EMPTY_EDEFAULT;
			case GMFGenPackage.GEN_COMPARTMENT__NEEDS_TITLE:
				return needsTitle != NEEDS_TITLE_EDEFAULT;
			case GMFGenPackage.GEN_COMPARTMENT__DIAGRAM:
				return getDiagram() != null;
			case GMFGenPackage.GEN_COMPARTMENT__NODE:
				return node != null;
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
		result.append(" (title: ");
		result.append(title);
		result.append(", canCollapse: ");
		result.append(canCollapse);
		result.append(", hideIfEmpty: ");
		result.append(hideIfEmpty);
		result.append(", needsTitle: ");
		result.append(needsTitle);
		result.append(')');
		return result.toString();
	}

	public String getClassNamePrefix() {
		if (getTitle() == null) {
			return "Compartment" + hashCode();
		}
		char[] chars = getTitle().toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (i == 0) {
				if (!Character.isJavaIdentifierStart(chars[0])) {
					chars[0] = '_';
				}
				chars[0] = Character.toUpperCase(chars[0]);
			} else {
				if (!Character.isJavaIdentifierPart(chars[i])) {
					chars[i] = '_';
				}
			}
		}
		return new String(chars);
	}

	public String getClassNameSuffux() {
		return "Container";
	}

	public String getUniqueIdentifier() {
		return getClassNamePrefix() + "_" + getVisualID();
	}

	public String getItemSemanticEditPolicyClassName() {
		String value = getItemSemanticEditPolicyClassNameGen();
		if (value == null || value.length() == 0) {
			return "Compartment_" + getClassNamePrefix() + getClassNameSuffux() + "ItemSemanticEditPolicy";
		}
		return value;
	}

} //GenCompartmentImpl
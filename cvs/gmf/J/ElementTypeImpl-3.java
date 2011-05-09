/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.gmf.codegen.gmfgen.ElementType;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.codegen.gmfgen.Palette;
import org.eclipse.gmf.codegen.gmfgen.ToolEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ElementTypeImpl#getDiagramElement <em>Diagram Element</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ElementTypeImpl#getUniqueIdentifier <em>Unique Identifier</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ElementTypeImpl#getDisplayName <em>Display Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ElementTypeImpl extends EObjectImpl implements ElementType {
	/**
	 * The default value of the '{@link #getUniqueIdentifier() <em>Unique Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueIdentifier() <em>Unique Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String uniqueIdentifier = UNIQUE_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getElementType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCommonBase getDiagramElement() {
		if (eContainerFeatureID != GMFGenPackage.ELEMENT_TYPE__DIAGRAM_ELEMENT) return null;
		return (GenCommonBase)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagramElement(GenCommonBase newDiagramElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDiagramElement, GMFGenPackage.ELEMENT_TYPE__DIAGRAM_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramElement(GenCommonBase newDiagramElement) {
		if (newDiagramElement != eInternalContainer() || (eContainerFeatureID != GMFGenPackage.ELEMENT_TYPE__DIAGRAM_ELEMENT && newDiagramElement != null)) {
			if (EcoreUtil.isAncestor(this, newDiagramElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDiagramElement != null)
				msgs = ((InternalEObject)newDiagramElement).eInverseAdd(this, GMFGenPackage.GEN_COMMON_BASE__ELEMENT_TYPE, GenCommonBase.class, msgs);
			msgs = basicSetDiagramElement(newDiagramElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.ELEMENT_TYPE__DIAGRAM_ELEMENT, newDiagramElement, newDiagramElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUniqueIdentifierGen() {
		return uniqueIdentifier;
	}

	public String getUniqueIdentifier() {
		String value = getUniqueIdentifierGen();
		if (GenCommonBaseImpl.isEmpty(value)) {
			value = getDiagramElement().getDiagram().getEditorGen().getPlugin().getID() + '.' + getDiagramElement().getUniqueIdentifier();
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueIdentifier(String newUniqueIdentifier) {
		String oldUniqueIdentifier = uniqueIdentifier;
		uniqueIdentifier = newUniqueIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.ELEMENT_TYPE__UNIQUE_IDENTIFIER, oldUniqueIdentifier, uniqueIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayNameGen() {
		return displayName;
	}

	public String getDisplayName() {
		if (getDisplayNameGen() != null && getDisplayNameGen().trim().length() > 0) {
			return getDisplayNameGen();
		}
		// Let element type label be the name of the corresponding creation tool.
		final Palette palette = getDiagramElement().getDiagram().getPalette();
		if (palette == null) {
			return null;
		}
		for (Iterator elements = palette.eAllContents(); elements.hasNext(); ) {
			Object next = elements.next();
			if (next instanceof ToolEntry) {
				ToolEntry toolEntry = (ToolEntry) next;
				if (toolEntry.getElements().contains(getDiagramElement())) {
					return toolEntry.getTitle();
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.ELEMENT_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.ELEMENT_TYPE__DIAGRAM_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDiagramElement((GenCommonBase)otherEnd, msgs);
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
			case GMFGenPackage.ELEMENT_TYPE__DIAGRAM_ELEMENT:
				return basicSetDiagramElement(null, msgs);
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
			case GMFGenPackage.ELEMENT_TYPE__DIAGRAM_ELEMENT:
				return eInternalContainer().eInverseRemove(this, GMFGenPackage.GEN_COMMON_BASE__ELEMENT_TYPE, GenCommonBase.class, msgs);
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
			case GMFGenPackage.ELEMENT_TYPE__DIAGRAM_ELEMENT:
				return getDiagramElement();
			case GMFGenPackage.ELEMENT_TYPE__UNIQUE_IDENTIFIER:
				return getUniqueIdentifier();
			case GMFGenPackage.ELEMENT_TYPE__DISPLAY_NAME:
				return getDisplayName();
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
			case GMFGenPackage.ELEMENT_TYPE__DIAGRAM_ELEMENT:
				setDiagramElement((GenCommonBase)newValue);
				return;
			case GMFGenPackage.ELEMENT_TYPE__UNIQUE_IDENTIFIER:
				setUniqueIdentifier((String)newValue);
				return;
			case GMFGenPackage.ELEMENT_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
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
			case GMFGenPackage.ELEMENT_TYPE__DIAGRAM_ELEMENT:
				setDiagramElement((GenCommonBase)null);
				return;
			case GMFGenPackage.ELEMENT_TYPE__UNIQUE_IDENTIFIER:
				setUniqueIdentifier(UNIQUE_IDENTIFIER_EDEFAULT);
				return;
			case GMFGenPackage.ELEMENT_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
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
			case GMFGenPackage.ELEMENT_TYPE__DIAGRAM_ELEMENT:
				return getDiagramElement() != null;
			case GMFGenPackage.ELEMENT_TYPE__UNIQUE_IDENTIFIER:
				return UNIQUE_IDENTIFIER_EDEFAULT == null ? uniqueIdentifier != null : !UNIQUE_IDENTIFIER_EDEFAULT.equals(uniqueIdentifier);
			case GMFGenPackage.ELEMENT_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
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
		result.append(" (uniqueIdentifier: ");
		result.append(uniqueIdentifier);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(')');
		return result.toString();
	}

} //ElementTypeImpl
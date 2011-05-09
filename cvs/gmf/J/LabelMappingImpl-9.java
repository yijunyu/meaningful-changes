/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.LabelMapping;
import org.eclipse.gmf.mappings.MappingEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LabelMappingImpl#getDiagramLabel <em>Diagram Label</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LabelMappingImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LabelMappingImpl#getMapEntry <em>Map Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LabelMappingImpl extends EObjectImpl implements LabelMapping {
	/**
	 * The cached value of the '{@link #getDiagramLabel() <em>Diagram Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramLabel()
	 * @generated
	 * @ordered
	 */
	protected DiagramLabel diagramLabel;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFMapPackage.eINSTANCE.getLabelMapping();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramLabel getDiagramLabel() {
		if (diagramLabel != null && diagramLabel.eIsProxy()) {
			InternalEObject oldDiagramLabel = (InternalEObject)diagramLabel;
			diagramLabel = (DiagramLabel)eResolveProxy(oldDiagramLabel);
			if (diagramLabel != oldDiagramLabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.LABEL_MAPPING__DIAGRAM_LABEL, oldDiagramLabel, diagramLabel));
			}
		}
		return diagramLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramLabel basicGetDiagramLabel() {
		return diagramLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramLabel(DiagramLabel newDiagramLabel) {
		DiagramLabel oldDiagramLabel = diagramLabel;
		diagramLabel = newDiagramLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.LABEL_MAPPING__DIAGRAM_LABEL, oldDiagramLabel, diagramLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.LABEL_MAPPING__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingEntry getMapEntry() {
		if (eContainerFeatureID != GMFMapPackage.LABEL_MAPPING__MAP_ENTRY) return null;
		return (MappingEntry)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapEntry(MappingEntry newMapEntry, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMapEntry, GMFMapPackage.LABEL_MAPPING__MAP_ENTRY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapEntry(MappingEntry newMapEntry) {
		if (newMapEntry != eInternalContainer() || (eContainerFeatureID != GMFMapPackage.LABEL_MAPPING__MAP_ENTRY && newMapEntry != null)) {
			if (EcoreUtil.isAncestor(this, newMapEntry))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMapEntry != null)
				msgs = ((InternalEObject)newMapEntry).eInverseAdd(this, GMFMapPackage.MAPPING_ENTRY__LABEL_MAPPINGS, MappingEntry.class, msgs);
			msgs = basicSetMapEntry(newMapEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.LABEL_MAPPING__MAP_ENTRY, newMapEntry, newMapEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFMapPackage.LABEL_MAPPING__MAP_ENTRY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMapEntry((MappingEntry)otherEnd, msgs);
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
			case GMFMapPackage.LABEL_MAPPING__MAP_ENTRY:
				return basicSetMapEntry(null, msgs);
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
			case GMFMapPackage.LABEL_MAPPING__MAP_ENTRY:
				return eInternalContainer().eInverseRemove(this, GMFMapPackage.MAPPING_ENTRY__LABEL_MAPPINGS, MappingEntry.class, msgs);
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
			case GMFMapPackage.LABEL_MAPPING__DIAGRAM_LABEL:
				if (resolve) return getDiagramLabel();
				return basicGetDiagramLabel();
			case GMFMapPackage.LABEL_MAPPING__READ_ONLY:
				return isReadOnly() ? Boolean.TRUE : Boolean.FALSE;
			case GMFMapPackage.LABEL_MAPPING__MAP_ENTRY:
				return getMapEntry();
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
			case GMFMapPackage.LABEL_MAPPING__DIAGRAM_LABEL:
				setDiagramLabel((DiagramLabel)newValue);
				return;
			case GMFMapPackage.LABEL_MAPPING__READ_ONLY:
				setReadOnly(((Boolean)newValue).booleanValue());
				return;
			case GMFMapPackage.LABEL_MAPPING__MAP_ENTRY:
				setMapEntry((MappingEntry)newValue);
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
			case GMFMapPackage.LABEL_MAPPING__DIAGRAM_LABEL:
				setDiagramLabel((DiagramLabel)null);
				return;
			case GMFMapPackage.LABEL_MAPPING__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case GMFMapPackage.LABEL_MAPPING__MAP_ENTRY:
				setMapEntry((MappingEntry)null);
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
			case GMFMapPackage.LABEL_MAPPING__DIAGRAM_LABEL:
				return diagramLabel != null;
			case GMFMapPackage.LABEL_MAPPING__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
			case GMFMapPackage.LABEL_MAPPING__MAP_ENTRY:
				return getMapEntry() != null;
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
		result.append(" (readOnly: ");
		result.append(readOnly);
		result.append(')');
		return result.toString();
	}

} //LabelMappingImpl

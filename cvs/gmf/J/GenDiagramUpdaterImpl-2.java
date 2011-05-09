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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenDiagramUpdater;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Diagram Updater</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramUpdaterImpl#getEditorGen <em>Editor Gen</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramUpdaterImpl#getDiagramUpdaterClassName <em>Diagram Updater Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramUpdaterImpl#getNodeDescriptorClassName <em>Node Descriptor Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramUpdaterImpl#getLinkDescriptorClassName <em>Link Descriptor Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenDiagramUpdaterImpl extends EObjectImpl implements GenDiagramUpdater {
	/**
	 * The default value of the '{@link #getDiagramUpdaterClassName() <em>Diagram Updater Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramUpdaterClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String DIAGRAM_UPDATER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagramUpdaterClassName() <em>Diagram Updater Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramUpdaterClassName()
	 * @generated
	 * @ordered
	 */
	protected String diagramUpdaterClassName = DIAGRAM_UPDATER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeDescriptorClassName() <em>Node Descriptor Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeDescriptorClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_DESCRIPTOR_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeDescriptorClassName() <em>Node Descriptor Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeDescriptorClassName()
	 * @generated
	 * @ordered
	 */
	protected String nodeDescriptorClassName = NODE_DESCRIPTOR_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkDescriptorClassName() <em>Link Descriptor Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkDescriptorClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_DESCRIPTOR_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkDescriptorClassName() <em>Link Descriptor Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkDescriptorClassName()
	 * @generated
	 * @ordered
	 */
	protected String linkDescriptorClassName = LINK_DESCRIPTOR_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenDiagramUpdaterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenDiagramUpdater();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenEditorGenerator getEditorGen() {
		if (eContainerFeatureID != GMFGenPackage.GEN_DIAGRAM_UPDATER__EDITOR_GEN) return null;
		return (GenEditorGenerator)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiagramUpdaterClassNameGen() {
		return diagramUpdaterClassName;
	}
	
	public String getDiagramUpdaterClassName() {
		String value = getDiagramUpdaterClassNameGen();
		if(GenCommonBaseImpl.isEmpty(value)) {
			value = getDomainPackageCapName() + "DiagramUpdater"; //$NON-NLS-1$						
		}
		return value;		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramUpdaterClassName(String newDiagramUpdaterClassName) {
		String oldDiagramUpdaterClassName = diagramUpdaterClassName;
		diagramUpdaterClassName = newDiagramUpdaterClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_UPDATER__DIAGRAM_UPDATER_CLASS_NAME, oldDiagramUpdaterClassName, diagramUpdaterClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeDescriptorClassNameGen() {
		return nodeDescriptorClassName;
	}
	
	public String getNodeDescriptorClassName() {
		String value = getNodeDescriptorClassNameGen();
		if(GenCommonBaseImpl.isEmpty(value)) {
			value = getDomainPackageCapName() + "NodeDescriptor"; //$NON-NLS-1$						
		}
		return value;		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeDescriptorClassName(String newNodeDescriptorClassName) {
		String oldNodeDescriptorClassName = nodeDescriptorClassName;
		nodeDescriptorClassName = newNodeDescriptorClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_UPDATER__NODE_DESCRIPTOR_CLASS_NAME, oldNodeDescriptorClassName, nodeDescriptorClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinkDescriptorClassNameGen() {
		return linkDescriptorClassName;
	}
	
	public String getLinkDescriptorClassName() {
		String value = getLinkDescriptorClassNameGen();
		if(GenCommonBaseImpl.isEmpty(value)) {
			value = getDomainPackageCapName() + "LinkDescriptor"; //$NON-NLS-1$						
		}
		return value;		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkDescriptorClassName(String newLinkDescriptorClassName) {
		String oldLinkDescriptorClassName = linkDescriptorClassName;
		linkDescriptorClassName = newLinkDescriptorClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_UPDATER__LINK_DESCRIPTOR_CLASS_NAME, oldLinkDescriptorClassName, linkDescriptorClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getDiagramUpdaterQualifiedClassName() {
		return getEditorPackageName() + '.' + getDiagramUpdaterClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getNodeDescriptorQualifiedClassName() {
		return getEditorPackageName() + '.' + getNodeDescriptorClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getLinkDescriptorQualifiedClassName() {
		return getEditorPackageName() + '.' + getLinkDescriptorClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_DIAGRAM_UPDATER__EDITOR_GEN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, GMFGenPackage.GEN_DIAGRAM_UPDATER__EDITOR_GEN, msgs);
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
			case GMFGenPackage.GEN_DIAGRAM_UPDATER__EDITOR_GEN:
				return eBasicSetContainer(null, GMFGenPackage.GEN_DIAGRAM_UPDATER__EDITOR_GEN, msgs);
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
			case GMFGenPackage.GEN_DIAGRAM_UPDATER__EDITOR_GEN:
				return eInternalContainer().eInverseRemove(this, GMFGenPackage.GEN_EDITOR_GENERATOR__DIAGRAM_UPDATER, GenEditorGenerator.class, msgs);
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
			case GMFGenPackage.GEN_DIAGRAM_UPDATER__EDITOR_GEN:
				return getEditorGen();
			case GMFGenPackage.GEN_DIAGRAM_UPDATER__DIAGRAM_UPDATER_CLASS_NAME:
				return getDiagramUpdaterClassName();
			case GMFGenPackage.GEN_DIAGRAM_UPDATER__NODE_DESCRIPTOR_CLASS_NAME:
				return getNodeDescriptorClassName();
			case GMFGenPackage.GEN_DIAGRAM_UPDATER__LINK_DESCRIPTOR_CLASS_NAME:
				return getLinkDescriptorClassName();
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
			case GMFGenPackage.GEN_DIAGRAM_UPDATER__DIAGRAM_UPDATER_CLASS_NAME:
				setDiagramUpdaterClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM_UPDATER__NODE_DESCRIPTOR_CLASS_NAME:
				setNodeDescriptorClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM_UPDATER__LINK_DESCRIPTOR_CLASS_NAME:
				setLinkDescriptorClassName((String)newValue);
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
			case GMFGenPackage.GEN_DIAGRAM_UPDATER__DIAGRAM_UPDATER_CLASS_NAME:
				setDiagramUpdaterClassName(DIAGRAM_UPDATER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM_UPDATER__NODE_DESCRIPTOR_CLASS_NAME:
				setNodeDescriptorClassName(NODE_DESCRIPTOR_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM_UPDATER__LINK_DESCRIPTOR_CLASS_NAME:
				setLinkDescriptorClassName(LINK_DESCRIPTOR_CLASS_NAME_EDEFAULT);
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
			case GMFGenPackage.GEN_DIAGRAM_UPDATER__EDITOR_GEN:
				return getEditorGen() != null;
			case GMFGenPackage.GEN_DIAGRAM_UPDATER__DIAGRAM_UPDATER_CLASS_NAME:
				return DIAGRAM_UPDATER_CLASS_NAME_EDEFAULT == null ? diagramUpdaterClassName != null : !DIAGRAM_UPDATER_CLASS_NAME_EDEFAULT.equals(diagramUpdaterClassName);
			case GMFGenPackage.GEN_DIAGRAM_UPDATER__NODE_DESCRIPTOR_CLASS_NAME:
				return NODE_DESCRIPTOR_CLASS_NAME_EDEFAULT == null ? nodeDescriptorClassName != null : !NODE_DESCRIPTOR_CLASS_NAME_EDEFAULT.equals(nodeDescriptorClassName);
			case GMFGenPackage.GEN_DIAGRAM_UPDATER__LINK_DESCRIPTOR_CLASS_NAME:
				return LINK_DESCRIPTOR_CLASS_NAME_EDEFAULT == null ? linkDescriptorClassName != null : !LINK_DESCRIPTOR_CLASS_NAME_EDEFAULT.equals(linkDescriptorClassName);
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
		result.append(" (diagramUpdaterClassName: ");
		result.append(diagramUpdaterClassName);
		result.append(", nodeDescriptorClassName: ");
		result.append(nodeDescriptorClassName);
		result.append(", linkDescriptorClassName: ");
		result.append(linkDescriptorClassName);
		result.append(')');
		return result.toString();
	}
	
	private String getDomainPackageCapName() {
		return ((GenEditorGeneratorImpl) getEditorGen()).getDomainModelCapName();
	}
	
	private String getEditorPackageName() {
		return getEditorGen().getEditor().getPackageName();
	}

} //GenDiagramUpdaterImpl

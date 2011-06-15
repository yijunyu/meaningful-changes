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
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.codegen.gmfgen.OpenDiagramBehaviour;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open Diagram Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.OpenDiagramBehaviourImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.OpenDiagramBehaviourImpl#getEditPolicyClassName <em>Edit Policy Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.OpenDiagramBehaviourImpl#getDiagramKind <em>Diagram Kind</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.OpenDiagramBehaviourImpl#getEditorID <em>Editor ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.OpenDiagramBehaviourImpl#isOpenAsEclipseEditor <em>Open As Eclipse Editor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpenDiagramBehaviourImpl extends EObjectImpl implements OpenDiagramBehaviour {

	/**
	 * The default value of the '{@link #getEditPolicyClassName() <em>Edit Policy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditPolicyClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String EDIT_POLICY_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditPolicyClassName() <em>Edit Policy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditPolicyClassName()
	 * @generated
	 * @ordered
	 */
	protected String editPolicyClassName = EDIT_POLICY_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiagramKind() <em>Diagram Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramKind()
	 * @generated
	 * @ordered
	 */
	protected static final String DIAGRAM_KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagramKind() <em>Diagram Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramKind()
	 * @generated
	 * @ordered
	 */
	protected String diagramKind = DIAGRAM_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditorID() <em>Editor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorID()
	 * @generated
	 * @ordered
	 */
	protected static final String EDITOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditorID() <em>Editor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorID()
	 * @generated
	 * @ordered
	 */
	protected String editorID = EDITOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isOpenAsEclipseEditor() <em>Open As Eclipse Editor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpenAsEclipseEditor()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPEN_AS_ECLIPSE_EDITOR_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isOpenAsEclipseEditor() <em>Open As Eclipse Editor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpenAsEclipseEditor()
	 * @generated
	 * @ordered
	 */
	protected boolean openAsEclipseEditor = OPEN_AS_ECLIPSE_EDITOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenDiagramBehaviourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getOpenDiagramBehaviour();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCommonBase getSubject() {
		if (eContainerFeatureID != GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__SUBJECT) return null;
		return (GenCommonBase)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditPolicyClassNameGen() {
		return editPolicyClassName;
	}

	public String getEditPolicyClassName() {
		if (getEditPolicyClassNameGen() == null || getEditPolicyClassNameGen().trim().length() == 0) {
			return "OpenDiagramEditPolicy";
		}
		return getEditPolicyClassNameGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditPolicyClassName(String newEditPolicyClassName) {
		String oldEditPolicyClassName = editPolicyClassName;
		editPolicyClassName = newEditPolicyClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__EDIT_POLICY_CLASS_NAME, oldEditPolicyClassName, editPolicyClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiagramKind() {
		return diagramKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramKind(String newDiagramKind) {
		String oldDiagramKind = diagramKind;
		diagramKind = newDiagramKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__DIAGRAM_KIND, oldDiagramKind, diagramKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditorID() {
		return editorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditorID(String newEditorID) {
		String oldEditorID = editorID;
		editorID = newEditorID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__EDITOR_ID, oldEditorID, editorID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOpenAsEclipseEditor() {
		return openAsEclipseEditor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenAsEclipseEditor(boolean newOpenAsEclipseEditor) {
		boolean oldOpenAsEclipseEditor = openAsEclipseEditor;
		openAsEclipseEditor = newOpenAsEclipseEditor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__OPEN_AS_ECLIPSE_EDITOR, oldOpenAsEclipseEditor, openAsEclipseEditor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getEditPolicyQualifiedClassName() {
		return getSubject().getDiagram().getEditPoliciesPackageName() + '.' + getEditPolicyClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__SUBJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__SUBJECT, msgs);
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
			case GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__SUBJECT:
				return eBasicSetContainer(null, GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__SUBJECT, msgs);
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
			case GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__SUBJECT:
				return eInternalContainer().eInverseRemove(this, GMFGenPackage.GEN_COMMON_BASE__BEHAVIOUR, GenCommonBase.class, msgs);
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
			case GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__SUBJECT:
				return getSubject();
			case GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__EDIT_POLICY_CLASS_NAME:
				return getEditPolicyClassName();
			case GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__DIAGRAM_KIND:
				return getDiagramKind();
			case GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__EDITOR_ID:
				return getEditorID();
			case GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__OPEN_AS_ECLIPSE_EDITOR:
				return isOpenAsEclipseEditor() ? Boolean.TRUE : Boolean.FALSE;
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
			case GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__EDIT_POLICY_CLASS_NAME:
				setEditPolicyClassName((String)newValue);
				return;
			case GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__DIAGRAM_KIND:
				setDiagramKind((String)newValue);
				return;
			case GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__EDITOR_ID:
				setEditorID((String)newValue);
				return;
			case GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__OPEN_AS_ECLIPSE_EDITOR:
				setOpenAsEclipseEditor(((Boolean)newValue).booleanValue());
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
			case GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__EDIT_POLICY_CLASS_NAME:
				setEditPolicyClassName(EDIT_POLICY_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__DIAGRAM_KIND:
				setDiagramKind(DIAGRAM_KIND_EDEFAULT);
				return;
			case GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__EDITOR_ID:
				setEditorID(EDITOR_ID_EDEFAULT);
				return;
			case GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__OPEN_AS_ECLIPSE_EDITOR:
				setOpenAsEclipseEditor(OPEN_AS_ECLIPSE_EDITOR_EDEFAULT);
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
			case GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__SUBJECT:
				return getSubject() != null;
			case GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__EDIT_POLICY_CLASS_NAME:
				return EDIT_POLICY_CLASS_NAME_EDEFAULT == null ? editPolicyClassName != null : !EDIT_POLICY_CLASS_NAME_EDEFAULT.equals(editPolicyClassName);
			case GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__DIAGRAM_KIND:
				return DIAGRAM_KIND_EDEFAULT == null ? diagramKind != null : !DIAGRAM_KIND_EDEFAULT.equals(diagramKind);
			case GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__EDITOR_ID:
				return EDITOR_ID_EDEFAULT == null ? editorID != null : !EDITOR_ID_EDEFAULT.equals(editorID);
			case GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR__OPEN_AS_ECLIPSE_EDITOR:
				return openAsEclipseEditor != OPEN_AS_ECLIPSE_EDITOR_EDEFAULT;
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
		result.append(" (editPolicyClassName: ");
		result.append(editPolicyClassName);
		result.append(", diagramKind: ");
		result.append(diagramKind);
		result.append(", editorID: ");
		result.append(editorID);
		result.append(", openAsEclipseEditor: ");
		result.append(openAsEclipseEditor);
		result.append(')');
		return result.toString();
	}

} //OpenDiagramBehaviourImpl
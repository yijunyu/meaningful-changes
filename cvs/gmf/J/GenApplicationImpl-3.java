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
import org.eclipse.gmf.codegen.gmfgen.GenApplication;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getEditorGen <em>Editor Gen</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getApplicationPackageName <em>Application Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getApplicationClassName <em>Application Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getWorkbenchAdvisorClassName <em>Workbench Advisor Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getWorkbenchWindowAdvisorClassName <em>Workbench Window Advisor Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getActionBarAdvisorClassName <em>Action Bar Advisor Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getPerspectiveClassName <em>Perspective Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenApplicationImpl extends EObjectImpl implements GenApplication {
	/**
	 * The default value of the '{@link #getApplicationPackageName() <em>Application Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationPackageName() <em>Application Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationPackageName()
	 * @generated
	 * @ordered
	 */
	protected String applicationPackageName = APPLICATION_PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getApplicationClassName() <em>Application Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationClassName() <em>Application Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationClassName()
	 * @generated
	 * @ordered
	 */
	protected String applicationClassName = APPLICATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkbenchAdvisorClassName() <em>Workbench Advisor Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkbenchAdvisorClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKBENCH_ADVISOR_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkbenchAdvisorClassName() <em>Workbench Advisor Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkbenchAdvisorClassName()
	 * @generated
	 * @ordered
	 */
	protected String workbenchAdvisorClassName = WORKBENCH_ADVISOR_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkbenchWindowAdvisorClassName() <em>Workbench Window Advisor Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkbenchWindowAdvisorClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKBENCH_WINDOW_ADVISOR_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkbenchWindowAdvisorClassName() <em>Workbench Window Advisor Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkbenchWindowAdvisorClassName()
	 * @generated
	 * @ordered
	 */
	protected String workbenchWindowAdvisorClassName = WORKBENCH_WINDOW_ADVISOR_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionBarAdvisorClassName() <em>Action Bar Advisor Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionBarAdvisorClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_BAR_ADVISOR_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionBarAdvisorClassName() <em>Action Bar Advisor Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionBarAdvisorClassName()
	 * @generated
	 * @ordered
	 */
	protected String actionBarAdvisorClassName = ACTION_BAR_ADVISOR_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerspectiveClassName() <em>Perspective Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerspectiveClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSPECTIVE_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerspectiveClassName() <em>Perspective Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerspectiveClassName()
	 * @generated
	 * @ordered
	 */
	protected String perspectiveClassName = PERSPECTIVE_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenApplication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenEditorGenerator getEditorGen() {
		if (eContainerFeatureID != GMFGenPackage.GEN_APPLICATION__EDITOR_GEN) return null;
		return (GenEditorGenerator)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationPackageNameGen() {
		return applicationPackageName;
	}

	public String getApplicationPackageName() {
		String value = getApplicationPackageNameGen();
		if (GenCommonBaseImpl.isEmpty(value)) {
			value = getEditorGen().getPackageNamePrefix() + ".application"; //$NON-NLS-1$
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationPackageName(String newApplicationPackageName) {
		String oldApplicationPackageName = applicationPackageName;
		applicationPackageName = newApplicationPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_APPLICATION__APPLICATION_PACKAGE_NAME, oldApplicationPackageName, applicationPackageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationClassNameGen() {
		return applicationClassName;
	}

	public String getApplicationClassName() {
		String value = getApplicationClassNameGen();
		if (GenCommonBaseImpl.isEmpty(value)) {
			value = getDomainPackageCapName() + "Application"; //$NON-NLS-1$
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationClassName(String newApplicationClassName) {
		String oldApplicationClassName = applicationClassName;
		applicationClassName = newApplicationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_APPLICATION__APPLICATION_CLASS_NAME, oldApplicationClassName, applicationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorkbenchAdvisorClassNameGen() {
		return workbenchAdvisorClassName;
	}

	public String getWorkbenchAdvisorClassName() {
		String value = getWorkbenchAdvisorClassNameGen();
		if (GenCommonBaseImpl.isEmpty(value)) {
			value = getDomainPackageCapName() + "WorkbenchAdvisor"; //$NON-NLS-1$
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkbenchAdvisorClassName(String newWorkbenchAdvisorClassName) {
		String oldWorkbenchAdvisorClassName = workbenchAdvisorClassName;
		workbenchAdvisorClassName = newWorkbenchAdvisorClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_APPLICATION__WORKBENCH_ADVISOR_CLASS_NAME, oldWorkbenchAdvisorClassName, workbenchAdvisorClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorkbenchWindowAdvisorClassNameGen() {
		return workbenchWindowAdvisorClassName;
	}

	public String getWorkbenchWindowAdvisorClassName() {
		String value = getWorkbenchWindowAdvisorClassNameGen();
		if (GenCommonBaseImpl.isEmpty(value)) {
			value = getDomainPackageCapName() + "WorkbenchWindowAdvisor"; //$NON-NLS-1$
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkbenchWindowAdvisorClassName(String newWorkbenchWindowAdvisorClassName) {
		String oldWorkbenchWindowAdvisorClassName = workbenchWindowAdvisorClassName;
		workbenchWindowAdvisorClassName = newWorkbenchWindowAdvisorClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_APPLICATION__WORKBENCH_WINDOW_ADVISOR_CLASS_NAME, oldWorkbenchWindowAdvisorClassName, workbenchWindowAdvisorClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionBarAdvisorClassNameGen() {
		return actionBarAdvisorClassName;
	}

	public String getActionBarAdvisorClassName() {
		String value = getActionBarAdvisorClassNameGen();
		if (GenCommonBaseImpl.isEmpty(value)) {
			value = getDomainPackageCapName() + "ActionBarAdvisor"; //$NON-NLS-1$
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionBarAdvisorClassName(String newActionBarAdvisorClassName) {
		String oldActionBarAdvisorClassName = actionBarAdvisorClassName;
		actionBarAdvisorClassName = newActionBarAdvisorClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_APPLICATION__ACTION_BAR_ADVISOR_CLASS_NAME, oldActionBarAdvisorClassName, actionBarAdvisorClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPerspectiveClassNameGen() {
		return perspectiveClassName;
	}

	public String getPerspectiveClassName() {
		String value = getPerspectiveClassNameGen();
		if (GenCommonBaseImpl.isEmpty(value)) {
			value = getDomainPackageCapName() + "Perspective"; //$NON-NLS-1$
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerspectiveClassName(String newPerspectiveClassName) {
		String oldPerspectiveClassName = perspectiveClassName;
		perspectiveClassName = newPerspectiveClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_APPLICATION__PERSPECTIVE_CLASS_NAME, oldPerspectiveClassName, perspectiveClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getApplicationQualifiedClassName() {
		return getApplicationPackageName() + getApplicationClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getWorkbenchAdvisorQualifiedClassName() {
		return getApplicationPackageName() + getWorkbenchAdvisorClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getWorkbenchWindowAdvisorQualifiedClassName() {
		return getApplicationPackageName() + getWorkbenchWindowAdvisorClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getActionBarAdvisorQualifiedClassName() {
		return getApplicationPackageName() + getActionBarAdvisorClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getPerspectiveQualifiedClassName() {
		return getApplicationPackageName() + getPerspectiveClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_APPLICATION__EDITOR_GEN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, GMFGenPackage.GEN_APPLICATION__EDITOR_GEN, msgs);
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
			case GMFGenPackage.GEN_APPLICATION__EDITOR_GEN:
				return eBasicSetContainer(null, GMFGenPackage.GEN_APPLICATION__EDITOR_GEN, msgs);
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
			case GMFGenPackage.GEN_APPLICATION__EDITOR_GEN:
				return eInternalContainer().eInverseRemove(this, GMFGenPackage.GEN_EDITOR_GENERATOR__APPLICATION, GenEditorGenerator.class, msgs);
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
			case GMFGenPackage.GEN_APPLICATION__EDITOR_GEN:
				return getEditorGen();
			case GMFGenPackage.GEN_APPLICATION__APPLICATION_PACKAGE_NAME:
				return getApplicationPackageName();
			case GMFGenPackage.GEN_APPLICATION__APPLICATION_CLASS_NAME:
				return getApplicationClassName();
			case GMFGenPackage.GEN_APPLICATION__WORKBENCH_ADVISOR_CLASS_NAME:
				return getWorkbenchAdvisorClassName();
			case GMFGenPackage.GEN_APPLICATION__WORKBENCH_WINDOW_ADVISOR_CLASS_NAME:
				return getWorkbenchWindowAdvisorClassName();
			case GMFGenPackage.GEN_APPLICATION__ACTION_BAR_ADVISOR_CLASS_NAME:
				return getActionBarAdvisorClassName();
			case GMFGenPackage.GEN_APPLICATION__PERSPECTIVE_CLASS_NAME:
				return getPerspectiveClassName();
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
			case GMFGenPackage.GEN_APPLICATION__APPLICATION_PACKAGE_NAME:
				setApplicationPackageName((String)newValue);
				return;
			case GMFGenPackage.GEN_APPLICATION__APPLICATION_CLASS_NAME:
				setApplicationClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_APPLICATION__WORKBENCH_ADVISOR_CLASS_NAME:
				setWorkbenchAdvisorClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_APPLICATION__WORKBENCH_WINDOW_ADVISOR_CLASS_NAME:
				setWorkbenchWindowAdvisorClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_APPLICATION__ACTION_BAR_ADVISOR_CLASS_NAME:
				setActionBarAdvisorClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_APPLICATION__PERSPECTIVE_CLASS_NAME:
				setPerspectiveClassName((String)newValue);
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
			case GMFGenPackage.GEN_APPLICATION__APPLICATION_PACKAGE_NAME:
				setApplicationPackageName(APPLICATION_PACKAGE_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_APPLICATION__APPLICATION_CLASS_NAME:
				setApplicationClassName(APPLICATION_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_APPLICATION__WORKBENCH_ADVISOR_CLASS_NAME:
				setWorkbenchAdvisorClassName(WORKBENCH_ADVISOR_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_APPLICATION__WORKBENCH_WINDOW_ADVISOR_CLASS_NAME:
				setWorkbenchWindowAdvisorClassName(WORKBENCH_WINDOW_ADVISOR_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_APPLICATION__ACTION_BAR_ADVISOR_CLASS_NAME:
				setActionBarAdvisorClassName(ACTION_BAR_ADVISOR_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_APPLICATION__PERSPECTIVE_CLASS_NAME:
				setPerspectiveClassName(PERSPECTIVE_CLASS_NAME_EDEFAULT);
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
			case GMFGenPackage.GEN_APPLICATION__EDITOR_GEN:
				return getEditorGen() != null;
			case GMFGenPackage.GEN_APPLICATION__APPLICATION_PACKAGE_NAME:
				return APPLICATION_PACKAGE_NAME_EDEFAULT == null ? applicationPackageName != null : !APPLICATION_PACKAGE_NAME_EDEFAULT.equals(applicationPackageName);
			case GMFGenPackage.GEN_APPLICATION__APPLICATION_CLASS_NAME:
				return APPLICATION_CLASS_NAME_EDEFAULT == null ? applicationClassName != null : !APPLICATION_CLASS_NAME_EDEFAULT.equals(applicationClassName);
			case GMFGenPackage.GEN_APPLICATION__WORKBENCH_ADVISOR_CLASS_NAME:
				return WORKBENCH_ADVISOR_CLASS_NAME_EDEFAULT == null ? workbenchAdvisorClassName != null : !WORKBENCH_ADVISOR_CLASS_NAME_EDEFAULT.equals(workbenchAdvisorClassName);
			case GMFGenPackage.GEN_APPLICATION__WORKBENCH_WINDOW_ADVISOR_CLASS_NAME:
				return WORKBENCH_WINDOW_ADVISOR_CLASS_NAME_EDEFAULT == null ? workbenchWindowAdvisorClassName != null : !WORKBENCH_WINDOW_ADVISOR_CLASS_NAME_EDEFAULT.equals(workbenchWindowAdvisorClassName);
			case GMFGenPackage.GEN_APPLICATION__ACTION_BAR_ADVISOR_CLASS_NAME:
				return ACTION_BAR_ADVISOR_CLASS_NAME_EDEFAULT == null ? actionBarAdvisorClassName != null : !ACTION_BAR_ADVISOR_CLASS_NAME_EDEFAULT.equals(actionBarAdvisorClassName);
			case GMFGenPackage.GEN_APPLICATION__PERSPECTIVE_CLASS_NAME:
				return PERSPECTIVE_CLASS_NAME_EDEFAULT == null ? perspectiveClassName != null : !PERSPECTIVE_CLASS_NAME_EDEFAULT.equals(perspectiveClassName);
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
		result.append(" (applicationPackageName: ");
		result.append(applicationPackageName);
		result.append(", applicationClassName: ");
		result.append(applicationClassName);
		result.append(", workbenchAdvisorClassName: ");
		result.append(workbenchAdvisorClassName);
		result.append(", workbenchWindowAdvisorClassName: ");
		result.append(workbenchWindowAdvisorClassName);
		result.append(", actionBarAdvisorClassName: ");
		result.append(actionBarAdvisorClassName);
		result.append(", perspectiveClassName: ");
		result.append(perspectiveClassName);
		result.append(')');
		return result.toString();
	}

	String getDomainPackageCapName() {
		return ((GenEditorGeneratorImpl) getEditorGen()).getDomainModelCapName();
	}
} //GenApplicationImpl
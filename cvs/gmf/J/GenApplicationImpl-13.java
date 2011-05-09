/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenApplication;
import org.eclipse.gmf.codegen.gmfgen.GenContributionItem;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.gmfgen.GenMenuManager;
import org.eclipse.gmf.codegen.gmfgen.GenToolBarManager;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getEditorGen <em>Editor Gen</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getWorkbenchAdvisorClassName <em>Workbench Advisor Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getWorkbenchWindowAdvisorClassName <em>Workbench Window Advisor Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getActionBarAdvisorClassName <em>Action Bar Advisor Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getPerspectiveClassName <em>Perspective Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getPerspectiveId <em>Perspective Id</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#isSupportFiles <em>Support Files</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getSharedContributionItems <em>Shared Contribution Items</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getMainMenu <em>Main Menu</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getMainToolBar <em>Main Tool Bar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenApplicationImpl extends EObjectImpl implements GenApplication {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String iD = ID_EDEFAULT;

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
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected String packageName = PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getWorkbenchWindowAdvisorClassName() <em>Workbench Window Advisor Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkbenchWindowAdvisorClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKBENCH_WINDOW_ADVISOR_CLASS_NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getPerspectiveClassName() <em>Perspective Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerspectiveClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSPECTIVE_CLASS_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPerspectiveId() <em>Perspective Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerspectiveId()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSPECTIVE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerspectiveId() <em>Perspective Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerspectiveId()
	 * @generated
	 * @ordered
	 */
	protected String perspectiveId = PERSPECTIVE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isSupportFiles() <em>Support Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportFiles()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUPPORT_FILES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSupportFiles() <em>Support Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportFiles()
	 * @generated
	 * @ordered
	 */
	protected boolean supportFiles = SUPPORT_FILES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSharedContributionItems() <em>Shared Contribution Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedContributionItems()
	 * @generated
	 * @ordered
	 */
	protected EList<GenContributionItem> sharedContributionItems;

	/**
	 * The cached value of the '{@link #getMainMenu() <em>Main Menu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainMenu()
	 * @generated
	 * @ordered
	 */
	protected GenMenuManager mainMenu;

	/**
	 * The cached value of the '{@link #getMainToolBar() <em>Main Tool Bar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainToolBar()
	 * @generated
	 * @ordered
	 */
	protected GenToolBarManager mainToolBar;

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
	@Override
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
	public NotificationChain basicSetEditorGen(GenEditorGenerator newEditorGen, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEditorGen, GMFGenPackage.GEN_APPLICATION__EDITOR_GEN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditorGen(GenEditorGenerator newEditorGen) {
		if (newEditorGen != eInternalContainer() || (eContainerFeatureID != GMFGenPackage.GEN_APPLICATION__EDITOR_GEN && newEditorGen != null)) {
			if (EcoreUtil.isAncestor(this, newEditorGen))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEditorGen != null)
				msgs = ((InternalEObject)newEditorGen).eInverseAdd(this, GMFGenPackage.GEN_EDITOR_GENERATOR__APPLICATION, GenEditorGenerator.class, msgs);
			msgs = basicSetEditorGen(newEditorGen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_APPLICATION__EDITOR_GEN, newEditorGen, newEditorGen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIDGen() {
		return iD;
	}

	public String getID() {
		String value = getIDGen();
		if (GenCommonBaseImpl.isEmpty(value)) {
			value = getEditorGen().getModelID().replace(" ", "") + "Application"; //$NON-NLS-1$ //$NON-NLS-2$
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_APPLICATION__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitleGen() {
		return title;
	}

	public String getTitle() {
		String value = getTitleGen();
		if (GenCommonBaseImpl.isEmpty(value)) {
			value = getEditorGen().getModelID() + " Application";
		}
		return value;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_APPLICATION__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageNameGen() {
		return packageName;
	}

	public String getPackageName() {
		String value = getPackageNameGen();
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
	public void setPackageName(String newPackageName) {
		String oldPackageName = packageName;
		packageName = newPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_APPLICATION__PACKAGE_NAME, oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassNameGen() {
		return className;
	}

	public String getClassName() {
		String value = getClassNameGen();
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
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_APPLICATION__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getWorkbenchAdvisorClassName() {
		return "DiagramEditorWorkbenchAdvisor";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getWorkbenchWindowAdvisorClassName() {
		return "DiagramEditorWorkbenchWindowAdvisor";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getActionBarAdvisorClassName() {
		return "DiagramEditorActionBarAdvisor";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getPerspectiveClassName() {
		return "DiagramEditorPerspective";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPerspectiveIdGen() {
		return perspectiveId;
	}

	public String getPerspectiveId() {
		String value = getPerspectiveIdGen();
		if (GenCommonBaseImpl.isEmpty(value)) {
			value = getEditorGen().getPackageNamePrefix() + '.' + getEditorGen().getModelID() + "Perspective"; //$NON-NLS-1$
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerspectiveId(String newPerspectiveId) {
		String oldPerspectiveId = perspectiveId;
		perspectiveId = newPerspectiveId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_APPLICATION__PERSPECTIVE_ID, oldPerspectiveId, perspectiveId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSupportFiles() {
		return supportFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportFiles(boolean newSupportFiles) {
		boolean oldSupportFiles = supportFiles;
		supportFiles = newSupportFiles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_APPLICATION__SUPPORT_FILES, oldSupportFiles, supportFiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenContributionItem> getSharedContributionItems() {
		if (sharedContributionItems == null) {
			sharedContributionItems = new EObjectContainmentEList<GenContributionItem>(GenContributionItem.class, this, GMFGenPackage.GEN_APPLICATION__SHARED_CONTRIBUTION_ITEMS);
		}
		return sharedContributionItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenMenuManager getMainMenu() {
		return mainMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainMenu(GenMenuManager newMainMenu, NotificationChain msgs) {
		GenMenuManager oldMainMenu = mainMenu;
		mainMenu = newMainMenu;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_APPLICATION__MAIN_MENU, oldMainMenu, newMainMenu);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainMenu(GenMenuManager newMainMenu) {
		if (newMainMenu != mainMenu) {
			NotificationChain msgs = null;
			if (mainMenu != null)
				msgs = ((InternalEObject)mainMenu).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_APPLICATION__MAIN_MENU, null, msgs);
			if (newMainMenu != null)
				msgs = ((InternalEObject)newMainMenu).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_APPLICATION__MAIN_MENU, null, msgs);
			msgs = basicSetMainMenu(newMainMenu, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_APPLICATION__MAIN_MENU, newMainMenu, newMainMenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenToolBarManager getMainToolBar() {
		return mainToolBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainToolBar(GenToolBarManager newMainToolBar, NotificationChain msgs) {
		GenToolBarManager oldMainToolBar = mainToolBar;
		mainToolBar = newMainToolBar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_APPLICATION__MAIN_TOOL_BAR, oldMainToolBar, newMainToolBar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainToolBar(GenToolBarManager newMainToolBar) {
		if (newMainToolBar != mainToolBar) {
			NotificationChain msgs = null;
			if (mainToolBar != null)
				msgs = ((InternalEObject)mainToolBar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_APPLICATION__MAIN_TOOL_BAR, null, msgs);
			if (newMainToolBar != null)
				msgs = ((InternalEObject)newMainToolBar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_APPLICATION__MAIN_TOOL_BAR, null, msgs);
			msgs = basicSetMainToolBar(newMainToolBar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_APPLICATION__MAIN_TOOL_BAR, newMainToolBar, newMainToolBar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getQualifiedClassName() {
		return getPackageName() + '.' + getClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getWorkbenchAdvisorQualifiedClassName() {
		return getPackageName() + '.' + getWorkbenchAdvisorClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getWorkbenchWindowAdvisorQualifiedClassName() {
		return getPackageName() + '.' + getWorkbenchWindowAdvisorClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getActionBarAdvisorQualifiedClassName() {
		return getPackageName() + '.' + getActionBarAdvisorClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getPerspectiveQualifiedClassName() {
		return getPackageName() + '.' + getPerspectiveClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_APPLICATION__EDITOR_GEN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEditorGen((GenEditorGenerator)otherEnd, msgs);
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
			case GMFGenPackage.GEN_APPLICATION__EDITOR_GEN:
				return basicSetEditorGen(null, msgs);
			case GMFGenPackage.GEN_APPLICATION__SHARED_CONTRIBUTION_ITEMS:
				return ((InternalEList<?>)getSharedContributionItems()).basicRemove(otherEnd, msgs);
			case GMFGenPackage.GEN_APPLICATION__MAIN_MENU:
				return basicSetMainMenu(null, msgs);
			case GMFGenPackage.GEN_APPLICATION__MAIN_TOOL_BAR:
				return basicSetMainToolBar(null, msgs);
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.GEN_APPLICATION__EDITOR_GEN:
				return getEditorGen();
			case GMFGenPackage.GEN_APPLICATION__ID:
				return getID();
			case GMFGenPackage.GEN_APPLICATION__TITLE:
				return getTitle();
			case GMFGenPackage.GEN_APPLICATION__PACKAGE_NAME:
				return getPackageName();
			case GMFGenPackage.GEN_APPLICATION__CLASS_NAME:
				return getClassName();
			case GMFGenPackage.GEN_APPLICATION__WORKBENCH_ADVISOR_CLASS_NAME:
				return getWorkbenchAdvisorClassName();
			case GMFGenPackage.GEN_APPLICATION__WORKBENCH_WINDOW_ADVISOR_CLASS_NAME:
				return getWorkbenchWindowAdvisorClassName();
			case GMFGenPackage.GEN_APPLICATION__ACTION_BAR_ADVISOR_CLASS_NAME:
				return getActionBarAdvisorClassName();
			case GMFGenPackage.GEN_APPLICATION__PERSPECTIVE_CLASS_NAME:
				return getPerspectiveClassName();
			case GMFGenPackage.GEN_APPLICATION__PERSPECTIVE_ID:
				return getPerspectiveId();
			case GMFGenPackage.GEN_APPLICATION__SUPPORT_FILES:
				return isSupportFiles() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_APPLICATION__SHARED_CONTRIBUTION_ITEMS:
				return getSharedContributionItems();
			case GMFGenPackage.GEN_APPLICATION__MAIN_MENU:
				return getMainMenu();
			case GMFGenPackage.GEN_APPLICATION__MAIN_TOOL_BAR:
				return getMainToolBar();
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
			case GMFGenPackage.GEN_APPLICATION__EDITOR_GEN:
				setEditorGen((GenEditorGenerator)newValue);
				return;
			case GMFGenPackage.GEN_APPLICATION__ID:
				setID((String)newValue);
				return;
			case GMFGenPackage.GEN_APPLICATION__TITLE:
				setTitle((String)newValue);
				return;
			case GMFGenPackage.GEN_APPLICATION__PACKAGE_NAME:
				setPackageName((String)newValue);
				return;
			case GMFGenPackage.GEN_APPLICATION__CLASS_NAME:
				setClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_APPLICATION__PERSPECTIVE_ID:
				setPerspectiveId((String)newValue);
				return;
			case GMFGenPackage.GEN_APPLICATION__SUPPORT_FILES:
				setSupportFiles(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_APPLICATION__SHARED_CONTRIBUTION_ITEMS:
				getSharedContributionItems().clear();
				getSharedContributionItems().addAll((Collection<? extends GenContributionItem>)newValue);
				return;
			case GMFGenPackage.GEN_APPLICATION__MAIN_MENU:
				setMainMenu((GenMenuManager)newValue);
				return;
			case GMFGenPackage.GEN_APPLICATION__MAIN_TOOL_BAR:
				setMainToolBar((GenToolBarManager)newValue);
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
			case GMFGenPackage.GEN_APPLICATION__EDITOR_GEN:
				setEditorGen((GenEditorGenerator)null);
				return;
			case GMFGenPackage.GEN_APPLICATION__ID:
				setID(ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_APPLICATION__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case GMFGenPackage.GEN_APPLICATION__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_APPLICATION__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_APPLICATION__PERSPECTIVE_ID:
				setPerspectiveId(PERSPECTIVE_ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_APPLICATION__SUPPORT_FILES:
				setSupportFiles(SUPPORT_FILES_EDEFAULT);
				return;
			case GMFGenPackage.GEN_APPLICATION__SHARED_CONTRIBUTION_ITEMS:
				getSharedContributionItems().clear();
				return;
			case GMFGenPackage.GEN_APPLICATION__MAIN_MENU:
				setMainMenu((GenMenuManager)null);
				return;
			case GMFGenPackage.GEN_APPLICATION__MAIN_TOOL_BAR:
				setMainToolBar((GenToolBarManager)null);
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
			case GMFGenPackage.GEN_APPLICATION__EDITOR_GEN:
				return getEditorGen() != null;
			case GMFGenPackage.GEN_APPLICATION__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case GMFGenPackage.GEN_APPLICATION__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case GMFGenPackage.GEN_APPLICATION__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
			case GMFGenPackage.GEN_APPLICATION__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
			case GMFGenPackage.GEN_APPLICATION__WORKBENCH_ADVISOR_CLASS_NAME:
				return WORKBENCH_ADVISOR_CLASS_NAME_EDEFAULT == null ? getWorkbenchAdvisorClassName() != null : !WORKBENCH_ADVISOR_CLASS_NAME_EDEFAULT.equals(getWorkbenchAdvisorClassName());
			case GMFGenPackage.GEN_APPLICATION__WORKBENCH_WINDOW_ADVISOR_CLASS_NAME:
				return WORKBENCH_WINDOW_ADVISOR_CLASS_NAME_EDEFAULT == null ? getWorkbenchWindowAdvisorClassName() != null : !WORKBENCH_WINDOW_ADVISOR_CLASS_NAME_EDEFAULT.equals(getWorkbenchWindowAdvisorClassName());
			case GMFGenPackage.GEN_APPLICATION__ACTION_BAR_ADVISOR_CLASS_NAME:
				return ACTION_BAR_ADVISOR_CLASS_NAME_EDEFAULT == null ? getActionBarAdvisorClassName() != null : !ACTION_BAR_ADVISOR_CLASS_NAME_EDEFAULT.equals(getActionBarAdvisorClassName());
			case GMFGenPackage.GEN_APPLICATION__PERSPECTIVE_CLASS_NAME:
				return PERSPECTIVE_CLASS_NAME_EDEFAULT == null ? getPerspectiveClassName() != null : !PERSPECTIVE_CLASS_NAME_EDEFAULT.equals(getPerspectiveClassName());
			case GMFGenPackage.GEN_APPLICATION__PERSPECTIVE_ID:
				return PERSPECTIVE_ID_EDEFAULT == null ? perspectiveId != null : !PERSPECTIVE_ID_EDEFAULT.equals(perspectiveId);
			case GMFGenPackage.GEN_APPLICATION__SUPPORT_FILES:
				return supportFiles != SUPPORT_FILES_EDEFAULT;
			case GMFGenPackage.GEN_APPLICATION__SHARED_CONTRIBUTION_ITEMS:
				return sharedContributionItems != null && !sharedContributionItems.isEmpty();
			case GMFGenPackage.GEN_APPLICATION__MAIN_MENU:
				return mainMenu != null;
			case GMFGenPackage.GEN_APPLICATION__MAIN_TOOL_BAR:
				return mainToolBar != null;
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
		result.append(" (iD: ");
		result.append(iD);
		result.append(", title: ");
		result.append(title);
		result.append(", packageName: ");
		result.append(packageName);
		result.append(", className: ");
		result.append(className);
		result.append(", perspectiveId: ");
		result.append(perspectiveId);
		result.append(", supportFiles: ");
		result.append(supportFiles);
		result.append(')');
		return result.toString();
	}

	String getDomainPackageCapName() {
		return ((GenEditorGeneratorImpl) getEditorGen()).getDomainModelCapName();
	}
} //GenApplicationImpl
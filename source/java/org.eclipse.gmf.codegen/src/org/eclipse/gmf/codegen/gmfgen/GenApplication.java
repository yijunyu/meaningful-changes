/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getEditorGen <em>Editor Gen</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getWorkbenchAdvisorClassName <em>Workbench Advisor Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getWorkbenchWindowAdvisorClassName <em>Workbench Window Advisor Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getActionBarAdvisorClassName <em>Action Bar Advisor Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getPerspectiveClassName <em>Perspective Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getPerspectiveId <em>Perspective Id</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#isSupportFiles <em>Support Files</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getSharedContributionItems <em>Shared Contribution Items</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getMainMenu <em>Main Menu</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getMainToolBar <em>Main Tool Bar</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenApplication()
 * @model
 * @generated
 */
public interface GenApplication extends EObject {
	/**
	 * Returns the value of the '<em><b>Editor Gen</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor Gen</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor Gen</em>' container reference.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenApplication_EditorGen()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getApplication
	 * @model opposite="application" resolveProxies="false" required="true" transient="false" changeable="false"
	 * @generated
	 */
	GenEditorGenerator getEditorGen();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RCP Application ID for plugin.xml
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenApplication_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenApplication_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenApplication_PackageName()
	 * @model
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenApplication_ClassName()
	 * @model
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Workbench Advisor Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workbench Advisor Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workbench Advisor Class Name</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenApplication_WorkbenchAdvisorClassName()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getWorkbenchAdvisorClassName();

	/**
	 * Returns the value of the '<em><b>Workbench Window Advisor Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workbench Window Advisor Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workbench Window Advisor Class Name</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenApplication_WorkbenchWindowAdvisorClassName()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getWorkbenchWindowAdvisorClassName();

	/**
	 * Returns the value of the '<em><b>Action Bar Advisor Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Bar Advisor Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Bar Advisor Class Name</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenApplication_ActionBarAdvisorClassName()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getActionBarAdvisorClassName();

	/**
	 * Returns the value of the '<em><b>Perspective Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perspective Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perspective Class Name</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenApplication_PerspectiveClassName()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getPerspectiveClassName();

	/**
	 * Returns the value of the '<em><b>Perspective Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perspective Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perspective Id</em>' attribute.
	 * @see #setPerspectiveId(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenApplication_PerspectiveId()
	 * @model
	 * @generated
	 */
	String getPerspectiveId();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getPerspectiveId <em>Perspective Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perspective Id</em>' attribute.
	 * @see #getPerspectiveId()
	 * @generated
	 */
	void setPerspectiveId(String value);

	/**
	 * Returns the value of the '<em><b>Support Files</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Option to create/save/open diagrams in/from java files
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Support Files</em>' attribute.
	 * @see #setSupportFiles(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenApplication_SupportFiles()
	 * @model
	 * @generated
	 */
	boolean isSupportFiles();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#isSupportFiles <em>Support Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support Files</em>' attribute.
	 * @see #isSupportFiles()
	 * @generated
	 */
	void setSupportFiles(boolean value);

	/**
	 * Returns the value of the '<em><b>Shared Contribution Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenContributionItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared Contribution Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Contribution Items</em>' containment reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenApplication_SharedContributionItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenContributionItem> getSharedContributionItems();

	/**
	 * Returns the value of the '<em><b>Main Menu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Menu</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Menu</em>' containment reference.
	 * @see #setMainMenu(GenMenuManager)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenApplication_MainMenu()
	 * @model containment="true"
	 * @generated
	 */
	GenMenuManager getMainMenu();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getMainMenu <em>Main Menu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Menu</em>' containment reference.
	 * @see #getMainMenu()
	 * @generated
	 */
	void setMainMenu(GenMenuManager value);

	/**
	 * Returns the value of the '<em><b>Main Tool Bar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Tool Bar</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Tool Bar</em>' containment reference.
	 * @see #setMainToolBar(GenToolBarManager)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenApplication_MainToolBar()
	 * @model containment="true"
	 * @generated
	 */
	GenToolBarManager getMainToolBar();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getMainToolBar <em>Main Tool Bar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Tool Bar</em>' containment reference.
	 * @see #getMainToolBar()
	 * @generated
	 */
	void setMainToolBar(GenToolBarManager value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getWorkbenchAdvisorQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getWorkbenchWindowAdvisorQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getActionBarAdvisorQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getPerspectiveQualifiedClassName();

} // GenApplication
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

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
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getApplicationPackageName <em>Application Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getApplicationClassName <em>Application Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getWorkbenchAdvisorClassName <em>Workbench Advisor Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getWorkbenchWindowAdvisorClassName <em>Workbench Window Advisor Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getActionBarAdvisorClassName <em>Action Bar Advisor Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getPerspectiveClassName <em>Perspective Class Name</em>}</li>
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
	 * @model opposite="application" required="true" changeable="false"
	 * @generated
	 */
	GenEditorGenerator getEditorGen();

	/**
	 * Returns the value of the '<em><b>Application Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Package Name</em>' attribute.
	 * @see #setApplicationPackageName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenApplication_ApplicationPackageName()
	 * @model
	 * @generated
	 */
	String getApplicationPackageName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getApplicationPackageName <em>Application Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Package Name</em>' attribute.
	 * @see #getApplicationPackageName()
	 * @generated
	 */
	void setApplicationPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Application Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Class Name</em>' attribute.
	 * @see #setApplicationClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenApplication_ApplicationClassName()
	 * @model
	 * @generated
	 */
	String getApplicationClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getApplicationClassName <em>Application Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Class Name</em>' attribute.
	 * @see #getApplicationClassName()
	 * @generated
	 */
	void setApplicationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Workbench Advisor Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workbench Advisor Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workbench Advisor Class Name</em>' attribute.
	 * @see #setWorkbenchAdvisorClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenApplication_WorkbenchAdvisorClassName()
	 * @model
	 * @generated
	 */
	String getWorkbenchAdvisorClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getWorkbenchAdvisorClassName <em>Workbench Advisor Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workbench Advisor Class Name</em>' attribute.
	 * @see #getWorkbenchAdvisorClassName()
	 * @generated
	 */
	void setWorkbenchAdvisorClassName(String value);

	/**
	 * Returns the value of the '<em><b>Workbench Window Advisor Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workbench Window Advisor Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workbench Window Advisor Class Name</em>' attribute.
	 * @see #setWorkbenchWindowAdvisorClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenApplication_WorkbenchWindowAdvisorClassName()
	 * @model
	 * @generated
	 */
	String getWorkbenchWindowAdvisorClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getWorkbenchWindowAdvisorClassName <em>Workbench Window Advisor Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workbench Window Advisor Class Name</em>' attribute.
	 * @see #getWorkbenchWindowAdvisorClassName()
	 * @generated
	 */
	void setWorkbenchWindowAdvisorClassName(String value);

	/**
	 * Returns the value of the '<em><b>Action Bar Advisor Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Bar Advisor Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Bar Advisor Class Name</em>' attribute.
	 * @see #setActionBarAdvisorClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenApplication_ActionBarAdvisorClassName()
	 * @model
	 * @generated
	 */
	String getActionBarAdvisorClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getActionBarAdvisorClassName <em>Action Bar Advisor Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Bar Advisor Class Name</em>' attribute.
	 * @see #getActionBarAdvisorClassName()
	 * @generated
	 */
	void setActionBarAdvisorClassName(String value);

	/**
	 * Returns the value of the '<em><b>Perspective Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perspective Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perspective Class Name</em>' attribute.
	 * @see #setPerspectiveClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenApplication_PerspectiveClassName()
	 * @model
	 * @generated
	 */
	String getPerspectiveClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getPerspectiveClassName <em>Perspective Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perspective Class Name</em>' attribute.
	 * @see #getPerspectiveClassName()
	 * @generated
	 */
	void setPerspectiveClassName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getApplicationQualifiedClassName();

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
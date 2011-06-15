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
 * A representation of the model object '<em><b>Editor Candies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getCreationWizardClassName <em>Creation Wizard Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getCreationWizardPageClassName <em>Creation Wizard Page Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getCreationWizardIconPath <em>Creation Wizard Icon Path</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getCreationWizardIconPathX <em>Creation Wizard Icon Path X</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getCreationWizardCategoryID <em>Creation Wizard Category ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getDiagramEditorUtilClassName <em>Diagram Editor Util Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getDocumentProviderClassName <em>Document Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getInitDiagramFileActionClassName <em>Init Diagram File Action Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getNewDiagramFileWizardClassName <em>New Diagram File Wizard Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getDiagramContentInitializerClassName <em>Diagram Content Initializer Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getMatchingStrategyClassName <em>Matching Strategy Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getVisualIDRegistryClassName <em>Visual ID Registry Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getElementChooserClassName <em>Element Chooser Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getLoadResourceActionClassName <em>Load Resource Action Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getEditingDomainID <em>Editing Domain ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getEditorCandies()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EditorCandies extends EObject {
	/**
	 * Returns the value of the '<em><b>Creation Wizard Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Wizard Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Wizard Class Name</em>' attribute.
	 * @see #setCreationWizardClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getEditorCandies_CreationWizardClassName()
	 * @model
	 * @generated
	 */
	String getCreationWizardClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getCreationWizardClassName <em>Creation Wizard Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Wizard Class Name</em>' attribute.
	 * @see #getCreationWizardClassName()
	 * @generated
	 */
	void setCreationWizardClassName(String value);

	/**
	 * Returns the value of the '<em><b>Creation Wizard Page Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Wizard Page Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Wizard Page Class Name</em>' attribute.
	 * @see #setCreationWizardPageClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getEditorCandies_CreationWizardPageClassName()
	 * @model
	 * @generated
	 */
	String getCreationWizardPageClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getCreationWizardPageClassName <em>Creation Wizard Page Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Wizard Page Class Name</em>' attribute.
	 * @see #getCreationWizardPageClassName()
	 * @generated
	 */
	void setCreationWizardPageClassName(String value);

	/**
	 * Returns the value of the '<em><b>Creation Wizard Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Wizard Icon Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Wizard Icon Path</em>' attribute.
	 * @see #setCreationWizardIconPath(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getEditorCandies_CreationWizardIconPath()
	 * @model required="true"
	 * @generated
	 */
	String getCreationWizardIconPath();

	/**
	 * @see GenEditorView#getIconPathX()
	 * @return
	 */
	String getCreationWizardIconPathX();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getCreationWizardIconPath <em>Creation Wizard Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Wizard Icon Path</em>' attribute.
	 * @see #getCreationWizardIconPath()
	 * @generated
	 */
	void setCreationWizardIconPath(String value);

	/**
	 * Returns the value of the '<em><b>Creation Wizard Category ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Wizard Category ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Wizard Category ID</em>' attribute.
	 * @see #setCreationWizardCategoryID(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getEditorCandies_CreationWizardCategoryID()
	 * @model
	 * @generated
	 */
	String getCreationWizardCategoryID();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getCreationWizardCategoryID <em>Creation Wizard Category ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Wizard Category ID</em>' attribute.
	 * @see #getCreationWizardCategoryID()
	 * @generated
	 */
	void setCreationWizardCategoryID(String value);

	/**
	 * Returns the value of the '<em><b>Diagram Editor Util Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Editor Util Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Editor Util Class Name</em>' attribute.
	 * @see #setDiagramEditorUtilClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getEditorCandies_DiagramEditorUtilClassName()
	 * @model
	 * @generated
	 */
	String getDiagramEditorUtilClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getDiagramEditorUtilClassName <em>Diagram Editor Util Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Editor Util Class Name</em>' attribute.
	 * @see #getDiagramEditorUtilClassName()
	 * @generated
	 */
	void setDiagramEditorUtilClassName(String value);

	/**
	 * Returns the value of the '<em><b>Document Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Provider Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Provider Class Name</em>' attribute.
	 * @see #setDocumentProviderClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getEditorCandies_DocumentProviderClassName()
	 * @model
	 * @generated
	 */
	String getDocumentProviderClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getDocumentProviderClassName <em>Document Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Provider Class Name</em>' attribute.
	 * @see #getDocumentProviderClassName()
	 * @generated
	 */
	void setDocumentProviderClassName(String value);

	/**
	 * Returns the value of the '<em><b>Init Diagram File Action Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Diagram File Action Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Diagram File Action Class Name</em>' attribute.
	 * @see #setInitDiagramFileActionClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getEditorCandies_InitDiagramFileActionClassName()
	 * @model annotation="http://www.eclipse.org/gmf/2006/deprecated documentation='Use InitDiagramAction instead'"
	 * @generated
	 */
	String getInitDiagramFileActionClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getInitDiagramFileActionClassName <em>Init Diagram File Action Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Diagram File Action Class Name</em>' attribute.
	 * @see #getInitDiagramFileActionClassName()
	 * @generated
	 */
	void setInitDiagramFileActionClassName(String value);

	/**
	 * Returns the value of the '<em><b>New Diagram File Wizard Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Diagram File Wizard Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Diagram File Wizard Class Name</em>' attribute.
	 * @see #setNewDiagramFileWizardClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getEditorCandies_NewDiagramFileWizardClassName()
	 * @model
	 * @generated
	 */
	String getNewDiagramFileWizardClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getNewDiagramFileWizardClassName <em>New Diagram File Wizard Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Diagram File Wizard Class Name</em>' attribute.
	 * @see #getNewDiagramFileWizardClassName()
	 * @generated
	 */
	void setNewDiagramFileWizardClassName(String value);

	/**
	 * Returns the value of the '<em><b>Diagram Content Initializer Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Content Initializer Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Content Initializer Class Name</em>' attribute.
	 * @see #setDiagramContentInitializerClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getEditorCandies_DiagramContentInitializerClassName()
	 * @model
	 * @generated
	 */
	String getDiagramContentInitializerClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getDiagramContentInitializerClassName <em>Diagram Content Initializer Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Content Initializer Class Name</em>' attribute.
	 * @see #getDiagramContentInitializerClassName()
	 * @generated
	 */
	void setDiagramContentInitializerClassName(String value);

	/**
	 * Returns the value of the '<em><b>Matching Strategy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matching Strategy Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matching Strategy Class Name</em>' attribute.
	 * @see #setMatchingStrategyClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getEditorCandies_MatchingStrategyClassName()
	 * @model
	 * @generated
	 */
	String getMatchingStrategyClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getMatchingStrategyClassName <em>Matching Strategy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matching Strategy Class Name</em>' attribute.
	 * @see #getMatchingStrategyClassName()
	 * @generated
	 */
	void setMatchingStrategyClassName(String value);

	/**
	 * Returns the value of the '<em><b>Visual ID Registry Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visual ID Registry Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual ID Registry Class Name</em>' attribute.
	 * @see #setVisualIDRegistryClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getEditorCandies_VisualIDRegistryClassName()
	 * @model
	 * @generated
	 */
	String getVisualIDRegistryClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getVisualIDRegistryClassName <em>Visual ID Registry Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visual ID Registry Class Name</em>' attribute.
	 * @see #getVisualIDRegistryClassName()
	 * @generated
	 */
	void setVisualIDRegistryClassName(String value);

	/**
	 * Returns the value of the '<em><b>Element Chooser Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Chooser Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Chooser Class Name</em>' attribute.
	 * @see #setElementChooserClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getEditorCandies_ElementChooserClassName()
	 * @model
	 * @generated
	 */
	String getElementChooserClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getElementChooserClassName <em>Element Chooser Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Chooser Class Name</em>' attribute.
	 * @see #getElementChooserClassName()
	 * @generated
	 */
	void setElementChooserClassName(String value);

	/**
	 * Returns the value of the '<em><b>Load Resource Action Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Resource Action Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Resource Action Class Name</em>' attribute.
	 * @see #setLoadResourceActionClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getEditorCandies_LoadResourceActionClassName()
	 * @model annotation="http://www.eclipse.org/gmf/2006/deprecated documentation='Use LoadResourceAction instead'"
	 * @generated
	 */
	String getLoadResourceActionClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getLoadResourceActionClassName <em>Load Resource Action Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Resource Action Class Name</em>' attribute.
	 * @see #getLoadResourceActionClassName()
	 * @generated
	 */
	void setLoadResourceActionClassName(String value);

	/**
	 * Returns the value of the '<em><b>Editing Domain ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editing Domain ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editing Domain ID</em>' attribute.
	 * @see #setEditingDomainID(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getEditorCandies_EditingDomainID()
	 * @model
	 * @generated
	 */
	String getEditingDomainID();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getEditingDomainID <em>Editing Domain ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editing Domain ID</em>' attribute.
	 * @see #getEditingDomainID()
	 * @generated
	 */
	void setEditingDomainID(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getCreationWizardQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getCreationWizardPageQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getDiagramEditorUtilQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getDocumentProviderQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/gmf/2006/deprecated documentation='Use InitDiagramAction instead'"
	 * @generated
	 */
	String getInitDiagramFileActionQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getNewDiagramFileWizardQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getDiagramContentInitializerQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getMatchingStrategyQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getVisualIDRegistryQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getElementChooserQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/gmf/2006/deprecated documentation='Use LoadResourceAction instead'"
	 * @generated
	 */
	String getLoadResourceActionQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/gmf/2006/deprecated documentation='Use InitDiagramAction instead'"
	 * @generated
	 */
	boolean generateInitDiagramAction();

} // EditorCandies

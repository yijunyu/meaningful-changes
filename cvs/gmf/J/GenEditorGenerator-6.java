/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Editor Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getAudits <em>Audits</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getPlugin <em>Plugin</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getDomainGenModel <em>Domain Gen Model</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getPackageNamePrefix <em>Package Name Prefix</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getModelID <em>Model ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#isSameFileForDiagramAndModel <em>Same File For Diagram And Model</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getDiagramFileExtension <em>Diagram File Extension</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getDomainFileExtension <em>Domain File Extension</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#isDynamicTemplates <em>Dynamic Templates</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getTemplateDirectory <em>Template Directory</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenEditorGenerator()
 * @model
 * @generated
 */
public interface GenEditorGenerator extends EObject {
	/**
	 * Returns the value of the '<em><b>Audits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Domain meta-model  audit rules definitions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Audits</em>' containment reference.
	 * @see #setAudits(GenAuditContainer)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenEditorGenerator_Audits()
	 * @model containment="true"
	 * @generated
	 */
	GenAuditContainer getAudits();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getAudits <em>Audits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audits</em>' containment reference.
	 * @see #getAudits()
	 * @generated
	 */
	void setAudits(GenAuditContainer value);

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditorGen <em>Editor Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' containment reference.
	 * @see #setDiagram(GenDiagram)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenEditorGenerator_Diagram()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditorGen
	 * @model opposite="editorGen" containment="true" required="true"
	 * @generated
	 */
	GenDiagram getDiagram();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getDiagram <em>Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' containment reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(GenDiagram value);

	/**
	 * Returns the value of the '<em><b>Plugin</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenPlugin#getEditorGen <em>Editor Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin</em>' containment reference.
	 * @see #setPlugin(GenPlugin)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenEditorGenerator_Plugin()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenPlugin#getEditorGen
	 * @model opposite="editorGen" containment="true" required="true"
	 * @generated
	 */
	GenPlugin getPlugin();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getPlugin <em>Plugin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin</em>' containment reference.
	 * @see #getPlugin()
	 * @generated
	 */
	void setPlugin(GenPlugin value);

	/**
	 * Returns the value of the '<em><b>Editor</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorView#getEditorGen <em>Editor Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor</em>' containment reference.
	 * @see #setEditor(GenEditorView)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenEditorGenerator_Editor()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorView#getEditorGen
	 * @model opposite="editorGen" containment="true" required="true"
	 * @generated
	 */
	GenEditorView getEditor();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getEditor <em>Editor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editor</em>' containment reference.
	 * @see #getEditor()
	 * @generated
	 */
	void setEditor(GenEditorView value);

	/**
	 * Returns the value of the '<em><b>Domain Gen Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is primary EMF genmodel for user's domain model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Gen Model</em>' reference.
	 * @see #setDomainGenModel(GenModel)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenEditorGenerator_DomainGenModel()
	 * @model required="true"
	 * @generated
	 */
	GenModel getDomainGenModel();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getDomainGenModel <em>Domain Gen Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Gen Model</em>' reference.
	 * @see #getDomainGenModel()
	 * @generated
	 */
	void setDomainGenModel(GenModel value);

	/**
	 * Returns the value of the '<em><b>Package Name Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derived from genModel.genPackage[0].getBasePackage() by default
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Name Prefix</em>' attribute.
	 * @see #setPackageNamePrefix(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenEditorGenerator_PackageNamePrefix()
	 * @model
	 * @generated
	 */
	String getPackageNamePrefix();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getPackageNamePrefix <em>Package Name Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name Prefix</em>' attribute.
	 * @see #getPackageNamePrefix()
	 * @generated
	 */
	void setPackageNamePrefix(String value);

	/**
	 * Returns the value of the '<em><b>Model ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model ID</em>' attribute.
	 * @see #setModelID(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenEditorGenerator_ModelID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getModelID();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getModelID <em>Model ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model ID</em>' attribute.
	 * @see #getModelID()
	 * @generated
	 */
	void setModelID(String value);

	/**
	 * Returns the value of the '<em><b>Same File For Diagram And Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specified whether editor should create separate file for domain elements if diagram file references no domain model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Same File For Diagram And Model</em>' attribute.
	 * @see #setSameFileForDiagramAndModel(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenEditorGenerator_SameFileForDiagramAndModel()
	 * @model
	 * @generated
	 */
	boolean isSameFileForDiagramAndModel();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#isSameFileForDiagramAndModel <em>Same File For Diagram And Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Same File For Diagram And Model</em>' attribute.
	 * @see #isSameFileForDiagramAndModel()
	 * @generated
	 */
	void setSameFileForDiagramAndModel(boolean value);

	/**
	 * Returns the value of the '<em><b>Diagram File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram File Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Distinct even when sameFileForDiagramAndModel is true. On init diagram, we just copy domain model element to new file with that extension. I won't try to set this equal to domainFileExtension
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagram File Extension</em>' attribute.
	 * @see #setDiagramFileExtension(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenEditorGenerator_DiagramFileExtension()
	 * @model
	 * @generated
	 */
	String getDiagramFileExtension();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getDiagramFileExtension <em>Diagram File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram File Extension</em>' attribute.
	 * @see #getDiagramFileExtension()
	 * @generated
	 */
	void setDiagramFileExtension(String value);

	/**
	 * Returns the value of the '<em><b>Domain File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * By default, genModel.genPackage[0].getPrefix().toLowerCase(), as in emf/templates/editor/pluign.xmljet
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain File Extension</em>' attribute.
	 * @see #setDomainFileExtension(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenEditorGenerator_DomainFileExtension()
	 * @model
	 * @generated
	 */
	String getDomainFileExtension();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getDomainFileExtension <em>Domain File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain File Extension</em>' attribute.
	 * @see #getDomainFileExtension()
	 * @generated
	 */
	void setDomainFileExtension(String value);

	/**
	 * Returns the value of the '<em><b>Dynamic Templates</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Templates</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Templates</em>' attribute.
	 * @see #setDynamicTemplates(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenEditorGenerator_DynamicTemplates()
	 * @model default="false"
	 * @generated
	 */
	boolean isDynamicTemplates();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#isDynamicTemplates <em>Dynamic Templates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Templates</em>' attribute.
	 * @see #isDynamicTemplates()
	 * @generated
	 */
	void setDynamicTemplates(boolean value);

	/**
	 * Returns the value of the '<em><b>Template Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Directory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Directory</em>' attribute.
	 * @see #setTemplateDirectory(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenEditorGenerator_TemplateDirectory()
	 * @model
	 * @generated
	 */
	String getTemplateDirectory();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getTemplateDirectory <em>Template Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Directory</em>' attribute.
	 * @see #getTemplateDirectory()
	 * @generated
	 */
	void setTemplateDirectory(String value);

} // GenEditorGenerator

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
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getDomainGenModel <em>Domain Gen Model</em>}</li>
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

} // GenEditorGenerator

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getDomainMetaModel <em>Domain Meta Model</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getDomainDiagramElement <em>Domain Diagram Element</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getChildNodes <em>Child Nodes</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getTopLevelNodes <em>Top Level Nodes</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getLinks <em>Links</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getAudits <em>Audits</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPalette <em>Palette</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditCommandsPackageName <em>Edit Commands Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditPartsPackageName <em>Edit Parts Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditPoliciesPackageName <em>Edit Policies Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditorPackageName <em>Editor Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getProvidersPackageName <em>Providers Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getNotationViewFactoriesPackageName <em>Notation View Factories Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPluginID <em>Plugin ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPluginName <em>Plugin Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getProviderName <em>Provider Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#isSameFileForDiagramAndModel <em>Same File For Diagram And Model</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#isPrintingEnabled <em>Printing Enabled</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getDiagramFileExtension <em>Diagram File Extension</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getReorientConnectionViewCommandClassName <em>Reorient Connection View Command Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditPartFactoryClassName <em>Edit Part Factory Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getBaseExternalNodeLabelEditPartClassName <em>Base External Node Label Edit Part Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getBaseItemSemanticEditPolicyClassName <em>Base Item Semantic Edit Policy Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getBaseGraphicalNodeEditPolicyClassName <em>Base Graphical Node Edit Policy Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getReferenceConnectionEditPolicyClassName <em>Reference Connection Edit Policy Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getCanonicalEditPolicyClassName <em>Canonical Edit Policy Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getElementTypesClassName <em>Element Types Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getSemanticHintsClassName <em>Semantic Hints Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getNotationViewProviderClassName <em>Notation View Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditPartProviderClassName <em>Edit Part Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getMetamodelSupportProviderClassName <em>Metamodel Support Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getModelingAssistantProviderClassName <em>Modeling Assistant Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPropertyProviderClassName <em>Property Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getIconProviderClassName <em>Icon Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getStructuralFeatureParserClassName <em>Structural Feature Parser Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getActionBarContributorClassName <em>Action Bar Contributor Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getCreationWizardClassName <em>Creation Wizard Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getCreationWizardPageClassName <em>Creation Wizard Page Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getDiagramEditorUtilClassName <em>Diagram Editor Util Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getDiagramFileCreatorClassName <em>Diagram File Creator Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getDocumentProviderClassName <em>Document Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditorClassName <em>Editor Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getInitDiagramFileActionClassName <em>Init Diagram File Action Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getMatchingStrategyClassName <em>Matching Strategy Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPluginClassName <em>Plugin Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPreferenceInitializerClassName <em>Preference Initializer Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getVisualIDRegistryClassName <em>Visual ID Registry Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getCreateShortcutActionClassName <em>Create Shortcut Action Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getElementChooserClassName <em>Element Chooser Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getContainsShortcutsTo <em>Contains Shortcuts To</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getShortcutsProvidedFor <em>Shortcuts Provided For</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram()
 * @model annotation="http://www.eclipse.org/gmf/2005/constraints ocl='nodes->forAll(n : GenNode | self.links->forAll(l : GenLink | l.oclAsType(TypeLinkModelFacet).metaClass <> n.getDomainMetaClass()))'"
 * @generated
 */
public interface GenDiagram extends GenContainerEditPart {
	/**
	 * Returns the value of the '<em><b>Domain Meta Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Meta Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Meta Model</em>' reference.
	 * @see #setDomainMetaModel(GenPackage)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_DomainMetaModel()
	 * @model required="true"
	 * @generated
	 */
	GenPackage getDomainMetaModel();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getDomainMetaModel <em>Domain Meta Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Meta Model</em>' reference.
	 * @see #getDomainMetaModel()
	 * @generated
	 */
	void setDomainMetaModel(GenPackage value);

	/**
	 * Returns the value of the '<em><b>Domain Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Diagram Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Diagram Element</em>' reference.
	 * @see #setDomainDiagramElement(GenClass)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_DomainDiagramElement()
	 * @model
	 * @generated
	 */
	GenClass getDomainDiagramElement();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getDomainDiagramElement <em>Domain Diagram Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Diagram Element</em>' reference.
	 * @see #getDomainDiagramElement()
	 * @generated
	 */
	void setDomainDiagramElement(GenClass value);

	/**
	 * Returns the value of the '<em><b>Child Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenChildNode}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenChildNode#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Nodes</em>' containment reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_ChildNodes()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildNode#getDiagram
	 * @model type="org.eclipse.gmf.codegen.gmfgen.GenChildNode" opposite="diagram" containment="true"
	 * @generated
	 */
	EList getChildNodes();

	/**
	 * Returns the value of the '<em><b>Top Level Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenTopLevelNode}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenTopLevelNode#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Level Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Level Nodes</em>' containment reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_TopLevelNodes()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenTopLevelNode#getDiagram
	 * @model type="org.eclipse.gmf.codegen.gmfgen.GenTopLevelNode" opposite="diagram" containment="true"
	 * @generated
	 */
	EList getTopLevelNodes();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenLink}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_Links()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLink#getDiagram
	 * @model type="org.eclipse.gmf.codegen.gmfgen.GenLink" opposite="diagram" containment="true"
	 * @generated
	 */
	EList getLinks();

	/**
	 * Returns the value of the '<em><b>Compartments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenCompartment}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenCompartment#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartments</em>' containment reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_Compartments()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenCompartment#getDiagram
	 * @model type="org.eclipse.gmf.codegen.gmfgen.GenCompartment" opposite="diagram" containment="true"
	 * @generated
	 */
	EList getCompartments();

	/**
	 * Returns the value of the '<em><b>Audits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audits</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Domain meta-model  audit rules definitions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Audits</em>' containment reference.
	 * @see #setAudits(GenAuditContainer)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_Audits()
	 * @model containment="true"
	 * @generated
	 */
	GenAuditContainer getAudits();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getAudits <em>Audits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audits</em>' containment reference.
	 * @see #getAudits()
	 * @generated
	 */
	void setAudits(GenAuditContainer value);

	/**
	 * Returns the value of the '<em><b>Palette</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.Palette#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Palette</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palette</em>' containment reference.
	 * @see #setPalette(Palette)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_Palette()
	 * @see org.eclipse.gmf.codegen.gmfgen.Palette#getDiagram
	 * @model opposite="diagram" containment="true"
	 * @generated
	 */
	Palette getPalette();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPalette <em>Palette</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Palette</em>' containment reference.
	 * @see #getPalette()
	 * @generated
	 */
	void setPalette(Palette value);

	/**
	 * Returns the value of the '<em><b>Edit Commands Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit Commands Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Commands Package Name</em>' attribute.
	 * @see #setEditCommandsPackageName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_EditCommandsPackageName()
	 * @model
	 * @generated
	 */
	String getEditCommandsPackageName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditCommandsPackageName <em>Edit Commands Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Commands Package Name</em>' attribute.
	 * @see #getEditCommandsPackageName()
	 * @generated
	 */
	void setEditCommandsPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Edit Parts Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit Parts Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Parts Package Name</em>' attribute.
	 * @see #setEditPartsPackageName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_EditPartsPackageName()
	 * @model
	 * @generated
	 */
	String getEditPartsPackageName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditPartsPackageName <em>Edit Parts Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Parts Package Name</em>' attribute.
	 * @see #getEditPartsPackageName()
	 * @generated
	 */
	void setEditPartsPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Edit Policies Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit Policies Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Policies Package Name</em>' attribute.
	 * @see #setEditPoliciesPackageName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_EditPoliciesPackageName()
	 * @model
	 * @generated
	 */
	String getEditPoliciesPackageName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditPoliciesPackageName <em>Edit Policies Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Policies Package Name</em>' attribute.
	 * @see #getEditPoliciesPackageName()
	 * @generated
	 */
	void setEditPoliciesPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Plugin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin Name</em>' attribute.
	 * @see #setPluginName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_PluginName()
	 * @model
	 * @generated
	 */
	String getPluginName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPluginName <em>Plugin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin Name</em>' attribute.
	 * @see #getPluginName()
	 * @generated
	 */
	void setPluginName(String value);

	/**
	 * Returns the value of the '<em><b>Provider Name</b></em>' attribute.
	 * The default value is <code>"Sample Plugin Provider, Inc"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Name</em>' attribute.
	 * @see #setProviderName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_ProviderName()
	 * @model default="Sample Plugin Provider, Inc"
	 * @generated
	 */
	String getProviderName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getProviderName <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Name</em>' attribute.
	 * @see #getProviderName()
	 * @generated
	 */
	void setProviderName(String value);

	/**
	 * Returns the value of the '<em><b>Plugin ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin ID</em>' attribute.
	 * @see #setPluginID(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_PluginID()
	 * @model
	 * @generated
	 */
	String getPluginID();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPluginID <em>Plugin ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin ID</em>' attribute.
	 * @see #getPluginID()
	 * @generated
	 */
	void setPluginID(String value);

	/**
	 * Returns the value of the '<em><b>Plugin Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin Class Name</em>' attribute.
	 * @see #setPluginClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_PluginClassName()
	 * @model
	 * @generated
	 */
	String getPluginClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPluginClassName <em>Plugin Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin Class Name</em>' attribute.
	 * @see #getPluginClassName()
	 * @generated
	 */
	void setPluginClassName(String value);

	/**
	 * Returns the value of the '<em><b>Preference Initializer Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preference Initializer Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preference Initializer Class Name</em>' attribute.
	 * @see #setPreferenceInitializerClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_PreferenceInitializerClassName()
	 * @model
	 * @generated
	 */
	String getPreferenceInitializerClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPreferenceInitializerClassName <em>Preference Initializer Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preference Initializer Class Name</em>' attribute.
	 * @see #getPreferenceInitializerClassName()
	 * @generated
	 */
	void setPreferenceInitializerClassName(String value);

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
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_VisualIDRegistryClassName()
	 * @model
	 * @generated
	 */
	String getVisualIDRegistryClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getVisualIDRegistryClassName <em>Visual ID Registry Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visual ID Registry Class Name</em>' attribute.
	 * @see #getVisualIDRegistryClassName()
	 * @generated
	 */
	void setVisualIDRegistryClassName(String value);

	/**
	 * Returns the value of the '<em><b>Create Shortcut Action Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Shortcut Action Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Shortcut Action Class Name</em>' attribute.
	 * @see #setCreateShortcutActionClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_CreateShortcutActionClassName()
	 * @model
	 * @generated
	 */
	String getCreateShortcutActionClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getCreateShortcutActionClassName <em>Create Shortcut Action Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Shortcut Action Class Name</em>' attribute.
	 * @see #getCreateShortcutActionClassName()
	 * @generated
	 */
	void setCreateShortcutActionClassName(String value);

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
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_ElementChooserClassName()
	 * @model
	 * @generated
	 */
	String getElementChooserClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getElementChooserClassName <em>Element Chooser Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Chooser Class Name</em>' attribute.
	 * @see #getElementChooserClassName()
	 * @generated
	 */
	void setElementChooserClassName(String value);

	/**
	 * Returns the value of the '<em><b>Contains Shortcuts To</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of domain meta-model file extensions. Elements of the corresponding models could be shortcutted on this diagram.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contains Shortcuts To</em>' attribute list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_ContainsShortcutsTo()
	 * @model type="java.lang.String"
	 * @generated
	 */
	EList getContainsShortcutsTo();

	/**
	 * Returns the value of the '<em><b>Shortcuts Provided For</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of domain meta-model names. Elements of this diagram domain model could be added as a shortcuts to the diagrams of the specified domains.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shortcuts Provided For</em>' attribute list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_ShortcutsProvidedFor()
	 * @model type="java.lang.String"
	 * @generated
	 */
	EList getShortcutsProvidedFor();

	/**
	 * Returns the value of the '<em><b>Editor Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor Package Name</em>' attribute.
	 * @see #setEditorPackageName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_EditorPackageName()
	 * @model
	 * @generated
	 */
	String getEditorPackageName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditorPackageName <em>Editor Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editor Package Name</em>' attribute.
	 * @see #getEditorPackageName()
	 * @generated
	 */
	void setEditorPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Providers Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providers Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providers Package Name</em>' attribute.
	 * @see #setProvidersPackageName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_ProvidersPackageName()
	 * @model
	 * @generated
	 */
	String getProvidersPackageName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getProvidersPackageName <em>Providers Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Providers Package Name</em>' attribute.
	 * @see #getProvidersPackageName()
	 * @generated
	 */
	void setProvidersPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Notation View Factories Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notation View Factories Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notation View Factories Package Name</em>' attribute.
	 * @see #setNotationViewFactoriesPackageName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_NotationViewFactoriesPackageName()
	 * @model
	 * @generated
	 */
	String getNotationViewFactoriesPackageName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getNotationViewFactoriesPackageName <em>Notation View Factories Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notation View Factories Package Name</em>' attribute.
	 * @see #getNotationViewFactoriesPackageName()
	 * @generated
	 */
	void setNotationViewFactoriesPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Editor Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor Class Name</em>' attribute.
	 * @see #setEditorClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_EditorClassName()
	 * @model
	 * @generated
	 */
	String getEditorClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditorClassName <em>Editor Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editor Class Name</em>' attribute.
	 * @see #getEditorClassName()
	 * @generated
	 */
	void setEditorClassName(String value);

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
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_DocumentProviderClassName()
	 * @model
	 * @generated
	 */
	String getDocumentProviderClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getDocumentProviderClassName <em>Document Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Provider Class Name</em>' attribute.
	 * @see #getDocumentProviderClassName()
	 * @generated
	 */
	void setDocumentProviderClassName(String value);

	/**
	 * Returns the value of the '<em><b>Edit Part Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit Part Factory Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Part Factory Class Name</em>' attribute.
	 * @see #setEditPartFactoryClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_EditPartFactoryClassName()
	 * @model
	 * @generated
	 */
	String getEditPartFactoryClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditPartFactoryClassName <em>Edit Part Factory Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Part Factory Class Name</em>' attribute.
	 * @see #getEditPartFactoryClassName()
	 * @generated
	 */
	void setEditPartFactoryClassName(String value);

	/**
	 * Returns the value of the '<em><b>Base External Node Label Edit Part Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base External Node Label Edit Part Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base External Node Label Edit Part Class Name</em>' attribute.
	 * @see #setBaseExternalNodeLabelEditPartClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_BaseExternalNodeLabelEditPartClassName()
	 * @model
	 * @generated
	 */
	String getBaseExternalNodeLabelEditPartClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getBaseExternalNodeLabelEditPartClassName <em>Base External Node Label Edit Part Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base External Node Label Edit Part Class Name</em>' attribute.
	 * @see #getBaseExternalNodeLabelEditPartClassName()
	 * @generated
	 */
	void setBaseExternalNodeLabelEditPartClassName(String value);

	/**
	 * Returns the value of the '<em><b>Base Item Semantic Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Item Semantic Edit Policy Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Item Semantic Edit Policy Class Name</em>' attribute.
	 * @see #setBaseItemSemanticEditPolicyClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_BaseItemSemanticEditPolicyClassName()
	 * @model
	 * @generated
	 */
	String getBaseItemSemanticEditPolicyClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getBaseItemSemanticEditPolicyClassName <em>Base Item Semantic Edit Policy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Item Semantic Edit Policy Class Name</em>' attribute.
	 * @see #getBaseItemSemanticEditPolicyClassName()
	 * @generated
	 */
	void setBaseItemSemanticEditPolicyClassName(String value);

	/**
	 * Returns the value of the '<em><b>Base Graphical Node Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Graphical Node Edit Policy Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Graphical Node Edit Policy Class Name</em>' attribute.
	 * @see #setBaseGraphicalNodeEditPolicyClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_BaseGraphicalNodeEditPolicyClassName()
	 * @model
	 * @generated
	 */
	String getBaseGraphicalNodeEditPolicyClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getBaseGraphicalNodeEditPolicyClassName <em>Base Graphical Node Edit Policy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Graphical Node Edit Policy Class Name</em>' attribute.
	 * @see #getBaseGraphicalNodeEditPolicyClassName()
	 * @generated
	 */
	void setBaseGraphicalNodeEditPolicyClassName(String value);

	/**
	 * Returns the value of the '<em><b>Reference Connection Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Connection Edit Policy Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Connection Edit Policy Class Name</em>' attribute.
	 * @see #setReferenceConnectionEditPolicyClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_ReferenceConnectionEditPolicyClassName()
	 * @model
	 * @generated
	 */
	String getReferenceConnectionEditPolicyClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getReferenceConnectionEditPolicyClassName <em>Reference Connection Edit Policy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Connection Edit Policy Class Name</em>' attribute.
	 * @see #getReferenceConnectionEditPolicyClassName()
	 * @generated
	 */
	void setReferenceConnectionEditPolicyClassName(String value);

	/**
	 * Returns the value of the '<em><b>Canonical Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Canonical Edit Policy Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Canonical Edit Policy Class Name</em>' attribute.
	 * @see #setCanonicalEditPolicyClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_CanonicalEditPolicyClassName()
	 * @model
	 * @generated
	 */
	String getCanonicalEditPolicyClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getCanonicalEditPolicyClassName <em>Canonical Edit Policy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canonical Edit Policy Class Name</em>' attribute.
	 * @see #getCanonicalEditPolicyClassName()
	 * @generated
	 */
	void setCanonicalEditPolicyClassName(String value);

	/**
	 * Returns the value of the '<em><b>Element Types Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Types Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Types Class Name</em>' attribute.
	 * @see #setElementTypesClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_ElementTypesClassName()
	 * @model
	 * @generated
	 */
	String getElementTypesClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getElementTypesClassName <em>Element Types Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Types Class Name</em>' attribute.
	 * @see #getElementTypesClassName()
	 * @generated
	 */
	void setElementTypesClassName(String value);

	/**
	 * Returns the value of the '<em><b>Semantic Hints Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic Hints Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Hints Class Name</em>' attribute.
	 * @see #setSemanticHintsClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_SemanticHintsClassName()
	 * @model
	 * @generated
	 */
	String getSemanticHintsClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getSemanticHintsClassName <em>Semantic Hints Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Hints Class Name</em>' attribute.
	 * @see #getSemanticHintsClassName()
	 * @generated
	 */
	void setSemanticHintsClassName(String value);

	/**
	 * Returns the value of the '<em><b>Notation View Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notation View Provider Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notation View Provider Class Name</em>' attribute.
	 * @see #setNotationViewProviderClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_NotationViewProviderClassName()
	 * @model
	 * @generated
	 */
	String getNotationViewProviderClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getNotationViewProviderClassName <em>Notation View Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notation View Provider Class Name</em>' attribute.
	 * @see #getNotationViewProviderClassName()
	 * @generated
	 */
	void setNotationViewProviderClassName(String value);

	/**
	 * Returns the value of the '<em><b>Diagram File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram File Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram File Extension</em>' attribute.
	 * @see #setDiagramFileExtension(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_DiagramFileExtension()
	 * @model
	 * @generated
	 */
	String getDiagramFileExtension();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getDiagramFileExtension <em>Diagram File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram File Extension</em>' attribute.
	 * @see #getDiagramFileExtension()
	 * @generated
	 */
	void setDiagramFileExtension(String value);

	/**
	 * Returns the value of the '<em><b>Reorient Connection View Command Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reorient Connection View Command Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reorient Connection View Command Class Name</em>' attribute.
	 * @see #setReorientConnectionViewCommandClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_ReorientConnectionViewCommandClassName()
	 * @model
	 * @generated
	 */
	String getReorientConnectionViewCommandClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getReorientConnectionViewCommandClassName <em>Reorient Connection View Command Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reorient Connection View Command Class Name</em>' attribute.
	 * @see #getReorientConnectionViewCommandClassName()
	 * @generated
	 */
	void setReorientConnectionViewCommandClassName(String value);

	/**
	 * Returns the value of the '<em><b>Same File For Diagram And Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specified whether editor should create separate file for domain elements if diagram file references no domain model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Same File For Diagram And Model</em>' attribute.
	 * @see #setSameFileForDiagramAndModel(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_SameFileForDiagramAndModel()
	 * @model
	 * @generated
	 */
	boolean isSameFileForDiagramAndModel();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#isSameFileForDiagramAndModel <em>Same File For Diagram And Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Same File For Diagram And Model</em>' attribute.
	 * @see #isSameFileForDiagramAndModel()
	 * @generated
	 */
	void setSameFileForDiagramAndModel(boolean value);

	/**
	 * Returns the value of the '<em><b>Printing Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Printing Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Printing Enabled</em>' attribute.
	 * @see #setPrintingEnabled(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_PrintingEnabled()
	 * @model
	 * @generated
	 */
	boolean isPrintingEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#isPrintingEnabled <em>Printing Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Printing Enabled</em>' attribute.
	 * @see #isPrintingEnabled()
	 * @generated
	 */
	void setPrintingEnabled(boolean value);

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
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_InitDiagramFileActionClassName()
	 * @model
	 * @generated
	 */
	String getInitDiagramFileActionClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getInitDiagramFileActionClassName <em>Init Diagram File Action Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Diagram File Action Class Name</em>' attribute.
	 * @see #getInitDiagramFileActionClassName()
	 * @generated
	 */
	void setInitDiagramFileActionClassName(String value);

	/**
	 * Returns the value of the '<em><b>Action Bar Contributor Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Bar Contributor Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Bar Contributor Class Name</em>' attribute.
	 * @see #setActionBarContributorClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_ActionBarContributorClassName()
	 * @model
	 * @generated
	 */
	String getActionBarContributorClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getActionBarContributorClassName <em>Action Bar Contributor Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Bar Contributor Class Name</em>' attribute.
	 * @see #getActionBarContributorClassName()
	 * @generated
	 */
	void setActionBarContributorClassName(String value);

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
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_CreationWizardClassName()
	 * @model
	 * @generated
	 */
	String getCreationWizardClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getCreationWizardClassName <em>Creation Wizard Class Name</em>}' attribute.
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
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_CreationWizardPageClassName()
	 * @model
	 * @generated
	 */
	String getCreationWizardPageClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getCreationWizardPageClassName <em>Creation Wizard Page Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Wizard Page Class Name</em>' attribute.
	 * @see #getCreationWizardPageClassName()
	 * @generated
	 */
	void setCreationWizardPageClassName(String value);

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
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_DiagramEditorUtilClassName()
	 * @model
	 * @generated
	 */
	String getDiagramEditorUtilClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getDiagramEditorUtilClassName <em>Diagram Editor Util Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Editor Util Class Name</em>' attribute.
	 * @see #getDiagramEditorUtilClassName()
	 * @generated
	 */
	void setDiagramEditorUtilClassName(String value);

	/**
	 * Returns the value of the '<em><b>Diagram File Creator Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram File Creator Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram File Creator Class Name</em>' attribute.
	 * @see #setDiagramFileCreatorClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_DiagramFileCreatorClassName()
	 * @model
	 * @generated
	 */
	String getDiagramFileCreatorClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getDiagramFileCreatorClassName <em>Diagram File Creator Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram File Creator Class Name</em>' attribute.
	 * @see #getDiagramFileCreatorClassName()
	 * @generated
	 */
	void setDiagramFileCreatorClassName(String value);

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
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_MatchingStrategyClassName()
	 * @model
	 * @generated
	 */
	String getMatchingStrategyClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getMatchingStrategyClassName <em>Matching Strategy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matching Strategy Class Name</em>' attribute.
	 * @see #getMatchingStrategyClassName()
	 * @generated
	 */
	void setMatchingStrategyClassName(String value);

	/**
	 * Returns the value of the '<em><b>Edit Part Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit Part Provider Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Part Provider Class Name</em>' attribute.
	 * @see #setEditPartProviderClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_EditPartProviderClassName()
	 * @model
	 * @generated
	 */
	String getEditPartProviderClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditPartProviderClassName <em>Edit Part Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Part Provider Class Name</em>' attribute.
	 * @see #getEditPartProviderClassName()
	 * @generated
	 */
	void setEditPartProviderClassName(String value);

	/**
	 * Returns the value of the '<em><b>Metamodel Support Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel Support Provider Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel Support Provider Class Name</em>' attribute.
	 * @see #setMetamodelSupportProviderClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_MetamodelSupportProviderClassName()
	 * @model
	 * @generated
	 */
	String getMetamodelSupportProviderClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getMetamodelSupportProviderClassName <em>Metamodel Support Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel Support Provider Class Name</em>' attribute.
	 * @see #getMetamodelSupportProviderClassName()
	 * @generated
	 */
	void setMetamodelSupportProviderClassName(String value);

	/**
	 * Returns the value of the '<em><b>Modeling Assistant Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modeling Assistant Provider Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modeling Assistant Provider Class Name</em>' attribute.
	 * @see #setModelingAssistantProviderClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_ModelingAssistantProviderClassName()
	 * @model
	 * @generated
	 */
	String getModelingAssistantProviderClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getModelingAssistantProviderClassName <em>Modeling Assistant Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modeling Assistant Provider Class Name</em>' attribute.
	 * @see #getModelingAssistantProviderClassName()
	 * @generated
	 */
	void setModelingAssistantProviderClassName(String value);

	/**
	 * Returns the value of the '<em><b>Property Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Provider Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Provider Class Name</em>' attribute.
	 * @see #setPropertyProviderClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_PropertyProviderClassName()
	 * @model
	 * @generated
	 */
	String getPropertyProviderClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPropertyProviderClassName <em>Property Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Provider Class Name</em>' attribute.
	 * @see #getPropertyProviderClassName()
	 * @generated
	 */
	void setPropertyProviderClassName(String value);

	/**
	 * Returns the value of the '<em><b>Icon Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon Provider Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Provider Class Name</em>' attribute.
	 * @see #setIconProviderClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_IconProviderClassName()
	 * @model
	 * @generated
	 */
	String getIconProviderClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getIconProviderClassName <em>Icon Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Provider Class Name</em>' attribute.
	 * @see #getIconProviderClassName()
	 * @generated
	 */
	void setIconProviderClassName(String value);

	/**
	 * Returns the value of the '<em><b>Structural Feature Parser Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structural Feature Parser Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural Feature Parser Class Name</em>' attribute.
	 * @see #setStructuralFeatureParserClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_StructuralFeatureParserClassName()
	 * @model
	 * @generated
	 */
	String getStructuralFeatureParserClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getStructuralFeatureParserClassName <em>Structural Feature Parser Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Feature Parser Class Name</em>' attribute.
	 * @see #getStructuralFeatureParserClassName()
	 * @generated
	 */
	void setStructuralFeatureParserClassName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * == domainMetaModel.getGenModel()
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	GenModel getEMFGenModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="org.eclipse.gmf.codegen.gmfgen.GenNode"
	 * @generated
	 */
	EList getAllNodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="org.eclipse.gmf.codegen.gmfgen.GenChildContainer"
	 * @generated
	 */
	EList getAllChildContainers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="org.eclipse.gmf.codegen.gmfgen.GenContainerEditPart"
	 * @generated
	 */
	EList getAllContainerEditParts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getPluginQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getPreferenceInitializerQualifiedClassName();

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
	String getCreateShortcutActionQualifiedClassName();

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
	 * @model
	 * @generated
	 */
	boolean generateCreateShortcutAction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean generateShortcutIcon();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether this diagram contains link creation constraints or not
	 * <!-- end-model-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean hasLinkCreationConstraints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets the name of the constraints holder class
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getLinkCreationConstraintsClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets the qualified name of the constraints holder class
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getLinkCreationConstraintsQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getEditorQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getEditPartFactoryQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getBaseExternalNodeLabelEditPartQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getBaseItemSemanticEditPolicyQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getBaseGraphicalNodeEditPolicyQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getReferenceConnectionEditPolicyQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getCanonicalEditPolicyQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getElementTypesQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getSemanticHintsQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getNotationViewProviderQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computed additional dependencies of generated plug-in
	 * <!-- end-model-doc -->
	 * @model kind="operation" type="java.lang.String"
	 * @generated
	 */
	EList getRequiredPluginIDs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getInitDiagramFileActionQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets the name of the class to hold the initializer methods for domain elements
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getElementInitializersClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets the name of the package to hold the element initializers class
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getElementInitializersPackageName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getReorientConnectionViewCommandQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getEditPartProviderQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getMetamodelSupportProviderQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getModelingAssistantProviderQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getPropertyProviderQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getIconProviderQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getStructuralFeatureParserQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getActionBarContributorQualifiedClassName();

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
	String getDiagramFileCreatorQualifiedClassName();

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
	 * @generated
	 */
	String getMatchingStrategyQualifiedClassName();

} // GenDiagram

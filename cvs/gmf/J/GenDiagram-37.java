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
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPlugin <em>Plugin</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#isSameFileForDiagramAndModel <em>Same File For Diagram And Model</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getDiagramFileExtension <em>Diagram File Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram()
 * @model annotation="http://www.eclipse.org/gmf/2005/constraints ocl='nodes->forAll(n : GenNode | self.links->forAll(l : GenLink | l.oclAsType(TypeLinkModelFacet).metaClass <> n.getDomainMetaClass()))'"
 * @generated
 */
public interface GenDiagram extends GenContainerBase, PackageNames, ProviderClassNames, LinkConstraints, EditPartCandies, EditorCandies, Shortcuts, BatchValidation {
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
	 *        annotation="http://www.eclipse.org/gmf/2006/deprecated documentation='Don\'t use it as it\'s misleading in case of domain model classes residing in several packages'"
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
	 * Returns the value of the '<em><b>Plugin</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenPlugin#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin</em>' containment reference.
	 * @see #setPlugin(GenPlugin)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_Plugin()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenPlugin#getDiagram
	 * @model opposite="diagram" containment="true" required="true"
	 * @generated
	 */
	GenPlugin getPlugin();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPlugin <em>Plugin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin</em>' containment reference.
	 * @see #getPlugin()
	 * @generated
	 */
	void setPlugin(GenPlugin value);

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
	 * @model kind="operation" type="org.eclipse.gmf.codegen.gmfgen.GenContainerBase"
	 * @generated
	 */
	EList getAllContainers();

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

} // GenDiagram

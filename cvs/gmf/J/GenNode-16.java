/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EClass mapped to Node
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getModelFacet <em>Model Facet</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getChildContainersPlacement <em>Child Containers Placement</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNode#isExplicitContentPane <em>Explicit Content Pane</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getGraphicalNodeEditPolicyClassName <em>Graphical Node Edit Policy Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNode()
 * @model annotation="http://www.eclipse.org/gmf/2005/constraints ocl='let c: ecore::EClass = diagramRunTimeClass.ecoreClass.oclAsType(ecore::EClass) in c = notation::Node or c.eAllSuperTypes->includes(notation::Node)'"
 * @generated
 */
public interface GenNode extends GenChildContainer {
	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNode_Diagram()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getNodes
	 * @model opposite="nodes" required="true" changeable="false"
	 * @generated
	 */
	GenDiagram getDiagram();

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Meta Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delegates to modelFacet
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	GenClass getDomainMetaClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getGraphicalNodeEditPolicyQualifiedClassName();

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenNodeLabel}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenNodeLabel#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNode_Labels()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNodeLabel#getNode
	 * @model type="org.eclipse.gmf.codegen.gmfgen.GenNodeLabel" opposite="node" containment="true"
	 * @generated
	 */
	EList getLabels();

	/**
	 * Returns the value of the '<em><b>Compartments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenCompartment}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenCompartment#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartments</em>' containment reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNode_Compartments()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenCompartment#getNode
	 * @model type="org.eclipse.gmf.codegen.gmfgen.GenCompartment" opposite="node" containment="true"
	 * @generated
	 */
	EList getCompartments();

	/**
	 * Returns the value of the '<em><b>Child Containers Placement</b></em>' attribute.
	 * The default value is <code>"TOOLBAR"</code>.
	 * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.CompartmentPlacementKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * valid only when there are compartments
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Child Containers Placement</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.CompartmentPlacementKind
	 * @see #setChildContainersPlacement(CompartmentPlacementKind)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNode_ChildContainersPlacement()
	 * @model default="TOOLBAR"
	 * @generated
	 */
	CompartmentPlacementKind getChildContainersPlacement();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getChildContainersPlacement <em>Child Containers Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Containers Placement</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.CompartmentPlacementKind
	 * @see #getChildContainersPlacement()
	 * @generated
	 */
	void setChildContainersPlacement(CompartmentPlacementKind value);

	/**
	 * Returns the value of the '<em><b>Explicit Content Pane</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Add distinct figure to the node shape that will be used as a content pane
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Explicit Content Pane</em>' attribute.
	 * @see #setExplicitContentPane(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNode_ExplicitContentPane()
	 * @model annotation="http://www.eclipse.org/gmf/2006/deprecated documentation='Obsolete with new gmfgraph. Should be removed form the model.'"
	 * @generated
	 */
	boolean isExplicitContentPane();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenNode#isExplicitContentPane <em>Explicit Content Pane</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explicit Content Pane</em>' attribute.
	 * @see #isExplicitContentPane()
	 * @generated
	 */
	void setExplicitContentPane(boolean value);

	/**
	 * Returns the value of the '<em><b>Graphical Node Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graphical Node Edit Policy Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphical Node Edit Policy Class Name</em>' attribute.
	 * @see #setGraphicalNodeEditPolicyClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNode_GraphicalNodeEditPolicyClassName()
	 * @model
	 * @generated
	 */
	String getGraphicalNodeEditPolicyClassName();

	public static final String GRAPHICAL_NODE_EDIT_POLICY_SUFFIX = "GraphicalNodeEditPolicy";

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getGraphicalNodeEditPolicyClassName <em>Graphical Node Edit Policy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphical Node Edit Policy Class Name</em>' attribute.
	 * @see #getGraphicalNodeEditPolicyClassName()
	 * @generated
	 */
	void setGraphicalNodeEditPolicyClassName(String value);

	/**
	 * Returns the value of the '<em><b>Model Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Facet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Facet</em>' containment reference.
	 * @see #setModelFacet(TypeModelFacet)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNode_ModelFacet()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeModelFacet getModelFacet();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getModelFacet <em>Model Facet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Facet</em>' containment reference.
	 * @see #getModelFacet()
	 * @generated
	 */
	void setModelFacet(TypeModelFacet value);

} // GenNode

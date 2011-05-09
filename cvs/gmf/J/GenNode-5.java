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
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getDomainMetaClass <em>Domain Meta Class</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getChildContainers <em>Child Containers</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getChildNodes <em>Child Nodes</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getChildContainersPlacement <em>Child Containers Placement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNode()
 * @model annotation="http://www.eclipse.org/gmf/2005/constraints ocl='super.domainNameFeature.eClass == domainMetaClass'"
 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='diagramRunTimeClass.eCoreClass.eAllSuperTypes->includes(diagramrt.DiagramNode)'"
 * @generated
 */
public interface GenNode extends GenBaseElement{
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
	 * Returns the value of the '<em><b>Domain Meta Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Meta Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Meta Class</em>' reference.
	 * @see #setDomainMetaClass(GenClass)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNode_DomainMetaClass()
	 * @model required="true"
	 * @generated
	 */
	GenClass getDomainMetaClass();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getDomainMetaClass <em>Domain Meta Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Meta Class</em>' reference.
	 * @see #getDomainMetaClass()
	 * @generated
	 */
	void setDomainMetaClass(GenClass value);

	/**
	 * Returns the value of the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Color</em>' attribute.
	 * @see #setBackgroundColor(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNode_BackgroundColor()
	 * @model
	 * @generated
	 */
	String getBackgroundColor();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getBackgroundColor <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Color</em>' attribute.
	 * @see #getBackgroundColor()
	 * @generated
	 */
	void setBackgroundColor(String value);

	/**
	 * Returns the value of the '<em><b>Child Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Containers</em>' containment reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNode_ChildContainers()
	 * @model type="org.eclipse.gmf.codegen.gmfgen.GenChildContainer" containment="true"
	 * @generated
	 */
	EList getChildContainers();

	/**
	 * Returns the value of the '<em><b>Child Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenChildNode}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenChildNode#getParentNode <em>Parent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Nodes</em>' containment reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNode_ChildNodes()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildNode#getParentNode
	 * @model type="org.eclipse.gmf.codegen.gmfgen.GenChildNode" opposite="parentNode" containment="true"
	 * @generated
	 */
	EList getChildNodes();

	/**
	 * Returns the value of the '<em><b>Child Containers Placement</b></em>' attribute.
	 * The default value is <code>"TOOLBAR"</code>.
	 * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.CompartmentPlacementKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * valid only when there are childContainers
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

} // GenNode

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;


import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Child Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenChildNode#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenChildNode#getContainers <em>Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenChildNode()
 * @model annotation="http://www.eclipse.org/gmf/2005/constraints ocl='not modelFacet.oclIsUndefined() implies not modelFacet.containmentMetaFeature.oclIsUndefined()' description='Child node must specify \'Containment Meta Feature\''"
 * @generated
 */
public interface GenChildNode extends GenNode {
	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getChildNodes <em>Child Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenChildNode_Diagram()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getChildNodes
	 * @model opposite="childNodes" resolveProxies="false" required="true" transient="false" changeable="false"
	 * @generated
	 */
	GenDiagram getDiagram();

	/**
	 * Returns the value of the '<em><b>Containers</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#getChildNodes <em>Child Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenChildNode_Containers()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildContainer#getChildNodes
	 * @model opposite="childNodes" changeable="false"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='let cmps:OrderedSet(GenChildContainer)=containers->select(oclIsKindOf(GenCompartment)) in cmps->exists(oclAsType(GenCompartment).listLayout) implies not cmps->exists(not oclAsType(GenCompartment).listLayout)' description='Node is referenced from multiple containers with different \'List Layout\' value'"
	 * @generated
	 */
	EList<GenChildContainer> getContainers();

} // GenChildNode

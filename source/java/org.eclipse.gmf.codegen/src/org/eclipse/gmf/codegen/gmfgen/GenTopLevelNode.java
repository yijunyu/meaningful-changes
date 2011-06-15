/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Top Level Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenTopLevelNode#getDiagram <em>Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenTopLevelNode()
 * @model annotation="http://www.eclipse.org/gmf/2005/constraints ocl='not modelFacet.containmentMetaFeature.oclIsUndefined() implies modelFacet.containmentMetaFeature.genClass.ecoreClass.isSuperTypeOf(diagram.domainDiagramElement.ecoreClass)' description='Top level node \'Containment Feature\' must be available in the diagram \'Domain Element\' or its super-class'"
 * @generated
 */
public interface GenTopLevelNode extends GenNode {
	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getTopLevelNodes <em>Top Level Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenTopLevelNode_Diagram()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getTopLevelNodes
	 * @model opposite="topLevelNodes" resolveProxies="false" required="true" transient="false" changeable="false"
	 * @generated
	 */
	GenDiagram getDiagram();

} // GenTopLevelNode

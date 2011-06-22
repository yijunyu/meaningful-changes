/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Node Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Label within node
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNodeLabel#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNodeLabel()
 * @model annotation="http://www.eclipse.org/gmf/2005/constraints ocl='getMetaFeatures()->forAll(f|f.ecoreFeature.eContainingClass.isSuperTypeOf(node.getDomainMetaClass().ecoreClass))' description='Node label meta features must be owned by the node \'Meta Class\' or its super-classes'"
 * @generated
 */
public interface GenNodeLabel extends GenLabel {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' container reference.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNodeLabel_Node()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNode#getLabels
	 * @model opposite="labels" resolveProxies="false" required="true" transient="false" changeable="false"
	 * @generated
	 */
	GenNode getNode();

} // GenNodeLabel

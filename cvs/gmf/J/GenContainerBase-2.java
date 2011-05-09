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
 * A representation of the model object '<em><b>Gen Container Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenContainerBase#getContainedNodes <em>Contained Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenContainerBase()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GenContainerBase extends GenCommonBase {
	/**
	 * Returns the value of the '<em><b>Contained Nodes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Nodes</em>' reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenContainerBase_ContainedNodes()
	 * @model type="org.eclipse.gmf.codegen.gmfgen.GenNode" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList getContainedNodes();

} // GenContainerBase

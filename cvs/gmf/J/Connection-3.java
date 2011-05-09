/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.Connection#getConnectionFigure <em>Connection Figure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Connection Figure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specializes DiagramElement.figure
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Figure</em>' reference.
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getConnection_ConnectionFigure()
	 * @model resolveProxies="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Figure getConnectionFigure();

} // Connection

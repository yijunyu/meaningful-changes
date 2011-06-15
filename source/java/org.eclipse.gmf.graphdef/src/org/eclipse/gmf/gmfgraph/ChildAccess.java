/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.ChildAccess#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.ChildAccess#getAccessor <em>Accessor</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.ChildAccess#getFigure <em>Figure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getChildAccess()
 * @model
 * @generated
 */
public interface ChildAccess extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.gmfgraph.FigureDescriptor#getAccessors <em>Accessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getChildAccess_Owner()
	 * @see org.eclipse.gmf.gmfgraph.FigureDescriptor#getAccessors
	 * @model opposite="accessors" resolveProxies="false" required="true" transient="false" changeable="false"
	 * @generated
	 */
	FigureDescriptor getOwner();

	/**
	 * Returns the value of the '<em><b>Accessor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessor</em>' attribute.
	 * @see #setAccessor(String)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getChildAccess_Accessor()
	 * @model
	 * @generated
	 */
	String getAccessor();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.ChildAccess#getAccessor <em>Accessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accessor</em>' attribute.
	 * @see #getAccessor()
	 * @generated
	 */
	void setAccessor(String value);

	/**
	 * Returns the value of the '<em><b>Figure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Figure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This may also point to RealFigure from FigureAccessor#typedFigure
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Figure</em>' reference.
	 * @see #setFigure(Figure)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getChildAccess_Figure()
	 * @model required="true"
	 * @generated
	 */
	Figure getFigure();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.ChildAccess#getFigure <em>Figure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Figure</em>' reference.
	 * @see #getFigure()
	 * @generated
	 */
	void setFigure(Figure value);

} // ChildAccess

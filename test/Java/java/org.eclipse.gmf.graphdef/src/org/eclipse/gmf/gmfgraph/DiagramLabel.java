/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.DiagramLabel#isElementIcon <em>Element Icon</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.DiagramLabel#getAccessor <em>Accessor</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.DiagramLabel#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.DiagramLabel#isExternal <em>External</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getDiagramLabel()
 * @model
 * @generated
 */
public interface DiagramLabel extends Node {
	/**
	 * Returns the value of the '<em><b>Element Icon</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Icon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Icon</em>' attribute.
	 * @see #setElementIcon(boolean)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getDiagramLabel_ElementIcon()
	 * @model default="true"
	 * @generated
	 */
	boolean isElementIcon();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.DiagramLabel#isElementIcon <em>Element Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Icon</em>' attribute.
	 * @see #isElementIcon()
	 * @generated
	 */
	void setElementIcon(boolean value);

	/**
	 * Returns the value of the '<em><b>Accessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessor</em>' reference.
	 * @see #setAccessor(ChildAccess)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getDiagramLabel_Accessor()
	 * @model
	 * @generated
	 */
	ChildAccess getAccessor();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.DiagramLabel#getAccessor <em>Accessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accessor</em>' reference.
	 * @see #getAccessor()
	 * @generated
	 */
	void setAccessor(ChildAccess value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(ChildAccess)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getDiagramLabel_Container()
	 * @model
	 * @generated
	 */
	ChildAccess getContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.DiagramLabel#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(ChildAccess value);

	/**
	 * Returns the value of the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External</em>' attribute.
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getDiagramLabel_External()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isExternal();

} // DiagramLabel

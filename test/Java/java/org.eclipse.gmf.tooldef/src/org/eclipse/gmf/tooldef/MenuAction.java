/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.tooldef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.tooldef.MenuAction#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.gmf.tooldef.MenuAction#getHotKey <em>Hot Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.tooldef.GMFToolPackage#getMenuAction()
 * @model
 * @generated
 */
public interface MenuAction extends ContributionItem {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.tooldef.ActionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.gmf.tooldef.ActionKind
	 * @see #setKind(ActionKind)
	 * @see org.eclipse.gmf.tooldef.GMFToolPackage#getMenuAction_Kind()
	 * @model
	 * @generated
	 */
	ActionKind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.tooldef.MenuAction#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.gmf.tooldef.ActionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ActionKind value);

	/**
	 * Returns the value of the '<em><b>Hot Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hot Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hot Key</em>' attribute.
	 * @see #setHotKey(String)
	 * @see org.eclipse.gmf.tooldef.GMFToolPackage#getMenuAction_HotKey()
	 * @model
	 * @generated
	 */
	String getHotKey();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.tooldef.MenuAction#getHotKey <em>Hot Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hot Key</em>' attribute.
	 * @see #getHotKey()
	 * @generated
	 */
	void setHotKey(String value);

} // MenuAction

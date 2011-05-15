/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Child Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Child container within node. Compartment, iow.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#getGroupID <em>Group ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#getTitleKey <em>Title Key</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#isCanCollapse <em>Can Collapse</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#isHideIfEmpty <em>Hide If Empty</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#isNeedsTitle <em>Needs Title</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#getLayoutKind <em>Layout Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenChildContainer()
 * @model
 * @generated
 */
public interface GenChildContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group ID</em>' attribute.
	 * @see #setGroupID(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenChildContainer_GroupID()
	 * @model
	 * @generated
	 */
	String getGroupID();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#getGroupID <em>Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group ID</em>' attribute.
	 * @see #getGroupID()
	 * @generated
	 */
	void setGroupID(String value);

	/**
	 * Returns the value of the '<em><b>Title Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Key</em>' attribute.
	 * @see #setTitleKey(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenChildContainer_TitleKey()
	 * @model
	 * @generated
	 */
	String getTitleKey();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#getTitleKey <em>Title Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Key</em>' attribute.
	 * @see #getTitleKey()
	 * @generated
	 */
	void setTitleKey(String value);

	/**
	 * Returns the value of the '<em><b>Can Collapse</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Collapse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Collapse</em>' attribute.
	 * @see #setCanCollapse(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenChildContainer_CanCollapse()
	 * @model default="true"
	 * @generated
	 */
	boolean isCanCollapse();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#isCanCollapse <em>Can Collapse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Collapse</em>' attribute.
	 * @see #isCanCollapse()
	 * @generated
	 */
	void setCanCollapse(boolean value);

	/**
	 * Returns the value of the '<em><b>Hide If Empty</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hide If Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide If Empty</em>' attribute.
	 * @see #setHideIfEmpty(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenChildContainer_HideIfEmpty()
	 * @model default="true"
	 * @generated
	 */
	boolean isHideIfEmpty();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#isHideIfEmpty <em>Hide If Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hide If Empty</em>' attribute.
	 * @see #isHideIfEmpty()
	 * @generated
	 */
	void setHideIfEmpty(boolean value);

	/**
	 * Returns the value of the '<em><b>Needs Title</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needs Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs Title</em>' attribute.
	 * @see #setNeedsTitle(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenChildContainer_NeedsTitle()
	 * @model default="true"
	 * @generated
	 */
	boolean isNeedsTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#isNeedsTitle <em>Needs Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs Title</em>' attribute.
	 * @see #isNeedsTitle()
	 * @generated
	 */
	void setNeedsTitle(boolean value);

	/**
	 * Returns the value of the '<em><b>Layout Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.CompartmentLayoutKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Kind</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.CompartmentLayoutKind
	 * @see #setLayoutKind(CompartmentLayoutKind)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenChildContainer_LayoutKind()
	 * @model
	 * @generated
	 */
	CompartmentLayoutKind getLayoutKind();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#getLayoutKind <em>Layout Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Kind</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.CompartmentLayoutKind
	 * @see #getLayoutKind()
	 * @generated
	 */
	void setLayoutKind(CompartmentLayoutKind value);

} // GenChildContainer
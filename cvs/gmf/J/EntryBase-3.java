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
 * A representation of the model object '<em><b>Entry Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.EntryBase#getOrder <em>Order</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.EntryBase#getTitleKey <em>Title Key</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.EntryBase#getDescriptionKey <em>Description Key</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.EntryBase#getLargeIconPath <em>Large Icon Path</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.EntryBase#getSmallIconPath <em>Small Icon Path</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.EntryBase#getCreateMethodName <em>Create Method Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getEntryBase()
 * @model abstract="true"
 * @generated
 */
public interface EntryBase extends EObject{
	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getEntryBase_Order()
	 * @model
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.EntryBase#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

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
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getEntryBase_TitleKey()
	 * @model
	 * @generated
	 */
	String getTitleKey();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.EntryBase#getTitleKey <em>Title Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Key</em>' attribute.
	 * @see #getTitleKey()
	 * @generated
	 */
	void setTitleKey(String value);

	/**
	 * Returns the value of the '<em><b>Description Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Key</em>' attribute.
	 * @see #setDescriptionKey(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getEntryBase_DescriptionKey()
	 * @model
	 * @generated
	 */
	String getDescriptionKey();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.EntryBase#getDescriptionKey <em>Description Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Key</em>' attribute.
	 * @see #getDescriptionKey()
	 * @generated
	 */
	void setDescriptionKey(String value);

	/**
	 * Returns the value of the '<em><b>Large Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Large Icon Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Large Icon Path</em>' attribute.
	 * @see #setLargeIconPath(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getEntryBase_LargeIconPath()
	 * @model
	 * @generated
	 */
	String getLargeIconPath();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.EntryBase#getLargeIconPath <em>Large Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Large Icon Path</em>' attribute.
	 * @see #getLargeIconPath()
	 * @generated
	 */
	void setLargeIconPath(String value);

	/**
	 * Returns the value of the '<em><b>Small Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Small Icon Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Small Icon Path</em>' attribute.
	 * @see #setSmallIconPath(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getEntryBase_SmallIconPath()
	 * @model
	 * @generated
	 */
	String getSmallIconPath();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.EntryBase#getSmallIconPath <em>Small Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Small Icon Path</em>' attribute.
	 * @see #getSmallIconPath()
	 * @generated
	 */
	void setSmallIconPath(String value);

	/**
	 * Returns the value of the '<em><b>Create Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Method Name</em>' attribute.
	 * @see #setCreateMethodName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getEntryBase_CreateMethodName()
	 * @model
	 * @generated
	 */
	String getCreateMethodName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.EntryBase#getCreateMethodName <em>Create Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Method Name</em>' attribute.
	 * @see #getCreateMethodName()
	 * @generated
	 */
	void setCreateMethodName(String value);

} // EntryBase

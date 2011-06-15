/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Navigator Child Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getNavigator <em>Navigator</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getChild <em>Child</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getReferenceType <em>Reference Type</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getGroupIcon <em>Group Icon</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#isHideIfEmpty <em>Hide If Empty</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigatorChildReference()
 * @model
 * @generated
 */
public interface GenNavigatorChildReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Navigator</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getChildReferences <em>Child References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigator</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigator</em>' container reference.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigatorChildReference_Navigator()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNavigator#getChildReferences
	 * @model opposite="childReferences" resolveProxies="false" transient="false" changeable="false"
	 * @generated
	 */
	GenNavigator getNavigator();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(GenCommonBase)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigatorChildReference_Parent()
	 * @model
	 * @generated
	 */
	GenCommonBase getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(GenCommonBase value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #setChild(GenCommonBase)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigatorChildReference_Child()
	 * @model required="true"
	 * @generated
	 */
	GenCommonBase getChild();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getChild <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(GenCommonBase value);

	/**
	 * Returns the value of the '<em><b>Reference Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorReferenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Type</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNavigatorReferenceType
	 * @see #setReferenceType(GenNavigatorReferenceType)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigatorChildReference_ReferenceType()
	 * @model required="true"
	 * @generated
	 */
	GenNavigatorReferenceType getReferenceType();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getReferenceType <em>Reference Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Type</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNavigatorReferenceType
	 * @see #getReferenceType()
	 * @generated
	 */
	void setReferenceType(GenNavigatorReferenceType value);

	/**
	 * Returns the value of the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Name</em>' attribute.
	 * @see #setGroupName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigatorChildReference_GroupName()
	 * @model
	 * @generated
	 */
	String getGroupName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getGroupName <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Name</em>' attribute.
	 * @see #getGroupName()
	 * @generated
	 */
	void setGroupName(String value);

	/**
	 * Returns the value of the '<em><b>Group Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Icon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Icon</em>' attribute.
	 * @see #setGroupIcon(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigatorChildReference_GroupIcon()
	 * @model
	 * @generated
	 */
	String getGroupIcon();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getGroupIcon <em>Group Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Icon</em>' attribute.
	 * @see #getGroupIcon()
	 * @generated
	 */
	void setGroupIcon(String value);

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
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigatorChildReference_HideIfEmpty()
	 * @model default="true"
	 * @generated
	 */
	boolean isHideIfEmpty();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#isHideIfEmpty <em>Hide If Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hide If Empty</em>' attribute.
	 * @see #isHideIfEmpty()
	 * @generated
	 */
	void setHideIfEmpty(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isInsideGroup();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<GenNavigatorPath> findConnectionPaths();

} // GenNavigatorChildReference
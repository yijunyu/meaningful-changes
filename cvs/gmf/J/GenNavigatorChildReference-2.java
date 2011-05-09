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
 * A representation of the model object '<em><b>Gen Navigator Child Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getChild <em>Child</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getReferenceType <em>Reference Type</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getGroupIcon <em>Group Icon</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigatorChildReference()
 * @model
 * @generated
 */
public interface GenNavigatorChildReference extends EObject {
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
	 * Returns the value of the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' reference.
	 * @see #setLabel(GenLabel)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigatorChildReference_Label()
	 * @model
	 * @generated
	 */
	GenLabel getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getLabel <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(GenLabel value);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isInsideGroup();

} // GenNavigatorChildReference
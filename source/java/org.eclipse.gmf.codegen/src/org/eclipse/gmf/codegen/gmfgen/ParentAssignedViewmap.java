/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parent Assigned Viewmap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Figure (with specified class name, if any) will be assigned by (or should be taken from) parent
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ParentAssignedViewmap#getGetterName <em>Getter Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ParentAssignedViewmap#getSetterName <em>Setter Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ParentAssignedViewmap#getFigureQualifiedClassName <em>Figure Qualified Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getParentAssignedViewmap()
 * @model
 * @generated
 */
public interface ParentAssignedViewmap extends Viewmap {
	/**
	 * Returns the value of the '<em><b>Getter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Access figure from parent's figure
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Getter Name</em>' attribute.
	 * @see #setGetterName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getParentAssignedViewmap_GetterName()
	 * @model required="true"
	 * @generated
	 */
	String getGetterName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.ParentAssignedViewmap#getGetterName <em>Getter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Getter Name</em>' attribute.
	 * @see #getGetterName()
	 * @generated
	 */
	void setGetterName(String value);

	/**
	 * Returns the value of the '<em><b>Setter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Child could provide typed alternative to setFigure() method
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Setter Name</em>' attribute.
	 * @see #setSetterName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getParentAssignedViewmap_SetterName()
	 * @model
	 * @generated
	 */
	String getSetterName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.ParentAssignedViewmap#getSetterName <em>Setter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setter Name</em>' attribute.
	 * @see #getSetterName()
	 * @generated
	 */
	void setSetterName(String value);

	/**
	 * Returns the value of the '<em><b>Figure Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When specified, type of child's figure
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Figure Qualified Class Name</em>' attribute.
	 * @see #setFigureQualifiedClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getParentAssignedViewmap_FigureQualifiedClassName()
	 * @model
	 * @generated
	 */
	String getFigureQualifiedClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.ParentAssignedViewmap#getFigureQualifiedClassName <em>Figure Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Figure Qualified Class Name</em>' attribute.
	 * @see #getFigureQualifiedClassName()
	 * @generated
	 */
	void setFigureQualifiedClassName(String value);

} // ParentAssignedViewmap
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
 * A representation of the model object '<em><b>Resize Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bit-wise OR of any {@link org.eclipse.draw2d.PositionConstants#NORTH}, {@link org.eclipse.draw2d.PositionConstants#SOUTH}, {@link org.eclipse.draw2d.PositionConstants#EAST} or {@link org.eclipse.draw2d.PositionConstants#WEST}
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ResizeConstraints#getResizeHandles <em>Resize Handles</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ResizeConstraints#getNonResizeHandles <em>Non Resize Handles</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ResizeConstraints#getResizeHandleNames <em>Resize Handle Names</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ResizeConstraints#getNonResizeHandleNames <em>Non Resize Handle Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getResizeConstraints()
 * @model
 * @generated
 */
public interface ResizeConstraints extends Attributes {
	/**
	 * Returns the value of the '<em><b>Resize Handles</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any direction mentioned here (and combination thereof, like e.g. NORTH_WEST) is added as resizable handle
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resize Handles</em>' attribute.
	 * @see #setResizeHandles(int)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getResizeConstraints_ResizeHandles()
	 * @model default="0"
	 * @generated
	 */
	int getResizeHandles();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.ResizeConstraints#getResizeHandles <em>Resize Handles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resize Handles</em>' attribute.
	 * @see #getResizeHandles()
	 * @generated
	 */
	void setResizeHandles(int value);

	/**
	 * Returns the value of the '<em><b>Non Resize Handles</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Directions mentioned with this attribute are explicitly denoted as non-resizable (i.e. with 'move' cursor). If you'd like to omit handle {@link org.eclipse.gef.editpolicies.ResizableEditPolicy#createSelectionHandles} completely, just don't list it here
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Non Resize Handles</em>' attribute.
	 * @see #setNonResizeHandles(int)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getResizeConstraints_NonResizeHandles()
	 * @model default="0"
	 * @generated
	 */
	int getNonResizeHandles();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.ResizeConstraints#getNonResizeHandles <em>Non Resize Handles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Resize Handles</em>' attribute.
	 * @see #getNonResizeHandles()
	 * @generated
	 */
	void setNonResizeHandles(int value);

	/**
	 * Returns the value of the '<em><b>Resize Handle Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Convenient method to get {@link org.eclipse.draw2d.PositionConstants} names from resizeHandle attribute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resize Handle Names</em>' attribute list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getResizeConstraints_ResizeHandleNames()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<String> getResizeHandleNames();

	/**
	 * Returns the value of the '<em><b>Non Resize Handle Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Same as {@link #getResizeHandleNames()}, for nonResizeHandle attribute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Non Resize Handle Names</em>' attribute list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getResizeConstraints_NonResizeHandleNames()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<String> getNonResizeHandleNames();

} // ResizeConstraints

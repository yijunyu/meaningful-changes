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
 * A representation of the model object '<em><b>Type Tab Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.TypeTabFilter#getTypes <em>Types</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.TypeTabFilter#getGeneratedTypes <em>Generated Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getTypeTabFilter()
 * @model
 * @generated
 */
public interface TypeTabFilter extends GenPropertyTabFilter {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fully-qualified class names for selection to match
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Types</em>' attribute list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getTypeTabFilter_Types()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getTypes();

	/**
	 * Returns the value of the '<em><b>Generated Types</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GeneratedType}.
	 * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.GeneratedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Types</em>' attribute list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GeneratedType
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getTypeTabFilter_GeneratedTypes()
	 * @model
	 * @generated
	 */
	EList<GeneratedType> getGeneratedTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	EList<String> getAllTypes();

} // TypeTabFilter
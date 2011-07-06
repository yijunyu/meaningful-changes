/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.StandardEntry#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getStandardEntry()
 * @model
 * @generated
 */
public interface StandardEntry extends AbstractToolEntry {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.StandardEntryKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.StandardEntryKind
	 * @see #setKind(StandardEntryKind)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getStandardEntry_Kind()
	 * @model required="true"
	 * @generated
	 */
	StandardEntryKind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.StandardEntry#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.StandardEntryKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(StandardEntryKind value);

} // StandardEntry
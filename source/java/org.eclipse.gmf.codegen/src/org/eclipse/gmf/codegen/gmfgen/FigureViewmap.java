/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Figure Viewmap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.FigureViewmap#getFigureQualifiedClassName <em>Figure Qualified Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getFigureViewmap()
 * @model
 * @generated
 */
public interface FigureViewmap extends Viewmap {
	/**
	 * Returns the value of the '<em><b>Figure Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of GEF Figure class
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Figure Qualified Class Name</em>' attribute.
	 * @see #setFigureQualifiedClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getFigureViewmap_FigureQualifiedClassName()
	 * @model required="true"
	 * @generated
	 */
	String getFigureQualifiedClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.FigureViewmap#getFigureQualifiedClassName <em>Figure Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Figure Qualified Class Name</em>' attribute.
	 * @see #getFigureQualifiedClassName()
	 * @generated
	 */
	void setFigureQualifiedClassName(String value);

} // FigureViewmap

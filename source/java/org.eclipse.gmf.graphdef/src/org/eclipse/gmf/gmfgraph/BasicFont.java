/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Font</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.BasicFont#getFaceName <em>Face Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.BasicFont#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.BasicFont#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getBasicFont()
 * @model
 * @generated
 */
public interface BasicFont extends Font {
	/**
	 * Returns the value of the '<em><b>Face Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Face Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Face Name</em>' attribute.
	 * @see #setFaceName(String)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getBasicFont_FaceName()
	 * @model
	 * @generated
	 */
	String getFaceName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.BasicFont#getFaceName <em>Face Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Face Name</em>' attribute.
	 * @see #getFaceName()
	 * @generated
	 */
	void setFaceName(String value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"9"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getBasicFont_Height()
	 * @model default="9"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.BasicFont#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * The default value is <code>"NORMAL"</code>.
	 * The literals are from the enumeration {@link org.eclipse.gmf.gmfgraph.FontStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see org.eclipse.gmf.gmfgraph.FontStyle
	 * @see #setStyle(FontStyle)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getBasicFont_Style()
	 * @model default="NORMAL"
	 * @generated
	 */
	FontStyle getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.BasicFont#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see org.eclipse.gmf.gmfgraph.FontStyle
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(FontStyle value);

} // BasicFont

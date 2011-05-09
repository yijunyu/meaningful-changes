/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Figure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * org.eclipse.draw2d.Figure
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.Figure#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.Figure#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.Figure#getColorStyle <em>Color Style</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.Figure#getSizeStyle <em>Size Style</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.Figure#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.Figure#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.Figure#getSize <em>Size</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.Figure#getLayoutManager <em>Layout Manager</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.Figure#getResolvedChildren <em>Resolved Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFigure()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Figure extends FigureMarker, Identity {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.gmfgraph.FigureMarker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFigure_Children()
	 * @model type="org.eclipse.gmf.gmfgraph.FigureMarker" containment="true"
	 * @generated
	 */
	EList getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.gmfgraph.Figure#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFigure_Parent()
	 * @see org.eclipse.gmf.gmfgraph.Figure#getChildren
	 * @model opposite="children" resolveProxies="false" changeable="false"
	 * @generated
	 */
	Figure getParent();

	/**
	 * Returns the value of the '<em><b>Color Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Style</em>' containment reference.
	 * @see #setColorStyle(ColorStyle)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFigure_ColorStyle()
	 * @model containment="true"
	 * @generated
	 */
	ColorStyle getColorStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.Figure#getColorStyle <em>Color Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Style</em>' containment reference.
	 * @see #getColorStyle()
	 * @generated
	 */
	void setColorStyle(ColorStyle value);

	/**
	 * Returns the value of the '<em><b>Size Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Style</em>' containment reference.
	 * @see #setSizeStyle(SizeStyle)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFigure_SizeStyle()
	 * @model containment="true"
	 * @generated
	 */
	SizeStyle getSizeStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.Figure#getSizeStyle <em>Size Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Style</em>' containment reference.
	 * @see #getSizeStyle()
	 * @generated
	 */
	void setSizeStyle(SizeStyle value);

	/**
	 * Returns the value of the '<em><b>Font Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Style</em>' containment reference.
	 * @see #setFontStyle(FontStyle)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFigure_FontStyle()
	 * @model containment="true"
	 * @generated
	 */
	FontStyle getFontStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.Figure#getFontStyle <em>Font Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Style</em>' containment reference.
	 * @see #getFontStyle()
	 * @generated
	 */
	void setFontStyle(FontStyle value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Point)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFigure_Location()
	 * @model containment="true"
	 * @generated
	 */
	Point getLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.Figure#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Point value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(Point)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFigure_Size()
	 * @model containment="true"
	 * @generated
	 */
	Point getSize();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.Figure#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Point value);

	/**
	 * Returns the value of the '<em><b>Layout Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Manager</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Manager</em>' attribute.
	 * @see #setLayoutManager(String)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFigure_LayoutManager()
	 * @model
	 * @generated
	 */
	String getLayoutManager();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.Figure#getLayoutManager <em>Layout Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Manager</em>' attribute.
	 * @see #getLayoutManager()
	 * @generated
	 */
	void setLayoutManager(String value);

	/**
	 * Returns the value of the '<em><b>Resolved Children</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.gmfgraph.Figure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved Children</em>' reference list.
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFigure_ResolvedChildren()
	 * @model type="org.eclipse.gmf.gmfgraph.Figure" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList getResolvedChildren();

} // Figure

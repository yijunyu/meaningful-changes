/**
 * <copyright>
 * </copyright>
 *
 * $Id: SVGProperty.java,v 1.1 2008/07/31 12:17:13 dstadnik Exp $
 */
package org.eclipse.gmf.gmfgraph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SVG Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.SVGProperty#getQuery <em>Query</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.SVGProperty#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.SVGProperty#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.SVGProperty#getGetter <em>Getter</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.SVGProperty#getSetter <em>Setter</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.SVGProperty#isCallSuper <em>Call Super</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getSVGProperty()
 * @model
 * @generated
 */
public interface SVGProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' attribute.
	 * @see #setQuery(String)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getSVGProperty_Query()
	 * @model
	 * @generated
	 */
	String getQuery();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.SVGProperty#getQuery <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' attribute.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(String value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' attribute.
	 * @see #setAttribute(String)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getSVGProperty_Attribute()
	 * @model
	 * @generated
	 */
	String getAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.SVGProperty#getAttribute <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' attribute.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.gmfgraph.SVGPropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.gmf.gmfgraph.SVGPropertyType
	 * @see #setType(SVGPropertyType)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getSVGProperty_Type()
	 * @model
	 * @generated
	 */
	SVGPropertyType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.SVGProperty#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.gmf.gmfgraph.SVGPropertyType
	 * @see #getType()
	 * @generated
	 */
	void setType(SVGPropertyType value);

	/**
	 * Returns the value of the '<em><b>Getter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Getter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Getter</em>' attribute.
	 * @see #setGetter(String)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getSVGProperty_Getter()
	 * @model
	 * @generated
	 */
	String getGetter();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.SVGProperty#getGetter <em>Getter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Getter</em>' attribute.
	 * @see #getGetter()
	 * @generated
	 */
	void setGetter(String value);

	/**
	 * Returns the value of the '<em><b>Setter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setter</em>' attribute.
	 * @see #setSetter(String)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getSVGProperty_Setter()
	 * @model
	 * @generated
	 */
	String getSetter();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.SVGProperty#getSetter <em>Setter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setter</em>' attribute.
	 * @see #getSetter()
	 * @generated
	 */
	void setSetter(String value);

	/**
	 * Returns the value of the '<em><b>Call Super</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Super</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Super</em>' attribute.
	 * @see #setCallSuper(boolean)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getSVGProperty_CallSuper()
	 * @model
	 * @generated
	 */
	boolean isCallSuper();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.SVGProperty#isCallSuper <em>Call Super</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Super</em>' attribute.
	 * @see #isCallSuper()
	 * @generated
	 */
	void setCallSuper(boolean value);

} // SVGProperty

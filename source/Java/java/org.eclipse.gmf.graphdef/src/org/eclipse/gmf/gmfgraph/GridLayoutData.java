/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid Layout Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.GridLayoutData#isGrabExcessHorizontalSpace <em>Grab Excess Horizontal Space</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.GridLayoutData#isGrabExcessVerticalSpace <em>Grab Excess Vertical Space</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.GridLayoutData#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.GridLayoutData#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.GridLayoutData#getVerticalSpan <em>Vertical Span</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.GridLayoutData#getHorizontalSpan <em>Horizontal Span</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.GridLayoutData#getHorizontalIndent <em>Horizontal Indent</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.GridLayoutData#getSizeHint <em>Size Hint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getGridLayoutData()
 * @model
 * @generated
 */
public interface GridLayoutData extends LayoutData {
	/**
	 * Returns the value of the '<em><b>Grab Excess Horizontal Space</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grab Excess Horizontal Space</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grab Excess Horizontal Space</em>' attribute.
	 * @see #setGrabExcessHorizontalSpace(boolean)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getGridLayoutData_GrabExcessHorizontalSpace()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isGrabExcessHorizontalSpace();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.GridLayoutData#isGrabExcessHorizontalSpace <em>Grab Excess Horizontal Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grab Excess Horizontal Space</em>' attribute.
	 * @see #isGrabExcessHorizontalSpace()
	 * @generated
	 */
	void setGrabExcessHorizontalSpace(boolean value);

	/**
	 * Returns the value of the '<em><b>Grab Excess Vertical Space</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grab Excess Vertical Space</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grab Excess Vertical Space</em>' attribute.
	 * @see #setGrabExcessVerticalSpace(boolean)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getGridLayoutData_GrabExcessVerticalSpace()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isGrabExcessVerticalSpace();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.GridLayoutData#isGrabExcessVerticalSpace <em>Grab Excess Vertical Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grab Excess Vertical Space</em>' attribute.
	 * @see #isGrabExcessVerticalSpace()
	 * @generated
	 */
	void setGrabExcessVerticalSpace(boolean value);

	/**
	 * Returns the value of the '<em><b>Vertical Alignment</b></em>' attribute.
	 * The default value is <code>"CENTER"</code>.
	 * The literals are from the enumeration {@link org.eclipse.gmf.gmfgraph.Alignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Alignment</em>' attribute.
	 * @see org.eclipse.gmf.gmfgraph.Alignment
	 * @see #setVerticalAlignment(Alignment)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getGridLayoutData_VerticalAlignment()
	 * @model default="CENTER" required="true"
	 * @generated
	 */
	Alignment getVerticalAlignment();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.GridLayoutData#getVerticalAlignment <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Alignment</em>' attribute.
	 * @see org.eclipse.gmf.gmfgraph.Alignment
	 * @see #getVerticalAlignment()
	 * @generated
	 */
	void setVerticalAlignment(Alignment value);

	/**
	 * Returns the value of the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * The default value is <code>"CENTER"</code>.
	 * The literals are from the enumeration {@link org.eclipse.gmf.gmfgraph.Alignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Alignment</em>' attribute.
	 * @see org.eclipse.gmf.gmfgraph.Alignment
	 * @see #setHorizontalAlignment(Alignment)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getGridLayoutData_HorizontalAlignment()
	 * @model default="CENTER" required="true"
	 * @generated
	 */
	Alignment getHorizontalAlignment();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.GridLayoutData#getHorizontalAlignment <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Alignment</em>' attribute.
	 * @see org.eclipse.gmf.gmfgraph.Alignment
	 * @see #getHorizontalAlignment()
	 * @generated
	 */
	void setHorizontalAlignment(Alignment value);

	/**
	 * Returns the value of the '<em><b>Vertical Span</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Span</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Span</em>' attribute.
	 * @see #setVerticalSpan(int)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getGridLayoutData_VerticalSpan()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getVerticalSpan();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.GridLayoutData#getVerticalSpan <em>Vertical Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Span</em>' attribute.
	 * @see #getVerticalSpan()
	 * @generated
	 */
	void setVerticalSpan(int value);

	/**
	 * Returns the value of the '<em><b>Horizontal Span</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Span</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Span</em>' attribute.
	 * @see #setHorizontalSpan(int)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getGridLayoutData_HorizontalSpan()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getHorizontalSpan();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.GridLayoutData#getHorizontalSpan <em>Horizontal Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Span</em>' attribute.
	 * @see #getHorizontalSpan()
	 * @generated
	 */
	void setHorizontalSpan(int value);

	/**
	 * Returns the value of the '<em><b>Horizontal Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Indent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Indent</em>' attribute.
	 * @see #setHorizontalIndent(int)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getGridLayoutData_HorizontalIndent()
	 * @model required="true"
	 * @generated
	 */
	int getHorizontalIndent();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.GridLayoutData#getHorizontalIndent <em>Horizontal Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Indent</em>' attribute.
	 * @see #getHorizontalIndent()
	 * @generated
	 */
	void setHorizontalIndent(int value);

	/**
	 * Returns the value of the '<em><b>Size Hint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Hint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Hint</em>' containment reference.
	 * @see #setSizeHint(Dimension)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getGridLayoutData_SizeHint()
	 * @model containment="true"
	 * @generated
	 */
	Dimension getSizeHint();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.GridLayoutData#getSizeHint <em>Size Hint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Hint</em>' containment reference.
	 * @see #getSizeHint()
	 * @generated
	 */
	void setSizeHint(Dimension value);

} // GridLayoutData

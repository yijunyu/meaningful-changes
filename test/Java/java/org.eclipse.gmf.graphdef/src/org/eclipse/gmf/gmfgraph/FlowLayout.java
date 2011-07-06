/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.FlowLayout#isVertical <em>Vertical</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.FlowLayout#isMatchMinorSize <em>Match Minor Size</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.FlowLayout#isForceSingleLine <em>Force Single Line</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.FlowLayout#getMajorAlignment <em>Major Alignment</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.FlowLayout#getMinorAlignment <em>Minor Alignment</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.FlowLayout#getMajorSpacing <em>Major Spacing</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.FlowLayout#getMinorSpacing <em>Minor Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFlowLayout()
 * @model
 * @generated
 */
public interface FlowLayout extends Layout {
	/**
	 * Returns the value of the '<em><b>Vertical</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical</em>' attribute.
	 * @see #setVertical(boolean)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFlowLayout_Vertical()
	 * @model default="false"
	 * @generated
	 */
	boolean isVertical();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.FlowLayout#isVertical <em>Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical</em>' attribute.
	 * @see #isVertical()
	 * @generated
	 */
	void setVertical(boolean value);

	/**
	 * Returns the value of the '<em><b>Match Minor Size</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Match Minor Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Minor Size</em>' attribute.
	 * @see #setMatchMinorSize(boolean)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFlowLayout_MatchMinorSize()
	 * @model default="false"
	 * @generated
	 */
	boolean isMatchMinorSize();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.FlowLayout#isMatchMinorSize <em>Match Minor Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Minor Size</em>' attribute.
	 * @see #isMatchMinorSize()
	 * @generated
	 */
	void setMatchMinorSize(boolean value);

	/**
	 * Returns the value of the '<em><b>Force Single Line</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Force Single Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force Single Line</em>' attribute.
	 * @see #setForceSingleLine(boolean)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFlowLayout_ForceSingleLine()
	 * @model default="false"
	 * @generated
	 */
	boolean isForceSingleLine();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.FlowLayout#isForceSingleLine <em>Force Single Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force Single Line</em>' attribute.
	 * @see #isForceSingleLine()
	 * @generated
	 */
	void setForceSingleLine(boolean value);

	/**
	 * Returns the value of the '<em><b>Major Alignment</b></em>' attribute.
	 * The default value is <code>"BEGINNING"</code>.
	 * The literals are from the enumeration {@link org.eclipse.gmf.gmfgraph.Alignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Major Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Major Alignment</em>' attribute.
	 * @see org.eclipse.gmf.gmfgraph.Alignment
	 * @see #setMajorAlignment(Alignment)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFlowLayout_MajorAlignment()
	 * @model default="BEGINNING"
	 * @generated
	 */
	Alignment getMajorAlignment();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.FlowLayout#getMajorAlignment <em>Major Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Major Alignment</em>' attribute.
	 * @see org.eclipse.gmf.gmfgraph.Alignment
	 * @see #getMajorAlignment()
	 * @generated
	 */
	void setMajorAlignment(Alignment value);

	/**
	 * Returns the value of the '<em><b>Minor Alignment</b></em>' attribute.
	 * The default value is <code>"BEGINNING"</code>.
	 * The literals are from the enumeration {@link org.eclipse.gmf.gmfgraph.Alignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minor Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minor Alignment</em>' attribute.
	 * @see org.eclipse.gmf.gmfgraph.Alignment
	 * @see #setMinorAlignment(Alignment)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFlowLayout_MinorAlignment()
	 * @model default="BEGINNING"
	 * @generated
	 */
	Alignment getMinorAlignment();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.FlowLayout#getMinorAlignment <em>Minor Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minor Alignment</em>' attribute.
	 * @see org.eclipse.gmf.gmfgraph.Alignment
	 * @see #getMinorAlignment()
	 * @generated
	 */
	void setMinorAlignment(Alignment value);

	/**
	 * Returns the value of the '<em><b>Major Spacing</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Major Spacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Major Spacing</em>' attribute.
	 * @see #setMajorSpacing(int)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFlowLayout_MajorSpacing()
	 * @model default="5"
	 * @generated
	 */
	int getMajorSpacing();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.FlowLayout#getMajorSpacing <em>Major Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Major Spacing</em>' attribute.
	 * @see #getMajorSpacing()
	 * @generated
	 */
	void setMajorSpacing(int value);

	/**
	 * Returns the value of the '<em><b>Minor Spacing</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minor Spacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minor Spacing</em>' attribute.
	 * @see #setMinorSpacing(int)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFlowLayout_MinorSpacing()
	 * @model default="5"
	 * @generated
	 */
	int getMinorSpacing();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.FlowLayout#getMinorSpacing <em>Minor Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minor Spacing</em>' attribute.
	 * @see #getMinorSpacing()
	 * @generated
	 */
	void setMinorSpacing(int value);

} // FlowLayout

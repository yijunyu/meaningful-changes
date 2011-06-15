/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Compartment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Child container within node. Compartment, iow.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCompartment#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCompartment#isCanCollapse <em>Can Collapse</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCompartment#isHideIfEmpty <em>Hide If Empty</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCompartment#isNeedsTitle <em>Needs Title</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCompartment#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCompartment#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCompartment#isListLayout <em>List Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCompartment()
 * @model
 * @generated
 */
public interface GenCompartment extends GenChildContainer {

	public static final String CLASS_NAME_PREFIX = "Compartment"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCompartment_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenCompartment#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Can Collapse</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Collapse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Collapse</em>' attribute.
	 * @see #setCanCollapse(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCompartment_CanCollapse()
	 * @model default="true"
	 * @generated
	 */
	boolean isCanCollapse();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenCompartment#isCanCollapse <em>Can Collapse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Collapse</em>' attribute.
	 * @see #isCanCollapse()
	 * @generated
	 */
	void setCanCollapse(boolean value);

	/**
	 * Returns the value of the '<em><b>Hide If Empty</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hide If Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide If Empty</em>' attribute.
	 * @see #setHideIfEmpty(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCompartment_HideIfEmpty()
	 * @model default="true"
	 * @generated
	 */
	boolean isHideIfEmpty();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenCompartment#isHideIfEmpty <em>Hide If Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hide If Empty</em>' attribute.
	 * @see #isHideIfEmpty()
	 * @generated
	 */
	void setHideIfEmpty(boolean value);

	/**
	 * Returns the value of the '<em><b>Needs Title</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needs Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs Title</em>' attribute.
	 * @see #setNeedsTitle(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCompartment_NeedsTitle()
	 * @model default="true"
	 * @generated
	 */
	boolean isNeedsTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenCompartment#isNeedsTitle <em>Needs Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs Title</em>' attribute.
	 * @see #isNeedsTitle()
	 * @generated
	 */
	void setNeedsTitle(boolean value);

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getCompartments <em>Compartments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCompartment_Diagram()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getCompartments
	 * @model opposite="compartments" resolveProxies="false" required="true" transient="false" changeable="false"
	 * @generated
	 */
	GenDiagram getDiagram();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getCompartments <em>Compartments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(GenNode)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCompartment_Node()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNode#getCompartments
	 * @model opposite="compartments" required="true"
	 * @generated
	 */
	GenNode getNode();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenCompartment#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(GenNode value);

	/**
	 * Returns the value of the '<em><b>List Layout</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Layout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Layout</em>' attribute.
	 * @see #setListLayout(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCompartment_ListLayout()
	 * @model default="true"
	 * @generated
	 */
	boolean isListLayout();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenCompartment#isListLayout <em>List Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Layout</em>' attribute.
	 * @see #isListLayout()
	 * @generated
	 */
	void setListLayout(boolean value);

} // GenCompartment

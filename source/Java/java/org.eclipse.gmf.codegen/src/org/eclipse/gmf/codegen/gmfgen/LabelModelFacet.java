/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Model Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model facet of labels
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.LabelModelFacet#getParser <em>Parser</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getLabelModelFacet()
 * @model
 * @generated
 */
public interface LabelModelFacet extends ModelFacet {

	/**
	 * Returns the value of the '<em><b>Parser</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenParserImplementation#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parser</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parser</em>' reference.
	 * @see #setParser(GenParserImplementation)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getLabelModelFacet_Parser()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenParserImplementation#getUses
	 * @model opposite="uses" required="true"
	 * @generated
	 */
	GenParserImplementation getParser();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.LabelModelFacet#getParser <em>Parser</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parser</em>' reference.
	 * @see #getParser()
	 * @generated
	 */
	void setParser(GenParserImplementation value);
} // LabelModelFacet

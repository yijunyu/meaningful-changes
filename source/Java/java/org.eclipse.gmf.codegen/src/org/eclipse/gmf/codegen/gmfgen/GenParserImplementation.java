/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Parser Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenParserImplementation#getHolder <em>Holder</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenParserImplementation#getUses <em>Uses</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenParserImplementation()
 * @model abstract="true"
 * @generated
 */
public interface GenParserImplementation extends EObject {
	/**
	 * Returns the value of the '<em><b>Holder</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenParsers#getImplementations <em>Implementations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holder</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holder</em>' container reference.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenParserImplementation_Holder()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenParsers#getImplementations
	 * @model opposite="implementations" resolveProxies="false" required="true" transient="false" changeable="false"
	 * @generated
	 */
	GenParsers getHolder();

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.LabelModelFacet}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.LabelModelFacet#getParser <em>Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenParserImplementation_Uses()
	 * @see org.eclipse.gmf.codegen.gmfgen.LabelModelFacet#getParser
	 * @model opposite="parser" required="true"
	 * @generated
	 */
	EList<LabelModelFacet> getUses();

} // GenParserImplementation

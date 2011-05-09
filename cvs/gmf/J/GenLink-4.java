/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * super.viewmap shall be {@link org.eclipse.draw2d.Connection} or subclass thereof
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getDomainLinkTargetFeature <em>Domain Link Target Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLink()
 * @model abstract="true"
 * @generated
 */
public interface GenLink extends GenBaseElement{
	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLink_Diagram()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getLinks
	 * @model opposite="links" required="true" changeable="false"
	 * @generated
	 */
	GenDiagram getDiagram();

	/**
	 * Returns the value of the '<em><b>Domain Link Target Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Link Target Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Link Target Feature</em>' reference.
	 * @see #setDomainLinkTargetFeature(GenFeature)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLink_DomainLinkTargetFeature()
	 * @model required="true"
	 * @generated
	 */
	GenFeature getDomainLinkTargetFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getDomainLinkTargetFeature <em>Domain Link Target Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Link Target Feature</em>' reference.
	 * @see #getDomainLinkTargetFeature()
	 * @generated
	 */
	void setDomainLinkTargetFeature(GenFeature value);

} // GenLink

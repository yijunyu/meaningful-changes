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
 * A representation of the model object '<em><b>Feature Link Model Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model facet of a feature-based link
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.FeatureLinkModelFacet#getMetaFeature <em>Meta Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getFeatureLinkModelFacet()
 * @model
 * @generated
 */
public interface FeatureLinkModelFacet extends LinkModelFacet {
	/**
	 * Returns the value of the '<em><b>Meta Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Feature</em>' reference.
	 * @see #setMetaFeature(GenFeature)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getFeatureLinkModelFacet_MetaFeature()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='metaFeature.ecoreFeature.unique' description='All references are unique in EMF due to the current code generation'"
	 * @generated
	 */
	GenFeature getMetaFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.FeatureLinkModelFacet#getMetaFeature <em>Meta Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Feature</em>' reference.
	 * @see #getMetaFeature()
	 * @generated
	 */
	void setMetaFeature(GenFeature value);

} // FeatureLinkModelFacet

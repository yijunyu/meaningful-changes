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
 * A representation of the model object '<em><b>Type Link Model Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model facet of an EClass that associates two EClasses
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.TypeLinkModelFacet#getSourceMetaFeature <em>Source Meta Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.TypeLinkModelFacet#getTargetMetaFeature <em>Target Meta Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getTypeLinkModelFacet()
 * @model
 * @generated
 */
public interface TypeLinkModelFacet extends TypeModelFacet, LinkModelFacet{
	/**
	 * Returns the value of the '<em><b>Source Meta Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Meta Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If source feature is not specified then link container is a link source
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Meta Feature</em>' reference.
	 * @see #setSourceMetaFeature(GenFeature)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getTypeLinkModelFacet_SourceMetaFeature()
	 * @model annotation="http://www.eclipse.org/gmf/2005/constraints ocl='sourceMetaFeature.oclIsUndefined() or sourceMetaFeature.ecoreFeature.oclAsType(ecore::EReference).eReferenceType.isSuperTypeOf(metaClass.ecoreClass)'"
	 * @generated
	 */
	GenFeature getSourceMetaFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.TypeLinkModelFacet#getSourceMetaFeature <em>Source Meta Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Meta Feature</em>' reference.
	 * @see #getSourceMetaFeature()
	 * @generated
	 */
	void setSourceMetaFeature(GenFeature value);

	/**
	 * Returns the value of the '<em><b>Target Meta Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Meta Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Meta Feature</em>' reference.
	 * @see #setTargetMetaFeature(GenFeature)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getTypeLinkModelFacet_TargetMetaFeature()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='targetMetaFeature.genClass.ecoreClass.isSuperTypeOf(metaClass.ecoreClass)'"
	 * @generated
	 */
	GenFeature getTargetMetaFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.TypeLinkModelFacet#getTargetMetaFeature <em>Target Meta Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Meta Feature</em>' reference.
	 * @see #getTargetMetaFeature()
	 * @generated
	 */
	void setTargetMetaFeature(GenFeature value);

} // TypeLinkModelFacet
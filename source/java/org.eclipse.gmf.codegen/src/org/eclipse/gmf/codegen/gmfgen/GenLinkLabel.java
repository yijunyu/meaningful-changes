/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Link Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Label attached to link
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenLinkLabel#getLink <em>Link</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenLinkLabel#getAlignment <em>Alignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLinkLabel()
 * @model annotation="http://www.eclipse.org/gmf/2005/constraints ocl='modelFacet.oclIsTypeOf(FeatureLabelModelFacet)=true implies link.modelFacet.oclIsTypeOf(TypeLinkModelFacet)' description='Feature based link labels can only be used on link with class (TypeLinkModelFacet)'"
 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='let tl: TypeLinkModelFacet = link.modelFacet.oclAsType(TypeLinkModelFacet) in not tl.oclIsUndefined() implies self.getMetaFeatures()->forAll(f|f.ecoreFeature.eContainingClass.isSuperTypeOf(tl.metaClass.ecoreClass))' description='Link label meta features must be owned by the node \'Meta Class\' or its super-classes'"
 * @generated
 */
public interface GenLinkLabel extends GenLabel {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' container reference.
	 * @see #setLink(GenLink)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLinkLabel_Link()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLink#getLabels
	 * @model opposite="labels" required="true" transient="false"
	 * @generated
	 */
	GenLink getLink();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenLinkLabel#getLink <em>Link</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' container reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(GenLink value);

	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * The default value is <code>"MIDDLE"</code>.
	 * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.LinkLabelAlignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.LinkLabelAlignment
	 * @see #setAlignment(LinkLabelAlignment)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLinkLabel_Alignment()
	 * @model default="MIDDLE"
	 * @generated
	 */
	LinkLabelAlignment getAlignment();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenLinkLabel#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.LinkLabelAlignment
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(LinkLabelAlignment value);

} // GenLinkLabel

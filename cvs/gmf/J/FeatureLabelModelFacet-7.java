/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;


import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Label Model Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model facet of label based on domain model attribute(s)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.FeatureLabelModelFacet#getMetaFeatures <em>Meta Features</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.FeatureLabelModelFacet#getViewPattern <em>View Pattern</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.FeatureLabelModelFacet#getViewMethod <em>View Method</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.FeatureLabelModelFacet#getEditPattern <em>Edit Pattern</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.FeatureLabelModelFacet#getEditMethod <em>Edit Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getFeatureLabelModelFacet()
 * @model
 * @generated
 */
public interface FeatureLabelModelFacet extends LabelModelFacet {
	/**
	 * Returns the value of the '<em><b>Meta Features</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Features</em>' reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getFeatureLabelModelFacet_MetaFeatures()
	 * @model type="org.eclipse.emf.codegen.ecore.genmodel.GenFeature" required="true"
	 * @generated
	 */
	EList<GenFeature> getMetaFeatures();

	/**
	 * Returns the value of the '<em><b>View Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pattern to produce label on diagram, depends on view method
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>View Pattern</em>' attribute.
	 * @see #setViewPattern(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getFeatureLabelModelFacet_ViewPattern()
	 * @model
	 * @generated
	 */
	String getViewPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.FeatureLabelModelFacet#getViewPattern <em>View Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Pattern</em>' attribute.
	 * @see #getViewPattern()
	 * @generated
	 */
	void setViewPattern(String value);

	/**
	 * Returns the value of the '<em><b>View Method</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.LabelViewMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Method</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.LabelViewMethod
	 * @see #setViewMethod(LabelViewMethod)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getFeatureLabelModelFacet_ViewMethod()
	 * @model
	 * @generated
	 */
	LabelViewMethod getViewMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.FeatureLabelModelFacet#getViewMethod <em>View Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Method</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.LabelViewMethod
	 * @see #getViewMethod()
	 * @generated
	 */
	void setViewMethod(LabelViewMethod value);

	/**
	 * Returns the value of the '<em><b>Edit Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pattern to produce text for inplace editor, depends on edit method; if not specified then viewPattern should be used
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edit Pattern</em>' attribute.
	 * @see #setEditPattern(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getFeatureLabelModelFacet_EditPattern()
	 * @model
	 * @generated
	 */
	String getEditPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.FeatureLabelModelFacet#getEditPattern <em>Edit Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Pattern</em>' attribute.
	 * @see #getEditPattern()
	 * @generated
	 */
	void setEditPattern(String value);

	/**
	 * Returns the value of the '<em><b>Edit Method</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.LabelEditMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Method</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.LabelEditMethod
	 * @see #setEditMethod(LabelEditMethod)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getFeatureLabelModelFacet_EditMethod()
	 * @model
	 * @generated
	 */
	LabelEditMethod getEditMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.FeatureLabelModelFacet#getEditMethod <em>Edit Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Method</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.LabelEditMethod
	 * @see #getEditMethod()
	 * @generated
	 */
	void setEditMethod(LabelEditMethod value);

} // FeatureLabelModelFacet
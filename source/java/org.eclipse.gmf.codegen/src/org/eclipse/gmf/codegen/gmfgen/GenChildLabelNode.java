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
 * A representation of the model object '<em><b>Gen Child Label Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Child node represented by label; typically hosted by list compartment
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenChildLabelNode#isLabelReadOnly <em>Label Read Only</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenChildLabelNode#isLabelElementIcon <em>Label Element Icon</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenChildLabelNode#getLabelModelFacet <em>Label Model Facet</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenChildLabelNode()
 * @model
 * @generated
 */
public interface GenChildLabelNode extends GenChildNode {
	/**
	 * Returns the value of the '<em><b>Label Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Read Only</em>' attribute.
	 * @see #setLabelReadOnly(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenChildLabelNode_LabelReadOnly()
	 * @model
	 * @generated
	 */
	boolean isLabelReadOnly();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenChildLabelNode#isLabelReadOnly <em>Label Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Read Only</em>' attribute.
	 * @see #isLabelReadOnly()
	 * @generated
	 */
	void setLabelReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Label Element Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Element Icon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Element Icon</em>' attribute.
	 * @see #setLabelElementIcon(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenChildLabelNode_LabelElementIcon()
	 * @model
	 * @generated
	 */
	boolean isLabelElementIcon();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenChildLabelNode#isLabelElementIcon <em>Label Element Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Element Icon</em>' attribute.
	 * @see #isLabelElementIcon()
	 * @generated
	 */
	void setLabelElementIcon(boolean value);

	/**
	 * Returns the value of the '<em><b>Label Model Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If model facet is not specified then custom parser should be provided for the label
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label Model Facet</em>' containment reference.
	 * @see #setLabelModelFacet(LabelModelFacet)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenChildLabelNode_LabelModelFacet()
	 * @model containment="true"
	 * @generated
	 */
	LabelModelFacet getLabelModelFacet();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenChildLabelNode#getLabelModelFacet <em>Label Model Facet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Model Facet</em>' containment reference.
	 * @see #getLabelModelFacet()
	 * @generated
	 */
	void setLabelModelFacet(LabelModelFacet value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns structural features that provide label content
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<GenFeature> getLabelMetaFeatures();

} // GenChildLabelNode
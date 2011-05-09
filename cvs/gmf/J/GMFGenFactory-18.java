/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage
 * @generated
 */
public interface GMFGenFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GMFGenFactory eINSTANCE = org.eclipse.gmf.codegen.gmfgen.impl.GMFGenFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gen Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Diagram</em>'.
	 * @generated
	 */
	GenDiagram createGenDiagram();

	/**
	 * Returns a new object of class '<em>Gen Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Plugin</em>'.
	 * @generated
	 */
	GenPlugin createGenPlugin();

	/**
	 * Returns a new object of class '<em>Gen Top Level Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Top Level Node</em>'.
	 * @generated
	 */
	GenTopLevelNode createGenTopLevelNode();

	/**
	 * Returns a new object of class '<em>Gen Child Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Child Node</em>'.
	 * @generated
	 */
	GenChildNode createGenChildNode();

	/**
	 * Returns a new object of class '<em>Gen Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Compartment</em>'.
	 * @generated
	 */
	GenCompartment createGenCompartment();

	/**
	 * Returns a new object of class '<em>Gen Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Link</em>'.
	 * @generated
	 */
	GenLink createGenLink();

	/**
	 * Returns a new object of class '<em>Gen Node Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Node Label</em>'.
	 * @generated
	 */
	GenNodeLabel createGenNodeLabel();

	/**
	 * Returns a new object of class '<em>Gen External Node Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen External Node Label</em>'.
	 * @generated
	 */
	GenExternalNodeLabel createGenExternalNodeLabel();

	/**
	 * Returns a new object of class '<em>Gen Link Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Link Label</em>'.
	 * @generated
	 */
	GenLinkLabel createGenLinkLabel();

	/**
	 * Returns a new object of class '<em>Type Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Model Facet</em>'.
	 * @generated
	 */
	TypeModelFacet createTypeModelFacet();

	/**
	 * Returns a new object of class '<em>Feature Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Model Facet</em>'.
	 * @generated
	 */
	FeatureModelFacet createFeatureModelFacet();

	/**
	 * Returns a new object of class '<em>Type Link Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Link Model Facet</em>'.
	 * @generated
	 */
	TypeLinkModelFacet createTypeLinkModelFacet();

	/**
	 * Returns a new object of class '<em>Color Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Color Attributes</em>'.
	 * @generated
	 */
	ColorAttributes createColorAttributes();

	/**
	 * Returns a new object of class '<em>Shape Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shape Attributes</em>'.
	 * @generated
	 */
	ShapeAttributes createShapeAttributes();

	/**
	 * Returns a new object of class '<em>Default Size Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Size Attributes</em>'.
	 * @generated
	 */
	DefaultSizeAttributes createDefaultSizeAttributes();

	/**
	 * Returns a new object of class '<em>Figure Viewmap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Figure Viewmap</em>'.
	 * @generated
	 */
	FigureViewmap createFigureViewmap();

	/**
	 * Returns a new object of class '<em>Snippet Viewmap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Snippet Viewmap</em>'.
	 * @generated
	 */
	SnippetViewmap createSnippetViewmap();

	/**
	 * Returns a new object of class '<em>Inner Class Viewmap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inner Class Viewmap</em>'.
	 * @generated
	 */
	InnerClassViewmap createInnerClassViewmap();

	/**
	 * Returns a new object of class '<em>Palette</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Palette</em>'.
	 * @generated
	 */
	Palette createPalette();

	/**
	 * Returns a new object of class '<em>Node Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Entry</em>'.
	 * @generated
	 */
	NodeEntry createNodeEntry();

	/**
	 * Returns a new object of class '<em>Link Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Entry</em>'.
	 * @generated
	 */
	LinkEntry createLinkEntry();

	/**
	 * Returns a new object of class '<em>Tool Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool Group</em>'.
	 * @generated
	 */
	ToolGroup createToolGroup();

	/**
	 * Returns a new object of class '<em>Gen Feature Seq Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Feature Seq Initializer</em>'.
	 * @generated
	 */
	GenFeatureSeqInitializer createGenFeatureSeqInitializer();

	/**
	 * Returns a new object of class '<em>Gen Feature Value Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Feature Value Spec</em>'.
	 * @generated
	 */
	GenFeatureValueSpec createGenFeatureValueSpec();

	/**
	 * Returns a new object of class '<em>Gen Link Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Link Constraints</em>'.
	 * @generated
	 */
	GenLinkConstraints createGenLinkConstraints();

	/**
	 * Returns a new object of class '<em>Gen Audit Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Audit Container</em>'.
	 * @generated
	 */
	GenAuditContainer createGenAuditContainer();

	/**
	 * Returns a new object of class '<em>Gen Audit Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Audit Rule</em>'.
	 * @generated
	 */
	GenAuditRule createGenAuditRule();

	/**
	 * Returns a new object of class '<em>Value Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Expression</em>'.
	 * @generated
	 */
	ValueExpression createValueExpression();

	/**
	 * Returns a new object of class '<em>Model Element Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Element Selector</em>'.
	 * @generated
	 */
	ModelElementSelector createModelElementSelector();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GMFGenPackage getGMFGenPackage();

} //GMFGenFactory

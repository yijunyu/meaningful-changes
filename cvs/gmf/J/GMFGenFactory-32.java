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
	 * Returns a new object of class '<em>Gen Editor Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Editor Generator</em>'.
	 * @generated
	 */
	GenEditorGenerator createGenEditorGenerator();

	/**
	 * Returns a new object of class '<em>Gen Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Diagram</em>'.
	 * @generated
	 */
	GenDiagram createGenDiagram();

	/**
	 * Returns a new object of class '<em>Gen Editor View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Editor View</em>'.
	 * @generated
	 */
	GenEditorView createGenEditorView();

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
	 * Returns a new object of class '<em>Metamodel Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metamodel Type</em>'.
	 * @generated
	 */
	MetamodelType createMetamodelType();

	/**
	 * Returns a new object of class '<em>Specialization Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specialization Type</em>'.
	 * @generated
	 */
	SpecializationType createSpecializationType();

	/**
	 * Returns a new object of class '<em>Notation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notation Type</em>'.
	 * @generated
	 */
	NotationType createNotationType();

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
	 * Returns a new object of class '<em>Feature Label Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Label Model Facet</em>'.
	 * @generated
	 */
	FeatureLabelModelFacet createFeatureLabelModelFacet();

	/**
	 * Returns a new object of class '<em>Composite Feature Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Feature Model Facet</em>'.
	 * @generated
	 */
	CompositeFeatureModelFacet createCompositeFeatureModelFacet();

	/**
	 * Returns a new object of class '<em>Composite Feature Label Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Feature Label Model Facet</em>'.
	 * @generated
	 */
	CompositeFeatureLabelModelFacet createCompositeFeatureLabelModelFacet();

	/**
	 * Returns a new object of class '<em>Type Link Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Link Model Facet</em>'.
	 * @generated
	 */
	TypeLinkModelFacet createTypeLinkModelFacet();

	/**
	 * Returns a new object of class '<em>Feature Link Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Link Model Facet</em>'.
	 * @generated
	 */
	FeatureLinkModelFacet createFeatureLinkModelFacet();

	/**
	 * Returns a new object of class '<em>Color Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Color Attributes</em>'.
	 * @generated
	 */
	ColorAttributes createColorAttributes();

	/**
	 * Returns a new object of class '<em>Resize Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resize Constraints</em>'.
	 * @generated
	 */
	ResizeConstraints createResizeConstraints();

	/**
	 * Returns a new object of class '<em>Default Size Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Size Attributes</em>'.
	 * @generated
	 */
	DefaultSizeAttributes createDefaultSizeAttributes();

	/**
	 * Returns a new object of class '<em>Label Offset Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Offset Attributes</em>'.
	 * @generated
	 */
	LabelOffsetAttributes createLabelOffsetAttributes();

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
	 * Returns a new object of class '<em>Tool Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool Entry</em>'.
	 * @generated
	 */
	ToolEntry createToolEntry();

	/**
	 * Returns a new object of class '<em>Separator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Separator</em>'.
	 * @generated
	 */
	Separator createSeparator();

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
	 * Returns a new object of class '<em>Gen Domain Element Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Domain Element Target</em>'.
	 * @generated
	 */
	GenDomainElementTarget createGenDomainElementTarget();

	/**
	 * Returns a new object of class '<em>Gen Diagram Element Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Diagram Element Target</em>'.
	 * @generated
	 */
	GenDiagramElementTarget createGenDiagramElementTarget();

	/**
	 * Returns a new object of class '<em>Gen Notation Element Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Notation Element Target</em>'.
	 * @generated
	 */
	GenNotationElementTarget createGenNotationElementTarget();

	/**
	 * Returns a new object of class '<em>Gen Metric Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Metric Container</em>'.
	 * @generated
	 */
	GenMetricContainer createGenMetricContainer();

	/**
	 * Returns a new object of class '<em>Gen Metric Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Metric Rule</em>'.
	 * @generated
	 */
	GenMetricRule createGenMetricRule();

	/**
	 * Returns a new object of class '<em>Gen Audited Metric Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Audited Metric Target</em>'.
	 * @generated
	 */
	GenAuditedMetricTarget createGenAuditedMetricTarget();

	/**
	 * Returns a new object of class '<em>Gen Expression Provider Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Expression Provider Container</em>'.
	 * @generated
	 */
	GenExpressionProviderContainer createGenExpressionProviderContainer();

	/**
	 * Returns a new object of class '<em>Gen Java Expression Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Java Expression Provider</em>'.
	 * @generated
	 */
	GenJavaExpressionProvider createGenJavaExpressionProvider();

	/**
	 * Returns a new object of class '<em>Gen Expression Interpreter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Expression Interpreter</em>'.
	 * @generated
	 */
	GenExpressionInterpreter createGenExpressionInterpreter();

	/**
	 * Returns a new object of class '<em>Value Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Expression</em>'.
	 * @generated
	 */
	ValueExpression createValueExpression();

	/**
	 * Returns a new object of class '<em>Gen Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Constraint</em>'.
	 * @generated
	 */
	GenConstraint createGenConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GMFGenPackage getGMFGenPackage();

} //GMFGenFactory

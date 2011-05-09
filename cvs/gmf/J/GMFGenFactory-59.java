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
	 * Returns a new object of class '<em>Gen Custom Preference Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Custom Preference Page</em>'.
	 * @generated
	 */
	GenCustomPreferencePage createGenCustomPreferencePage();

	/**
	 * Returns a new object of class '<em>Gen Standard Preference Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Standard Preference Page</em>'.
	 * @generated
	 */
	GenStandardPreferencePage createGenStandardPreferencePage();

	/**
	 * Returns a new object of class '<em>Gen Diagram Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Diagram Preferences</em>'.
	 * @generated
	 */
	GenDiagramPreferences createGenDiagramPreferences();

	/**
	 * Returns a new object of class '<em>Gen Standard Font</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Standard Font</em>'.
	 * @generated
	 */
	GenStandardFont createGenStandardFont();

	/**
	 * Returns a new object of class '<em>Gen Custom Font</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Custom Font</em>'.
	 * @generated
	 */
	GenCustomFont createGenCustomFont();

	/**
	 * Returns a new object of class '<em>Gen RGB Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen RGB Color</em>'.
	 * @generated
	 */
	GenRGBColor createGenRGBColor();

	/**
	 * Returns a new object of class '<em>Gen Constant Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Constant Color</em>'.
	 * @generated
	 */
	GenConstantColor createGenConstantColor();

	/**
	 * Returns a new object of class '<em>Gen Diagram Updater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Diagram Updater</em>'.
	 * @generated
	 */
	GenDiagramUpdater createGenDiagramUpdater();

	/**
	 * Returns a new object of class '<em>Gen Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Plugin</em>'.
	 * @generated
	 */
	GenPlugin createGenPlugin();

	/**
	 * Returns a new object of class '<em>Dynamic Model Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic Model Access</em>'.
	 * @generated
	 */
	DynamicModelAccess createDynamicModelAccess();

	/**
	 * Returns a new object of class '<em>Custom Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Behaviour</em>'.
	 * @generated
	 */
	CustomBehaviour createCustomBehaviour();

	/**
	 * Returns a new object of class '<em>Shared Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shared Behaviour</em>'.
	 * @generated
	 */
	SharedBehaviour createSharedBehaviour();

	/**
	 * Returns a new object of class '<em>Open Diagram Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Diagram Behaviour</em>'.
	 * @generated
	 */
	OpenDiagramBehaviour createOpenDiagramBehaviour();

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
	 * Returns a new object of class '<em>Gen Child Side Affixed Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Child Side Affixed Node</em>'.
	 * @generated
	 */
	GenChildSideAffixedNode createGenChildSideAffixedNode();

	/**
	 * Returns a new object of class '<em>Gen Child Label Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Child Label Node</em>'.
	 * @generated
	 */
	GenChildLabelNode createGenChildLabelNode();

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
	 * Returns a new object of class '<em>Label Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Model Facet</em>'.
	 * @generated
	 */
	LabelModelFacet createLabelModelFacet();

	/**
	 * Returns a new object of class '<em>Type Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Model Facet</em>'.
	 * @generated
	 */
	TypeModelFacet createTypeModelFacet();

	/**
	 * Returns a new object of class '<em>Feature Label Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Label Model Facet</em>'.
	 * @generated
	 */
	FeatureLabelModelFacet createFeatureLabelModelFacet();

	/**
	 * Returns a new object of class '<em>Design Label Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Design Label Model Facet</em>'.
	 * @generated
	 */
	DesignLabelModelFacet createDesignLabelModelFacet();

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
	 * Returns a new object of class '<em>Style Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Style Attributes</em>'.
	 * @generated
	 */
	StyleAttributes createStyleAttributes();

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
	 * Returns a new object of class '<em>Parent Assigned Viewmap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parent Assigned Viewmap</em>'.
	 * @generated
	 */
	ParentAssignedViewmap createParentAssignedViewmap();

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
	 * Returns a new object of class '<em>Standard Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Entry</em>'.
	 * @generated
	 */
	StandardEntry createStandardEntry();

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
	 * Returns a new object of class '<em>Gen Reference New Element Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Reference New Element Spec</em>'.
	 * @generated
	 */
	GenReferenceNewElementSpec createGenReferenceNewElementSpec();

	/**
	 * Returns a new object of class '<em>Gen Link Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Link Constraints</em>'.
	 * @generated
	 */
	GenLinkConstraints createGenLinkConstraints();

	/**
	 * Returns a new object of class '<em>Gen Audit Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Audit Root</em>'.
	 * @generated
	 */
	GenAuditRoot createGenAuditRoot();

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
	 * Returns a new object of class '<em>Gen Domain Attribute Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Domain Attribute Target</em>'.
	 * @generated
	 */
	GenDomainAttributeTarget createGenDomainAttributeTarget();

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
	 * Returns a new object of class '<em>Gen Audit Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Audit Context</em>'.
	 * @generated
	 */
	GenAuditContext createGenAuditContext();

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
	 * Returns a new object of class '<em>Gen Literal Expression Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Literal Expression Provider</em>'.
	 * @generated
	 */
	GenLiteralExpressionProvider createGenLiteralExpressionProvider();

	/**
	 * Returns a new object of class '<em>Gen Navigator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Navigator</em>'.
	 * @generated
	 */
	GenNavigator createGenNavigator();

	/**
	 * Returns a new object of class '<em>Gen Navigator Child Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Navigator Child Reference</em>'.
	 * @generated
	 */
	GenNavigatorChildReference createGenNavigatorChildReference();

	/**
	 * Returns a new object of class '<em>Gen Navigator Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Navigator Path</em>'.
	 * @generated
	 */
	GenNavigatorPath createGenNavigatorPath();

	/**
	 * Returns a new object of class '<em>Gen Navigator Path Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Navigator Path Segment</em>'.
	 * @generated
	 */
	GenNavigatorPathSegment createGenNavigatorPathSegment();

	/**
	 * Returns a new object of class '<em>Gen Property Sheet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Property Sheet</em>'.
	 * @generated
	 */
	GenPropertySheet createGenPropertySheet();

	/**
	 * Returns a new object of class '<em>Gen Standard Property Tab</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Standard Property Tab</em>'.
	 * @generated
	 */
	GenStandardPropertyTab createGenStandardPropertyTab();

	/**
	 * Returns a new object of class '<em>Gen Custom Property Tab</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Custom Property Tab</em>'.
	 * @generated
	 */
	GenCustomPropertyTab createGenCustomPropertyTab();

	/**
	 * Returns a new object of class '<em>Type Tab Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Tab Filter</em>'.
	 * @generated
	 */
	TypeTabFilter createTypeTabFilter();

	/**
	 * Returns a new object of class '<em>Custom Tab Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Tab Filter</em>'.
	 * @generated
	 */
	CustomTabFilter createCustomTabFilter();

	/**
	 * Returns a new object of class '<em>Gen Shared Contribution Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Shared Contribution Item</em>'.
	 * @generated
	 */
	GenSharedContributionItem createGenSharedContributionItem();

	/**
	 * Returns a new object of class '<em>Gen Group Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Group Marker</em>'.
	 * @generated
	 */
	GenGroupMarker createGenGroupMarker();

	/**
	 * Returns a new object of class '<em>Gen Separator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Separator</em>'.
	 * @generated
	 */
	GenSeparator createGenSeparator();

	/**
	 * Returns a new object of class '<em>Gen Custom Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Custom Action</em>'.
	 * @generated
	 */
	GenCustomAction createGenCustomAction();

	/**
	 * Returns a new object of class '<em>Gen Command Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Command Action</em>'.
	 * @generated
	 */
	GenCommandAction createGenCommandAction();

	/**
	 * Returns a new object of class '<em>Load Resource Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Resource Action</em>'.
	 * @generated
	 */
	LoadResourceAction createLoadResourceAction();

	/**
	 * Returns a new object of class '<em>Init Diagram Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Init Diagram Action</em>'.
	 * @generated
	 */
	InitDiagramAction createInitDiagramAction();

	/**
	 * Returns a new object of class '<em>Create Shortcut Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Shortcut Action</em>'.
	 * @generated
	 */
	CreateShortcutAction createCreateShortcutAction();

	/**
	 * Returns a new object of class '<em>Gen Action Factory Contribution Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Action Factory Contribution Item</em>'.
	 * @generated
	 */
	GenActionFactoryContributionItem createGenActionFactoryContributionItem();

	/**
	 * Returns a new object of class '<em>Gen Menu Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Menu Manager</em>'.
	 * @generated
	 */
	GenMenuManager createGenMenuManager();

	/**
	 * Returns a new object of class '<em>Gen Tool Bar Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Tool Bar Manager</em>'.
	 * @generated
	 */
	GenToolBarManager createGenToolBarManager();

	/**
	 * Returns a new object of class '<em>Gen Context Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Context Menu</em>'.
	 * @generated
	 */
	GenContextMenu createGenContextMenu();

	/**
	 * Returns a new object of class '<em>Gen Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Application</em>'.
	 * @generated
	 */
	GenApplication createGenApplication();

	/**
	 * Returns a new object of class '<em>Gen Parsers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Parsers</em>'.
	 * @generated
	 */
	GenParsers createGenParsers();

	/**
	 * Returns a new object of class '<em>Predefined Parser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predefined Parser</em>'.
	 * @generated
	 */
	PredefinedParser createPredefinedParser();

	/**
	 * Returns a new object of class '<em>Custom Parser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Parser</em>'.
	 * @generated
	 */
	CustomParser createCustomParser();

	/**
	 * Returns a new object of class '<em>External Parser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Parser</em>'.
	 * @generated
	 */
	ExternalParser createExternalParser();

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
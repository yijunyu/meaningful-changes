/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.gmf.codegen.gmfgen.ColorAttributes;
import org.eclipse.gmf.codegen.gmfgen.CompositeFeatureLabelModelFacet;
import org.eclipse.gmf.codegen.gmfgen.CompositeFeatureModelFacet;
import org.eclipse.gmf.codegen.gmfgen.DefaultSizeAttributes;
import org.eclipse.gmf.codegen.gmfgen.FeatureLabelModelFacet;
import org.eclipse.gmf.codegen.gmfgen.FeatureLinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.FeatureModelFacet;
import org.eclipse.gmf.codegen.gmfgen.FigureViewmap;
import org.eclipse.gmf.codegen.gmfgen.GMFGenFactory;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenAuditContainer;
import org.eclipse.gmf.codegen.gmfgen.GenAuditRule;
import org.eclipse.gmf.codegen.gmfgen.GenChildNode;
import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenConstraint;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.gmfgen.GenEditorView;
import org.eclipse.gmf.codegen.gmfgen.GenExternalNodeLabel;
import org.eclipse.gmf.codegen.gmfgen.GenFeatureSeqInitializer;
import org.eclipse.gmf.codegen.gmfgen.GenFeatureValueSpec;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenLinkConstraints;
import org.eclipse.gmf.codegen.gmfgen.GenLinkLabel;
import org.eclipse.gmf.codegen.gmfgen.GenNodeLabel;
import org.eclipse.gmf.codegen.gmfgen.GenPlugin;
import org.eclipse.gmf.codegen.gmfgen.GenSeverity;
import org.eclipse.gmf.codegen.gmfgen.GenTopLevelNode;
import org.eclipse.gmf.codegen.gmfgen.InnerClassViewmap;
import org.eclipse.gmf.codegen.gmfgen.LinkEntry;
import org.eclipse.gmf.codegen.gmfgen.LinkLabelAlignment;
import org.eclipse.gmf.codegen.gmfgen.NodeEntry;
import org.eclipse.gmf.codegen.gmfgen.Palette;
import org.eclipse.gmf.codegen.gmfgen.ShapeAttributes;
import org.eclipse.gmf.codegen.gmfgen.SnippetViewmap;
import org.eclipse.gmf.codegen.gmfgen.TextLabelModelFacet;
import org.eclipse.gmf.codegen.gmfgen.ToolGroup;
import org.eclipse.gmf.codegen.gmfgen.TypeLinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.TypeModelFacet;
import org.eclipse.gmf.codegen.gmfgen.ValueExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GMFGenFactoryImpl extends EFactoryImpl implements GMFGenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GMFGenFactory init() {
		try {
			GMFGenFactory theGMFGenFactory = (GMFGenFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/gmf/2005/GenModel"); 
			if (theGMFGenFactory != null) {
				return theGMFGenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GMFGenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFGenFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GMFGenPackage.GEN_EDITOR_GENERATOR: return createGenEditorGenerator();
			case GMFGenPackage.GEN_DIAGRAM: return createGenDiagram();
			case GMFGenPackage.GEN_EDITOR_VIEW: return createGenEditorView();
			case GMFGenPackage.GEN_PLUGIN: return createGenPlugin();
			case GMFGenPackage.GEN_TOP_LEVEL_NODE: return createGenTopLevelNode();
			case GMFGenPackage.GEN_CHILD_NODE: return createGenChildNode();
			case GMFGenPackage.GEN_COMPARTMENT: return createGenCompartment();
			case GMFGenPackage.GEN_LINK: return createGenLink();
			case GMFGenPackage.GEN_NODE_LABEL: return createGenNodeLabel();
			case GMFGenPackage.GEN_EXTERNAL_NODE_LABEL: return createGenExternalNodeLabel();
			case GMFGenPackage.GEN_LINK_LABEL: return createGenLinkLabel();
			case GMFGenPackage.TEXT_LABEL_MODEL_FACET: return createTextLabelModelFacet();
			case GMFGenPackage.TYPE_MODEL_FACET: return createTypeModelFacet();
			case GMFGenPackage.FEATURE_MODEL_FACET: return createFeatureModelFacet();
			case GMFGenPackage.COMPOSITE_FEATURE_MODEL_FACET: return createCompositeFeatureModelFacet();
			case GMFGenPackage.TYPE_LINK_MODEL_FACET: return createTypeLinkModelFacet();
			case GMFGenPackage.FEATURE_LINK_MODEL_FACET: return createFeatureLinkModelFacet();
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET: return createFeatureLabelModelFacet();
			case GMFGenPackage.COMPOSITE_FEATURE_LABEL_MODEL_FACET: return createCompositeFeatureLabelModelFacet();
			case GMFGenPackage.COLOR_ATTRIBUTES: return createColorAttributes();
			case GMFGenPackage.SHAPE_ATTRIBUTES: return createShapeAttributes();
			case GMFGenPackage.DEFAULT_SIZE_ATTRIBUTES: return createDefaultSizeAttributes();
			case GMFGenPackage.FIGURE_VIEWMAP: return createFigureViewmap();
			case GMFGenPackage.SNIPPET_VIEWMAP: return createSnippetViewmap();
			case GMFGenPackage.INNER_CLASS_VIEWMAP: return createInnerClassViewmap();
			case GMFGenPackage.VALUE_EXPRESSION: return createValueExpression();
			case GMFGenPackage.GEN_CONSTRAINT: return createGenConstraint();
			case GMFGenPackage.PALETTE: return createPalette();
			case GMFGenPackage.NODE_ENTRY: return createNodeEntry();
			case GMFGenPackage.LINK_ENTRY: return createLinkEntry();
			case GMFGenPackage.TOOL_GROUP: return createToolGroup();
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER: return createGenFeatureSeqInitializer();
			case GMFGenPackage.GEN_FEATURE_VALUE_SPEC: return createGenFeatureValueSpec();
			case GMFGenPackage.GEN_LINK_CONSTRAINTS: return createGenLinkConstraints();
			case GMFGenPackage.GEN_AUDIT_CONTAINER: return createGenAuditContainer();
			case GMFGenPackage.GEN_AUDIT_RULE: return createGenAuditRule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GMFGenPackage.LINK_LABEL_ALIGNMENT:
				return createLinkLabelAlignmentFromString(eDataType, initialValue);
			case GMFGenPackage.GEN_SEVERITY:
				return createGenSeverityFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GMFGenPackage.LINK_LABEL_ALIGNMENT:
				return convertLinkLabelAlignmentToString(eDataType, instanceValue);
			case GMFGenPackage.GEN_SEVERITY:
				return convertGenSeverityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenEditorGenerator createGenEditorGenerator() {
		GenEditorGeneratorImpl genEditorGenerator = new GenEditorGeneratorImpl();
		return genEditorGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDiagram createGenDiagram() {
		GenDiagramImpl genDiagram = new GenDiagramImpl();
		return genDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenEditorView createGenEditorView() {
		GenEditorViewImpl genEditorView = new GenEditorViewImpl();
		return genEditorView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPlugin createGenPlugin() {
		GenPluginImpl genPlugin = new GenPluginImpl();
		return genPlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenTopLevelNode createGenTopLevelNode() {
		GenTopLevelNodeImpl genTopLevelNode = new GenTopLevelNodeImpl();
		return genTopLevelNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenChildNode createGenChildNode() {
		GenChildNodeImpl genChildNode = new GenChildNodeImpl();
		return genChildNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCompartment createGenCompartment() {
		GenCompartmentImpl genCompartment = new GenCompartmentImpl();
		return genCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenLink createGenLink() {
		GenLinkImpl genLink = new GenLinkImpl();
		return genLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenNodeLabel createGenNodeLabel() {
		GenNodeLabelImpl genNodeLabel = new GenNodeLabelImpl();
		return genNodeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenExternalNodeLabel createGenExternalNodeLabel() {
		GenExternalNodeLabelImpl genExternalNodeLabel = new GenExternalNodeLabelImpl();
		return genExternalNodeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenLinkLabel createGenLinkLabel() {
		GenLinkLabelImpl genLinkLabel = new GenLinkLabelImpl();
		return genLinkLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextLabelModelFacet createTextLabelModelFacet() {
		TextLabelModelFacetImpl textLabelModelFacet = new TextLabelModelFacetImpl();
		return textLabelModelFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeModelFacet createTypeModelFacet() {
		TypeModelFacetImpl typeModelFacet = new TypeModelFacetImpl();
		return typeModelFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModelFacet createFeatureModelFacet() {
		FeatureModelFacetImpl featureModelFacet = new FeatureModelFacetImpl();
		return featureModelFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureLabelModelFacet createFeatureLabelModelFacet() {
		FeatureLabelModelFacetImpl featureLabelModelFacet = new FeatureLabelModelFacetImpl();
		return featureLabelModelFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeFeatureModelFacet createCompositeFeatureModelFacet() {
		CompositeFeatureModelFacetImpl compositeFeatureModelFacet = new CompositeFeatureModelFacetImpl();
		return compositeFeatureModelFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeFeatureLabelModelFacet createCompositeFeatureLabelModelFacet() {
		CompositeFeatureLabelModelFacetImpl compositeFeatureLabelModelFacet = new CompositeFeatureLabelModelFacetImpl();
		return compositeFeatureLabelModelFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLinkModelFacet createTypeLinkModelFacet() {
		TypeLinkModelFacetImpl typeLinkModelFacet = new TypeLinkModelFacetImpl();
		return typeLinkModelFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureLinkModelFacet createFeatureLinkModelFacet() {
		FeatureLinkModelFacetImpl featureLinkModelFacet = new FeatureLinkModelFacetImpl();
		return featureLinkModelFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorAttributes createColorAttributes() {
		ColorAttributesImpl colorAttributes = new ColorAttributesImpl();
		return colorAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeAttributes createShapeAttributes() {
		ShapeAttributesImpl shapeAttributes = new ShapeAttributesImpl();
		return shapeAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultSizeAttributes createDefaultSizeAttributes() {
		DefaultSizeAttributesImpl defaultSizeAttributes = new DefaultSizeAttributesImpl();
		return defaultSizeAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FigureViewmap createFigureViewmap() {
		FigureViewmapImpl figureViewmap = new FigureViewmapImpl();
		return figureViewmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnippetViewmap createSnippetViewmap() {
		SnippetViewmapImpl snippetViewmap = new SnippetViewmapImpl();
		return snippetViewmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InnerClassViewmap createInnerClassViewmap() {
		InnerClassViewmapImpl innerClassViewmap = new InnerClassViewmapImpl();
		return innerClassViewmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueExpression createValueExpression() {
		ValueExpressionImpl valueExpression = new ValueExpressionImpl();
		return valueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenConstraint createGenConstraint() {
		GenConstraintImpl genConstraint = new GenConstraintImpl();
		return genConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Palette createPalette() {
		PaletteImpl palette = new PaletteImpl();
		return palette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeEntry createNodeEntry() {
		NodeEntryImpl nodeEntry = new NodeEntryImpl();
		return nodeEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEntry createLinkEntry() {
		LinkEntryImpl linkEntry = new LinkEntryImpl();
		return linkEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolGroup createToolGroup() {
		ToolGroupImpl toolGroup = new ToolGroupImpl();
		return toolGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeatureSeqInitializer createGenFeatureSeqInitializer() {
		GenFeatureSeqInitializerImpl genFeatureSeqInitializer = new GenFeatureSeqInitializerImpl();
		return genFeatureSeqInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeatureValueSpec createGenFeatureValueSpec() {
		GenFeatureValueSpecImpl genFeatureValueSpec = new GenFeatureValueSpecImpl();
		return genFeatureValueSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenLinkConstraints createGenLinkConstraints() {
		GenLinkConstraintsImpl genLinkConstraints = new GenLinkConstraintsImpl();
		return genLinkConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenAuditContainer createGenAuditContainer() {
		GenAuditContainerImpl genAuditContainer = new GenAuditContainerImpl();
		return genAuditContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenAuditRule createGenAuditRule() {
		GenAuditRuleImpl genAuditRule = new GenAuditRuleImpl();
		return genAuditRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkLabelAlignment createLinkLabelAlignmentFromString(EDataType eDataType, String initialValue) {
		LinkLabelAlignment result = LinkLabelAlignment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkLabelAlignmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenSeverity createGenSeverityFromString(EDataType eDataType, String initialValue) {
		GenSeverity result = GenSeverity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenSeverityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFGenPackage getGMFGenPackage() {
		return (GMFGenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static GMFGenPackage getPackage() {
		return GMFGenPackage.eINSTANCE;
	}

} //GMFGenFactoryImpl

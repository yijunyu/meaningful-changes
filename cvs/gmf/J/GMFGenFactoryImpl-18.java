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
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.gmf.codegen.gmfgen.*;

import org.eclipse.gmf.codegen.gmfgen.BasicNodeViewmap;
import org.eclipse.gmf.codegen.gmfgen.ColorAttributes;
import org.eclipse.gmf.codegen.gmfgen.CompartmentLayoutKind;
import org.eclipse.gmf.codegen.gmfgen.CompartmentPlacementKind;
import org.eclipse.gmf.codegen.gmfgen.DecoratedConnectionViewmap;
import org.eclipse.gmf.codegen.gmfgen.DefaultSizeAttributes;
import org.eclipse.gmf.codegen.gmfgen.FeatureModelFacet;
import org.eclipse.gmf.codegen.gmfgen.GMFGenFactory;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenChildNode;
import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenFeatureSeqInitializer;
import org.eclipse.gmf.codegen.gmfgen.GenFeatureValueSpec;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenLinkLabel;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.GenNodeLabel;
import org.eclipse.gmf.codegen.gmfgen.LinkDecoration;
import org.eclipse.gmf.codegen.gmfgen.LinkEntry;
import org.eclipse.gmf.codegen.gmfgen.LinkLabelAlignment;
import org.eclipse.gmf.codegen.gmfgen.ModelElementSelector;
import org.eclipse.gmf.codegen.gmfgen.NodeEntry;
import org.eclipse.gmf.codegen.gmfgen.Palette;
import org.eclipse.gmf.codegen.gmfgen.ShapeAttributes;
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
			case GMFGenPackage.GEN_DIAGRAM: return createGenDiagram();
			case GMFGenPackage.GEN_NODE: return createGenNode();
			case GMFGenPackage.GEN_COMPARTMENT: return createGenCompartment();
			case GMFGenPackage.GEN_CHILD_NODE: return createGenChildNode();
			case GMFGenPackage.GEN_LINK: return createGenLink();
			case GMFGenPackage.GEN_NODE_LABEL: return createGenNodeLabel();
			case GMFGenPackage.GEN_LINK_LABEL: return createGenLinkLabel();
			case GMFGenPackage.TYPE_MODEL_FACET: return createTypeModelFacet();
			case GMFGenPackage.FEATURE_MODEL_FACET: return createFeatureModelFacet();
			case GMFGenPackage.TYPE_LINK_MODEL_FACET: return createTypeLinkModelFacet();
			case GMFGenPackage.COLOR_ATTRIBUTES: return createColorAttributes();
			case GMFGenPackage.SHAPE_ATTRIBUTES: return createShapeAttributes();
			case GMFGenPackage.DEFAULT_SIZE_ATTRIBUTES: return createDefaultSizeAttributes();
			case GMFGenPackage.BASIC_NODE_VIEWMAP: return createBasicNodeViewmap();
			case GMFGenPackage.DECORATED_CONNECTION_VIEWMAP: return createDecoratedConnectionViewmap();
			case GMFGenPackage.LINK_DECORATION: return createLinkDecoration();
			case GMFGenPackage.DIAGRAM_VIEWMAP: return createDiagramViewmap();
			case GMFGenPackage.COMPARTMENT_VIEWMAP: return createCompartmentViewmap();
			case GMFGenPackage.LABEL_VIEWMAP: return createLabelViewmap();
			case GMFGenPackage.VALUE_EXPRESSION: return createValueExpression();
			case GMFGenPackage.MODEL_ELEMENT_SELECTOR: return createModelElementSelector();
			case GMFGenPackage.PALETTE: return createPalette();
			case GMFGenPackage.NODE_ENTRY: return createNodeEntry();
			case GMFGenPackage.LINK_ENTRY: return createLinkEntry();
			case GMFGenPackage.TOOL_GROUP: return createToolGroup();
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER: return createGenFeatureSeqInitializer();
			case GMFGenPackage.GEN_FEATURE_VALUE_SPEC: return createGenFeatureValueSpec();
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
			case GMFGenPackage.COMPARTMENT_PLACEMENT_KIND: {
				CompartmentPlacementKind result = CompartmentPlacementKind.get(initialValue);
				if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
				return result;
			}
			case GMFGenPackage.COMPARTMENT_LAYOUT_KIND: {
				CompartmentLayoutKind result = CompartmentLayoutKind.get(initialValue);
				if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
				return result;
			}
			case GMFGenPackage.LINK_LABEL_ALIGNMENT: {
				LinkLabelAlignment result = LinkLabelAlignment.get(initialValue);
				if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
				return result;
			}
			case GMFGenPackage.STRING_ARRAY:
				return createStringArrayFromString(eDataType, initialValue);
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
			case GMFGenPackage.COMPARTMENT_PLACEMENT_KIND:
				return instanceValue == null ? null : instanceValue.toString();
			case GMFGenPackage.COMPARTMENT_LAYOUT_KIND:
				return instanceValue == null ? null : instanceValue.toString();
			case GMFGenPackage.LINK_LABEL_ALIGNMENT:
				return instanceValue == null ? null : instanceValue.toString();
			case GMFGenPackage.STRING_ARRAY:
				return convertStringArrayToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public GenNode createGenNode() {
		GenNodeImpl genNode = new GenNodeImpl();
		return genNode;
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
	public GenChildNode createGenChildNode() {
		GenChildNodeImpl genChildNode = new GenChildNodeImpl();
		return genChildNode;
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
	public GenLinkLabel createGenLinkLabel() {
		GenLinkLabelImpl genLinkLabel = new GenLinkLabelImpl();
		return genLinkLabel;
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
	public TypeLinkModelFacet createTypeLinkModelFacet() {
		TypeLinkModelFacetImpl typeLinkModelFacet = new TypeLinkModelFacetImpl();
		return typeLinkModelFacet;
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
	public BasicNodeViewmap createBasicNodeViewmap() {
		BasicNodeViewmapImpl basicNodeViewmap = new BasicNodeViewmapImpl();
		return basicNodeViewmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecoratedConnectionViewmap createDecoratedConnectionViewmap() {
		DecoratedConnectionViewmapImpl decoratedConnectionViewmap = new DecoratedConnectionViewmapImpl();
		return decoratedConnectionViewmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkDecoration createLinkDecoration() {
		LinkDecorationImpl linkDecoration = new LinkDecorationImpl();
		return linkDecoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramViewmap createDiagramViewmap() {
		DiagramViewmapImpl diagramViewmap = new DiagramViewmapImpl();
		return diagramViewmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentViewmap createCompartmentViewmap() {
		CompartmentViewmapImpl compartmentViewmap = new CompartmentViewmapImpl();
		return compartmentViewmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelViewmap createLabelViewmap() {
		LabelViewmapImpl labelViewmap = new LabelViewmapImpl();
		return labelViewmap;
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
	public ModelElementSelector createModelElementSelector() {
		ModelElementSelectorImpl modelElementSelector = new ModelElementSelectorImpl();
		return modelElementSelector;
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
	public String[] createStringArrayFromString(EDataType eDataType, String initialValue) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringArrayToString(EDataType eDataType, Object instanceValue) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.codegen.gmfgen.*;

import org.eclipse.gmf.codegen.gmfgen.Attributes;
import org.eclipse.gmf.codegen.gmfgen.BatchValidation;
import org.eclipse.gmf.codegen.gmfgen.ColorAttributes;
import org.eclipse.gmf.codegen.gmfgen.DefaultSizeAttributes;
import org.eclipse.gmf.codegen.gmfgen.EditPartCandies;
import org.eclipse.gmf.codegen.gmfgen.EditorCandies;
import org.eclipse.gmf.codegen.gmfgen.ElementType;
import org.eclipse.gmf.codegen.gmfgen.EntryBase;
import org.eclipse.gmf.codegen.gmfgen.FeatureLabelModelFacet;
import org.eclipse.gmf.codegen.gmfgen.FeatureLinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.FigureViewmap;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenAuditContainer;
import org.eclipse.gmf.codegen.gmfgen.GenAuditRule;
import org.eclipse.gmf.codegen.gmfgen.GenAuditable;
import org.eclipse.gmf.codegen.gmfgen.GenAuditedMetricTarget;
import org.eclipse.gmf.codegen.gmfgen.GenChildContainer;
import org.eclipse.gmf.codegen.gmfgen.GenChildNode;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenConstraint;
import org.eclipse.gmf.codegen.gmfgen.GenContainerBase;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenDiagramElementTarget;
import org.eclipse.gmf.codegen.gmfgen.GenDomainElementTarget;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.gmfgen.GenEditorView;
import org.eclipse.gmf.codegen.gmfgen.GenElementInitializer;
import org.eclipse.gmf.codegen.gmfgen.GenExpressionInterpreter;
import org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderBase;
import org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer;
import org.eclipse.gmf.codegen.gmfgen.GenExternalNodeLabel;
import org.eclipse.gmf.codegen.gmfgen.GenFeatureSeqInitializer;
import org.eclipse.gmf.codegen.gmfgen.GenFeatureValueSpec;
import org.eclipse.gmf.codegen.gmfgen.GenJavaExpressionProvider;
import org.eclipse.gmf.codegen.gmfgen.GenLabel;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenLinkConstraints;
import org.eclipse.gmf.codegen.gmfgen.GenLinkLabel;
import org.eclipse.gmf.codegen.gmfgen.GenMeasurable;
import org.eclipse.gmf.codegen.gmfgen.GenMetricContainer;
import org.eclipse.gmf.codegen.gmfgen.GenMetricRule;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.GenNodeLabel;
import org.eclipse.gmf.codegen.gmfgen.GenNotationElementTarget;
import org.eclipse.gmf.codegen.gmfgen.GenPlugin;
import org.eclipse.gmf.codegen.gmfgen.GenRuleBase;
import org.eclipse.gmf.codegen.gmfgen.GenRuleContainerBase;
import org.eclipse.gmf.codegen.gmfgen.GenRuleTarget;
import org.eclipse.gmf.codegen.gmfgen.GenTopLevelNode;
import org.eclipse.gmf.codegen.gmfgen.InnerClassViewmap;
import org.eclipse.gmf.codegen.gmfgen.LabelModelFacet;
import org.eclipse.gmf.codegen.gmfgen.LabelOffsetAttributes;
import org.eclipse.gmf.codegen.gmfgen.LinkConstraints;
import org.eclipse.gmf.codegen.gmfgen.LinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.MeasurementUnit;
import org.eclipse.gmf.codegen.gmfgen.MetamodelType;
import org.eclipse.gmf.codegen.gmfgen.ModelFacet;
import org.eclipse.gmf.codegen.gmfgen.NotationType;
import org.eclipse.gmf.codegen.gmfgen.PackageNames;
import org.eclipse.gmf.codegen.gmfgen.Palette;
import org.eclipse.gmf.codegen.gmfgen.ProviderClassNames;
import org.eclipse.gmf.codegen.gmfgen.ResizeConstraints;
import org.eclipse.gmf.codegen.gmfgen.Separator;
import org.eclipse.gmf.codegen.gmfgen.Shortcuts;
import org.eclipse.gmf.codegen.gmfgen.SnippetViewmap;
import org.eclipse.gmf.codegen.gmfgen.SpecializationType;
import org.eclipse.gmf.codegen.gmfgen.ToolEntry;
import org.eclipse.gmf.codegen.gmfgen.ToolGroup;
import org.eclipse.gmf.codegen.gmfgen.ToolGroupItem;
import org.eclipse.gmf.codegen.gmfgen.TypeLinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.TypeModelFacet;
import org.eclipse.gmf.codegen.gmfgen.ValueExpression;
import org.eclipse.gmf.codegen.gmfgen.Viewmap;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage
 * @generated
 */
public class GMFGenSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GMFGenPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFGenSwitch() {
		if (modelPackage == null) {
			modelPackage = GMFGenPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GMFGenPackage.GEN_EDITOR_GENERATOR: {
				GenEditorGenerator genEditorGenerator = (GenEditorGenerator)theEObject;
				Object result = caseGenEditorGenerator(genEditorGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_DIAGRAM: {
				GenDiagram genDiagram = (GenDiagram)theEObject;
				Object result = caseGenDiagram(genDiagram);
				if (result == null) result = caseGenContainerBase(genDiagram);
				if (result == null) result = casePackageNames(genDiagram);
				if (result == null) result = caseProviderClassNames(genDiagram);
				if (result == null) result = caseLinkConstraints(genDiagram);
				if (result == null) result = caseEditPartCandies(genDiagram);
				if (result == null) result = caseEditorCandies(genDiagram);
				if (result == null) result = caseShortcuts(genDiagram);
				if (result == null) result = caseBatchValidation(genDiagram);
				if (result == null) result = caseMeasurementUnit(genDiagram);
				if (result == null) result = caseGenCommonBase(genDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_EDITOR_VIEW: {
				GenEditorView genEditorView = (GenEditorView)theEObject;
				Object result = caseGenEditorView(genEditorView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES: {
				GenDiagramPreferences genDiagramPreferences = (GenDiagramPreferences)theEObject;
				Object result = caseGenDiagramPreferences(genDiagramPreferences);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_FONT: {
				GenFont genFont = (GenFont)theEObject;
				Object result = caseGenFont(genFont);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_STANDARD_FONT: {
				GenStandardFont genStandardFont = (GenStandardFont)theEObject;
				Object result = caseGenStandardFont(genStandardFont);
				if (result == null) result = caseGenFont(genStandardFont);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_CUSTOM_FONT: {
				GenCustomFont genCustomFont = (GenCustomFont)theEObject;
				Object result = caseGenCustomFont(genCustomFont);
				if (result == null) result = caseGenFont(genCustomFont);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_COLOR: {
				GenColor genColor = (GenColor)theEObject;
				Object result = caseGenColor(genColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_RGB_COLOR: {
				GenRGBColor genRGBColor = (GenRGBColor)theEObject;
				Object result = caseGenRGBColor(genRGBColor);
				if (result == null) result = caseGenColor(genRGBColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_CONSTANT_COLOR: {
				GenConstantColor genConstantColor = (GenConstantColor)theEObject;
				Object result = caseGenConstantColor(genConstantColor);
				if (result == null) result = caseGenColor(genConstantColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.BATCH_VALIDATION: {
				BatchValidation batchValidation = (BatchValidation)theEObject;
				Object result = caseBatchValidation(batchValidation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.PROVIDER_CLASS_NAMES: {
				ProviderClassNames providerClassNames = (ProviderClassNames)theEObject;
				Object result = caseProviderClassNames(providerClassNames);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.SHORTCUTS: {
				Shortcuts shortcuts = (Shortcuts)theEObject;
				Object result = caseShortcuts(shortcuts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.PACKAGE_NAMES: {
				PackageNames packageNames = (PackageNames)theEObject;
				Object result = casePackageNames(packageNames);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.LINK_CONSTRAINTS: {
				LinkConstraints linkConstraints = (LinkConstraints)theEObject;
				Object result = caseLinkConstraints(linkConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.EDITOR_CANDIES: {
				EditorCandies editorCandies = (EditorCandies)theEObject;
				Object result = caseEditorCandies(editorCandies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.EDIT_PART_CANDIES: {
				EditPartCandies editPartCandies = (EditPartCandies)theEObject;
				Object result = caseEditPartCandies(editPartCandies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.MEASUREMENT_UNIT: {
				MeasurementUnit measurementUnit = (MeasurementUnit)theEObject;
				Object result = caseMeasurementUnit(measurementUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_PLUGIN: {
				GenPlugin genPlugin = (GenPlugin)theEObject;
				Object result = caseGenPlugin(genPlugin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_COMMON_BASE: {
				GenCommonBase genCommonBase = (GenCommonBase)theEObject;
				Object result = caseGenCommonBase(genCommonBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.BEHAVIOUR: {
				Behaviour behaviour = (Behaviour)theEObject;
				Object result = caseBehaviour(behaviour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.CUSTOM_BEHAVIOUR: {
				CustomBehaviour customBehaviour = (CustomBehaviour)theEObject;
				Object result = caseCustomBehaviour(customBehaviour);
				if (result == null) result = caseBehaviour(customBehaviour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.SHARED_BEHAVIOUR: {
				SharedBehaviour sharedBehaviour = (SharedBehaviour)theEObject;
				Object result = caseSharedBehaviour(sharedBehaviour);
				if (result == null) result = caseBehaviour(sharedBehaviour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR: {
				OpenDiagramBehaviour openDiagramBehaviour = (OpenDiagramBehaviour)theEObject;
				Object result = caseOpenDiagramBehaviour(openDiagramBehaviour);
				if (result == null) result = caseBehaviour(openDiagramBehaviour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_CONTAINER_BASE: {
				GenContainerBase genContainerBase = (GenContainerBase)theEObject;
				Object result = caseGenContainerBase(genContainerBase);
				if (result == null) result = caseGenCommonBase(genContainerBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_CHILD_CONTAINER: {
				GenChildContainer genChildContainer = (GenChildContainer)theEObject;
				Object result = caseGenChildContainer(genChildContainer);
				if (result == null) result = caseGenContainerBase(genChildContainer);
				if (result == null) result = caseGenCommonBase(genChildContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_NODE: {
				GenNode genNode = (GenNode)theEObject;
				Object result = caseGenNode(genNode);
				if (result == null) result = caseGenChildContainer(genNode);
				if (result == null) result = caseGenContainerBase(genNode);
				if (result == null) result = caseGenCommonBase(genNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_TOP_LEVEL_NODE: {
				GenTopLevelNode genTopLevelNode = (GenTopLevelNode)theEObject;
				Object result = caseGenTopLevelNode(genTopLevelNode);
				if (result == null) result = caseGenNode(genTopLevelNode);
				if (result == null) result = caseGenChildContainer(genTopLevelNode);
				if (result == null) result = caseGenContainerBase(genTopLevelNode);
				if (result == null) result = caseGenCommonBase(genTopLevelNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_CHILD_NODE: {
				GenChildNode genChildNode = (GenChildNode)theEObject;
				Object result = caseGenChildNode(genChildNode);
				if (result == null) result = caseGenNode(genChildNode);
				if (result == null) result = caseGenChildContainer(genChildNode);
				if (result == null) result = caseGenContainerBase(genChildNode);
				if (result == null) result = caseGenCommonBase(genChildNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_CHILD_SIDE_AFFIXED_NODE: {
				GenChildSideAffixedNode genChildSideAffixedNode = (GenChildSideAffixedNode)theEObject;
				Object result = caseGenChildSideAffixedNode(genChildSideAffixedNode);
				if (result == null) result = caseGenChildNode(genChildSideAffixedNode);
				if (result == null) result = caseGenNode(genChildSideAffixedNode);
				if (result == null) result = caseGenChildContainer(genChildSideAffixedNode);
				if (result == null) result = caseGenContainerBase(genChildSideAffixedNode);
				if (result == null) result = caseGenCommonBase(genChildSideAffixedNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_CHILD_LABEL_NODE: {
				GenChildLabelNode genChildLabelNode = (GenChildLabelNode)theEObject;
				Object result = caseGenChildLabelNode(genChildLabelNode);
				if (result == null) result = caseGenChildNode(genChildLabelNode);
				if (result == null) result = caseGenNode(genChildLabelNode);
				if (result == null) result = caseGenChildContainer(genChildLabelNode);
				if (result == null) result = caseGenContainerBase(genChildLabelNode);
				if (result == null) result = caseGenCommonBase(genChildLabelNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_COMPARTMENT: {
				GenCompartment genCompartment = (GenCompartment)theEObject;
				Object result = caseGenCompartment(genCompartment);
				if (result == null) result = caseGenChildContainer(genCompartment);
				if (result == null) result = caseGenContainerBase(genCompartment);
				if (result == null) result = caseGenCommonBase(genCompartment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_LINK: {
				GenLink genLink = (GenLink)theEObject;
				Object result = caseGenLink(genLink);
				if (result == null) result = caseGenCommonBase(genLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_LABEL: {
				GenLabel genLabel = (GenLabel)theEObject;
				Object result = caseGenLabel(genLabel);
				if (result == null) result = caseGenCommonBase(genLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_NODE_LABEL: {
				GenNodeLabel genNodeLabel = (GenNodeLabel)theEObject;
				Object result = caseGenNodeLabel(genNodeLabel);
				if (result == null) result = caseGenLabel(genNodeLabel);
				if (result == null) result = caseGenCommonBase(genNodeLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_EXTERNAL_NODE_LABEL: {
				GenExternalNodeLabel genExternalNodeLabel = (GenExternalNodeLabel)theEObject;
				Object result = caseGenExternalNodeLabel(genExternalNodeLabel);
				if (result == null) result = caseGenNodeLabel(genExternalNodeLabel);
				if (result == null) result = caseGenLabel(genExternalNodeLabel);
				if (result == null) result = caseGenCommonBase(genExternalNodeLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_LINK_LABEL: {
				GenLinkLabel genLinkLabel = (GenLinkLabel)theEObject;
				Object result = caseGenLinkLabel(genLinkLabel);
				if (result == null) result = caseGenLabel(genLinkLabel);
				if (result == null) result = caseGenCommonBase(genLinkLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.ELEMENT_TYPE: {
				ElementType elementType = (ElementType)theEObject;
				Object result = caseElementType(elementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.METAMODEL_TYPE: {
				MetamodelType metamodelType = (MetamodelType)theEObject;
				Object result = caseMetamodelType(metamodelType);
				if (result == null) result = caseElementType(metamodelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.SPECIALIZATION_TYPE: {
				SpecializationType specializationType = (SpecializationType)theEObject;
				Object result = caseSpecializationType(specializationType);
				if (result == null) result = caseElementType(specializationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.NOTATION_TYPE: {
				NotationType notationType = (NotationType)theEObject;
				Object result = caseNotationType(notationType);
				if (result == null) result = caseElementType(notationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.MODEL_FACET: {
				ModelFacet modelFacet = (ModelFacet)theEObject;
				Object result = caseModelFacet(modelFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.LINK_MODEL_FACET: {
				LinkModelFacet linkModelFacet = (LinkModelFacet)theEObject;
				Object result = caseLinkModelFacet(linkModelFacet);
				if (result == null) result = caseModelFacet(linkModelFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.LABEL_MODEL_FACET: {
				LabelModelFacet labelModelFacet = (LabelModelFacet)theEObject;
				Object result = caseLabelModelFacet(labelModelFacet);
				if (result == null) result = caseModelFacet(labelModelFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.TYPE_MODEL_FACET: {
				TypeModelFacet typeModelFacet = (TypeModelFacet)theEObject;
				Object result = caseTypeModelFacet(typeModelFacet);
				if (result == null) result = caseModelFacet(typeModelFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.TYPE_LINK_MODEL_FACET: {
				TypeLinkModelFacet typeLinkModelFacet = (TypeLinkModelFacet)theEObject;
				Object result = caseTypeLinkModelFacet(typeLinkModelFacet);
				if (result == null) result = caseTypeModelFacet(typeLinkModelFacet);
				if (result == null) result = caseLinkModelFacet(typeLinkModelFacet);
				if (result == null) result = caseModelFacet(typeLinkModelFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.FEATURE_LINK_MODEL_FACET: {
				FeatureLinkModelFacet featureLinkModelFacet = (FeatureLinkModelFacet)theEObject;
				Object result = caseFeatureLinkModelFacet(featureLinkModelFacet);
				if (result == null) result = caseLinkModelFacet(featureLinkModelFacet);
				if (result == null) result = caseModelFacet(featureLinkModelFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET: {
				FeatureLabelModelFacet featureLabelModelFacet = (FeatureLabelModelFacet)theEObject;
				Object result = caseFeatureLabelModelFacet(featureLabelModelFacet);
				if (result == null) result = caseLabelModelFacet(featureLabelModelFacet);
				if (result == null) result = caseModelFacet(featureLabelModelFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.DESIGN_LABEL_MODEL_FACET: {
				DesignLabelModelFacet designLabelModelFacet = (DesignLabelModelFacet)theEObject;
				Object result = caseDesignLabelModelFacet(designLabelModelFacet);
				if (result == null) result = caseLabelModelFacet(designLabelModelFacet);
				if (result == null) result = caseModelFacet(designLabelModelFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.ATTRIBUTES: {
				Attributes attributes = (Attributes)theEObject;
				Object result = caseAttributes(attributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.COLOR_ATTRIBUTES: {
				ColorAttributes colorAttributes = (ColorAttributes)theEObject;
				Object result = caseColorAttributes(colorAttributes);
				if (result == null) result = caseAttributes(colorAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.STYLE_ATTRIBUTES: {
				StyleAttributes styleAttributes = (StyleAttributes)theEObject;
				Object result = caseStyleAttributes(styleAttributes);
				if (result == null) result = caseAttributes(styleAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.RESIZE_CONSTRAINTS: {
				ResizeConstraints resizeConstraints = (ResizeConstraints)theEObject;
				Object result = caseResizeConstraints(resizeConstraints);
				if (result == null) result = caseAttributes(resizeConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.DEFAULT_SIZE_ATTRIBUTES: {
				DefaultSizeAttributes defaultSizeAttributes = (DefaultSizeAttributes)theEObject;
				Object result = caseDefaultSizeAttributes(defaultSizeAttributes);
				if (result == null) result = caseAttributes(defaultSizeAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.LABEL_OFFSET_ATTRIBUTES: {
				LabelOffsetAttributes labelOffsetAttributes = (LabelOffsetAttributes)theEObject;
				Object result = caseLabelOffsetAttributes(labelOffsetAttributes);
				if (result == null) result = caseAttributes(labelOffsetAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.VIEWMAP: {
				Viewmap viewmap = (Viewmap)theEObject;
				Object result = caseViewmap(viewmap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.FIGURE_VIEWMAP: {
				FigureViewmap figureViewmap = (FigureViewmap)theEObject;
				Object result = caseFigureViewmap(figureViewmap);
				if (result == null) result = caseViewmap(figureViewmap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.SNIPPET_VIEWMAP: {
				SnippetViewmap snippetViewmap = (SnippetViewmap)theEObject;
				Object result = caseSnippetViewmap(snippetViewmap);
				if (result == null) result = caseViewmap(snippetViewmap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.INNER_CLASS_VIEWMAP: {
				InnerClassViewmap innerClassViewmap = (InnerClassViewmap)theEObject;
				Object result = caseInnerClassViewmap(innerClassViewmap);
				if (result == null) result = caseViewmap(innerClassViewmap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.PARENT_ASSIGNED_VIEWMAP: {
				ParentAssignedViewmap parentAssignedViewmap = (ParentAssignedViewmap)theEObject;
				Object result = caseParentAssignedViewmap(parentAssignedViewmap);
				if (result == null) result = caseViewmap(parentAssignedViewmap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.VALUE_EXPRESSION: {
				ValueExpression valueExpression = (ValueExpression)theEObject;
				Object result = caseValueExpression(valueExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_CONSTRAINT: {
				GenConstraint genConstraint = (GenConstraint)theEObject;
				Object result = caseGenConstraint(genConstraint);
				if (result == null) result = caseValueExpression(genConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.PALETTE: {
				Palette palette = (Palette)theEObject;
				Object result = casePalette(palette);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.ENTRY_BASE: {
				EntryBase entryBase = (EntryBase)theEObject;
				Object result = caseEntryBase(entryBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.ABSTRACT_TOOL_ENTRY: {
				AbstractToolEntry abstractToolEntry = (AbstractToolEntry)theEObject;
				Object result = caseAbstractToolEntry(abstractToolEntry);
				if (result == null) result = caseEntryBase(abstractToolEntry);
				if (result == null) result = caseToolGroupItem(abstractToolEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.TOOL_ENTRY: {
				ToolEntry toolEntry = (ToolEntry)theEObject;
				Object result = caseToolEntry(toolEntry);
				if (result == null) result = caseAbstractToolEntry(toolEntry);
				if (result == null) result = caseEntryBase(toolEntry);
				if (result == null) result = caseToolGroupItem(toolEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.STANDARD_ENTRY: {
				StandardEntry standardEntry = (StandardEntry)theEObject;
				Object result = caseStandardEntry(standardEntry);
				if (result == null) result = caseAbstractToolEntry(standardEntry);
				if (result == null) result = caseEntryBase(standardEntry);
				if (result == null) result = caseToolGroupItem(standardEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.TOOL_GROUP_ITEM: {
				ToolGroupItem toolGroupItem = (ToolGroupItem)theEObject;
				Object result = caseToolGroupItem(toolGroupItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.SEPARATOR: {
				Separator separator = (Separator)theEObject;
				Object result = caseSeparator(separator);
				if (result == null) result = caseToolGroupItem(separator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.TOOL_GROUP: {
				ToolGroup toolGroup = (ToolGroup)theEObject;
				Object result = caseToolGroup(toolGroup);
				if (result == null) result = caseEntryBase(toolGroup);
				if (result == null) result = caseToolGroupItem(toolGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_ELEMENT_INITIALIZER: {
				GenElementInitializer genElementInitializer = (GenElementInitializer)theEObject;
				Object result = caseGenElementInitializer(genElementInitializer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER: {
				GenFeatureSeqInitializer genFeatureSeqInitializer = (GenFeatureSeqInitializer)theEObject;
				Object result = caseGenFeatureSeqInitializer(genFeatureSeqInitializer);
				if (result == null) result = caseGenElementInitializer(genFeatureSeqInitializer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_FEATURE_VALUE_SPEC: {
				GenFeatureValueSpec genFeatureValueSpec = (GenFeatureValueSpec)theEObject;
				Object result = caseGenFeatureValueSpec(genFeatureValueSpec);
				if (result == null) result = caseValueExpression(genFeatureValueSpec);
				if (result == null) result = caseGenFeatureInitializer(genFeatureValueSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_REFERENCE_NEW_ELEMENT_SPEC: {
				GenReferenceNewElementSpec genReferenceNewElementSpec = (GenReferenceNewElementSpec)theEObject;
				Object result = caseGenReferenceNewElementSpec(genReferenceNewElementSpec);
				if (result == null) result = caseGenFeatureInitializer(genReferenceNewElementSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_FEATURE_INITIALIZER: {
				GenFeatureInitializer genFeatureInitializer = (GenFeatureInitializer)theEObject;
				Object result = caseGenFeatureInitializer(genFeatureInitializer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_LINK_CONSTRAINTS: {
				GenLinkConstraints genLinkConstraints = (GenLinkConstraints)theEObject;
				Object result = caseGenLinkConstraints(genLinkConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_RULE_CONTAINER_BASE: {
				GenRuleContainerBase genRuleContainerBase = (GenRuleContainerBase)theEObject;
				Object result = caseGenRuleContainerBase(genRuleContainerBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_AUDIT_CONTAINER: {
				GenAuditContainer genAuditContainer = (GenAuditContainer)theEObject;
				Object result = caseGenAuditContainer(genAuditContainer);
				if (result == null) result = caseGenRuleContainerBase(genAuditContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_RULE_BASE: {
				GenRuleBase genRuleBase = (GenRuleBase)theEObject;
				Object result = caseGenRuleBase(genRuleBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_AUDIT_RULE: {
				GenAuditRule genAuditRule = (GenAuditRule)theEObject;
				Object result = caseGenAuditRule(genAuditRule);
				if (result == null) result = caseGenRuleBase(genAuditRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_RULE_TARGET: {
				GenRuleTarget genRuleTarget = (GenRuleTarget)theEObject;
				Object result = caseGenRuleTarget(genRuleTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_DOMAIN_ELEMENT_TARGET: {
				GenDomainElementTarget genDomainElementTarget = (GenDomainElementTarget)theEObject;
				Object result = caseGenDomainElementTarget(genDomainElementTarget);
				if (result == null) result = caseGenAuditable(genDomainElementTarget);
				if (result == null) result = caseGenMeasurable(genDomainElementTarget);
				if (result == null) result = caseGenRuleTarget(genDomainElementTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_DIAGRAM_ELEMENT_TARGET: {
				GenDiagramElementTarget genDiagramElementTarget = (GenDiagramElementTarget)theEObject;
				Object result = caseGenDiagramElementTarget(genDiagramElementTarget);
				if (result == null) result = caseGenAuditable(genDiagramElementTarget);
				if (result == null) result = caseGenMeasurable(genDiagramElementTarget);
				if (result == null) result = caseGenRuleTarget(genDiagramElementTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_DOMAIN_ATTRIBUTE_TARGET: {
				GenDomainAttributeTarget genDomainAttributeTarget = (GenDomainAttributeTarget)theEObject;
				Object result = caseGenDomainAttributeTarget(genDomainAttributeTarget);
				if (result == null) result = caseGenAuditable(genDomainAttributeTarget);
				if (result == null) result = caseGenRuleTarget(genDomainAttributeTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_NOTATION_ELEMENT_TARGET: {
				GenNotationElementTarget genNotationElementTarget = (GenNotationElementTarget)theEObject;
				Object result = caseGenNotationElementTarget(genNotationElementTarget);
				if (result == null) result = caseGenAuditable(genNotationElementTarget);
				if (result == null) result = caseGenMeasurable(genNotationElementTarget);
				if (result == null) result = caseGenRuleTarget(genNotationElementTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_METRIC_CONTAINER: {
				GenMetricContainer genMetricContainer = (GenMetricContainer)theEObject;
				Object result = caseGenMetricContainer(genMetricContainer);
				if (result == null) result = caseGenRuleContainerBase(genMetricContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_METRIC_RULE: {
				GenMetricRule genMetricRule = (GenMetricRule)theEObject;
				Object result = caseGenMetricRule(genMetricRule);
				if (result == null) result = caseGenRuleBase(genMetricRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_AUDITED_METRIC_TARGET: {
				GenAuditedMetricTarget genAuditedMetricTarget = (GenAuditedMetricTarget)theEObject;
				Object result = caseGenAuditedMetricTarget(genAuditedMetricTarget);
				if (result == null) result = caseGenAuditable(genAuditedMetricTarget);
				if (result == null) result = caseGenRuleTarget(genAuditedMetricTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_AUDITABLE: {
				GenAuditable genAuditable = (GenAuditable)theEObject;
				Object result = caseGenAuditable(genAuditable);
				if (result == null) result = caseGenRuleTarget(genAuditable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_MEASURABLE: {
				GenMeasurable genMeasurable = (GenMeasurable)theEObject;
				Object result = caseGenMeasurable(genMeasurable);
				if (result == null) result = caseGenRuleTarget(genMeasurable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER: {
				GenExpressionProviderContainer genExpressionProviderContainer = (GenExpressionProviderContainer)theEObject;
				Object result = caseGenExpressionProviderContainer(genExpressionProviderContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_EXPRESSION_PROVIDER_BASE: {
				GenExpressionProviderBase genExpressionProviderBase = (GenExpressionProviderBase)theEObject;
				Object result = caseGenExpressionProviderBase(genExpressionProviderBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_JAVA_EXPRESSION_PROVIDER: {
				GenJavaExpressionProvider genJavaExpressionProvider = (GenJavaExpressionProvider)theEObject;
				Object result = caseGenJavaExpressionProvider(genJavaExpressionProvider);
				if (result == null) result = caseGenExpressionProviderBase(genJavaExpressionProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_EXPRESSION_INTERPRETER: {
				GenExpressionInterpreter genExpressionInterpreter = (GenExpressionInterpreter)theEObject;
				Object result = caseGenExpressionInterpreter(genExpressionInterpreter);
				if (result == null) result = caseGenExpressionProviderBase(genExpressionInterpreter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_NAVIGATOR: {
				GenNavigator genNavigator = (GenNavigator)theEObject;
				Object result = caseGenNavigator(genNavigator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE: {
				GenNavigatorChildReference genNavigatorChildReference = (GenNavigatorChildReference)theEObject;
				Object result = caseGenNavigatorChildReference(genNavigatorChildReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_PROPERTY_SHEET: {
				GenPropertySheet genPropertySheet = (GenPropertySheet)theEObject;
				Object result = caseGenPropertySheet(genPropertySheet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_PROPERTY_TAB: {
				GenPropertyTab genPropertyTab = (GenPropertyTab)theEObject;
				Object result = caseGenPropertyTab(genPropertyTab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_STANDARD_PROPERTY_TAB: {
				GenStandardPropertyTab genStandardPropertyTab = (GenStandardPropertyTab)theEObject;
				Object result = caseGenStandardPropertyTab(genStandardPropertyTab);
				if (result == null) result = caseGenPropertyTab(genStandardPropertyTab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_CUSTOM_PROPERTY_TAB: {
				GenCustomPropertyTab genCustomPropertyTab = (GenCustomPropertyTab)theEObject;
				Object result = caseGenCustomPropertyTab(genCustomPropertyTab);
				if (result == null) result = caseGenPropertyTab(genCustomPropertyTab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_PROPERTY_TAB_FILTER: {
				GenPropertyTabFilter genPropertyTabFilter = (GenPropertyTabFilter)theEObject;
				Object result = caseGenPropertyTabFilter(genPropertyTabFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.TYPE_TAB_FILTER: {
				TypeTabFilter typeTabFilter = (TypeTabFilter)theEObject;
				Object result = caseTypeTabFilter(typeTabFilter);
				if (result == null) result = caseGenPropertyTabFilter(typeTabFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.CUSTOM_TAB_FILTER: {
				CustomTabFilter customTabFilter = (CustomTabFilter)theEObject;
				Object result = caseCustomTabFilter(customTabFilter);
				if (result == null) result = caseGenPropertyTabFilter(customTabFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_CONTRIBUTION_ITEM: {
				GenContributionItem genContributionItem = (GenContributionItem)theEObject;
				Object result = caseGenContributionItem(genContributionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_SHARED_CONTRIBUTION_ITEM: {
				GenSharedContributionItem genSharedContributionItem = (GenSharedContributionItem)theEObject;
				Object result = caseGenSharedContributionItem(genSharedContributionItem);
				if (result == null) result = caseGenContributionItem(genSharedContributionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_GROUP_MARKER: {
				GenGroupMarker genGroupMarker = (GenGroupMarker)theEObject;
				Object result = caseGenGroupMarker(genGroupMarker);
				if (result == null) result = caseGenContributionItem(genGroupMarker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_SEPARATOR: {
				GenSeparator genSeparator = (GenSeparator)theEObject;
				Object result = caseGenSeparator(genSeparator);
				if (result == null) result = caseGenContributionItem(genSeparator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_ACTION_FACTORY_CONTRIBUTION_ITEM: {
				GenActionFactoryContributionItem genActionFactoryContributionItem = (GenActionFactoryContributionItem)theEObject;
				Object result = caseGenActionFactoryContributionItem(genActionFactoryContributionItem);
				if (result == null) result = caseGenContributionItem(genActionFactoryContributionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_CONTRIBUTION_MANAGER: {
				GenContributionManager genContributionManager = (GenContributionManager)theEObject;
				Object result = caseGenContributionManager(genContributionManager);
				if (result == null) result = caseGenContributionItem(genContributionManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_MENU_MANAGER: {
				GenMenuManager genMenuManager = (GenMenuManager)theEObject;
				Object result = caseGenMenuManager(genMenuManager);
				if (result == null) result = caseGenContributionManager(genMenuManager);
				if (result == null) result = caseGenContributionItem(genMenuManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_TOOL_BAR_MANAGER: {
				GenToolBarManager genToolBarManager = (GenToolBarManager)theEObject;
				Object result = caseGenToolBarManager(genToolBarManager);
				if (result == null) result = caseGenContributionManager(genToolBarManager);
				if (result == null) result = caseGenContributionItem(genToolBarManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_APPLICATION: {
				GenApplication genApplication = (GenApplication)theEObject;
				Object result = caseGenApplication(genApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Editor Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Editor Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenEditorGenerator(GenEditorGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenDiagram(GenDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Editor View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Editor View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenEditorView(GenEditorView object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Diagram Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Diagram Preferences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenDiagramPreferences(GenDiagramPreferences object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Font</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Font</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenFont(GenFont object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Standard Font</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Standard Font</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenStandardFont(GenStandardFont object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Custom Font</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Custom Font</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenCustomFont(GenCustomFont object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenColor(GenColor object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen RGB Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen RGB Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenRGBColor(GenRGBColor object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Constant Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Constant Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenConstantColor(GenConstantColor object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Batch Validation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Batch Validation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBatchValidation(BatchValidation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Provider Class Names</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Provider Class Names</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProviderClassNames(ProviderClassNames object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Shortcuts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Shortcuts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseShortcuts(Shortcuts object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Package Names</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Package Names</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePackageNames(PackageNames object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Link Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Link Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLinkConstraints(LinkConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Editor Candies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Editor Candies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEditorCandies(EditorCandies object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Edit Part Candies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Edit Part Candies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEditPartCandies(EditPartCandies object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Measurement Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Measurement Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMeasurementUnit(MeasurementUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Plugin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenPlugin(GenPlugin object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseElementType(ElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Metamodel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Metamodel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMetamodelType(MetamodelType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Specialization Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Specialization Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSpecializationType(SpecializationType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Notation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Notation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNotationType(NotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Common Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Common Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenCommonBase(GenCommonBase object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Behaviour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBehaviour(Behaviour object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Custom Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Custom Behaviour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCustomBehaviour(CustomBehaviour object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Shared Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Shared Behaviour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSharedBehaviour(SharedBehaviour object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Open Diagram Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Open Diagram Behaviour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOpenDiagramBehaviour(OpenDiagramBehaviour object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Container Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Container Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenContainerBase(GenContainerBase object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenNode(GenNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Top Level Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Top Level Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenTopLevelNode(GenTopLevelNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Child Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Child Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenChildNode(GenChildNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Child Side Affixed Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Child Side Affixed Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenChildSideAffixedNode(GenChildSideAffixedNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Child Label Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Child Label Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenChildLabelNode(GenChildLabelNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenCompartment(GenCompartment object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Child Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Child Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenChildContainer(GenChildContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenLink(GenLink object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenLabel(GenLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Node Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Node Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenNodeLabel(GenNodeLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen External Node Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen External Node Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenExternalNodeLabel(GenExternalNodeLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Link Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Link Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenLinkLabel(GenLinkLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Model Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModelFacet(ModelFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Link Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Link Model Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLinkModelFacet(LinkModelFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Label Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Label Model Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLabelModelFacet(LabelModelFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Type Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Type Model Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypeModelFacet(TypeModelFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Feature Label Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Feature Label Model Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFeatureLabelModelFacet(FeatureLabelModelFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Design Label Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Design Label Model Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDesignLabelModelFacet(DesignLabelModelFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Type Link Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Type Link Model Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypeLinkModelFacet(TypeLinkModelFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Feature Link Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Feature Link Model Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFeatureLinkModelFacet(FeatureLinkModelFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Viewmap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Viewmap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseViewmap(Viewmap object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAttributes(Attributes object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Color Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Color Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseColorAttributes(ColorAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Style Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Style Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStyleAttributes(StyleAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Resize Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Resize Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseResizeConstraints(ResizeConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Default Size Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Default Size Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDefaultSizeAttributes(DefaultSizeAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Label Offset Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Label Offset Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLabelOffsetAttributes(LabelOffsetAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Figure Viewmap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Figure Viewmap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFigureViewmap(FigureViewmap object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Snippet Viewmap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Snippet Viewmap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSnippetViewmap(SnippetViewmap object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Inner Class Viewmap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Inner Class Viewmap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInnerClassViewmap(InnerClassViewmap object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Parent Assigned Viewmap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Parent Assigned Viewmap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseParentAssignedViewmap(ParentAssignedViewmap object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Palette</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Palette</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePalette(Palette object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Entry Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Entry Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEntryBase(EntryBase object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Abstract Tool Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Abstract Tool Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractToolEntry(AbstractToolEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Tool Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Tool Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseToolEntry(ToolEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Standard Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Standard Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStandardEntry(StandardEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Tool Group Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Tool Group Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseToolGroupItem(ToolGroupItem object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Separator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Separator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSeparator(Separator object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Tool Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Tool Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseToolGroup(ToolGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Element Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Element Initializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenElementInitializer(GenElementInitializer object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Feature Seq Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Feature Seq Initializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenFeatureSeqInitializer(GenFeatureSeqInitializer object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Feature Value Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Feature Value Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenFeatureValueSpec(GenFeatureValueSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Reference New Element Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Reference New Element Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenReferenceNewElementSpec(GenReferenceNewElementSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Feature Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Feature Initializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenFeatureInitializer(GenFeatureInitializer object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Link Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Link Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenLinkConstraints(GenLinkConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Rule Container Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Rule Container Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenRuleContainerBase(GenRuleContainerBase object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Audit Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Audit Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenAuditContainer(GenAuditContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Audit Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Audit Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenAuditRule(GenAuditRule object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Rule Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Rule Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenRuleTarget(GenRuleTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Domain Element Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Domain Element Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenDomainElementTarget(GenDomainElementTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Diagram Element Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Diagram Element Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenDiagramElementTarget(GenDiagramElementTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Domain Attribute Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Domain Attribute Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenDomainAttributeTarget(GenDomainAttributeTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Notation Element Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Notation Element Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenNotationElementTarget(GenNotationElementTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Metric Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Metric Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenMetricContainer(GenMetricContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Metric Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Metric Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenMetricRule(GenMetricRule object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Audited Metric Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Audited Metric Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenAuditedMetricTarget(GenAuditedMetricTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Auditable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Auditable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenAuditable(GenAuditable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Measurable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Measurable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenMeasurable(GenMeasurable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Expression Provider Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Expression Provider Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenExpressionProviderContainer(GenExpressionProviderContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Expression Provider Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Expression Provider Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenExpressionProviderBase(GenExpressionProviderBase object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Java Expression Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Java Expression Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenJavaExpressionProvider(GenJavaExpressionProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Expression Interpreter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Expression Interpreter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenExpressionInterpreter(GenExpressionInterpreter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Navigator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Navigator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenNavigator(GenNavigator object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Navigator Child Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Navigator Child Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenNavigatorChildReference(GenNavigatorChildReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Property Sheet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Property Sheet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenPropertySheet(GenPropertySheet object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Property Tab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Property Tab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenPropertyTab(GenPropertyTab object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Standard Property Tab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Standard Property Tab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenStandardPropertyTab(GenStandardPropertyTab object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Custom Property Tab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Custom Property Tab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenCustomPropertyTab(GenCustomPropertyTab object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Property Tab Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Property Tab Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenPropertyTabFilter(GenPropertyTabFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Type Tab Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Type Tab Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypeTabFilter(TypeTabFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Custom Tab Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Custom Tab Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCustomTabFilter(CustomTabFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Contribution Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Contribution Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenContributionItem(GenContributionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Shared Contribution Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Shared Contribution Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenSharedContributionItem(GenSharedContributionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Group Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Group Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenGroupMarker(GenGroupMarker object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Separator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Separator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenSeparator(GenSeparator object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Action Factory Contribution Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Action Factory Contribution Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenActionFactoryContributionItem(GenActionFactoryContributionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Contribution Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Contribution Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenContributionManager(GenContributionManager object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Menu Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Menu Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenMenuManager(GenMenuManager object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Tool Bar Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Tool Bar Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenToolBarManager(GenToolBarManager object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenApplication(GenApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Rule Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Rule Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenRuleBase(GenRuleBase object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Value Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Value Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseValueExpression(ValueExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenConstraint(GenConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //GMFGenSwitch
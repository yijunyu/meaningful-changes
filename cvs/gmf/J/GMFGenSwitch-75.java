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
public class GMFGenSwitch<T> {
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
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GMFGenPackage.GEN_EDITOR_GENERATOR: {
				GenEditorGenerator genEditorGenerator = (GenEditorGenerator)theEObject;
				T result = caseGenEditorGenerator(genEditorGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_DIAGRAM: {
				GenDiagram genDiagram = (GenDiagram)theEObject;
				T result = caseGenDiagram(genDiagram);
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
				T result = caseGenEditorView(genEditorView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_PREFERENCE_PAGE: {
				GenPreferencePage genPreferencePage = (GenPreferencePage)theEObject;
				T result = caseGenPreferencePage(genPreferencePage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_CUSTOM_PREFERENCE_PAGE: {
				GenCustomPreferencePage genCustomPreferencePage = (GenCustomPreferencePage)theEObject;
				T result = caseGenCustomPreferencePage(genCustomPreferencePage);
				if (result == null) result = caseGenPreferencePage(genCustomPreferencePage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_STANDARD_PREFERENCE_PAGE: {
				GenStandardPreferencePage genStandardPreferencePage = (GenStandardPreferencePage)theEObject;
				T result = caseGenStandardPreferencePage(genStandardPreferencePage);
				if (result == null) result = caseGenPreferencePage(genStandardPreferencePage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES: {
				GenDiagramPreferences genDiagramPreferences = (GenDiagramPreferences)theEObject;
				T result = caseGenDiagramPreferences(genDiagramPreferences);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_FONT: {
				GenFont genFont = (GenFont)theEObject;
				T result = caseGenFont(genFont);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_STANDARD_FONT: {
				GenStandardFont genStandardFont = (GenStandardFont)theEObject;
				T result = caseGenStandardFont(genStandardFont);
				if (result == null) result = caseGenFont(genStandardFont);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_CUSTOM_FONT: {
				GenCustomFont genCustomFont = (GenCustomFont)theEObject;
				T result = caseGenCustomFont(genCustomFont);
				if (result == null) result = caseGenFont(genCustomFont);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_COLOR: {
				GenColor genColor = (GenColor)theEObject;
				T result = caseGenColor(genColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_RGB_COLOR: {
				GenRGBColor genRGBColor = (GenRGBColor)theEObject;
				T result = caseGenRGBColor(genRGBColor);
				if (result == null) result = caseGenColor(genRGBColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_CONSTANT_COLOR: {
				GenConstantColor genConstantColor = (GenConstantColor)theEObject;
				T result = caseGenConstantColor(genConstantColor);
				if (result == null) result = caseGenColor(genConstantColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.BATCH_VALIDATION: {
				BatchValidation batchValidation = (BatchValidation)theEObject;
				T result = caseBatchValidation(batchValidation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.PROVIDER_CLASS_NAMES: {
				ProviderClassNames providerClassNames = (ProviderClassNames)theEObject;
				T result = caseProviderClassNames(providerClassNames);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.SHORTCUTS: {
				Shortcuts shortcuts = (Shortcuts)theEObject;
				T result = caseShortcuts(shortcuts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.PACKAGE_NAMES: {
				PackageNames packageNames = (PackageNames)theEObject;
				T result = casePackageNames(packageNames);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.LINK_CONSTRAINTS: {
				LinkConstraints linkConstraints = (LinkConstraints)theEObject;
				T result = caseLinkConstraints(linkConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.EDITOR_CANDIES: {
				EditorCandies editorCandies = (EditorCandies)theEObject;
				T result = caseEditorCandies(editorCandies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.EDIT_PART_CANDIES: {
				EditPartCandies editPartCandies = (EditPartCandies)theEObject;
				T result = caseEditPartCandies(editPartCandies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.MEASUREMENT_UNIT: {
				MeasurementUnit measurementUnit = (MeasurementUnit)theEObject;
				T result = caseMeasurementUnit(measurementUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_DIAGRAM_UPDATER: {
				GenDiagramUpdater genDiagramUpdater = (GenDiagramUpdater)theEObject;
				T result = caseGenDiagramUpdater(genDiagramUpdater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_PLUGIN: {
				GenPlugin genPlugin = (GenPlugin)theEObject;
				T result = caseGenPlugin(genPlugin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.DYNAMIC_MODEL_ACCESS: {
				DynamicModelAccess dynamicModelAccess = (DynamicModelAccess)theEObject;
				T result = caseDynamicModelAccess(dynamicModelAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_COMMON_BASE: {
				GenCommonBase genCommonBase = (GenCommonBase)theEObject;
				T result = caseGenCommonBase(genCommonBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.BEHAVIOUR: {
				Behaviour behaviour = (Behaviour)theEObject;
				T result = caseBehaviour(behaviour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.CUSTOM_BEHAVIOUR: {
				CustomBehaviour customBehaviour = (CustomBehaviour)theEObject;
				T result = caseCustomBehaviour(customBehaviour);
				if (result == null) result = caseBehaviour(customBehaviour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.SHARED_BEHAVIOUR: {
				SharedBehaviour sharedBehaviour = (SharedBehaviour)theEObject;
				T result = caseSharedBehaviour(sharedBehaviour);
				if (result == null) result = caseBehaviour(sharedBehaviour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR: {
				OpenDiagramBehaviour openDiagramBehaviour = (OpenDiagramBehaviour)theEObject;
				T result = caseOpenDiagramBehaviour(openDiagramBehaviour);
				if (result == null) result = caseBehaviour(openDiagramBehaviour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_CONTAINER_BASE: {
				GenContainerBase genContainerBase = (GenContainerBase)theEObject;
				T result = caseGenContainerBase(genContainerBase);
				if (result == null) result = caseGenCommonBase(genContainerBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_CHILD_CONTAINER: {
				GenChildContainer genChildContainer = (GenChildContainer)theEObject;
				T result = caseGenChildContainer(genChildContainer);
				if (result == null) result = caseGenContainerBase(genChildContainer);
				if (result == null) result = caseGenCommonBase(genChildContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_NODE: {
				GenNode genNode = (GenNode)theEObject;
				T result = caseGenNode(genNode);
				if (result == null) result = caseGenChildContainer(genNode);
				if (result == null) result = caseGenLinkEnd(genNode);
				if (result == null) result = caseGenContainerBase(genNode);
				if (result == null) result = caseGenCommonBase(genNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_TOP_LEVEL_NODE: {
				GenTopLevelNode genTopLevelNode = (GenTopLevelNode)theEObject;
				T result = caseGenTopLevelNode(genTopLevelNode);
				if (result == null) result = caseGenNode(genTopLevelNode);
				if (result == null) result = caseGenChildContainer(genTopLevelNode);
				if (result == null) result = caseGenLinkEnd(genTopLevelNode);
				if (result == null) result = caseGenContainerBase(genTopLevelNode);
				if (result == null) result = caseGenCommonBase(genTopLevelNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_CHILD_NODE: {
				GenChildNode genChildNode = (GenChildNode)theEObject;
				T result = caseGenChildNode(genChildNode);
				if (result == null) result = caseGenNode(genChildNode);
				if (result == null) result = caseGenChildContainer(genChildNode);
				if (result == null) result = caseGenLinkEnd(genChildNode);
				if (result == null) result = caseGenContainerBase(genChildNode);
				if (result == null) result = caseGenCommonBase(genChildNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_CHILD_SIDE_AFFIXED_NODE: {
				GenChildSideAffixedNode genChildSideAffixedNode = (GenChildSideAffixedNode)theEObject;
				T result = caseGenChildSideAffixedNode(genChildSideAffixedNode);
				if (result == null) result = caseGenChildNode(genChildSideAffixedNode);
				if (result == null) result = caseGenNode(genChildSideAffixedNode);
				if (result == null) result = caseGenChildContainer(genChildSideAffixedNode);
				if (result == null) result = caseGenLinkEnd(genChildSideAffixedNode);
				if (result == null) result = caseGenContainerBase(genChildSideAffixedNode);
				if (result == null) result = caseGenCommonBase(genChildSideAffixedNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_CHILD_LABEL_NODE: {
				GenChildLabelNode genChildLabelNode = (GenChildLabelNode)theEObject;
				T result = caseGenChildLabelNode(genChildLabelNode);
				if (result == null) result = caseGenChildNode(genChildLabelNode);
				if (result == null) result = caseGenNode(genChildLabelNode);
				if (result == null) result = caseGenChildContainer(genChildLabelNode);
				if (result == null) result = caseGenLinkEnd(genChildLabelNode);
				if (result == null) result = caseGenContainerBase(genChildLabelNode);
				if (result == null) result = caseGenCommonBase(genChildLabelNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_COMPARTMENT: {
				GenCompartment genCompartment = (GenCompartment)theEObject;
				T result = caseGenCompartment(genCompartment);
				if (result == null) result = caseGenChildContainer(genCompartment);
				if (result == null) result = caseGenContainerBase(genCompartment);
				if (result == null) result = caseGenCommonBase(genCompartment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_LINK: {
				GenLink genLink = (GenLink)theEObject;
				T result = caseGenLink(genLink);
				if (result == null) result = caseGenCommonBase(genLink);
				if (result == null) result = caseGenLinkEnd(genLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_LABEL: {
				GenLabel genLabel = (GenLabel)theEObject;
				T result = caseGenLabel(genLabel);
				if (result == null) result = caseGenCommonBase(genLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_NODE_LABEL: {
				GenNodeLabel genNodeLabel = (GenNodeLabel)theEObject;
				T result = caseGenNodeLabel(genNodeLabel);
				if (result == null) result = caseGenLabel(genNodeLabel);
				if (result == null) result = caseGenCommonBase(genNodeLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_EXTERNAL_NODE_LABEL: {
				GenExternalNodeLabel genExternalNodeLabel = (GenExternalNodeLabel)theEObject;
				T result = caseGenExternalNodeLabel(genExternalNodeLabel);
				if (result == null) result = caseGenNodeLabel(genExternalNodeLabel);
				if (result == null) result = caseGenLabel(genExternalNodeLabel);
				if (result == null) result = caseGenCommonBase(genExternalNodeLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_LINK_LABEL: {
				GenLinkLabel genLinkLabel = (GenLinkLabel)theEObject;
				T result = caseGenLinkLabel(genLinkLabel);
				if (result == null) result = caseGenLabel(genLinkLabel);
				if (result == null) result = caseGenCommonBase(genLinkLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.ELEMENT_TYPE: {
				ElementType elementType = (ElementType)theEObject;
				T result = caseElementType(elementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.METAMODEL_TYPE: {
				MetamodelType metamodelType = (MetamodelType)theEObject;
				T result = caseMetamodelType(metamodelType);
				if (result == null) result = caseElementType(metamodelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.SPECIALIZATION_TYPE: {
				SpecializationType specializationType = (SpecializationType)theEObject;
				T result = caseSpecializationType(specializationType);
				if (result == null) result = caseElementType(specializationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.NOTATION_TYPE: {
				NotationType notationType = (NotationType)theEObject;
				T result = caseNotationType(notationType);
				if (result == null) result = caseElementType(notationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.MODEL_FACET: {
				ModelFacet modelFacet = (ModelFacet)theEObject;
				T result = caseModelFacet(modelFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.LINK_MODEL_FACET: {
				LinkModelFacet linkModelFacet = (LinkModelFacet)theEObject;
				T result = caseLinkModelFacet(linkModelFacet);
				if (result == null) result = caseModelFacet(linkModelFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.LABEL_MODEL_FACET: {
				LabelModelFacet labelModelFacet = (LabelModelFacet)theEObject;
				T result = caseLabelModelFacet(labelModelFacet);
				if (result == null) result = caseModelFacet(labelModelFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.TYPE_MODEL_FACET: {
				TypeModelFacet typeModelFacet = (TypeModelFacet)theEObject;
				T result = caseTypeModelFacet(typeModelFacet);
				if (result == null) result = caseModelFacet(typeModelFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.TYPE_LINK_MODEL_FACET: {
				TypeLinkModelFacet typeLinkModelFacet = (TypeLinkModelFacet)theEObject;
				T result = caseTypeLinkModelFacet(typeLinkModelFacet);
				if (result == null) result = caseTypeModelFacet(typeLinkModelFacet);
				if (result == null) result = caseLinkModelFacet(typeLinkModelFacet);
				if (result == null) result = caseModelFacet(typeLinkModelFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.FEATURE_LINK_MODEL_FACET: {
				FeatureLinkModelFacet featureLinkModelFacet = (FeatureLinkModelFacet)theEObject;
				T result = caseFeatureLinkModelFacet(featureLinkModelFacet);
				if (result == null) result = caseLinkModelFacet(featureLinkModelFacet);
				if (result == null) result = caseModelFacet(featureLinkModelFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET: {
				FeatureLabelModelFacet featureLabelModelFacet = (FeatureLabelModelFacet)theEObject;
				T result = caseFeatureLabelModelFacet(featureLabelModelFacet);
				if (result == null) result = caseLabelModelFacet(featureLabelModelFacet);
				if (result == null) result = caseModelFacet(featureLabelModelFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.DESIGN_LABEL_MODEL_FACET: {
				DesignLabelModelFacet designLabelModelFacet = (DesignLabelModelFacet)theEObject;
				T result = caseDesignLabelModelFacet(designLabelModelFacet);
				if (result == null) result = caseLabelModelFacet(designLabelModelFacet);
				if (result == null) result = caseModelFacet(designLabelModelFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.ATTRIBUTES: {
				Attributes attributes = (Attributes)theEObject;
				T result = caseAttributes(attributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.COLOR_ATTRIBUTES: {
				ColorAttributes colorAttributes = (ColorAttributes)theEObject;
				T result = caseColorAttributes(colorAttributes);
				if (result == null) result = caseAttributes(colorAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.STYLE_ATTRIBUTES: {
				StyleAttributes styleAttributes = (StyleAttributes)theEObject;
				T result = caseStyleAttributes(styleAttributes);
				if (result == null) result = caseAttributes(styleAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.RESIZE_CONSTRAINTS: {
				ResizeConstraints resizeConstraints = (ResizeConstraints)theEObject;
				T result = caseResizeConstraints(resizeConstraints);
				if (result == null) result = caseAttributes(resizeConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.DEFAULT_SIZE_ATTRIBUTES: {
				DefaultSizeAttributes defaultSizeAttributes = (DefaultSizeAttributes)theEObject;
				T result = caseDefaultSizeAttributes(defaultSizeAttributes);
				if (result == null) result = caseAttributes(defaultSizeAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.LABEL_OFFSET_ATTRIBUTES: {
				LabelOffsetAttributes labelOffsetAttributes = (LabelOffsetAttributes)theEObject;
				T result = caseLabelOffsetAttributes(labelOffsetAttributes);
				if (result == null) result = caseAttributes(labelOffsetAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.VIEWMAP: {
				Viewmap viewmap = (Viewmap)theEObject;
				T result = caseViewmap(viewmap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.FIGURE_VIEWMAP: {
				FigureViewmap figureViewmap = (FigureViewmap)theEObject;
				T result = caseFigureViewmap(figureViewmap);
				if (result == null) result = caseViewmap(figureViewmap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.SNIPPET_VIEWMAP: {
				SnippetViewmap snippetViewmap = (SnippetViewmap)theEObject;
				T result = caseSnippetViewmap(snippetViewmap);
				if (result == null) result = caseViewmap(snippetViewmap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.INNER_CLASS_VIEWMAP: {
				InnerClassViewmap innerClassViewmap = (InnerClassViewmap)theEObject;
				T result = caseInnerClassViewmap(innerClassViewmap);
				if (result == null) result = caseViewmap(innerClassViewmap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.PARENT_ASSIGNED_VIEWMAP: {
				ParentAssignedViewmap parentAssignedViewmap = (ParentAssignedViewmap)theEObject;
				T result = caseParentAssignedViewmap(parentAssignedViewmap);
				if (result == null) result = caseViewmap(parentAssignedViewmap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.VALUE_EXPRESSION: {
				ValueExpression valueExpression = (ValueExpression)theEObject;
				T result = caseValueExpression(valueExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_CONSTRAINT: {
				GenConstraint genConstraint = (GenConstraint)theEObject;
				T result = caseGenConstraint(genConstraint);
				if (result == null) result = caseValueExpression(genConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.PALETTE: {
				Palette palette = (Palette)theEObject;
				T result = casePalette(palette);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.ENTRY_BASE: {
				EntryBase entryBase = (EntryBase)theEObject;
				T result = caseEntryBase(entryBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.ABSTRACT_TOOL_ENTRY: {
				AbstractToolEntry abstractToolEntry = (AbstractToolEntry)theEObject;
				T result = caseAbstractToolEntry(abstractToolEntry);
				if (result == null) result = caseEntryBase(abstractToolEntry);
				if (result == null) result = caseToolGroupItem(abstractToolEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.TOOL_ENTRY: {
				ToolEntry toolEntry = (ToolEntry)theEObject;
				T result = caseToolEntry(toolEntry);
				if (result == null) result = caseAbstractToolEntry(toolEntry);
				if (result == null) result = caseEntryBase(toolEntry);
				if (result == null) result = caseToolGroupItem(toolEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.STANDARD_ENTRY: {
				StandardEntry standardEntry = (StandardEntry)theEObject;
				T result = caseStandardEntry(standardEntry);
				if (result == null) result = caseAbstractToolEntry(standardEntry);
				if (result == null) result = caseEntryBase(standardEntry);
				if (result == null) result = caseToolGroupItem(standardEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.TOOL_GROUP_ITEM: {
				ToolGroupItem toolGroupItem = (ToolGroupItem)theEObject;
				T result = caseToolGroupItem(toolGroupItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.SEPARATOR: {
				Separator separator = (Separator)theEObject;
				T result = caseSeparator(separator);
				if (result == null) result = caseToolGroupItem(separator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.TOOL_GROUP: {
				ToolGroup toolGroup = (ToolGroup)theEObject;
				T result = caseToolGroup(toolGroup);
				if (result == null) result = caseEntryBase(toolGroup);
				if (result == null) result = caseToolGroupItem(toolGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_ELEMENT_INITIALIZER: {
				GenElementInitializer genElementInitializer = (GenElementInitializer)theEObject;
				T result = caseGenElementInitializer(genElementInitializer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER: {
				GenFeatureSeqInitializer genFeatureSeqInitializer = (GenFeatureSeqInitializer)theEObject;
				T result = caseGenFeatureSeqInitializer(genFeatureSeqInitializer);
				if (result == null) result = caseGenElementInitializer(genFeatureSeqInitializer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_FEATURE_VALUE_SPEC: {
				GenFeatureValueSpec genFeatureValueSpec = (GenFeatureValueSpec)theEObject;
				T result = caseGenFeatureValueSpec(genFeatureValueSpec);
				if (result == null) result = caseGenFeatureInitializer(genFeatureValueSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_REFERENCE_NEW_ELEMENT_SPEC: {
				GenReferenceNewElementSpec genReferenceNewElementSpec = (GenReferenceNewElementSpec)theEObject;
				T result = caseGenReferenceNewElementSpec(genReferenceNewElementSpec);
				if (result == null) result = caseGenFeatureInitializer(genReferenceNewElementSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_FEATURE_INITIALIZER: {
				GenFeatureInitializer genFeatureInitializer = (GenFeatureInitializer)theEObject;
				T result = caseGenFeatureInitializer(genFeatureInitializer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_LINK_CONSTRAINTS: {
				GenLinkConstraints genLinkConstraints = (GenLinkConstraints)theEObject;
				T result = caseGenLinkConstraints(genLinkConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_AUDIT_ROOT: {
				GenAuditRoot genAuditRoot = (GenAuditRoot)theEObject;
				T result = caseGenAuditRoot(genAuditRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_AUDIT_CONTAINER: {
				GenAuditContainer genAuditContainer = (GenAuditContainer)theEObject;
				T result = caseGenAuditContainer(genAuditContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_RULE_BASE: {
				GenRuleBase genRuleBase = (GenRuleBase)theEObject;
				T result = caseGenRuleBase(genRuleBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_AUDIT_RULE: {
				GenAuditRule genAuditRule = (GenAuditRule)theEObject;
				T result = caseGenAuditRule(genAuditRule);
				if (result == null) result = caseGenRuleBase(genAuditRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_RULE_TARGET: {
				GenRuleTarget genRuleTarget = (GenRuleTarget)theEObject;
				T result = caseGenRuleTarget(genRuleTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_DOMAIN_ELEMENT_TARGET: {
				GenDomainElementTarget genDomainElementTarget = (GenDomainElementTarget)theEObject;
				T result = caseGenDomainElementTarget(genDomainElementTarget);
				if (result == null) result = caseGenAuditable(genDomainElementTarget);
				if (result == null) result = caseGenMeasurable(genDomainElementTarget);
				if (result == null) result = caseGenRuleTarget(genDomainElementTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_DIAGRAM_ELEMENT_TARGET: {
				GenDiagramElementTarget genDiagramElementTarget = (GenDiagramElementTarget)theEObject;
				T result = caseGenDiagramElementTarget(genDiagramElementTarget);
				if (result == null) result = caseGenAuditable(genDiagramElementTarget);
				if (result == null) result = caseGenMeasurable(genDiagramElementTarget);
				if (result == null) result = caseGenRuleTarget(genDiagramElementTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_DOMAIN_ATTRIBUTE_TARGET: {
				GenDomainAttributeTarget genDomainAttributeTarget = (GenDomainAttributeTarget)theEObject;
				T result = caseGenDomainAttributeTarget(genDomainAttributeTarget);
				if (result == null) result = caseGenAuditable(genDomainAttributeTarget);
				if (result == null) result = caseGenRuleTarget(genDomainAttributeTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_NOTATION_ELEMENT_TARGET: {
				GenNotationElementTarget genNotationElementTarget = (GenNotationElementTarget)theEObject;
				T result = caseGenNotationElementTarget(genNotationElementTarget);
				if (result == null) result = caseGenAuditable(genNotationElementTarget);
				if (result == null) result = caseGenMeasurable(genNotationElementTarget);
				if (result == null) result = caseGenRuleTarget(genNotationElementTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_METRIC_CONTAINER: {
				GenMetricContainer genMetricContainer = (GenMetricContainer)theEObject;
				T result = caseGenMetricContainer(genMetricContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_METRIC_RULE: {
				GenMetricRule genMetricRule = (GenMetricRule)theEObject;
				T result = caseGenMetricRule(genMetricRule);
				if (result == null) result = caseGenRuleBase(genMetricRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_AUDITED_METRIC_TARGET: {
				GenAuditedMetricTarget genAuditedMetricTarget = (GenAuditedMetricTarget)theEObject;
				T result = caseGenAuditedMetricTarget(genAuditedMetricTarget);
				if (result == null) result = caseGenAuditable(genAuditedMetricTarget);
				if (result == null) result = caseGenRuleTarget(genAuditedMetricTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_AUDITABLE: {
				GenAuditable genAuditable = (GenAuditable)theEObject;
				T result = caseGenAuditable(genAuditable);
				if (result == null) result = caseGenRuleTarget(genAuditable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_AUDIT_CONTEXT: {
				GenAuditContext genAuditContext = (GenAuditContext)theEObject;
				T result = caseGenAuditContext(genAuditContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_MEASURABLE: {
				GenMeasurable genMeasurable = (GenMeasurable)theEObject;
				T result = caseGenMeasurable(genMeasurable);
				if (result == null) result = caseGenRuleTarget(genMeasurable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER: {
				GenExpressionProviderContainer genExpressionProviderContainer = (GenExpressionProviderContainer)theEObject;
				T result = caseGenExpressionProviderContainer(genExpressionProviderContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_EXPRESSION_PROVIDER_BASE: {
				GenExpressionProviderBase genExpressionProviderBase = (GenExpressionProviderBase)theEObject;
				T result = caseGenExpressionProviderBase(genExpressionProviderBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_JAVA_EXPRESSION_PROVIDER: {
				GenJavaExpressionProvider genJavaExpressionProvider = (GenJavaExpressionProvider)theEObject;
				T result = caseGenJavaExpressionProvider(genJavaExpressionProvider);
				if (result == null) result = caseGenExpressionProviderBase(genJavaExpressionProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_EXPRESSION_INTERPRETER: {
				GenExpressionInterpreter genExpressionInterpreter = (GenExpressionInterpreter)theEObject;
				T result = caseGenExpressionInterpreter(genExpressionInterpreter);
				if (result == null) result = caseGenExpressionProviderBase(genExpressionInterpreter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_LITERAL_EXPRESSION_PROVIDER: {
				GenLiteralExpressionProvider genLiteralExpressionProvider = (GenLiteralExpressionProvider)theEObject;
				T result = caseGenLiteralExpressionProvider(genLiteralExpressionProvider);
				if (result == null) result = caseGenExpressionProviderBase(genLiteralExpressionProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_DOMAIN_MODEL_NAVIGATOR: {
				GenDomainModelNavigator genDomainModelNavigator = (GenDomainModelNavigator)theEObject;
				T result = caseGenDomainModelNavigator(genDomainModelNavigator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_NAVIGATOR: {
				GenNavigator genNavigator = (GenNavigator)theEObject;
				T result = caseGenNavigator(genNavigator);
				if (result == null) result = caseGenDomainModelNavigator(genNavigator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE: {
				GenNavigatorChildReference genNavigatorChildReference = (GenNavigatorChildReference)theEObject;
				T result = caseGenNavigatorChildReference(genNavigatorChildReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_NAVIGATOR_PATH: {
				GenNavigatorPath genNavigatorPath = (GenNavigatorPath)theEObject;
				T result = caseGenNavigatorPath(genNavigatorPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_NAVIGATOR_PATH_SEGMENT: {
				GenNavigatorPathSegment genNavigatorPathSegment = (GenNavigatorPathSegment)theEObject;
				T result = caseGenNavigatorPathSegment(genNavigatorPathSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_PROPERTY_SHEET: {
				GenPropertySheet genPropertySheet = (GenPropertySheet)theEObject;
				T result = caseGenPropertySheet(genPropertySheet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_PROPERTY_TAB: {
				GenPropertyTab genPropertyTab = (GenPropertyTab)theEObject;
				T result = caseGenPropertyTab(genPropertyTab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_STANDARD_PROPERTY_TAB: {
				GenStandardPropertyTab genStandardPropertyTab = (GenStandardPropertyTab)theEObject;
				T result = caseGenStandardPropertyTab(genStandardPropertyTab);
				if (result == null) result = caseGenPropertyTab(genStandardPropertyTab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_CUSTOM_PROPERTY_TAB: {
				GenCustomPropertyTab genCustomPropertyTab = (GenCustomPropertyTab)theEObject;
				T result = caseGenCustomPropertyTab(genCustomPropertyTab);
				if (result == null) result = caseGenPropertyTab(genCustomPropertyTab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_PROPERTY_TAB_FILTER: {
				GenPropertyTabFilter genPropertyTabFilter = (GenPropertyTabFilter)theEObject;
				T result = caseGenPropertyTabFilter(genPropertyTabFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.TYPE_TAB_FILTER: {
				TypeTabFilter typeTabFilter = (TypeTabFilter)theEObject;
				T result = caseTypeTabFilter(typeTabFilter);
				if (result == null) result = caseGenPropertyTabFilter(typeTabFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.CUSTOM_TAB_FILTER: {
				CustomTabFilter customTabFilter = (CustomTabFilter)theEObject;
				T result = caseCustomTabFilter(customTabFilter);
				if (result == null) result = caseGenPropertyTabFilter(customTabFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_CONTRIBUTION_ITEM: {
				GenContributionItem genContributionItem = (GenContributionItem)theEObject;
				T result = caseGenContributionItem(genContributionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_SHARED_CONTRIBUTION_ITEM: {
				GenSharedContributionItem genSharedContributionItem = (GenSharedContributionItem)theEObject;
				T result = caseGenSharedContributionItem(genSharedContributionItem);
				if (result == null) result = caseGenContributionItem(genSharedContributionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_GROUP_MARKER: {
				GenGroupMarker genGroupMarker = (GenGroupMarker)theEObject;
				T result = caseGenGroupMarker(genGroupMarker);
				if (result == null) result = caseGenContributionItem(genGroupMarker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_SEPARATOR: {
				GenSeparator genSeparator = (GenSeparator)theEObject;
				T result = caseGenSeparator(genSeparator);
				if (result == null) result = caseGenContributionItem(genSeparator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_ACTION_FACTORY_CONTRIBUTION_ITEM: {
				GenActionFactoryContributionItem genActionFactoryContributionItem = (GenActionFactoryContributionItem)theEObject;
				T result = caseGenActionFactoryContributionItem(genActionFactoryContributionItem);
				if (result == null) result = caseGenContributionItem(genActionFactoryContributionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_CONTRIBUTION_MANAGER: {
				GenContributionManager genContributionManager = (GenContributionManager)theEObject;
				T result = caseGenContributionManager(genContributionManager);
				if (result == null) result = caseGenContributionItem(genContributionManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_MENU_MANAGER: {
				GenMenuManager genMenuManager = (GenMenuManager)theEObject;
				T result = caseGenMenuManager(genMenuManager);
				if (result == null) result = caseGenContributionManager(genMenuManager);
				if (result == null) result = caseGenContributionItem(genMenuManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_TOOL_BAR_MANAGER: {
				GenToolBarManager genToolBarManager = (GenToolBarManager)theEObject;
				T result = caseGenToolBarManager(genToolBarManager);
				if (result == null) result = caseGenContributionManager(genToolBarManager);
				if (result == null) result = caseGenContributionItem(genToolBarManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_APPLICATION: {
				GenApplication genApplication = (GenApplication)theEObject;
				T result = caseGenApplication(genApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_LINK_END: {
				GenLinkEnd genLinkEnd = (GenLinkEnd)theEObject;
				T result = caseGenLinkEnd(genLinkEnd);
				if (result == null) result = caseGenCommonBase(genLinkEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Editor Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Editor Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenEditorGenerator(GenEditorGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenDiagram(GenDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Editor View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Editor View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenEditorView(GenEditorView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Preference Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Preference Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenPreferencePage(GenPreferencePage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Custom Preference Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Custom Preference Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenCustomPreferencePage(GenCustomPreferencePage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Standard Preference Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Standard Preference Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenStandardPreferencePage(GenStandardPreferencePage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Diagram Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Diagram Preferences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenDiagramPreferences(GenDiagramPreferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Font</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Font</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenFont(GenFont object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Standard Font</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Standard Font</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenStandardFont(GenStandardFont object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Custom Font</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Custom Font</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenCustomFont(GenCustomFont object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenColor(GenColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen RGB Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen RGB Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenRGBColor(GenRGBColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Constant Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Constant Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenConstantColor(GenConstantColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Batch Validation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Batch Validation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBatchValidation(BatchValidation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provider Class Names</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provider Class Names</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProviderClassNames(ProviderClassNames object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shortcuts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shortcuts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShortcuts(Shortcuts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Names</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Names</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageNames(PackageNames object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkConstraints(LinkConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Editor Candies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Editor Candies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditorCandies(EditorCandies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edit Part Candies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edit Part Candies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditPartCandies(EditPartCandies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementUnit(MeasurementUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Diagram Updater</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Diagram Updater</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenDiagramUpdater(GenDiagramUpdater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Plugin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenPlugin(GenPlugin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Model Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Model Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicModelAccess(DynamicModelAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementType(ElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metamodel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metamodel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetamodelType(MetamodelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specialization Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specialization Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecializationType(SpecializationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotationType(NotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Common Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Common Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenCommonBase(GenCommonBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behaviour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviour(Behaviour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Behaviour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomBehaviour(CustomBehaviour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared Behaviour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharedBehaviour(SharedBehaviour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Diagram Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Diagram Behaviour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenDiagramBehaviour(OpenDiagramBehaviour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Container Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Container Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenContainerBase(GenContainerBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenNode(GenNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Top Level Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Top Level Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenTopLevelNode(GenTopLevelNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Child Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Child Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenChildNode(GenChildNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Child Side Affixed Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Child Side Affixed Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenChildSideAffixedNode(GenChildSideAffixedNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Child Label Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Child Label Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenChildLabelNode(GenChildLabelNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenCompartment(GenCompartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Child Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Child Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenChildContainer(GenChildContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenLink(GenLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenLabel(GenLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Node Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Node Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenNodeLabel(GenNodeLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen External Node Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen External Node Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenExternalNodeLabel(GenExternalNodeLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Link Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Link Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenLinkLabel(GenLinkLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelFacet(ModelFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Model Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkModelFacet(LinkModelFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Model Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelModelFacet(LabelModelFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Model Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeModelFacet(TypeModelFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Label Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Label Model Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureLabelModelFacet(FeatureLabelModelFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Label Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Label Model Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignLabelModelFacet(DesignLabelModelFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Link Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Link Model Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeLinkModelFacet(TypeLinkModelFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Link Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Link Model Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureLinkModelFacet(FeatureLinkModelFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Viewmap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Viewmap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewmap(Viewmap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributes(Attributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorAttributes(ColorAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleAttributes(StyleAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resize Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resize Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResizeConstraints(ResizeConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Size Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Size Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultSizeAttributes(DefaultSizeAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Offset Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Offset Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelOffsetAttributes(LabelOffsetAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Figure Viewmap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Figure Viewmap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFigureViewmap(FigureViewmap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Snippet Viewmap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Snippet Viewmap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSnippetViewmap(SnippetViewmap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inner Class Viewmap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inner Class Viewmap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInnerClassViewmap(InnerClassViewmap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parent Assigned Viewmap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parent Assigned Viewmap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParentAssignedViewmap(ParentAssignedViewmap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Palette</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Palette</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePalette(Palette object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryBase(EntryBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Tool Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Tool Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractToolEntry(AbstractToolEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolEntry(ToolEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardEntry(StandardEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Group Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Group Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolGroupItem(ToolGroupItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Separator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Separator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeparator(Separator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolGroup(ToolGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Element Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Element Initializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenElementInitializer(GenElementInitializer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Feature Seq Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Feature Seq Initializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenFeatureSeqInitializer(GenFeatureSeqInitializer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Feature Value Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Feature Value Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenFeatureValueSpec(GenFeatureValueSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Reference New Element Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Reference New Element Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenReferenceNewElementSpec(GenReferenceNewElementSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Feature Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Feature Initializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenFeatureInitializer(GenFeatureInitializer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Link Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Link Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenLinkConstraints(GenLinkConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Audit Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Audit Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenAuditRoot(GenAuditRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Audit Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Audit Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenAuditContainer(GenAuditContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Audit Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Audit Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenAuditRule(GenAuditRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Rule Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Rule Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenRuleTarget(GenRuleTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Domain Element Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Domain Element Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenDomainElementTarget(GenDomainElementTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Diagram Element Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Diagram Element Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenDiagramElementTarget(GenDiagramElementTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Domain Attribute Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Domain Attribute Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenDomainAttributeTarget(GenDomainAttributeTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Notation Element Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Notation Element Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenNotationElementTarget(GenNotationElementTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Metric Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Metric Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenMetricContainer(GenMetricContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Metric Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Metric Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenMetricRule(GenMetricRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Audited Metric Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Audited Metric Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenAuditedMetricTarget(GenAuditedMetricTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Auditable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Auditable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenAuditable(GenAuditable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Audit Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Audit Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenAuditContext(GenAuditContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Measurable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Measurable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenMeasurable(GenMeasurable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Expression Provider Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Expression Provider Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenExpressionProviderContainer(GenExpressionProviderContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Expression Provider Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Expression Provider Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenExpressionProviderBase(GenExpressionProviderBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Java Expression Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Java Expression Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenJavaExpressionProvider(GenJavaExpressionProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Expression Interpreter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Expression Interpreter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenExpressionInterpreter(GenExpressionInterpreter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Literal Expression Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Literal Expression Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenLiteralExpressionProvider(GenLiteralExpressionProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Domain Model Navigator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Domain Model Navigator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenDomainModelNavigator(GenDomainModelNavigator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Navigator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Navigator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenNavigator(GenNavigator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Navigator Child Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Navigator Child Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenNavigatorChildReference(GenNavigatorChildReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Navigator Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Navigator Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenNavigatorPath(GenNavigatorPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Navigator Path Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Navigator Path Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenNavigatorPathSegment(GenNavigatorPathSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Property Sheet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Property Sheet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenPropertySheet(GenPropertySheet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Property Tab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Property Tab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenPropertyTab(GenPropertyTab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Standard Property Tab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Standard Property Tab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenStandardPropertyTab(GenStandardPropertyTab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Custom Property Tab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Custom Property Tab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenCustomPropertyTab(GenCustomPropertyTab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Property Tab Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Property Tab Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenPropertyTabFilter(GenPropertyTabFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Tab Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Tab Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTabFilter(TypeTabFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Tab Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Tab Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomTabFilter(CustomTabFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Contribution Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Contribution Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenContributionItem(GenContributionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Shared Contribution Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Shared Contribution Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenSharedContributionItem(GenSharedContributionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Group Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Group Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenGroupMarker(GenGroupMarker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Separator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Separator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenSeparator(GenSeparator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Action Factory Contribution Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Action Factory Contribution Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenActionFactoryContributionItem(GenActionFactoryContributionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Contribution Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Contribution Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenContributionManager(GenContributionManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Menu Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Menu Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenMenuManager(GenMenuManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Tool Bar Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Tool Bar Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenToolBarManager(GenToolBarManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenApplication(GenApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Link End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Link End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenLinkEnd(GenLinkEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Rule Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Rule Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenRuleBase(GenRuleBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueExpression(ValueExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenConstraint(GenConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //GMFGenSwitch
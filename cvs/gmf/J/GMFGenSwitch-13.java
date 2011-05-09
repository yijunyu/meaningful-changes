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
import org.eclipse.gmf.codegen.gmfgen.BasicNodeViewmap;
import org.eclipse.gmf.codegen.gmfgen.DecoratedConnectionViewmap;
import org.eclipse.gmf.codegen.gmfgen.DefaultSizeAttributes;
import org.eclipse.gmf.codegen.gmfgen.EntryBase;
import org.eclipse.gmf.codegen.gmfgen.FigureViewmap;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenBaseElement;
import org.eclipse.gmf.codegen.gmfgen.GenChildContainer;
import org.eclipse.gmf.codegen.gmfgen.GenChildNode;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.LinkDecoration;
import org.eclipse.gmf.codegen.gmfgen.LinkEntry;
import org.eclipse.gmf.codegen.gmfgen.NodeEntry;
import org.eclipse.gmf.codegen.gmfgen.Palette;
import org.eclipse.gmf.codegen.gmfgen.ShapeAttributes;
import org.eclipse.gmf.codegen.gmfgen.ToolEntry;
import org.eclipse.gmf.codegen.gmfgen.ToolGroup;
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
			case GMFGenPackage.GEN_DIAGRAM: {
				GenDiagram genDiagram = (GenDiagram)theEObject;
				Object result = caseGenDiagram(genDiagram);
				if (result == null) result = caseGenCommonBase(genDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_COMMON_BASE: {
				GenCommonBase genCommonBase = (GenCommonBase)theEObject;
				Object result = caseGenCommonBase(genCommonBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_BASE_ELEMENT: {
				GenBaseElement genBaseElement = (GenBaseElement)theEObject;
				Object result = caseGenBaseElement(genBaseElement);
				if (result == null) result = caseGenCommonBase(genBaseElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_NODE: {
				GenNode genNode = (GenNode)theEObject;
				Object result = caseGenNode(genNode);
				if (result == null) result = caseGenBaseElement(genNode);
				if (result == null) result = caseGenCommonBase(genNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_CHILD_CONTAINER: {
				GenChildContainer genChildContainer = (GenChildContainer)theEObject;
				Object result = caseGenChildContainer(genChildContainer);
				if (result == null) result = caseGenCommonBase(genChildContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_CHILD_NODE: {
				GenChildNode genChildNode = (GenChildNode)theEObject;
				Object result = caseGenChildNode(genChildNode);
				if (result == null) result = caseGenNode(genChildNode);
				if (result == null) result = caseGenBaseElement(genChildNode);
				if (result == null) result = caseGenCommonBase(genChildNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.GEN_LINK: {
				GenLink genLink = (GenLink)theEObject;
				Object result = caseGenLink(genLink);
				if (result == null) result = caseGenBaseElement(genLink);
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
			case GMFGenPackage.GEN_LINK_LABEL: {
				GenLinkLabel genLinkLabel = (GenLinkLabel)theEObject;
				Object result = caseGenLinkLabel(genLinkLabel);
				if (result == null) result = caseGenLabel(genLinkLabel);
				if (result == null) result = caseGenCommonBase(genLinkLabel);
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
			case GMFGenPackage.TYPE_MODEL_FACET: {
				TypeModelFacet typeModelFacet = (TypeModelFacet)theEObject;
				Object result = caseTypeModelFacet(typeModelFacet);
				if (result == null) result = caseModelFacet(typeModelFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.FEATURE_MODEL_FACET: {
				FeatureModelFacet featureModelFacet = (FeatureModelFacet)theEObject;
				Object result = caseFeatureModelFacet(featureModelFacet);
				if (result == null) result = caseModelFacet(featureModelFacet);
				if (result == null) result = caseLinkModelFacet(featureModelFacet);
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
			case GMFGenPackage.SHAPE_ATTRIBUTES: {
				ShapeAttributes shapeAttributes = (ShapeAttributes)theEObject;
				Object result = caseShapeAttributes(shapeAttributes);
				if (result == null) result = caseAttributes(shapeAttributes);
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
			case GMFGenPackage.VIEWMAP: {
				Viewmap viewmap = (Viewmap)theEObject;
				Object result = caseViewmap(viewmap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.FIGURE_VIEWMAP: {
				FigureViewmap figureViewmap = (FigureViewmap)theEObject;
				Object result = caseFigureViewmap(figureViewmap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.BASIC_NODE_VIEWMAP: {
				BasicNodeViewmap basicNodeViewmap = (BasicNodeViewmap)theEObject;
				Object result = caseBasicNodeViewmap(basicNodeViewmap);
				if (result == null) result = caseViewmap(basicNodeViewmap);
				if (result == null) result = caseFigureViewmap(basicNodeViewmap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.DECORATED_CONNECTION_VIEWMAP: {
				DecoratedConnectionViewmap decoratedConnectionViewmap = (DecoratedConnectionViewmap)theEObject;
				Object result = caseDecoratedConnectionViewmap(decoratedConnectionViewmap);
				if (result == null) result = caseViewmap(decoratedConnectionViewmap);
				if (result == null) result = caseFigureViewmap(decoratedConnectionViewmap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.LINK_DECORATION: {
				LinkDecoration linkDecoration = (LinkDecoration)theEObject;
				Object result = caseLinkDecoration(linkDecoration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.VALUE_EXPRESSION: {
				ValueExpression valueExpression = (ValueExpression)theEObject;
				Object result = caseValueExpression(valueExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.MODEL_ELEMENT_SELECTOR: {
				ModelElementSelector modelElementSelector = (ModelElementSelector)theEObject;
				Object result = caseModelElementSelector(modelElementSelector);
				if (result == null) result = caseValueExpression(modelElementSelector);
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
			case GMFGenPackage.TOOL_ENTRY: {
				ToolEntry toolEntry = (ToolEntry)theEObject;
				Object result = caseToolEntry(toolEntry);
				if (result == null) result = caseEntryBase(toolEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.NODE_ENTRY: {
				NodeEntry nodeEntry = (NodeEntry)theEObject;
				Object result = caseNodeEntry(nodeEntry);
				if (result == null) result = caseToolEntry(nodeEntry);
				if (result == null) result = caseEntryBase(nodeEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.LINK_ENTRY: {
				LinkEntry linkEntry = (LinkEntry)theEObject;
				Object result = caseLinkEntry(linkEntry);
				if (result == null) result = caseToolEntry(linkEntry);
				if (result == null) result = caseEntryBase(linkEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenPackage.TOOL_GROUP: {
				ToolGroup toolGroup = (ToolGroup)theEObject;
				Object result = caseToolGroup(toolGroup);
				if (result == null) result = caseEntryBase(toolGroup);
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
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpretting the object as an instance of '<em>Gen Base Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Base Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenBaseElement(GenBaseElement object) {
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
	 * Returns the result of interpretting the object as an instance of '<em>Feature Model Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Feature Model Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFeatureModelFacet(FeatureModelFacet object) {
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
	 * Returns the result of interpretting the object as an instance of '<em>Shape Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Shape Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseShapeAttributes(ShapeAttributes object) {
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
	 * Returns the result of interpretting the object as an instance of '<em>Basic Node Viewmap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Basic Node Viewmap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBasicNodeViewmap(BasicNodeViewmap object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Decorated Connection Viewmap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Decorated Connection Viewmap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDecoratedConnectionViewmap(DecoratedConnectionViewmap object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Link Decoration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Link Decoration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLinkDecoration(LinkDecoration object) {
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
	 * Returns the result of interpretting the object as an instance of '<em>Node Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Node Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNodeEntry(NodeEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Link Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Link Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLinkEntry(LinkEntry object) {
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
	 * Returns the result of interpretting the object as an instance of '<em>Model Element Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Model Element Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModelElementSelector(ModelElementSelector object) {
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

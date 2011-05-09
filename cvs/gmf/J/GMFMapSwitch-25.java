/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.mappings.*;

import org.eclipse.gmf.mappings.AppearanceSteward;
import org.eclipse.gmf.mappings.AuditContainer;
import org.eclipse.gmf.mappings.AuditRule;
import org.eclipse.gmf.mappings.CanvasMapping;
import org.eclipse.gmf.mappings.ChildReference;
import org.eclipse.gmf.mappings.CompartmentMapping;
import org.eclipse.gmf.mappings.Constraint;
import org.eclipse.gmf.mappings.ElementInitializer;
import org.eclipse.gmf.mappings.FeatureSeqInitializer;
import org.eclipse.gmf.mappings.FeatureValueSpec;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.LabelMapping;
import org.eclipse.gmf.mappings.LinkConstraints;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.Mapping;
import org.eclipse.gmf.mappings.MappingEntry;
import org.eclipse.gmf.mappings.MenuOwner;
import org.eclipse.gmf.mappings.NeedsContainment;
import org.eclipse.gmf.mappings.NodeMapping;
import org.eclipse.gmf.mappings.NodeReference;
import org.eclipse.gmf.mappings.ToolOwner;
import org.eclipse.gmf.mappings.TopNodeReference;
import org.eclipse.gmf.mappings.ValueExpression;

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
 * @see org.eclipse.gmf.mappings.GMFMapPackage
 * @generated
 */
public class GMFMapSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GMFMapPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFMapSwitch() {
		if (modelPackage == null) {
			modelPackage = GMFMapPackage.eINSTANCE;
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
			case GMFMapPackage.MAPPING: {
				Mapping mapping = (Mapping)theEObject;
				T result = caseMapping(mapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.MAPPING_ENTRY: {
				MappingEntry mappingEntry = (MappingEntry)theEObject;
				T result = caseMappingEntry(mappingEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.NEEDS_CONTAINMENT: {
				NeedsContainment needsContainment = (NeedsContainment)theEObject;
				T result = caseNeedsContainment(needsContainment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.NODE_REFERENCE: {
				NodeReference nodeReference = (NodeReference)theEObject;
				T result = caseNodeReference(nodeReference);
				if (result == null) result = caseNeedsContainment(nodeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.CHILD_REFERENCE: {
				ChildReference childReference = (ChildReference)theEObject;
				T result = caseChildReference(childReference);
				if (result == null) result = caseNodeReference(childReference);
				if (result == null) result = caseNeedsContainment(childReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.TOP_NODE_REFERENCE: {
				TopNodeReference topNodeReference = (TopNodeReference)theEObject;
				T result = caseTopNodeReference(topNodeReference);
				if (result == null) result = caseNodeReference(topNodeReference);
				if (result == null) result = caseNeedsContainment(topNodeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.NODE_MAPPING: {
				NodeMapping nodeMapping = (NodeMapping)theEObject;
				T result = caseNodeMapping(nodeMapping);
				if (result == null) result = caseMappingEntry(nodeMapping);
				if (result == null) result = caseMenuOwner(nodeMapping);
				if (result == null) result = caseToolOwner(nodeMapping);
				if (result == null) result = caseAppearanceSteward(nodeMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.COMPARTMENT_MAPPING: {
				CompartmentMapping compartmentMapping = (CompartmentMapping)theEObject;
				T result = caseCompartmentMapping(compartmentMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.LINK_MAPPING: {
				LinkMapping linkMapping = (LinkMapping)theEObject;
				T result = caseLinkMapping(linkMapping);
				if (result == null) result = caseMappingEntry(linkMapping);
				if (result == null) result = caseNeedsContainment(linkMapping);
				if (result == null) result = caseMenuOwner(linkMapping);
				if (result == null) result = caseToolOwner(linkMapping);
				if (result == null) result = caseAppearanceSteward(linkMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.CANVAS_MAPPING: {
				CanvasMapping canvasMapping = (CanvasMapping)theEObject;
				T result = caseCanvasMapping(canvasMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.LABEL_MAPPING: {
				LabelMapping labelMapping = (LabelMapping)theEObject;
				T result = caseLabelMapping(labelMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.FEATURE_LABEL_MAPPING: {
				FeatureLabelMapping featureLabelMapping = (FeatureLabelMapping)theEObject;
				T result = caseFeatureLabelMapping(featureLabelMapping);
				if (result == null) result = caseLabelMapping(featureLabelMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.DESIGN_LABEL_MAPPING: {
				DesignLabelMapping designLabelMapping = (DesignLabelMapping)theEObject;
				T result = caseDesignLabelMapping(designLabelMapping);
				if (result == null) result = caseLabelMapping(designLabelMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = caseValueExpression(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.LINK_CONSTRAINTS: {
				LinkConstraints linkConstraints = (LinkConstraints)theEObject;
				T result = caseLinkConstraints(linkConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.VALUE_EXPRESSION: {
				ValueExpression valueExpression = (ValueExpression)theEObject;
				T result = caseValueExpression(valueExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.ELEMENT_INITIALIZER: {
				ElementInitializer elementInitializer = (ElementInitializer)theEObject;
				T result = caseElementInitializer(elementInitializer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER: {
				FeatureSeqInitializer featureSeqInitializer = (FeatureSeqInitializer)theEObject;
				T result = caseFeatureSeqInitializer(featureSeqInitializer);
				if (result == null) result = caseElementInitializer(featureSeqInitializer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.FEATURE_INITIALIZER: {
				FeatureInitializer featureInitializer = (FeatureInitializer)theEObject;
				T result = caseFeatureInitializer(featureInitializer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.FEATURE_VALUE_SPEC: {
				FeatureValueSpec featureValueSpec = (FeatureValueSpec)theEObject;
				T result = caseFeatureValueSpec(featureValueSpec);
				if (result == null) result = caseValueExpression(featureValueSpec);
				if (result == null) result = caseFeatureInitializer(featureValueSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.REFERENCE_NEW_ELEMENT_SPEC: {
				ReferenceNewElementSpec referenceNewElementSpec = (ReferenceNewElementSpec)theEObject;
				T result = caseReferenceNewElementSpec(referenceNewElementSpec);
				if (result == null) result = caseFeatureInitializer(referenceNewElementSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.MENU_OWNER: {
				MenuOwner menuOwner = (MenuOwner)theEObject;
				T result = caseMenuOwner(menuOwner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.TOOL_OWNER: {
				ToolOwner toolOwner = (ToolOwner)theEObject;
				T result = caseToolOwner(toolOwner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.APPEARANCE_STEWARD: {
				AppearanceSteward appearanceSteward = (AppearanceSteward)theEObject;
				T result = caseAppearanceSteward(appearanceSteward);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.AUDIT_CONTAINER: {
				AuditContainer auditContainer = (AuditContainer)theEObject;
				T result = caseAuditContainer(auditContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.RULE_BASE: {
				RuleBase ruleBase = (RuleBase)theEObject;
				T result = caseRuleBase(ruleBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.AUDIT_RULE: {
				AuditRule auditRule = (AuditRule)theEObject;
				T result = caseAuditRule(auditRule);
				if (result == null) result = caseRuleBase(auditRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.DOMAIN_ELEMENT_TARGET: {
				DomainElementTarget domainElementTarget = (DomainElementTarget)theEObject;
				T result = caseDomainElementTarget(domainElementTarget);
				if (result == null) result = caseAuditable(domainElementTarget);
				if (result == null) result = caseMeasurable(domainElementTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.DOMAIN_ATTRIBUTE_TARGET: {
				DomainAttributeTarget domainAttributeTarget = (DomainAttributeTarget)theEObject;
				T result = caseDomainAttributeTarget(domainAttributeTarget);
				if (result == null) result = caseAuditable(domainAttributeTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.DIAGRAM_ELEMENT_TARGET: {
				DiagramElementTarget diagramElementTarget = (DiagramElementTarget)theEObject;
				T result = caseDiagramElementTarget(diagramElementTarget);
				if (result == null) result = caseAuditable(diagramElementTarget);
				if (result == null) result = caseMeasurable(diagramElementTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.NOTATION_ELEMENT_TARGET: {
				NotationElementTarget notationElementTarget = (NotationElementTarget)theEObject;
				T result = caseNotationElementTarget(notationElementTarget);
				if (result == null) result = caseAuditable(notationElementTarget);
				if (result == null) result = caseMeasurable(notationElementTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.METRIC_CONTAINER: {
				MetricContainer metricContainer = (MetricContainer)theEObject;
				T result = caseMetricContainer(metricContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.METRIC_RULE: {
				MetricRule metricRule = (MetricRule)theEObject;
				T result = caseMetricRule(metricRule);
				if (result == null) result = caseRuleBase(metricRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.AUDITED_METRIC_TARGET: {
				AuditedMetricTarget auditedMetricTarget = (AuditedMetricTarget)theEObject;
				T result = caseAuditedMetricTarget(auditedMetricTarget);
				if (result == null) result = caseAuditable(auditedMetricTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.AUDITABLE: {
				Auditable auditable = (Auditable)theEObject;
				T result = caseAuditable(auditable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFMapPackage.MEASURABLE: {
				Measurable measurable = (Measurable)theEObject;
				T result = caseMeasurable(measurable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingEntry(MappingEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Needs Containment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Needs Containment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeedsContainment(NeedsContainment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeReference(NodeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Child Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Child Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChildReference(ChildReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Top Node Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Top Node Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopNodeReference(TopNodeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeMapping(NodeMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartment Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartment Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartmentMapping(CompartmentMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkMapping(LinkMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Canvas Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Canvas Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCanvasMapping(CanvasMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelMapping(LabelMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Label Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Label Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureLabelMapping(FeatureLabelMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Label Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Label Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignLabelMapping(DesignLabelMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapping(Mapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Element Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Initializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementInitializer(ElementInitializer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Seq Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Seq Initializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureSeqInitializer(FeatureSeqInitializer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Initializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureInitializer(FeatureInitializer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Value Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Value Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureValueSpec(FeatureValueSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference New Element Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference New Element Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceNewElementSpec(ReferenceNewElementSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuOwner(MenuOwner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolOwner(ToolOwner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appearance Steward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appearance Steward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppearanceSteward(AppearanceSteward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditContainer(AuditContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditRule(AuditRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleBase(RuleBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Element Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Element Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainElementTarget(DomainElementTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Attribute Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Attribute Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainAttributeTarget(DomainAttributeTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Element Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Element Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramElementTarget(DiagramElementTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notation Element Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notation Element Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotationElementTarget(NotationElementTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetricContainer(MetricContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetricRule(MetricRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audited Metric Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audited Metric Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditedMetricTarget(AuditedMetricTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auditable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auditable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditable(Auditable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurable(Measurable object) {
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

} //GMFMapSwitch

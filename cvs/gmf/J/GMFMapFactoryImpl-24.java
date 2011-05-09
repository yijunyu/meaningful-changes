/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.gmf.mappings.*;

import org.eclipse.gmf.mappings.AuditContainer;
import org.eclipse.gmf.mappings.AuditRule;
import org.eclipse.gmf.mappings.CanvasMapping;
import org.eclipse.gmf.mappings.ChildReference;
import org.eclipse.gmf.mappings.CompartmentMapping;
import org.eclipse.gmf.mappings.Constraint;
import org.eclipse.gmf.mappings.FeatureSeqInitializer;
import org.eclipse.gmf.mappings.FeatureValueSpec;
import org.eclipse.gmf.mappings.GMFMapFactory;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.LabelMapping;
import org.eclipse.gmf.mappings.LinkConstraints;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.Mapping;
import org.eclipse.gmf.mappings.NodeMapping;
import org.eclipse.gmf.mappings.Severity;
import org.eclipse.gmf.mappings.TopNodeReference;
import org.eclipse.gmf.mappings.ValueExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GMFMapFactoryImpl extends EFactoryImpl implements GMFMapFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GMFMapFactory init() {
		try {
			GMFMapFactory theGMFMapFactory = (GMFMapFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/gmf/2005/mappings/2.0"); 
			if (theGMFMapFactory != null) {
				return theGMFMapFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GMFMapFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFMapFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GMFMapPackage.MAPPING: return createMapping();
			case GMFMapPackage.CHILD_REFERENCE: return createChildReference();
			case GMFMapPackage.TOP_NODE_REFERENCE: return createTopNodeReference();
			case GMFMapPackage.NODE_MAPPING: return createNodeMapping();
			case GMFMapPackage.COMPARTMENT_MAPPING: return createCompartmentMapping();
			case GMFMapPackage.LINK_MAPPING: return createLinkMapping();
			case GMFMapPackage.CANVAS_MAPPING: return createCanvasMapping();
			case GMFMapPackage.LABEL_MAPPING: return createLabelMapping();
			case GMFMapPackage.FEATURE_LABEL_MAPPING: return createFeatureLabelMapping();
			case GMFMapPackage.DESIGN_LABEL_MAPPING: return createDesignLabelMapping();
			case GMFMapPackage.CONSTRAINT: return createConstraint();
			case GMFMapPackage.LINK_CONSTRAINTS: return createLinkConstraints();
			case GMFMapPackage.VALUE_EXPRESSION: return createValueExpression();
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER: return createFeatureSeqInitializer();
			case GMFMapPackage.FEATURE_VALUE_SPEC: return createFeatureValueSpec();
			case GMFMapPackage.REFERENCE_NEW_ELEMENT_SPEC: return createReferenceNewElementSpec();
			case GMFMapPackage.AUDIT_CONTAINER: return createAuditContainer();
			case GMFMapPackage.AUDIT_RULE: return createAuditRule();
			case GMFMapPackage.DOMAIN_ELEMENT_TARGET: return createDomainElementTarget();
			case GMFMapPackage.DOMAIN_ATTRIBUTE_TARGET: return createDomainAttributeTarget();
			case GMFMapPackage.DIAGRAM_ELEMENT_TARGET: return createDiagramElementTarget();
			case GMFMapPackage.NOTATION_ELEMENT_TARGET: return createNotationElementTarget();
			case GMFMapPackage.METRIC_CONTAINER: return createMetricContainer();
			case GMFMapPackage.METRIC_RULE: return createMetricRule();
			case GMFMapPackage.AUDITED_METRIC_TARGET: return createAuditedMetricTarget();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GMFMapPackage.LABEL_VIEW_METHOD:
				return createLabelViewMethodFromString(eDataType, initialValue);
			case GMFMapPackage.LABEL_EDIT_METHOD:
				return createLabelEditMethodFromString(eDataType, initialValue);
			case GMFMapPackage.SEVERITY:
				return createSeverityFromString(eDataType, initialValue);
			case GMFMapPackage.LANGUAGE:
				return createLanguageFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GMFMapPackage.LABEL_VIEW_METHOD:
				return convertLabelViewMethodToString(eDataType, instanceValue);
			case GMFMapPackage.LABEL_EDIT_METHOD:
				return convertLabelEditMethodToString(eDataType, instanceValue);
			case GMFMapPackage.SEVERITY:
				return convertSeverityToString(eDataType, instanceValue);
			case GMFMapPackage.LANGUAGE:
				return convertLanguageToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeMapping createNodeMapping() {
		NodeMappingImpl nodeMapping = new NodeMappingImpl();
		return nodeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentMapping createCompartmentMapping() {
		CompartmentMappingImpl compartmentMapping = new CompartmentMappingImpl();
		return compartmentMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkMapping createLinkMapping() {
		LinkMappingImpl linkMapping = new LinkMappingImpl();
		return linkMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanvasMapping createCanvasMapping() {
		CanvasMappingImpl canvasMapping = new CanvasMappingImpl();
		return canvasMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelMapping createLabelMapping() {
		LabelMappingImpl labelMapping = new LabelMappingImpl();
		return labelMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureLabelMapping createFeatureLabelMapping() {
		FeatureLabelMappingImpl featureLabelMapping = new FeatureLabelMappingImpl();
		return featureLabelMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignLabelMapping createDesignLabelMapping() {
		DesignLabelMappingImpl designLabelMapping = new DesignLabelMappingImpl();
		return designLabelMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildReference createChildReference() {
		ChildReferenceImpl childReference = new ChildReferenceImpl();
		return childReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopNodeReference createTopNodeReference() {
		TopNodeReferenceImpl topNodeReference = new TopNodeReferenceImpl();
		return topNodeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkConstraints createLinkConstraints() {
		LinkConstraintsImpl linkConstraints = new LinkConstraintsImpl();
		return linkConstraints;
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
	public FeatureSeqInitializer createFeatureSeqInitializer() {
		FeatureSeqInitializerImpl featureSeqInitializer = new FeatureSeqInitializerImpl();
		return featureSeqInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureValueSpec createFeatureValueSpec() {
		FeatureValueSpecImpl featureValueSpec = new FeatureValueSpecImpl();
		return featureValueSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceNewElementSpec createReferenceNewElementSpec() {
		ReferenceNewElementSpecImpl referenceNewElementSpec = new ReferenceNewElementSpecImpl();
		return referenceNewElementSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditContainer createAuditContainer() {
		AuditContainerImpl auditContainer = new AuditContainerImpl();
		return auditContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditRule createAuditRule() {
		AuditRuleImpl auditRule = new AuditRuleImpl();
		return auditRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainElementTarget createDomainElementTarget() {
		DomainElementTargetImpl domainElementTarget = new DomainElementTargetImpl();
		return domainElementTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainAttributeTarget createDomainAttributeTarget() {
		DomainAttributeTargetImpl domainAttributeTarget = new DomainAttributeTargetImpl();
		return domainAttributeTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramElementTarget createDiagramElementTarget() {
		DiagramElementTargetImpl diagramElementTarget = new DiagramElementTargetImpl();
		return diagramElementTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotationElementTarget createNotationElementTarget() {
		NotationElementTargetImpl notationElementTarget = new NotationElementTargetImpl();
		return notationElementTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricContainer createMetricContainer() {
		MetricContainerImpl metricContainer = new MetricContainerImpl();
		return metricContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricRule createMetricRule() {
		MetricRuleImpl metricRule = new MetricRuleImpl();
		return metricRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditedMetricTarget createAuditedMetricTarget() {
		AuditedMetricTargetImpl auditedMetricTarget = new AuditedMetricTargetImpl();
		return auditedMetricTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelViewMethod createLabelViewMethodFromString(EDataType eDataType, String initialValue) {
		LabelViewMethod result = LabelViewMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLabelViewMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelEditMethod createLabelEditMethodFromString(EDataType eDataType, String initialValue) {
		LabelEditMethod result = LabelEditMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLabelEditMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Severity createSeverityFromString(EDataType eDataType, String initialValue) {
		Severity result = Severity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeverityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language createLanguageFromString(EDataType eDataType, String initialValue) {
		Language result = Language.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFMapPackage getGMFMapPackage() {
		return (GMFMapPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GMFMapPackage getPackage() {
		return GMFMapPackage.eINSTANCE;
	}

} //GMFMapFactoryImpl

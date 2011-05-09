/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.mappings.AppearanceSteward;
import org.eclipse.gmf.mappings.AuditContainer;
import org.eclipse.gmf.mappings.AuditRule;
import org.eclipse.gmf.mappings.Auditable;
import org.eclipse.gmf.mappings.AuditedMetricTarget;
import org.eclipse.gmf.mappings.CanvasMapping;
import org.eclipse.gmf.mappings.ChildReference;
import org.eclipse.gmf.mappings.CompartmentMapping;
import org.eclipse.gmf.mappings.Constraint;
import org.eclipse.gmf.mappings.DiagramElementTarget;
import org.eclipse.gmf.mappings.DomainAttributeTarget;
import org.eclipse.gmf.mappings.DomainElementTarget;
import org.eclipse.gmf.mappings.ElementInitializer;
import org.eclipse.gmf.mappings.FeatureSeqInitializer;
import org.eclipse.gmf.mappings.FeatureValueSpec;
import org.eclipse.gmf.mappings.GMFMapFactory;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.LabelFlavour;
import org.eclipse.gmf.mappings.LabelMapping;
import org.eclipse.gmf.mappings.LabelNodeMapping;
import org.eclipse.gmf.mappings.LinkConstraints;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.Mapping;
import org.eclipse.gmf.mappings.MappingEntry;
import org.eclipse.gmf.mappings.Measurable;
import org.eclipse.gmf.mappings.MenuOwner;
import org.eclipse.gmf.mappings.MetricContainer;
import org.eclipse.gmf.mappings.MetricRule;
import org.eclipse.gmf.mappings.NeedsContainment;
import org.eclipse.gmf.mappings.NodeMapping;
import org.eclipse.gmf.mappings.NodeReference;
import org.eclipse.gmf.mappings.NotationElementTarget;
import org.eclipse.gmf.mappings.RuleBase;
import org.eclipse.gmf.mappings.Severity;
import org.eclipse.gmf.mappings.ShapeNodeMapping;
import org.eclipse.gmf.mappings.ToolOwner;
import org.eclipse.gmf.mappings.TopNodeReference;
import org.eclipse.gmf.mappings.ValueExpression;
import org.eclipse.gmf.tooldef.GMFToolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GMFMapPackageImpl extends EPackageImpl implements GMFMapPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass needsContainmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topNodeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeNodeMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelNodeMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compartmentMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass canvasMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelFlavourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureSeqInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureValueSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appearanceStewardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainElementTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainAttributeTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramElementTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notationElementTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditedMetricTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum severityEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GMFMapPackageImpl() {
		super(eNS_URI, GMFMapFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GMFMapPackage init() {
		if (isInited) return (GMFMapPackage)EPackage.Registry.INSTANCE.getEPackage(GMFMapPackage.eNS_URI);

		// Obtain or create and register package
		GMFMapPackageImpl theGMFMapPackage = (GMFMapPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof GMFMapPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new GMFMapPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GMFGraphPackage.eINSTANCE.eClass();
		GMFToolPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGMFMapPackage.createPackageContents();

		// Initialize created meta-data
		theGMFMapPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGMFMapPackage.freeze();

		return theGMFMapPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingEntry() {
		return mappingEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingEntry_DomainMetaElement() {
		return (EReference)mappingEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingEntry_DomainSpecialization() {
		return (EReference)mappingEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingEntry_DomainInitializer() {
		return (EReference)mappingEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingEntry_LabelMappings() {
		return (EReference)mappingEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNeedsContainment() {
		return needsContainmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNeedsContainment_ContainmentFeature() {
		return (EReference)needsContainmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeReference() {
		return nodeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeReference_ChildrenFeature() {
		return (EReference)nodeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeReference_Child() {
		return (EReference)nodeReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChildReference() {
		return childReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildReference_ParentNode() {
		return (EReference)childReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildReference_Compartment() {
		return (EReference)childReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildReference_OwnedChild() {
		return (EReference)childReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildReference_ReferencedChild() {
		return (EReference)childReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopNodeReference() {
		return topNodeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopNodeReference_OwnedChild() {
		return (EReference)topNodeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeMapping() {
		return nodeMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeMapping_Children() {
		return (EReference)nodeMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeMapping_Compartments() {
		return (EReference)nodeMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapeNodeMapping() {
		return shapeNodeMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeNodeMapping_DiagramNode() {
		return (EReference)shapeNodeMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelNodeMapping() {
		return labelNodeMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompartmentMapping() {
		return compartmentMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentMapping_Compartment() {
		return (EReference)compartmentMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentMapping_ParentNode() {
		return (EReference)compartmentMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentMapping_Children() {
		return (EReference)compartmentMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkMapping() {
		return linkMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMapping_DiagramLink() {
		return (EReference)linkMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMapping_SourceMetaFeature() {
		return (EReference)linkMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMapping_LinkMetaFeature() {
		return (EReference)linkMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMapping_CreationConstraints() {
		return (EReference)linkMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCanvasMapping() {
		return canvasMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvasMapping_DiagramCanvas() {
		return (EReference)canvasMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvasMapping_DomainModel() {
		return (EReference)canvasMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvasMapping_DomainMetaElement() {
		return (EReference)canvasMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvasMapping_Palette() {
		return (EReference)canvasMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvasMapping_MenuContributions() {
		return (EReference)canvasMappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvasMapping_ToolbarContributions() {
		return (EReference)canvasMappingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelMapping() {
		return labelMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelMapping_MapEntry() {
		return (EReference)labelMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelFlavour() {
		return labelFlavourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelFlavour_DiagramLabel() {
		return (EReference)labelFlavourEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelFlavour_Features() {
		return (EReference)labelFlavourEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelFlavour_ReadOnly() {
		return (EAttribute)labelFlavourEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelFlavour_ViewPattern() {
		return (EAttribute)labelFlavourEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelFlavour_EditPattern() {
		return (EAttribute)labelFlavourEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapping() {
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Nodes() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Links() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Diagram() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_AppearanceStyles() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Audits() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Metrics() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkConstraints() {
		return linkConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkConstraints_LinkMapping() {
		return (EReference)linkConstraintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkConstraints_SourceEnd() {
		return (EReference)linkConstraintsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkConstraints_TargetEnd() {
		return (EReference)linkConstraintsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueExpression() {
		return valueExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueExpression_Body() {
		return (EAttribute)valueExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueExpression_Language() {
		return (EAttribute)valueExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementInitializer() {
		return elementInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementInitializer_MappingEntry() {
		return (EReference)elementInitializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureSeqInitializer() {
		return featureSeqInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureSeqInitializer_Initializers() {
		return (EReference)featureSeqInitializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureValueSpec() {
		return featureValueSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureValueSpec_Feature() {
		return (EReference)featureValueSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureValueSpec_FeatureSeqInitializer() {
		return (EReference)featureValueSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenuOwner() {
		return menuOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenuOwner_ContextMenu() {
		return (EReference)menuOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolOwner() {
		return toolOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolOwner_Tool() {
		return (EReference)toolOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppearanceSteward() {
		return appearanceStewardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppearanceSteward_AppearanceStyle() {
		return (EReference)appearanceStewardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditContainer() {
		return auditContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuditContainer_Id() {
		return (EAttribute)auditContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuditContainer_Name() {
		return (EAttribute)auditContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuditContainer_Description() {
		return (EAttribute)auditContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditContainer_ParentContainer() {
		return (EReference)auditContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditContainer_Audits() {
		return (EReference)auditContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditContainer_ChildContainers() {
		return (EReference)auditContainerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditRule() {
		return auditRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuditRule_Id() {
		return (EAttribute)auditRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditRule_Rule() {
		return (EReference)auditRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditRule_Target() {
		return (EReference)auditRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuditRule_Severity() {
		return (EAttribute)auditRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuditRule_UseInLiveMode() {
		return (EAttribute)auditRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuditRule_Message() {
		return (EAttribute)auditRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditRule_Container() {
		return (EReference)auditRuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleBase() {
		return ruleBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleBase_Name() {
		return (EAttribute)ruleBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleBase_Description() {
		return (EAttribute)ruleBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainElementTarget() {
		return domainElementTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainElementTarget_Element() {
		return (EReference)domainElementTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainAttributeTarget() {
		return domainAttributeTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainAttributeTarget_Attribute() {
		return (EReference)domainAttributeTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainAttributeTarget_NullAsError() {
		return (EAttribute)domainAttributeTargetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramElementTarget() {
		return diagramElementTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramElementTarget_Element() {
		return (EReference)diagramElementTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotationElementTarget() {
		return notationElementTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotationElementTarget_Element() {
		return (EReference)notationElementTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetricContainer() {
		return metricContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricContainer_Metrics() {
		return (EReference)metricContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetricRule() {
		return metricRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetricRule_Key() {
		return (EAttribute)metricRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricRule_Rule() {
		return (EReference)metricRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricRule_Target() {
		return (EReference)metricRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetricRule_LowLimit() {
		return (EAttribute)metricRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetricRule_HighLimit() {
		return (EAttribute)metricRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricRule_Container() {
		return (EReference)metricRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditedMetricTarget() {
		return auditedMetricTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditedMetricTarget_Metric() {
		return (EReference)auditedMetricTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditable() {
		return auditableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurable() {
		return measurableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSeverity() {
		return severityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFMapFactory getGMFMapFactory() {
		return (GMFMapFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mappingEClass = createEClass(MAPPING);
		createEReference(mappingEClass, MAPPING__NODES);
		createEReference(mappingEClass, MAPPING__LINKS);
		createEReference(mappingEClass, MAPPING__DIAGRAM);
		createEReference(mappingEClass, MAPPING__APPEARANCE_STYLES);
		createEReference(mappingEClass, MAPPING__AUDITS);
		createEReference(mappingEClass, MAPPING__METRICS);

		mappingEntryEClass = createEClass(MAPPING_ENTRY);
		createEReference(mappingEntryEClass, MAPPING_ENTRY__DOMAIN_META_ELEMENT);
		createEReference(mappingEntryEClass, MAPPING_ENTRY__DOMAIN_SPECIALIZATION);
		createEReference(mappingEntryEClass, MAPPING_ENTRY__DOMAIN_INITIALIZER);
		createEReference(mappingEntryEClass, MAPPING_ENTRY__LABEL_MAPPINGS);

		needsContainmentEClass = createEClass(NEEDS_CONTAINMENT);
		createEReference(needsContainmentEClass, NEEDS_CONTAINMENT__CONTAINMENT_FEATURE);

		nodeReferenceEClass = createEClass(NODE_REFERENCE);
		createEReference(nodeReferenceEClass, NODE_REFERENCE__CHILDREN_FEATURE);
		createEReference(nodeReferenceEClass, NODE_REFERENCE__CHILD);

		childReferenceEClass = createEClass(CHILD_REFERENCE);
		createEReference(childReferenceEClass, CHILD_REFERENCE__PARENT_NODE);
		createEReference(childReferenceEClass, CHILD_REFERENCE__COMPARTMENT);
		createEReference(childReferenceEClass, CHILD_REFERENCE__OWNED_CHILD);
		createEReference(childReferenceEClass, CHILD_REFERENCE__REFERENCED_CHILD);

		topNodeReferenceEClass = createEClass(TOP_NODE_REFERENCE);
		createEReference(topNodeReferenceEClass, TOP_NODE_REFERENCE__OWNED_CHILD);

		nodeMappingEClass = createEClass(NODE_MAPPING);
		createEReference(nodeMappingEClass, NODE_MAPPING__CHILDREN);
		createEReference(nodeMappingEClass, NODE_MAPPING__COMPARTMENTS);

		shapeNodeMappingEClass = createEClass(SHAPE_NODE_MAPPING);
		createEReference(shapeNodeMappingEClass, SHAPE_NODE_MAPPING__DIAGRAM_NODE);

		labelNodeMappingEClass = createEClass(LABEL_NODE_MAPPING);

		compartmentMappingEClass = createEClass(COMPARTMENT_MAPPING);
		createEReference(compartmentMappingEClass, COMPARTMENT_MAPPING__COMPARTMENT);
		createEReference(compartmentMappingEClass, COMPARTMENT_MAPPING__PARENT_NODE);
		createEReference(compartmentMappingEClass, COMPARTMENT_MAPPING__CHILDREN);

		linkMappingEClass = createEClass(LINK_MAPPING);
		createEReference(linkMappingEClass, LINK_MAPPING__DIAGRAM_LINK);
		createEReference(linkMappingEClass, LINK_MAPPING__SOURCE_META_FEATURE);
		createEReference(linkMappingEClass, LINK_MAPPING__LINK_META_FEATURE);
		createEReference(linkMappingEClass, LINK_MAPPING__CREATION_CONSTRAINTS);

		canvasMappingEClass = createEClass(CANVAS_MAPPING);
		createEReference(canvasMappingEClass, CANVAS_MAPPING__DIAGRAM_CANVAS);
		createEReference(canvasMappingEClass, CANVAS_MAPPING__DOMAIN_MODEL);
		createEReference(canvasMappingEClass, CANVAS_MAPPING__DOMAIN_META_ELEMENT);
		createEReference(canvasMappingEClass, CANVAS_MAPPING__PALETTE);
		createEReference(canvasMappingEClass, CANVAS_MAPPING__MENU_CONTRIBUTIONS);
		createEReference(canvasMappingEClass, CANVAS_MAPPING__TOOLBAR_CONTRIBUTIONS);

		labelMappingEClass = createEClass(LABEL_MAPPING);
		createEReference(labelMappingEClass, LABEL_MAPPING__MAP_ENTRY);

		labelFlavourEClass = createEClass(LABEL_FLAVOUR);
		createEReference(labelFlavourEClass, LABEL_FLAVOUR__DIAGRAM_LABEL);
		createEReference(labelFlavourEClass, LABEL_FLAVOUR__FEATURES);
		createEAttribute(labelFlavourEClass, LABEL_FLAVOUR__READ_ONLY);
		createEAttribute(labelFlavourEClass, LABEL_FLAVOUR__VIEW_PATTERN);
		createEAttribute(labelFlavourEClass, LABEL_FLAVOUR__EDIT_PATTERN);

		constraintEClass = createEClass(CONSTRAINT);

		linkConstraintsEClass = createEClass(LINK_CONSTRAINTS);
		createEReference(linkConstraintsEClass, LINK_CONSTRAINTS__LINK_MAPPING);
		createEReference(linkConstraintsEClass, LINK_CONSTRAINTS__SOURCE_END);
		createEReference(linkConstraintsEClass, LINK_CONSTRAINTS__TARGET_END);

		valueExpressionEClass = createEClass(VALUE_EXPRESSION);
		createEAttribute(valueExpressionEClass, VALUE_EXPRESSION__BODY);
		createEAttribute(valueExpressionEClass, VALUE_EXPRESSION__LANGUAGE);

		elementInitializerEClass = createEClass(ELEMENT_INITIALIZER);
		createEReference(elementInitializerEClass, ELEMENT_INITIALIZER__MAPPING_ENTRY);

		featureSeqInitializerEClass = createEClass(FEATURE_SEQ_INITIALIZER);
		createEReference(featureSeqInitializerEClass, FEATURE_SEQ_INITIALIZER__INITIALIZERS);

		featureValueSpecEClass = createEClass(FEATURE_VALUE_SPEC);
		createEReference(featureValueSpecEClass, FEATURE_VALUE_SPEC__FEATURE);
		createEReference(featureValueSpecEClass, FEATURE_VALUE_SPEC__FEATURE_SEQ_INITIALIZER);

		menuOwnerEClass = createEClass(MENU_OWNER);
		createEReference(menuOwnerEClass, MENU_OWNER__CONTEXT_MENU);

		toolOwnerEClass = createEClass(TOOL_OWNER);
		createEReference(toolOwnerEClass, TOOL_OWNER__TOOL);

		appearanceStewardEClass = createEClass(APPEARANCE_STEWARD);
		createEReference(appearanceStewardEClass, APPEARANCE_STEWARD__APPEARANCE_STYLE);

		auditContainerEClass = createEClass(AUDIT_CONTAINER);
		createEAttribute(auditContainerEClass, AUDIT_CONTAINER__ID);
		createEAttribute(auditContainerEClass, AUDIT_CONTAINER__NAME);
		createEAttribute(auditContainerEClass, AUDIT_CONTAINER__DESCRIPTION);
		createEReference(auditContainerEClass, AUDIT_CONTAINER__PARENT_CONTAINER);
		createEReference(auditContainerEClass, AUDIT_CONTAINER__AUDITS);
		createEReference(auditContainerEClass, AUDIT_CONTAINER__CHILD_CONTAINERS);

		ruleBaseEClass = createEClass(RULE_BASE);
		createEAttribute(ruleBaseEClass, RULE_BASE__NAME);
		createEAttribute(ruleBaseEClass, RULE_BASE__DESCRIPTION);

		auditRuleEClass = createEClass(AUDIT_RULE);
		createEAttribute(auditRuleEClass, AUDIT_RULE__ID);
		createEReference(auditRuleEClass, AUDIT_RULE__RULE);
		createEReference(auditRuleEClass, AUDIT_RULE__TARGET);
		createEAttribute(auditRuleEClass, AUDIT_RULE__SEVERITY);
		createEAttribute(auditRuleEClass, AUDIT_RULE__USE_IN_LIVE_MODE);
		createEAttribute(auditRuleEClass, AUDIT_RULE__MESSAGE);
		createEReference(auditRuleEClass, AUDIT_RULE__CONTAINER);

		domainElementTargetEClass = createEClass(DOMAIN_ELEMENT_TARGET);
		createEReference(domainElementTargetEClass, DOMAIN_ELEMENT_TARGET__ELEMENT);

		domainAttributeTargetEClass = createEClass(DOMAIN_ATTRIBUTE_TARGET);
		createEReference(domainAttributeTargetEClass, DOMAIN_ATTRIBUTE_TARGET__ATTRIBUTE);
		createEAttribute(domainAttributeTargetEClass, DOMAIN_ATTRIBUTE_TARGET__NULL_AS_ERROR);

		diagramElementTargetEClass = createEClass(DIAGRAM_ELEMENT_TARGET);
		createEReference(diagramElementTargetEClass, DIAGRAM_ELEMENT_TARGET__ELEMENT);

		notationElementTargetEClass = createEClass(NOTATION_ELEMENT_TARGET);
		createEReference(notationElementTargetEClass, NOTATION_ELEMENT_TARGET__ELEMENT);

		metricContainerEClass = createEClass(METRIC_CONTAINER);
		createEReference(metricContainerEClass, METRIC_CONTAINER__METRICS);

		metricRuleEClass = createEClass(METRIC_RULE);
		createEAttribute(metricRuleEClass, METRIC_RULE__KEY);
		createEReference(metricRuleEClass, METRIC_RULE__RULE);
		createEReference(metricRuleEClass, METRIC_RULE__TARGET);
		createEAttribute(metricRuleEClass, METRIC_RULE__LOW_LIMIT);
		createEAttribute(metricRuleEClass, METRIC_RULE__HIGH_LIMIT);
		createEReference(metricRuleEClass, METRIC_RULE__CONTAINER);

		auditedMetricTargetEClass = createEClass(AUDITED_METRIC_TARGET);
		createEReference(auditedMetricTargetEClass, AUDITED_METRIC_TARGET__METRIC);

		auditableEClass = createEClass(AUDITABLE);

		measurableEClass = createEClass(MEASURABLE);

		// Create enums
		severityEEnum = createEEnum(SEVERITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GMFToolPackage theGMFToolPackage = (GMFToolPackage)EPackage.Registry.INSTANCE.getEPackage(GMFToolPackage.eNS_URI);
		GMFGraphPackage theGMFGraphPackage = (GMFGraphPackage)EPackage.Registry.INSTANCE.getEPackage(GMFGraphPackage.eNS_URI);

		// Add supertypes to classes
		nodeReferenceEClass.getESuperTypes().add(this.getNeedsContainment());
		childReferenceEClass.getESuperTypes().add(this.getNodeReference());
		topNodeReferenceEClass.getESuperTypes().add(this.getNodeReference());
		nodeMappingEClass.getESuperTypes().add(this.getMappingEntry());
		nodeMappingEClass.getESuperTypes().add(this.getMenuOwner());
		nodeMappingEClass.getESuperTypes().add(this.getToolOwner());
		nodeMappingEClass.getESuperTypes().add(this.getAppearanceSteward());
		shapeNodeMappingEClass.getESuperTypes().add(this.getNodeMapping());
		labelNodeMappingEClass.getESuperTypes().add(this.getNodeMapping());
		labelNodeMappingEClass.getESuperTypes().add(this.getLabelFlavour());
		linkMappingEClass.getESuperTypes().add(this.getMappingEntry());
		linkMappingEClass.getESuperTypes().add(this.getNeedsContainment());
		linkMappingEClass.getESuperTypes().add(this.getMenuOwner());
		linkMappingEClass.getESuperTypes().add(this.getToolOwner());
		linkMappingEClass.getESuperTypes().add(this.getAppearanceSteward());
		labelMappingEClass.getESuperTypes().add(this.getLabelFlavour());
		constraintEClass.getESuperTypes().add(this.getValueExpression());
		featureSeqInitializerEClass.getESuperTypes().add(this.getElementInitializer());
		featureValueSpecEClass.getESuperTypes().add(this.getValueExpression());
		auditRuleEClass.getESuperTypes().add(this.getRuleBase());
		domainElementTargetEClass.getESuperTypes().add(this.getAuditable());
		domainElementTargetEClass.getESuperTypes().add(this.getMeasurable());
		domainAttributeTargetEClass.getESuperTypes().add(this.getAuditable());
		diagramElementTargetEClass.getESuperTypes().add(this.getAuditable());
		diagramElementTargetEClass.getESuperTypes().add(this.getMeasurable());
		notationElementTargetEClass.getESuperTypes().add(this.getAuditable());
		notationElementTargetEClass.getESuperTypes().add(this.getMeasurable());
		metricRuleEClass.getESuperTypes().add(this.getRuleBase());
		auditedMetricTargetEClass.getESuperTypes().add(this.getAuditable());

		// Initialize classes and features; add operations and parameters
		initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapping_Nodes(), this.getTopNodeReference(), null, "nodes", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_Links(), this.getLinkMapping(), null, "links", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_Diagram(), this.getCanvasMapping(), null, "diagram", null, 1, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_AppearanceStyles(), theGMFToolPackage.getStyleSelector(), null, "appearanceStyles", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_Audits(), this.getAuditContainer(), null, "audits", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_Metrics(), this.getMetricContainer(), null, "metrics", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingEntryEClass, MappingEntry.class, "MappingEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingEntry_DomainMetaElement(), ecorePackage.getEClass(), null, "domainMetaElement", null, 0, 1, MappingEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingEntry_DomainSpecialization(), this.getConstraint(), null, "domainSpecialization", null, 0, 1, MappingEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingEntry_DomainInitializer(), this.getElementInitializer(), this.getElementInitializer_MappingEntry(), "domainInitializer", null, 0, 1, MappingEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingEntry_LabelMappings(), this.getLabelMapping(), this.getLabelMapping_MapEntry(), "labelMappings", null, 0, -1, MappingEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(mappingEntryEClass, ecorePackage.getEClass(), "getDomainContext", 0, 1);

		initEClass(needsContainmentEClass, NeedsContainment.class, "NeedsContainment", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeedsContainment_ContainmentFeature(), ecorePackage.getEReference(), null, "containmentFeature", null, 0, 1, NeedsContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeReferenceEClass, NodeReference.class, "NodeReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeReference_ChildrenFeature(), ecorePackage.getEReference(), null, "childrenFeature", null, 0, 1, NodeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeReference_Child(), this.getNodeMapping(), null, "child", null, 0, 1, NodeReference.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(childReferenceEClass, ChildReference.class, "ChildReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChildReference_ParentNode(), this.getNodeMapping(), this.getNodeMapping_Children(), "parentNode", null, 1, 1, ChildReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChildReference_Compartment(), this.getCompartmentMapping(), this.getCompartmentMapping_Children(), "compartment", null, 0, 1, ChildReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChildReference_OwnedChild(), this.getNodeMapping(), null, "ownedChild", null, 0, 1, ChildReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChildReference_ReferencedChild(), this.getNodeMapping(), null, "referencedChild", null, 0, 1, ChildReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topNodeReferenceEClass, TopNodeReference.class, "TopNodeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTopNodeReference_OwnedChild(), this.getNodeMapping(), null, "ownedChild", null, 1, 1, TopNodeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeMappingEClass, NodeMapping.class, "NodeMapping", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeMapping_Children(), this.getChildReference(), this.getChildReference_ParentNode(), "children", null, 0, -1, NodeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeMapping_Compartments(), this.getCompartmentMapping(), this.getCompartmentMapping_ParentNode(), "compartments", null, 0, -1, NodeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapeNodeMappingEClass, ShapeNodeMapping.class, "ShapeNodeMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShapeNodeMapping_DiagramNode(), theGMFGraphPackage.getNode(), null, "diagramNode", null, 1, 1, ShapeNodeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelNodeMappingEClass, LabelNodeMapping.class, "LabelNodeMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compartmentMappingEClass, CompartmentMapping.class, "CompartmentMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompartmentMapping_Compartment(), theGMFGraphPackage.getCompartment(), null, "compartment", null, 1, 1, CompartmentMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompartmentMapping_ParentNode(), this.getNodeMapping(), this.getNodeMapping_Compartments(), "parentNode", null, 1, 1, CompartmentMapping.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompartmentMapping_Children(), this.getChildReference(), this.getChildReference_Compartment(), "children", null, 0, -1, CompartmentMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkMappingEClass, LinkMapping.class, "LinkMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkMapping_DiagramLink(), theGMFGraphPackage.getConnection(), null, "diagramLink", null, 1, 1, LinkMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkMapping_SourceMetaFeature(), ecorePackage.getEStructuralFeature(), null, "sourceMetaFeature", null, 0, 1, LinkMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkMapping_LinkMetaFeature(), ecorePackage.getEStructuralFeature(), null, "linkMetaFeature", null, 0, 1, LinkMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkMapping_CreationConstraints(), this.getLinkConstraints(), this.getLinkConstraints_LinkMapping(), "creationConstraints", null, 0, 1, LinkMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(canvasMappingEClass, CanvasMapping.class, "CanvasMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCanvasMapping_DiagramCanvas(), theGMFGraphPackage.getCanvas(), null, "diagramCanvas", null, 1, 1, CanvasMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCanvasMapping_DomainModel(), ecorePackage.getEPackage(), null, "domainModel", null, 0, 1, CanvasMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCanvasMapping_DomainMetaElement(), ecorePackage.getEClass(), null, "domainMetaElement", null, 0, 1, CanvasMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCanvasMapping_Palette(), theGMFToolPackage.getPalette(), null, "palette", null, 0, 1, CanvasMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCanvasMapping_MenuContributions(), theGMFToolPackage.getMainMenu(), null, "menuContributions", null, 0, -1, CanvasMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCanvasMapping_ToolbarContributions(), theGMFToolPackage.getToolbar(), null, "toolbarContributions", null, 0, -1, CanvasMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelMappingEClass, LabelMapping.class, "LabelMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabelMapping_MapEntry(), this.getMappingEntry(), this.getMappingEntry_LabelMappings(), "mapEntry", null, 1, 1, LabelMapping.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelFlavourEClass, LabelFlavour.class, "LabelFlavour", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabelFlavour_DiagramLabel(), theGMFGraphPackage.getDiagramLabel(), null, "diagramLabel", null, 1, 1, LabelFlavour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabelFlavour_Features(), ecorePackage.getEAttribute(), null, "features", null, 0, -1, LabelFlavour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabelFlavour_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", null, 0, 1, LabelFlavour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabelFlavour_ViewPattern(), ecorePackage.getEString(), "viewPattern", null, 0, 1, LabelFlavour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabelFlavour_EditPattern(), ecorePackage.getEString(), "editPattern", null, 0, 1, LabelFlavour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkConstraintsEClass, LinkConstraints.class, "LinkConstraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkConstraints_LinkMapping(), this.getLinkMapping(), this.getLinkMapping_CreationConstraints(), "linkMapping", null, 1, 1, LinkConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkConstraints_SourceEnd(), this.getConstraint(), null, "sourceEnd", null, 0, 1, LinkConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkConstraints_TargetEnd(), this.getConstraint(), null, "targetEnd", null, 0, 1, LinkConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueExpressionEClass, ValueExpression.class, "ValueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueExpression_Body(), ecorePackage.getEString(), "body", null, 1, 1, ValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueExpression_Language(), ecorePackage.getEString(), "language", "ocl", 0, 1, ValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementInitializerEClass, ElementInitializer.class, "ElementInitializer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementInitializer_MappingEntry(), this.getMappingEntry(), this.getMappingEntry_DomainInitializer(), "mappingEntry", null, 1, 1, ElementInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureSeqInitializerEClass, FeatureSeqInitializer.class, "FeatureSeqInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureSeqInitializer_Initializers(), this.getFeatureValueSpec(), this.getFeatureValueSpec_FeatureSeqInitializer(), "initializers", null, 1, -1, FeatureSeqInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureValueSpecEClass, FeatureValueSpec.class, "FeatureValueSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureValueSpec_Feature(), ecorePackage.getEStructuralFeature(), null, "feature", null, 1, 1, FeatureValueSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureValueSpec_FeatureSeqInitializer(), this.getFeatureSeqInitializer(), this.getFeatureSeqInitializer_Initializers(), "featureSeqInitializer", null, 1, 1, FeatureValueSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuOwnerEClass, MenuOwner.class, "MenuOwner", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenuOwner_ContextMenu(), theGMFToolPackage.getContextMenu(), null, "contextMenu", null, 0, 1, MenuOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolOwnerEClass, ToolOwner.class, "ToolOwner", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToolOwner_Tool(), theGMFToolPackage.getAbstractTool(), null, "tool", null, 0, 1, ToolOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appearanceStewardEClass, AppearanceSteward.class, "AppearanceSteward", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAppearanceSteward_AppearanceStyle(), theGMFToolPackage.getStyleSelector(), null, "appearanceStyle", null, 0, 1, AppearanceSteward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(auditContainerEClass, AuditContainer.class, "AuditContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuditContainer_Id(), ecorePackage.getEString(), "id", null, 1, 1, AuditContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuditContainer_Name(), ecorePackage.getEString(), "name", null, 0, 1, AuditContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuditContainer_Description(), ecorePackage.getEString(), "description", null, 0, 1, AuditContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuditContainer_ParentContainer(), this.getAuditContainer(), this.getAuditContainer_ChildContainers(), "parentContainer", null, 0, 1, AuditContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuditContainer_Audits(), this.getAuditRule(), this.getAuditRule_Container(), "audits", null, 0, -1, AuditContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuditContainer_ChildContainers(), this.getAuditContainer(), this.getAuditContainer_ParentContainer(), "childContainers", null, 0, -1, AuditContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleBaseEClass, RuleBase.class, "RuleBase", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleBase_Name(), ecorePackage.getEString(), "name", null, 0, 1, RuleBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleBase_Description(), ecorePackage.getEString(), "description", null, 0, 1, RuleBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(auditRuleEClass, AuditRule.class, "AuditRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuditRule_Id(), ecorePackage.getEString(), "id", null, 1, 1, AuditRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuditRule_Rule(), this.getConstraint(), null, "rule", null, 1, 1, AuditRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuditRule_Target(), this.getAuditable(), null, "target", null, 1, 1, AuditRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuditRule_Severity(), this.getSeverity(), "severity", "ERROR", 0, 1, AuditRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuditRule_UseInLiveMode(), ecorePackage.getEBoolean(), "useInLiveMode", "false", 0, 1, AuditRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuditRule_Message(), ecorePackage.getEString(), "message", null, 0, 1, AuditRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuditRule_Container(), this.getAuditContainer(), this.getAuditContainer_Audits(), "container", null, 1, 1, AuditRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainElementTargetEClass, DomainElementTarget.class, "DomainElementTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainElementTarget_Element(), ecorePackage.getEClass(), null, "element", null, 1, 1, DomainElementTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainAttributeTargetEClass, DomainAttributeTarget.class, "DomainAttributeTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainAttributeTarget_Attribute(), ecorePackage.getEAttribute(), null, "attribute", null, 1, 1, DomainAttributeTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainAttributeTarget_NullAsError(), ecorePackage.getEBoolean(), "nullAsError", null, 0, 1, DomainAttributeTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramElementTargetEClass, DiagramElementTarget.class, "DiagramElementTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagramElementTarget_Element(), this.getMappingEntry(), null, "element", null, 1, 1, DiagramElementTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notationElementTargetEClass, NotationElementTarget.class, "NotationElementTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotationElementTarget_Element(), ecorePackage.getEClass(), null, "element", null, 1, 1, NotationElementTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricContainerEClass, MetricContainer.class, "MetricContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetricContainer_Metrics(), this.getMetricRule(), this.getMetricRule_Container(), "metrics", null, 1, -1, MetricContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricRuleEClass, MetricRule.class, "MetricRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetricRule_Key(), ecorePackage.getEString(), "key", null, 1, 1, MetricRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricRule_Rule(), this.getValueExpression(), null, "rule", null, 1, 1, MetricRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricRule_Target(), this.getMeasurable(), null, "target", null, 1, 1, MetricRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetricRule_LowLimit(), ecorePackage.getEDoubleObject(), "lowLimit", null, 0, 1, MetricRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetricRule_HighLimit(), ecorePackage.getEDoubleObject(), "highLimit", null, 0, 1, MetricRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricRule_Container(), this.getMetricContainer(), this.getMetricContainer_Metrics(), "container", null, 1, 1, MetricRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(auditedMetricTargetEClass, AuditedMetricTarget.class, "AuditedMetricTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuditedMetricTarget_Metric(), this.getMetricRule(), null, "metric", null, 1, 1, AuditedMetricTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(auditableEClass, Auditable.class, "Auditable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(measurableEClass, Measurable.class, "Measurable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(severityEEnum, Severity.class, "Severity");
		addEEnumLiteral(severityEEnum, Severity.INFO_LITERAL);
		addEEnumLiteral(severityEEnum, Severity.WARNING_LITERAL);
		addEEnumLiteral(severityEEnum, Severity.ERROR_LITERAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2004/EmfaticAnnotationMap
		createEmfaticAnnotationMapAnnotations();
		// http://www.eclipse.org/gmf/2005/constraints
		createConstraintsAnnotations();
		// http://www.eclipse.org/gmf/2005/constraints/meta
		createMetaAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2004/EmfaticAnnotationMap</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEmfaticAnnotationMapAnnotations() {
		String source = "http://www.eclipse.org/emf/2004/EmfaticAnnotationMap";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "constraints", "http://www.eclipse.org/gmf/2005/constraints",
			 "constraintsMeta", "http://www.eclipse.org/gmf/2005/constraints/meta"
		   });																																																																																																							
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/gmf/2005/constraints/meta</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMetaAnnotations() {
		String source = "http://www.eclipse.org/gmf/2005/constraints/meta";							
		addAnnotation
		  (getMappingEntry_DomainSpecialization(), 
		   source, 
		   new String[] {
			 "def", "context",
			 "ocl", "self.getDomainContext()"
		   });				
		addAnnotation
		  (getMappingEntry_DomainInitializer(), 
		   source, 
		   new String[] {
			 "def", "context",
			 "ocl", "self.getDomainContext()"
		   });																									
		addAnnotation
		  (constraintEClass, 
		   source, 
		   new String[] {
			 "def", "Constraint"
		   });						
		addAnnotation
		  (getLinkConstraints_SourceEnd(), 
		   source, 
		   new String[] {
			 "def", "context",
			 "ocl", "let lm:LinkMapping=linkMapping in if lm.sourceMetaFeature.oclIsUndefined() then (if lm.containmentFeature.oclIsUndefined() then lm.linkMetaFeature.eContainingClass else lm.containmentFeature.eContainingClass endif) else lm.sourceMetaFeature.oclAsType(ecore::EReference).eReferenceType endif"
		   });		
		addAnnotation
		  (getLinkConstraints_SourceEnd(), 
		   source, 
		   new String[] {
			 "def", "variable",
			 "name", "oppositeEnd",
			 "type.ocl", "linkMapping.linkMetaFeature.eType"
		   });			
		addAnnotation
		  (getLinkConstraints_TargetEnd(), 
		   source, 
		   new String[] {
			 "def", "context",
			 "ocl", "linkMapping.linkMetaFeature.eType.oclAsType(ecore::EClass)"
		   });		
		addAnnotation
		  (getLinkConstraints_TargetEnd(), 
		   source, 
		   new String[] {
			 "def", "variable",
			 "name", "oppositeEnd",
			 "type.ocl", "let lm:LinkMapping=linkMapping in if lm.sourceMetaFeature.oclIsUndefined() then (if lm.containmentFeature.oclIsUndefined() then lm.linkMetaFeature.eContainingClass else lm.containmentFeature.eContainingClass endif) else lm.sourceMetaFeature.oclAsType(ecore::EReference).eReferenceType endif"
		   });		
		addAnnotation
		  (valueExpressionEClass, 
		   source, 
		   new String[] {
			 "def", "ValueSpec"
		   });				
		addAnnotation
		  (getValueExpression_Body(), 
		   source, 
		   new String[] {
			 "def", "body"
		   });			
		addAnnotation
		  (getValueExpression_Language(), 
		   source, 
		   new String[] {
			 "def", "lang"
		   });						
		addAnnotation
		  (featureValueSpecEClass, 
		   source, 
		   new String[] {
			 "def", "ValueSpec"
		   });			
		addAnnotation
		  (getFeatureValueSpec_Feature(), 
		   source, 
		   new String[] {
			 "def", "type"
		   });																
		addAnnotation
		  (getAuditRule_Rule(), 
		   source, 
		   new String[] {
			 "def", "context",
			 "ref", "target"
		   });								
		addAnnotation
		  (domainElementTargetEClass, 
		   source, 
		   new String[] {
			 "def", "context",
			 "ocl", "element"
		   });				
		addAnnotation
		  (domainAttributeTargetEClass, 
		   source, 
		   new String[] {
			 "def", "context",
			 "ocl", "attribute.eType"
		   });					
		addAnnotation
		  (diagramElementTargetEClass, 
		   source, 
		   new String[] {
			 "def", "context",
			 "ocl", "if element.oclIsKindOf(NodeMapping) then \'notation::Node\' else \'notation::Edge\' endif"
		   });				
		addAnnotation
		  (notationElementTargetEClass, 
		   source, 
		   new String[] {
			 "def", "context",
			 "ocl", "element"
		   });								
		addAnnotation
		  (getMetricRule_Rule(), 
		   source, 
		   new String[] {
			 "def", "context",
			 "ref", "target"
		   });		
		addAnnotation
		  (getMetricRule_Rule(), 
		   source, 
		   new String[] {
			 "def", "type",
			 "ocl", "\'ecore::EDoubleObject\'"
		   });							
		addAnnotation
		  (auditedMetricTargetEClass, 
		   source, 
		   new String[] {
			 "def", "context",
			 "ocl", "\'ecore::EDoubleObject\'"
		   });			
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/gmf/2005/constraints</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createConstraintsAnnotations() {
		String source = "http://www.eclipse.org/gmf/2005/constraints";			
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "import", "platform:/resource/org.eclipse.gmf.runtime.notation/model/notation.ecore"
		   });		
		addAnnotation
		  (mappingEClass, 
		   source, 
		   new String[] {
			 "ocl", "nodes->forAll(n|n.containmentFeature.oclIsUndefined() and not n.child.domainMetaElement.oclIsUndefined() implies links->exists(let r:ecore::EReference= linkMetaFeature.oclAsType(ecore::EReference) in r.containment and r.eReferenceType.isSuperTypeOf(n.child.domainMetaElement)))",
			 "description", "Phantom nodes that are not targeted by a link mapping exist"
		   });					
		addAnnotation
		  (getMappingEntry_DomainSpecialization(), 
		   source, 
		   new String[] {
			 "ocl", "not domainSpecialization.oclIsUndefined() implies not domainMetaElement.oclIsUndefined()",
			 "description", "Using \'Domain Specialization\' requires \'Domain Meta Element\' to be set"
		   });				
		addAnnotation
		  (getMappingEntry_DomainInitializer(), 
		   source, 
		   new String[] {
			 "ocl", "not domainInitializer.oclIsUndefined() implies not domainMetaElement.oclIsUndefined()",
			 "description", "\'Domain Element\' must be set in mapping with \'Element Initializers\'"
		   });		
		addAnnotation
		  (getNeedsContainment_ContainmentFeature(), 
		   source, 
		   new String[] {
			 "ocl", "not containmentFeature.oclIsUndefined() implies containmentFeature.containment",
			 "description", "Containment EReference expected"
		   });		
		addAnnotation
		  (nodeReferenceEClass, 
		   source, 
		   new String[] {
			 "ocl", "not (child.domainMetaElement.oclIsUndefined() and containmentFeature.oclIsUndefined())",
			 "description", "Either \'domainMetaElement\' or \'containmentFeature\' must be specified"
		   });		
		addAnnotation
		  (nodeReferenceEClass, 
		   source, 
		   new String[] {
			 "ocl", "not containmentFeature.oclIsUndefined() implies containmentFeature.eReferenceType.isSuperTypeOf(child.domainMetaElement)",
			 "description", "\'Containment Feature\' must reference the same class or super type of \'Domain Meta Element\' of the referenced node"
		   });		
		addAnnotation
		  (getNodeReference_ChildrenFeature(), 
		   source, 
		   new String[] {
			 "ocl", "not childrenFeature.oclIsUndefined() implies childrenFeature.eReferenceType.isSuperTypeOf(child.domainMetaElement)",
			 "description", "\'Children Feature\' must reference the same class or super type of \'Domain Meta Element\' of the referenced node"
		   });		
		addAnnotation
		  (childReferenceEClass, 
		   source, 
		   new String[] {
			 "ocl", "not (ownedChild.oclIsUndefined() and referencedChild.oclIsUndefined())",
			 "description", "Either \'ownedChild\' or \'referencedChild\' NodeMapping must be set"
		   });		
		addAnnotation
		  (childReferenceEClass, 
		   source, 
		   new String[] {
			 "ocl", "not childrenFeature.oclIsUndefined() implies childrenFeature.eContainingClass.isSuperTypeOf(parentNode.domainMetaElement)",
			 "description", "\'Children Feature\' must be owned by \'Domain Meta Element\' or its super type of this reference parent Node Mapping"
		   });		
		addAnnotation
		  (childReferenceEClass, 
		   source, 
		   new String[] {
			 "ocl", "not containmentFeature.oclIsUndefined() implies containmentFeature.eContainingClass.isSuperTypeOf(parentNode.domainMetaElement)",
			 "description", "\'Children Feature\' must be owned by \'Domain Meta Element\' or its super type of this reference parent Node Mapping"
		   });						
		addAnnotation
		  (linkMappingEClass, 
		   source, 
		   new String[] {
			 "ocl", "domainMetaElement.oclIsUndefined() implies containmentFeature.oclIsUndefined() and sourceMetaFeature.oclIsUndefined()",
			 "description", "Link mapping without \'Domain Element\' class does not use \'Containment Feature\' and \'Source Feature\'"
		   });		
		addAnnotation
		  (linkMappingEClass, 
		   source, 
		   new String[] {
			 "ocl", "not domainMetaElement.oclIsUndefined()  implies containmentFeature.eReferenceType.isSuperTypeOf(domainMetaElement)",
			 "description", "\'Containment Feature\' must reference the same class or super type of \'Domain Element\' EClass"
		   });		
		addAnnotation
		  (getLinkMapping_SourceMetaFeature(), 
		   source, 
		   new String[] {
			 "ocl", "not domainMetaElement.oclIsUndefined() implies sourceMetaFeature.oclIsUndefined() or sourceMetaFeature.eContainingClass.isSuperTypeOf(domainMetaElement)",
			 "description", "\'Source Feature\' must be owned by the link \'Domain Element\' or its super type"
		   });		
		addAnnotation
		  (getLinkMapping_LinkMetaFeature(), 
		   source, 
		   new String[] {
			 "ocl", "not(domainMetaElement.oclIsUndefined() or linkMetaFeature.oclIsUndefined()) implies linkMetaFeature.eContainingClass.isSuperTypeOf(domainMetaElement)",
			 "description", "\'Target Feature\' must be owned by the link \'Domain Element\' or its super type"
		   });			
		addAnnotation
		  (getCanvasMapping_DomainMetaElement(), 
		   source, 
		   new String[] {
			 "ocl", "not domainMetaElement.oclIsUndefined() implies not(domainMetaElement.abstract or domainMetaElement.interface)",
			 "description", "Top-level diagram container must be concrete"
		   });			
		addAnnotation
		  (getLabelFlavour_Features(), 
		   source, 
		   new String[] {
			 "ocl", "features->forAll(f | f.eContainingClass.isSuperTypeOf(mapEntry.domainMetaElement))",
			 "description", "Label attributes must be available in \'Domain Element\' EClass of the labeled mapping entry"
		   });							
		addAnnotation
		  (linkConstraintsEClass, 
		   source, 
		   new String[] {
			 "ocl", "not (sourceEnd.oclIsUndefined() and targetEnd.oclIsUndefined())",
			 "description", "Either \'sourceEnd\' or \'targetEnd\' constraint must be specified"
		   });																						
		addAnnotation
		  (getFeatureValueSpec_Feature(), 
		   source, 
		   new String[] {
			 "ocl", "feature.eContainingClass.isSuperTypeOf(featureSeqInitializer.mappingEntry.getDomainContext())",
			 "description", "Initialized \'Feature\' must be owned by \'Domain Element\' or its super type"
		   });					
		addAnnotation
		  (getAuditContainer_Id(), 
		   source, 
		   new String[] {
			 "ocl", "not parentContainer.oclIsUndefined() implies parentContainer.childContainers->one(i | i.id = self.id)",
			 "description", "Audit container with the same ID already exists"
		   });									
		addAnnotation
		  (getAuditRule_Id(), 
		   source, 
		   new String[] {
			 "ocl", "not id.oclIsUndefined() implies container.audits->one(i | i.id = self.id)",
			 "description", "Audit rule with the same ID already exists"
		   });																						
		addAnnotation
		  (getNotationElementTarget_Element(), 
		   source, 
		   new String[] {
			 "ocl", "element.oclIsKindOf(notation::View)",
			 "description", "Notation model element expected"
		   });		
		addAnnotation
		  (metricRuleEClass, 
		   source, 
		   new String[] {
			 "ocl", "not lowLimit.oclIsUndefined() and not highLimit.oclIsUndefined()  implies lowLimit < highLimit",
			 "description", "Metric value \'lowLimit\' must be smaller then \'highLimit\'"
		   });			
		addAnnotation
		  (getMetricRule_Key(), 
		   source, 
		   new String[] {
			 "ocl", "not key.oclIsUndefined() implies container.metrics->one(i | i.key = self.key)",
			 "description", "Metric rule with the same \'key\' already exists"
		   });												
	}

} //GMFMapPackageImpl

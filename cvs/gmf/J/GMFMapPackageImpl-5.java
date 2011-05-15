/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.gmf.diadef.DiagramDefinitionPackage;
import org.eclipse.gmf.diadef.impl.DiagramDefinitionPackageImpl;
import org.eclipse.gmf.mappings.CanvasMapping;
import org.eclipse.gmf.mappings.ChildNodeMapping;
import org.eclipse.gmf.mappings.Constraint;
import org.eclipse.gmf.mappings.ElementInitializer;
import org.eclipse.gmf.mappings.FeatureSeqInitializer;
import org.eclipse.gmf.mappings.FeatureValueSpec;
import org.eclipse.gmf.mappings.GMFMapFactory;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.Mapping;
import org.eclipse.gmf.mappings.MappingEntry;
import org.eclipse.gmf.mappings.NodeMapping;

import org.eclipse.gmf.mappings.ValueExpression;

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
	private EClass nodeMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childNodeMappingEClass = null;

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
		DiagramDefinitionPackageImpl.init();

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
	public EClass getNodeMapping() {
		return nodeMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeMapping_DiagramNode() {
		return (EReference)nodeMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeMapping_DomainMetaElement() {
		return (EReference)nodeMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeMapping_DomainSpecialization() {
		return (EReference)nodeMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeMapping_DomainInitializer() {
		return (EReference)nodeMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeMapping_ContainmentFeature() {
		return (EReference)nodeMappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeMapping_EditFeature() {
		return (EReference)nodeMappingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeMapping_ChildMappings() {
		return (EReference)nodeMappingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChildNodeMapping() {
		return childNodeMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildNodeMapping_Compartment() {
		return (EReference)childNodeMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildNodeMapping_DiagramNode() {
		return (EReference)childNodeMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildNodeMapping_DomainChildrenFeature() {
		return (EReference)childNodeMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildNodeMapping_EditFeature() {
		return (EReference)childNodeMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildNodeMapping_DomainMetaElement() {
		return (EReference)childNodeMappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildNodeMapping_DomainSpecialization() {
		return (EReference)childNodeMappingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildNodeMapping_DomainInitializer() {
		return (EReference)childNodeMappingEClass.getEStructuralFeatures().get(6);
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
	public EReference getLinkMapping_DomainMetaElement() {
		return (EReference)linkMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMapping_DomainSpecialization() {
		return (EReference)linkMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMapping_DomainInitializer() {
		return (EReference)linkMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMapping_ContainmentFeature() {
		return (EReference)linkMappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMapping_LabelEditFeature() {
		return (EReference)linkMappingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMapping_LabelDisplayFeature() {
		return (EReference)linkMappingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMapping_LinkMetaFeature() {
		return (EReference)linkMappingEClass.getEStructuralFeatures().get(7);
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
	public EClass getConstraint() {
		return constraintEClass;
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
		mappingEntryEClass = createEClass(MAPPING_ENTRY);

		nodeMappingEClass = createEClass(NODE_MAPPING);
		createEReference(nodeMappingEClass, NODE_MAPPING__DIAGRAM_NODE);
		createEReference(nodeMappingEClass, NODE_MAPPING__DOMAIN_META_ELEMENT);
		createEReference(nodeMappingEClass, NODE_MAPPING__DOMAIN_SPECIALIZATION);
		createEReference(nodeMappingEClass, NODE_MAPPING__DOMAIN_INITIALIZER);
		createEReference(nodeMappingEClass, NODE_MAPPING__CONTAINMENT_FEATURE);
		createEReference(nodeMappingEClass, NODE_MAPPING__EDIT_FEATURE);
		createEReference(nodeMappingEClass, NODE_MAPPING__CHILD_MAPPINGS);

		childNodeMappingEClass = createEClass(CHILD_NODE_MAPPING);
		createEReference(childNodeMappingEClass, CHILD_NODE_MAPPING__COMPARTMENT);
		createEReference(childNodeMappingEClass, CHILD_NODE_MAPPING__DIAGRAM_NODE);
		createEReference(childNodeMappingEClass, CHILD_NODE_MAPPING__DOMAIN_CHILDREN_FEATURE);
		createEReference(childNodeMappingEClass, CHILD_NODE_MAPPING__EDIT_FEATURE);
		createEReference(childNodeMappingEClass, CHILD_NODE_MAPPING__DOMAIN_META_ELEMENT);
		createEReference(childNodeMappingEClass, CHILD_NODE_MAPPING__DOMAIN_SPECIALIZATION);
		createEReference(childNodeMappingEClass, CHILD_NODE_MAPPING__DOMAIN_INITIALIZER);

		linkMappingEClass = createEClass(LINK_MAPPING);
		createEReference(linkMappingEClass, LINK_MAPPING__DIAGRAM_LINK);
		createEReference(linkMappingEClass, LINK_MAPPING__DOMAIN_META_ELEMENT);
		createEReference(linkMappingEClass, LINK_MAPPING__DOMAIN_SPECIALIZATION);
		createEReference(linkMappingEClass, LINK_MAPPING__DOMAIN_INITIALIZER);
		createEReference(linkMappingEClass, LINK_MAPPING__CONTAINMENT_FEATURE);
		createEReference(linkMappingEClass, LINK_MAPPING__LABEL_EDIT_FEATURE);
		createEReference(linkMappingEClass, LINK_MAPPING__LABEL_DISPLAY_FEATURE);
		createEReference(linkMappingEClass, LINK_MAPPING__LINK_META_FEATURE);

		canvasMappingEClass = createEClass(CANVAS_MAPPING);
		createEReference(canvasMappingEClass, CANVAS_MAPPING__DIAGRAM_CANVAS);
		createEReference(canvasMappingEClass, CANVAS_MAPPING__DOMAIN_MODEL);
		createEReference(canvasMappingEClass, CANVAS_MAPPING__DOMAIN_META_ELEMENT);

		mappingEClass = createEClass(MAPPING);
		createEReference(mappingEClass, MAPPING__NODES);
		createEReference(mappingEClass, MAPPING__LINKS);
		createEReference(mappingEClass, MAPPING__DIAGRAM);

		constraintEClass = createEClass(CONSTRAINT);

		valueExpressionEClass = createEClass(VALUE_EXPRESSION);
		createEAttribute(valueExpressionEClass, VALUE_EXPRESSION__BODY);
		createEAttribute(valueExpressionEClass, VALUE_EXPRESSION__LANGUAGE);

		elementInitializerEClass = createEClass(ELEMENT_INITIALIZER);

		featureSeqInitializerEClass = createEClass(FEATURE_SEQ_INITIALIZER);
		createEReference(featureSeqInitializerEClass, FEATURE_SEQ_INITIALIZER__INITIALIZERS);

		featureValueSpecEClass = createEClass(FEATURE_VALUE_SPEC);
		createEReference(featureValueSpecEClass, FEATURE_VALUE_SPEC__FEATURE);
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
		DiagramDefinitionPackageImpl theDiagramDefinitionPackage = (DiagramDefinitionPackageImpl)EPackage.Registry.INSTANCE.getEPackage(DiagramDefinitionPackage.eNS_URI);

		// Add supertypes to classes
		nodeMappingEClass.getESuperTypes().add(this.getMappingEntry());
		linkMappingEClass.getESuperTypes().add(this.getMappingEntry());
		canvasMappingEClass.getESuperTypes().add(this.getMappingEntry());
		constraintEClass.getESuperTypes().add(this.getValueExpression());
		featureSeqInitializerEClass.getESuperTypes().add(this.getElementInitializer());
		featureValueSpecEClass.getESuperTypes().add(this.getValueExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(mappingEntryEClass, MappingEntry.class, "MappingEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeMappingEClass, NodeMapping.class, "NodeMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeMapping_DiagramNode(), theDiagramDefinitionPackage.getNode(), null, "diagramNode", null, 1, 1, NodeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeMapping_DomainMetaElement(), ecorePackage.getEClass(), null, "domainMetaElement", null, 1, 1, NodeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeMapping_DomainSpecialization(), this.getConstraint(), null, "domainSpecialization", null, 0, 1, NodeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeMapping_DomainInitializer(), this.getElementInitializer(), null, "domainInitializer", null, 0, 1, NodeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeMapping_ContainmentFeature(), ecorePackage.getEReference(), null, "containmentFeature", null, 0, 1, NodeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeMapping_EditFeature(), ecorePackage.getEAttribute(), null, "editFeature", null, 0, 1, NodeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeMapping_ChildMappings(), this.getChildNodeMapping(), null, "childMappings", null, 0, -1, NodeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childNodeMappingEClass, ChildNodeMapping.class, "ChildNodeMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChildNodeMapping_Compartment(), theDiagramDefinitionPackage.getCompartment(), null, "compartment", null, 1, 1, ChildNodeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChildNodeMapping_DiagramNode(), theDiagramDefinitionPackage.getNode(), null, "diagramNode", null, 1, 1, ChildNodeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChildNodeMapping_DomainChildrenFeature(), ecorePackage.getEStructuralFeature(), null, "domainChildrenFeature", null, 1, 1, ChildNodeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChildNodeMapping_EditFeature(), ecorePackage.getEAttribute(), null, "editFeature", null, 0, 1, ChildNodeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChildNodeMapping_DomainMetaElement(), ecorePackage.getEClass(), null, "domainMetaElement", null, 0, 1, ChildNodeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChildNodeMapping_DomainSpecialization(), this.getConstraint(), null, "domainSpecialization", null, 0, 1, ChildNodeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChildNodeMapping_DomainInitializer(), this.getElementInitializer(), null, "domainInitializer", null, 0, 1, ChildNodeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkMappingEClass, LinkMapping.class, "LinkMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkMapping_DiagramLink(), theDiagramDefinitionPackage.getConnection(), null, "diagramLink", null, 1, 1, LinkMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkMapping_DomainMetaElement(), ecorePackage.getEClass(), null, "domainMetaElement", null, 0, 1, LinkMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkMapping_DomainSpecialization(), this.getConstraint(), null, "domainSpecialization", null, 0, 1, LinkMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkMapping_DomainInitializer(), this.getElementInitializer(), null, "domainInitializer", null, 0, 1, LinkMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkMapping_ContainmentFeature(), ecorePackage.getEReference(), null, "containmentFeature", null, 0, 1, LinkMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkMapping_LabelEditFeature(), ecorePackage.getEAttribute(), null, "labelEditFeature", null, 0, 1, LinkMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkMapping_LabelDisplayFeature(), ecorePackage.getEAttribute(), null, "labelDisplayFeature", null, 0, 1, LinkMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkMapping_LinkMetaFeature(), ecorePackage.getEStructuralFeature(), null, "linkMetaFeature", null, 1, 1, LinkMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(canvasMappingEClass, CanvasMapping.class, "CanvasMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCanvasMapping_DiagramCanvas(), theDiagramDefinitionPackage.getCanvas(), null, "diagramCanvas", null, 1, 1, CanvasMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCanvasMapping_DomainModel(), ecorePackage.getEPackage(), null, "domainModel", null, 0, 1, CanvasMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCanvasMapping_DomainMetaElement(), ecorePackage.getEClass(), null, "domainMetaElement", null, 0, 1, CanvasMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapping_Nodes(), this.getNodeMapping(), null, "nodes", null, 1, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_Links(), this.getLinkMapping(), null, "links", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_Diagram(), this.getCanvasMapping(), null, "diagram", null, 1, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueExpressionEClass, ValueExpression.class, "ValueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueExpression_Body(), ecorePackage.getEString(), "body", null, 1, 1, ValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueExpression_Language(), ecorePackage.getEString(), "language", "ocl", 0, 1, ValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementInitializerEClass, ElementInitializer.class, "ElementInitializer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureSeqInitializerEClass, FeatureSeqInitializer.class, "FeatureSeqInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureSeqInitializer_Initializers(), this.getFeatureValueSpec(), null, "initializers", null, 1, -1, FeatureSeqInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureValueSpecEClass, FeatureValueSpec.class, "FeatureValueSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureValueSpec_Feature(), ecorePackage.getEStructuralFeature(), null, "feature", null, 1, 1, FeatureValueSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2004/EmfaticAnnotationMap
		createEmfaticAnnotationMapAnnotations();
		// http://www.eclipse.org/gmf/2005/constraints
		createConstraintsAnnotations();
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
		  (mappingEntryEClass, 
		   source, 
		   new String[] {
			 "constraints", "http://www.eclipse.org/gmf/2005/constraints"
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
		  (getNodeMapping_ContainmentFeature(), 
		   source, 
		   new String[] {
			 "ocl", "oclIsUndefined(containmentFeature) or domainMetaElement.eAllReferences->includes(containmentFeature)"
		   });		
		addAnnotation
		  (getNodeMapping_EditFeature(), 
		   source, 
		   new String[] {
			 "ocl", "oclIsUndefined(editFeature) or domainMetaElement.eAllAttributes->includes(editFeature)"
		   });		
		addAnnotation
		  (getChildNodeMapping_Compartment(), 
		   source, 
		   new String[] {
			 "ocl", "eContainer.diagramNode.compartments->includes(self.compartment)"
		   });		
		addAnnotation
		  (getChildNodeMapping_DomainChildrenFeature(), 
		   source, 
		   new String[] {
			 "ocl", "eContainer.domainMetaElement.eAllAttributes->includes(domainChildrenFeature)"
		   });						
		addAnnotation
		  (getLinkMapping_ContainmentFeature(), 
		   source, 
		   new String[] {
			 "ocl", "oclIsUndefined(containmentFeature) or (not oclIsUndefined(domainMetaElement) and domainMetaElement.eAllReferences->includes(containmentFeature))"
		   });			
		addAnnotation
		  (constraintEClass, 
		   source, 
		   new String[] {
			 "ocl", "body->evaluate() instanceof Boolean"
		   });									
	}

} //GMFMapPackageImpl
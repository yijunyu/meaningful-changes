/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.internal.bridge.trace.impl;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.internal.bridge.trace.AbstractTrace;
import org.eclipse.gmf.internal.bridge.trace.GenChildNodeTrace;
import org.eclipse.gmf.internal.bridge.trace.GenCompartmentTrace;
import org.eclipse.gmf.internal.bridge.trace.GenLinkLabelTrace;
import org.eclipse.gmf.internal.bridge.trace.GenLinkTrace;
import org.eclipse.gmf.internal.bridge.trace.GenNodeLabelTrace;
import org.eclipse.gmf.internal.bridge.trace.GenNodeTrace;
import org.eclipse.gmf.internal.bridge.trace.MatchingTrace;
import org.eclipse.gmf.internal.bridge.trace.ToolGroupTrace;
import org.eclipse.gmf.internal.bridge.trace.TraceFactory;
import org.eclipse.gmf.internal.bridge.trace.TraceModel;
import org.eclipse.gmf.internal.bridge.trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TracePackageImpl extends EPackageImpl implements TracePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchingTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genNodeTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genChildNodeTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genNodeLabelTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genLinkTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genCompartmentTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genLinkLabelTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolGroupTraceEClass = null;

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
	 * @see org.eclipse.gmf.internal.bridge.trace.TracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TracePackageImpl() {
		super(eNS_URI, TraceFactory.eINSTANCE);
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
	public static TracePackage init() {
		if (isInited) return (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);

		// Obtain or create and register package
		TracePackageImpl theTracePackage = (TracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof TracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new TracePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		GenModelPackage.eINSTANCE.eClass();
		GMFGenPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTracePackage.createPackageContents();

		// Initialize created meta-data
		theTracePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTracePackage.freeze();

		return theTracePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraceModel() {
		return traceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceModel_NodeTraces() {
		return (EReference)traceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceModel_ChildNodeTraces() {
		return (EReference)traceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceModel_LinkTraces() {
		return (EReference)traceModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceModel_ToolGroupTraces() {
		return (EReference)traceModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTrace() {
		return abstractTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTrace_VisualID() {
		return (EAttribute)abstractTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTrace_Processed() {
		return (EAttribute)abstractTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchingTrace() {
		return matchingTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatchingTrace_QueryText() {
		return (EAttribute)matchingTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenNodeTrace() {
		return genNodeTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenNodeTrace_NodeLabelTraces() {
		return (EReference)genNodeTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenNodeTrace_CompartmentTraces() {
		return (EReference)genNodeTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenChildNodeTrace() {
		return genChildNodeTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenNodeLabelTrace() {
		return genNodeLabelTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenLinkTrace() {
		return genLinkTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLinkTrace_LinkLabelTraces() {
		return (EReference)genLinkTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenCompartmentTrace() {
		return genCompartmentTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenLinkLabelTrace() {
		return genLinkLabelTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolGroupTrace() {
		return toolGroupTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceFactory getTraceFactory() {
		return (TraceFactory)getEFactoryInstance();
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
		traceModelEClass = createEClass(TRACE_MODEL);
		createEReference(traceModelEClass, TRACE_MODEL__NODE_TRACES);
		createEReference(traceModelEClass, TRACE_MODEL__CHILD_NODE_TRACES);
		createEReference(traceModelEClass, TRACE_MODEL__LINK_TRACES);
		createEReference(traceModelEClass, TRACE_MODEL__TOOL_GROUP_TRACES);

		abstractTraceEClass = createEClass(ABSTRACT_TRACE);
		createEAttribute(abstractTraceEClass, ABSTRACT_TRACE__VISUAL_ID);
		createEAttribute(abstractTraceEClass, ABSTRACT_TRACE__PROCESSED);

		matchingTraceEClass = createEClass(MATCHING_TRACE);
		createEAttribute(matchingTraceEClass, MATCHING_TRACE__QUERY_TEXT);

		genNodeTraceEClass = createEClass(GEN_NODE_TRACE);
		createEReference(genNodeTraceEClass, GEN_NODE_TRACE__NODE_LABEL_TRACES);
		createEReference(genNodeTraceEClass, GEN_NODE_TRACE__COMPARTMENT_TRACES);

		genChildNodeTraceEClass = createEClass(GEN_CHILD_NODE_TRACE);

		genNodeLabelTraceEClass = createEClass(GEN_NODE_LABEL_TRACE);

		genLinkTraceEClass = createEClass(GEN_LINK_TRACE);
		createEReference(genLinkTraceEClass, GEN_LINK_TRACE__LINK_LABEL_TRACES);

		genCompartmentTraceEClass = createEClass(GEN_COMPARTMENT_TRACE);

		genLinkLabelTraceEClass = createEClass(GEN_LINK_LABEL_TRACE);

		toolGroupTraceEClass = createEClass(TOOL_GROUP_TRACE);
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
		GMFGenPackage theGMFGenPackage = (GMFGenPackage)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		matchingTraceEClass.getESuperTypes().add(this.getAbstractTrace());
		genNodeTraceEClass.getESuperTypes().add(this.getMatchingTrace());
		genChildNodeTraceEClass.getESuperTypes().add(this.getGenNodeTrace());
		genNodeLabelTraceEClass.getESuperTypes().add(this.getMatchingTrace());
		genLinkTraceEClass.getESuperTypes().add(this.getMatchingTrace());
		genCompartmentTraceEClass.getESuperTypes().add(this.getMatchingTrace());
		genLinkLabelTraceEClass.getESuperTypes().add(this.getMatchingTrace());
		toolGroupTraceEClass.getESuperTypes().add(this.getMatchingTrace());

		// Initialize classes and features; add operations and parameters
		initEClass(traceModelEClass, TraceModel.class, "TraceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTraceModel_NodeTraces(), this.getGenNodeTrace(), null, "nodeTraces", null, 0, -1, TraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraceModel_ChildNodeTraces(), this.getGenChildNodeTrace(), null, "childNodeTraces", null, 0, -1, TraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraceModel_LinkTraces(), this.getGenLinkTrace(), null, "linkTraces", null, 0, -1, TraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraceModel_ToolGroupTraces(), this.getToolGroupTrace(), null, "toolGroupTraces", null, 0, -1, TraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(traceModelEClass, this.getGenNodeTrace(), "getNodeTrace", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "visualID", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(traceModelEClass, this.getGenLinkTrace(), "getLinkTrace", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "visualID", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(traceModelEClass, this.getAbstractTrace(), "getAllAbstractTraces", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(traceModelEClass, null, "purgeUnprocessedTraces", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abstractTraceEClass, AbstractTrace.class, "AbstractTrace", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractTrace_VisualID(), ecorePackage.getEInt(), "visualID", null, 0, 1, AbstractTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTrace_Processed(), ecorePackage.getEBoolean(), "processed", "false", 0, 1, AbstractTrace.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchingTraceEClass, MatchingTrace.class, "MatchingTrace", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatchingTrace_QueryText(), ecorePackage.getEString(), "queryText", null, 0, 1, MatchingTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(matchingTraceEClass, ecorePackage.getEClass(), "getQueryContext", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(matchingTraceEClass, ecorePackage.getEString(), "getEClassComparision", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "varName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "eClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(matchingTraceEClass, ecorePackage.getEString(), "getEStructuralFeatureComparison", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "varName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEStructuralFeature(), "feature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(genNodeTraceEClass, GenNodeTrace.class, "GenNodeTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenNodeTrace_NodeLabelTraces(), this.getGenNodeLabelTrace(), null, "nodeLabelTraces", null, 0, -1, GenNodeTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenNodeTrace_CompartmentTraces(), this.getGenCompartmentTrace(), null, "compartmentTraces", null, 0, -1, GenNodeTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(genNodeTraceEClass, null, "setContext", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGMFGenPackage.getGenNode(), "genNode", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(genChildNodeTraceEClass, GenChildNodeTrace.class, "GenChildNodeTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genNodeLabelTraceEClass, GenNodeLabelTrace.class, "GenNodeLabelTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(genNodeLabelTraceEClass, null, "setContext", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGMFGenPackage.getGenNodeLabel(), "genNodeLabel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(genLinkTraceEClass, GenLinkTrace.class, "GenLinkTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenLinkTrace_LinkLabelTraces(), this.getGenLinkLabelTrace(), null, "linkLabelTraces", null, 0, -1, GenLinkTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(genLinkTraceEClass, null, "setContext", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGMFGenPackage.getGenLink(), "genLink", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(genCompartmentTraceEClass, GenCompartmentTrace.class, "GenCompartmentTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(genCompartmentTraceEClass, null, "setContext", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGMFGenPackage.getGenCompartment(), "genCompartment", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(genLinkLabelTraceEClass, GenLinkLabelTrace.class, "GenLinkLabelTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(genLinkLabelTraceEClass, null, "setContext", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGMFGenPackage.getGenLinkLabel(), "genLinkLabel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(toolGroupTraceEClass, ToolGroupTrace.class, "ToolGroupTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(toolGroupTraceEClass, null, "setContext", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGMFGenPackage.getToolGroup(), "toolGroup", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TracePackageImpl

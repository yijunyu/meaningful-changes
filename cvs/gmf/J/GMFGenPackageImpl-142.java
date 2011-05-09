/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.gmf.codegen.gmfgen.Attributes;
import org.eclipse.gmf.codegen.gmfgen.BatchValidation;
import org.eclipse.gmf.codegen.gmfgen.ColorAttributes;
import org.eclipse.gmf.codegen.gmfgen.CompositeFeatureLabelModelFacet;
import org.eclipse.gmf.codegen.gmfgen.CompositeFeatureModelFacet;
import org.eclipse.gmf.codegen.gmfgen.DefaultSizeAttributes;
import org.eclipse.gmf.codegen.gmfgen.DesignLabelModelFacet;
import org.eclipse.gmf.codegen.gmfgen.EditPartCandies;
import org.eclipse.gmf.codegen.gmfgen.EditorCandies;
import org.eclipse.gmf.codegen.gmfgen.ElementType;
import org.eclipse.gmf.codegen.gmfgen.EntryBase;
import org.eclipse.gmf.codegen.gmfgen.FeatureLabelModelFacet;
import org.eclipse.gmf.codegen.gmfgen.FeatureLinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.FeatureModelFacet;
import org.eclipse.gmf.codegen.gmfgen.FigureViewmap;
import org.eclipse.gmf.codegen.gmfgen.GMFGenFactory;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenAuditContainer;
import org.eclipse.gmf.codegen.gmfgen.GenAuditRule;
import org.eclipse.gmf.codegen.gmfgen.GenAuditable;
import org.eclipse.gmf.codegen.gmfgen.GenAuditedMetricTarget;
import org.eclipse.gmf.codegen.gmfgen.GenChildContainer;
import org.eclipse.gmf.codegen.gmfgen.GenChildLabelNode;
import org.eclipse.gmf.codegen.gmfgen.GenChildNode;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenConstraint;
import org.eclipse.gmf.codegen.gmfgen.GenContainerBase;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenDiagramElementTarget;
import org.eclipse.gmf.codegen.gmfgen.GenDomainAttributeTarget;
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
import org.eclipse.gmf.codegen.gmfgen.GenLanguage;
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
import org.eclipse.gmf.codegen.gmfgen.GenSeverity;
import org.eclipse.gmf.codegen.gmfgen.GenTopLevelNode;
import org.eclipse.gmf.codegen.gmfgen.InnerClassViewmap;
import org.eclipse.gmf.codegen.gmfgen.LabelModelFacet;
import org.eclipse.gmf.codegen.gmfgen.LabelOffsetAttributes;
import org.eclipse.gmf.codegen.gmfgen.LinkConstraints;
import org.eclipse.gmf.codegen.gmfgen.LinkLabelAlignment;
import org.eclipse.gmf.codegen.gmfgen.LinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.MeasurementUnit;
import org.eclipse.gmf.codegen.gmfgen.MetamodelType;
import org.eclipse.gmf.codegen.gmfgen.ModelFacet;
import org.eclipse.gmf.codegen.gmfgen.NotationType;
import org.eclipse.gmf.codegen.gmfgen.PackageNames;
import org.eclipse.gmf.codegen.gmfgen.Palette;
import org.eclipse.gmf.codegen.gmfgen.ParentAssignedViewmap;
import org.eclipse.gmf.codegen.gmfgen.ProviderClassNames;
import org.eclipse.gmf.codegen.gmfgen.ProviderPriority;
import org.eclipse.gmf.codegen.gmfgen.ResizeConstraints;
import org.eclipse.gmf.codegen.gmfgen.Separator;
import org.eclipse.gmf.codegen.gmfgen.Shortcuts;
import org.eclipse.gmf.codegen.gmfgen.SnippetViewmap;
import org.eclipse.gmf.codegen.gmfgen.SpecializationType;
import org.eclipse.gmf.codegen.gmfgen.StyleAttributes;
import org.eclipse.gmf.codegen.gmfgen.ToolEntry;
import org.eclipse.gmf.codegen.gmfgen.ToolGroup;
import org.eclipse.gmf.codegen.gmfgen.ToolGroupItem;
import org.eclipse.gmf.codegen.gmfgen.TypeLinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.TypeModelFacet;
import org.eclipse.gmf.codegen.gmfgen.ValueExpression;
import org.eclipse.gmf.codegen.gmfgen.Viewmap;

import org.eclipse.gmf.codegen.gmfgen.ViewmapLayoutType;
import org.eclipse.gmf.validate.GMFValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GMFGenPackageImpl extends EPackageImpl implements GMFGenPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genEditorGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genEditorViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batchValidationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerClassNamesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortcutsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageNamesEClass = null;

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
	private EClass editorCandiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editPartCandiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genPluginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metamodelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specializationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genCommonBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genContainerBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genTopLevelNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genChildNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genChildLabelNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genCompartmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genChildContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genNodeLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genExternalNodeLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genLinkLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFacetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkModelFacetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelModelFacetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeModelFacetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureModelFacetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureLabelModelFacetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeFeatureModelFacetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeFeatureLabelModelFacetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designLabelModelFacetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeLinkModelFacetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureLinkModelFacetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewmapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resizeConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultSizeAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelOffsetAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass figureViewmapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass snippetViewmapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass innerClassViewmapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parentAssignedViewmapEClass = null;

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
	private EClass genConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paletteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolGroupItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass separatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genElementInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genFeatureSeqInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genFeatureValueSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genLinkConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genRuleContainerBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genAuditContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genRuleBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genAuditRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genRuleTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genDomainElementTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genDiagramElementTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genDomainAttributeTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genNotationElementTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genMetricContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genMetricRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genAuditedMetricTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genAuditableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genMeasurableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genExpressionProviderContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genExpressionProviderBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genJavaExpressionProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genExpressionInterpreterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum providerPriorityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum linkLabelAlignmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum viewmapLayoutTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genSeverityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genLanguageEEnum = null;

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
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GMFGenPackageImpl() {
		super(eNS_URI, GMFGenFactory.eINSTANCE);
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
	public static GMFGenPackage init() {
		if (isInited) return (GMFGenPackage)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI);

		// Obtain or create and register package
		GMFGenPackageImpl theGMFGenPackage = (GMFGenPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof GMFGenPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new GMFGenPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		GenModelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGMFGenPackage.createPackageContents();

		// Initialize created meta-data
		theGMFGenPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGMFGenPackage.freeze();

		return theGMFGenPackage;
	}

	public void initializePackageContents() {
		initializePackageContentsGen();
		EValidator.Registry.INSTANCE.put(this, GMFValidator.INSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenEditorGenerator() {
		return genEditorGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditorGenerator_Audits() {
		return (EReference)genEditorGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditorGenerator_Metrics() {
		return (EReference)genEditorGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditorGenerator_Diagram() {
		return (EReference)genEditorGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditorGenerator_Plugin() {
		return (EReference)genEditorGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditorGenerator_Editor() {
		return (EReference)genEditorGeneratorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditorGenerator_DomainGenModel() {
		return (EReference)genEditorGeneratorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorGenerator_PackageNamePrefix() {
		return (EAttribute)genEditorGeneratorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorGenerator_ModelID() {
		return (EAttribute)genEditorGeneratorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorGenerator_SameFileForDiagramAndModel() {
		return (EAttribute)genEditorGeneratorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorGenerator_DiagramFileExtension() {
		return (EAttribute)genEditorGeneratorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorGenerator_DomainFileExtension() {
		return (EAttribute)genEditorGeneratorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorGenerator_DynamicTemplates() {
		return (EAttribute)genEditorGeneratorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorGenerator_TemplateDirectory() {
		return (EAttribute)genEditorGeneratorEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorGenerator_CopyrightText() {
		return (EAttribute)genEditorGeneratorEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditorGenerator_ExpressionProviders() {
		return (EReference)genEditorGeneratorEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenDiagram() {
		return genDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagram_EditorGen() {
		return (EReference)genDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagram_DomainDiagramElement() {
		return (EReference)genDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagram_ChildNodes() {
		return (EReference)genDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagram_TopLevelNodes() {
		return (EReference)genDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagram_Links() {
		return (EReference)genDiagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagram_Compartments() {
		return (EReference)genDiagramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagram_Palette() {
		return (EReference)genDiagramEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_Synchronized() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenEditorView() {
		return genEditorViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditorView_EditorGen() {
		return (EReference)genEditorViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorView_PackageName() {
		return (EAttribute)genEditorViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorView_ActionBarContributorClassName() {
		return (EAttribute)genEditorViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorView_ClassName() {
		return (EAttribute)genEditorViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorView_IconPath() {
		return (EAttribute)genEditorViewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorView_ID() {
		return (EAttribute)genEditorViewEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBatchValidation() {
		return batchValidationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatchValidation_ValidationProviderClassName() {
		return (EAttribute)batchValidationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatchValidation_ValidationProviderPriority() {
		return (EAttribute)batchValidationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatchValidation_MarkerNavigationProviderClassName() {
		return (EAttribute)batchValidationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatchValidation_MarkerNavigationProviderPriority() {
		return (EAttribute)batchValidationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatchValidation_ValidationEnabled() {
		return (EAttribute)batchValidationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatchValidation_MetricProviderClassName() {
		return (EAttribute)batchValidationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatchValidation_MetricProviderPriority() {
		return (EAttribute)batchValidationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatchValidation_ValidationDecoratorProviderClassName() {
		return (EAttribute)batchValidationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatchValidation_ValidationDecorators() {
		return (EAttribute)batchValidationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatchValidation_ValidationDecoratorProviderPriority() {
		return (EAttribute)batchValidationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProviderClassNames() {
		return providerClassNamesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_ElementTypesClassName() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_NotationViewProviderClassName() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_NotationViewProviderPriority() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_EditPartProviderClassName() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_EditPartProviderPriority() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_PaletteProviderClassName() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_PaletteProviderPriority() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_ModelingAssistantProviderClassName() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_ModelingAssistantProviderPriority() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_PropertyProviderClassName() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_PropertyProviderPriority() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_IconProviderClassName() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_IconProviderPriority() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_ParserProviderClassName() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_ParserProviderPriority() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_AbstractParserClassName() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_StructuralFeatureParserClassName() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_StructuralFeaturesParserClassName() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_ContributionItemProviderClassName() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShortcuts() {
		return shortcutsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortcuts_ShortcutsDecoratorProviderClassName() {
		return (EAttribute)shortcutsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortcuts_ShortcutsDecoratorProviderPriority() {
		return (EAttribute)shortcutsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortcuts_CreateShortcutActionClassName() {
		return (EAttribute)shortcutsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortcuts_ContainsShortcutsTo() {
		return (EAttribute)shortcutsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortcuts_ShortcutsProvidedFor() {
		return (EAttribute)shortcutsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageNames() {
		return packageNamesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageNames_EditCommandsPackageName() {
		return (EAttribute)packageNamesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageNames_EditHelpersPackageName() {
		return (EAttribute)packageNamesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageNames_EditPartsPackageName() {
		return (EAttribute)packageNamesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageNames_EditPoliciesPackageName() {
		return (EAttribute)packageNamesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageNames_ProvidersPackageName() {
		return (EAttribute)packageNamesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageNames_NotationViewFactoriesPackageName() {
		return (EAttribute)packageNamesEClass.getEStructuralFeatures().get(5);
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
	public EClass getEditorCandies() {
		return editorCandiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_CreationWizardClassName() {
		return (EAttribute)editorCandiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_CreationWizardPageClassName() {
		return (EAttribute)editorCandiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_CreationWizardIconPath() {
		return (EAttribute)editorCandiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_CreationWizardCategoryID() {
		return (EAttribute)editorCandiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_DiagramEditorUtilClassName() {
		return (EAttribute)editorCandiesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_DiagramFileCreatorClassName() {
		return (EAttribute)editorCandiesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_DocumentProviderClassName() {
		return (EAttribute)editorCandiesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_InitDiagramFileActionClassName() {
		return (EAttribute)editorCandiesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_NewDiagramFileWizardClassName() {
		return (EAttribute)editorCandiesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_MatchingStrategyClassName() {
		return (EAttribute)editorCandiesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_PreferenceInitializerClassName() {
		return (EAttribute)editorCandiesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_VisualIDRegistryClassName() {
		return (EAttribute)editorCandiesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_ElementChooserClassName() {
		return (EAttribute)editorCandiesEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_LoadResourceActionClassName() {
		return (EAttribute)editorCandiesEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_EditingDomainID() {
		return (EAttribute)editorCandiesEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEditPartCandies() {
		return editPartCandiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditPartCandies_ReorientConnectionViewCommandClassName() {
		return (EAttribute)editPartCandiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditPartCandies_BaseEditHelperClassName() {
		return (EAttribute)editPartCandiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditPartCandies_EditPartFactoryClassName() {
		return (EAttribute)editPartCandiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditPartCandies_BaseExternalNodeLabelEditPartClassName() {
		return (EAttribute)editPartCandiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditPartCandies_BaseItemSemanticEditPolicyClassName() {
		return (EAttribute)editPartCandiesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditPartCandies_BaseGraphicalNodeEditPolicyClassName() {
		return (EAttribute)editPartCandiesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditPartCandies_ReferenceConnectionEditPolicyClassName() {
		return (EAttribute)editPartCandiesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditPartCandies_CanonicalEditPolicyClassName() {
		return (EAttribute)editPartCandiesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditPartCandies_TextSelectionEditPolicyClassName() {
		return (EAttribute)editPartCandiesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditPartCandies_TextNonResizableEditPolicyClassName() {
		return (EAttribute)editPartCandiesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditPartCandies_ExternalNodeLabelHostLayoutEditPolicyClassName() {
		return (EAttribute)editPartCandiesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurementUnit() {
		return measurementUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementUnit_Units() {
		return (EAttribute)measurementUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenPlugin() {
		return genPluginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPlugin_EditorGen() {
		return (EReference)genPluginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenPlugin_ID() {
		return (EAttribute)genPluginEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenPlugin_Name() {
		return (EAttribute)genPluginEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenPlugin_Provider() {
		return (EAttribute)genPluginEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenPlugin_Version() {
		return (EAttribute)genPluginEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenPlugin_PrintingEnabled() {
		return (EAttribute)genPluginEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenPlugin_ActivatorClassName() {
		return (EAttribute)genPluginEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementType() {
		return elementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementType_DiagramElement() {
		return (EReference)elementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementType_UniqueIdentifier() {
		return (EAttribute)elementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementType_DisplayName() {
		return (EAttribute)elementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementType_DefinedExternally() {
		return (EAttribute)elementTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetamodelType() {
		return metamodelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodelType_EditHelperClassName() {
		return (EAttribute)metamodelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecializationType() {
		return specializationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecializationType_MetamodelType() {
		return (EReference)specializationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecializationType_EditHelperAdviceClassName() {
		return (EAttribute)specializationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotationType() {
		return notationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenCommonBase() {
		return genCommonBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCommonBase_DiagramRunTimeClass() {
		return (EReference)genCommonBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCommonBase_VisualID() {
		return (EAttribute)genCommonBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCommonBase_ElementType() {
		return (EReference)genCommonBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCommonBase_EditPartClassName() {
		return (EAttribute)genCommonBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCommonBase_ItemSemanticEditPolicyClassName() {
		return (EAttribute)genCommonBaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCommonBase_NotationViewFactoryClassName() {
		return (EAttribute)genCommonBaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCommonBase_Viewmap() {
		return (EReference)genCommonBaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenContainerBase() {
		return genContainerBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenContainerBase_ContainedNodes() {
		return (EReference)genContainerBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenNode() {
		return genNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenNode_Labels() {
		return (EReference)genNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenNode_Compartments() {
		return (EReference)genNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNode_GraphicalNodeEditPolicyClassName() {
		return (EAttribute)genNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenTopLevelNode() {
		return genTopLevelNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenTopLevelNode_Diagram() {
		return (EReference)genTopLevelNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenChildNode() {
		return genChildNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenChildNode_Diagram() {
		return (EReference)genChildNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenChildNode_Containers() {
		return (EReference)genChildNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenChildLabelNode() {
		return genChildLabelNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenChildLabelNode_LabelReadOnly() {
		return (EAttribute)genChildLabelNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenChildLabelNode_LabelElementIcon() {
		return (EAttribute)genChildLabelNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenChildLabelNode_LabelModelFacet() {
		return (EReference)genChildLabelNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenCompartment() {
		return genCompartmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCompartment_Title() {
		return (EAttribute)genCompartmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCompartment_CanCollapse() {
		return (EAttribute)genCompartmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCompartment_HideIfEmpty() {
		return (EAttribute)genCompartmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCompartment_NeedsTitle() {
		return (EAttribute)genCompartmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCompartment_Diagram() {
		return (EReference)genCompartmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCompartment_Node() {
		return (EReference)genCompartmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCompartment_ListLayout() {
		return (EAttribute)genCompartmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenNode_ModelFacet() {
		return (EReference)genNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenChildContainer() {
		return genChildContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenChildContainer_ChildNodes() {
		return (EReference)genChildContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenChildContainer_CanonicalEditPolicyClassName() {
		return (EAttribute)genChildContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenLink() {
		return genLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLink_Diagram() {
		return (EReference)genLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLink_ModelFacet() {
		return (EReference)genLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLink_Labels() {
		return (EReference)genLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenLink_OutgoingCreationAllowed() {
		return (EAttribute)genLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenLink_IncomingCreationAllowed() {
		return (EAttribute)genLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenLink_ViewDirectionAlignedWithModel() {
		return (EAttribute)genLinkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLink_CreationConstraints() {
		return (EReference)genLinkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenLabel() {
		return genLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenLabel_ReadOnly() {
		return (EAttribute)genLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenLabel_ElementIcon() {
		return (EAttribute)genLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLabel_ModelFacet() {
		return (EReference)genLabelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenNodeLabel() {
		return genNodeLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenNodeLabel_Node() {
		return (EReference)genNodeLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenExternalNodeLabel() {
		return genExternalNodeLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenLinkLabel() {
		return genLinkLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLinkLabel_Link() {
		return (EReference)genLinkLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenLinkLabel_Alignment() {
		return (EAttribute)genLinkLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelFacet() {
		return modelFacetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkModelFacet() {
		return linkModelFacetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelModelFacet() {
		return labelModelFacetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeModelFacet() {
		return typeModelFacetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeModelFacet_MetaClass() {
		return (EReference)typeModelFacetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeModelFacet_ContainmentMetaFeature() {
		return (EReference)typeModelFacetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeModelFacet_ChildMetaFeature() {
		return (EReference)typeModelFacetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeModelFacet_ModelElementSelector() {
		return (EReference)typeModelFacetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeModelFacet_ModelElementInitializer() {
		return (EReference)typeModelFacetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureModelFacet() {
		return featureModelFacetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureModelFacet_MetaFeature() {
		return (EReference)featureModelFacetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureLabelModelFacet() {
		return featureLabelModelFacetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureLabelModelFacet_ViewPattern() {
		return (EAttribute)featureLabelModelFacetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureLabelModelFacet_EditPattern() {
		return (EAttribute)featureLabelModelFacetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeFeatureModelFacet() {
		return compositeFeatureModelFacetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeFeatureModelFacet_MetaFeatures() {
		return (EReference)compositeFeatureModelFacetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeFeatureLabelModelFacet() {
		return compositeFeatureLabelModelFacetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeFeatureLabelModelFacet_ViewPattern() {
		return (EAttribute)compositeFeatureLabelModelFacetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeFeatureLabelModelFacet_EditPattern() {
		return (EAttribute)compositeFeatureLabelModelFacetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesignLabelModelFacet() {
		return designLabelModelFacetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeLinkModelFacet() {
		return typeLinkModelFacetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeLinkModelFacet_SourceMetaFeature() {
		return (EReference)typeLinkModelFacetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeLinkModelFacet_TargetMetaFeature() {
		return (EReference)typeLinkModelFacetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureLinkModelFacet() {
		return featureLinkModelFacetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewmap() {
		return viewmapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewmap_Attributes() {
		return (EReference)viewmapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewmap_RequiredPluginIDs() {
		return (EAttribute)viewmapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewmap_LayoutType() {
		return (EAttribute)viewmapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributes() {
		return attributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorAttributes() {
		return colorAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorAttributes_ForegroundColor() {
		return (EAttribute)colorAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorAttributes_BackgroundColor() {
		return (EAttribute)colorAttributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleAttributes() {
		return styleAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleAttributes_FixedFont() {
		return (EAttribute)styleAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleAttributes_FixedForeground() {
		return (EAttribute)styleAttributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleAttributes_FixedBackground() {
		return (EAttribute)styleAttributesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResizeConstraints() {
		return resizeConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResizeConstraints_ResizeHandles() {
		return (EAttribute)resizeConstraintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResizeConstraints_NonResizeHandles() {
		return (EAttribute)resizeConstraintsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultSizeAttributes() {
		return defaultSizeAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultSizeAttributes_Width() {
		return (EAttribute)defaultSizeAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultSizeAttributes_Height() {
		return (EAttribute)defaultSizeAttributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelOffsetAttributes() {
		return labelOffsetAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelOffsetAttributes_X() {
		return (EAttribute)labelOffsetAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelOffsetAttributes_Y() {
		return (EAttribute)labelOffsetAttributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFigureViewmap() {
		return figureViewmapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFigureViewmap_FigureQualifiedClassName() {
		return (EAttribute)figureViewmapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSnippetViewmap() {
		return snippetViewmapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSnippetViewmap_Body() {
		return (EAttribute)snippetViewmapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInnerClassViewmap() {
		return innerClassViewmapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInnerClassViewmap_ClassName() {
		return (EAttribute)innerClassViewmapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInnerClassViewmap_ClassBody() {
		return (EAttribute)innerClassViewmapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParentAssignedViewmap() {
		return parentAssignedViewmapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParentAssignedViewmap_GetterName() {
		return (EAttribute)parentAssignedViewmapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParentAssignedViewmap_SetterName() {
		return (EAttribute)parentAssignedViewmapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParentAssignedViewmap_FigureQualifiedClassName() {
		return (EAttribute)parentAssignedViewmapEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getValueExpression_LangName() {
		return (EAttribute)valueExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenConstraint() {
		return genConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPalette() {
		return paletteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPalette_Diagram() {
		return (EReference)paletteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPalette_Flyout() {
		return (EAttribute)paletteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPalette_Groups() {
		return (EReference)paletteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPalette_PackageName() {
		return (EAttribute)paletteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPalette_FactoryClassName() {
		return (EAttribute)paletteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryBase() {
		return entryBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryBase_Title() {
		return (EAttribute)entryBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryBase_Description() {
		return (EAttribute)entryBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryBase_LargeIconPath() {
		return (EAttribute)entryBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryBase_SmallIconPath() {
		return (EAttribute)entryBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryBase_CreateMethodName() {
		return (EAttribute)entryBaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolEntry() {
		return toolEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolEntry_Default() {
		return (EAttribute)toolEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolEntry_GenNodes() {
		return (EReference)toolEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolEntry_GenLinks() {
		return (EReference)toolEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolEntry_Elements() {
		return (EReference)toolEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolEntry_QualifiedToolName() {
		return (EAttribute)toolEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolEntry_Properties() {
		return (EReference)toolEntryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolGroupItem() {
		return toolGroupItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeparator() {
		return separatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolGroup() {
		return toolGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolGroup_Stack() {
		return (EAttribute)toolGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolGroup_Collapse() {
		return (EAttribute)toolGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolGroup_Entries() {
		return (EReference)toolGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolGroup_ToolsOnly() {
		return (EAttribute)toolGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenElementInitializer() {
		return genElementInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenElementInitializer_TypeModelFacet() {
		return (EReference)genElementInitializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenFeatureSeqInitializer() {
		return genFeatureSeqInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenFeatureSeqInitializer_Initializers() {
		return (EReference)genFeatureSeqInitializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenFeatureValueSpec() {
		return genFeatureValueSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenFeatureValueSpec_Feature() {
		return (EReference)genFeatureValueSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenFeatureValueSpec_FeatureSeqInitializer() {
		return (EReference)genFeatureValueSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenLinkConstraints() {
		return genLinkConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLinkConstraints_Link() {
		return (EReference)genLinkConstraintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLinkConstraints_SourceEnd() {
		return (EReference)genLinkConstraintsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLinkConstraints_TargetEnd() {
		return (EReference)genLinkConstraintsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenRuleContainerBase() {
		return genRuleContainerBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenRuleContainerBase_Editor() {
		return (EReference)genRuleContainerBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenAuditContainer() {
		return genAuditContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenAuditContainer_Audits() {
		return (EReference)genAuditContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenAuditContainer_ChildContainers() {
		return (EReference)genAuditContainerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenRuleBase() {
		return genRuleBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenRuleBase_Name() {
		return (EAttribute)genRuleBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenRuleBase_Description() {
		return (EAttribute)genRuleBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenAuditContainer_Id() {
		return (EAttribute)genAuditContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenAuditContainer_Name() {
		return (EAttribute)genAuditContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenAuditContainer_Description() {
		return (EAttribute)genAuditContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenAuditContainer_ParentContainer() {
		return (EReference)genAuditContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenAuditRule() {
		return genAuditRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenAuditRule_Id() {
		return (EAttribute)genAuditRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenAuditRule_Rule() {
		return (EReference)genAuditRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenAuditRule_Target() {
		return (EReference)genAuditRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenAuditRule_Message() {
		return (EAttribute)genAuditRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenAuditRule_Severity() {
		return (EAttribute)genAuditRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenAuditRule_UseInLiveMode() {
		return (EAttribute)genAuditRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenAuditRule_Container() {
		return (EReference)genAuditRuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenRuleTarget() {
		return genRuleTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenDomainElementTarget() {
		return genDomainElementTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDomainElementTarget_Element() {
		return (EReference)genDomainElementTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenDiagramElementTarget() {
		return genDiagramElementTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagramElementTarget_Element() {
		return (EReference)genDiagramElementTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenDomainAttributeTarget() {
		return genDomainAttributeTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDomainAttributeTarget_Attribute() {
		return (EReference)genDomainAttributeTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDomainAttributeTarget_NullAsError() {
		return (EAttribute)genDomainAttributeTargetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenNotationElementTarget() {
		return genNotationElementTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenNotationElementTarget_Element() {
		return (EReference)genNotationElementTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenMetricContainer() {
		return genMetricContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenMetricContainer_Metrics() {
		return (EReference)genMetricContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenMetricRule() {
		return genMetricRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenMetricRule_Key() {
		return (EAttribute)genMetricRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenMetricRule_Rule() {
		return (EReference)genMetricRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenMetricRule_Target() {
		return (EReference)genMetricRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenMetricRule_Container() {
		return (EReference)genMetricRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenMetricRule_LowLimit() {
		return (EAttribute)genMetricRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenMetricRule_HighLimit() {
		return (EAttribute)genMetricRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenAuditedMetricTarget() {
		return genAuditedMetricTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenAuditedMetricTarget_Metric() {
		return (EReference)genAuditedMetricTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenAuditedMetricTarget_MetricValueContext() {
		return (EReference)genAuditedMetricTargetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenAuditable() {
		return genAuditableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenMeasurable() {
		return genMeasurableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenExpressionProviderContainer() {
		return genExpressionProviderContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenExpressionProviderContainer_ExpressionsPackageName() {
		return (EAttribute)genExpressionProviderContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenExpressionProviderContainer_AbstractExpressionClassName() {
		return (EAttribute)genExpressionProviderContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenExpressionProviderContainer_Providers() {
		return (EReference)genExpressionProviderContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenExpressionProviderContainer_EditorGen() {
		return (EReference)genExpressionProviderContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenExpressionProviderBase() {
		return genExpressionProviderBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenExpressionProviderBase_Expressions() {
		return (EReference)genExpressionProviderBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenExpressionProviderBase_Container() {
		return (EReference)genExpressionProviderBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenJavaExpressionProvider() {
		return genJavaExpressionProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenExpressionInterpreter() {
		return genExpressionInterpreterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenExpressionInterpreter_Language() {
		return (EAttribute)genExpressionInterpreterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenExpressionInterpreter_ClassName() {
		return (EAttribute)genExpressionInterpreterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenExpressionInterpreter_RequiredPluginIDs() {
		return (EAttribute)genExpressionInterpreterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProviderPriority() {
		return providerPriorityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLinkLabelAlignment() {
		return linkLabelAlignmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getViewmapLayoutType() {
		return viewmapLayoutTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGenSeverity() {
		return genSeverityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGenLanguage() {
		return genLanguageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFGenFactory getGMFGenFactory() {
		return (GMFGenFactory)getEFactoryInstance();
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
		genEditorGeneratorEClass = createEClass(GEN_EDITOR_GENERATOR);
		createEReference(genEditorGeneratorEClass, GEN_EDITOR_GENERATOR__AUDITS);
		createEReference(genEditorGeneratorEClass, GEN_EDITOR_GENERATOR__METRICS);
		createEReference(genEditorGeneratorEClass, GEN_EDITOR_GENERATOR__DIAGRAM);
		createEReference(genEditorGeneratorEClass, GEN_EDITOR_GENERATOR__PLUGIN);
		createEReference(genEditorGeneratorEClass, GEN_EDITOR_GENERATOR__EDITOR);
		createEReference(genEditorGeneratorEClass, GEN_EDITOR_GENERATOR__DOMAIN_GEN_MODEL);
		createEAttribute(genEditorGeneratorEClass, GEN_EDITOR_GENERATOR__PACKAGE_NAME_PREFIX);
		createEAttribute(genEditorGeneratorEClass, GEN_EDITOR_GENERATOR__MODEL_ID);
		createEAttribute(genEditorGeneratorEClass, GEN_EDITOR_GENERATOR__SAME_FILE_FOR_DIAGRAM_AND_MODEL);
		createEAttribute(genEditorGeneratorEClass, GEN_EDITOR_GENERATOR__DIAGRAM_FILE_EXTENSION);
		createEAttribute(genEditorGeneratorEClass, GEN_EDITOR_GENERATOR__DOMAIN_FILE_EXTENSION);
		createEAttribute(genEditorGeneratorEClass, GEN_EDITOR_GENERATOR__DYNAMIC_TEMPLATES);
		createEAttribute(genEditorGeneratorEClass, GEN_EDITOR_GENERATOR__TEMPLATE_DIRECTORY);
		createEAttribute(genEditorGeneratorEClass, GEN_EDITOR_GENERATOR__COPYRIGHT_TEXT);
		createEReference(genEditorGeneratorEClass, GEN_EDITOR_GENERATOR__EXPRESSION_PROVIDERS);

		genDiagramEClass = createEClass(GEN_DIAGRAM);
		createEReference(genDiagramEClass, GEN_DIAGRAM__EDITOR_GEN);
		createEReference(genDiagramEClass, GEN_DIAGRAM__DOMAIN_DIAGRAM_ELEMENT);
		createEReference(genDiagramEClass, GEN_DIAGRAM__CHILD_NODES);
		createEReference(genDiagramEClass, GEN_DIAGRAM__TOP_LEVEL_NODES);
		createEReference(genDiagramEClass, GEN_DIAGRAM__LINKS);
		createEReference(genDiagramEClass, GEN_DIAGRAM__COMPARTMENTS);
		createEReference(genDiagramEClass, GEN_DIAGRAM__PALETTE);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__SYNCHRONIZED);

		genEditorViewEClass = createEClass(GEN_EDITOR_VIEW);
		createEReference(genEditorViewEClass, GEN_EDITOR_VIEW__EDITOR_GEN);
		createEAttribute(genEditorViewEClass, GEN_EDITOR_VIEW__PACKAGE_NAME);
		createEAttribute(genEditorViewEClass, GEN_EDITOR_VIEW__ACTION_BAR_CONTRIBUTOR_CLASS_NAME);
		createEAttribute(genEditorViewEClass, GEN_EDITOR_VIEW__CLASS_NAME);
		createEAttribute(genEditorViewEClass, GEN_EDITOR_VIEW__ICON_PATH);
		createEAttribute(genEditorViewEClass, GEN_EDITOR_VIEW__ID);

		batchValidationEClass = createEClass(BATCH_VALIDATION);
		createEAttribute(batchValidationEClass, BATCH_VALIDATION__VALIDATION_PROVIDER_CLASS_NAME);
		createEAttribute(batchValidationEClass, BATCH_VALIDATION__VALIDATION_PROVIDER_PRIORITY);
		createEAttribute(batchValidationEClass, BATCH_VALIDATION__MARKER_NAVIGATION_PROVIDER_CLASS_NAME);
		createEAttribute(batchValidationEClass, BATCH_VALIDATION__MARKER_NAVIGATION_PROVIDER_PRIORITY);
		createEAttribute(batchValidationEClass, BATCH_VALIDATION__VALIDATION_ENABLED);
		createEAttribute(batchValidationEClass, BATCH_VALIDATION__METRIC_PROVIDER_CLASS_NAME);
		createEAttribute(batchValidationEClass, BATCH_VALIDATION__METRIC_PROVIDER_PRIORITY);
		createEAttribute(batchValidationEClass, BATCH_VALIDATION__VALIDATION_DECORATOR_PROVIDER_CLASS_NAME);
		createEAttribute(batchValidationEClass, BATCH_VALIDATION__VALIDATION_DECORATORS);
		createEAttribute(batchValidationEClass, BATCH_VALIDATION__VALIDATION_DECORATOR_PROVIDER_PRIORITY);

		providerClassNamesEClass = createEClass(PROVIDER_CLASS_NAMES);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__ELEMENT_TYPES_CLASS_NAME);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__NOTATION_VIEW_PROVIDER_CLASS_NAME);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__NOTATION_VIEW_PROVIDER_PRIORITY);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__EDIT_PART_PROVIDER_CLASS_NAME);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__EDIT_PART_PROVIDER_PRIORITY);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__PALETTE_PROVIDER_CLASS_NAME);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__PALETTE_PROVIDER_PRIORITY);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__MODELING_ASSISTANT_PROVIDER_CLASS_NAME);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__MODELING_ASSISTANT_PROVIDER_PRIORITY);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__PROPERTY_PROVIDER_CLASS_NAME);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__PROPERTY_PROVIDER_PRIORITY);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__ICON_PROVIDER_CLASS_NAME);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__ICON_PROVIDER_PRIORITY);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__PARSER_PROVIDER_CLASS_NAME);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__PARSER_PROVIDER_PRIORITY);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__ABSTRACT_PARSER_CLASS_NAME);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__STRUCTURAL_FEATURE_PARSER_CLASS_NAME);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__STRUCTURAL_FEATURES_PARSER_CLASS_NAME);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__CONTRIBUTION_ITEM_PROVIDER_CLASS_NAME);

		shortcutsEClass = createEClass(SHORTCUTS);
		createEAttribute(shortcutsEClass, SHORTCUTS__SHORTCUTS_DECORATOR_PROVIDER_CLASS_NAME);
		createEAttribute(shortcutsEClass, SHORTCUTS__SHORTCUTS_DECORATOR_PROVIDER_PRIORITY);
		createEAttribute(shortcutsEClass, SHORTCUTS__CREATE_SHORTCUT_ACTION_CLASS_NAME);
		createEAttribute(shortcutsEClass, SHORTCUTS__CONTAINS_SHORTCUTS_TO);
		createEAttribute(shortcutsEClass, SHORTCUTS__SHORTCUTS_PROVIDED_FOR);

		packageNamesEClass = createEClass(PACKAGE_NAMES);
		createEAttribute(packageNamesEClass, PACKAGE_NAMES__EDIT_COMMANDS_PACKAGE_NAME);
		createEAttribute(packageNamesEClass, PACKAGE_NAMES__EDIT_HELPERS_PACKAGE_NAME);
		createEAttribute(packageNamesEClass, PACKAGE_NAMES__EDIT_PARTS_PACKAGE_NAME);
		createEAttribute(packageNamesEClass, PACKAGE_NAMES__EDIT_POLICIES_PACKAGE_NAME);
		createEAttribute(packageNamesEClass, PACKAGE_NAMES__PROVIDERS_PACKAGE_NAME);
		createEAttribute(packageNamesEClass, PACKAGE_NAMES__NOTATION_VIEW_FACTORIES_PACKAGE_NAME);

		linkConstraintsEClass = createEClass(LINK_CONSTRAINTS);

		editorCandiesEClass = createEClass(EDITOR_CANDIES);
		createEAttribute(editorCandiesEClass, EDITOR_CANDIES__CREATION_WIZARD_CLASS_NAME);
		createEAttribute(editorCandiesEClass, EDITOR_CANDIES__CREATION_WIZARD_PAGE_CLASS_NAME);
		createEAttribute(editorCandiesEClass, EDITOR_CANDIES__CREATION_WIZARD_ICON_PATH);
		createEAttribute(editorCandiesEClass, EDITOR_CANDIES__CREATION_WIZARD_CATEGORY_ID);
		createEAttribute(editorCandiesEClass, EDITOR_CANDIES__DIAGRAM_EDITOR_UTIL_CLASS_NAME);
		createEAttribute(editorCandiesEClass, EDITOR_CANDIES__DIAGRAM_FILE_CREATOR_CLASS_NAME);
		createEAttribute(editorCandiesEClass, EDITOR_CANDIES__DOCUMENT_PROVIDER_CLASS_NAME);
		createEAttribute(editorCandiesEClass, EDITOR_CANDIES__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME);
		createEAttribute(editorCandiesEClass, EDITOR_CANDIES__NEW_DIAGRAM_FILE_WIZARD_CLASS_NAME);
		createEAttribute(editorCandiesEClass, EDITOR_CANDIES__MATCHING_STRATEGY_CLASS_NAME);
		createEAttribute(editorCandiesEClass, EDITOR_CANDIES__PREFERENCE_INITIALIZER_CLASS_NAME);
		createEAttribute(editorCandiesEClass, EDITOR_CANDIES__VISUAL_ID_REGISTRY_CLASS_NAME);
		createEAttribute(editorCandiesEClass, EDITOR_CANDIES__ELEMENT_CHOOSER_CLASS_NAME);
		createEAttribute(editorCandiesEClass, EDITOR_CANDIES__LOAD_RESOURCE_ACTION_CLASS_NAME);
		createEAttribute(editorCandiesEClass, EDITOR_CANDIES__EDITING_DOMAIN_ID);

		editPartCandiesEClass = createEClass(EDIT_PART_CANDIES);
		createEAttribute(editPartCandiesEClass, EDIT_PART_CANDIES__REORIENT_CONNECTION_VIEW_COMMAND_CLASS_NAME);
		createEAttribute(editPartCandiesEClass, EDIT_PART_CANDIES__BASE_EDIT_HELPER_CLASS_NAME);
		createEAttribute(editPartCandiesEClass, EDIT_PART_CANDIES__EDIT_PART_FACTORY_CLASS_NAME);
		createEAttribute(editPartCandiesEClass, EDIT_PART_CANDIES__BASE_EXTERNAL_NODE_LABEL_EDIT_PART_CLASS_NAME);
		createEAttribute(editPartCandiesEClass, EDIT_PART_CANDIES__BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME);
		createEAttribute(editPartCandiesEClass, EDIT_PART_CANDIES__BASE_GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME);
		createEAttribute(editPartCandiesEClass, EDIT_PART_CANDIES__REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME);
		createEAttribute(editPartCandiesEClass, EDIT_PART_CANDIES__CANONICAL_EDIT_POLICY_CLASS_NAME);
		createEAttribute(editPartCandiesEClass, EDIT_PART_CANDIES__TEXT_SELECTION_EDIT_POLICY_CLASS_NAME);
		createEAttribute(editPartCandiesEClass, EDIT_PART_CANDIES__TEXT_NON_RESIZABLE_EDIT_POLICY_CLASS_NAME);
		createEAttribute(editPartCandiesEClass, EDIT_PART_CANDIES__EXTERNAL_NODE_LABEL_HOST_LAYOUT_EDIT_POLICY_CLASS_NAME);

		measurementUnitEClass = createEClass(MEASUREMENT_UNIT);
		createEAttribute(measurementUnitEClass, MEASUREMENT_UNIT__UNITS);

		genPluginEClass = createEClass(GEN_PLUGIN);
		createEReference(genPluginEClass, GEN_PLUGIN__EDITOR_GEN);
		createEAttribute(genPluginEClass, GEN_PLUGIN__ID);
		createEAttribute(genPluginEClass, GEN_PLUGIN__NAME);
		createEAttribute(genPluginEClass, GEN_PLUGIN__PROVIDER);
		createEAttribute(genPluginEClass, GEN_PLUGIN__VERSION);
		createEAttribute(genPluginEClass, GEN_PLUGIN__PRINTING_ENABLED);
		createEAttribute(genPluginEClass, GEN_PLUGIN__ACTIVATOR_CLASS_NAME);

		genCommonBaseEClass = createEClass(GEN_COMMON_BASE);
		createEReference(genCommonBaseEClass, GEN_COMMON_BASE__DIAGRAM_RUN_TIME_CLASS);
		createEAttribute(genCommonBaseEClass, GEN_COMMON_BASE__VISUAL_ID);
		createEReference(genCommonBaseEClass, GEN_COMMON_BASE__ELEMENT_TYPE);
		createEAttribute(genCommonBaseEClass, GEN_COMMON_BASE__EDIT_PART_CLASS_NAME);
		createEAttribute(genCommonBaseEClass, GEN_COMMON_BASE__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME);
		createEAttribute(genCommonBaseEClass, GEN_COMMON_BASE__NOTATION_VIEW_FACTORY_CLASS_NAME);
		createEReference(genCommonBaseEClass, GEN_COMMON_BASE__VIEWMAP);

		genContainerBaseEClass = createEClass(GEN_CONTAINER_BASE);
		createEReference(genContainerBaseEClass, GEN_CONTAINER_BASE__CONTAINED_NODES);

		genChildContainerEClass = createEClass(GEN_CHILD_CONTAINER);
		createEReference(genChildContainerEClass, GEN_CHILD_CONTAINER__CHILD_NODES);
		createEAttribute(genChildContainerEClass, GEN_CHILD_CONTAINER__CANONICAL_EDIT_POLICY_CLASS_NAME);

		genNodeEClass = createEClass(GEN_NODE);
		createEReference(genNodeEClass, GEN_NODE__MODEL_FACET);
		createEReference(genNodeEClass, GEN_NODE__LABELS);
		createEReference(genNodeEClass, GEN_NODE__COMPARTMENTS);
		createEAttribute(genNodeEClass, GEN_NODE__GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME);

		genTopLevelNodeEClass = createEClass(GEN_TOP_LEVEL_NODE);
		createEReference(genTopLevelNodeEClass, GEN_TOP_LEVEL_NODE__DIAGRAM);

		genChildNodeEClass = createEClass(GEN_CHILD_NODE);
		createEReference(genChildNodeEClass, GEN_CHILD_NODE__DIAGRAM);
		createEReference(genChildNodeEClass, GEN_CHILD_NODE__CONTAINERS);

		genChildLabelNodeEClass = createEClass(GEN_CHILD_LABEL_NODE);
		createEAttribute(genChildLabelNodeEClass, GEN_CHILD_LABEL_NODE__LABEL_READ_ONLY);
		createEAttribute(genChildLabelNodeEClass, GEN_CHILD_LABEL_NODE__LABEL_ELEMENT_ICON);
		createEReference(genChildLabelNodeEClass, GEN_CHILD_LABEL_NODE__LABEL_MODEL_FACET);

		genCompartmentEClass = createEClass(GEN_COMPARTMENT);
		createEAttribute(genCompartmentEClass, GEN_COMPARTMENT__TITLE);
		createEAttribute(genCompartmentEClass, GEN_COMPARTMENT__CAN_COLLAPSE);
		createEAttribute(genCompartmentEClass, GEN_COMPARTMENT__HIDE_IF_EMPTY);
		createEAttribute(genCompartmentEClass, GEN_COMPARTMENT__NEEDS_TITLE);
		createEReference(genCompartmentEClass, GEN_COMPARTMENT__DIAGRAM);
		createEReference(genCompartmentEClass, GEN_COMPARTMENT__NODE);
		createEAttribute(genCompartmentEClass, GEN_COMPARTMENT__LIST_LAYOUT);

		genLinkEClass = createEClass(GEN_LINK);
		createEReference(genLinkEClass, GEN_LINK__DIAGRAM);
		createEReference(genLinkEClass, GEN_LINK__MODEL_FACET);
		createEReference(genLinkEClass, GEN_LINK__LABELS);
		createEAttribute(genLinkEClass, GEN_LINK__OUTGOING_CREATION_ALLOWED);
		createEAttribute(genLinkEClass, GEN_LINK__INCOMING_CREATION_ALLOWED);
		createEAttribute(genLinkEClass, GEN_LINK__VIEW_DIRECTION_ALIGNED_WITH_MODEL);
		createEReference(genLinkEClass, GEN_LINK__CREATION_CONSTRAINTS);

		genLabelEClass = createEClass(GEN_LABEL);
		createEAttribute(genLabelEClass, GEN_LABEL__READ_ONLY);
		createEAttribute(genLabelEClass, GEN_LABEL__ELEMENT_ICON);
		createEReference(genLabelEClass, GEN_LABEL__MODEL_FACET);

		genNodeLabelEClass = createEClass(GEN_NODE_LABEL);
		createEReference(genNodeLabelEClass, GEN_NODE_LABEL__NODE);

		genExternalNodeLabelEClass = createEClass(GEN_EXTERNAL_NODE_LABEL);

		genLinkLabelEClass = createEClass(GEN_LINK_LABEL);
		createEReference(genLinkLabelEClass, GEN_LINK_LABEL__LINK);
		createEAttribute(genLinkLabelEClass, GEN_LINK_LABEL__ALIGNMENT);

		elementTypeEClass = createEClass(ELEMENT_TYPE);
		createEReference(elementTypeEClass, ELEMENT_TYPE__DIAGRAM_ELEMENT);
		createEAttribute(elementTypeEClass, ELEMENT_TYPE__UNIQUE_IDENTIFIER);
		createEAttribute(elementTypeEClass, ELEMENT_TYPE__DISPLAY_NAME);
		createEAttribute(elementTypeEClass, ELEMENT_TYPE__DEFINED_EXTERNALLY);

		metamodelTypeEClass = createEClass(METAMODEL_TYPE);
		createEAttribute(metamodelTypeEClass, METAMODEL_TYPE__EDIT_HELPER_CLASS_NAME);

		specializationTypeEClass = createEClass(SPECIALIZATION_TYPE);
		createEReference(specializationTypeEClass, SPECIALIZATION_TYPE__METAMODEL_TYPE);
		createEAttribute(specializationTypeEClass, SPECIALIZATION_TYPE__EDIT_HELPER_ADVICE_CLASS_NAME);

		notationTypeEClass = createEClass(NOTATION_TYPE);

		modelFacetEClass = createEClass(MODEL_FACET);

		linkModelFacetEClass = createEClass(LINK_MODEL_FACET);

		labelModelFacetEClass = createEClass(LABEL_MODEL_FACET);

		typeModelFacetEClass = createEClass(TYPE_MODEL_FACET);
		createEReference(typeModelFacetEClass, TYPE_MODEL_FACET__META_CLASS);
		createEReference(typeModelFacetEClass, TYPE_MODEL_FACET__CONTAINMENT_META_FEATURE);
		createEReference(typeModelFacetEClass, TYPE_MODEL_FACET__CHILD_META_FEATURE);
		createEReference(typeModelFacetEClass, TYPE_MODEL_FACET__MODEL_ELEMENT_SELECTOR);
		createEReference(typeModelFacetEClass, TYPE_MODEL_FACET__MODEL_ELEMENT_INITIALIZER);

		featureModelFacetEClass = createEClass(FEATURE_MODEL_FACET);
		createEReference(featureModelFacetEClass, FEATURE_MODEL_FACET__META_FEATURE);

		compositeFeatureModelFacetEClass = createEClass(COMPOSITE_FEATURE_MODEL_FACET);
		createEReference(compositeFeatureModelFacetEClass, COMPOSITE_FEATURE_MODEL_FACET__META_FEATURES);

		typeLinkModelFacetEClass = createEClass(TYPE_LINK_MODEL_FACET);
		createEReference(typeLinkModelFacetEClass, TYPE_LINK_MODEL_FACET__SOURCE_META_FEATURE);
		createEReference(typeLinkModelFacetEClass, TYPE_LINK_MODEL_FACET__TARGET_META_FEATURE);

		featureLinkModelFacetEClass = createEClass(FEATURE_LINK_MODEL_FACET);

		featureLabelModelFacetEClass = createEClass(FEATURE_LABEL_MODEL_FACET);
		createEAttribute(featureLabelModelFacetEClass, FEATURE_LABEL_MODEL_FACET__VIEW_PATTERN);
		createEAttribute(featureLabelModelFacetEClass, FEATURE_LABEL_MODEL_FACET__EDIT_PATTERN);

		compositeFeatureLabelModelFacetEClass = createEClass(COMPOSITE_FEATURE_LABEL_MODEL_FACET);
		createEAttribute(compositeFeatureLabelModelFacetEClass, COMPOSITE_FEATURE_LABEL_MODEL_FACET__VIEW_PATTERN);
		createEAttribute(compositeFeatureLabelModelFacetEClass, COMPOSITE_FEATURE_LABEL_MODEL_FACET__EDIT_PATTERN);

		designLabelModelFacetEClass = createEClass(DESIGN_LABEL_MODEL_FACET);

		attributesEClass = createEClass(ATTRIBUTES);

		colorAttributesEClass = createEClass(COLOR_ATTRIBUTES);
		createEAttribute(colorAttributesEClass, COLOR_ATTRIBUTES__FOREGROUND_COLOR);
		createEAttribute(colorAttributesEClass, COLOR_ATTRIBUTES__BACKGROUND_COLOR);

		styleAttributesEClass = createEClass(STYLE_ATTRIBUTES);
		createEAttribute(styleAttributesEClass, STYLE_ATTRIBUTES__FIXED_FONT);
		createEAttribute(styleAttributesEClass, STYLE_ATTRIBUTES__FIXED_FOREGROUND);
		createEAttribute(styleAttributesEClass, STYLE_ATTRIBUTES__FIXED_BACKGROUND);

		resizeConstraintsEClass = createEClass(RESIZE_CONSTRAINTS);
		createEAttribute(resizeConstraintsEClass, RESIZE_CONSTRAINTS__RESIZE_HANDLES);
		createEAttribute(resizeConstraintsEClass, RESIZE_CONSTRAINTS__NON_RESIZE_HANDLES);

		defaultSizeAttributesEClass = createEClass(DEFAULT_SIZE_ATTRIBUTES);
		createEAttribute(defaultSizeAttributesEClass, DEFAULT_SIZE_ATTRIBUTES__WIDTH);
		createEAttribute(defaultSizeAttributesEClass, DEFAULT_SIZE_ATTRIBUTES__HEIGHT);

		labelOffsetAttributesEClass = createEClass(LABEL_OFFSET_ATTRIBUTES);
		createEAttribute(labelOffsetAttributesEClass, LABEL_OFFSET_ATTRIBUTES__X);
		createEAttribute(labelOffsetAttributesEClass, LABEL_OFFSET_ATTRIBUTES__Y);

		viewmapEClass = createEClass(VIEWMAP);
		createEReference(viewmapEClass, VIEWMAP__ATTRIBUTES);
		createEAttribute(viewmapEClass, VIEWMAP__REQUIRED_PLUGIN_IDS);
		createEAttribute(viewmapEClass, VIEWMAP__LAYOUT_TYPE);

		figureViewmapEClass = createEClass(FIGURE_VIEWMAP);
		createEAttribute(figureViewmapEClass, FIGURE_VIEWMAP__FIGURE_QUALIFIED_CLASS_NAME);

		snippetViewmapEClass = createEClass(SNIPPET_VIEWMAP);
		createEAttribute(snippetViewmapEClass, SNIPPET_VIEWMAP__BODY);

		innerClassViewmapEClass = createEClass(INNER_CLASS_VIEWMAP);
		createEAttribute(innerClassViewmapEClass, INNER_CLASS_VIEWMAP__CLASS_NAME);
		createEAttribute(innerClassViewmapEClass, INNER_CLASS_VIEWMAP__CLASS_BODY);

		parentAssignedViewmapEClass = createEClass(PARENT_ASSIGNED_VIEWMAP);
		createEAttribute(parentAssignedViewmapEClass, PARENT_ASSIGNED_VIEWMAP__GETTER_NAME);
		createEAttribute(parentAssignedViewmapEClass, PARENT_ASSIGNED_VIEWMAP__SETTER_NAME);
		createEAttribute(parentAssignedViewmapEClass, PARENT_ASSIGNED_VIEWMAP__FIGURE_QUALIFIED_CLASS_NAME);

		valueExpressionEClass = createEClass(VALUE_EXPRESSION);
		createEAttribute(valueExpressionEClass, VALUE_EXPRESSION__BODY);
		createEAttribute(valueExpressionEClass, VALUE_EXPRESSION__LANGUAGE);
		createEAttribute(valueExpressionEClass, VALUE_EXPRESSION__LANG_NAME);

		genConstraintEClass = createEClass(GEN_CONSTRAINT);

		paletteEClass = createEClass(PALETTE);
		createEReference(paletteEClass, PALETTE__DIAGRAM);
		createEAttribute(paletteEClass, PALETTE__FLYOUT);
		createEReference(paletteEClass, PALETTE__GROUPS);
		createEAttribute(paletteEClass, PALETTE__PACKAGE_NAME);
		createEAttribute(paletteEClass, PALETTE__FACTORY_CLASS_NAME);

		entryBaseEClass = createEClass(ENTRY_BASE);
		createEAttribute(entryBaseEClass, ENTRY_BASE__TITLE);
		createEAttribute(entryBaseEClass, ENTRY_BASE__DESCRIPTION);
		createEAttribute(entryBaseEClass, ENTRY_BASE__LARGE_ICON_PATH);
		createEAttribute(entryBaseEClass, ENTRY_BASE__SMALL_ICON_PATH);
		createEAttribute(entryBaseEClass, ENTRY_BASE__CREATE_METHOD_NAME);

		toolEntryEClass = createEClass(TOOL_ENTRY);
		createEAttribute(toolEntryEClass, TOOL_ENTRY__DEFAULT);
		createEReference(toolEntryEClass, TOOL_ENTRY__GEN_NODES);
		createEReference(toolEntryEClass, TOOL_ENTRY__GEN_LINKS);
		createEReference(toolEntryEClass, TOOL_ENTRY__ELEMENTS);
		createEAttribute(toolEntryEClass, TOOL_ENTRY__QUALIFIED_TOOL_NAME);
		createEReference(toolEntryEClass, TOOL_ENTRY__PROPERTIES);

		toolGroupItemEClass = createEClass(TOOL_GROUP_ITEM);

		separatorEClass = createEClass(SEPARATOR);

		toolGroupEClass = createEClass(TOOL_GROUP);
		createEAttribute(toolGroupEClass, TOOL_GROUP__STACK);
		createEAttribute(toolGroupEClass, TOOL_GROUP__COLLAPSE);
		createEReference(toolGroupEClass, TOOL_GROUP__ENTRIES);
		createEAttribute(toolGroupEClass, TOOL_GROUP__TOOLS_ONLY);

		genElementInitializerEClass = createEClass(GEN_ELEMENT_INITIALIZER);
		createEReference(genElementInitializerEClass, GEN_ELEMENT_INITIALIZER__TYPE_MODEL_FACET);

		genFeatureSeqInitializerEClass = createEClass(GEN_FEATURE_SEQ_INITIALIZER);
		createEReference(genFeatureSeqInitializerEClass, GEN_FEATURE_SEQ_INITIALIZER__INITIALIZERS);

		genFeatureValueSpecEClass = createEClass(GEN_FEATURE_VALUE_SPEC);
		createEReference(genFeatureValueSpecEClass, GEN_FEATURE_VALUE_SPEC__FEATURE);
		createEReference(genFeatureValueSpecEClass, GEN_FEATURE_VALUE_SPEC__FEATURE_SEQ_INITIALIZER);

		genLinkConstraintsEClass = createEClass(GEN_LINK_CONSTRAINTS);
		createEReference(genLinkConstraintsEClass, GEN_LINK_CONSTRAINTS__LINK);
		createEReference(genLinkConstraintsEClass, GEN_LINK_CONSTRAINTS__SOURCE_END);
		createEReference(genLinkConstraintsEClass, GEN_LINK_CONSTRAINTS__TARGET_END);

		genRuleContainerBaseEClass = createEClass(GEN_RULE_CONTAINER_BASE);
		createEReference(genRuleContainerBaseEClass, GEN_RULE_CONTAINER_BASE__EDITOR);

		genAuditContainerEClass = createEClass(GEN_AUDIT_CONTAINER);
		createEAttribute(genAuditContainerEClass, GEN_AUDIT_CONTAINER__ID);
		createEAttribute(genAuditContainerEClass, GEN_AUDIT_CONTAINER__NAME);
		createEAttribute(genAuditContainerEClass, GEN_AUDIT_CONTAINER__DESCRIPTION);
		createEReference(genAuditContainerEClass, GEN_AUDIT_CONTAINER__PARENT_CONTAINER);
		createEReference(genAuditContainerEClass, GEN_AUDIT_CONTAINER__AUDITS);
		createEReference(genAuditContainerEClass, GEN_AUDIT_CONTAINER__CHILD_CONTAINERS);

		genRuleBaseEClass = createEClass(GEN_RULE_BASE);
		createEAttribute(genRuleBaseEClass, GEN_RULE_BASE__NAME);
		createEAttribute(genRuleBaseEClass, GEN_RULE_BASE__DESCRIPTION);

		genAuditRuleEClass = createEClass(GEN_AUDIT_RULE);
		createEAttribute(genAuditRuleEClass, GEN_AUDIT_RULE__ID);
		createEReference(genAuditRuleEClass, GEN_AUDIT_RULE__RULE);
		createEReference(genAuditRuleEClass, GEN_AUDIT_RULE__TARGET);
		createEAttribute(genAuditRuleEClass, GEN_AUDIT_RULE__MESSAGE);
		createEAttribute(genAuditRuleEClass, GEN_AUDIT_RULE__SEVERITY);
		createEAttribute(genAuditRuleEClass, GEN_AUDIT_RULE__USE_IN_LIVE_MODE);
		createEReference(genAuditRuleEClass, GEN_AUDIT_RULE__CONTAINER);

		genRuleTargetEClass = createEClass(GEN_RULE_TARGET);

		genDomainElementTargetEClass = createEClass(GEN_DOMAIN_ELEMENT_TARGET);
		createEReference(genDomainElementTargetEClass, GEN_DOMAIN_ELEMENT_TARGET__ELEMENT);

		genDiagramElementTargetEClass = createEClass(GEN_DIAGRAM_ELEMENT_TARGET);
		createEReference(genDiagramElementTargetEClass, GEN_DIAGRAM_ELEMENT_TARGET__ELEMENT);

		genDomainAttributeTargetEClass = createEClass(GEN_DOMAIN_ATTRIBUTE_TARGET);
		createEReference(genDomainAttributeTargetEClass, GEN_DOMAIN_ATTRIBUTE_TARGET__ATTRIBUTE);
		createEAttribute(genDomainAttributeTargetEClass, GEN_DOMAIN_ATTRIBUTE_TARGET__NULL_AS_ERROR);

		genNotationElementTargetEClass = createEClass(GEN_NOTATION_ELEMENT_TARGET);
		createEReference(genNotationElementTargetEClass, GEN_NOTATION_ELEMENT_TARGET__ELEMENT);

		genMetricContainerEClass = createEClass(GEN_METRIC_CONTAINER);
		createEReference(genMetricContainerEClass, GEN_METRIC_CONTAINER__METRICS);

		genMetricRuleEClass = createEClass(GEN_METRIC_RULE);
		createEAttribute(genMetricRuleEClass, GEN_METRIC_RULE__KEY);
		createEReference(genMetricRuleEClass, GEN_METRIC_RULE__RULE);
		createEReference(genMetricRuleEClass, GEN_METRIC_RULE__TARGET);
		createEAttribute(genMetricRuleEClass, GEN_METRIC_RULE__LOW_LIMIT);
		createEAttribute(genMetricRuleEClass, GEN_METRIC_RULE__HIGH_LIMIT);
		createEReference(genMetricRuleEClass, GEN_METRIC_RULE__CONTAINER);

		genAuditedMetricTargetEClass = createEClass(GEN_AUDITED_METRIC_TARGET);
		createEReference(genAuditedMetricTargetEClass, GEN_AUDITED_METRIC_TARGET__METRIC);
		createEReference(genAuditedMetricTargetEClass, GEN_AUDITED_METRIC_TARGET__METRIC_VALUE_CONTEXT);

		genAuditableEClass = createEClass(GEN_AUDITABLE);

		genMeasurableEClass = createEClass(GEN_MEASURABLE);

		genExpressionProviderContainerEClass = createEClass(GEN_EXPRESSION_PROVIDER_CONTAINER);
		createEAttribute(genExpressionProviderContainerEClass, GEN_EXPRESSION_PROVIDER_CONTAINER__EXPRESSIONS_PACKAGE_NAME);
		createEAttribute(genExpressionProviderContainerEClass, GEN_EXPRESSION_PROVIDER_CONTAINER__ABSTRACT_EXPRESSION_CLASS_NAME);
		createEReference(genExpressionProviderContainerEClass, GEN_EXPRESSION_PROVIDER_CONTAINER__PROVIDERS);
		createEReference(genExpressionProviderContainerEClass, GEN_EXPRESSION_PROVIDER_CONTAINER__EDITOR_GEN);

		genExpressionProviderBaseEClass = createEClass(GEN_EXPRESSION_PROVIDER_BASE);
		createEReference(genExpressionProviderBaseEClass, GEN_EXPRESSION_PROVIDER_BASE__EXPRESSIONS);
		createEReference(genExpressionProviderBaseEClass, GEN_EXPRESSION_PROVIDER_BASE__CONTAINER);

		genJavaExpressionProviderEClass = createEClass(GEN_JAVA_EXPRESSION_PROVIDER);

		genExpressionInterpreterEClass = createEClass(GEN_EXPRESSION_INTERPRETER);
		createEAttribute(genExpressionInterpreterEClass, GEN_EXPRESSION_INTERPRETER__LANGUAGE);
		createEAttribute(genExpressionInterpreterEClass, GEN_EXPRESSION_INTERPRETER__CLASS_NAME);
		createEAttribute(genExpressionInterpreterEClass, GEN_EXPRESSION_INTERPRETER__REQUIRED_PLUGIN_IDS);

		// Create enums
		providerPriorityEEnum = createEEnum(PROVIDER_PRIORITY);
		linkLabelAlignmentEEnum = createEEnum(LINK_LABEL_ALIGNMENT);
		viewmapLayoutTypeEEnum = createEEnum(VIEWMAP_LAYOUT_TYPE);
		genSeverityEEnum = createEEnum(GEN_SEVERITY);
		genLanguageEEnum = createEEnum(GEN_LANGUAGE);
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
	public void initializePackageContentsGen() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GenModelPackage theGenModelPackage = (GenModelPackage)EPackage.Registry.INSTANCE.getEPackage(GenModelPackage.eNS_URI);

		// Add supertypes to classes
		genDiagramEClass.getESuperTypes().add(this.getGenContainerBase());
		genDiagramEClass.getESuperTypes().add(this.getPackageNames());
		genDiagramEClass.getESuperTypes().add(this.getProviderClassNames());
		genDiagramEClass.getESuperTypes().add(this.getLinkConstraints());
		genDiagramEClass.getESuperTypes().add(this.getEditPartCandies());
		genDiagramEClass.getESuperTypes().add(this.getEditorCandies());
		genDiagramEClass.getESuperTypes().add(this.getShortcuts());
		genDiagramEClass.getESuperTypes().add(this.getBatchValidation());
		genDiagramEClass.getESuperTypes().add(this.getMeasurementUnit());
		genContainerBaseEClass.getESuperTypes().add(this.getGenCommonBase());
		genChildContainerEClass.getESuperTypes().add(this.getGenContainerBase());
		genNodeEClass.getESuperTypes().add(this.getGenChildContainer());
		genTopLevelNodeEClass.getESuperTypes().add(this.getGenNode());
		genChildNodeEClass.getESuperTypes().add(this.getGenNode());
		genChildLabelNodeEClass.getESuperTypes().add(this.getGenChildNode());
		genCompartmentEClass.getESuperTypes().add(this.getGenChildContainer());
		genLinkEClass.getESuperTypes().add(this.getGenCommonBase());
		genLabelEClass.getESuperTypes().add(this.getGenCommonBase());
		genNodeLabelEClass.getESuperTypes().add(this.getGenLabel());
		genExternalNodeLabelEClass.getESuperTypes().add(this.getGenNodeLabel());
		genLinkLabelEClass.getESuperTypes().add(this.getGenLabel());
		metamodelTypeEClass.getESuperTypes().add(this.getElementType());
		specializationTypeEClass.getESuperTypes().add(this.getElementType());
		notationTypeEClass.getESuperTypes().add(this.getElementType());
		linkModelFacetEClass.getESuperTypes().add(this.getModelFacet());
		labelModelFacetEClass.getESuperTypes().add(this.getModelFacet());
		typeModelFacetEClass.getESuperTypes().add(this.getModelFacet());
		featureModelFacetEClass.getESuperTypes().add(this.getModelFacet());
		compositeFeatureModelFacetEClass.getESuperTypes().add(this.getModelFacet());
		typeLinkModelFacetEClass.getESuperTypes().add(this.getTypeModelFacet());
		typeLinkModelFacetEClass.getESuperTypes().add(this.getLinkModelFacet());
		featureLinkModelFacetEClass.getESuperTypes().add(this.getFeatureModelFacet());
		featureLinkModelFacetEClass.getESuperTypes().add(this.getLinkModelFacet());
		featureLabelModelFacetEClass.getESuperTypes().add(this.getFeatureModelFacet());
		featureLabelModelFacetEClass.getESuperTypes().add(this.getLabelModelFacet());
		compositeFeatureLabelModelFacetEClass.getESuperTypes().add(this.getCompositeFeatureModelFacet());
		compositeFeatureLabelModelFacetEClass.getESuperTypes().add(this.getLabelModelFacet());
		designLabelModelFacetEClass.getESuperTypes().add(this.getLabelModelFacet());
		colorAttributesEClass.getESuperTypes().add(this.getAttributes());
		styleAttributesEClass.getESuperTypes().add(this.getAttributes());
		resizeConstraintsEClass.getESuperTypes().add(this.getAttributes());
		defaultSizeAttributesEClass.getESuperTypes().add(this.getAttributes());
		labelOffsetAttributesEClass.getESuperTypes().add(this.getAttributes());
		figureViewmapEClass.getESuperTypes().add(this.getViewmap());
		snippetViewmapEClass.getESuperTypes().add(this.getViewmap());
		innerClassViewmapEClass.getESuperTypes().add(this.getViewmap());
		parentAssignedViewmapEClass.getESuperTypes().add(this.getViewmap());
		genConstraintEClass.getESuperTypes().add(this.getValueExpression());
		toolEntryEClass.getESuperTypes().add(this.getEntryBase());
		toolEntryEClass.getESuperTypes().add(this.getToolGroupItem());
		separatorEClass.getESuperTypes().add(this.getToolGroupItem());
		toolGroupEClass.getESuperTypes().add(this.getEntryBase());
		toolGroupEClass.getESuperTypes().add(this.getToolGroupItem());
		genFeatureSeqInitializerEClass.getESuperTypes().add(this.getGenElementInitializer());
		genFeatureValueSpecEClass.getESuperTypes().add(this.getValueExpression());
		genAuditContainerEClass.getESuperTypes().add(this.getGenRuleContainerBase());
		genAuditRuleEClass.getESuperTypes().add(this.getGenRuleBase());
		genDomainElementTargetEClass.getESuperTypes().add(this.getGenAuditable());
		genDomainElementTargetEClass.getESuperTypes().add(this.getGenMeasurable());
		genDiagramElementTargetEClass.getESuperTypes().add(this.getGenAuditable());
		genDiagramElementTargetEClass.getESuperTypes().add(this.getGenMeasurable());
		genDomainAttributeTargetEClass.getESuperTypes().add(this.getGenAuditable());
		genNotationElementTargetEClass.getESuperTypes().add(this.getGenAuditable());
		genNotationElementTargetEClass.getESuperTypes().add(this.getGenMeasurable());
		genMetricContainerEClass.getESuperTypes().add(this.getGenRuleContainerBase());
		genMetricRuleEClass.getESuperTypes().add(this.getGenRuleBase());
		genAuditedMetricTargetEClass.getESuperTypes().add(this.getGenAuditable());
		genAuditableEClass.getESuperTypes().add(this.getGenRuleTarget());
		genMeasurableEClass.getESuperTypes().add(this.getGenRuleTarget());
		genJavaExpressionProviderEClass.getESuperTypes().add(this.getGenExpressionProviderBase());
		genExpressionInterpreterEClass.getESuperTypes().add(this.getGenExpressionProviderBase());

		// Initialize classes and features; add operations and parameters
		initEClass(genEditorGeneratorEClass, GenEditorGenerator.class, "GenEditorGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenEditorGenerator_Audits(), this.getGenAuditContainer(), null, "audits", null, 0, 1, GenEditorGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenEditorGenerator_Metrics(), this.getGenMetricContainer(), null, "metrics", null, 0, 1, GenEditorGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenEditorGenerator_Diagram(), this.getGenDiagram(), this.getGenDiagram_EditorGen(), "diagram", null, 1, 1, GenEditorGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenEditorGenerator_Plugin(), this.getGenPlugin(), this.getGenPlugin_EditorGen(), "plugin", null, 1, 1, GenEditorGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenEditorGenerator_Editor(), this.getGenEditorView(), this.getGenEditorView_EditorGen(), "editor", null, 1, 1, GenEditorGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenEditorGenerator_DomainGenModel(), theGenModelPackage.getGenModel(), null, "domainGenModel", null, 0, 1, GenEditorGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEditorGenerator_PackageNamePrefix(), ecorePackage.getEString(), "packageNamePrefix", null, 0, 1, GenEditorGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEditorGenerator_ModelID(), ecorePackage.getEString(), "modelID", null, 1, 1, GenEditorGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEditorGenerator_SameFileForDiagramAndModel(), ecorePackage.getEBoolean(), "sameFileForDiagramAndModel", null, 0, 1, GenEditorGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEditorGenerator_DiagramFileExtension(), ecorePackage.getEString(), "diagramFileExtension", null, 0, 1, GenEditorGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEditorGenerator_DomainFileExtension(), ecorePackage.getEString(), "domainFileExtension", null, 0, 1, GenEditorGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEditorGenerator_DynamicTemplates(), ecorePackage.getEBoolean(), "dynamicTemplates", "false", 0, 1, GenEditorGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEditorGenerator_TemplateDirectory(), ecorePackage.getEString(), "templateDirectory", null, 0, 1, GenEditorGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEditorGenerator_CopyrightText(), ecorePackage.getEString(), "copyrightText", null, 0, 1, GenEditorGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenEditorGenerator_ExpressionProviders(), this.getGenExpressionProviderContainer(), this.getGenExpressionProviderContainer_EditorGen(), "expressionProviders", null, 0, 1, GenEditorGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(genEditorGeneratorEClass, theGenModelPackage.getGenPackage(), "getAllDomainGenPackages", 0, -1);
		addEParameter(op, ecorePackage.getEBoolean(), "withUsed", 0, 1);

		initEClass(genDiagramEClass, GenDiagram.class, "GenDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenDiagram_EditorGen(), this.getGenEditorGenerator(), this.getGenEditorGenerator_Diagram(), "editorGen", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenDiagram_DomainDiagramElement(), theGenModelPackage.getGenClass(), null, "domainDiagramElement", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenDiagram_ChildNodes(), this.getGenChildNode(), this.getGenChildNode_Diagram(), "childNodes", null, 0, -1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenDiagram_TopLevelNodes(), this.getGenTopLevelNode(), this.getGenTopLevelNode_Diagram(), "topLevelNodes", null, 0, -1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenDiagram_Links(), this.getGenLink(), this.getGenLink_Diagram(), "links", null, 0, -1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenDiagram_Compartments(), this.getGenCompartment(), this.getGenCompartment_Diagram(), "compartments", null, 0, -1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenDiagram_Palette(), this.getPalette(), this.getPalette_Diagram(), "palette", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_Synchronized(), ecorePackage.getEBoolean(), "synchronized", "true", 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genDiagramEClass, this.getGenNode(), "getAllNodes", 0, -1);

		addEOperation(genDiagramEClass, this.getGenChildContainer(), "getAllChildContainers", 0, -1);

		addEOperation(genDiagramEClass, this.getGenContainerBase(), "getAllContainers", 0, -1);

		addEOperation(genDiagramEClass, ecorePackage.getEString(), "getElementInitializersClassName", 0, 1);

		addEOperation(genDiagramEClass, ecorePackage.getEString(), "getElementInitializersPackageName", 0, 1);

		initEClass(genEditorViewEClass, GenEditorView.class, "GenEditorView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenEditorView_EditorGen(), this.getGenEditorGenerator(), this.getGenEditorGenerator_Editor(), "editorGen", null, 0, 1, GenEditorView.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEditorView_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, GenEditorView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEditorView_ActionBarContributorClassName(), ecorePackage.getEString(), "actionBarContributorClassName", null, 0, 1, GenEditorView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEditorView_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, GenEditorView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEditorView_IconPath(), ecorePackage.getEString(), "iconPath", null, 1, 1, GenEditorView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEditorView_ID(), ecorePackage.getEString(), "iD", null, 0, 1, GenEditorView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genEditorViewEClass, ecorePackage.getEString(), "getActionBarContributorQualifiedClassName", 0, 1);

		addEOperation(genEditorViewEClass, ecorePackage.getEString(), "getQualifiedClassName", 0, 1);

		initEClass(batchValidationEClass, BatchValidation.class, "BatchValidation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBatchValidation_ValidationProviderClassName(), ecorePackage.getEString(), "validationProviderClassName", null, 0, 1, BatchValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatchValidation_ValidationProviderPriority(), this.getProviderPriority(), "validationProviderPriority", null, 0, 1, BatchValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatchValidation_MarkerNavigationProviderClassName(), ecorePackage.getEString(), "markerNavigationProviderClassName", null, 0, 1, BatchValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatchValidation_MarkerNavigationProviderPriority(), this.getProviderPriority(), "markerNavigationProviderPriority", null, 0, 1, BatchValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatchValidation_ValidationEnabled(), ecorePackage.getEBoolean(), "validationEnabled", null, 0, 1, BatchValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatchValidation_MetricProviderClassName(), ecorePackage.getEString(), "metricProviderClassName", null, 0, 1, BatchValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatchValidation_MetricProviderPriority(), this.getProviderPriority(), "metricProviderPriority", null, 0, 1, BatchValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatchValidation_ValidationDecoratorProviderClassName(), ecorePackage.getEString(), "validationDecoratorProviderClassName", null, 0, 1, BatchValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatchValidation_ValidationDecorators(), ecorePackage.getEBoolean(), "validationDecorators", null, 0, 1, BatchValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatchValidation_ValidationDecoratorProviderPriority(), this.getProviderPriority(), "validationDecoratorProviderPriority", null, 0, 1, BatchValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(batchValidationEClass, ecorePackage.getEString(), "getValidationProviderQualifiedClassName", 0, 1);

		addEOperation(batchValidationEClass, ecorePackage.getEString(), "getValidationDiagnosticMarkerType", 0, 1);

		addEOperation(batchValidationEClass, ecorePackage.getEString(), "getMarkerNavigationProviderQualifiedClassName", 0, 1);

		addEOperation(batchValidationEClass, ecorePackage.getEString(), "getMetricProviderQualifiedClassName", 0, 1);

		addEOperation(batchValidationEClass, ecorePackage.getEString(), "getMetricViewID", 0, 1);

		addEOperation(batchValidationEClass, ecorePackage.getEString(), "getValidationDecoratorProviderQualifedClassName", 0, 1);

		initEClass(providerClassNamesEClass, ProviderClassNames.class, "ProviderClassNames", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProviderClassNames_ElementTypesClassName(), ecorePackage.getEString(), "elementTypesClassName", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderClassNames_NotationViewProviderClassName(), ecorePackage.getEString(), "notationViewProviderClassName", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderClassNames_NotationViewProviderPriority(), this.getProviderPriority(), "notationViewProviderPriority", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderClassNames_EditPartProviderClassName(), ecorePackage.getEString(), "editPartProviderClassName", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderClassNames_EditPartProviderPriority(), this.getProviderPriority(), "editPartProviderPriority", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderClassNames_PaletteProviderClassName(), ecorePackage.getEString(), "paletteProviderClassName", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderClassNames_PaletteProviderPriority(), this.getProviderPriority(), "paletteProviderPriority", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderClassNames_ModelingAssistantProviderClassName(), ecorePackage.getEString(), "modelingAssistantProviderClassName", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderClassNames_ModelingAssistantProviderPriority(), this.getProviderPriority(), "modelingAssistantProviderPriority", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderClassNames_PropertyProviderClassName(), ecorePackage.getEString(), "propertyProviderClassName", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderClassNames_PropertyProviderPriority(), this.getProviderPriority(), "propertyProviderPriority", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderClassNames_IconProviderClassName(), ecorePackage.getEString(), "iconProviderClassName", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderClassNames_IconProviderPriority(), this.getProviderPriority(), "iconProviderPriority", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderClassNames_ParserProviderClassName(), ecorePackage.getEString(), "parserProviderClassName", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderClassNames_ParserProviderPriority(), this.getProviderPriority(), "parserProviderPriority", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderClassNames_AbstractParserClassName(), ecorePackage.getEString(), "abstractParserClassName", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderClassNames_StructuralFeatureParserClassName(), ecorePackage.getEString(), "structuralFeatureParserClassName", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderClassNames_StructuralFeaturesParserClassName(), ecorePackage.getEString(), "structuralFeaturesParserClassName", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderClassNames_ContributionItemProviderClassName(), ecorePackage.getEString(), "contributionItemProviderClassName", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(providerClassNamesEClass, ecorePackage.getEString(), "getElementTypesQualifiedClassName", 0, 1);

		addEOperation(providerClassNamesEClass, ecorePackage.getEString(), "getNotationViewProviderQualifiedClassName", 0, 1);

		addEOperation(providerClassNamesEClass, ecorePackage.getEString(), "getEditPartProviderQualifiedClassName", 0, 1);

		addEOperation(providerClassNamesEClass, ecorePackage.getEString(), "getPaletteProviderQualifiedClassName", 0, 1);

		addEOperation(providerClassNamesEClass, ecorePackage.getEString(), "getModelingAssistantProviderQualifiedClassName", 0, 1);

		addEOperation(providerClassNamesEClass, ecorePackage.getEString(), "getPropertyProviderQualifiedClassName", 0, 1);

		addEOperation(providerClassNamesEClass, ecorePackage.getEString(), "getIconProviderQualifiedClassName", 0, 1);

		addEOperation(providerClassNamesEClass, ecorePackage.getEString(), "getParserProviderQualifiedClassName", 0, 1);

		addEOperation(providerClassNamesEClass, ecorePackage.getEString(), "getAbstractParserQualifiedClassName", 0, 1);

		addEOperation(providerClassNamesEClass, ecorePackage.getEString(), "getStructuralFeatureParserQualifiedClassName", 0, 1);

		addEOperation(providerClassNamesEClass, ecorePackage.getEString(), "getStructuralFeaturesParserQualifiedClassName", 0, 1);

		addEOperation(providerClassNamesEClass, ecorePackage.getEString(), "getContributionItemProviderQualifiedClassName", 0, 1);

		initEClass(shortcutsEClass, Shortcuts.class, "Shortcuts", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShortcuts_ShortcutsDecoratorProviderClassName(), ecorePackage.getEString(), "shortcutsDecoratorProviderClassName", null, 0, 1, Shortcuts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShortcuts_ShortcutsDecoratorProviderPriority(), this.getProviderPriority(), "shortcutsDecoratorProviderPriority", null, 0, 1, Shortcuts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShortcuts_CreateShortcutActionClassName(), ecorePackage.getEString(), "createShortcutActionClassName", null, 0, 1, Shortcuts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShortcuts_ContainsShortcutsTo(), ecorePackage.getEString(), "containsShortcutsTo", null, 0, -1, Shortcuts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShortcuts_ShortcutsProvidedFor(), ecorePackage.getEString(), "shortcutsProvidedFor", null, 0, -1, Shortcuts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(shortcutsEClass, ecorePackage.getEString(), "getShortcutsDecoratorProviderQualifiedClassName", 0, 1);

		addEOperation(shortcutsEClass, ecorePackage.getEString(), "getCreateShortcutActionQualifiedClassName", 0, 1);

		addEOperation(shortcutsEClass, ecorePackage.getEBoolean(), "generateCreateShortcutAction", 0, 1);

		addEOperation(shortcutsEClass, ecorePackage.getEBoolean(), "generateShortcutIcon", 0, 1);

		initEClass(packageNamesEClass, PackageNames.class, "PackageNames", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageNames_EditCommandsPackageName(), ecorePackage.getEString(), "editCommandsPackageName", null, 0, 1, PackageNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageNames_EditHelpersPackageName(), ecorePackage.getEString(), "editHelpersPackageName", null, 0, 1, PackageNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageNames_EditPartsPackageName(), ecorePackage.getEString(), "editPartsPackageName", null, 0, 1, PackageNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageNames_EditPoliciesPackageName(), ecorePackage.getEString(), "editPoliciesPackageName", null, 0, 1, PackageNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageNames_ProvidersPackageName(), ecorePackage.getEString(), "providersPackageName", null, 0, 1, PackageNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageNames_NotationViewFactoriesPackageName(), ecorePackage.getEString(), "notationViewFactoriesPackageName", null, 0, 1, PackageNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkConstraintsEClass, LinkConstraints.class, "LinkConstraints", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(linkConstraintsEClass, ecorePackage.getEBoolean(), "hasLinkCreationConstraints", 1, 1);

		addEOperation(linkConstraintsEClass, ecorePackage.getEString(), "getLinkCreationConstraintsClassName", 1, 1);

		addEOperation(linkConstraintsEClass, ecorePackage.getEString(), "getLinkCreationConstraintsQualifiedClassName", 1, 1);

		initEClass(editorCandiesEClass, EditorCandies.class, "EditorCandies", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEditorCandies_CreationWizardClassName(), ecorePackage.getEString(), "creationWizardClassName", null, 0, 1, EditorCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditorCandies_CreationWizardPageClassName(), ecorePackage.getEString(), "creationWizardPageClassName", null, 0, 1, EditorCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditorCandies_CreationWizardIconPath(), ecorePackage.getEString(), "creationWizardIconPath", null, 1, 1, EditorCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditorCandies_CreationWizardCategoryID(), ecorePackage.getEString(), "creationWizardCategoryID", null, 0, 1, EditorCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditorCandies_DiagramEditorUtilClassName(), ecorePackage.getEString(), "diagramEditorUtilClassName", null, 0, 1, EditorCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditorCandies_DiagramFileCreatorClassName(), ecorePackage.getEString(), "diagramFileCreatorClassName", null, 0, 1, EditorCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditorCandies_DocumentProviderClassName(), ecorePackage.getEString(), "documentProviderClassName", null, 0, 1, EditorCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditorCandies_InitDiagramFileActionClassName(), ecorePackage.getEString(), "initDiagramFileActionClassName", null, 0, 1, EditorCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditorCandies_NewDiagramFileWizardClassName(), ecorePackage.getEString(), "newDiagramFileWizardClassName", null, 0, 1, EditorCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditorCandies_MatchingStrategyClassName(), ecorePackage.getEString(), "matchingStrategyClassName", null, 0, 1, EditorCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditorCandies_PreferenceInitializerClassName(), ecorePackage.getEString(), "preferenceInitializerClassName", null, 0, 1, EditorCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditorCandies_VisualIDRegistryClassName(), ecorePackage.getEString(), "visualIDRegistryClassName", null, 0, 1, EditorCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditorCandies_ElementChooserClassName(), ecorePackage.getEString(), "elementChooserClassName", null, 0, 1, EditorCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditorCandies_LoadResourceActionClassName(), ecorePackage.getEString(), "loadResourceActionClassName", null, 0, 1, EditorCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditorCandies_EditingDomainID(), ecorePackage.getEString(), "editingDomainID", null, 0, 1, EditorCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(editorCandiesEClass, ecorePackage.getEString(), "getCreationWizardQualifiedClassName", 0, 1);

		addEOperation(editorCandiesEClass, ecorePackage.getEString(), "getCreationWizardPageQualifiedClassName", 0, 1);

		addEOperation(editorCandiesEClass, ecorePackage.getEString(), "getDiagramEditorUtilQualifiedClassName", 0, 1);

		addEOperation(editorCandiesEClass, ecorePackage.getEString(), "getDiagramFileCreatorQualifiedClassName", 0, 1);

		addEOperation(editorCandiesEClass, ecorePackage.getEString(), "getDocumentProviderQualifiedClassName", 0, 1);

		addEOperation(editorCandiesEClass, ecorePackage.getEString(), "getInitDiagramFileActionQualifiedClassName", 0, 1);

		addEOperation(editorCandiesEClass, ecorePackage.getEString(), "getNewDiagramFileWizardQualifiedClassName", 0, 1);

		addEOperation(editorCandiesEClass, ecorePackage.getEString(), "getMatchingStrategyQualifiedClassName", 0, 1);

		addEOperation(editorCandiesEClass, ecorePackage.getEString(), "getPreferenceInitializerQualifiedClassName", 0, 1);

		addEOperation(editorCandiesEClass, ecorePackage.getEString(), "getVisualIDRegistryQualifiedClassName", 0, 1);

		addEOperation(editorCandiesEClass, ecorePackage.getEString(), "getElementChooserQualifiedClassName", 0, 1);

		addEOperation(editorCandiesEClass, ecorePackage.getEString(), "getLoadResourceActionQualifiedClassName", 0, 1);

		addEOperation(editorCandiesEClass, ecorePackage.getEBoolean(), "generateInitDiagramAction", 0, 1);

		initEClass(editPartCandiesEClass, EditPartCandies.class, "EditPartCandies", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEditPartCandies_ReorientConnectionViewCommandClassName(), ecorePackage.getEString(), "reorientConnectionViewCommandClassName", null, 0, 1, EditPartCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditPartCandies_BaseEditHelperClassName(), ecorePackage.getEString(), "baseEditHelperClassName", null, 0, 1, EditPartCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditPartCandies_EditPartFactoryClassName(), ecorePackage.getEString(), "editPartFactoryClassName", null, 0, 1, EditPartCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditPartCandies_BaseExternalNodeLabelEditPartClassName(), ecorePackage.getEString(), "baseExternalNodeLabelEditPartClassName", null, 0, 1, EditPartCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditPartCandies_BaseItemSemanticEditPolicyClassName(), ecorePackage.getEString(), "baseItemSemanticEditPolicyClassName", null, 0, 1, EditPartCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditPartCandies_BaseGraphicalNodeEditPolicyClassName(), ecorePackage.getEString(), "baseGraphicalNodeEditPolicyClassName", null, 0, 1, EditPartCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditPartCandies_ReferenceConnectionEditPolicyClassName(), ecorePackage.getEString(), "referenceConnectionEditPolicyClassName", null, 0, 1, EditPartCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditPartCandies_CanonicalEditPolicyClassName(), ecorePackage.getEString(), "canonicalEditPolicyClassName", null, 0, 1, EditPartCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditPartCandies_TextSelectionEditPolicyClassName(), ecorePackage.getEString(), "textSelectionEditPolicyClassName", null, 0, 1, EditPartCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditPartCandies_TextNonResizableEditPolicyClassName(), ecorePackage.getEString(), "textNonResizableEditPolicyClassName", null, 0, 1, EditPartCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditPartCandies_ExternalNodeLabelHostLayoutEditPolicyClassName(), ecorePackage.getEString(), "externalNodeLabelHostLayoutEditPolicyClassName", null, 0, 1, EditPartCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(editPartCandiesEClass, ecorePackage.getEString(), "getReorientConnectionViewCommandQualifiedClassName", 0, 1);

		addEOperation(editPartCandiesEClass, ecorePackage.getEString(), "getBaseEditHelperQualifiedClassName", 0, 1);

		addEOperation(editPartCandiesEClass, ecorePackage.getEString(), "getEditPartFactoryQualifiedClassName", 0, 1);

		addEOperation(editPartCandiesEClass, ecorePackage.getEString(), "getBaseExternalNodeLabelEditPartQualifiedClassName", 0, 1);

		addEOperation(editPartCandiesEClass, ecorePackage.getEString(), "getBaseItemSemanticEditPolicyQualifiedClassName", 0, 1);

		addEOperation(editPartCandiesEClass, ecorePackage.getEString(), "getBaseGraphicalNodeEditPolicyQualifiedClassName", 0, 1);

		addEOperation(editPartCandiesEClass, ecorePackage.getEString(), "getReferenceConnectionEditPolicyQualifiedClassName", 0, 1);

		addEOperation(editPartCandiesEClass, ecorePackage.getEString(), "getCanonicalEditPolicyQualifiedClassName", 0, 1);

		addEOperation(editPartCandiesEClass, ecorePackage.getEString(), "getTextSelectionEditPolicyQualifiedClassName", 0, 1);

		addEOperation(editPartCandiesEClass, ecorePackage.getEString(), "getTextNonResizableEditPolicyQualifiedClassName", 0, 1);

		addEOperation(editPartCandiesEClass, ecorePackage.getEString(), "getExternalNodeLabelHostLayoutEditPolicyQualifiedClassName", 0, 1);

		initEClass(measurementUnitEClass, MeasurementUnit.class, "MeasurementUnit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasurementUnit_Units(), ecorePackage.getEString(), "units", "Pixel", 0, 1, MeasurementUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genPluginEClass, GenPlugin.class, "GenPlugin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenPlugin_EditorGen(), this.getGenEditorGenerator(), this.getGenEditorGenerator_Plugin(), "editorGen", null, 0, 1, GenPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenPlugin_ID(), ecorePackage.getEString(), "iD", null, 0, 1, GenPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenPlugin_Name(), ecorePackage.getEString(), "name", null, 0, 1, GenPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenPlugin_Provider(), ecorePackage.getEString(), "provider", "Sample Plugin Provider, Inc", 0, 1, GenPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenPlugin_Version(), ecorePackage.getEString(), "version", "1.0.0.qualifier", 0, 1, GenPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenPlugin_PrintingEnabled(), ecorePackage.getEBoolean(), "printingEnabled", null, 0, 1, GenPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenPlugin_ActivatorClassName(), ecorePackage.getEString(), "activatorClassName", null, 0, 1, GenPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genPluginEClass, ecorePackage.getEString(), "getRequiredPluginIDs", 0, -1);

		addEOperation(genPluginEClass, ecorePackage.getEString(), "getActivatorQualifiedClassName", 0, 1);

		initEClass(genCommonBaseEClass, GenCommonBase.class, "GenCommonBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenCommonBase_DiagramRunTimeClass(), theGenModelPackage.getGenClass(), null, "diagramRunTimeClass", null, 1, 1, GenCommonBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenCommonBase_VisualID(), ecorePackage.getEInt(), "visualID", null, 1, 1, GenCommonBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenCommonBase_ElementType(), this.getElementType(), this.getElementType_DiagramElement(), "elementType", null, 0, 1, GenCommonBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenCommonBase_EditPartClassName(), ecorePackage.getEString(), "editPartClassName", null, 0, 1, GenCommonBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenCommonBase_ItemSemanticEditPolicyClassName(), ecorePackage.getEString(), "itemSemanticEditPolicyClassName", null, 0, 1, GenCommonBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenCommonBase_NotationViewFactoryClassName(), ecorePackage.getEString(), "notationViewFactoryClassName", null, 0, 1, GenCommonBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenCommonBase_Viewmap(), this.getViewmap(), null, "viewmap", null, 1, 1, GenCommonBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genCommonBaseEClass, ecorePackage.getEString(), "getEditPartQualifiedClassName", 0, 1);

		addEOperation(genCommonBaseEClass, ecorePackage.getEString(), "getItemSemanticEditPolicyQualifiedClassName", 0, 1);

		addEOperation(genCommonBaseEClass, ecorePackage.getEString(), "getNotationViewFactoryQualifiedClassName", 0, 1);

		addEOperation(genCommonBaseEClass, this.getGenDiagram(), "getDiagram", 0, 1);

		addEOperation(genCommonBaseEClass, ecorePackage.getEString(), "getClassNamePrefix", 0, 1);

		addEOperation(genCommonBaseEClass, ecorePackage.getEString(), "getClassNameSuffux", 0, 1);

		addEOperation(genCommonBaseEClass, ecorePackage.getEString(), "getUniqueIdentifier", 0, 1);

		addEOperation(genCommonBaseEClass, this.getViewmapLayoutType(), "getLayoutType", 0, 1);

		initEClass(genContainerBaseEClass, GenContainerBase.class, "GenContainerBase", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenContainerBase_ContainedNodes(), this.getGenNode(), null, "containedNodes", null, 0, -1, GenContainerBase.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(genChildContainerEClass, GenChildContainer.class, "GenChildContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenChildContainer_ChildNodes(), this.getGenChildNode(), this.getGenChildNode_Containers(), "childNodes", null, 0, -1, GenChildContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenChildContainer_CanonicalEditPolicyClassName(), ecorePackage.getEString(), "canonicalEditPolicyClassName", null, 0, 1, GenChildContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genChildContainerEClass, ecorePackage.getEString(), "getCanonicalEditPolicyQualifiedClassName", 0, 1);

		initEClass(genNodeEClass, GenNode.class, "GenNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenNode_ModelFacet(), this.getTypeModelFacet(), null, "modelFacet", null, 0, 1, GenNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenNode_Labels(), this.getGenNodeLabel(), this.getGenNodeLabel_Node(), "labels", null, 0, -1, GenNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenNode_Compartments(), this.getGenCompartment(), this.getGenCompartment_Node(), "compartments", null, 0, -1, GenNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenNode_GraphicalNodeEditPolicyClassName(), ecorePackage.getEString(), "graphicalNodeEditPolicyClassName", null, 0, 1, GenNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genNodeEClass, theGenModelPackage.getGenClass(), "getDomainMetaClass", 1, 1);

		addEOperation(genNodeEClass, ecorePackage.getEString(), "getGraphicalNodeEditPolicyQualifiedClassName", 0, 1);

		initEClass(genTopLevelNodeEClass, GenTopLevelNode.class, "GenTopLevelNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenTopLevelNode_Diagram(), this.getGenDiagram(), this.getGenDiagram_TopLevelNodes(), "diagram", null, 1, 1, GenTopLevelNode.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genChildNodeEClass, GenChildNode.class, "GenChildNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenChildNode_Diagram(), this.getGenDiagram(), this.getGenDiagram_ChildNodes(), "diagram", null, 1, 1, GenChildNode.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenChildNode_Containers(), this.getGenChildContainer(), this.getGenChildContainer_ChildNodes(), "containers", null, 0, -1, GenChildNode.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genChildLabelNodeEClass, GenChildLabelNode.class, "GenChildLabelNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenChildLabelNode_LabelReadOnly(), ecorePackage.getEBoolean(), "labelReadOnly", null, 0, 1, GenChildLabelNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenChildLabelNode_LabelElementIcon(), ecorePackage.getEBoolean(), "labelElementIcon", null, 0, 1, GenChildLabelNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenChildLabelNode_LabelModelFacet(), this.getLabelModelFacet(), null, "labelModelFacet", null, 0, 1, GenChildLabelNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genChildLabelNodeEClass, theGenModelPackage.getGenFeature(), "getLabelMetaFeatures", 0, -1);

		initEClass(genCompartmentEClass, GenCompartment.class, "GenCompartment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenCompartment_Title(), ecorePackage.getEString(), "title", null, 0, 1, GenCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenCompartment_CanCollapse(), ecorePackage.getEBoolean(), "canCollapse", "true", 0, 1, GenCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenCompartment_HideIfEmpty(), ecorePackage.getEBoolean(), "hideIfEmpty", "true", 0, 1, GenCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenCompartment_NeedsTitle(), ecorePackage.getEBoolean(), "needsTitle", "true", 0, 1, GenCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenCompartment_Diagram(), this.getGenDiagram(), this.getGenDiagram_Compartments(), "diagram", null, 1, 1, GenCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenCompartment_Node(), this.getGenNode(), this.getGenNode_Compartments(), "node", null, 1, 1, GenCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenCompartment_ListLayout(), ecorePackage.getEBoolean(), "listLayout", "true", 0, 1, GenCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genLinkEClass, GenLink.class, "GenLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenLink_Diagram(), this.getGenDiagram(), this.getGenDiagram_Links(), "diagram", null, 1, 1, GenLink.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenLink_ModelFacet(), this.getLinkModelFacet(), null, "modelFacet", null, 0, 1, GenLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenLink_Labels(), this.getGenLinkLabel(), this.getGenLinkLabel_Link(), "labels", null, 0, -1, GenLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenLink_OutgoingCreationAllowed(), ecorePackage.getEBoolean(), "outgoingCreationAllowed", "true", 0, 1, GenLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenLink_IncomingCreationAllowed(), ecorePackage.getEBoolean(), "incomingCreationAllowed", "false", 0, 1, GenLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenLink_ViewDirectionAlignedWithModel(), ecorePackage.getEBoolean(), "viewDirectionAlignedWithModel", "true", 0, 1, GenLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenLink_CreationConstraints(), this.getGenLinkConstraints(), this.getGenLinkConstraints_Link(), "creationConstraints", null, 0, 1, GenLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genLinkEClass, this.getGenCommonBase(), "getSources", 0, -1);

		addEOperation(genLinkEClass, this.getGenCommonBase(), "getTargets", 0, -1);

		initEClass(genLabelEClass, GenLabel.class, "GenLabel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenLabel_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", null, 0, 1, GenLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenLabel_ElementIcon(), ecorePackage.getEBoolean(), "elementIcon", null, 0, 1, GenLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenLabel_ModelFacet(), this.getLabelModelFacet(), null, "modelFacet", null, 0, 1, GenLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genLabelEClass, theGenModelPackage.getGenFeature(), "getMetaFeatures", 0, -1);

		initEClass(genNodeLabelEClass, GenNodeLabel.class, "GenNodeLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenNodeLabel_Node(), this.getGenNode(), this.getGenNode_Labels(), "node", null, 1, 1, GenNodeLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genExternalNodeLabelEClass, GenExternalNodeLabel.class, "GenExternalNodeLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genLinkLabelEClass, GenLinkLabel.class, "GenLinkLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenLinkLabel_Link(), this.getGenLink(), this.getGenLink_Labels(), "link", null, 1, 1, GenLinkLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenLinkLabel_Alignment(), this.getLinkLabelAlignment(), "alignment", "MIDDLE", 0, 1, GenLinkLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementTypeEClass, ElementType.class, "ElementType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementType_DiagramElement(), this.getGenCommonBase(), this.getGenCommonBase_ElementType(), "diagramElement", null, 1, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementType_UniqueIdentifier(), ecorePackage.getEString(), "uniqueIdentifier", null, 1, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementType_DisplayName(), ecorePackage.getEString(), "displayName", null, 0, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementType_DefinedExternally(), ecorePackage.getEBoolean(), "definedExternally", null, 0, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metamodelTypeEClass, MetamodelType.class, "MetamodelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetamodelType_EditHelperClassName(), ecorePackage.getEString(), "editHelperClassName", null, 0, 1, MetamodelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(metamodelTypeEClass, ecorePackage.getEString(), "getEditHelperQualifiedClassName", 0, 1);

		addEOperation(metamodelTypeEClass, theGenModelPackage.getGenClass(), "getMetaClass", 0, 1);

		initEClass(specializationTypeEClass, SpecializationType.class, "SpecializationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecializationType_MetamodelType(), this.getMetamodelType(), null, "metamodelType", null, 0, 1, SpecializationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecializationType_EditHelperAdviceClassName(), ecorePackage.getEString(), "editHelperAdviceClassName", null, 0, 1, SpecializationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(specializationTypeEClass, ecorePackage.getEString(), "getEditHelperAdviceQualifiedClassName", 0, 1);

		initEClass(notationTypeEClass, NotationType.class, "NotationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelFacetEClass, ModelFacet.class, "ModelFacet", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkModelFacetEClass, LinkModelFacet.class, "LinkModelFacet", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(linkModelFacetEClass, theGenModelPackage.getGenClass(), "getSourceTypes", 0, -1);

		addEOperation(linkModelFacetEClass, theGenModelPackage.getGenClass(), "getTargetTypes", 0, -1);

		initEClass(labelModelFacetEClass, LabelModelFacet.class, "LabelModelFacet", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeModelFacetEClass, TypeModelFacet.class, "TypeModelFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeModelFacet_MetaClass(), theGenModelPackage.getGenClass(), null, "metaClass", null, 1, 1, TypeModelFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeModelFacet_ContainmentMetaFeature(), theGenModelPackage.getGenFeature(), null, "containmentMetaFeature", null, 0, 1, TypeModelFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeModelFacet_ChildMetaFeature(), theGenModelPackage.getGenFeature(), null, "childMetaFeature", null, 0, 1, TypeModelFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeModelFacet_ModelElementSelector(), this.getGenConstraint(), null, "modelElementSelector", null, 0, 1, TypeModelFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeModelFacet_ModelElementInitializer(), this.getGenElementInitializer(), this.getGenElementInitializer_TypeModelFacet(), "modelElementInitializer", null, 0, 1, TypeModelFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(typeModelFacetEClass, ecorePackage.getEBoolean(), "isPhantomElement", 0, 1);

		initEClass(featureModelFacetEClass, FeatureModelFacet.class, "FeatureModelFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureModelFacet_MetaFeature(), theGenModelPackage.getGenFeature(), null, "metaFeature", null, 1, 1, FeatureModelFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeFeatureModelFacetEClass, CompositeFeatureModelFacet.class, "CompositeFeatureModelFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeFeatureModelFacet_MetaFeatures(), theGenModelPackage.getGenFeature(), null, "metaFeatures", null, 2, -1, CompositeFeatureModelFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeLinkModelFacetEClass, TypeLinkModelFacet.class, "TypeLinkModelFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeLinkModelFacet_SourceMetaFeature(), theGenModelPackage.getGenFeature(), null, "sourceMetaFeature", null, 0, 1, TypeLinkModelFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeLinkModelFacet_TargetMetaFeature(), theGenModelPackage.getGenFeature(), null, "targetMetaFeature", null, 1, 1, TypeLinkModelFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureLinkModelFacetEClass, FeatureLinkModelFacet.class, "FeatureLinkModelFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureLabelModelFacetEClass, FeatureLabelModelFacet.class, "FeatureLabelModelFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureLabelModelFacet_ViewPattern(), ecorePackage.getEString(), "viewPattern", null, 0, 1, FeatureLabelModelFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureLabelModelFacet_EditPattern(), ecorePackage.getEString(), "editPattern", null, 0, 1, FeatureLabelModelFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeFeatureLabelModelFacetEClass, CompositeFeatureLabelModelFacet.class, "CompositeFeatureLabelModelFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompositeFeatureLabelModelFacet_ViewPattern(), ecorePackage.getEString(), "viewPattern", null, 1, 1, CompositeFeatureLabelModelFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeFeatureLabelModelFacet_EditPattern(), ecorePackage.getEString(), "editPattern", null, 0, 1, CompositeFeatureLabelModelFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(designLabelModelFacetEClass, DesignLabelModelFacet.class, "DesignLabelModelFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributesEClass, Attributes.class, "Attributes", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(colorAttributesEClass, ColorAttributes.class, "ColorAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColorAttributes_ForegroundColor(), ecorePackage.getEString(), "foregroundColor", null, 0, 1, ColorAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColorAttributes_BackgroundColor(), ecorePackage.getEString(), "backgroundColor", null, 0, 1, ColorAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleAttributesEClass, StyleAttributes.class, "StyleAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStyleAttributes_FixedFont(), ecorePackage.getEBoolean(), "fixedFont", "false", 0, 1, StyleAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleAttributes_FixedForeground(), ecorePackage.getEBoolean(), "fixedForeground", "false", 0, 1, StyleAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleAttributes_FixedBackground(), ecorePackage.getEBoolean(), "fixedBackground", "false", 0, 1, StyleAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resizeConstraintsEClass, ResizeConstraints.class, "ResizeConstraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResizeConstraints_ResizeHandles(), ecorePackage.getEInt(), "resizeHandles", "0", 0, 1, ResizeConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResizeConstraints_NonResizeHandles(), ecorePackage.getEInt(), "nonResizeHandles", "0", 0, 1, ResizeConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(resizeConstraintsEClass, ecorePackage.getEString(), "getResizeHandleNames", 0, -1);

		addEOperation(resizeConstraintsEClass, ecorePackage.getEString(), "getNonResizeHandleNames", 0, -1);

		initEClass(defaultSizeAttributesEClass, DefaultSizeAttributes.class, "DefaultSizeAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultSizeAttributes_Width(), ecorePackage.getEInt(), "width", "40", 0, 1, DefaultSizeAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultSizeAttributes_Height(), ecorePackage.getEInt(), "height", "30", 0, 1, DefaultSizeAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelOffsetAttributesEClass, LabelOffsetAttributes.class, "LabelOffsetAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabelOffsetAttributes_X(), ecorePackage.getEInt(), "x", null, 0, 1, LabelOffsetAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabelOffsetAttributes_Y(), ecorePackage.getEInt(), "y", null, 0, 1, LabelOffsetAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewmapEClass, Viewmap.class, "Viewmap", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewmap_Attributes(), this.getAttributes(), null, "attributes", null, 0, -1, Viewmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewmap_RequiredPluginIDs(), ecorePackage.getEString(), "requiredPluginIDs", null, 0, -1, Viewmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewmap_LayoutType(), this.getViewmapLayoutType(), "layoutType", "UNKNOWN", 0, 1, Viewmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(viewmapEClass, this.getAttributes(), "find", 0, 1);
		addEParameter(op, ecorePackage.getEJavaClass(), "attributesClass", 0, 1);

		initEClass(figureViewmapEClass, FigureViewmap.class, "FigureViewmap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFigureViewmap_FigureQualifiedClassName(), ecorePackage.getEString(), "figureQualifiedClassName", null, 1, 1, FigureViewmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(snippetViewmapEClass, SnippetViewmap.class, "SnippetViewmap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSnippetViewmap_Body(), ecorePackage.getEString(), "body", null, 0, 1, SnippetViewmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(innerClassViewmapEClass, InnerClassViewmap.class, "InnerClassViewmap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInnerClassViewmap_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, InnerClassViewmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInnerClassViewmap_ClassBody(), ecorePackage.getEString(), "classBody", null, 0, 1, InnerClassViewmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parentAssignedViewmapEClass, ParentAssignedViewmap.class, "ParentAssignedViewmap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParentAssignedViewmap_GetterName(), ecorePackage.getEString(), "getterName", null, 1, 1, ParentAssignedViewmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParentAssignedViewmap_SetterName(), ecorePackage.getEString(), "setterName", null, 0, 1, ParentAssignedViewmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParentAssignedViewmap_FigureQualifiedClassName(), ecorePackage.getEString(), "figureQualifiedClassName", null, 0, 1, ParentAssignedViewmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueExpressionEClass, ValueExpression.class, "ValueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueExpression_Body(), ecorePackage.getEString(), "body", null, 1, 1, ValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueExpression_Language(), this.getGenLanguage(), "language", "ocl", 1, 1, ValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueExpression_LangName(), ecorePackage.getEString(), "langName", null, 0, 1, ValueExpression.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(genConstraintEClass, GenConstraint.class, "GenConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paletteEClass, Palette.class, "Palette", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPalette_Diagram(), this.getGenDiagram(), this.getGenDiagram_Palette(), "diagram", null, 1, 1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPalette_Flyout(), ecorePackage.getEBoolean(), "flyout", "true", 0, 1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPalette_Groups(), this.getToolGroup(), null, "groups", null, 1, -1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPalette_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPalette_FactoryClassName(), ecorePackage.getEString(), "factoryClassName", null, 0, 1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(paletteEClass, ecorePackage.getEString(), "getFactoryQualifiedClassName", 0, 1);

		initEClass(entryBaseEClass, EntryBase.class, "EntryBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntryBase_Title(), ecorePackage.getEString(), "title", null, 0, 1, EntryBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryBase_Description(), ecorePackage.getEString(), "description", null, 0, 1, EntryBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryBase_LargeIconPath(), ecorePackage.getEString(), "largeIconPath", null, 0, 1, EntryBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryBase_SmallIconPath(), ecorePackage.getEString(), "smallIconPath", null, 0, 1, EntryBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryBase_CreateMethodName(), ecorePackage.getEString(), "createMethodName", null, 0, 1, EntryBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolEntryEClass, ToolEntry.class, "ToolEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToolEntry_Default(), ecorePackage.getEBoolean(), "default", "false", 0, 1, ToolEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolEntry_GenNodes(), this.getGenNode(), null, "genNodes", null, 0, -1, ToolEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolEntry_GenLinks(), this.getGenLink(), null, "genLinks", null, 0, -1, ToolEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolEntry_Elements(), this.getGenCommonBase(), null, "elements", null, 0, -1, ToolEntry.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolEntry_QualifiedToolName(), ecorePackage.getEString(), "qualifiedToolName", null, 0, 1, ToolEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolEntry_Properties(), ecorePackage.getEStringToStringMapEntry(), null, "properties", null, 0, -1, ToolEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolGroupItemEClass, ToolGroupItem.class, "ToolGroupItem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(separatorEClass, Separator.class, "Separator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(toolGroupEClass, ToolGroup.class, "ToolGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToolGroup_Stack(), ecorePackage.getEBoolean(), "stack", null, 0, 1, ToolGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolGroup_Collapse(), ecorePackage.getEBoolean(), "collapse", null, 0, 1, ToolGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolGroup_Entries(), this.getToolGroupItem(), null, "entries", null, 1, -1, ToolGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolGroup_ToolsOnly(), ecorePackage.getEBoolean(), "toolsOnly", null, 0, 1, ToolGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(genElementInitializerEClass, GenElementInitializer.class, "GenElementInitializer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenElementInitializer_TypeModelFacet(), this.getTypeModelFacet(), this.getTypeModelFacet_ModelElementInitializer(), "typeModelFacet", null, 1, 1, GenElementInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genFeatureSeqInitializerEClass, GenFeatureSeqInitializer.class, "GenFeatureSeqInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenFeatureSeqInitializer_Initializers(), this.getGenFeatureValueSpec(), this.getGenFeatureValueSpec_FeatureSeqInitializer(), "initializers", null, 1, -1, GenFeatureSeqInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genFeatureSeqInitializerEClass, ecorePackage.getEString(), "getElementClassAccessorName", 1, 1);

		addEOperation(genFeatureSeqInitializerEClass, ecorePackage.getEString(), "getElementQualifiedPackageInterfaceName", 1, 1);

		initEClass(genFeatureValueSpecEClass, GenFeatureValueSpec.class, "GenFeatureValueSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenFeatureValueSpec_Feature(), theGenModelPackage.getGenFeature(), null, "feature", null, 1, 1, GenFeatureValueSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenFeatureValueSpec_FeatureSeqInitializer(), this.getGenFeatureSeqInitializer(), this.getGenFeatureSeqInitializer_Initializers(), "featureSeqInitializer", null, 1, 1, GenFeatureValueSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genFeatureValueSpecEClass, ecorePackage.getEString(), "getFeatureQualifiedPackageInterfaceName", 1, 1);

		initEClass(genLinkConstraintsEClass, GenLinkConstraints.class, "GenLinkConstraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenLinkConstraints_Link(), this.getGenLink(), this.getGenLink_CreationConstraints(), "link", null, 1, 1, GenLinkConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenLinkConstraints_SourceEnd(), this.getGenConstraint(), null, "sourceEnd", null, 0, 1, GenLinkConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenLinkConstraints_TargetEnd(), this.getGenConstraint(), null, "targetEnd", null, 0, 1, GenLinkConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genLinkConstraintsEClass, theGenModelPackage.getGenClass(), "getLinkClass", 0, 1);

		addEOperation(genLinkConstraintsEClass, theGenModelPackage.getGenClass(), "getSourceEndContextClass", 0, 1);

		addEOperation(genLinkConstraintsEClass, theGenModelPackage.getGenClass(), "getTargetEndContextClass", 0, 1);

		addEOperation(genLinkConstraintsEClass, ecorePackage.getEString(), "getConstraintsInstanceFieldName", 1, 1);

		initEClass(genRuleContainerBaseEClass, GenRuleContainerBase.class, "GenRuleContainerBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenRuleContainerBase_Editor(), this.getGenEditorGenerator(), null, "editor", null, 1, 1, GenRuleContainerBase.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(genAuditContainerEClass, GenAuditContainer.class, "GenAuditContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenAuditContainer_Id(), ecorePackage.getEString(), "id", null, 1, 1, GenAuditContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenAuditContainer_Name(), ecorePackage.getEString(), "name", null, 0, 1, GenAuditContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenAuditContainer_Description(), ecorePackage.getEString(), "description", null, 0, 1, GenAuditContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenAuditContainer_ParentContainer(), this.getGenAuditContainer(), this.getGenAuditContainer_ChildContainers(), "parentContainer", null, 0, 1, GenAuditContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenAuditContainer_Audits(), this.getGenAuditRule(), this.getGenAuditRule_Container(), "audits", null, 0, -1, GenAuditContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenAuditContainer_ChildContainers(), this.getGenAuditContainer(), this.getGenAuditContainer_ParentContainer(), "childContainers", null, 0, -1, GenAuditContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genAuditContainerEClass, this.getGenAuditRule(), "getAllAuditRules", 0, -1);

		addEOperation(genAuditContainerEClass, this.getGenAuditContainer(), "getAllAuditContainers", 0, -1);

		addEOperation(genAuditContainerEClass, this.getGenAuditContainer(), "getPath", 1, -1);

		addEOperation(genAuditContainerEClass, ecorePackage.getEMap(), "getAllRulesToTargetContextMap", 1, 1);

		addEOperation(genAuditContainerEClass, theGenModelPackage.getGenPackage(), "getAllTargetedModelPackages", 0, -1);

		addEOperation(genAuditContainerEClass, ecorePackage.getEBoolean(), "hasDiagramElementRule", 0, 1);

		initEClass(genRuleBaseEClass, GenRuleBase.class, "GenRuleBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenRuleBase_Name(), ecorePackage.getEString(), "name", null, 0, 1, GenRuleBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenRuleBase_Description(), ecorePackage.getEString(), "description", null, 0, 1, GenRuleBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genAuditRuleEClass, GenAuditRule.class, "GenAuditRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenAuditRule_Id(), ecorePackage.getEString(), "id", null, 1, 1, GenAuditRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenAuditRule_Rule(), this.getGenConstraint(), null, "rule", null, 1, 1, GenAuditRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenAuditRule_Target(), this.getGenAuditable(), null, "target", null, 1, 1, GenAuditRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenAuditRule_Message(), ecorePackage.getEString(), "message", null, 0, 1, GenAuditRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenAuditRule_Severity(), this.getGenSeverity(), "severity", "ERROR", 0, 1, GenAuditRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenAuditRule_UseInLiveMode(), ecorePackage.getEBoolean(), "useInLiveMode", "false", 0, 1, GenAuditRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenAuditRule_Container(), this.getGenAuditContainer(), this.getGenAuditContainer_Audits(), "container", null, 1, 1, GenAuditRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genAuditRuleEClass, ecorePackage.getEString(), "getContextSelectorClassName", 1, 1);

		addEOperation(genAuditRuleEClass, ecorePackage.getEString(), "getContextSelectorQualifiedClassName", 1, 1);

		addEOperation(genAuditRuleEClass, ecorePackage.getEString(), "getContextSelectorLocalClassName", 1, 1);

		initEClass(genRuleTargetEClass, GenRuleTarget.class, "GenRuleTarget", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(genRuleTargetEClass, theGenModelPackage.getGenClassifier(), "getContext", 1, 1);

		initEClass(genDomainElementTargetEClass, GenDomainElementTarget.class, "GenDomainElementTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenDomainElementTarget_Element(), theGenModelPackage.getGenClass(), null, "element", null, 1, 1, GenDomainElementTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genDiagramElementTargetEClass, GenDiagramElementTarget.class, "GenDiagramElementTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenDiagramElementTarget_Element(), this.getGenCommonBase(), null, "element", null, 1, -1, GenDiagramElementTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genDomainAttributeTargetEClass, GenDomainAttributeTarget.class, "GenDomainAttributeTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenDomainAttributeTarget_Attribute(), theGenModelPackage.getGenFeature(), null, "attribute", null, 1, 1, GenDomainAttributeTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDomainAttributeTarget_NullAsError(), ecorePackage.getEBoolean(), "nullAsError", null, 0, 1, GenDomainAttributeTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genNotationElementTargetEClass, GenNotationElementTarget.class, "GenNotationElementTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenNotationElementTarget_Element(), theGenModelPackage.getGenClass(), null, "element", null, 1, 1, GenNotationElementTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genMetricContainerEClass, GenMetricContainer.class, "GenMetricContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenMetricContainer_Metrics(), this.getGenMetricRule(), this.getGenMetricRule_Container(), "metrics", null, 1, -1, GenMetricContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genMetricRuleEClass, GenMetricRule.class, "GenMetricRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenMetricRule_Key(), ecorePackage.getEString(), "key", null, 1, 1, GenMetricRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenMetricRule_Rule(), this.getValueExpression(), null, "rule", null, 1, 1, GenMetricRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenMetricRule_Target(), this.getGenMeasurable(), null, "target", null, 1, 1, GenMetricRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenMetricRule_LowLimit(), ecorePackage.getEDoubleObject(), "lowLimit", null, 0, 1, GenMetricRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenMetricRule_HighLimit(), ecorePackage.getEDoubleObject(), "highLimit", null, 0, 1, GenMetricRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenMetricRule_Container(), this.getGenMetricContainer(), this.getGenMetricContainer_Metrics(), "container", null, 1, 1, GenMetricRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genAuditedMetricTargetEClass, GenAuditedMetricTarget.class, "GenAuditedMetricTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenAuditedMetricTarget_Metric(), this.getGenMetricRule(), null, "metric", null, 1, 1, GenAuditedMetricTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenAuditedMetricTarget_MetricValueContext(), theGenModelPackage.getGenDataType(), null, "metricValueContext", null, 1, 1, GenAuditedMetricTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genAuditableEClass, GenAuditable.class, "GenAuditable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(genAuditableEClass, ecorePackage.getEString(), "getClientContextID", 1, 1);

		addEOperation(genAuditableEClass, theGenModelPackage.getGenClass(), "getTargetClass", 0, 1);

		initEClass(genMeasurableEClass, GenMeasurable.class, "GenMeasurable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genExpressionProviderContainerEClass, GenExpressionProviderContainer.class, "GenExpressionProviderContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenExpressionProviderContainer_ExpressionsPackageName(), ecorePackage.getEString(), "expressionsPackageName", null, 0, 1, GenExpressionProviderContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenExpressionProviderContainer_AbstractExpressionClassName(), ecorePackage.getEString(), "abstractExpressionClassName", null, 0, 1, GenExpressionProviderContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenExpressionProviderContainer_Providers(), this.getGenExpressionProviderBase(), this.getGenExpressionProviderBase_Container(), "providers", null, 0, -1, GenExpressionProviderContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenExpressionProviderContainer_EditorGen(), this.getGenEditorGenerator(), this.getGenEditorGenerator_ExpressionProviders(), "editorGen", null, 1, 1, GenExpressionProviderContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(genExpressionProviderContainerEClass, this.getGenExpressionProviderBase(), "getProvider", 0, 1);
		addEParameter(op, this.getValueExpression(), "expression", 1, 1);

		addEOperation(genExpressionProviderContainerEClass, ecorePackage.getEString(), "getAbstractExpressionQualifiedClassName", 1, 1);

		initEClass(genExpressionProviderBaseEClass, GenExpressionProviderBase.class, "GenExpressionProviderBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenExpressionProviderBase_Expressions(), this.getValueExpression(), null, "expressions", null, 0, -1, GenExpressionProviderBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenExpressionProviderBase_Container(), this.getGenExpressionProviderContainer(), this.getGenExpressionProviderContainer_Providers(), "container", null, 1, 1, GenExpressionProviderBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genExpressionProviderBaseEClass, ecorePackage.getEString(), "getRequiredPluginIDs", 0, -1);

		addEOperation(genExpressionProviderBaseEClass, this.getGenLanguage(), "getLanguage", 1, 1);

		initEClass(genJavaExpressionProviderEClass, GenJavaExpressionProvider.class, "GenJavaExpressionProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(genJavaExpressionProviderEClass, ecorePackage.getEString(), "getOperationName", 0, 1);
		addEParameter(op, this.getValueExpression(), "expression", 1, 1);

		initEClass(genExpressionInterpreterEClass, GenExpressionInterpreter.class, "GenExpressionInterpreter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenExpressionInterpreter_Language(), this.getGenLanguage(), "language", null, 1, 1, GenExpressionInterpreter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenExpressionInterpreter_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, GenExpressionInterpreter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenExpressionInterpreter_RequiredPluginIDs(), ecorePackage.getEString(), "requiredPluginIDs", null, 0, -1, GenExpressionInterpreter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genExpressionInterpreterEClass, ecorePackage.getEString(), "getQualifiedClassName", 1, 1);

		op = addEOperation(genExpressionInterpreterEClass, ecorePackage.getEString(), "getExpressionAccessor", 0, 1);
		addEParameter(op, this.getValueExpression(), "expression", 1, 1);

		// Initialize enums and add enum literals
		initEEnum(providerPriorityEEnum, ProviderPriority.class, "ProviderPriority");
		addEEnumLiteral(providerPriorityEEnum, ProviderPriority.LOWEST_LITERAL);
		addEEnumLiteral(providerPriorityEEnum, ProviderPriority.LOW_LITERAL);
		addEEnumLiteral(providerPriorityEEnum, ProviderPriority.MEDIUM_LITERAL);
		addEEnumLiteral(providerPriorityEEnum, ProviderPriority.HIGH_LITERAL);
		addEEnumLiteral(providerPriorityEEnum, ProviderPriority.HIGHEST_LITERAL);

		initEEnum(linkLabelAlignmentEEnum, LinkLabelAlignment.class, "LinkLabelAlignment");
		addEEnumLiteral(linkLabelAlignmentEEnum, LinkLabelAlignment.MIDDLE_LITERAL);
		addEEnumLiteral(linkLabelAlignmentEEnum, LinkLabelAlignment.TARGET_LITERAL);
		addEEnumLiteral(linkLabelAlignmentEEnum, LinkLabelAlignment.SOURCE_LITERAL);

		initEEnum(viewmapLayoutTypeEEnum, ViewmapLayoutType.class, "ViewmapLayoutType");
		addEEnumLiteral(viewmapLayoutTypeEEnum, ViewmapLayoutType.UNKNOWN_LITERAL);
		addEEnumLiteral(viewmapLayoutTypeEEnum, ViewmapLayoutType.XY_LAYOUT_LITERAL);
		addEEnumLiteral(viewmapLayoutTypeEEnum, ViewmapLayoutType.FLOW_LAYOUT_LITERAL);
		addEEnumLiteral(viewmapLayoutTypeEEnum, ViewmapLayoutType.TOOLBAR_LAYOUT_LITERAL);

		initEEnum(genSeverityEEnum, GenSeverity.class, "GenSeverity");
		addEEnumLiteral(genSeverityEEnum, GenSeverity.INFO_LITERAL);
		addEEnumLiteral(genSeverityEEnum, GenSeverity.WARNING_LITERAL);
		addEEnumLiteral(genSeverityEEnum, GenSeverity.ERROR_LITERAL);

		initEEnum(genLanguageEEnum, GenLanguage.class, "GenLanguage");
		addEEnumLiteral(genLanguageEEnum, GenLanguage.OCL_LITERAL);
		addEEnumLiteral(genLanguageEEnum, GenLanguage.JAVA_LITERAL);
		addEEnumLiteral(genLanguageEEnum, GenLanguage.REGEXP_LITERAL);
		addEEnumLiteral(genLanguageEEnum, GenLanguage.NREGEXP_LITERAL);

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
			 "meta", "http://www.eclipse.org/gmf/2005/constraints/meta",
			 "deprecated", "http://www.eclipse.org/gmf/2006/deprecated"
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
			 "import", "http://www.eclipse.org/gmf/runtime/1.0.0/notation"
		   });								
		addAnnotation
		  (genDiagramEClass, 
		   source, 
		   new String[] {
			 "ocl", "diagramRunTimeClass.ecoreClass.eAllSuperTypes->including(diagramRunTimeClass.ecoreClass)->one(ePackage.name = \'notation\' and name = \'Diagram\')",
			 "description", "\'Diagram Runtime Class\' must be a notation::Diagram or sub-class"
		   });															
		addAnnotation
		  (getGenCommonBase_VisualID(), 
		   source, 
		   new String[] {
			 "ocl", "visualID >= 0",
			 "description", "Visual ID must be a non-negative integer"
		   });				
		addAnnotation
		  (genNodeEClass, 
		   source, 
		   new String[] {
			 "ocl", "diagramRunTimeClass.ecoreClass.eAllSuperTypes->including(diagramRunTimeClass.ecoreClass)->one(ePackage.name = \'notation\' and name = \'Node\')",
			 "description", "Node \'Diagram Runtime Class\' must be a notation::Node or sub-class"
		   });				
		addAnnotation
		  (genTopLevelNodeEClass, 
		   source, 
		   new String[] {
			 "ocl", "not modelFacet.containmentMetaFeature.oclIsUndefined() implies modelFacet.containmentMetaFeature.genClass.ecoreClass.isSuperTypeOf(diagram.domainDiagramElement.ecoreClass)",
			 "description", "Top level node \'Containment Feature\' must be available in the diagram \'Domain Element\' or its super-class"
		   });		
		addAnnotation
		  (getGenChildNode_Containers(), 
		   source, 
		   new String[] {
			 "ocl", "let cmps:OrderedSet(GenChildContainer)=containers->select(oclIsKindOf(GenCompartment)) in cmps->exists(oclAsType(GenCompartment).listLayout) implies not cmps->exists(not oclAsType(GenCompartment).listLayout)",
			 "description", "Node is referenced from multiple containers with different \'List Layout\' value"
		   });						
		addAnnotation
		  (genLinkEClass, 
		   source, 
		   new String[] {
			 "ocl", "diagramRunTimeClass.ecoreClass.eAllSuperTypes->including(diagramRunTimeClass.ecoreClass)->one(ePackage.name = \'notation\' and name = \'Edge\')",
			 "description", "Link \'Diagram Runtime Class\' must be a notation::Edge or sub-class"
		   });												
		addAnnotation
		  (genNodeLabelEClass, 
		   source, 
		   new String[] {
			 "ocl", "getMetaFeatures()->forAll(f|f.ecoreFeature.eContainingClass.isSuperTypeOf(node.getDomainMetaClass().ecoreClass))",
			 "description", "Node label meta features must be owned by the node \'Meta Class\' or its super-classes"
		   });				
		addAnnotation
		  (genLinkLabelEClass, 
		   source, 
		   new String[] {
			 "ocl", "(modelFacet.oclIsTypeOf(FeatureLabelModelFacet) or modelFacet.oclIsTypeOf(CompositeFeatureLabelModelFacet))=true implies link.modelFacet.oclIsTypeOf(TypeLinkModelFacet)",
			 "description", "Feature based link labels can only be used on link with class (TypeLinkModelFacet)"
		   });		
		addAnnotation
		  (genLinkLabelEClass, 
		   source, 
		   new String[] {
			 "ocl", "let tl: TypeLinkModelFacet = link.modelFacet.oclAsType(TypeLinkModelFacet) in not tl.oclIsUndefined() implies self.getMetaFeatures()->forAll(f|f.ecoreFeature.eContainingClass.isSuperTypeOf(tl.metaClass.ecoreClass))",
			 "description", "Link label meta features must be owned by the node \'Meta Class\' or its super-classes"
		   });												
		addAnnotation
		  (getTypeModelFacet_ContainmentMetaFeature(), 
		   source, 
		   new String[] {
			 "ocl", "let r: ecore::EReference=containmentMetaFeature.ecoreFeature.oclAsType(ecore::EReference) in not containmentMetaFeature.oclIsUndefined() implies r.containment or r.eReferenceType.isSuperTypeOf(metaClass.ecoreClass)",
			 "description", "\'Containment Meta Feature\' must reference \'Meta Class\' or its super-classes"
		   });			
		addAnnotation
		  (getTypeModelFacet_ChildMetaFeature(), 
		   source, 
		   new String[] {
			 "ocl", "not childMetaFeature.oclIsUndefined() implies childMetaFeature.ecoreFeature.oclAsType(ecore::EReference).eReferenceType.isSuperTypeOf(metaClass.ecoreClass)",
			 "description", "\'Child Meta Feature\' must reference \'Meta Class\' or its sub-classes"
		   });								
		addAnnotation
		  (typeLinkModelFacetEClass, 
		   source, 
		   new String[] {
			 "ocl", "not containmentMetaFeature.oclIsUndefined()",
			 "description", "Link \'Containment Meta Feature\' must be specified"
		   });			
		addAnnotation
		  (getTypeLinkModelFacet_SourceMetaFeature(), 
		   source, 
		   new String[] {
			 "ocl", "not sourceMetaFeature.oclIsUndefined() implies sourceMetaFeature.genClass.ecoreClass.isSuperTypeOf(metaClass.ecoreClass)",
			 "description", "Link \'Source Meta Feature\' must be owned by link \'Meta Class\' or its super-class"
		   });		
		addAnnotation
		  (getTypeLinkModelFacet_TargetMetaFeature(), 
		   source, 
		   new String[] {
			 "ocl", "not targetMetaFeature.oclIsUndefined() implies targetMetaFeature.genClass.ecoreClass.isSuperTypeOf(metaClass.ecoreClass)",
			 "description", "Link \'Target Meta Feature\' must be owned by link \'Meta Class\' or its super-class"
		   });																																												
		addAnnotation
		  (genFeatureValueSpecEClass, 
		   source, 
		   new String[] {
			 "ocl", "feature <> null implies feature.ecoreFeature.eContainingClass.isSuperTypeOf(featureSeqInitializer.typeModelFacet.metaClass.ecoreClass)",
			 "description", "The feature of \'GenFeatureValueSpec\' must be available in \'Meta Class\' of the initialized element"
		   });				
		addAnnotation
		  (getGenFeatureValueSpec_Feature(), 
		   source, 
		   new String[] {
			 "ocl", "feature <> null implies not featureSeqInitializer.initializers->exists(i| i <> self and feature = self.feature)",
			 "description", "The feature is already initialized by another \'GenFeatureValueSpec\' in the sequence"
		   });			
		addAnnotation
		  (genLinkConstraintsEClass, 
		   source, 
		   new String[] {
			 "ocl", "not sourceEnd.oclIsUndefined() or not targetEnd.oclIsUndefined()",
			 "description", "Either \'sourceEnd\' or \'targetEnd\' constraint must be specified"
		   });																															
		addAnnotation
		  (getGenAuditRule_Id(), 
		   source, 
		   new String[] {
			 "ocl", "not id.oclIsUndefined() implies container.audits->one(i | i.id = self.id)",
			 "description", "Audit rule with the same ID already exists"
		   });															
		addAnnotation
		  (getGenDiagramElementTarget_Element(), 
		   source, 
		   new String[] {
			 "ocl", "element <> null and element->size() > 1 implies element->forAll(oclIsKindOf(GenNode))",
			 "description", "Multiple diagram elements must be GenNode type conformant"
		   });			
		addAnnotation
		  (getGenDomainAttributeTarget_Attribute(), 
		   source, 
		   new String[] {
			 "ocl", "attribute.ecoreFeature.oclIsKindOf(ecore::EAttribute)",
			 "description", "EAttribute element required for auditable domain attribute"
		   });					
		addAnnotation
		  (getGenNotationElementTarget_Element(), 
		   source, 
		   new String[] {
			 "ocl", "element.ecoreClass.eAllSuperTypes->including(element.ecoreClass)->one(ePackage.name = \'notation\' and name = \'View\')",
			 "description", "\'notation::View\' or its sub-class must be set to NotationElement target"
		   });		
		addAnnotation
		  (genMetricRuleEClass, 
		   source, 
		   new String[] {
			 "ocl", "not lowLimit.oclIsUndefined() and not highLimit.oclIsUndefined()  implies lowLimit < highLimit",
			 "description", "Metric value \'lowLimit\' must be smaller then \'highLimit\'"
		   });			
		addAnnotation
		  (getGenMetricRule_Key(), 
		   source, 
		   new String[] {
			 "ocl", "not key.oclIsUndefined() implies container.metrics->one(i | i.key = self.key)",
			 "description", "Metric rule with the same \'key\' already exists"
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
		  (getTypeModelFacet_ModelElementSelector(), 
		   source, 
		   new String[] {
			 "def", "context",
			 "ocl", "metaClass.ecoreClass"
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
		  (getValueExpression_LangName(), 
		   source, 
		   new String[] {
			 "def", "lang"
		   });			
		addAnnotation
		  (genConstraintEClass, 
		   source, 
		   new String[] {
			 "def", "Constraint"
		   });											
		addAnnotation
		  (getGenFeatureSeqInitializer_Initializers(), 
		   source, 
		   new String[] {
			 "def", "context",
			 "ocl", "typeModelFacet.metaClass.ecoreClass"
		   });			
		addAnnotation
		  (genFeatureValueSpecEClass, 
		   source, 
		   new String[] {
			 "def", "ValueSpec"
		   });		
		addAnnotation
		  (genFeatureValueSpecEClass, 
		   source, 
		   new String[] {
			 "def", "type",
			 "ocl", "feature.ecoreFeature"
		   });														
		addAnnotation
		  (getGenLinkConstraints_SourceEnd(), 
		   source, 
		   new String[] {
			 "def", "context",
			 "ocl", "getSourceEndContextClass().ecoreClass"
		   });		
		addAnnotation
		  (getGenLinkConstraints_SourceEnd(), 
		   source, 
		   new String[] {
			 "def", "variable",
			 "name", "oppositeEnd",
			 "type.ocl", "getTargetEndContextClass().ecoreClass"
		   });			
		addAnnotation
		  (getGenLinkConstraints_TargetEnd(), 
		   source, 
		   new String[] {
			 "def", "context",
			 "ocl", "getTargetEndContextClass().ecoreClass"
		   });		
		addAnnotation
		  (getGenLinkConstraints_TargetEnd(), 
		   source, 
		   new String[] {
			 "def", "variable",
			 "name", "oppositeEnd",
			 "type.ocl", "getSourceEndContextClass().ecoreClass"
		   });																						
		addAnnotation
		  (getGenAuditRule_Rule(), 
		   source, 
		   new String[] {
			 "def", "context",
			 "ocl", "target.getContext()"
		   });																								
		addAnnotation
		  (getGenMetricRule_Rule(), 
		   source, 
		   new String[] {
			 "def", "context",
			 "ocl", "target.getContext()"
		   });		
		addAnnotation
		  (getGenMetricRule_Rule(), 
		   source, 
		   new String[] {
			 "def", "type",
			 "ocl", "\'ecore::EDoubleObject\'"
		   });								
	}

} //GMFGenPackageImpl

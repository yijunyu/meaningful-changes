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
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.gmf.codegen.gmfgen.Attributes;
import org.eclipse.gmf.codegen.gmfgen.BatchValidation;
import org.eclipse.gmf.codegen.gmfgen.ColorAttributes;
import org.eclipse.gmf.codegen.gmfgen.CompositeFeatureLabelModelFacet;
import org.eclipse.gmf.codegen.gmfgen.CompositeFeatureModelFacet;
import org.eclipse.gmf.codegen.gmfgen.DefaultSizeAttributes;
import org.eclipse.gmf.codegen.gmfgen.EditPartCandies;
import org.eclipse.gmf.codegen.gmfgen.EditorCandies;
import org.eclipse.gmf.codegen.gmfgen.EntryBase;
import org.eclipse.gmf.codegen.gmfgen.ExternalLabel;
import org.eclipse.gmf.codegen.gmfgen.FeatureLabelModelFacet;
import org.eclipse.gmf.codegen.gmfgen.FeatureLinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.FeatureModelFacet;
import org.eclipse.gmf.codegen.gmfgen.FigureViewmap;
import org.eclipse.gmf.codegen.gmfgen.GMFGenFactory;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenAuditContainer;
import org.eclipse.gmf.codegen.gmfgen.GenAuditRule;
import org.eclipse.gmf.codegen.gmfgen.GenChildContainer;
import org.eclipse.gmf.codegen.gmfgen.GenChildNode;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenConstraint;
import org.eclipse.gmf.codegen.gmfgen.GenContainerBase;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.gmfgen.GenEditorView;
import org.eclipse.gmf.codegen.gmfgen.GenElementInitializer;
import org.eclipse.gmf.codegen.gmfgen.GenExternalNodeLabel;
import org.eclipse.gmf.codegen.gmfgen.GenFeatureSeqInitializer;
import org.eclipse.gmf.codegen.gmfgen.GenFeatureValueSpec;
import org.eclipse.gmf.codegen.gmfgen.GenLabel;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenLinkConstraints;
import org.eclipse.gmf.codegen.gmfgen.GenLinkLabel;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.GenNodeLabel;
import org.eclipse.gmf.codegen.gmfgen.GenPlugin;
import org.eclipse.gmf.codegen.gmfgen.GenSeverity;
import org.eclipse.gmf.codegen.gmfgen.GenTopLevelNode;
import org.eclipse.gmf.codegen.gmfgen.InnerClassViewmap;
import org.eclipse.gmf.codegen.gmfgen.LabelModelFacet;
import org.eclipse.gmf.codegen.gmfgen.LinkConstraints;
import org.eclipse.gmf.codegen.gmfgen.LinkEntry;
import org.eclipse.gmf.codegen.gmfgen.LinkLabelAlignment;
import org.eclipse.gmf.codegen.gmfgen.LinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.ModelFacet;
import org.eclipse.gmf.codegen.gmfgen.NodeEntry;
import org.eclipse.gmf.codegen.gmfgen.PackageNames;
import org.eclipse.gmf.codegen.gmfgen.Palette;
import org.eclipse.gmf.codegen.gmfgen.ProviderClassNames;
import org.eclipse.gmf.codegen.gmfgen.ProviderPriority;
import org.eclipse.gmf.codegen.gmfgen.ShapeAttributes;
import org.eclipse.gmf.codegen.gmfgen.Shortcuts;
import org.eclipse.gmf.codegen.gmfgen.SnippetViewmap;
import org.eclipse.gmf.codegen.gmfgen.TextLabelModelFacet;
import org.eclipse.gmf.codegen.gmfgen.ToolEntry;
import org.eclipse.gmf.codegen.gmfgen.ToolGroup;
import org.eclipse.gmf.codegen.gmfgen.TypeLinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.TypeModelFacet;
import org.eclipse.gmf.codegen.gmfgen.ValueExpression;
import org.eclipse.gmf.codegen.gmfgen.Viewmap;

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
	private EClass genPluginEClass = null;

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
	private EClass externalLabelEClass = null;

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
	private EClass textLabelModelFacetEClass = null;

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
	private EClass shapeAttributesEClass = null;

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
	private EClass nodeEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEntryEClass = null;

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
	private EClass genAuditContainerEClass = null;

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
	private EEnum genSeverityEEnum = null;

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
		GenModelPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGMFGenPackage.createPackageContents();

		// Initialize created meta-data
		theGMFGenPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGMFGenPackage.freeze();

		return theGMFGenPackage;
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
	public EReference getGenEditorGenerator_Diagram() {
		return (EReference)genEditorGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditorGenerator_Plugin() {
		return (EReference)genEditorGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditorGenerator_Editor() {
		return (EReference)genEditorGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditorGenerator_DomainGenModel() {
		return (EReference)genEditorGeneratorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorGenerator_PackageNamePrefix() {
		return (EAttribute)genEditorGeneratorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorGenerator_ModelID() {
		return (EAttribute)genEditorGeneratorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorGenerator_SameFileForDiagramAndModel() {
		return (EAttribute)genEditorGeneratorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorGenerator_DiagramFileExtension() {
		return (EAttribute)genEditorGeneratorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorGenerator_DomainFileExtension() {
		return (EAttribute)genEditorGeneratorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorGenerator_DynamicTemplates() {
		return (EAttribute)genEditorGeneratorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorGenerator_TemplateDirectory() {
		return (EAttribute)genEditorGeneratorEClass.getEStructuralFeatures().get(11);
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
	public EAttribute getGenEditorView_ID() {
		return (EAttribute)genEditorViewEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getProviderClassNames_SemanticHintsClassName() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_NotationViewProviderClassName() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_NotationViewProviderPriority() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_EditPartProviderClassName() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_EditPartProviderPriority() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_PaletteProviderClassName() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_PaletteProviderPriority() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_MetamodelSupportProviderClassName() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_MetamodelSupportProviderPriority() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_ModelingAssistantProviderClassName() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_ModelingAssistantProviderPriority() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_PropertyProviderClassName() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_PropertyProviderPriority() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_IconProviderClassName() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_IconProviderPriority() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_ParserProviderClassName() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_ParserProviderPriority() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_AbstractParserClassName() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_StructuralFeatureParserClassName() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_StructuralFeaturesParserClassName() {
		return (EAttribute)providerClassNamesEClass.getEStructuralFeatures().get(20);
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
	public EAttribute getShortcuts_CreateShortcutActionClassName() {
		return (EAttribute)shortcutsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortcuts_ContainsShortcutsTo() {
		return (EAttribute)shortcutsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortcuts_ShortcutsProvidedFor() {
		return (EAttribute)shortcutsEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPackageNames_EditPartsPackageName() {
		return (EAttribute)packageNamesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageNames_EditPoliciesPackageName() {
		return (EAttribute)packageNamesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageNames_ProvidersPackageName() {
		return (EAttribute)packageNamesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageNames_NotationViewFactoriesPackageName() {
		return (EAttribute)packageNamesEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getEditorCandies_DiagramEditorUtilClassName() {
		return (EAttribute)editorCandiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_DiagramFileCreatorClassName() {
		return (EAttribute)editorCandiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_DocumentProviderClassName() {
		return (EAttribute)editorCandiesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_InitDiagramFileActionClassName() {
		return (EAttribute)editorCandiesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_MatchingStrategyClassName() {
		return (EAttribute)editorCandiesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_PreferenceInitializerClassName() {
		return (EAttribute)editorCandiesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_VisualIDRegistryClassName() {
		return (EAttribute)editorCandiesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_ElementChooserClassName() {
		return (EAttribute)editorCandiesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_LoadResourceActionClassName() {
		return (EAttribute)editorCandiesEClass.getEStructuralFeatures().get(10);
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
	public EAttribute getEditPartCandies_EditPartFactoryClassName() {
		return (EAttribute)editPartCandiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditPartCandies_BaseExternalNodeLabelEditPartClassName() {
		return (EAttribute)editPartCandiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditPartCandies_BaseItemSemanticEditPolicyClassName() {
		return (EAttribute)editPartCandiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditPartCandies_BaseGraphicalNodeEditPolicyClassName() {
		return (EAttribute)editPartCandiesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditPartCandies_ReferenceConnectionEditPolicyClassName() {
		return (EAttribute)editPartCandiesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditPartCandies_CanonicalEditPolicyClassName() {
		return (EAttribute)editPartCandiesEClass.getEStructuralFeatures().get(6);
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
	public EAttribute getGenPlugin_PrintingEnabled() {
		return (EAttribute)genPluginEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenPlugin_ActivatorClassName() {
		return (EAttribute)genPluginEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getGenCommonBase_EditPartClassName() {
		return (EAttribute)genCommonBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCommonBase_ItemSemanticEditPolicyClassName() {
		return (EAttribute)genCommonBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCommonBase_NotationViewFactoryClassName() {
		return (EAttribute)genCommonBaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCommonBase_Viewmap() {
		return (EReference)genCommonBaseEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getGenChildContainer_ListLayout() {
		return (EAttribute)genChildContainerEClass.getEStructuralFeatures().get(2);
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
	public EReference getGenLabel_ModelFacet() {
		return (EReference)genLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalLabel() {
		return externalLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalLabel_TextEditPartClassName() {
		return (EAttribute)externalLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalLabel_TextNotationViewFactoryClassName() {
		return (EAttribute)externalLabelEClass.getEStructuralFeatures().get(1);
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
	public EClass getTextLabelModelFacet() {
		return textLabelModelFacetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextLabelModelFacet_Text() {
		return (EAttribute)textLabelModelFacetEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getFeatureLabelModelFacet_DefaultText() {
		return (EAttribute)featureLabelModelFacetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureLabelModelFacet_ViewPattern() {
		return (EAttribute)featureLabelModelFacetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureLabelModelFacet_EditPattern() {
		return (EAttribute)featureLabelModelFacetEClass.getEStructuralFeatures().get(2);
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
	public EClass getShapeAttributes() {
		return shapeAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeAttributes_LineWidth() {
		return (EAttribute)shapeAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeAttributes_LineStyle() {
		return (EAttribute)shapeAttributesEClass.getEStructuralFeatures().get(1);
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
	public EReference getPalette_Groups() {
		return (EReference)paletteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPalette_Flyout() {
		return (EAttribute)paletteEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getEntryBase_Order() {
		return (EAttribute)entryBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryBase_TitleKey() {
		return (EAttribute)entryBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryBase_DescriptionKey() {
		return (EAttribute)entryBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryBase_LargeIconPath() {
		return (EAttribute)entryBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryBase_SmallIconPath() {
		return (EAttribute)entryBaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryBase_CreateMethodName() {
		return (EAttribute)entryBaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryBase_EntryID() {
		return (EAttribute)entryBaseEClass.getEStructuralFeatures().get(6);
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
	public EClass getNodeEntry() {
		return nodeEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeEntry_GenNode() {
		return (EReference)nodeEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeEntry_Group() {
		return (EReference)nodeEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkEntry() {
		return linkEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEntry_GenLink() {
		return (EReference)linkEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEntry_Group() {
		return (EReference)linkEntryEClass.getEStructuralFeatures().get(1);
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
	public EReference getToolGroup_NodeTools() {
		return (EReference)toolGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolGroup_LinkTools() {
		return (EReference)toolGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolGroup_Palette() {
		return (EReference)toolGroupEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getGenAuditRule_Name() {
		return (EAttribute)genAuditRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenAuditRule_Message() {
		return (EAttribute)genAuditRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenAuditRule_Description() {
		return (EAttribute)genAuditRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenAuditRule_Severity() {
		return (EAttribute)genAuditRuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenAuditRule_UseInLiveMode() {
		return (EAttribute)genAuditRuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenAuditRule_Container() {
		return (EReference)genAuditRuleEClass.getEStructuralFeatures().get(8);
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
	public EEnum getGenSeverity() {
		return genSeverityEEnum;
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

		genDiagramEClass = createEClass(GEN_DIAGRAM);
		createEReference(genDiagramEClass, GEN_DIAGRAM__EDITOR_GEN);
		createEReference(genDiagramEClass, GEN_DIAGRAM__DOMAIN_DIAGRAM_ELEMENT);
		createEReference(genDiagramEClass, GEN_DIAGRAM__CHILD_NODES);
		createEReference(genDiagramEClass, GEN_DIAGRAM__TOP_LEVEL_NODES);
		createEReference(genDiagramEClass, GEN_DIAGRAM__LINKS);
		createEReference(genDiagramEClass, GEN_DIAGRAM__COMPARTMENTS);
		createEReference(genDiagramEClass, GEN_DIAGRAM__PALETTE);

		genEditorViewEClass = createEClass(GEN_EDITOR_VIEW);
		createEReference(genEditorViewEClass, GEN_EDITOR_VIEW__EDITOR_GEN);
		createEAttribute(genEditorViewEClass, GEN_EDITOR_VIEW__PACKAGE_NAME);
		createEAttribute(genEditorViewEClass, GEN_EDITOR_VIEW__ACTION_BAR_CONTRIBUTOR_CLASS_NAME);
		createEAttribute(genEditorViewEClass, GEN_EDITOR_VIEW__CLASS_NAME);
		createEAttribute(genEditorViewEClass, GEN_EDITOR_VIEW__ID);

		batchValidationEClass = createEClass(BATCH_VALIDATION);
		createEAttribute(batchValidationEClass, BATCH_VALIDATION__VALIDATION_PROVIDER_CLASS_NAME);
		createEAttribute(batchValidationEClass, BATCH_VALIDATION__VALIDATION_PROVIDER_PRIORITY);
		createEAttribute(batchValidationEClass, BATCH_VALIDATION__MARKER_NAVIGATION_PROVIDER_CLASS_NAME);
		createEAttribute(batchValidationEClass, BATCH_VALIDATION__MARKER_NAVIGATION_PROVIDER_PRIORITY);
		createEAttribute(batchValidationEClass, BATCH_VALIDATION__VALIDATION_ENABLED);

		providerClassNamesEClass = createEClass(PROVIDER_CLASS_NAMES);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__ELEMENT_TYPES_CLASS_NAME);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__SEMANTIC_HINTS_CLASS_NAME);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__NOTATION_VIEW_PROVIDER_CLASS_NAME);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__NOTATION_VIEW_PROVIDER_PRIORITY);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__EDIT_PART_PROVIDER_CLASS_NAME);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__EDIT_PART_PROVIDER_PRIORITY);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__PALETTE_PROVIDER_CLASS_NAME);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__PALETTE_PROVIDER_PRIORITY);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__METAMODEL_SUPPORT_PROVIDER_CLASS_NAME);
		createEAttribute(providerClassNamesEClass, PROVIDER_CLASS_NAMES__METAMODEL_SUPPORT_PROVIDER_PRIORITY);
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

		shortcutsEClass = createEClass(SHORTCUTS);
		createEAttribute(shortcutsEClass, SHORTCUTS__CREATE_SHORTCUT_ACTION_CLASS_NAME);
		createEAttribute(shortcutsEClass, SHORTCUTS__CONTAINS_SHORTCUTS_TO);
		createEAttribute(shortcutsEClass, SHORTCUTS__SHORTCUTS_PROVIDED_FOR);

		packageNamesEClass = createEClass(PACKAGE_NAMES);
		createEAttribute(packageNamesEClass, PACKAGE_NAMES__EDIT_COMMANDS_PACKAGE_NAME);
		createEAttribute(packageNamesEClass, PACKAGE_NAMES__EDIT_PARTS_PACKAGE_NAME);
		createEAttribute(packageNamesEClass, PACKAGE_NAMES__EDIT_POLICIES_PACKAGE_NAME);
		createEAttribute(packageNamesEClass, PACKAGE_NAMES__PROVIDERS_PACKAGE_NAME);
		createEAttribute(packageNamesEClass, PACKAGE_NAMES__NOTATION_VIEW_FACTORIES_PACKAGE_NAME);

		linkConstraintsEClass = createEClass(LINK_CONSTRAINTS);

		editorCandiesEClass = createEClass(EDITOR_CANDIES);
		createEAttribute(editorCandiesEClass, EDITOR_CANDIES__CREATION_WIZARD_CLASS_NAME);
		createEAttribute(editorCandiesEClass, EDITOR_CANDIES__CREATION_WIZARD_PAGE_CLASS_NAME);
		createEAttribute(editorCandiesEClass, EDITOR_CANDIES__DIAGRAM_EDITOR_UTIL_CLASS_NAME);
		createEAttribute(editorCandiesEClass, EDITOR_CANDIES__DIAGRAM_FILE_CREATOR_CLASS_NAME);
		createEAttribute(editorCandiesEClass, EDITOR_CANDIES__DOCUMENT_PROVIDER_CLASS_NAME);
		createEAttribute(editorCandiesEClass, EDITOR_CANDIES__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME);
		createEAttribute(editorCandiesEClass, EDITOR_CANDIES__MATCHING_STRATEGY_CLASS_NAME);
		createEAttribute(editorCandiesEClass, EDITOR_CANDIES__PREFERENCE_INITIALIZER_CLASS_NAME);
		createEAttribute(editorCandiesEClass, EDITOR_CANDIES__VISUAL_ID_REGISTRY_CLASS_NAME);
		createEAttribute(editorCandiesEClass, EDITOR_CANDIES__ELEMENT_CHOOSER_CLASS_NAME);
		createEAttribute(editorCandiesEClass, EDITOR_CANDIES__LOAD_RESOURCE_ACTION_CLASS_NAME);

		editPartCandiesEClass = createEClass(EDIT_PART_CANDIES);
		createEAttribute(editPartCandiesEClass, EDIT_PART_CANDIES__REORIENT_CONNECTION_VIEW_COMMAND_CLASS_NAME);
		createEAttribute(editPartCandiesEClass, EDIT_PART_CANDIES__EDIT_PART_FACTORY_CLASS_NAME);
		createEAttribute(editPartCandiesEClass, EDIT_PART_CANDIES__BASE_EXTERNAL_NODE_LABEL_EDIT_PART_CLASS_NAME);
		createEAttribute(editPartCandiesEClass, EDIT_PART_CANDIES__BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME);
		createEAttribute(editPartCandiesEClass, EDIT_PART_CANDIES__BASE_GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME);
		createEAttribute(editPartCandiesEClass, EDIT_PART_CANDIES__REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME);
		createEAttribute(editPartCandiesEClass, EDIT_PART_CANDIES__CANONICAL_EDIT_POLICY_CLASS_NAME);

		genPluginEClass = createEClass(GEN_PLUGIN);
		createEReference(genPluginEClass, GEN_PLUGIN__EDITOR_GEN);
		createEAttribute(genPluginEClass, GEN_PLUGIN__ID);
		createEAttribute(genPluginEClass, GEN_PLUGIN__NAME);
		createEAttribute(genPluginEClass, GEN_PLUGIN__PROVIDER);
		createEAttribute(genPluginEClass, GEN_PLUGIN__PRINTING_ENABLED);
		createEAttribute(genPluginEClass, GEN_PLUGIN__ACTIVATOR_CLASS_NAME);

		genCommonBaseEClass = createEClass(GEN_COMMON_BASE);
		createEReference(genCommonBaseEClass, GEN_COMMON_BASE__DIAGRAM_RUN_TIME_CLASS);
		createEAttribute(genCommonBaseEClass, GEN_COMMON_BASE__VISUAL_ID);
		createEAttribute(genCommonBaseEClass, GEN_COMMON_BASE__EDIT_PART_CLASS_NAME);
		createEAttribute(genCommonBaseEClass, GEN_COMMON_BASE__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME);
		createEAttribute(genCommonBaseEClass, GEN_COMMON_BASE__NOTATION_VIEW_FACTORY_CLASS_NAME);
		createEReference(genCommonBaseEClass, GEN_COMMON_BASE__VIEWMAP);

		genContainerBaseEClass = createEClass(GEN_CONTAINER_BASE);
		createEReference(genContainerBaseEClass, GEN_CONTAINER_BASE__CONTAINED_NODES);

		genChildContainerEClass = createEClass(GEN_CHILD_CONTAINER);
		createEReference(genChildContainerEClass, GEN_CHILD_CONTAINER__CHILD_NODES);
		createEAttribute(genChildContainerEClass, GEN_CHILD_CONTAINER__CANONICAL_EDIT_POLICY_CLASS_NAME);
		createEAttribute(genChildContainerEClass, GEN_CHILD_CONTAINER__LIST_LAYOUT);

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

		genCompartmentEClass = createEClass(GEN_COMPARTMENT);
		createEAttribute(genCompartmentEClass, GEN_COMPARTMENT__TITLE);
		createEAttribute(genCompartmentEClass, GEN_COMPARTMENT__CAN_COLLAPSE);
		createEAttribute(genCompartmentEClass, GEN_COMPARTMENT__HIDE_IF_EMPTY);
		createEAttribute(genCompartmentEClass, GEN_COMPARTMENT__NEEDS_TITLE);
		createEReference(genCompartmentEClass, GEN_COMPARTMENT__DIAGRAM);
		createEReference(genCompartmentEClass, GEN_COMPARTMENT__NODE);

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
		createEReference(genLabelEClass, GEN_LABEL__MODEL_FACET);

		externalLabelEClass = createEClass(EXTERNAL_LABEL);
		createEAttribute(externalLabelEClass, EXTERNAL_LABEL__TEXT_EDIT_PART_CLASS_NAME);
		createEAttribute(externalLabelEClass, EXTERNAL_LABEL__TEXT_NOTATION_VIEW_FACTORY_CLASS_NAME);

		genNodeLabelEClass = createEClass(GEN_NODE_LABEL);
		createEReference(genNodeLabelEClass, GEN_NODE_LABEL__NODE);

		genExternalNodeLabelEClass = createEClass(GEN_EXTERNAL_NODE_LABEL);

		genLinkLabelEClass = createEClass(GEN_LINK_LABEL);
		createEReference(genLinkLabelEClass, GEN_LINK_LABEL__LINK);
		createEAttribute(genLinkLabelEClass, GEN_LINK_LABEL__ALIGNMENT);

		modelFacetEClass = createEClass(MODEL_FACET);

		linkModelFacetEClass = createEClass(LINK_MODEL_FACET);

		labelModelFacetEClass = createEClass(LABEL_MODEL_FACET);

		textLabelModelFacetEClass = createEClass(TEXT_LABEL_MODEL_FACET);
		createEAttribute(textLabelModelFacetEClass, TEXT_LABEL_MODEL_FACET__TEXT);

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
		createEAttribute(featureLabelModelFacetEClass, FEATURE_LABEL_MODEL_FACET__DEFAULT_TEXT);
		createEAttribute(featureLabelModelFacetEClass, FEATURE_LABEL_MODEL_FACET__VIEW_PATTERN);
		createEAttribute(featureLabelModelFacetEClass, FEATURE_LABEL_MODEL_FACET__EDIT_PATTERN);

		compositeFeatureLabelModelFacetEClass = createEClass(COMPOSITE_FEATURE_LABEL_MODEL_FACET);
		createEAttribute(compositeFeatureLabelModelFacetEClass, COMPOSITE_FEATURE_LABEL_MODEL_FACET__VIEW_PATTERN);
		createEAttribute(compositeFeatureLabelModelFacetEClass, COMPOSITE_FEATURE_LABEL_MODEL_FACET__EDIT_PATTERN);

		attributesEClass = createEClass(ATTRIBUTES);

		colorAttributesEClass = createEClass(COLOR_ATTRIBUTES);
		createEAttribute(colorAttributesEClass, COLOR_ATTRIBUTES__FOREGROUND_COLOR);
		createEAttribute(colorAttributesEClass, COLOR_ATTRIBUTES__BACKGROUND_COLOR);

		shapeAttributesEClass = createEClass(SHAPE_ATTRIBUTES);
		createEAttribute(shapeAttributesEClass, SHAPE_ATTRIBUTES__LINE_WIDTH);
		createEAttribute(shapeAttributesEClass, SHAPE_ATTRIBUTES__LINE_STYLE);

		defaultSizeAttributesEClass = createEClass(DEFAULT_SIZE_ATTRIBUTES);
		createEAttribute(defaultSizeAttributesEClass, DEFAULT_SIZE_ATTRIBUTES__WIDTH);
		createEAttribute(defaultSizeAttributesEClass, DEFAULT_SIZE_ATTRIBUTES__HEIGHT);

		viewmapEClass = createEClass(VIEWMAP);
		createEReference(viewmapEClass, VIEWMAP__ATTRIBUTES);

		figureViewmapEClass = createEClass(FIGURE_VIEWMAP);
		createEAttribute(figureViewmapEClass, FIGURE_VIEWMAP__FIGURE_QUALIFIED_CLASS_NAME);

		snippetViewmapEClass = createEClass(SNIPPET_VIEWMAP);
		createEAttribute(snippetViewmapEClass, SNIPPET_VIEWMAP__BODY);

		innerClassViewmapEClass = createEClass(INNER_CLASS_VIEWMAP);
		createEAttribute(innerClassViewmapEClass, INNER_CLASS_VIEWMAP__CLASS_NAME);
		createEAttribute(innerClassViewmapEClass, INNER_CLASS_VIEWMAP__CLASS_BODY);

		valueExpressionEClass = createEClass(VALUE_EXPRESSION);
		createEAttribute(valueExpressionEClass, VALUE_EXPRESSION__BODY);
		createEAttribute(valueExpressionEClass, VALUE_EXPRESSION__LANGUAGE);

		genConstraintEClass = createEClass(GEN_CONSTRAINT);

		paletteEClass = createEClass(PALETTE);
		createEReference(paletteEClass, PALETTE__DIAGRAM);
		createEReference(paletteEClass, PALETTE__GROUPS);
		createEAttribute(paletteEClass, PALETTE__FLYOUT);
		createEAttribute(paletteEClass, PALETTE__PACKAGE_NAME);
		createEAttribute(paletteEClass, PALETTE__FACTORY_CLASS_NAME);

		entryBaseEClass = createEClass(ENTRY_BASE);
		createEAttribute(entryBaseEClass, ENTRY_BASE__ORDER);
		createEAttribute(entryBaseEClass, ENTRY_BASE__TITLE_KEY);
		createEAttribute(entryBaseEClass, ENTRY_BASE__DESCRIPTION_KEY);
		createEAttribute(entryBaseEClass, ENTRY_BASE__LARGE_ICON_PATH);
		createEAttribute(entryBaseEClass, ENTRY_BASE__SMALL_ICON_PATH);
		createEAttribute(entryBaseEClass, ENTRY_BASE__CREATE_METHOD_NAME);
		createEAttribute(entryBaseEClass, ENTRY_BASE__ENTRY_ID);

		toolEntryEClass = createEClass(TOOL_ENTRY);
		createEAttribute(toolEntryEClass, TOOL_ENTRY__DEFAULT);

		nodeEntryEClass = createEClass(NODE_ENTRY);
		createEReference(nodeEntryEClass, NODE_ENTRY__GEN_NODE);
		createEReference(nodeEntryEClass, NODE_ENTRY__GROUP);

		linkEntryEClass = createEClass(LINK_ENTRY);
		createEReference(linkEntryEClass, LINK_ENTRY__GEN_LINK);
		createEReference(linkEntryEClass, LINK_ENTRY__GROUP);

		toolGroupEClass = createEClass(TOOL_GROUP);
		createEReference(toolGroupEClass, TOOL_GROUP__NODE_TOOLS);
		createEReference(toolGroupEClass, TOOL_GROUP__LINK_TOOLS);
		createEReference(toolGroupEClass, TOOL_GROUP__PALETTE);

		genElementInitializerEClass = createEClass(GEN_ELEMENT_INITIALIZER);
		createEReference(genElementInitializerEClass, GEN_ELEMENT_INITIALIZER__TYPE_MODEL_FACET);

		genFeatureSeqInitializerEClass = createEClass(GEN_FEATURE_SEQ_INITIALIZER);
		createEReference(genFeatureSeqInitializerEClass, GEN_FEATURE_SEQ_INITIALIZER__INITIALIZERS);

		genFeatureValueSpecEClass = createEClass(GEN_FEATURE_VALUE_SPEC);
		createEReference(genFeatureValueSpecEClass, GEN_FEATURE_VALUE_SPEC__FEATURE);

		genLinkConstraintsEClass = createEClass(GEN_LINK_CONSTRAINTS);
		createEReference(genLinkConstraintsEClass, GEN_LINK_CONSTRAINTS__LINK);
		createEReference(genLinkConstraintsEClass, GEN_LINK_CONSTRAINTS__SOURCE_END);
		createEReference(genLinkConstraintsEClass, GEN_LINK_CONSTRAINTS__TARGET_END);

		genAuditContainerEClass = createEClass(GEN_AUDIT_CONTAINER);
		createEAttribute(genAuditContainerEClass, GEN_AUDIT_CONTAINER__ID);
		createEAttribute(genAuditContainerEClass, GEN_AUDIT_CONTAINER__NAME);
		createEAttribute(genAuditContainerEClass, GEN_AUDIT_CONTAINER__DESCRIPTION);
		createEReference(genAuditContainerEClass, GEN_AUDIT_CONTAINER__PARENT_CONTAINER);
		createEReference(genAuditContainerEClass, GEN_AUDIT_CONTAINER__AUDITS);
		createEReference(genAuditContainerEClass, GEN_AUDIT_CONTAINER__CHILD_CONTAINERS);

		genAuditRuleEClass = createEClass(GEN_AUDIT_RULE);
		createEAttribute(genAuditRuleEClass, GEN_AUDIT_RULE__ID);
		createEReference(genAuditRuleEClass, GEN_AUDIT_RULE__RULE);
		createEReference(genAuditRuleEClass, GEN_AUDIT_RULE__TARGET);
		createEAttribute(genAuditRuleEClass, GEN_AUDIT_RULE__NAME);
		createEAttribute(genAuditRuleEClass, GEN_AUDIT_RULE__MESSAGE);
		createEAttribute(genAuditRuleEClass, GEN_AUDIT_RULE__DESCRIPTION);
		createEAttribute(genAuditRuleEClass, GEN_AUDIT_RULE__SEVERITY);
		createEAttribute(genAuditRuleEClass, GEN_AUDIT_RULE__USE_IN_LIVE_MODE);
		createEReference(genAuditRuleEClass, GEN_AUDIT_RULE__CONTAINER);

		// Create enums
		providerPriorityEEnum = createEEnum(PROVIDER_PRIORITY);
		linkLabelAlignmentEEnum = createEEnum(LINK_LABEL_ALIGNMENT);
		genSeverityEEnum = createEEnum(GEN_SEVERITY);
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
		genContainerBaseEClass.getESuperTypes().add(this.getGenCommonBase());
		genChildContainerEClass.getESuperTypes().add(this.getGenContainerBase());
		genNodeEClass.getESuperTypes().add(this.getGenChildContainer());
		genTopLevelNodeEClass.getESuperTypes().add(this.getGenNode());
		genChildNodeEClass.getESuperTypes().add(this.getGenNode());
		genCompartmentEClass.getESuperTypes().add(this.getGenChildContainer());
		genLinkEClass.getESuperTypes().add(this.getGenCommonBase());
		genLabelEClass.getESuperTypes().add(this.getGenCommonBase());
		genNodeLabelEClass.getESuperTypes().add(this.getGenLabel());
		genExternalNodeLabelEClass.getESuperTypes().add(this.getGenNodeLabel());
		genExternalNodeLabelEClass.getESuperTypes().add(this.getExternalLabel());
		genLinkLabelEClass.getESuperTypes().add(this.getGenLabel());
		genLinkLabelEClass.getESuperTypes().add(this.getExternalLabel());
		linkModelFacetEClass.getESuperTypes().add(this.getModelFacet());
		labelModelFacetEClass.getESuperTypes().add(this.getModelFacet());
		textLabelModelFacetEClass.getESuperTypes().add(this.getLabelModelFacet());
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
		colorAttributesEClass.getESuperTypes().add(this.getAttributes());
		shapeAttributesEClass.getESuperTypes().add(this.getAttributes());
		defaultSizeAttributesEClass.getESuperTypes().add(this.getAttributes());
		figureViewmapEClass.getESuperTypes().add(this.getViewmap());
		snippetViewmapEClass.getESuperTypes().add(this.getViewmap());
		innerClassViewmapEClass.getESuperTypes().add(this.getViewmap());
		genConstraintEClass.getESuperTypes().add(this.getValueExpression());
		toolEntryEClass.getESuperTypes().add(this.getEntryBase());
		nodeEntryEClass.getESuperTypes().add(this.getToolEntry());
		linkEntryEClass.getESuperTypes().add(this.getToolEntry());
		toolGroupEClass.getESuperTypes().add(this.getEntryBase());
		genFeatureSeqInitializerEClass.getESuperTypes().add(this.getGenElementInitializer());
		genFeatureValueSpecEClass.getESuperTypes().add(this.getValueExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(genEditorGeneratorEClass, GenEditorGenerator.class, "GenEditorGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenEditorGenerator_Audits(), this.getGenAuditContainer(), null, "audits", null, 0, 1, GenEditorGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenEditorGenerator_Diagram(), this.getGenDiagram(), this.getGenDiagram_EditorGen(), "diagram", null, 1, 1, GenEditorGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenEditorGenerator_Plugin(), this.getGenPlugin(), this.getGenPlugin_EditorGen(), "plugin", null, 1, 1, GenEditorGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenEditorGenerator_Editor(), this.getGenEditorView(), this.getGenEditorView_EditorGen(), "editor", null, 1, 1, GenEditorGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenEditorGenerator_DomainGenModel(), theGenModelPackage.getGenModel(), null, "domainGenModel", null, 1, 1, GenEditorGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEditorGenerator_PackageNamePrefix(), ecorePackage.getEString(), "packageNamePrefix", null, 0, 1, GenEditorGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEditorGenerator_ModelID(), ecorePackage.getEString(), "modelID", null, 1, 1, GenEditorGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEditorGenerator_SameFileForDiagramAndModel(), ecorePackage.getEBoolean(), "sameFileForDiagramAndModel", null, 0, 1, GenEditorGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEditorGenerator_DiagramFileExtension(), ecorePackage.getEString(), "diagramFileExtension", null, 0, 1, GenEditorGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEditorGenerator_DomainFileExtension(), ecorePackage.getEString(), "domainFileExtension", null, 0, 1, GenEditorGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEditorGenerator_DynamicTemplates(), ecorePackage.getEBoolean(), "dynamicTemplates", "false", 0, 1, GenEditorGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEditorGenerator_TemplateDirectory(), ecorePackage.getEString(), "templateDirectory", null, 0, 1, GenEditorGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genDiagramEClass, GenDiagram.class, "GenDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenDiagram_EditorGen(), this.getGenEditorGenerator(), this.getGenEditorGenerator_Diagram(), "editorGen", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenDiagram_DomainDiagramElement(), theGenModelPackage.getGenClass(), null, "domainDiagramElement", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenDiagram_ChildNodes(), this.getGenChildNode(), this.getGenChildNode_Diagram(), "childNodes", null, 0, -1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenDiagram_TopLevelNodes(), this.getGenTopLevelNode(), this.getGenTopLevelNode_Diagram(), "topLevelNodes", null, 0, -1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenDiagram_Links(), this.getGenLink(), this.getGenLink_Diagram(), "links", null, 0, -1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenDiagram_Compartments(), this.getGenCompartment(), this.getGenCompartment_Diagram(), "compartments", null, 0, -1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenDiagram_Palette(), this.getPalette(), this.getPalette_Diagram(), "palette", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEAttribute(getGenEditorView_ID(), ecorePackage.getEString(), "iD", null, 0, 1, GenEditorView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genEditorViewEClass, ecorePackage.getEString(), "getActionBarContributorQualifiedClassName", 0, 1);

		addEOperation(genEditorViewEClass, ecorePackage.getEString(), "getQualifiedClassName", 0, 1);

		initEClass(batchValidationEClass, BatchValidation.class, "BatchValidation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBatchValidation_ValidationProviderClassName(), ecorePackage.getEString(), "validationProviderClassName", null, 0, 1, BatchValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatchValidation_ValidationProviderPriority(), this.getProviderPriority(), "validationProviderPriority", null, 0, 1, BatchValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatchValidation_MarkerNavigationProviderClassName(), ecorePackage.getEString(), "markerNavigationProviderClassName", null, 0, 1, BatchValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatchValidation_MarkerNavigationProviderPriority(), this.getProviderPriority(), "markerNavigationProviderPriority", null, 0, 1, BatchValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatchValidation_ValidationEnabled(), ecorePackage.getEBoolean(), "validationEnabled", null, 0, 1, BatchValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(batchValidationEClass, ecorePackage.getEString(), "getValidationProviderQualifiedClassName", 0, 1);

		addEOperation(batchValidationEClass, ecorePackage.getEString(), "getValidationDiagnosticMarkerType", 0, 1);

		addEOperation(batchValidationEClass, ecorePackage.getEString(), "getMarkerNavigationProviderQualifiedClassName", 0, 1);

		initEClass(providerClassNamesEClass, ProviderClassNames.class, "ProviderClassNames", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProviderClassNames_ElementTypesClassName(), ecorePackage.getEString(), "elementTypesClassName", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderClassNames_SemanticHintsClassName(), ecorePackage.getEString(), "semanticHintsClassName", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderClassNames_NotationViewProviderClassName(), ecorePackage.getEString(), "notationViewProviderClassName", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderClassNames_NotationViewProviderPriority(), this.getProviderPriority(), "notationViewProviderPriority", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderClassNames_EditPartProviderClassName(), ecorePackage.getEString(), "editPartProviderClassName", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderClassNames_EditPartProviderPriority(), this.getProviderPriority(), "editPartProviderPriority", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderClassNames_PaletteProviderClassName(), ecorePackage.getEString(), "paletteProviderClassName", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderClassNames_PaletteProviderPriority(), this.getProviderPriority(), "paletteProviderPriority", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderClassNames_MetamodelSupportProviderClassName(), ecorePackage.getEString(), "metamodelSupportProviderClassName", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderClassNames_MetamodelSupportProviderPriority(), this.getProviderPriority(), "metamodelSupportProviderPriority", null, 0, 1, ProviderClassNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

		addEOperation(providerClassNamesEClass, ecorePackage.getEString(), "getElementTypesQualifiedClassName", 0, 1);

		addEOperation(providerClassNamesEClass, ecorePackage.getEString(), "getSemanticHintsQualifiedClassName", 0, 1);

		addEOperation(providerClassNamesEClass, ecorePackage.getEString(), "getNotationViewProviderQualifiedClassName", 0, 1);

		addEOperation(providerClassNamesEClass, ecorePackage.getEString(), "getEditPartProviderQualifiedClassName", 0, 1);

		addEOperation(providerClassNamesEClass, ecorePackage.getEString(), "getPaletteProviderQualifiedClassName", 0, 1);

		addEOperation(providerClassNamesEClass, ecorePackage.getEString(), "getMetamodelSupportProviderQualifiedClassName", 0, 1);

		addEOperation(providerClassNamesEClass, ecorePackage.getEString(), "getModelingAssistantProviderQualifiedClassName", 0, 1);

		addEOperation(providerClassNamesEClass, ecorePackage.getEString(), "getPropertyProviderQualifiedClassName", 0, 1);

		addEOperation(providerClassNamesEClass, ecorePackage.getEString(), "getIconProviderQualifiedClassName", 0, 1);

		addEOperation(providerClassNamesEClass, ecorePackage.getEString(), "getParserProviderQualifiedClassName", 0, 1);

		addEOperation(providerClassNamesEClass, ecorePackage.getEString(), "getAbstractParserQualifiedClassName", 0, 1);

		addEOperation(providerClassNamesEClass, ecorePackage.getEString(), "getStructuralFeatureParserQualifiedClassName", 0, 1);

		addEOperation(providerClassNamesEClass, ecorePackage.getEString(), "getStructuralFeaturesParserQualifiedClassName", 0, 1);

		initEClass(shortcutsEClass, Shortcuts.class, "Shortcuts", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShortcuts_CreateShortcutActionClassName(), ecorePackage.getEString(), "createShortcutActionClassName", null, 0, 1, Shortcuts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShortcuts_ContainsShortcutsTo(), ecorePackage.getEString(), "containsShortcutsTo", null, 0, -1, Shortcuts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShortcuts_ShortcutsProvidedFor(), ecorePackage.getEString(), "shortcutsProvidedFor", null, 0, -1, Shortcuts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(shortcutsEClass, ecorePackage.getEString(), "getCreateShortcutActionQualifiedClassName", 0, 1);

		addEOperation(shortcutsEClass, ecorePackage.getEBoolean(), "generateCreateShortcutAction", 0, 1);

		addEOperation(shortcutsEClass, ecorePackage.getEBoolean(), "generateShortcutIcon", 0, 1);

		initEClass(packageNamesEClass, PackageNames.class, "PackageNames", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageNames_EditCommandsPackageName(), ecorePackage.getEString(), "editCommandsPackageName", null, 0, 1, PackageNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEAttribute(getEditorCandies_DiagramEditorUtilClassName(), ecorePackage.getEString(), "diagramEditorUtilClassName", null, 0, 1, EditorCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditorCandies_DiagramFileCreatorClassName(), ecorePackage.getEString(), "diagramFileCreatorClassName", null, 0, 1, EditorCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditorCandies_DocumentProviderClassName(), ecorePackage.getEString(), "documentProviderClassName", null, 0, 1, EditorCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditorCandies_InitDiagramFileActionClassName(), ecorePackage.getEString(), "initDiagramFileActionClassName", null, 0, 1, EditorCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditorCandies_MatchingStrategyClassName(), ecorePackage.getEString(), "matchingStrategyClassName", null, 0, 1, EditorCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditorCandies_PreferenceInitializerClassName(), ecorePackage.getEString(), "preferenceInitializerClassName", null, 0, 1, EditorCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditorCandies_VisualIDRegistryClassName(), ecorePackage.getEString(), "visualIDRegistryClassName", null, 0, 1, EditorCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditorCandies_ElementChooserClassName(), ecorePackage.getEString(), "elementChooserClassName", null, 0, 1, EditorCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditorCandies_LoadResourceActionClassName(), ecorePackage.getEString(), "loadResourceActionClassName", null, 0, 1, EditorCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(editorCandiesEClass, ecorePackage.getEString(), "getCreationWizardQualifiedClassName", 0, 1);

		addEOperation(editorCandiesEClass, ecorePackage.getEString(), "getCreationWizardPageQualifiedClassName", 0, 1);

		addEOperation(editorCandiesEClass, ecorePackage.getEString(), "getDiagramEditorUtilQualifiedClassName", 0, 1);

		addEOperation(editorCandiesEClass, ecorePackage.getEString(), "getDiagramFileCreatorQualifiedClassName", 0, 1);

		addEOperation(editorCandiesEClass, ecorePackage.getEString(), "getDocumentProviderQualifiedClassName", 0, 1);

		addEOperation(editorCandiesEClass, ecorePackage.getEString(), "getInitDiagramFileActionQualifiedClassName", 0, 1);

		addEOperation(editorCandiesEClass, ecorePackage.getEString(), "getMatchingStrategyQualifiedClassName", 0, 1);

		addEOperation(editorCandiesEClass, ecorePackage.getEString(), "getPreferenceInitializerQualifiedClassName", 0, 1);

		addEOperation(editorCandiesEClass, ecorePackage.getEString(), "getVisualIDRegistryQualifiedClassName", 0, 1);

		addEOperation(editorCandiesEClass, ecorePackage.getEString(), "getElementChooserQualifiedClassName", 0, 1);

		addEOperation(editorCandiesEClass, ecorePackage.getEString(), "getLoadResourceActionQualifiedClassName", 0, 1);

		initEClass(editPartCandiesEClass, EditPartCandies.class, "EditPartCandies", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEditPartCandies_ReorientConnectionViewCommandClassName(), ecorePackage.getEString(), "reorientConnectionViewCommandClassName", null, 0, 1, EditPartCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditPartCandies_EditPartFactoryClassName(), ecorePackage.getEString(), "editPartFactoryClassName", null, 0, 1, EditPartCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditPartCandies_BaseExternalNodeLabelEditPartClassName(), ecorePackage.getEString(), "baseExternalNodeLabelEditPartClassName", null, 0, 1, EditPartCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditPartCandies_BaseItemSemanticEditPolicyClassName(), ecorePackage.getEString(), "baseItemSemanticEditPolicyClassName", null, 0, 1, EditPartCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditPartCandies_BaseGraphicalNodeEditPolicyClassName(), ecorePackage.getEString(), "baseGraphicalNodeEditPolicyClassName", null, 0, 1, EditPartCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditPartCandies_ReferenceConnectionEditPolicyClassName(), ecorePackage.getEString(), "referenceConnectionEditPolicyClassName", null, 0, 1, EditPartCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditPartCandies_CanonicalEditPolicyClassName(), ecorePackage.getEString(), "canonicalEditPolicyClassName", null, 0, 1, EditPartCandies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(editPartCandiesEClass, ecorePackage.getEString(), "getReorientConnectionViewCommandQualifiedClassName", 0, 1);

		addEOperation(editPartCandiesEClass, ecorePackage.getEString(), "getEditPartFactoryQualifiedClassName", 0, 1);

		addEOperation(editPartCandiesEClass, ecorePackage.getEString(), "getBaseExternalNodeLabelEditPartQualifiedClassName", 0, 1);

		addEOperation(editPartCandiesEClass, ecorePackage.getEString(), "getBaseItemSemanticEditPolicyQualifiedClassName", 0, 1);

		addEOperation(editPartCandiesEClass, ecorePackage.getEString(), "getBaseGraphicalNodeEditPolicyQualifiedClassName", 0, 1);

		addEOperation(editPartCandiesEClass, ecorePackage.getEString(), "getReferenceConnectionEditPolicyQualifiedClassName", 0, 1);

		addEOperation(editPartCandiesEClass, ecorePackage.getEString(), "getCanonicalEditPolicyQualifiedClassName", 0, 1);

		initEClass(genPluginEClass, GenPlugin.class, "GenPlugin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenPlugin_EditorGen(), this.getGenEditorGenerator(), this.getGenEditorGenerator_Plugin(), "editorGen", null, 0, 1, GenPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenPlugin_ID(), ecorePackage.getEString(), "iD", null, 0, 1, GenPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenPlugin_Name(), ecorePackage.getEString(), "name", null, 0, 1, GenPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenPlugin_Provider(), ecorePackage.getEString(), "provider", "Sample Plugin Provider, Inc", 0, 1, GenPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenPlugin_PrintingEnabled(), ecorePackage.getEBoolean(), "printingEnabled", null, 0, 1, GenPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenPlugin_ActivatorClassName(), ecorePackage.getEString(), "activatorClassName", null, 0, 1, GenPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genPluginEClass, ecorePackage.getEString(), "getRequiredPluginIDs", 0, -1);

		addEOperation(genPluginEClass, ecorePackage.getEString(), "getActivatorQualifiedClassName", 0, 1);

		initEClass(genCommonBaseEClass, GenCommonBase.class, "GenCommonBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenCommonBase_DiagramRunTimeClass(), theGenModelPackage.getGenClass(), null, "diagramRunTimeClass", null, 1, 1, GenCommonBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenCommonBase_VisualID(), ecorePackage.getEInt(), "visualID", null, 1, 1, GenCommonBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

		initEClass(genContainerBaseEClass, GenContainerBase.class, "GenContainerBase", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenContainerBase_ContainedNodes(), this.getGenNode(), null, "containedNodes", null, 0, -1, GenContainerBase.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(genChildContainerEClass, GenChildContainer.class, "GenChildContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenChildContainer_ChildNodes(), this.getGenChildNode(), this.getGenChildNode_Containers(), "childNodes", null, 0, -1, GenChildContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenChildContainer_CanonicalEditPolicyClassName(), ecorePackage.getEString(), "canonicalEditPolicyClassName", null, 0, 1, GenChildContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenChildContainer_ListLayout(), ecorePackage.getEBoolean(), "listLayout", "true", 0, 1, GenChildContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genChildContainerEClass, ecorePackage.getEString(), "getCanonicalEditPolicyQualifiedClassName", 0, 1);

		initEClass(genNodeEClass, GenNode.class, "GenNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenNode_ModelFacet(), this.getTypeModelFacet(), null, "modelFacet", null, 1, 1, GenNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenNode_Labels(), this.getGenNodeLabel(), this.getGenNodeLabel_Node(), "labels", null, 0, -1, GenNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenNode_Compartments(), this.getGenCompartment(), this.getGenCompartment_Node(), "compartments", null, 0, -1, GenNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenNode_GraphicalNodeEditPolicyClassName(), ecorePackage.getEString(), "graphicalNodeEditPolicyClassName", null, 0, 1, GenNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genNodeEClass, theGenModelPackage.getGenClass(), "getDomainMetaClass", 1, 1);

		addEOperation(genNodeEClass, ecorePackage.getEString(), "getGraphicalNodeEditPolicyQualifiedClassName", 0, 1);

		addEOperation(genNodeEClass, ecorePackage.getEBoolean(), "isListContainerEntry", 0, 1);

		initEClass(genTopLevelNodeEClass, GenTopLevelNode.class, "GenTopLevelNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenTopLevelNode_Diagram(), this.getGenDiagram(), this.getGenDiagram_TopLevelNodes(), "diagram", null, 1, 1, GenTopLevelNode.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genChildNodeEClass, GenChildNode.class, "GenChildNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenChildNode_Diagram(), this.getGenDiagram(), this.getGenDiagram_ChildNodes(), "diagram", null, 1, 1, GenChildNode.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenChildNode_Containers(), this.getGenChildContainer(), this.getGenChildContainer_ChildNodes(), "containers", null, 0, -1, GenChildNode.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genCompartmentEClass, GenCompartment.class, "GenCompartment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenCompartment_Title(), ecorePackage.getEString(), "title", null, 0, 1, GenCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenCompartment_CanCollapse(), ecorePackage.getEBoolean(), "canCollapse", "true", 0, 1, GenCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenCompartment_HideIfEmpty(), ecorePackage.getEBoolean(), "hideIfEmpty", "true", 0, 1, GenCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenCompartment_NeedsTitle(), ecorePackage.getEBoolean(), "needsTitle", "true", 0, 1, GenCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenCompartment_Diagram(), this.getGenDiagram(), this.getGenDiagram_Compartments(), "diagram", null, 1, 1, GenCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenCompartment_Node(), this.getGenNode(), this.getGenNode_Compartments(), "node", null, 1, 1, GenCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genCompartmentEClass, ecorePackage.getEString(), "getSemanticHintFieldName", 0, 1);

		initEClass(genLinkEClass, GenLink.class, "GenLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenLink_Diagram(), this.getGenDiagram(), this.getGenDiagram_Links(), "diagram", null, 1, 1, GenLink.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenLink_ModelFacet(), this.getLinkModelFacet(), null, "modelFacet", null, 1, 1, GenLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenLink_Labels(), this.getGenLinkLabel(), this.getGenLinkLabel_Link(), "labels", null, 0, -1, GenLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenLink_OutgoingCreationAllowed(), ecorePackage.getEBoolean(), "outgoingCreationAllowed", "true", 0, 1, GenLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenLink_IncomingCreationAllowed(), ecorePackage.getEBoolean(), "incomingCreationAllowed", "false", 0, 1, GenLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenLink_ViewDirectionAlignedWithModel(), ecorePackage.getEBoolean(), "viewDirectionAlignedWithModel", "true", 0, 1, GenLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenLink_CreationConstraints(), this.getGenLinkConstraints(), this.getGenLinkConstraints_Link(), "creationConstraints", null, 0, 1, GenLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genLinkEClass, this.getGenCommonBase(), "getSources", 0, -1);

		addEOperation(genLinkEClass, this.getGenCommonBase(), "getTargets", 0, -1);

		initEClass(genLabelEClass, GenLabel.class, "GenLabel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenLabel_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", null, 0, 1, GenLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenLabel_ModelFacet(), this.getLabelModelFacet(), null, "modelFacet", null, 0, 1, GenLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genLabelEClass, ecorePackage.getEString(), "getSemanticHintFieldName", 0, 1);

		addEOperation(genLabelEClass, theGenModelPackage.getGenFeature(), "getMetaFeatures", 0, -1);

		initEClass(externalLabelEClass, ExternalLabel.class, "ExternalLabel", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalLabel_TextEditPartClassName(), ecorePackage.getEString(), "textEditPartClassName", null, 0, 1, ExternalLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalLabel_TextNotationViewFactoryClassName(), ecorePackage.getEString(), "textNotationViewFactoryClassName", null, 0, 1, ExternalLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(externalLabelEClass, ecorePackage.getEString(), "getTextEditPartQualifiedClassName", 0, 1);

		addEOperation(externalLabelEClass, ecorePackage.getEString(), "getTextNotationViewFactoryQualifiedClassName", 0, 1);

		addEOperation(externalLabelEClass, ecorePackage.getEString(), "getSemanticHintLabelFieldName", 0, 1);

		initEClass(genNodeLabelEClass, GenNodeLabel.class, "GenNodeLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenNodeLabel_Node(), this.getGenNode(), this.getGenNode_Labels(), "node", null, 1, 1, GenNodeLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genExternalNodeLabelEClass, GenExternalNodeLabel.class, "GenExternalNodeLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genLinkLabelEClass, GenLinkLabel.class, "GenLinkLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenLinkLabel_Link(), this.getGenLink(), this.getGenLink_Labels(), "link", null, 1, 1, GenLinkLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenLinkLabel_Alignment(), this.getLinkLabelAlignment(), "alignment", "MIDDLE", 0, 1, GenLinkLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelFacetEClass, ModelFacet.class, "ModelFacet", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkModelFacetEClass, LinkModelFacet.class, "LinkModelFacet", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(linkModelFacetEClass, theGenModelPackage.getGenClass(), "getSourceTypes", 0, -1);

		addEOperation(linkModelFacetEClass, theGenModelPackage.getGenClass(), "getTargetTypes", 0, -1);

		initEClass(labelModelFacetEClass, LabelModelFacet.class, "LabelModelFacet", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textLabelModelFacetEClass, TextLabelModelFacet.class, "TextLabelModelFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextLabelModelFacet_Text(), ecorePackage.getEString(), "text", null, 1, 1, TextLabelModelFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEAttribute(getFeatureLabelModelFacet_DefaultText(), ecorePackage.getEString(), "defaultText", null, 0, 1, FeatureLabelModelFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureLabelModelFacet_ViewPattern(), ecorePackage.getEString(), "viewPattern", null, 0, 1, FeatureLabelModelFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureLabelModelFacet_EditPattern(), ecorePackage.getEString(), "editPattern", null, 0, 1, FeatureLabelModelFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeFeatureLabelModelFacetEClass, CompositeFeatureLabelModelFacet.class, "CompositeFeatureLabelModelFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompositeFeatureLabelModelFacet_ViewPattern(), ecorePackage.getEString(), "viewPattern", null, 1, 1, CompositeFeatureLabelModelFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeFeatureLabelModelFacet_EditPattern(), ecorePackage.getEString(), "editPattern", null, 0, 1, CompositeFeatureLabelModelFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributesEClass, Attributes.class, "Attributes", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(colorAttributesEClass, ColorAttributes.class, "ColorAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColorAttributes_ForegroundColor(), ecorePackage.getEString(), "foregroundColor", null, 0, 1, ColorAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColorAttributes_BackgroundColor(), ecorePackage.getEString(), "backgroundColor", null, 0, 1, ColorAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapeAttributesEClass, ShapeAttributes.class, "ShapeAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShapeAttributes_LineWidth(), ecorePackage.getEInt(), "lineWidth", null, 0, 1, ShapeAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShapeAttributes_LineStyle(), ecorePackage.getEString(), "lineStyle", "LINE_SOLID", 0, 1, ShapeAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultSizeAttributesEClass, DefaultSizeAttributes.class, "DefaultSizeAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultSizeAttributes_Width(), ecorePackage.getEInt(), "width", "40", 0, 1, DefaultSizeAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultSizeAttributes_Height(), ecorePackage.getEInt(), "height", "30", 0, 1, DefaultSizeAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewmapEClass, Viewmap.class, "Viewmap", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewmap_Attributes(), this.getAttributes(), null, "attributes", null, 0, -1, Viewmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(viewmapEClass, this.getAttributes(), "find", 0, 1);
		addEParameter(op, ecorePackage.getEJavaClass(), "attributesClass", 0, 1);

		initEClass(figureViewmapEClass, FigureViewmap.class, "FigureViewmap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFigureViewmap_FigureQualifiedClassName(), ecorePackage.getEString(), "figureQualifiedClassName", null, 1, 1, FigureViewmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(snippetViewmapEClass, SnippetViewmap.class, "SnippetViewmap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSnippetViewmap_Body(), ecorePackage.getEString(), "body", null, 0, 1, SnippetViewmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(innerClassViewmapEClass, InnerClassViewmap.class, "InnerClassViewmap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInnerClassViewmap_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, InnerClassViewmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInnerClassViewmap_ClassBody(), ecorePackage.getEString(), "classBody", null, 0, 1, InnerClassViewmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueExpressionEClass, ValueExpression.class, "ValueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueExpression_Body(), ecorePackage.getEString(), "body", null, 1, 1, ValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueExpression_Language(), ecorePackage.getEString(), "language", "ocl", 0, 1, ValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genConstraintEClass, GenConstraint.class, "GenConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paletteEClass, Palette.class, "Palette", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPalette_Diagram(), this.getGenDiagram(), this.getGenDiagram_Palette(), "diagram", null, 1, 1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPalette_Groups(), this.getToolGroup(), this.getToolGroup_Palette(), "groups", null, 1, -1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPalette_Flyout(), ecorePackage.getEBoolean(), "flyout", "true", 0, 1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPalette_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPalette_FactoryClassName(), ecorePackage.getEString(), "factoryClassName", null, 0, 1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(paletteEClass, ecorePackage.getEString(), "getFactoryQualifiedClassName", 0, 1);

		initEClass(entryBaseEClass, EntryBase.class, "EntryBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntryBase_Order(), ecorePackage.getEInt(), "order", null, 0, 1, EntryBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryBase_TitleKey(), ecorePackage.getEString(), "titleKey", null, 0, 1, EntryBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryBase_DescriptionKey(), ecorePackage.getEString(), "descriptionKey", null, 0, 1, EntryBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryBase_LargeIconPath(), ecorePackage.getEString(), "largeIconPath", null, 0, 1, EntryBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryBase_SmallIconPath(), ecorePackage.getEString(), "smallIconPath", null, 0, 1, EntryBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryBase_CreateMethodName(), ecorePackage.getEString(), "createMethodName", null, 0, 1, EntryBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryBase_EntryID(), ecorePackage.getEInt(), "entryID", null, 1, 1, EntryBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolEntryEClass, ToolEntry.class, "ToolEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToolEntry_Default(), ecorePackage.getEBoolean(), "default", "false", 0, 1, ToolEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEntryEClass, NodeEntry.class, "NodeEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeEntry_GenNode(), this.getGenNode(), null, "genNode", null, 1, -1, NodeEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeEntry_Group(), this.getToolGroup(), this.getToolGroup_NodeTools(), "group", null, 0, 1, NodeEntry.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEntryEClass, LinkEntry.class, "LinkEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkEntry_GenLink(), this.getGenLink(), null, "genLink", null, 1, -1, LinkEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkEntry_Group(), this.getToolGroup(), this.getToolGroup_LinkTools(), "group", null, 0, 1, LinkEntry.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolGroupEClass, ToolGroup.class, "ToolGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToolGroup_NodeTools(), this.getNodeEntry(), this.getNodeEntry_Group(), "nodeTools", null, 0, -1, ToolGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolGroup_LinkTools(), this.getLinkEntry(), this.getLinkEntry_Group(), "linkTools", null, 0, -1, ToolGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolGroup_Palette(), this.getPalette(), this.getPalette_Groups(), "palette", null, 1, 1, ToolGroup.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genElementInitializerEClass, GenElementInitializer.class, "GenElementInitializer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenElementInitializer_TypeModelFacet(), this.getTypeModelFacet(), this.getTypeModelFacet_ModelElementInitializer(), "typeModelFacet", null, 1, 1, GenElementInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genFeatureSeqInitializerEClass, GenFeatureSeqInitializer.class, "GenFeatureSeqInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenFeatureSeqInitializer_Initializers(), this.getGenFeatureValueSpec(), null, "initializers", null, 1, -1, GenFeatureSeqInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genFeatureSeqInitializerEClass, ecorePackage.getEString(), "getElementClassAccessorName", 1, 1);

		addEOperation(genFeatureSeqInitializerEClass, ecorePackage.getEString(), "getElementQualifiedPackageInterfaceName", 1, 1);

		initEClass(genFeatureValueSpecEClass, GenFeatureValueSpec.class, "GenFeatureValueSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenFeatureValueSpec_Feature(), theGenModelPackage.getGenFeature(), null, "feature", null, 1, 1, GenFeatureValueSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genFeatureValueSpecEClass, ecorePackage.getEString(), "getFeatureQualifiedPackageInterfaceName", 1, 1);

		initEClass(genLinkConstraintsEClass, GenLinkConstraints.class, "GenLinkConstraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenLinkConstraints_Link(), this.getGenLink(), this.getGenLink_CreationConstraints(), "link", null, 1, 1, GenLinkConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenLinkConstraints_SourceEnd(), this.getGenConstraint(), null, "sourceEnd", null, 0, 1, GenLinkConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenLinkConstraints_TargetEnd(), this.getGenConstraint(), null, "targetEnd", null, 0, 1, GenLinkConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genLinkConstraintsEClass, theGenModelPackage.getGenClass(), "getLinkClass", 0, 1);

		addEOperation(genLinkConstraintsEClass, theGenModelPackage.getGenClass(), "getSourceEndContextClass", 0, 1);

		addEOperation(genLinkConstraintsEClass, theGenModelPackage.getGenClass(), "getTargetEndContextClass", 0, 1);

		addEOperation(genLinkConstraintsEClass, ecorePackage.getEString(), "getConstraintsInstanceFieldName", 1, 1);

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

		initEClass(genAuditRuleEClass, GenAuditRule.class, "GenAuditRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenAuditRule_Id(), ecorePackage.getEString(), "id", null, 1, 1, GenAuditRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenAuditRule_Rule(), this.getGenConstraint(), null, "rule", null, 1, 1, GenAuditRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenAuditRule_Target(), theGenModelPackage.getGenClass(), null, "target", null, 1, 1, GenAuditRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenAuditRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, GenAuditRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenAuditRule_Message(), ecorePackage.getEString(), "message", null, 0, 1, GenAuditRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenAuditRule_Description(), ecorePackage.getEString(), "description", null, 0, 1, GenAuditRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenAuditRule_Severity(), this.getGenSeverity(), "severity", "ERROR", 0, 1, GenAuditRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenAuditRule_UseInLiveMode(), ecorePackage.getEBoolean(), "useInLiveMode", "false", 0, 1, GenAuditRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenAuditRule_Container(), this.getGenAuditContainer(), this.getGenAuditContainer_Audits(), "container", null, 1, 1, GenAuditRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEEnum(genSeverityEEnum, GenSeverity.class, "GenSeverity");
		addEEnumLiteral(genSeverityEEnum, GenSeverity.INFO_LITERAL);
		addEEnumLiteral(genSeverityEEnum, GenSeverity.WARNING_LITERAL);
		addEEnumLiteral(genSeverityEEnum, GenSeverity.ERROR_LITERAL);

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
			 "import", "platform:/resource/org.eclipse.gmf.runtime.notation/model/notation.ecore"
		   });								
		addAnnotation
		  (genDiagramEClass, 
		   source, 
		   new String[] {
			 "ocl", "nodes->forAll(n : GenNode | self.links->forAll(l : GenLink | l.oclAsType(TypeLinkModelFacet).metaClass <> n.getDomainMetaClass()))"
		   });																	
		addAnnotation
		  (genNodeEClass, 
		   source, 
		   new String[] {
			 "ocl", "let c: ecore::EClass = diagramRunTimeClass.ecoreClass.oclAsType(ecore::EClass) in c = notation::Node or c.eAllSuperTypes->includes(notation::Node)"
		   });		
		addAnnotation
		  (genNodeEClass, 
		   source, 
		   new String[] {
			 "ocl", "containers->forAll(n|n.listLayout) or containers->forAll(n|not n.listLayout)"
		   });						
		addAnnotation
		  (genLinkEClass, 
		   source, 
		   new String[] {
			 "ocl", "let c: ecore::EClass = diagramRunTimeClass.ecoreClass.oclAsType(ecore::EClass) in c = notation::Edge or c.eAllSuperTypes->includes(notation::Edge)"
		   });													
		addAnnotation
		  (genNodeLabelEClass, 
		   source, 
		   new String[] {
			 "ocl", "modelFacet.metaFeature.ecoreFeature.eContainingClass.isSuperTypeOf(node.getDomainMetaClass().ecoreClass)"
		   });				
		addAnnotation
		  (genLinkLabelEClass, 
		   source, 
		   new String[] {
			 "ocl", "let tl: TypeLinkModelFacet = link.modelFacet.oclAsType(TypeLinkModelFacet) in tl.oclIsUndefined() or modelFacet.metaFeature.ecoreFeature.eContainingClass.isSuperTypeOf(tl.metaClass.ecoreClass)"
		   });								
		addAnnotation
		  (getTypeModelFacet_ContainmentMetaFeature(), 
		   source, 
		   new String[] {
			 "ocl", "containmentMetaFeature.ecoreFeature.oclAsType(ecore::EReference).containment"
		   });		
		addAnnotation
		  (getTypeModelFacet_ContainmentMetaFeature(), 
		   source, 
		   new String[] {
			 "ocl", "containmentMetaFeature.ecoreFeature.oclAsType(ecore::EReference).eReferenceType.isSuperTypeOf(metaClass.ecoreClass)"
		   });										
		addAnnotation
		  (getTypeLinkModelFacet_SourceMetaFeature(), 
		   source, 
		   new String[] {
			 "ocl", "sourceMetaFeature.oclIsUndefined() or sourceMetaFeature.ecoreFeature.oclAsType(ecore::EReference).eReferenceType.isSuperTypeOf(metaClass.ecoreClass)"
		   });		
		addAnnotation
		  (getTypeLinkModelFacet_TargetMetaFeature(), 
		   source, 
		   new String[] {
			 "ocl", "targetMetaFeature.genClass.ecoreClass.isSuperTypeOf(metaClass.ecoreClass)"
		   });																														
		addAnnotation
		  (getGenFeatureSeqInitializer_Initializers(), 
		   source, 
		   new String[] {
			 "ocl", "initializers.feature->forAll(f| f.ecoreFeature.eContainingClass.isSuperTypeOf(typeModelFacet.metaClass.ecoreClass))"
		   });								
		addAnnotation
		  (genLinkConstraintsEClass, 
		   source, 
		   new String[] {
			 "ocl", "not sourceEnd.oclIsUndefined() or not targetEnd.oclIsUndefined()"
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
		  (getValueExpression_Language(), 
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
			 "ocl", "target.ecoreClass"
		   });							
	}

} //GMFGenPackageImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenModelPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.impl.EcorePackageImpl;
import org.eclipse.gmf.codegen.gmfgen.Attributes;
import org.eclipse.gmf.codegen.gmfgen.BasicNodeViewmap;
import org.eclipse.gmf.codegen.gmfgen.ColorAttributes;
import org.eclipse.gmf.codegen.gmfgen.CompartmentLayoutKind;
import org.eclipse.gmf.codegen.gmfgen.CompartmentPlacementKind;
import org.eclipse.gmf.codegen.gmfgen.CompartmentViewmap;
import org.eclipse.gmf.codegen.gmfgen.DecoratedConnectionViewmap;
import org.eclipse.gmf.codegen.gmfgen.DefaultSizeAttributes;
import org.eclipse.gmf.codegen.gmfgen.DiagramViewmap;
import org.eclipse.gmf.codegen.gmfgen.EntryBase;
import org.eclipse.gmf.codegen.gmfgen.FeatureModelFacet;
import org.eclipse.gmf.codegen.gmfgen.FigureViewmap;
import org.eclipse.gmf.codegen.gmfgen.GMFGenFactory;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenChildContainer;
import org.eclipse.gmf.codegen.gmfgen.GenChildNode;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenElementInitializer;
import org.eclipse.gmf.codegen.gmfgen.GenFeatureSeqInitializer;
import org.eclipse.gmf.codegen.gmfgen.GenFeatureValueSpec;
import org.eclipse.gmf.codegen.gmfgen.GenLabel;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenLinkLabel;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.GenNodeLabel;
import org.eclipse.gmf.codegen.gmfgen.LabelViewmap;
import org.eclipse.gmf.codegen.gmfgen.LinkDecoration;
import org.eclipse.gmf.codegen.gmfgen.LinkEntry;
import org.eclipse.gmf.codegen.gmfgen.LinkLabelAlignment;
import org.eclipse.gmf.codegen.gmfgen.LinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.ModelElementSelector;
import org.eclipse.gmf.codegen.gmfgen.ModelFacet;
import org.eclipse.gmf.codegen.gmfgen.NodeEntry;
import org.eclipse.gmf.codegen.gmfgen.Palette;
import org.eclipse.gmf.codegen.gmfgen.ShapeAttributes;
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
	private EClass genDiagramEClass = null;

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
	private EClass genNodeEClass = null;

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
	private EClass genChildNodeEClass = null;

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
	private EClass typeLinkModelFacetEClass = null;

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
	private EClass basicNodeViewmapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decoratedConnectionViewmapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkDecorationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramViewmapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compartmentViewmapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelViewmapEClass = null;

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
	private EClass modelElementSelectorEClass = null;

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
	private EEnum compartmentPlacementKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compartmentLayoutKindEEnum = null;

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
	private EDataType stringArrayEDataType = null;

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
		GenModelPackageImpl.init();
		EcorePackageImpl.init();

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
	public EClass getGenDiagram() {
		return genDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagram_DomainMetaModel() {
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
	public EReference getGenDiagram_Nodes() {
		return (EReference)genDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagram_Links() {
		return (EReference)genDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagram_Palette() {
		return (EReference)genDiagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_EditPartsPackageName() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_PluginName() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_ProviderName() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_PluginID() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_PluginClassName() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_EditorPackageName() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_ProvidersPackageName() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_EditorClassName() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_DocumentProviderClassName() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_EditPartFactoryClassName() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_HasDomainModel() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_DiagramFileExtension() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_SameFileForDiagramAndModel() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_PrintingEnabled() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_InitDiagramFileActionClassName() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_ActionBarContributorClassName() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_MatchingStrategyClassName() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_ViewProviderClassName() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_EditPartProviderClassName() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_MetamodelSupportProviderClassName() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_ModelingAssistantProviderClassName() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_IconProviderClassName() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(20);
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
	public EAttribute getGenCommonBase_NotationViewFactoryClassName() {
		return (EAttribute)genCommonBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCommonBase_Viewmap() {
		return (EReference)genCommonBaseEClass.getEStructuralFeatures().get(4);
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
	public EReference getGenNode_Diagram() {
		return (EReference)genNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenNode_Labels() {
		return (EReference)genNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenNode_Compartments() {
		return (EReference)genNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNode_ChildContainersPlacement() {
		return (EAttribute)genNodeEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getGenCompartment_LayoutKind() {
		return (EAttribute)genCompartmentEClass.getEStructuralFeatures().get(4);
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
		return (EReference)genNodeEClass.getEStructuralFeatures().get(1);
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
	public EReference getGenChildNode_Container() {
		return (EReference)genChildNodeEClass.getEStructuralFeatures().get(0);
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
	public EClass getBasicNodeViewmap() {
		return basicNodeViewmapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicNodeViewmap_FigureQualifiedClassName() {
		return (EAttribute)basicNodeViewmapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecoratedConnectionViewmap() {
		return decoratedConnectionViewmapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecoratedConnectionViewmap_FigureQualifiedClassName() {
		return (EAttribute)decoratedConnectionViewmapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecoratedConnectionViewmap_Source() {
		return (EReference)decoratedConnectionViewmapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecoratedConnectionViewmap_Target() {
		return (EReference)decoratedConnectionViewmapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkDecoration() {
		return linkDecorationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDecoration_FigureQualifiedClassName() {
		return (EAttribute)linkDecorationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramViewmap() {
		return diagramViewmapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompartmentViewmap() {
		return compartmentViewmapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelViewmap() {
		return labelViewmapEClass;
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
	public EClass getModelElementSelector() {
		return modelElementSelectorEClass;
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
	public EAttribute getPalette_NeedZoomTools() {
		return (EAttribute)paletteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPalette_PackageName() {
		return (EAttribute)paletteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPalette_FactoryClassName() {
		return (EAttribute)paletteEClass.getEStructuralFeatures().get(5);
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
	public EEnum getCompartmentPlacementKind() {
		return compartmentPlacementKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompartmentLayoutKind() {
		return compartmentLayoutKindEEnum;
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
	public EDataType getStringArray() {
		return stringArrayEDataType;
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
		genDiagramEClass = createEClass(GEN_DIAGRAM);
		createEReference(genDiagramEClass, GEN_DIAGRAM__DOMAIN_META_MODEL);
		createEReference(genDiagramEClass, GEN_DIAGRAM__DOMAIN_DIAGRAM_ELEMENT);
		createEReference(genDiagramEClass, GEN_DIAGRAM__NODES);
		createEReference(genDiagramEClass, GEN_DIAGRAM__LINKS);
		createEReference(genDiagramEClass, GEN_DIAGRAM__PALETTE);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__EDIT_PARTS_PACKAGE_NAME);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__EDITOR_PACKAGE_NAME);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__PROVIDERS_PACKAGE_NAME);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__PLUGIN_ID);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__PLUGIN_NAME);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__PROVIDER_NAME);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__SAME_FILE_FOR_DIAGRAM_AND_MODEL);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__PRINTING_ENABLED);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__HAS_DOMAIN_MODEL);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__DIAGRAM_FILE_EXTENSION);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__EDIT_PART_FACTORY_CLASS_NAME);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__VIEW_PROVIDER_CLASS_NAME);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__EDIT_PART_PROVIDER_CLASS_NAME);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__METAMODEL_SUPPORT_PROVIDER_CLASS_NAME);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_CLASS_NAME);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__ICON_PROVIDER_CLASS_NAME);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__EDITOR_CLASS_NAME);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__DOCUMENT_PROVIDER_CLASS_NAME);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__ACTION_BAR_CONTRIBUTOR_CLASS_NAME);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__MATCHING_STRATEGY_CLASS_NAME);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__PLUGIN_CLASS_NAME);

		genCommonBaseEClass = createEClass(GEN_COMMON_BASE);
		createEReference(genCommonBaseEClass, GEN_COMMON_BASE__DIAGRAM_RUN_TIME_CLASS);
		createEAttribute(genCommonBaseEClass, GEN_COMMON_BASE__VISUAL_ID);
		createEAttribute(genCommonBaseEClass, GEN_COMMON_BASE__EDIT_PART_CLASS_NAME);
		createEAttribute(genCommonBaseEClass, GEN_COMMON_BASE__NOTATION_VIEW_FACTORY_CLASS_NAME);
		createEReference(genCommonBaseEClass, GEN_COMMON_BASE__VIEWMAP);

		genChildContainerEClass = createEClass(GEN_CHILD_CONTAINER);
		createEReference(genChildContainerEClass, GEN_CHILD_CONTAINER__CHILD_NODES);

		genNodeEClass = createEClass(GEN_NODE);
		createEReference(genNodeEClass, GEN_NODE__DIAGRAM);
		createEReference(genNodeEClass, GEN_NODE__MODEL_FACET);
		createEReference(genNodeEClass, GEN_NODE__LABELS);
		createEReference(genNodeEClass, GEN_NODE__COMPARTMENTS);
		createEAttribute(genNodeEClass, GEN_NODE__CHILD_CONTAINERS_PLACEMENT);

		genCompartmentEClass = createEClass(GEN_COMPARTMENT);
		createEAttribute(genCompartmentEClass, GEN_COMPARTMENT__TITLE);
		createEAttribute(genCompartmentEClass, GEN_COMPARTMENT__CAN_COLLAPSE);
		createEAttribute(genCompartmentEClass, GEN_COMPARTMENT__HIDE_IF_EMPTY);
		createEAttribute(genCompartmentEClass, GEN_COMPARTMENT__NEEDS_TITLE);
		createEAttribute(genCompartmentEClass, GEN_COMPARTMENT__LAYOUT_KIND);
		createEReference(genCompartmentEClass, GEN_COMPARTMENT__NODE);

		genChildNodeEClass = createEClass(GEN_CHILD_NODE);
		createEReference(genChildNodeEClass, GEN_CHILD_NODE__CONTAINER);

		genLinkEClass = createEClass(GEN_LINK);
		createEReference(genLinkEClass, GEN_LINK__DIAGRAM);
		createEReference(genLinkEClass, GEN_LINK__MODEL_FACET);
		createEReference(genLinkEClass, GEN_LINK__LABELS);

		genLabelEClass = createEClass(GEN_LABEL);
		createEAttribute(genLabelEClass, GEN_LABEL__READ_ONLY);
		createEReference(genLabelEClass, GEN_LABEL__MODEL_FACET);

		genNodeLabelEClass = createEClass(GEN_NODE_LABEL);
		createEReference(genNodeLabelEClass, GEN_NODE_LABEL__NODE);

		genLinkLabelEClass = createEClass(GEN_LINK_LABEL);
		createEReference(genLinkLabelEClass, GEN_LINK_LABEL__LINK);
		createEAttribute(genLinkLabelEClass, GEN_LINK_LABEL__ALIGNMENT);

		modelFacetEClass = createEClass(MODEL_FACET);

		linkModelFacetEClass = createEClass(LINK_MODEL_FACET);

		typeModelFacetEClass = createEClass(TYPE_MODEL_FACET);
		createEReference(typeModelFacetEClass, TYPE_MODEL_FACET__META_CLASS);
		createEReference(typeModelFacetEClass, TYPE_MODEL_FACET__CONTAINMENT_META_FEATURE);
		createEReference(typeModelFacetEClass, TYPE_MODEL_FACET__CHILD_META_FEATURE);
		createEReference(typeModelFacetEClass, TYPE_MODEL_FACET__MODEL_ELEMENT_SELECTOR);
		createEReference(typeModelFacetEClass, TYPE_MODEL_FACET__MODEL_ELEMENT_INITIALIZER);

		featureModelFacetEClass = createEClass(FEATURE_MODEL_FACET);
		createEReference(featureModelFacetEClass, FEATURE_MODEL_FACET__META_FEATURE);

		typeLinkModelFacetEClass = createEClass(TYPE_LINK_MODEL_FACET);
		createEReference(typeLinkModelFacetEClass, TYPE_LINK_MODEL_FACET__SOURCE_META_FEATURE);
		createEReference(typeLinkModelFacetEClass, TYPE_LINK_MODEL_FACET__TARGET_META_FEATURE);

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

		basicNodeViewmapEClass = createEClass(BASIC_NODE_VIEWMAP);
		createEAttribute(basicNodeViewmapEClass, BASIC_NODE_VIEWMAP__FIGURE_QUALIFIED_CLASS_NAME);

		decoratedConnectionViewmapEClass = createEClass(DECORATED_CONNECTION_VIEWMAP);
		createEAttribute(decoratedConnectionViewmapEClass, DECORATED_CONNECTION_VIEWMAP__FIGURE_QUALIFIED_CLASS_NAME);
		createEReference(decoratedConnectionViewmapEClass, DECORATED_CONNECTION_VIEWMAP__SOURCE);
		createEReference(decoratedConnectionViewmapEClass, DECORATED_CONNECTION_VIEWMAP__TARGET);

		linkDecorationEClass = createEClass(LINK_DECORATION);
		createEAttribute(linkDecorationEClass, LINK_DECORATION__FIGURE_QUALIFIED_CLASS_NAME);

		diagramViewmapEClass = createEClass(DIAGRAM_VIEWMAP);

		compartmentViewmapEClass = createEClass(COMPARTMENT_VIEWMAP);

		labelViewmapEClass = createEClass(LABEL_VIEWMAP);

		valueExpressionEClass = createEClass(VALUE_EXPRESSION);
		createEAttribute(valueExpressionEClass, VALUE_EXPRESSION__BODY);
		createEAttribute(valueExpressionEClass, VALUE_EXPRESSION__LANGUAGE);

		modelElementSelectorEClass = createEClass(MODEL_ELEMENT_SELECTOR);

		paletteEClass = createEClass(PALETTE);
		createEReference(paletteEClass, PALETTE__DIAGRAM);
		createEReference(paletteEClass, PALETTE__GROUPS);
		createEAttribute(paletteEClass, PALETTE__FLYOUT);
		createEAttribute(paletteEClass, PALETTE__NEED_ZOOM_TOOLS);
		createEAttribute(paletteEClass, PALETTE__PACKAGE_NAME);
		createEAttribute(paletteEClass, PALETTE__FACTORY_CLASS_NAME);

		entryBaseEClass = createEClass(ENTRY_BASE);
		createEAttribute(entryBaseEClass, ENTRY_BASE__ORDER);
		createEAttribute(entryBaseEClass, ENTRY_BASE__TITLE_KEY);
		createEAttribute(entryBaseEClass, ENTRY_BASE__DESCRIPTION_KEY);
		createEAttribute(entryBaseEClass, ENTRY_BASE__LARGE_ICON_PATH);
		createEAttribute(entryBaseEClass, ENTRY_BASE__SMALL_ICON_PATH);

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

		// Create enums
		compartmentPlacementKindEEnum = createEEnum(COMPARTMENT_PLACEMENT_KIND);
		compartmentLayoutKindEEnum = createEEnum(COMPARTMENT_LAYOUT_KIND);
		linkLabelAlignmentEEnum = createEEnum(LINK_LABEL_ALIGNMENT);

		// Create data types
		stringArrayEDataType = createEDataType(STRING_ARRAY);
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
		GenModelPackageImpl theGenModelPackage = (GenModelPackageImpl)EPackage.Registry.INSTANCE.getEPackage(GenModelPackage.eNS_URI);

		// Add supertypes to classes
		genDiagramEClass.getESuperTypes().add(this.getGenCommonBase());
		genChildContainerEClass.getESuperTypes().add(this.getGenCommonBase());
		genNodeEClass.getESuperTypes().add(this.getGenChildContainer());
		genCompartmentEClass.getESuperTypes().add(this.getGenChildContainer());
		genChildNodeEClass.getESuperTypes().add(this.getGenNode());
		genLinkEClass.getESuperTypes().add(this.getGenCommonBase());
		genLabelEClass.getESuperTypes().add(this.getGenCommonBase());
		genNodeLabelEClass.getESuperTypes().add(this.getGenLabel());
		genLinkLabelEClass.getESuperTypes().add(this.getGenLabel());
		linkModelFacetEClass.getESuperTypes().add(this.getModelFacet());
		typeModelFacetEClass.getESuperTypes().add(this.getModelFacet());
		featureModelFacetEClass.getESuperTypes().add(this.getModelFacet());
		featureModelFacetEClass.getESuperTypes().add(this.getLinkModelFacet());
		typeLinkModelFacetEClass.getESuperTypes().add(this.getTypeModelFacet());
		typeLinkModelFacetEClass.getESuperTypes().add(this.getLinkModelFacet());
		colorAttributesEClass.getESuperTypes().add(this.getAttributes());
		shapeAttributesEClass.getESuperTypes().add(this.getAttributes());
		defaultSizeAttributesEClass.getESuperTypes().add(this.getAttributes());
		basicNodeViewmapEClass.getESuperTypes().add(this.getViewmap());
		basicNodeViewmapEClass.getESuperTypes().add(this.getFigureViewmap());
		decoratedConnectionViewmapEClass.getESuperTypes().add(this.getViewmap());
		decoratedConnectionViewmapEClass.getESuperTypes().add(this.getFigureViewmap());
		diagramViewmapEClass.getESuperTypes().add(this.getViewmap());
		compartmentViewmapEClass.getESuperTypes().add(this.getViewmap());
		labelViewmapEClass.getESuperTypes().add(this.getViewmap());
		modelElementSelectorEClass.getESuperTypes().add(this.getValueExpression());
		toolEntryEClass.getESuperTypes().add(this.getEntryBase());
		nodeEntryEClass.getESuperTypes().add(this.getToolEntry());
		linkEntryEClass.getESuperTypes().add(this.getToolEntry());
		toolGroupEClass.getESuperTypes().add(this.getEntryBase());
		genFeatureSeqInitializerEClass.getESuperTypes().add(this.getGenElementInitializer());
		genFeatureValueSpecEClass.getESuperTypes().add(this.getValueExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(genDiagramEClass, GenDiagram.class, "GenDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenDiagram_DomainMetaModel(), theGenModelPackage.getGenPackage(), null, "domainMetaModel", null, 1, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenDiagram_DomainDiagramElement(), theGenModelPackage.getGenClass(), null, "domainDiagramElement", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenDiagram_Nodes(), this.getGenNode(), this.getGenNode_Diagram(), "nodes", null, 0, -1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenDiagram_Links(), this.getGenLink(), this.getGenLink_Diagram(), "links", null, 0, -1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenDiagram_Palette(), this.getPalette(), this.getPalette_Diagram(), "palette", null, 1, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_EditPartsPackageName(), ecorePackage.getEString(), "editPartsPackageName", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_EditorPackageName(), ecorePackage.getEString(), "editorPackageName", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_ProvidersPackageName(), ecorePackage.getEString(), "providersPackageName", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_PluginID(), ecorePackage.getEString(), "pluginID", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_PluginName(), ecorePackage.getEString(), "pluginName", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_ProviderName(), ecorePackage.getEString(), "providerName", "Sample Plugin Provider, Inc", 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_SameFileForDiagramAndModel(), ecorePackage.getEBoolean(), "sameFileForDiagramAndModel", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_PrintingEnabled(), ecorePackage.getEBoolean(), "printingEnabled", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_HasDomainModel(), ecorePackage.getEBoolean(), "hasDomainModel", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_DiagramFileExtension(), ecorePackage.getEString(), "diagramFileExtension", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_EditPartFactoryClassName(), ecorePackage.getEString(), "editPartFactoryClassName", "EditPartFactoryImpl", 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_ViewProviderClassName(), ecorePackage.getEString(), "viewProviderClassName", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_EditPartProviderClassName(), ecorePackage.getEString(), "editPartProviderClassName", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_MetamodelSupportProviderClassName(), ecorePackage.getEString(), "metamodelSupportProviderClassName", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_ModelingAssistantProviderClassName(), ecorePackage.getEString(), "modelingAssistantProviderClassName", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_IconProviderClassName(), ecorePackage.getEString(), "iconProviderClassName", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_InitDiagramFileActionClassName(), ecorePackage.getEString(), "initDiagramFileActionClassName", "InitDiagramFileAction", 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_EditorClassName(), ecorePackage.getEString(), "editorClassName", "DiagramEditor", 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_DocumentProviderClassName(), ecorePackage.getEString(), "documentProviderClassName", "DocumentProvider", 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_ActionBarContributorClassName(), ecorePackage.getEString(), "actionBarContributorClassName", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_MatchingStrategyClassName(), ecorePackage.getEString(), "matchingStrategyClassName", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_PluginClassName(), ecorePackage.getEString(), "pluginClassName", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genDiagramEClass, theGenModelPackage.getGenModel(), "getEMFGenModel");

		addEOperation(genDiagramEClass, this.getStringArray(), "getRequiredPluginIDs");

		addEOperation(genDiagramEClass, ecorePackage.getEString(), "getEditPartFactoryQualifiedClassName");

		addEOperation(genDiagramEClass, ecorePackage.getEString(), "getViewProviderQualifiedClassName");

		addEOperation(genDiagramEClass, ecorePackage.getEString(), "getEditPartProviderQualifiedClassName");

		addEOperation(genDiagramEClass, ecorePackage.getEString(), "getMetamodelSupportProviderQualifiedClassName");

		addEOperation(genDiagramEClass, ecorePackage.getEString(), "getModelingAssistantProviderQualifiedClassName");

		addEOperation(genDiagramEClass, ecorePackage.getEString(), "getIconProviderQualifiedClassName");

		addEOperation(genDiagramEClass, ecorePackage.getEString(), "getInitDiagramFileActionQualifiedClassName");

		addEOperation(genDiagramEClass, ecorePackage.getEString(), "getElementInitializersClassName");

		addEOperation(genDiagramEClass, ecorePackage.getEString(), "getElementInitializersPackageName");

		addEOperation(genDiagramEClass, ecorePackage.getEString(), "getEditorQualifiedClassName");

		addEOperation(genDiagramEClass, ecorePackage.getEString(), "getActionBarContributorQualifiedClassName");

		addEOperation(genDiagramEClass, ecorePackage.getEString(), "getMatchingStrategyQualifiedClassName");

		addEOperation(genDiagramEClass, ecorePackage.getEString(), "getPluginQualifiedClassName");

		initEClass(genCommonBaseEClass, GenCommonBase.class, "GenCommonBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenCommonBase_DiagramRunTimeClass(), theGenModelPackage.getGenClass(), null, "diagramRunTimeClass", null, 1, 1, GenCommonBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenCommonBase_VisualID(), ecorePackage.getEInt(), "visualID", null, 1, 1, GenCommonBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenCommonBase_EditPartClassName(), ecorePackage.getEString(), "editPartClassName", null, 0, 1, GenCommonBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenCommonBase_NotationViewFactoryClassName(), ecorePackage.getEString(), "notationViewFactoryClassName", null, 0, 1, GenCommonBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenCommonBase_Viewmap(), this.getViewmap(), null, "viewmap", null, 1, 1, GenCommonBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genCommonBaseEClass, ecorePackage.getEString(), "getEditPartQualifiedClassName");

		addEOperation(genCommonBaseEClass, ecorePackage.getEString(), "getNotationViewFactoryQualifiedClassName");

		addEOperation(genCommonBaseEClass, this.getGenDiagram(), "getDiagram");

		addEOperation(genCommonBaseEClass, ecorePackage.getEString(), "getClassNamePrefix");

		addEOperation(genCommonBaseEClass, ecorePackage.getEString(), "getClassNameSuffux");

		addEOperation(genCommonBaseEClass, ecorePackage.getEString(), "getUniqueIdentifier");

		initEClass(genChildContainerEClass, GenChildContainer.class, "GenChildContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenChildContainer_ChildNodes(), this.getGenChildNode(), this.getGenChildNode_Container(), "childNodes", null, 0, -1, GenChildContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genNodeEClass, GenNode.class, "GenNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenNode_Diagram(), this.getGenDiagram(), this.getGenDiagram_Nodes(), "diagram", null, 1, 1, GenNode.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenNode_ModelFacet(), this.getTypeModelFacet(), null, "modelFacet", null, 1, 1, GenNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenNode_Labels(), this.getGenNodeLabel(), this.getGenNodeLabel_Node(), "labels", null, 0, -1, GenNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenNode_Compartments(), this.getGenCompartment(), this.getGenCompartment_Node(), "compartments", null, 0, -1, GenNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenNode_ChildContainersPlacement(), this.getCompartmentPlacementKind(), "childContainersPlacement", "TOOLBAR", 0, 1, GenNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genNodeEClass, theGenModelPackage.getGenClass(), "getDomainMetaClass");

		initEClass(genCompartmentEClass, GenCompartment.class, "GenCompartment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenCompartment_Title(), ecorePackage.getEString(), "title", null, 0, 1, GenCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenCompartment_CanCollapse(), ecorePackage.getEBoolean(), "canCollapse", "true", 0, 1, GenCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenCompartment_HideIfEmpty(), ecorePackage.getEBoolean(), "hideIfEmpty", "true", 0, 1, GenCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenCompartment_NeedsTitle(), ecorePackage.getEBoolean(), "needsTitle", "true", 0, 1, GenCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenCompartment_LayoutKind(), this.getCompartmentLayoutKind(), "layoutKind", null, 0, 1, GenCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenCompartment_Node(), this.getGenNode(), this.getGenNode_Compartments(), "node", null, 1, 1, GenCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genChildNodeEClass, GenChildNode.class, "GenChildNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenChildNode_Container(), this.getGenChildContainer(), this.getGenChildContainer_ChildNodes(), "container", null, 1, 1, GenChildNode.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genLinkEClass, GenLink.class, "GenLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenLink_Diagram(), this.getGenDiagram(), this.getGenDiagram_Links(), "diagram", null, 1, 1, GenLink.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenLink_ModelFacet(), this.getLinkModelFacet(), null, "modelFacet", null, 1, 1, GenLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenLink_Labels(), this.getGenLinkLabel(), this.getGenLinkLabel_Link(), "labels", null, 0, -1, GenLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genLabelEClass, GenLabel.class, "GenLabel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenLabel_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", null, 0, 1, GenLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenLabel_ModelFacet(), this.getFeatureModelFacet(), null, "modelFacet", null, 1, 1, GenLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genLabelEClass, theGenModelPackage.getGenFeature(), "getMetaFeature");

		initEClass(genNodeLabelEClass, GenNodeLabel.class, "GenNodeLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenNodeLabel_Node(), this.getGenNode(), this.getGenNode_Labels(), "node", null, 1, 1, GenNodeLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genLinkLabelEClass, GenLinkLabel.class, "GenLinkLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenLinkLabel_Link(), this.getGenLink(), this.getGenLink_Labels(), "link", null, 1, 1, GenLinkLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenLinkLabel_Alignment(), this.getLinkLabelAlignment(), "alignment", "MIDDLE", 0, 1, GenLinkLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelFacetEClass, ModelFacet.class, "ModelFacet", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkModelFacetEClass, LinkModelFacet.class, "LinkModelFacet", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeModelFacetEClass, TypeModelFacet.class, "TypeModelFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeModelFacet_MetaClass(), theGenModelPackage.getGenClass(), null, "metaClass", null, 1, 1, TypeModelFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeModelFacet_ContainmentMetaFeature(), theGenModelPackage.getGenFeature(), null, "containmentMetaFeature", null, 1, 1, TypeModelFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeModelFacet_ChildMetaFeature(), theGenModelPackage.getGenFeature(), null, "childMetaFeature", null, 1, 1, TypeModelFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeModelFacet_ModelElementSelector(), this.getModelElementSelector(), null, "modelElementSelector", null, 0, 1, TypeModelFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeModelFacet_ModelElementInitializer(), this.getGenElementInitializer(), this.getGenElementInitializer_TypeModelFacet(), "modelElementInitializer", null, 0, 1, TypeModelFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureModelFacetEClass, FeatureModelFacet.class, "FeatureModelFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureModelFacet_MetaFeature(), theGenModelPackage.getGenFeature(), null, "metaFeature", null, 1, 1, FeatureModelFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeLinkModelFacetEClass, TypeLinkModelFacet.class, "TypeLinkModelFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeLinkModelFacet_SourceMetaFeature(), theGenModelPackage.getGenFeature(), null, "sourceMetaFeature", null, 1, 1, TypeLinkModelFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeLinkModelFacet_TargetMetaFeature(), theGenModelPackage.getGenFeature(), null, "targetMetaFeature", null, 1, 1, TypeLinkModelFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		EOperation op = addEOperation(viewmapEClass, this.getAttributes(), "find");
		addEParameter(op, ecorePackage.getEJavaClass(), "attributesClass");

		initEClass(figureViewmapEClass, FigureViewmap.class, "FigureViewmap", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(figureViewmapEClass, ecorePackage.getEString(), "getFigureQualifiedClassName");

		initEClass(basicNodeViewmapEClass, BasicNodeViewmap.class, "BasicNodeViewmap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicNodeViewmap_FigureQualifiedClassName(), ecorePackage.getEString(), "figureQualifiedClassName", "org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure", 0, 1, BasicNodeViewmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decoratedConnectionViewmapEClass, DecoratedConnectionViewmap.class, "DecoratedConnectionViewmap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecoratedConnectionViewmap_FigureQualifiedClassName(), ecorePackage.getEString(), "figureQualifiedClassName", "org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx", 0, 1, DecoratedConnectionViewmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecoratedConnectionViewmap_Source(), this.getLinkDecoration(), null, "source", null, 0, 1, DecoratedConnectionViewmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecoratedConnectionViewmap_Target(), this.getLinkDecoration(), null, "target", null, 0, 1, DecoratedConnectionViewmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkDecorationEClass, LinkDecoration.class, "LinkDecoration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkDecoration_FigureQualifiedClassName(), ecorePackage.getEString(), "figureQualifiedClassName", null, 0, 1, LinkDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramViewmapEClass, DiagramViewmap.class, "DiagramViewmap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compartmentViewmapEClass, CompartmentViewmap.class, "CompartmentViewmap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(labelViewmapEClass, LabelViewmap.class, "LabelViewmap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueExpressionEClass, ValueExpression.class, "ValueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueExpression_Body(), ecorePackage.getEString(), "body", null, 1, 1, ValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueExpression_Language(), ecorePackage.getEString(), "language", "ocl", 0, 1, ValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementSelectorEClass, ModelElementSelector.class, "ModelElementSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(modelElementSelectorEClass, this.getStringArray(), "getRequiredPluginIDs");

		initEClass(paletteEClass, Palette.class, "Palette", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPalette_Diagram(), this.getGenDiagram(), this.getGenDiagram_Palette(), "diagram", null, 1, 1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPalette_Groups(), this.getToolGroup(), this.getToolGroup_Palette(), "groups", null, 1, -1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPalette_Flyout(), ecorePackage.getEBoolean(), "flyout", null, 0, 1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPalette_NeedZoomTools(), ecorePackage.getEBoolean(), "needZoomTools", null, 0, 1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPalette_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPalette_FactoryClassName(), ecorePackage.getEString(), "factoryClassName", "PaletteFactory", 0, 1, Palette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(paletteEClass, ecorePackage.getEString(), "getFactoryQualifiedClassName");

		initEClass(entryBaseEClass, EntryBase.class, "EntryBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntryBase_Order(), ecorePackage.getEInt(), "order", null, 0, 1, EntryBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryBase_TitleKey(), ecorePackage.getEString(), "titleKey", null, 0, 1, EntryBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryBase_DescriptionKey(), ecorePackage.getEString(), "descriptionKey", null, 0, 1, EntryBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryBase_LargeIconPath(), ecorePackage.getEString(), "largeIconPath", null, 0, 1, EntryBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryBase_SmallIconPath(), ecorePackage.getEString(), "smallIconPath", null, 0, 1, EntryBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolEntryEClass, ToolEntry.class, "ToolEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToolEntry_Default(), ecorePackage.getEBoolean(), "default", "false", 0, 1, ToolEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEntryEClass, NodeEntry.class, "NodeEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeEntry_GenNode(), this.getGenNode(), null, "genNode", null, 1, 1, NodeEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeEntry_Group(), this.getToolGroup(), this.getToolGroup_NodeTools(), "group", null, 0, 1, NodeEntry.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEntryEClass, LinkEntry.class, "LinkEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkEntry_GenLink(), this.getGenLink(), null, "genLink", null, 1, 1, LinkEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkEntry_Group(), this.getToolGroup(), this.getToolGroup_LinkTools(), "group", null, 0, 1, LinkEntry.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolGroupEClass, ToolGroup.class, "ToolGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToolGroup_NodeTools(), this.getNodeEntry(), this.getNodeEntry_Group(), "nodeTools", null, 0, -1, ToolGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolGroup_LinkTools(), this.getLinkEntry(), this.getLinkEntry_Group(), "linkTools", null, 0, -1, ToolGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolGroup_Palette(), this.getPalette(), this.getPalette_Groups(), "palette", null, 1, 1, ToolGroup.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genElementInitializerEClass, GenElementInitializer.class, "GenElementInitializer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenElementInitializer_TypeModelFacet(), this.getTypeModelFacet(), this.getTypeModelFacet_ModelElementInitializer(), "typeModelFacet", null, 1, 1, GenElementInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genElementInitializerEClass, this.getStringArray(), "getRequiredPluginIDs");

		initEClass(genFeatureSeqInitializerEClass, GenFeatureSeqInitializer.class, "GenFeatureSeqInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenFeatureSeqInitializer_Initializers(), this.getGenFeatureValueSpec(), null, "initializers", null, 1, -1, GenFeatureSeqInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genFeatureSeqInitializerEClass, this.getStringArray(), "getRequiredPluginIDs");

		addEOperation(genFeatureSeqInitializerEClass, ecorePackage.getEString(), "getElementClassAccessorName");

		addEOperation(genFeatureSeqInitializerEClass, ecorePackage.getEString(), "getElementQualifiedPackageInterfaceName");

		initEClass(genFeatureValueSpecEClass, GenFeatureValueSpec.class, "GenFeatureValueSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenFeatureValueSpec_Feature(), theGenModelPackage.getGenFeature(), null, "feature", null, 1, 1, GenFeatureValueSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genFeatureValueSpecEClass, ecorePackage.getEString(), "getFeatureQualifiedPackageInterfaceName");

		// Initialize enums and add enum literals
		initEEnum(compartmentPlacementKindEEnum, CompartmentPlacementKind.class, "CompartmentPlacementKind");
		addEEnumLiteral(compartmentPlacementKindEEnum, CompartmentPlacementKind.FLOW_LITERAL);
		addEEnumLiteral(compartmentPlacementKindEEnum, CompartmentPlacementKind.TOOLBAR_LITERAL);

		initEEnum(compartmentLayoutKindEEnum, CompartmentLayoutKind.class, "CompartmentLayoutKind");
		addEEnumLiteral(compartmentLayoutKindEEnum, CompartmentLayoutKind.BORDER_LITERAL);
		addEEnumLiteral(compartmentLayoutKindEEnum, CompartmentLayoutKind.FLOW_LITERAL);
		addEEnumLiteral(compartmentLayoutKindEEnum, CompartmentLayoutKind.SCROLL_LITERAL);
		addEEnumLiteral(compartmentLayoutKindEEnum, CompartmentLayoutKind.TOOLBAR_LITERAL);
		addEEnumLiteral(compartmentLayoutKindEEnum, CompartmentLayoutKind.XY_LITERAL);

		initEEnum(linkLabelAlignmentEEnum, LinkLabelAlignment.class, "LinkLabelAlignment");
		addEEnumLiteral(linkLabelAlignmentEEnum, LinkLabelAlignment.MIDDLE_LITERAL);
		addEEnumLiteral(linkLabelAlignmentEEnum, LinkLabelAlignment.TARGET_LITERAL);
		addEEnumLiteral(linkLabelAlignmentEEnum, LinkLabelAlignment.SOURCE_LITERAL);

		// Initialize data types
		initEDataType(stringArrayEDataType, String[].class, "StringArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (genDiagramEClass, 
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
		  (genDiagramEClass, 
		   source, 
		   new String[] {
			 "ocl", "nodes->forAll(n : GenNode | self.links->forAll(l : GenLink | l.domainMetaClass <> n.domainMetaClass))"
		   });												
		addAnnotation
		  (genNodeEClass, 
		   source, 
		   new String[] {
			 "ocl", "super.domainNameFeature.eClass == domainMetaClass"
		   });			
		addAnnotation
		  (genNodeEClass, 
		   source, 
		   new String[] {
			 "ocl", "diagramRunTimeClass.eCoreClass.eAllSuperTypes->includes(diagramrt.DiagramNode)"
		   });														
		addAnnotation
		  (getTypeModelFacet_ContainmentMetaFeature(), 
		   source, 
		   new String[] {
			 "ocl", "containmentMetaFeature.isContainment"
		   });							
		addAnnotation
		  (getTypeLinkModelFacet_TargetMetaFeature(), 
		   source, 
		   new String[] {
			 "ocl", "targetMetaFeature.eContainingClass \'equals to\' or \'superclass of\' super.metaClass"
		   });																	
		addAnnotation
		  (genFeatureSeqInitializerEClass, 
		   source, 
		   new String[] {
			 "ocl", "initializers.feature.genClass.ecoreClass->asSet()->size() = 1 -- common ECore class"
		   });							
		addAnnotation
		  (genFeatureValueSpecEClass, 
		   source, 
		   new String[] {
			 "ocl", "self.feature.ecoreFeature.eType = self.body->evaluate().eType"
		   });		
	}

} //GMFGenPackageImpl
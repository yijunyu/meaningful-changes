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
import org.eclipse.gmf.codegen.gmfgen.CompartmentLayoutKind;
import org.eclipse.gmf.codegen.gmfgen.CompartmentPlacementKind;
import org.eclipse.gmf.codegen.gmfgen.EntryBase;
import org.eclipse.gmf.codegen.gmfgen.GMFGenFactory;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenBaseElement;
import org.eclipse.gmf.codegen.gmfgen.GenChildContainer;
import org.eclipse.gmf.codegen.gmfgen.GenChildNode;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenLinkReferenceOnly;
import org.eclipse.gmf.codegen.gmfgen.GenLinkWithClass;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.LinkEntry;
import org.eclipse.gmf.codegen.gmfgen.NodeEntry;
import org.eclipse.gmf.codegen.gmfgen.Palette;
import org.eclipse.gmf.codegen.gmfgen.ToolEntry;
import org.eclipse.gmf.codegen.gmfgen.ToolGroup;

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
	private EClass genBaseElementEClass = null;

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
	private EClass genLinkWithClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genLinkReferenceOnlyEClass = null;

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
	public EReference getGenDiagram_EmfGenModel() {
		return (EReference)genDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagram_DomainDiagramElement() {
		return (EReference)genDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagram_Nodes() {
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
	public EReference getGenDiagram_Palette() {
		return (EReference)genDiagramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_EditPartsPackageName() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_CommandsPackageName() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_EditProvidersPackageName() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(8);
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
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_PluginClassName() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_EditorPackageName() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_EditorClassName() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(14);
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
	public EAttribute getGenDiagram_MetaInfoFactoryClassName() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_HasDomainModel() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_DiagramFileExtension() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_SameFileForDiagramAndModel() {
		return (EAttribute)genDiagramEClass.getEStructuralFeatures().get(19);
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
	public EAttribute getGenCommonBase_MetaInfoProviderClassName() {
		return (EAttribute)genCommonBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenBaseElement() {
		return genBaseElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenBaseElement_DomainNameFeature() {
		return (EReference)genBaseElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenBaseElement_ForegroundColor() {
		return (EAttribute)genBaseElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenBaseElement_ContainmentMetaFeature() {
		return (EReference)genBaseElementEClass.getEStructuralFeatures().get(2);
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
	public EReference getGenNode_DomainMetaClass() {
		return (EReference)genNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNode_ViewmapURI() {
		return (EAttribute)genNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNode_NodeVisualizationKind() {
		return (EAttribute)genNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNode_ViewmapClass() {
		return (EAttribute)genNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNode_AffixedStereotypes() {
		return (EAttribute)genNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNode_BackgroundColor() {
		return (EAttribute)genNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenNode_ChildContainers() {
		return (EReference)genNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenNode_ChildNodes() {
		return (EReference)genNodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNode_ChildContainersPlacement() {
		return (EAttribute)genNodeEClass.getEStructuralFeatures().get(9);
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
	public EAttribute getGenChildNode_GroupID() {
		return (EAttribute)genChildNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenChildNode_ParentNode() {
		return (EReference)genChildNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenChildNode_ChildMetaFeature() {
		return (EReference)genChildNodeEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getGenChildContainer_GroupID() {
		return (EAttribute)genChildContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenChildContainer_TitleKey() {
		return (EAttribute)genChildContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenChildContainer_CanCollapse() {
		return (EAttribute)genChildContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenChildContainer_HideIfEmpty() {
		return (EAttribute)genChildContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenChildContainer_NeedsTitle() {
		return (EAttribute)genChildContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenChildContainer_LayoutKind() {
		return (EAttribute)genChildContainerEClass.getEStructuralFeatures().get(5);
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
	public EReference getGenLink_DomainLinkTargetFeature() {
		return (EReference)genLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenLink_LineStyle() {
		return (EAttribute)genLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenLink_FigureQualifiedClassName() {
		return (EAttribute)genLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenLink_SourceDecorationFigureQualifiedClassName() {
		return (EAttribute)genLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenLink_TargetDecorationFigureQualifiedClassName() {
		return (EAttribute)genLinkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenLinkWithClass() {
		return genLinkWithClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLinkWithClass_DomainMetaClass() {
		return (EReference)genLinkWithClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLinkWithClass_LinkContainerFeature() {
		return (EReference)genLinkWithClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenLinkReferenceOnly() {
		return genLinkReferenceOnlyEClass;
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
		createEReference(genDiagramEClass, GEN_DIAGRAM__EMF_GEN_MODEL);
		createEReference(genDiagramEClass, GEN_DIAGRAM__DOMAIN_DIAGRAM_ELEMENT);
		createEReference(genDiagramEClass, GEN_DIAGRAM__NODES);
		createEReference(genDiagramEClass, GEN_DIAGRAM__LINKS);
		createEReference(genDiagramEClass, GEN_DIAGRAM__PALETTE);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__EDIT_PARTS_PACKAGE_NAME);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__COMMANDS_PACKAGE_NAME);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__EDIT_PROVIDERS_PACKAGE_NAME);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__PLUGIN_NAME);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__PROVIDER_NAME);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__PLUGIN_ID);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__PLUGIN_CLASS_NAME);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__EDITOR_PACKAGE_NAME);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__EDITOR_CLASS_NAME);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__EDIT_PART_FACTORY_CLASS_NAME);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__META_INFO_FACTORY_CLASS_NAME);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__HAS_DOMAIN_MODEL);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__DIAGRAM_FILE_EXTENSION);
		createEAttribute(genDiagramEClass, GEN_DIAGRAM__SAME_FILE_FOR_DIAGRAM_AND_MODEL);

		genCommonBaseEClass = createEClass(GEN_COMMON_BASE);
		createEReference(genCommonBaseEClass, GEN_COMMON_BASE__DIAGRAM_RUN_TIME_CLASS);
		createEAttribute(genCommonBaseEClass, GEN_COMMON_BASE__VISUAL_ID);
		createEAttribute(genCommonBaseEClass, GEN_COMMON_BASE__EDIT_PART_CLASS_NAME);
		createEAttribute(genCommonBaseEClass, GEN_COMMON_BASE__META_INFO_PROVIDER_CLASS_NAME);

		genBaseElementEClass = createEClass(GEN_BASE_ELEMENT);
		createEReference(genBaseElementEClass, GEN_BASE_ELEMENT__DOMAIN_NAME_FEATURE);
		createEAttribute(genBaseElementEClass, GEN_BASE_ELEMENT__FOREGROUND_COLOR);
		createEReference(genBaseElementEClass, GEN_BASE_ELEMENT__CONTAINMENT_META_FEATURE);

		genNodeEClass = createEClass(GEN_NODE);
		createEReference(genNodeEClass, GEN_NODE__DIAGRAM);
		createEReference(genNodeEClass, GEN_NODE__DOMAIN_META_CLASS);
		createEAttribute(genNodeEClass, GEN_NODE__VIEWMAP_URI);
		createEAttribute(genNodeEClass, GEN_NODE__NODE_VISUALIZATION_KIND);
		createEAttribute(genNodeEClass, GEN_NODE__VIEWMAP_CLASS);
		createEAttribute(genNodeEClass, GEN_NODE__AFFIXED_STEREOTYPES);
		createEAttribute(genNodeEClass, GEN_NODE__BACKGROUND_COLOR);
		createEReference(genNodeEClass, GEN_NODE__CHILD_CONTAINERS);
		createEReference(genNodeEClass, GEN_NODE__CHILD_NODES);
		createEAttribute(genNodeEClass, GEN_NODE__CHILD_CONTAINERS_PLACEMENT);

		genChildNodeEClass = createEClass(GEN_CHILD_NODE);
		createEAttribute(genChildNodeEClass, GEN_CHILD_NODE__GROUP_ID);
		createEReference(genChildNodeEClass, GEN_CHILD_NODE__PARENT_NODE);
		createEReference(genChildNodeEClass, GEN_CHILD_NODE__CHILD_META_FEATURE);

		genChildContainerEClass = createEClass(GEN_CHILD_CONTAINER);
		createEAttribute(genChildContainerEClass, GEN_CHILD_CONTAINER__GROUP_ID);
		createEAttribute(genChildContainerEClass, GEN_CHILD_CONTAINER__TITLE_KEY);
		createEAttribute(genChildContainerEClass, GEN_CHILD_CONTAINER__CAN_COLLAPSE);
		createEAttribute(genChildContainerEClass, GEN_CHILD_CONTAINER__HIDE_IF_EMPTY);
		createEAttribute(genChildContainerEClass, GEN_CHILD_CONTAINER__NEEDS_TITLE);
		createEAttribute(genChildContainerEClass, GEN_CHILD_CONTAINER__LAYOUT_KIND);

		genLinkEClass = createEClass(GEN_LINK);
		createEReference(genLinkEClass, GEN_LINK__DIAGRAM);
		createEReference(genLinkEClass, GEN_LINK__DOMAIN_LINK_TARGET_FEATURE);
		createEAttribute(genLinkEClass, GEN_LINK__LINE_STYLE);
		createEAttribute(genLinkEClass, GEN_LINK__FIGURE_QUALIFIED_CLASS_NAME);
		createEAttribute(genLinkEClass, GEN_LINK__SOURCE_DECORATION_FIGURE_QUALIFIED_CLASS_NAME);
		createEAttribute(genLinkEClass, GEN_LINK__TARGET_DECORATION_FIGURE_QUALIFIED_CLASS_NAME);

		genLinkWithClassEClass = createEClass(GEN_LINK_WITH_CLASS);
		createEReference(genLinkWithClassEClass, GEN_LINK_WITH_CLASS__DOMAIN_META_CLASS);
		createEReference(genLinkWithClassEClass, GEN_LINK_WITH_CLASS__LINK_CONTAINER_FEATURE);

		genLinkReferenceOnlyEClass = createEClass(GEN_LINK_REFERENCE_ONLY);

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

		// Create enums
		compartmentPlacementKindEEnum = createEEnum(COMPARTMENT_PLACEMENT_KIND);
		compartmentLayoutKindEEnum = createEEnum(COMPARTMENT_LAYOUT_KIND);

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
		genBaseElementEClass.getESuperTypes().add(this.getGenCommonBase());
		genNodeEClass.getESuperTypes().add(this.getGenBaseElement());
		genChildNodeEClass.getESuperTypes().add(this.getGenNode());
		genLinkEClass.getESuperTypes().add(this.getGenBaseElement());
		genLinkWithClassEClass.getESuperTypes().add(this.getGenLink());
		genLinkReferenceOnlyEClass.getESuperTypes().add(this.getGenLink());
		toolEntryEClass.getESuperTypes().add(this.getEntryBase());
		nodeEntryEClass.getESuperTypes().add(this.getToolEntry());
		linkEntryEClass.getESuperTypes().add(this.getToolEntry());
		toolGroupEClass.getESuperTypes().add(this.getEntryBase());

		// Initialize classes and features; add operations and parameters
		initEClass(genDiagramEClass, GenDiagram.class, "GenDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenDiagram_DomainMetaModel(), ecorePackage.getEPackage(), null, "domainMetaModel", null, 1, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenDiagram_EmfGenModel(), theGenModelPackage.getGenModel(), null, "emfGenModel", null, 1, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenDiagram_DomainDiagramElement(), ecorePackage.getEClass(), null, "domainDiagramElement", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenDiagram_Nodes(), this.getGenNode(), this.getGenNode_Diagram(), "nodes", null, 0, -1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenDiagram_Links(), this.getGenLink(), this.getGenLink_Diagram(), "links", null, 0, -1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenDiagram_Palette(), this.getPalette(), this.getPalette_Diagram(), "palette", null, 1, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_EditPartsPackageName(), ecorePackage.getEString(), "editPartsPackageName", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_CommandsPackageName(), ecorePackage.getEString(), "commandsPackageName", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_EditProvidersPackageName(), ecorePackage.getEString(), "editProvidersPackageName", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_PluginName(), ecorePackage.getEString(), "pluginName", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_ProviderName(), ecorePackage.getEString(), "providerName", "Sample Plugin Provider, Inc", 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_PluginID(), ecorePackage.getEString(), "pluginID", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_PluginClassName(), ecorePackage.getEString(), "pluginClassName", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_EditorPackageName(), ecorePackage.getEString(), "editorPackageName", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_EditorClassName(), ecorePackage.getEString(), "editorClassName", "DiagramEditor", 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_EditPartFactoryClassName(), ecorePackage.getEString(), "editPartFactoryClassName", "EditPartFactoryImpl", 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_MetaInfoFactoryClassName(), ecorePackage.getEString(), "metaInfoFactoryClassName", "MetaInfoProviderAdapterFactory", 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_HasDomainModel(), ecorePackage.getEBoolean(), "hasDomainModel", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_DiagramFileExtension(), ecorePackage.getEString(), "diagramFileExtension", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDiagram_SameFileForDiagramAndModel(), ecorePackage.getEBoolean(), "sameFileForDiagramAndModel", null, 0, 1, GenDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genDiagramEClass, ecorePackage.getEString(), "getPluginQualifiedClassName");

		addEOperation(genDiagramEClass, ecorePackage.getEString(), "getEditorQualifiedClassName");

		addEOperation(genDiagramEClass, ecorePackage.getEString(), "getEditPartFactoryQualifiedClassName");

		addEOperation(genDiagramEClass, ecorePackage.getEString(), "getMetaInfoFactoryQualifiedClassName");

		EOperation op = addEOperation(genDiagramEClass, theGenModelPackage.getGenClass(), "findGenClass");
		addEParameter(op, ecorePackage.getEClass(), "domainMetaClass");

		op = addEOperation(genDiagramEClass, theGenModelPackage.getGenFeature(), "findGenFeature");
		addEParameter(op, ecorePackage.getEStructuralFeature(), "domainMetaFeature");

		addEOperation(genDiagramEClass, this.getStringArray(), "getRequiredPluginIDs");

		initEClass(genCommonBaseEClass, GenCommonBase.class, "GenCommonBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenCommonBase_DiagramRunTimeClass(), theGenModelPackage.getGenClass(), null, "diagramRunTimeClass", null, 1, 1, GenCommonBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenCommonBase_VisualID(), ecorePackage.getEInt(), "visualID", null, 1, 1, GenCommonBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenCommonBase_EditPartClassName(), ecorePackage.getEString(), "editPartClassName", null, 0, 1, GenCommonBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenCommonBase_MetaInfoProviderClassName(), ecorePackage.getEString(), "metaInfoProviderClassName", null, 0, 1, GenCommonBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genCommonBaseEClass, ecorePackage.getEString(), "getEditPartQualifiedClassName");

		addEOperation(genCommonBaseEClass, ecorePackage.getEString(), "getMetaInfoProviderQualifiedClassName");

		addEOperation(genCommonBaseEClass, this.getGenDiagram(), "getDiagram");

		addEOperation(genCommonBaseEClass, ecorePackage.getEString(), "getClassNamePrefix");

		addEOperation(genCommonBaseEClass, ecorePackage.getEString(), "getClassNameSuffux");

		initEClass(genBaseElementEClass, GenBaseElement.class, "GenBaseElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenBaseElement_DomainNameFeature(), ecorePackage.getEAttribute(), null, "domainNameFeature", null, 0, 1, GenBaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenBaseElement_ForegroundColor(), ecorePackage.getEString(), "foregroundColor", null, 0, 1, GenBaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenBaseElement_ContainmentMetaFeature(), ecorePackage.getEReference(), null, "containmentMetaFeature", null, 0, 1, GenBaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(genBaseElementEClass, ecorePackage.getEBoolean(), "hasNameToEdit");

		initEClass(genNodeEClass, GenNode.class, "GenNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenNode_Diagram(), this.getGenDiagram(), this.getGenDiagram_Nodes(), "diagram", null, 1, 1, GenNode.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenNode_DomainMetaClass(), ecorePackage.getEClass(), null, "domainMetaClass", null, 1, 1, GenNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenNode_ViewmapURI(), ecorePackage.getEString(), "viewmapURI", null, 0, 1, GenNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenNode_NodeVisualizationKind(), ecorePackage.getEInt(), "nodeVisualizationKind", "1", 0, 1, GenNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenNode_ViewmapClass(), ecorePackage.getEString(), "viewmapClass", "org.eclipse.gmf.editor.viewmaps.SVGViewMap", 0, 1, GenNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenNode_AffixedStereotypes(), ecorePackage.getEString(), "affixedStereotypes", null, 0, -1, GenNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenNode_BackgroundColor(), ecorePackage.getEString(), "backgroundColor", null, 0, 1, GenNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenNode_ChildContainers(), this.getGenChildContainer(), null, "childContainers", null, 0, -1, GenNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenNode_ChildNodes(), this.getGenChildNode(), this.getGenChildNode_ParentNode(), "childNodes", null, 0, -1, GenNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenNode_ChildContainersPlacement(), this.getCompartmentPlacementKind(), "childContainersPlacement", "TOOLBAR", 0, 1, GenNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(genNodeEClass, null, "initialize");
		addEParameter(op, ecorePackage.getEClass(), "eClass");

		initEClass(genChildNodeEClass, GenChildNode.class, "GenChildNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenChildNode_GroupID(), ecorePackage.getEString(), "groupID", null, 0, 1, GenChildNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenChildNode_ParentNode(), this.getGenNode(), this.getGenNode_ChildNodes(), "parentNode", null, 1, 1, GenChildNode.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenChildNode_ChildMetaFeature(), ecorePackage.getEReference(), null, "childMetaFeature", null, 1, 1, GenChildNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genChildContainerEClass, GenChildContainer.class, "GenChildContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenChildContainer_GroupID(), ecorePackage.getEString(), "groupID", null, 0, 1, GenChildContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenChildContainer_TitleKey(), ecorePackage.getEString(), "titleKey", null, 0, 1, GenChildContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenChildContainer_CanCollapse(), ecorePackage.getEBoolean(), "canCollapse", "true", 0, 1, GenChildContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenChildContainer_HideIfEmpty(), ecorePackage.getEBoolean(), "hideIfEmpty", "true", 0, 1, GenChildContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenChildContainer_NeedsTitle(), ecorePackage.getEBoolean(), "needsTitle", "true", 0, 1, GenChildContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenChildContainer_LayoutKind(), this.getCompartmentLayoutKind(), "layoutKind", null, 0, 1, GenChildContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genLinkEClass, GenLink.class, "GenLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenLink_Diagram(), this.getGenDiagram(), this.getGenDiagram_Links(), "diagram", null, 1, 1, GenLink.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenLink_DomainLinkTargetFeature(), ecorePackage.getEStructuralFeature(), null, "domainLinkTargetFeature", null, 1, 1, GenLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenLink_LineStyle(), ecorePackage.getEString(), "lineStyle", null, 0, 1, GenLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenLink_FigureQualifiedClassName(), ecorePackage.getEString(), "figureQualifiedClassName", "org.eclipse.draw2d.PolylineConnection", 0, 1, GenLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenLink_SourceDecorationFigureQualifiedClassName(), ecorePackage.getEString(), "sourceDecorationFigureQualifiedClassName", null, 0, 1, GenLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenLink_TargetDecorationFigureQualifiedClassName(), ecorePackage.getEString(), "targetDecorationFigureQualifiedClassName", null, 0, 1, GenLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genLinkWithClassEClass, GenLinkWithClass.class, "GenLinkWithClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenLinkWithClass_DomainMetaClass(), ecorePackage.getEClass(), null, "domainMetaClass", null, 1, 1, GenLinkWithClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenLinkWithClass_LinkContainerFeature(), ecorePackage.getEStructuralFeature(), null, "linkContainerFeature", null, 1, 1, GenLinkWithClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(genLinkWithClassEClass, null, "initialize");
		addEParameter(op, ecorePackage.getEClass(), "eClass");

		initEClass(genLinkReferenceOnlyEClass, GenLinkReferenceOnly.class, "GenLinkReferenceOnly", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(genLinkReferenceOnlyEClass, null, "initialize");
		addEParameter(op, ecorePackage.getEStructuralFeature(), "eFeature");

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
		  (getGenBaseElement_ContainmentMetaFeature(), 
		   source, 
		   new String[] {
			 "ocl", "containmentFeature.isContainment"
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
		  (getGenLinkWithClass_DomainMetaClass(), 
		   source, 
		   new String[] {
			 "ocl", "super.domainLinkTargetFeature.eContainingClass \'equals to\' or \'superclass of\' domainMetaClass"
		   });			
	}

} //GMFGenPackageImpl
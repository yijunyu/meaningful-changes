/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.gmfgraph.GMFGraphFactory
 * @model kind="package"
 * @generated
 */
public interface GMFGraphPackage extends EPackage{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gmfgraph";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/gmf/2005/GraphicalDefinition";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gmfgraph";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GMFGraphPackage eINSTANCE = org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.Identity <em>Identity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.Identity
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getIdentity()
	 * @generated
	 */
	int IDENTITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__NAME = 0;

	/**
	 * The number of structural features of the the '<em>Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.CanvasImpl <em>Canvas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.CanvasImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getCanvas()
	 * @generated
	 */
	int CANVAS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__NAME = IDENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Figures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__FIGURES = IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__NODES = IDENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__CONNECTIONS = IDENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compartments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__COMPARTMENTS = IDENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__CHILDREN = IDENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the the '<em>Canvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_FEATURE_COUNT = IDENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.FigureGalleryImpl <em>Figure Gallery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.FigureGalleryImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getFigureGallery()
	 * @generated
	 */
	int FIGURE_GALLERY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_GALLERY__NAME = IDENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Figures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_GALLERY__FIGURES = IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Impl Bundles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_GALLERY__IMPL_BUNDLES = IDENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Figure Gallery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_GALLERY_FEATURE_COUNT = IDENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.DiagramElementImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getDiagramElement()
	 * @generated
	 */
	int DIAGRAM_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__NAME = IDENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Figure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__FIGURE = IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__FACETS = IDENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_FEATURE_COUNT = IDENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.NodeImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = DIAGRAM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Figure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FIGURE = DIAGRAM_ELEMENT__FIGURE;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FACETS = DIAGRAM_ELEMENT__FACETS;

	/**
	 * The feature id for the '<em><b>Resize Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__RESIZE_CONSTRAINT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.ConnectionImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = DIAGRAM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Figure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__FIGURE = DIAGRAM_ELEMENT__FIGURE;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__FACETS = DIAGRAM_ELEMENT__FACETS;

	/**
	 * The number of structural features of the the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.CompartmentImpl <em>Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.CompartmentImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getCompartment()
	 * @generated
	 */
	int COMPARTMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__NAME = DIAGRAM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Figure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__FIGURE = DIAGRAM_ELEMENT__FIGURE;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__FACETS = DIAGRAM_ELEMENT__FACETS;

	/**
	 * The feature id for the '<em><b>Collapsible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__COLLAPSIBLE = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Needs Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__NEEDS_TITLE = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.ChildImpl <em>Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.ChildImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getChild()
	 * @generated
	 */
	int CHILD = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__NAME = DIAGRAM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Figure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__FIGURE = DIAGRAM_ELEMENT__FIGURE;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__FACETS = DIAGRAM_ELEMENT__FACETS;

	/**
	 * The number of structural features of the the '<em>Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.VisualFacet <em>Visual Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.VisualFacet
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getVisualFacet()
	 * @generated
	 */
	int VISUAL_FACET = 8;

	/**
	 * The number of structural features of the the '<em>Visual Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_FACET_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.GeneralFacetImpl <em>General Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.GeneralFacetImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getGeneralFacet()
	 * @generated
	 */
	int GENERAL_FACET = 9;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_FACET__IDENTIFIER = VISUAL_FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_FACET__DATA = VISUAL_FACET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>General Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_FACET_FEATURE_COUNT = VISUAL_FACET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.GradientFacetImpl <em>Gradient Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.GradientFacetImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getGradientFacet()
	 * @generated
	 */
	int GRADIENT_FACET = 10;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_FACET__DIRECTION = VISUAL_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Gradient Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_FACET_FEATURE_COUNT = VISUAL_FACET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.FigureMarker <em>Figure Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.FigureMarker
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getFigureMarker()
	 * @generated
	 */
	int FIGURE_MARKER = 11;

	/**
	 * The number of structural features of the the '<em>Figure Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_MARKER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.Figure <em>Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.Figure
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getFigure()
	 * @generated
	 */
	int FIGURE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__NAME = FIGURE_MARKER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__CHILDREN = FIGURE_MARKER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__PARENT = FIGURE_MARKER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Color Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__COLOR_STYLE = FIGURE_MARKER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__SIZE_STYLE = FIGURE_MARKER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__FONT_STYLE = FIGURE_MARKER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__LOCATION = FIGURE_MARKER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__SIZE = FIGURE_MARKER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Layout Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__LAYOUT_MANAGER = FIGURE_MARKER_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the the '<em>Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_FEATURE_COUNT = FIGURE_MARKER_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.FigureRefImpl <em>Figure Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.FigureRefImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getFigureRef()
	 * @generated
	 */
	int FIGURE_REF = 13;

	/**
	 * The feature id for the '<em><b>Figure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_REF__FIGURE = FIGURE_MARKER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Figure Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_REF_FEATURE_COUNT = FIGURE_MARKER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.ConnectionFigure <em>Connection Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.ConnectionFigure
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getConnectionFigure()
	 * @generated
	 */
	int CONNECTION_FIGURE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__NAME = FIGURE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__CHILDREN = FIGURE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__PARENT = FIGURE__PARENT;

	/**
	 * The feature id for the '<em><b>Color Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__COLOR_STYLE = FIGURE__COLOR_STYLE;

	/**
	 * The feature id for the '<em><b>Size Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__SIZE_STYLE = FIGURE__SIZE_STYLE;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__FONT_STYLE = FIGURE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__LOCATION = FIGURE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__SIZE = FIGURE__SIZE;

	/**
	 * The feature id for the '<em><b>Layout Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__LAYOUT_MANAGER = FIGURE__LAYOUT_MANAGER;

	/**
	 * The number of structural features of the the '<em>Connection Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE_FEATURE_COUNT = FIGURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.DecorationFigure <em>Decoration Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.DecorationFigure
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getDecorationFigure()
	 * @generated
	 */
	int DECORATION_FIGURE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__NAME = FIGURE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__CHILDREN = FIGURE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__PARENT = FIGURE__PARENT;

	/**
	 * The feature id for the '<em><b>Color Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__COLOR_STYLE = FIGURE__COLOR_STYLE;

	/**
	 * The feature id for the '<em><b>Size Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__SIZE_STYLE = FIGURE__SIZE_STYLE;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__FONT_STYLE = FIGURE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__LOCATION = FIGURE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__SIZE = FIGURE__SIZE;

	/**
	 * The feature id for the '<em><b>Layout Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__LAYOUT_MANAGER = FIGURE__LAYOUT_MANAGER;

	/**
	 * The number of structural features of the the '<em>Decoration Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE_FEATURE_COUNT = FIGURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.ShapeImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__NAME = FIGURE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__CHILDREN = FIGURE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__PARENT = FIGURE__PARENT;

	/**
	 * The feature id for the '<em><b>Color Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__COLOR_STYLE = FIGURE__COLOR_STYLE;

	/**
	 * The feature id for the '<em><b>Size Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__SIZE_STYLE = FIGURE__SIZE_STYLE;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FONT_STYLE = FIGURE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LOCATION = FIGURE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__SIZE = FIGURE__SIZE;

	/**
	 * The feature id for the '<em><b>Layout Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LAYOUT_MANAGER = FIGURE__LAYOUT_MANAGER;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__OUTLINE = FIGURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FILL = FIGURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LINE_WIDTH = FIGURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Line Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LINE_KIND = FIGURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = FIGURE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.LabelImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NAME = FIGURE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__CHILDREN = FIGURE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__PARENT = FIGURE__PARENT;

	/**
	 * The feature id for the '<em><b>Color Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__COLOR_STYLE = FIGURE__COLOR_STYLE;

	/**
	 * The feature id for the '<em><b>Size Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__SIZE_STYLE = FIGURE__SIZE_STYLE;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FONT_STYLE = FIGURE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__LOCATION = FIGURE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__SIZE = FIGURE__SIZE;

	/**
	 * The feature id for the '<em><b>Layout Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__LAYOUT_MANAGER = FIGURE__LAYOUT_MANAGER;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT = FIGURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = FIGURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.LabeledContainerImpl <em>Labeled Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.LabeledContainerImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getLabeledContainer()
	 * @generated
	 */
	int LABELED_CONTAINER = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__NAME = FIGURE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__CHILDREN = FIGURE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__PARENT = FIGURE__PARENT;

	/**
	 * The feature id for the '<em><b>Color Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__COLOR_STYLE = FIGURE__COLOR_STYLE;

	/**
	 * The feature id for the '<em><b>Size Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__SIZE_STYLE = FIGURE__SIZE_STYLE;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__FONT_STYLE = FIGURE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__LOCATION = FIGURE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__SIZE = FIGURE__SIZE;

	/**
	 * The feature id for the '<em><b>Layout Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__LAYOUT_MANAGER = FIGURE__LAYOUT_MANAGER;

	/**
	 * The number of structural features of the the '<em>Labeled Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER_FEATURE_COUNT = FIGURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.RectangleImpl <em>Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.RectangleImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__NAME = SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__CHILDREN = SHAPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__PARENT = SHAPE__PARENT;

	/**
	 * The feature id for the '<em><b>Color Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__COLOR_STYLE = SHAPE__COLOR_STYLE;

	/**
	 * The feature id for the '<em><b>Size Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__SIZE_STYLE = SHAPE__SIZE_STYLE;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__FONT_STYLE = SHAPE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__LOCATION = SHAPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__SIZE = SHAPE__SIZE;

	/**
	 * The feature id for the '<em><b>Layout Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__LAYOUT_MANAGER = SHAPE__LAYOUT_MANAGER;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__OUTLINE = SHAPE__OUTLINE;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__FILL = SHAPE__FILL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__LINE_WIDTH = SHAPE__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__LINE_KIND = SHAPE__LINE_KIND;

	/**
	 * The number of structural features of the the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.RoundedRectangleImpl <em>Rounded Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.RoundedRectangleImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getRoundedRectangle()
	 * @generated
	 */
	int ROUNDED_RECTANGLE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__NAME = SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__CHILDREN = SHAPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__PARENT = SHAPE__PARENT;

	/**
	 * The feature id for the '<em><b>Color Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__COLOR_STYLE = SHAPE__COLOR_STYLE;

	/**
	 * The feature id for the '<em><b>Size Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__SIZE_STYLE = SHAPE__SIZE_STYLE;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__FONT_STYLE = SHAPE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__LOCATION = SHAPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__SIZE = SHAPE__SIZE;

	/**
	 * The feature id for the '<em><b>Layout Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__LAYOUT_MANAGER = SHAPE__LAYOUT_MANAGER;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__OUTLINE = SHAPE__OUTLINE;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__FILL = SHAPE__FILL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__LINE_WIDTH = SHAPE__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__LINE_KIND = SHAPE__LINE_KIND;

	/**
	 * The feature id for the '<em><b>Corner Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__CORNER_WIDTH = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Corner Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__CORNER_HEIGHT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Rounded Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.EllipseImpl <em>Ellipse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.EllipseImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getEllipse()
	 * @generated
	 */
	int ELLIPSE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__NAME = SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__CHILDREN = SHAPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__PARENT = SHAPE__PARENT;

	/**
	 * The feature id for the '<em><b>Color Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__COLOR_STYLE = SHAPE__COLOR_STYLE;

	/**
	 * The feature id for the '<em><b>Size Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__SIZE_STYLE = SHAPE__SIZE_STYLE;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__FONT_STYLE = SHAPE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__LOCATION = SHAPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__SIZE = SHAPE__SIZE;

	/**
	 * The feature id for the '<em><b>Layout Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__LAYOUT_MANAGER = SHAPE__LAYOUT_MANAGER;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__OUTLINE = SHAPE__OUTLINE;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__FILL = SHAPE__FILL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__LINE_WIDTH = SHAPE__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__LINE_KIND = SHAPE__LINE_KIND;

	/**
	 * The number of structural features of the the '<em>Ellipse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.PolylineImpl <em>Polyline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.PolylineImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getPolyline()
	 * @generated
	 */
	int POLYLINE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__NAME = SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__CHILDREN = SHAPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__PARENT = SHAPE__PARENT;

	/**
	 * The feature id for the '<em><b>Color Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__COLOR_STYLE = SHAPE__COLOR_STYLE;

	/**
	 * The feature id for the '<em><b>Size Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__SIZE_STYLE = SHAPE__SIZE_STYLE;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__FONT_STYLE = SHAPE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__LOCATION = SHAPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__SIZE = SHAPE__SIZE;

	/**
	 * The feature id for the '<em><b>Layout Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__LAYOUT_MANAGER = SHAPE__LAYOUT_MANAGER;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__OUTLINE = SHAPE__OUTLINE;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__FILL = SHAPE__FILL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__LINE_WIDTH = SHAPE__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__LINE_KIND = SHAPE__LINE_KIND;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__TEMPLATE = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Polyline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.PolygonImpl <em>Polygon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.PolygonImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getPolygon()
	 * @generated
	 */
	int POLYGON = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__NAME = POLYLINE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__CHILDREN = POLYLINE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__PARENT = POLYLINE__PARENT;

	/**
	 * The feature id for the '<em><b>Color Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__COLOR_STYLE = POLYLINE__COLOR_STYLE;

	/**
	 * The feature id for the '<em><b>Size Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__SIZE_STYLE = POLYLINE__SIZE_STYLE;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__FONT_STYLE = POLYLINE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__LOCATION = POLYLINE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__SIZE = POLYLINE__SIZE;

	/**
	 * The feature id for the '<em><b>Layout Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__LAYOUT_MANAGER = POLYLINE__LAYOUT_MANAGER;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__OUTLINE = POLYLINE__OUTLINE;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__FILL = POLYLINE__FILL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__LINE_WIDTH = POLYLINE__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__LINE_KIND = POLYLINE__LINE_KIND;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__TEMPLATE = POLYLINE__TEMPLATE;

	/**
	 * The number of structural features of the the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FEATURE_COUNT = POLYLINE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.PolylineConnectionImpl <em>Polyline Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.PolylineConnectionImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getPolylineConnection()
	 * @generated
	 */
	int POLYLINE_CONNECTION = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__NAME = POLYLINE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__CHILDREN = POLYLINE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__PARENT = POLYLINE__PARENT;

	/**
	 * The feature id for the '<em><b>Color Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__COLOR_STYLE = POLYLINE__COLOR_STYLE;

	/**
	 * The feature id for the '<em><b>Size Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__SIZE_STYLE = POLYLINE__SIZE_STYLE;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__FONT_STYLE = POLYLINE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__LOCATION = POLYLINE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__SIZE = POLYLINE__SIZE;

	/**
	 * The feature id for the '<em><b>Layout Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__LAYOUT_MANAGER = POLYLINE__LAYOUT_MANAGER;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__OUTLINE = POLYLINE__OUTLINE;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__FILL = POLYLINE__FILL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__LINE_WIDTH = POLYLINE__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__LINE_KIND = POLYLINE__LINE_KIND;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__TEMPLATE = POLYLINE__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Source Decoration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__SOURCE_DECORATION = POLYLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Decoration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__TARGET_DECORATION = POLYLINE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Polyline Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION_FEATURE_COUNT = POLYLINE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.PolylineDecorationImpl <em>Polyline Decoration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.PolylineDecorationImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getPolylineDecoration()
	 * @generated
	 */
	int POLYLINE_DECORATION = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__NAME = POLYLINE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__CHILDREN = POLYLINE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__PARENT = POLYLINE__PARENT;

	/**
	 * The feature id for the '<em><b>Color Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__COLOR_STYLE = POLYLINE__COLOR_STYLE;

	/**
	 * The feature id for the '<em><b>Size Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__SIZE_STYLE = POLYLINE__SIZE_STYLE;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__FONT_STYLE = POLYLINE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__LOCATION = POLYLINE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__SIZE = POLYLINE__SIZE;

	/**
	 * The feature id for the '<em><b>Layout Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__LAYOUT_MANAGER = POLYLINE__LAYOUT_MANAGER;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__OUTLINE = POLYLINE__OUTLINE;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__FILL = POLYLINE__FILL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__LINE_WIDTH = POLYLINE__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__LINE_KIND = POLYLINE__LINE_KIND;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__TEMPLATE = POLYLINE__TEMPLATE;

	/**
	 * The number of structural features of the the '<em>Polyline Decoration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION_FEATURE_COUNT = POLYLINE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.PolygonDecorationImpl <em>Polygon Decoration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.PolygonDecorationImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getPolygonDecoration()
	 * @generated
	 */
	int POLYGON_DECORATION = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__NAME = POLYGON__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__CHILDREN = POLYGON__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__PARENT = POLYGON__PARENT;

	/**
	 * The feature id for the '<em><b>Color Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__COLOR_STYLE = POLYGON__COLOR_STYLE;

	/**
	 * The feature id for the '<em><b>Size Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__SIZE_STYLE = POLYGON__SIZE_STYLE;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__FONT_STYLE = POLYGON__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__LOCATION = POLYGON__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__SIZE = POLYGON__SIZE;

	/**
	 * The feature id for the '<em><b>Layout Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__LAYOUT_MANAGER = POLYGON__LAYOUT_MANAGER;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__OUTLINE = POLYGON__OUTLINE;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__FILL = POLYGON__FILL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__LINE_WIDTH = POLYGON__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__LINE_KIND = POLYGON__LINE_KIND;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__TEMPLATE = POLYGON__TEMPLATE;

	/**
	 * The number of structural features of the the '<em>Polygon Decoration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION_FEATURE_COUNT = POLYGON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl <em>Custom Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getCustomFigure()
	 * @generated
	 */
	int CUSTOM_FIGURE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__NAME = FIGURE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__CHILDREN = FIGURE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__PARENT = FIGURE__PARENT;

	/**
	 * The feature id for the '<em><b>Color Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__COLOR_STYLE = FIGURE__COLOR_STYLE;

	/**
	 * The feature id for the '<em><b>Size Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__SIZE_STYLE = FIGURE__SIZE_STYLE;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__FONT_STYLE = FIGURE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__LOCATION = FIGURE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__SIZE = FIGURE__SIZE;

	/**
	 * The feature id for the '<em><b>Layout Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__LAYOUT_MANAGER = FIGURE__LAYOUT_MANAGER;

	/**
	 * The feature id for the '<em><b>Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__QUALIFIED_CLASS_NAME = FIGURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bundle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__BUNDLE_NAME = FIGURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Custom Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE_FEATURE_COUNT = FIGURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.CustomDecorationImpl <em>Custom Decoration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.CustomDecorationImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getCustomDecoration()
	 * @generated
	 */
	int CUSTOM_DECORATION = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__NAME = CUSTOM_FIGURE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__CHILDREN = CUSTOM_FIGURE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__PARENT = CUSTOM_FIGURE__PARENT;

	/**
	 * The feature id for the '<em><b>Color Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__COLOR_STYLE = CUSTOM_FIGURE__COLOR_STYLE;

	/**
	 * The feature id for the '<em><b>Size Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__SIZE_STYLE = CUSTOM_FIGURE__SIZE_STYLE;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__FONT_STYLE = CUSTOM_FIGURE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__LOCATION = CUSTOM_FIGURE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__SIZE = CUSTOM_FIGURE__SIZE;

	/**
	 * The feature id for the '<em><b>Layout Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__LAYOUT_MANAGER = CUSTOM_FIGURE__LAYOUT_MANAGER;

	/**
	 * The feature id for the '<em><b>Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__QUALIFIED_CLASS_NAME = CUSTOM_FIGURE__QUALIFIED_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Bundle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__BUNDLE_NAME = CUSTOM_FIGURE__BUNDLE_NAME;

	/**
	 * The number of structural features of the the '<em>Custom Decoration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION_FEATURE_COUNT = CUSTOM_FIGURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.CustomConnectionImpl <em>Custom Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.CustomConnectionImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getCustomConnection()
	 * @generated
	 */
	int CUSTOM_CONNECTION = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__NAME = CUSTOM_FIGURE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__CHILDREN = CUSTOM_FIGURE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__PARENT = CUSTOM_FIGURE__PARENT;

	/**
	 * The feature id for the '<em><b>Color Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__COLOR_STYLE = CUSTOM_FIGURE__COLOR_STYLE;

	/**
	 * The feature id for the '<em><b>Size Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__SIZE_STYLE = CUSTOM_FIGURE__SIZE_STYLE;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__FONT_STYLE = CUSTOM_FIGURE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__LOCATION = CUSTOM_FIGURE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__SIZE = CUSTOM_FIGURE__SIZE;

	/**
	 * The feature id for the '<em><b>Layout Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__LAYOUT_MANAGER = CUSTOM_FIGURE__LAYOUT_MANAGER;

	/**
	 * The feature id for the '<em><b>Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__QUALIFIED_CLASS_NAME = CUSTOM_FIGURE__QUALIFIED_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Bundle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__BUNDLE_NAME = CUSTOM_FIGURE__BUNDLE_NAME;

	/**
	 * The number of structural features of the the '<em>Custom Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION_FEATURE_COUNT = CUSTOM_FIGURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.ColorStyleImpl <em>Color Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.ColorStyleImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getColorStyle()
	 * @generated
	 */
	int COLOR_STYLE = 30;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_STYLE__FOREGROUND_COLOR = 0;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_STYLE__BACKGROUND_COLOR = 1;

	/**
	 * The number of structural features of the the '<em>Color Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_STYLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.SizeStyleImpl <em>Size Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.SizeStyleImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getSizeStyle()
	 * @generated
	 */
	int SIZE_STYLE = 31;

	/**
	 * The feature id for the '<em><b>Max Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_STYLE__MAX_SIZE = 0;

	/**
	 * The feature id for the '<em><b>Min Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_STYLE__MIN_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Pref Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_STYLE__PREF_SIZE = 2;

	/**
	 * The number of structural features of the the '<em>Size Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_STYLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.FontStyleImpl <em>Font Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.FontStyleImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getFontStyle()
	 * @generated
	 */
	int FONT_STYLE = 32;

	/**
	 * The feature id for the '<em><b>Face Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_STYLE__FACE_NAME = 0;

	/**
	 * The number of structural features of the the '<em>Font Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_STYLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.PointImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 33;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Y = 1;

	/**
	 * The number of structural features of the the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.Direction
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 34;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.LineKind <em>Line Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.LineKind
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getLineKind()
	 * @generated
	 */
	int LINE_KIND = 35;


	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Canvas <em>Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Canvas</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Canvas
	 * @generated
	 */
	EClass getCanvas();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.gmfgraph.Canvas#getFigures <em>Figures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Figures</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Canvas#getFigures()
	 * @see #getCanvas()
	 * @generated
	 */
	EReference getCanvas_Figures();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.gmfgraph.Canvas#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Canvas#getNodes()
	 * @see #getCanvas()
	 * @generated
	 */
	EReference getCanvas_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.gmfgraph.Canvas#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Canvas#getConnections()
	 * @see #getCanvas()
	 * @generated
	 */
	EReference getCanvas_Connections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.gmfgraph.Canvas#getCompartments <em>Compartments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compartments</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Canvas#getCompartments()
	 * @see #getCanvas()
	 * @generated
	 */
	EReference getCanvas_Compartments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.gmfgraph.Canvas#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Canvas#getChildren()
	 * @see #getCanvas()
	 * @generated
	 */
	EReference getCanvas_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.FigureGallery <em>Figure Gallery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure Gallery</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FigureGallery
	 * @generated
	 */
	EClass getFigureGallery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.gmfgraph.FigureGallery#getFigures <em>Figures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Figures</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FigureGallery#getFigures()
	 * @see #getFigureGallery()
	 * @generated
	 */
	EReference getFigureGallery_Figures();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.gmf.gmfgraph.FigureGallery#getImplBundles <em>Impl Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Impl Bundles</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FigureGallery#getImplBundles()
	 * @see #getFigureGallery()
	 * @generated
	 */
	EAttribute getFigureGallery_ImplBundles();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Identity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Identity
	 * @generated
	 */
	EClass getIdentity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Identity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Identity#getName()
	 * @see #getIdentity()
	 * @generated
	 */
	EAttribute getIdentity_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.DiagramElement <em>Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Element</em>'.
	 * @see org.eclipse.gmf.gmfgraph.DiagramElement
	 * @generated
	 */
	EClass getDiagramElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.gmfgraph.DiagramElement#getFigure <em>Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Figure</em>'.
	 * @see org.eclipse.gmf.gmfgraph.DiagramElement#getFigure()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EReference getDiagramElement_Figure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.gmfgraph.DiagramElement#getFacets <em>Facets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Facets</em>'.
	 * @see org.eclipse.gmf.gmfgraph.DiagramElement#getFacets()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EReference getDiagramElement_Facets();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Node#getResizeConstraint <em>Resize Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resize Constraint</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Node#getResizeConstraint()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_ResizeConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Compartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compartment</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Compartment
	 * @generated
	 */
	EClass getCompartment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Compartment#isCollapsible <em>Collapsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collapsible</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Compartment#isCollapsible()
	 * @see #getCompartment()
	 * @generated
	 */
	EAttribute getCompartment_Collapsible();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Compartment#isNeedsTitle <em>Needs Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needs Title</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Compartment#isNeedsTitle()
	 * @see #getCompartment()
	 * @generated
	 */
	EAttribute getCompartment_NeedsTitle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Child <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Child
	 * @generated
	 */
	EClass getChild();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.VisualFacet <em>Visual Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visual Facet</em>'.
	 * @see org.eclipse.gmf.gmfgraph.VisualFacet
	 * @generated
	 */
	EClass getVisualFacet();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.GeneralFacet <em>General Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Facet</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GeneralFacet
	 * @generated
	 */
	EClass getGeneralFacet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.GeneralFacet#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GeneralFacet#getIdentifier()
	 * @see #getGeneralFacet()
	 * @generated
	 */
	EAttribute getGeneralFacet_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.GeneralFacet#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GeneralFacet#getData()
	 * @see #getGeneralFacet()
	 * @generated
	 */
	EAttribute getGeneralFacet_Data();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.GradientFacet <em>Gradient Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gradient Facet</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GradientFacet
	 * @generated
	 */
	EClass getGradientFacet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.GradientFacet#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GradientFacet#getDirection()
	 * @see #getGradientFacet()
	 * @generated
	 */
	EAttribute getGradientFacet_Direction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.FigureMarker <em>Figure Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure Marker</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FigureMarker
	 * @generated
	 */
	EClass getFigureMarker();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Figure <em>Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure
	 * @generated
	 */
	EClass getFigure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.gmfgraph.Figure#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure#getChildren()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_Children();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.gmfgraph.Figure#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure#getParent()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.Figure#getColorStyle <em>Color Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color Style</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure#getColorStyle()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_ColorStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.Figure#getSizeStyle <em>Size Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size Style</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure#getSizeStyle()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_SizeStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.Figure#getFontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font Style</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure#getFontStyle()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_FontStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.Figure#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure#getLocation()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_Location();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.Figure#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure#getSize()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Figure#getLayoutManager <em>Layout Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Manager</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure#getLayoutManager()
	 * @see #getFigure()
	 * @generated
	 */
	EAttribute getFigure_LayoutManager();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.FigureRef <em>Figure Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure Ref</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FigureRef
	 * @generated
	 */
	EClass getFigureRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.gmfgraph.FigureRef#getFigure <em>Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Figure</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FigureRef#getFigure()
	 * @see #getFigureRef()
	 * @generated
	 */
	EReference getFigureRef_Figure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.ConnectionFigure <em>Connection Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Figure</em>'.
	 * @see org.eclipse.gmf.gmfgraph.ConnectionFigure
	 * @generated
	 */
	EClass getConnectionFigure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.DecorationFigure <em>Decoration Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decoration Figure</em>'.
	 * @see org.eclipse.gmf.gmfgraph.DecorationFigure
	 * @generated
	 */
	EClass getDecorationFigure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Shape#isOutline <em>Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Shape#isOutline()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Outline();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Shape#isFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Shape#isFill()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Shape#getLineWidth <em>Line Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Width</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Shape#getLineWidth()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_LineWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Shape#getLineKind <em>Line Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Kind</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Shape#getLineKind()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_LineKind();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Label#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Label#getText()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Text();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.LabeledContainer <em>Labeled Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Container</em>'.
	 * @see org.eclipse.gmf.gmfgraph.LabeledContainer
	 * @generated
	 */
	EClass getLabeledContainer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Rectangle
	 * @generated
	 */
	EClass getRectangle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.RoundedRectangle <em>Rounded Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rounded Rectangle</em>'.
	 * @see org.eclipse.gmf.gmfgraph.RoundedRectangle
	 * @generated
	 */
	EClass getRoundedRectangle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.RoundedRectangle#getCornerWidth <em>Corner Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corner Width</em>'.
	 * @see org.eclipse.gmf.gmfgraph.RoundedRectangle#getCornerWidth()
	 * @see #getRoundedRectangle()
	 * @generated
	 */
	EAttribute getRoundedRectangle_CornerWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.RoundedRectangle#getCornerHeight <em>Corner Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corner Height</em>'.
	 * @see org.eclipse.gmf.gmfgraph.RoundedRectangle#getCornerHeight()
	 * @see #getRoundedRectangle()
	 * @generated
	 */
	EAttribute getRoundedRectangle_CornerHeight();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Ellipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ellipse</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Ellipse
	 * @generated
	 */
	EClass getEllipse();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Polyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polyline</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Polyline
	 * @generated
	 */
	EClass getPolyline();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.gmfgraph.Polyline#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Polyline#getTemplate()
	 * @see #getPolyline()
	 * @generated
	 */
	EReference getPolyline_Template();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Polygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Polygon
	 * @generated
	 */
	EClass getPolygon();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.PolylineConnection <em>Polyline Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polyline Connection</em>'.
	 * @see org.eclipse.gmf.gmfgraph.PolylineConnection
	 * @generated
	 */
	EClass getPolylineConnection();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.PolylineConnection#getSourceDecoration <em>Source Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Decoration</em>'.
	 * @see org.eclipse.gmf.gmfgraph.PolylineConnection#getSourceDecoration()
	 * @see #getPolylineConnection()
	 * @generated
	 */
	EReference getPolylineConnection_SourceDecoration();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.PolylineConnection#getTargetDecoration <em>Target Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Decoration</em>'.
	 * @see org.eclipse.gmf.gmfgraph.PolylineConnection#getTargetDecoration()
	 * @see #getPolylineConnection()
	 * @generated
	 */
	EReference getPolylineConnection_TargetDecoration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.PolylineDecoration <em>Polyline Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polyline Decoration</em>'.
	 * @see org.eclipse.gmf.gmfgraph.PolylineDecoration
	 * @generated
	 */
	EClass getPolylineDecoration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.PolygonDecoration <em>Polygon Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon Decoration</em>'.
	 * @see org.eclipse.gmf.gmfgraph.PolygonDecoration
	 * @generated
	 */
	EClass getPolygonDecoration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.CustomFigure <em>Custom Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Figure</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomFigure
	 * @generated
	 */
	EClass getCustomFigure();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.CustomFigure#getQualifiedClassName <em>Qualified Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Class Name</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomFigure#getQualifiedClassName()
	 * @see #getCustomFigure()
	 * @generated
	 */
	EAttribute getCustomFigure_QualifiedClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.CustomFigure#getBundleName <em>Bundle Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bundle Name</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomFigure#getBundleName()
	 * @see #getCustomFigure()
	 * @generated
	 */
	EAttribute getCustomFigure_BundleName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.CustomDecoration <em>Custom Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Decoration</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomDecoration
	 * @generated
	 */
	EClass getCustomDecoration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.CustomConnection <em>Custom Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Connection</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomConnection
	 * @generated
	 */
	EClass getCustomConnection();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.ColorStyle <em>Color Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Style</em>'.
	 * @see org.eclipse.gmf.gmfgraph.ColorStyle
	 * @generated
	 */
	EClass getColorStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.ColorStyle#getForegroundColor <em>Foreground Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreground Color</em>'.
	 * @see org.eclipse.gmf.gmfgraph.ColorStyle#getForegroundColor()
	 * @see #getColorStyle()
	 * @generated
	 */
	EAttribute getColorStyle_ForegroundColor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.ColorStyle#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see org.eclipse.gmf.gmfgraph.ColorStyle#getBackgroundColor()
	 * @see #getColorStyle()
	 * @generated
	 */
	EAttribute getColorStyle_BackgroundColor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.SizeStyle <em>Size Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size Style</em>'.
	 * @see org.eclipse.gmf.gmfgraph.SizeStyle
	 * @generated
	 */
	EClass getSizeStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.SizeStyle#getMaxSize <em>Max Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Size</em>'.
	 * @see org.eclipse.gmf.gmfgraph.SizeStyle#getMaxSize()
	 * @see #getSizeStyle()
	 * @generated
	 */
	EReference getSizeStyle_MaxSize();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.SizeStyle#getMinSize <em>Min Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Size</em>'.
	 * @see org.eclipse.gmf.gmfgraph.SizeStyle#getMinSize()
	 * @see #getSizeStyle()
	 * @generated
	 */
	EReference getSizeStyle_MinSize();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.SizeStyle#getPrefSize <em>Pref Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pref Size</em>'.
	 * @see org.eclipse.gmf.gmfgraph.SizeStyle#getPrefSize()
	 * @see #getSizeStyle()
	 * @generated
	 */
	EReference getSizeStyle_PrefSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.FontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font Style</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FontStyle
	 * @generated
	 */
	EClass getFontStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.FontStyle#getFaceName <em>Face Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Face Name</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FontStyle#getFaceName()
	 * @see #getFontStyle()
	 * @generated
	 */
	EAttribute getFontStyle_FaceName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.gmfgraph.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.gmfgraph.LineKind <em>Line Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Line Kind</em>'.
	 * @see org.eclipse.gmf.gmfgraph.LineKind
	 * @generated
	 */
	EEnum getLineKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GMFGraphFactory getGMFGraphFactory();

} //GMFGraphPackage

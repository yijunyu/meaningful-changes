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
public interface GMFGraphPackage extends EPackage {
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
	 * The number of structural features of the '<em>Identity</em>' class.
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
	 * The number of structural features of the '<em>Canvas</em>' class.
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
	 * The feature id for the '<em><b>Implementation Bundle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_GALLERY__IMPLEMENTATION_BUNDLE = IDENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Figure Gallery</em>' class.
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
	 * The number of structural features of the '<em>Diagram Element</em>' class.
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
	 * The number of structural features of the '<em>Node</em>' class.
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
	 * The number of structural features of the '<em>Connection</em>' class.
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
	 * The number of structural features of the '<em>Compartment</em>' class.
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
	 * The number of structural features of the '<em>Child</em>' class.
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
	 * The number of structural features of the '<em>Visual Facet</em>' class.
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
	 * The number of structural features of the '<em>General Facet</em>' class.
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
	 * The number of structural features of the '<em>Gradient Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_FACET_FEATURE_COUNT = VISUAL_FACET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.Layoutable <em>Layoutable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.Layoutable
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getLayoutable()
	 * @generated
	 */
	int LAYOUTABLE = 48;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE__LAYOUT_DATA = 0;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE__LAYOUT = 1;

	/**
	 * The number of structural features of the '<em>Layoutable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_MARKER__LAYOUT_DATA = LAYOUTABLE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_MARKER__LAYOUT = LAYOUTABLE__LAYOUT;

	/**
	 * The number of structural features of the '<em>Figure Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_MARKER_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__LAYOUT_DATA = FIGURE_MARKER__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__LAYOUT = FIGURE_MARKER__LAYOUT;

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
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__FOREGROUND_COLOR = FIGURE_MARKER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__BACKGROUND_COLOR = FIGURE_MARKER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__MAXIMUM_SIZE = FIGURE_MARKER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__MINIMUM_SIZE = FIGURE_MARKER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__PREFERRED_SIZE = FIGURE_MARKER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__FONT = FIGURE_MARKER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__INSETS = FIGURE_MARKER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__BORDER = FIGURE_MARKER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__LOCATION = FIGURE_MARKER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__SIZE = FIGURE_MARKER_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_FEATURE_COUNT = FIGURE_MARKER_FEATURE_COUNT + 13;

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
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_REF__LAYOUT_DATA = FIGURE_MARKER__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_REF__LAYOUT = FIGURE_MARKER__LAYOUT;

	/**
	 * The feature id for the '<em><b>Figure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_REF__FIGURE = FIGURE_MARKER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Figure Ref</em>' class.
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
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__LAYOUT_DATA = FIGURE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__LAYOUT = FIGURE__LAYOUT;

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
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__FOREGROUND_COLOR = FIGURE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__BACKGROUND_COLOR = FIGURE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__MAXIMUM_SIZE = FIGURE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__MINIMUM_SIZE = FIGURE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__PREFERRED_SIZE = FIGURE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__FONT = FIGURE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__INSETS = FIGURE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__BORDER = FIGURE__BORDER;

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
	 * The number of structural features of the '<em>Connection Figure</em>' class.
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
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__LAYOUT_DATA = FIGURE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__LAYOUT = FIGURE__LAYOUT;

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
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__FOREGROUND_COLOR = FIGURE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__BACKGROUND_COLOR = FIGURE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__MAXIMUM_SIZE = FIGURE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__MINIMUM_SIZE = FIGURE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__PREFERRED_SIZE = FIGURE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__FONT = FIGURE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__INSETS = FIGURE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__BORDER = FIGURE__BORDER;

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
	 * The number of structural features of the '<em>Decoration Figure</em>' class.
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
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LAYOUT_DATA = FIGURE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LAYOUT = FIGURE__LAYOUT;

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
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FOREGROUND_COLOR = FIGURE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__BACKGROUND_COLOR = FIGURE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__MAXIMUM_SIZE = FIGURE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__MINIMUM_SIZE = FIGURE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__PREFERRED_SIZE = FIGURE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FONT = FIGURE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__INSETS = FIGURE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__BORDER = FIGURE__BORDER;

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
	 * The feature id for the '<em><b>Xor Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__XOR_FILL = FIGURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Xor Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__XOR_OUTLINE = FIGURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resolved Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__RESOLVED_CHILDREN = FIGURE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = FIGURE_FEATURE_COUNT + 7;

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
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__LAYOUT_DATA = FIGURE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__LAYOUT = FIGURE__LAYOUT;

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
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FOREGROUND_COLOR = FIGURE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BACKGROUND_COLOR = FIGURE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__MAXIMUM_SIZE = FIGURE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__MINIMUM_SIZE = FIGURE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__PREFERRED_SIZE = FIGURE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FONT = FIGURE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__INSETS = FIGURE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BORDER = FIGURE__BORDER;

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
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT = FIGURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
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
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__LAYOUT_DATA = FIGURE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__LAYOUT = FIGURE__LAYOUT;

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
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__FOREGROUND_COLOR = FIGURE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__BACKGROUND_COLOR = FIGURE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__MAXIMUM_SIZE = FIGURE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__MINIMUM_SIZE = FIGURE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__PREFERRED_SIZE = FIGURE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__FONT = FIGURE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__INSETS = FIGURE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__BORDER = FIGURE__BORDER;

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
	 * The number of structural features of the '<em>Labeled Container</em>' class.
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
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__LAYOUT_DATA = SHAPE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__LAYOUT = SHAPE__LAYOUT;

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
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__FOREGROUND_COLOR = SHAPE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__BACKGROUND_COLOR = SHAPE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__MAXIMUM_SIZE = SHAPE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__MINIMUM_SIZE = SHAPE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__PREFERRED_SIZE = SHAPE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__FONT = SHAPE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__INSETS = SHAPE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__BORDER = SHAPE__BORDER;

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
	 * The feature id for the '<em><b>Xor Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__XOR_FILL = SHAPE__XOR_FILL;

	/**
	 * The feature id for the '<em><b>Xor Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__XOR_OUTLINE = SHAPE__XOR_OUTLINE;

	/**
	 * The feature id for the '<em><b>Resolved Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__RESOLVED_CHILDREN = SHAPE__RESOLVED_CHILDREN;

	/**
	 * The number of structural features of the '<em>Rectangle</em>' class.
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
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__LAYOUT_DATA = SHAPE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__LAYOUT = SHAPE__LAYOUT;

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
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__FOREGROUND_COLOR = SHAPE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__BACKGROUND_COLOR = SHAPE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__MAXIMUM_SIZE = SHAPE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__MINIMUM_SIZE = SHAPE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__PREFERRED_SIZE = SHAPE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__FONT = SHAPE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__INSETS = SHAPE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__BORDER = SHAPE__BORDER;

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
	 * The feature id for the '<em><b>Xor Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__XOR_FILL = SHAPE__XOR_FILL;

	/**
	 * The feature id for the '<em><b>Xor Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__XOR_OUTLINE = SHAPE__XOR_OUTLINE;

	/**
	 * The feature id for the '<em><b>Resolved Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__RESOLVED_CHILDREN = SHAPE__RESOLVED_CHILDREN;

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
	 * The number of structural features of the '<em>Rounded Rectangle</em>' class.
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
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__LAYOUT_DATA = SHAPE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__LAYOUT = SHAPE__LAYOUT;

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
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__FOREGROUND_COLOR = SHAPE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__BACKGROUND_COLOR = SHAPE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__MAXIMUM_SIZE = SHAPE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__MINIMUM_SIZE = SHAPE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__PREFERRED_SIZE = SHAPE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__FONT = SHAPE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__INSETS = SHAPE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__BORDER = SHAPE__BORDER;

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
	 * The feature id for the '<em><b>Xor Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__XOR_FILL = SHAPE__XOR_FILL;

	/**
	 * The feature id for the '<em><b>Xor Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__XOR_OUTLINE = SHAPE__XOR_OUTLINE;

	/**
	 * The feature id for the '<em><b>Resolved Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__RESOLVED_CHILDREN = SHAPE__RESOLVED_CHILDREN;

	/**
	 * The number of structural features of the '<em>Ellipse</em>' class.
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
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__LAYOUT_DATA = SHAPE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__LAYOUT = SHAPE__LAYOUT;

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
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__FOREGROUND_COLOR = SHAPE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__BACKGROUND_COLOR = SHAPE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__MAXIMUM_SIZE = SHAPE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__MINIMUM_SIZE = SHAPE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__PREFERRED_SIZE = SHAPE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__FONT = SHAPE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__INSETS = SHAPE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__BORDER = SHAPE__BORDER;

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
	 * The feature id for the '<em><b>Xor Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__XOR_FILL = SHAPE__XOR_FILL;

	/**
	 * The feature id for the '<em><b>Xor Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__XOR_OUTLINE = SHAPE__XOR_OUTLINE;

	/**
	 * The feature id for the '<em><b>Resolved Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__RESOLVED_CHILDREN = SHAPE__RESOLVED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__TEMPLATE = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Polyline</em>' class.
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
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__LAYOUT_DATA = POLYLINE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__LAYOUT = POLYLINE__LAYOUT;

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
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__FOREGROUND_COLOR = POLYLINE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__BACKGROUND_COLOR = POLYLINE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__MAXIMUM_SIZE = POLYLINE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__MINIMUM_SIZE = POLYLINE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__PREFERRED_SIZE = POLYLINE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__FONT = POLYLINE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__INSETS = POLYLINE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__BORDER = POLYLINE__BORDER;

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
	 * The feature id for the '<em><b>Xor Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__XOR_FILL = POLYLINE__XOR_FILL;

	/**
	 * The feature id for the '<em><b>Xor Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__XOR_OUTLINE = POLYLINE__XOR_OUTLINE;

	/**
	 * The feature id for the '<em><b>Resolved Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__RESOLVED_CHILDREN = POLYLINE__RESOLVED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__TEMPLATE = POLYLINE__TEMPLATE;

	/**
	 * The number of structural features of the '<em>Polygon</em>' class.
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
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__LAYOUT_DATA = POLYLINE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__LAYOUT = POLYLINE__LAYOUT;

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
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__FOREGROUND_COLOR = POLYLINE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__BACKGROUND_COLOR = POLYLINE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__MAXIMUM_SIZE = POLYLINE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__MINIMUM_SIZE = POLYLINE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__PREFERRED_SIZE = POLYLINE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__FONT = POLYLINE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__INSETS = POLYLINE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__BORDER = POLYLINE__BORDER;

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
	 * The feature id for the '<em><b>Xor Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__XOR_FILL = POLYLINE__XOR_FILL;

	/**
	 * The feature id for the '<em><b>Xor Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__XOR_OUTLINE = POLYLINE__XOR_OUTLINE;

	/**
	 * The feature id for the '<em><b>Resolved Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__RESOLVED_CHILDREN = POLYLINE__RESOLVED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__TEMPLATE = POLYLINE__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Source Decoration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__SOURCE_DECORATION = POLYLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Decoration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__TARGET_DECORATION = POLYLINE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Polyline Connection</em>' class.
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
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__LAYOUT_DATA = POLYLINE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__LAYOUT = POLYLINE__LAYOUT;

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
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__FOREGROUND_COLOR = POLYLINE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__BACKGROUND_COLOR = POLYLINE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__MAXIMUM_SIZE = POLYLINE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__MINIMUM_SIZE = POLYLINE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__PREFERRED_SIZE = POLYLINE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__FONT = POLYLINE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__INSETS = POLYLINE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__BORDER = POLYLINE__BORDER;

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
	 * The feature id for the '<em><b>Xor Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__XOR_FILL = POLYLINE__XOR_FILL;

	/**
	 * The feature id for the '<em><b>Xor Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__XOR_OUTLINE = POLYLINE__XOR_OUTLINE;

	/**
	 * The feature id for the '<em><b>Resolved Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__RESOLVED_CHILDREN = POLYLINE__RESOLVED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__TEMPLATE = POLYLINE__TEMPLATE;

	/**
	 * The number of structural features of the '<em>Polyline Decoration</em>' class.
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
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__LAYOUT_DATA = POLYGON__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__LAYOUT = POLYGON__LAYOUT;

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
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__FOREGROUND_COLOR = POLYGON__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__BACKGROUND_COLOR = POLYGON__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__MAXIMUM_SIZE = POLYGON__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__MINIMUM_SIZE = POLYGON__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__PREFERRED_SIZE = POLYGON__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__FONT = POLYGON__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__INSETS = POLYGON__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__BORDER = POLYGON__BORDER;

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
	 * The feature id for the '<em><b>Xor Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__XOR_FILL = POLYGON__XOR_FILL;

	/**
	 * The feature id for the '<em><b>Xor Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__XOR_OUTLINE = POLYGON__XOR_OUTLINE;

	/**
	 * The feature id for the '<em><b>Resolved Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__RESOLVED_CHILDREN = POLYGON__RESOLVED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__TEMPLATE = POLYGON__TEMPLATE;

	/**
	 * The number of structural features of the '<em>Polygon Decoration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION_FEATURE_COUNT = POLYGON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.CustomClass <em>Custom Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.CustomClass
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getCustomClass()
	 * @generated
	 */
	int CUSTOM_CLASS = 27;

	/**
	 * The feature id for the '<em><b>Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CLASS__QUALIFIED_CLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Bundle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CLASS__BUNDLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CLASS__ATTRIBUTES = 2;

	/**
	 * The number of structural features of the '<em>Custom Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CLASS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl <em>Custom Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getCustomFigure()
	 * @generated
	 */
	int CUSTOM_FIGURE = 28;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__LAYOUT_DATA = FIGURE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__LAYOUT = FIGURE__LAYOUT;

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
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__FOREGROUND_COLOR = FIGURE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__BACKGROUND_COLOR = FIGURE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__MAXIMUM_SIZE = FIGURE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__MINIMUM_SIZE = FIGURE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__PREFERRED_SIZE = FIGURE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__FONT = FIGURE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__INSETS = FIGURE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__BORDER = FIGURE__BORDER;

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
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__ATTRIBUTES = FIGURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Custom Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE_FEATURE_COUNT = FIGURE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.CustomDecorationImpl <em>Custom Decoration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.CustomDecorationImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getCustomDecoration()
	 * @generated
	 */
	int CUSTOM_DECORATION = 29;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__LAYOUT_DATA = CUSTOM_FIGURE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__LAYOUT = CUSTOM_FIGURE__LAYOUT;

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
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__FOREGROUND_COLOR = CUSTOM_FIGURE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__BACKGROUND_COLOR = CUSTOM_FIGURE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__MAXIMUM_SIZE = CUSTOM_FIGURE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__MINIMUM_SIZE = CUSTOM_FIGURE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__PREFERRED_SIZE = CUSTOM_FIGURE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__FONT = CUSTOM_FIGURE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__INSETS = CUSTOM_FIGURE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__BORDER = CUSTOM_FIGURE__BORDER;

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
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__ATTRIBUTES = CUSTOM_FIGURE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Custom Decoration</em>' class.
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
	int CUSTOM_CONNECTION = 30;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__LAYOUT_DATA = CUSTOM_FIGURE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__LAYOUT = CUSTOM_FIGURE__LAYOUT;

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
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__FOREGROUND_COLOR = CUSTOM_FIGURE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__BACKGROUND_COLOR = CUSTOM_FIGURE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__MAXIMUM_SIZE = CUSTOM_FIGURE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__MINIMUM_SIZE = CUSTOM_FIGURE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__PREFERRED_SIZE = CUSTOM_FIGURE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__FONT = CUSTOM_FIGURE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__INSETS = CUSTOM_FIGURE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__BORDER = CUSTOM_FIGURE__BORDER;

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
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__ATTRIBUTES = CUSTOM_FIGURE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Custom Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION_FEATURE_COUNT = CUSTOM_FIGURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.Color <em>Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.Color
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 31;

	/**
	 * The number of structural features of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.RGBColorImpl <em>RGB Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.RGBColorImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getRGBColor()
	 * @generated
	 */
	int RGB_COLOR = 32;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR__RED = COLOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR__GREEN = COLOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR__BLUE = COLOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>RGB Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR_FEATURE_COUNT = COLOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.ConstantColorImpl <em>Constant Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.ConstantColorImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getConstantColor()
	 * @generated
	 */
	int CONSTANT_COLOR = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_COLOR__VALUE = COLOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_COLOR_FEATURE_COUNT = COLOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.Font <em>Font</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.Font
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getFont()
	 * @generated
	 */
	int FONT = 34;

	/**
	 * The number of structural features of the '<em>Font</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.BasicFontImpl <em>Basic Font</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.BasicFontImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getBasicFont()
	 * @generated
	 */
	int BASIC_FONT = 35;

	/**
	 * The feature id for the '<em><b>Face Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FONT__FACE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FONT__HEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FONT__STYLE = 2;

	/**
	 * The number of structural features of the '<em>Basic Font</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FONT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.FontStyle <em>Font Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.FontStyle
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getFontStyle()
	 * @generated
	 */
	int FONT_STYLE = 55;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.PointImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 36;

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
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.DimensionImpl <em>Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.DimensionImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 37;

	/**
	 * The feature id for the '<em><b>Dx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__DX = 0;

	/**
	 * The feature id for the '<em><b>Dy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__DY = 1;

	/**
	 * The number of structural features of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.InsetsImpl <em>Insets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.InsetsImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getInsets()
	 * @generated
	 */
	int INSETS = 38;

	/**
	 * The feature id for the '<em><b>Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSETS__TOP = 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSETS__LEFT = 1;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSETS__BOTTOM = 2;

	/**
	 * The feature id for the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSETS__RIGHT = 3;

	/**
	 * The number of structural features of the '<em>Insets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSETS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.Border <em>Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.Border
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getBorder()
	 * @generated
	 */
	int BORDER = 39;

	/**
	 * The number of structural features of the '<em>Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.LineBorderImpl <em>Line Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.LineBorderImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getLineBorder()
	 * @generated
	 */
	int LINE_BORDER = 40;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BORDER__COLOR = BORDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BORDER__WIDTH = BORDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Line Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BORDER_FEATURE_COUNT = BORDER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.MarginBorderImpl <em>Margin Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.MarginBorderImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getMarginBorder()
	 * @generated
	 */
	int MARGIN_BORDER = 41;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN_BORDER__INSETS = BORDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Margin Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN_BORDER_FEATURE_COUNT = BORDER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.CompoundBorderImpl <em>Compound Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.CompoundBorderImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getCompoundBorder()
	 * @generated
	 */
	int COMPOUND_BORDER = 42;

	/**
	 * The feature id for the '<em><b>Outer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_BORDER__OUTER = BORDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_BORDER__INNER = BORDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compound Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_BORDER_FEATURE_COUNT = BORDER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.CustomBorderImpl <em>Custom Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.CustomBorderImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getCustomBorder()
	 * @generated
	 */
	int CUSTOM_BORDER = 43;

	/**
	 * The feature id for the '<em><b>Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_BORDER__QUALIFIED_CLASS_NAME = BORDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bundle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_BORDER__BUNDLE_NAME = BORDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_BORDER__ATTRIBUTES = BORDER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Custom Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_BORDER_FEATURE_COUNT = BORDER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.LayoutData <em>Layout Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.LayoutData
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getLayoutData()
	 * @generated
	 */
	int LAYOUT_DATA = 44;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DATA__OWNER = 0;

	/**
	 * The number of structural features of the '<em>Layout Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DATA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.GridLayoutDataImpl <em>Grid Layout Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.GridLayoutDataImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getGridLayoutData()
	 * @generated
	 */
	int GRID_LAYOUT_DATA = 46;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.BorderLayoutDataImpl <em>Border Layout Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.BorderLayoutDataImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getBorderLayoutData()
	 * @generated
	 */
	int BORDER_LAYOUT_DATA = 47;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.CustomLayoutImpl <em>Custom Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.CustomLayoutImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getCustomLayout()
	 * @generated
	 */
	int CUSTOM_LAYOUT = 50;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.Layout <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.Layout
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 49;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.CustomLayoutDataImpl <em>Custom Layout Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.CustomLayoutDataImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getCustomLayoutData()
	 * @generated
	 */
	int CUSTOM_LAYOUT_DATA = 45;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT_DATA__OWNER = LAYOUT_DATA__OWNER;

	/**
	 * The feature id for the '<em><b>Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT_DATA__QUALIFIED_CLASS_NAME = LAYOUT_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bundle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT_DATA__BUNDLE_NAME = LAYOUT_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT_DATA__ATTRIBUTES = LAYOUT_DATA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Custom Layout Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT_DATA_FEATURE_COUNT = LAYOUT_DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT_DATA__OWNER = LAYOUT_DATA__OWNER;

	/**
	 * The feature id for the '<em><b>Grab Excess Horizontal Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT_DATA__GRAB_EXCESS_HORIZONTAL_SPACE = LAYOUT_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Grab Excess Vertical Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT_DATA__GRAB_EXCESS_VERTICAL_SPACE = LAYOUT_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT_DATA__VERTICAL_ALIGNMENT = LAYOUT_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT_DATA__HORIZONTAL_ALIGNMENT = LAYOUT_DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Vertical Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT_DATA__VERTICAL_SPAN = LAYOUT_DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Horizontal Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT_DATA__HORIZONTAL_SPAN = LAYOUT_DATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Horizontal Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT_DATA__HORIZONTAL_INDENT = LAYOUT_DATA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Size Hint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT_DATA__SIZE_HINT = LAYOUT_DATA_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Grid Layout Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT_DATA_FEATURE_COUNT = LAYOUT_DATA_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT_DATA__OWNER = LAYOUT_DATA__OWNER;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT_DATA__ALIGNMENT = LAYOUT_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT_DATA__VERTICAL = LAYOUT_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Border Layout Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT_DATA_FEATURE_COUNT = LAYOUT_DATA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT__QUALIFIED_CLASS_NAME = LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bundle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT__BUNDLE_NAME = LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT__ATTRIBUTES = LAYOUT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Custom Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.GridLayoutImpl <em>Grid Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.GridLayoutImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getGridLayout()
	 * @generated
	 */
	int GRID_LAYOUT = 51;

	/**
	 * The feature id for the '<em><b>Num Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__NUM_COLUMNS = LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Equal Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__EQUAL_WIDTH = LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Margins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__MARGINS = LAYOUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__SPACING = LAYOUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Grid Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.BorderLayoutImpl <em>Border Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.BorderLayoutImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getBorderLayout()
	 * @generated
	 */
	int BORDER_LAYOUT = 52;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT__SPACING = LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Border Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.CustomAttributeImpl <em>Custom Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.CustomAttributeImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getCustomAttribute()
	 * @generated
	 */
	int CUSTOM_ATTRIBUTE = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ATTRIBUTE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Direct Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ATTRIBUTE__DIRECT_ACCESS = 2;

	/**
	 * The feature id for the '<em><b>Multi Statement Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ATTRIBUTE__MULTI_STATEMENT_VALUE = 3;

	/**
	 * The number of structural features of the '<em>Custom Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.ColorConstants <em>Color Constants</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.ColorConstants
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getColorConstants()
	 * @generated
	 */
	int COLOR_CONSTANTS = 54;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.Direction
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 56;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.LineKind <em>Line Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.LineKind
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getLineKind()
	 * @generated
	 */
	int LINE_KIND = 57;


	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.Alignment <em>Alignment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.Alignment
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getAlignment()
	 * @generated
	 */
	int ALIGNMENT = 58;


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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.FigureGallery#getImplementationBundle <em>Implementation Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Bundle</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FigureGallery#getImplementationBundle()
	 * @see #getFigureGallery()
	 * @generated
	 */
	EAttribute getFigureGallery_ImplementationBundle();

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
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.Figure#getForegroundColor <em>Foreground Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreground Color</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure#getForegroundColor()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_ForegroundColor();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.Figure#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Background Color</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure#getBackgroundColor()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_BackgroundColor();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.Figure#getMaximumSize <em>Maximum Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maximum Size</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure#getMaximumSize()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_MaximumSize();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.Figure#getMinimumSize <em>Minimum Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Minimum Size</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure#getMinimumSize()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_MinimumSize();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.Figure#getPreferredSize <em>Preferred Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preferred Size</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure#getPreferredSize()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_PreferredSize();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.Figure#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure#getFont()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_Font();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.Figure#getInsets <em>Insets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insets</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure#getInsets()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_Insets();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.Figure#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Border</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure#getBorder()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_Border();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Shape#isXorFill <em>Xor Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xor Fill</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Shape#isXorFill()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_XorFill();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Shape#isXorOutline <em>Xor Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xor Outline</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Shape#isXorOutline()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_XorOutline();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmf.gmfgraph.Shape#getResolvedChildren <em>Resolved Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resolved Children</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Shape#getResolvedChildren()
	 * @see #getShape()
	 * @generated
	 */
	EReference getShape_ResolvedChildren();

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
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.gmfgraph.PolylineConnection#getSourceDecoration <em>Source Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Decoration</em>'.
	 * @see org.eclipse.gmf.gmfgraph.PolylineConnection#getSourceDecoration()
	 * @see #getPolylineConnection()
	 * @generated
	 */
	EReference getPolylineConnection_SourceDecoration();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.gmfgraph.PolylineConnection#getTargetDecoration <em>Target Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Decoration</em>'.
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
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.CustomClass <em>Custom Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Class</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomClass
	 * @generated
	 */
	EClass getCustomClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.CustomClass#getQualifiedClassName <em>Qualified Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Class Name</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomClass#getQualifiedClassName()
	 * @see #getCustomClass()
	 * @generated
	 */
	EAttribute getCustomClass_QualifiedClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.CustomClass#getBundleName <em>Bundle Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bundle Name</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomClass#getBundleName()
	 * @see #getCustomClass()
	 * @generated
	 */
	EAttribute getCustomClass_BundleName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.gmfgraph.CustomClass#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomClass#getAttributes()
	 * @see #getCustomClass()
	 * @generated
	 */
	EReference getCustomClass_Attributes();

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
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Color
	 * @generated
	 */
	EClass getColor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.RGBColor <em>RGB Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RGB Color</em>'.
	 * @see org.eclipse.gmf.gmfgraph.RGBColor
	 * @generated
	 */
	EClass getRGBColor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.RGBColor#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see org.eclipse.gmf.gmfgraph.RGBColor#getRed()
	 * @see #getRGBColor()
	 * @generated
	 */
	EAttribute getRGBColor_Red();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.RGBColor#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see org.eclipse.gmf.gmfgraph.RGBColor#getGreen()
	 * @see #getRGBColor()
	 * @generated
	 */
	EAttribute getRGBColor_Green();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.RGBColor#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see org.eclipse.gmf.gmfgraph.RGBColor#getBlue()
	 * @see #getRGBColor()
	 * @generated
	 */
	EAttribute getRGBColor_Blue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.ConstantColor <em>Constant Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Color</em>'.
	 * @see org.eclipse.gmf.gmfgraph.ConstantColor
	 * @generated
	 */
	EClass getConstantColor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.ConstantColor#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.gmf.gmfgraph.ConstantColor#getValue()
	 * @see #getConstantColor()
	 * @generated
	 */
	EAttribute getConstantColor_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Font <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Font
	 * @generated
	 */
	EClass getFont();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.BasicFont <em>Basic Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Font</em>'.
	 * @see org.eclipse.gmf.gmfgraph.BasicFont
	 * @generated
	 */
	EClass getBasicFont();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.BasicFont#getFaceName <em>Face Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Face Name</em>'.
	 * @see org.eclipse.gmf.gmfgraph.BasicFont#getFaceName()
	 * @see #getBasicFont()
	 * @generated
	 */
	EAttribute getBasicFont_FaceName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.BasicFont#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.eclipse.gmf.gmfgraph.BasicFont#getHeight()
	 * @see #getBasicFont()
	 * @generated
	 */
	EAttribute getBasicFont_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.BasicFont#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.gmf.gmfgraph.BasicFont#getStyle()
	 * @see #getBasicFont()
	 * @generated
	 */
	EAttribute getBasicFont_Style();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.gmfgraph.FontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Font Style</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FontStyle
	 * @generated
	 */
	EEnum getFontStyle();

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
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Dimension#getDx <em>Dx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dx</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Dimension#getDx()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Dx();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Dimension#getDy <em>Dy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dy</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Dimension#getDy()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Dy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Insets <em>Insets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insets</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Insets
	 * @generated
	 */
	EClass getInsets();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Insets#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Insets#getTop()
	 * @see #getInsets()
	 * @generated
	 */
	EAttribute getInsets_Top();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Insets#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Insets#getLeft()
	 * @see #getInsets()
	 * @generated
	 */
	EAttribute getInsets_Left();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Insets#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Insets#getBottom()
	 * @see #getInsets()
	 * @generated
	 */
	EAttribute getInsets_Bottom();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Insets#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Insets#getRight()
	 * @see #getInsets()
	 * @generated
	 */
	EAttribute getInsets_Right();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Border <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Border</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Border
	 * @generated
	 */
	EClass getBorder();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.LineBorder <em>Line Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Border</em>'.
	 * @see org.eclipse.gmf.gmfgraph.LineBorder
	 * @generated
	 */
	EClass getLineBorder();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.LineBorder#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color</em>'.
	 * @see org.eclipse.gmf.gmfgraph.LineBorder#getColor()
	 * @see #getLineBorder()
	 * @generated
	 */
	EReference getLineBorder_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.LineBorder#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.gmf.gmfgraph.LineBorder#getWidth()
	 * @see #getLineBorder()
	 * @generated
	 */
	EAttribute getLineBorder_Width();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.MarginBorder <em>Margin Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Margin Border</em>'.
	 * @see org.eclipse.gmf.gmfgraph.MarginBorder
	 * @generated
	 */
	EClass getMarginBorder();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.MarginBorder#getInsets <em>Insets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insets</em>'.
	 * @see org.eclipse.gmf.gmfgraph.MarginBorder#getInsets()
	 * @see #getMarginBorder()
	 * @generated
	 */
	EReference getMarginBorder_Insets();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.CompoundBorder <em>Compound Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Border</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CompoundBorder
	 * @generated
	 */
	EClass getCompoundBorder();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.CompoundBorder#getOuter <em>Outer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outer</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CompoundBorder#getOuter()
	 * @see #getCompoundBorder()
	 * @generated
	 */
	EReference getCompoundBorder_Outer();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.CompoundBorder#getInner <em>Inner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inner</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CompoundBorder#getInner()
	 * @see #getCompoundBorder()
	 * @generated
	 */
	EReference getCompoundBorder_Inner();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.CustomBorder <em>Custom Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Border</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomBorder
	 * @generated
	 */
	EClass getCustomBorder();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.LayoutData <em>Layout Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout Data</em>'.
	 * @see org.eclipse.gmf.gmfgraph.LayoutData
	 * @generated
	 */
	EClass getLayoutData();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.gmfgraph.LayoutData#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see org.eclipse.gmf.gmfgraph.LayoutData#getOwner()
	 * @see #getLayoutData()
	 * @generated
	 */
	EReference getLayoutData_Owner();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.CustomLayoutData <em>Custom Layout Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Layout Data</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomLayoutData
	 * @generated
	 */
	EClass getCustomLayoutData();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.GridLayoutData <em>Grid Layout Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Layout Data</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayoutData
	 * @generated
	 */
	EClass getGridLayoutData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.GridLayoutData#isGrabExcessHorizontalSpace <em>Grab Excess Horizontal Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grab Excess Horizontal Space</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayoutData#isGrabExcessHorizontalSpace()
	 * @see #getGridLayoutData()
	 * @generated
	 */
	EAttribute getGridLayoutData_GrabExcessHorizontalSpace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.GridLayoutData#isGrabExcessVerticalSpace <em>Grab Excess Vertical Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grab Excess Vertical Space</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayoutData#isGrabExcessVerticalSpace()
	 * @see #getGridLayoutData()
	 * @generated
	 */
	EAttribute getGridLayoutData_GrabExcessVerticalSpace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.GridLayoutData#getVerticalAlignment <em>Vertical Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Alignment</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayoutData#getVerticalAlignment()
	 * @see #getGridLayoutData()
	 * @generated
	 */
	EAttribute getGridLayoutData_VerticalAlignment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.GridLayoutData#getHorizontalAlignment <em>Horizontal Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Alignment</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayoutData#getHorizontalAlignment()
	 * @see #getGridLayoutData()
	 * @generated
	 */
	EAttribute getGridLayoutData_HorizontalAlignment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.GridLayoutData#getVerticalSpan <em>Vertical Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Span</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayoutData#getVerticalSpan()
	 * @see #getGridLayoutData()
	 * @generated
	 */
	EAttribute getGridLayoutData_VerticalSpan();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.GridLayoutData#getHorizontalSpan <em>Horizontal Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Span</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayoutData#getHorizontalSpan()
	 * @see #getGridLayoutData()
	 * @generated
	 */
	EAttribute getGridLayoutData_HorizontalSpan();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.GridLayoutData#getHorizontalIndent <em>Horizontal Indent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Indent</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayoutData#getHorizontalIndent()
	 * @see #getGridLayoutData()
	 * @generated
	 */
	EAttribute getGridLayoutData_HorizontalIndent();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.GridLayoutData#getSizeHint <em>Size Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size Hint</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayoutData#getSizeHint()
	 * @see #getGridLayoutData()
	 * @generated
	 */
	EReference getGridLayoutData_SizeHint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.BorderLayoutData <em>Border Layout Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Border Layout Data</em>'.
	 * @see org.eclipse.gmf.gmfgraph.BorderLayoutData
	 * @generated
	 */
	EClass getBorderLayoutData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.BorderLayoutData#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.eclipse.gmf.gmfgraph.BorderLayoutData#getAlignment()
	 * @see #getBorderLayoutData()
	 * @generated
	 */
	EAttribute getBorderLayoutData_Alignment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.BorderLayoutData#isVertical <em>Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical</em>'.
	 * @see org.eclipse.gmf.gmfgraph.BorderLayoutData#isVertical()
	 * @see #getBorderLayoutData()
	 * @generated
	 */
	EAttribute getBorderLayoutData_Vertical();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Layoutable <em>Layoutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layoutable</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Layoutable
	 * @generated
	 */
	EClass getLayoutable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.Layoutable#getLayoutData <em>Layout Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout Data</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Layoutable#getLayoutData()
	 * @see #getLayoutable()
	 * @generated
	 */
	EReference getLayoutable_LayoutData();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.Layoutable#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Layoutable#getLayout()
	 * @see #getLayoutable()
	 * @generated
	 */
	EReference getLayoutable_Layout();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.CustomLayout <em>Custom Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Layout</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomLayout
	 * @generated
	 */
	EClass getCustomLayout();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.GridLayout <em>Grid Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Layout</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayout
	 * @generated
	 */
	EClass getGridLayout();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.GridLayout#getNumColumns <em>Num Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Columns</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayout#getNumColumns()
	 * @see #getGridLayout()
	 * @generated
	 */
	EAttribute getGridLayout_NumColumns();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.GridLayout#isEqualWidth <em>Equal Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Equal Width</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayout#isEqualWidth()
	 * @see #getGridLayout()
	 * @generated
	 */
	EAttribute getGridLayout_EqualWidth();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.GridLayout#getMargins <em>Margins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Margins</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayout#getMargins()
	 * @see #getGridLayout()
	 * @generated
	 */
	EReference getGridLayout_Margins();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.GridLayout#getSpacing <em>Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spacing</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayout#getSpacing()
	 * @see #getGridLayout()
	 * @generated
	 */
	EReference getGridLayout_Spacing();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.BorderLayout <em>Border Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Border Layout</em>'.
	 * @see org.eclipse.gmf.gmfgraph.BorderLayout
	 * @generated
	 */
	EClass getBorderLayout();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.BorderLayout#getSpacing <em>Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spacing</em>'.
	 * @see org.eclipse.gmf.gmfgraph.BorderLayout#getSpacing()
	 * @see #getBorderLayout()
	 * @generated
	 */
	EReference getBorderLayout_Spacing();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.CustomAttribute <em>Custom Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Attribute</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomAttribute
	 * @generated
	 */
	EClass getCustomAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.CustomAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomAttribute#getName()
	 * @see #getCustomAttribute()
	 * @generated
	 */
	EAttribute getCustomAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.CustomAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomAttribute#getValue()
	 * @see #getCustomAttribute()
	 * @generated
	 */
	EAttribute getCustomAttribute_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.CustomAttribute#isDirectAccess <em>Direct Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direct Access</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomAttribute#isDirectAccess()
	 * @see #getCustomAttribute()
	 * @generated
	 */
	EAttribute getCustomAttribute_DirectAccess();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.CustomAttribute#isMultiStatementValue <em>Multi Statement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Statement Value</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomAttribute#isMultiStatementValue()
	 * @see #getCustomAttribute()
	 * @generated
	 */
	EAttribute getCustomAttribute_MultiStatementValue();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.gmfgraph.ColorConstants <em>Color Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color Constants</em>'.
	 * @see org.eclipse.gmf.gmfgraph.ColorConstants
	 * @generated
	 */
	EEnum getColorConstants();

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
	 * Returns the meta object for enum '{@link org.eclipse.gmf.gmfgraph.Alignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Alignment</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Alignment
	 * @generated
	 */
	EEnum getAlignment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GMFGraphFactory getGMFGraphFactory();

} //GMFGraphPackage

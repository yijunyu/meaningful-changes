/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.gmf.gmfgraph.*;

import org.eclipse.gmf.gmfgraph.Alignment;
import org.eclipse.gmf.gmfgraph.AlignmentFacet;
import org.eclipse.gmf.gmfgraph.BasicFont;
import org.eclipse.gmf.gmfgraph.BorderLayout;
import org.eclipse.gmf.gmfgraph.BorderLayoutData;
import org.eclipse.gmf.gmfgraph.Canvas;
import org.eclipse.gmf.gmfgraph.ColorConstants;
import org.eclipse.gmf.gmfgraph.Compartment;
import org.eclipse.gmf.gmfgraph.CompoundBorder;
import org.eclipse.gmf.gmfgraph.Connection;
import org.eclipse.gmf.gmfgraph.ConstantColor;
import org.eclipse.gmf.gmfgraph.CustomAttribute;
import org.eclipse.gmf.gmfgraph.CustomBorder;
import org.eclipse.gmf.gmfgraph.CustomConnection;
import org.eclipse.gmf.gmfgraph.CustomDecoration;
import org.eclipse.gmf.gmfgraph.CustomFigure;
import org.eclipse.gmf.gmfgraph.CustomLayout;
import org.eclipse.gmf.gmfgraph.CustomLayoutData;
import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.gmfgraph.Dimension;
import org.eclipse.gmf.gmfgraph.Direction;
import org.eclipse.gmf.gmfgraph.Ellipse;
import org.eclipse.gmf.gmfgraph.FigureAccessor;
import org.eclipse.gmf.gmfgraph.FigureGallery;
import org.eclipse.gmf.gmfgraph.FigureRef;
import org.eclipse.gmf.gmfgraph.FlowLayout;
import org.eclipse.gmf.gmfgraph.FontStyle;
import org.eclipse.gmf.gmfgraph.GMFGraphFactory;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.GeneralFacet;
import org.eclipse.gmf.gmfgraph.GradientFacet;
import org.eclipse.gmf.gmfgraph.GridLayout;
import org.eclipse.gmf.gmfgraph.GridLayoutData;
import org.eclipse.gmf.gmfgraph.Insets;
import org.eclipse.gmf.gmfgraph.Label;
import org.eclipse.gmf.gmfgraph.LabelOffsetFacet;
import org.eclipse.gmf.gmfgraph.LabeledContainer;
import org.eclipse.gmf.gmfgraph.LineBorder;
import org.eclipse.gmf.gmfgraph.LineKind;
import org.eclipse.gmf.gmfgraph.MarginBorder;
import org.eclipse.gmf.gmfgraph.Node;
import org.eclipse.gmf.gmfgraph.Point;
import org.eclipse.gmf.gmfgraph.Polygon;
import org.eclipse.gmf.gmfgraph.PolygonDecoration;
import org.eclipse.gmf.gmfgraph.Polyline;
import org.eclipse.gmf.gmfgraph.PolylineConnection;
import org.eclipse.gmf.gmfgraph.PolylineDecoration;
import org.eclipse.gmf.gmfgraph.RGBColor;
import org.eclipse.gmf.gmfgraph.Rectangle;
import org.eclipse.gmf.gmfgraph.RoundedRectangle;
import org.eclipse.gmf.gmfgraph.StackLayout;
import org.eclipse.gmf.gmfgraph.XYLayout;
import org.eclipse.gmf.gmfgraph.XYLayoutData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GMFGraphFactoryImpl extends EFactoryImpl implements GMFGraphFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GMFGraphFactory init() {
		try {
			GMFGraphFactory theGMFGraphFactory = (GMFGraphFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/gmf/2005/GraphicalDefinition"); 
			if (theGMFGraphFactory != null) {
				return theGMFGraphFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GMFGraphFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFGraphFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GMFGraphPackage.CANVAS: return createCanvas();
			case GMFGraphPackage.FIGURE_GALLERY: return createFigureGallery();
			case GMFGraphPackage.NODE: return createNode();
			case GMFGraphPackage.CONNECTION: return createConnection();
			case GMFGraphPackage.COMPARTMENT: return createCompartment();
			case GMFGraphPackage.DIAGRAM_LABEL: return createDiagramLabel();
			case GMFGraphPackage.GENERAL_FACET: return createGeneralFacet();
			case GMFGraphPackage.ALIGNMENT_FACET: return createAlignmentFacet();
			case GMFGraphPackage.GRADIENT_FACET: return createGradientFacet();
			case GMFGraphPackage.LABEL_OFFSET_FACET: return createLabelOffsetFacet();
			case GMFGraphPackage.FIGURE_REF: return createFigureRef();
			case GMFGraphPackage.LABEL: return createLabel();
			case GMFGraphPackage.LABELED_CONTAINER: return createLabeledContainer();
			case GMFGraphPackage.RECTANGLE: return createRectangle();
			case GMFGraphPackage.ROUNDED_RECTANGLE: return createRoundedRectangle();
			case GMFGraphPackage.ELLIPSE: return createEllipse();
			case GMFGraphPackage.POLYLINE: return createPolyline();
			case GMFGraphPackage.POLYGON: return createPolygon();
			case GMFGraphPackage.POLYLINE_CONNECTION: return createPolylineConnection();
			case GMFGraphPackage.POLYLINE_DECORATION: return createPolylineDecoration();
			case GMFGraphPackage.POLYGON_DECORATION: return createPolygonDecoration();
			case GMFGraphPackage.CUSTOM_ATTRIBUTE: return createCustomAttribute();
			case GMFGraphPackage.FIGURE_ACCESSOR: return createFigureAccessor();
			case GMFGraphPackage.CUSTOM_FIGURE: return createCustomFigure();
			case GMFGraphPackage.CUSTOM_DECORATION: return createCustomDecoration();
			case GMFGraphPackage.CUSTOM_CONNECTION: return createCustomConnection();
			case GMFGraphPackage.RGB_COLOR: return createRGBColor();
			case GMFGraphPackage.CONSTANT_COLOR: return createConstantColor();
			case GMFGraphPackage.BASIC_FONT: return createBasicFont();
			case GMFGraphPackage.POINT: return createPoint();
			case GMFGraphPackage.DIMENSION: return createDimension();
			case GMFGraphPackage.INSETS: return createInsets();
			case GMFGraphPackage.LINE_BORDER: return createLineBorder();
			case GMFGraphPackage.MARGIN_BORDER: return createMarginBorder();
			case GMFGraphPackage.COMPOUND_BORDER: return createCompoundBorder();
			case GMFGraphPackage.CUSTOM_BORDER: return createCustomBorder();
			case GMFGraphPackage.CUSTOM_LAYOUT_DATA: return createCustomLayoutData();
			case GMFGraphPackage.GRID_LAYOUT_DATA: return createGridLayoutData();
			case GMFGraphPackage.BORDER_LAYOUT_DATA: return createBorderLayoutData();
			case GMFGraphPackage.CUSTOM_LAYOUT: return createCustomLayout();
			case GMFGraphPackage.GRID_LAYOUT: return createGridLayout();
			case GMFGraphPackage.BORDER_LAYOUT: return createBorderLayout();
			case GMFGraphPackage.FLOW_LAYOUT: return createFlowLayout();
			case GMFGraphPackage.XY_LAYOUT: return createXYLayout();
			case GMFGraphPackage.XY_LAYOUT_DATA: return createXYLayoutData();
			case GMFGraphPackage.STACK_LAYOUT: return createStackLayout();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GMFGraphPackage.COLOR_CONSTANTS:
				return createColorConstantsFromString(eDataType, initialValue);
			case GMFGraphPackage.FONT_STYLE:
				return createFontStyleFromString(eDataType, initialValue);
			case GMFGraphPackage.DIRECTION:
				return createDirectionFromString(eDataType, initialValue);
			case GMFGraphPackage.LINE_KIND:
				return createLineKindFromString(eDataType, initialValue);
			case GMFGraphPackage.ALIGNMENT:
				return createAlignmentFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GMFGraphPackage.COLOR_CONSTANTS:
				return convertColorConstantsToString(eDataType, instanceValue);
			case GMFGraphPackage.FONT_STYLE:
				return convertFontStyleToString(eDataType, instanceValue);
			case GMFGraphPackage.DIRECTION:
				return convertDirectionToString(eDataType, instanceValue);
			case GMFGraphPackage.LINE_KIND:
				return convertLineKindToString(eDataType, instanceValue);
			case GMFGraphPackage.ALIGNMENT:
				return convertAlignmentToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Canvas createCanvas() {
		CanvasImpl canvas = new CanvasImpl();
		return canvas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FigureGallery createFigureGallery() {
		FigureGalleryImpl figureGallery = new FigureGalleryImpl();
		return figureGallery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compartment createCompartment() {
		CompartmentImpl compartment = new CompartmentImpl();
		return compartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramLabel createDiagramLabel() {
		DiagramLabelImpl diagramLabel = new DiagramLabelImpl();
		return diagramLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralFacet createGeneralFacet() {
		GeneralFacetImpl generalFacet = new GeneralFacetImpl();
		return generalFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentFacet createAlignmentFacet() {
		AlignmentFacetImpl alignmentFacet = new AlignmentFacetImpl();
		return alignmentFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradientFacet createGradientFacet() {
		GradientFacetImpl gradientFacet = new GradientFacetImpl();
		return gradientFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelOffsetFacet createLabelOffsetFacet() {
		LabelOffsetFacetImpl labelOffsetFacet = new LabelOffsetFacetImpl();
		return labelOffsetFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FigureRef createFigureRef() {
		FigureRefImpl figureRef = new FigureRefImpl();
		return figureRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabeledContainer createLabeledContainer() {
		LabeledContainerImpl labeledContainer = new LabeledContainerImpl();
		return labeledContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle createRectangle() {
		RectangleImpl rectangle = new RectangleImpl();
		return rectangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoundedRectangle createRoundedRectangle() {
		RoundedRectangleImpl roundedRectangle = new RoundedRectangleImpl();
		return roundedRectangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ellipse createEllipse() {
		EllipseImpl ellipse = new EllipseImpl();
		return ellipse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polyline createPolyline() {
		PolylineImpl polyline = new PolylineImpl();
		return polyline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polygon createPolygon() {
		PolygonImpl polygon = new PolygonImpl();
		return polygon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolylineConnection createPolylineConnection() {
		PolylineConnectionImpl polylineConnection = new PolylineConnectionImpl();
		return polylineConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolylineDecoration createPolylineDecoration() {
		PolylineDecorationImpl polylineDecoration = new PolylineDecorationImpl();
		return polylineDecoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonDecoration createPolygonDecoration() {
		PolygonDecorationImpl polygonDecoration = new PolygonDecorationImpl();
		return polygonDecoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomFigure createCustomFigure() {
		CustomFigureImpl customFigure = new CustomFigureImpl();
		return customFigure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomDecoration createCustomDecoration() {
		CustomDecorationImpl customDecoration = new CustomDecorationImpl();
		return customDecoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomConnection createCustomConnection() {
		CustomConnectionImpl customConnection = new CustomConnectionImpl();
		return customConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGBColor createRGBColor() {
		RGBColorImpl rgbColor = new RGBColorImpl();
		return rgbColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantColor createConstantColor() {
		ConstantColorImpl constantColor = new ConstantColorImpl();
		return constantColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicFont createBasicFont() {
		BasicFontImpl basicFont = new BasicFontImpl();
		return basicFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension createDimension() {
		DimensionImpl dimension = new DimensionImpl();
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Insets createInsets() {
		InsetsImpl insets = new InsetsImpl();
		return insets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineBorder createLineBorder() {
		LineBorderImpl lineBorder = new LineBorderImpl();
		return lineBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarginBorder createMarginBorder() {
		MarginBorderImpl marginBorder = new MarginBorderImpl();
		return marginBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundBorder createCompoundBorder() {
		CompoundBorderImpl compoundBorder = new CompoundBorderImpl();
		return compoundBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomBorder createCustomBorder() {
		CustomBorderImpl customBorder = new CustomBorderImpl();
		return customBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomLayoutData createCustomLayoutData() {
		CustomLayoutDataImpl customLayoutData = new CustomLayoutDataImpl();
		return customLayoutData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridLayoutData createGridLayoutData() {
		GridLayoutDataImpl gridLayoutData = new GridLayoutDataImpl();
		return gridLayoutData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BorderLayoutData createBorderLayoutData() {
		BorderLayoutDataImpl borderLayoutData = new BorderLayoutDataImpl();
		return borderLayoutData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomLayout createCustomLayout() {
		CustomLayoutImpl customLayout = new CustomLayoutImpl();
		return customLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridLayout createGridLayout() {
		GridLayoutImpl gridLayout = new GridLayoutImpl();
		return gridLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BorderLayout createBorderLayout() {
		BorderLayoutImpl borderLayout = new BorderLayoutImpl();
		return borderLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomAttribute createCustomAttribute() {
		CustomAttributeImpl customAttribute = new CustomAttributeImpl();
		return customAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FigureAccessor createFigureAccessor() {
		FigureAccessorImpl figureAccessor = new FigureAccessorImpl();
		return figureAccessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowLayout createFlowLayout() {
		FlowLayoutImpl flowLayout = new FlowLayoutImpl();
		return flowLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XYLayout createXYLayout() {
		XYLayoutImpl xyLayout = new XYLayoutImpl();
		return xyLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XYLayoutData createXYLayoutData() {
		XYLayoutDataImpl xyLayoutData = new XYLayoutDataImpl();
		return xyLayoutData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StackLayout createStackLayout() {
		StackLayoutImpl stackLayout = new StackLayoutImpl();
		return stackLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorConstants createColorConstantsFromString(EDataType eDataType, String initialValue) {
		ColorConstants result = ColorConstants.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorConstantsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontStyle createFontStyleFromString(EDataType eDataType, String initialValue) {
		FontStyle result = FontStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction createDirectionFromString(EDataType eDataType, String initialValue) {
		Direction result = Direction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineKind createLineKindFromString(EDataType eDataType, String initialValue) {
		LineKind result = LineKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alignment createAlignmentFromString(EDataType eDataType, String initialValue) {
		Alignment result = Alignment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFGraphPackage getGMFGraphPackage() {
		return (GMFGraphPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static GMFGraphPackage getPackage() {
		return GMFGraphPackage.eINSTANCE;
	}

} //GMFGraphFactoryImpl

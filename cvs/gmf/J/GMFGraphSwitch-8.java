/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.gmfgraph.*;

import org.eclipse.gmf.gmfgraph.BasicFont;
import org.eclipse.gmf.gmfgraph.Border;
import org.eclipse.gmf.gmfgraph.BorderLayout;
import org.eclipse.gmf.gmfgraph.BorderLayoutData;
import org.eclipse.gmf.gmfgraph.Canvas;
import org.eclipse.gmf.gmfgraph.Child;
import org.eclipse.gmf.gmfgraph.Color;
import org.eclipse.gmf.gmfgraph.Compartment;
import org.eclipse.gmf.gmfgraph.CompoundBorder;
import org.eclipse.gmf.gmfgraph.Connection;
import org.eclipse.gmf.gmfgraph.ConnectionFigure;
import org.eclipse.gmf.gmfgraph.ConstantColor;
import org.eclipse.gmf.gmfgraph.CustomAttribute;
import org.eclipse.gmf.gmfgraph.CustomBorder;
import org.eclipse.gmf.gmfgraph.CustomClass;
import org.eclipse.gmf.gmfgraph.CustomConnection;
import org.eclipse.gmf.gmfgraph.CustomDecoration;
import org.eclipse.gmf.gmfgraph.CustomFigure;
import org.eclipse.gmf.gmfgraph.CustomLayout;
import org.eclipse.gmf.gmfgraph.CustomLayoutData;
import org.eclipse.gmf.gmfgraph.DecorationFigure;
import org.eclipse.gmf.gmfgraph.DiagramElement;
import org.eclipse.gmf.gmfgraph.Dimension;
import org.eclipse.gmf.gmfgraph.Ellipse;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FigureGallery;
import org.eclipse.gmf.gmfgraph.FigureMarker;
import org.eclipse.gmf.gmfgraph.FigureRef;
import org.eclipse.gmf.gmfgraph.Font;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.GeneralFacet;
import org.eclipse.gmf.gmfgraph.GradientFacet;
import org.eclipse.gmf.gmfgraph.GridLayout;
import org.eclipse.gmf.gmfgraph.GridLayoutData;
import org.eclipse.gmf.gmfgraph.Identity;
import org.eclipse.gmf.gmfgraph.Insets;
import org.eclipse.gmf.gmfgraph.Label;
import org.eclipse.gmf.gmfgraph.LabeledContainer;
import org.eclipse.gmf.gmfgraph.Layout;
import org.eclipse.gmf.gmfgraph.LayoutData;
import org.eclipse.gmf.gmfgraph.Layoutable;
import org.eclipse.gmf.gmfgraph.LineBorder;
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
import org.eclipse.gmf.gmfgraph.Shape;
import org.eclipse.gmf.gmfgraph.VisualFacet;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage
 * @generated
 */
public class GMFGraphSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GMFGraphPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFGraphSwitch() {
		if (modelPackage == null) {
			modelPackage = GMFGraphPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GMFGraphPackage.CANVAS: {
				Canvas canvas = (Canvas)theEObject;
				Object result = caseCanvas(canvas);
				if (result == null) result = caseIdentity(canvas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.FIGURE_GALLERY: {
				FigureGallery figureGallery = (FigureGallery)theEObject;
				Object result = caseFigureGallery(figureGallery);
				if (result == null) result = caseIdentity(figureGallery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.IDENTITY: {
				Identity identity = (Identity)theEObject;
				Object result = caseIdentity(identity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.DIAGRAM_ELEMENT: {
				DiagramElement diagramElement = (DiagramElement)theEObject;
				Object result = caseDiagramElement(diagramElement);
				if (result == null) result = caseIdentity(diagramElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.NODE: {
				Node node = (Node)theEObject;
				Object result = caseNode(node);
				if (result == null) result = caseDiagramElement(node);
				if (result == null) result = caseIdentity(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				Object result = caseConnection(connection);
				if (result == null) result = caseDiagramElement(connection);
				if (result == null) result = caseIdentity(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.COMPARTMENT: {
				Compartment compartment = (Compartment)theEObject;
				Object result = caseCompartment(compartment);
				if (result == null) result = caseDiagramElement(compartment);
				if (result == null) result = caseIdentity(compartment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.CHILD: {
				Child child = (Child)theEObject;
				Object result = caseChild(child);
				if (result == null) result = caseDiagramElement(child);
				if (result == null) result = caseIdentity(child);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.DIAGRAM_LABEL: {
				DiagramLabel diagramLabel = (DiagramLabel)theEObject;
				Object result = caseDiagramLabel(diagramLabel);
				if (result == null) result = caseDiagramElement(diagramLabel);
				if (result == null) result = caseIdentity(diagramLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.VISUAL_FACET: {
				VisualFacet visualFacet = (VisualFacet)theEObject;
				Object result = caseVisualFacet(visualFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.GENERAL_FACET: {
				GeneralFacet generalFacet = (GeneralFacet)theEObject;
				Object result = caseGeneralFacet(generalFacet);
				if (result == null) result = caseVisualFacet(generalFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.ALIGNMENT_FACET: {
				AlignmentFacet alignmentFacet = (AlignmentFacet)theEObject;
				Object result = caseAlignmentFacet(alignmentFacet);
				if (result == null) result = caseVisualFacet(alignmentFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.GRADIENT_FACET: {
				GradientFacet gradientFacet = (GradientFacet)theEObject;
				Object result = caseGradientFacet(gradientFacet);
				if (result == null) result = caseVisualFacet(gradientFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.FIGURE_MARKER: {
				FigureMarker figureMarker = (FigureMarker)theEObject;
				Object result = caseFigureMarker(figureMarker);
				if (result == null) result = caseLayoutable(figureMarker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.FIGURE: {
				Figure figure = (Figure)theEObject;
				Object result = caseFigure(figure);
				if (result == null) result = caseFigureMarker(figure);
				if (result == null) result = caseIdentity(figure);
				if (result == null) result = caseLayoutable(figure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.FIGURE_REF: {
				FigureRef figureRef = (FigureRef)theEObject;
				Object result = caseFigureRef(figureRef);
				if (result == null) result = caseFigureMarker(figureRef);
				if (result == null) result = caseLayoutable(figureRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.CONNECTION_FIGURE: {
				ConnectionFigure connectionFigure = (ConnectionFigure)theEObject;
				Object result = caseConnectionFigure(connectionFigure);
				if (result == null) result = caseFigure(connectionFigure);
				if (result == null) result = caseFigureMarker(connectionFigure);
				if (result == null) result = caseIdentity(connectionFigure);
				if (result == null) result = caseLayoutable(connectionFigure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.DECORATION_FIGURE: {
				DecorationFigure decorationFigure = (DecorationFigure)theEObject;
				Object result = caseDecorationFigure(decorationFigure);
				if (result == null) result = caseFigure(decorationFigure);
				if (result == null) result = caseFigureMarker(decorationFigure);
				if (result == null) result = caseIdentity(decorationFigure);
				if (result == null) result = caseLayoutable(decorationFigure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.SHAPE: {
				Shape shape = (Shape)theEObject;
				Object result = caseShape(shape);
				if (result == null) result = caseFigure(shape);
				if (result == null) result = caseFigureMarker(shape);
				if (result == null) result = caseIdentity(shape);
				if (result == null) result = caseLayoutable(shape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.LABEL: {
				Label label = (Label)theEObject;
				Object result = caseLabel(label);
				if (result == null) result = caseFigure(label);
				if (result == null) result = caseFigureMarker(label);
				if (result == null) result = caseIdentity(label);
				if (result == null) result = caseLayoutable(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.LABELED_CONTAINER: {
				LabeledContainer labeledContainer = (LabeledContainer)theEObject;
				Object result = caseLabeledContainer(labeledContainer);
				if (result == null) result = caseFigure(labeledContainer);
				if (result == null) result = caseFigureMarker(labeledContainer);
				if (result == null) result = caseIdentity(labeledContainer);
				if (result == null) result = caseLayoutable(labeledContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.RECTANGLE: {
				Rectangle rectangle = (Rectangle)theEObject;
				Object result = caseRectangle(rectangle);
				if (result == null) result = caseShape(rectangle);
				if (result == null) result = caseFigure(rectangle);
				if (result == null) result = caseFigureMarker(rectangle);
				if (result == null) result = caseIdentity(rectangle);
				if (result == null) result = caseLayoutable(rectangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.ROUNDED_RECTANGLE: {
				RoundedRectangle roundedRectangle = (RoundedRectangle)theEObject;
				Object result = caseRoundedRectangle(roundedRectangle);
				if (result == null) result = caseShape(roundedRectangle);
				if (result == null) result = caseFigure(roundedRectangle);
				if (result == null) result = caseFigureMarker(roundedRectangle);
				if (result == null) result = caseIdentity(roundedRectangle);
				if (result == null) result = caseLayoutable(roundedRectangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.ELLIPSE: {
				Ellipse ellipse = (Ellipse)theEObject;
				Object result = caseEllipse(ellipse);
				if (result == null) result = caseShape(ellipse);
				if (result == null) result = caseFigure(ellipse);
				if (result == null) result = caseFigureMarker(ellipse);
				if (result == null) result = caseIdentity(ellipse);
				if (result == null) result = caseLayoutable(ellipse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.POLYLINE: {
				Polyline polyline = (Polyline)theEObject;
				Object result = casePolyline(polyline);
				if (result == null) result = caseShape(polyline);
				if (result == null) result = caseFigure(polyline);
				if (result == null) result = caseFigureMarker(polyline);
				if (result == null) result = caseIdentity(polyline);
				if (result == null) result = caseLayoutable(polyline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.POLYGON: {
				Polygon polygon = (Polygon)theEObject;
				Object result = casePolygon(polygon);
				if (result == null) result = casePolyline(polygon);
				if (result == null) result = caseShape(polygon);
				if (result == null) result = caseFigure(polygon);
				if (result == null) result = caseFigureMarker(polygon);
				if (result == null) result = caseIdentity(polygon);
				if (result == null) result = caseLayoutable(polygon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.POLYLINE_CONNECTION: {
				PolylineConnection polylineConnection = (PolylineConnection)theEObject;
				Object result = casePolylineConnection(polylineConnection);
				if (result == null) result = casePolyline(polylineConnection);
				if (result == null) result = caseConnectionFigure(polylineConnection);
				if (result == null) result = caseShape(polylineConnection);
				if (result == null) result = caseFigure(polylineConnection);
				if (result == null) result = caseFigureMarker(polylineConnection);
				if (result == null) result = caseIdentity(polylineConnection);
				if (result == null) result = caseLayoutable(polylineConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.POLYLINE_DECORATION: {
				PolylineDecoration polylineDecoration = (PolylineDecoration)theEObject;
				Object result = casePolylineDecoration(polylineDecoration);
				if (result == null) result = casePolyline(polylineDecoration);
				if (result == null) result = caseDecorationFigure(polylineDecoration);
				if (result == null) result = caseShape(polylineDecoration);
				if (result == null) result = caseFigure(polylineDecoration);
				if (result == null) result = caseFigureMarker(polylineDecoration);
				if (result == null) result = caseIdentity(polylineDecoration);
				if (result == null) result = caseLayoutable(polylineDecoration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.POLYGON_DECORATION: {
				PolygonDecoration polygonDecoration = (PolygonDecoration)theEObject;
				Object result = casePolygonDecoration(polygonDecoration);
				if (result == null) result = casePolygon(polygonDecoration);
				if (result == null) result = caseDecorationFigure(polygonDecoration);
				if (result == null) result = casePolyline(polygonDecoration);
				if (result == null) result = caseFigure(polygonDecoration);
				if (result == null) result = caseShape(polygonDecoration);
				if (result == null) result = caseFigureMarker(polygonDecoration);
				if (result == null) result = caseIdentity(polygonDecoration);
				if (result == null) result = caseLayoutable(polygonDecoration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.CUSTOM_CLASS: {
				CustomClass customClass = (CustomClass)theEObject;
				Object result = caseCustomClass(customClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.CUSTOM_FIGURE: {
				CustomFigure customFigure = (CustomFigure)theEObject;
				Object result = caseCustomFigure(customFigure);
				if (result == null) result = caseFigure(customFigure);
				if (result == null) result = caseCustomClass(customFigure);
				if (result == null) result = caseFigureMarker(customFigure);
				if (result == null) result = caseIdentity(customFigure);
				if (result == null) result = caseLayoutable(customFigure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.CUSTOM_DECORATION: {
				CustomDecoration customDecoration = (CustomDecoration)theEObject;
				Object result = caseCustomDecoration(customDecoration);
				if (result == null) result = caseCustomFigure(customDecoration);
				if (result == null) result = caseDecorationFigure(customDecoration);
				if (result == null) result = caseFigure(customDecoration);
				if (result == null) result = caseCustomClass(customDecoration);
				if (result == null) result = caseFigureMarker(customDecoration);
				if (result == null) result = caseIdentity(customDecoration);
				if (result == null) result = caseLayoutable(customDecoration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.CUSTOM_CONNECTION: {
				CustomConnection customConnection = (CustomConnection)theEObject;
				Object result = caseCustomConnection(customConnection);
				if (result == null) result = caseCustomFigure(customConnection);
				if (result == null) result = caseConnectionFigure(customConnection);
				if (result == null) result = caseFigure(customConnection);
				if (result == null) result = caseCustomClass(customConnection);
				if (result == null) result = caseFigureMarker(customConnection);
				if (result == null) result = caseIdentity(customConnection);
				if (result == null) result = caseLayoutable(customConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.COLOR: {
				Color color = (Color)theEObject;
				Object result = caseColor(color);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.RGB_COLOR: {
				RGBColor rgbColor = (RGBColor)theEObject;
				Object result = caseRGBColor(rgbColor);
				if (result == null) result = caseColor(rgbColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.CONSTANT_COLOR: {
				ConstantColor constantColor = (ConstantColor)theEObject;
				Object result = caseConstantColor(constantColor);
				if (result == null) result = caseColor(constantColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.FONT: {
				Font font = (Font)theEObject;
				Object result = caseFont(font);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.BASIC_FONT: {
				BasicFont basicFont = (BasicFont)theEObject;
				Object result = caseBasicFont(basicFont);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.POINT: {
				Point point = (Point)theEObject;
				Object result = casePoint(point);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.DIMENSION: {
				Dimension dimension = (Dimension)theEObject;
				Object result = caseDimension(dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.INSETS: {
				Insets insets = (Insets)theEObject;
				Object result = caseInsets(insets);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.BORDER: {
				Border border = (Border)theEObject;
				Object result = caseBorder(border);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.LINE_BORDER: {
				LineBorder lineBorder = (LineBorder)theEObject;
				Object result = caseLineBorder(lineBorder);
				if (result == null) result = caseBorder(lineBorder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.MARGIN_BORDER: {
				MarginBorder marginBorder = (MarginBorder)theEObject;
				Object result = caseMarginBorder(marginBorder);
				if (result == null) result = caseBorder(marginBorder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.COMPOUND_BORDER: {
				CompoundBorder compoundBorder = (CompoundBorder)theEObject;
				Object result = caseCompoundBorder(compoundBorder);
				if (result == null) result = caseBorder(compoundBorder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.CUSTOM_BORDER: {
				CustomBorder customBorder = (CustomBorder)theEObject;
				Object result = caseCustomBorder(customBorder);
				if (result == null) result = caseBorder(customBorder);
				if (result == null) result = caseCustomClass(customBorder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.LAYOUT_DATA: {
				LayoutData layoutData = (LayoutData)theEObject;
				Object result = caseLayoutData(layoutData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.CUSTOM_LAYOUT_DATA: {
				CustomLayoutData customLayoutData = (CustomLayoutData)theEObject;
				Object result = caseCustomLayoutData(customLayoutData);
				if (result == null) result = caseLayoutData(customLayoutData);
				if (result == null) result = caseCustomClass(customLayoutData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.GRID_LAYOUT_DATA: {
				GridLayoutData gridLayoutData = (GridLayoutData)theEObject;
				Object result = caseGridLayoutData(gridLayoutData);
				if (result == null) result = caseLayoutData(gridLayoutData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.BORDER_LAYOUT_DATA: {
				BorderLayoutData borderLayoutData = (BorderLayoutData)theEObject;
				Object result = caseBorderLayoutData(borderLayoutData);
				if (result == null) result = caseLayoutData(borderLayoutData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.LAYOUTABLE: {
				Layoutable layoutable = (Layoutable)theEObject;
				Object result = caseLayoutable(layoutable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.LAYOUT: {
				Layout layout = (Layout)theEObject;
				Object result = caseLayout(layout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.CUSTOM_LAYOUT: {
				CustomLayout customLayout = (CustomLayout)theEObject;
				Object result = caseCustomLayout(customLayout);
				if (result == null) result = caseLayout(customLayout);
				if (result == null) result = caseCustomClass(customLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.GRID_LAYOUT: {
				GridLayout gridLayout = (GridLayout)theEObject;
				Object result = caseGridLayout(gridLayout);
				if (result == null) result = caseLayout(gridLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.BORDER_LAYOUT: {
				BorderLayout borderLayout = (BorderLayout)theEObject;
				Object result = caseBorderLayout(borderLayout);
				if (result == null) result = caseLayout(borderLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.CUSTOM_ATTRIBUTE: {
				CustomAttribute customAttribute = (CustomAttribute)theEObject;
				Object result = caseCustomAttribute(customAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.FLOW_LAYOUT: {
				FlowLayout flowLayout = (FlowLayout)theEObject;
				Object result = caseFlowLayout(flowLayout);
				if (result == null) result = caseLayout(flowLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.XY_LAYOUT: {
				XYLayout xyLayout = (XYLayout)theEObject;
				Object result = caseXYLayout(xyLayout);
				if (result == null) result = caseLayout(xyLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.XY_LAYOUT_DATA: {
				XYLayoutData xyLayoutData = (XYLayoutData)theEObject;
				Object result = caseXYLayoutData(xyLayoutData);
				if (result == null) result = caseLayoutData(xyLayoutData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.STACK_LAYOUT: {
				StackLayout stackLayout = (StackLayout)theEObject;
				Object result = caseStackLayout(stackLayout);
				if (result == null) result = caseLayout(stackLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Canvas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Canvas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCanvas(Canvas object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Figure Gallery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Figure Gallery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFigureGallery(FigureGallery object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIdentity(Identity object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Diagram Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Diagram Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDiagramElement(DiagramElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCompartment(Compartment object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseChild(Child object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Diagram Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Diagram Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDiagramLabel(DiagramLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Visual Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Visual Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVisualFacet(VisualFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>General Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>General Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGeneralFacet(GeneralFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Alignment Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Alignment Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAlignmentFacet(AlignmentFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gradient Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gradient Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGradientFacet(GradientFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Figure Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Figure Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFigureMarker(FigureMarker object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Figure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Figure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFigure(Figure object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Figure Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Figure Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFigureRef(FigureRef object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Connection Figure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Connection Figure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConnectionFigure(ConnectionFigure object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Decoration Figure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Decoration Figure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDecorationFigure(DecorationFigure object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseShape(Shape object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Labeled Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Labeled Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLabeledContainer(LabeledContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Rectangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRectangle(Rectangle object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Rounded Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Rounded Rectangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRoundedRectangle(RoundedRectangle object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ellipse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ellipse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEllipse(Ellipse object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Polyline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Polyline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePolyline(Polyline object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Polygon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePolygon(Polygon object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Polyline Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Polyline Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePolylineConnection(PolylineConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Polyline Decoration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Polyline Decoration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePolylineDecoration(PolylineDecoration object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Polygon Decoration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Polygon Decoration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePolygonDecoration(PolygonDecoration object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Custom Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Custom Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCustomClass(CustomClass object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Custom Figure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Custom Figure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCustomFigure(CustomFigure object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Custom Decoration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Custom Decoration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCustomDecoration(CustomDecoration object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Custom Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Custom Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCustomConnection(CustomConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseColor(Color object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>RGB Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>RGB Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRGBColor(RGBColor object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Constant Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Constant Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConstantColor(ConstantColor object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Font</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Font</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFont(Font object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Basic Font</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Basic Font</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBasicFont(BasicFont object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePoint(Point object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDimension(Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Insets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Insets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInsets(Insets object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Border</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Border</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBorder(Border object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Line Border</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Line Border</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLineBorder(LineBorder object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Margin Border</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Margin Border</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMarginBorder(MarginBorder object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Compound Border</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Compound Border</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCompoundBorder(CompoundBorder object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Custom Border</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Custom Border</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCustomBorder(CustomBorder object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Layout Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Layout Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLayoutData(LayoutData object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Custom Layout Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Custom Layout Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCustomLayoutData(CustomLayoutData object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Grid Layout Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Grid Layout Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGridLayoutData(GridLayoutData object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Border Layout Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Border Layout Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBorderLayoutData(BorderLayoutData object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Layoutable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Layoutable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLayoutable(Layoutable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLayout(Layout object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Custom Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Custom Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCustomLayout(CustomLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Grid Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Grid Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGridLayout(GridLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Border Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Border Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBorderLayout(BorderLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Custom Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Custom Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCustomAttribute(CustomAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Flow Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Flow Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFlowLayout(FlowLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>XY Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>XY Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseXYLayout(XYLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>XY Layout Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>XY Layout Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseXYLayoutData(XYLayoutData object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Stack Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Stack Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStackLayout(StackLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //GMFGraphSwitch

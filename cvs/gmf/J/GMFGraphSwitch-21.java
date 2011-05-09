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
public class GMFGraphSwitch<T> {
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
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GMFGraphPackage.CANVAS: {
				Canvas canvas = (Canvas)theEObject;
				T result = caseCanvas(canvas);
				if (result == null) result = caseIdentity(canvas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.FIGURE_GALLERY: {
				FigureGallery figureGallery = (FigureGallery)theEObject;
				T result = caseFigureGallery(figureGallery);
				if (result == null) result = caseIdentity(figureGallery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.IDENTITY: {
				Identity identity = (Identity)theEObject;
				T result = caseIdentity(identity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.DIAGRAM_ELEMENT: {
				DiagramElement diagramElement = (DiagramElement)theEObject;
				T result = caseDiagramElement(diagramElement);
				if (result == null) result = caseIdentity(diagramElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.ABSTRACT_NODE: {
				AbstractNode abstractNode = (AbstractNode)theEObject;
				T result = caseAbstractNode(abstractNode);
				if (result == null) result = caseDiagramElement(abstractNode);
				if (result == null) result = caseIdentity(abstractNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseAbstractNode(node);
				if (result == null) result = caseDiagramElement(node);
				if (result == null) result = caseIdentity(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = caseDiagramElement(connection);
				if (result == null) result = caseIdentity(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.COMPARTMENT: {
				Compartment compartment = (Compartment)theEObject;
				T result = caseCompartment(compartment);
				if (result == null) result = caseDiagramElement(compartment);
				if (result == null) result = caseIdentity(compartment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.DIAGRAM_LABEL: {
				DiagramLabel diagramLabel = (DiagramLabel)theEObject;
				T result = caseDiagramLabel(diagramLabel);
				if (result == null) result = caseNode(diagramLabel);
				if (result == null) result = caseAbstractNode(diagramLabel);
				if (result == null) result = caseDiagramElement(diagramLabel);
				if (result == null) result = caseIdentity(diagramLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.VISUAL_FACET: {
				VisualFacet visualFacet = (VisualFacet)theEObject;
				T result = caseVisualFacet(visualFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.GENERAL_FACET: {
				GeneralFacet generalFacet = (GeneralFacet)theEObject;
				T result = caseGeneralFacet(generalFacet);
				if (result == null) result = caseVisualFacet(generalFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.ALIGNMENT_FACET: {
				AlignmentFacet alignmentFacet = (AlignmentFacet)theEObject;
				T result = caseAlignmentFacet(alignmentFacet);
				if (result == null) result = caseVisualFacet(alignmentFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.GRADIENT_FACET: {
				GradientFacet gradientFacet = (GradientFacet)theEObject;
				T result = caseGradientFacet(gradientFacet);
				if (result == null) result = caseVisualFacet(gradientFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.LABEL_OFFSET_FACET: {
				LabelOffsetFacet labelOffsetFacet = (LabelOffsetFacet)theEObject;
				T result = caseLabelOffsetFacet(labelOffsetFacet);
				if (result == null) result = caseVisualFacet(labelOffsetFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.DEFAULT_SIZE_FACET: {
				DefaultSizeFacet defaultSizeFacet = (DefaultSizeFacet)theEObject;
				T result = caseDefaultSizeFacet(defaultSizeFacet);
				if (result == null) result = caseVisualFacet(defaultSizeFacet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.FIGURE: {
				Figure figure = (Figure)theEObject;
				T result = caseFigure(figure);
				if (result == null) result = caseLayoutable(figure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.ABSTRACT_FIGURE: {
				AbstractFigure abstractFigure = (AbstractFigure)theEObject;
				T result = caseAbstractFigure(abstractFigure);
				if (result == null) result = caseFigure(abstractFigure);
				if (result == null) result = caseLayoutable(abstractFigure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.FIGURE_DESCRIPTOR: {
				FigureDescriptor figureDescriptor = (FigureDescriptor)theEObject;
				T result = caseFigureDescriptor(figureDescriptor);
				if (result == null) result = caseIdentity(figureDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.CHILD_ACCESS: {
				ChildAccess childAccess = (ChildAccess)theEObject;
				T result = caseChildAccess(childAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.REAL_FIGURE: {
				RealFigure realFigure = (RealFigure)theEObject;
				T result = caseRealFigure(realFigure);
				if (result == null) result = caseAbstractFigure(realFigure);
				if (result == null) result = caseFigure(realFigure);
				if (result == null) result = caseLayoutable(realFigure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.FIGURE_REF: {
				FigureRef figureRef = (FigureRef)theEObject;
				T result = caseFigureRef(figureRef);
				if (result == null) result = caseAbstractFigure(figureRef);
				if (result == null) result = caseFigure(figureRef);
				if (result == null) result = caseLayoutable(figureRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.CONNECTION_FIGURE: {
				ConnectionFigure connectionFigure = (ConnectionFigure)theEObject;
				T result = caseConnectionFigure(connectionFigure);
				if (result == null) result = caseRealFigure(connectionFigure);
				if (result == null) result = caseAbstractFigure(connectionFigure);
				if (result == null) result = caseFigure(connectionFigure);
				if (result == null) result = caseLayoutable(connectionFigure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.DECORATION_FIGURE: {
				DecorationFigure decorationFigure = (DecorationFigure)theEObject;
				T result = caseDecorationFigure(decorationFigure);
				if (result == null) result = caseRealFigure(decorationFigure);
				if (result == null) result = caseAbstractFigure(decorationFigure);
				if (result == null) result = caseFigure(decorationFigure);
				if (result == null) result = caseLayoutable(decorationFigure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.SHAPE: {
				Shape shape = (Shape)theEObject;
				T result = caseShape(shape);
				if (result == null) result = caseRealFigure(shape);
				if (result == null) result = caseAbstractFigure(shape);
				if (result == null) result = caseFigure(shape);
				if (result == null) result = caseLayoutable(shape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = caseRealFigure(label);
				if (result == null) result = caseAbstractFigure(label);
				if (result == null) result = caseFigure(label);
				if (result == null) result = caseLayoutable(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.LABELED_CONTAINER: {
				LabeledContainer labeledContainer = (LabeledContainer)theEObject;
				T result = caseLabeledContainer(labeledContainer);
				if (result == null) result = caseRealFigure(labeledContainer);
				if (result == null) result = caseAbstractFigure(labeledContainer);
				if (result == null) result = caseFigure(labeledContainer);
				if (result == null) result = caseLayoutable(labeledContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.RECTANGLE: {
				Rectangle rectangle = (Rectangle)theEObject;
				T result = caseRectangle(rectangle);
				if (result == null) result = caseShape(rectangle);
				if (result == null) result = caseRealFigure(rectangle);
				if (result == null) result = caseAbstractFigure(rectangle);
				if (result == null) result = caseFigure(rectangle);
				if (result == null) result = caseLayoutable(rectangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.ROUNDED_RECTANGLE: {
				RoundedRectangle roundedRectangle = (RoundedRectangle)theEObject;
				T result = caseRoundedRectangle(roundedRectangle);
				if (result == null) result = caseShape(roundedRectangle);
				if (result == null) result = caseRealFigure(roundedRectangle);
				if (result == null) result = caseAbstractFigure(roundedRectangle);
				if (result == null) result = caseFigure(roundedRectangle);
				if (result == null) result = caseLayoutable(roundedRectangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.ELLIPSE: {
				Ellipse ellipse = (Ellipse)theEObject;
				T result = caseEllipse(ellipse);
				if (result == null) result = caseShape(ellipse);
				if (result == null) result = caseRealFigure(ellipse);
				if (result == null) result = caseAbstractFigure(ellipse);
				if (result == null) result = caseFigure(ellipse);
				if (result == null) result = caseLayoutable(ellipse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.POLYLINE: {
				Polyline polyline = (Polyline)theEObject;
				T result = casePolyline(polyline);
				if (result == null) result = caseShape(polyline);
				if (result == null) result = caseRealFigure(polyline);
				if (result == null) result = caseAbstractFigure(polyline);
				if (result == null) result = caseFigure(polyline);
				if (result == null) result = caseLayoutable(polyline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.POLYGON: {
				Polygon polygon = (Polygon)theEObject;
				T result = casePolygon(polygon);
				if (result == null) result = casePolyline(polygon);
				if (result == null) result = caseShape(polygon);
				if (result == null) result = caseRealFigure(polygon);
				if (result == null) result = caseAbstractFigure(polygon);
				if (result == null) result = caseFigure(polygon);
				if (result == null) result = caseLayoutable(polygon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.SCALABLE_POLYGON: {
				ScalablePolygon scalablePolygon = (ScalablePolygon)theEObject;
				T result = caseScalablePolygon(scalablePolygon);
				if (result == null) result = casePolygon(scalablePolygon);
				if (result == null) result = casePolyline(scalablePolygon);
				if (result == null) result = caseShape(scalablePolygon);
				if (result == null) result = caseRealFigure(scalablePolygon);
				if (result == null) result = caseAbstractFigure(scalablePolygon);
				if (result == null) result = caseFigure(scalablePolygon);
				if (result == null) result = caseLayoutable(scalablePolygon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.POLYLINE_CONNECTION: {
				PolylineConnection polylineConnection = (PolylineConnection)theEObject;
				T result = casePolylineConnection(polylineConnection);
				if (result == null) result = casePolyline(polylineConnection);
				if (result == null) result = caseConnectionFigure(polylineConnection);
				if (result == null) result = caseShape(polylineConnection);
				if (result == null) result = caseRealFigure(polylineConnection);
				if (result == null) result = caseAbstractFigure(polylineConnection);
				if (result == null) result = caseFigure(polylineConnection);
				if (result == null) result = caseLayoutable(polylineConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.POLYLINE_DECORATION: {
				PolylineDecoration polylineDecoration = (PolylineDecoration)theEObject;
				T result = casePolylineDecoration(polylineDecoration);
				if (result == null) result = casePolyline(polylineDecoration);
				if (result == null) result = caseDecorationFigure(polylineDecoration);
				if (result == null) result = caseShape(polylineDecoration);
				if (result == null) result = caseRealFigure(polylineDecoration);
				if (result == null) result = caseAbstractFigure(polylineDecoration);
				if (result == null) result = caseFigure(polylineDecoration);
				if (result == null) result = caseLayoutable(polylineDecoration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.POLYGON_DECORATION: {
				PolygonDecoration polygonDecoration = (PolygonDecoration)theEObject;
				T result = casePolygonDecoration(polygonDecoration);
				if (result == null) result = casePolygon(polygonDecoration);
				if (result == null) result = caseDecorationFigure(polygonDecoration);
				if (result == null) result = casePolyline(polygonDecoration);
				if (result == null) result = caseRealFigure(polygonDecoration);
				if (result == null) result = caseShape(polygonDecoration);
				if (result == null) result = caseAbstractFigure(polygonDecoration);
				if (result == null) result = caseFigure(polygonDecoration);
				if (result == null) result = caseLayoutable(polygonDecoration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.CUSTOM_CLASS: {
				CustomClass customClass = (CustomClass)theEObject;
				T result = caseCustomClass(customClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.CUSTOM_ATTRIBUTE: {
				CustomAttribute customAttribute = (CustomAttribute)theEObject;
				T result = caseCustomAttribute(customAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.FIGURE_ACCESSOR: {
				FigureAccessor figureAccessor = (FigureAccessor)theEObject;
				T result = caseFigureAccessor(figureAccessor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.CUSTOM_FIGURE: {
				CustomFigure customFigure = (CustomFigure)theEObject;
				T result = caseCustomFigure(customFigure);
				if (result == null) result = caseRealFigure(customFigure);
				if (result == null) result = caseCustomClass(customFigure);
				if (result == null) result = caseAbstractFigure(customFigure);
				if (result == null) result = caseFigure(customFigure);
				if (result == null) result = caseLayoutable(customFigure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.CUSTOM_DECORATION: {
				CustomDecoration customDecoration = (CustomDecoration)theEObject;
				T result = caseCustomDecoration(customDecoration);
				if (result == null) result = caseCustomFigure(customDecoration);
				if (result == null) result = caseDecorationFigure(customDecoration);
				if (result == null) result = caseRealFigure(customDecoration);
				if (result == null) result = caseCustomClass(customDecoration);
				if (result == null) result = caseAbstractFigure(customDecoration);
				if (result == null) result = caseFigure(customDecoration);
				if (result == null) result = caseLayoutable(customDecoration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.CUSTOM_CONNECTION: {
				CustomConnection customConnection = (CustomConnection)theEObject;
				T result = caseCustomConnection(customConnection);
				if (result == null) result = caseCustomFigure(customConnection);
				if (result == null) result = caseConnectionFigure(customConnection);
				if (result == null) result = caseRealFigure(customConnection);
				if (result == null) result = caseCustomClass(customConnection);
				if (result == null) result = caseAbstractFigure(customConnection);
				if (result == null) result = caseFigure(customConnection);
				if (result == null) result = caseLayoutable(customConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.COLOR: {
				Color color = (Color)theEObject;
				T result = caseColor(color);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.RGB_COLOR: {
				RGBColor rgbColor = (RGBColor)theEObject;
				T result = caseRGBColor(rgbColor);
				if (result == null) result = caseColor(rgbColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.CONSTANT_COLOR: {
				ConstantColor constantColor = (ConstantColor)theEObject;
				T result = caseConstantColor(constantColor);
				if (result == null) result = caseColor(constantColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.FONT: {
				Font font = (Font)theEObject;
				T result = caseFont(font);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.BASIC_FONT: {
				BasicFont basicFont = (BasicFont)theEObject;
				T result = caseBasicFont(basicFont);
				if (result == null) result = caseFont(basicFont);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.POINT: {
				Point point = (Point)theEObject;
				T result = casePoint(point);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.DIMENSION: {
				Dimension dimension = (Dimension)theEObject;
				T result = caseDimension(dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.INSETS: {
				Insets insets = (Insets)theEObject;
				T result = caseInsets(insets);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.BORDER: {
				Border border = (Border)theEObject;
				T result = caseBorder(border);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.BORDER_REF: {
				BorderRef borderRef = (BorderRef)theEObject;
				T result = caseBorderRef(borderRef);
				if (result == null) result = caseBorder(borderRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.LINE_BORDER: {
				LineBorder lineBorder = (LineBorder)theEObject;
				T result = caseLineBorder(lineBorder);
				if (result == null) result = caseBorder(lineBorder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.MARGIN_BORDER: {
				MarginBorder marginBorder = (MarginBorder)theEObject;
				T result = caseMarginBorder(marginBorder);
				if (result == null) result = caseBorder(marginBorder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.COMPOUND_BORDER: {
				CompoundBorder compoundBorder = (CompoundBorder)theEObject;
				T result = caseCompoundBorder(compoundBorder);
				if (result == null) result = caseBorder(compoundBorder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.CUSTOM_BORDER: {
				CustomBorder customBorder = (CustomBorder)theEObject;
				T result = caseCustomBorder(customBorder);
				if (result == null) result = caseBorder(customBorder);
				if (result == null) result = caseCustomClass(customBorder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.LAYOUT_DATA: {
				LayoutData layoutData = (LayoutData)theEObject;
				T result = caseLayoutData(layoutData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.CUSTOM_LAYOUT_DATA: {
				CustomLayoutData customLayoutData = (CustomLayoutData)theEObject;
				T result = caseCustomLayoutData(customLayoutData);
				if (result == null) result = caseLayoutData(customLayoutData);
				if (result == null) result = caseCustomClass(customLayoutData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.GRID_LAYOUT_DATA: {
				GridLayoutData gridLayoutData = (GridLayoutData)theEObject;
				T result = caseGridLayoutData(gridLayoutData);
				if (result == null) result = caseLayoutData(gridLayoutData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.BORDER_LAYOUT_DATA: {
				BorderLayoutData borderLayoutData = (BorderLayoutData)theEObject;
				T result = caseBorderLayoutData(borderLayoutData);
				if (result == null) result = caseLayoutData(borderLayoutData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.LAYOUTABLE: {
				Layoutable layoutable = (Layoutable)theEObject;
				T result = caseLayoutable(layoutable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.LAYOUT: {
				Layout layout = (Layout)theEObject;
				T result = caseLayout(layout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.LAYOUT_REF: {
				LayoutRef layoutRef = (LayoutRef)theEObject;
				T result = caseLayoutRef(layoutRef);
				if (result == null) result = caseLayout(layoutRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.CUSTOM_LAYOUT: {
				CustomLayout customLayout = (CustomLayout)theEObject;
				T result = caseCustomLayout(customLayout);
				if (result == null) result = caseLayout(customLayout);
				if (result == null) result = caseCustomClass(customLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.GRID_LAYOUT: {
				GridLayout gridLayout = (GridLayout)theEObject;
				T result = caseGridLayout(gridLayout);
				if (result == null) result = caseLayout(gridLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.BORDER_LAYOUT: {
				BorderLayout borderLayout = (BorderLayout)theEObject;
				T result = caseBorderLayout(borderLayout);
				if (result == null) result = caseLayout(borderLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.FLOW_LAYOUT: {
				FlowLayout flowLayout = (FlowLayout)theEObject;
				T result = caseFlowLayout(flowLayout);
				if (result == null) result = caseLayout(flowLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.XY_LAYOUT: {
				XYLayout xyLayout = (XYLayout)theEObject;
				T result = caseXYLayout(xyLayout);
				if (result == null) result = caseLayout(xyLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.XY_LAYOUT_DATA: {
				XYLayoutData xyLayoutData = (XYLayoutData)theEObject;
				T result = caseXYLayoutData(xyLayoutData);
				if (result == null) result = caseLayoutData(xyLayoutData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGraphPackage.STACK_LAYOUT: {
				StackLayout stackLayout = (StackLayout)theEObject;
				T result = caseStackLayout(stackLayout);
				if (result == null) result = caseLayout(stackLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Canvas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Canvas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCanvas(Canvas object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Figure Gallery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Figure Gallery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFigureGallery(FigureGallery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentity(Identity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramElement(DiagramElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNode(AbstractNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Child Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Child Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChildAccess(ChildAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Figure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Figure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealFigure(RealFigure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartment(Compartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramLabel(DiagramLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visual Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visual Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualFacet(VisualFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralFacet(GeneralFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alignment Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alignment Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlignmentFacet(AlignmentFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gradient Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gradient Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGradientFacet(GradientFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Offset Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Offset Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelOffsetFacet(LabelOffsetFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Size Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Size Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultSizeFacet(DefaultSizeFacet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Figure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Figure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFigure(Figure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Figure Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Figure Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFigureDescriptor(FigureDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Figure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Figure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFigure(AbstractFigure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Figure Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Figure Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFigureRef(FigureRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Figure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Figure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionFigure(ConnectionFigure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decoration Figure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decoration Figure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecorationFigure(DecorationFigure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShape(Shape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeled Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeledContainer(LabeledContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectangle(Rectangle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rounded Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rounded Rectangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoundedRectangle(RoundedRectangle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ellipse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ellipse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEllipse(Ellipse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polyline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polyline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolyline(Polyline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygon(Polygon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalable Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalable Polygon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalablePolygon(ScalablePolygon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polyline Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polyline Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolylineConnection(PolylineConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polyline Decoration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polyline Decoration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolylineDecoration(PolylineDecoration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon Decoration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon Decoration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygonDecoration(PolygonDecoration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomClass(CustomClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Figure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Figure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomFigure(CustomFigure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Decoration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Decoration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomDecoration(CustomDecoration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomConnection(CustomConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColor(Color object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RGB Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RGB Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRGBColor(RGBColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantColor(ConstantColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFont(Font object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Font</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Font</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicFont(BasicFont object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoint(Point object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimension(Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsets(Insets object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Border</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Border</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBorder(Border object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Border Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Border Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBorderRef(BorderRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Border</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Border</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineBorder(LineBorder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Margin Border</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Margin Border</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarginBorder(MarginBorder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Border</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Border</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundBorder(CompoundBorder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Border</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Border</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomBorder(CustomBorder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayoutData(LayoutData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Layout Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Layout Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomLayoutData(CustomLayoutData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Layout Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Layout Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridLayoutData(GridLayoutData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Border Layout Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Border Layout Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBorderLayoutData(BorderLayoutData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layoutable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layoutable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayoutable(Layoutable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayout(Layout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayoutRef(LayoutRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomLayout(CustomLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridLayout(GridLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Border Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Border Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBorderLayout(BorderLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomAttribute(CustomAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Figure Accessor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Figure Accessor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFigureAccessor(FigureAccessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowLayout(FlowLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XY Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XY Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXYLayout(XYLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XY Layout Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XY Layout Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXYLayoutData(XYLayoutData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stack Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stack Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStackLayout(StackLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //GMFGraphSwitch

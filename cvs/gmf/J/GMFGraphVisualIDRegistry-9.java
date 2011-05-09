package org.eclipse.gmf.graphdef.editor.part;

import org.eclipse.core.runtime.Platform;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.gmfgraph.Canvas;
import org.eclipse.gmf.gmfgraph.Compartment;
import org.eclipse.gmf.gmfgraph.Connection;
import org.eclipse.gmf.gmfgraph.Ellipse;
import org.eclipse.gmf.gmfgraph.FigureGallery;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.Node;
import org.eclipse.gmf.gmfgraph.Polyline;
import org.eclipse.gmf.gmfgraph.Rectangle;
import org.eclipse.gmf.gmfgraph.RoundedRectangle;

import org.eclipse.gmf.graphdef.editor.edit.parts.CanvasEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.CompartmentEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Compartment_VisualFacetsEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Compartment_nameEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.ConnectionEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Connection_VisualFacetsEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Connection_nameEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Ellipse2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.EllipseEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.FigureGalleryEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.FigureGallery_FiguresEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.FigureGallery_nameEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.NodeEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Node_VisualFacetsEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Node_nameEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Polyline2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.PolylineEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Rectangle2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.RectangleEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.RoundedRectangle2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.RoundedRectangleEditPart;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented 
 * by a domain model object.
 *
 * @generated
 */
public class GMFGraphVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = GMFGraphDiagramEditorPlugin.getInstance().getBundle().getSymbolicName() + "/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (CanvasEditPart.MODEL_ID.equals(view.getType())) {
				return CanvasEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				GMFGraphDiagramEditorPlugin.getInstance().logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		EClass domainElementMetaclass = domainElement.eClass();
		return getDiagramVisualID(domainElement, domainElementMetaclass);
	}

	/**
	 * @generated
	 */
	private static int getDiagramVisualID(EObject domainElement, EClass domainElementMetaclass) {
		if (GMFGraphPackage.eINSTANCE.getCanvas().isSuperTypeOf(domainElementMetaclass) && isDiagramCanvas_79((Canvas) domainElement)) {
			return CanvasEditPart.VISUAL_ID;
		}
		return getUnrecognizedDiagramID(domainElement);
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		EClass domainElementMetaclass = domainElement.eClass();
		return getNodeVisualID(containerView, domainElement, domainElementMetaclass, null);
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement, EClass domainElementMetaclass, String semanticHint) {
		String containerModelID = getModelID(containerView);
		if (!CanvasEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (CanvasEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CanvasEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		int nodeVisualID = semanticHint != null ? getVisualID(semanticHint) : -1;
		switch (containerVisualID) {
		case CompartmentEditPart.VISUAL_ID:
			if (Compartment_nameEditPart.VISUAL_ID == nodeVisualID) {
				return Compartment_nameEditPart.VISUAL_ID;
			}
			if (Compartment_VisualFacetsEditPart.VISUAL_ID == nodeVisualID) {
				return Compartment_VisualFacetsEditPart.VISUAL_ID;
			}
			return getUnrecognizedCompartment_1001ChildNodeID(domainElement, semanticHint);
		case NodeEditPart.VISUAL_ID:
			if (Node_nameEditPart.VISUAL_ID == nodeVisualID) {
				return Node_nameEditPart.VISUAL_ID;
			}
			if (Node_VisualFacetsEditPart.VISUAL_ID == nodeVisualID) {
				return Node_VisualFacetsEditPart.VISUAL_ID;
			}
			return getUnrecognizedNode_1002ChildNodeID(domainElement, semanticHint);
		case ConnectionEditPart.VISUAL_ID:
			if (Connection_nameEditPart.VISUAL_ID == nodeVisualID) {
				return Connection_nameEditPart.VISUAL_ID;
			}
			if (Connection_VisualFacetsEditPart.VISUAL_ID == nodeVisualID) {
				return Connection_VisualFacetsEditPart.VISUAL_ID;
			}
			return getUnrecognizedConnection_1003ChildNodeID(domainElement, semanticHint);
		case FigureGalleryEditPart.VISUAL_ID:
			if (FigureGallery_nameEditPart.VISUAL_ID == nodeVisualID) {
				return FigureGallery_nameEditPart.VISUAL_ID;
			}
			if (FigureGallery_FiguresEditPart.VISUAL_ID == nodeVisualID) {
				return FigureGallery_FiguresEditPart.VISUAL_ID;
			}
			return getUnrecognizedFigureGallery_1004ChildNodeID(domainElement, semanticHint);
		case RectangleEditPart.VISUAL_ID:
			if ((semanticHint == null || Rectangle2EditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getRectangle().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeRectangle_2002((Rectangle) domainElement))) {
				return Rectangle2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EllipseEditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getEllipse().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEllipse_2003((Ellipse) domainElement))) {
				return EllipseEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || RoundedRectangleEditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getRoundedRectangle().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeRoundedRectangle_2004((RoundedRectangle) domainElement))) {
				return RoundedRectangleEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || PolylineEditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getPolyline().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePolyline_2005((Polyline) domainElement))) {
				return PolylineEditPart.VISUAL_ID;
			}
			return getUnrecognizedRectangle_2001ChildNodeID(domainElement, semanticHint);
		case Rectangle2EditPart.VISUAL_ID:
			if ((semanticHint == null || Rectangle2EditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getRectangle().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeRectangle_2002((Rectangle) domainElement))) {
				return Rectangle2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EllipseEditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getEllipse().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEllipse_2003((Ellipse) domainElement))) {
				return EllipseEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || RoundedRectangleEditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getRoundedRectangle().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeRoundedRectangle_2004((RoundedRectangle) domainElement))) {
				return RoundedRectangleEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || PolylineEditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getPolyline().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePolyline_2005((Polyline) domainElement))) {
				return PolylineEditPart.VISUAL_ID;
			}
			return getUnrecognizedRectangle_2002ChildNodeID(domainElement, semanticHint);
		case EllipseEditPart.VISUAL_ID:
			if ((semanticHint == null || Rectangle2EditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getRectangle().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeRectangle_2002((Rectangle) domainElement))) {
				return Rectangle2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EllipseEditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getEllipse().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEllipse_2003((Ellipse) domainElement))) {
				return EllipseEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || RoundedRectangleEditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getRoundedRectangle().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeRoundedRectangle_2004((RoundedRectangle) domainElement))) {
				return RoundedRectangleEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || PolylineEditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getPolyline().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePolyline_2005((Polyline) domainElement))) {
				return PolylineEditPart.VISUAL_ID;
			}
			return getUnrecognizedEllipse_2003ChildNodeID(domainElement, semanticHint);
		case RoundedRectangleEditPart.VISUAL_ID:
			if ((semanticHint == null || Rectangle2EditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getRectangle().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeRectangle_2002((Rectangle) domainElement))) {
				return Rectangle2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EllipseEditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getEllipse().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEllipse_2003((Ellipse) domainElement))) {
				return EllipseEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || RoundedRectangleEditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getRoundedRectangle().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeRoundedRectangle_2004((RoundedRectangle) domainElement))) {
				return RoundedRectangleEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || PolylineEditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getPolyline().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePolyline_2005((Polyline) domainElement))) {
				return PolylineEditPart.VISUAL_ID;
			}
			return getUnrecognizedRoundedRectangle_2004ChildNodeID(domainElement, semanticHint);
		case PolylineEditPart.VISUAL_ID:
			return getUnrecognizedPolyline_2005ChildNodeID(domainElement, semanticHint);
		case Ellipse2EditPart.VISUAL_ID:
			if ((semanticHint == null || Rectangle2EditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getRectangle().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeRectangle_2002((Rectangle) domainElement))) {
				return Rectangle2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EllipseEditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getEllipse().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEllipse_2003((Ellipse) domainElement))) {
				return EllipseEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || RoundedRectangleEditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getRoundedRectangle().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeRoundedRectangle_2004((RoundedRectangle) domainElement))) {
				return RoundedRectangleEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || PolylineEditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getPolyline().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePolyline_2005((Polyline) domainElement))) {
				return PolylineEditPart.VISUAL_ID;
			}
			return getUnrecognizedEllipse_2006ChildNodeID(domainElement, semanticHint);
		case RoundedRectangle2EditPart.VISUAL_ID:
			if ((semanticHint == null || Rectangle2EditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getRectangle().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeRectangle_2002((Rectangle) domainElement))) {
				return Rectangle2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EllipseEditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getEllipse().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEllipse_2003((Ellipse) domainElement))) {
				return EllipseEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || RoundedRectangleEditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getRoundedRectangle().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeRoundedRectangle_2004((RoundedRectangle) domainElement))) {
				return RoundedRectangleEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || PolylineEditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getPolyline().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePolyline_2005((Polyline) domainElement))) {
				return PolylineEditPart.VISUAL_ID;
			}
			return getUnrecognizedRoundedRectangle_2007ChildNodeID(domainElement, semanticHint);
		case Polyline2EditPart.VISUAL_ID:
			return getUnrecognizedPolyline_2008ChildNodeID(domainElement, semanticHint);
		case Compartment_VisualFacetsEditPart.VISUAL_ID:
			return getUnrecognizedVisualFacets_5001ChildNodeID(domainElement, semanticHint);
		case Node_VisualFacetsEditPart.VISUAL_ID:
			return getUnrecognizedVisualFacets_5002ChildNodeID(domainElement, semanticHint);
		case Connection_VisualFacetsEditPart.VISUAL_ID:
			return getUnrecognizedVisualFacets_5003ChildNodeID(domainElement, semanticHint);
		case FigureGallery_FiguresEditPart.VISUAL_ID:
			if ((semanticHint == null || RectangleEditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getRectangle().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeRectangle_2001((Rectangle) domainElement))) {
				return RectangleEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Ellipse2EditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getEllipse().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEllipse_2006((Ellipse) domainElement))) {
				return Ellipse2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || RoundedRectangle2EditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getRoundedRectangle().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeRoundedRectangle_2007((RoundedRectangle) domainElement))) {
				return RoundedRectangle2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Polyline2EditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getPolyline().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePolyline_2008((Polyline) domainElement))) {
				return Polyline2EditPart.VISUAL_ID;
			}
			return getUnrecognizedFigures_5004ChildNodeID(domainElement, semanticHint);
		case CanvasEditPart.VISUAL_ID:
			if ((semanticHint == null || CompartmentEditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getCompartment().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeCompartment_1001((Compartment) domainElement))) {
				return CompartmentEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || NodeEditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeNode_1002((Node) domainElement))) {
				return NodeEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || ConnectionEditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getConnection().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeConnection_1003((Connection) domainElement))) {
				return ConnectionEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || FigureGalleryEditPart.VISUAL_ID == nodeVisualID) && GMFGraphPackage.eINSTANCE.getFigureGallery().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeFigureGallery_1004((FigureGallery) domainElement))) {
				return FigureGalleryEditPart.VISUAL_ID;
			}
			return getUnrecognizedCanvas_79ChildNodeID(domainElement, semanticHint);
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		EClass domainElementMetaclass = domainElement.eClass();
		return getLinkWithClassVisualID(domainElement, domainElementMetaclass);
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement, EClass domainElementMetaclass) {
		{
			return getUnrecognizedLinkWithClassID(domainElement);
		}
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isDiagramCanvas_79(Canvas element) {
		return true;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedDiagramID(EObject domainElement) {
		return -1;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeCompartment_1001(Compartment element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeNode_1002(Node element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeConnection_1003(Connection element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeFigureGallery_1004(FigureGallery element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeRectangle_2001(Rectangle element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeRectangle_2002(Rectangle element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEllipse_2003(Ellipse element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeRoundedRectangle_2004(RoundedRectangle element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodePolyline_2005(Polyline element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEllipse_2006(Ellipse element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeRoundedRectangle_2007(RoundedRectangle element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodePolyline_2008(Polyline element) {
		return true;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedCompartment_1001ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedNode_1002ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedConnection_1003ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedFigureGallery_1004ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedRectangle_2001ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedRectangle_2002ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEllipse_2003ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedRoundedRectangle_2004ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPolyline_2005ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEllipse_2006ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedRoundedRectangle_2007ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPolyline_2008ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedVisualFacets_5001ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedVisualFacets_5002ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedVisualFacets_5003ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedFigures_5004ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedCanvas_79ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedLinkWithClassID(EObject domainElement) {
		return -1;
	}
}

package org.eclipse.gmf.graphdef.editor.part;

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
	public static final GMFGraphVisualIDRegistry INSTANCE = new GMFGraphVisualIDRegistry();

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (CanvasEditPart.MODEL_ID.equals(view.getType())) {
				return 79;
			} else {
				return -1;
			}
		}
		try {
			return Integer.parseInt(view.getType());
		} catch (NumberFormatException e) {
			GMFGraphDiagramEditorPlugin.getInstance().logError("Unable to parse view type as a visualID number: " + view.getType(), e);
		}
		return -1;
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
		return diagram.getType();
	}

	/**
	 * @generated
	 */
	public int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		EClass domainElementMetaclass = domainElement.eClass();
		return getDiagramVisualID(domainElement, domainElementMetaclass);
	}

	/**
	 * @generated
	 */
	public int getDiagramVisualID(EObject domainElement, EClass domainElementMetaclass) {
		if (GMFGraphPackage.eINSTANCE.getCanvas().equals(domainElementMetaclass) && (domainElement == null || isDiagramCanvas_79((Canvas) domainElement))) {
			return 79;
		}
		return getUnrecognizedDiagramID(domainElement);
	}

	/**
	 * @generated
	 */
	public int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		EClass domainElementMetaclass = domainElement.eClass();
		return getNodeVisualID(containerView, domainElement, domainElementMetaclass, null);
	}

	/**
	 * @generated
	 */
	public int getNodeVisualID(View containerView, EObject domainElement, EClass domainElementMetaclass, String semanticHint) {
		String containerModelID = getModelID(containerView);
		if (!CanvasEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (CanvasEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = 79;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case 1001:
			if (Compartment_nameEditPart.VISUAL_ID.equals(semanticHint)) {
				return 4001;
			}
			if (Compartment_VisualFacetsEditPart.VISUAL_ID.equals(semanticHint)) {
				return 5001;
			}
			return getUnrecognizedCompartment_1001ChildNodeID(domainElement, semanticHint);
		case 1002:
			if (Node_nameEditPart.VISUAL_ID.equals(semanticHint)) {
				return 4002;
			}
			if (Node_VisualFacetsEditPart.VISUAL_ID.equals(semanticHint)) {
				return 5002;
			}
			return getUnrecognizedNode_1002ChildNodeID(domainElement, semanticHint);
		case 1003:
			if (Connection_nameEditPart.VISUAL_ID.equals(semanticHint)) {
				return 4003;
			}
			if (Connection_VisualFacetsEditPart.VISUAL_ID.equals(semanticHint)) {
				return 5003;
			}
			return getUnrecognizedConnection_1003ChildNodeID(domainElement, semanticHint);
		case 1004:
			if (FigureGallery_nameEditPart.VISUAL_ID.equals(semanticHint)) {
				return 4004;
			}
			if (FigureGallery_FiguresEditPart.VISUAL_ID.equals(semanticHint)) {
				return 5004;
			}
			return getUnrecognizedFigureGallery_1004ChildNodeID(domainElement, semanticHint);
		case 2001:
			if ((semanticHint == null || Rectangle2EditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getRectangle().equals(domainElementMetaclass)
					&& (domainElement == null || isNodeRectangle_2002((Rectangle) domainElement))) {
				return 2002;
			}
			if ((semanticHint == null || EllipseEditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getEllipse().equals(domainElementMetaclass)
					&& (domainElement == null || isNodeEllipse_2003((Ellipse) domainElement))) {
				return 2003;
			}
			if ((semanticHint == null || RoundedRectangleEditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getRoundedRectangle().equals(domainElementMetaclass)
					&& (domainElement == null || isNodeRoundedRectangle_2004((RoundedRectangle) domainElement))) {
				return 2004;
			}
			if ((semanticHint == null || PolylineEditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getPolyline().equals(domainElementMetaclass)
					&& (domainElement == null || isNodePolyline_2005((Polyline) domainElement))) {
				return 2005;
			}
			return getUnrecognizedRectangle_2001ChildNodeID(domainElement, semanticHint);
		case 2002:
			if ((semanticHint == null || Rectangle2EditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getRectangle().equals(domainElementMetaclass)
					&& (domainElement == null || isNodeRectangle_2002((Rectangle) domainElement))) {
				return 2002;
			}
			if ((semanticHint == null || EllipseEditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getEllipse().equals(domainElementMetaclass)
					&& (domainElement == null || isNodeEllipse_2003((Ellipse) domainElement))) {
				return 2003;
			}
			if ((semanticHint == null || RoundedRectangleEditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getRoundedRectangle().equals(domainElementMetaclass)
					&& (domainElement == null || isNodeRoundedRectangle_2004((RoundedRectangle) domainElement))) {
				return 2004;
			}
			if ((semanticHint == null || PolylineEditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getPolyline().equals(domainElementMetaclass)
					&& (domainElement == null || isNodePolyline_2005((Polyline) domainElement))) {
				return 2005;
			}
			return getUnrecognizedRectangle_2002ChildNodeID(domainElement, semanticHint);
		case 2003:
			if ((semanticHint == null || Rectangle2EditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getRectangle().equals(domainElementMetaclass)
					&& (domainElement == null || isNodeRectangle_2002((Rectangle) domainElement))) {
				return 2002;
			}
			if ((semanticHint == null || EllipseEditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getEllipse().equals(domainElementMetaclass)
					&& (domainElement == null || isNodeEllipse_2003((Ellipse) domainElement))) {
				return 2003;
			}
			if ((semanticHint == null || RoundedRectangleEditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getRoundedRectangle().equals(domainElementMetaclass)
					&& (domainElement == null || isNodeRoundedRectangle_2004((RoundedRectangle) domainElement))) {
				return 2004;
			}
			if ((semanticHint == null || PolylineEditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getPolyline().equals(domainElementMetaclass)
					&& (domainElement == null || isNodePolyline_2005((Polyline) domainElement))) {
				return 2005;
			}
			return getUnrecognizedEllipse_2003ChildNodeID(domainElement, semanticHint);
		case 2004:
			if ((semanticHint == null || Rectangle2EditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getRectangle().equals(domainElementMetaclass)
					&& (domainElement == null || isNodeRectangle_2002((Rectangle) domainElement))) {
				return 2002;
			}
			if ((semanticHint == null || EllipseEditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getEllipse().equals(domainElementMetaclass)
					&& (domainElement == null || isNodeEllipse_2003((Ellipse) domainElement))) {
				return 2003;
			}
			if ((semanticHint == null || RoundedRectangleEditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getRoundedRectangle().equals(domainElementMetaclass)
					&& (domainElement == null || isNodeRoundedRectangle_2004((RoundedRectangle) domainElement))) {
				return 2004;
			}
			if ((semanticHint == null || PolylineEditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getPolyline().equals(domainElementMetaclass)
					&& (domainElement == null || isNodePolyline_2005((Polyline) domainElement))) {
				return 2005;
			}
			return getUnrecognizedRoundedRectangle_2004ChildNodeID(domainElement, semanticHint);
		case 2005:
			return getUnrecognizedPolyline_2005ChildNodeID(domainElement, semanticHint);
		case 2006:
			if ((semanticHint == null || Rectangle2EditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getRectangle().equals(domainElementMetaclass)
					&& (domainElement == null || isNodeRectangle_2002((Rectangle) domainElement))) {
				return 2002;
			}
			if ((semanticHint == null || EllipseEditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getEllipse().equals(domainElementMetaclass)
					&& (domainElement == null || isNodeEllipse_2003((Ellipse) domainElement))) {
				return 2003;
			}
			if ((semanticHint == null || RoundedRectangleEditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getRoundedRectangle().equals(domainElementMetaclass)
					&& (domainElement == null || isNodeRoundedRectangle_2004((RoundedRectangle) domainElement))) {
				return 2004;
			}
			if ((semanticHint == null || PolylineEditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getPolyline().equals(domainElementMetaclass)
					&& (domainElement == null || isNodePolyline_2005((Polyline) domainElement))) {
				return 2005;
			}
			return getUnrecognizedEllipse_2006ChildNodeID(domainElement, semanticHint);
		case 2007:
			if ((semanticHint == null || Rectangle2EditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getRectangle().equals(domainElementMetaclass)
					&& (domainElement == null || isNodeRectangle_2002((Rectangle) domainElement))) {
				return 2002;
			}
			if ((semanticHint == null || EllipseEditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getEllipse().equals(domainElementMetaclass)
					&& (domainElement == null || isNodeEllipse_2003((Ellipse) domainElement))) {
				return 2003;
			}
			if ((semanticHint == null || RoundedRectangleEditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getRoundedRectangle().equals(domainElementMetaclass)
					&& (domainElement == null || isNodeRoundedRectangle_2004((RoundedRectangle) domainElement))) {
				return 2004;
			}
			if ((semanticHint == null || PolylineEditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getPolyline().equals(domainElementMetaclass)
					&& (domainElement == null || isNodePolyline_2005((Polyline) domainElement))) {
				return 2005;
			}
			return getUnrecognizedRoundedRectangle_2007ChildNodeID(domainElement, semanticHint);
		case 2008:
			return getUnrecognizedPolyline_2008ChildNodeID(domainElement, semanticHint);
		case 5001:
			return getUnrecognizedVisualFacets_5001ChildNodeID(domainElement, semanticHint);
		case 5002:
			return getUnrecognizedVisualFacets_5002ChildNodeID(domainElement, semanticHint);
		case 5003:
			return getUnrecognizedVisualFacets_5003ChildNodeID(domainElement, semanticHint);
		case 5004:
			if ((semanticHint == null || RectangleEditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getRectangle().equals(domainElementMetaclass)
					&& (domainElement == null || isNodeRectangle_2001((Rectangle) domainElement))) {
				return 2001;
			}
			if ((semanticHint == null || Ellipse2EditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getEllipse().equals(domainElementMetaclass)
					&& (domainElement == null || isNodeEllipse_2006((Ellipse) domainElement))) {
				return 2006;
			}
			if ((semanticHint == null || RoundedRectangle2EditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getRoundedRectangle().equals(domainElementMetaclass)
					&& (domainElement == null || isNodeRoundedRectangle_2007((RoundedRectangle) domainElement))) {
				return 2007;
			}
			if ((semanticHint == null || Polyline2EditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getPolyline().equals(domainElementMetaclass)
					&& (domainElement == null || isNodePolyline_2008((Polyline) domainElement))) {
				return 2008;
			}
			return getUnrecognizedFigures_5004ChildNodeID(domainElement, semanticHint);
		case 79:
			if ((semanticHint == null || CompartmentEditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getCompartment().equals(domainElementMetaclass)
					&& (domainElement == null || isNodeCompartment_1001((Compartment) domainElement))) {
				return 1001;
			}
			if ((semanticHint == null || NodeEditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getNode().equals(domainElementMetaclass)
					&& (domainElement == null || isNodeNode_1002((Node) domainElement))) {
				return 1002;
			}
			if ((semanticHint == null || ConnectionEditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getConnection().equals(domainElementMetaclass)
					&& (domainElement == null || isNodeConnection_1003((Connection) domainElement))) {
				return 1003;
			}
			if ((semanticHint == null || FigureGalleryEditPart.VISUAL_ID.equals(semanticHint)) && GMFGraphPackage.eINSTANCE.getFigureGallery().equals(domainElementMetaclass)
					&& (domainElement == null || isNodeFigureGallery_1004((FigureGallery) domainElement))) {
				return 1004;
			}
			return getUnrecognizedCanvas_79ChildNodeID(domainElement, semanticHint);
		case 3001:
			return getUnrecognizedDiagramElementFigure_3001LinkLabelID(semanticHint);
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public int getLinkWithClassVisualID(EObject domainElement) {
		EClass domainElementMetaclass = domainElement.eClass();
		return getLinkWithClassVisualID(domainElement, domainElementMetaclass);
	}

	/**
	 * @generated
	 */
	public int getLinkWithClassVisualID(EObject domainElement, EClass domainElementMetaclass) {
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
	private boolean isDiagramCanvas_79(Canvas element) {
		return true;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedDiagramID(EObject domainElement) {
		return -1;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private boolean isNodeCompartment_1001(Compartment element) {
		return ElementSelectors.acceptAllMatcher().matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private boolean isNodeNode_1002(Node element) {
		return ElementSelectors.acceptAllMatcher().matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private boolean isNodeConnection_1003(Connection element) {
		return ElementSelectors.acceptAllMatcher().matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private boolean isNodeFigureGallery_1004(FigureGallery element) {
		return ElementSelectors.acceptAllMatcher().matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private boolean isNodeRectangle_2001(Rectangle element) {
		return ElementSelectors.acceptAllMatcher().matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private boolean isNodeRectangle_2002(Rectangle element) {
		return ElementSelectors.acceptAllMatcher().matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private boolean isNodeEllipse_2003(Ellipse element) {
		return ElementSelectors.acceptAllMatcher().matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private boolean isNodeRoundedRectangle_2004(RoundedRectangle element) {
		return ElementSelectors.acceptAllMatcher().matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private boolean isNodePolyline_2005(Polyline element) {
		return ElementSelectors.acceptAllMatcher().matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private boolean isNodeEllipse_2006(Ellipse element) {
		return ElementSelectors.acceptAllMatcher().matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private boolean isNodeRoundedRectangle_2007(RoundedRectangle element) {
		return ElementSelectors.acceptAllMatcher().matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private boolean isNodePolyline_2008(Polyline element) {
		return ElementSelectors.acceptAllMatcher().matches(element);
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedCompartment_1001ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedNode_1002ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedConnection_1003ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedFigureGallery_1004ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedRectangle_2001ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedRectangle_2002ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedEllipse_2003ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedRoundedRectangle_2004ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedPolyline_2005ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedEllipse_2006ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedRoundedRectangle_2007ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedPolyline_2008ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedVisualFacets_5001ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedVisualFacets_5002ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedVisualFacets_5003ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedFigures_5004ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedCanvas_79ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedDiagramElementFigure_3001LinkLabelID(String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedLinkWithClassID(EObject domainElement) {
		return -1;
	}

	/**
	 * @generated
	 */
	private static class ElementSelectors {

		/**
		 * @generated
		 */
		private ElementSelectors() {
		}

		/**
		 * @generated
		 */
		static class AcceptAllMatcher {

			/**
			 * @generated
			 */
			static final AcceptAllMatcher INSTANCE = new AcceptAllMatcher();

			/**
			 * @generated
			 */
			boolean matches(Object element) {
				return true;
			}
		}

		/**
		 * @generated
		 */
		static AcceptAllMatcher acceptAllMatcher() {
			return AcceptAllMatcher.INSTANCE;
		}
	} // end of ElementSelectors
}

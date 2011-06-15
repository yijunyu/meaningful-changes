/**
 * Copyright (c) 2006 Borland Software Corp.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.services;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.graph.CompoundDirectedGraph;
import org.eclipse.draw2d.graph.CompoundDirectedGraphLayout;
import org.eclipse.draw2d.graph.EdgeList;
import org.eclipse.draw2d.graph.NodeList;
import org.eclipse.draw2d.graph.Subgraph;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.lite.requests.SetAllBendpointsRequest;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * Default implementation of <code>IDiagramLayouter</code> that delegates to {@link org.eclipse.draw2d.graph.CompoundDirectedGraphLayout}.
 */
public class DefaultDiagramLayouter implements IDiagramLayouter {
	public Command layout(GraphicalEditPart container) {
		CompoundDirectedGraph graph = new CompoundDirectedGraph();
		HashMap<EditPart, org.eclipse.draw2d.graph.Node> views2Nodes = buildGraph(container, graph);
		CompoundDirectedGraphLayout layout = new CompoundDirectedGraphLayout();
		layout.visit(graph);
		return createLayoutCommand(container, views2Nodes, graph);
	}

	public Command layout(GraphicalEditPart container, List<GraphicalEditPart> selectedElements) {
		//XXX: Currently, selectedElements argument is ignored.
		return layout(container);
	}

	protected HashMap<EditPart, org.eclipse.draw2d.graph.Node> buildGraph(GraphicalEditPart container, CompoundDirectedGraph graph) {
		HashMap<EditPart, org.eclipse.draw2d.graph.Node> views2Nodes = new HashMap<EditPart, org.eclipse.draw2d.graph.Node>();
		traverseChildren(container, new SubGraphBuilder(null, graph, views2Nodes));
		Diagram diagram = ((View) container.getModel()).getDiagram();
		for(Iterator it = diagram.getEdges().iterator(); it.hasNext(); ) {
			Edge nextEdge = (Edge) it.next();
			ConnectionEditPart nextEdgeEP = (ConnectionEditPart) container.getViewer().getEditPartRegistry().get(nextEdge);
			EditPart source = nextEdgeEP.getSource();
			EditPart target = nextEdgeEP.getTarget();
			org.eclipse.draw2d.graph.Node sourceNode = views2Nodes.get(source);
			org.eclipse.draw2d.graph.Node targetNode = views2Nodes.get(target);
			if (sourceNode == null || targetNode == null) {
				continue;
			}
			org.eclipse.draw2d.graph.Edge edge = createEdge(nextEdgeEP, sourceNode, targetNode);
			if (edge != null) {
				graph.edges.add(edge);
			}
		}
		return views2Nodes;
	}

	protected static interface Traverser {
		public void acceptChild(GraphicalEditPart childEditPart);
		public void childrenTraversed(GraphicalEditPart parentEditPart);
	}

	protected void traverseChildren(GraphicalEditPart container, Traverser traverser) {
		View view = (View) container.getModel();
		for(Iterator it = view.getChildren().iterator(); it.hasNext(); ) {
			View nextChild = (View) it.next();
			GraphicalEditPart nextChildEP = (GraphicalEditPart) container.getViewer().getEditPartRegistry().get(nextChild);
			if (nextChildEP == null) {
				continue;
			}
			traverser.acceptChild(nextChildEP);
		}
		traverser.childrenTraversed(container);
	}

	protected class SubGraphBuilder implements Traverser {
		private final Subgraph myParent;
		private final CompoundDirectedGraph myGraph;
		private final HashMap<EditPart, org.eclipse.draw2d.graph.Node> myViews2Nodes;

		public SubGraphBuilder(Subgraph parent, CompoundDirectedGraph graph, HashMap<EditPart, org.eclipse.draw2d.graph.Node> views2Nodes) {
			myParent = parent;
			myGraph = graph;
			myViews2Nodes = views2Nodes;
		}

		public void acceptChild(GraphicalEditPart childEditPart) {
			org.eclipse.draw2d.graph.Node node = createNode(myParent, childEditPart);
			if (node != null) {
				setNodePosition(node);
				myGraph.nodes.add(node);
				myViews2Nodes.put(childEditPart, node);
				if (node instanceof org.eclipse.draw2d.graph.Subgraph) {
					traverseChildren(childEditPart, new SubGraphBuilder((org.eclipse.draw2d.graph.Subgraph) node, myGraph, myViews2Nodes));
				}
			}
		}

		public void childrenTraversed(GraphicalEditPart parentEditPart) {
		}
	}

	protected org.eclipse.draw2d.graph.Edge createEdge(ConnectionEditPart next, org.eclipse.draw2d.graph.Node sourceNode, org.eclipse.draw2d.graph.Node targetNode) {
		return new org.eclipse.draw2d.graph.Edge(next, sourceNode, targetNode);
	}

	protected org.eclipse.draw2d.graph.Node createNode(org.eclipse.draw2d.graph.Subgraph parent, GraphicalEditPart next) {
		boolean hasChildren = hasChildren(next);
		if (!hasChildren) {
			if (isValidElementForLayout(next)) {
				return new org.eclipse.draw2d.graph.Node(next, parent);
			}
			return null;
		}
		return new org.eclipse.draw2d.graph.Subgraph(next, parent);
	}

	protected boolean hasChildren(GraphicalEditPart gep) {
		for (Iterator it = gep.getChildren().iterator(); it.hasNext(); ) {
			GraphicalEditPart next = (GraphicalEditPart) it.next();
			if (isValidElementForLayout(next)) {
				return true;
			}
			if (hasChildren(next)) {
				return true;
			}
		}
		return false;
	}

	protected boolean isValidElementForLayout(GraphicalEditPart gep) {
		if (false == gep.getModel() instanceof Node) {
			return false;
		}
		Node view = (Node) gep.getModel();
		if (!view.isSetElement()) {
			return false;
		}
		return view.getLayoutConstraint() instanceof Bounds;
	}

	protected void setNodePosition(org.eclipse.draw2d.graph.Node node) {
		GraphicalEditPart editPart = (GraphicalEditPart) node.data;
		Node notationalNode = (Node) editPart.getModel();
		if (notationalNode.getLayoutConstraint() instanceof Bounds) {
			Rectangle bounds = editPart.getFigure().getBounds().getCopy();
			editPart.getFigure().translateToAbsolute(bounds);
			node.x = bounds.x;
			node.y = bounds.y;
			node.width = bounds.width;
			node.height = bounds.height;
		}
	}

	protected Rectangle getNodePosition(org.eclipse.draw2d.graph.Node node) {
        Rectangle rect = new Rectangle(node.x, node.y, node.width, node.height);
        return rect;
	}

	protected Command createLayoutCommand(final GraphicalEditPart container, final HashMap<EditPart, org.eclipse.draw2d.graph.Node> views2Nodes, final CompoundDirectedGraph graph) {
		return new AbstractCommand() {
			/**
			 * Cache of the executed commands for undo-redo functionality.
			 */
			private CompoundCommand layoutCommand;
			public void redo() {
				layoutCommand.execute();
			}
			public void execute() {
				layoutCommand = new CompoundCommand();
				traverseChildren(container, new ChildrenLayouter(views2Nodes, layoutCommand));
				createLayoutEdgesCommand(graph.edges, layoutCommand);
			}
			@Override
			protected boolean prepare() {
				return true;
			}
			@Override
			public boolean canUndo() {
				return layoutCommand.canUndo();
			}
			@Override
			public void undo() {
				layoutCommand.undo();
			}
		};
	}

	protected class ChildrenLayouter implements Traverser {
		private final CompoundCommand myCommand;
		private final HashMap<EditPart, org.eclipse.draw2d.graph.Node> myViews2Nodes;

		public ChildrenLayouter(HashMap<EditPart, org.eclipse.draw2d.graph.Node> views2Nodes, CompoundCommand command) {
			myViews2Nodes = views2Nodes;
			myCommand = command;
		}

		public void acceptChild(GraphicalEditPart childEditPart) {
			org.eclipse.draw2d.graph.Node node = myViews2Nodes.get(childEditPart);
			if (node == null) {
				return;
			}
			ChangeBoundsRequest request = new ChangeBoundsRequest(RequestConstants.REQ_MOVE);
			Rectangle bounds = getNodePosition(node);
			Point ptLocation = new Point(bounds.x, bounds.y);
			Rectangle oldBounds = childEditPart.getFigure().getBounds();
			childEditPart.getFigure().translateToAbsolute(oldBounds);
			Point oldLocation = oldBounds.getLocation();
			Dimension delta = ptLocation.getDifference(oldLocation);
			request.setEditParts(childEditPart);
			request.setMoveDelta(new Point(delta.width, delta.height));
			request.setSizeDelta(bounds.getSize().getDifference(oldBounds.getSize()));
			request.setLocation(ptLocation);
			org.eclipse.gef.commands.Command cmd = childEditPart.getCommand(request);
			if (cmd != null && cmd.canExecute()) {
				cmd.execute();
				myCommand.add(cmd);
			}
		}

		public void childrenTraversed(GraphicalEditPart parentEditPart) {
			parentEditPart.getFigure().invalidateTree();
			parentEditPart.getFigure().validate();
			traverseChildren(parentEditPart, new Traverser() {
				public void acceptChild(GraphicalEditPart childEditPart) {
					traverseChildren(childEditPart, ChildrenLayouter.this);
				}
				public void childrenTraversed(GraphicalEditPart parentEditPart) {
				}
			});
		}
	}

	protected void createLayoutEdgesCommand(EdgeList edges, CompoundCommand command) {
		for(Iterator it = edges.iterator(); it.hasNext(); ) {
			org.eclipse.draw2d.graph.Edge next = (org.eclipse.draw2d.graph.Edge) it.next();
			if (next.data instanceof ConnectionEditPart == false) {
				continue;
			}
			ConnectionEditPart connection = (ConnectionEditPart) next.data;
			PointList points = getPoints(next);
			SetAllBendpointsRequest request = new SetAllBendpointsRequest();
			request.setConnectionEditPart(connection);
			request.setPoints(points);
            org.eclipse.gef.commands.Command cmd = connection.getCommand(request);
            if (cmd != null && cmd.canExecute()) {
            	cmd.execute();
                command.add(cmd);
			}
		}
	}

	private PointList getPoints(org.eclipse.draw2d.graph.Edge edge) {
		PointList result = new PointList();
		result.addPoint(((GraphicalEditPart) ((ConnectionEditPart) edge.data).getSource()).getFigure().getBounds().getCenter());
        NodeList vnodes = edge.vNodes;
        if (vnodes != null) {
            for (int i = 0; i < vnodes.size(); i++) {
                org.eclipse.draw2d.graph.Node vn = vnodes.getNode(i);
                Rectangle nextPosition = getNodePosition(vn);
                result.addPoint(nextPosition.getCenter());
            }
        }
		result.addPoint(((GraphicalEditPart) ((ConnectionEditPart) edge.data).getTarget()).getFigure().getBounds().getCenter());
		straightenPoints(result);
		result.removePoint(0);
		result.removePoint(result.size() - 1);
		return result;
	}

	private void straightenPoints(PointList points) {
		double flatnessTolerance = Math.cos(Math.PI/360);	//angles that are almost flat are treated as flat
		removeFlatAngles(points, flatnessTolerance);
	}

	private void removeFlatAngles(PointList points, double flatnessTolerance) {
		for(int i = 0; i < points.size() - 2 && points.size() > 3; i++) {
			while (i < points.size() - 2 && points.size() > 3 && cos(points.getPoint(i), points.getPoint(i+1), points.getPoint(i+2)) > flatnessTolerance) {
				points.removePoint(i+1);
			}
		}
	}

	/**
	 * Returns the cosine of the angle abc.
	 * @return
	 */
	private double cos(Point a, Point b, Point c) {
		double ab2 = b.getDistance2(a);
		double ac2 = c.getDistance2(a);
		double bc2 = b.getDistance2(c);
		return (ab2 + ac2 - bc2) / (2 * Math.sqrt(ab2 * ac2));
	}
}

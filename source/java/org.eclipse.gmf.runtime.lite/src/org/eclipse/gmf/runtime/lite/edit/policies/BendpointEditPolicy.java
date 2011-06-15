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
package org.eclipse.gmf.runtime.lite.edit.policies;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.BendpointRequest;
import org.eclipse.gmf.runtime.lite.commands.WrappingCommand;
import org.eclipse.gmf.runtime.lite.requests.RequestConstants;
import org.eclipse.gmf.runtime.lite.requests.SetAllBendpointsRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;


public class BendpointEditPolicy extends org.eclipse.gef.editpolicies.BendpointEditPolicy {
	protected Edge getDiagramEdge() {
		return (Edge) getHost().getModel();
	}

	@Override
	public Command getCommand(Request request) {
		if (RequestConstants.REQ_SET_ALL_BENDPOINTS.equals(request.getType())) {
			return getSetAllBendpointsCommand((SetAllBendpointsRequest) request);
		}
		return super.getCommand(request);
	}

	protected Command getSetAllBendpointsCommand(SetAllBendpointsRequest request) {
		return getModifyBendpointCommand(new BendpointSetter(request.getPoints()));
	}

	protected Command getCreateBendpointCommand(BendpointRequest request) {
		return getModifyBendpointCommand(new BendpointCreator(request.getIndex(), request.getLocation()));
	}

	protected Command getDeleteBendpointCommand(BendpointRequest request) {
		return getModifyBendpointCommand(new BendpointDeleter(request.getIndex()));
	}

	protected Command getMoveBendpointCommand(BendpointRequest request) {
		return getModifyBendpointCommand(new BendpointMover(request.getIndex(), request.getLocation()));
	}

	private Command getModifyBendpointCommand(final BendpointModifier modifier) {
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(getDiagramEdge().getDiagram().getElement());
		return new WrappingCommand(editingDomain, new BendpointModificationCommand(modifier));
	}

	private class BendpointModificationCommand extends AbstractCommand {
		private BendpointModifier bendpointModifier; 
		private List oldPoints;
		private Point mySourceRef;
		private Point myTargetRef;

		public BendpointModificationCommand(BendpointModifier bendpointModifier) {
			this.bendpointModifier = bendpointModifier;
		}

		@Override
		protected boolean prepare() {
			TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(getDiagramEdge());
			if (domain != null && domain.isReadOnly(getDiagramEdge().eResource())) {
				return false;
			}
			Connection connection = getConnection();
			mySourceRef = connection.getSourceAnchor().getReferencePoint().getCopy();
			connection.translateToRelative(mySourceRef);
			myTargetRef = connection.getTargetAnchor().getReferencePoint().getCopy();
			connection.translateToRelative(myTargetRef);
			return true;
		}

		public void execute() {
			RelativeBendpoints bendpoints = (RelativeBendpoints) getDiagramEdge().getBendpoints();
			if (bendpoints == null) {
				bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
				getDiagramEdge().setBendpoints(bendpoints);
			}
			oldPoints = bendpoints.getPoints();
			List newPoints = new ArrayList(oldPoints);
			bendpointModifier.applyModification(newPoints, new BendpointConverter() {
				public RelativeBendpoint convert(Point point) {
					getConnection().translateToRelative(point);
					Dimension s = point.getDifference(mySourceRef);
					Dimension t = point.getDifference(myTargetRef);
					return new RelativeBendpoint(s.width, s.height, t.width, t.height);
				}
			});
			bendpoints.setPoints(newPoints);
		}

		public void undo() {
			RelativeBendpoints bendpoints = (RelativeBendpoints) getDiagramEdge().getBendpoints();
			bendpoints.setPoints(oldPoints);
		}

		public void redo() {
			execute();
		}
	}

	private static interface BendpointConverter {
		public RelativeBendpoint convert(Point point);
	}

	private static interface BendpointModifier {
		public void applyModification(List/*<RelativeBendpoint>*/ originalBendpoints, BendpointConverter converter);
	}

	private static class BendpointDeleter implements BendpointModifier {
		private int index;

		public BendpointDeleter(int index) {
			this.index = index;
		}

		public void applyModification(List originalBendpoints, BendpointConverter converter) {
			originalBendpoints.remove(index);
		}
	}

	private static class BendpointMover implements BendpointModifier {
		private int index;

		private Point point;

		public BendpointMover(int index, Point point) {
			this.index = index;
			this.point = point;
		}

		public void applyModification(List originalBendpoints, BendpointConverter converter) {
			originalBendpoints.set(index, converter.convert(point));
		}
	}

	private static class BendpointCreator implements BendpointModifier {
		private int index;

		private Point point;

		public BendpointCreator(int index, Point point) {
			this.index = index;
			this.point = point;
		}

		public void applyModification(List originalBendpoints, BendpointConverter converter) {
			originalBendpoints.add(index, converter.convert(point));
		}
	}

	private static class BendpointSetter implements BendpointModifier {
		private PointList myPoints;

		public BendpointSetter(PointList points) {
			myPoints = points;
		}

		public void applyModification(List originalBendpoints, BendpointConverter converter) {
			originalBendpoints.clear();
			for(int i = 0, iMax = myPoints.size(); i < iMax; i++) {
				originalBendpoints.add(converter.convert(myPoints.getPoint(i)));
			}
		}
	}
}

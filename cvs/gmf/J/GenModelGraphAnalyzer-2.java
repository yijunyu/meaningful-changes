/**
 * Copyright (c) 2006 Borland Software Corp.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Alexander Shatalin (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.codegen.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.codegen.gmfgen.GenContainerBase;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference;
import org.eclipse.gmf.codegen.gmfgen.GenNavigatorReferenceType;
import org.eclipse.gmf.codegen.gmfgen.GenNode;

public class GenModelGraphAnalyzer {

	/**
	 * @deprecated
	 */
	public GenModelGraphAnalyzer(GenDiagram diagram) {
	}

	public static List<List<GenCommonBase>> getConnectionPaths(GenNavigatorChildReference reference) {
		assert reference.getParent() != null;
		if (reference.getReferenceType() == GenNavigatorReferenceType.CHILDREN_LITERAL) {
			return getChildConnectionPaths(reference.getParent(), reference.getChild());
		} else if (reference.getReferenceType() == GenNavigatorReferenceType.IN_SOURCE_LITERAL) {
			return getInSourceLinkConnectionPaths(reference.getParent(), reference.getChild(), reference.getNavigator().getEditorGen().getDiagram());
		} else if (reference.getReferenceType() == GenNavigatorReferenceType.OUT_TARGET_LITERAL) {
			return getOutTargetLinkConnectionPaths(reference.getParent(), reference.getChild(), reference.getNavigator().getEditorGen().getDiagram());
		}
		return Collections.emptyList();
	}

	private static List<List<GenCommonBase>> getOutTargetLinkConnectionPaths(GenCommonBase source, GenCommonBase target, GenDiagram diagram) {
		return new LinkedConnectionFinder(diagram, true).findConnectionPaths(source, target);
	}

	private static List<List<GenCommonBase>> getInSourceLinkConnectionPaths(GenCommonBase source, GenCommonBase target, GenDiagram diagram) {
		return new LinkedConnectionFinder(diagram, false).findConnectionPaths(source, target);
	}

	private static List<List<GenCommonBase>> getChildConnectionPaths(GenCommonBase source, GenCommonBase target) {
		return new ChildConnectionFinder().findConnectionPaths(source, target);
	}

	private static abstract class AbstractConnectionFinder {

		private Set<GenCommonBase> myVisiting;

		public AbstractConnectionFinder() {
			myVisiting = new LinkedHashSet<GenCommonBase>();
		}

		protected abstract Collection<GenCommonBase> getConnectedNodes(GenCommonBase source);

		public List<List<GenCommonBase>> findConnectionPaths(GenCommonBase source, GenCommonBase target) {
			if (isConnectionFound(source, target)) {
				// Direct connection found
				List<GenCommonBase> path = new ArrayList<GenCommonBase>();
				path.add(target);
				List<List<GenCommonBase>> connections = new ArrayList<List<GenCommonBase>>();
				connections.add(path);
				return connections;
			}

			if (isVisiting(source)) {
				// Loop found
				return new ArrayList<List<GenCommonBase>>();
			}
			startVisiting(source);
			try {
				// Looking for indirect connection + extending connection with
				// current node
				Collection<GenCommonBase> connectedNodes = getConnectedNodes(source);
				List<List<GenCommonBase>> connections = new ArrayList<List<GenCommonBase>>();

				for (GenCommonBase nextConnectedNode : connectedNodes) {
					connections.addAll(findConnectionPaths(nextConnectedNode, target));
				}

				for (List<GenCommonBase> path : connections) {
					path.add(0, source);
				}
				return connections;
			} finally {
				stopVisiting(source);
			}
		}

		private boolean isVisiting(GenCommonBase node) {
			return myVisiting.contains(node);
		}

		private void startVisiting(GenCommonBase node) {
			myVisiting.add(node);
		}

		private void stopVisiting(GenCommonBase node) {
			myVisiting.remove(node);
		}

		protected Iterable<GenCommonBase> getPath() {
			return myVisiting;
		}

		/**
		 * myVisiting.size() > 0 checked return non-empty paths if source and
		 * target nodes are the same
		 */
		private boolean isConnectionFound(GenCommonBase source, GenCommonBase target) {
			return myVisiting.size() > 0 && source == target;
		}

	}

	private static class ChildConnectionFinder extends AbstractConnectionFinder {

		protected Collection<GenCommonBase> getConnectedNodes(GenCommonBase source) {
			Collection<GenCommonBase> children = new ArrayList<GenCommonBase>();
			if (source instanceof GenContainerBase) {
				children.addAll(((GenContainerBase) source).getContainedNodes());
			}
			if (source instanceof GenDiagram) {
				children.addAll(((GenDiagram) source).getLinks());
			}
			if (source instanceof GenNode) {
				children.addAll(((GenNode) source).getCompartments());
				children.addAll(((GenNode) source).getLabels());
			}
			if (source instanceof GenLink) {
				children.addAll(((GenLink) source).getLabels());
			}
			return children;
		}

	}

	private static class LinkedConnectionFinder extends AbstractConnectionFinder {

		private GenDiagram myDiagram;

		/**
		 * true: looking for the connection from source to target using all
		 * links in natural direction (outgoing links -> link target -> outgoing
		 * links...)
		 * 
		 * false: opposite direction (incomming links -> link source -> ..)
		 */
		private boolean myIsInLinkDirection;

		public LinkedConnectionFinder(GenDiagram diagram, boolean inLinkDirection) {
			myDiagram = diagram;
			myIsInLinkDirection = inLinkDirection;
		}

		protected Collection<GenCommonBase> getConnectedNodes(GenCommonBase source) {
			if (source instanceof GenNode) {
				return getPotentiallyConnectedLinks((GenNode) source);
			} else if (source instanceof GenLink) {
				return getPotentiallyConnectedNodes((GenLink) source);
			}
			return Collections.emptyList();
		}

		private Collection<GenCommonBase> getPotentiallyConnectedLinks(GenNode node) {
			for (GenCommonBase nextPathElement : getPath()) {
				if (nextPathElement instanceof GenLink) {
					// Only one link allowed in the path
					return Collections.emptyList();
				}
			}
			// TODO: this method could be moved to GenNode
			Collection<GenCommonBase> potentialLinks = new ArrayList<GenCommonBase>();
			for (GenLink nextLink : myDiagram.getLinks()) {
				if (nextLink.getModelFacet() == null) {
					potentialLinks.add(nextLink);
				} else {
					GenClass genClass = myIsInLinkDirection ? nextLink.getModelFacet().getSourceType() : nextLink.getModelFacet().getTargetType();
					if (genClass != null && genClass.getEcoreClass().isSuperTypeOf(node.getDomainMetaClass().getEcoreClass())) {
						potentialLinks.add(nextLink);
					}
				}
			}
			return potentialLinks;
		}

		// TODO: this method could be moved to GenLink
		private Collection<GenCommonBase> getPotentiallyConnectedNodes(GenLink link) {
			Collection<GenCommonBase> potentialNodes = new ArrayList<GenCommonBase>();
			if (link.getModelFacet() == null) {
				potentialNodes.addAll(myDiagram.getAllNodes());
			} else {
				GenClass genClass = myIsInLinkDirection ? link.getModelFacet().getTargetType() : link.getModelFacet().getSourceType();
				if (genClass != null) {
					for (GenNode nextNode : myDiagram.getAllNodes()) {
						if (genClass.getEcoreClass().isSuperTypeOf(nextNode.getDomainMetaClass().getEcoreClass())) {
							potentialNodes.add(nextNode);
						}
					}
				}
			}
			return potentialNodes;
		}

	}

}

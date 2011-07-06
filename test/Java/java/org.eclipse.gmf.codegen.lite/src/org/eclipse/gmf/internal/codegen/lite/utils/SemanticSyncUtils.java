/**
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.internal.codegen.lite.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.codegen.gmfgen.FeatureLinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.GenChildContainer;
import org.eclipse.gmf.codegen.gmfgen.GenChildNode;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenContainerBase;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.GenTopLevelNode;
import org.eclipse.gmf.codegen.gmfgen.TypeLinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.TypeModelFacet;
import org.eclipse.gmf.codegen.gmfgen.util.GMFGenSwitch;

/**
 * This class provides static utility methods for use with Xpand templates.
 * Although it is possible to implement these methods in Xtend, doing so would severely impact performance, 
 * since they would have to be called several times without the possibility to cache their results.
 */
public class SemanticSyncUtils {
	public static Collection<GenNode> getGenNodes(GenContainerBase genContainerBase, GenFeature genFeature) {
		Collection<GenNode> result = getGenChildFeature2genNodeMap(genContainerBase).get(genFeature);
		if (result == null) {
			return Collections.emptyList();
		}
		return result;
	}

	private static Map<GenFeature, Collection<GenNode>> getGenChildFeature2genNodeMap(GenContainerBase genContainerBase) {
		Map<GenFeature, Collection<GenNode>> result = myFeature2NodesCache.get(genContainerBase);
		if (result == null) {
			result = buildGenChildFeature2genNodeMap(genContainerBase);
			myFeature2NodesCache.put(genContainerBase, result);
		}
		return result;
	}

	private static Map<GenFeature, Collection<GenNode>> buildGenChildFeature2genNodeMap(GenContainerBase genContainerBase) {
		Map<GenFeature, Collection<GenNode>> result = new LinkedHashMap<GenFeature, Collection<GenNode>>();
		Collection<? extends GenNode> childNodes = new GMFGenSwitch<Collection<? extends GenNode>>() {
			@Override
			public Collection<? extends GenNode> caseGenDiagram(GenDiagram object) {
				return object.getTopLevelNodes();
			}
			@Override
			public Collection<? extends GenNode> caseGenChildContainer(GenChildContainer object) {
				return object.getChildNodes();
			}
		}.doSwitch(genContainerBase);
		for (GenNode nextNode : childNodes) {
			TypeModelFacet typeModelFacet = nextNode.getModelFacet();
			if (typeModelFacet == null) {
				continue;
			}
			GenFeature childMetaFeature = typeModelFacet.getChildMetaFeature();
			if (!result.containsKey(childMetaFeature)) {
				result.put(childMetaFeature, new ArrayList<GenNode>());
			}
			result.get(childMetaFeature).add(nextNode);
		}
		return result;
	}

	public static Collection<GenLink> getTypeGenLinks(GenCommonBase container, GenFeature feature, Collection<GenLink> containedLinks) {
		Collection<GenLink> result = getGenChildFeature2TypeGenLinkMap(container, containedLinks).get(feature);
		if (result == null) {
			return Collections.emptyList();
		}
		return result;
	}

	public static Collection<GenLink> getFeatureGenLinks(GenCommonBase container, GenFeature feature, Collection<GenLink> containedLinks) {
		Collection<GenLink> result = getGenChildFeature2FeatureGenLinkMap(container, containedLinks).get(feature);
		if (result == null) {
			return Collections.emptyList();
		}
		return result;
	}

	private static Map<GenFeature, Collection<GenLink>> getGenChildFeature2TypeGenLinkMap(GenCommonBase container, Collection<GenLink> containedLinks) {
		if (!myFeature2TypeLinksCache.containsKey(container)) {
			buildGenChildFeature2LinkMaps(container, containedLinks);
		}
		return myFeature2TypeLinksCache.get(container);
	}

	private static Map<GenFeature, Collection<GenLink>> getGenChildFeature2FeatureGenLinkMap(GenCommonBase container, Collection<GenLink> containedLinks) {
		if (!myFeature2FeatureLinksCache.containsKey(container)) {
			buildGenChildFeature2LinkMaps(container, containedLinks);
		}
		return myFeature2FeatureLinksCache.get(container);
	}

	private static void buildGenChildFeature2LinkMaps(GenCommonBase container, Collection<GenLink> containedLinks) {
		final Map<GenFeature, Collection<GenLink>> genFeature2TypeGenLinkMap = new LinkedHashMap<GenFeature, Collection<GenLink>>();
		final Map<GenFeature, Collection<GenLink>> genFeature2FeatureGenLinkMap = new LinkedHashMap<GenFeature, Collection<GenLink>>();
		for(final GenLink genLink : containedLinks) {
			new GMFGenSwitch<Object>() {
				@Override
				public Object caseTypeLinkModelFacet(TypeLinkModelFacet modelFacet) {
					GenFeature metaFeature = modelFacet.getChildMetaFeature();
					if (!genFeature2TypeGenLinkMap.containsKey(metaFeature)) {
						genFeature2TypeGenLinkMap.put(metaFeature, new ArrayList<GenLink>());
					}
					genFeature2TypeGenLinkMap.get(metaFeature).add(genLink);
					return null;
				}
				@Override
				public Object caseFeatureLinkModelFacet(FeatureLinkModelFacet modelFacet) {
					GenFeature metaFeature = modelFacet.getMetaFeature();
					if (!genFeature2FeatureGenLinkMap.containsKey(metaFeature)) {
						genFeature2FeatureGenLinkMap.put(metaFeature, new ArrayList<GenLink>());
					}
					genFeature2FeatureGenLinkMap.get(metaFeature).add(genLink);
					return null;
				}
			}.doSwitch(genLink.getModelFacet());
		}
		myFeature2TypeLinksCache.put(container, genFeature2TypeGenLinkMap);
		myFeature2FeatureLinksCache.put(container, genFeature2FeatureGenLinkMap);
	}

	public static Collection<GenCommonBase> buildAncestorClosure(Collection<GenCommonBase> elements) {
		Collection<GenCommonBase> result = new LinkedHashSet<GenCommonBase>(elements);
		for(GenCommonBase next : elements) {
			addAncestors(result, next);
		}
		return result;
	}

	private static void addAncestors(Collection<GenCommonBase> result, GenCommonBase next) {
		Collection<? extends GenCommonBase> ancestors = new GMFGenSwitch<Collection<? extends GenCommonBase>>() {
			@Override
			public Collection<? extends GenCommonBase> caseGenTopLevelNode(GenTopLevelNode object) {
				return Collections.singleton(object.getDiagram());
			}
			@Override
			public Collection<? extends GenCommonBase> caseGenCompartment(GenCompartment object) {
				return Collections.singleton(object.getNode());
			}
			@Override
			public Collection<? extends GenCommonBase> caseGenChildNode(GenChildNode object) {
				return object.getContainers();
			}
			@Override
			public Collection<? extends GenCommonBase> caseGenLink(GenLink object) {
				return getPossibleContainers(object);
			}
			@Override
			public Collection<? extends GenCommonBase> defaultCase(EObject object) {
				return Collections.emptyList();
			}
		}.doSwitch(next);
		for(GenCommonBase nextAncestor : ancestors) {
			if (!result.contains(nextAncestor)) {
				result.add(nextAncestor);
				addAncestors(result, nextAncestor);
			}
		}
	}

	private static Collection<? extends GenCommonBase> getPossibleContainers(GenLink link) {
		//XXX: NB: Implementation here must be synchronized with xpt::diagram::LinkFinder::getPossibleContainers(gmfgen::GenLink link)
		EClass containerClass = null;
		if (link.getModelFacet() instanceof TypeLinkModelFacet) {
			TypeLinkModelFacet facet = ((TypeLinkModelFacet) link.getModelFacet());
			if (facet.getContainmentMetaFeature() != null && facet.getContainmentMetaFeature().getGenClass() != null) {
				containerClass = ((TypeLinkModelFacet) link.getModelFacet()).getContainmentMetaFeature().getGenClass().getEcoreClass();
			}
		} else if (link.getModelFacet() instanceof FeatureLinkModelFacet) {
			FeatureLinkModelFacet facet = (FeatureLinkModelFacet) link.getModelFacet();
			if (facet.getMetaFeature() != null && facet.getMetaFeature().getGenClass() != null) {
				containerClass = facet.getMetaFeature().getGenClass().getEcoreClass();
			}
		}
		if (containerClass == null) {
			return Collections.emptyList();
		}
		Collection<GenCommonBase> result = new ArrayList<GenCommonBase>();
		result.add(link.getDiagram());
		result.addAll(link.getDiagram().getAllNodes());
		result.addAll(link.getDiagram().getLinks());
		for (Iterator<GenCommonBase> it = result.iterator(); it.hasNext(); ) {
			GenCommonBase next = it.next();
			GenClass effectiveMetaClass = getEffectiveMetaClass(next);
			if (effectiveMetaClass == null || !containerClass.isSuperTypeOf(effectiveMetaClass.getEcoreClass())) {
				it.remove();
			}
		}
		return result;
	}

	private static GenClass getEffectiveMetaClass(GenCommonBase element) {
		//XXX: NB: Implementation here must be synchronized with xpt::diagram::LinkFinder::getEffectiveMetaClass(...) methods
		return new GMFGenSwitch<GenClass>() {
			@Override
			public GenClass caseGenDiagram(GenDiagram object) {
				return object.getDomainDiagramElement();
			}
			@Override
			public GenClass caseGenNode(GenNode object) {
				return object.getDomainMetaClass();
			}
			@Override
			public GenClass caseGenLink(GenLink object) {
				return doSwitch(object.getModelFacet());
			}
			@Override
			public GenClass caseTypeLinkModelFacet(TypeLinkModelFacet object) {
				return object.getMetaClass();
			}
		}.doSwitch(element);
	}

	private static WeakHashMap<GenContainerBase, Map<GenFeature, Collection<GenNode>>> myFeature2NodesCache = new WeakHashMap<GenContainerBase, Map<GenFeature,Collection<GenNode>>>();
	private static WeakHashMap<GenCommonBase, Map<GenFeature, Collection<GenLink>>> myFeature2TypeLinksCache = new WeakHashMap<GenCommonBase, Map<GenFeature,Collection<GenLink>>>();
	private static WeakHashMap<GenCommonBase, Map<GenFeature, Collection<GenLink>>> myFeature2FeatureLinksCache = new WeakHashMap<GenCommonBase, Map<GenFeature,Collection<GenLink>>>();
}

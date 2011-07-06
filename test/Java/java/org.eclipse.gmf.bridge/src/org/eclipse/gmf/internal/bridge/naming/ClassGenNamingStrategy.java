/*
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.naming;

import java.util.Collection;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.gmf.codegen.gmfgen.FeatureLabelModelFacet;
import org.eclipse.gmf.codegen.gmfgen.FeatureLinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenLabel;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.TypeLinkModelFacet;
import org.eclipse.gmf.internal.common.NamesDispenser;

/**
 * Generates names based on model facet identifiers.
 * Should be consistent with genmodel naming strategy
 * and GenCommonBase.getClassNamePrefix() in particular.
 * 
 * @author dstadnik
 */
public class ClassGenNamingStrategy extends AbstractGenNamingStrategy {

	/**
	 * Max length of semantic segment.
	 * Concatenated feature names is the primary target.
	 */
	private static final int MAX_SEGMENT_LENGTH = 23;

	public ClassGenNamingStrategy(String suffix, NamesDispenser namesDispenser, GenNamingStrategy chainedNamingStrategy, GenNamingStrategy prefixNamingStrategy) {
		super(suffix, namesDispenser, chainedNamingStrategy, prefixNamingStrategy);
	}

	public String get(GenDiagram element) {
		if (element.getDomainDiagramElement() != null) {
			String name = element.getDomainDiagramElement().getName();
			if (!isEmpty(name)) {
				return createClassName(name);
			}
		}
		return super.get(element);
	}

	public String get(GenNode element) {
		if (element.getModelFacet() != null && element.getModelFacet().getMetaClass() != null) {
			String name = element.getModelFacet().getMetaClass().getName();
			if (!isEmpty(name)) {
				return createClassName(name);
			}
		}
		return super.get(element);
	}

	public String get(GenCompartment element) {
		String name = element.getTitle();
		if (!isEmpty(name)) {
			name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
			name = getCompartmentHostPrefix(element) + name;
			return createClassName(name);
		}
		return super.get(element);
	}

	public String get(GenLink element) {
		if (element.getModelFacet() instanceof TypeLinkModelFacet) {
			GenClass type = ((TypeLinkModelFacet) element.getModelFacet()).getMetaClass();
			if (type != null) {
				String name = type.getName();
				if (!isEmpty(name)) {
					return createClassName(name);
				}
			}
		}
		if (element.getModelFacet() instanceof FeatureLinkModelFacet) {
			GenFeature feature = ((FeatureLinkModelFacet) element.getModelFacet()).getMetaFeature();
			if (feature != null) {
				String name = feature.getName();
				if (!isEmpty(name)) {
					name = name.length() > 1 ? Character.toUpperCase(name.charAt(0)) + name.substring(1) : name.toUpperCase();
					name = feature.getGenClass().getName() + name;
					return createClassName(name);
				}
			}
		}
		return super.get(element);
	}

	public String get(GenLabel element) {
		if (element.getModelFacet() instanceof FeatureLabelModelFacet) {
			StringBuffer sb = new StringBuffer();
			for (GenFeature feature : (Collection<? extends GenFeature>) ((FeatureLabelModelFacet) element.getModelFacet()).getMetaFeatures()) {
				String name = feature.getName();
				if (!isEmpty(name)) {
					name = name.length() > 1 ? Character.toUpperCase(name.charAt(0)) + name.substring(1) : name.toUpperCase();
					sb.append(name);
				}
			}
			if (sb.length() > 0) {
				String name = sb.toString();
				if (name.length() > MAX_SEGMENT_LENGTH) {
					name = name.substring(0, MAX_SEGMENT_LENGTH);
				}
				return createClassName(getLabelHostPrefix(element) + name);
			}
		}
		return super.get(element);
	}
}

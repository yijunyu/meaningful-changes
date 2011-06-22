/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 *    Dmitry Stadnik (Borland) - delegate to chained starategy when unable to get name from model facet
 */
package org.eclipse.gmf.internal.bridge.naming;

import java.util.Collection;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.gmf.internal.common.NamesDispenser;
import org.eclipse.gmf.mappings.CanvasMapping;
import org.eclipse.gmf.mappings.FeatureLabelMapping;
import org.eclipse.gmf.mappings.LabelMapping;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.NodeMapping;

/**
 * Generates names based on model facet identifiers.
 * Should be consistent with genmodel naming strategy
 * and GenCommonBase.getClassNamePrefix() in particular.
 * 
 * @author artem
 */
public class ClassNamingStrategy extends AbstractNamingStrategy {

	/**
	 * Max length of semantic segment.
	 * Concatenated feature names is the primary target.
	 */
	private static final int MAX_SEGMENT_LENGTH = 23;

	public ClassNamingStrategy(String suffix, NamesDispenser namesDispenser, NamingStrategy chainedNamingStrategy, NamingStrategy prefixNamingStrategy) {
		super(suffix, namesDispenser, chainedNamingStrategy, prefixNamingStrategy);
	}

	public String get(CanvasMapping mapping) {
		if (mapping.getDomainMetaElement() != null) {
			String name = mapping.getDomainMetaElement().getName();
			if (!isEmpty(name)) {
				return createClassName(name);
			}
		}
		return super.get(mapping);
	}

	public String get(NodeMapping mapping) {
		if (mapping.getDomainMetaElement() != null) {
			String name = mapping.getDomainMetaElement().getName();
			if (!isEmpty(name)) {
				return createClassName(name);
			}
		}
		return super.get(mapping);
	}

	public String get(LinkMapping mapping) {
		if (mapping.getDomainMetaElement() != null) {
			String name = mapping.getDomainMetaElement().getName();
			if (!isEmpty(name)) {
				return createClassName(name);
			}
		}
		if (mapping.getLinkMetaFeature() != null) {
			String name = mapping.getLinkMetaFeature().getName();
			if (!isEmpty(name)) {
				name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
				name = mapping.getLinkMetaFeature().getEContainingClass().getName() + name;
				return createClassName(name);
			}
		}
		return super.get(mapping);
	}

	public String get(LabelMapping mapping) {
		if (mapping instanceof FeatureLabelMapping) {
			StringBuffer sb = new StringBuffer();
			for (EAttribute feature : (Collection<? extends EAttribute>) ((FeatureLabelMapping) mapping).getFeatures()) {
				String name = feature.getName();
				if (!isEmpty(name)) {
					name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
					sb.append(name);
				}
			}
			if (sb.length() > 0) {
				String name = sb.toString();
				if (name.length() > MAX_SEGMENT_LENGTH) {
					name = name.substring(0, MAX_SEGMENT_LENGTH);
				}
				return createClassName(getLabelHostPrefix(mapping) + name);
			}
		}
		return super.get(mapping);
	}
}

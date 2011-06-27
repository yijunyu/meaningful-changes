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
 */
package org.eclipse.gmf.internal.bridge.naming;

import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.internal.common.NamesDispenser;
import org.eclipse.gmf.mappings.CanvasMapping;
import org.eclipse.gmf.mappings.CompartmentMapping;
import org.eclipse.gmf.mappings.LabelMapping;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.MappingEntry;
import org.eclipse.gmf.mappings.NodeMapping;

/**
 * @author artem
 */
public abstract class AbstractNamingStrategy implements NamingStrategy {

	private final String suffix;

	private final NamesDispenser namesDispenser;

	private final NamingStrategy chainedNamingStrategy;

	private final NamingStrategy prefixNamingStrategy;

	public AbstractNamingStrategy(String suffix, NamesDispenser namesDispenser, NamingStrategy chainedNamingStrategy, NamingStrategy prefixNamingStrategy) {
		this.suffix = suffix;
		this.namesDispenser = namesDispenser;
		this.chainedNamingStrategy = chainedNamingStrategy;
		this.prefixNamingStrategy = prefixNamingStrategy;
	}

	protected String createClassName(String s) {
		s = getValidClassName(s);
		if (namesDispenser == null) {
			return suffix == null ? s : s + suffix;
		}
		return namesDispenser.get(s, suffix);
	}

	protected String getValidClassName(String s) {
		assert !isEmpty(s);
		s = CodeGenUtil.validJavaIdentifier(s);
		return Character.toUpperCase(s.charAt(0)) + s.substring(1);
	}

	protected boolean isEmpty(String s) {
		return s == null || s.length() == 0;
	}

	protected final NamingStrategy getChainedNamingStrategy() {
		return chainedNamingStrategy;
	}

	protected final NamingStrategy getPrefixNamingStrategy() {
		return prefixNamingStrategy;
	}

	public String get(CanvasMapping mapping) {
		if (chainedNamingStrategy != null) {
			return chainedNamingStrategy.get(mapping);
		}
		return null;
	}

	public String get(NodeMapping mapping) {
		if (chainedNamingStrategy != null) {
			return chainedNamingStrategy.get(mapping);
		}
		return null;
	}

	public String get(LinkMapping mapping) {
		if (chainedNamingStrategy != null) {
			return chainedNamingStrategy.get(mapping);
		}
		return null;
	}

	public String get(CompartmentMapping mapping) {
		if (chainedNamingStrategy != null) {
			return chainedNamingStrategy.get(mapping);
		}
		return null;
	}

	public String get(LabelMapping mapping) {
		if (chainedNamingStrategy != null) {
			return chainedNamingStrategy.get(mapping);
		}
		return null;
	}

	protected String getCompartmentHostPrefix(CompartmentMapping mapping) {
		return getPrefixNamingStrategy() != null ? getPrefixNamingStrategy().get(mapping.getParentNode()) : GenNode.CLASS_NAME_PREFIX;
	}

	protected String getLabelHostPrefix(LabelMapping mapping) {
		MappingEntry parentMapping = mapping.getMapEntry();
		if (parentMapping instanceof NodeMapping) {
			return getPrefixNamingStrategy() != null ? getPrefixNamingStrategy().get((NodeMapping) parentMapping) : GenNode.CLASS_NAME_PREFIX;
		} else if (parentMapping instanceof LinkMapping) {
			return getPrefixNamingStrategy() != null ? getPrefixNamingStrategy().get((LinkMapping) parentMapping) : GenLink.CLASS_NAME_PREFIX;
		} else {
			throw new IllegalArgumentException(String.valueOf(mapping));
		}
	}
}
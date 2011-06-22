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

import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenLabel;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenLinkLabel;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.GenNodeLabel;
import org.eclipse.gmf.internal.common.NamesDispenser;

/**
 * @author dstadnik
 */
public abstract class AbstractGenNamingStrategy implements GenNamingStrategy {

	private final String suffix;

	private final NamesDispenser namesDispenser;

	private final GenNamingStrategy chainedNamingStrategy;

	private final GenNamingStrategy prefixNamingStrategy;

	public AbstractGenNamingStrategy(String suffix, NamesDispenser namesDispenser, GenNamingStrategy chainedNamingStrategy, GenNamingStrategy prefixNamingStrategy) {
		this.suffix = suffix;
		this.namesDispenser = namesDispenser;
		this.chainedNamingStrategy = chainedNamingStrategy;
		this.prefixNamingStrategy = prefixNamingStrategy;
	}

	protected final GenNamingStrategy getChainedNamingStrategy() {
		return chainedNamingStrategy;
	}

	protected final GenNamingStrategy getPrefixNamingStrategy() {
		return prefixNamingStrategy;
	}

	public String get(GenDiagram element) {
		if (chainedNamingStrategy != null) {
			return chainedNamingStrategy.get(element);
		}
		return null;
	}

	public String get(GenNode element) {
		if (chainedNamingStrategy != null) {
			return chainedNamingStrategy.get(element);
		}
		return null;
	}

	public String get(GenCompartment element) {
		if (chainedNamingStrategy != null) {
			return chainedNamingStrategy.get(element);
		}
		return null;
	}

	public String get(GenLink element) {
		if (chainedNamingStrategy != null) {
			return chainedNamingStrategy.get(element);
		}
		return null;
	}

	public String get(GenLabel element) {
		if (chainedNamingStrategy != null) {
			return chainedNamingStrategy.get(element);
		}
		return null;
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

	protected String getCompartmentHostPrefix(GenCompartment element) {
		return getPrefixNamingStrategy() != null ? getPrefixNamingStrategy().get(element.getNode()) : GenNode.CLASS_NAME_PREFIX;
	}

	protected String getLabelHostPrefix(GenLabel element) {
		if (element instanceof GenNodeLabel) {
			return getPrefixNamingStrategy() != null ? getPrefixNamingStrategy().get(((GenNodeLabel) element).getNode()) : GenNode.CLASS_NAME_PREFIX;
		} else if (element instanceof GenLinkLabel) {
			return getPrefixNamingStrategy() != null ? getPrefixNamingStrategy().get(((GenLinkLabel) element).getLink()) : GenLink.CLASS_NAME_PREFIX;
		} else {
			throw new IllegalArgumentException(String.valueOf(element));
		}
	}
}

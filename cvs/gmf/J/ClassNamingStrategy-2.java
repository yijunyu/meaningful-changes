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

import java.util.Iterator;

import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.gmf.common.IncrementalNamesDispenser;
import org.eclipse.gmf.common.NamesDispenser;
import org.eclipse.gmf.mappings.CanvasMapping;
import org.eclipse.gmf.mappings.CompartmentMapping;
import org.eclipse.gmf.mappings.LabelMapping;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.MappingEntry;
import org.eclipse.gmf.mappings.NodeMapping;

/**
 * @author artem
 */
public class ClassNamingStrategy extends AbstractNamingStrategy {

	private final String mySuffix;

	public ClassNamingStrategy(String suffix) {
		this(suffix, null, new IncrementalNamesDispenser());
	}

	public ClassNamingStrategy(String suffix, NamingStrategy chained, NamesDispenser dispenser) {
		super(chained);
		assert suffix != null;
		mySuffix = suffix;
		setNamesDispenser(dispenser);
	}

	public String get(CanvasMapping cme) {
		if (cme.getDomainMetaElement() == null) {
			return super.get(cme);
		}
		return createClassName(cme.getDomainMetaElement().getName());
	}

	public String get(NodeMapping nme) {
		if (nme.getDomainContext() == null) {
			return super.get(nme);
		}
		return createClassName(nme.getDomainContext().getName());
	}

	public String get(LinkMapping lme) {
		if (lme.getDomainMetaElement() != null) {
			return createClassName(lme.getDomainMetaElement().getName());
		} else if (lme.getLinkMetaFeature() != null) {
			return createClassName(lme.getLinkMetaFeature().getName());
		}
		return super.get(lme);
	}

	public String get(CompartmentMapping cm) {
		if (cm.getParentNode().getDomainContext() == null || cm.getCompartment() == null) {
			return super.get(cm);
		}
		return createClassName(cm.getParentNode().getDomainContext().getName() + '_' + cm.getCompartment().getName());
	}

	private String getQualifier(LabelMapping mapping) {
		if (mapping.getFeatures().isEmpty()) {
			return "Unknown";
		}
		// FIXME gmfmap model says features are 0..*, assert contradicts?  
		assert mapping.getFeatures().size() > 0;
		StringBuffer sb = new StringBuffer();
		for (Iterator features = mapping.getFeatures().iterator(); features.hasNext();) {
			EAttribute feature = (EAttribute) features.next();
			if (sb.length() > 0) {
				sb.append('_');
			}
			sb.append(feature.getName());
		}
		return sb.toString();
	}

	public String get(LabelMapping labelMapping) {
		MappingEntry mapEntry = labelMapping.getMapEntry();
		if (mapEntry instanceof NodeMapping) {
			return getForNode((NodeMapping) mapEntry, labelMapping);
		} else if (mapEntry instanceof LinkMapping) {
			return getForLink((LinkMapping) mapEntry, labelMapping);
		}
		throw new IllegalStateException("Don't know how to handle mapEntry:" + mapEntry);
	}

	private String getForNode(NodeMapping nme, LabelMapping labelMapping) {
		if (nme.getDomainContext() == null) {
			return super.get(labelMapping);
		}
		String qualifier = getQualifier(labelMapping);
		return createClassName(nme.getDomainContext().getName() + '_' + qualifier);
	}

	private String getForLink(LinkMapping lme, LabelMapping labelMapping) {
		String qualifier = getQualifier(labelMapping);
		if (lme.getDomainMetaElement() != null) {
			return createClassName(lme.getDomainMetaElement().getName() + '_' + qualifier);
		} else if (lme.getLinkMetaFeature() != null) {
			return createClassName(lme.getLinkMetaFeature().getName() + '_' + qualifier);
		}
		return super.get(labelMapping);
	}

	protected String createClassName(String name) {
		name = CodeGenUtil.validJavaIdentifier(name);
		if (name == null) {
			name = "Unspecified";
		} else if (name.length() > 0) {
			name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
		}
		return getNamesDispenser() == null ? name + mySuffix : getNamesDispenser().get(name, mySuffix);
	}
}

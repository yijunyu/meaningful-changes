/*
 * Copyright (c) 2005 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.genmodel;

import java.util.Iterator;

import org.eclipse.gmf.mappings.AuditContainer;
import org.eclipse.gmf.mappings.CanvasMapping;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.Mapping;
import org.eclipse.gmf.mappings.MetricContainer;
import org.eclipse.gmf.mappings.TopNodeReference;

/**
 * Encapsulates iteration over diagram definition.
 * @author artem
 */
public abstract class MappingTransformer {

	public void transform(Mapping m) {
		process(m.getDiagram());
		for (Iterator it = m.getNodes().iterator(); it.hasNext();) {
			process((TopNodeReference) it.next());
		}
		for (Iterator it = m.getLinks().iterator(); it.hasNext();) {
			process((LinkMapping) it.next());
		}
		
		process(m.getMetrics());		
		process(m.getAudits());
	}

	protected abstract void process(CanvasMapping cme);
	protected abstract void process(TopNodeReference topNode);
	protected abstract void process(LinkMapping lme);
	protected abstract void process(AuditContainer audits);
	protected abstract void process(MetricContainer metrics);	
}
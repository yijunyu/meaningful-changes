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

import org.eclipse.gmf.mappings.AbstractNodeMapping;
import org.eclipse.gmf.mappings.CanvasMapping;
import org.eclipse.gmf.mappings.ChildNodeMapping;
import org.eclipse.gmf.mappings.CompartmentMapping;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.NodeMapping;

/**
 * @author artem
 */
public interface NamingStrategy {

	void setCache(UniqueValueDispenser dispenser);
	UniqueValueDispenser getCache();

	String get(CanvasMapping cme);

	String get(NodeMapping nme);

	String get(LinkMapping lme);

	String get(ChildNodeMapping nme);

	String get(CompartmentMapping cm);

	/*
	 * Eventually will be superseded with FeatureMappings
	 */
	String getForEditFeature(LinkMapping lme);
	String getForEditFeature(AbstractNodeMapping nme);
}
/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Michael Golubev (Borland) - initial API and implementation
 */

package org.eclipse.gmf.codegen.gmfgen.util;

import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.ViewmapLayoutType;

public final class ViewmapLayoutTypeHelper {
	private static ViewmapLayoutTypeHelper ourInstance;
	
	public static final ViewmapLayoutTypeHelper getSharedInstance(){
		if (ourInstance == null){
			ourInstance = new ViewmapLayoutTypeHelper();
		}
		return ourInstance;
	}

	public boolean isStoringChildPositions(ViewmapLayoutType layoutType){
		//FIXME: 
		//This method is called from various templates to determine whether edit part should react to the changes of View's bounds
		//(that is, whether is should have bounds oriented view styles and whether is should install notation model listeners)
		//The goal is to avoid installing of editpolicies that may save wrong bounds into the View
		//After this we will be able to return true here and remove this helper.
		return ViewmapLayoutType.XY_LAYOUT_LITERAL.equals(layoutType);
	}
	
	public boolean isStoringChildPositions(GenNode genNode){
		return isStoringChildPositions(genNode.getLayoutType());
	}
	
}

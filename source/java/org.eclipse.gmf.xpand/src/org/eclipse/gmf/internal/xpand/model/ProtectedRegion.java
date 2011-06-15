/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.gmf.internal.xpand.model;

public interface ProtectedRegion {

    public String getBody(String startComment, String endComment) throws ProtectedRegionSyntaxException;

    public String getStartString(String startComment, String endComment);

    public String getEndString(String startComment, String endComment);

}

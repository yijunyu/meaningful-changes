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
package org.eclipse.gmf.internal.xpand;

import org.eclipse.gmf.internal.xpand.model.XpandResource;
import org.eclipse.gmf.internal.xpand.xtend.ast.XtendResource;


/**
 * FIXME no much sense to depend on File here, it's only builder who cares about files
 * TODO describe contract - when returns null
 */
public interface ResourceManager {

    XtendResource loadXtendResource(String fullyQualifiedName);

    XpandResource loadXpandResource(String fullyQualifiedName);

}

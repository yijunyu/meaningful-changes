/**
 * Copyright (c) 2006, 2007 Borland Software Corp.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.requests;

/**
 * Set of constants used by <i>Lite</i> runtime in addition to standard GEF request type constants. 
 */
public interface RequestConstants extends org.eclipse.gef.RequestConstants {
	/**
	 * Constant used to indicate that all bendpoints of the receiver link are being reset.
	 */
	public static final String REQ_SET_ALL_BENDPOINTS = "set_all_bendpoints";	//$NON-NLS-1$

	/**
	 * Constant used to indicate that the notational view of the receiver of the Request is being deleted, 
	 * while the underlying model element should be preserved.
	 * <p/>Requests with this type may be safely cast to {@link org.eclipse.gef.requests.GroupRequest}.
	 */
	public static final String REQ_DELETE_VIEW = "delete_view";	//$NON-NLS-1$
	/**
	 * Constant used to indicate that the notational view of the receiver of the Request should be unconditionally deleted, 
	 * while the underlying model element should be preserved.
	 * <p/>Requests with this type may be safely cast to {@link org.eclipse.gef.requests.GroupRequest}.
	 * <p/>Note that this is an internal request that is used by edit parts whose view
	 * is being deleted to unconditionally delete the view of the associated links. Clients are expected to use {@link #REQ_DELETE_VIEW} instead.
	 */
	public static final String REQ_FORCED_DELETE_VIEW = "forced_delete_view";	//$NON-NLS-1$
}

/*
 * Copyright (c) 2005, 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *    Radek Dvorak (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.validate;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;

/**
 * A utility for tracing debug information, filtering and generating trace output. 
 */
public class Trace {
	
	private static final Plugin plugin = GMFValidationPlugin.getDefault();
	
	/**
	 * private constructor for the static class.
	 */
	private Trace() {
		super();
	}
	
	/**
	 * String containing an open parenthesis.
	 * 
	 */
	private static final String PARENTHESIS_OPEN = "("; //$NON-NLS-1$

	/**
	 * String containing a close parenthesis.
	 * 
	 */
	private static final String PARENTHESIS_CLOSE = ")"; //$NON-NLS-1$

	/**
	 * Prefix for tracing the catching of throwables.
	 * 
	 */
	private static final String PREFIX_CATCHING = "CAUGHT "; //$NON-NLS-1$

	/**
	 * Separator containing a space.
	 * 
	 */
	private static final String SEPARATOR_SPACE = " "; //$NON-NLS-1$
	
	/**
	 * The cached debug options (for optimization).
	 */
	private static final Map<String, Boolean> cachedOptions = new HashMap<String, Boolean>();

	/**
	 * Retrieves a Boolean value indicating whether tracing is enabled.
	 * 
	 * @return Whether tracing is enabled. 
	 */
	protected static boolean shouldTrace() {
		return plugin.isDebugging();
	}

	/**
	 * Retrieves a Boolean value indicating whether tracing is enabled for the
	 * specified debug option.
	 * 
	 * @return Whether tracing is enabled for the debug option.
	 * @param option The debug option for which to determine trace enablement.
	 * 
	 */
	public static boolean shouldTrace(String option) {
		if (shouldTrace()) {
			Boolean value = null;
			
			synchronized (cachedOptions) {
				value = cachedOptions.get(option);
	
				if (null == value) {
					value = Boolean.valueOf(Platform.getDebugOption(option));
	
					cachedOptions.put(option, value);
				}
			}
			
			return value.booleanValue();
		}

		return false;
	}

	/**
	 * Traces the specified message from the specified plug-in.
	 * 
	 * @param plugin The plug-in from which to trace.
	 * @param message The message to be traced.
	 */
	public static void trace(String message) {
		if (shouldTrace()) {
			System.out.println(message);
		}
	}

	/**
	 * Traces the specified message for the specified
	 * debug option.
	 * 
	 * @param option The debug option for which to trace.
	 * @param message The message to be traced.
	 */
	public static void trace(String option, String message) {
		if (shouldTrace(option)) {
			trace(message);
		}
	}
	
	/**
	 * Traces the catching of the specified throwable.
	 * 
	 * @param option The debug option for which to trace.
	 * @param throwable The throwable that is being caught. 
	 */
	public static void catching(
		String option,
		Throwable throwable) {

		if (shouldTrace(option)) {

			trace(
				PREFIX_CATCHING
					+ SEPARATOR_SPACE				
					+ PARENTHESIS_OPEN
					+ throwable.getMessage()
					+ PARENTHESIS_CLOSE);
			throwable.printStackTrace(System.err);
		}
	}
}

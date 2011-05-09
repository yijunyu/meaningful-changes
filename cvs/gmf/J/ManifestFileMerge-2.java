/*
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.common.codegen;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.gmf.internal.common.Activator;
import org.eclipse.osgi.util.ManifestElement;
import org.osgi.framework.BundleException;

/**
 * If both files has header, 3 possible solutions are: Preserve (if explicitly stated by user), Append (if multivalue), Overwrite (if singlevalue).
 * If only old contents has a header, then Preserve.
 * If header present only in new text (and not among ignored), Insert.
 * @author artem
 */
public class ManifestFileMerge {
	private static final String IGNORE_MERGE_HEADER = "GMF-IgnoreMerge"; //$NON-NLS-1$

	private String[] myIgnoredHeaders;

	private final String myLineSeparator;

	public ManifestFileMerge() {
		this(System.getProperties().getProperty("line.separator")); //$NON-NLS-1$
	}

	/**
	 * @param lineSeparator line delimeter to use when formatting output 
	 */
	public ManifestFileMerge(String lineSeparator) {
		assert lineSeparator != null;
		myLineSeparator = lineSeparator;
	}

	public String process(String oldText, String newText) {
		try {
			cleanIgnoredHeaders();
			LinkedHashMap<String, String> oldHeaders = new LinkedHashMap<String, String>();
			ManifestElement.parseBundleManifest(new ByteArrayInputStream(oldText.getBytes("UTF8")), oldHeaders); //$NON-NLS-1$

			LinkedHashMap<String, String> newHeaders = new LinkedHashMap<String, String>();
			ManifestElement.parseBundleManifest(new ByteArrayInputStream(newText.getBytes("UTF8")), newHeaders); //$NON-NLS-1$
			initializeIgnoredHeaders(oldHeaders);
			for (String newHeader : newHeaders.keySet()) {
				if (!isIgnoredHeader(newHeader)) {
					if (oldHeaders.containsKey(newHeader)) {
						String oldValue = oldHeaders.get(newHeader);
						String newValue = newHeaders.get(newHeader);
						if (isMultivalued(oldValue) || isMultivalued(newValue)) {
							oldHeaders.put(newHeader, mergeMultivalued(oldValue, newValue));
						} else {
							// just overwrite simple attributes
							oldHeaders.put(newHeader, newValue);
						}
					} else {
						oldHeaders.put(newHeader, newHeaders.get(newHeader));
					}
				}
			}
			return format(oldHeaders);
		} catch (IOException ex) {
			return newText;
		} catch (BundleException ex) {
			Activator.logError("Error merging MANIFEST.MF", ex); //$NON-NLS-1$
			return newText;
		}
	}

	protected String format(Map<String, String> oldHeaders) {
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String,String> e : oldHeaders.entrySet()) {
			sb.append(e.getKey());
			sb.append(':');
			sb.append(' ');
			sb.append(formatValue(e.getValue()));
			sb.append(myLineSeparator);
		}
		return sb.toString();
	}

	protected CharSequence formatValue(String value) {
		if (!isMultivalued(value)) {
			return value;
		}
		String[] values = ManifestElement.getArrayFromList(value);
		assert values.length > 0; // otherwise, it won't be multivalued
		StringBuilder sb = new StringBuilder();
		sb.append(values[0]);
		for (int i = 1; i < values.length; i++) {
			sb.append(',');
			sb.append(myLineSeparator);
			sb.append(' ');
			sb.append(values[i]);
		}
		return sb;
	}

	private boolean isIgnoredHeader(String header) {
		assert myIgnoredHeaders != null;
		return Arrays.binarySearch(myIgnoredHeaders, header) >= 0;
	}

	private void initializeIgnoredHeaders(LinkedHashMap<String, String> oldHeaders) throws BundleException {
		if (!oldHeaders.containsKey(IGNORE_MERGE_HEADER)) {
			myIgnoredHeaders = new String[0];
			return;
		}
		ManifestElement[] values = ManifestElement.parseHeader(IGNORE_MERGE_HEADER, oldHeaders.get(IGNORE_MERGE_HEADER));
		if (values == null) {
			// log info - header is there but can't parse 
			myIgnoredHeaders = new String[0];
			return;
		}
		myIgnoredHeaders = new String[values.length];
		for (int i = 0; i < values.length; i++) {
			// XXX we may process directives like preserve, append or overwrite here later, if desired
			myIgnoredHeaders[i] = values[i].getValue();
		}
		Arrays.sort(myIgnoredHeaders);
	}

	private void cleanIgnoredHeaders() {
		myIgnoredHeaders = null;
	}

	private boolean isMultivalued(String value) {
		// ManifestElement.getArrayFromList(value).length > 1;
		return value.indexOf(',') > 0;
	}

	private String mergeMultivalued(String oldValue, String newValue) {
		String[] oldValues = ManifestElement.getArrayFromList(oldValue);
		LinkedList<String> returnValue = new LinkedList<String>();
		for (String s : oldValues) {
			returnValue.add(s);
		}
		Arrays.sort(oldValues);
		for (String n : ManifestElement.getArrayFromList(newValue)) {
			if (Arrays.binarySearch(oldValues, n) < 0) {
				returnValue.add(n);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (Iterator<String> it = returnValue.iterator(); it.hasNext();) {
			sb.append(it.next());
			if (it.hasNext()) {
				sb.append(',');
			}
		}
		return sb.toString();
	}
}

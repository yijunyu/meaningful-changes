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
import java.util.Enumeration;
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
							oldHeaders.put(newHeader, mergeMultivalued(newHeader, oldValue, newValue));
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

	protected String format(Map<String, String> oldHeaders) throws BundleException {
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String,String> e : oldHeaders.entrySet()) {
			sb.append(e.getKey());
			sb.append(':');
			sb.append(' ');
			if (valueFitsSingleLine(e.getKey(), e.getValue())) {
				sb.append(e.getValue());
			} else {
				sb.append(formatValue(e.getKey(), e.getValue()));
			}
			sb.append(myLineSeparator);
		}
		return sb.toString();
	}

	protected boolean valueFitsSingleLine(String headerHint, String value) {
		// manifest.mf line is limited to 72 bytes. Though value is not necessarily
		// fits into bytes (e.g. native symbols in UTF8 might be longer), with '70' we 
		// assume in most cases values are plain old ascii.
		return headerHint.length() + 2 /* colon space */ + value.length() < 70;
	}

	protected CharSequence formatValue(String headerHint, String value) throws BundleException {
		if (!isMultivalued(value)) {
			return value;
		}
		ManifestElement[] values = ManifestElement.parseHeader(headerHint, value);
		assert values.length > 0; // otherwise, it won't be multivalued
		StringBuilder sb = new StringBuilder();
		sb.append(formatValue(values[0]));
		for (int i = 1; i < values.length; i++) {
			sb.append(',');
			sb.append(myLineSeparator);
			sb.append(' ');
			sb.append(formatValue(values[i]));
		}
		return sb;
	}

	protected CharSequence formatValue(ManifestElement element) {
		StringBuilder sb = new StringBuilder(element.getValue());
		// using tokens for directives and quoted strings for attributes
		// seems to be PDE convention, though I didn't find exact code that does that.
		// Without such a convention, it's very hard to tell whether original
		// directive or attribute was quoted or not - specialized Tokenizer from 
		// ManifestElement rips this information out.
		for (Enumeration<?> en = element.getDirectiveKeys(); en != null && en.hasMoreElements();) {
			final String directiveKey = (String) en.nextElement();
			for (String v : element.getDirectives(directiveKey)) {
				sb.append(';');
				sb.append(directiveKey);
				sb.append(':');
				sb.append('=');
				sb.append(v);
			}
		}
		for (Enumeration<?> en = element.getKeys(); en != null && en.hasMoreElements();) {
			final String attrKey = (String) en.nextElement();
			for (String v : element.getAttributes(attrKey)) {
				sb.append(';');
				sb.append(attrKey);
				sb.append('=');
				sb.append('"');
				sb.append(v);
				sb.append('"');
			}
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
		// quick-and-dirty way. in rare cases may give false answer (i.e. when ;att="[1.0,2.0)"
		// but it's ok
		return value.indexOf(',') > 0;
	}

	/**
	 * TODO rewrite to return ManifestElements instead of serializing result to String
	 * which will be parsed once again at {@link #format(Map)}. 
	 */
	private String mergeMultivalued(String header, String oldValue, String newValue) throws BundleException {
		ManifestElement[] oldValues = ManifestElement.parseHeader(header, oldValue);
		if (oldValues == null || oldValues.length == 0) {
			return newValue;
		}
		String[] lookupValues = new String[oldValues.length]; // value parts of manifest entry only, no attributes or directives
		for (int i = 0; i < oldValues.length; i++) {
			lookupValues[i] = oldValues[i].getValue();
		}
		Arrays.sort(lookupValues);
		LinkedList<ManifestElement> additionalElements = new LinkedList<ManifestElement>();
		for (ManifestElement n :  ManifestElement.parseHeader(header, newValue)) {
			if (Arrays.binarySearch(lookupValues, n.getValue()) < 0) {
				additionalElements.add(n);
			}
		}
		StringBuilder sb = new StringBuilder();
		// we don't care about newlines as this is intermediate result
		for (ManifestElement me : oldValues) {
			sb.append(formatValue(me));
			sb.append(',');
		}
		for (ManifestElement me : additionalElements) {
			sb.append(formatValue(me));
			sb.append(',');
		}
		assert sb.charAt(sb.length() - 1) == ',';
		sb.setLength(sb.length() - 1);
		return sb.toString();
	}
}

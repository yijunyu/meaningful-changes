package org.eclipse.gmf.internal.common.codegen;

/**
 * @author dstadnik
 */
public abstract class TextMerger {

	protected static final String TAG = "gmf generator persistent region"; //$NON-NLS-1$

	protected static final String BEGIN_TAG = TAG + " begin"; //$NON-NLS-1$

	protected static final String END_TAG = TAG + " end"; //$NON-NLS-1$

	// private static final TextMerger PRP = new TaggedTextMerger("# " + BEGIN_TAG, "# " + END_TAG); //$NON-NLS-1$ //$NON-NLS-2$

	private static final TextMerger PRP = new PropertiesTextMerger();

	private static final TextMerger XML = new TaggedTextMerger("<!-- " + BEGIN_TAG + " -->", "<!-- " + END_TAG + " -->"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$

	public static TextMerger getForFile(String name) {
		if (name.endsWith(".properties")) { //$NON-NLS-1$
			return PRP;
		}
		if (name.endsWith(".xml")) { //$NON-NLS-1$
			return XML;
		}
		return null;
	}

	public abstract String process(String oldText, String newText);
}

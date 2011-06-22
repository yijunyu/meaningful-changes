package org.eclipse.gmf.internal.xpand;

import java.util.Collections;
import java.util.Map;
import java.util.Stack;

public class BufferOutput extends AbstractOutput {
	/**
	 * INV: size > 0
	 */
	private final Stack<StringBuilder> outletStack;

	private final Map<String, StringBuilder> namedSlots;

	public BufferOutput(StringBuilder buffer) {
		this(buffer, null);
	}

	// XXX not map but config to show whether to append/overwrite content
	public BufferOutput(StringBuilder buffer, Map<String, StringBuilder> namedSlots) {
		assert buffer != null;
		outletStack = new Stack<StringBuilder>();
		outletStack.push(buffer);
		if (namedSlots != null) {
			this.namedSlots = namedSlots;
		} else {
			this.namedSlots = Collections.emptyMap();
		}
	}

	public void closeFile() {
		if (outletStack.size() == 1) {
			String msg = "CLOSE FILE without previous openFile";
			System.err.println("<<<" + msg);
			throw new UnsupportedOperationException(msg);
		}
		outletStack.pop();
	}

	public void openFile(String path, String outletName) {
		if (!namedSlots.containsKey(outletName)) {
			String msg = "OPEN FILE ('" + path + "', " + outletName + ")";
			System.err.println(">>>" + msg);
			throw new UnsupportedOperationException(msg);
		}
		outletStack.push(namedSlots.get(outletName));
		assert outletStack.peek() != null;
	}

	@Override
	protected void doAppend(String text) {
		outletStack.peek().append(text);
	}
}
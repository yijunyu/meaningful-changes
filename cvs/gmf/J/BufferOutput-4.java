package org.eclipse.gmf.internal.xpand;

import java.util.Collections;
import java.util.Map;
import java.util.Stack;

import org.eclipse.gmf.internal.xpand.ast.TextStatement;
import org.eclipse.gmf.internal.xpand.expression.ast.SyntaxElement;
import org.eclipse.gmf.internal.xpand.model.Output;

public class BufferOutput implements Output {
	/**
	 * INV: size > 0
	 */
	private final Stack<StringBuilder> outletStack;

	private boolean deleteLine = false;

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

	public void enterStatement(SyntaxElement stmt) {
		if (stmt instanceof TextStatement) {
			deleteLine = ((TextStatement) stmt).isDeleteLine();
		}
	}

	public void exitStatement(SyntaxElement stmt) {
		deleteLine = false;
	}

	public void write(String text) {
		if (deleteLine) {
			int i = 0;
			while (i < text.length()) {
				char charAt = text.charAt(i);
				if (Character.isWhitespace(charAt)) {
					if ((charAt == '\r' || charAt == '\n') && (i+1 < text.length())) {
						char nextToLF = text.charAt(++i);
						if (nextToLF != charAt && (nextToLF == '\n' || nextToLF == '\r')) {
							i++;
						}
						break;
					}
				}
				i++;
			}
			outletStack.peek().append(text.substring(i));
			deleteLine = false;
		} else {
			outletStack.peek().append(text);
		}
	}
}
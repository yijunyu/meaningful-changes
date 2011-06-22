package org.eclipse.gmf.internal.xpand;

import org.eclipse.gmf.internal.xpand.ast.TextStatement;
import org.eclipse.gmf.internal.xpand.expression.ast.SyntaxElement;
import org.eclipse.gmf.internal.xpand.model.Output;

public abstract class AbstractOutput implements Output {
	private boolean deleteLine = false;

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
			doAppend(text.substring(i));
			deleteLine = false;
		} else {
			doAppend(text);
		}
	}

	protected abstract void doAppend(String text);
}

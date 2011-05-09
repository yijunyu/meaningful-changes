package org.eclipse.gmf.internal.xpand.util;

import java.util.Collection;

public class ParserException extends Exception {
	private static final long serialVersionUID = 1L;

	private final ErrorLocationInfo[] errors;

	public ParserException(Collection<? extends ErrorLocationInfo> errors) {
		this(errors.toArray(new ErrorLocationInfo[errors.size()]));
	}

	public ParserException(ErrorLocationInfo... errors) {
		assert errors != null && errors.length > 0;
		this.errors = errors;
	}

	public ErrorLocationInfo[] getParsingErrors() {
		return errors;
	}

	public static class ErrorLocationInfo {
		public final int startLine;
		public final int startColumn;
		public final int endLine;
		public final int endColumn;
		public final String message;

		public ErrorLocationInfo(String message) {
			this(message, -1, -1, -1, -1);
		}

		public ErrorLocationInfo(String message, int startLine, int startColumn, int endLine, int endColumn) {
			this.message = message;
			this.startLine = startLine;
			this.startColumn = startColumn;
			this.endLine = endLine;
			this.endColumn = endColumn;
		}
	}
}

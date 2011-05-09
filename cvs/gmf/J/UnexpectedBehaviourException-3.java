package org.eclipse.gmf.common;

/**
 * Checked flavor of {@link java.lang.IllegalStateException}.
 * @author artem
 */
public class UnexpectedBehaviourException extends Exception {
	private static final long serialVersionUID = 3762812684185579574L;

	public UnexpectedBehaviourException(String message) {
		super(message);
	}

	public UnexpectedBehaviourException(String message, Throwable cause) {
		super(message, cause);
	}

	public UnexpectedBehaviourException(Throwable cause) {
		super(cause);
	}
}

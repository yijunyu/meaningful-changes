/**
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * Represents a description of a validation problem.
 * @author bblajer
 */
public class ViolationDescriptor {
	private final String myMessage;
	private final URI myUri;
	private final Severity mySeverity;
	private final Object myReferent;

	/**
	 * Creates a new instance of a violation description with the specified attributes.
	 * @param severity
	 * @param message
	 * @param uri
	 */
	public ViolationDescriptor(Severity severity, String message, URI uri, Object data) {
		mySeverity = severity;
		myMessage = message;
		myUri = uri;
		myReferent = data;
	}

	/**
	 * Returns the message associated with this violation
	 */
	public String getMessage() {
		return myMessage;
	}

	/**
	 * Returns the severity of this violation
	 */
	public Severity getSeverity() {
		return mySeverity;
	}

	/**
	 * Returns the URI of the element associated with this violation
	 */
	public URI getUri() {
		return myUri;
	}

	/**
	 * Returns the representation this descriptor was created from.
	 */
	public Object getReferent() {
		return myReferent;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (obj == this) {
//			return true;
//		}
//		if (obj instanceof ViolationDescriptor) {
//			ViolationDescriptor that = (ViolationDescriptor) obj;
//			if (!this.myUri.equals(that.myUri)) {
//				return false;
//			}
//			if (!this.mySeverity.equals(that.mySeverity)) {
//				return false;
//			}
//			if (!this.myMessage.equals(that.myMessage)) {
//				return false;
//			}
//			return true;
//		}
//		return false;
//	}

	@Override
	public int hashCode() {
		return myUri.hashCode() + 17*mySeverity.hashCode() + 31*myMessage.hashCode();
	}

	/**
	 * Returns an instance of <code>ViolationDescriptor</code> from the given status or <code>null</code> if the status cannot be
	 * represented as a violation descriptor. Children of the status are not taken into account.
	 */
	public static ViolationDescriptor create(View view, IStatus validationStatus) {
		Severity severity;
		switch (validationStatus.getSeverity()) {
		case IStatus.INFO:
			severity = Severity.INFO;
			break;
		case IStatus.WARNING:
			severity = Severity.WARNING;
			break;
		case IStatus.ERROR:
			severity = Severity.ERROR;
			break;
		default:
			return null;
		}
		return new ViolationDescriptor(severity, validationStatus.getMessage(), EcoreUtil.getURI(view), validationStatus);
	}

	/**
	 * Returns an instance of <code>ViolationDescriptor</code> from the given diagnostic or <code>null</code> if diagnostic cannot be
	 * represented as a violation descriptor. Children of the diagnostic are not taken into account.
	 */
	public static ViolationDescriptor create(View view, Diagnostic diagnostic) {
		Severity severity;
		switch (diagnostic.getSeverity()) {
		case Diagnostic.INFO:
			severity = Severity.INFO;
			break;
		case Diagnostic.WARNING:
			severity = Severity.WARNING;
			break;
		case Diagnostic.ERROR:
			severity = Severity.ERROR;
			break;
		default:
			return null;
		}
		return new ViolationDescriptor(severity, diagnostic.getMessage(), EcoreUtil.getURI(view), diagnostic);
	}
}

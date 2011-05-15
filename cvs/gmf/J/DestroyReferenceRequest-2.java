/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2005.  All Rights Reserved.                    |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package org.eclipse.gmf.runtime.emf.type.core.requests;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * Request to destroy a reference from one model element to another.
 * 
 * @author ldamus
 */
public class DestroyReferenceRequest
	extends DestroyRequest {

	/**
	 * The element that contains the reference.
	 */
	private EObject container;

	/**
	 * The feature in the <code>container</code> that contains the reference.
	 */
	private EReference containingFeature;

	/**
	 * The referenced object.
	 */
	private EObject referencedObject;

	/**
	 * Constructs a new request to destroy a reference from one model element to
	 * another.
	 * 
	 * @param container
	 *            the element that contains the reference
	 * @param containingFeature
	 *            the feature in <code>container</code> that contains the
	 *            reference
	 * @param referencedObject
	 *            the referenced object
	 * @param confirmationRequired
	 *            <code>true</code> if the user should be prompted to confirm
	 *            the element deletion, <code>false</code> otherwise.
	 */
	public DestroyReferenceRequest(EObject container,
			EReference containingFeature, EObject referencedObject,
			boolean confirmationRequired) {

		super(confirmationRequired);
		this.container = container;
		this.containingFeature = containingFeature;
		this.referencedObject = referencedObject;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.DestroyRequest#getContainer()
	 */
	public EObject getContainer() {
		return container;
	}

	/**
	 * Sets the element that contains the reference.
	 * 
	 * @param container
	 *            the element that contains the reference
	 */
	public void setContainer(EObject container) {
		this.container = container;
	}

	/**
	 * Gets the feature in the <code>container</code> that contains the
	 * reference.
	 * 
	 * @return the feature in the <code>container</code> that contains the
	 *         reference
	 */
	public EReference getContainingFeature() {
		return containingFeature;
	}

	/**
	 * Sets the feature in the <code>container</code> that contains the
	 * reference.
	 * 
	 * @param containingFeature
	 *            the feature in the <code>container</code> that contains the
	 *            reference
	 */
	public void setContainingFeature(EReference containingFeature) {
		this.containingFeature = containingFeature;
	}

	/**
	 * Gets the referenced element.
	 * 
	 * @return the referenced element
	 */
	public EObject getReferencedObject() {
		return referencedObject;
	}

	/**
	 * Sets the referenced element.
	 * 
	 * @param referencedObject
	 *            the referenced element
	 */
	public void setReferencedObject(EObject referencedObject) {
		this.referencedObject = referencedObject;
	}
}
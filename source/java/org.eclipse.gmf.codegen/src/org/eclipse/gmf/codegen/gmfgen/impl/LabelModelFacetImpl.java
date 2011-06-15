/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenParserImplementation;
import org.eclipse.gmf.codegen.gmfgen.LabelModelFacet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Model Facet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.LabelModelFacetImpl#getParser <em>Parser</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LabelModelFacetImpl extends EObjectImpl implements LabelModelFacet {
	/**
	 * The cached value of the '{@link #getParser() <em>Parser</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParser()
	 * @generated
	 * @ordered
	 */
	protected GenParserImplementation parser;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelModelFacetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getLabelModelFacet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenParserImplementation getParser() {
		if (parser != null && parser.eIsProxy()) {
			InternalEObject oldParser = (InternalEObject)parser;
			parser = (GenParserImplementation)eResolveProxy(oldParser);
			if (parser != oldParser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.LABEL_MODEL_FACET__PARSER, oldParser, parser));
			}
		}
		return parser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenParserImplementation basicGetParser() {
		return parser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParser(GenParserImplementation newParser, NotificationChain msgs) {
		GenParserImplementation oldParser = parser;
		parser = newParser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.LABEL_MODEL_FACET__PARSER, oldParser, newParser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParser(GenParserImplementation newParser) {
		if (newParser != parser) {
			NotificationChain msgs = null;
			if (parser != null)
				msgs = ((InternalEObject)parser).eInverseRemove(this, GMFGenPackage.GEN_PARSER_IMPLEMENTATION__USES, GenParserImplementation.class, msgs);
			if (newParser != null)
				msgs = ((InternalEObject)newParser).eInverseAdd(this, GMFGenPackage.GEN_PARSER_IMPLEMENTATION__USES, GenParserImplementation.class, msgs);
			msgs = basicSetParser(newParser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.LABEL_MODEL_FACET__PARSER, newParser, newParser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.LABEL_MODEL_FACET__PARSER:
				if (parser != null)
					msgs = ((InternalEObject)parser).eInverseRemove(this, GMFGenPackage.GEN_PARSER_IMPLEMENTATION__USES, GenParserImplementation.class, msgs);
				return basicSetParser((GenParserImplementation)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.LABEL_MODEL_FACET__PARSER:
				return basicSetParser(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.LABEL_MODEL_FACET__PARSER:
				if (resolve) return getParser();
				return basicGetParser();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMFGenPackage.LABEL_MODEL_FACET__PARSER:
				setParser((GenParserImplementation)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GMFGenPackage.LABEL_MODEL_FACET__PARSER:
				setParser((GenParserImplementation)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GMFGenPackage.LABEL_MODEL_FACET__PARSER:
				return parser != null;
		}
		return super.eIsSet(featureID);
	}

} //LabelModelFacetImpl

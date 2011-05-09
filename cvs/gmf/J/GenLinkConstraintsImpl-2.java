/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.codegen.gmfgen.FeatureModelFacet;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenLinkConstraints;
import org.eclipse.gmf.codegen.gmfgen.LinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.TypeLinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.ValueExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Link Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkConstraintsImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkConstraintsImpl#getSourceEnd <em>Source End</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkConstraintsImpl#getTargetEnd <em>Target End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenLinkConstraintsImpl extends EObjectImpl implements GenLinkConstraints {
	/**
	 * The cached value of the '{@link #getSourceEnd() <em>Source End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceEnd()
	 * @generated
	 * @ordered
	 */
	protected ValueExpression sourceEnd = null;

	/**
	 * The cached value of the '{@link #getTargetEnd() <em>Target End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEnd()
	 * @generated
	 * @ordered
	 */
	protected ValueExpression targetEnd = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenLinkConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenLinkConstraints();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenLink getLink() {
		if (eContainerFeatureID != GMFGenPackage.GEN_LINK_CONSTRAINTS__LINK) return null;
		return (GenLink)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(GenLink newLink) {
		if (newLink != eContainer || (eContainerFeatureID != GMFGenPackage.GEN_LINK_CONSTRAINTS__LINK && newLink != null)) {
			if (EcoreUtil.isAncestor(this, newLink))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLink != null)
				msgs = ((InternalEObject)newLink).eInverseAdd(this, GMFGenPackage.GEN_LINK__CREATION_CONSTRAINTS, GenLink.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newLink, GMFGenPackage.GEN_LINK_CONSTRAINTS__LINK, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_LINK_CONSTRAINTS__LINK, newLink, newLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueExpression getSourceEnd() {
		return sourceEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceEnd(ValueExpression newSourceEnd, NotificationChain msgs) {
		ValueExpression oldSourceEnd = sourceEnd;
		sourceEnd = newSourceEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_LINK_CONSTRAINTS__SOURCE_END, oldSourceEnd, newSourceEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceEnd(ValueExpression newSourceEnd) {
		if (newSourceEnd != sourceEnd) {
			NotificationChain msgs = null;
			if (sourceEnd != null)
				msgs = ((InternalEObject)sourceEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_LINK_CONSTRAINTS__SOURCE_END, null, msgs);
			if (newSourceEnd != null)
				msgs = ((InternalEObject)newSourceEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_LINK_CONSTRAINTS__SOURCE_END, null, msgs);
			msgs = basicSetSourceEnd(newSourceEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_LINK_CONSTRAINTS__SOURCE_END, newSourceEnd, newSourceEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueExpression getTargetEnd() {
		return targetEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetEnd(ValueExpression newTargetEnd, NotificationChain msgs) {
		ValueExpression oldTargetEnd = targetEnd;
		targetEnd = newTargetEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_LINK_CONSTRAINTS__TARGET_END, oldTargetEnd, newTargetEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetEnd(ValueExpression newTargetEnd) {
		if (newTargetEnd != targetEnd) {
			NotificationChain msgs = null;
			if (targetEnd != null)
				msgs = ((InternalEObject)targetEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_LINK_CONSTRAINTS__TARGET_END, null, msgs);
			if (newTargetEnd != null)
				msgs = ((InternalEObject)newTargetEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_LINK_CONSTRAINTS__TARGET_END, null, msgs);
			msgs = basicSetTargetEnd(newTargetEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_LINK_CONSTRAINTS__TARGET_END, newTargetEnd, newTargetEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GenClass getLinkClass() {
		GenLink owningLink = getLink();
		if(owningLink != null) {
			if(owningLink.getModelFacet() instanceof TypeLinkModelFacet) {
				TypeLinkModelFacet modelFacet = (TypeLinkModelFacet)owningLink.getModelFacet();
				return modelFacet.getMetaClass();
			} 		
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GenClass getSourceEndContextClass() {
		GenLink owningLink = getLink();
		if(owningLink != null) {
			LinkModelFacet linkFacet = owningLink.getModelFacet();
			if(linkFacet instanceof TypeLinkModelFacet) {
				GenFeature metaFeature = ((TypeLinkModelFacet)linkFacet).getContainmentMetaFeature();
				return (metaFeature != null) ? metaFeature.getGenClass() : null;
			} else if(linkFacet instanceof FeatureModelFacet) {
				GenFeature metaFeature = ((FeatureModelFacet)linkFacet).getMetaFeature();
				return (metaFeature != null) ? metaFeature.getGenClass() : null;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GenClass getTargetEndContextClass() {
		GenLink owningLink = getLink();
		if(owningLink != null) {
			LinkModelFacet linkFacet = owningLink.getModelFacet();
			if(linkFacet instanceof TypeLinkModelFacet) {
				GenFeature targetFeature = ((TypeLinkModelFacet)linkFacet).getTargetMetaFeature();
				return (targetFeature != null) ? targetFeature.getTypeGenClass() : null;
			} else if(linkFacet instanceof FeatureModelFacet) {
				GenFeature metaFeature = ((FeatureModelFacet)linkFacet).getMetaFeature();
				return (metaFeature != null) ? metaFeature.getTypeGenClass() : null;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getConstraintsInstanceFieldName() {
		return (getLink() != null) ? getLink().getUniqueIdentifier() : ""; //$NON-NLS-1$ 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGenPackage.GEN_LINK_CONSTRAINTS__LINK:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, GMFGenPackage.GEN_LINK_CONSTRAINTS__LINK, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGenPackage.GEN_LINK_CONSTRAINTS__LINK:
					return eBasicSetContainer(null, GMFGenPackage.GEN_LINK_CONSTRAINTS__LINK, msgs);
				case GMFGenPackage.GEN_LINK_CONSTRAINTS__SOURCE_END:
					return basicSetSourceEnd(null, msgs);
				case GMFGenPackage.GEN_LINK_CONSTRAINTS__TARGET_END:
					return basicSetTargetEnd(null, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case GMFGenPackage.GEN_LINK_CONSTRAINTS__LINK:
					return eContainer.eInverseRemove(this, GMFGenPackage.GEN_LINK__CREATION_CONSTRAINTS, GenLink.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.GEN_LINK_CONSTRAINTS__LINK:
				return getLink();
			case GMFGenPackage.GEN_LINK_CONSTRAINTS__SOURCE_END:
				return getSourceEnd();
			case GMFGenPackage.GEN_LINK_CONSTRAINTS__TARGET_END:
				return getTargetEnd();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.GEN_LINK_CONSTRAINTS__LINK:
				setLink((GenLink)newValue);
				return;
			case GMFGenPackage.GEN_LINK_CONSTRAINTS__SOURCE_END:
				setSourceEnd((ValueExpression)newValue);
				return;
			case GMFGenPackage.GEN_LINK_CONSTRAINTS__TARGET_END:
				setTargetEnd((ValueExpression)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.GEN_LINK_CONSTRAINTS__LINK:
				setLink((GenLink)null);
				return;
			case GMFGenPackage.GEN_LINK_CONSTRAINTS__SOURCE_END:
				setSourceEnd((ValueExpression)null);
				return;
			case GMFGenPackage.GEN_LINK_CONSTRAINTS__TARGET_END:
				setTargetEnd((ValueExpression)null);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.GEN_LINK_CONSTRAINTS__LINK:
				return getLink() != null;
			case GMFGenPackage.GEN_LINK_CONSTRAINTS__SOURCE_END:
				return sourceEnd != null;
			case GMFGenPackage.GEN_LINK_CONSTRAINTS__TARGET_END:
				return targetEnd != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //GenLinkConstraintsImpl

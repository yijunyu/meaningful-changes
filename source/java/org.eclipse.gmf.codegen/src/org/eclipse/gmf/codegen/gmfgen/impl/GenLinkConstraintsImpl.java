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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.codegen.gmfgen.FeatureLinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenConstraint;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenLinkConstraints;
import org.eclipse.gmf.codegen.gmfgen.LinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.TypeLinkModelFacet;

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
	 * The cached value of the '{@link #getSourceEnd() <em>Source End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceEnd()
	 * @generated
	 * @ordered
	 */
	protected GenConstraint sourceEnd;

	/**
	 * The cached value of the '{@link #getTargetEnd() <em>Target End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEnd()
	 * @generated
	 * @ordered
	 */
	protected GenConstraint targetEnd;

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
	@Override
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
		return (GenLink)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLink(GenLink newLink, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLink, GMFGenPackage.GEN_LINK_CONSTRAINTS__LINK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(GenLink newLink) {
		if (newLink != eInternalContainer() || (eContainerFeatureID != GMFGenPackage.GEN_LINK_CONSTRAINTS__LINK && newLink != null)) {
			if (EcoreUtil.isAncestor(this, newLink))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLink != null)
				msgs = ((InternalEObject)newLink).eInverseAdd(this, GMFGenPackage.GEN_LINK__CREATION_CONSTRAINTS, GenLink.class, msgs);
			msgs = basicSetLink(newLink, msgs);
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
	public GenConstraint getSourceEnd() {
		if (sourceEnd != null && sourceEnd.eIsProxy()) {
			InternalEObject oldSourceEnd = (InternalEObject)sourceEnd;
			sourceEnd = (GenConstraint)eResolveProxy(oldSourceEnd);
			if (sourceEnd != oldSourceEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.GEN_LINK_CONSTRAINTS__SOURCE_END, oldSourceEnd, sourceEnd));
			}
		}
		return sourceEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenConstraint basicGetSourceEnd() {
		return sourceEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceEnd(GenConstraint newSourceEnd) {
		GenConstraint oldSourceEnd = sourceEnd;
		sourceEnd = newSourceEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_LINK_CONSTRAINTS__SOURCE_END, oldSourceEnd, sourceEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenConstraint getTargetEnd() {
		if (targetEnd != null && targetEnd.eIsProxy()) {
			InternalEObject oldTargetEnd = (InternalEObject)targetEnd;
			targetEnd = (GenConstraint)eResolveProxy(oldTargetEnd);
			if (targetEnd != oldTargetEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.GEN_LINK_CONSTRAINTS__TARGET_END, oldTargetEnd, targetEnd));
			}
		}
		return targetEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenConstraint basicGetTargetEnd() {
		return targetEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetEnd(GenConstraint newTargetEnd) {
		GenConstraint oldTargetEnd = targetEnd;
		targetEnd = newTargetEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_LINK_CONSTRAINTS__TARGET_END, oldTargetEnd, targetEnd));
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
				TypeLinkModelFacet typeLinkModelFacet = (TypeLinkModelFacet)linkFacet;
				if(typeLinkModelFacet.getSourceMetaFeature() != null) {
					return typeLinkModelFacet.getSourceMetaFeature().getTypeGenClass();
				}
				GenFeature metaFeature = ((TypeLinkModelFacet)linkFacet).getContainmentMetaFeature();
				return (metaFeature != null) ? metaFeature.getGenClass() : null;
			} else if(linkFacet instanceof FeatureLinkModelFacet) {
				GenFeature metaFeature = ((FeatureLinkModelFacet)linkFacet).getMetaFeature();
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
			} else if(linkFacet instanceof FeatureLinkModelFacet) {
				GenFeature metaFeature = ((FeatureLinkModelFacet)linkFacet).getMetaFeature();
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
	 * @generated NOT
	 */
	public boolean isValid() {
		return getSourceEndContextClass() != null && getTargetEndContextClass() != null && (getSourceEnd() != null || getTargetEnd() != null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_LINK_CONSTRAINTS__LINK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLink((GenLink)otherEnd, msgs);
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
			case GMFGenPackage.GEN_LINK_CONSTRAINTS__LINK:
				return basicSetLink(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case GMFGenPackage.GEN_LINK_CONSTRAINTS__LINK:
				return eInternalContainer().eInverseRemove(this, GMFGenPackage.GEN_LINK__CREATION_CONSTRAINTS, GenLink.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.GEN_LINK_CONSTRAINTS__LINK:
				return getLink();
			case GMFGenPackage.GEN_LINK_CONSTRAINTS__SOURCE_END:
				if (resolve) return getSourceEnd();
				return basicGetSourceEnd();
			case GMFGenPackage.GEN_LINK_CONSTRAINTS__TARGET_END:
				if (resolve) return getTargetEnd();
				return basicGetTargetEnd();
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
			case GMFGenPackage.GEN_LINK_CONSTRAINTS__LINK:
				setLink((GenLink)newValue);
				return;
			case GMFGenPackage.GEN_LINK_CONSTRAINTS__SOURCE_END:
				setSourceEnd((GenConstraint)newValue);
				return;
			case GMFGenPackage.GEN_LINK_CONSTRAINTS__TARGET_END:
				setTargetEnd((GenConstraint)newValue);
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
			case GMFGenPackage.GEN_LINK_CONSTRAINTS__LINK:
				setLink((GenLink)null);
				return;
			case GMFGenPackage.GEN_LINK_CONSTRAINTS__SOURCE_END:
				setSourceEnd((GenConstraint)null);
				return;
			case GMFGenPackage.GEN_LINK_CONSTRAINTS__TARGET_END:
				setTargetEnd((GenConstraint)null);
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
			case GMFGenPackage.GEN_LINK_CONSTRAINTS__LINK:
				return getLink() != null;
			case GMFGenPackage.GEN_LINK_CONSTRAINTS__SOURCE_END:
				return sourceEnd != null;
			case GMFGenPackage.GEN_LINK_CONSTRAINTS__TARGET_END:
				return targetEnd != null;
		}
		return super.eIsSet(featureID);
	}

} //GenLinkConstraintsImpl

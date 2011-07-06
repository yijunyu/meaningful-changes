/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.gmfgraph.Border;
import org.eclipse.gmf.gmfgraph.FigureDescriptor;
import org.eclipse.gmf.gmfgraph.FigureGallery;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.Layout;
import org.eclipse.gmf.gmfgraph.RealFigure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Figure Gallery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.FigureGalleryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.FigureGalleryImpl#getFigures <em>Figures</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.FigureGalleryImpl#getDescriptors <em>Descriptors</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.FigureGalleryImpl#getBorders <em>Borders</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.FigureGalleryImpl#getLayouts <em>Layouts</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.FigureGalleryImpl#getImplementationBundle <em>Implementation Bundle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FigureGalleryImpl extends EObjectImpl implements FigureGallery {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFigures() <em>Figures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigures()
	 * @generated
	 * @ordered
	 */
	protected EList<RealFigure> figures;

	/**
	 * The cached value of the '{@link #getDescriptors() <em>Descriptors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptors()
	 * @generated
	 * @ordered
	 */
	protected EList<FigureDescriptor> descriptors;

	/**
	 * The cached value of the '{@link #getBorders() <em>Borders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorders()
	 * @generated
	 * @ordered
	 */
	protected EList<Border> borders;

	/**
	 * The cached value of the '{@link #getLayouts() <em>Layouts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayouts()
	 * @generated
	 * @ordered
	 */
	protected EList<Layout> layouts;

	/**
	 * The default value of the '{@link #getImplementationBundle() <em>Implementation Bundle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationBundle()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_BUNDLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementationBundle() <em>Implementation Bundle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationBundle()
	 * @generated
	 * @ordered
	 */
	protected String implementationBundle = IMPLEMENTATION_BUNDLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FigureGalleryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getFigureGallery();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.FIGURE_GALLERY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealFigure> getFigures() {
		if (figures == null) {
			figures = new EObjectContainmentEList<RealFigure>(RealFigure.class, this, GMFGraphPackage.FIGURE_GALLERY__FIGURES);
		}
		return figures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FigureDescriptor> getDescriptors() {
		if (descriptors == null) {
			descriptors = new EObjectContainmentEList<FigureDescriptor>(FigureDescriptor.class, this, GMFGraphPackage.FIGURE_GALLERY__DESCRIPTORS);
		}
		return descriptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Border> getBorders() {
		if (borders == null) {
			borders = new EObjectContainmentEList<Border>(Border.class, this, GMFGraphPackage.FIGURE_GALLERY__BORDERS);
		}
		return borders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Layout> getLayouts() {
		if (layouts == null) {
			layouts = new EObjectContainmentEList<Layout>(Layout.class, this, GMFGraphPackage.FIGURE_GALLERY__LAYOUTS);
		}
		return layouts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplementationBundleGen() {
		return implementationBundle;
	}

	public String getImplementationBundle() {
		String value = getImplementationBundleGen();
		if (value != null && value.trim().length() > 0) {
			return value.trim();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationBundle(String newImplementationBundle) {
		String oldImplementationBundle = implementationBundle;
		implementationBundle = newImplementationBundle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.FIGURE_GALLERY__IMPLEMENTATION_BUNDLE, oldImplementationBundle, implementationBundle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGraphPackage.FIGURE_GALLERY__FIGURES:
				return ((InternalEList<?>)getFigures()).basicRemove(otherEnd, msgs);
			case GMFGraphPackage.FIGURE_GALLERY__DESCRIPTORS:
				return ((InternalEList<?>)getDescriptors()).basicRemove(otherEnd, msgs);
			case GMFGraphPackage.FIGURE_GALLERY__BORDERS:
				return ((InternalEList<?>)getBorders()).basicRemove(otherEnd, msgs);
			case GMFGraphPackage.FIGURE_GALLERY__LAYOUTS:
				return ((InternalEList<?>)getLayouts()).basicRemove(otherEnd, msgs);
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
			case GMFGraphPackage.FIGURE_GALLERY__NAME:
				return getName();
			case GMFGraphPackage.FIGURE_GALLERY__FIGURES:
				return getFigures();
			case GMFGraphPackage.FIGURE_GALLERY__DESCRIPTORS:
				return getDescriptors();
			case GMFGraphPackage.FIGURE_GALLERY__BORDERS:
				return getBorders();
			case GMFGraphPackage.FIGURE_GALLERY__LAYOUTS:
				return getLayouts();
			case GMFGraphPackage.FIGURE_GALLERY__IMPLEMENTATION_BUNDLE:
				return getImplementationBundle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMFGraphPackage.FIGURE_GALLERY__NAME:
				setName((String)newValue);
				return;
			case GMFGraphPackage.FIGURE_GALLERY__FIGURES:
				getFigures().clear();
				getFigures().addAll((Collection<? extends RealFigure>)newValue);
				return;
			case GMFGraphPackage.FIGURE_GALLERY__DESCRIPTORS:
				getDescriptors().clear();
				getDescriptors().addAll((Collection<? extends FigureDescriptor>)newValue);
				return;
			case GMFGraphPackage.FIGURE_GALLERY__BORDERS:
				getBorders().clear();
				getBorders().addAll((Collection<? extends Border>)newValue);
				return;
			case GMFGraphPackage.FIGURE_GALLERY__LAYOUTS:
				getLayouts().clear();
				getLayouts().addAll((Collection<? extends Layout>)newValue);
				return;
			case GMFGraphPackage.FIGURE_GALLERY__IMPLEMENTATION_BUNDLE:
				setImplementationBundle((String)newValue);
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
			case GMFGraphPackage.FIGURE_GALLERY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GMFGraphPackage.FIGURE_GALLERY__FIGURES:
				getFigures().clear();
				return;
			case GMFGraphPackage.FIGURE_GALLERY__DESCRIPTORS:
				getDescriptors().clear();
				return;
			case GMFGraphPackage.FIGURE_GALLERY__BORDERS:
				getBorders().clear();
				return;
			case GMFGraphPackage.FIGURE_GALLERY__LAYOUTS:
				getLayouts().clear();
				return;
			case GMFGraphPackage.FIGURE_GALLERY__IMPLEMENTATION_BUNDLE:
				setImplementationBundle(IMPLEMENTATION_BUNDLE_EDEFAULT);
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
			case GMFGraphPackage.FIGURE_GALLERY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GMFGraphPackage.FIGURE_GALLERY__FIGURES:
				return figures != null && !figures.isEmpty();
			case GMFGraphPackage.FIGURE_GALLERY__DESCRIPTORS:
				return descriptors != null && !descriptors.isEmpty();
			case GMFGraphPackage.FIGURE_GALLERY__BORDERS:
				return borders != null && !borders.isEmpty();
			case GMFGraphPackage.FIGURE_GALLERY__LAYOUTS:
				return layouts != null && !layouts.isEmpty();
			case GMFGraphPackage.FIGURE_GALLERY__IMPLEMENTATION_BUNDLE:
				return IMPLEMENTATION_BUNDLE_EDEFAULT == null ? implementationBundle != null : !IMPLEMENTATION_BUNDLE_EDEFAULT.equals(implementationBundle);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", implementationBundle: ");
		result.append(implementationBundle);
		result.append(')');
		return result.toString();
	}

} //FigureGalleryImpl

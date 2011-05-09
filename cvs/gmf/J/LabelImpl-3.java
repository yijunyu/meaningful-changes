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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.gmfgraph.ColorStyle;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FigureMarker;
import org.eclipse.gmf.gmfgraph.FontStyle;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.Identity;
import org.eclipse.gmf.gmfgraph.Label;
import org.eclipse.gmf.gmfgraph.Point;
import org.eclipse.gmf.gmfgraph.SizeStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.LabelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.LabelImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.LabelImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.LabelImpl#getColorStyle <em>Color Style</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.LabelImpl#getSizeStyle <em>Size Style</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.LabelImpl#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.LabelImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.LabelImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.LabelImpl#getLayoutManager <em>Layout Manager</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.LabelImpl#getResolvedChildren <em>Resolved Children</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.LabelImpl#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LabelImpl extends EObjectImpl implements Label {
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
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList children = null;

	/**
	 * The cached value of the '{@link #getColorStyle() <em>Color Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorStyle()
	 * @generated
	 * @ordered
	 */
	protected ColorStyle colorStyle = null;

	/**
	 * The cached value of the '{@link #getSizeStyle() <em>Size Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeStyle()
	 * @generated
	 * @ordered
	 */
	protected SizeStyle sizeStyle = null;

	/**
	 * The cached value of the '{@link #getFontStyle() <em>Font Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStyle()
	 * @generated
	 * @ordered
	 */
	protected FontStyle fontStyle = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Point location = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Point size = null;

	/**
	 * The default value of the '{@link #getLayoutManager() <em>Layout Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutManager()
	 * @generated
	 * @ordered
	 */
	protected static final String LAYOUT_MANAGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLayoutManager() <em>Layout Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutManager()
	 * @generated
	 * @ordered
	 */
	protected String layoutManager = LAYOUT_MANAGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getLabel();
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.LABEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList(FigureMarker.class, this, GMFGraphPackage.LABEL__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Figure getParent() {
		if (eContainerFeatureID != GMFGraphPackage.LABEL__PARENT) return null;
		return (Figure)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorStyle getColorStyle() {
		return colorStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColorStyle(ColorStyle newColorStyle, NotificationChain msgs) {
		ColorStyle oldColorStyle = colorStyle;
		colorStyle = newColorStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.LABEL__COLOR_STYLE, oldColorStyle, newColorStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorStyle(ColorStyle newColorStyle) {
		if (newColorStyle != colorStyle) {
			NotificationChain msgs = null;
			if (colorStyle != null)
				msgs = ((InternalEObject)colorStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.LABEL__COLOR_STYLE, null, msgs);
			if (newColorStyle != null)
				msgs = ((InternalEObject)newColorStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.LABEL__COLOR_STYLE, null, msgs);
			msgs = basicSetColorStyle(newColorStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.LABEL__COLOR_STYLE, newColorStyle, newColorStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeStyle getSizeStyle() {
		return sizeStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSizeStyle(SizeStyle newSizeStyle, NotificationChain msgs) {
		SizeStyle oldSizeStyle = sizeStyle;
		sizeStyle = newSizeStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.LABEL__SIZE_STYLE, oldSizeStyle, newSizeStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeStyle(SizeStyle newSizeStyle) {
		if (newSizeStyle != sizeStyle) {
			NotificationChain msgs = null;
			if (sizeStyle != null)
				msgs = ((InternalEObject)sizeStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.LABEL__SIZE_STYLE, null, msgs);
			if (newSizeStyle != null)
				msgs = ((InternalEObject)newSizeStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.LABEL__SIZE_STYLE, null, msgs);
			msgs = basicSetSizeStyle(newSizeStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.LABEL__SIZE_STYLE, newSizeStyle, newSizeStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontStyle getFontStyle() {
		return fontStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFontStyle(FontStyle newFontStyle, NotificationChain msgs) {
		FontStyle oldFontStyle = fontStyle;
		fontStyle = newFontStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.LABEL__FONT_STYLE, oldFontStyle, newFontStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontStyle(FontStyle newFontStyle) {
		if (newFontStyle != fontStyle) {
			NotificationChain msgs = null;
			if (fontStyle != null)
				msgs = ((InternalEObject)fontStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.LABEL__FONT_STYLE, null, msgs);
			if (newFontStyle != null)
				msgs = ((InternalEObject)newFontStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.LABEL__FONT_STYLE, null, msgs);
			msgs = basicSetFontStyle(newFontStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.LABEL__FONT_STYLE, newFontStyle, newFontStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Point newLocation, NotificationChain msgs) {
		Point oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.LABEL__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Point newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.LABEL__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.LABEL__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.LABEL__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(Point newSize, NotificationChain msgs) {
		Point oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.LABEL__SIZE, oldSize, newSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Point newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.LABEL__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.LABEL__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.LABEL__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLayoutManager() {
		return layoutManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutManager(String newLayoutManager) {
		String oldLayoutManager = layoutManager;
		layoutManager = newLayoutManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.LABEL__LAYOUT_MANAGER, oldLayoutManager, layoutManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getResolvedChildren() {
		// TODO: implement this method to return the 'Resolved Children' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.LABEL__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGraphPackage.LABEL__PARENT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, GMFGraphPackage.LABEL__PARENT, msgs);
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
				case GMFGraphPackage.LABEL__CHILDREN:
					return ((InternalEList)getChildren()).basicRemove(otherEnd, msgs);
				case GMFGraphPackage.LABEL__PARENT:
					return eBasicSetContainer(null, GMFGraphPackage.LABEL__PARENT, msgs);
				case GMFGraphPackage.LABEL__COLOR_STYLE:
					return basicSetColorStyle(null, msgs);
				case GMFGraphPackage.LABEL__SIZE_STYLE:
					return basicSetSizeStyle(null, msgs);
				case GMFGraphPackage.LABEL__FONT_STYLE:
					return basicSetFontStyle(null, msgs);
				case GMFGraphPackage.LABEL__LOCATION:
					return basicSetLocation(null, msgs);
				case GMFGraphPackage.LABEL__SIZE:
					return basicSetSize(null, msgs);
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
				case GMFGraphPackage.LABEL__PARENT:
					return eContainer.eInverseRemove(this, GMFGraphPackage.FIGURE__CHILDREN, Figure.class, msgs);
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
			case GMFGraphPackage.LABEL__NAME:
				return getName();
			case GMFGraphPackage.LABEL__CHILDREN:
				return getChildren();
			case GMFGraphPackage.LABEL__PARENT:
				return getParent();
			case GMFGraphPackage.LABEL__COLOR_STYLE:
				return getColorStyle();
			case GMFGraphPackage.LABEL__SIZE_STYLE:
				return getSizeStyle();
			case GMFGraphPackage.LABEL__FONT_STYLE:
				return getFontStyle();
			case GMFGraphPackage.LABEL__LOCATION:
				return getLocation();
			case GMFGraphPackage.LABEL__SIZE:
				return getSize();
			case GMFGraphPackage.LABEL__LAYOUT_MANAGER:
				return getLayoutManager();
			case GMFGraphPackage.LABEL__RESOLVED_CHILDREN:
				return getResolvedChildren();
			case GMFGraphPackage.LABEL__TEXT:
				return getText();
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
			case GMFGraphPackage.LABEL__NAME:
				setName((String)newValue);
				return;
			case GMFGraphPackage.LABEL__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection)newValue);
				return;
			case GMFGraphPackage.LABEL__COLOR_STYLE:
				setColorStyle((ColorStyle)newValue);
				return;
			case GMFGraphPackage.LABEL__SIZE_STYLE:
				setSizeStyle((SizeStyle)newValue);
				return;
			case GMFGraphPackage.LABEL__FONT_STYLE:
				setFontStyle((FontStyle)newValue);
				return;
			case GMFGraphPackage.LABEL__LOCATION:
				setLocation((Point)newValue);
				return;
			case GMFGraphPackage.LABEL__SIZE:
				setSize((Point)newValue);
				return;
			case GMFGraphPackage.LABEL__LAYOUT_MANAGER:
				setLayoutManager((String)newValue);
				return;
			case GMFGraphPackage.LABEL__TEXT:
				setText((String)newValue);
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
			case GMFGraphPackage.LABEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GMFGraphPackage.LABEL__CHILDREN:
				getChildren().clear();
				return;
			case GMFGraphPackage.LABEL__COLOR_STYLE:
				setColorStyle((ColorStyle)null);
				return;
			case GMFGraphPackage.LABEL__SIZE_STYLE:
				setSizeStyle((SizeStyle)null);
				return;
			case GMFGraphPackage.LABEL__FONT_STYLE:
				setFontStyle((FontStyle)null);
				return;
			case GMFGraphPackage.LABEL__LOCATION:
				setLocation((Point)null);
				return;
			case GMFGraphPackage.LABEL__SIZE:
				setSize((Point)null);
				return;
			case GMFGraphPackage.LABEL__LAYOUT_MANAGER:
				setLayoutManager(LAYOUT_MANAGER_EDEFAULT);
				return;
			case GMFGraphPackage.LABEL__TEXT:
				setText(TEXT_EDEFAULT);
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
			case GMFGraphPackage.LABEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GMFGraphPackage.LABEL__CHILDREN:
				return children != null && !children.isEmpty();
			case GMFGraphPackage.LABEL__PARENT:
				return getParent() != null;
			case GMFGraphPackage.LABEL__COLOR_STYLE:
				return colorStyle != null;
			case GMFGraphPackage.LABEL__SIZE_STYLE:
				return sizeStyle != null;
			case GMFGraphPackage.LABEL__FONT_STYLE:
				return fontStyle != null;
			case GMFGraphPackage.LABEL__LOCATION:
				return location != null;
			case GMFGraphPackage.LABEL__SIZE:
				return size != null;
			case GMFGraphPackage.LABEL__LAYOUT_MANAGER:
				return LAYOUT_MANAGER_EDEFAULT == null ? layoutManager != null : !LAYOUT_MANAGER_EDEFAULT.equals(layoutManager);
			case GMFGraphPackage.LABEL__RESOLVED_CHILDREN:
				return !getResolvedChildren().isEmpty();
			case GMFGraphPackage.LABEL__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Identity.class) {
			switch (derivedFeatureID) {
				case GMFGraphPackage.LABEL__NAME: return GMFGraphPackage.IDENTITY__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == Identity.class) {
			switch (baseFeatureID) {
				case GMFGraphPackage.IDENTITY__NAME: return GMFGraphPackage.LABEL__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", layoutManager: ");
		result.append(layoutManager);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //LabelImpl

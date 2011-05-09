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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.gmfgraph.Border;
import org.eclipse.gmf.gmfgraph.Color;
import org.eclipse.gmf.gmfgraph.CustomAttribute;
import org.eclipse.gmf.gmfgraph.CustomClass;
import org.eclipse.gmf.gmfgraph.CustomFigure;
import org.eclipse.gmf.gmfgraph.DiagramElement;
import org.eclipse.gmf.gmfgraph.Dimension;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FigureAccessor;
import org.eclipse.gmf.gmfgraph.FigureHandle;
import org.eclipse.gmf.gmfgraph.FigureMarker;
import org.eclipse.gmf.gmfgraph.Font;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.Identity;
import org.eclipse.gmf.gmfgraph.Insets;
import org.eclipse.gmf.gmfgraph.Layout;
import org.eclipse.gmf.gmfgraph.LayoutData;
import org.eclipse.gmf.gmfgraph.Layoutable;
import org.eclipse.gmf.gmfgraph.Point;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Figure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl#getLayoutData <em>Layout Data</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl#getReferencingElements <em>Referencing Elements</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl#getForegroundColor <em>Foreground Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl#getMaximumSize <em>Maximum Size</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl#getMinimumSize <em>Minimum Size</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl#getPreferredSize <em>Preferred Size</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl#getFont <em>Font</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl#getInsets <em>Insets</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl#getQualifiedClassName <em>Qualified Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl#getBundleName <em>Bundle Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl#getCustomChildren <em>Custom Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomFigureImpl extends EObjectImpl implements CustomFigure {
	/**
	 * The cached value of the '{@link #getLayoutData() <em>Layout Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutData()
	 * @generated
	 * @ordered
	 */
	protected LayoutData layoutData = null;

	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected Layout layout = null;

	/**
	 * The cached value of the '{@link #getReferencingElements() <em>Referencing Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencingElements()
	 * @generated
	 * @ordered
	 */
	protected EList referencingElements = null;

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
	 * The cached value of the '{@link #getForegroundColor() <em>Foreground Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForegroundColor()
	 * @generated
	 * @ordered
	 */
	protected Color foregroundColor = null;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected Color backgroundColor = null;

	/**
	 * The cached value of the '{@link #getMaximumSize() <em>Maximum Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSize()
	 * @generated
	 * @ordered
	 */
	protected Dimension maximumSize = null;

	/**
	 * The cached value of the '{@link #getMinimumSize() <em>Minimum Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumSize()
	 * @generated
	 * @ordered
	 */
	protected Dimension minimumSize = null;

	/**
	 * The cached value of the '{@link #getPreferredSize() <em>Preferred Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredSize()
	 * @generated
	 * @ordered
	 */
	protected Dimension preferredSize = null;

	/**
	 * The cached value of the '{@link #getFont() <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected Font font = null;

	/**
	 * The cached value of the '{@link #getInsets() <em>Insets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsets()
	 * @generated
	 * @ordered
	 */
	protected Insets insets = null;

	/**
	 * The cached value of the '{@link #getBorder() <em>Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected Border border = null;

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
	 * The default value of the '{@link #getQualifiedClassName() <em>Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifiedClassName() <em>Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedClassName()
	 * @generated
	 * @ordered
	 */
	protected String qualifiedClassName = QUALIFIED_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBundleName() <em>Bundle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundleName()
	 * @generated
	 * @ordered
	 */
	protected static final String BUNDLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBundleName() <em>Bundle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundleName()
	 * @generated
	 * @ordered
	 */
	protected String bundleName = BUNDLE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList attributes = null;

	/**
	 * The cached value of the '{@link #getCustomChildren() <em>Custom Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomChildren()
	 * @generated
	 * @ordered
	 */
	protected EList customChildren = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomFigureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getCustomFigure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutData getLayoutData() {
		return layoutData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayoutData(LayoutData newLayoutData, NotificationChain msgs) {
		LayoutData oldLayoutData = layoutData;
		layoutData = newLayoutData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__LAYOUT_DATA, oldLayoutData, newLayoutData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutData(LayoutData newLayoutData) {
		if (newLayoutData != layoutData) {
			NotificationChain msgs = null;
			if (layoutData != null)
				msgs = ((InternalEObject)layoutData).eInverseRemove(this, GMFGraphPackage.LAYOUT_DATA__OWNER, LayoutData.class, msgs);
			if (newLayoutData != null)
				msgs = ((InternalEObject)newLayoutData).eInverseAdd(this, GMFGraphPackage.LAYOUT_DATA__OWNER, LayoutData.class, msgs);
			msgs = basicSetLayoutData(newLayoutData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__LAYOUT_DATA, newLayoutData, newLayoutData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout getLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout(Layout newLayout, NotificationChain msgs) {
		Layout oldLayout = layout;
		layout = newLayout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__LAYOUT, oldLayout, newLayout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout(Layout newLayout) {
		if (newLayout != layout) {
			NotificationChain msgs = null;
			if (layout != null)
				msgs = ((InternalEObject)layout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.CUSTOM_FIGURE__LAYOUT, null, msgs);
			if (newLayout != null)
				msgs = ((InternalEObject)newLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.CUSTOM_FIGURE__LAYOUT, null, msgs);
			msgs = basicSetLayout(newLayout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__LAYOUT, newLayout, newLayout));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList(FigureMarker.class, this, GMFGraphPackage.CUSTOM_FIGURE__CHILDREN, GMFGraphPackage.FIGURE_MARKER__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Figure getParent() {
		if (eContainerFeatureID != GMFGraphPackage.CUSTOM_FIGURE__PARENT) return null;
		return (Figure)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getForegroundColor() {
		return foregroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForegroundColor(Color newForegroundColor, NotificationChain msgs) {
		Color oldForegroundColor = foregroundColor;
		foregroundColor = newForegroundColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__FOREGROUND_COLOR, oldForegroundColor, newForegroundColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForegroundColor(Color newForegroundColor) {
		if (newForegroundColor != foregroundColor) {
			NotificationChain msgs = null;
			if (foregroundColor != null)
				msgs = ((InternalEObject)foregroundColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.CUSTOM_FIGURE__FOREGROUND_COLOR, null, msgs);
			if (newForegroundColor != null)
				msgs = ((InternalEObject)newForegroundColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.CUSTOM_FIGURE__FOREGROUND_COLOR, null, msgs);
			msgs = basicSetForegroundColor(newForegroundColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__FOREGROUND_COLOR, newForegroundColor, newForegroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackgroundColor(Color newBackgroundColor, NotificationChain msgs) {
		Color oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__BACKGROUND_COLOR, oldBackgroundColor, newBackgroundColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColor(Color newBackgroundColor) {
		if (newBackgroundColor != backgroundColor) {
			NotificationChain msgs = null;
			if (backgroundColor != null)
				msgs = ((InternalEObject)backgroundColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.CUSTOM_FIGURE__BACKGROUND_COLOR, null, msgs);
			if (newBackgroundColor != null)
				msgs = ((InternalEObject)newBackgroundColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.CUSTOM_FIGURE__BACKGROUND_COLOR, null, msgs);
			msgs = basicSetBackgroundColor(newBackgroundColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__BACKGROUND_COLOR, newBackgroundColor, newBackgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension getMaximumSize() {
		return maximumSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaximumSize(Dimension newMaximumSize, NotificationChain msgs) {
		Dimension oldMaximumSize = maximumSize;
		maximumSize = newMaximumSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__MAXIMUM_SIZE, oldMaximumSize, newMaximumSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumSize(Dimension newMaximumSize) {
		if (newMaximumSize != maximumSize) {
			NotificationChain msgs = null;
			if (maximumSize != null)
				msgs = ((InternalEObject)maximumSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.CUSTOM_FIGURE__MAXIMUM_SIZE, null, msgs);
			if (newMaximumSize != null)
				msgs = ((InternalEObject)newMaximumSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.CUSTOM_FIGURE__MAXIMUM_SIZE, null, msgs);
			msgs = basicSetMaximumSize(newMaximumSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__MAXIMUM_SIZE, newMaximumSize, newMaximumSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension getMinimumSize() {
		return minimumSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinimumSize(Dimension newMinimumSize, NotificationChain msgs) {
		Dimension oldMinimumSize = minimumSize;
		minimumSize = newMinimumSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__MINIMUM_SIZE, oldMinimumSize, newMinimumSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumSize(Dimension newMinimumSize) {
		if (newMinimumSize != minimumSize) {
			NotificationChain msgs = null;
			if (minimumSize != null)
				msgs = ((InternalEObject)minimumSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.CUSTOM_FIGURE__MINIMUM_SIZE, null, msgs);
			if (newMinimumSize != null)
				msgs = ((InternalEObject)newMinimumSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.CUSTOM_FIGURE__MINIMUM_SIZE, null, msgs);
			msgs = basicSetMinimumSize(newMinimumSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__MINIMUM_SIZE, newMinimumSize, newMinimumSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension getPreferredSize() {
		return preferredSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreferredSize(Dimension newPreferredSize, NotificationChain msgs) {
		Dimension oldPreferredSize = preferredSize;
		preferredSize = newPreferredSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__PREFERRED_SIZE, oldPreferredSize, newPreferredSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferredSize(Dimension newPreferredSize) {
		if (newPreferredSize != preferredSize) {
			NotificationChain msgs = null;
			if (preferredSize != null)
				msgs = ((InternalEObject)preferredSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.CUSTOM_FIGURE__PREFERRED_SIZE, null, msgs);
			if (newPreferredSize != null)
				msgs = ((InternalEObject)newPreferredSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.CUSTOM_FIGURE__PREFERRED_SIZE, null, msgs);
			msgs = basicSetPreferredSize(newPreferredSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__PREFERRED_SIZE, newPreferredSize, newPreferredSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Font getFont() {
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFont(Font newFont, NotificationChain msgs) {
		Font oldFont = font;
		font = newFont;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__FONT, oldFont, newFont);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFont(Font newFont) {
		if (newFont != font) {
			NotificationChain msgs = null;
			if (font != null)
				msgs = ((InternalEObject)font).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.CUSTOM_FIGURE__FONT, null, msgs);
			if (newFont != null)
				msgs = ((InternalEObject)newFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.CUSTOM_FIGURE__FONT, null, msgs);
			msgs = basicSetFont(newFont, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__FONT, newFont, newFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Insets getInsets() {
		return insets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsets(Insets newInsets, NotificationChain msgs) {
		Insets oldInsets = insets;
		insets = newInsets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__INSETS, oldInsets, newInsets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsets(Insets newInsets) {
		if (newInsets != insets) {
			NotificationChain msgs = null;
			if (insets != null)
				msgs = ((InternalEObject)insets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.CUSTOM_FIGURE__INSETS, null, msgs);
			if (newInsets != null)
				msgs = ((InternalEObject)newInsets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.CUSTOM_FIGURE__INSETS, null, msgs);
			msgs = basicSetInsets(newInsets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__INSETS, newInsets, newInsets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Border getBorder() {
		return border;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBorder(Border newBorder, NotificationChain msgs) {
		Border oldBorder = border;
		border = newBorder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__BORDER, oldBorder, newBorder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorder(Border newBorder) {
		if (newBorder != border) {
			NotificationChain msgs = null;
			if (border != null)
				msgs = ((InternalEObject)border).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.CUSTOM_FIGURE__BORDER, null, msgs);
			if (newBorder != null)
				msgs = ((InternalEObject)newBorder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.CUSTOM_FIGURE__BORDER, null, msgs);
			msgs = basicSetBorder(newBorder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__BORDER, newBorder, newBorder));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__LOCATION, oldLocation, newLocation);
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
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.CUSTOM_FIGURE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.CUSTOM_FIGURE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__LOCATION, newLocation, newLocation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__SIZE, oldSize, newSize);
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
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.CUSTOM_FIGURE__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.CUSTOM_FIGURE__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReferencingElements() {
		if (referencingElements == null) {
			referencingElements = new EObjectWithInverseResolvingEList(DiagramElement.class, this, GMFGraphPackage.CUSTOM_FIGURE__REFERENCING_ELEMENTS, GMFGraphPackage.DIAGRAM_ELEMENT__FIGURE);
		}
		return referencingElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedClassName() {
		return qualifiedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedClassName(String newQualifiedClassName) {
		String oldQualifiedClassName = qualifiedClassName;
		qualifiedClassName = newQualifiedClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__QUALIFIED_CLASS_NAME, oldQualifiedClassName, qualifiedClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBundleName() {
		return bundleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBundleName(String newBundleName) {
		String oldBundleName = bundleName;
		bundleName = newBundleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_FIGURE__BUNDLE_NAME, oldBundleName, bundleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList(CustomAttribute.class, this, GMFGraphPackage.CUSTOM_FIGURE__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCustomChildren() {
		if (customChildren == null) {
			customChildren = new EObjectContainmentEList(FigureAccessor.class, this, GMFGraphPackage.CUSTOM_FIGURE__CUSTOM_CHILDREN);
		}
		return customChildren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGraphPackage.CUSTOM_FIGURE__LAYOUT_DATA:
				if (layoutData != null)
					msgs = ((InternalEObject)layoutData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.CUSTOM_FIGURE__LAYOUT_DATA, null, msgs);
				return basicSetLayoutData((LayoutData)otherEnd, msgs);
			case GMFGraphPackage.CUSTOM_FIGURE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, GMFGraphPackage.CUSTOM_FIGURE__PARENT, msgs);
			case GMFGraphPackage.CUSTOM_FIGURE__REFERENCING_ELEMENTS:
				return ((InternalEList)getReferencingElements()).basicAdd(otherEnd, msgs);
			case GMFGraphPackage.CUSTOM_FIGURE__CHILDREN:
				return ((InternalEList)getChildren()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGraphPackage.CUSTOM_FIGURE__LAYOUT_DATA:
				return basicSetLayoutData(null, msgs);
			case GMFGraphPackage.CUSTOM_FIGURE__LAYOUT:
				return basicSetLayout(null, msgs);
			case GMFGraphPackage.CUSTOM_FIGURE__PARENT:
				return eBasicSetContainer(null, GMFGraphPackage.CUSTOM_FIGURE__PARENT, msgs);
			case GMFGraphPackage.CUSTOM_FIGURE__REFERENCING_ELEMENTS:
				return ((InternalEList)getReferencingElements()).basicRemove(otherEnd, msgs);
			case GMFGraphPackage.CUSTOM_FIGURE__CHILDREN:
				return ((InternalEList)getChildren()).basicRemove(otherEnd, msgs);
			case GMFGraphPackage.CUSTOM_FIGURE__FOREGROUND_COLOR:
				return basicSetForegroundColor(null, msgs);
			case GMFGraphPackage.CUSTOM_FIGURE__BACKGROUND_COLOR:
				return basicSetBackgroundColor(null, msgs);
			case GMFGraphPackage.CUSTOM_FIGURE__MAXIMUM_SIZE:
				return basicSetMaximumSize(null, msgs);
			case GMFGraphPackage.CUSTOM_FIGURE__MINIMUM_SIZE:
				return basicSetMinimumSize(null, msgs);
			case GMFGraphPackage.CUSTOM_FIGURE__PREFERRED_SIZE:
				return basicSetPreferredSize(null, msgs);
			case GMFGraphPackage.CUSTOM_FIGURE__FONT:
				return basicSetFont(null, msgs);
			case GMFGraphPackage.CUSTOM_FIGURE__INSETS:
				return basicSetInsets(null, msgs);
			case GMFGraphPackage.CUSTOM_FIGURE__BORDER:
				return basicSetBorder(null, msgs);
			case GMFGraphPackage.CUSTOM_FIGURE__LOCATION:
				return basicSetLocation(null, msgs);
			case GMFGraphPackage.CUSTOM_FIGURE__SIZE:
				return basicSetSize(null, msgs);
			case GMFGraphPackage.CUSTOM_FIGURE__ATTRIBUTES:
				return ((InternalEList)getAttributes()).basicRemove(otherEnd, msgs);
			case GMFGraphPackage.CUSTOM_FIGURE__CUSTOM_CHILDREN:
				return ((InternalEList)getCustomChildren()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case GMFGraphPackage.CUSTOM_FIGURE__PARENT:
				return eInternalContainer().eInverseRemove(this, GMFGraphPackage.FIGURE__CHILDREN, Figure.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGraphPackage.CUSTOM_FIGURE__LAYOUT_DATA:
				return getLayoutData();
			case GMFGraphPackage.CUSTOM_FIGURE__LAYOUT:
				return getLayout();
			case GMFGraphPackage.CUSTOM_FIGURE__PARENT:
				return getParent();
			case GMFGraphPackage.CUSTOM_FIGURE__REFERENCING_ELEMENTS:
				return getReferencingElements();
			case GMFGraphPackage.CUSTOM_FIGURE__NAME:
				return getName();
			case GMFGraphPackage.CUSTOM_FIGURE__CHILDREN:
				return getChildren();
			case GMFGraphPackage.CUSTOM_FIGURE__FOREGROUND_COLOR:
				return getForegroundColor();
			case GMFGraphPackage.CUSTOM_FIGURE__BACKGROUND_COLOR:
				return getBackgroundColor();
			case GMFGraphPackage.CUSTOM_FIGURE__MAXIMUM_SIZE:
				return getMaximumSize();
			case GMFGraphPackage.CUSTOM_FIGURE__MINIMUM_SIZE:
				return getMinimumSize();
			case GMFGraphPackage.CUSTOM_FIGURE__PREFERRED_SIZE:
				return getPreferredSize();
			case GMFGraphPackage.CUSTOM_FIGURE__FONT:
				return getFont();
			case GMFGraphPackage.CUSTOM_FIGURE__INSETS:
				return getInsets();
			case GMFGraphPackage.CUSTOM_FIGURE__BORDER:
				return getBorder();
			case GMFGraphPackage.CUSTOM_FIGURE__LOCATION:
				return getLocation();
			case GMFGraphPackage.CUSTOM_FIGURE__SIZE:
				return getSize();
			case GMFGraphPackage.CUSTOM_FIGURE__QUALIFIED_CLASS_NAME:
				return getQualifiedClassName();
			case GMFGraphPackage.CUSTOM_FIGURE__BUNDLE_NAME:
				return getBundleName();
			case GMFGraphPackage.CUSTOM_FIGURE__ATTRIBUTES:
				return getAttributes();
			case GMFGraphPackage.CUSTOM_FIGURE__CUSTOM_CHILDREN:
				return getCustomChildren();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMFGraphPackage.CUSTOM_FIGURE__LAYOUT_DATA:
				setLayoutData((LayoutData)newValue);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__LAYOUT:
				setLayout((Layout)newValue);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__REFERENCING_ELEMENTS:
				getReferencingElements().clear();
				getReferencingElements().addAll((Collection)newValue);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__NAME:
				setName((String)newValue);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection)newValue);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__FOREGROUND_COLOR:
				setForegroundColor((Color)newValue);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__BACKGROUND_COLOR:
				setBackgroundColor((Color)newValue);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__MAXIMUM_SIZE:
				setMaximumSize((Dimension)newValue);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__MINIMUM_SIZE:
				setMinimumSize((Dimension)newValue);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__PREFERRED_SIZE:
				setPreferredSize((Dimension)newValue);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__FONT:
				setFont((Font)newValue);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__INSETS:
				setInsets((Insets)newValue);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__BORDER:
				setBorder((Border)newValue);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__LOCATION:
				setLocation((Point)newValue);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__SIZE:
				setSize((Point)newValue);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__QUALIFIED_CLASS_NAME:
				setQualifiedClassName((String)newValue);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__BUNDLE_NAME:
				setBundleName((String)newValue);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection)newValue);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__CUSTOM_CHILDREN:
				getCustomChildren().clear();
				getCustomChildren().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case GMFGraphPackage.CUSTOM_FIGURE__LAYOUT_DATA:
				setLayoutData((LayoutData)null);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__LAYOUT:
				setLayout((Layout)null);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__REFERENCING_ELEMENTS:
				getReferencingElements().clear();
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__CHILDREN:
				getChildren().clear();
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__FOREGROUND_COLOR:
				setForegroundColor((Color)null);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__BACKGROUND_COLOR:
				setBackgroundColor((Color)null);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__MAXIMUM_SIZE:
				setMaximumSize((Dimension)null);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__MINIMUM_SIZE:
				setMinimumSize((Dimension)null);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__PREFERRED_SIZE:
				setPreferredSize((Dimension)null);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__FONT:
				setFont((Font)null);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__INSETS:
				setInsets((Insets)null);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__BORDER:
				setBorder((Border)null);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__LOCATION:
				setLocation((Point)null);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__SIZE:
				setSize((Point)null);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__QUALIFIED_CLASS_NAME:
				setQualifiedClassName(QUALIFIED_CLASS_NAME_EDEFAULT);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__BUNDLE_NAME:
				setBundleName(BUNDLE_NAME_EDEFAULT);
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__CUSTOM_CHILDREN:
				getCustomChildren().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GMFGraphPackage.CUSTOM_FIGURE__LAYOUT_DATA:
				return layoutData != null;
			case GMFGraphPackage.CUSTOM_FIGURE__LAYOUT:
				return layout != null;
			case GMFGraphPackage.CUSTOM_FIGURE__PARENT:
				return getParent() != null;
			case GMFGraphPackage.CUSTOM_FIGURE__REFERENCING_ELEMENTS:
				return referencingElements != null && !referencingElements.isEmpty();
			case GMFGraphPackage.CUSTOM_FIGURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GMFGraphPackage.CUSTOM_FIGURE__CHILDREN:
				return children != null && !children.isEmpty();
			case GMFGraphPackage.CUSTOM_FIGURE__FOREGROUND_COLOR:
				return foregroundColor != null;
			case GMFGraphPackage.CUSTOM_FIGURE__BACKGROUND_COLOR:
				return backgroundColor != null;
			case GMFGraphPackage.CUSTOM_FIGURE__MAXIMUM_SIZE:
				return maximumSize != null;
			case GMFGraphPackage.CUSTOM_FIGURE__MINIMUM_SIZE:
				return minimumSize != null;
			case GMFGraphPackage.CUSTOM_FIGURE__PREFERRED_SIZE:
				return preferredSize != null;
			case GMFGraphPackage.CUSTOM_FIGURE__FONT:
				return font != null;
			case GMFGraphPackage.CUSTOM_FIGURE__INSETS:
				return insets != null;
			case GMFGraphPackage.CUSTOM_FIGURE__BORDER:
				return border != null;
			case GMFGraphPackage.CUSTOM_FIGURE__LOCATION:
				return location != null;
			case GMFGraphPackage.CUSTOM_FIGURE__SIZE:
				return size != null;
			case GMFGraphPackage.CUSTOM_FIGURE__QUALIFIED_CLASS_NAME:
				return QUALIFIED_CLASS_NAME_EDEFAULT == null ? qualifiedClassName != null : !QUALIFIED_CLASS_NAME_EDEFAULT.equals(qualifiedClassName);
			case GMFGraphPackage.CUSTOM_FIGURE__BUNDLE_NAME:
				return BUNDLE_NAME_EDEFAULT == null ? bundleName != null : !BUNDLE_NAME_EDEFAULT.equals(bundleName);
			case GMFGraphPackage.CUSTOM_FIGURE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case GMFGraphPackage.CUSTOM_FIGURE__CUSTOM_CHILDREN:
				return customChildren != null && !customChildren.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Layoutable.class) {
			switch (derivedFeatureID) {
				case GMFGraphPackage.CUSTOM_FIGURE__LAYOUT_DATA: return GMFGraphPackage.LAYOUTABLE__LAYOUT_DATA;
				case GMFGraphPackage.CUSTOM_FIGURE__LAYOUT: return GMFGraphPackage.LAYOUTABLE__LAYOUT;
				default: return -1;
			}
		}
		if (baseClass == FigureMarker.class) {
			switch (derivedFeatureID) {
				case GMFGraphPackage.CUSTOM_FIGURE__PARENT: return GMFGraphPackage.FIGURE_MARKER__PARENT;
				default: return -1;
			}
		}
		if (baseClass == FigureHandle.class) {
			switch (derivedFeatureID) {
				case GMFGraphPackage.CUSTOM_FIGURE__REFERENCING_ELEMENTS: return GMFGraphPackage.FIGURE_HANDLE__REFERENCING_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == Identity.class) {
			switch (derivedFeatureID) {
				case GMFGraphPackage.CUSTOM_FIGURE__NAME: return GMFGraphPackage.IDENTITY__NAME;
				default: return -1;
			}
		}
		if (baseClass == CustomClass.class) {
			switch (derivedFeatureID) {
				case GMFGraphPackage.CUSTOM_FIGURE__QUALIFIED_CLASS_NAME: return GMFGraphPackage.CUSTOM_CLASS__QUALIFIED_CLASS_NAME;
				case GMFGraphPackage.CUSTOM_FIGURE__BUNDLE_NAME: return GMFGraphPackage.CUSTOM_CLASS__BUNDLE_NAME;
				case GMFGraphPackage.CUSTOM_FIGURE__ATTRIBUTES: return GMFGraphPackage.CUSTOM_CLASS__ATTRIBUTES;
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
		if (baseClass == Layoutable.class) {
			switch (baseFeatureID) {
				case GMFGraphPackage.LAYOUTABLE__LAYOUT_DATA: return GMFGraphPackage.CUSTOM_FIGURE__LAYOUT_DATA;
				case GMFGraphPackage.LAYOUTABLE__LAYOUT: return GMFGraphPackage.CUSTOM_FIGURE__LAYOUT;
				default: return -1;
			}
		}
		if (baseClass == FigureMarker.class) {
			switch (baseFeatureID) {
				case GMFGraphPackage.FIGURE_MARKER__PARENT: return GMFGraphPackage.CUSTOM_FIGURE__PARENT;
				default: return -1;
			}
		}
		if (baseClass == FigureHandle.class) {
			switch (baseFeatureID) {
				case GMFGraphPackage.FIGURE_HANDLE__REFERENCING_ELEMENTS: return GMFGraphPackage.CUSTOM_FIGURE__REFERENCING_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == Identity.class) {
			switch (baseFeatureID) {
				case GMFGraphPackage.IDENTITY__NAME: return GMFGraphPackage.CUSTOM_FIGURE__NAME;
				default: return -1;
			}
		}
		if (baseClass == CustomClass.class) {
			switch (baseFeatureID) {
				case GMFGraphPackage.CUSTOM_CLASS__QUALIFIED_CLASS_NAME: return GMFGraphPackage.CUSTOM_FIGURE__QUALIFIED_CLASS_NAME;
				case GMFGraphPackage.CUSTOM_CLASS__BUNDLE_NAME: return GMFGraphPackage.CUSTOM_FIGURE__BUNDLE_NAME;
				case GMFGraphPackage.CUSTOM_CLASS__ATTRIBUTES: return GMFGraphPackage.CUSTOM_FIGURE__ATTRIBUTES;
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
		result.append(", qualifiedClassName: ");
		result.append(qualifiedClassName);
		result.append(", bundleName: ");
		result.append(bundleName);
		result.append(')');
		return result.toString();
	}

} //CustomFigureImpl

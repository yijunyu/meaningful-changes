/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.gmfgraph.Border;
import org.eclipse.gmf.gmfgraph.Color;
import org.eclipse.gmf.gmfgraph.DiagramElement;
import org.eclipse.gmf.gmfgraph.Dimension;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FigureHandle;
import org.eclipse.gmf.gmfgraph.FigureMarker;
import org.eclipse.gmf.gmfgraph.FigureRef;
import org.eclipse.gmf.gmfgraph.Font;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.Identity;
import org.eclipse.gmf.gmfgraph.Insets;
import org.eclipse.gmf.gmfgraph.Layout;
import org.eclipse.gmf.gmfgraph.LayoutData;
import org.eclipse.gmf.gmfgraph.Layoutable;
import org.eclipse.gmf.gmfgraph.LineKind;
import org.eclipse.gmf.gmfgraph.Point;
import org.eclipse.gmf.gmfgraph.Shape;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#getLayoutData <em>Layout Data</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#getReferencingElements <em>Referencing Elements</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#getForegroundColor <em>Foreground Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#getMaximumSize <em>Maximum Size</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#getMinimumSize <em>Minimum Size</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#getPreferredSize <em>Preferred Size</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#getFont <em>Font</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#getInsets <em>Insets</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#isOutline <em>Outline</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#isFill <em>Fill</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#getLineKind <em>Line Kind</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#isXorFill <em>Xor Fill</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#isXorOutline <em>Xor Outline</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#getResolvedChildren <em>Resolved Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ShapeImpl extends EObjectImpl implements Shape {
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
	 * The default value of the '{@link #isOutline() <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OUTLINE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isOutline() <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutline()
	 * @generated
	 * @ordered
	 */
	protected boolean outline = OUTLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #isFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFill()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFill()
	 * @generated
	 * @ordered
	 */
	protected boolean fill = FILL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_WIDTH_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
	protected int lineWidth = LINE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineKind() <em>Line Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineKind()
	 * @generated
	 * @ordered
	 */
	protected static final LineKind LINE_KIND_EDEFAULT = LineKind.LINE_SOLID_LITERAL;

	/**
	 * The cached value of the '{@link #getLineKind() <em>Line Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineKind()
	 * @generated
	 * @ordered
	 */
	protected LineKind lineKind = LINE_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #isXorFill() <em>Xor Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isXorFill()
	 * @generated
	 * @ordered
	 */
	protected static final boolean XOR_FILL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isXorFill() <em>Xor Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isXorFill()
	 * @generated
	 * @ordered
	 */
	protected boolean xorFill = XOR_FILL_EDEFAULT;

	/**
	 * The default value of the '{@link #isXorOutline() <em>Xor Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isXorOutline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean XOR_OUTLINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isXorOutline() <em>Xor Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isXorOutline()
	 * @generated
	 * @ordered
	 */
	protected boolean xorOutline = XOR_OUTLINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getShape();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__LAYOUT_DATA, oldLayoutData, newLayoutData);
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__LAYOUT_DATA, newLayoutData, newLayoutData));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__LAYOUT, oldLayout, newLayout);
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
				msgs = ((InternalEObject)layout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SHAPE__LAYOUT, null, msgs);
			if (newLayout != null)
				msgs = ((InternalEObject)newLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SHAPE__LAYOUT, null, msgs);
			msgs = basicSetLayout(newLayout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__LAYOUT, newLayout, newLayout));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList(FigureMarker.class, this, GMFGraphPackage.SHAPE__CHILDREN, GMFGraphPackage.FIGURE_MARKER__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Figure getParent() {
		if (eContainerFeatureID != GMFGraphPackage.SHAPE__PARENT) return null;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__FOREGROUND_COLOR, oldForegroundColor, newForegroundColor);
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
				msgs = ((InternalEObject)foregroundColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SHAPE__FOREGROUND_COLOR, null, msgs);
			if (newForegroundColor != null)
				msgs = ((InternalEObject)newForegroundColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SHAPE__FOREGROUND_COLOR, null, msgs);
			msgs = basicSetForegroundColor(newForegroundColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__FOREGROUND_COLOR, newForegroundColor, newForegroundColor));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__BACKGROUND_COLOR, oldBackgroundColor, newBackgroundColor);
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
				msgs = ((InternalEObject)backgroundColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SHAPE__BACKGROUND_COLOR, null, msgs);
			if (newBackgroundColor != null)
				msgs = ((InternalEObject)newBackgroundColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SHAPE__BACKGROUND_COLOR, null, msgs);
			msgs = basicSetBackgroundColor(newBackgroundColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__BACKGROUND_COLOR, newBackgroundColor, newBackgroundColor));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__MAXIMUM_SIZE, oldMaximumSize, newMaximumSize);
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
				msgs = ((InternalEObject)maximumSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SHAPE__MAXIMUM_SIZE, null, msgs);
			if (newMaximumSize != null)
				msgs = ((InternalEObject)newMaximumSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SHAPE__MAXIMUM_SIZE, null, msgs);
			msgs = basicSetMaximumSize(newMaximumSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__MAXIMUM_SIZE, newMaximumSize, newMaximumSize));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__MINIMUM_SIZE, oldMinimumSize, newMinimumSize);
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
				msgs = ((InternalEObject)minimumSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SHAPE__MINIMUM_SIZE, null, msgs);
			if (newMinimumSize != null)
				msgs = ((InternalEObject)newMinimumSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SHAPE__MINIMUM_SIZE, null, msgs);
			msgs = basicSetMinimumSize(newMinimumSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__MINIMUM_SIZE, newMinimumSize, newMinimumSize));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__PREFERRED_SIZE, oldPreferredSize, newPreferredSize);
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
				msgs = ((InternalEObject)preferredSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SHAPE__PREFERRED_SIZE, null, msgs);
			if (newPreferredSize != null)
				msgs = ((InternalEObject)newPreferredSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SHAPE__PREFERRED_SIZE, null, msgs);
			msgs = basicSetPreferredSize(newPreferredSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__PREFERRED_SIZE, newPreferredSize, newPreferredSize));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__FONT, oldFont, newFont);
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
				msgs = ((InternalEObject)font).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SHAPE__FONT, null, msgs);
			if (newFont != null)
				msgs = ((InternalEObject)newFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SHAPE__FONT, null, msgs);
			msgs = basicSetFont(newFont, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__FONT, newFont, newFont));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__INSETS, oldInsets, newInsets);
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
				msgs = ((InternalEObject)insets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SHAPE__INSETS, null, msgs);
			if (newInsets != null)
				msgs = ((InternalEObject)newInsets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SHAPE__INSETS, null, msgs);
			msgs = basicSetInsets(newInsets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__INSETS, newInsets, newInsets));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__BORDER, oldBorder, newBorder);
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
				msgs = ((InternalEObject)border).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SHAPE__BORDER, null, msgs);
			if (newBorder != null)
				msgs = ((InternalEObject)newBorder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SHAPE__BORDER, null, msgs);
			msgs = basicSetBorder(newBorder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__BORDER, newBorder, newBorder));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__LOCATION, oldLocation, newLocation);
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
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SHAPE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SHAPE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__LOCATION, newLocation, newLocation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__SIZE, oldSize, newSize);
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
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SHAPE__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SHAPE__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReferencingElements() {
		if (referencingElements == null) {
			referencingElements = new EObjectWithInverseResolvingEList(DiagramElement.class, this, GMFGraphPackage.SHAPE__REFERENCING_ELEMENTS, GMFGraphPackage.DIAGRAM_ELEMENT__FIGURE);
		}
		return referencingElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getResolvedChildren() {
		ArrayList r = new ArrayList(getChildren().size());
		for (Iterator it = getChildren().iterator(); it.hasNext();) {
			FigureMarker next = (FigureMarker) it.next();
			if (next instanceof FigureRef) {
				r.add(((FigureRef) next).getFigure());
			} else {
				assert next instanceof Figure;
				r.add(next);
			}
		}
		return new EcoreEList.UnmodifiableEList(this, GMFGraphPackage.eINSTANCE.getShape_ResolvedChildren(), r.size(), r.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGraphPackage.SHAPE__LAYOUT_DATA:
				if (layoutData != null)
					msgs = ((InternalEObject)layoutData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SHAPE__LAYOUT_DATA, null, msgs);
				return basicSetLayoutData((LayoutData)otherEnd, msgs);
			case GMFGraphPackage.SHAPE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, GMFGraphPackage.SHAPE__PARENT, msgs);
			case GMFGraphPackage.SHAPE__REFERENCING_ELEMENTS:
				return ((InternalEList)getReferencingElements()).basicAdd(otherEnd, msgs);
			case GMFGraphPackage.SHAPE__CHILDREN:
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
			case GMFGraphPackage.SHAPE__LAYOUT_DATA:
				return basicSetLayoutData(null, msgs);
			case GMFGraphPackage.SHAPE__LAYOUT:
				return basicSetLayout(null, msgs);
			case GMFGraphPackage.SHAPE__PARENT:
				return eBasicSetContainer(null, GMFGraphPackage.SHAPE__PARENT, msgs);
			case GMFGraphPackage.SHAPE__REFERENCING_ELEMENTS:
				return ((InternalEList)getReferencingElements()).basicRemove(otherEnd, msgs);
			case GMFGraphPackage.SHAPE__CHILDREN:
				return ((InternalEList)getChildren()).basicRemove(otherEnd, msgs);
			case GMFGraphPackage.SHAPE__FOREGROUND_COLOR:
				return basicSetForegroundColor(null, msgs);
			case GMFGraphPackage.SHAPE__BACKGROUND_COLOR:
				return basicSetBackgroundColor(null, msgs);
			case GMFGraphPackage.SHAPE__MAXIMUM_SIZE:
				return basicSetMaximumSize(null, msgs);
			case GMFGraphPackage.SHAPE__MINIMUM_SIZE:
				return basicSetMinimumSize(null, msgs);
			case GMFGraphPackage.SHAPE__PREFERRED_SIZE:
				return basicSetPreferredSize(null, msgs);
			case GMFGraphPackage.SHAPE__FONT:
				return basicSetFont(null, msgs);
			case GMFGraphPackage.SHAPE__INSETS:
				return basicSetInsets(null, msgs);
			case GMFGraphPackage.SHAPE__BORDER:
				return basicSetBorder(null, msgs);
			case GMFGraphPackage.SHAPE__LOCATION:
				return basicSetLocation(null, msgs);
			case GMFGraphPackage.SHAPE__SIZE:
				return basicSetSize(null, msgs);
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
			case GMFGraphPackage.SHAPE__PARENT:
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
			case GMFGraphPackage.SHAPE__LAYOUT_DATA:
				return getLayoutData();
			case GMFGraphPackage.SHAPE__LAYOUT:
				return getLayout();
			case GMFGraphPackage.SHAPE__PARENT:
				return getParent();
			case GMFGraphPackage.SHAPE__REFERENCING_ELEMENTS:
				return getReferencingElements();
			case GMFGraphPackage.SHAPE__NAME:
				return getName();
			case GMFGraphPackage.SHAPE__CHILDREN:
				return getChildren();
			case GMFGraphPackage.SHAPE__FOREGROUND_COLOR:
				return getForegroundColor();
			case GMFGraphPackage.SHAPE__BACKGROUND_COLOR:
				return getBackgroundColor();
			case GMFGraphPackage.SHAPE__MAXIMUM_SIZE:
				return getMaximumSize();
			case GMFGraphPackage.SHAPE__MINIMUM_SIZE:
				return getMinimumSize();
			case GMFGraphPackage.SHAPE__PREFERRED_SIZE:
				return getPreferredSize();
			case GMFGraphPackage.SHAPE__FONT:
				return getFont();
			case GMFGraphPackage.SHAPE__INSETS:
				return getInsets();
			case GMFGraphPackage.SHAPE__BORDER:
				return getBorder();
			case GMFGraphPackage.SHAPE__LOCATION:
				return getLocation();
			case GMFGraphPackage.SHAPE__SIZE:
				return getSize();
			case GMFGraphPackage.SHAPE__OUTLINE:
				return isOutline() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.SHAPE__FILL:
				return isFill() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.SHAPE__LINE_WIDTH:
				return new Integer(getLineWidth());
			case GMFGraphPackage.SHAPE__LINE_KIND:
				return getLineKind();
			case GMFGraphPackage.SHAPE__XOR_FILL:
				return isXorFill() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.SHAPE__XOR_OUTLINE:
				return isXorOutline() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.SHAPE__RESOLVED_CHILDREN:
				return getResolvedChildren();
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
			case GMFGraphPackage.SHAPE__LAYOUT_DATA:
				setLayoutData((LayoutData)newValue);
				return;
			case GMFGraphPackage.SHAPE__LAYOUT:
				setLayout((Layout)newValue);
				return;
			case GMFGraphPackage.SHAPE__REFERENCING_ELEMENTS:
				getReferencingElements().clear();
				getReferencingElements().addAll((Collection)newValue);
				return;
			case GMFGraphPackage.SHAPE__NAME:
				setName((String)newValue);
				return;
			case GMFGraphPackage.SHAPE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection)newValue);
				return;
			case GMFGraphPackage.SHAPE__FOREGROUND_COLOR:
				setForegroundColor((Color)newValue);
				return;
			case GMFGraphPackage.SHAPE__BACKGROUND_COLOR:
				setBackgroundColor((Color)newValue);
				return;
			case GMFGraphPackage.SHAPE__MAXIMUM_SIZE:
				setMaximumSize((Dimension)newValue);
				return;
			case GMFGraphPackage.SHAPE__MINIMUM_SIZE:
				setMinimumSize((Dimension)newValue);
				return;
			case GMFGraphPackage.SHAPE__PREFERRED_SIZE:
				setPreferredSize((Dimension)newValue);
				return;
			case GMFGraphPackage.SHAPE__FONT:
				setFont((Font)newValue);
				return;
			case GMFGraphPackage.SHAPE__INSETS:
				setInsets((Insets)newValue);
				return;
			case GMFGraphPackage.SHAPE__BORDER:
				setBorder((Border)newValue);
				return;
			case GMFGraphPackage.SHAPE__LOCATION:
				setLocation((Point)newValue);
				return;
			case GMFGraphPackage.SHAPE__SIZE:
				setSize((Point)newValue);
				return;
			case GMFGraphPackage.SHAPE__OUTLINE:
				setOutline(((Boolean)newValue).booleanValue());
				return;
			case GMFGraphPackage.SHAPE__FILL:
				setFill(((Boolean)newValue).booleanValue());
				return;
			case GMFGraphPackage.SHAPE__LINE_WIDTH:
				setLineWidth(((Integer)newValue).intValue());
				return;
			case GMFGraphPackage.SHAPE__LINE_KIND:
				setLineKind((LineKind)newValue);
				return;
			case GMFGraphPackage.SHAPE__XOR_FILL:
				setXorFill(((Boolean)newValue).booleanValue());
				return;
			case GMFGraphPackage.SHAPE__XOR_OUTLINE:
				setXorOutline(((Boolean)newValue).booleanValue());
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
			case GMFGraphPackage.SHAPE__LAYOUT_DATA:
				setLayoutData((LayoutData)null);
				return;
			case GMFGraphPackage.SHAPE__LAYOUT:
				setLayout((Layout)null);
				return;
			case GMFGraphPackage.SHAPE__REFERENCING_ELEMENTS:
				getReferencingElements().clear();
				return;
			case GMFGraphPackage.SHAPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GMFGraphPackage.SHAPE__CHILDREN:
				getChildren().clear();
				return;
			case GMFGraphPackage.SHAPE__FOREGROUND_COLOR:
				setForegroundColor((Color)null);
				return;
			case GMFGraphPackage.SHAPE__BACKGROUND_COLOR:
				setBackgroundColor((Color)null);
				return;
			case GMFGraphPackage.SHAPE__MAXIMUM_SIZE:
				setMaximumSize((Dimension)null);
				return;
			case GMFGraphPackage.SHAPE__MINIMUM_SIZE:
				setMinimumSize((Dimension)null);
				return;
			case GMFGraphPackage.SHAPE__PREFERRED_SIZE:
				setPreferredSize((Dimension)null);
				return;
			case GMFGraphPackage.SHAPE__FONT:
				setFont((Font)null);
				return;
			case GMFGraphPackage.SHAPE__INSETS:
				setInsets((Insets)null);
				return;
			case GMFGraphPackage.SHAPE__BORDER:
				setBorder((Border)null);
				return;
			case GMFGraphPackage.SHAPE__LOCATION:
				setLocation((Point)null);
				return;
			case GMFGraphPackage.SHAPE__SIZE:
				setSize((Point)null);
				return;
			case GMFGraphPackage.SHAPE__OUTLINE:
				setOutline(OUTLINE_EDEFAULT);
				return;
			case GMFGraphPackage.SHAPE__FILL:
				setFill(FILL_EDEFAULT);
				return;
			case GMFGraphPackage.SHAPE__LINE_WIDTH:
				setLineWidth(LINE_WIDTH_EDEFAULT);
				return;
			case GMFGraphPackage.SHAPE__LINE_KIND:
				setLineKind(LINE_KIND_EDEFAULT);
				return;
			case GMFGraphPackage.SHAPE__XOR_FILL:
				setXorFill(XOR_FILL_EDEFAULT);
				return;
			case GMFGraphPackage.SHAPE__XOR_OUTLINE:
				setXorOutline(XOR_OUTLINE_EDEFAULT);
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
			case GMFGraphPackage.SHAPE__LAYOUT_DATA:
				return layoutData != null;
			case GMFGraphPackage.SHAPE__LAYOUT:
				return layout != null;
			case GMFGraphPackage.SHAPE__PARENT:
				return getParent() != null;
			case GMFGraphPackage.SHAPE__REFERENCING_ELEMENTS:
				return referencingElements != null && !referencingElements.isEmpty();
			case GMFGraphPackage.SHAPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GMFGraphPackage.SHAPE__CHILDREN:
				return children != null && !children.isEmpty();
			case GMFGraphPackage.SHAPE__FOREGROUND_COLOR:
				return foregroundColor != null;
			case GMFGraphPackage.SHAPE__BACKGROUND_COLOR:
				return backgroundColor != null;
			case GMFGraphPackage.SHAPE__MAXIMUM_SIZE:
				return maximumSize != null;
			case GMFGraphPackage.SHAPE__MINIMUM_SIZE:
				return minimumSize != null;
			case GMFGraphPackage.SHAPE__PREFERRED_SIZE:
				return preferredSize != null;
			case GMFGraphPackage.SHAPE__FONT:
				return font != null;
			case GMFGraphPackage.SHAPE__INSETS:
				return insets != null;
			case GMFGraphPackage.SHAPE__BORDER:
				return border != null;
			case GMFGraphPackage.SHAPE__LOCATION:
				return location != null;
			case GMFGraphPackage.SHAPE__SIZE:
				return size != null;
			case GMFGraphPackage.SHAPE__OUTLINE:
				return outline != OUTLINE_EDEFAULT;
			case GMFGraphPackage.SHAPE__FILL:
				return fill != FILL_EDEFAULT;
			case GMFGraphPackage.SHAPE__LINE_WIDTH:
				return lineWidth != LINE_WIDTH_EDEFAULT;
			case GMFGraphPackage.SHAPE__LINE_KIND:
				return lineKind != LINE_KIND_EDEFAULT;
			case GMFGraphPackage.SHAPE__XOR_FILL:
				return xorFill != XOR_FILL_EDEFAULT;
			case GMFGraphPackage.SHAPE__XOR_OUTLINE:
				return xorOutline != XOR_OUTLINE_EDEFAULT;
			case GMFGraphPackage.SHAPE__RESOLVED_CHILDREN:
				return !getResolvedChildren().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOutline() {
		return outline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutline(boolean newOutline) {
		boolean oldOutline = outline;
		outline = newOutline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__OUTLINE, oldOutline, outline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFill() {
		return fill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFill(boolean newFill) {
		boolean oldFill = fill;
		fill = newFill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__FILL, oldFill, fill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineWidth() {
		return lineWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineWidth(int newLineWidth) {
		int oldLineWidth = lineWidth;
		lineWidth = newLineWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__LINE_WIDTH, oldLineWidth, lineWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineKind getLineKind() {
		return lineKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineKind(LineKind newLineKind) {
		LineKind oldLineKind = lineKind;
		lineKind = newLineKind == null ? LINE_KIND_EDEFAULT : newLineKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__LINE_KIND, oldLineKind, lineKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isXorFill() {
		return xorFill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXorFill(boolean newXorFill) {
		boolean oldXorFill = xorFill;
		xorFill = newXorFill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__XOR_FILL, oldXorFill, xorFill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isXorOutline() {
		return xorOutline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXorOutline(boolean newXorOutline) {
		boolean oldXorOutline = xorOutline;
		xorOutline = newXorOutline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__XOR_OUTLINE, oldXorOutline, xorOutline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Layoutable.class) {
			switch (derivedFeatureID) {
				case GMFGraphPackage.SHAPE__LAYOUT_DATA: return GMFGraphPackage.LAYOUTABLE__LAYOUT_DATA;
				case GMFGraphPackage.SHAPE__LAYOUT: return GMFGraphPackage.LAYOUTABLE__LAYOUT;
				default: return -1;
			}
		}
		if (baseClass == FigureMarker.class) {
			switch (derivedFeatureID) {
				case GMFGraphPackage.SHAPE__PARENT: return GMFGraphPackage.FIGURE_MARKER__PARENT;
				default: return -1;
			}
		}
		if (baseClass == FigureHandle.class) {
			switch (derivedFeatureID) {
				case GMFGraphPackage.SHAPE__REFERENCING_ELEMENTS: return GMFGraphPackage.FIGURE_HANDLE__REFERENCING_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == Identity.class) {
			switch (derivedFeatureID) {
				case GMFGraphPackage.SHAPE__NAME: return GMFGraphPackage.IDENTITY__NAME;
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
				case GMFGraphPackage.LAYOUTABLE__LAYOUT_DATA: return GMFGraphPackage.SHAPE__LAYOUT_DATA;
				case GMFGraphPackage.LAYOUTABLE__LAYOUT: return GMFGraphPackage.SHAPE__LAYOUT;
				default: return -1;
			}
		}
		if (baseClass == FigureMarker.class) {
			switch (baseFeatureID) {
				case GMFGraphPackage.FIGURE_MARKER__PARENT: return GMFGraphPackage.SHAPE__PARENT;
				default: return -1;
			}
		}
		if (baseClass == FigureHandle.class) {
			switch (baseFeatureID) {
				case GMFGraphPackage.FIGURE_HANDLE__REFERENCING_ELEMENTS: return GMFGraphPackage.SHAPE__REFERENCING_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == Identity.class) {
			switch (baseFeatureID) {
				case GMFGraphPackage.IDENTITY__NAME: return GMFGraphPackage.SHAPE__NAME;
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
		result.append(", outline: ");
		result.append(outline);
		result.append(", fill: ");
		result.append(fill);
		result.append(", lineWidth: ");
		result.append(lineWidth);
		result.append(", lineKind: ");
		result.append(lineKind);
		result.append(", xorFill: ");
		result.append(xorFill);
		result.append(", xorOutline: ");
		result.append(xorOutline);
		result.append(')');
		return result.toString();
	}

} //ShapeImpl

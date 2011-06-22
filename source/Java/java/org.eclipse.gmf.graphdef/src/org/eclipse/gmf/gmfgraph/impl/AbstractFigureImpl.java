/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmf.gmfgraph.AbstractFigure;
import org.eclipse.gmf.gmfgraph.Border;
import org.eclipse.gmf.gmfgraph.Color;
import org.eclipse.gmf.gmfgraph.Dimension;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FigureDescriptor;
import org.eclipse.gmf.gmfgraph.Font;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.Insets;
import org.eclipse.gmf.gmfgraph.Layout;
import org.eclipse.gmf.gmfgraph.LayoutData;
import org.eclipse.gmf.gmfgraph.Point;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Figure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl#getLayoutData <em>Layout Data</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl#getForegroundColor <em>Foreground Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl#getMaximumSize <em>Maximum Size</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl#getMinimumSize <em>Minimum Size</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl#getPreferredSize <em>Preferred Size</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl#getFont <em>Font</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl#getInsets <em>Insets</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractFigureImpl extends EObjectImpl implements AbstractFigure {
	/**
	 * The cached value of the '{@link #getLayoutData() <em>Layout Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutData()
	 * @generated
	 * @ordered
	 */
	protected LayoutData layoutData;

	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected Layout layout;

	/**
	 * The cached value of the '{@link #getForegroundColor() <em>Foreground Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForegroundColor()
	 * @generated
	 * @ordered
	 */
	protected Color foregroundColor;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected Color backgroundColor;

	/**
	 * The cached value of the '{@link #getMaximumSize() <em>Maximum Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSize()
	 * @generated
	 * @ordered
	 */
	protected Dimension maximumSize;

	/**
	 * The cached value of the '{@link #getMinimumSize() <em>Minimum Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumSize()
	 * @generated
	 * @ordered
	 */
	protected Dimension minimumSize;

	/**
	 * The cached value of the '{@link #getPreferredSize() <em>Preferred Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredSize()
	 * @generated
	 * @ordered
	 */
	protected Dimension preferredSize;

	/**
	 * The cached value of the '{@link #getFont() <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected Font font;

	/**
	 * The cached value of the '{@link #getInsets() <em>Insets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsets()
	 * @generated
	 * @ordered
	 */
	protected Insets insets;

	/**
	 * The cached value of the '{@link #getBorder() <em>Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected Border border;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Point location;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Point size;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractFigureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getAbstractFigure();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.ABSTRACT_FIGURE__LAYOUT_DATA, oldLayoutData, newLayoutData);
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.ABSTRACT_FIGURE__LAYOUT_DATA, newLayoutData, newLayoutData));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.ABSTRACT_FIGURE__LAYOUT, oldLayout, newLayout);
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
				msgs = ((InternalEObject)layout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.ABSTRACT_FIGURE__LAYOUT, null, msgs);
			if (newLayout != null)
				msgs = ((InternalEObject)newLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.ABSTRACT_FIGURE__LAYOUT, null, msgs);
			msgs = basicSetLayout(newLayout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.ABSTRACT_FIGURE__LAYOUT, newLayout, newLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FigureDescriptor getDescriptor() {
		if (eContainer() instanceof FigureDescriptor) {
			return (FigureDescriptor) eContainer();
		}
		if (eContainer() instanceof Figure) {
			return ((Figure) eContainer()).getDescriptor();
		}
		return null;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.ABSTRACT_FIGURE__FOREGROUND_COLOR, oldForegroundColor, newForegroundColor);
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
				msgs = ((InternalEObject)foregroundColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.ABSTRACT_FIGURE__FOREGROUND_COLOR, null, msgs);
			if (newForegroundColor != null)
				msgs = ((InternalEObject)newForegroundColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.ABSTRACT_FIGURE__FOREGROUND_COLOR, null, msgs);
			msgs = basicSetForegroundColor(newForegroundColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.ABSTRACT_FIGURE__FOREGROUND_COLOR, newForegroundColor, newForegroundColor));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.ABSTRACT_FIGURE__BACKGROUND_COLOR, oldBackgroundColor, newBackgroundColor);
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
				msgs = ((InternalEObject)backgroundColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.ABSTRACT_FIGURE__BACKGROUND_COLOR, null, msgs);
			if (newBackgroundColor != null)
				msgs = ((InternalEObject)newBackgroundColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.ABSTRACT_FIGURE__BACKGROUND_COLOR, null, msgs);
			msgs = basicSetBackgroundColor(newBackgroundColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.ABSTRACT_FIGURE__BACKGROUND_COLOR, newBackgroundColor, newBackgroundColor));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.ABSTRACT_FIGURE__MAXIMUM_SIZE, oldMaximumSize, newMaximumSize);
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
				msgs = ((InternalEObject)maximumSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.ABSTRACT_FIGURE__MAXIMUM_SIZE, null, msgs);
			if (newMaximumSize != null)
				msgs = ((InternalEObject)newMaximumSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.ABSTRACT_FIGURE__MAXIMUM_SIZE, null, msgs);
			msgs = basicSetMaximumSize(newMaximumSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.ABSTRACT_FIGURE__MAXIMUM_SIZE, newMaximumSize, newMaximumSize));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.ABSTRACT_FIGURE__MINIMUM_SIZE, oldMinimumSize, newMinimumSize);
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
				msgs = ((InternalEObject)minimumSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.ABSTRACT_FIGURE__MINIMUM_SIZE, null, msgs);
			if (newMinimumSize != null)
				msgs = ((InternalEObject)newMinimumSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.ABSTRACT_FIGURE__MINIMUM_SIZE, null, msgs);
			msgs = basicSetMinimumSize(newMinimumSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.ABSTRACT_FIGURE__MINIMUM_SIZE, newMinimumSize, newMinimumSize));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.ABSTRACT_FIGURE__PREFERRED_SIZE, oldPreferredSize, newPreferredSize);
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
				msgs = ((InternalEObject)preferredSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.ABSTRACT_FIGURE__PREFERRED_SIZE, null, msgs);
			if (newPreferredSize != null)
				msgs = ((InternalEObject)newPreferredSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.ABSTRACT_FIGURE__PREFERRED_SIZE, null, msgs);
			msgs = basicSetPreferredSize(newPreferredSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.ABSTRACT_FIGURE__PREFERRED_SIZE, newPreferredSize, newPreferredSize));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.ABSTRACT_FIGURE__FONT, oldFont, newFont);
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
				msgs = ((InternalEObject)font).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.ABSTRACT_FIGURE__FONT, null, msgs);
			if (newFont != null)
				msgs = ((InternalEObject)newFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.ABSTRACT_FIGURE__FONT, null, msgs);
			msgs = basicSetFont(newFont, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.ABSTRACT_FIGURE__FONT, newFont, newFont));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.ABSTRACT_FIGURE__INSETS, oldInsets, newInsets);
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
				msgs = ((InternalEObject)insets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.ABSTRACT_FIGURE__INSETS, null, msgs);
			if (newInsets != null)
				msgs = ((InternalEObject)newInsets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.ABSTRACT_FIGURE__INSETS, null, msgs);
			msgs = basicSetInsets(newInsets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.ABSTRACT_FIGURE__INSETS, newInsets, newInsets));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.ABSTRACT_FIGURE__BORDER, oldBorder, newBorder);
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
				msgs = ((InternalEObject)border).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.ABSTRACT_FIGURE__BORDER, null, msgs);
			if (newBorder != null)
				msgs = ((InternalEObject)newBorder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.ABSTRACT_FIGURE__BORDER, null, msgs);
			msgs = basicSetBorder(newBorder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.ABSTRACT_FIGURE__BORDER, newBorder, newBorder));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.ABSTRACT_FIGURE__LOCATION, oldLocation, newLocation);
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
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.ABSTRACT_FIGURE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.ABSTRACT_FIGURE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.ABSTRACT_FIGURE__LOCATION, newLocation, newLocation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.ABSTRACT_FIGURE__SIZE, oldSize, newSize);
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
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.ABSTRACT_FIGURE__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.ABSTRACT_FIGURE__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.ABSTRACT_FIGURE__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGraphPackage.ABSTRACT_FIGURE__LAYOUT_DATA:
				if (layoutData != null)
					msgs = ((InternalEObject)layoutData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.ABSTRACT_FIGURE__LAYOUT_DATA, null, msgs);
				return basicSetLayoutData((LayoutData)otherEnd, msgs);
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
			case GMFGraphPackage.ABSTRACT_FIGURE__LAYOUT_DATA:
				return basicSetLayoutData(null, msgs);
			case GMFGraphPackage.ABSTRACT_FIGURE__LAYOUT:
				return basicSetLayout(null, msgs);
			case GMFGraphPackage.ABSTRACT_FIGURE__FOREGROUND_COLOR:
				return basicSetForegroundColor(null, msgs);
			case GMFGraphPackage.ABSTRACT_FIGURE__BACKGROUND_COLOR:
				return basicSetBackgroundColor(null, msgs);
			case GMFGraphPackage.ABSTRACT_FIGURE__MAXIMUM_SIZE:
				return basicSetMaximumSize(null, msgs);
			case GMFGraphPackage.ABSTRACT_FIGURE__MINIMUM_SIZE:
				return basicSetMinimumSize(null, msgs);
			case GMFGraphPackage.ABSTRACT_FIGURE__PREFERRED_SIZE:
				return basicSetPreferredSize(null, msgs);
			case GMFGraphPackage.ABSTRACT_FIGURE__FONT:
				return basicSetFont(null, msgs);
			case GMFGraphPackage.ABSTRACT_FIGURE__INSETS:
				return basicSetInsets(null, msgs);
			case GMFGraphPackage.ABSTRACT_FIGURE__BORDER:
				return basicSetBorder(null, msgs);
			case GMFGraphPackage.ABSTRACT_FIGURE__LOCATION:
				return basicSetLocation(null, msgs);
			case GMFGraphPackage.ABSTRACT_FIGURE__SIZE:
				return basicSetSize(null, msgs);
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
			case GMFGraphPackage.ABSTRACT_FIGURE__LAYOUT_DATA:
				return getLayoutData();
			case GMFGraphPackage.ABSTRACT_FIGURE__LAYOUT:
				return getLayout();
			case GMFGraphPackage.ABSTRACT_FIGURE__DESCRIPTOR:
				return getDescriptor();
			case GMFGraphPackage.ABSTRACT_FIGURE__FOREGROUND_COLOR:
				return getForegroundColor();
			case GMFGraphPackage.ABSTRACT_FIGURE__BACKGROUND_COLOR:
				return getBackgroundColor();
			case GMFGraphPackage.ABSTRACT_FIGURE__MAXIMUM_SIZE:
				return getMaximumSize();
			case GMFGraphPackage.ABSTRACT_FIGURE__MINIMUM_SIZE:
				return getMinimumSize();
			case GMFGraphPackage.ABSTRACT_FIGURE__PREFERRED_SIZE:
				return getPreferredSize();
			case GMFGraphPackage.ABSTRACT_FIGURE__FONT:
				return getFont();
			case GMFGraphPackage.ABSTRACT_FIGURE__INSETS:
				return getInsets();
			case GMFGraphPackage.ABSTRACT_FIGURE__BORDER:
				return getBorder();
			case GMFGraphPackage.ABSTRACT_FIGURE__LOCATION:
				return getLocation();
			case GMFGraphPackage.ABSTRACT_FIGURE__SIZE:
				return getSize();
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
			case GMFGraphPackage.ABSTRACT_FIGURE__LAYOUT_DATA:
				setLayoutData((LayoutData)newValue);
				return;
			case GMFGraphPackage.ABSTRACT_FIGURE__LAYOUT:
				setLayout((Layout)newValue);
				return;
			case GMFGraphPackage.ABSTRACT_FIGURE__FOREGROUND_COLOR:
				setForegroundColor((Color)newValue);
				return;
			case GMFGraphPackage.ABSTRACT_FIGURE__BACKGROUND_COLOR:
				setBackgroundColor((Color)newValue);
				return;
			case GMFGraphPackage.ABSTRACT_FIGURE__MAXIMUM_SIZE:
				setMaximumSize((Dimension)newValue);
				return;
			case GMFGraphPackage.ABSTRACT_FIGURE__MINIMUM_SIZE:
				setMinimumSize((Dimension)newValue);
				return;
			case GMFGraphPackage.ABSTRACT_FIGURE__PREFERRED_SIZE:
				setPreferredSize((Dimension)newValue);
				return;
			case GMFGraphPackage.ABSTRACT_FIGURE__FONT:
				setFont((Font)newValue);
				return;
			case GMFGraphPackage.ABSTRACT_FIGURE__INSETS:
				setInsets((Insets)newValue);
				return;
			case GMFGraphPackage.ABSTRACT_FIGURE__BORDER:
				setBorder((Border)newValue);
				return;
			case GMFGraphPackage.ABSTRACT_FIGURE__LOCATION:
				setLocation((Point)newValue);
				return;
			case GMFGraphPackage.ABSTRACT_FIGURE__SIZE:
				setSize((Point)newValue);
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
			case GMFGraphPackage.ABSTRACT_FIGURE__LAYOUT_DATA:
				setLayoutData((LayoutData)null);
				return;
			case GMFGraphPackage.ABSTRACT_FIGURE__LAYOUT:
				setLayout((Layout)null);
				return;
			case GMFGraphPackage.ABSTRACT_FIGURE__FOREGROUND_COLOR:
				setForegroundColor((Color)null);
				return;
			case GMFGraphPackage.ABSTRACT_FIGURE__BACKGROUND_COLOR:
				setBackgroundColor((Color)null);
				return;
			case GMFGraphPackage.ABSTRACT_FIGURE__MAXIMUM_SIZE:
				setMaximumSize((Dimension)null);
				return;
			case GMFGraphPackage.ABSTRACT_FIGURE__MINIMUM_SIZE:
				setMinimumSize((Dimension)null);
				return;
			case GMFGraphPackage.ABSTRACT_FIGURE__PREFERRED_SIZE:
				setPreferredSize((Dimension)null);
				return;
			case GMFGraphPackage.ABSTRACT_FIGURE__FONT:
				setFont((Font)null);
				return;
			case GMFGraphPackage.ABSTRACT_FIGURE__INSETS:
				setInsets((Insets)null);
				return;
			case GMFGraphPackage.ABSTRACT_FIGURE__BORDER:
				setBorder((Border)null);
				return;
			case GMFGraphPackage.ABSTRACT_FIGURE__LOCATION:
				setLocation((Point)null);
				return;
			case GMFGraphPackage.ABSTRACT_FIGURE__SIZE:
				setSize((Point)null);
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
			case GMFGraphPackage.ABSTRACT_FIGURE__LAYOUT_DATA:
				return layoutData != null;
			case GMFGraphPackage.ABSTRACT_FIGURE__LAYOUT:
				return layout != null;
			case GMFGraphPackage.ABSTRACT_FIGURE__DESCRIPTOR:
				return getDescriptor() != null;
			case GMFGraphPackage.ABSTRACT_FIGURE__FOREGROUND_COLOR:
				return foregroundColor != null;
			case GMFGraphPackage.ABSTRACT_FIGURE__BACKGROUND_COLOR:
				return backgroundColor != null;
			case GMFGraphPackage.ABSTRACT_FIGURE__MAXIMUM_SIZE:
				return maximumSize != null;
			case GMFGraphPackage.ABSTRACT_FIGURE__MINIMUM_SIZE:
				return minimumSize != null;
			case GMFGraphPackage.ABSTRACT_FIGURE__PREFERRED_SIZE:
				return preferredSize != null;
			case GMFGraphPackage.ABSTRACT_FIGURE__FONT:
				return font != null;
			case GMFGraphPackage.ABSTRACT_FIGURE__INSETS:
				return insets != null;
			case GMFGraphPackage.ABSTRACT_FIGURE__BORDER:
				return border != null;
			case GMFGraphPackage.ABSTRACT_FIGURE__LOCATION:
				return location != null;
			case GMFGraphPackage.ABSTRACT_FIGURE__SIZE:
				return size != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractFigureImpl

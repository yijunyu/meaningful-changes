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
import org.eclipse.gmf.codegen.gmfgen.GenColor;
import org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences;
import org.eclipse.gmf.codegen.gmfgen.GenFont;
import org.eclipse.gmf.codegen.gmfgen.Routing;
import org.eclipse.gmf.codegen.gmfgen.RulerUnits;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Diagram Preferences</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramPreferencesImpl#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramPreferencesImpl#getDefaultFont <em>Default Font</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramPreferencesImpl#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramPreferencesImpl#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramPreferencesImpl#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramPreferencesImpl#getNoteFillColor <em>Note Fill Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramPreferencesImpl#getNoteLineColor <em>Note Line Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramPreferencesImpl#isShowConnectionHandles <em>Show Connection Handles</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramPreferencesImpl#isShowPopupBars <em>Show Popup Bars</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramPreferencesImpl#isPromptOnDelFromModel <em>Prompt On Del From Model</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramPreferencesImpl#isPromptOnDelFromDiagram <em>Prompt On Del From Diagram</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramPreferencesImpl#isEnableAnimatedLayout <em>Enable Animated Layout</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramPreferencesImpl#isEnableAnimatedZoom <em>Enable Animated Zoom</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramPreferencesImpl#isEnableAntiAlias <em>Enable Anti Alias</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramPreferencesImpl#isShowGrid <em>Show Grid</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramPreferencesImpl#isShowRulers <em>Show Rulers</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramPreferencesImpl#isSnapToGrid <em>Snap To Grid</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramPreferencesImpl#getRulerUnits <em>Ruler Units</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramPreferencesImpl#getGridSpacing <em>Grid Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenDiagramPreferencesImpl extends EObjectImpl implements GenDiagramPreferences {
	/**
	 * The default value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected static final Routing LINE_STYLE_EDEFAULT = Routing.MANUAL_LITERAL;

	/**
	 * The cached value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected Routing lineStyle = LINE_STYLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultFont() <em>Default Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFont()
	 * @generated
	 * @ordered
	 */
	protected GenFont defaultFont;

	/**
	 * The cached value of the '{@link #getFontColor() <em>Font Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontColor()
	 * @generated
	 * @ordered
	 */
	protected GenColor fontColor;

	/**
	 * The cached value of the '{@link #getFillColor() <em>Fill Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillColor()
	 * @generated
	 * @ordered
	 */
	protected GenColor fillColor;

	/**
	 * The cached value of the '{@link #getLineColor() <em>Line Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineColor()
	 * @generated
	 * @ordered
	 */
	protected GenColor lineColor;

	/**
	 * The cached value of the '{@link #getNoteFillColor() <em>Note Fill Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteFillColor()
	 * @generated
	 * @ordered
	 */
	protected GenColor noteFillColor;

	/**
	 * The cached value of the '{@link #getNoteLineColor() <em>Note Line Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteLineColor()
	 * @generated
	 * @ordered
	 */
	protected GenColor noteLineColor;

	/**
	 * The default value of the '{@link #isShowConnectionHandles() <em>Show Connection Handles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowConnectionHandles()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_CONNECTION_HANDLES_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowConnectionHandles() <em>Show Connection Handles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowConnectionHandles()
	 * @generated
	 * @ordered
	 */
	protected boolean showConnectionHandles = SHOW_CONNECTION_HANDLES_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowPopupBars() <em>Show Popup Bars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowPopupBars()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_POPUP_BARS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowPopupBars() <em>Show Popup Bars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowPopupBars()
	 * @generated
	 * @ordered
	 */
	protected boolean showPopupBars = SHOW_POPUP_BARS_EDEFAULT;

	/**
	 * The default value of the '{@link #isPromptOnDelFromModel() <em>Prompt On Del From Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPromptOnDelFromModel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROMPT_ON_DEL_FROM_MODEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPromptOnDelFromModel() <em>Prompt On Del From Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPromptOnDelFromModel()
	 * @generated
	 * @ordered
	 */
	protected boolean promptOnDelFromModel = PROMPT_ON_DEL_FROM_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isPromptOnDelFromDiagram() <em>Prompt On Del From Diagram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPromptOnDelFromDiagram()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROMPT_ON_DEL_FROM_DIAGRAM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPromptOnDelFromDiagram() <em>Prompt On Del From Diagram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPromptOnDelFromDiagram()
	 * @generated
	 * @ordered
	 */
	protected boolean promptOnDelFromDiagram = PROMPT_ON_DEL_FROM_DIAGRAM_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableAnimatedLayout() <em>Enable Animated Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableAnimatedLayout()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_ANIMATED_LAYOUT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEnableAnimatedLayout() <em>Enable Animated Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableAnimatedLayout()
	 * @generated
	 * @ordered
	 */
	protected boolean enableAnimatedLayout = ENABLE_ANIMATED_LAYOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableAnimatedZoom() <em>Enable Animated Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableAnimatedZoom()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_ANIMATED_ZOOM_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEnableAnimatedZoom() <em>Enable Animated Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableAnimatedZoom()
	 * @generated
	 * @ordered
	 */
	protected boolean enableAnimatedZoom = ENABLE_ANIMATED_ZOOM_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableAntiAlias() <em>Enable Anti Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableAntiAlias()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_ANTI_ALIAS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEnableAntiAlias() <em>Enable Anti Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableAntiAlias()
	 * @generated
	 * @ordered
	 */
	protected boolean enableAntiAlias = ENABLE_ANTI_ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowGrid() <em>Show Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowGrid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_GRID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowGrid() <em>Show Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowGrid()
	 * @generated
	 * @ordered
	 */
	protected boolean showGrid = SHOW_GRID_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowRulers() <em>Show Rulers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowRulers()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_RULERS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowRulers() <em>Show Rulers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowRulers()
	 * @generated
	 * @ordered
	 */
	protected boolean showRulers = SHOW_RULERS_EDEFAULT;

	/**
	 * The default value of the '{@link #isSnapToGrid() <em>Snap To Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSnapToGrid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SNAP_TO_GRID_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSnapToGrid() <em>Snap To Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSnapToGrid()
	 * @generated
	 * @ordered
	 */
	protected boolean snapToGrid = SNAP_TO_GRID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRulerUnits() <em>Ruler Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulerUnits()
	 * @generated
	 * @ordered
	 */
	protected static final RulerUnits RULER_UNITS_EDEFAULT = RulerUnits.INCHES_LITERAL;

	/**
	 * The cached value of the '{@link #getRulerUnits() <em>Ruler Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulerUnits()
	 * @generated
	 * @ordered
	 */
	protected RulerUnits rulerUnits = RULER_UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGridSpacing() <em>Grid Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridSpacing()
	 * @generated NOT
	 * @ordered
	 */
	protected static final double GRID_SPACING_EDEFAULT = 0.125;

	/**
	 * The cached value of the '{@link #getGridSpacing() <em>Grid Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridSpacing()
	 * @generated
	 * @ordered
	 */
	protected double gridSpacing = GRID_SPACING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenDiagramPreferencesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenDiagramPreferences();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Routing getLineStyle() {
		return lineStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineStyle(Routing newLineStyle) {
		Routing oldLineStyle = lineStyle;
		lineStyle = newLineStyle == null ? LINE_STYLE_EDEFAULT : newLineStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_PREFERENCES__LINE_STYLE, oldLineStyle, lineStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFont getDefaultFont() {
		return defaultFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultFont(GenFont newDefaultFont, NotificationChain msgs) {
		GenFont oldDefaultFont = defaultFont;
		defaultFont = newDefaultFont;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_PREFERENCES__DEFAULT_FONT, oldDefaultFont, newDefaultFont);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultFont(GenFont newDefaultFont) {
		if (newDefaultFont != defaultFont) {
			NotificationChain msgs = null;
			if (defaultFont != null)
				msgs = ((InternalEObject)defaultFont).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_DIAGRAM_PREFERENCES__DEFAULT_FONT, null, msgs);
			if (newDefaultFont != null)
				msgs = ((InternalEObject)newDefaultFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_DIAGRAM_PREFERENCES__DEFAULT_FONT, null, msgs);
			msgs = basicSetDefaultFont(newDefaultFont, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_PREFERENCES__DEFAULT_FONT, newDefaultFont, newDefaultFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenColor getFontColor() {
		return fontColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFontColor(GenColor newFontColor, NotificationChain msgs) {
		GenColor oldFontColor = fontColor;
		fontColor = newFontColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_PREFERENCES__FONT_COLOR, oldFontColor, newFontColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontColor(GenColor newFontColor) {
		if (newFontColor != fontColor) {
			NotificationChain msgs = null;
			if (fontColor != null)
				msgs = ((InternalEObject)fontColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_DIAGRAM_PREFERENCES__FONT_COLOR, null, msgs);
			if (newFontColor != null)
				msgs = ((InternalEObject)newFontColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_DIAGRAM_PREFERENCES__FONT_COLOR, null, msgs);
			msgs = basicSetFontColor(newFontColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_PREFERENCES__FONT_COLOR, newFontColor, newFontColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenColor getFillColor() {
		return fillColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFillColor(GenColor newFillColor, NotificationChain msgs) {
		GenColor oldFillColor = fillColor;
		fillColor = newFillColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_PREFERENCES__FILL_COLOR, oldFillColor, newFillColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillColor(GenColor newFillColor) {
		if (newFillColor != fillColor) {
			NotificationChain msgs = null;
			if (fillColor != null)
				msgs = ((InternalEObject)fillColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_DIAGRAM_PREFERENCES__FILL_COLOR, null, msgs);
			if (newFillColor != null)
				msgs = ((InternalEObject)newFillColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_DIAGRAM_PREFERENCES__FILL_COLOR, null, msgs);
			msgs = basicSetFillColor(newFillColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_PREFERENCES__FILL_COLOR, newFillColor, newFillColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenColor getLineColor() {
		return lineColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineColor(GenColor newLineColor, NotificationChain msgs) {
		GenColor oldLineColor = lineColor;
		lineColor = newLineColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_PREFERENCES__LINE_COLOR, oldLineColor, newLineColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineColor(GenColor newLineColor) {
		if (newLineColor != lineColor) {
			NotificationChain msgs = null;
			if (lineColor != null)
				msgs = ((InternalEObject)lineColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_DIAGRAM_PREFERENCES__LINE_COLOR, null, msgs);
			if (newLineColor != null)
				msgs = ((InternalEObject)newLineColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_DIAGRAM_PREFERENCES__LINE_COLOR, null, msgs);
			msgs = basicSetLineColor(newLineColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_PREFERENCES__LINE_COLOR, newLineColor, newLineColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenColor getNoteFillColor() {
		return noteFillColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoteFillColor(GenColor newNoteFillColor, NotificationChain msgs) {
		GenColor oldNoteFillColor = noteFillColor;
		noteFillColor = newNoteFillColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_PREFERENCES__NOTE_FILL_COLOR, oldNoteFillColor, newNoteFillColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoteFillColor(GenColor newNoteFillColor) {
		if (newNoteFillColor != noteFillColor) {
			NotificationChain msgs = null;
			if (noteFillColor != null)
				msgs = ((InternalEObject)noteFillColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_DIAGRAM_PREFERENCES__NOTE_FILL_COLOR, null, msgs);
			if (newNoteFillColor != null)
				msgs = ((InternalEObject)newNoteFillColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_DIAGRAM_PREFERENCES__NOTE_FILL_COLOR, null, msgs);
			msgs = basicSetNoteFillColor(newNoteFillColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_PREFERENCES__NOTE_FILL_COLOR, newNoteFillColor, newNoteFillColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenColor getNoteLineColor() {
		return noteLineColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoteLineColor(GenColor newNoteLineColor, NotificationChain msgs) {
		GenColor oldNoteLineColor = noteLineColor;
		noteLineColor = newNoteLineColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_PREFERENCES__NOTE_LINE_COLOR, oldNoteLineColor, newNoteLineColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoteLineColor(GenColor newNoteLineColor) {
		if (newNoteLineColor != noteLineColor) {
			NotificationChain msgs = null;
			if (noteLineColor != null)
				msgs = ((InternalEObject)noteLineColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_DIAGRAM_PREFERENCES__NOTE_LINE_COLOR, null, msgs);
			if (newNoteLineColor != null)
				msgs = ((InternalEObject)newNoteLineColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_DIAGRAM_PREFERENCES__NOTE_LINE_COLOR, null, msgs);
			msgs = basicSetNoteLineColor(newNoteLineColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_PREFERENCES__NOTE_LINE_COLOR, newNoteLineColor, newNoteLineColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowConnectionHandles() {
		return showConnectionHandles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowConnectionHandles(boolean newShowConnectionHandles) {
		boolean oldShowConnectionHandles = showConnectionHandles;
		showConnectionHandles = newShowConnectionHandles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_PREFERENCES__SHOW_CONNECTION_HANDLES, oldShowConnectionHandles, showConnectionHandles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowPopupBars() {
		return showPopupBars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowPopupBars(boolean newShowPopupBars) {
		boolean oldShowPopupBars = showPopupBars;
		showPopupBars = newShowPopupBars;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_PREFERENCES__SHOW_POPUP_BARS, oldShowPopupBars, showPopupBars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPromptOnDelFromModel() {
		return promptOnDelFromModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPromptOnDelFromModel(boolean newPromptOnDelFromModel) {
		boolean oldPromptOnDelFromModel = promptOnDelFromModel;
		promptOnDelFromModel = newPromptOnDelFromModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_PREFERENCES__PROMPT_ON_DEL_FROM_MODEL, oldPromptOnDelFromModel, promptOnDelFromModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPromptOnDelFromDiagram() {
		return promptOnDelFromDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPromptOnDelFromDiagram(boolean newPromptOnDelFromDiagram) {
		boolean oldPromptOnDelFromDiagram = promptOnDelFromDiagram;
		promptOnDelFromDiagram = newPromptOnDelFromDiagram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_PREFERENCES__PROMPT_ON_DEL_FROM_DIAGRAM, oldPromptOnDelFromDiagram, promptOnDelFromDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableAnimatedLayout() {
		return enableAnimatedLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableAnimatedLayout(boolean newEnableAnimatedLayout) {
		boolean oldEnableAnimatedLayout = enableAnimatedLayout;
		enableAnimatedLayout = newEnableAnimatedLayout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_PREFERENCES__ENABLE_ANIMATED_LAYOUT, oldEnableAnimatedLayout, enableAnimatedLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableAnimatedZoom() {
		return enableAnimatedZoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableAnimatedZoom(boolean newEnableAnimatedZoom) {
		boolean oldEnableAnimatedZoom = enableAnimatedZoom;
		enableAnimatedZoom = newEnableAnimatedZoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_PREFERENCES__ENABLE_ANIMATED_ZOOM, oldEnableAnimatedZoom, enableAnimatedZoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableAntiAlias() {
		return enableAntiAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableAntiAlias(boolean newEnableAntiAlias) {
		boolean oldEnableAntiAlias = enableAntiAlias;
		enableAntiAlias = newEnableAntiAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_PREFERENCES__ENABLE_ANTI_ALIAS, oldEnableAntiAlias, enableAntiAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowGrid() {
		return showGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowGrid(boolean newShowGrid) {
		boolean oldShowGrid = showGrid;
		showGrid = newShowGrid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_PREFERENCES__SHOW_GRID, oldShowGrid, showGrid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowRulers() {
		return showRulers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowRulers(boolean newShowRulers) {
		boolean oldShowRulers = showRulers;
		showRulers = newShowRulers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_PREFERENCES__SHOW_RULERS, oldShowRulers, showRulers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSnapToGrid() {
		return snapToGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSnapToGrid(boolean newSnapToGrid) {
		boolean oldSnapToGrid = snapToGrid;
		snapToGrid = newSnapToGrid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_PREFERENCES__SNAP_TO_GRID, oldSnapToGrid, snapToGrid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulerUnits getRulerUnits() {
		return rulerUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRulerUnits(RulerUnits newRulerUnits) {
		RulerUnits oldRulerUnits = rulerUnits;
		rulerUnits = newRulerUnits == null ? RULER_UNITS_EDEFAULT : newRulerUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_PREFERENCES__RULER_UNITS, oldRulerUnits, rulerUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getGridSpacing() {
		return gridSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGridSpacing(double newGridSpacing) {
		double oldGridSpacing = gridSpacing;
		gridSpacing = newGridSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM_PREFERENCES__GRID_SPACING, oldGridSpacing, gridSpacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__DEFAULT_FONT:
				return basicSetDefaultFont(null, msgs);
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__FONT_COLOR:
				return basicSetFontColor(null, msgs);
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__FILL_COLOR:
				return basicSetFillColor(null, msgs);
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__LINE_COLOR:
				return basicSetLineColor(null, msgs);
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__NOTE_FILL_COLOR:
				return basicSetNoteFillColor(null, msgs);
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__NOTE_LINE_COLOR:
				return basicSetNoteLineColor(null, msgs);
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
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__LINE_STYLE:
				return getLineStyle();
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__DEFAULT_FONT:
				return getDefaultFont();
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__FONT_COLOR:
				return getFontColor();
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__FILL_COLOR:
				return getFillColor();
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__LINE_COLOR:
				return getLineColor();
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__NOTE_FILL_COLOR:
				return getNoteFillColor();
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__NOTE_LINE_COLOR:
				return getNoteLineColor();
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__SHOW_CONNECTION_HANDLES:
				return isShowConnectionHandles() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__SHOW_POPUP_BARS:
				return isShowPopupBars() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__PROMPT_ON_DEL_FROM_MODEL:
				return isPromptOnDelFromModel() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__PROMPT_ON_DEL_FROM_DIAGRAM:
				return isPromptOnDelFromDiagram() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__ENABLE_ANIMATED_LAYOUT:
				return isEnableAnimatedLayout() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__ENABLE_ANIMATED_ZOOM:
				return isEnableAnimatedZoom() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__ENABLE_ANTI_ALIAS:
				return isEnableAntiAlias() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__SHOW_GRID:
				return isShowGrid() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__SHOW_RULERS:
				return isShowRulers() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__SNAP_TO_GRID:
				return isSnapToGrid() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__RULER_UNITS:
				return getRulerUnits();
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__GRID_SPACING:
				return new Double(getGridSpacing());
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
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__LINE_STYLE:
				setLineStyle((Routing)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__DEFAULT_FONT:
				setDefaultFont((GenFont)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__FONT_COLOR:
				setFontColor((GenColor)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__FILL_COLOR:
				setFillColor((GenColor)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__LINE_COLOR:
				setLineColor((GenColor)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__NOTE_FILL_COLOR:
				setNoteFillColor((GenColor)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__NOTE_LINE_COLOR:
				setNoteLineColor((GenColor)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__SHOW_CONNECTION_HANDLES:
				setShowConnectionHandles(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__SHOW_POPUP_BARS:
				setShowPopupBars(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__PROMPT_ON_DEL_FROM_MODEL:
				setPromptOnDelFromModel(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__PROMPT_ON_DEL_FROM_DIAGRAM:
				setPromptOnDelFromDiagram(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__ENABLE_ANIMATED_LAYOUT:
				setEnableAnimatedLayout(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__ENABLE_ANIMATED_ZOOM:
				setEnableAnimatedZoom(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__ENABLE_ANTI_ALIAS:
				setEnableAntiAlias(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__SHOW_GRID:
				setShowGrid(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__SHOW_RULERS:
				setShowRulers(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__SNAP_TO_GRID:
				setSnapToGrid(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__RULER_UNITS:
				setRulerUnits((RulerUnits)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__GRID_SPACING:
				setGridSpacing(((Double)newValue).doubleValue());
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
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__LINE_STYLE:
				setLineStyle(LINE_STYLE_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__DEFAULT_FONT:
				setDefaultFont((GenFont)null);
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__FONT_COLOR:
				setFontColor((GenColor)null);
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__FILL_COLOR:
				setFillColor((GenColor)null);
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__LINE_COLOR:
				setLineColor((GenColor)null);
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__NOTE_FILL_COLOR:
				setNoteFillColor((GenColor)null);
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__NOTE_LINE_COLOR:
				setNoteLineColor((GenColor)null);
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__SHOW_CONNECTION_HANDLES:
				setShowConnectionHandles(SHOW_CONNECTION_HANDLES_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__SHOW_POPUP_BARS:
				setShowPopupBars(SHOW_POPUP_BARS_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__PROMPT_ON_DEL_FROM_MODEL:
				setPromptOnDelFromModel(PROMPT_ON_DEL_FROM_MODEL_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__PROMPT_ON_DEL_FROM_DIAGRAM:
				setPromptOnDelFromDiagram(PROMPT_ON_DEL_FROM_DIAGRAM_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__ENABLE_ANIMATED_LAYOUT:
				setEnableAnimatedLayout(ENABLE_ANIMATED_LAYOUT_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__ENABLE_ANIMATED_ZOOM:
				setEnableAnimatedZoom(ENABLE_ANIMATED_ZOOM_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__ENABLE_ANTI_ALIAS:
				setEnableAntiAlias(ENABLE_ANTI_ALIAS_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__SHOW_GRID:
				setShowGrid(SHOW_GRID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__SHOW_RULERS:
				setShowRulers(SHOW_RULERS_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__SNAP_TO_GRID:
				setSnapToGrid(SNAP_TO_GRID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__RULER_UNITS:
				setRulerUnits(RULER_UNITS_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__GRID_SPACING:
				setGridSpacing(GRID_SPACING_EDEFAULT);
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
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__LINE_STYLE:
				return lineStyle != LINE_STYLE_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__DEFAULT_FONT:
				return defaultFont != null;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__FONT_COLOR:
				return fontColor != null;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__FILL_COLOR:
				return fillColor != null;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__LINE_COLOR:
				return lineColor != null;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__NOTE_FILL_COLOR:
				return noteFillColor != null;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__NOTE_LINE_COLOR:
				return noteLineColor != null;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__SHOW_CONNECTION_HANDLES:
				return showConnectionHandles != SHOW_CONNECTION_HANDLES_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__SHOW_POPUP_BARS:
				return showPopupBars != SHOW_POPUP_BARS_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__PROMPT_ON_DEL_FROM_MODEL:
				return promptOnDelFromModel != PROMPT_ON_DEL_FROM_MODEL_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__PROMPT_ON_DEL_FROM_DIAGRAM:
				return promptOnDelFromDiagram != PROMPT_ON_DEL_FROM_DIAGRAM_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__ENABLE_ANIMATED_LAYOUT:
				return enableAnimatedLayout != ENABLE_ANIMATED_LAYOUT_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__ENABLE_ANIMATED_ZOOM:
				return enableAnimatedZoom != ENABLE_ANIMATED_ZOOM_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__ENABLE_ANTI_ALIAS:
				return enableAntiAlias != ENABLE_ANTI_ALIAS_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__SHOW_GRID:
				return showGrid != SHOW_GRID_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__SHOW_RULERS:
				return showRulers != SHOW_RULERS_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__SNAP_TO_GRID:
				return snapToGrid != SNAP_TO_GRID_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__RULER_UNITS:
				return rulerUnits != RULER_UNITS_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM_PREFERENCES__GRID_SPACING:
				return gridSpacing != GRID_SPACING_EDEFAULT;
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
		result.append(" (lineStyle: ");
		result.append(lineStyle);
		result.append(", showConnectionHandles: ");
		result.append(showConnectionHandles);
		result.append(", showPopupBars: ");
		result.append(showPopupBars);
		result.append(", promptOnDelFromModel: ");
		result.append(promptOnDelFromModel);
		result.append(", promptOnDelFromDiagram: ");
		result.append(promptOnDelFromDiagram);
		result.append(", enableAnimatedLayout: ");
		result.append(enableAnimatedLayout);
		result.append(", enableAnimatedZoom: ");
		result.append(enableAnimatedZoom);
		result.append(", enableAntiAlias: ");
		result.append(enableAntiAlias);
		result.append(", showGrid: ");
		result.append(showGrid);
		result.append(", showRulers: ");
		result.append(showRulers);
		result.append(", snapToGrid: ");
		result.append(snapToGrid);
		result.append(", rulerUnits: ");
		result.append(rulerUnits);
		result.append(", gridSpacing: ");
		result.append(gridSpacing);
		result.append(')');
		return result.toString();
	}

} //GenDiagramPreferencesImpl

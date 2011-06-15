/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Diagram Preferences</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#getDefaultFont <em>Default Font</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#getNoteFillColor <em>Note Fill Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#getNoteLineColor <em>Note Line Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#isShowConnectionHandles <em>Show Connection Handles</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#isShowPopupBars <em>Show Popup Bars</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#isPromptOnDelFromModel <em>Prompt On Del From Model</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#isPromptOnDelFromDiagram <em>Prompt On Del From Diagram</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#isEnableAnimatedLayout <em>Enable Animated Layout</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#isEnableAnimatedZoom <em>Enable Animated Zoom</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#isEnableAntiAlias <em>Enable Anti Alias</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#isShowGrid <em>Show Grid</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#isShowRulers <em>Show Rulers</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#isSnapToGrid <em>Snap To Grid</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#isSnapToGeometry <em>Snap To Geometry</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#isGridInFront <em>Grid In Front</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#getRulerUnits <em>Ruler Units</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#getGridSpacing <em>Grid Spacing</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#getGridLineColor <em>Grid Line Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#getGridLineStyle <em>Grid Line Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramPreferences()
 * @model
 * @generated
 */
public interface GenDiagramPreferences extends EObject {
	/**
	 * Returns the value of the '<em><b>Line Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.Routing}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Style</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.Routing
	 * @see #setLineStyle(Routing)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramPreferences_LineStyle()
	 * @model
	 * @generated
	 */
	Routing getLineStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#getLineStyle <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Style</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.Routing
	 * @see #getLineStyle()
	 * @generated
	 */
	void setLineStyle(Routing value);

	/**
	 * Returns the value of the '<em><b>Default Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Font</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Font</em>' containment reference.
	 * @see #setDefaultFont(GenFont)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramPreferences_DefaultFont()
	 * @model containment="true"
	 * @generated
	 */
	GenFont getDefaultFont();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#getDefaultFont <em>Default Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Font</em>' containment reference.
	 * @see #getDefaultFont()
	 * @generated
	 */
	void setDefaultFont(GenFont value);

	/**
	 * Returns the value of the '<em><b>Font Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Color</em>' containment reference.
	 * @see #setFontColor(GenColor)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramPreferences_FontColor()
	 * @model containment="true"
	 * @generated
	 */
	GenColor getFontColor();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#getFontColor <em>Font Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Color</em>' containment reference.
	 * @see #getFontColor()
	 * @generated
	 */
	void setFontColor(GenColor value);

	/**
	 * Returns the value of the '<em><b>Fill Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Color</em>' containment reference.
	 * @see #setFillColor(GenColor)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramPreferences_FillColor()
	 * @model containment="true"
	 * @generated
	 */
	GenColor getFillColor();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#getFillColor <em>Fill Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Color</em>' containment reference.
	 * @see #getFillColor()
	 * @generated
	 */
	void setFillColor(GenColor value);

	/**
	 * Returns the value of the '<em><b>Line Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Color</em>' containment reference.
	 * @see #setLineColor(GenColor)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramPreferences_LineColor()
	 * @model containment="true"
	 * @generated
	 */
	GenColor getLineColor();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#getLineColor <em>Line Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Color</em>' containment reference.
	 * @see #getLineColor()
	 * @generated
	 */
	void setLineColor(GenColor value);

	/**
	 * Returns the value of the '<em><b>Note Fill Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Fill Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Fill Color</em>' containment reference.
	 * @see #setNoteFillColor(GenColor)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramPreferences_NoteFillColor()
	 * @model containment="true"
	 * @generated
	 */
	GenColor getNoteFillColor();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#getNoteFillColor <em>Note Fill Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note Fill Color</em>' containment reference.
	 * @see #getNoteFillColor()
	 * @generated
	 */
	void setNoteFillColor(GenColor value);

	/**
	 * Returns the value of the '<em><b>Note Line Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Line Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Line Color</em>' containment reference.
	 * @see #setNoteLineColor(GenColor)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramPreferences_NoteLineColor()
	 * @model containment="true"
	 * @generated
	 */
	GenColor getNoteLineColor();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#getNoteLineColor <em>Note Line Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note Line Color</em>' containment reference.
	 * @see #getNoteLineColor()
	 * @generated
	 */
	void setNoteLineColor(GenColor value);

	/**
	 * Returns the value of the '<em><b>Show Connection Handles</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Connection Handles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Connection Handles</em>' attribute.
	 * @see #setShowConnectionHandles(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramPreferences_ShowConnectionHandles()
	 * @model default="true"
	 * @generated
	 */
	boolean isShowConnectionHandles();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#isShowConnectionHandles <em>Show Connection Handles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Connection Handles</em>' attribute.
	 * @see #isShowConnectionHandles()
	 * @generated
	 */
	void setShowConnectionHandles(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Popup Bars</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Popup Bars</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Popup Bars</em>' attribute.
	 * @see #setShowPopupBars(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramPreferences_ShowPopupBars()
	 * @model default="true"
	 * @generated
	 */
	boolean isShowPopupBars();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#isShowPopupBars <em>Show Popup Bars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Popup Bars</em>' attribute.
	 * @see #isShowPopupBars()
	 * @generated
	 */
	void setShowPopupBars(boolean value);

	/**
	 * Returns the value of the '<em><b>Prompt On Del From Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prompt On Del From Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prompt On Del From Model</em>' attribute.
	 * @see #setPromptOnDelFromModel(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramPreferences_PromptOnDelFromModel()
	 * @model
	 * @generated
	 */
	boolean isPromptOnDelFromModel();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#isPromptOnDelFromModel <em>Prompt On Del From Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prompt On Del From Model</em>' attribute.
	 * @see #isPromptOnDelFromModel()
	 * @generated
	 */
	void setPromptOnDelFromModel(boolean value);

	/**
	 * Returns the value of the '<em><b>Prompt On Del From Diagram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prompt On Del From Diagram</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prompt On Del From Diagram</em>' attribute.
	 * @see #setPromptOnDelFromDiagram(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramPreferences_PromptOnDelFromDiagram()
	 * @model
	 * @generated
	 */
	boolean isPromptOnDelFromDiagram();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#isPromptOnDelFromDiagram <em>Prompt On Del From Diagram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prompt On Del From Diagram</em>' attribute.
	 * @see #isPromptOnDelFromDiagram()
	 * @generated
	 */
	void setPromptOnDelFromDiagram(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Animated Layout</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Animated Layout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Animated Layout</em>' attribute.
	 * @see #setEnableAnimatedLayout(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramPreferences_EnableAnimatedLayout()
	 * @model default="true"
	 * @generated
	 */
	boolean isEnableAnimatedLayout();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#isEnableAnimatedLayout <em>Enable Animated Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Animated Layout</em>' attribute.
	 * @see #isEnableAnimatedLayout()
	 * @generated
	 */
	void setEnableAnimatedLayout(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Animated Zoom</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Animated Zoom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Animated Zoom</em>' attribute.
	 * @see #setEnableAnimatedZoom(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramPreferences_EnableAnimatedZoom()
	 * @model default="true"
	 * @generated
	 */
	boolean isEnableAnimatedZoom();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#isEnableAnimatedZoom <em>Enable Animated Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Animated Zoom</em>' attribute.
	 * @see #isEnableAnimatedZoom()
	 * @generated
	 */
	void setEnableAnimatedZoom(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Anti Alias</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Anti Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Anti Alias</em>' attribute.
	 * @see #setEnableAntiAlias(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramPreferences_EnableAntiAlias()
	 * @model default="true"
	 * @generated
	 */
	boolean isEnableAntiAlias();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#isEnableAntiAlias <em>Enable Anti Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Anti Alias</em>' attribute.
	 * @see #isEnableAntiAlias()
	 * @generated
	 */
	void setEnableAntiAlias(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Grid</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Grid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Grid</em>' attribute.
	 * @see #setShowGrid(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramPreferences_ShowGrid()
	 * @model default="false"
	 * @generated
	 */
	boolean isShowGrid();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#isShowGrid <em>Show Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Grid</em>' attribute.
	 * @see #isShowGrid()
	 * @generated
	 */
	void setShowGrid(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Rulers</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Rulers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Rulers</em>' attribute.
	 * @see #setShowRulers(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramPreferences_ShowRulers()
	 * @model default="false"
	 * @generated
	 */
	boolean isShowRulers();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#isShowRulers <em>Show Rulers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Rulers</em>' attribute.
	 * @see #isShowRulers()
	 * @generated
	 */
	void setShowRulers(boolean value);

	/**
	 * Returns the value of the '<em><b>Snap To Grid</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Snap To Grid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snap To Grid</em>' attribute.
	 * @see #setSnapToGrid(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramPreferences_SnapToGrid()
	 * @model default="true"
	 * @generated
	 */
	boolean isSnapToGrid();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#isSnapToGrid <em>Snap To Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snap To Grid</em>' attribute.
	 * @see #isSnapToGrid()
	 * @generated
	 */
	void setSnapToGrid(boolean value);

	/**
	 * Returns the value of the '<em><b>Snap To Geometry</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Snap To Geometry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snap To Geometry</em>' attribute.
	 * @see #setSnapToGeometry(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramPreferences_SnapToGeometry()
	 * @model default="false"
	 * @generated
	 */
	boolean isSnapToGeometry();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#isSnapToGeometry <em>Snap To Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snap To Geometry</em>' attribute.
	 * @see #isSnapToGeometry()
	 * @generated
	 */
	void setSnapToGeometry(boolean value);

	/**
	 * Returns the value of the '<em><b>Grid In Front</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid In Front</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid In Front</em>' attribute.
	 * @see #setGridInFront(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramPreferences_GridInFront()
	 * @model default="true"
	 * @generated
	 */
	boolean isGridInFront();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#isGridInFront <em>Grid In Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid In Front</em>' attribute.
	 * @see #isGridInFront()
	 * @generated
	 */
	void setGridInFront(boolean value);

	/**
	 * Returns the value of the '<em><b>Ruler Units</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.RulerUnits}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruler Units</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruler Units</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.RulerUnits
	 * @see #setRulerUnits(RulerUnits)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramPreferences_RulerUnits()
	 * @model
	 * @generated
	 */
	RulerUnits getRulerUnits();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#getRulerUnits <em>Ruler Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruler Units</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.RulerUnits
	 * @see #getRulerUnits()
	 * @generated
	 */
	void setRulerUnits(RulerUnits value);

	/**
	 * Returns the value of the '<em><b>Grid Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid Spacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid Spacing</em>' attribute.
	 * @see #setGridSpacing(double)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramPreferences_GridSpacing()
	 * @model
	 * @generated
	 */
	double getGridSpacing();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#getGridSpacing <em>Grid Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Spacing</em>' attribute.
	 * @see #getGridSpacing()
	 * @generated
	 */
	void setGridSpacing(double value);

	/**
	 * Returns the value of the '<em><b>Grid Line Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid Line Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid Line Color</em>' containment reference.
	 * @see #setGridLineColor(GenColor)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramPreferences_GridLineColor()
	 * @model containment="true"
	 * @generated
	 */
	GenColor getGridLineColor();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#getGridLineColor <em>Grid Line Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Line Color</em>' containment reference.
	 * @see #getGridLineColor()
	 * @generated
	 */
	void setGridLineColor(GenColor value);

	/**
	 * Returns the value of the '<em><b>Grid Line Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.LineStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid Line Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid Line Style</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.LineStyle
	 * @see #setGridLineStyle(LineStyle)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramPreferences_GridLineStyle()
	 * @model
	 * @generated
	 */
	LineStyle getGridLineStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences#getGridLineStyle <em>Grid Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Line Style</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.LineStyle
	 * @see #getGridLineStyle()
	 * @generated
	 */
	void setGridLineStyle(LineStyle value);

} // GenDiagramPreferences

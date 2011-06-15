/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.gmf.gmfgraph.Canvas;
import org.eclipse.gmf.mappings.CanvasMapping;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.tooldef.MainMenu;
import org.eclipse.gmf.tooldef.Palette;
import org.eclipse.gmf.tooldef.Toolbar;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Canvas Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.impl.CanvasMappingImpl#getDiagramCanvas <em>Diagram Canvas</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.CanvasMappingImpl#getDomainModel <em>Domain Model</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.CanvasMappingImpl#getDomainMetaElement <em>Domain Meta Element</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.CanvasMappingImpl#getPalette <em>Palette</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.CanvasMappingImpl#getMenuContributions <em>Menu Contributions</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.CanvasMappingImpl#getToolbarContributions <em>Toolbar Contributions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CanvasMappingImpl extends EObjectImpl implements CanvasMapping {
	/**
	 * The cached value of the '{@link #getDiagramCanvas() <em>Diagram Canvas</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramCanvas()
	 * @generated
	 * @ordered
	 */
	protected Canvas diagramCanvas;

	/**
	 * The cached value of the '{@link #getDomainModel() <em>Domain Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainModel()
	 * @generated
	 * @ordered
	 */
	protected EPackage domainModel;

	/**
	 * The cached value of the '{@link #getDomainMetaElement() <em>Domain Meta Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainMetaElement()
	 * @generated
	 * @ordered
	 */
	protected EClass domainMetaElement;

	/**
	 * The cached value of the '{@link #getPalette() <em>Palette</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPalette()
	 * @generated
	 * @ordered
	 */
	protected Palette palette;

	/**
	 * The cached value of the '{@link #getMenuContributions() <em>Menu Contributions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenuContributions()
	 * @generated
	 * @ordered
	 */
	protected EList<MainMenu> menuContributions;

	/**
	 * The cached value of the '{@link #getToolbarContributions() <em>Toolbar Contributions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolbarContributions()
	 * @generated
	 * @ordered
	 */
	protected EList<Toolbar> toolbarContributions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CanvasMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFMapPackage.eINSTANCE.getCanvasMapping();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Canvas getDiagramCanvas() {
		if (diagramCanvas != null && diagramCanvas.eIsProxy()) {
			InternalEObject oldDiagramCanvas = (InternalEObject)diagramCanvas;
			diagramCanvas = (Canvas)eResolveProxy(oldDiagramCanvas);
			if (diagramCanvas != oldDiagramCanvas) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.CANVAS_MAPPING__DIAGRAM_CANVAS, oldDiagramCanvas, diagramCanvas));
			}
		}
		return diagramCanvas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Canvas basicGetDiagramCanvas() {
		return diagramCanvas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramCanvas(Canvas newDiagramCanvas) {
		Canvas oldDiagramCanvas = diagramCanvas;
		diagramCanvas = newDiagramCanvas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.CANVAS_MAPPING__DIAGRAM_CANVAS, oldDiagramCanvas, diagramCanvas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getDomainModel() {
		if (domainModel != null && domainModel.eIsProxy()) {
			InternalEObject oldDomainModel = (InternalEObject)domainModel;
			domainModel = (EPackage)eResolveProxy(oldDomainModel);
			if (domainModel != oldDomainModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.CANVAS_MAPPING__DOMAIN_MODEL, oldDomainModel, domainModel));
			}
		}
		return domainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetDomainModel() {
		return domainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainModel(EPackage newDomainModel) {
		EPackage oldDomainModel = domainModel;
		domainModel = newDomainModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.CANVAS_MAPPING__DOMAIN_MODEL, oldDomainModel, domainModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainMetaElement() {
		if (domainMetaElement != null && domainMetaElement.eIsProxy()) {
			InternalEObject oldDomainMetaElement = (InternalEObject)domainMetaElement;
			domainMetaElement = (EClass)eResolveProxy(oldDomainMetaElement);
			if (domainMetaElement != oldDomainMetaElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.CANVAS_MAPPING__DOMAIN_META_ELEMENT, oldDomainMetaElement, domainMetaElement));
			}
		}
		return domainMetaElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetDomainMetaElement() {
		return domainMetaElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainMetaElement(EClass newDomainMetaElement) {
		EClass oldDomainMetaElement = domainMetaElement;
		domainMetaElement = newDomainMetaElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.CANVAS_MAPPING__DOMAIN_META_ELEMENT, oldDomainMetaElement, domainMetaElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Palette getPalette() {
		if (palette != null && palette.eIsProxy()) {
			InternalEObject oldPalette = (InternalEObject)palette;
			palette = (Palette)eResolveProxy(oldPalette);
			if (palette != oldPalette) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.CANVAS_MAPPING__PALETTE, oldPalette, palette));
			}
		}
		return palette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Palette basicGetPalette() {
		return palette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPalette(Palette newPalette) {
		Palette oldPalette = palette;
		palette = newPalette;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.CANVAS_MAPPING__PALETTE, oldPalette, palette));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MainMenu> getMenuContributions() {
		if (menuContributions == null) {
			menuContributions = new EObjectResolvingEList<MainMenu>(MainMenu.class, this, GMFMapPackage.CANVAS_MAPPING__MENU_CONTRIBUTIONS);
		}
		return menuContributions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Toolbar> getToolbarContributions() {
		if (toolbarContributions == null) {
			toolbarContributions = new EObjectResolvingEList<Toolbar>(Toolbar.class, this, GMFMapPackage.CANVAS_MAPPING__TOOLBAR_CONTRIBUTIONS);
		}
		return toolbarContributions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFMapPackage.CANVAS_MAPPING__DIAGRAM_CANVAS:
				if (resolve) return getDiagramCanvas();
				return basicGetDiagramCanvas();
			case GMFMapPackage.CANVAS_MAPPING__DOMAIN_MODEL:
				if (resolve) return getDomainModel();
				return basicGetDomainModel();
			case GMFMapPackage.CANVAS_MAPPING__DOMAIN_META_ELEMENT:
				if (resolve) return getDomainMetaElement();
				return basicGetDomainMetaElement();
			case GMFMapPackage.CANVAS_MAPPING__PALETTE:
				if (resolve) return getPalette();
				return basicGetPalette();
			case GMFMapPackage.CANVAS_MAPPING__MENU_CONTRIBUTIONS:
				return getMenuContributions();
			case GMFMapPackage.CANVAS_MAPPING__TOOLBAR_CONTRIBUTIONS:
				return getToolbarContributions();
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
			case GMFMapPackage.CANVAS_MAPPING__DIAGRAM_CANVAS:
				setDiagramCanvas((Canvas)newValue);
				return;
			case GMFMapPackage.CANVAS_MAPPING__DOMAIN_MODEL:
				setDomainModel((EPackage)newValue);
				return;
			case GMFMapPackage.CANVAS_MAPPING__DOMAIN_META_ELEMENT:
				setDomainMetaElement((EClass)newValue);
				return;
			case GMFMapPackage.CANVAS_MAPPING__PALETTE:
				setPalette((Palette)newValue);
				return;
			case GMFMapPackage.CANVAS_MAPPING__MENU_CONTRIBUTIONS:
				getMenuContributions().clear();
				getMenuContributions().addAll((Collection<? extends MainMenu>)newValue);
				return;
			case GMFMapPackage.CANVAS_MAPPING__TOOLBAR_CONTRIBUTIONS:
				getToolbarContributions().clear();
				getToolbarContributions().addAll((Collection<? extends Toolbar>)newValue);
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
			case GMFMapPackage.CANVAS_MAPPING__DIAGRAM_CANVAS:
				setDiagramCanvas((Canvas)null);
				return;
			case GMFMapPackage.CANVAS_MAPPING__DOMAIN_MODEL:
				setDomainModel((EPackage)null);
				return;
			case GMFMapPackage.CANVAS_MAPPING__DOMAIN_META_ELEMENT:
				setDomainMetaElement((EClass)null);
				return;
			case GMFMapPackage.CANVAS_MAPPING__PALETTE:
				setPalette((Palette)null);
				return;
			case GMFMapPackage.CANVAS_MAPPING__MENU_CONTRIBUTIONS:
				getMenuContributions().clear();
				return;
			case GMFMapPackage.CANVAS_MAPPING__TOOLBAR_CONTRIBUTIONS:
				getToolbarContributions().clear();
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
			case GMFMapPackage.CANVAS_MAPPING__DIAGRAM_CANVAS:
				return diagramCanvas != null;
			case GMFMapPackage.CANVAS_MAPPING__DOMAIN_MODEL:
				return domainModel != null;
			case GMFMapPackage.CANVAS_MAPPING__DOMAIN_META_ELEMENT:
				return domainMetaElement != null;
			case GMFMapPackage.CANVAS_MAPPING__PALETTE:
				return palette != null;
			case GMFMapPackage.CANVAS_MAPPING__MENU_CONTRIBUTIONS:
				return menuContributions != null && !menuContributions.isEmpty();
			case GMFMapPackage.CANVAS_MAPPING__TOOLBAR_CONTRIBUTIONS:
				return toolbarContributions != null && !toolbarContributions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CanvasMappingImpl

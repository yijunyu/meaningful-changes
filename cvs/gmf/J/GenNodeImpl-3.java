/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.Collection;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.codegen.gmfgen.CompartmentPlacementKind;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenChildContainer;
import org.eclipse.gmf.codegen.gmfgen.GenChildNode;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getDomainMetaClass <em>Domain Meta Class</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getViewmapURI <em>Viewmap URI</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getNodeVisualizationKind <em>Node Visualization Kind</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getViewmapClass <em>Viewmap Class</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getAffixedStereotypes <em>Affixed Stereotypes</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getChildContainers <em>Child Containers</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getChildNodes <em>Child Nodes</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getChildContainersPlacement <em>Child Containers Placement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenNodeImpl extends GenBaseElementImpl implements GenNode {
	/**
	 * The cached value of the '{@link #getDomainMetaClass() <em>Domain Meta Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainMetaClass()
	 * @generated
	 * @ordered
	 */
	protected EClass domainMetaClass = null;

	/**
	 * The default value of the '{@link #getViewmapURI() <em>Viewmap URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewmapURI()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEWMAP_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewmapURI() <em>Viewmap URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewmapURI()
	 * @generated
	 * @ordered
	 */
	protected String viewmapURI = VIEWMAP_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeVisualizationKind() <em>Node Visualization Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeVisualizationKind()
	 * @generated
	 * @ordered
	 */
	protected static final int NODE_VISUALIZATION_KIND_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNodeVisualizationKind() <em>Node Visualization Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeVisualizationKind()
	 * @generated
	 * @ordered
	 */
	protected int nodeVisualizationKind = NODE_VISUALIZATION_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getViewmapClass() <em>Viewmap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewmapClass()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEWMAP_CLASS_EDEFAULT = "org.eclipse.gmf.editor.viewmaps.SVGViewMap";

	/**
	 * The cached value of the '{@link #getViewmapClass() <em>Viewmap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewmapClass()
	 * @generated
	 * @ordered
	 */
	protected String viewmapClass = VIEWMAP_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAffixedStereotypes() <em>Affixed Stereotypes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffixedStereotypes()
	 * @generated
	 * @ordered
	 */
	protected EList affixedStereotypes = null;

	/**
	 * The default value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected String backgroundColor = BACKGROUND_COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildContainers() <em>Child Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildContainers()
	 * @generated
	 * @ordered
	 */
	protected EList childContainers = null;

	/**
	 * The cached value of the '{@link #getChildNodes() <em>Child Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildNodes()
	 * @generated
	 * @ordered
	 */
	protected EList childNodes = null;

	/**
	 * The default value of the '{@link #getChildContainersPlacement() <em>Child Containers Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildContainersPlacement()
	 * @generated
	 * @ordered
	 */
	protected static final CompartmentPlacementKind CHILD_CONTAINERS_PLACEMENT_EDEFAULT = CompartmentPlacementKind.TOOLBAR_LITERAL;

	/**
	 * The cached value of the '{@link #getChildContainersPlacement() <em>Child Containers Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildContainersPlacement()
	 * @generated
	 * @ordered
	 */
	protected CompartmentPlacementKind childContainersPlacement = CHILD_CONTAINERS_PLACEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDiagram getDiagram() {
		if (eContainerFeatureID != GMFGenPackage.GEN_NODE__DIAGRAM) return null;
		return (GenDiagram)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainMetaClass() {
		if (domainMetaClass != null && domainMetaClass.eIsProxy()) {
			EClass oldDomainMetaClass = domainMetaClass;
			domainMetaClass = (EClass)eResolveProxy((InternalEObject)domainMetaClass);
			if (domainMetaClass != oldDomainMetaClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.GEN_NODE__DOMAIN_META_CLASS, oldDomainMetaClass, domainMetaClass));
			}
		}
		return domainMetaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetDomainMetaClass() {
		return domainMetaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainMetaClass(EClass newDomainMetaClass) {
		EClass oldDomainMetaClass = domainMetaClass;
		domainMetaClass = newDomainMetaClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NODE__DOMAIN_META_CLASS, oldDomainMetaClass, domainMetaClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewmapURI() {
		return viewmapURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewmapURI(String newViewmapURI) {
		String oldViewmapURI = viewmapURI;
		viewmapURI = newViewmapURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NODE__VIEWMAP_URI, oldViewmapURI, viewmapURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNodeVisualizationKind() {
		return nodeVisualizationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeVisualizationKind(int newNodeVisualizationKind) {
		int oldNodeVisualizationKind = nodeVisualizationKind;
		nodeVisualizationKind = newNodeVisualizationKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NODE__NODE_VISUALIZATION_KIND, oldNodeVisualizationKind, nodeVisualizationKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewmapClass() {
		return viewmapClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewmapClass(String newViewmapClass) {
		String oldViewmapClass = viewmapClass;
		viewmapClass = newViewmapClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NODE__VIEWMAP_CLASS, oldViewmapClass, viewmapClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAffixedStereotypes() {
		if (affixedStereotypes == null) {
			affixedStereotypes = new EDataTypeUniqueEList(String.class, this, GMFGenPackage.GEN_NODE__AFFIXED_STEREOTYPES);
		}
		return affixedStereotypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColor(String newBackgroundColor) {
		String oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NODE__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getChildContainers() {
		if (childContainers == null) {
			childContainers = new EObjectContainmentEList(GenChildContainer.class, this, GMFGenPackage.GEN_NODE__CHILD_CONTAINERS);
		}
		return childContainers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getChildNodes() {
		if (childNodes == null) {
			childNodes = new EObjectContainmentWithInverseEList(GenChildNode.class, this, GMFGenPackage.GEN_NODE__CHILD_NODES, GMFGenPackage.GEN_CHILD_NODE__PARENT_NODE);
		}
		return childNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentPlacementKind getChildContainersPlacement() {
		return childContainersPlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildContainersPlacement(CompartmentPlacementKind newChildContainersPlacement) {
		CompartmentPlacementKind oldChildContainersPlacement = childContainersPlacement;
		childContainersPlacement = newChildContainersPlacement == null ? CHILD_CONTAINERS_PLACEMENT_EDEFAULT : newChildContainersPlacement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NODE__CHILD_CONTAINERS_PLACEMENT, oldChildContainersPlacement, childContainersPlacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initialize(EClass eClass) {
		setDomainMetaClass(eClass);
	}

	protected String getDefaultNotationViewFactoryClassName() {
		return getDomainMetaClass().getName() + "ViewFactory"; //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGenPackage.GEN_NODE__DIAGRAM:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, GMFGenPackage.GEN_NODE__DIAGRAM, msgs);
				case GMFGenPackage.GEN_NODE__CHILD_NODES:
					return ((InternalEList)getChildNodes()).basicAdd(otherEnd, msgs);
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
				case GMFGenPackage.GEN_NODE__DIAGRAM:
					return eBasicSetContainer(null, GMFGenPackage.GEN_NODE__DIAGRAM, msgs);
				case GMFGenPackage.GEN_NODE__CHILD_CONTAINERS:
					return ((InternalEList)getChildContainers()).basicRemove(otherEnd, msgs);
				case GMFGenPackage.GEN_NODE__CHILD_NODES:
					return ((InternalEList)getChildNodes()).basicRemove(otherEnd, msgs);
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
				case GMFGenPackage.GEN_NODE__DIAGRAM:
					return eContainer.eInverseRemove(this, GMFGenPackage.GEN_DIAGRAM__NODES, GenDiagram.class, msgs);
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
			case GMFGenPackage.GEN_NODE__DIAGRAM_RUN_TIME_CLASS:
				if (resolve) return getDiagramRunTimeClass();
				return basicGetDiagramRunTimeClass();
			case GMFGenPackage.GEN_NODE__VISUAL_ID:
				return new Integer(getVisualID());
			case GMFGenPackage.GEN_NODE__EDIT_PART_CLASS_NAME:
				return getEditPartClassName();
			case GMFGenPackage.GEN_NODE__META_INFO_PROVIDER_CLASS_NAME:
				return getMetaInfoProviderClassName();
			case GMFGenPackage.GEN_NODE__DOMAIN_NAME_FEATURE:
				if (resolve) return getDomainNameFeature();
				return basicGetDomainNameFeature();
			case GMFGenPackage.GEN_NODE__FOREGROUND_COLOR:
				return getForegroundColor();
			case GMFGenPackage.GEN_NODE__CONTAINMENT_META_FEATURE:
				if (resolve) return getContainmentMetaFeature();
				return basicGetContainmentMetaFeature();
			case GMFGenPackage.GEN_NODE__NOTATION_VIEW_FACTORY_CLASS_NAME:
				return getNotationViewFactoryClassName();
			case GMFGenPackage.GEN_NODE__DIAGRAM:
				return getDiagram();
			case GMFGenPackage.GEN_NODE__DOMAIN_META_CLASS:
				if (resolve) return getDomainMetaClass();
				return basicGetDomainMetaClass();
			case GMFGenPackage.GEN_NODE__VIEWMAP_URI:
				return getViewmapURI();
			case GMFGenPackage.GEN_NODE__NODE_VISUALIZATION_KIND:
				return new Integer(getNodeVisualizationKind());
			case GMFGenPackage.GEN_NODE__VIEWMAP_CLASS:
				return getViewmapClass();
			case GMFGenPackage.GEN_NODE__AFFIXED_STEREOTYPES:
				return getAffixedStereotypes();
			case GMFGenPackage.GEN_NODE__BACKGROUND_COLOR:
				return getBackgroundColor();
			case GMFGenPackage.GEN_NODE__CHILD_CONTAINERS:
				return getChildContainers();
			case GMFGenPackage.GEN_NODE__CHILD_NODES:
				return getChildNodes();
			case GMFGenPackage.GEN_NODE__CHILD_CONTAINERS_PLACEMENT:
				return getChildContainersPlacement();
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
			case GMFGenPackage.GEN_NODE__DIAGRAM_RUN_TIME_CLASS:
				setDiagramRunTimeClass((GenClass)newValue);
				return;
			case GMFGenPackage.GEN_NODE__VISUAL_ID:
				setVisualID(((Integer)newValue).intValue());
				return;
			case GMFGenPackage.GEN_NODE__EDIT_PART_CLASS_NAME:
				setEditPartClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_NODE__META_INFO_PROVIDER_CLASS_NAME:
				setMetaInfoProviderClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_NODE__DOMAIN_NAME_FEATURE:
				setDomainNameFeature((EAttribute)newValue);
				return;
			case GMFGenPackage.GEN_NODE__FOREGROUND_COLOR:
				setForegroundColor((String)newValue);
				return;
			case GMFGenPackage.GEN_NODE__CONTAINMENT_META_FEATURE:
				setContainmentMetaFeature((EReference)newValue);
				return;
			case GMFGenPackage.GEN_NODE__NOTATION_VIEW_FACTORY_CLASS_NAME:
				setNotationViewFactoryClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_NODE__DOMAIN_META_CLASS:
				setDomainMetaClass((EClass)newValue);
				return;
			case GMFGenPackage.GEN_NODE__VIEWMAP_URI:
				setViewmapURI((String)newValue);
				return;
			case GMFGenPackage.GEN_NODE__NODE_VISUALIZATION_KIND:
				setNodeVisualizationKind(((Integer)newValue).intValue());
				return;
			case GMFGenPackage.GEN_NODE__VIEWMAP_CLASS:
				setViewmapClass((String)newValue);
				return;
			case GMFGenPackage.GEN_NODE__AFFIXED_STEREOTYPES:
				getAffixedStereotypes().clear();
				getAffixedStereotypes().addAll((Collection)newValue);
				return;
			case GMFGenPackage.GEN_NODE__BACKGROUND_COLOR:
				setBackgroundColor((String)newValue);
				return;
			case GMFGenPackage.GEN_NODE__CHILD_CONTAINERS:
				getChildContainers().clear();
				getChildContainers().addAll((Collection)newValue);
				return;
			case GMFGenPackage.GEN_NODE__CHILD_NODES:
				getChildNodes().clear();
				getChildNodes().addAll((Collection)newValue);
				return;
			case GMFGenPackage.GEN_NODE__CHILD_CONTAINERS_PLACEMENT:
				setChildContainersPlacement((CompartmentPlacementKind)newValue);
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
			case GMFGenPackage.GEN_NODE__DIAGRAM_RUN_TIME_CLASS:
				setDiagramRunTimeClass((GenClass)null);
				return;
			case GMFGenPackage.GEN_NODE__VISUAL_ID:
				setVisualID(VISUAL_ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NODE__EDIT_PART_CLASS_NAME:
				setEditPartClassName(EDIT_PART_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NODE__META_INFO_PROVIDER_CLASS_NAME:
				setMetaInfoProviderClassName(META_INFO_PROVIDER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NODE__DOMAIN_NAME_FEATURE:
				setDomainNameFeature((EAttribute)null);
				return;
			case GMFGenPackage.GEN_NODE__FOREGROUND_COLOR:
				setForegroundColor(FOREGROUND_COLOR_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NODE__CONTAINMENT_META_FEATURE:
				setContainmentMetaFeature((EReference)null);
				return;
			case GMFGenPackage.GEN_NODE__NOTATION_VIEW_FACTORY_CLASS_NAME:
				setNotationViewFactoryClassName(NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NODE__DOMAIN_META_CLASS:
				setDomainMetaClass((EClass)null);
				return;
			case GMFGenPackage.GEN_NODE__VIEWMAP_URI:
				setViewmapURI(VIEWMAP_URI_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NODE__NODE_VISUALIZATION_KIND:
				setNodeVisualizationKind(NODE_VISUALIZATION_KIND_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NODE__VIEWMAP_CLASS:
				setViewmapClass(VIEWMAP_CLASS_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NODE__AFFIXED_STEREOTYPES:
				getAffixedStereotypes().clear();
				return;
			case GMFGenPackage.GEN_NODE__BACKGROUND_COLOR:
				setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NODE__CHILD_CONTAINERS:
				getChildContainers().clear();
				return;
			case GMFGenPackage.GEN_NODE__CHILD_NODES:
				getChildNodes().clear();
				return;
			case GMFGenPackage.GEN_NODE__CHILD_CONTAINERS_PLACEMENT:
				setChildContainersPlacement(CHILD_CONTAINERS_PLACEMENT_EDEFAULT);
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
			case GMFGenPackage.GEN_NODE__DIAGRAM_RUN_TIME_CLASS:
				return diagramRunTimeClass != null;
			case GMFGenPackage.GEN_NODE__VISUAL_ID:
				return visualID != VISUAL_ID_EDEFAULT;
			case GMFGenPackage.GEN_NODE__EDIT_PART_CLASS_NAME:
				return EDIT_PART_CLASS_NAME_EDEFAULT == null ? editPartClassName != null : !EDIT_PART_CLASS_NAME_EDEFAULT.equals(editPartClassName);
			case GMFGenPackage.GEN_NODE__META_INFO_PROVIDER_CLASS_NAME:
				return META_INFO_PROVIDER_CLASS_NAME_EDEFAULT == null ? metaInfoProviderClassName != null : !META_INFO_PROVIDER_CLASS_NAME_EDEFAULT.equals(metaInfoProviderClassName);
			case GMFGenPackage.GEN_NODE__DOMAIN_NAME_FEATURE:
				return domainNameFeature != null;
			case GMFGenPackage.GEN_NODE__FOREGROUND_COLOR:
				return FOREGROUND_COLOR_EDEFAULT == null ? foregroundColor != null : !FOREGROUND_COLOR_EDEFAULT.equals(foregroundColor);
			case GMFGenPackage.GEN_NODE__CONTAINMENT_META_FEATURE:
				return containmentMetaFeature != null;
			case GMFGenPackage.GEN_NODE__NOTATION_VIEW_FACTORY_CLASS_NAME:
				return NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT == null ? notationViewFactoryClassName != null : !NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT.equals(notationViewFactoryClassName);
			case GMFGenPackage.GEN_NODE__DIAGRAM:
				return getDiagram() != null;
			case GMFGenPackage.GEN_NODE__DOMAIN_META_CLASS:
				return domainMetaClass != null;
			case GMFGenPackage.GEN_NODE__VIEWMAP_URI:
				return VIEWMAP_URI_EDEFAULT == null ? viewmapURI != null : !VIEWMAP_URI_EDEFAULT.equals(viewmapURI);
			case GMFGenPackage.GEN_NODE__NODE_VISUALIZATION_KIND:
				return nodeVisualizationKind != NODE_VISUALIZATION_KIND_EDEFAULT;
			case GMFGenPackage.GEN_NODE__VIEWMAP_CLASS:
				return VIEWMAP_CLASS_EDEFAULT == null ? viewmapClass != null : !VIEWMAP_CLASS_EDEFAULT.equals(viewmapClass);
			case GMFGenPackage.GEN_NODE__AFFIXED_STEREOTYPES:
				return affixedStereotypes != null && !affixedStereotypes.isEmpty();
			case GMFGenPackage.GEN_NODE__BACKGROUND_COLOR:
				return BACKGROUND_COLOR_EDEFAULT == null ? backgroundColor != null : !BACKGROUND_COLOR_EDEFAULT.equals(backgroundColor);
			case GMFGenPackage.GEN_NODE__CHILD_CONTAINERS:
				return childContainers != null && !childContainers.isEmpty();
			case GMFGenPackage.GEN_NODE__CHILD_NODES:
				return childNodes != null && !childNodes.isEmpty();
			case GMFGenPackage.GEN_NODE__CHILD_CONTAINERS_PLACEMENT:
				return childContainersPlacement != CHILD_CONTAINERS_PLACEMENT_EDEFAULT;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (viewmapURI: ");
		result.append(viewmapURI);
		result.append(", nodeVisualizationKind: ");
		result.append(nodeVisualizationKind);
		result.append(", viewmapClass: ");
		result.append(viewmapClass);
		result.append(", affixedStereotypes: ");
		result.append(affixedStereotypes);
		result.append(", backgroundColor: ");
		result.append(backgroundColor);
		result.append(", childContainersPlacement: ");
		result.append(childContainersPlacement);
		result.append(')');
		return result.toString();
	}

	public String getClassNamePrefix() {
		return getDomainMetaClass() == null ? "GenNode$" + hashCode() : getDomainMetaClass().getName();
	}

	public String getClassNameSuffux() {
		return "Node";
	}
} //GenNodeImpl

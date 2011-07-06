/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings.impl;

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
import org.eclipse.gmf.mappings.AuditContainer;
import org.eclipse.gmf.mappings.CanvasMapping;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.Mapping;
import org.eclipse.gmf.mappings.MetricContainer;
import org.eclipse.gmf.mappings.TopNodeReference;
import org.eclipse.gmf.tooldef.StyleSelector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.impl.MappingImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.MappingImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.MappingImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.MappingImpl#getAppearanceStyles <em>Appearance Styles</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.MappingImpl#getAudits <em>Audits</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.MappingImpl#getMetrics <em>Metrics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingImpl extends EObjectImpl implements Mapping {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<TopNodeReference> nodes;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkMapping> links;

	/**
	 * The cached value of the '{@link #getDiagram() <em>Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagram()
	 * @generated
	 * @ordered
	 */
	protected CanvasMapping diagram;

	/**
	 * The cached value of the '{@link #getAppearanceStyles() <em>Appearance Styles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppearanceStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<StyleSelector> appearanceStyles;

	/**
	 * The cached value of the '{@link #getAudits() <em>Audits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudits()
	 * @generated
	 * @ordered
	 */
	protected AuditContainer audits;

	/**
	 * The cached value of the '{@link #getMetrics() <em>Metrics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrics()
	 * @generated
	 * @ordered
	 */
	protected MetricContainer metrics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFMapPackage.eINSTANCE.getMapping();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TopNodeReference> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<TopNodeReference>(TopNodeReference.class, this, GMFMapPackage.MAPPING__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkMapping> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<LinkMapping>(LinkMapping.class, this, GMFMapPackage.MAPPING__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanvasMapping getDiagram() {
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagram(CanvasMapping newDiagram, NotificationChain msgs) {
		CanvasMapping oldDiagram = diagram;
		diagram = newDiagram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFMapPackage.MAPPING__DIAGRAM, oldDiagram, newDiagram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram(CanvasMapping newDiagram) {
		if (newDiagram != diagram) {
			NotificationChain msgs = null;
			if (diagram != null)
				msgs = ((InternalEObject)diagram).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFMapPackage.MAPPING__DIAGRAM, null, msgs);
			if (newDiagram != null)
				msgs = ((InternalEObject)newDiagram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFMapPackage.MAPPING__DIAGRAM, null, msgs);
			msgs = basicSetDiagram(newDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.MAPPING__DIAGRAM, newDiagram, newDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StyleSelector> getAppearanceStyles() {
		if (appearanceStyles == null) {
			appearanceStyles = new EObjectContainmentEList<StyleSelector>(StyleSelector.class, this, GMFMapPackage.MAPPING__APPEARANCE_STYLES);
		}
		return appearanceStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditContainer getAudits() {
		return audits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAudits(AuditContainer newAudits, NotificationChain msgs) {
		AuditContainer oldAudits = audits;
		audits = newAudits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFMapPackage.MAPPING__AUDITS, oldAudits, newAudits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAudits(AuditContainer newAudits) {
		if (newAudits != audits) {
			NotificationChain msgs = null;
			if (audits != null)
				msgs = ((InternalEObject)audits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFMapPackage.MAPPING__AUDITS, null, msgs);
			if (newAudits != null)
				msgs = ((InternalEObject)newAudits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFMapPackage.MAPPING__AUDITS, null, msgs);
			msgs = basicSetAudits(newAudits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.MAPPING__AUDITS, newAudits, newAudits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricContainer getMetrics() {
		return metrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetrics(MetricContainer newMetrics, NotificationChain msgs) {
		MetricContainer oldMetrics = metrics;
		metrics = newMetrics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFMapPackage.MAPPING__METRICS, oldMetrics, newMetrics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetrics(MetricContainer newMetrics) {
		if (newMetrics != metrics) {
			NotificationChain msgs = null;
			if (metrics != null)
				msgs = ((InternalEObject)metrics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFMapPackage.MAPPING__METRICS, null, msgs);
			if (newMetrics != null)
				msgs = ((InternalEObject)newMetrics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFMapPackage.MAPPING__METRICS, null, msgs);
			msgs = basicSetMetrics(newMetrics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.MAPPING__METRICS, newMetrics, newMetrics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFMapPackage.MAPPING__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case GMFMapPackage.MAPPING__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case GMFMapPackage.MAPPING__DIAGRAM:
				return basicSetDiagram(null, msgs);
			case GMFMapPackage.MAPPING__APPEARANCE_STYLES:
				return ((InternalEList<?>)getAppearanceStyles()).basicRemove(otherEnd, msgs);
			case GMFMapPackage.MAPPING__AUDITS:
				return basicSetAudits(null, msgs);
			case GMFMapPackage.MAPPING__METRICS:
				return basicSetMetrics(null, msgs);
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
			case GMFMapPackage.MAPPING__NODES:
				return getNodes();
			case GMFMapPackage.MAPPING__LINKS:
				return getLinks();
			case GMFMapPackage.MAPPING__DIAGRAM:
				return getDiagram();
			case GMFMapPackage.MAPPING__APPEARANCE_STYLES:
				return getAppearanceStyles();
			case GMFMapPackage.MAPPING__AUDITS:
				return getAudits();
			case GMFMapPackage.MAPPING__METRICS:
				return getMetrics();
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
			case GMFMapPackage.MAPPING__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends TopNodeReference>)newValue);
				return;
			case GMFMapPackage.MAPPING__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends LinkMapping>)newValue);
				return;
			case GMFMapPackage.MAPPING__DIAGRAM:
				setDiagram((CanvasMapping)newValue);
				return;
			case GMFMapPackage.MAPPING__APPEARANCE_STYLES:
				getAppearanceStyles().clear();
				getAppearanceStyles().addAll((Collection<? extends StyleSelector>)newValue);
				return;
			case GMFMapPackage.MAPPING__AUDITS:
				setAudits((AuditContainer)newValue);
				return;
			case GMFMapPackage.MAPPING__METRICS:
				setMetrics((MetricContainer)newValue);
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
			case GMFMapPackage.MAPPING__NODES:
				getNodes().clear();
				return;
			case GMFMapPackage.MAPPING__LINKS:
				getLinks().clear();
				return;
			case GMFMapPackage.MAPPING__DIAGRAM:
				setDiagram((CanvasMapping)null);
				return;
			case GMFMapPackage.MAPPING__APPEARANCE_STYLES:
				getAppearanceStyles().clear();
				return;
			case GMFMapPackage.MAPPING__AUDITS:
				setAudits((AuditContainer)null);
				return;
			case GMFMapPackage.MAPPING__METRICS:
				setMetrics((MetricContainer)null);
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
			case GMFMapPackage.MAPPING__NODES:
				return nodes != null && !nodes.isEmpty();
			case GMFMapPackage.MAPPING__LINKS:
				return links != null && !links.isEmpty();
			case GMFMapPackage.MAPPING__DIAGRAM:
				return diagram != null;
			case GMFMapPackage.MAPPING__APPEARANCE_STYLES:
				return appearanceStyles != null && !appearanceStyles.isEmpty();
			case GMFMapPackage.MAPPING__AUDITS:
				return audits != null;
			case GMFMapPackage.MAPPING__METRICS:
				return metrics != null;
		}
		return super.eIsSet(featureID);
	}

} //MappingImpl

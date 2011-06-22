/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gmf.codegen.gmfgen.Behaviour;
import org.eclipse.gmf.codegen.gmfgen.ElementType;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.SharedBehaviour;
import org.eclipse.gmf.codegen.gmfgen.Viewmap;
import org.eclipse.gmf.codegen.gmfgen.ViewmapLayoutType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Common Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl#getDiagramRunTimeClass <em>Diagram Run Time Class</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl#getVisualID <em>Visual ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl#getEditPartClassName <em>Edit Part Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl#getItemSemanticEditPolicyClassName <em>Item Semantic Edit Policy Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl#getNotationViewFactoryClassName <em>Notation View Factory Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl#getViewmap <em>Viewmap</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl#getStyles <em>Styles</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl#getBehaviour <em>Behaviour</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl#isSansDomain <em>Sans Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenCommonBaseImpl extends EObjectImpl implements GenCommonBase {
	/**
	 * The cached value of the '{@link #getDiagramRunTimeClass() <em>Diagram Run Time Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramRunTimeClass()
	 * @generated
	 * @ordered
	 */
	protected GenClass diagramRunTimeClass;

	/**
	 * The default value of the '{@link #getVisualID() <em>Visual ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualID()
	 * @generated
	 * @ordered
	 */
	protected static final int VISUAL_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVisualID() <em>Visual ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualID()
	 * @generated
	 * @ordered
	 */
	protected int visualID = VISUAL_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected ElementType elementType;

	/**
	 * The default value of the '{@link #getEditPartClassName() <em>Edit Part Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditPartClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String EDIT_PART_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditPartClassName() <em>Edit Part Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditPartClassName()
	 * @generated
	 * @ordered
	 */
	protected String editPartClassName = EDIT_PART_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getItemSemanticEditPolicyClassName() <em>Item Semantic Edit Policy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemSemanticEditPolicyClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemSemanticEditPolicyClassName() <em>Item Semantic Edit Policy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemSemanticEditPolicyClassName()
	 * @generated
	 * @ordered
	 */
	protected String itemSemanticEditPolicyClassName = ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotationViewFactoryClassName() <em>Notation View Factory Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotationViewFactoryClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotationViewFactoryClassName() <em>Notation View Factory Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotationViewFactoryClassName()
	 * @generated
	 * @ordered
	 */
	protected String notationViewFactoryClassName = NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getViewmap() <em>Viewmap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewmap()
	 * @generated
	 * @ordered
	 */
	protected Viewmap viewmap;

	/**
	 * The cached value of the '{@link #getStyles() <em>Styles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<GenClass> styles;

	/**
	 * The cached value of the '{@link #getBehaviour() <em>Behaviour</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviour()
	 * @generated
	 * @ordered
	 */
	protected EList<Behaviour> behaviour;

	/**
	 * The default value of the '{@link #isSansDomain() <em>Sans Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSansDomain()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SANS_DOMAIN_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenCommonBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenCommonBase();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClass getDiagramRunTimeClass() {
		if (diagramRunTimeClass != null && diagramRunTimeClass.eIsProxy()) {
			InternalEObject oldDiagramRunTimeClass = (InternalEObject)diagramRunTimeClass;
			diagramRunTimeClass = (GenClass)eResolveProxy(oldDiagramRunTimeClass);
			if (diagramRunTimeClass != oldDiagramRunTimeClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.GEN_COMMON_BASE__DIAGRAM_RUN_TIME_CLASS, oldDiagramRunTimeClass, diagramRunTimeClass));
			}
		}
		return diagramRunTimeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClass basicGetDiagramRunTimeClass() {
		return diagramRunTimeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramRunTimeClass(GenClass newDiagramRunTimeClass) {
		GenClass oldDiagramRunTimeClass = diagramRunTimeClass;
		diagramRunTimeClass = newDiagramRunTimeClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_COMMON_BASE__DIAGRAM_RUN_TIME_CLASS, oldDiagramRunTimeClass, diagramRunTimeClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVisualID() {
		return visualID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisualID(int newVisualID) {
		int oldVisualID = visualID;
		visualID = newVisualID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_COMMON_BASE__VISUAL_ID, oldVisualID, visualID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementType getElementType() {
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementType(ElementType newElementType, NotificationChain msgs) {
		ElementType oldElementType = elementType;
		elementType = newElementType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_COMMON_BASE__ELEMENT_TYPE, oldElementType, newElementType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementType(ElementType newElementType) {
		if (newElementType != elementType) {
			NotificationChain msgs = null;
			if (elementType != null)
				msgs = ((InternalEObject)elementType).eInverseRemove(this, GMFGenPackage.ELEMENT_TYPE__DIAGRAM_ELEMENT, ElementType.class, msgs);
			if (newElementType != null)
				msgs = ((InternalEObject)newElementType).eInverseAdd(this, GMFGenPackage.ELEMENT_TYPE__DIAGRAM_ELEMENT, ElementType.class, msgs);
			msgs = basicSetElementType(newElementType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_COMMON_BASE__ELEMENT_TYPE, newElementType, newElementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditPartClassNameGen() {
		return editPartClassName;
	}

	public String getEditPartClassName() {
		return getValidClassName(getEditPartClassNameGen(), this, EDIT_PART_SUFFIX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditPartClassName(String newEditPartClassName) {
		String oldEditPartClassName = editPartClassName;
		editPartClassName = newEditPartClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_COMMON_BASE__EDIT_PART_CLASS_NAME, oldEditPartClassName, editPartClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getItemSemanticEditPolicyClassNameGen() {
		return itemSemanticEditPolicyClassName;
	}

	public String getItemSemanticEditPolicyClassName() {
		return getValidClassName(getItemSemanticEditPolicyClassNameGen(), this, ITEM_SEMANTIC_EDIT_POLICY_SUFFIX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemSemanticEditPolicyClassName(String newItemSemanticEditPolicyClassName) {
		String oldItemSemanticEditPolicyClassName = itemSemanticEditPolicyClassName;
		itemSemanticEditPolicyClassName = newItemSemanticEditPolicyClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_COMMON_BASE__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME, oldItemSemanticEditPolicyClassName, itemSemanticEditPolicyClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotationViewFactoryClassNameGen() {
		return notationViewFactoryClassName;
	}

	public String getNotationViewFactoryClassName() {
		return getValidClassName(getNotationViewFactoryClassNameGen(), this, NOTATION_VIEW_FACTORY_SUFFIX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotationViewFactoryClassName(String newNotationViewFactoryClassName) {
		String oldNotationViewFactoryClassName = notationViewFactoryClassName;
		notationViewFactoryClassName = newNotationViewFactoryClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_COMMON_BASE__NOTATION_VIEW_FACTORY_CLASS_NAME, oldNotationViewFactoryClassName, notationViewFactoryClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Viewmap getViewmap() {
		return viewmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewmap(Viewmap newViewmap, NotificationChain msgs) {
		Viewmap oldViewmap = viewmap;
		viewmap = newViewmap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_COMMON_BASE__VIEWMAP, oldViewmap, newViewmap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewmap(Viewmap newViewmap) {
		if (newViewmap != viewmap) {
			NotificationChain msgs = null;
			if (viewmap != null)
				msgs = ((InternalEObject)viewmap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_COMMON_BASE__VIEWMAP, null, msgs);
			if (newViewmap != null)
				msgs = ((InternalEObject)newViewmap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_COMMON_BASE__VIEWMAP, null, msgs);
			msgs = basicSetViewmap(newViewmap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_COMMON_BASE__VIEWMAP, newViewmap, newViewmap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenClass> getStyles() {
		if (styles == null) {
			styles = new EObjectResolvingEList<GenClass>(GenClass.class, this, GMFGenPackage.GEN_COMMON_BASE__STYLES);
		}
		return styles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behaviour> getBehaviour() {
		if (behaviour == null) {
			behaviour = new EObjectContainmentWithInverseEList<Behaviour>(Behaviour.class, this, GMFGenPackage.GEN_COMMON_BASE__BEHAVIOUR, GMFGenPackage.BEHAVIOUR__SUBJECT);
		}
		return behaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract boolean isSansDomain();

	static boolean isEmpty(String s) {
		return s == null || s.trim().length() == 0;
	}

	static String getValidClassName(String s) {
		assert !isEmpty(s);
		s = CodeGenUtil.validJavaIdentifier(s);
		return Character.toUpperCase(s.charAt(0)) + s.substring(1);
	}

	static String getValidClassName(String s, GenCommonBase genElement, String suffixPart) {
		assert genElement != null;
		assert suffixPart != null;
		if (isEmpty(s)) {
			String prefixPart = genElement.getClassNamePrefix();
			if (isEmpty(prefixPart)) {
				prefixPart = DEFAULT_CLASS_NAME_PREFIX;
			}
			s = prefixPart + suffixPart;
		}
		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract String getClassNamePrefix();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public final String getClassNameSuffux() {
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public final String getUniqueIdentifier() {
		String prefixPart = isEmpty(getClassNamePrefix()) ? DEFAULT_CLASS_NAME_PREFIX : getClassNamePrefix();
		return prefixPart + '_' + getVisualID();
	}

	/**
	 * @generated NOT
	 */
	public ViewmapLayoutType getLayoutType() {
		Viewmap viewmap = getViewmap();
		return viewmap == null ? ViewmapLayoutType.UNKNOWN_LITERAL : viewmap.getLayoutType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_COMMON_BASE__ELEMENT_TYPE:
				if (elementType != null)
					msgs = ((InternalEObject)elementType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_COMMON_BASE__ELEMENT_TYPE, null, msgs);
				return basicSetElementType((ElementType)otherEnd, msgs);
			case GMFGenPackage.GEN_COMMON_BASE__BEHAVIOUR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBehaviour()).basicAdd(otherEnd, msgs);
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
			case GMFGenPackage.GEN_COMMON_BASE__ELEMENT_TYPE:
				return basicSetElementType(null, msgs);
			case GMFGenPackage.GEN_COMMON_BASE__VIEWMAP:
				return basicSetViewmap(null, msgs);
			case GMFGenPackage.GEN_COMMON_BASE__BEHAVIOUR:
				return ((InternalEList<?>)getBehaviour()).basicRemove(otherEnd, msgs);
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
			case GMFGenPackage.GEN_COMMON_BASE__DIAGRAM_RUN_TIME_CLASS:
				if (resolve) return getDiagramRunTimeClass();
				return basicGetDiagramRunTimeClass();
			case GMFGenPackage.GEN_COMMON_BASE__VISUAL_ID:
				return new Integer(getVisualID());
			case GMFGenPackage.GEN_COMMON_BASE__ELEMENT_TYPE:
				return getElementType();
			case GMFGenPackage.GEN_COMMON_BASE__EDIT_PART_CLASS_NAME:
				return getEditPartClassName();
			case GMFGenPackage.GEN_COMMON_BASE__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				return getItemSemanticEditPolicyClassName();
			case GMFGenPackage.GEN_COMMON_BASE__NOTATION_VIEW_FACTORY_CLASS_NAME:
				return getNotationViewFactoryClassName();
			case GMFGenPackage.GEN_COMMON_BASE__VIEWMAP:
				return getViewmap();
			case GMFGenPackage.GEN_COMMON_BASE__STYLES:
				return getStyles();
			case GMFGenPackage.GEN_COMMON_BASE__BEHAVIOUR:
				return getBehaviour();
			case GMFGenPackage.GEN_COMMON_BASE__SANS_DOMAIN:
				return isSansDomain() ? Boolean.TRUE : Boolean.FALSE;
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
			case GMFGenPackage.GEN_COMMON_BASE__DIAGRAM_RUN_TIME_CLASS:
				setDiagramRunTimeClass((GenClass)newValue);
				return;
			case GMFGenPackage.GEN_COMMON_BASE__VISUAL_ID:
				setVisualID(((Integer)newValue).intValue());
				return;
			case GMFGenPackage.GEN_COMMON_BASE__ELEMENT_TYPE:
				setElementType((ElementType)newValue);
				return;
			case GMFGenPackage.GEN_COMMON_BASE__EDIT_PART_CLASS_NAME:
				setEditPartClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_COMMON_BASE__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				setItemSemanticEditPolicyClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_COMMON_BASE__NOTATION_VIEW_FACTORY_CLASS_NAME:
				setNotationViewFactoryClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_COMMON_BASE__VIEWMAP:
				setViewmap((Viewmap)newValue);
				return;
			case GMFGenPackage.GEN_COMMON_BASE__STYLES:
				getStyles().clear();
				getStyles().addAll((Collection<? extends GenClass>)newValue);
				return;
			case GMFGenPackage.GEN_COMMON_BASE__BEHAVIOUR:
				getBehaviour().clear();
				getBehaviour().addAll((Collection<? extends Behaviour>)newValue);
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
			case GMFGenPackage.GEN_COMMON_BASE__DIAGRAM_RUN_TIME_CLASS:
				setDiagramRunTimeClass((GenClass)null);
				return;
			case GMFGenPackage.GEN_COMMON_BASE__VISUAL_ID:
				setVisualID(VISUAL_ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_COMMON_BASE__ELEMENT_TYPE:
				setElementType((ElementType)null);
				return;
			case GMFGenPackage.GEN_COMMON_BASE__EDIT_PART_CLASS_NAME:
				setEditPartClassName(EDIT_PART_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_COMMON_BASE__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				setItemSemanticEditPolicyClassName(ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_COMMON_BASE__NOTATION_VIEW_FACTORY_CLASS_NAME:
				setNotationViewFactoryClassName(NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_COMMON_BASE__VIEWMAP:
				setViewmap((Viewmap)null);
				return;
			case GMFGenPackage.GEN_COMMON_BASE__STYLES:
				getStyles().clear();
				return;
			case GMFGenPackage.GEN_COMMON_BASE__BEHAVIOUR:
				getBehaviour().clear();
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
			case GMFGenPackage.GEN_COMMON_BASE__DIAGRAM_RUN_TIME_CLASS:
				return diagramRunTimeClass != null;
			case GMFGenPackage.GEN_COMMON_BASE__VISUAL_ID:
				return visualID != VISUAL_ID_EDEFAULT;
			case GMFGenPackage.GEN_COMMON_BASE__ELEMENT_TYPE:
				return elementType != null;
			case GMFGenPackage.GEN_COMMON_BASE__EDIT_PART_CLASS_NAME:
				return EDIT_PART_CLASS_NAME_EDEFAULT == null ? editPartClassName != null : !EDIT_PART_CLASS_NAME_EDEFAULT.equals(editPartClassName);
			case GMFGenPackage.GEN_COMMON_BASE__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				return ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME_EDEFAULT == null ? itemSemanticEditPolicyClassName != null : !ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME_EDEFAULT.equals(itemSemanticEditPolicyClassName);
			case GMFGenPackage.GEN_COMMON_BASE__NOTATION_VIEW_FACTORY_CLASS_NAME:
				return NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT == null ? notationViewFactoryClassName != null : !NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT.equals(notationViewFactoryClassName);
			case GMFGenPackage.GEN_COMMON_BASE__VIEWMAP:
				return viewmap != null;
			case GMFGenPackage.GEN_COMMON_BASE__STYLES:
				return styles != null && !styles.isEmpty();
			case GMFGenPackage.GEN_COMMON_BASE__BEHAVIOUR:
				return behaviour != null && !behaviour.isEmpty();
			case GMFGenPackage.GEN_COMMON_BASE__SANS_DOMAIN:
				return isSansDomain() != SANS_DOMAIN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getEditPartQualifiedClassName() {
		return getDiagram().getEditPartsPackageName() + '.' + getEditPartClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getItemSemanticEditPolicyQualifiedClassName() {
		return getDiagram().getEditPoliciesPackageName() + '.' + getItemSemanticEditPolicyClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getNotationViewFactoryQualifiedClassName() {
		return getDiagram().getNotationViewFactoriesPackageName() + '.' + getNotationViewFactoryClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract GenDiagram getDiagram();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (visualID: ");
		result.append(visualID);
		result.append(", editPartClassName: ");
		result.append(editPartClassName);
		result.append(", itemSemanticEditPolicyClassName: ");
		result.append(itemSemanticEditPolicyClassName);
		result.append(", notationViewFactoryClassName: ");
		result.append(notationViewFactoryClassName);
		result.append(')');
		return result.toString();
	}

	protected static String asJavaConstantName(String name) {
		name = name.toUpperCase();
		return CodeGenUtil.capName(CodeGenUtil.validJavaIdentifier(name));
	}

	public <T extends Behaviour> List<T> getBehaviour(Class<T> behaviourClass) {
		ArrayList<T> rv = new ArrayList<T>(getBehaviour().size());
		for (Iterator<Behaviour> it = getBehaviour().iterator(); it.hasNext(); ) {
			Object next = it.next();
			if (next instanceof SharedBehaviour) {
				next = ((SharedBehaviour) next).getDelegate();
			}
			if (behaviourClass.isInstance(next)) {
				@SuppressWarnings("unchecked")
				T tt = (T) next;
				rv.add(tt);
			}
		}
		return rv;
	}
} //GenCommonBaseImpl

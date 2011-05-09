/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.gmfgen.GenNavigator;
import org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Navigator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#isGenerateDomainModelNavigator <em>Generate Domain Model Navigator</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getDomainContentExtensionID <em>Domain Content Extension ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getDomainContentExtensionName <em>Domain Content Extension Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getDomainContentExtensionPriority <em>Domain Content Extension Priority</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getDomainContentProviderClassName <em>Domain Content Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getDomainLabelProviderClassName <em>Domain Label Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getDomainModelElementTesterClassName <em>Domain Model Element Tester Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getDomainNavigatorItemClassName <em>Domain Navigator Item Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getEditorGen <em>Editor Gen</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getContentExtensionID <em>Content Extension ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getContentExtensionName <em>Content Extension Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getContentExtensionPriority <em>Content Extension Priority</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getLinkHelperExtensionID <em>Link Helper Extension ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getSorterExtensionID <em>Sorter Extension ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getActionProviderID <em>Action Provider ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getContentProviderClassName <em>Content Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getLabelProviderClassName <em>Label Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getLinkHelperClassName <em>Link Helper Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getSorterClassName <em>Sorter Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getActionProviderClassName <em>Action Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getAbstractNavigatorItemClassName <em>Abstract Navigator Item Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getNavigatorGroupClassName <em>Navigator Group Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getNavigatorItemClassName <em>Navigator Item Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getChildReferences <em>Child References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenNavigatorImpl extends EObjectImpl implements GenNavigator {
	/**
	 * The cached value of the '{@link #getContentExtensionPriority() <em>Content Extension Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentExtensionPriority()
	 * @generated
	 * @ordered
	 */
	protected String contentExtensionPriority = CONTENT_EXTENSION_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkHelperExtensionID() <em>Link Helper Extension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkHelperExtensionID()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_HELPER_EXTENSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkHelperExtensionID() <em>Link Helper Extension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkHelperExtensionID()
	 * @generated
	 * @ordered
	 */
	protected String linkHelperExtensionID = LINK_HELPER_EXTENSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSorterExtensionID() <em>Sorter Extension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSorterExtensionID()
	 * @generated
	 * @ordered
	 */
	protected static final String SORTER_EXTENSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSorterExtensionID() <em>Sorter Extension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSorterExtensionID()
	 * @generated
	 * @ordered
	 */
	protected String sorterExtensionID = SORTER_EXTENSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionProviderID() <em>Action Provider ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionProviderID()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_PROVIDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionProviderID() <em>Action Provider ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionProviderID()
	 * @generated
	 * @ordered
	 */
	protected String actionProviderID = ACTION_PROVIDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentProviderClassName() <em>Content Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_PROVIDER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentProviderClassName() <em>Content Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected String contentProviderClassName = CONTENT_PROVIDER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelProviderClassName() <em>Label Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_PROVIDER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelProviderClassName() <em>Label Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected String labelProviderClassName = LABEL_PROVIDER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkHelperClassName() <em>Link Helper Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkHelperClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_HELPER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkHelperClassName() <em>Link Helper Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkHelperClassName()
	 * @generated
	 * @ordered
	 */
	protected String linkHelperClassName = LINK_HELPER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSorterClassName() <em>Sorter Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSorterClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SORTER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSorterClassName() <em>Sorter Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSorterClassName()
	 * @generated
	 * @ordered
	 */
	protected String sorterClassName = SORTER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionProviderClassName() <em>Action Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_PROVIDER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionProviderClassName() <em>Action Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected String actionProviderClassName = ACTION_PROVIDER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbstractNavigatorItemClassName() <em>Abstract Navigator Item Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractNavigatorItemClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSTRACT_NAVIGATOR_ITEM_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstractNavigatorItemClassName() <em>Abstract Navigator Item Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractNavigatorItemClassName()
	 * @generated
	 * @ordered
	 */
	protected String abstractNavigatorItemClassName = ABSTRACT_NAVIGATOR_ITEM_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNavigatorGroupClassName() <em>Navigator Group Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigatorGroupClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAVIGATOR_GROUP_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNavigatorGroupClassName() <em>Navigator Group Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigatorGroupClassName()
	 * @generated
	 * @ordered
	 */
	protected String navigatorGroupClassName = NAVIGATOR_GROUP_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNavigatorItemClassName() <em>Navigator Item Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigatorItemClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAVIGATOR_ITEM_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNavigatorItemClassName() <em>Navigator Item Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigatorItemClassName()
	 * @generated
	 * @ordered
	 */
	protected String navigatorItemClassName = NAVIGATOR_ITEM_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected String packageName = PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateDomainModelNavigator() <em>Generate Domain Model Navigator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateDomainModelNavigator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_DOMAIN_MODEL_NAVIGATOR_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerateDomainModelNavigator() <em>Generate Domain Model Navigator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateDomainModelNavigator()
	 * @generated
	 * @ordered
	 */
	protected boolean generateDomainModelNavigator = GENERATE_DOMAIN_MODEL_NAVIGATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainContentExtensionID() <em>Domain Content Extension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainContentExtensionID()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_CONTENT_EXTENSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainContentExtensionID() <em>Domain Content Extension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainContentExtensionID()
	 * @generated
	 * @ordered
	 */
	protected String domainContentExtensionID = DOMAIN_CONTENT_EXTENSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainContentExtensionName() <em>Domain Content Extension Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainContentExtensionName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_CONTENT_EXTENSION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainContentExtensionName() <em>Domain Content Extension Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainContentExtensionName()
	 * @generated
	 * @ordered
	 */
	protected String domainContentExtensionName = DOMAIN_CONTENT_EXTENSION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainContentExtensionPriority() <em>Domain Content Extension Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainContentExtensionPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_CONTENT_EXTENSION_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainContentExtensionPriority() <em>Domain Content Extension Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainContentExtensionPriority()
	 * @generated
	 * @ordered
	 */
	protected String domainContentExtensionPriority = DOMAIN_CONTENT_EXTENSION_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainContentProviderClassName() <em>Domain Content Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainContentProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_CONTENT_PROVIDER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainContentProviderClassName() <em>Domain Content Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainContentProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected String domainContentProviderClassName = DOMAIN_CONTENT_PROVIDER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainLabelProviderClassName() <em>Domain Label Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainLabelProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_LABEL_PROVIDER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainLabelProviderClassName() <em>Domain Label Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainLabelProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected String domainLabelProviderClassName = DOMAIN_LABEL_PROVIDER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainModelElementTesterClassName() <em>Domain Model Element Tester Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainModelElementTesterClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_MODEL_ELEMENT_TESTER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainModelElementTesterClassName() <em>Domain Model Element Tester Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainModelElementTesterClassName()
	 * @generated
	 * @ordered
	 */
	protected String domainModelElementTesterClassName = DOMAIN_MODEL_ELEMENT_TESTER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainNavigatorItemClassName() <em>Domain Navigator Item Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainNavigatorItemClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_NAVIGATOR_ITEM_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainNavigatorItemClassName() <em>Domain Navigator Item Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainNavigatorItemClassName()
	 * @generated
	 * @ordered
	 */
	protected String domainNavigatorItemClassName = DOMAIN_NAVIGATOR_ITEM_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentExtensionID() <em>Content Extension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentExtensionID()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EXTENSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentExtensionID() <em>Content Extension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentExtensionID()
	 * @generated
	 * @ordered
	 */
	protected String contentExtensionID = CONTENT_EXTENSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentExtensionName() <em>Content Extension Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentExtensionName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EXTENSION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentExtensionName() <em>Content Extension Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentExtensionName()
	 * @generated
	 * @ordered
	 */
	protected String contentExtensionName = CONTENT_EXTENSION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentExtensionPriority() <em>Content Extension Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentExtensionPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EXTENSION_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChildReferences() <em>Child References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<GenNavigatorChildReference> childReferences = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenNavigatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenNavigator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenEditorGenerator getEditorGen() {
		if (eContainerFeatureID != GMFGenPackage.GEN_NAVIGATOR__EDITOR_GEN) return null;
		return (GenEditorGenerator)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentExtensionIDGen() {
		return contentExtensionID;
	}

	public String getContentExtensionID() {
		String value = getContentExtensionIDGen();
		if (isEmpty(value)) {
			value = getEditorGen().getPlugin().getID() + ".resourceContent";
		}
		return value;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentExtensionID(String newContentExtensionID) {
		String oldContentExtensionID = contentExtensionID;
		contentExtensionID = newContentExtensionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR__CONTENT_EXTENSION_ID, oldContentExtensionID, contentExtensionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentExtensionNameGen() {
		return contentExtensionName;
	}

	public String getContentExtensionName() {
		String value = getContentExtensionNameGen();
		if (isEmpty(value)) {
			value = "%navigatorContentName";
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentExtensionName(String newContentExtensionName) {
		String oldContentExtensionName = contentExtensionName;
		contentExtensionName = newContentExtensionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR__CONTENT_EXTENSION_NAME, oldContentExtensionName, contentExtensionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentExtensionPriorityGen() {
		return contentExtensionPriority;
	}

	public String getContentExtensionPriority() {
		String value = getContentExtensionPriorityGen();
		if (isEmpty(value)) {
			value = "normal"; //$NON-NLS-1$
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentExtensionPriority(String newContentExtensionPriority) {
		String oldContentExtensionPriority = contentExtensionPriority;
		contentExtensionPriority = newContentExtensionPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR__CONTENT_EXTENSION_PRIORITY, oldContentExtensionPriority, contentExtensionPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinkHelperExtensionIDGen() {
		return linkHelperExtensionID;
	}

	public String getLinkHelperExtensionID() {
		String value = getLinkHelperExtensionIDGen();
		if (isEmpty(value)) {
			value = getEditorGen().getPlugin().getID() + ".navigatorLinkHelper";
		}
		return value;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkHelperExtensionID(String newLinkHelperExtensionID) {
		String oldLinkHelperExtensionID = linkHelperExtensionID;
		linkHelperExtensionID = newLinkHelperExtensionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR__LINK_HELPER_EXTENSION_ID, oldLinkHelperExtensionID, linkHelperExtensionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSorterExtensionIDGen() {
		return sorterExtensionID;
	}

	public String getSorterExtensionID() {
		String value = getSorterExtensionIDGen();
		if (isEmpty(value)) {
			value = getEditorGen().getPlugin().getID() + ".navigatorSorter";
		}
		return value;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSorterExtensionID(String newSorterExtensionID) {
		String oldSorterExtensionID = sorterExtensionID;
		sorterExtensionID = newSorterExtensionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR__SORTER_EXTENSION_ID, oldSorterExtensionID, sorterExtensionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionProviderIDGen() {
		return actionProviderID;
	}

	public String getActionProviderID() {
		String value = getActionProviderIDGen();
		if (isEmpty(value)) {
			value = getEditorGen().getPlugin().getID() + ".navigatorActionProvider";
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionProviderID(String newActionProviderID) {
		String oldActionProviderID = actionProviderID;
		actionProviderID = newActionProviderID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR__ACTION_PROVIDER_ID, oldActionProviderID, actionProviderID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentProviderClassNameGen() {
		return contentProviderClassName;
	}

	public String getContentProviderClassName() {
		String value = getContentProviderClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "NavigatorContentProvider"; //$NON-NLS-1$
		}
		return value;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentProviderClassName(String newContentProviderClassName) {
		String oldContentProviderClassName = contentProviderClassName;
		contentProviderClassName = newContentProviderClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR__CONTENT_PROVIDER_CLASS_NAME, oldContentProviderClassName, contentProviderClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabelProviderClassNameGen() {
		return labelProviderClassName;
	}

	public String getLabelProviderClassName() {
		String value = getLabelProviderClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "NavigatorLabelProvider"; //$NON-NLS-1$
		}
		return value;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelProviderClassName(String newLabelProviderClassName) {
		String oldLabelProviderClassName = labelProviderClassName;
		labelProviderClassName = newLabelProviderClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR__LABEL_PROVIDER_CLASS_NAME, oldLabelProviderClassName, labelProviderClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinkHelperClassNameGen() {
		return linkHelperClassName;
	}

	public String getLinkHelperClassName() {
		String value = getLinkHelperClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "NavigatorLinkHelper"; //$NON-NLS-1$
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkHelperClassName(String newLinkHelperClassName) {
		String oldLinkHelperClassName = linkHelperClassName;
		linkHelperClassName = newLinkHelperClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR__LINK_HELPER_CLASS_NAME, oldLinkHelperClassName, linkHelperClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSorterClassNameGen() {
		return sorterClassName;
	}

	public String getSorterClassName() {
		String value = getSorterClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "NavigatorSorter"; //$NON-NLS-1$
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSorterClassName(String newSorterClassName) {
		String oldSorterClassName = sorterClassName;
		sorterClassName = newSorterClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR__SORTER_CLASS_NAME, oldSorterClassName, sorterClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionProviderClassNameGen() {
		return actionProviderClassName;
	}

	public String getActionProviderClassName() {
		String value = getActionProviderClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "NavigatorActionProvider"; //$NON-NLS-1$
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionProviderClassName(String newActionProviderClassName) {
		String oldActionProviderClassName = actionProviderClassName;
		actionProviderClassName = newActionProviderClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR__ACTION_PROVIDER_CLASS_NAME, oldActionProviderClassName, actionProviderClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbstractNavigatorItemClassNameGen() {
		return abstractNavigatorItemClassName;
	}

	public String getAbstractNavigatorItemClassName() {
		String value = getAbstractNavigatorItemClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "AbstractNavigatorItem"; //$NON-NLS-1$
		}
		return value;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractNavigatorItemClassName(String newAbstractNavigatorItemClassName) {
		String oldAbstractNavigatorItemClassName = abstractNavigatorItemClassName;
		abstractNavigatorItemClassName = newAbstractNavigatorItemClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR__ABSTRACT_NAVIGATOR_ITEM_CLASS_NAME, oldAbstractNavigatorItemClassName, abstractNavigatorItemClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNavigatorGroupClassNameGen() {
		return navigatorGroupClassName;
	}

	public String getNavigatorGroupClassName() {
		String value = getNavigatorGroupClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "NavigatorGroup"; //$NON-NLS-1$
		}
		return value;	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigatorGroupClassName(String newNavigatorGroupClassName) {
		String oldNavigatorGroupClassName = navigatorGroupClassName;
		navigatorGroupClassName = newNavigatorGroupClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR__NAVIGATOR_GROUP_CLASS_NAME, oldNavigatorGroupClassName, navigatorGroupClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNavigatorItemClassNameGen() {
		return navigatorItemClassName;
	}

	public String getNavigatorItemClassName() {
		String value = getNavigatorItemClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "NavigatorItem"; //$NON-NLS-1$
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigatorItemClassName(String newNavigatorItemClassName) {
		String oldNavigatorItemClassName = navigatorItemClassName;
		navigatorItemClassName = newNavigatorItemClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR__NAVIGATOR_ITEM_CLASS_NAME, oldNavigatorItemClassName, navigatorItemClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageNameGen() {
		return packageName;
	}

	public String getPackageName() {
		String value = getPackageNameGen();
		if (value == null) {
			value = getEditorGen().getPackageNamePrefix() + ".navigator";
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageName(String newPackageName) {
		String oldPackageName = packageName;
		packageName = newPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR__PACKAGE_NAME, oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateDomainModelNavigator() {
		return generateDomainModelNavigator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateDomainModelNavigator(boolean newGenerateDomainModelNavigator) {
		boolean oldGenerateDomainModelNavigator = generateDomainModelNavigator;
		generateDomainModelNavigator = newGenerateDomainModelNavigator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR__GENERATE_DOMAIN_MODEL_NAVIGATOR, oldGenerateDomainModelNavigator, generateDomainModelNavigator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainContentExtensionIDGen() {
		return domainContentExtensionID;
	}
	
	public String getDomainContentExtensionID() {
		String value = getDomainContentExtensionIDGen();
		if (isEmpty(value)) {
			value = getEditorGen().getPlugin().getID() + ".domainResourceContent";
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainContentExtensionID(String newDomainContentExtensionID) {
		String oldDomainContentExtensionID = domainContentExtensionID;
		domainContentExtensionID = newDomainContentExtensionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR__DOMAIN_CONTENT_EXTENSION_ID, oldDomainContentExtensionID, domainContentExtensionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainContentExtensionNameGen() {
		return domainContentExtensionName;
	}
	
	public String getDomainContentExtensionName() {
		String value = getDomainContentExtensionNameGen();
		if (isEmpty(value)) {
			value = "%domainNavigatorContentName";
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainContentExtensionName(String newDomainContentExtensionName) {
		String oldDomainContentExtensionName = domainContentExtensionName;
		domainContentExtensionName = newDomainContentExtensionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR__DOMAIN_CONTENT_EXTENSION_NAME, oldDomainContentExtensionName, domainContentExtensionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainContentExtensionPriorityGen() {
		return domainContentExtensionPriority;
	}
	
	public String getDomainContentExtensionPriority() {
		String value = getDomainContentExtensionPriorityGen();
		if (isEmpty(value)) {
			value = "normal"; //$NON-NLS-1$
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainContentExtensionPriority(String newDomainContentExtensionPriority) {
		String oldDomainContentExtensionPriority = domainContentExtensionPriority;
		domainContentExtensionPriority = newDomainContentExtensionPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR__DOMAIN_CONTENT_EXTENSION_PRIORITY, oldDomainContentExtensionPriority, domainContentExtensionPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainContentProviderClassNameGen() {
		return domainContentProviderClassName;
	}
	
	public String getDomainContentProviderClassName() {
		String value = getDomainContentProviderClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "DomainNavigatorContentProvider"; //$NON-NLS-1$
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainContentProviderClassName(String newDomainContentProviderClassName) {
		String oldDomainContentProviderClassName = domainContentProviderClassName;
		domainContentProviderClassName = newDomainContentProviderClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR__DOMAIN_CONTENT_PROVIDER_CLASS_NAME, oldDomainContentProviderClassName, domainContentProviderClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainLabelProviderClassNameGen() {
		return domainLabelProviderClassName;
	}
	
	public String getDomainLabelProviderClassName() {
		String value = getDomainLabelProviderClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "DomainNavigatorLabelProvider"; //$NON-NLS-1$
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainLabelProviderClassName(String newDomainLabelProviderClassName) {
		String oldDomainLabelProviderClassName = domainLabelProviderClassName;
		domainLabelProviderClassName = newDomainLabelProviderClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR__DOMAIN_LABEL_PROVIDER_CLASS_NAME, oldDomainLabelProviderClassName, domainLabelProviderClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainModelElementTesterClassNameGen() {
		return domainModelElementTesterClassName;
	}
	
	public String getDomainModelElementTesterClassName() {
		String value = getDomainModelElementTesterClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "DomainModelElementTester"; //$NON-NLS-1$
		}
		return value;
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainModelElementTesterClassName(String newDomainModelElementTesterClassName) {
		String oldDomainModelElementTesterClassName = domainModelElementTesterClassName;
		domainModelElementTesterClassName = newDomainModelElementTesterClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR__DOMAIN_MODEL_ELEMENT_TESTER_CLASS_NAME, oldDomainModelElementTesterClassName, domainModelElementTesterClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainNavigatorItemClassNameGen() {
		return domainNavigatorItemClassName;
	}
	
	public String getDomainNavigatorItemClassName() {
		String value = getDomainNavigatorItemClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "DomainNavigatorItem"; //$NON-NLS-1$
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainNavigatorItemClassName(String newDomainNavigatorItemClassName) {
		String oldDomainNavigatorItemClassName = domainNavigatorItemClassName;
		domainNavigatorItemClassName = newDomainNavigatorItemClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR__DOMAIN_NAVIGATOR_ITEM_CLASS_NAME, oldDomainNavigatorItemClassName, domainNavigatorItemClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenNavigatorChildReference> getChildReferences() {
		if (childReferences == null) {
			childReferences = new EObjectContainmentWithInverseEList<GenNavigatorChildReference>(GenNavigatorChildReference.class, this, GMFGenPackage.GEN_NAVIGATOR__CHILD_REFERENCES, GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__NAVIGATOR);
		}
		return childReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getContentProviderQualifiedClassName() {
		return getPackageName() + '.' + getContentProviderClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getLabelProviderQualifiedClassName() {
		return getPackageName() + '.' + getLabelProviderClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getLinkHelperQualifiedClassName() {
		return getPackageName() + '.' + getLinkHelperClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getSorterQualifiedClassName() {
		return getPackageName() + '.' + getSorterClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getActionProviderQualifiedClassName() {
		return getPackageName() + '.' + getActionProviderClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getAbstractNavigatorItemQualifiedClassName() {
		return getPackageName() + '.' + getAbstractNavigatorItemClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getNavigatorGroupQualifiedClassName() {
		return getPackageName() + '.' + getNavigatorGroupClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getNavigatorItemQualifiedClassName() {
		return getPackageName() + '.' + getNavigatorItemClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getDomainContentProviderQualifiedClassName() {
		return getPackageName() + '.' + getDomainContentProviderClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getDomainLabelProviderQualifiedClassName() {
		return getPackageName() + '.' + getDomainLabelProviderClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getDomainModelElementTesterQualifiedClassName() {
		return getEditorGen().getEditor().getPackageName() + '.' + getDomainModelElementTesterClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getDomainNavigatorItemQualifiedClassName() {
		return getPackageName() + '.' + getDomainNavigatorItemClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<GenNavigatorChildReference> getChildReferencesTo(GenCommonBase child) {
		ArrayList<GenNavigatorChildReference> result = new ArrayList<GenNavigatorChildReference>();
		for (GenNavigatorChildReference nextReference : getChildReferences()) {
			if (child == nextReference.getChild()) {
				result.add(nextReference);
			}
		}
		return new BasicEList.UnmodifiableEList<GenNavigatorChildReference>(result.size(), result.toArray());
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
			case GMFGenPackage.GEN_NAVIGATOR__EDITOR_GEN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, GMFGenPackage.GEN_NAVIGATOR__EDITOR_GEN, msgs);
			case GMFGenPackage.GEN_NAVIGATOR__CHILD_REFERENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildReferences()).basicAdd(otherEnd, msgs);
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
			case GMFGenPackage.GEN_NAVIGATOR__EDITOR_GEN:
				return eBasicSetContainer(null, GMFGenPackage.GEN_NAVIGATOR__EDITOR_GEN, msgs);
			case GMFGenPackage.GEN_NAVIGATOR__CHILD_REFERENCES:
				return ((InternalEList<?>)getChildReferences()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case GMFGenPackage.GEN_NAVIGATOR__EDITOR_GEN:
				return eInternalContainer().eInverseRemove(this, GMFGenPackage.GEN_EDITOR_GENERATOR__NAVIGATOR, GenEditorGenerator.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.GEN_NAVIGATOR__GENERATE_DOMAIN_MODEL_NAVIGATOR:
				return isGenerateDomainModelNavigator() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_CONTENT_EXTENSION_ID:
				return getDomainContentExtensionID();
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_CONTENT_EXTENSION_NAME:
				return getDomainContentExtensionName();
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_CONTENT_EXTENSION_PRIORITY:
				return getDomainContentExtensionPriority();
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_CONTENT_PROVIDER_CLASS_NAME:
				return getDomainContentProviderClassName();
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_LABEL_PROVIDER_CLASS_NAME:
				return getDomainLabelProviderClassName();
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_MODEL_ELEMENT_TESTER_CLASS_NAME:
				return getDomainModelElementTesterClassName();
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_NAVIGATOR_ITEM_CLASS_NAME:
				return getDomainNavigatorItemClassName();
			case GMFGenPackage.GEN_NAVIGATOR__EDITOR_GEN:
				return getEditorGen();
			case GMFGenPackage.GEN_NAVIGATOR__CONTENT_EXTENSION_ID:
				return getContentExtensionID();
			case GMFGenPackage.GEN_NAVIGATOR__CONTENT_EXTENSION_NAME:
				return getContentExtensionName();
			case GMFGenPackage.GEN_NAVIGATOR__CONTENT_EXTENSION_PRIORITY:
				return getContentExtensionPriority();
			case GMFGenPackage.GEN_NAVIGATOR__LINK_HELPER_EXTENSION_ID:
				return getLinkHelperExtensionID();
			case GMFGenPackage.GEN_NAVIGATOR__SORTER_EXTENSION_ID:
				return getSorterExtensionID();
			case GMFGenPackage.GEN_NAVIGATOR__ACTION_PROVIDER_ID:
				return getActionProviderID();
			case GMFGenPackage.GEN_NAVIGATOR__CONTENT_PROVIDER_CLASS_NAME:
				return getContentProviderClassName();
			case GMFGenPackage.GEN_NAVIGATOR__LABEL_PROVIDER_CLASS_NAME:
				return getLabelProviderClassName();
			case GMFGenPackage.GEN_NAVIGATOR__LINK_HELPER_CLASS_NAME:
				return getLinkHelperClassName();
			case GMFGenPackage.GEN_NAVIGATOR__SORTER_CLASS_NAME:
				return getSorterClassName();
			case GMFGenPackage.GEN_NAVIGATOR__ACTION_PROVIDER_CLASS_NAME:
				return getActionProviderClassName();
			case GMFGenPackage.GEN_NAVIGATOR__ABSTRACT_NAVIGATOR_ITEM_CLASS_NAME:
				return getAbstractNavigatorItemClassName();
			case GMFGenPackage.GEN_NAVIGATOR__NAVIGATOR_GROUP_CLASS_NAME:
				return getNavigatorGroupClassName();
			case GMFGenPackage.GEN_NAVIGATOR__NAVIGATOR_ITEM_CLASS_NAME:
				return getNavigatorItemClassName();
			case GMFGenPackage.GEN_NAVIGATOR__PACKAGE_NAME:
				return getPackageName();
			case GMFGenPackage.GEN_NAVIGATOR__CHILD_REFERENCES:
				return getChildReferences();
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
			case GMFGenPackage.GEN_NAVIGATOR__GENERATE_DOMAIN_MODEL_NAVIGATOR:
				setGenerateDomainModelNavigator(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_CONTENT_EXTENSION_ID:
				setDomainContentExtensionID((String)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_CONTENT_EXTENSION_NAME:
				setDomainContentExtensionName((String)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_CONTENT_EXTENSION_PRIORITY:
				setDomainContentExtensionPriority((String)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_CONTENT_PROVIDER_CLASS_NAME:
				setDomainContentProviderClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_LABEL_PROVIDER_CLASS_NAME:
				setDomainLabelProviderClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_MODEL_ELEMENT_TESTER_CLASS_NAME:
				setDomainModelElementTesterClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_NAVIGATOR_ITEM_CLASS_NAME:
				setDomainNavigatorItemClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__CONTENT_EXTENSION_ID:
				setContentExtensionID((String)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__CONTENT_EXTENSION_NAME:
				setContentExtensionName((String)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__CONTENT_EXTENSION_PRIORITY:
				setContentExtensionPriority((String)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__LINK_HELPER_EXTENSION_ID:
				setLinkHelperExtensionID((String)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__SORTER_EXTENSION_ID:
				setSorterExtensionID((String)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__ACTION_PROVIDER_ID:
				setActionProviderID((String)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__CONTENT_PROVIDER_CLASS_NAME:
				setContentProviderClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__LABEL_PROVIDER_CLASS_NAME:
				setLabelProviderClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__LINK_HELPER_CLASS_NAME:
				setLinkHelperClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__SORTER_CLASS_NAME:
				setSorterClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__ACTION_PROVIDER_CLASS_NAME:
				setActionProviderClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__ABSTRACT_NAVIGATOR_ITEM_CLASS_NAME:
				setAbstractNavigatorItemClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__NAVIGATOR_GROUP_CLASS_NAME:
				setNavigatorGroupClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__NAVIGATOR_ITEM_CLASS_NAME:
				setNavigatorItemClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__PACKAGE_NAME:
				setPackageName((String)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__CHILD_REFERENCES:
				getChildReferences().clear();
				getChildReferences().addAll((Collection<? extends GenNavigatorChildReference>)newValue);
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
			case GMFGenPackage.GEN_NAVIGATOR__GENERATE_DOMAIN_MODEL_NAVIGATOR:
				setGenerateDomainModelNavigator(GENERATE_DOMAIN_MODEL_NAVIGATOR_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_CONTENT_EXTENSION_ID:
				setDomainContentExtensionID(DOMAIN_CONTENT_EXTENSION_ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_CONTENT_EXTENSION_NAME:
				setDomainContentExtensionName(DOMAIN_CONTENT_EXTENSION_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_CONTENT_EXTENSION_PRIORITY:
				setDomainContentExtensionPriority(DOMAIN_CONTENT_EXTENSION_PRIORITY_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_CONTENT_PROVIDER_CLASS_NAME:
				setDomainContentProviderClassName(DOMAIN_CONTENT_PROVIDER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_LABEL_PROVIDER_CLASS_NAME:
				setDomainLabelProviderClassName(DOMAIN_LABEL_PROVIDER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_MODEL_ELEMENT_TESTER_CLASS_NAME:
				setDomainModelElementTesterClassName(DOMAIN_MODEL_ELEMENT_TESTER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_NAVIGATOR_ITEM_CLASS_NAME:
				setDomainNavigatorItemClassName(DOMAIN_NAVIGATOR_ITEM_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__CONTENT_EXTENSION_ID:
				setContentExtensionID(CONTENT_EXTENSION_ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__CONTENT_EXTENSION_NAME:
				setContentExtensionName(CONTENT_EXTENSION_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__CONTENT_EXTENSION_PRIORITY:
				setContentExtensionPriority(CONTENT_EXTENSION_PRIORITY_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__LINK_HELPER_EXTENSION_ID:
				setLinkHelperExtensionID(LINK_HELPER_EXTENSION_ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__SORTER_EXTENSION_ID:
				setSorterExtensionID(SORTER_EXTENSION_ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__ACTION_PROVIDER_ID:
				setActionProviderID(ACTION_PROVIDER_ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__CONTENT_PROVIDER_CLASS_NAME:
				setContentProviderClassName(CONTENT_PROVIDER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__LABEL_PROVIDER_CLASS_NAME:
				setLabelProviderClassName(LABEL_PROVIDER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__LINK_HELPER_CLASS_NAME:
				setLinkHelperClassName(LINK_HELPER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__SORTER_CLASS_NAME:
				setSorterClassName(SORTER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__ACTION_PROVIDER_CLASS_NAME:
				setActionProviderClassName(ACTION_PROVIDER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__ABSTRACT_NAVIGATOR_ITEM_CLASS_NAME:
				setAbstractNavigatorItemClassName(ABSTRACT_NAVIGATOR_ITEM_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__NAVIGATOR_GROUP_CLASS_NAME:
				setNavigatorGroupClassName(NAVIGATOR_GROUP_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__NAVIGATOR_ITEM_CLASS_NAME:
				setNavigatorItemClassName(NAVIGATOR_ITEM_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NAVIGATOR__CHILD_REFERENCES:
				getChildReferences().clear();
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
			case GMFGenPackage.GEN_NAVIGATOR__GENERATE_DOMAIN_MODEL_NAVIGATOR:
				return generateDomainModelNavigator != GENERATE_DOMAIN_MODEL_NAVIGATOR_EDEFAULT;
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_CONTENT_EXTENSION_ID:
				return DOMAIN_CONTENT_EXTENSION_ID_EDEFAULT == null ? domainContentExtensionID != null : !DOMAIN_CONTENT_EXTENSION_ID_EDEFAULT.equals(domainContentExtensionID);
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_CONTENT_EXTENSION_NAME:
				return DOMAIN_CONTENT_EXTENSION_NAME_EDEFAULT == null ? domainContentExtensionName != null : !DOMAIN_CONTENT_EXTENSION_NAME_EDEFAULT.equals(domainContentExtensionName);
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_CONTENT_EXTENSION_PRIORITY:
				return DOMAIN_CONTENT_EXTENSION_PRIORITY_EDEFAULT == null ? domainContentExtensionPriority != null : !DOMAIN_CONTENT_EXTENSION_PRIORITY_EDEFAULT.equals(domainContentExtensionPriority);
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_CONTENT_PROVIDER_CLASS_NAME:
				return DOMAIN_CONTENT_PROVIDER_CLASS_NAME_EDEFAULT == null ? domainContentProviderClassName != null : !DOMAIN_CONTENT_PROVIDER_CLASS_NAME_EDEFAULT.equals(domainContentProviderClassName);
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_LABEL_PROVIDER_CLASS_NAME:
				return DOMAIN_LABEL_PROVIDER_CLASS_NAME_EDEFAULT == null ? domainLabelProviderClassName != null : !DOMAIN_LABEL_PROVIDER_CLASS_NAME_EDEFAULT.equals(domainLabelProviderClassName);
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_MODEL_ELEMENT_TESTER_CLASS_NAME:
				return DOMAIN_MODEL_ELEMENT_TESTER_CLASS_NAME_EDEFAULT == null ? domainModelElementTesterClassName != null : !DOMAIN_MODEL_ELEMENT_TESTER_CLASS_NAME_EDEFAULT.equals(domainModelElementTesterClassName);
			case GMFGenPackage.GEN_NAVIGATOR__DOMAIN_NAVIGATOR_ITEM_CLASS_NAME:
				return DOMAIN_NAVIGATOR_ITEM_CLASS_NAME_EDEFAULT == null ? domainNavigatorItemClassName != null : !DOMAIN_NAVIGATOR_ITEM_CLASS_NAME_EDEFAULT.equals(domainNavigatorItemClassName);
			case GMFGenPackage.GEN_NAVIGATOR__EDITOR_GEN:
				return getEditorGen() != null;
			case GMFGenPackage.GEN_NAVIGATOR__CONTENT_EXTENSION_ID:
				return CONTENT_EXTENSION_ID_EDEFAULT == null ? contentExtensionID != null : !CONTENT_EXTENSION_ID_EDEFAULT.equals(contentExtensionID);
			case GMFGenPackage.GEN_NAVIGATOR__CONTENT_EXTENSION_NAME:
				return CONTENT_EXTENSION_NAME_EDEFAULT == null ? contentExtensionName != null : !CONTENT_EXTENSION_NAME_EDEFAULT.equals(contentExtensionName);
			case GMFGenPackage.GEN_NAVIGATOR__CONTENT_EXTENSION_PRIORITY:
				return CONTENT_EXTENSION_PRIORITY_EDEFAULT == null ? contentExtensionPriority != null : !CONTENT_EXTENSION_PRIORITY_EDEFAULT.equals(contentExtensionPriority);
			case GMFGenPackage.GEN_NAVIGATOR__LINK_HELPER_EXTENSION_ID:
				return LINK_HELPER_EXTENSION_ID_EDEFAULT == null ? linkHelperExtensionID != null : !LINK_HELPER_EXTENSION_ID_EDEFAULT.equals(linkHelperExtensionID);
			case GMFGenPackage.GEN_NAVIGATOR__SORTER_EXTENSION_ID:
				return SORTER_EXTENSION_ID_EDEFAULT == null ? sorterExtensionID != null : !SORTER_EXTENSION_ID_EDEFAULT.equals(sorterExtensionID);
			case GMFGenPackage.GEN_NAVIGATOR__ACTION_PROVIDER_ID:
				return ACTION_PROVIDER_ID_EDEFAULT == null ? actionProviderID != null : !ACTION_PROVIDER_ID_EDEFAULT.equals(actionProviderID);
			case GMFGenPackage.GEN_NAVIGATOR__CONTENT_PROVIDER_CLASS_NAME:
				return CONTENT_PROVIDER_CLASS_NAME_EDEFAULT == null ? contentProviderClassName != null : !CONTENT_PROVIDER_CLASS_NAME_EDEFAULT.equals(contentProviderClassName);
			case GMFGenPackage.GEN_NAVIGATOR__LABEL_PROVIDER_CLASS_NAME:
				return LABEL_PROVIDER_CLASS_NAME_EDEFAULT == null ? labelProviderClassName != null : !LABEL_PROVIDER_CLASS_NAME_EDEFAULT.equals(labelProviderClassName);
			case GMFGenPackage.GEN_NAVIGATOR__LINK_HELPER_CLASS_NAME:
				return LINK_HELPER_CLASS_NAME_EDEFAULT == null ? linkHelperClassName != null : !LINK_HELPER_CLASS_NAME_EDEFAULT.equals(linkHelperClassName);
			case GMFGenPackage.GEN_NAVIGATOR__SORTER_CLASS_NAME:
				return SORTER_CLASS_NAME_EDEFAULT == null ? sorterClassName != null : !SORTER_CLASS_NAME_EDEFAULT.equals(sorterClassName);
			case GMFGenPackage.GEN_NAVIGATOR__ACTION_PROVIDER_CLASS_NAME:
				return ACTION_PROVIDER_CLASS_NAME_EDEFAULT == null ? actionProviderClassName != null : !ACTION_PROVIDER_CLASS_NAME_EDEFAULT.equals(actionProviderClassName);
			case GMFGenPackage.GEN_NAVIGATOR__ABSTRACT_NAVIGATOR_ITEM_CLASS_NAME:
				return ABSTRACT_NAVIGATOR_ITEM_CLASS_NAME_EDEFAULT == null ? abstractNavigatorItemClassName != null : !ABSTRACT_NAVIGATOR_ITEM_CLASS_NAME_EDEFAULT.equals(abstractNavigatorItemClassName);
			case GMFGenPackage.GEN_NAVIGATOR__NAVIGATOR_GROUP_CLASS_NAME:
				return NAVIGATOR_GROUP_CLASS_NAME_EDEFAULT == null ? navigatorGroupClassName != null : !NAVIGATOR_GROUP_CLASS_NAME_EDEFAULT.equals(navigatorGroupClassName);
			case GMFGenPackage.GEN_NAVIGATOR__NAVIGATOR_ITEM_CLASS_NAME:
				return NAVIGATOR_ITEM_CLASS_NAME_EDEFAULT == null ? navigatorItemClassName != null : !NAVIGATOR_ITEM_CLASS_NAME_EDEFAULT.equals(navigatorItemClassName);
			case GMFGenPackage.GEN_NAVIGATOR__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
			case GMFGenPackage.GEN_NAVIGATOR__CHILD_REFERENCES:
				return childReferences != null && !childReferences.isEmpty();
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
		result.append(" (generateDomainModelNavigator: ");
		result.append(generateDomainModelNavigator);
		result.append(", domainContentExtensionID: ");
		result.append(domainContentExtensionID);
		result.append(", domainContentExtensionName: ");
		result.append(domainContentExtensionName);
		result.append(", domainContentExtensionPriority: ");
		result.append(domainContentExtensionPriority);
		result.append(", domainContentProviderClassName: ");
		result.append(domainContentProviderClassName);
		result.append(", domainLabelProviderClassName: ");
		result.append(domainLabelProviderClassName);
		result.append(", domainModelElementTesterClassName: ");
		result.append(domainModelElementTesterClassName);
		result.append(", domainNavigatorItemClassName: ");
		result.append(domainNavigatorItemClassName);
		result.append(", contentExtensionID: ");
		result.append(contentExtensionID);
		result.append(", contentExtensionName: ");
		result.append(contentExtensionName);
		result.append(", contentExtensionPriority: ");
		result.append(contentExtensionPriority);
		result.append(", linkHelperExtensionID: ");
		result.append(linkHelperExtensionID);
		result.append(", sorterExtensionID: ");
		result.append(sorterExtensionID);
		result.append(", actionProviderID: ");
		result.append(actionProviderID);
		result.append(", contentProviderClassName: ");
		result.append(contentProviderClassName);
		result.append(", labelProviderClassName: ");
		result.append(labelProviderClassName);
		result.append(", linkHelperClassName: ");
		result.append(linkHelperClassName);
		result.append(", sorterClassName: ");
		result.append(sorterClassName);
		result.append(", actionProviderClassName: ");
		result.append(actionProviderClassName);
		result.append(", abstractNavigatorItemClassName: ");
		result.append(abstractNavigatorItemClassName);
		result.append(", navigatorGroupClassName: ");
		result.append(navigatorGroupClassName);
		result.append(", navigatorItemClassName: ");
		result.append(navigatorItemClassName);
		result.append(", packageName: ");
		result.append(packageName);
		result.append(')');
		return result.toString();
	}

	private String getDomainPackageCapName() {
		return ((GenEditorGeneratorImpl) getEditorGen()).getDomainModelCapName();
	}

	static boolean isEmpty(String s) {
		return s == null || s.trim().length() == 0;
	}
	
} //GenNavigatorImpl
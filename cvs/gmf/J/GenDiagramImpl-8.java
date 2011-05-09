/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.Palette;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getDomainMetaModel <em>Domain Meta Model</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getDomainDiagramElement <em>Domain Diagram Element</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getPalette <em>Palette</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getEditPartsPackageName <em>Edit Parts Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getCommandsPackageName <em>Commands Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getEditProvidersPackageName <em>Edit Providers Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getPluginName <em>Plugin Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getProviderName <em>Provider Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getPluginID <em>Plugin ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getPluginClassName <em>Plugin Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getEditorPackageName <em>Editor Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getProvidersPackageName <em>Providers Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getEditorClassName <em>Editor Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getEditPartFactoryClassName <em>Edit Part Factory Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#isHasDomainModel <em>Has Domain Model</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getDiagramFileExtension <em>Diagram File Extension</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#isSameFileForDiagramAndModel <em>Same File For Diagram And Model</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getInitDiagramFileActionClassName <em>Init Diagram File Action Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenDiagramImpl extends GenCommonBaseImpl implements GenDiagram {
	/**
	 * The cached value of the '{@link #getDomainMetaModel() <em>Domain Meta Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainMetaModel()
	 * @generated
	 * @ordered
	 */
	protected GenPackage domainMetaModel = null;

	/**
	 * The cached value of the '{@link #getDomainDiagramElement() <em>Domain Diagram Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainDiagramElement()
	 * @generated
	 * @ordered
	 */
	protected GenClass domainDiagramElement = null;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList nodes = null;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList links = null;

	/**
	 * The cached value of the '{@link #getPalette() <em>Palette</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPalette()
	 * @generated
	 * @ordered
	 */
	protected Palette palette = null;

	/**
	 * The default value of the '{@link #getEditPartsPackageName() <em>Edit Parts Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditPartsPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String EDIT_PARTS_PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditPartsPackageName() <em>Edit Parts Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditPartsPackageName()
	 * @generated
	 * @ordered
	 */
	protected String editPartsPackageName = EDIT_PARTS_PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommandsPackageName() <em>Commands Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandsPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMANDS_PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommandsPackageName() <em>Commands Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandsPackageName()
	 * @generated
	 * @ordered
	 */
	protected String commandsPackageName = COMMANDS_PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditProvidersPackageName() <em>Edit Providers Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditProvidersPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String EDIT_PROVIDERS_PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditProvidersPackageName() <em>Edit Providers Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditProvidersPackageName()
	 * @generated
	 * @ordered
	 */
	protected String editProvidersPackageName = EDIT_PROVIDERS_PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPluginName() <em>Plugin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginName()
	 * @generated
	 * @ordered
	 */
	protected static final String PLUGIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPluginName() <em>Plugin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginName()
	 * @generated
	 * @ordered
	 */
	protected String pluginName = PLUGIN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProviderName() <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_NAME_EDEFAULT = "Sample Plugin Provider, Inc";

	/**
	 * The cached value of the '{@link #getProviderName() <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderName()
	 * @generated
	 * @ordered
	 */
	protected String providerName = PROVIDER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPluginID() <em>Plugin ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginID()
	 * @generated
	 * @ordered
	 */
	protected static final String PLUGIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPluginID() <em>Plugin ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginID()
	 * @generated
	 * @ordered
	 */
	protected String pluginID = PLUGIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPluginClassName() <em>Plugin Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String PLUGIN_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPluginClassName() <em>Plugin Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginClassName()
	 * @generated
	 * @ordered
	 */
	protected String pluginClassName = PLUGIN_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditorPackageName() <em>Editor Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String EDITOR_PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditorPackageName() <em>Editor Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorPackageName()
	 * @generated
	 * @ordered
	 */
	protected String editorPackageName = EDITOR_PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProvidersPackageName() <em>Providers Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidersPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDERS_PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvidersPackageName() <em>Providers Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidersPackageName()
	 * @generated
	 * @ordered
	 */
	protected String providersPackageName = PROVIDERS_PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditorClassName() <em>Editor Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String EDITOR_CLASS_NAME_EDEFAULT = "DiagramEditor";

	/**
	 * The cached value of the '{@link #getEditorClassName() <em>Editor Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorClassName()
	 * @generated
	 * @ordered
	 */
	protected String editorClassName = EDITOR_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditPartFactoryClassName() <em>Edit Part Factory Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditPartFactoryClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String EDIT_PART_FACTORY_CLASS_NAME_EDEFAULT = "EditPartFactoryImpl";

	/**
	 * The cached value of the '{@link #getEditPartFactoryClassName() <em>Edit Part Factory Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditPartFactoryClassName()
	 * @generated
	 * @ordered
	 */
	protected String editPartFactoryClassName = EDIT_PART_FACTORY_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasDomainModel() <em>Has Domain Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasDomainModel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_DOMAIN_MODEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasDomainModel() <em>Has Domain Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasDomainModel()
	 * @generated
	 * @ordered
	 */
	protected boolean hasDomainModel = HAS_DOMAIN_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiagramFileExtension() <em>Diagram File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramFileExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String DIAGRAM_FILE_EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagramFileExtension() <em>Diagram File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramFileExtension()
	 * @generated
	 * @ordered
	 */
	protected String diagramFileExtension = DIAGRAM_FILE_EXTENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isSameFileForDiagramAndModel() <em>Same File For Diagram And Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSameFileForDiagramAndModel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAME_FILE_FOR_DIAGRAM_AND_MODEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSameFileForDiagramAndModel() <em>Same File For Diagram And Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSameFileForDiagramAndModel()
	 * @generated
	 * @ordered
	 */
	protected boolean sameFileForDiagramAndModel = SAME_FILE_FOR_DIAGRAM_AND_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitDiagramFileActionClassName() <em>Init Diagram File Action Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitDiagramFileActionClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String INIT_DIAGRAM_FILE_ACTION_CLASS_NAME_EDEFAULT = "InitDiagramFileAction";

	/**
	 * The cached value of the '{@link #getInitDiagramFileActionClassName() <em>Init Diagram File Action Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitDiagramFileActionClassName()
	 * @generated
	 * @ordered
	 */
	protected String initDiagramFileActionClassName = INIT_DIAGRAM_FILE_ACTION_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenDiagram();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPackage getDomainMetaModel() {
		if (domainMetaModel != null && domainMetaModel.eIsProxy()) {
			GenPackage oldDomainMetaModel = domainMetaModel;
			domainMetaModel = (GenPackage)eResolveProxy((InternalEObject)domainMetaModel);
			if (domainMetaModel != oldDomainMetaModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.GEN_DIAGRAM__DOMAIN_META_MODEL, oldDomainMetaModel, domainMetaModel));
			}
		}
		return domainMetaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPackage basicGetDomainMetaModel() {
		return domainMetaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainMetaModel(GenPackage newDomainMetaModel) {
		GenPackage oldDomainMetaModel = domainMetaModel;
		domainMetaModel = newDomainMetaModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__DOMAIN_META_MODEL, oldDomainMetaModel, domainMetaModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClass getDomainDiagramElement() {
		if (domainDiagramElement != null && domainDiagramElement.eIsProxy()) {
			GenClass oldDomainDiagramElement = domainDiagramElement;
			domainDiagramElement = (GenClass)eResolveProxy((InternalEObject)domainDiagramElement);
			if (domainDiagramElement != oldDomainDiagramElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.GEN_DIAGRAM__DOMAIN_DIAGRAM_ELEMENT, oldDomainDiagramElement, domainDiagramElement));
			}
		}
		return domainDiagramElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClass basicGetDomainDiagramElement() {
		return domainDiagramElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainDiagramElement(GenClass newDomainDiagramElement) {
		GenClass oldDomainDiagramElement = domainDiagramElement;
		domainDiagramElement = newDomainDiagramElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__DOMAIN_DIAGRAM_ELEMENT, oldDomainDiagramElement, domainDiagramElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentWithInverseEList(GenNode.class, this, GMFGenPackage.GEN_DIAGRAM__NODES, GMFGenPackage.GEN_NODE__DIAGRAM);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLinks() {
		if (links == null) {
			links = new EObjectContainmentWithInverseEList(GenLink.class, this, GMFGenPackage.GEN_DIAGRAM__LINKS, GMFGenPackage.GEN_LINK__DIAGRAM);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Palette getPalette() {
		return palette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPalette(Palette newPalette, NotificationChain msgs) {
		Palette oldPalette = palette;
		palette = newPalette;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__PALETTE, oldPalette, newPalette);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPalette(Palette newPalette) {
		if (newPalette != palette) {
			NotificationChain msgs = null;
			if (palette != null)
				msgs = ((InternalEObject)palette).eInverseRemove(this, GMFGenPackage.PALETTE__DIAGRAM, Palette.class, msgs);
			if (newPalette != null)
				msgs = ((InternalEObject)newPalette).eInverseAdd(this, GMFGenPackage.PALETTE__DIAGRAM, Palette.class, msgs);
			msgs = basicSetPalette(newPalette, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__PALETTE, newPalette, newPalette));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditPartsPackageNameGen() {
		return editPartsPackageName;
	}

	public String getEditPartsPackageName() {
		String value = getEditPartsPackageNameGen();
		if (value == null || value.length() == 0) {
			return getPackageNamePrefix() + ".edit.parts";
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditPartsPackageName(String newEditPartsPackageName) {
		String oldEditPartsPackageName = editPartsPackageName;
		editPartsPackageName = newEditPartsPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__EDIT_PARTS_PACKAGE_NAME, oldEditPartsPackageName, editPartsPackageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommandsPackageNameGen() {
		return commandsPackageName;
	}

	public String getCommandsPackageName() {
		String value = getCommandsPackageNameGen();
		if (value == null || value.length() == 0) {
			return getPackageNamePrefix() + ".edit.commands";
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandsPackageName(String newCommandsPackageName) {
		String oldCommandsPackageName = commandsPackageName;
		commandsPackageName = newCommandsPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__COMMANDS_PACKAGE_NAME, oldCommandsPackageName, commandsPackageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditProvidersPackageNameGen() {
		return editProvidersPackageName;
	}

	public String getEditProvidersPackageName() {
		String value = getEditProvidersPackageNameGen();
		if (value == null || value.length() == 0) {
			return getPackageNamePrefix() + ".providers";
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditProvidersPackageName(String newEditProvidersPackageName) {
		String oldEditProvidersPackageName = editProvidersPackageName;
		editProvidersPackageName = newEditProvidersPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__EDIT_PROVIDERS_PACKAGE_NAME, oldEditProvidersPackageName, editProvidersPackageName));
	}

	public String getClassNamePrefix() {
		String prefix;
		if (getDomainDiagramElement() != null) {
			prefix = getDomainDiagramElement().getName();
		} else {
			char[] v = getDomainMetaModel().getEcorePackage().getName().toCharArray();
			v[0] = Character.toUpperCase(v[0]);
			prefix = new String(v);
		}
		return prefix;
	}

	public String getClassNameSuffux() {
		return "Diagram";
	}

	public GenDiagram getDiagram() {
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPluginName() {
		return pluginName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluginName(String newPluginName) {
		String oldPluginName = pluginName;
		pluginName = newPluginName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__PLUGIN_NAME, oldPluginName, pluginName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProviderName() {
		return providerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderName(String newProviderName) {
		String oldProviderName = providerName;
		providerName = newProviderName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__PROVIDER_NAME, oldProviderName, providerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPluginIDGen() {
		return pluginID;
	}

	public String getPluginID() {
		String value = getPluginIDGen();
		if (value == null || value.length() == 0) {
			return getEMFGenModel().getModelPluginID() + ".gmf.editor";
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluginID(String newPluginID) {
		String oldPluginID = pluginID;
		pluginID = newPluginID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__PLUGIN_ID, oldPluginID, pluginID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPluginClassNameGen() {
		return pluginClassName;
	}

	public String getPluginClassName() {
		String value = getPluginClassNameGen();
		if (value == null || value.length() == 0) {
			return CodeGenUtil.validJavaIdentifier(getEMFGenModel().getModelName()) + "DiagramEditorPlugin";
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluginClassName(String newPluginClassName) {
		String oldPluginClassName = pluginClassName;
		pluginClassName = newPluginClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__PLUGIN_CLASS_NAME, oldPluginClassName, pluginClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditorPackageNameGen() {
		return editorPackageName;
	}

	public String getEditorPackageName() {
		String value = getEditorPackageNameGen();
		if (value == null || value.length() == 0) {
			return getPackageNamePrefix() + ".editor";
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditorPackageName(String newEditorPackageName) {
		String oldEditorPackageName = editorPackageName;
		editorPackageName = newEditorPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__EDITOR_PACKAGE_NAME, oldEditorPackageName, editorPackageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProvidersPackageNameGen() {
		return providersPackageName;
	}

	public String getProvidersPackageName() {
		String value = getProvidersPackageNameGen();
		if (value == null || value.length() == 0) {
			return getPackageNamePrefix() + ".edit.providers";
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidersPackageName(String newProvidersPackageName) {
		String oldProvidersPackageName = providersPackageName;
		providersPackageName = newProvidersPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__PROVIDERS_PACKAGE_NAME, oldProvidersPackageName, providersPackageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditorClassName() {
		return editorClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditorClassName(String newEditorClassName) {
		String oldEditorClassName = editorClassName;
		editorClassName = newEditorClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__EDITOR_CLASS_NAME, oldEditorClassName, editorClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditPartFactoryClassName() {
		return editPartFactoryClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditPartFactoryClassName(String newEditPartFactoryClassName) {
		String oldEditPartFactoryClassName = editPartFactoryClassName;
		editPartFactoryClassName = newEditPartFactoryClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__EDIT_PART_FACTORY_CLASS_NAME, oldEditPartFactoryClassName, editPartFactoryClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasDomainModel() {
		return hasDomainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasDomainModel(boolean newHasDomainModel) {
		boolean oldHasDomainModel = hasDomainModel;
		hasDomainModel = newHasDomainModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__HAS_DOMAIN_MODEL, oldHasDomainModel, hasDomainModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiagramFileExtensionGen() {
		return diagramFileExtension;
	}

	public String getDiagramFileExtension() {
		String value = getDiagramFileExtensionGen();
		if (value == null || value.trim().length() == 0) {
			return getEMFGenModel().getModelName().toLowerCase() + "_diagram";
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramFileExtension(String newDiagramFileExtension) {
		String oldDiagramFileExtension = diagramFileExtension;
		diagramFileExtension = newDiagramFileExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__DIAGRAM_FILE_EXTENSION, oldDiagramFileExtension, diagramFileExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSameFileForDiagramAndModel() {
		return sameFileForDiagramAndModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSameFileForDiagramAndModel(boolean newSameFileForDiagramAndModel) {
		boolean oldSameFileForDiagramAndModel = sameFileForDiagramAndModel;
		sameFileForDiagramAndModel = newSameFileForDiagramAndModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__SAME_FILE_FOR_DIAGRAM_AND_MODEL, oldSameFileForDiagramAndModel, sameFileForDiagramAndModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitDiagramFileActionClassName() {
		return initDiagramFileActionClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitDiagramFileActionClassName(String newInitDiagramFileActionClassName) {
		String oldInitDiagramFileActionClassName = initDiagramFileActionClassName;
		initDiagramFileActionClassName = newInitDiagramFileActionClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME, oldInitDiagramFileActionClassName, initDiagramFileActionClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GenModel getEMFGenModel() {
		return getDomainMetaModel().getGenModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getPluginQualifiedClassName() {
		return getEditorPackageName() + '.' + getPluginClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getEditorQualifiedClassName() {
		return getEditorPackageName() + '.' + getEditorClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getEditPartFactoryQualifiedClassName() {
		return getEditPartsPackageName() + '.' + getEditPartFactoryClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClass findGenClass(EClass domainMetaClass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeature findGenFeature(EStructuralFeature domainMetaFeature) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String[] getRequiredPluginIDs() {
		ArrayList requiredPlugins = new ArrayList();
		if (usesSVGShapes()) {
			requiredPlugins.add("org.eclipse.gmf.diagramrt.gefsvg");
		}
		return (String[]) requiredPlugins.toArray(new String[requiredPlugins.size()]);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getInitDiagramFileActionQualifiedClassName() {
		return getEditorPackageName() + '.' + getInitDiagramFileActionClassName();
	}

	private boolean usesSVGShapes() {
/* couldn't tell now
		for (Iterator it = getNodes().iterator(); it.hasNext();) {
			if (((GenNode) it.next()).getViewmapURI() != null) {
				return true;
			}
		}
*/
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGenPackage.GEN_DIAGRAM__NODES:
					return ((InternalEList)getNodes()).basicAdd(otherEnd, msgs);
				case GMFGenPackage.GEN_DIAGRAM__LINKS:
					return ((InternalEList)getLinks()).basicAdd(otherEnd, msgs);
				case GMFGenPackage.GEN_DIAGRAM__PALETTE:
					if (palette != null)
						msgs = ((InternalEObject)palette).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_DIAGRAM__PALETTE, null, msgs);
					return basicSetPalette((Palette)otherEnd, msgs);
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
				case GMFGenPackage.GEN_DIAGRAM__NODES:
					return ((InternalEList)getNodes()).basicRemove(otherEnd, msgs);
				case GMFGenPackage.GEN_DIAGRAM__LINKS:
					return ((InternalEList)getLinks()).basicRemove(otherEnd, msgs);
				case GMFGenPackage.GEN_DIAGRAM__PALETTE:
					return basicSetPalette(null, msgs);
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
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_RUN_TIME_CLASS:
				if (resolve) return getDiagramRunTimeClass();
				return basicGetDiagramRunTimeClass();
			case GMFGenPackage.GEN_DIAGRAM__VISUAL_ID:
				return new Integer(getVisualID());
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_CLASS_NAME:
				return getEditPartClassName();
			case GMFGenPackage.GEN_DIAGRAM__DOMAIN_META_MODEL:
				if (resolve) return getDomainMetaModel();
				return basicGetDomainMetaModel();
			case GMFGenPackage.GEN_DIAGRAM__DOMAIN_DIAGRAM_ELEMENT:
				if (resolve) return getDomainDiagramElement();
				return basicGetDomainDiagramElement();
			case GMFGenPackage.GEN_DIAGRAM__NODES:
				return getNodes();
			case GMFGenPackage.GEN_DIAGRAM__LINKS:
				return getLinks();
			case GMFGenPackage.GEN_DIAGRAM__PALETTE:
				return getPalette();
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PARTS_PACKAGE_NAME:
				return getEditPartsPackageName();
			case GMFGenPackage.GEN_DIAGRAM__COMMANDS_PACKAGE_NAME:
				return getCommandsPackageName();
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PROVIDERS_PACKAGE_NAME:
				return getEditProvidersPackageName();
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_NAME:
				return getPluginName();
			case GMFGenPackage.GEN_DIAGRAM__PROVIDER_NAME:
				return getProviderName();
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_ID:
				return getPluginID();
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_CLASS_NAME:
				return getPluginClassName();
			case GMFGenPackage.GEN_DIAGRAM__EDITOR_PACKAGE_NAME:
				return getEditorPackageName();
			case GMFGenPackage.GEN_DIAGRAM__PROVIDERS_PACKAGE_NAME:
				return getProvidersPackageName();
			case GMFGenPackage.GEN_DIAGRAM__EDITOR_CLASS_NAME:
				return getEditorClassName();
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_FACTORY_CLASS_NAME:
				return getEditPartFactoryClassName();
			case GMFGenPackage.GEN_DIAGRAM__HAS_DOMAIN_MODEL:
				return isHasDomainModel() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_FILE_EXTENSION:
				return getDiagramFileExtension();
			case GMFGenPackage.GEN_DIAGRAM__SAME_FILE_FOR_DIAGRAM_AND_MODEL:
				return isSameFileForDiagramAndModel() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_DIAGRAM__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME:
				return getInitDiagramFileActionClassName();
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
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_RUN_TIME_CLASS:
				setDiagramRunTimeClass((GenClass)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__VISUAL_ID:
				setVisualID(((Integer)newValue).intValue());
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_CLASS_NAME:
				setEditPartClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__DOMAIN_META_MODEL:
				setDomainMetaModel((GenPackage)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__DOMAIN_DIAGRAM_ELEMENT:
				setDomainDiagramElement((GenClass)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__NODES:
				getNodes().clear();
				getNodes().addAll((Collection)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PALETTE:
				setPalette((Palette)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PARTS_PACKAGE_NAME:
				setEditPartsPackageName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__COMMANDS_PACKAGE_NAME:
				setCommandsPackageName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PROVIDERS_PACKAGE_NAME:
				setEditProvidersPackageName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_NAME:
				setPluginName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PROVIDER_NAME:
				setProviderName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_ID:
				setPluginID((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_CLASS_NAME:
				setPluginClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDITOR_PACKAGE_NAME:
				setEditorPackageName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PROVIDERS_PACKAGE_NAME:
				setProvidersPackageName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDITOR_CLASS_NAME:
				setEditorClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_FACTORY_CLASS_NAME:
				setEditPartFactoryClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__HAS_DOMAIN_MODEL:
				setHasDomainModel(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_FILE_EXTENSION:
				setDiagramFileExtension((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__SAME_FILE_FOR_DIAGRAM_AND_MODEL:
				setSameFileForDiagramAndModel(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_DIAGRAM__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME:
				setInitDiagramFileActionClassName((String)newValue);
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
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_RUN_TIME_CLASS:
				setDiagramRunTimeClass((GenClass)null);
				return;
			case GMFGenPackage.GEN_DIAGRAM__VISUAL_ID:
				setVisualID(VISUAL_ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_CLASS_NAME:
				setEditPartClassName(EDIT_PART_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__DOMAIN_META_MODEL:
				setDomainMetaModel((GenPackage)null);
				return;
			case GMFGenPackage.GEN_DIAGRAM__DOMAIN_DIAGRAM_ELEMENT:
				setDomainDiagramElement((GenClass)null);
				return;
			case GMFGenPackage.GEN_DIAGRAM__NODES:
				getNodes().clear();
				return;
			case GMFGenPackage.GEN_DIAGRAM__LINKS:
				getLinks().clear();
				return;
			case GMFGenPackage.GEN_DIAGRAM__PALETTE:
				setPalette((Palette)null);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PARTS_PACKAGE_NAME:
				setEditPartsPackageName(EDIT_PARTS_PACKAGE_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__COMMANDS_PACKAGE_NAME:
				setCommandsPackageName(COMMANDS_PACKAGE_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PROVIDERS_PACKAGE_NAME:
				setEditProvidersPackageName(EDIT_PROVIDERS_PACKAGE_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_NAME:
				setPluginName(PLUGIN_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PROVIDER_NAME:
				setProviderName(PROVIDER_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_ID:
				setPluginID(PLUGIN_ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_CLASS_NAME:
				setPluginClassName(PLUGIN_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDITOR_PACKAGE_NAME:
				setEditorPackageName(EDITOR_PACKAGE_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PROVIDERS_PACKAGE_NAME:
				setProvidersPackageName(PROVIDERS_PACKAGE_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDITOR_CLASS_NAME:
				setEditorClassName(EDITOR_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_FACTORY_CLASS_NAME:
				setEditPartFactoryClassName(EDIT_PART_FACTORY_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__HAS_DOMAIN_MODEL:
				setHasDomainModel(HAS_DOMAIN_MODEL_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_FILE_EXTENSION:
				setDiagramFileExtension(DIAGRAM_FILE_EXTENSION_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__SAME_FILE_FOR_DIAGRAM_AND_MODEL:
				setSameFileForDiagramAndModel(SAME_FILE_FOR_DIAGRAM_AND_MODEL_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME:
				setInitDiagramFileActionClassName(INIT_DIAGRAM_FILE_ACTION_CLASS_NAME_EDEFAULT);
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
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_RUN_TIME_CLASS:
				return diagramRunTimeClass != null;
			case GMFGenPackage.GEN_DIAGRAM__VISUAL_ID:
				return visualID != VISUAL_ID_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_CLASS_NAME:
				return EDIT_PART_CLASS_NAME_EDEFAULT == null ? editPartClassName != null : !EDIT_PART_CLASS_NAME_EDEFAULT.equals(editPartClassName);
			case GMFGenPackage.GEN_DIAGRAM__DOMAIN_META_MODEL:
				return domainMetaModel != null;
			case GMFGenPackage.GEN_DIAGRAM__DOMAIN_DIAGRAM_ELEMENT:
				return domainDiagramElement != null;
			case GMFGenPackage.GEN_DIAGRAM__NODES:
				return nodes != null && !nodes.isEmpty();
			case GMFGenPackage.GEN_DIAGRAM__LINKS:
				return links != null && !links.isEmpty();
			case GMFGenPackage.GEN_DIAGRAM__PALETTE:
				return palette != null;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PARTS_PACKAGE_NAME:
				return EDIT_PARTS_PACKAGE_NAME_EDEFAULT == null ? editPartsPackageName != null : !EDIT_PARTS_PACKAGE_NAME_EDEFAULT.equals(editPartsPackageName);
			case GMFGenPackage.GEN_DIAGRAM__COMMANDS_PACKAGE_NAME:
				return COMMANDS_PACKAGE_NAME_EDEFAULT == null ? commandsPackageName != null : !COMMANDS_PACKAGE_NAME_EDEFAULT.equals(commandsPackageName);
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PROVIDERS_PACKAGE_NAME:
				return EDIT_PROVIDERS_PACKAGE_NAME_EDEFAULT == null ? editProvidersPackageName != null : !EDIT_PROVIDERS_PACKAGE_NAME_EDEFAULT.equals(editProvidersPackageName);
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_NAME:
				return PLUGIN_NAME_EDEFAULT == null ? pluginName != null : !PLUGIN_NAME_EDEFAULT.equals(pluginName);
			case GMFGenPackage.GEN_DIAGRAM__PROVIDER_NAME:
				return PROVIDER_NAME_EDEFAULT == null ? providerName != null : !PROVIDER_NAME_EDEFAULT.equals(providerName);
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_ID:
				return PLUGIN_ID_EDEFAULT == null ? pluginID != null : !PLUGIN_ID_EDEFAULT.equals(pluginID);
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_CLASS_NAME:
				return PLUGIN_CLASS_NAME_EDEFAULT == null ? pluginClassName != null : !PLUGIN_CLASS_NAME_EDEFAULT.equals(pluginClassName);
			case GMFGenPackage.GEN_DIAGRAM__EDITOR_PACKAGE_NAME:
				return EDITOR_PACKAGE_NAME_EDEFAULT == null ? editorPackageName != null : !EDITOR_PACKAGE_NAME_EDEFAULT.equals(editorPackageName);
			case GMFGenPackage.GEN_DIAGRAM__PROVIDERS_PACKAGE_NAME:
				return PROVIDERS_PACKAGE_NAME_EDEFAULT == null ? providersPackageName != null : !PROVIDERS_PACKAGE_NAME_EDEFAULT.equals(providersPackageName);
			case GMFGenPackage.GEN_DIAGRAM__EDITOR_CLASS_NAME:
				return EDITOR_CLASS_NAME_EDEFAULT == null ? editorClassName != null : !EDITOR_CLASS_NAME_EDEFAULT.equals(editorClassName);
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_FACTORY_CLASS_NAME:
				return EDIT_PART_FACTORY_CLASS_NAME_EDEFAULT == null ? editPartFactoryClassName != null : !EDIT_PART_FACTORY_CLASS_NAME_EDEFAULT.equals(editPartFactoryClassName);
			case GMFGenPackage.GEN_DIAGRAM__HAS_DOMAIN_MODEL:
				return hasDomainModel != HAS_DOMAIN_MODEL_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_FILE_EXTENSION:
				return DIAGRAM_FILE_EXTENSION_EDEFAULT == null ? diagramFileExtension != null : !DIAGRAM_FILE_EXTENSION_EDEFAULT.equals(diagramFileExtension);
			case GMFGenPackage.GEN_DIAGRAM__SAME_FILE_FOR_DIAGRAM_AND_MODEL:
				return sameFileForDiagramAndModel != SAME_FILE_FOR_DIAGRAM_AND_MODEL_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME:
				return INIT_DIAGRAM_FILE_ACTION_CLASS_NAME_EDEFAULT == null ? initDiagramFileActionClassName != null : !INIT_DIAGRAM_FILE_ACTION_CLASS_NAME_EDEFAULT.equals(initDiagramFileActionClassName);
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
		result.append(" (editPartsPackageName: ");
		result.append(editPartsPackageName);
		result.append(", commandsPackageName: ");
		result.append(commandsPackageName);
		result.append(", editProvidersPackageName: ");
		result.append(editProvidersPackageName);
		result.append(", pluginName: ");
		result.append(pluginName);
		result.append(", providerName: ");
		result.append(providerName);
		result.append(", pluginID: ");
		result.append(pluginID);
		result.append(", pluginClassName: ");
		result.append(pluginClassName);
		result.append(", editorPackageName: ");
		result.append(editorPackageName);
		result.append(", providersPackageName: ");
		result.append(providersPackageName);
		result.append(", editorClassName: ");
		result.append(editorClassName);
		result.append(", editPartFactoryClassName: ");
		result.append(editPartFactoryClassName);
		result.append(", hasDomainModel: ");
		result.append(hasDomainModel);
		result.append(", diagramFileExtension: ");
		result.append(diagramFileExtension);
		result.append(", sameFileForDiagramAndModel: ");
		result.append(sameFileForDiagramAndModel);
		result.append(", initDiagramFileActionClassName: ");
		result.append(initDiagramFileActionClassName);
		result.append(')');
		return result.toString();
	}

	private String getPackageNamePrefix() {
		return toLowerCase(getDomainMetaModel().getEcorePackage().getName());
	}

	private static String toLowerCase(String s) {
		if (s == null) {
			return "";
		}
		return s.toLowerCase();
	}
} //GenDiagramImpl

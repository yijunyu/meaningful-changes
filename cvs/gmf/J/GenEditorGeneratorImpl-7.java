/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenAuditContainer;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.gmfgen.GenEditorView;
import org.eclipse.gmf.codegen.gmfgen.GenPlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Editor Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getAudits <em>Audits</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getPlugin <em>Plugin</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getDomainGenModel <em>Domain Gen Model</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getPackageNamePrefix <em>Package Name Prefix</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getModelID <em>Model ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#isSameFileForDiagramAndModel <em>Same File For Diagram And Model</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getDiagramFileExtension <em>Diagram File Extension</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getDomainFileExtension <em>Domain File Extension</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#isDynamicTemplates <em>Dynamic Templates</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getTemplateDirectory <em>Template Directory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenEditorGeneratorImpl extends EObjectImpl implements GenEditorGenerator {
	/**
	 * The cached value of the '{@link #getAudits() <em>Audits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudits()
	 * @generated
	 * @ordered
	 */
	protected GenAuditContainer audits = null;

	/**
	 * The cached value of the '{@link #getDiagram() <em>Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagram()
	 * @generated
	 * @ordered
	 */
	protected GenDiagram diagram = null;

	/**
	 * The cached value of the '{@link #getPlugin() <em>Plugin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugin()
	 * @generated
	 * @ordered
	 */
	protected GenPlugin plugin = null;

	/**
	 * The cached value of the '{@link #getEditor() <em>Editor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditor()
	 * @generated
	 * @ordered
	 */
	protected GenEditorView editor = null;

	/**
	 * The cached value of the '{@link #getDomainGenModel() <em>Domain Gen Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainGenModel()
	 * @generated
	 * @ordered
	 */
	protected GenModel domainGenModel = null;

	/**
	 * The default value of the '{@link #getPackageNamePrefix() <em>Package Name Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageNamePrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageNamePrefix() <em>Package Name Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageNamePrefix()
	 * @generated
	 * @ordered
	 */
	protected String packageNamePrefix = PACKAGE_NAME_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelID() <em>Model ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelID()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelID() <em>Model ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelID()
	 * @generated
	 * @ordered
	 */
	protected String modelID = MODEL_ID_EDEFAULT;

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
	 * The default value of the '{@link #getDomainFileExtension() <em>Domain File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainFileExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_FILE_EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainFileExtension() <em>Domain File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainFileExtension()
	 * @generated
	 * @ordered
	 */
	protected String domainFileExtension = DOMAIN_FILE_EXTENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isDynamicTemplates() <em>Dynamic Templates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDynamicTemplates()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DYNAMIC_TEMPLATES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDynamicTemplates() <em>Dynamic Templates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDynamicTemplates()
	 * @generated
	 * @ordered
	 */
	protected boolean dynamicTemplates = DYNAMIC_TEMPLATES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplateDirectory() <em>Template Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateDirectory() <em>Template Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateDirectory()
	 * @generated
	 * @ordered
	 */
	protected String templateDirectory = TEMPLATE_DIRECTORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenEditorGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenEditorGenerator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenAuditContainer getAudits() {
		return audits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAudits(GenAuditContainer newAudits, NotificationChain msgs) {
		GenAuditContainer oldAudits = audits;
		audits = newAudits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EDITOR_GENERATOR__AUDITS, oldAudits, newAudits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAudits(GenAuditContainer newAudits) {
		if (newAudits != audits) {
			NotificationChain msgs = null;
			if (audits != null)
				msgs = ((InternalEObject)audits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_EDITOR_GENERATOR__AUDITS, null, msgs);
			if (newAudits != null)
				msgs = ((InternalEObject)newAudits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_EDITOR_GENERATOR__AUDITS, null, msgs);
			msgs = basicSetAudits(newAudits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EDITOR_GENERATOR__AUDITS, newAudits, newAudits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDiagram getDiagram() {
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagram(GenDiagram newDiagram, NotificationChain msgs) {
		GenDiagram oldDiagram = diagram;
		diagram = newDiagram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EDITOR_GENERATOR__DIAGRAM, oldDiagram, newDiagram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram(GenDiagram newDiagram) {
		if (newDiagram != diagram) {
			NotificationChain msgs = null;
			if (diagram != null)
				msgs = ((InternalEObject)diagram).eInverseRemove(this, GMFGenPackage.GEN_DIAGRAM__EDITOR_GEN, GenDiagram.class, msgs);
			if (newDiagram != null)
				msgs = ((InternalEObject)newDiagram).eInverseAdd(this, GMFGenPackage.GEN_DIAGRAM__EDITOR_GEN, GenDiagram.class, msgs);
			msgs = basicSetDiagram(newDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EDITOR_GENERATOR__DIAGRAM, newDiagram, newDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPlugin getPlugin() {
		return plugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlugin(GenPlugin newPlugin, NotificationChain msgs) {
		GenPlugin oldPlugin = plugin;
		plugin = newPlugin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EDITOR_GENERATOR__PLUGIN, oldPlugin, newPlugin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlugin(GenPlugin newPlugin) {
		if (newPlugin != plugin) {
			NotificationChain msgs = null;
			if (plugin != null)
				msgs = ((InternalEObject)plugin).eInverseRemove(this, GMFGenPackage.GEN_PLUGIN__EDITOR_GEN, GenPlugin.class, msgs);
			if (newPlugin != null)
				msgs = ((InternalEObject)newPlugin).eInverseAdd(this, GMFGenPackage.GEN_PLUGIN__EDITOR_GEN, GenPlugin.class, msgs);
			msgs = basicSetPlugin(newPlugin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EDITOR_GENERATOR__PLUGIN, newPlugin, newPlugin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenEditorView getEditor() {
		return editor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEditor(GenEditorView newEditor, NotificationChain msgs) {
		GenEditorView oldEditor = editor;
		editor = newEditor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EDITOR_GENERATOR__EDITOR, oldEditor, newEditor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditor(GenEditorView newEditor) {
		if (newEditor != editor) {
			NotificationChain msgs = null;
			if (editor != null)
				msgs = ((InternalEObject)editor).eInverseRemove(this, GMFGenPackage.GEN_EDITOR_VIEW__EDITOR_GEN, GenEditorView.class, msgs);
			if (newEditor != null)
				msgs = ((InternalEObject)newEditor).eInverseAdd(this, GMFGenPackage.GEN_EDITOR_VIEW__EDITOR_GEN, GenEditorView.class, msgs);
			msgs = basicSetEditor(newEditor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EDITOR_GENERATOR__EDITOR, newEditor, newEditor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenModel getDomainGenModel() {
		if (domainGenModel != null && domainGenModel.eIsProxy()) {
			InternalEObject oldDomainGenModel = (InternalEObject)domainGenModel;
			domainGenModel = (GenModel)eResolveProxy(oldDomainGenModel);
			if (domainGenModel != oldDomainGenModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.GEN_EDITOR_GENERATOR__DOMAIN_GEN_MODEL, oldDomainGenModel, domainGenModel));
			}
		}
		return domainGenModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenModel basicGetDomainGenModel() {
		return domainGenModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainGenModel(GenModel newDomainGenModel) {
		GenModel oldDomainGenModel = domainGenModel;
		domainGenModel = newDomainGenModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EDITOR_GENERATOR__DOMAIN_GEN_MODEL, oldDomainGenModel, domainGenModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageNamePrefixGen() {
		return packageNamePrefix;
	}

	public String getPackageNamePrefix() {
		// @see org.eclipse.emf.codegen.ecore.genmodel.impl.GenPackageImpl#getQualifiedPackageName()
		String value = getPackageNamePrefixGen();
		if (value == null || value.trim().length() == 0) {
			if (getPrimaryGenPackage() == null) {
				return "";
			}
			return getPrimaryGenPackage().getQualifiedPackageName() + ".diagram";
		}
		return value;
	}

	/**
	 * Assume first genPackage in the domainGenModel to be primary
	 */
	private GenPackage getPrimaryGenPackage() {
		if (getDomainGenModel() == null || getDomainGenModel().getGenPackages().isEmpty()) {
			return null;
		}
		return (GenPackage) getDomainGenModel().getGenPackages().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageNamePrefix(String newPackageNamePrefix) {
		String oldPackageNamePrefix = packageNamePrefix;
		packageNamePrefix = newPackageNamePrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EDITOR_GENERATOR__PACKAGE_NAME_PREFIX, oldPackageNamePrefix, packageNamePrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelIDGen() {
		return modelID;
	}

	public String getModelID() {
		String value = getModelIDGen();
		if (value == null || value.trim().length() == 0) {
			return getDomainGenModel().getModelName();
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelID(String newModelID) {
		String oldModelID = modelID;
		modelID = newModelID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EDITOR_GENERATOR__MODEL_ID, oldModelID, modelID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EDITOR_GENERATOR__SAME_FILE_FOR_DIAGRAM_AND_MODEL, oldSameFileForDiagramAndModel, sameFileForDiagramAndModel));
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
		if (value == null || value.length() == 0) {
			return getDomainFileExtension() + "_diagram";
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EDITOR_GENERATOR__DIAGRAM_FILE_EXTENSION, oldDiagramFileExtension, diagramFileExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainFileExtensionGen() {
		return domainFileExtension;
	}

	public String getDomainFileExtension() {
		String value = getDiagramFileExtensionGen();
		if (value == null || value.trim().length() == 0) {
			if (getPrimaryGenPackage() == null) {
				return "";
			}
			return getPrimaryGenPackage().getPrefix().toLowerCase();
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainFileExtension(String newDomainFileExtension) {
		String oldDomainFileExtension = domainFileExtension;
		domainFileExtension = newDomainFileExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EDITOR_GENERATOR__DOMAIN_FILE_EXTENSION, oldDomainFileExtension, domainFileExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDynamicTemplates() {
		return dynamicTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicTemplates(boolean newDynamicTemplates) {
		boolean oldDynamicTemplates = dynamicTemplates;
		dynamicTemplates = newDynamicTemplates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EDITOR_GENERATOR__DYNAMIC_TEMPLATES, oldDynamicTemplates, dynamicTemplates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplateDirectory() {
		return templateDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateDirectory(String newTemplateDirectory) {
		String oldTemplateDirectory = templateDirectory;
		templateDirectory = newTemplateDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EDITOR_GENERATOR__TEMPLATE_DIRECTORY, oldTemplateDirectory, templateDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_EDITOR_GENERATOR__DIAGRAM:
				if (diagram != null)
					msgs = ((InternalEObject)diagram).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_EDITOR_GENERATOR__DIAGRAM, null, msgs);
				return basicSetDiagram((GenDiagram)otherEnd, msgs);
			case GMFGenPackage.GEN_EDITOR_GENERATOR__PLUGIN:
				if (plugin != null)
					msgs = ((InternalEObject)plugin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_EDITOR_GENERATOR__PLUGIN, null, msgs);
				return basicSetPlugin((GenPlugin)otherEnd, msgs);
			case GMFGenPackage.GEN_EDITOR_GENERATOR__EDITOR:
				if (editor != null)
					msgs = ((InternalEObject)editor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_EDITOR_GENERATOR__EDITOR, null, msgs);
				return basicSetEditor((GenEditorView)otherEnd, msgs);
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
			case GMFGenPackage.GEN_EDITOR_GENERATOR__AUDITS:
				return basicSetAudits(null, msgs);
			case GMFGenPackage.GEN_EDITOR_GENERATOR__DIAGRAM:
				return basicSetDiagram(null, msgs);
			case GMFGenPackage.GEN_EDITOR_GENERATOR__PLUGIN:
				return basicSetPlugin(null, msgs);
			case GMFGenPackage.GEN_EDITOR_GENERATOR__EDITOR:
				return basicSetEditor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.GEN_EDITOR_GENERATOR__AUDITS:
				return getAudits();
			case GMFGenPackage.GEN_EDITOR_GENERATOR__DIAGRAM:
				return getDiagram();
			case GMFGenPackage.GEN_EDITOR_GENERATOR__PLUGIN:
				return getPlugin();
			case GMFGenPackage.GEN_EDITOR_GENERATOR__EDITOR:
				return getEditor();
			case GMFGenPackage.GEN_EDITOR_GENERATOR__DOMAIN_GEN_MODEL:
				if (resolve) return getDomainGenModel();
				return basicGetDomainGenModel();
			case GMFGenPackage.GEN_EDITOR_GENERATOR__PACKAGE_NAME_PREFIX:
				return getPackageNamePrefix();
			case GMFGenPackage.GEN_EDITOR_GENERATOR__MODEL_ID:
				return getModelID();
			case GMFGenPackage.GEN_EDITOR_GENERATOR__SAME_FILE_FOR_DIAGRAM_AND_MODEL:
				return isSameFileForDiagramAndModel() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__DIAGRAM_FILE_EXTENSION:
				return getDiagramFileExtension();
			case GMFGenPackage.GEN_EDITOR_GENERATOR__DOMAIN_FILE_EXTENSION:
				return getDomainFileExtension();
			case GMFGenPackage.GEN_EDITOR_GENERATOR__DYNAMIC_TEMPLATES:
				return isDynamicTemplates() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__TEMPLATE_DIRECTORY:
				return getTemplateDirectory();
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
			case GMFGenPackage.GEN_EDITOR_GENERATOR__AUDITS:
				setAudits((GenAuditContainer)newValue);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__DIAGRAM:
				setDiagram((GenDiagram)newValue);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__PLUGIN:
				setPlugin((GenPlugin)newValue);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__EDITOR:
				setEditor((GenEditorView)newValue);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__DOMAIN_GEN_MODEL:
				setDomainGenModel((GenModel)newValue);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__PACKAGE_NAME_PREFIX:
				setPackageNamePrefix((String)newValue);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__MODEL_ID:
				setModelID((String)newValue);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__SAME_FILE_FOR_DIAGRAM_AND_MODEL:
				setSameFileForDiagramAndModel(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__DIAGRAM_FILE_EXTENSION:
				setDiagramFileExtension((String)newValue);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__DOMAIN_FILE_EXTENSION:
				setDomainFileExtension((String)newValue);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__DYNAMIC_TEMPLATES:
				setDynamicTemplates(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__TEMPLATE_DIRECTORY:
				setTemplateDirectory((String)newValue);
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
			case GMFGenPackage.GEN_EDITOR_GENERATOR__AUDITS:
				setAudits((GenAuditContainer)null);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__DIAGRAM:
				setDiagram((GenDiagram)null);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__PLUGIN:
				setPlugin((GenPlugin)null);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__EDITOR:
				setEditor((GenEditorView)null);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__DOMAIN_GEN_MODEL:
				setDomainGenModel((GenModel)null);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__PACKAGE_NAME_PREFIX:
				setPackageNamePrefix(PACKAGE_NAME_PREFIX_EDEFAULT);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__MODEL_ID:
				setModelID(MODEL_ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__SAME_FILE_FOR_DIAGRAM_AND_MODEL:
				setSameFileForDiagramAndModel(SAME_FILE_FOR_DIAGRAM_AND_MODEL_EDEFAULT);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__DIAGRAM_FILE_EXTENSION:
				setDiagramFileExtension(DIAGRAM_FILE_EXTENSION_EDEFAULT);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__DOMAIN_FILE_EXTENSION:
				setDomainFileExtension(DOMAIN_FILE_EXTENSION_EDEFAULT);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__DYNAMIC_TEMPLATES:
				setDynamicTemplates(DYNAMIC_TEMPLATES_EDEFAULT);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__TEMPLATE_DIRECTORY:
				setTemplateDirectory(TEMPLATE_DIRECTORY_EDEFAULT);
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
			case GMFGenPackage.GEN_EDITOR_GENERATOR__AUDITS:
				return audits != null;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__DIAGRAM:
				return diagram != null;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__PLUGIN:
				return plugin != null;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__EDITOR:
				return editor != null;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__DOMAIN_GEN_MODEL:
				return domainGenModel != null;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__PACKAGE_NAME_PREFIX:
				return PACKAGE_NAME_PREFIX_EDEFAULT == null ? packageNamePrefix != null : !PACKAGE_NAME_PREFIX_EDEFAULT.equals(packageNamePrefix);
			case GMFGenPackage.GEN_EDITOR_GENERATOR__MODEL_ID:
				return MODEL_ID_EDEFAULT == null ? modelID != null : !MODEL_ID_EDEFAULT.equals(modelID);
			case GMFGenPackage.GEN_EDITOR_GENERATOR__SAME_FILE_FOR_DIAGRAM_AND_MODEL:
				return sameFileForDiagramAndModel != SAME_FILE_FOR_DIAGRAM_AND_MODEL_EDEFAULT;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__DIAGRAM_FILE_EXTENSION:
				return DIAGRAM_FILE_EXTENSION_EDEFAULT == null ? diagramFileExtension != null : !DIAGRAM_FILE_EXTENSION_EDEFAULT.equals(diagramFileExtension);
			case GMFGenPackage.GEN_EDITOR_GENERATOR__DOMAIN_FILE_EXTENSION:
				return DOMAIN_FILE_EXTENSION_EDEFAULT == null ? domainFileExtension != null : !DOMAIN_FILE_EXTENSION_EDEFAULT.equals(domainFileExtension);
			case GMFGenPackage.GEN_EDITOR_GENERATOR__DYNAMIC_TEMPLATES:
				return dynamicTemplates != DYNAMIC_TEMPLATES_EDEFAULT;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__TEMPLATE_DIRECTORY:
				return TEMPLATE_DIRECTORY_EDEFAULT == null ? templateDirectory != null : !TEMPLATE_DIRECTORY_EDEFAULT.equals(templateDirectory);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (packageNamePrefix: ");
		result.append(packageNamePrefix);
		result.append(", modelID: ");
		result.append(modelID);
		result.append(", sameFileForDiagramAndModel: ");
		result.append(sameFileForDiagramAndModel);
		result.append(", diagramFileExtension: ");
		result.append(diagramFileExtension);
		result.append(", domainFileExtension: ");
		result.append(domainFileExtension);
		result.append(", dynamicTemplates: ");
		result.append(dynamicTemplates);
		result.append(", templateDirectory: ");
		result.append(templateDirectory);
		result.append(')');
		return result.toString();
	}

	String getDomainModelCapName() {
		String name = CodeGenUtil.validJavaIdentifier(getDomainGenModel().getModelName());
		if (name.length() < 2) {
			return name.toUpperCase();
		}
		return Character.toUpperCase(name.charAt(0)) + name.substring(1);
	}
} //GenEditorGeneratorImpl
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenApplication;
import org.eclipse.gmf.codegen.gmfgen.GenAuditRoot;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.gmfgen.GenEditorView;
import org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer;
import org.eclipse.gmf.codegen.gmfgen.GenMetricContainer;
import org.eclipse.gmf.codegen.gmfgen.GenNavigator;
import org.eclipse.gmf.codegen.gmfgen.GenPlugin;

import org.eclipse.gmf.codegen.gmfgen.GenPropertySheet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Editor Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getAudits <em>Audits</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getPlugin <em>Plugin</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getNavigator <em>Navigator</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getPropertySheet <em>Property Sheet</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getDomainGenModel <em>Domain Gen Model</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getPackageNamePrefix <em>Package Name Prefix</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getModelID <em>Model ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#isSameFileForDiagramAndModel <em>Same File For Diagram And Model</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getDiagramFileExtension <em>Diagram File Extension</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getDomainFileExtension <em>Domain File Extension</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#isDynamicTemplates <em>Dynamic Templates</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getTemplateDirectory <em>Template Directory</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getCopyrightText <em>Copyright Text</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getExpressionProviders <em>Expression Providers</em>}</li>
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
	protected GenAuditRoot audits = null;

	/**
	 * The cached value of the '{@link #getMetrics() <em>Metrics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrics()
	 * @generated
	 * @ordered
	 */
	protected GenMetricContainer metrics = null;

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
	 * The cached value of the '{@link #getNavigator() <em>Navigator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigator()
	 * @generated
	 * @ordered
	 */
	protected GenNavigator navigator = null;

	/**
	 * The cached value of the '{@link #getPropertySheet() <em>Property Sheet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertySheet()
	 * @generated
	 * @ordered
	 */
	protected GenPropertySheet propertySheet = null;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected GenApplication application = null;

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
	 * The default value of the '{@link #getCopyrightText() <em>Copyright Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyrightText()
	 * @generated
	 * @ordered
	 */
	protected static final String COPYRIGHT_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyrightText() <em>Copyright Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyrightText()
	 * @generated
	 * @ordered
	 */
	protected String copyrightText = COPYRIGHT_TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpressionProviders() <em>Expression Providers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionProviders()
	 * @generated
	 * @ordered
	 */
	protected GenExpressionProviderContainer expressionProviders = null;

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
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenEditorGenerator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenAuditRoot getAudits() {
		return audits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAudits(GenAuditRoot newAudits, NotificationChain msgs) {
		GenAuditRoot oldAudits = audits;
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
	public void setAudits(GenAuditRoot newAudits) {
		if (newAudits != audits) {
			NotificationChain msgs = null;
			if (audits != null)
				msgs = ((InternalEObject)audits).eInverseRemove(this, GMFGenPackage.GEN_AUDIT_ROOT__EDITOR_GEN, GenAuditRoot.class, msgs);
			if (newAudits != null)
				msgs = ((InternalEObject)newAudits).eInverseAdd(this, GMFGenPackage.GEN_AUDIT_ROOT__EDITOR_GEN, GenAuditRoot.class, msgs);
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
	public GenMetricContainer getMetrics() {
		return metrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetrics(GenMetricContainer newMetrics, NotificationChain msgs) {
		GenMetricContainer oldMetrics = metrics;
		metrics = newMetrics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EDITOR_GENERATOR__METRICS, oldMetrics, newMetrics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetrics(GenMetricContainer newMetrics) {
		if (newMetrics != metrics) {
			NotificationChain msgs = null;
			if (metrics != null)
				msgs = ((InternalEObject)metrics).eInverseRemove(this, GMFGenPackage.GEN_METRIC_CONTAINER__EDITOR_GEN, GenMetricContainer.class, msgs);
			if (newMetrics != null)
				msgs = ((InternalEObject)newMetrics).eInverseAdd(this, GMFGenPackage.GEN_METRIC_CONTAINER__EDITOR_GEN, GenMetricContainer.class, msgs);
			msgs = basicSetMetrics(newMetrics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EDITOR_GENERATOR__METRICS, newMetrics, newMetrics));
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
	public GenNavigator getNavigator() {
		return navigator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNavigator(GenNavigator newNavigator, NotificationChain msgs) {
		GenNavigator oldNavigator = navigator;
		navigator = newNavigator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EDITOR_GENERATOR__NAVIGATOR, oldNavigator, newNavigator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigator(GenNavigator newNavigator) {
		if (newNavigator != navigator) {
			NotificationChain msgs = null;
			if (navigator != null)
				msgs = ((InternalEObject)navigator).eInverseRemove(this, GMFGenPackage.GEN_NAVIGATOR__EDITOR_GEN, GenNavigator.class, msgs);
			if (newNavigator != null)
				msgs = ((InternalEObject)newNavigator).eInverseAdd(this, GMFGenPackage.GEN_NAVIGATOR__EDITOR_GEN, GenNavigator.class, msgs);
			msgs = basicSetNavigator(newNavigator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EDITOR_GENERATOR__NAVIGATOR, newNavigator, newNavigator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPropertySheet getPropertySheet() {
		return propertySheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertySheet(GenPropertySheet newPropertySheet, NotificationChain msgs) {
		GenPropertySheet oldPropertySheet = propertySheet;
		propertySheet = newPropertySheet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EDITOR_GENERATOR__PROPERTY_SHEET, oldPropertySheet, newPropertySheet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertySheet(GenPropertySheet newPropertySheet) {
		if (newPropertySheet != propertySheet) {
			NotificationChain msgs = null;
			if (propertySheet != null)
				msgs = ((InternalEObject)propertySheet).eInverseRemove(this, GMFGenPackage.GEN_PROPERTY_SHEET__EDITOR_GEN, GenPropertySheet.class, msgs);
			if (newPropertySheet != null)
				msgs = ((InternalEObject)newPropertySheet).eInverseAdd(this, GMFGenPackage.GEN_PROPERTY_SHEET__EDITOR_GEN, GenPropertySheet.class, msgs);
			msgs = basicSetPropertySheet(newPropertySheet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EDITOR_GENERATOR__PROPERTY_SHEET, newPropertySheet, newPropertySheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenApplication getApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplication(GenApplication newApplication, NotificationChain msgs) {
		GenApplication oldApplication = application;
		application = newApplication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EDITOR_GENERATOR__APPLICATION, oldApplication, newApplication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(GenApplication newApplication) {
		if (newApplication != application) {
			NotificationChain msgs = null;
			if (application != null)
				msgs = ((InternalEObject)application).eInverseRemove(this, GMFGenPackage.GEN_APPLICATION__EDITOR_GEN, GenApplication.class, msgs);
			if (newApplication != null)
				msgs = ((InternalEObject)newApplication).eInverseAdd(this, GMFGenPackage.GEN_APPLICATION__EDITOR_GEN, GenApplication.class, msgs);
			msgs = basicSetApplication(newApplication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EDITOR_GENERATOR__APPLICATION, newApplication, newApplication));
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
		if (GenCommonBaseImpl.isEmpty(value)) {
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
		return getDomainGenModel().getGenPackages().get(0);
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

	/**
	 * @generated NOT
	 */
	public String getModelID() {
		String value = getModelIDGen();
		if (GenCommonBaseImpl.isEmpty(value)) {
			value = getDomainGenModel() == null ? "Design" : getDomainGenModel().getModelName();
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
		if (GenCommonBaseImpl.isEmpty(value)) {
			String prefix = getDomainFileExtension();
			if (GenCommonBaseImpl.isEmpty(prefix)) {
				prefix = "design";
			}
			return prefix + "_diagram";
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
		String value = getDomainFileExtensionGen();
		if (GenCommonBaseImpl.isEmpty(value)) {
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
	public String getCopyrightText() {
		return copyrightText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyrightText(String newCopyrightText) {
		String oldCopyrightText = copyrightText;
		copyrightText = newCopyrightText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EDITOR_GENERATOR__COPYRIGHT_TEXT, oldCopyrightText, copyrightText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenExpressionProviderContainer getExpressionProviders() {
		return expressionProviders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressionProviders(GenExpressionProviderContainer newExpressionProviders, NotificationChain msgs) {
		GenExpressionProviderContainer oldExpressionProviders = expressionProviders;
		expressionProviders = newExpressionProviders;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EDITOR_GENERATOR__EXPRESSION_PROVIDERS, oldExpressionProviders, newExpressionProviders);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionProviders(GenExpressionProviderContainer newExpressionProviders) {
		if (newExpressionProviders != expressionProviders) {
			NotificationChain msgs = null;
			if (expressionProviders != null)
				msgs = ((InternalEObject)expressionProviders).eInverseRemove(this, GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__EDITOR_GEN, GenExpressionProviderContainer.class, msgs);
			if (newExpressionProviders != null)
				msgs = ((InternalEObject)newExpressionProviders).eInverseAdd(this, GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER__EDITOR_GEN, GenExpressionProviderContainer.class, msgs);
			msgs = basicSetExpressionProviders(newExpressionProviders, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_EDITOR_GENERATOR__EXPRESSION_PROVIDERS, newExpressionProviders, newExpressionProviders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<GenPackage> getAllDomainGenPackages(boolean withUsed) {
		ArrayList<GenPackage> result = new ArrayList<GenPackage>();
		GenModel genModel = getDomainGenModel();
		if (genModel != null) {
			List<GenPackage> genPackages = genModel.getAllGenPackagesWithClassifiers();
			for (int i = 0; i < genPackages.size(); i++) {
				GenPackage genPackage = genPackages.get(i);
				if (genPackage.getGenModel().hasEditSupport()) {
					result.add(genPackage);
				}
			}
			if (withUsed) {
				genPackages = genModel.getAllUsedGenPackagesWithClassifiers();
				for (int i = 0; i < genPackages.size(); i++) {
					GenPackage genPackage = genPackages.get(i);
					if (genPackage.getGenModel().hasEditSupport()) {
						result.add(genPackage);
					}
				}
			}
		}
	    return new BasicEList.UnmodifiableEList<GenPackage>(result.size(), result.toArray());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */	
	public boolean hasAudits() {
		return getAudits() != null && !getAudits().getRules().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_EDITOR_GENERATOR__AUDITS:
				if (audits != null)
					msgs = ((InternalEObject)audits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_EDITOR_GENERATOR__AUDITS, null, msgs);
				return basicSetAudits((GenAuditRoot)otherEnd, msgs);
			case GMFGenPackage.GEN_EDITOR_GENERATOR__METRICS:
				if (metrics != null)
					msgs = ((InternalEObject)metrics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_EDITOR_GENERATOR__METRICS, null, msgs);
				return basicSetMetrics((GenMetricContainer)otherEnd, msgs);
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
			case GMFGenPackage.GEN_EDITOR_GENERATOR__NAVIGATOR:
				if (navigator != null)
					msgs = ((InternalEObject)navigator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_EDITOR_GENERATOR__NAVIGATOR, null, msgs);
				return basicSetNavigator((GenNavigator)otherEnd, msgs);
			case GMFGenPackage.GEN_EDITOR_GENERATOR__PROPERTY_SHEET:
				if (propertySheet != null)
					msgs = ((InternalEObject)propertySheet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_EDITOR_GENERATOR__PROPERTY_SHEET, null, msgs);
				return basicSetPropertySheet((GenPropertySheet)otherEnd, msgs);
			case GMFGenPackage.GEN_EDITOR_GENERATOR__APPLICATION:
				if (application != null)
					msgs = ((InternalEObject)application).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_EDITOR_GENERATOR__APPLICATION, null, msgs);
				return basicSetApplication((GenApplication)otherEnd, msgs);
			case GMFGenPackage.GEN_EDITOR_GENERATOR__EXPRESSION_PROVIDERS:
				if (expressionProviders != null)
					msgs = ((InternalEObject)expressionProviders).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_EDITOR_GENERATOR__EXPRESSION_PROVIDERS, null, msgs);
				return basicSetExpressionProviders((GenExpressionProviderContainer)otherEnd, msgs);
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
			case GMFGenPackage.GEN_EDITOR_GENERATOR__AUDITS:
				return basicSetAudits(null, msgs);
			case GMFGenPackage.GEN_EDITOR_GENERATOR__METRICS:
				return basicSetMetrics(null, msgs);
			case GMFGenPackage.GEN_EDITOR_GENERATOR__DIAGRAM:
				return basicSetDiagram(null, msgs);
			case GMFGenPackage.GEN_EDITOR_GENERATOR__PLUGIN:
				return basicSetPlugin(null, msgs);
			case GMFGenPackage.GEN_EDITOR_GENERATOR__EDITOR:
				return basicSetEditor(null, msgs);
			case GMFGenPackage.GEN_EDITOR_GENERATOR__NAVIGATOR:
				return basicSetNavigator(null, msgs);
			case GMFGenPackage.GEN_EDITOR_GENERATOR__PROPERTY_SHEET:
				return basicSetPropertySheet(null, msgs);
			case GMFGenPackage.GEN_EDITOR_GENERATOR__APPLICATION:
				return basicSetApplication(null, msgs);
			case GMFGenPackage.GEN_EDITOR_GENERATOR__EXPRESSION_PROVIDERS:
				return basicSetExpressionProviders(null, msgs);
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
			case GMFGenPackage.GEN_EDITOR_GENERATOR__AUDITS:
				return getAudits();
			case GMFGenPackage.GEN_EDITOR_GENERATOR__METRICS:
				return getMetrics();
			case GMFGenPackage.GEN_EDITOR_GENERATOR__DIAGRAM:
				return getDiagram();
			case GMFGenPackage.GEN_EDITOR_GENERATOR__PLUGIN:
				return getPlugin();
			case GMFGenPackage.GEN_EDITOR_GENERATOR__EDITOR:
				return getEditor();
			case GMFGenPackage.GEN_EDITOR_GENERATOR__NAVIGATOR:
				return getNavigator();
			case GMFGenPackage.GEN_EDITOR_GENERATOR__PROPERTY_SHEET:
				return getPropertySheet();
			case GMFGenPackage.GEN_EDITOR_GENERATOR__APPLICATION:
				return getApplication();
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
			case GMFGenPackage.GEN_EDITOR_GENERATOR__COPYRIGHT_TEXT:
				return getCopyrightText();
			case GMFGenPackage.GEN_EDITOR_GENERATOR__EXPRESSION_PROVIDERS:
				return getExpressionProviders();
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
			case GMFGenPackage.GEN_EDITOR_GENERATOR__AUDITS:
				setAudits((GenAuditRoot)newValue);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__METRICS:
				setMetrics((GenMetricContainer)newValue);
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
			case GMFGenPackage.GEN_EDITOR_GENERATOR__NAVIGATOR:
				setNavigator((GenNavigator)newValue);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__PROPERTY_SHEET:
				setPropertySheet((GenPropertySheet)newValue);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__APPLICATION:
				setApplication((GenApplication)newValue);
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
			case GMFGenPackage.GEN_EDITOR_GENERATOR__COPYRIGHT_TEXT:
				setCopyrightText((String)newValue);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__EXPRESSION_PROVIDERS:
				setExpressionProviders((GenExpressionProviderContainer)newValue);
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
			case GMFGenPackage.GEN_EDITOR_GENERATOR__AUDITS:
				setAudits((GenAuditRoot)null);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__METRICS:
				setMetrics((GenMetricContainer)null);
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
			case GMFGenPackage.GEN_EDITOR_GENERATOR__NAVIGATOR:
				setNavigator((GenNavigator)null);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__PROPERTY_SHEET:
				setPropertySheet((GenPropertySheet)null);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__APPLICATION:
				setApplication((GenApplication)null);
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
			case GMFGenPackage.GEN_EDITOR_GENERATOR__COPYRIGHT_TEXT:
				setCopyrightText(COPYRIGHT_TEXT_EDEFAULT);
				return;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__EXPRESSION_PROVIDERS:
				setExpressionProviders((GenExpressionProviderContainer)null);
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
			case GMFGenPackage.GEN_EDITOR_GENERATOR__AUDITS:
				return audits != null;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__METRICS:
				return metrics != null;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__DIAGRAM:
				return diagram != null;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__PLUGIN:
				return plugin != null;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__EDITOR:
				return editor != null;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__NAVIGATOR:
				return navigator != null;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__PROPERTY_SHEET:
				return propertySheet != null;
			case GMFGenPackage.GEN_EDITOR_GENERATOR__APPLICATION:
				return application != null;
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
			case GMFGenPackage.GEN_EDITOR_GENERATOR__COPYRIGHT_TEXT:
				return COPYRIGHT_TEXT_EDEFAULT == null ? copyrightText != null : !COPYRIGHT_TEXT_EDEFAULT.equals(copyrightText);
			case GMFGenPackage.GEN_EDITOR_GENERATOR__EXPRESSION_PROVIDERS:
				return expressionProviders != null;
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
		result.append(", copyrightText: ");
		result.append(copyrightText);
		result.append(')');
		return result.toString();
	}

	String getDomainModelCapName() {
		String name = "Design";
		if (getDomainGenModel() != null) {
			name = CodeGenUtil.validJavaIdentifier(getDomainGenModel().getModelName());
		}
		if (name.length() < 2) {
			return name.toUpperCase();
		}
		return Character.toUpperCase(name.charAt(0)) + name.substring(1);
	}
} //GenEditorGeneratorImpl

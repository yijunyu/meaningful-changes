/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderBase;
import org.eclipse.gmf.codegen.gmfgen.GenLanguage;
import org.eclipse.gmf.codegen.gmfgen.GenPlugin;
import org.eclipse.gmf.codegen.gmfgen.Viewmap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Plugin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPluginImpl#getEditorGen <em>Editor Gen</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPluginImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPluginImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPluginImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPluginImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPluginImpl#isPrintingEnabled <em>Printing Enabled</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPluginImpl#getRequiredPlugins <em>Required Plugins</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPluginImpl#getActivatorClassName <em>Activator Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenPluginImpl extends EObjectImpl implements GenPlugin {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String iD = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_EDEFAULT = "Sample Plugin Provider, Inc";

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected String provider = PROVIDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "1.0.0.qualifier";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrintingEnabled() <em>Printing Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrintingEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRINTING_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrintingEnabled() <em>Printing Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrintingEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean printingEnabled = PRINTING_ENABLED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredPlugins() <em>Required Plugins</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPlugins()
	 * @generated
	 * @ordered
	 */
	protected EList<String> requiredPlugins;

	/**
	 * The default value of the '{@link #getActivatorClassName() <em>Activator Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivatorClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVATOR_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivatorClassName() <em>Activator Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivatorClassName()
	 * @generated
	 * @ordered
	 */
	protected String activatorClassName = ACTIVATOR_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenPluginImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenPlugin();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenEditorGenerator getEditorGen() {
		if (eContainerFeatureID != GMFGenPackage.GEN_PLUGIN__EDITOR_GEN) return null;
		return (GenEditorGenerator)eContainer();
	}

	public String getID() {
		String value = getIDGen();
		if (GenCommonBaseImpl.isEmpty(value)) {
			String prefix = "design"; //$NON-NLS-1$
			if (getEditorGen().getDomainGenModel() != null) {
				prefix = getEditorGen().getDomainGenModel().getModelPluginID();
			}
			if (prefix == null) {
				prefix = ""; //$NON-NLS-1$
			} else if (prefix.endsWith(".model")) { //$NON-NLS-1$
				prefix = prefix.substring(0, prefix.length() - ".model".length()); //$NON-NLS-1$
			}
			return prefix + ".diagram"; //$NON-NLS-1$
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIDGen() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_PLUGIN__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameGen() {
		return name;
	}

	/**
	 * @generated NOT
	 */
	public String getName() {
		String result = getNameGen();
		if (GenCommonBaseImpl.isEmpty(result)){
			GenEditorGenerator generator = getEditorGen();
			if (generator != null){
				String prefix = "Diagram Editor";
				GenModel genModel = generator.getDomainGenModel();
				if (genModel != null){
					prefix = genModel.getModelName();
				}
				result = prefix + " Plugin";
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_PLUGIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(String newProvider) {
		String oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_PLUGIN__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_PLUGIN__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrintingEnabled() {
		return printingEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrintingEnabled(boolean newPrintingEnabled) {
		boolean oldPrintingEnabled = printingEnabled;
		printingEnabled = newPrintingEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_PLUGIN__PRINTING_ENABLED, oldPrintingEnabled, printingEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRequiredPlugins() {
		if (requiredPlugins == null) {
			requiredPlugins = new EDataTypeUniqueEList<String>(String.class, this, GMFGenPackage.GEN_PLUGIN__REQUIRED_PLUGINS);
		}
		return requiredPlugins;
	}

	public String getActivatorClassName() {
		String value = getActivatorClassNameGen();
		if (GenCommonBaseImpl.isEmpty(value)) {
			// FIXME is it really required to have domainPackageCapName there?
			value = ((GenDiagramImpl) getDiagram()).getDomainPackageCapName() + "DiagramEditorPlugin";
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivatorClassNameGen() {
		return activatorClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivatorClassName(String newActivatorClassName) {
		String oldActivatorClassName = activatorClassName;
		activatorClassName = newActivatorClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_PLUGIN__ACTIVATOR_CLASS_NAME, oldActivatorClassName, activatorClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getAllRequiredPlugins() {
		Collection<String> rv = new LinkedHashSet<String>(getRequiredPlugins());
		if (getEditorGen() != null) {
			final GenModel genModel = getEditorGen().getDomainGenModel();
			if (genModel != null) {
				rv.add(genModel.getModelPluginID());
				rv.add(genModel.getEditPluginID());
				for (Iterator<GenPackage> it = genModel.getAllUsedGenPackagesWithClassifiers().iterator(); it.hasNext();) {
					GenModel nextGenModel = it.next().getGenModel();
					if (nextGenModel.hasEditSupport()) {
						rv.add(nextGenModel.getModelPluginID());
						rv.add(nextGenModel.getEditPluginID());
					}
				}
			}
			rv.addAll(getExpressionsRequiredPluginIDs());
			rv.addAll(getValidationRequiredPluginIDs());
			rv.addAll(getMetricsRequiredPluginIDs());
			rv.addAll(getViewmapRequiredPluginIDs());
		}
		for (Iterator<String> it = rv.iterator(); it.hasNext();) {
			if (GenCommonBaseImpl.isEmpty(it.next())) {
				it.remove();
			}
		}
		return new BasicEList<String>(rv);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getActivatorQualifiedClassName() {
		return getEditorGen().getEditor().getPackageName() + '.' + getActivatorClassName();
	}

	private Set<String> getExpressionsRequiredPluginIDs() {
		if(getEditorGen().getExpressionProviders() != null) {
			for (GenExpressionProviderBase nextProvider : getEditorGen().getExpressionProviders().getProviders()) {
				if (nextProvider.getLanguage() == GenLanguage.OCL_LITERAL);
				return Collections.singleton("org.eclipse.ocl.ecore"); //$NON-NLS-1$
			}
		}
		return Collections.emptySet();
	}
	
	private Collection<String> getViewmapRequiredPluginIDs() {
		Collection<String> result = null;
		for (TreeIterator<EObject> contents = EcoreUtil.getAllContents(getDiagram().getAllNodes()); contents.hasNext();){
			EObject next = contents.next();
			if (next instanceof Viewmap && next.eIsSet(GMFGenPackage.eINSTANCE.getViewmap_RequiredPluginIDs())){
				if (result == null){
					result = new HashSet<String>();
				}
				result.addAll(((Viewmap)next).getRequiredPluginIDs());
				contents.prune();
			}
		}
		if (result == null) {
			return Collections.emptyList();
		}
		return result;
	}
	
	private Set<String> getValidationRequiredPluginIDs() {
		if(getDiagram().isValidationEnabled() || getEditorGen().hasAudits()) {
			HashSet<String> pluginIDs = new HashSet<String>();			
			pluginIDs.add("org.eclipse.emf.validation"); //$NON-NLS-1$
			
			if(getEditorGen().getAudits() != null) {
				collectGenPackagesRequiredPluginIDs(getEditorGen().getAudits().getTargetedModelPackages(), pluginIDs);
			}			
			return pluginIDs;
		}
		return Collections.emptySet();
	}
	
	private Set<String> getMetricsRequiredPluginIDs() {
		if(getEditorGen().getMetrics() != null) {
			HashSet<String> pluginIDs = new HashSet<String>();
			collectGenPackagesRequiredPluginIDs(getEditorGen().getMetrics().getAllTargetedModelPackages(), pluginIDs);
			return pluginIDs;
		}
		return Collections.emptySet();
	}	
	
	private void collectGenPackagesRequiredPluginIDs(Collection<GenPackage> genPackages, Set<String> pluginIDs) {
		for (GenPackage nextPackage : genPackages) {
			pluginIDs.add(nextPackage.getGenModel().getModelPluginID());
		}
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_PLUGIN__EDITOR_GEN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, GMFGenPackage.GEN_PLUGIN__EDITOR_GEN, msgs);
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
			case GMFGenPackage.GEN_PLUGIN__EDITOR_GEN:
				return eBasicSetContainer(null, GMFGenPackage.GEN_PLUGIN__EDITOR_GEN, msgs);
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
			case GMFGenPackage.GEN_PLUGIN__EDITOR_GEN:
				return eInternalContainer().eInverseRemove(this, GMFGenPackage.GEN_EDITOR_GENERATOR__PLUGIN, GenEditorGenerator.class, msgs);
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
			case GMFGenPackage.GEN_PLUGIN__EDITOR_GEN:
				return getEditorGen();
			case GMFGenPackage.GEN_PLUGIN__ID:
				return getID();
			case GMFGenPackage.GEN_PLUGIN__NAME:
				return getName();
			case GMFGenPackage.GEN_PLUGIN__PROVIDER:
				return getProvider();
			case GMFGenPackage.GEN_PLUGIN__VERSION:
				return getVersion();
			case GMFGenPackage.GEN_PLUGIN__PRINTING_ENABLED:
				return isPrintingEnabled() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_PLUGIN__REQUIRED_PLUGINS:
				return getRequiredPlugins();
			case GMFGenPackage.GEN_PLUGIN__ACTIVATOR_CLASS_NAME:
				return getActivatorClassName();
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
			case GMFGenPackage.GEN_PLUGIN__ID:
				setID((String)newValue);
				return;
			case GMFGenPackage.GEN_PLUGIN__NAME:
				setName((String)newValue);
				return;
			case GMFGenPackage.GEN_PLUGIN__PROVIDER:
				setProvider((String)newValue);
				return;
			case GMFGenPackage.GEN_PLUGIN__VERSION:
				setVersion((String)newValue);
				return;
			case GMFGenPackage.GEN_PLUGIN__PRINTING_ENABLED:
				setPrintingEnabled(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_PLUGIN__REQUIRED_PLUGINS:
				getRequiredPlugins().clear();
				getRequiredPlugins().addAll((Collection<? extends String>)newValue);
				return;
			case GMFGenPackage.GEN_PLUGIN__ACTIVATOR_CLASS_NAME:
				setActivatorClassName((String)newValue);
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
			case GMFGenPackage.GEN_PLUGIN__ID:
				setID(ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_PLUGIN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_PLUGIN__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case GMFGenPackage.GEN_PLUGIN__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case GMFGenPackage.GEN_PLUGIN__PRINTING_ENABLED:
				setPrintingEnabled(PRINTING_ENABLED_EDEFAULT);
				return;
			case GMFGenPackage.GEN_PLUGIN__REQUIRED_PLUGINS:
				getRequiredPlugins().clear();
				return;
			case GMFGenPackage.GEN_PLUGIN__ACTIVATOR_CLASS_NAME:
				setActivatorClassName(ACTIVATOR_CLASS_NAME_EDEFAULT);
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
			case GMFGenPackage.GEN_PLUGIN__EDITOR_GEN:
				return getEditorGen() != null;
			case GMFGenPackage.GEN_PLUGIN__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case GMFGenPackage.GEN_PLUGIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GMFGenPackage.GEN_PLUGIN__PROVIDER:
				return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
			case GMFGenPackage.GEN_PLUGIN__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case GMFGenPackage.GEN_PLUGIN__PRINTING_ENABLED:
				return printingEnabled != PRINTING_ENABLED_EDEFAULT;
			case GMFGenPackage.GEN_PLUGIN__REQUIRED_PLUGINS:
				return requiredPlugins != null && !requiredPlugins.isEmpty();
			case GMFGenPackage.GEN_PLUGIN__ACTIVATOR_CLASS_NAME:
				return ACTIVATOR_CLASS_NAME_EDEFAULT == null ? activatorClassName != null : !ACTIVATOR_CLASS_NAME_EDEFAULT.equals(activatorClassName);
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
		result.append(" (iD: ");
		result.append(iD);
		result.append(", name: ");
		result.append(name);
		result.append(", provider: ");
		result.append(provider);
		result.append(", version: ");
		result.append(version);
		result.append(", printingEnabled: ");
		result.append(printingEnabled);
		result.append(", requiredPlugins: ");
		result.append(requiredPlugins);
		result.append(", activatorClassName: ");
		result.append(activatorClassName);
		result.append(')');
		return result.toString();
	}

	private GenDiagram getDiagram() {
		return getEditorGen().getDiagram();
	}
} //GenPluginImpl

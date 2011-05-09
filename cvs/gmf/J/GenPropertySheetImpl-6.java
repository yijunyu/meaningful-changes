/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.gmfgen.GenPropertySheet;
import org.eclipse.gmf.codegen.gmfgen.GenPropertyTab;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Property Sheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPropertySheetImpl#getEditorGen <em>Editor Gen</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPropertySheetImpl#getTabs <em>Tabs</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPropertySheetImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPropertySheetImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPropertySheetImpl#isNeedsCaption <em>Needs Caption</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPropertySheetImpl#getLabelProviderClassName <em>Label Provider Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenPropertySheetImpl extends EObjectImpl implements GenPropertySheet {
	/**
	 * The cached value of the '{@link #getTabs() <em>Tabs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabs()
	 * @generated
	 * @ordered
	 */
	protected EList<GenPropertyTab> tabs;

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
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isNeedsCaption() <em>Needs Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsCaption()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEEDS_CAPTION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isNeedsCaption() <em>Needs Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsCaption()
	 * @generated
	 * @ordered
	 */
	protected boolean needsCaption = NEEDS_CAPTION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenPropertySheetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenPropertySheet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenEditorGenerator getEditorGen() {
		if (eContainerFeatureID != GMFGenPackage.GEN_PROPERTY_SHEET__EDITOR_GEN) return null;
		return (GenEditorGenerator)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEditorGen(GenEditorGenerator newEditorGen, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEditorGen, GMFGenPackage.GEN_PROPERTY_SHEET__EDITOR_GEN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditorGen(GenEditorGenerator newEditorGen) {
		if (newEditorGen != eInternalContainer() || (eContainerFeatureID != GMFGenPackage.GEN_PROPERTY_SHEET__EDITOR_GEN && newEditorGen != null)) {
			if (EcoreUtil.isAncestor(this, newEditorGen))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEditorGen != null)
				msgs = ((InternalEObject)newEditorGen).eInverseAdd(this, GMFGenPackage.GEN_EDITOR_GENERATOR__PROPERTY_SHEET, GenEditorGenerator.class, msgs);
			msgs = basicSetEditorGen(newEditorGen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_PROPERTY_SHEET__EDITOR_GEN, newEditorGen, newEditorGen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenPropertyTab> getTabs() {
		if (tabs == null) {
			tabs = new EObjectContainmentWithInverseEList<GenPropertyTab>(GenPropertyTab.class, this, GMFGenPackage.GEN_PROPERTY_SHEET__TABS, GMFGenPackage.GEN_PROPERTY_TAB__SHEET);
		}
		return tabs;
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
		String name = getPackageNameGen();
		if (name == null || name.trim().length() == 0) {
			return getEditorGen().getPackageNamePrefix() + ".sheet";
		}
		return name;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_PROPERTY_SHEET__PACKAGE_NAME, oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_PROPERTY_SHEET__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeedsCaption() {
		return needsCaption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedsCaption(boolean newNeedsCaption) {
		boolean oldNeedsCaption = needsCaption;
		needsCaption = newNeedsCaption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_PROPERTY_SHEET__NEEDS_CAPTION, oldNeedsCaption, needsCaption));
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
		String name = getLabelProviderClassNameGen();
		if (name == null || name.trim().length() == 0) {
			return ((GenEditorGeneratorImpl) getEditorGen()).getDomainModelCapName() + "SheetLabelProvider";
		}
		return name;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_PROPERTY_SHEET__LABEL_PROVIDER_CLASS_NAME, oldLabelProviderClassName, labelProviderClassName));
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
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_PROPERTY_SHEET__EDITOR_GEN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEditorGen((GenEditorGenerator)otherEnd, msgs);
			case GMFGenPackage.GEN_PROPERTY_SHEET__TABS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTabs()).basicAdd(otherEnd, msgs);
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
			case GMFGenPackage.GEN_PROPERTY_SHEET__EDITOR_GEN:
				return basicSetEditorGen(null, msgs);
			case GMFGenPackage.GEN_PROPERTY_SHEET__TABS:
				return ((InternalEList<?>)getTabs()).basicRemove(otherEnd, msgs);
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
			case GMFGenPackage.GEN_PROPERTY_SHEET__EDITOR_GEN:
				return eInternalContainer().eInverseRemove(this, GMFGenPackage.GEN_EDITOR_GENERATOR__PROPERTY_SHEET, GenEditorGenerator.class, msgs);
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
			case GMFGenPackage.GEN_PROPERTY_SHEET__EDITOR_GEN:
				return getEditorGen();
			case GMFGenPackage.GEN_PROPERTY_SHEET__TABS:
				return getTabs();
			case GMFGenPackage.GEN_PROPERTY_SHEET__PACKAGE_NAME:
				return getPackageName();
			case GMFGenPackage.GEN_PROPERTY_SHEET__READ_ONLY:
				return isReadOnly() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_PROPERTY_SHEET__NEEDS_CAPTION:
				return isNeedsCaption() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_PROPERTY_SHEET__LABEL_PROVIDER_CLASS_NAME:
				return getLabelProviderClassName();
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
			case GMFGenPackage.GEN_PROPERTY_SHEET__EDITOR_GEN:
				setEditorGen((GenEditorGenerator)newValue);
				return;
			case GMFGenPackage.GEN_PROPERTY_SHEET__TABS:
				getTabs().clear();
				getTabs().addAll((Collection<? extends GenPropertyTab>)newValue);
				return;
			case GMFGenPackage.GEN_PROPERTY_SHEET__PACKAGE_NAME:
				setPackageName((String)newValue);
				return;
			case GMFGenPackage.GEN_PROPERTY_SHEET__READ_ONLY:
				setReadOnly(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_PROPERTY_SHEET__NEEDS_CAPTION:
				setNeedsCaption(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_PROPERTY_SHEET__LABEL_PROVIDER_CLASS_NAME:
				setLabelProviderClassName((String)newValue);
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
			case GMFGenPackage.GEN_PROPERTY_SHEET__EDITOR_GEN:
				setEditorGen((GenEditorGenerator)null);
				return;
			case GMFGenPackage.GEN_PROPERTY_SHEET__TABS:
				getTabs().clear();
				return;
			case GMFGenPackage.GEN_PROPERTY_SHEET__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_PROPERTY_SHEET__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case GMFGenPackage.GEN_PROPERTY_SHEET__NEEDS_CAPTION:
				setNeedsCaption(NEEDS_CAPTION_EDEFAULT);
				return;
			case GMFGenPackage.GEN_PROPERTY_SHEET__LABEL_PROVIDER_CLASS_NAME:
				setLabelProviderClassName(LABEL_PROVIDER_CLASS_NAME_EDEFAULT);
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
			case GMFGenPackage.GEN_PROPERTY_SHEET__EDITOR_GEN:
				return getEditorGen() != null;
			case GMFGenPackage.GEN_PROPERTY_SHEET__TABS:
				return tabs != null && !tabs.isEmpty();
			case GMFGenPackage.GEN_PROPERTY_SHEET__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
			case GMFGenPackage.GEN_PROPERTY_SHEET__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
			case GMFGenPackage.GEN_PROPERTY_SHEET__NEEDS_CAPTION:
				return needsCaption != NEEDS_CAPTION_EDEFAULT;
			case GMFGenPackage.GEN_PROPERTY_SHEET__LABEL_PROVIDER_CLASS_NAME:
				return LABEL_PROVIDER_CLASS_NAME_EDEFAULT == null ? labelProviderClassName != null : !LABEL_PROVIDER_CLASS_NAME_EDEFAULT.equals(labelProviderClassName);
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
		result.append(" (packageName: ");
		result.append(packageName);
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(", needsCaption: ");
		result.append(needsCaption);
		result.append(", labelProviderClassName: ");
		result.append(labelProviderClassName);
		result.append(')');
		return result.toString();
	}

} //GenPropertySheetImpl
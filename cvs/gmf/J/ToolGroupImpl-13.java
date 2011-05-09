/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.Collection;

import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.Palette;
import org.eclipse.gmf.codegen.gmfgen.ToolGroup;
import org.eclipse.gmf.codegen.gmfgen.ToolGroupItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tool Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolGroupImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolGroupImpl#getPalette <em>Palette</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolGroupImpl#isStack <em>Stack</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolGroupImpl#isCollapse <em>Collapse</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolGroupImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolGroupImpl#isToolsOnly <em>Tools Only</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToolGroupImpl extends EntryBaseImpl implements ToolGroup {
	/**
	 * The default value of the '{@link #isStack() <em>Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStack()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STACK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStack() <em>Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStack()
	 * @generated
	 * @ordered
	 */
	protected boolean stack = STACK_EDEFAULT;

	/**
	 * The default value of the '{@link #isCollapse() <em>Collapse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollapse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLAPSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCollapse() <em>Collapse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollapse()
	 * @generated
	 * @ordered
	 */
	protected boolean collapse = COLLAPSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ToolGroupItem> entries;

	/**
	 * The default value of the '{@link #isToolsOnly() <em>Tools Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToolsOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TOOLS_ONLY_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getToolGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolGroup getGroup() {
		if (eContainerFeatureID != GMFGenPackage.TOOL_GROUP__GROUP) return null;
		return (ToolGroup)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(ToolGroup newGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGroup, GMFGenPackage.TOOL_GROUP__GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(ToolGroup newGroup) {
		if (newGroup != eInternalContainer() || (eContainerFeatureID != GMFGenPackage.TOOL_GROUP__GROUP && newGroup != null)) {
			if (EcoreUtil.isAncestor(this, newGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, GMFGenPackage.TOOL_GROUP__ENTRIES, ToolGroup.class, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.TOOL_GROUP__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Palette getPaletteGen() {
		if (eContainerFeatureID != GMFGenPackage.TOOL_GROUP__PALETTE) return null;
		return (Palette)eContainer();
	}

	public Palette getPalette() {
		Palette p = getPaletteGen();
		if (p != null) {
			return p;
		}
		return getGroup() == null ? null : getGroup().getPalette();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPalette(Palette newPalette, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPalette, GMFGenPackage.TOOL_GROUP__PALETTE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPalette(Palette newPalette) {
		if (newPalette != eInternalContainer() || (eContainerFeatureID != GMFGenPackage.TOOL_GROUP__PALETTE && newPalette != null)) {
			if (EcoreUtil.isAncestor(this, newPalette))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPalette != null)
				msgs = ((InternalEObject)newPalette).eInverseAdd(this, GMFGenPackage.PALETTE__GROUPS, Palette.class, msgs);
			msgs = basicSetPalette(newPalette, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.TOOL_GROUP__PALETTE, newPalette, newPalette));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToolGroupItem> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentWithInverseEList<ToolGroupItem>(ToolGroupItem.class, this, GMFGenPackage.TOOL_GROUP__ENTRIES, GMFGenPackage.TOOL_GROUP_ITEM__GROUP);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isToolsOnly() {
		for (Object element : getEntries()) {
			if (element instanceof ToolGroup) {
				return false;
			}
		}
		return true;
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
			case GMFGenPackage.TOOL_GROUP__GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGroup((ToolGroup)otherEnd, msgs);
			case GMFGenPackage.TOOL_GROUP__PALETTE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPalette((Palette)otherEnd, msgs);
			case GMFGenPackage.TOOL_GROUP__ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntries()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStack() {
		return stack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStack(boolean newStack) {
		boolean oldStack = stack;
		stack = newStack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.TOOL_GROUP__STACK, oldStack, stack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCollapse() {
		return collapse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollapse(boolean newCollapse) {
		boolean oldCollapse = collapse;
		collapse = newCollapse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.TOOL_GROUP__COLLAPSE, oldCollapse, collapse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.TOOL_GROUP__GROUP:
				return basicSetGroup(null, msgs);
			case GMFGenPackage.TOOL_GROUP__PALETTE:
				return basicSetPalette(null, msgs);
			case GMFGenPackage.TOOL_GROUP__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
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
			case GMFGenPackage.TOOL_GROUP__GROUP:
				return eInternalContainer().eInverseRemove(this, GMFGenPackage.TOOL_GROUP__ENTRIES, ToolGroup.class, msgs);
			case GMFGenPackage.TOOL_GROUP__PALETTE:
				return eInternalContainer().eInverseRemove(this, GMFGenPackage.PALETTE__GROUPS, Palette.class, msgs);
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
			case GMFGenPackage.TOOL_GROUP__GROUP:
				return getGroup();
			case GMFGenPackage.TOOL_GROUP__PALETTE:
				return getPalette();
			case GMFGenPackage.TOOL_GROUP__STACK:
				return isStack() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.TOOL_GROUP__COLLAPSE:
				return isCollapse() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.TOOL_GROUP__ENTRIES:
				return getEntries();
			case GMFGenPackage.TOOL_GROUP__TOOLS_ONLY:
				return isToolsOnly() ? Boolean.TRUE : Boolean.FALSE;
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
			case GMFGenPackage.TOOL_GROUP__GROUP:
				setGroup((ToolGroup)newValue);
				return;
			case GMFGenPackage.TOOL_GROUP__PALETTE:
				setPalette((Palette)newValue);
				return;
			case GMFGenPackage.TOOL_GROUP__STACK:
				setStack(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.TOOL_GROUP__COLLAPSE:
				setCollapse(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.TOOL_GROUP__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends ToolGroupItem>)newValue);
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
			case GMFGenPackage.TOOL_GROUP__GROUP:
				setGroup((ToolGroup)null);
				return;
			case GMFGenPackage.TOOL_GROUP__PALETTE:
				setPalette((Palette)null);
				return;
			case GMFGenPackage.TOOL_GROUP__STACK:
				setStack(STACK_EDEFAULT);
				return;
			case GMFGenPackage.TOOL_GROUP__COLLAPSE:
				setCollapse(COLLAPSE_EDEFAULT);
				return;
			case GMFGenPackage.TOOL_GROUP__ENTRIES:
				getEntries().clear();
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
			case GMFGenPackage.TOOL_GROUP__GROUP:
				return getGroup() != null;
			case GMFGenPackage.TOOL_GROUP__PALETTE:
				return getPalette() != null;
			case GMFGenPackage.TOOL_GROUP__STACK:
				return stack != STACK_EDEFAULT;
			case GMFGenPackage.TOOL_GROUP__COLLAPSE:
				return collapse != COLLAPSE_EDEFAULT;
			case GMFGenPackage.TOOL_GROUP__ENTRIES:
				return entries != null && !entries.isEmpty();
			case GMFGenPackage.TOOL_GROUP__TOOLS_ONLY:
				return isToolsOnly() != TOOLS_ONLY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ToolGroupItem.class) {
			switch (derivedFeatureID) {
				case GMFGenPackage.TOOL_GROUP__GROUP: return GMFGenPackage.TOOL_GROUP_ITEM__GROUP;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ToolGroupItem.class) {
			switch (baseFeatureID) {
				case GMFGenPackage.TOOL_GROUP_ITEM__GROUP: return GMFGenPackage.TOOL_GROUP__GROUP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (stack: ");
		result.append(stack);
		result.append(", collapse: ");
		result.append(collapse);
		result.append(')');
		return result.toString();
	}

	public String getCreateMethodName() {
		if (getCreateMethodNameGen() != null) {
			return getCreateMethodNameGen();
		}
		return CodeGenUtil.validJavaIdentifier("create" + CodeGenUtil.capName(String.valueOf(getTitle())) + getEntryID() + "Group");
	}
} //ToolGroupImpl

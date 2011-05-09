/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.ToolGroup;
import org.eclipse.gmf.codegen.gmfgen.ToolGroupItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tool Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
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
	protected EList entries = null;

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
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getToolGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList(ToolGroupItem.class, this, GMFGenPackage.TOOL_GROUP__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isToolsOnly() {
		for (Iterator it = getEntries().iterator(); it.hasNext(); ) {
			if (it.next() instanceof ToolGroup) {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.TOOL_GROUP__ENTRIES:
				return ((InternalEList)getEntries()).basicRemove(otherEnd, msgs);
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMFGenPackage.TOOL_GROUP__STACK:
				setStack(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.TOOL_GROUP__COLLAPSE:
				setCollapse(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.TOOL_GROUP__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection)newValue);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
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

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.Collection;

import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.LinkEntry;
import org.eclipse.gmf.codegen.gmfgen.NodeEntry;
import org.eclipse.gmf.codegen.gmfgen.Palette;
import org.eclipse.gmf.codegen.gmfgen.ToolGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tool Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolGroupImpl#getNodeTools <em>Node Tools</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolGroupImpl#getLinkTools <em>Link Tools</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolGroupImpl#getPalette <em>Palette</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToolGroupImpl extends EntryBaseImpl implements ToolGroup {
	/**
	 * The cached value of the '{@link #getNodeTools() <em>Node Tools</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeTools()
	 * @generated
	 * @ordered
	 */
	protected EList nodeTools = null;

	/**
	 * The cached value of the '{@link #getLinkTools() <em>Link Tools</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkTools()
	 * @generated
	 * @ordered
	 */
	protected EList linkTools = null;

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
	public EList getNodeTools() {
		if (nodeTools == null) {
			nodeTools = new EObjectContainmentWithInverseEList(NodeEntry.class, this, GMFGenPackage.TOOL_GROUP__NODE_TOOLS, GMFGenPackage.NODE_ENTRY__GROUP);
		}
		return nodeTools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLinkTools() {
		if (linkTools == null) {
			linkTools = new EObjectContainmentWithInverseEList(LinkEntry.class, this, GMFGenPackage.TOOL_GROUP__LINK_TOOLS, GMFGenPackage.LINK_ENTRY__GROUP);
		}
		return linkTools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Palette getPalette() {
		if (eContainerFeatureID != GMFGenPackage.TOOL_GROUP__PALETTE) return null;
		return (Palette)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.TOOL_GROUP__NODE_TOOLS:
				return ((InternalEList)getNodeTools()).basicAdd(otherEnd, msgs);
			case GMFGenPackage.TOOL_GROUP__LINK_TOOLS:
				return ((InternalEList)getLinkTools()).basicAdd(otherEnd, msgs);
			case GMFGenPackage.TOOL_GROUP__PALETTE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, GMFGenPackage.TOOL_GROUP__PALETTE, msgs);
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
			case GMFGenPackage.TOOL_GROUP__NODE_TOOLS:
				return ((InternalEList)getNodeTools()).basicRemove(otherEnd, msgs);
			case GMFGenPackage.TOOL_GROUP__LINK_TOOLS:
				return ((InternalEList)getLinkTools()).basicRemove(otherEnd, msgs);
			case GMFGenPackage.TOOL_GROUP__PALETTE:
				return eBasicSetContainer(null, GMFGenPackage.TOOL_GROUP__PALETTE, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.TOOL_GROUP__NODE_TOOLS:
				return getNodeTools();
			case GMFGenPackage.TOOL_GROUP__LINK_TOOLS:
				return getLinkTools();
			case GMFGenPackage.TOOL_GROUP__PALETTE:
				return getPalette();
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
			case GMFGenPackage.TOOL_GROUP__NODE_TOOLS:
				getNodeTools().clear();
				getNodeTools().addAll((Collection)newValue);
				return;
			case GMFGenPackage.TOOL_GROUP__LINK_TOOLS:
				getLinkTools().clear();
				getLinkTools().addAll((Collection)newValue);
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
			case GMFGenPackage.TOOL_GROUP__NODE_TOOLS:
				getNodeTools().clear();
				return;
			case GMFGenPackage.TOOL_GROUP__LINK_TOOLS:
				getLinkTools().clear();
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
			case GMFGenPackage.TOOL_GROUP__NODE_TOOLS:
				return nodeTools != null && !nodeTools.isEmpty();
			case GMFGenPackage.TOOL_GROUP__LINK_TOOLS:
				return linkTools != null && !linkTools.isEmpty();
			case GMFGenPackage.TOOL_GROUP__PALETTE:
				return getPalette() != null;
		}
		return super.eIsSet(featureID);
	}

	public String getCreateMethodName() {
		if (getCreateMethodNameGen() != null) {
			return getCreateMethodNameGen();
		}
		return CodeGenUtil.validJavaIdentifier("create" + getTitleKey() + getEntryID() + "Group");
	}
} //ToolGroupImpl

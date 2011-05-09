/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.Collection;

import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.ToolEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tool Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolEntryImpl#getGenNodes <em>Gen Nodes</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolEntryImpl#getGenLinks <em>Gen Links</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolEntryImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToolEntryImpl extends AbstractToolEntryImpl implements ToolEntry {
	/**
	 * The cached value of the '{@link #getGenNodes() <em>Gen Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenNodes()
	 * @generated
	 * @ordered
	 */
	protected EList genNodes = null;

	/**
	 * The cached value of the '{@link #getGenLinks() <em>Gen Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenLinks()
	 * @generated
	 * @ordered
	 */
	protected EList genLinks = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getToolEntry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGenNodes() {
		if (genNodes == null) {
			genNodes = new EObjectResolvingEList(GenNode.class, this, GMFGenPackage.TOOL_ENTRY__GEN_NODES);
		}
		return genNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGenLinks() {
		if (genLinks == null) {
			genLinks = new EObjectResolvingEList(GenLink.class, this, GMFGenPackage.TOOL_ENTRY__GEN_LINKS);
		}
		return genLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getElements() {
		if (getGenNodes().isEmpty()) {
			return getGenLinks();
		}
		return getGenNodes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.TOOL_ENTRY__GEN_NODES:
				return getGenNodes();
			case GMFGenPackage.TOOL_ENTRY__GEN_LINKS:
				return getGenLinks();
			case GMFGenPackage.TOOL_ENTRY__ELEMENTS:
				return getElements();
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
			case GMFGenPackage.TOOL_ENTRY__GEN_NODES:
				getGenNodes().clear();
				getGenNodes().addAll((Collection)newValue);
				return;
			case GMFGenPackage.TOOL_ENTRY__GEN_LINKS:
				getGenLinks().clear();
				getGenLinks().addAll((Collection)newValue);
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
			case GMFGenPackage.TOOL_ENTRY__GEN_NODES:
				getGenNodes().clear();
				return;
			case GMFGenPackage.TOOL_ENTRY__GEN_LINKS:
				getGenLinks().clear();
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
			case GMFGenPackage.TOOL_ENTRY__GEN_NODES:
				return genNodes != null && !genNodes.isEmpty();
			case GMFGenPackage.TOOL_ENTRY__GEN_LINKS:
				return genLinks != null && !genLinks.isEmpty();
			case GMFGenPackage.TOOL_ENTRY__ELEMENTS:
				return !getElements().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public String getCreateMethodName() {
		if (getCreateMethodNameGen() != null) {
			return getCreateMethodNameGen();
		}
		return CodeGenUtil.validJavaIdentifier("create" + CodeGenUtil.capName(String.valueOf(getTitle())) + getEntryID() + "CreationTool");
	}
} //ToolEntryImpl

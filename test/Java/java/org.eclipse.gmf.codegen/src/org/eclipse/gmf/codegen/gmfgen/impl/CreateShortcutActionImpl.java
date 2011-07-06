/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.gmf.codegen.gmfgen.CreateShortcutAction;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Shortcut Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CreateShortcutActionImpl extends GenActionImpl implements CreateShortcutAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateShortcutActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getCreateShortcutAction();
	}

	public String getQualifiedClassName() {
		if (GenCommonBaseImpl.isEmpty(getQualifiedClassNameGen())) {
			// FIXME > TEMP CODE
			if (getOwner() != null && getOwner().getEditorGen() != null && getOwner().getEditorGen().getDiagram() != null) {
				GenDiagram gd = getOwner().getEditorGen().getDiagram();
				if (gd.eIsSet(GMFGenPackage.eINSTANCE.getShortcuts_CreateShortcutActionClassName())) {
					return gd.getCreateShortcutActionClassName();
				}
			}
			// FIXME < TEMP CODE
			String className = "CreateShortcutAction";
			if (getOwner() != null && getOwner().getEditorGen() != null && getOwner().getEditorGen().getEditor() != null) {
				final String packageName = getOwner().getEditorGen().getEditor().getPackageName();
				if (GenCommonBaseImpl.isEmpty(packageName)) {
					return className;
				}
				return packageName + '.' + className;
			}
			return className;
		}
		return getQualifiedClassNameGen();
	}

	public String getName() {
		if (GenCommonBaseImpl.isEmpty(getNameGen())) {
			return "Create Shortcut...";
		}
		return getNameGen();
	}
} //CreateShortcutActionImpl

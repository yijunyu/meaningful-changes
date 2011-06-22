/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.LoadResourceAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Resource Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LoadResourceActionImpl extends GenActionImpl implements LoadResourceAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadResourceActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getLoadResourceAction();
	}

	public String getQualifiedClassName() {
		if (GenCommonBaseImpl.isEmpty(getQualifiedClassNameGen())) {
			// FIXME > TEMP CODE
			if (getOwner() != null && getOwner().getEditorGen() != null && getOwner().getEditorGen().getDiagram() != null) {
				GenDiagram gd = getOwner().getEditorGen().getDiagram();
				if (gd.eIsSet(GMFGenPackage.eINSTANCE.getEditorCandies_LoadResourceActionClassName())) {
					return gd.getLoadResourceActionClassName();
				}
			}
			// FIXME < TEMP CODE
			String className = "LoadResourceAction"; //$NON-NLS-1$
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
			return "Load Resource";
		}
		return getNameGen();
	}
} //LoadResourceActionImpl

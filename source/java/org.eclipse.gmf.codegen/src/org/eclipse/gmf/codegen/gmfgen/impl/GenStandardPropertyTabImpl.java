/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenStandardPropertyTab;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Standard Property Tab</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GenStandardPropertyTabImpl extends GenPropertyTabImpl implements GenStandardPropertyTab {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenStandardPropertyTabImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenStandardPropertyTab();
	}

	@Override
	public String getLabel() {
		// kinda hack, but to allow reconcile this value
		// we'd better do not set it in PropertySheetHandler
		if (!"diagram".equals(getID())) {
			return super.getLabel();
		}
		// match original from the runtime, unless overriden by user
		String rv = getLabelGen();
		if (rv == null || rv.trim().length() == 0) {
			rv = "Rulers & Grid";
		}
		return rv;
	}
} //GenStandardPropertyTabImpl
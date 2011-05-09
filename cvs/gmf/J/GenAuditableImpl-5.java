/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.LinkedList;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenAuditable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Auditable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class GenAuditableImpl extends EObjectImpl implements GenAuditable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenAuditableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenAuditable();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract GenClassifier getContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */	
	public GenClass getTargetClass() {
		if(getContext() instanceof GenClass) {
			return (GenClass)getContext(); 
		}
		return null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getClientContextID() {
		return "DefaultCtx"; //$NON-NLS-1$ 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */	
	public String getTargetClassModelQualifiedName() {
		if(getTargetClass() == null || getTargetClass().getGenPackage() == null) {
			return null;
		}
		LinkedList<String> packageNames = new LinkedList<String>();
		for(GenPackage genPackage = getTargetClass().getGenPackage(); genPackage != null;) {
			packageNames.addFirst(genPackage.getPackageName());			
			genPackage = genPackage.getSuperGenPackage(); 
		}
		StringBuilder buf = new StringBuilder(getTargetClass().getQualifiedInterfaceName().length());
		for (String next : packageNames) {
			buf.append(next).append('.');			
		}		
		return buf.append(getTargetClass().getName()).toString();
	}
	
} //GenAuditableImpl

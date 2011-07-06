package org.eclipse.gmf.internal.xpand.build;

import org.eclipse.emf.ecore.EPackage;

public interface MetaModelSource {

	public EPackage find(String nsURI);
}

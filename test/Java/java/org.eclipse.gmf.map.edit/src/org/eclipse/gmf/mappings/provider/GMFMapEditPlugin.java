/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.gmfgraph.provider.GMFGraphEditPlugin;
import org.eclipse.gmf.tooldef.provider.GMFToolEditPlugin;

/**
 * This is the central singleton for the GMFMap editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class GMFMapEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GMFMapEditPlugin INSTANCE = new GMFMapEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFMapEditPlugin() {
		super
			(new ResourceLocator [] {
				GMFGraphEditPlugin.INSTANCE,
				GMFToolEditPlugin.INSTANCE,
				EcoreEditPlugin.INSTANCE,
			});
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	private boolean myShowQualifiedFeatureLabels = true;

	public static void toggleQualifiedFeatureLabelPresentation() {
		INSTANCE.myShowQualifiedFeatureLabels = !INSTANCE.myShowQualifiedFeatureLabels;
	}

	public static boolean isQualifiedFeatureLabels() {
		return INSTANCE.myShowQualifiedFeatureLabels;
	}

	static String getFeatureLabel(EStructuralFeature feature) {
		StringBuffer sb = new StringBuffer();
		if (feature.getEContainingClass() != null) {
			sb.append(feature.getEContainingClass().getName());
			sb.append('.');
		}
		sb.append(feature.getName());
		EClassifier type = feature.getEType();
		if (type != null) {
			sb.append(':');
			sb.append(type.getName());
		}
		return sb.toString();
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipseUIPlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();
	
			// Remember the static instance.
			//
			plugin = this;
		}
	}

}

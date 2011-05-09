/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.gmf.gmfgraph.AbstractFigure;
import org.eclipse.gmf.gmfgraph.GMFGraphFactory;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.gmf.gmfgraph.AbstractFigure} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractFigureItemProvider
	extends ItemProviderAdapter
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFigureItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addDescriptorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Descriptor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Figure_descriptor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Figure_descriptor_feature", "_UI_Figure_type"),
				 GMFGraphPackage.eINSTANCE.getFigure_Descriptor(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getLayoutable_LayoutData());
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getLayoutable_Layout());
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getFigure_ForegroundColor());
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getFigure_BackgroundColor());
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getFigure_MaximumSize());
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getFigure_MinimumSize());
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getFigure_PreferredSize());
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getFigure_Font());
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getFigure_Insets());
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getFigure_Border());
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getFigure_Location());
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getFigure_Size());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_AbstractFigure_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AbstractFigure.class)) {
			case GMFGraphPackage.ABSTRACT_FIGURE__LAYOUT_DATA:
			case GMFGraphPackage.ABSTRACT_FIGURE__LAYOUT:
			case GMFGraphPackage.ABSTRACT_FIGURE__FOREGROUND_COLOR:
			case GMFGraphPackage.ABSTRACT_FIGURE__BACKGROUND_COLOR:
			case GMFGraphPackage.ABSTRACT_FIGURE__MAXIMUM_SIZE:
			case GMFGraphPackage.ABSTRACT_FIGURE__MINIMUM_SIZE:
			case GMFGraphPackage.ABSTRACT_FIGURE__PREFERRED_SIZE:
			case GMFGraphPackage.ABSTRACT_FIGURE__FONT:
			case GMFGraphPackage.ABSTRACT_FIGURE__INSETS:
			case GMFGraphPackage.ABSTRACT_FIGURE__BORDER:
			case GMFGraphPackage.ABSTRACT_FIGURE__LOCATION:
			case GMFGraphPackage.ABSTRACT_FIGURE__SIZE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getLayoutable_LayoutData(),
				 GMFGraphFactory.eINSTANCE.createCustomLayoutData()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getLayoutable_LayoutData(),
				 GMFGraphFactory.eINSTANCE.createGridLayoutData()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getLayoutable_LayoutData(),
				 GMFGraphFactory.eINSTANCE.createBorderLayoutData()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getLayoutable_LayoutData(),
				 GMFGraphFactory.eINSTANCE.createXYLayoutData()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getLayoutable_Layout(),
				 GMFGraphFactory.eINSTANCE.createCustomLayout()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getLayoutable_Layout(),
				 GMFGraphFactory.eINSTANCE.createGridLayout()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getLayoutable_Layout(),
				 GMFGraphFactory.eINSTANCE.createBorderLayout()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getLayoutable_Layout(),
				 GMFGraphFactory.eINSTANCE.createFlowLayout()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getLayoutable_Layout(),
				 GMFGraphFactory.eINSTANCE.createXYLayout()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getLayoutable_Layout(),
				 GMFGraphFactory.eINSTANCE.createStackLayout()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_ForegroundColor(),
				 GMFGraphFactory.eINSTANCE.createRGBColor()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_ForegroundColor(),
				 GMFGraphFactory.eINSTANCE.createConstantColor()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_BackgroundColor(),
				 GMFGraphFactory.eINSTANCE.createRGBColor()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_BackgroundColor(),
				 GMFGraphFactory.eINSTANCE.createConstantColor()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_MaximumSize(),
				 GMFGraphFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_MinimumSize(),
				 GMFGraphFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_PreferredSize(),
				 GMFGraphFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Font(),
				 GMFGraphFactory.eINSTANCE.createBasicFont()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Insets(),
				 GMFGraphFactory.eINSTANCE.createInsets()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Border(),
				 GMFGraphFactory.eINSTANCE.createLineBorder()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Border(),
				 GMFGraphFactory.eINSTANCE.createMarginBorder()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Border(),
				 GMFGraphFactory.eINSTANCE.createCompoundBorder()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Border(),
				 GMFGraphFactory.eINSTANCE.createCustomBorder()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Location(),
				 GMFGraphFactory.eINSTANCE.createPoint()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Size(),
				 GMFGraphFactory.eINSTANCE.createPoint()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == GMFGraphPackage.eINSTANCE.getFigure_ForegroundColor() ||
			childFeature == GMFGraphPackage.eINSTANCE.getFigure_BackgroundColor() ||
			childFeature == GMFGraphPackage.eINSTANCE.getFigure_MaximumSize() ||
			childFeature == GMFGraphPackage.eINSTANCE.getFigure_MinimumSize() ||
			childFeature == GMFGraphPackage.eINSTANCE.getFigure_PreferredSize() ||
			childFeature == GMFGraphPackage.eINSTANCE.getFigure_Location() ||
			childFeature == GMFGraphPackage.eINSTANCE.getFigure_Size();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}

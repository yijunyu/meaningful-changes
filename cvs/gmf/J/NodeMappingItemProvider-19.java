/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.gmf.mappings.GMFMapFactory;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.NodeMapping;
import org.eclipse.gmf.mappings.presentation.FilterUtil;

/**
 * This is the item provider adapter for a {@link org.eclipse.gmf.mappings.NodeMapping} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeMappingItemProvider
	extends MappingEntryItemProvider
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
	public NodeMappingItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addContextMenuPropertyDescriptor(object);
			addToolPropertyDescriptor(object);
			addAppearanceStylePropertyDescriptor(object);
			addDiagramNodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Context Menu feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContextMenuPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MenuOwner_contextMenu_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MenuOwner_contextMenu_feature", "_UI_MenuOwner_type"),
				 GMFMapPackage.eINSTANCE.getMenuOwner_ContextMenu(),
				 true,
				 null,
				 getString("_UI_VisualrepresentationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Tool feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addToolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ToolOwner_tool_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ToolOwner_tool_feature", "_UI_ToolOwner_type"),
				 GMFMapPackage.eINSTANCE.getToolOwner_Tool(),
				 true,
				 null,
				 getString("_UI_VisualrepresentationPropertyCategory"),
				 null) {
						protected Collection getComboBoxObjects(Object object) {
							return FilterUtil.sort(super.getComboBoxObjects(object));
						}
			});
	}

	/**
	 * This adds a property descriptor for the Appearance Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAppearanceStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AppearanceSteward_appearanceStyle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AppearanceSteward_appearanceStyle_feature", "_UI_AppearanceSteward_type"),
				 GMFMapPackage.eINSTANCE.getAppearanceSteward_AppearanceStyle(),
				 true,
				 null,
				 getString("_UI_VisualrepresentationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Diagram Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiagramNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeMapping_diagramNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeMapping_diagramNode_feature", "_UI_NodeMapping_type"),
				 GMFMapPackage.eINSTANCE.getNodeMapping_DiagramNode(),
				 true,
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
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GMFMapPackage.eINSTANCE.getNodeMapping_Children());
			childrenFeatures.add(GMFMapPackage.eINSTANCE.getNodeMapping_Compartments());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns NodeMapping.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NodeMapping"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getText(Object object) {
		if (object instanceof NodeMapping) {
			NodeMapping mapping = (NodeMapping) object;
			String result = " <";
			if (mapping.getDomainMetaElement() != null) {
				result += mapping.getDomainMetaElement().getName();
			}
			result += "/";
			if (mapping.getDiagramNode() != null) {
				result += mapping.getDiagramNode().getName();
			}
			result += ">";
			return getString("_UI_NodeMapping_type") + result;
		}
		return getString("_UI_NodeMapping_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChangedGen(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(NodeMapping.class)) {
			case GMFMapPackage.NODE_MAPPING__CHILDREN:
			case GMFMapPackage.NODE_MAPPING__COMPARTMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	public void notifyChanged(Notification notification) {
		switch (notification.getFeatureID(NodeMapping.class)) {
		case GMFMapPackage.NODE_MAPPING__DOMAIN_META_ELEMENT:
			fireNotifyChanged(new ViewerNotification(notification, null));
			break;
		}
		notifyChangedGen(notification);
	}

	/**
	 * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing all of the children that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(GMFMapPackage.eINSTANCE.getNodeMapping_Children(),
				 GMFMapFactory.eINSTANCE.createChildReference()));

		newChildDescriptors.add
			(createChildParameter
				(GMFMapPackage.eINSTANCE.getNodeMapping_Compartments(),
				 GMFMapFactory.eINSTANCE.createCompartmentMapping()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return GMFMapEditPlugin.INSTANCE;
	}

}

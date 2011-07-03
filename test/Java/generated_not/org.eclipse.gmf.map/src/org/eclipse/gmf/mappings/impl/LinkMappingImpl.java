/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.mappings.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Link Mapping</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getContainmentFeature <em>Containment Feature</em>}</li>
   *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getContextMenu <em>Context Menu</em>}</li>
   *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getTool <em>Tool</em>}</li>
   *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getAppearanceStyle <em>Appearance Style</em>}</li>
   *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getDiagramLink <em>Diagram Link</em>}</li>
   *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getSourceMetaFeature <em>Source Meta Feature</em>}</li>
   *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getLinkMetaFeature <em>Link Meta Feature</em>}</li>
   *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getCreationConstraints <em>Creation Constraints</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class LinkMappingImpl extends MappingEntryImpl implements LinkMapping {
    /**
       * <!-- begin-user-doc -->
       * This method was created to simplify transtofmation code.
       * @return getDomainMetaElement() if specified, and getLinkMetaFeature().getEContainingClass()  
       * if link meta feature was specified. <code>null</code> otherwise.
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public EClass getDomainContext () {
        if (getDomainMetaElement () != null) {
            return getDomainMetaElement ();

        }

        if (getLinkMetaFeature () != null) {
            return getLinkMetaFeature ().getEContainingClass ();

        }

        return null;

    }

}

//LinkMappingImpl

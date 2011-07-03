/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.mappings.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Feature Seq Initializer</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.mappings.impl.FeatureSeqInitializerImpl#getMappingEntry <em>Mapping Entry</em>}</li>
   *   <li>{@link org.eclipse.gmf.mappings.impl.FeatureSeqInitializerImpl#getInitializers <em>Initializers</em>}</li>
   *   <li>{@link org.eclipse.gmf.mappings.impl.FeatureSeqInitializerImpl#getElementClass <em>Element Class</em>}</li>

   *   <li>{@link org.eclipse.gmf.mappings.impl.FeatureSeqInitializerImpl#getCreatingInitializer <em>Creating Initializer</em>}</li>

   * </ul>
   * </p>
   *
   * @generated
   */ public class FeatureSeqInitializerImpl extends EObjectImpl implements FeatureSeqInitializer {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public MappingEntry basicGetMappingEntry () {
        EObject container = eContainer ();

        while (container != null && ! (container instanceof MappingEntry)) {
            container = container.eContainer ();
        }

        return (container != null) ? (MappingEntry) container : null;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public EClass getElementClass () {
        if (getCreatingInitializer () == null) {
            return (getMappingEntry () != null) ? getMappingEntry ().getDomainContext () : null;

        }

        EClass eClass = getElementClassGen ();

        if (eClass != null) {
            return eClass;

        }

        EClassifier eClassifier = null;

        if (getCreatingInitializer ().getFeature () != null) {
            eClassifier = getCreatingInitializer ().getFeature ().getEType ();
        }

        return (eClassifier instanceof EClass) ? (EClass) eClassifier : null;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public void setElementClass (EClass newElementClass) {
        if (getCreatingInitializer () == null && eContainer () != null) {
            return;

        }

        setElementClassGen (newElementClass);
    }

}

//FeatureSeqInitializerImpl

/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Child Container</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenChildContainerImpl#getContainedNodes <em>Contained Nodes</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenChildContainerImpl#getCanonicalEditPolicyClassName <em>Canonical Edit Policy Class Name</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenChildContainerImpl#getChildNodes <em>Child Nodes</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ abstract public class GenChildContainerImpl extends GenCommonBaseImpl implements GenChildContainer {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public EList < GenNode > getContainedNodes () {
        List < GenChildNode > childNodes = getChildNodes ();

        return new EcoreEList.UnmodifiableEList < GenNode > (this, GMFGenPackage.eINSTANCE.getGenContainerBase_ContainedNodes (
          ), childNodes.size (), childNodes.toArray ());

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public EList < GenNode > getAssistantNodes () {
        return getContainedNodes ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public boolean needsCanonicalEditPolicy () {
        // mirror logic previously on getSemanticChildrenList.jetinc - genNodes.size() > 0
          // and refreshSemanticNode.jetinc - genClass2Phantom.size() > 0 && phantomLinks.size() > 0 if (! isSansDomain () &&
          getDiagram ().isSynchronized ()) {
            return ! getContainedNodes ().isEmpty () || (getDiagram ().getGenClass2PhantomMap ().size () > 0 && getDiagram ().
              getPhantomLinks ().size () > 0);

        }
        else {
            return false;

        }

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getCanonicalEditPolicyQualifiedClassName () {
        return getDiagram ().getEditPoliciesPackageName () + '.' + getCanonicalEditPolicyClassName ();

    }

}

//GenChildContainerImpl

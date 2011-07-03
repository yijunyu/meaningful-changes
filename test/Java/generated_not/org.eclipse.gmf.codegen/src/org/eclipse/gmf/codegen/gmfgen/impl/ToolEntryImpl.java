/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Tool Entry</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolEntryImpl#getGenNodes <em>Gen Nodes</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolEntryImpl#getGenLinks <em>Gen Links</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolEntryImpl#getElements <em>Elements</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class ToolEntryImpl extends AbstractToolEntryImpl implements ToolEntry {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public EList < GenCommonBase > getElements () {
        EList < ? extends GenCommonBase > picked;

        if (getGenNodes ().isEmpty ()) {
            picked = getGenLinks ();
        }
        else {
            picked = getGenNodes ();
        }

        return new EcoreEList.UnmodifiableEList < GenCommonBase > (this, GMFGenPackage.eINSTANCE.getToolEntry_Elements (),
          picked.size (), picked.toArray ());

    }

}

//ToolEntryImpl

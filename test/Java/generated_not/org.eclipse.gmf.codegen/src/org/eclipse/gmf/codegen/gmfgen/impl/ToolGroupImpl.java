/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Tool Group</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolGroupImpl#getGroup <em>Group</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolGroupImpl#getPalette <em>Palette</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolGroupImpl#isStack <em>Stack</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolGroupImpl#isCollapse <em>Collapse</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolGroupImpl#getEntries <em>Entries</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolGroupImpl#isToolsOnly <em>Tools Only</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class ToolGroupImpl extends EntryBaseImpl implements ToolGroup {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public boolean isToolsOnly () {
        for (Object element : getEntries ()) {
            if (element instanceof ToolGroup) {
                return false;

            }

        }

        return true;

    }

}

//ToolGroupImpl

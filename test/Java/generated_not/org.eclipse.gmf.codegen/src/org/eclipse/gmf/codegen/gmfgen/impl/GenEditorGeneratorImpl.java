/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Editor Generator</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getAudits <em>Audits</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getMetrics <em>Metrics</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getDiagram <em>Diagram</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getPlugin <em>Plugin</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getEditor <em>Editor</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getNavigator <em>Navigator</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getDiagramUpdater <em>Diagram Updater</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getPropertySheet <em>Property Sheet</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getApplication <em>Application</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getDomainGenModel <em>Domain Gen Model</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getPackageNamePrefix <em>Package Name Prefix</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getModelID <em>Model ID</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#isSameFileForDiagramAndModel <em>Same File For Diagram And Model</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getDiagramFileExtension <em>Diagram File Extension</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getDomainFileExtension <em>Domain File Extension</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#isDynamicTemplates <em>Dynamic Templates</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getTemplateDirectory <em>Template Directory</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getCopyrightText <em>Copyright Text</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getExpressionProviders <em>Expression Providers</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getModelAccess <em>Model Access</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getLabelParsers <em>Label Parsers</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl#getContextMenus <em>Context Menus</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class GenEditorGeneratorImpl extends EObjectImpl implements GenEditorGenerator {
    /**
       * @generated NOT
       */
    public String getModelID () {
        String value = getModelIDGen ();

        if (GenCommonBaseImpl.isEmpty (value)) {
            value = getDomainGenModel () == null ? "Design" : getDomainGenModel ().getModelName ();
        }

        return value;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public EList < GenPackage > getAllDomainGenPackages (boolean withUsed) {
        ArrayList < GenPackage > result = new ArrayList < GenPackage > ();

        GenModel genModel = getDomainGenModel ();

        if (genModel != null) {
            List < GenPackage > genPackages = genModel.getAllGenPackagesWithClassifiers ();

            for (int i = 0;
            i < genPackages.size (); i ++) {
                GenPackage genPackage = genPackages.get (i);

                if (genPackage.getGenModel ().hasEditSupport ()) {
                    result.add (genPackage);
                }

            }

            if (withUsed) {
                genPackages = genModel.getAllUsedGenPackagesWithClassifiers ();
                for (int i = 0;
                i < genPackages.size (); i ++) {
                    GenPackage genPackage = genPackages.get (i);

                    if (genPackage.getGenModel ().hasEditSupport ()) {
                        result.add (genPackage);
                    }

                }

            }

        }

        return new BasicEList.UnmodifiableEList < GenPackage > (result.size (), result.toArray ());

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public boolean hasAudits () {
        return getAudits () != null && ! getAudits ().getRules ().isEmpty ();

    }

}

//GenEditorGeneratorImpl

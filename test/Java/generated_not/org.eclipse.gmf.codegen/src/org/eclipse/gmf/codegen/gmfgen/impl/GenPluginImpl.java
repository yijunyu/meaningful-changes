/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Plugin</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPluginImpl#getEditorGen <em>Editor Gen</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPluginImpl#getID <em>ID</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPluginImpl#getName <em>Name</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPluginImpl#getProvider <em>Provider</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPluginImpl#getVersion <em>Version</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPluginImpl#isPrintingEnabled <em>Printing Enabled</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPluginImpl#getRequiredPlugins <em>Required Plugins</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPluginImpl#getActivatorClassName <em>Activator Class Name</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class GenPluginImpl extends EObjectImpl implements GenPlugin {
    /**
       * @generated NOT
       */
    public String getName () {
        String result = getNameGen ();

        if (GenCommonBaseImpl.isEmpty (result)) {
            GenEditorGenerator generator = getEditorGen ();

            if (generator != null) {
                String prefix = "Diagram Editor";

                GenModel genModel = generator.getDomainGenModel ();

                if (genModel != null) {
                    prefix = genModel.getModelName ();
                }

                result = prefix + " Plugin";
            }

        }

        return result;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public EList < String > getAllRequiredPlugins () {
        Collection < String > rv = new LinkedHashSet < String > (getRequiredPlugins ());

        if (getEditorGen () != null) {
            final GenModel genModel = getEditorGen ().getDomainGenModel ();

            if (genModel != null) {
                rv.add (genModel.getModelPluginID ());
                rv.add (genModel.getEditPluginID ());
                for (Iterator < GenPackage > it = genModel.getAllUsedGenPackagesWithClassifiers ().iterator ();
                it.hasNext ();) {
                    GenModel nextGenModel = it.next ().getGenModel ();

                    if (nextGenModel.hasEditSupport ()) {
                        rv.add (nextGenModel.getModelPluginID ());
                        rv.add (nextGenModel.getEditPluginID ());
                    }

                }

            }

            rv.addAll (getExpressionsRequiredPluginIDs ());
            rv.addAll (getValidationRequiredPluginIDs ());
            rv.addAll (getMetricsRequiredPluginIDs ());
            rv.addAll (getViewmapRequiredPluginIDs ());
        }

        for (Iterator < String > it = rv.iterator ();
        it.hasNext ();) {
            if (GenCommonBaseImpl.isEmpty (it.next ())) {
                it.remove ();
            }

        }

        return new BasicEList < String > (rv);

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getActivatorQualifiedClassName () {
        return getEditorGen ().getEditor ().getPackageName () + '.' + getActivatorClassName ();

    }

}

//GenPluginImpl

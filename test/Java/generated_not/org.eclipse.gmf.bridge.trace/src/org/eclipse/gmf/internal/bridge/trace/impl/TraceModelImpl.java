/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.internal.bridge.trace.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Model</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.internal.bridge.trace.impl.TraceModelImpl#getNodeTraces <em>Node Traces</em>}</li>

   *   <li>{@link org.eclipse.gmf.internal.bridge.trace.impl.TraceModelImpl#getChildNodeTraces <em>Child Node Traces</em>}</li>
   *   <li>{@link org.eclipse.gmf.internal.bridge.trace.impl.TraceModelImpl#getLinkTraces <em>Link Traces</em>}</li>

   *   <li>{@link org.eclipse.gmf.internal.bridge.trace.impl.TraceModelImpl#getToolGroupTraces <em>Tool Group Traces</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class TraceModelImpl extends EObjectImpl implements TraceModel {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public GenNodeTrace getNodeTrace (int visualID) {
        for (GenNodeTrace trace : getNodeTraces ()) {
            if (trace.getVisualID () == visualID) {
                return trace;

            }

        }

        for (GenChildNodeTrace trace : getChildNodeTraces ()) {
            if (trace.getVisualID () == visualID) {
                return trace;

            }

        }

        throw new IllegalArgumentException ("Node trace with id = " + visualID + " was not found");

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public GenLinkTrace getLinkTrace (int visualID) {
        for (GenLinkTrace trace : getLinkTraces ()) {
            if (trace.getVisualID () == visualID) {
                return trace;

            }

        }

        throw new IllegalArgumentException ("Link trace with id = " + visualID + " was not found");

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public EList < AbstractTrace > getAllAbstractTraces () {
        Collection < AbstractTrace > result = new ArrayList < AbstractTrace > ();

        result.addAll (getNodeTraces ());
        addNodeChildTraces (result, getNodeTraces ());
        result.addAll (getChildNodeTraces ());
        addNodeChildTraces (result, getChildNodeTraces ());
        result.addAll (getLinkTraces ());
        for (GenLinkTrace trace : getLinkTraces ()) {
            result.addAll (trace.getLinkLabelTraces ());
        }

        result.addAll (getToolGroupTraces ());
        return new BasicEList.UnmodifiableEList < AbstractTrace > (result.size (), result.toArray ());

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public void purgeUnprocessedTraces () {
        for (AbstractTrace trace : getAllAbstractTraces ()) {
            if (trace.isProcessed ()) {
                continue;

            }

            GmfTracePlugin.getInstance ().logDebugInfo ("Removing unused trace with visual ID = " + trace.getVisualID ());
            switch (trace.eClass ().getClassifierID ()) {
                case TracePackage.GEN_NODE_TRACE :
                    getNodeTraces ().remove (trace);
                    break;

                case TracePackage.GEN_CHILD_NODE_TRACE :
                    getChildNodeTraces ().remove (trace);
                    break;

                case TracePackage.GEN_LINK_TRACE :
                    getLinkTraces ().remove (trace);
                    break;

                case TracePackage.TOOL_GROUP_TRACE :
                    getToolGroupTraces ().remove (trace);
                    break;

                case TracePackage.GEN_NODE_LABEL_TRACE :
                    ((GenNodeTrace) trace.eContainer ()).getNodeLabelTraces ().remove (trace);
                    break;

                case TracePackage.GEN_COMPARTMENT_TRACE :
                    ((GenNodeTrace) trace.eContainer ()).getCompartmentTraces ().remove (trace);
                    break;

                case TracePackage.GEN_LINK_LABEL_TRACE :
                    ((GenLinkTrace) trace.eContainer ()).getLinkLabelTraces ().remove (trace);
                    break;

            }

        }

    }

}

//TraceModelImpl

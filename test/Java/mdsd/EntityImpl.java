/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */
package example.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Entity</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link example.impl.EntityImpl#getName <em>Name</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */
public class EntityImpl extends EObjectImpl implements Entity {
    /**
       * <!-- begin-user-doc -->
    @Override public String toString () {if (eIsProxy ()) return super.toString (); StringBuffer result = new StringBuffer (super.toString ()); result.append (" (name: "); result.append (name); result.append (name); result.append (')'); return result.toString ();}
       * <!-- end-user-doc -->
       * @generated 
       */
    @Override
    public String toString () {
        if (eIsProxy ()) return super.toString ();

        StringBuffer result = new StringBuffer (super.toString ());

        result.append (" (name: ");
        result.append (name);
        result.append (name);
        result.append (')');
        return result.toString ();

    }

}

//EntityImpl

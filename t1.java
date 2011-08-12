// comment
@Override
public String toString () {
    if (eIsProxy ()) return super.toString ();

    StringBuffer result = new StringBuffer (super.toString ());

    result.append (" (name: ");
    result.append (name);
    result.append (" " + name);
    result.append (')');
    return result.toString ();

}


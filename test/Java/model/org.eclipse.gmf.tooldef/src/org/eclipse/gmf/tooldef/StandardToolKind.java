/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */
package org.eclipse.gmf.tooldef;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.Enumerator;
/**
   * <!-- begin-user-doc -->
   * A representation of the literals of the enumeration '<em><b>Standard Tool Kind</b></em>',
   * and utility methods for working with them.
   * <!-- end-user-doc -->
   * @see org.eclipse.gmf.tooldef.GMFToolPackage#getStandardToolKind()
   * @model
   * @generated
   */
public enum StandardToolKind implements Enumerator {/**
       * The '<em><b>SELECT</b></em>' literal object.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see #SELECT
       * @generated
       * @ordered
       */
    SELECT_LITERAL (0, "SELECT", "SELECT"), /**
       * The '<em><b>SELECT PAN</b></em>' literal object.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see #SELECT_PAN
       * @generated
       * @ordered
       */
    SELECT_PAN_LITERAL (1, "SELECT_PAN", "SELECT_PAN"), /**
       * The '<em><b>MARQUEE</b></em>' literal object.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see #MARQUEE
       * @generated
       * @ordered
       */
    MARQUEE_LITERAL (2, "MARQUEE", "MARQUEE"), /**
       * The '<em><b>ZOOM PAN</b></em>' literal object.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see #ZOOM_PAN
       * @generated
       * @ordered
       */
    ZOOM_PAN_LITERAL (3, "ZOOM_PAN", "ZOOM_PAN"), /**
       * The '<em><b>ZOOM IN</b></em>' literal object.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see #ZOOM_IN
       * @generated
       * @ordered
       */
    ZOOM_IN_LITERAL (4, "ZOOM_IN", "ZOOM_IN"), /**
       * The '<em><b>ZOOM OUT</b></em>' literal object.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see #ZOOM_OUT
       * @generated
       * @ordered
       */
    ZOOM_OUT_LITERAL (5, "ZOOM_OUT", "ZOOM_OUT");
    /**
       * The '<em><b>SELECT</b></em>' literal value.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of '<em><b>SELECT</b></em>' literal object isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @see #SELECT_LITERAL
       * @model
       * @generated
       * @ordered
       */ final public static int SELECT = 0;
    /**
       * The '<em><b>SELECT PAN</b></em>' literal value.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of '<em><b>SELECT PAN</b></em>' literal object isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @see #SELECT_PAN_LITERAL
       * @model
       * @generated
       * @ordered
       */ final public static int SELECT_PAN = 1;
    /**
       * The '<em><b>MARQUEE</b></em>' literal value.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of '<em><b>MARQUEE</b></em>' literal object isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @see #MARQUEE_LITERAL
       * @model
       * @generated
       * @ordered
       */ final public static int MARQUEE = 2;
    /**
       * The '<em><b>ZOOM PAN</b></em>' literal value.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of '<em><b>ZOOM PAN</b></em>' literal object isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @see #ZOOM_PAN_LITERAL
       * @model
       * @generated
       * @ordered
       */ final public static int ZOOM_PAN = 3;
    /**
       * The '<em><b>ZOOM IN</b></em>' literal value.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of '<em><b>ZOOM IN</b></em>' literal object isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @see #ZOOM_IN_LITERAL
       * @model
       * @generated
       * @ordered
       */ final public static int ZOOM_IN = 4;
    /**
       * The '<em><b>ZOOM OUT</b></em>' literal value.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of '<em><b>ZOOM OUT</b></em>' literal object isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @see #ZOOM_OUT_LITERAL
       * @model
       * @generated
       * @ordered
       */ final public static int ZOOM_OUT = 5;
    /**
       * An array of all the '<em><b>Standard Tool Kind</b></em>' enumerators.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */ final private static StandardToolKind [] VALUES_ARRAY = new StandardToolKind [] {SELECT_LITERAL, SELECT_PAN_LITERAL,
      MARQUEE_LITERAL, ZOOM_PAN_LITERAL, ZOOM_IN_LITERAL, ZOOM_OUT_LITERAL,};
    /**
       * A public read-only list of all the '<em><b>Standard Tool Kind</b></em>' enumerators.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */ final public static List < StandardToolKind > VALUES = Collections.unmodifiableList (Arrays.asList (VALUES_ARRAY));
    /**
       * Returns the '<em><b>Standard Tool Kind</b></em>' literal with the specified literal value.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public static StandardToolKind get (String literal) {
        for (int i = 0;
        i < VALUES_ARRAY.length; ++ i) {
            StandardToolKind result = VALUES_ARRAY [i];

            if (result.toString ().equals (literal)) {
                return result;

            }

        }

        return null;

    }

    /**
       * Returns the '<em><b>Standard Tool Kind</b></em>' literal with the specified name.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public static StandardToolKind getByName (String name) {
        for (int i = 0;
        i < VALUES_ARRAY.length; ++ i) {
            StandardToolKind result = VALUES_ARRAY [i];

            if (result.getName ().equals (name)) {
                return result;

            }

        }

        return null;

    }

    /**
       * Returns the '<em><b>Standard Tool Kind</b></em>' literal with the specified integer value.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public static StandardToolKind get (int value) {
        switch (value) {
            case SELECT :
                return SELECT_LITERAL;

            case SELECT_PAN :
                return SELECT_PAN_LITERAL;

            case MARQUEE :
                return MARQUEE_LITERAL;

            case ZOOM_PAN :
                return ZOOM_PAN_LITERAL;

            case ZOOM_IN :
                return ZOOM_IN_LITERAL;

            case ZOOM_OUT :
                return ZOOM_OUT_LITERAL;

        }

        return null;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */ final private int value;
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */ final private String name;
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */ final private String literal;
    /**
       * Only this class can construct instances.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    private StandardToolKind (int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public int getValue () {
        return value;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public String getName () {
        return name;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public String getLiteral () {
        return literal;

    }

    /**
       * Returns the literal value of the enumerator, which is its string representation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    @Override
    public String toString () {
        return literal;

    }

}


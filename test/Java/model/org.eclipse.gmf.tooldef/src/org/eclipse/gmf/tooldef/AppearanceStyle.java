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
   * A representation of the literals of the enumeration '<em><b>Appearance Style</b></em>',
   * and utility methods for working with them.
   * <!-- end-user-doc -->
   * @see org.eclipse.gmf.tooldef.GMFToolPackage#getAppearanceStyle()
   * @model
   * @generated
   */
public enum AppearanceStyle implements Enumerator {/**
       * The '<em><b>Font</b></em>' literal object.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see #FONT
       * @generated
       * @ordered
       */
    FONT_LITERAL (0, "Font", "Font"), /**
       * The '<em><b>Fill</b></em>' literal object.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see #FILL
       * @generated
       * @ordered
       */
    FILL_LITERAL (1, "Fill", "Fill"), /**
       * The '<em><b>Line</b></em>' literal object.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see #LINE
       * @generated
       * @ordered
       */
    LINE_LITERAL (2, "Line", "Line");
    /**
       * The '<em><b>Font</b></em>' literal value.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of '<em><b>Font</b></em>' literal object isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @see #FONT_LITERAL
       * @model name="Font"
       * @generated
       * @ordered
       */ final public static int FONT = 0;
    /**
       * The '<em><b>Fill</b></em>' literal value.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of '<em><b>Fill</b></em>' literal object isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @see #FILL_LITERAL
       * @model name="Fill"
       * @generated
       * @ordered
       */ final public static int FILL = 1;
    /**
       * The '<em><b>Line</b></em>' literal value.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of '<em><b>Line</b></em>' literal object isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @see #LINE_LITERAL
       * @model name="Line"
       * @generated
       * @ordered
       */ final public static int LINE = 2;
    /**
       * An array of all the '<em><b>Appearance Style</b></em>' enumerators.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */ final private static AppearanceStyle [] VALUES_ARRAY = new AppearanceStyle [] {FONT_LITERAL, FILL_LITERAL,
      LINE_LITERAL,};
    /**
       * A public read-only list of all the '<em><b>Appearance Style</b></em>' enumerators.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */ final public static List < AppearanceStyle > VALUES = Collections.unmodifiableList (Arrays.asList (VALUES_ARRAY));
    /**
       * Returns the '<em><b>Appearance Style</b></em>' literal with the specified literal value.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public static AppearanceStyle get (String literal) {
        for (int i = 0;
        i < VALUES_ARRAY.length; ++ i) {
            AppearanceStyle result = VALUES_ARRAY [i];

            if (result.toString ().equals (literal)) {
                return result;

            }

        }

        return null;

    }

    /**
       * Returns the '<em><b>Appearance Style</b></em>' literal with the specified name.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public static AppearanceStyle getByName (String name) {
        for (int i = 0;
        i < VALUES_ARRAY.length; ++ i) {
            AppearanceStyle result = VALUES_ARRAY [i];

            if (result.getName ().equals (name)) {
                return result;

            }

        }

        return null;

    }

    /**
       * Returns the '<em><b>Appearance Style</b></em>' literal with the specified integer value.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public static AppearanceStyle get (int value) {
        switch (value) {
            case FONT :
                return FONT_LITERAL;

            case FILL :
                return FILL_LITERAL;

            case LINE :
                return LINE_LITERAL;

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
    private AppearanceStyle (int value, String name, String literal) {
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


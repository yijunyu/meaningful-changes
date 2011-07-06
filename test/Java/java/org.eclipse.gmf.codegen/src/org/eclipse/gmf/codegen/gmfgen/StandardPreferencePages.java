/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Standard Preference Pages</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getStandardPreferencePages()
 * @model
 * @generated
 */
public enum StandardPreferencePages implements Enumerator
{
	/**
	 * The '<em><b>General</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERAL
	 * @generated
	 * @ordered
	 */
	GENERAL_LITERAL(0, "General", "General"),
	/**
	 * The '<em><b>Appearance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPEARANCE
	 * @generated
	 * @ordered
	 */
	APPEARANCE_LITERAL(1, "Appearance", "Appearance"),
	/**
	 * The '<em><b>Connections</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTIONS
	 * @generated
	 * @ordered
	 */
	CONNECTIONS_LITERAL(2, "Connections", "Connections"),
	/**
	 * The '<em><b>Printing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRINTING
	 * @generated
	 * @ordered
	 */
	PRINTING_LITERAL(3, "Printing", "Printing"),
	/**
	 * The '<em><b>Rulers And Grid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RULERS_AND_GRID
	 * @generated
	 * @ordered
	 */
	RULERS_AND_GRID_LITERAL(4, "RulersAndGrid", "RulersAndGrid"),
	/**
	 * The '<em><b>Pathmaps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATHMAPS
	 * @generated
	 * @ordered
	 */
	PATHMAPS_LITERAL(5, "Pathmaps", "Pathmaps");
	/**
	 * The '<em><b>General</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>General</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERAL_LITERAL
	 * @model name="General"
	 * @generated
	 * @ordered
	 */
	public static final int GENERAL = 0;

	/**
	 * The '<em><b>Appearance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Appearance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPEARANCE_LITERAL
	 * @model name="Appearance"
	 * @generated
	 * @ordered
	 */
	public static final int APPEARANCE = 1;

	/**
	 * The '<em><b>Connections</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Connections</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECTIONS_LITERAL
	 * @model name="Connections"
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIONS = 2;

	/**
	 * The '<em><b>Printing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Printing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRINTING_LITERAL
	 * @model name="Printing"
	 * @generated
	 * @ordered
	 */
	public static final int PRINTING = 3;

	/**
	 * The '<em><b>Rulers And Grid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rulers And Grid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RULERS_AND_GRID_LITERAL
	 * @model name="RulersAndGrid"
	 * @generated
	 * @ordered
	 */
	public static final int RULERS_AND_GRID = 4;

	/**
	 * The '<em><b>Pathmaps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pathmaps</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PATHMAPS_LITERAL
	 * @model name="Pathmaps"
	 * @generated
	 * @ordered
	 */
	public static final int PATHMAPS = 5;

	/**
	 * An array of all the '<em><b>Standard Preference Pages</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StandardPreferencePages[] VALUES_ARRAY =
		new StandardPreferencePages[] {
			GENERAL_LITERAL,
			APPEARANCE_LITERAL,
			CONNECTIONS_LITERAL,
			PRINTING_LITERAL,
			RULERS_AND_GRID_LITERAL,
			PATHMAPS_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Standard Preference Pages</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StandardPreferencePages> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Standard Preference Pages</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StandardPreferencePages get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StandardPreferencePages result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Standard Preference Pages</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StandardPreferencePages getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StandardPreferencePages result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Standard Preference Pages</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StandardPreferencePages get(int value) {
		switch (value) {
			case GENERAL: return GENERAL_LITERAL;
			case APPEARANCE: return APPEARANCE_LITERAL;
			case CONNECTIONS: return CONNECTIONS_LITERAL;
			case PRINTING: return PRINTING_LITERAL;
			case RULERS_AND_GRID: return RULERS_AND_GRID_LITERAL;
			case PATHMAPS: return PATHMAPS_LITERAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StandardPreferencePages(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
}

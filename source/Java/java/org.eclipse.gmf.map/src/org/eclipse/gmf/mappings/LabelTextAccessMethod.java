/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Label Text Access Method</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLabelTextAccessMethod()
 * @model
 * @generated
 */
public enum LabelTextAccessMethod implements Enumerator {
	/**
	 * The '<em><b>MESSAGE FORMAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MESSAGE_FORMAT_VALUE
	 * @generated
	 * @ordered
	 */
	MESSAGE_FORMAT(0, "MESSAGE_FORMAT", "MESSAGE_FORMAT"),

	/**
	 * The '<em><b>NATIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	NATIVE(1, "NATIVE", "NATIVE"),

	/**
	 * The '<em><b>REGEXP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGEXP_VALUE
	 * @generated
	 * @ordered
	 */
	REGEXP(2, "REGEXP", "REGEXP"),

	/**
	 * The '<em><b>PRINTF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRINTF_VALUE
	 * @generated
	 * @ordered
	 */
	PRINTF(3, "PRINTF", "PRINTF");

	/**
	 * The '<em><b>MESSAGE FORMAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MESSAGE FORMAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MESSAGE_FORMAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE_FORMAT_VALUE = 0;

	/**
	 * The '<em><b>NATIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NATIVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NATIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NATIVE_VALUE = 1;

	/**
	 * The '<em><b>REGEXP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REGEXP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGEXP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REGEXP_VALUE = 2;

	/**
	 * The '<em><b>PRINTF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRINTF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRINTF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRINTF_VALUE = 3;

	/**
	 * An array of all the '<em><b>Label Text Access Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LabelTextAccessMethod[] VALUES_ARRAY =
		new LabelTextAccessMethod[] {
			MESSAGE_FORMAT,
			NATIVE,
			REGEXP,
			PRINTF,
		};

	/**
	 * A public read-only list of all the '<em><b>Label Text Access Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LabelTextAccessMethod> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Label Text Access Method</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LabelTextAccessMethod get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LabelTextAccessMethod result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Label Text Access Method</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LabelTextAccessMethod getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LabelTextAccessMethod result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Label Text Access Method</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LabelTextAccessMethod get(int value) {
		switch (value) {
			case MESSAGE_FORMAT_VALUE: return MESSAGE_FORMAT;
			case NATIVE_VALUE: return NATIVE;
			case REGEXP_VALUE: return REGEXP;
			case PRINTF_VALUE: return PRINTF;
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
	private LabelTextAccessMethod(int value, String name, String literal) {
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
	
} //LabelTextAccessMethod

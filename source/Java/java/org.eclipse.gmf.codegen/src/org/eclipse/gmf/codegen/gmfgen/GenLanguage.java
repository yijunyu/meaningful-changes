/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenLanguage.java,v 1.3 2008/07/01 11:40:16 atikhomirov Exp $
 */
package org.eclipse.gmf.codegen.gmfgen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Gen Language</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLanguage()
 * @model
 * @generated
 */
public enum GenLanguage implements Enumerator
{
	/**
	 * The '<em><b>Ocl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCL
	 * @generated
	 * @ordered
	 */
	OCL_LITERAL(0, "ocl", "ocl"),
	/**
	 * The '<em><b>Java</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA
	 * @generated
	 * @ordered
	 */
	JAVA_LITERAL(1, "java", "java"),
	/**
	 * The '<em><b>Regexp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGEXP
	 * @generated
	 * @ordered
	 */
	REGEXP_LITERAL(2, "regexp", "regexp"),
	/**
	 * The '<em><b>Nregexp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NREGEXP
	 * @generated
	 * @ordered
	 */
	NREGEXP_LITERAL(3, "nregexp", "nregexp"), /**
	 * The '<em><b>Literal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LITERAL
	 * @generated
	 * @ordered
	 */
	LITERAL_LITERAL(4, "literal", "literal");
	/**
	 * The '<em><b>Ocl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ocl</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OCL_LITERAL
	 * @model name="ocl"
	 * @generated
	 * @ordered
	 */
	public static final int OCL = 0;

	/**
	 * The '<em><b>Java</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Java</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JAVA_LITERAL
	 * @model name="java"
	 * @generated
	 * @ordered
	 */
	public static final int JAVA = 1;

	/**
	 * The '<em><b>Regexp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Regexp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGEXP_LITERAL
	 * @model name="regexp"
	 * @generated
	 * @ordered
	 */
	public static final int REGEXP = 2;

	/**
	 * The '<em><b>Nregexp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nregexp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NREGEXP_LITERAL
	 * @model name="nregexp"
	 * @generated
	 * @ordered
	 */
	public static final int NREGEXP = 3;

	/**
	 * The '<em><b>Literal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Literal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LITERAL_LITERAL
	 * @model name="literal"
	 * @generated
	 * @ordered
	 */
	public static final int LITERAL = 4;

	/**
	 * An array of all the '<em><b>Gen Language</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GenLanguage[] VALUES_ARRAY =
		new GenLanguage[] {
			OCL_LITERAL,
			JAVA_LITERAL,
			REGEXP_LITERAL,
			NREGEXP_LITERAL,
			LITERAL_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Gen Language</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GenLanguage> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Gen Language</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenLanguage get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GenLanguage result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gen Language</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenLanguage getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GenLanguage result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gen Language</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenLanguage get(int value) {
		switch (value) {
			case OCL: return OCL_LITERAL;
			case JAVA: return JAVA_LITERAL;
			case REGEXP: return REGEXP_LITERAL;
			case NREGEXP: return NREGEXP_LITERAL;
			case LITERAL: return LITERAL_LITERAL;
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
	private GenLanguage(int value, String name, String literal) {
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

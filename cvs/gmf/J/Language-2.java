/**
 * <copyright>
 * </copyright>
 *
 * $Id: Language.java,v 1.1 2006/06/02 11:43:06 radvorak Exp $
 */
package org.eclipse.gmf.mappings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Language</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLanguage()
 * @model
 * @generated
 */
public final class Language extends AbstractEnumerator {
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
	 * The '<em><b>Ocl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCL
	 * @generated
	 * @ordered
	 */
	public static final Language OCL_LITERAL = new Language(OCL, "ocl", "ocl");

	/**
	 * The '<em><b>Java</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA
	 * @generated
	 * @ordered
	 */
	public static final Language JAVA_LITERAL = new Language(JAVA, "java", "java");

	/**
	 * The '<em><b>Regexp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGEXP
	 * @generated
	 * @ordered
	 */
	public static final Language REGEXP_LITERAL = new Language(REGEXP, "regexp", "regexp");

	/**
	 * The '<em><b>Nregexp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NREGEXP
	 * @generated
	 * @ordered
	 */
	public static final Language NREGEXP_LITERAL = new Language(NREGEXP, "nregexp", "nregexp");

	/**
	 * An array of all the '<em><b>Language</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Language[] VALUES_ARRAY =
		new Language[] {
			OCL_LITERAL,
			JAVA_LITERAL,
			REGEXP_LITERAL,
			NREGEXP_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Language</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Language</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Language get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Language result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Language</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Language getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Language result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Language</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Language get(int value) {
		switch (value) {
			case OCL: return OCL_LITERAL;
			case JAVA: return JAVA_LITERAL;
			case REGEXP: return REGEXP_LITERAL;
			case NREGEXP: return NREGEXP_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Language(int value, String name, String literal) {
		super(value, name, literal);
	}

} //Language

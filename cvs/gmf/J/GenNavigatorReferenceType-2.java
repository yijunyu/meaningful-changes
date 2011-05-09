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

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Gen Navigator Reference Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigatorReferenceType()
 * @model
 * @generated
 */
public final class GenNavigatorReferenceType extends AbstractEnumerator {
	/**
	 * The '<em><b>Children</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Children</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHILDREN_LITERAL
	 * @model name="children"
	 * @generated
	 * @ordered
	 */
	public static final int CHILDREN = 0;

	/**
	 * The '<em><b>Out taget</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Out taget</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUT_TAGET_LITERAL
	 * @model name="out_taget"
	 * @generated
	 * @ordered
	 */
	public static final int OUT_TAGET = 1;

	/**
	 * The '<em><b>In source</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In source</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_SOURCE_LITERAL
	 * @model name="in_source"
	 * @generated
	 * @ordered
	 */
	public static final int IN_SOURCE = 2;

	/**
	 * The '<em><b>Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Default</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_LITERAL
	 * @model name="default"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT = 3;

	/**
	 * The '<em><b>Children</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILDREN
	 * @generated
	 * @ordered
	 */
	public static final GenNavigatorReferenceType CHILDREN_LITERAL = new GenNavigatorReferenceType(CHILDREN, "children", "children");

	/**
	 * The '<em><b>Out taget</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUT_TAGET
	 * @generated
	 * @ordered
	 */
	public static final GenNavigatorReferenceType OUT_TAGET_LITERAL = new GenNavigatorReferenceType(OUT_TAGET, "out_taget", "out_taget");

	/**
	 * The '<em><b>In source</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_SOURCE
	 * @generated
	 * @ordered
	 */
	public static final GenNavigatorReferenceType IN_SOURCE_LITERAL = new GenNavigatorReferenceType(IN_SOURCE, "in_source", "in_source");

	/**
	 * The '<em><b>Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @generated
	 * @ordered
	 */
	public static final GenNavigatorReferenceType DEFAULT_LITERAL = new GenNavigatorReferenceType(DEFAULT, "default", "default");

	/**
	 * An array of all the '<em><b>Gen Navigator Reference Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GenNavigatorReferenceType[] VALUES_ARRAY =
		new GenNavigatorReferenceType[] {
			CHILDREN_LITERAL,
			OUT_TAGET_LITERAL,
			IN_SOURCE_LITERAL,
			DEFAULT_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Gen Navigator Reference Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Gen Navigator Reference Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenNavigatorReferenceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GenNavigatorReferenceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gen Navigator Reference Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenNavigatorReferenceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GenNavigatorReferenceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gen Navigator Reference Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenNavigatorReferenceType get(int value) {
		switch (value) {
			case CHILDREN: return CHILDREN_LITERAL;
			case OUT_TAGET: return OUT_TAGET_LITERAL;
			case IN_SOURCE: return IN_SOURCE_LITERAL;
			case DEFAULT: return DEFAULT_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GenNavigatorReferenceType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //GenNavigatorReferenceType

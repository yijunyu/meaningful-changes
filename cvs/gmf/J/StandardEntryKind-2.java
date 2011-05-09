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
 * A representation of the literals of the enumeration '<em><b>Standard Entry Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getStandardEntryKind()
 * @model
 * @generated
 */
public final class StandardEntryKind extends AbstractEnumerator {
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
	 */
	public static final int SELECT = 0;

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
	 */
	public static final int MARQUEE = 1;

	/**
	 * The '<em><b>ZOOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ZOOM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ZOOM_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZOOM = 2;

	/**
	 * The '<em><b>SELECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECT
	 * @generated
	 * @ordered
	 */
	public static final StandardEntryKind SELECT_LITERAL = new StandardEntryKind(SELECT, "SELECT", "SELECT");

	/**
	 * The '<em><b>MARQUEE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARQUEE
	 * @generated
	 * @ordered
	 */
	public static final StandardEntryKind MARQUEE_LITERAL = new StandardEntryKind(MARQUEE, "MARQUEE", "MARQUEE");

	/**
	 * The '<em><b>ZOOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZOOM
	 * @generated
	 * @ordered
	 */
	public static final StandardEntryKind ZOOM_LITERAL = new StandardEntryKind(ZOOM, "ZOOM", "ZOOM");

	/**
	 * An array of all the '<em><b>Standard Entry Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StandardEntryKind[] VALUES_ARRAY =
		new StandardEntryKind[] {
			SELECT_LITERAL,
			MARQUEE_LITERAL,
			ZOOM_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Standard Entry Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Standard Entry Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StandardEntryKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StandardEntryKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Standard Entry Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StandardEntryKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StandardEntryKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Standard Entry Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StandardEntryKind get(int value) {
		switch (value) {
			case SELECT: return SELECT_LITERAL;
			case MARQUEE: return MARQUEE_LITERAL;
			case ZOOM: return ZOOM_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StandardEntryKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //StandardEntryKind

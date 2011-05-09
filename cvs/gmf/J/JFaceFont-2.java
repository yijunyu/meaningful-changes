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
 * A representation of the literals of the enumeration '<em><b>JFace Font</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getJFaceFont()
 * @model
 * @generated
 */
public final class JFaceFont extends AbstractEnumerator {
	/**
	 * The '<em><b>Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Default</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_LITERAL
	 * @model name="Default"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT = 0;

	/**
	 * The '<em><b>Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Text</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXT_LITERAL
	 * @model name="Text"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT = 1;

	/**
	 * The '<em><b>Banner</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Banner</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BANNER_LITERAL
	 * @model name="Banner"
	 * @generated
	 * @ordered
	 */
	public static final int BANNER = 2;

	/**
	 * The '<em><b>Dialog</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dialog</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIALOG_LITERAL
	 * @model name="Dialog"
	 * @generated
	 * @ordered
	 */
	public static final int DIALOG = 3;

	/**
	 * The '<em><b>Header</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Header</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEADER_LITERAL
	 * @model name="Header"
	 * @generated
	 * @ordered
	 */
	public static final int HEADER = 4;

	/**
	 * The '<em><b>Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @generated
	 * @ordered
	 */
	public static final JFaceFont DEFAULT_LITERAL = new JFaceFont(DEFAULT, "Default", "Default");

	/**
	 * The '<em><b>Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT
	 * @generated
	 * @ordered
	 */
	public static final JFaceFont TEXT_LITERAL = new JFaceFont(TEXT, "Text", "Text");

	/**
	 * The '<em><b>Banner</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BANNER
	 * @generated
	 * @ordered
	 */
	public static final JFaceFont BANNER_LITERAL = new JFaceFont(BANNER, "Banner", "Banner");

	/**
	 * The '<em><b>Dialog</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIALOG
	 * @generated
	 * @ordered
	 */
	public static final JFaceFont DIALOG_LITERAL = new JFaceFont(DIALOG, "Dialog", "Dialog");

	/**
	 * The '<em><b>Header</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEADER
	 * @generated
	 * @ordered
	 */
	public static final JFaceFont HEADER_LITERAL = new JFaceFont(HEADER, "Header", "Header");

	/**
	 * An array of all the '<em><b>JFace Font</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final JFaceFont[] VALUES_ARRAY =
		new JFaceFont[] {
			DEFAULT_LITERAL,
			TEXT_LITERAL,
			BANNER_LITERAL,
			DIALOG_LITERAL,
			HEADER_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>JFace Font</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>JFace Font</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JFaceFont get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JFaceFont result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>JFace Font</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JFaceFont getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JFaceFont result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>JFace Font</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JFaceFont get(int value) {
		switch (value) {
			case DEFAULT: return DEFAULT_LITERAL;
			case TEXT: return TEXT_LITERAL;
			case BANNER: return BANNER_LITERAL;
			case DIALOG: return DIALOG_LITERAL;
			case HEADER: return HEADER_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private JFaceFont(int value, String name, String literal) {
		super(value, name, literal);
	}

} //JFaceFont

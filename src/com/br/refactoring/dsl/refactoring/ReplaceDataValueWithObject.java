/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br.refactoring.dsl.refactoring;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replace Data Value With Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.br.refactoring.dsl.refactoring.ReplaceDataValueWithObject#getSourceClass <em>Source Class</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.ReplaceDataValueWithObject#getAttributeToReplaceDataWithObject <em>Attribute To Replace Data With Object</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.ReplaceDataValueWithObject#getNewAttributes <em>New Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getReplaceDataValueWithObject()
 * @model
 * @generated
 */
public interface ReplaceDataValueWithObject extends OrganizingData {
	/**
	 * Returns the value of the '<em><b>Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Class</em>' reference.
	 * @see #setSourceClass(com.br.refactoring.dsl.refactoring.Class)
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getReplaceDataValueWithObject_SourceClass()
	 * @model
	 * @generated
	 */
	com.br.refactoring.dsl.refactoring.Class getSourceClass();

	/**
	 * Sets the value of the '{@link com.br.refactoring.dsl.refactoring.ReplaceDataValueWithObject#getSourceClass <em>Source Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Class</em>' reference.
	 * @see #getSourceClass()
	 * @generated
	 */
	void setSourceClass(com.br.refactoring.dsl.refactoring.Class value);

	/**
	 * Returns the value of the '<em><b>Attribute To Replace Data With Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute To Replace Data With Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute To Replace Data With Object</em>' reference.
	 * @see #setAttributeToReplaceDataWithObject(Attribute)
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getReplaceDataValueWithObject_AttributeToReplaceDataWithObject()
	 * @model
	 * @generated
	 */
	Attribute getAttributeToReplaceDataWithObject();

	/**
	 * Sets the value of the '{@link com.br.refactoring.dsl.refactoring.ReplaceDataValueWithObject#getAttributeToReplaceDataWithObject <em>Attribute To Replace Data With Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute To Replace Data With Object</em>' reference.
	 * @see #getAttributeToReplaceDataWithObject()
	 * @generated
	 */
	void setAttributeToReplaceDataWithObject(Attribute value);

	/**
	 * Returns the value of the '<em><b>New Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link com.br.refactoring.dsl.refactoring.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Attributes</em>' containment reference list.
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getReplaceDataValueWithObject_NewAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getNewAttributes();

} // ReplaceDataValueWithObject

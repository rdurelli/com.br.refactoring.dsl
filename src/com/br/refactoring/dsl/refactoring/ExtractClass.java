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
 * A representation of the model object '<em><b>Extract Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.br.refactoring.dsl.refactoring.ExtractClass#getNewName <em>New Name</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.ExtractClass#getSourceClass <em>Source Class</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.ExtractClass#getAttributesToBeMoved <em>Attributes To Be Moved</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.ExtractClass#getAttributesToBeMovedName <em>Attributes To Be Moved Name</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.ExtractClass#getSourceClassName <em>Source Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getExtractClass()
 * @model
 * @generated
 */
public interface ExtractClass extends MovingFeaturesBetweenObjects {
	/**
	 * Returns the value of the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Name</em>' attribute.
	 * @see #setNewName(String)
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getExtractClass_NewName()
	 * @model derived="true"
	 * @generated
	 */
	String getNewName();

	/**
	 * Sets the value of the '{@link com.br.refactoring.dsl.refactoring.ExtractClass#getNewName <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Name</em>' attribute.
	 * @see #getNewName()
	 * @generated
	 */
	void setNewName(String value);

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
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getExtractClass_SourceClass()
	 * @model
	 * @generated
	 */
	com.br.refactoring.dsl.refactoring.Class getSourceClass();

	/**
	 * Sets the value of the '{@link com.br.refactoring.dsl.refactoring.ExtractClass#getSourceClass <em>Source Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Class</em>' reference.
	 * @see #getSourceClass()
	 * @generated
	 */
	void setSourceClass(com.br.refactoring.dsl.refactoring.Class value);

	/**
	 * Returns the value of the '<em><b>Attributes To Be Moved</b></em>' reference list.
	 * The list contents are of type {@link com.br.refactoring.dsl.refactoring.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes To Be Moved</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes To Be Moved</em>' reference list.
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getExtractClass_AttributesToBeMoved()
	 * @model
	 * @generated
	 */
	EList<Attribute> getAttributesToBeMoved();

	/**
	 * Returns the value of the '<em><b>Attributes To Be Moved Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes To Be Moved Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes To Be Moved Name</em>' attribute.
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getExtractClass_AttributesToBeMovedName()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getAttributesToBeMovedName();

	/**
	 * Returns the value of the '<em><b>Source Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Class Name</em>' attribute.
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getExtractClass_SourceClassName()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getSourceClassName();

} // ExtractClass

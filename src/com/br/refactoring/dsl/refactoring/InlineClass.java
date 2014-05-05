/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br.refactoring.dsl.refactoring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inline Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.br.refactoring.dsl.refactoring.InlineClass#getClassToGetAllFeatures <em>Class To Get All Features</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.InlineClass#getClassToRemove <em>Class To Remove</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getInlineClass()
 * @model
 * @generated
 */
public interface InlineClass extends MovingFeaturesBetweenObjects {
	/**
	 * Returns the value of the '<em><b>Class To Get All Features</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class To Get All Features</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class To Get All Features</em>' reference.
	 * @see #setClassToGetAllFeatures(com.br.refactoring.dsl.refactoring.Class)
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getInlineClass_ClassToGetAllFeatures()
	 * @model
	 * @generated
	 */
	com.br.refactoring.dsl.refactoring.Class getClassToGetAllFeatures();

	/**
	 * Sets the value of the '{@link com.br.refactoring.dsl.refactoring.InlineClass#getClassToGetAllFeatures <em>Class To Get All Features</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class To Get All Features</em>' reference.
	 * @see #getClassToGetAllFeatures()
	 * @generated
	 */
	void setClassToGetAllFeatures(com.br.refactoring.dsl.refactoring.Class value);

	/**
	 * Returns the value of the '<em><b>Class To Remove</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class To Remove</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class To Remove</em>' reference.
	 * @see #setClassToRemove(com.br.refactoring.dsl.refactoring.Class)
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getInlineClass_ClassToRemove()
	 * @model
	 * @generated
	 */
	com.br.refactoring.dsl.refactoring.Class getClassToRemove();

	/**
	 * Sets the value of the '{@link com.br.refactoring.dsl.refactoring.InlineClass#getClassToRemove <em>Class To Remove</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class To Remove</em>' reference.
	 * @see #getClassToRemove()
	 * @generated
	 */
	void setClassToRemove(com.br.refactoring.dsl.refactoring.Class value);

} // InlineClass

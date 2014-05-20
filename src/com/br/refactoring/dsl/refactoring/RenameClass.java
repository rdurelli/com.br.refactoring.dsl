/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br.refactoring.dsl.refactoring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rename Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.br.refactoring.dsl.refactoring.RenameClass#getNewName <em>New Name</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.RenameClass#getClassToBeRename <em>Class To Be Rename</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.RenameClass#getClassToBeRenamedName <em>Class To Be Renamed Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getRenameClass()
 * @model
 * @generated
 */
public interface RenameClass extends RenameFeature {
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
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getRenameClass_NewName()
	 * @model
	 * @generated
	 */
	String getNewName();

	/**
	 * Sets the value of the '{@link com.br.refactoring.dsl.refactoring.RenameClass#getNewName <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Name</em>' attribute.
	 * @see #getNewName()
	 * @generated
	 */
	void setNewName(String value);

	/**
	 * Returns the value of the '<em><b>Class To Be Rename</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class To Be Rename</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class To Be Rename</em>' reference.
	 * @see #setClassToBeRename(com.br.refactoring.dsl.refactoring.Class)
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getRenameClass_ClassToBeRename()
	 * @model
	 * @generated
	 */
	com.br.refactoring.dsl.refactoring.Class getClassToBeRename();

	/**
	 * Sets the value of the '{@link com.br.refactoring.dsl.refactoring.RenameClass#getClassToBeRename <em>Class To Be Rename</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class To Be Rename</em>' reference.
	 * @see #getClassToBeRename()
	 * @generated
	 */
	void setClassToBeRename(com.br.refactoring.dsl.refactoring.Class value);

	/**
	 * Returns the value of the '<em><b>Class To Be Renamed Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class To Be Renamed Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class To Be Renamed Name</em>' attribute.
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getRenameClass_ClassToBeRenamedName()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getClassToBeRenamedName();

} // RenameClass

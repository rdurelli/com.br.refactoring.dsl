/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br.refactoring.dsl.refactoring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rename Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.br.refactoring.dsl.refactoring.RenameAttribute#getNewName <em>New Name</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.RenameAttribute#getAttributeToBeRename <em>Attribute To Be Rename</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.RenameAttribute#getSourceClass <em>Source Class</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.RenameAttribute#getSourceClassName <em>Source Class Name</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.RenameAttribute#getAttributeToBeRenamedName <em>Attribute To Be Renamed Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getRenameAttribute()
 * @model
 * @generated
 */
public interface RenameAttribute extends RenameFeature {
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
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getRenameAttribute_NewName()
	 * @model
	 * @generated
	 */
	String getNewName();

	/**
	 * Sets the value of the '{@link com.br.refactoring.dsl.refactoring.RenameAttribute#getNewName <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Name</em>' attribute.
	 * @see #getNewName()
	 * @generated
	 */
	void setNewName(String value);

	/**
	 * Returns the value of the '<em><b>Attribute To Be Rename</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute To Be Rename</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute To Be Rename</em>' reference.
	 * @see #setAttributeToBeRename(Attribute)
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getRenameAttribute_AttributeToBeRename()
	 * @model
	 * @generated
	 */
	Attribute getAttributeToBeRename();

	/**
	 * Sets the value of the '{@link com.br.refactoring.dsl.refactoring.RenameAttribute#getAttributeToBeRename <em>Attribute To Be Rename</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute To Be Rename</em>' reference.
	 * @see #getAttributeToBeRename()
	 * @generated
	 */
	void setAttributeToBeRename(Attribute value);

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
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getRenameAttribute_SourceClass()
	 * @model
	 * @generated
	 */
	com.br.refactoring.dsl.refactoring.Class getSourceClass();

	/**
	 * Sets the value of the '{@link com.br.refactoring.dsl.refactoring.RenameAttribute#getSourceClass <em>Source Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Class</em>' reference.
	 * @see #getSourceClass()
	 * @generated
	 */
	void setSourceClass(com.br.refactoring.dsl.refactoring.Class value);

	/**
	 * Returns the value of the '<em><b>Source Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Class Name</em>' attribute.
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getRenameAttribute_SourceClassName()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getSourceClassName();

	/**
	 * Returns the value of the '<em><b>Attribute To Be Renamed Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute To Be Renamed Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute To Be Renamed Name</em>' attribute.
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getRenameAttribute_AttributeToBeRenamedName()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getAttributeToBeRenamedName();

} // RenameAttribute

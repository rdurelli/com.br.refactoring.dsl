/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br.refactoring.dsl.refactoring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encapsulate Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.br.refactoring.dsl.refactoring.EncapsulateField#getSourceClass <em>Source Class</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.EncapsulateField#getAttributeToEncapsulate <em>Attribute To Encapsulate</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.EncapsulateField#getSourceClassName <em>Source Class Name</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.EncapsulateField#getAttributeToEncapsulateName <em>Attribute To Encapsulate Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getEncapsulateField()
 * @model
 * @generated
 */
public interface EncapsulateField extends OrganizingData {
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
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getEncapsulateField_SourceClass()
	 * @model
	 * @generated
	 */
	com.br.refactoring.dsl.refactoring.Class getSourceClass();

	/**
	 * Sets the value of the '{@link com.br.refactoring.dsl.refactoring.EncapsulateField#getSourceClass <em>Source Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Class</em>' reference.
	 * @see #getSourceClass()
	 * @generated
	 */
	void setSourceClass(com.br.refactoring.dsl.refactoring.Class value);

	/**
	 * Returns the value of the '<em><b>Attribute To Encapsulate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute To Encapsulate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute To Encapsulate</em>' reference.
	 * @see #setAttributeToEncapsulate(Attribute)
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getEncapsulateField_AttributeToEncapsulate()
	 * @model
	 * @generated
	 */
	Attribute getAttributeToEncapsulate();

	/**
	 * Sets the value of the '{@link com.br.refactoring.dsl.refactoring.EncapsulateField#getAttributeToEncapsulate <em>Attribute To Encapsulate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute To Encapsulate</em>' reference.
	 * @see #getAttributeToEncapsulate()
	 * @generated
	 */
	void setAttributeToEncapsulate(Attribute value);

	/**
	 * Returns the value of the '<em><b>Source Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Class Name</em>' attribute.
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getEncapsulateField_SourceClassName()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getSourceClassName();

	/**
	 * Returns the value of the '<em><b>Attribute To Encapsulate Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute To Encapsulate Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute To Encapsulate Name</em>' attribute.
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getEncapsulateField_AttributeToEncapsulateName()
	 * @model default="" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getAttributeToEncapsulateName();

} // EncapsulateField

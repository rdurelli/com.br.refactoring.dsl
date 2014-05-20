/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br.refactoring.dsl.refactoring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Push Down Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.br.refactoring.dsl.refactoring.PushDownAttribute#getAttributeToBePushed <em>Attribute To Be Pushed</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.PushDownAttribute#getSourceClass <em>Source Class</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.PushDownAttribute#getTargetClass <em>Target Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getPushDownAttribute()
 * @model
 * @generated
 */
public interface PushDownAttribute extends DealingWithGeneralization {
	/**
	 * Returns the value of the '<em><b>Attribute To Be Pushed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute To Be Pushed</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute To Be Pushed</em>' reference.
	 * @see #setAttributeToBePushed(Attribute)
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getPushDownAttribute_AttributeToBePushed()
	 * @model
	 * @generated
	 */
	Attribute getAttributeToBePushed();

	/**
	 * Sets the value of the '{@link com.br.refactoring.dsl.refactoring.PushDownAttribute#getAttributeToBePushed <em>Attribute To Be Pushed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute To Be Pushed</em>' reference.
	 * @see #getAttributeToBePushed()
	 * @generated
	 */
	void setAttributeToBePushed(Attribute value);

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
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getPushDownAttribute_SourceClass()
	 * @model
	 * @generated
	 */
	com.br.refactoring.dsl.refactoring.Class getSourceClass();

	/**
	 * Sets the value of the '{@link com.br.refactoring.dsl.refactoring.PushDownAttribute#getSourceClass <em>Source Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Class</em>' reference.
	 * @see #getSourceClass()
	 * @generated
	 */
	void setSourceClass(com.br.refactoring.dsl.refactoring.Class value);

	/**
	 * Returns the value of the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Class</em>' reference.
	 * @see #setTargetClass(com.br.refactoring.dsl.refactoring.Class)
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getPushDownAttribute_TargetClass()
	 * @model
	 * @generated
	 */
	com.br.refactoring.dsl.refactoring.Class getTargetClass();

	/**
	 * Sets the value of the '{@link com.br.refactoring.dsl.refactoring.PushDownAttribute#getTargetClass <em>Target Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Class</em>' reference.
	 * @see #getTargetClass()
	 * @generated
	 */
	void setTargetClass(com.br.refactoring.dsl.refactoring.Class value);

} // PushDownAttribute

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br.refactoring.dsl.refactoring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.br.refactoring.dsl.refactoring.MoveMethod#getSourceClass <em>Source Class</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.MoveMethod#getTargetClass <em>Target Class</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.MoveMethod#getMethodToBeMoved <em>Method To Be Moved</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.MoveMethod#getSourceClassName <em>Source Class Name</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.MoveMethod#getTargetClassName <em>Target Class Name</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.MoveMethod#getMethodToBeMovedName <em>Method To Be Moved Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getMoveMethod()
 * @model
 * @generated
 */
public interface MoveMethod extends MovingFeaturesBetweenObjects {
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
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getMoveMethod_SourceClass()
	 * @model
	 * @generated
	 */
	com.br.refactoring.dsl.refactoring.Class getSourceClass();

	/**
	 * Sets the value of the '{@link com.br.refactoring.dsl.refactoring.MoveMethod#getSourceClass <em>Source Class</em>}' reference.
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
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getMoveMethod_TargetClass()
	 * @model
	 * @generated
	 */
	com.br.refactoring.dsl.refactoring.Class getTargetClass();

	/**
	 * Sets the value of the '{@link com.br.refactoring.dsl.refactoring.MoveMethod#getTargetClass <em>Target Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Class</em>' reference.
	 * @see #getTargetClass()
	 * @generated
	 */
	void setTargetClass(com.br.refactoring.dsl.refactoring.Class value);

	/**
	 * Returns the value of the '<em><b>Method To Be Moved</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method To Be Moved</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method To Be Moved</em>' reference.
	 * @see #setMethodToBeMoved(Method)
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getMoveMethod_MethodToBeMoved()
	 * @model
	 * @generated
	 */
	Method getMethodToBeMoved();

	/**
	 * Sets the value of the '{@link com.br.refactoring.dsl.refactoring.MoveMethod#getMethodToBeMoved <em>Method To Be Moved</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method To Be Moved</em>' reference.
	 * @see #getMethodToBeMoved()
	 * @generated
	 */
	void setMethodToBeMoved(Method value);

	/**
	 * Returns the value of the '<em><b>Source Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Class Name</em>' attribute.
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getMoveMethod_SourceClassName()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getSourceClassName();

	/**
	 * Returns the value of the '<em><b>Target Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Class Name</em>' attribute.
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getMoveMethod_TargetClassName()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getTargetClassName();

	/**
	 * Returns the value of the '<em><b>Method To Be Moved Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method To Be Moved Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method To Be Moved Name</em>' attribute.
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getMoveMethod_MethodToBeMovedName()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getMethodToBeMovedName();

} // MoveMethod

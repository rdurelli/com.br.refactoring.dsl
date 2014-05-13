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
 * A representation of the model object '<em><b>Dealing With Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.br.refactoring.dsl.refactoring.DealingWithGeneralization#getAllRefactorings <em>All Refactorings</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.DealingWithGeneralization#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getDealingWithGeneralization()
 * @model
 * @generated
 */
public interface DealingWithGeneralization extends Refactoring {
	/**
	 * Returns the value of the '<em><b>All Refactorings</b></em>' containment reference list.
	 * The list contents are of type {@link com.br.refactoring.dsl.refactoring.DealingWithGeneralization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Refactorings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Refactorings</em>' containment reference list.
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getDealingWithGeneralization_AllRefactorings()
	 * @model containment="true"
	 * @generated
	 */
	EList<DealingWithGeneralization> getAllRefactorings();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getDealingWithGeneralization_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.br.refactoring.dsl.refactoring.DealingWithGeneralization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DealingWithGeneralization

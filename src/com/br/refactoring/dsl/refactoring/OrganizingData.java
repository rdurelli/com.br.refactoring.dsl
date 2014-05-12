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
 * A representation of the model object '<em><b>Organizing Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.br.refactoring.dsl.refactoring.OrganizingData#getName <em>Name</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.OrganizingData#getAllRefactorings <em>All Refactorings</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getOrganizingData()
 * @model
 * @generated
 */
public interface OrganizingData extends Refactoring {
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
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getOrganizingData_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.br.refactoring.dsl.refactoring.OrganizingData#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>All Refactorings</b></em>' containment reference list.
	 * The list contents are of type {@link com.br.refactoring.dsl.refactoring.OrganizingData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Refactorings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Refactorings</em>' containment reference list.
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#getOrganizingData_AllRefactorings()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrganizingData> getAllRefactorings();

} // OrganizingData

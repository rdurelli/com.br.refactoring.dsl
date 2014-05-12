/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br.refactoring.dsl.refactoring;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage
 * @generated
 */
public interface RefactoringFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RefactoringFactory eINSTANCE = com.br.refactoring.dsl.refactoring.impl.RefactoringFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class</em>'.
	 * @generated
	 */
	Class createClass();

	/**
	 * Returns a new object of class '<em>Rename Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rename Feature</em>'.
	 * @generated
	 */
	RenameFeature createRenameFeature();

	/**
	 * Returns a new object of class '<em>Rename Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rename Class</em>'.
	 * @generated
	 */
	RenameClass createRenameClass();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method</em>'.
	 * @generated
	 */
	Method createMethod();

	/**
	 * Returns a new object of class '<em>Basic Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Type</em>'.
	 * @generated
	 */
	BasicType createBasicType();

	/**
	 * Returns a new object of class '<em>Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Type</em>'.
	 * @generated
	 */
	ClassType createClassType();

	/**
	 * Returns a new object of class '<em>Rename Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rename Attribute</em>'.
	 * @generated
	 */
	RenameAttribute createRenameAttribute();

	/**
	 * Returns a new object of class '<em>Rename Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rename Method</em>'.
	 * @generated
	 */
	RenameMethod createRenameMethod();

	/**
	 * Returns a new object of class '<em>Moving Features Between Objects</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Moving Features Between Objects</em>'.
	 * @generated
	 */
	MovingFeaturesBetweenObjects createMovingFeaturesBetweenObjects();

	/**
	 * Returns a new object of class '<em>Move Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Attribute</em>'.
	 * @generated
	 */
	MoveAttribute createMoveAttribute();

	/**
	 * Returns a new object of class '<em>Move Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Method</em>'.
	 * @generated
	 */
	MoveMethod createMoveMethod();

	/**
	 * Returns a new object of class '<em>Extract Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extract Class</em>'.
	 * @generated
	 */
	ExtractClass createExtractClass();

	/**
	 * Returns a new object of class '<em>Inline Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inline Class</em>'.
	 * @generated
	 */
	InlineClass createInlineClass();

	/**
	 * Returns a new object of class '<em>Organizing Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organizing Data</em>'.
	 * @generated
	 */
	OrganizingData createOrganizingData();

	/**
	 * Returns a new object of class '<em>Replace Data Value With Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Replace Data Value With Object</em>'.
	 * @generated
	 */
	ReplaceDataValueWithObject createReplaceDataValueWithObject();

	/**
	 * Returns a new object of class '<em>Encapsulate Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encapsulate Field</em>'.
	 * @generated
	 */
	EncapsulateField createEncapsulateField();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RefactoringPackage getRefactoringPackage();

} //RefactoringFactory

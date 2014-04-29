/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br.refactoring.dsl.refactoring;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.br.refactoring.dsl.refactoring.RefactoringFactory
 * @model kind="package"
 * @generated
 */
public interface RefactoringPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "refactoring";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://refactoring/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "refactoring";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RefactoringPackage eINSTANCE = com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.br.refactoring.dsl.refactoring.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br.refactoring.dsl.refactoring.impl.ModelImpl
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONTAINS = 1;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__IMPORTS = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.br.refactoring.dsl.refactoring.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br.refactoring.dsl.refactoring.impl.TypeImpl
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.br.refactoring.dsl.refactoring.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br.refactoring.dsl.refactoring.impl.ClassImpl
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link com.br.refactoring.dsl.refactoring.impl.RefactoringImpl <em>Refactoring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringImpl
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getRefactoring()
	 * @generated
	 */
	int REFACTORING = 3;

	/**
	 * The number of structural features of the '<em>Refactoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.br.refactoring.dsl.refactoring.impl.RenameFeatureImpl <em>Rename Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br.refactoring.dsl.refactoring.impl.RenameFeatureImpl
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getRenameFeature()
	 * @generated
	 */
	int RENAME_FEATURE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_FEATURE__NAME = REFACTORING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Refactorings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_FEATURE__ALL_REFACTORINGS = REFACTORING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rename Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_FEATURE_FEATURE_COUNT = REFACTORING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.br.refactoring.dsl.refactoring.impl.RenameClassImpl <em>Rename Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br.refactoring.dsl.refactoring.impl.RenameClassImpl
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getRenameClass()
	 * @generated
	 */
	int RENAME_CLASS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_CLASS__NAME = RENAME_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>All Refactorings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_CLASS__ALL_REFACTORINGS = RENAME_FEATURE__ALL_REFACTORINGS;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_CLASS__NEW_NAME = RENAME_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class To Be Rename</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_CLASS__CLASS_TO_BE_RENAME = RENAME_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rename Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_CLASS_FEATURE_COUNT = RENAME_FEATURE_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link com.br.refactoring.dsl.refactoring.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br.refactoring.dsl.refactoring.impl.ImportImpl
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 6;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORT_URI = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link com.br.refactoring.dsl.refactoring.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see com.br.refactoring.dsl.refactoring.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br.refactoring.dsl.refactoring.Model#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see com.br.refactoring.dsl.refactoring.Model#getContains()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Contains();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br.refactoring.dsl.refactoring.Model#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see com.br.refactoring.dsl.refactoring.Model#getImports()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Imports();

	/**
	 * Returns the meta object for class '{@link com.br.refactoring.dsl.refactoring.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see com.br.refactoring.dsl.refactoring.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link com.br.refactoring.dsl.refactoring.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see com.br.refactoring.dsl.refactoring.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Name();

	/**
	 * Returns the meta object for class '{@link com.br.refactoring.dsl.refactoring.Refactoring <em>Refactoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refactoring</em>'.
	 * @see com.br.refactoring.dsl.refactoring.Refactoring
	 * @generated
	 */
	EClass getRefactoring();

	/**
	 * Returns the meta object for class '{@link com.br.refactoring.dsl.refactoring.RenameFeature <em>Rename Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Feature</em>'.
	 * @see com.br.refactoring.dsl.refactoring.RenameFeature
	 * @generated
	 */
	EClass getRenameFeature();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.RenameFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.RenameFeature#getName()
	 * @see #getRenameFeature()
	 * @generated
	 */
	EAttribute getRenameFeature_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br.refactoring.dsl.refactoring.RenameFeature#getAllRefactorings <em>All Refactorings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Refactorings</em>'.
	 * @see com.br.refactoring.dsl.refactoring.RenameFeature#getAllRefactorings()
	 * @see #getRenameFeature()
	 * @generated
	 */
	EReference getRenameFeature_AllRefactorings();

	/**
	 * Returns the meta object for class '{@link com.br.refactoring.dsl.refactoring.RenameClass <em>Rename Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Class</em>'.
	 * @see com.br.refactoring.dsl.refactoring.RenameClass
	 * @generated
	 */
	EClass getRenameClass();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.RenameClass#getNewName <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.RenameClass#getNewName()
	 * @see #getRenameClass()
	 * @generated
	 */
	EAttribute getRenameClass_NewName();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.RenameClass#getClassToBeRename <em>Class To Be Rename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class To Be Rename</em>'.
	 * @see com.br.refactoring.dsl.refactoring.RenameClass#getClassToBeRename()
	 * @see #getRenameClass()
	 * @generated
	 */
	EReference getRenameClass_ClassToBeRename();

	/**
	 * Returns the meta object for class '{@link com.br.refactoring.dsl.refactoring.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see com.br.refactoring.dsl.refactoring.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.Import#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see com.br.refactoring.dsl.refactoring.Import#getImportURI()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportURI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RefactoringFactory getRefactoringFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.br.refactoring.dsl.refactoring.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.br.refactoring.dsl.refactoring.impl.ModelImpl
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONTAINS = eINSTANCE.getModel_Contains();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

		/**
		 * The meta object literal for the '{@link com.br.refactoring.dsl.refactoring.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.br.refactoring.dsl.refactoring.impl.TypeImpl
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link com.br.refactoring.dsl.refactoring.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.br.refactoring.dsl.refactoring.impl.ClassImpl
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

		/**
		 * The meta object literal for the '{@link com.br.refactoring.dsl.refactoring.impl.RefactoringImpl <em>Refactoring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringImpl
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getRefactoring()
		 * @generated
		 */
		EClass REFACTORING = eINSTANCE.getRefactoring();

		/**
		 * The meta object literal for the '{@link com.br.refactoring.dsl.refactoring.impl.RenameFeatureImpl <em>Rename Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.br.refactoring.dsl.refactoring.impl.RenameFeatureImpl
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getRenameFeature()
		 * @generated
		 */
		EClass RENAME_FEATURE = eINSTANCE.getRenameFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_FEATURE__NAME = eINSTANCE.getRenameFeature_Name();

		/**
		 * The meta object literal for the '<em><b>All Refactorings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENAME_FEATURE__ALL_REFACTORINGS = eINSTANCE.getRenameFeature_AllRefactorings();

		/**
		 * The meta object literal for the '{@link com.br.refactoring.dsl.refactoring.impl.RenameClassImpl <em>Rename Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.br.refactoring.dsl.refactoring.impl.RenameClassImpl
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getRenameClass()
		 * @generated
		 */
		EClass RENAME_CLASS = eINSTANCE.getRenameClass();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_CLASS__NEW_NAME = eINSTANCE.getRenameClass_NewName();

		/**
		 * The meta object literal for the '<em><b>Class To Be Rename</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENAME_CLASS__CLASS_TO_BE_RENAME = eINSTANCE.getRenameClass_ClassToBeRename();

		/**
		 * The meta object literal for the '{@link com.br.refactoring.dsl.refactoring.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.br.refactoring.dsl.refactoring.impl.ImportImpl
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

	}

} //RefactoringPackage

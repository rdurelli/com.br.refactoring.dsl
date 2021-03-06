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
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ATTRIBUTES = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__METHODS = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Class To Be Renamed Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_CLASS__CLASS_TO_BE_RENAMED_NAME = RENAME_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rename Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_CLASS_FEATURE_COUNT = RENAME_FEATURE_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link com.br.refactoring.dsl.refactoring.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br.refactoring.dsl.refactoring.impl.AttributeImpl
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ELEMENT_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.br.refactoring.dsl.refactoring.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br.refactoring.dsl.refactoring.impl.MethodImpl
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 0;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link com.br.refactoring.dsl.refactoring.impl.ElementTypeImpl <em>Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br.refactoring.dsl.refactoring.impl.ElementTypeImpl
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getElementType()
	 * @generated
	 */
	int ELEMENT_TYPE = 9;

	/**
	 * The number of structural features of the '<em>Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.br.refactoring.dsl.refactoring.impl.BasicTypeImpl <em>Basic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br.refactoring.dsl.refactoring.impl.BasicTypeImpl
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getBasicType()
	 * @generated
	 */
	int BASIC_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__TYPE_NAME = ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.br.refactoring.dsl.refactoring.impl.ClassTypeImpl <em>Class Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br.refactoring.dsl.refactoring.impl.ClassTypeImpl
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getClassType()
	 * @generated
	 */
	int CLASS_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Class Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__CLASS_TYPE = ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link com.br.refactoring.dsl.refactoring.impl.RenameAttributeImpl <em>Rename Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br.refactoring.dsl.refactoring.impl.RenameAttributeImpl
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getRenameAttribute()
	 * @generated
	 */
	int RENAME_ATTRIBUTE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_ATTRIBUTE__NAME = RENAME_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>All Refactorings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_ATTRIBUTE__ALL_REFACTORINGS = RENAME_FEATURE__ALL_REFACTORINGS;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_ATTRIBUTE__NEW_NAME = RENAME_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute To Be Rename</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_ATTRIBUTE__ATTRIBUTE_TO_BE_RENAME = RENAME_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_ATTRIBUTE__SOURCE_CLASS = RENAME_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_ATTRIBUTE__SOURCE_CLASS_NAME = RENAME_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attribute To Be Renamed Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_ATTRIBUTE__ATTRIBUTE_TO_BE_RENAMED_NAME = RENAME_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Rename Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_ATTRIBUTE_FEATURE_COUNT = RENAME_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.br.refactoring.dsl.refactoring.impl.RenameMethodImpl <em>Rename Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br.refactoring.dsl.refactoring.impl.RenameMethodImpl
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getRenameMethod()
	 * @generated
	 */
	int RENAME_METHOD = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_METHOD__NAME = RENAME_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>All Refactorings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_METHOD__ALL_REFACTORINGS = RENAME_FEATURE__ALL_REFACTORINGS;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_METHOD__NEW_NAME = RENAME_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method To Be Rename</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_METHOD__METHOD_TO_BE_RENAME = RENAME_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_METHOD__SOURCE_CLASS = RENAME_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_METHOD__SOURCE_CLASS_NAME = RENAME_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Method To Be Renamed Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_METHOD__METHOD_TO_BE_RENAMED_NAME = RENAME_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Rename Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_METHOD_FEATURE_COUNT = RENAME_FEATURE_FEATURE_COUNT + 5;


	/**
	 * The meta object id for the '{@link com.br.refactoring.dsl.refactoring.impl.MovingFeaturesBetweenObjectsImpl <em>Moving Features Between Objects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br.refactoring.dsl.refactoring.impl.MovingFeaturesBetweenObjectsImpl
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getMovingFeaturesBetweenObjects()
	 * @generated
	 */
	int MOVING_FEATURES_BETWEEN_OBJECTS = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVING_FEATURES_BETWEEN_OBJECTS__NAME = REFACTORING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Refactorings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVING_FEATURES_BETWEEN_OBJECTS__ALL_REFACTORINGS = REFACTORING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Moving Features Between Objects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVING_FEATURES_BETWEEN_OBJECTS_FEATURE_COUNT = REFACTORING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.br.refactoring.dsl.refactoring.impl.MoveAttributeImpl <em>Move Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br.refactoring.dsl.refactoring.impl.MoveAttributeImpl
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getMoveAttribute()
	 * @generated
	 */
	int MOVE_ATTRIBUTE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ATTRIBUTE__NAME = MOVING_FEATURES_BETWEEN_OBJECTS__NAME;

	/**
	 * The feature id for the '<em><b>All Refactorings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ATTRIBUTE__ALL_REFACTORINGS = MOVING_FEATURES_BETWEEN_OBJECTS__ALL_REFACTORINGS;

	/**
	 * The feature id for the '<em><b>Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ATTRIBUTE__SOURCE_CLASS = MOVING_FEATURES_BETWEEN_OBJECTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ATTRIBUTE__TARGET_CLASS = MOVING_FEATURES_BETWEEN_OBJECTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attribute To Be Moved</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ATTRIBUTE__ATTRIBUTE_TO_BE_MOVED = MOVING_FEATURES_BETWEEN_OBJECTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ATTRIBUTE__SOURCE_CLASS_NAME = MOVING_FEATURES_BETWEEN_OBJECTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ATTRIBUTE__TARGET_CLASS_NAME = MOVING_FEATURES_BETWEEN_OBJECTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attribute To Be Moved Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ATTRIBUTE__ATTRIBUTE_TO_BE_MOVED_NAME = MOVING_FEATURES_BETWEEN_OBJECTS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Move Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ATTRIBUTE_FEATURE_COUNT = MOVING_FEATURES_BETWEEN_OBJECTS_FEATURE_COUNT + 6;


	/**
	 * The meta object id for the '{@link com.br.refactoring.dsl.refactoring.impl.MoveMethodImpl <em>Move Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br.refactoring.dsl.refactoring.impl.MoveMethodImpl
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getMoveMethod()
	 * @generated
	 */
	int MOVE_METHOD = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_METHOD__NAME = MOVING_FEATURES_BETWEEN_OBJECTS__NAME;

	/**
	 * The feature id for the '<em><b>All Refactorings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_METHOD__ALL_REFACTORINGS = MOVING_FEATURES_BETWEEN_OBJECTS__ALL_REFACTORINGS;

	/**
	 * The feature id for the '<em><b>Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_METHOD__SOURCE_CLASS = MOVING_FEATURES_BETWEEN_OBJECTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_METHOD__TARGET_CLASS = MOVING_FEATURES_BETWEEN_OBJECTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method To Be Moved</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_METHOD__METHOD_TO_BE_MOVED = MOVING_FEATURES_BETWEEN_OBJECTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_METHOD__SOURCE_CLASS_NAME = MOVING_FEATURES_BETWEEN_OBJECTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_METHOD__TARGET_CLASS_NAME = MOVING_FEATURES_BETWEEN_OBJECTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Method To Be Moved Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_METHOD__METHOD_TO_BE_MOVED_NAME = MOVING_FEATURES_BETWEEN_OBJECTS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Move Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_METHOD_FEATURE_COUNT = MOVING_FEATURES_BETWEEN_OBJECTS_FEATURE_COUNT + 6;


	/**
	 * The meta object id for the '{@link com.br.refactoring.dsl.refactoring.impl.ExtractClassImpl <em>Extract Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br.refactoring.dsl.refactoring.impl.ExtractClassImpl
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getExtractClass()
	 * @generated
	 */
	int EXTRACT_CLASS = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_CLASS__NAME = MOVING_FEATURES_BETWEEN_OBJECTS__NAME;

	/**
	 * The feature id for the '<em><b>All Refactorings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_CLASS__ALL_REFACTORINGS = MOVING_FEATURES_BETWEEN_OBJECTS__ALL_REFACTORINGS;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_CLASS__NEW_NAME = MOVING_FEATURES_BETWEEN_OBJECTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_CLASS__SOURCE_CLASS = MOVING_FEATURES_BETWEEN_OBJECTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes To Be Moved</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_CLASS__ATTRIBUTES_TO_BE_MOVED = MOVING_FEATURES_BETWEEN_OBJECTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes To Be Moved Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_CLASS__ATTRIBUTES_TO_BE_MOVED_NAME = MOVING_FEATURES_BETWEEN_OBJECTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_CLASS__SOURCE_CLASS_NAME = MOVING_FEATURES_BETWEEN_OBJECTS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Extract Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_CLASS_FEATURE_COUNT = MOVING_FEATURES_BETWEEN_OBJECTS_FEATURE_COUNT + 5;


	/**
	 * The meta object id for the '{@link com.br.refactoring.dsl.refactoring.impl.InlineClassImpl <em>Inline Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br.refactoring.dsl.refactoring.impl.InlineClassImpl
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getInlineClass()
	 * @generated
	 */
	int INLINE_CLASS = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_CLASS__NAME = MOVING_FEATURES_BETWEEN_OBJECTS__NAME;

	/**
	 * The feature id for the '<em><b>All Refactorings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_CLASS__ALL_REFACTORINGS = MOVING_FEATURES_BETWEEN_OBJECTS__ALL_REFACTORINGS;

	/**
	 * The feature id for the '<em><b>Class To Get All Features</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_CLASS__CLASS_TO_GET_ALL_FEATURES = MOVING_FEATURES_BETWEEN_OBJECTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class To Remove</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_CLASS__CLASS_TO_REMOVE = MOVING_FEATURES_BETWEEN_OBJECTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Class To Get All Features Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_CLASS__CLASS_TO_GET_ALL_FEATURES_NAME = MOVING_FEATURES_BETWEEN_OBJECTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Class To Remove Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_CLASS__CLASS_TO_REMOVE_NAME = MOVING_FEATURES_BETWEEN_OBJECTS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Inline Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_CLASS_FEATURE_COUNT = MOVING_FEATURES_BETWEEN_OBJECTS_FEATURE_COUNT + 4;


	/**
	 * The meta object id for the '{@link com.br.refactoring.dsl.refactoring.impl.OrganizingDataImpl <em>Organizing Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br.refactoring.dsl.refactoring.impl.OrganizingDataImpl
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getOrganizingData()
	 * @generated
	 */
	int ORGANIZING_DATA = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZING_DATA__NAME = REFACTORING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Refactorings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZING_DATA__ALL_REFACTORINGS = REFACTORING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Organizing Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZING_DATA_FEATURE_COUNT = REFACTORING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.br.refactoring.dsl.refactoring.impl.ReplaceDataValueWithObjectImpl <em>Replace Data Value With Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br.refactoring.dsl.refactoring.impl.ReplaceDataValueWithObjectImpl
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getReplaceDataValueWithObject()
	 * @generated
	 */
	int REPLACE_DATA_VALUE_WITH_OBJECT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_DATA_VALUE_WITH_OBJECT__NAME = ORGANIZING_DATA__NAME;

	/**
	 * The feature id for the '<em><b>All Refactorings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_DATA_VALUE_WITH_OBJECT__ALL_REFACTORINGS = ORGANIZING_DATA__ALL_REFACTORINGS;

	/**
	 * The feature id for the '<em><b>Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_DATA_VALUE_WITH_OBJECT__SOURCE_CLASS = ORGANIZING_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute To Replace Data With Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_DATA_VALUE_WITH_OBJECT__ATTRIBUTE_TO_REPLACE_DATA_WITH_OBJECT = ORGANIZING_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_DATA_VALUE_WITH_OBJECT__NEW_ATTRIBUTES = ORGANIZING_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_DATA_VALUE_WITH_OBJECT__SOURCE_CLASS_NAME = ORGANIZING_DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attribute To Replace Data With Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_DATA_VALUE_WITH_OBJECT__ATTRIBUTE_TO_REPLACE_DATA_WITH_OBJECT_NAME = ORGANIZING_DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New Attributes Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_DATA_VALUE_WITH_OBJECT__NEW_ATTRIBUTES_NAME = ORGANIZING_DATA_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Replace Data Value With Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_DATA_VALUE_WITH_OBJECT_FEATURE_COUNT = ORGANIZING_DATA_FEATURE_COUNT + 6;


	/**
	 * The meta object id for the '{@link com.br.refactoring.dsl.refactoring.impl.EncapsulateFieldImpl <em>Encapsulate Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br.refactoring.dsl.refactoring.impl.EncapsulateFieldImpl
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getEncapsulateField()
	 * @generated
	 */
	int ENCAPSULATE_FIELD = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATE_FIELD__NAME = ORGANIZING_DATA__NAME;

	/**
	 * The feature id for the '<em><b>All Refactorings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATE_FIELD__ALL_REFACTORINGS = ORGANIZING_DATA__ALL_REFACTORINGS;

	/**
	 * The feature id for the '<em><b>Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATE_FIELD__SOURCE_CLASS = ORGANIZING_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute To Encapsulate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATE_FIELD__ATTRIBUTE_TO_ENCAPSULATE = ORGANIZING_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATE_FIELD__SOURCE_CLASS_NAME = ORGANIZING_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attribute To Encapsulate Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATE_FIELD__ATTRIBUTE_TO_ENCAPSULATE_NAME = ORGANIZING_DATA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Encapsulate Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATE_FIELD_FEATURE_COUNT = ORGANIZING_DATA_FEATURE_COUNT + 4;


	/**
	 * The meta object id for the '{@link com.br.refactoring.dsl.refactoring.impl.DealingWithGeneralizationImpl <em>Dealing With Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br.refactoring.dsl.refactoring.impl.DealingWithGeneralizationImpl
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getDealingWithGeneralization()
	 * @generated
	 */
	int DEALING_WITH_GENERALIZATION = 22;

	/**
	 * The feature id for the '<em><b>All Refactorings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEALING_WITH_GENERALIZATION__ALL_REFACTORINGS = REFACTORING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEALING_WITH_GENERALIZATION__NAME = REFACTORING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dealing With Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEALING_WITH_GENERALIZATION_FEATURE_COUNT = REFACTORING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.br.refactoring.dsl.refactoring.impl.PushDownMethodImpl <em>Push Down Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br.refactoring.dsl.refactoring.impl.PushDownMethodImpl
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getPushDownMethod()
	 * @generated
	 */
	int PUSH_DOWN_METHOD = 23;

	/**
	 * The feature id for the '<em><b>All Refactorings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_DOWN_METHOD__ALL_REFACTORINGS = DEALING_WITH_GENERALIZATION__ALL_REFACTORINGS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_DOWN_METHOD__NAME = DEALING_WITH_GENERALIZATION__NAME;

	/**
	 * The feature id for the '<em><b>Method To Be Pushed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_DOWN_METHOD__METHOD_TO_BE_PUSHED = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_DOWN_METHOD__SOURCE_CLASS = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_DOWN_METHOD__TARGET_CLASS = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_DOWN_METHOD__SOURCE_CLASS_NAME = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_DOWN_METHOD__TARGET_CLASS_NAME = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Method To Be Pushed Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_DOWN_METHOD__METHOD_TO_BE_PUSHED_NAME = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Push Down Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_DOWN_METHOD_FEATURE_COUNT = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 6;


	/**
	 * The meta object id for the '{@link com.br.refactoring.dsl.refactoring.impl.PushDownAttributeImpl <em>Push Down Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br.refactoring.dsl.refactoring.impl.PushDownAttributeImpl
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getPushDownAttribute()
	 * @generated
	 */
	int PUSH_DOWN_ATTRIBUTE = 24;

	/**
	 * The feature id for the '<em><b>All Refactorings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_DOWN_ATTRIBUTE__ALL_REFACTORINGS = DEALING_WITH_GENERALIZATION__ALL_REFACTORINGS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_DOWN_ATTRIBUTE__NAME = DEALING_WITH_GENERALIZATION__NAME;

	/**
	 * The feature id for the '<em><b>Attribute To Be Pushed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_DOWN_ATTRIBUTE__ATTRIBUTE_TO_BE_PUSHED = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_DOWN_ATTRIBUTE__SOURCE_CLASS = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_DOWN_ATTRIBUTE__TARGET_CLASS = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_DOWN_ATTRIBUTE__SOURCE_CLASS_NAME = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_DOWN_ATTRIBUTE__TARGET_CLASS_NAME = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attribute To Be Pushed Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_DOWN_ATTRIBUTE__ATTRIBUTE_TO_BE_PUSHED_NAME = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Push Down Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_DOWN_ATTRIBUTE_FEATURE_COUNT = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 6;


	/**
	 * The meta object id for the '{@link com.br.refactoring.dsl.refactoring.impl.PullUpAttributeImpl <em>Pull Up Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br.refactoring.dsl.refactoring.impl.PullUpAttributeImpl
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getPullUpAttribute()
	 * @generated
	 */
	int PULL_UP_ATTRIBUTE = 25;

	/**
	 * The feature id for the '<em><b>All Refactorings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_UP_ATTRIBUTE__ALL_REFACTORINGS = DEALING_WITH_GENERALIZATION__ALL_REFACTORINGS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_UP_ATTRIBUTE__NAME = DEALING_WITH_GENERALIZATION__NAME;

	/**
	 * The feature id for the '<em><b>Attribute To Be Pulled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_UP_ATTRIBUTE__ATTRIBUTE_TO_BE_PULLED = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_UP_ATTRIBUTE__SOURCE_CLASS = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_UP_ATTRIBUTE__TARGET_CLASS = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_UP_ATTRIBUTE__SOURCE_CLASS_NAME = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_UP_ATTRIBUTE__TARGET_CLASS_NAME = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attribute To Be Pulled Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_UP_ATTRIBUTE__ATTRIBUTE_TO_BE_PULLED_NAME = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Pull Up Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_UP_ATTRIBUTE_FEATURE_COUNT = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 6;


	/**
	 * The meta object id for the '{@link com.br.refactoring.dsl.refactoring.impl.PullUpMethodImpl <em>Pull Up Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.br.refactoring.dsl.refactoring.impl.PullUpMethodImpl
	 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getPullUpMethod()
	 * @generated
	 */
	int PULL_UP_METHOD = 26;

	/**
	 * The feature id for the '<em><b>All Refactorings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_UP_METHOD__ALL_REFACTORINGS = DEALING_WITH_GENERALIZATION__ALL_REFACTORINGS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_UP_METHOD__NAME = DEALING_WITH_GENERALIZATION__NAME;

	/**
	 * The feature id for the '<em><b>Method To Be Pulled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_UP_METHOD__METHOD_TO_BE_PULLED = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_UP_METHOD__SOURCE_CLASS = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_UP_METHOD__TARGET_CLASS = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_UP_METHOD__SOURCE_CLASS_NAME = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_UP_METHOD__TARGET_CLASS_NAME = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Method To Be Pulled Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_UP_METHOD__METHOD_TO_BE_PULLED_NAME = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Pull Up Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_UP_METHOD_FEATURE_COUNT = DEALING_WITH_GENERALIZATION_FEATURE_COUNT + 6;


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
	 * Returns the meta object for the containment reference list '{@link com.br.refactoring.dsl.refactoring.Class#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see com.br.refactoring.dsl.refactoring.Class#getAttributes()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br.refactoring.dsl.refactoring.Class#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see com.br.refactoring.dsl.refactoring.Class#getMethods()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Methods();

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
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.RenameClass#getClassToBeRenamedName <em>Class To Be Renamed Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class To Be Renamed Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.RenameClass#getClassToBeRenamedName()
	 * @see #getRenameClass()
	 * @generated
	 */
	EAttribute getRenameClass_ClassToBeRenamedName();

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
	 * Returns the meta object for class '{@link com.br.refactoring.dsl.refactoring.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see com.br.refactoring.dsl.refactoring.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.br.refactoring.dsl.refactoring.Attribute#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Type</em>'.
	 * @see com.br.refactoring.dsl.refactoring.Attribute#getElementType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_ElementType();

	/**
	 * Returns the meta object for class '{@link com.br.refactoring.dsl.refactoring.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see com.br.refactoring.dsl.refactoring.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for class '{@link com.br.refactoring.dsl.refactoring.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Type</em>'.
	 * @see com.br.refactoring.dsl.refactoring.ElementType
	 * @generated
	 */
	EClass getElementType();

	/**
	 * Returns the meta object for class '{@link com.br.refactoring.dsl.refactoring.BasicType <em>Basic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Type</em>'.
	 * @see com.br.refactoring.dsl.refactoring.BasicType
	 * @generated
	 */
	EClass getBasicType();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.BasicType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.BasicType#getTypeName()
	 * @see #getBasicType()
	 * @generated
	 */
	EAttribute getBasicType_TypeName();

	/**
	 * Returns the meta object for class '{@link com.br.refactoring.dsl.refactoring.ClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Type</em>'.
	 * @see com.br.refactoring.dsl.refactoring.ClassType
	 * @generated
	 */
	EClass getClassType();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.ClassType#getClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class Type</em>'.
	 * @see com.br.refactoring.dsl.refactoring.ClassType#getClassType()
	 * @see #getClassType()
	 * @generated
	 */
	EReference getClassType_ClassType();

	/**
	 * Returns the meta object for class '{@link com.br.refactoring.dsl.refactoring.RenameAttribute <em>Rename Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Attribute</em>'.
	 * @see com.br.refactoring.dsl.refactoring.RenameAttribute
	 * @generated
	 */
	EClass getRenameAttribute();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.RenameAttribute#getNewName <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.RenameAttribute#getNewName()
	 * @see #getRenameAttribute()
	 * @generated
	 */
	EAttribute getRenameAttribute_NewName();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.RenameAttribute#getAttributeToBeRename <em>Attribute To Be Rename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute To Be Rename</em>'.
	 * @see com.br.refactoring.dsl.refactoring.RenameAttribute#getAttributeToBeRename()
	 * @see #getRenameAttribute()
	 * @generated
	 */
	EReference getRenameAttribute_AttributeToBeRename();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.RenameAttribute#getSourceClass <em>Source Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Class</em>'.
	 * @see com.br.refactoring.dsl.refactoring.RenameAttribute#getSourceClass()
	 * @see #getRenameAttribute()
	 * @generated
	 */
	EReference getRenameAttribute_SourceClass();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.RenameAttribute#getSourceClassName <em>Source Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Class Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.RenameAttribute#getSourceClassName()
	 * @see #getRenameAttribute()
	 * @generated
	 */
	EAttribute getRenameAttribute_SourceClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.RenameAttribute#getAttributeToBeRenamedName <em>Attribute To Be Renamed Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute To Be Renamed Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.RenameAttribute#getAttributeToBeRenamedName()
	 * @see #getRenameAttribute()
	 * @generated
	 */
	EAttribute getRenameAttribute_AttributeToBeRenamedName();

	/**
	 * Returns the meta object for class '{@link com.br.refactoring.dsl.refactoring.RenameMethod <em>Rename Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Method</em>'.
	 * @see com.br.refactoring.dsl.refactoring.RenameMethod
	 * @generated
	 */
	EClass getRenameMethod();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.RenameMethod#getNewName <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.RenameMethod#getNewName()
	 * @see #getRenameMethod()
	 * @generated
	 */
	EAttribute getRenameMethod_NewName();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.RenameMethod#getMethodToBeRename <em>Method To Be Rename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method To Be Rename</em>'.
	 * @see com.br.refactoring.dsl.refactoring.RenameMethod#getMethodToBeRename()
	 * @see #getRenameMethod()
	 * @generated
	 */
	EReference getRenameMethod_MethodToBeRename();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.RenameMethod#getSourceClass <em>Source Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Class</em>'.
	 * @see com.br.refactoring.dsl.refactoring.RenameMethod#getSourceClass()
	 * @see #getRenameMethod()
	 * @generated
	 */
	EReference getRenameMethod_SourceClass();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.RenameMethod#getSourceClassName <em>Source Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Class Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.RenameMethod#getSourceClassName()
	 * @see #getRenameMethod()
	 * @generated
	 */
	EAttribute getRenameMethod_SourceClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.RenameMethod#getMethodToBeRenamedName <em>Method To Be Renamed Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method To Be Renamed Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.RenameMethod#getMethodToBeRenamedName()
	 * @see #getRenameMethod()
	 * @generated
	 */
	EAttribute getRenameMethod_MethodToBeRenamedName();

	/**
	 * Returns the meta object for class '{@link com.br.refactoring.dsl.refactoring.MovingFeaturesBetweenObjects <em>Moving Features Between Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moving Features Between Objects</em>'.
	 * @see com.br.refactoring.dsl.refactoring.MovingFeaturesBetweenObjects
	 * @generated
	 */
	EClass getMovingFeaturesBetweenObjects();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.MovingFeaturesBetweenObjects#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.MovingFeaturesBetweenObjects#getName()
	 * @see #getMovingFeaturesBetweenObjects()
	 * @generated
	 */
	EAttribute getMovingFeaturesBetweenObjects_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br.refactoring.dsl.refactoring.MovingFeaturesBetweenObjects#getAllRefactorings <em>All Refactorings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Refactorings</em>'.
	 * @see com.br.refactoring.dsl.refactoring.MovingFeaturesBetweenObjects#getAllRefactorings()
	 * @see #getMovingFeaturesBetweenObjects()
	 * @generated
	 */
	EReference getMovingFeaturesBetweenObjects_AllRefactorings();

	/**
	 * Returns the meta object for class '{@link com.br.refactoring.dsl.refactoring.MoveAttribute <em>Move Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Attribute</em>'.
	 * @see com.br.refactoring.dsl.refactoring.MoveAttribute
	 * @generated
	 */
	EClass getMoveAttribute();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.MoveAttribute#getSourceClass <em>Source Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Class</em>'.
	 * @see com.br.refactoring.dsl.refactoring.MoveAttribute#getSourceClass()
	 * @see #getMoveAttribute()
	 * @generated
	 */
	EReference getMoveAttribute_SourceClass();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.MoveAttribute#getTargetClass <em>Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Class</em>'.
	 * @see com.br.refactoring.dsl.refactoring.MoveAttribute#getTargetClass()
	 * @see #getMoveAttribute()
	 * @generated
	 */
	EReference getMoveAttribute_TargetClass();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.MoveAttribute#getAttributeToBeMoved <em>Attribute To Be Moved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute To Be Moved</em>'.
	 * @see com.br.refactoring.dsl.refactoring.MoveAttribute#getAttributeToBeMoved()
	 * @see #getMoveAttribute()
	 * @generated
	 */
	EReference getMoveAttribute_AttributeToBeMoved();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.MoveAttribute#getSourceClassName <em>Source Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Class Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.MoveAttribute#getSourceClassName()
	 * @see #getMoveAttribute()
	 * @generated
	 */
	EAttribute getMoveAttribute_SourceClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.MoveAttribute#getTargetClassName <em>Target Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Class Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.MoveAttribute#getTargetClassName()
	 * @see #getMoveAttribute()
	 * @generated
	 */
	EAttribute getMoveAttribute_TargetClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.MoveAttribute#getAttributeToBeMovedName <em>Attribute To Be Moved Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute To Be Moved Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.MoveAttribute#getAttributeToBeMovedName()
	 * @see #getMoveAttribute()
	 * @generated
	 */
	EAttribute getMoveAttribute_AttributeToBeMovedName();

	/**
	 * Returns the meta object for class '{@link com.br.refactoring.dsl.refactoring.MoveMethod <em>Move Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Method</em>'.
	 * @see com.br.refactoring.dsl.refactoring.MoveMethod
	 * @generated
	 */
	EClass getMoveMethod();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.MoveMethod#getSourceClass <em>Source Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Class</em>'.
	 * @see com.br.refactoring.dsl.refactoring.MoveMethod#getSourceClass()
	 * @see #getMoveMethod()
	 * @generated
	 */
	EReference getMoveMethod_SourceClass();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.MoveMethod#getTargetClass <em>Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Class</em>'.
	 * @see com.br.refactoring.dsl.refactoring.MoveMethod#getTargetClass()
	 * @see #getMoveMethod()
	 * @generated
	 */
	EReference getMoveMethod_TargetClass();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.MoveMethod#getMethodToBeMoved <em>Method To Be Moved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method To Be Moved</em>'.
	 * @see com.br.refactoring.dsl.refactoring.MoveMethod#getMethodToBeMoved()
	 * @see #getMoveMethod()
	 * @generated
	 */
	EReference getMoveMethod_MethodToBeMoved();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.MoveMethod#getSourceClassName <em>Source Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Class Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.MoveMethod#getSourceClassName()
	 * @see #getMoveMethod()
	 * @generated
	 */
	EAttribute getMoveMethod_SourceClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.MoveMethod#getTargetClassName <em>Target Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Class Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.MoveMethod#getTargetClassName()
	 * @see #getMoveMethod()
	 * @generated
	 */
	EAttribute getMoveMethod_TargetClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.MoveMethod#getMethodToBeMovedName <em>Method To Be Moved Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method To Be Moved Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.MoveMethod#getMethodToBeMovedName()
	 * @see #getMoveMethod()
	 * @generated
	 */
	EAttribute getMoveMethod_MethodToBeMovedName();

	/**
	 * Returns the meta object for class '{@link com.br.refactoring.dsl.refactoring.ExtractClass <em>Extract Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extract Class</em>'.
	 * @see com.br.refactoring.dsl.refactoring.ExtractClass
	 * @generated
	 */
	EClass getExtractClass();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.ExtractClass#getNewName <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.ExtractClass#getNewName()
	 * @see #getExtractClass()
	 * @generated
	 */
	EAttribute getExtractClass_NewName();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.ExtractClass#getSourceClass <em>Source Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Class</em>'.
	 * @see com.br.refactoring.dsl.refactoring.ExtractClass#getSourceClass()
	 * @see #getExtractClass()
	 * @generated
	 */
	EReference getExtractClass_SourceClass();

	/**
	 * Returns the meta object for the reference list '{@link com.br.refactoring.dsl.refactoring.ExtractClass#getAttributesToBeMoved <em>Attributes To Be Moved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes To Be Moved</em>'.
	 * @see com.br.refactoring.dsl.refactoring.ExtractClass#getAttributesToBeMoved()
	 * @see #getExtractClass()
	 * @generated
	 */
	EReference getExtractClass_AttributesToBeMoved();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.ExtractClass#getAttributesToBeMovedName <em>Attributes To Be Moved Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attributes To Be Moved Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.ExtractClass#getAttributesToBeMovedName()
	 * @see #getExtractClass()
	 * @generated
	 */
	EAttribute getExtractClass_AttributesToBeMovedName();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.ExtractClass#getSourceClassName <em>Source Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Class Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.ExtractClass#getSourceClassName()
	 * @see #getExtractClass()
	 * @generated
	 */
	EAttribute getExtractClass_SourceClassName();

	/**
	 * Returns the meta object for class '{@link com.br.refactoring.dsl.refactoring.InlineClass <em>Inline Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Class</em>'.
	 * @see com.br.refactoring.dsl.refactoring.InlineClass
	 * @generated
	 */
	EClass getInlineClass();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.InlineClass#getClassToGetAllFeatures <em>Class To Get All Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class To Get All Features</em>'.
	 * @see com.br.refactoring.dsl.refactoring.InlineClass#getClassToGetAllFeatures()
	 * @see #getInlineClass()
	 * @generated
	 */
	EReference getInlineClass_ClassToGetAllFeatures();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.InlineClass#getClassToRemove <em>Class To Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class To Remove</em>'.
	 * @see com.br.refactoring.dsl.refactoring.InlineClass#getClassToRemove()
	 * @see #getInlineClass()
	 * @generated
	 */
	EReference getInlineClass_ClassToRemove();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.InlineClass#getClassToGetAllFeaturesName <em>Class To Get All Features Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class To Get All Features Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.InlineClass#getClassToGetAllFeaturesName()
	 * @see #getInlineClass()
	 * @generated
	 */
	EAttribute getInlineClass_ClassToGetAllFeaturesName();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.InlineClass#getClassToRemoveName <em>Class To Remove Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class To Remove Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.InlineClass#getClassToRemoveName()
	 * @see #getInlineClass()
	 * @generated
	 */
	EAttribute getInlineClass_ClassToRemoveName();

	/**
	 * Returns the meta object for class '{@link com.br.refactoring.dsl.refactoring.OrganizingData <em>Organizing Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organizing Data</em>'.
	 * @see com.br.refactoring.dsl.refactoring.OrganizingData
	 * @generated
	 */
	EClass getOrganizingData();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.OrganizingData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.OrganizingData#getName()
	 * @see #getOrganizingData()
	 * @generated
	 */
	EAttribute getOrganizingData_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br.refactoring.dsl.refactoring.OrganizingData#getAllRefactorings <em>All Refactorings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Refactorings</em>'.
	 * @see com.br.refactoring.dsl.refactoring.OrganizingData#getAllRefactorings()
	 * @see #getOrganizingData()
	 * @generated
	 */
	EReference getOrganizingData_AllRefactorings();

	/**
	 * Returns the meta object for class '{@link com.br.refactoring.dsl.refactoring.ReplaceDataValueWithObject <em>Replace Data Value With Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replace Data Value With Object</em>'.
	 * @see com.br.refactoring.dsl.refactoring.ReplaceDataValueWithObject
	 * @generated
	 */
	EClass getReplaceDataValueWithObject();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.ReplaceDataValueWithObject#getSourceClass <em>Source Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Class</em>'.
	 * @see com.br.refactoring.dsl.refactoring.ReplaceDataValueWithObject#getSourceClass()
	 * @see #getReplaceDataValueWithObject()
	 * @generated
	 */
	EReference getReplaceDataValueWithObject_SourceClass();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.ReplaceDataValueWithObject#getAttributeToReplaceDataWithObject <em>Attribute To Replace Data With Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute To Replace Data With Object</em>'.
	 * @see com.br.refactoring.dsl.refactoring.ReplaceDataValueWithObject#getAttributeToReplaceDataWithObject()
	 * @see #getReplaceDataValueWithObject()
	 * @generated
	 */
	EReference getReplaceDataValueWithObject_AttributeToReplaceDataWithObject();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br.refactoring.dsl.refactoring.ReplaceDataValueWithObject#getNewAttributes <em>New Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New Attributes</em>'.
	 * @see com.br.refactoring.dsl.refactoring.ReplaceDataValueWithObject#getNewAttributes()
	 * @see #getReplaceDataValueWithObject()
	 * @generated
	 */
	EReference getReplaceDataValueWithObject_NewAttributes();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.ReplaceDataValueWithObject#getSourceClassName <em>Source Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Class Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.ReplaceDataValueWithObject#getSourceClassName()
	 * @see #getReplaceDataValueWithObject()
	 * @generated
	 */
	EAttribute getReplaceDataValueWithObject_SourceClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.ReplaceDataValueWithObject#getAttributeToReplaceDataWithObjectName <em>Attribute To Replace Data With Object Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute To Replace Data With Object Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.ReplaceDataValueWithObject#getAttributeToReplaceDataWithObjectName()
	 * @see #getReplaceDataValueWithObject()
	 * @generated
	 */
	EAttribute getReplaceDataValueWithObject_AttributeToReplaceDataWithObjectName();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.ReplaceDataValueWithObject#getNewAttributesName <em>New Attributes Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Attributes Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.ReplaceDataValueWithObject#getNewAttributesName()
	 * @see #getReplaceDataValueWithObject()
	 * @generated
	 */
	EAttribute getReplaceDataValueWithObject_NewAttributesName();

	/**
	 * Returns the meta object for class '{@link com.br.refactoring.dsl.refactoring.EncapsulateField <em>Encapsulate Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encapsulate Field</em>'.
	 * @see com.br.refactoring.dsl.refactoring.EncapsulateField
	 * @generated
	 */
	EClass getEncapsulateField();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.EncapsulateField#getSourceClass <em>Source Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Class</em>'.
	 * @see com.br.refactoring.dsl.refactoring.EncapsulateField#getSourceClass()
	 * @see #getEncapsulateField()
	 * @generated
	 */
	EReference getEncapsulateField_SourceClass();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.EncapsulateField#getAttributeToEncapsulate <em>Attribute To Encapsulate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute To Encapsulate</em>'.
	 * @see com.br.refactoring.dsl.refactoring.EncapsulateField#getAttributeToEncapsulate()
	 * @see #getEncapsulateField()
	 * @generated
	 */
	EReference getEncapsulateField_AttributeToEncapsulate();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.EncapsulateField#getSourceClassName <em>Source Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Class Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.EncapsulateField#getSourceClassName()
	 * @see #getEncapsulateField()
	 * @generated
	 */
	EAttribute getEncapsulateField_SourceClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.EncapsulateField#getAttributeToEncapsulateName <em>Attribute To Encapsulate Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute To Encapsulate Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.EncapsulateField#getAttributeToEncapsulateName()
	 * @see #getEncapsulateField()
	 * @generated
	 */
	EAttribute getEncapsulateField_AttributeToEncapsulateName();

	/**
	 * Returns the meta object for class '{@link com.br.refactoring.dsl.refactoring.DealingWithGeneralization <em>Dealing With Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dealing With Generalization</em>'.
	 * @see com.br.refactoring.dsl.refactoring.DealingWithGeneralization
	 * @generated
	 */
	EClass getDealingWithGeneralization();

	/**
	 * Returns the meta object for the containment reference list '{@link com.br.refactoring.dsl.refactoring.DealingWithGeneralization#getAllRefactorings <em>All Refactorings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Refactorings</em>'.
	 * @see com.br.refactoring.dsl.refactoring.DealingWithGeneralization#getAllRefactorings()
	 * @see #getDealingWithGeneralization()
	 * @generated
	 */
	EReference getDealingWithGeneralization_AllRefactorings();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.DealingWithGeneralization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.DealingWithGeneralization#getName()
	 * @see #getDealingWithGeneralization()
	 * @generated
	 */
	EAttribute getDealingWithGeneralization_Name();

	/**
	 * Returns the meta object for class '{@link com.br.refactoring.dsl.refactoring.PushDownMethod <em>Push Down Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push Down Method</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PushDownMethod
	 * @generated
	 */
	EClass getPushDownMethod();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.PushDownMethod#getMethodToBePushed <em>Method To Be Pushed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method To Be Pushed</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PushDownMethod#getMethodToBePushed()
	 * @see #getPushDownMethod()
	 * @generated
	 */
	EReference getPushDownMethod_MethodToBePushed();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.PushDownMethod#getSourceClass <em>Source Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Class</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PushDownMethod#getSourceClass()
	 * @see #getPushDownMethod()
	 * @generated
	 */
	EReference getPushDownMethod_SourceClass();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.PushDownMethod#getTargetClass <em>Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Class</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PushDownMethod#getTargetClass()
	 * @see #getPushDownMethod()
	 * @generated
	 */
	EReference getPushDownMethod_TargetClass();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.PushDownMethod#getSourceClassName <em>Source Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Class Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PushDownMethod#getSourceClassName()
	 * @see #getPushDownMethod()
	 * @generated
	 */
	EAttribute getPushDownMethod_SourceClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.PushDownMethod#getTargetClassName <em>Target Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Class Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PushDownMethod#getTargetClassName()
	 * @see #getPushDownMethod()
	 * @generated
	 */
	EAttribute getPushDownMethod_TargetClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.PushDownMethod#getMethodToBePushedName <em>Method To Be Pushed Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method To Be Pushed Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PushDownMethod#getMethodToBePushedName()
	 * @see #getPushDownMethod()
	 * @generated
	 */
	EAttribute getPushDownMethod_MethodToBePushedName();

	/**
	 * Returns the meta object for class '{@link com.br.refactoring.dsl.refactoring.PushDownAttribute <em>Push Down Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push Down Attribute</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PushDownAttribute
	 * @generated
	 */
	EClass getPushDownAttribute();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.PushDownAttribute#getAttributeToBePushed <em>Attribute To Be Pushed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute To Be Pushed</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PushDownAttribute#getAttributeToBePushed()
	 * @see #getPushDownAttribute()
	 * @generated
	 */
	EReference getPushDownAttribute_AttributeToBePushed();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.PushDownAttribute#getSourceClass <em>Source Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Class</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PushDownAttribute#getSourceClass()
	 * @see #getPushDownAttribute()
	 * @generated
	 */
	EReference getPushDownAttribute_SourceClass();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.PushDownAttribute#getTargetClass <em>Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Class</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PushDownAttribute#getTargetClass()
	 * @see #getPushDownAttribute()
	 * @generated
	 */
	EReference getPushDownAttribute_TargetClass();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.PushDownAttribute#getSourceClassName <em>Source Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Class Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PushDownAttribute#getSourceClassName()
	 * @see #getPushDownAttribute()
	 * @generated
	 */
	EAttribute getPushDownAttribute_SourceClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.PushDownAttribute#getTargetClassName <em>Target Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Class Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PushDownAttribute#getTargetClassName()
	 * @see #getPushDownAttribute()
	 * @generated
	 */
	EAttribute getPushDownAttribute_TargetClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.PushDownAttribute#getAttributeToBePushedName <em>Attribute To Be Pushed Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute To Be Pushed Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PushDownAttribute#getAttributeToBePushedName()
	 * @see #getPushDownAttribute()
	 * @generated
	 */
	EAttribute getPushDownAttribute_AttributeToBePushedName();

	/**
	 * Returns the meta object for class '{@link com.br.refactoring.dsl.refactoring.PullUpAttribute <em>Pull Up Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pull Up Attribute</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PullUpAttribute
	 * @generated
	 */
	EClass getPullUpAttribute();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.PullUpAttribute#getAttributeToBePulled <em>Attribute To Be Pulled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute To Be Pulled</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PullUpAttribute#getAttributeToBePulled()
	 * @see #getPullUpAttribute()
	 * @generated
	 */
	EReference getPullUpAttribute_AttributeToBePulled();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.PullUpAttribute#getSourceClass <em>Source Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Class</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PullUpAttribute#getSourceClass()
	 * @see #getPullUpAttribute()
	 * @generated
	 */
	EReference getPullUpAttribute_SourceClass();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.PullUpAttribute#getTargetClass <em>Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Class</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PullUpAttribute#getTargetClass()
	 * @see #getPullUpAttribute()
	 * @generated
	 */
	EReference getPullUpAttribute_TargetClass();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.PullUpAttribute#getSourceClassName <em>Source Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Class Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PullUpAttribute#getSourceClassName()
	 * @see #getPullUpAttribute()
	 * @generated
	 */
	EAttribute getPullUpAttribute_SourceClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.PullUpAttribute#getTargetClassName <em>Target Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Class Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PullUpAttribute#getTargetClassName()
	 * @see #getPullUpAttribute()
	 * @generated
	 */
	EAttribute getPullUpAttribute_TargetClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.PullUpAttribute#getAttributeToBePulledName <em>Attribute To Be Pulled Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute To Be Pulled Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PullUpAttribute#getAttributeToBePulledName()
	 * @see #getPullUpAttribute()
	 * @generated
	 */
	EAttribute getPullUpAttribute_AttributeToBePulledName();

	/**
	 * Returns the meta object for class '{@link com.br.refactoring.dsl.refactoring.PullUpMethod <em>Pull Up Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pull Up Method</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PullUpMethod
	 * @generated
	 */
	EClass getPullUpMethod();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.PullUpMethod#getMethodToBePulled <em>Method To Be Pulled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method To Be Pulled</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PullUpMethod#getMethodToBePulled()
	 * @see #getPullUpMethod()
	 * @generated
	 */
	EReference getPullUpMethod_MethodToBePulled();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.PullUpMethod#getSourceClass <em>Source Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Class</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PullUpMethod#getSourceClass()
	 * @see #getPullUpMethod()
	 * @generated
	 */
	EReference getPullUpMethod_SourceClass();

	/**
	 * Returns the meta object for the reference '{@link com.br.refactoring.dsl.refactoring.PullUpMethod#getTargetClass <em>Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Class</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PullUpMethod#getTargetClass()
	 * @see #getPullUpMethod()
	 * @generated
	 */
	EReference getPullUpMethod_TargetClass();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.PullUpMethod#getSourceClassName <em>Source Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Class Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PullUpMethod#getSourceClassName()
	 * @see #getPullUpMethod()
	 * @generated
	 */
	EAttribute getPullUpMethod_SourceClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.PullUpMethod#getTargetClassName <em>Target Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Class Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PullUpMethod#getTargetClassName()
	 * @see #getPullUpMethod()
	 * @generated
	 */
	EAttribute getPullUpMethod_TargetClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.br.refactoring.dsl.refactoring.PullUpMethod#getMethodToBePulledName <em>Method To Be Pulled Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method To Be Pulled Name</em>'.
	 * @see com.br.refactoring.dsl.refactoring.PullUpMethod#getMethodToBePulledName()
	 * @see #getPullUpMethod()
	 * @generated
	 */
	EAttribute getPullUpMethod_MethodToBePulledName();

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
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__ATTRIBUTES = eINSTANCE.getClass_Attributes();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__METHODS = eINSTANCE.getClass_Methods();

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
		 * The meta object literal for the '<em><b>Class To Be Renamed Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_CLASS__CLASS_TO_BE_RENAMED_NAME = eINSTANCE.getRenameClass_ClassToBeRenamedName();

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

		/**
		 * The meta object literal for the '{@link com.br.refactoring.dsl.refactoring.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.br.refactoring.dsl.refactoring.impl.AttributeImpl
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ELEMENT_TYPE = eINSTANCE.getAttribute_ElementType();

		/**
		 * The meta object literal for the '{@link com.br.refactoring.dsl.refactoring.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.br.refactoring.dsl.refactoring.impl.MethodImpl
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '{@link com.br.refactoring.dsl.refactoring.impl.ElementTypeImpl <em>Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.br.refactoring.dsl.refactoring.impl.ElementTypeImpl
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getElementType()
		 * @generated
		 */
		EClass ELEMENT_TYPE = eINSTANCE.getElementType();

		/**
		 * The meta object literal for the '{@link com.br.refactoring.dsl.refactoring.impl.BasicTypeImpl <em>Basic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.br.refactoring.dsl.refactoring.impl.BasicTypeImpl
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getBasicType()
		 * @generated
		 */
		EClass BASIC_TYPE = eINSTANCE.getBasicType();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_TYPE__TYPE_NAME = eINSTANCE.getBasicType_TypeName();

		/**
		 * The meta object literal for the '{@link com.br.refactoring.dsl.refactoring.impl.ClassTypeImpl <em>Class Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.br.refactoring.dsl.refactoring.impl.ClassTypeImpl
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getClassType()
		 * @generated
		 */
		EClass CLASS_TYPE = eINSTANCE.getClassType();

		/**
		 * The meta object literal for the '<em><b>Class Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_TYPE__CLASS_TYPE = eINSTANCE.getClassType_ClassType();

		/**
		 * The meta object literal for the '{@link com.br.refactoring.dsl.refactoring.impl.RenameAttributeImpl <em>Rename Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.br.refactoring.dsl.refactoring.impl.RenameAttributeImpl
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getRenameAttribute()
		 * @generated
		 */
		EClass RENAME_ATTRIBUTE = eINSTANCE.getRenameAttribute();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_ATTRIBUTE__NEW_NAME = eINSTANCE.getRenameAttribute_NewName();

		/**
		 * The meta object literal for the '<em><b>Attribute To Be Rename</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENAME_ATTRIBUTE__ATTRIBUTE_TO_BE_RENAME = eINSTANCE.getRenameAttribute_AttributeToBeRename();

		/**
		 * The meta object literal for the '<em><b>Source Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENAME_ATTRIBUTE__SOURCE_CLASS = eINSTANCE.getRenameAttribute_SourceClass();

		/**
		 * The meta object literal for the '<em><b>Source Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_ATTRIBUTE__SOURCE_CLASS_NAME = eINSTANCE.getRenameAttribute_SourceClassName();

		/**
		 * The meta object literal for the '<em><b>Attribute To Be Renamed Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_ATTRIBUTE__ATTRIBUTE_TO_BE_RENAMED_NAME = eINSTANCE.getRenameAttribute_AttributeToBeRenamedName();

		/**
		 * The meta object literal for the '{@link com.br.refactoring.dsl.refactoring.impl.RenameMethodImpl <em>Rename Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.br.refactoring.dsl.refactoring.impl.RenameMethodImpl
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getRenameMethod()
		 * @generated
		 */
		EClass RENAME_METHOD = eINSTANCE.getRenameMethod();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_METHOD__NEW_NAME = eINSTANCE.getRenameMethod_NewName();

		/**
		 * The meta object literal for the '<em><b>Method To Be Rename</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENAME_METHOD__METHOD_TO_BE_RENAME = eINSTANCE.getRenameMethod_MethodToBeRename();

		/**
		 * The meta object literal for the '<em><b>Source Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENAME_METHOD__SOURCE_CLASS = eINSTANCE.getRenameMethod_SourceClass();

		/**
		 * The meta object literal for the '<em><b>Source Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_METHOD__SOURCE_CLASS_NAME = eINSTANCE.getRenameMethod_SourceClassName();

		/**
		 * The meta object literal for the '<em><b>Method To Be Renamed Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_METHOD__METHOD_TO_BE_RENAMED_NAME = eINSTANCE.getRenameMethod_MethodToBeRenamedName();

		/**
		 * The meta object literal for the '{@link com.br.refactoring.dsl.refactoring.impl.MovingFeaturesBetweenObjectsImpl <em>Moving Features Between Objects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.br.refactoring.dsl.refactoring.impl.MovingFeaturesBetweenObjectsImpl
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getMovingFeaturesBetweenObjects()
		 * @generated
		 */
		EClass MOVING_FEATURES_BETWEEN_OBJECTS = eINSTANCE.getMovingFeaturesBetweenObjects();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVING_FEATURES_BETWEEN_OBJECTS__NAME = eINSTANCE.getMovingFeaturesBetweenObjects_Name();

		/**
		 * The meta object literal for the '<em><b>All Refactorings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVING_FEATURES_BETWEEN_OBJECTS__ALL_REFACTORINGS = eINSTANCE.getMovingFeaturesBetweenObjects_AllRefactorings();

		/**
		 * The meta object literal for the '{@link com.br.refactoring.dsl.refactoring.impl.MoveAttributeImpl <em>Move Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.br.refactoring.dsl.refactoring.impl.MoveAttributeImpl
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getMoveAttribute()
		 * @generated
		 */
		EClass MOVE_ATTRIBUTE = eINSTANCE.getMoveAttribute();

		/**
		 * The meta object literal for the '<em><b>Source Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_ATTRIBUTE__SOURCE_CLASS = eINSTANCE.getMoveAttribute_SourceClass();

		/**
		 * The meta object literal for the '<em><b>Target Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_ATTRIBUTE__TARGET_CLASS = eINSTANCE.getMoveAttribute_TargetClass();

		/**
		 * The meta object literal for the '<em><b>Attribute To Be Moved</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_ATTRIBUTE__ATTRIBUTE_TO_BE_MOVED = eINSTANCE.getMoveAttribute_AttributeToBeMoved();

		/**
		 * The meta object literal for the '<em><b>Source Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_ATTRIBUTE__SOURCE_CLASS_NAME = eINSTANCE.getMoveAttribute_SourceClassName();

		/**
		 * The meta object literal for the '<em><b>Target Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_ATTRIBUTE__TARGET_CLASS_NAME = eINSTANCE.getMoveAttribute_TargetClassName();

		/**
		 * The meta object literal for the '<em><b>Attribute To Be Moved Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_ATTRIBUTE__ATTRIBUTE_TO_BE_MOVED_NAME = eINSTANCE.getMoveAttribute_AttributeToBeMovedName();

		/**
		 * The meta object literal for the '{@link com.br.refactoring.dsl.refactoring.impl.MoveMethodImpl <em>Move Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.br.refactoring.dsl.refactoring.impl.MoveMethodImpl
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getMoveMethod()
		 * @generated
		 */
		EClass MOVE_METHOD = eINSTANCE.getMoveMethod();

		/**
		 * The meta object literal for the '<em><b>Source Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_METHOD__SOURCE_CLASS = eINSTANCE.getMoveMethod_SourceClass();

		/**
		 * The meta object literal for the '<em><b>Target Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_METHOD__TARGET_CLASS = eINSTANCE.getMoveMethod_TargetClass();

		/**
		 * The meta object literal for the '<em><b>Method To Be Moved</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_METHOD__METHOD_TO_BE_MOVED = eINSTANCE.getMoveMethod_MethodToBeMoved();

		/**
		 * The meta object literal for the '<em><b>Source Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_METHOD__SOURCE_CLASS_NAME = eINSTANCE.getMoveMethod_SourceClassName();

		/**
		 * The meta object literal for the '<em><b>Target Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_METHOD__TARGET_CLASS_NAME = eINSTANCE.getMoveMethod_TargetClassName();

		/**
		 * The meta object literal for the '<em><b>Method To Be Moved Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_METHOD__METHOD_TO_BE_MOVED_NAME = eINSTANCE.getMoveMethod_MethodToBeMovedName();

		/**
		 * The meta object literal for the '{@link com.br.refactoring.dsl.refactoring.impl.ExtractClassImpl <em>Extract Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.br.refactoring.dsl.refactoring.impl.ExtractClassImpl
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getExtractClass()
		 * @generated
		 */
		EClass EXTRACT_CLASS = eINSTANCE.getExtractClass();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACT_CLASS__NEW_NAME = eINSTANCE.getExtractClass_NewName();

		/**
		 * The meta object literal for the '<em><b>Source Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRACT_CLASS__SOURCE_CLASS = eINSTANCE.getExtractClass_SourceClass();

		/**
		 * The meta object literal for the '<em><b>Attributes To Be Moved</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRACT_CLASS__ATTRIBUTES_TO_BE_MOVED = eINSTANCE.getExtractClass_AttributesToBeMoved();

		/**
		 * The meta object literal for the '<em><b>Attributes To Be Moved Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACT_CLASS__ATTRIBUTES_TO_BE_MOVED_NAME = eINSTANCE.getExtractClass_AttributesToBeMovedName();

		/**
		 * The meta object literal for the '<em><b>Source Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACT_CLASS__SOURCE_CLASS_NAME = eINSTANCE.getExtractClass_SourceClassName();

		/**
		 * The meta object literal for the '{@link com.br.refactoring.dsl.refactoring.impl.InlineClassImpl <em>Inline Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.br.refactoring.dsl.refactoring.impl.InlineClassImpl
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getInlineClass()
		 * @generated
		 */
		EClass INLINE_CLASS = eINSTANCE.getInlineClass();

		/**
		 * The meta object literal for the '<em><b>Class To Get All Features</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE_CLASS__CLASS_TO_GET_ALL_FEATURES = eINSTANCE.getInlineClass_ClassToGetAllFeatures();

		/**
		 * The meta object literal for the '<em><b>Class To Remove</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE_CLASS__CLASS_TO_REMOVE = eINSTANCE.getInlineClass_ClassToRemove();

		/**
		 * The meta object literal for the '<em><b>Class To Get All Features Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_CLASS__CLASS_TO_GET_ALL_FEATURES_NAME = eINSTANCE.getInlineClass_ClassToGetAllFeaturesName();

		/**
		 * The meta object literal for the '<em><b>Class To Remove Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_CLASS__CLASS_TO_REMOVE_NAME = eINSTANCE.getInlineClass_ClassToRemoveName();

		/**
		 * The meta object literal for the '{@link com.br.refactoring.dsl.refactoring.impl.OrganizingDataImpl <em>Organizing Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.br.refactoring.dsl.refactoring.impl.OrganizingDataImpl
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getOrganizingData()
		 * @generated
		 */
		EClass ORGANIZING_DATA = eINSTANCE.getOrganizingData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZING_DATA__NAME = eINSTANCE.getOrganizingData_Name();

		/**
		 * The meta object literal for the '<em><b>All Refactorings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZING_DATA__ALL_REFACTORINGS = eINSTANCE.getOrganizingData_AllRefactorings();

		/**
		 * The meta object literal for the '{@link com.br.refactoring.dsl.refactoring.impl.ReplaceDataValueWithObjectImpl <em>Replace Data Value With Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.br.refactoring.dsl.refactoring.impl.ReplaceDataValueWithObjectImpl
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getReplaceDataValueWithObject()
		 * @generated
		 */
		EClass REPLACE_DATA_VALUE_WITH_OBJECT = eINSTANCE.getReplaceDataValueWithObject();

		/**
		 * The meta object literal for the '<em><b>Source Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLACE_DATA_VALUE_WITH_OBJECT__SOURCE_CLASS = eINSTANCE.getReplaceDataValueWithObject_SourceClass();

		/**
		 * The meta object literal for the '<em><b>Attribute To Replace Data With Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLACE_DATA_VALUE_WITH_OBJECT__ATTRIBUTE_TO_REPLACE_DATA_WITH_OBJECT = eINSTANCE.getReplaceDataValueWithObject_AttributeToReplaceDataWithObject();

		/**
		 * The meta object literal for the '<em><b>New Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLACE_DATA_VALUE_WITH_OBJECT__NEW_ATTRIBUTES = eINSTANCE.getReplaceDataValueWithObject_NewAttributes();

		/**
		 * The meta object literal for the '<em><b>Source Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLACE_DATA_VALUE_WITH_OBJECT__SOURCE_CLASS_NAME = eINSTANCE.getReplaceDataValueWithObject_SourceClassName();

		/**
		 * The meta object literal for the '<em><b>Attribute To Replace Data With Object Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLACE_DATA_VALUE_WITH_OBJECT__ATTRIBUTE_TO_REPLACE_DATA_WITH_OBJECT_NAME = eINSTANCE.getReplaceDataValueWithObject_AttributeToReplaceDataWithObjectName();

		/**
		 * The meta object literal for the '<em><b>New Attributes Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLACE_DATA_VALUE_WITH_OBJECT__NEW_ATTRIBUTES_NAME = eINSTANCE.getReplaceDataValueWithObject_NewAttributesName();

		/**
		 * The meta object literal for the '{@link com.br.refactoring.dsl.refactoring.impl.EncapsulateFieldImpl <em>Encapsulate Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.br.refactoring.dsl.refactoring.impl.EncapsulateFieldImpl
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getEncapsulateField()
		 * @generated
		 */
		EClass ENCAPSULATE_FIELD = eINSTANCE.getEncapsulateField();

		/**
		 * The meta object literal for the '<em><b>Source Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCAPSULATE_FIELD__SOURCE_CLASS = eINSTANCE.getEncapsulateField_SourceClass();

		/**
		 * The meta object literal for the '<em><b>Attribute To Encapsulate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCAPSULATE_FIELD__ATTRIBUTE_TO_ENCAPSULATE = eINSTANCE.getEncapsulateField_AttributeToEncapsulate();

		/**
		 * The meta object literal for the '<em><b>Source Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCAPSULATE_FIELD__SOURCE_CLASS_NAME = eINSTANCE.getEncapsulateField_SourceClassName();

		/**
		 * The meta object literal for the '<em><b>Attribute To Encapsulate Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCAPSULATE_FIELD__ATTRIBUTE_TO_ENCAPSULATE_NAME = eINSTANCE.getEncapsulateField_AttributeToEncapsulateName();

		/**
		 * The meta object literal for the '{@link com.br.refactoring.dsl.refactoring.impl.DealingWithGeneralizationImpl <em>Dealing With Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.br.refactoring.dsl.refactoring.impl.DealingWithGeneralizationImpl
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getDealingWithGeneralization()
		 * @generated
		 */
		EClass DEALING_WITH_GENERALIZATION = eINSTANCE.getDealingWithGeneralization();

		/**
		 * The meta object literal for the '<em><b>All Refactorings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEALING_WITH_GENERALIZATION__ALL_REFACTORINGS = eINSTANCE.getDealingWithGeneralization_AllRefactorings();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEALING_WITH_GENERALIZATION__NAME = eINSTANCE.getDealingWithGeneralization_Name();

		/**
		 * The meta object literal for the '{@link com.br.refactoring.dsl.refactoring.impl.PushDownMethodImpl <em>Push Down Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.br.refactoring.dsl.refactoring.impl.PushDownMethodImpl
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getPushDownMethod()
		 * @generated
		 */
		EClass PUSH_DOWN_METHOD = eINSTANCE.getPushDownMethod();

		/**
		 * The meta object literal for the '<em><b>Method To Be Pushed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSH_DOWN_METHOD__METHOD_TO_BE_PUSHED = eINSTANCE.getPushDownMethod_MethodToBePushed();

		/**
		 * The meta object literal for the '<em><b>Source Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSH_DOWN_METHOD__SOURCE_CLASS = eINSTANCE.getPushDownMethod_SourceClass();

		/**
		 * The meta object literal for the '<em><b>Target Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSH_DOWN_METHOD__TARGET_CLASS = eINSTANCE.getPushDownMethod_TargetClass();

		/**
		 * The meta object literal for the '<em><b>Source Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_DOWN_METHOD__SOURCE_CLASS_NAME = eINSTANCE.getPushDownMethod_SourceClassName();

		/**
		 * The meta object literal for the '<em><b>Target Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_DOWN_METHOD__TARGET_CLASS_NAME = eINSTANCE.getPushDownMethod_TargetClassName();

		/**
		 * The meta object literal for the '<em><b>Method To Be Pushed Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_DOWN_METHOD__METHOD_TO_BE_PUSHED_NAME = eINSTANCE.getPushDownMethod_MethodToBePushedName();

		/**
		 * The meta object literal for the '{@link com.br.refactoring.dsl.refactoring.impl.PushDownAttributeImpl <em>Push Down Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.br.refactoring.dsl.refactoring.impl.PushDownAttributeImpl
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getPushDownAttribute()
		 * @generated
		 */
		EClass PUSH_DOWN_ATTRIBUTE = eINSTANCE.getPushDownAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute To Be Pushed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSH_DOWN_ATTRIBUTE__ATTRIBUTE_TO_BE_PUSHED = eINSTANCE.getPushDownAttribute_AttributeToBePushed();

		/**
		 * The meta object literal for the '<em><b>Source Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSH_DOWN_ATTRIBUTE__SOURCE_CLASS = eINSTANCE.getPushDownAttribute_SourceClass();

		/**
		 * The meta object literal for the '<em><b>Target Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSH_DOWN_ATTRIBUTE__TARGET_CLASS = eINSTANCE.getPushDownAttribute_TargetClass();

		/**
		 * The meta object literal for the '<em><b>Source Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_DOWN_ATTRIBUTE__SOURCE_CLASS_NAME = eINSTANCE.getPushDownAttribute_SourceClassName();

		/**
		 * The meta object literal for the '<em><b>Target Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_DOWN_ATTRIBUTE__TARGET_CLASS_NAME = eINSTANCE.getPushDownAttribute_TargetClassName();

		/**
		 * The meta object literal for the '<em><b>Attribute To Be Pushed Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_DOWN_ATTRIBUTE__ATTRIBUTE_TO_BE_PUSHED_NAME = eINSTANCE.getPushDownAttribute_AttributeToBePushedName();

		/**
		 * The meta object literal for the '{@link com.br.refactoring.dsl.refactoring.impl.PullUpAttributeImpl <em>Pull Up Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.br.refactoring.dsl.refactoring.impl.PullUpAttributeImpl
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getPullUpAttribute()
		 * @generated
		 */
		EClass PULL_UP_ATTRIBUTE = eINSTANCE.getPullUpAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute To Be Pulled</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PULL_UP_ATTRIBUTE__ATTRIBUTE_TO_BE_PULLED = eINSTANCE.getPullUpAttribute_AttributeToBePulled();

		/**
		 * The meta object literal for the '<em><b>Source Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PULL_UP_ATTRIBUTE__SOURCE_CLASS = eINSTANCE.getPullUpAttribute_SourceClass();

		/**
		 * The meta object literal for the '<em><b>Target Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PULL_UP_ATTRIBUTE__TARGET_CLASS = eINSTANCE.getPullUpAttribute_TargetClass();

		/**
		 * The meta object literal for the '<em><b>Source Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PULL_UP_ATTRIBUTE__SOURCE_CLASS_NAME = eINSTANCE.getPullUpAttribute_SourceClassName();

		/**
		 * The meta object literal for the '<em><b>Target Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PULL_UP_ATTRIBUTE__TARGET_CLASS_NAME = eINSTANCE.getPullUpAttribute_TargetClassName();

		/**
		 * The meta object literal for the '<em><b>Attribute To Be Pulled Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PULL_UP_ATTRIBUTE__ATTRIBUTE_TO_BE_PULLED_NAME = eINSTANCE.getPullUpAttribute_AttributeToBePulledName();

		/**
		 * The meta object literal for the '{@link com.br.refactoring.dsl.refactoring.impl.PullUpMethodImpl <em>Pull Up Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.br.refactoring.dsl.refactoring.impl.PullUpMethodImpl
		 * @see com.br.refactoring.dsl.refactoring.impl.RefactoringPackageImpl#getPullUpMethod()
		 * @generated
		 */
		EClass PULL_UP_METHOD = eINSTANCE.getPullUpMethod();

		/**
		 * The meta object literal for the '<em><b>Method To Be Pulled</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PULL_UP_METHOD__METHOD_TO_BE_PULLED = eINSTANCE.getPullUpMethod_MethodToBePulled();

		/**
		 * The meta object literal for the '<em><b>Source Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PULL_UP_METHOD__SOURCE_CLASS = eINSTANCE.getPullUpMethod_SourceClass();

		/**
		 * The meta object literal for the '<em><b>Target Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PULL_UP_METHOD__TARGET_CLASS = eINSTANCE.getPullUpMethod_TargetClass();

		/**
		 * The meta object literal for the '<em><b>Source Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PULL_UP_METHOD__SOURCE_CLASS_NAME = eINSTANCE.getPullUpMethod_SourceClassName();

		/**
		 * The meta object literal for the '<em><b>Target Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PULL_UP_METHOD__TARGET_CLASS_NAME = eINSTANCE.getPullUpMethod_TargetClassName();

		/**
		 * The meta object literal for the '<em><b>Method To Be Pulled Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PULL_UP_METHOD__METHOD_TO_BE_PULLED_NAME = eINSTANCE.getPullUpMethod_MethodToBePulledName();

	}

} //RefactoringPackage

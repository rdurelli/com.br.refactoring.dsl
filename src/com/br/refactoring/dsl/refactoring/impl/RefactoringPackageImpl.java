/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br.refactoring.dsl.refactoring.impl;

import com.br.refactoring.dsl.refactoring.Attribute;
import com.br.refactoring.dsl.refactoring.BasicType;
import com.br.refactoring.dsl.refactoring.ClassType;
import com.br.refactoring.dsl.refactoring.ElementType;
import com.br.refactoring.dsl.refactoring.ExtractClass;
import com.br.refactoring.dsl.refactoring.Import;
import com.br.refactoring.dsl.refactoring.InlineClass;
import com.br.refactoring.dsl.refactoring.Method;
import com.br.refactoring.dsl.refactoring.Model;
import com.br.refactoring.dsl.refactoring.MoveAttribute;
import com.br.refactoring.dsl.refactoring.MoveMethod;
import com.br.refactoring.dsl.refactoring.MovingFeaturesBetweenObjects;
import com.br.refactoring.dsl.refactoring.Refactoring;
import com.br.refactoring.dsl.refactoring.RefactoringFactory;
import com.br.refactoring.dsl.refactoring.RefactoringPackage;
import com.br.refactoring.dsl.refactoring.RenameAttribute;
import com.br.refactoring.dsl.refactoring.RenameClass;
import com.br.refactoring.dsl.refactoring.RenameFeature;
import com.br.refactoring.dsl.refactoring.RenameMethod;
import com.br.refactoring.dsl.refactoring.Type;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefactoringPackageImpl extends EPackageImpl implements RefactoringPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refactoringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renameFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renameClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renameAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renameMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass movingFeaturesBetweenObjectsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extractClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inlineClassEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RefactoringPackageImpl() {
		super(eNS_URI, RefactoringFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RefactoringPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RefactoringPackage init() {
		if (isInited) return (RefactoringPackage)EPackage.Registry.INSTANCE.getEPackage(RefactoringPackage.eNS_URI);

		// Obtain or create and register package
		RefactoringPackageImpl theRefactoringPackage = (RefactoringPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RefactoringPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RefactoringPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRefactoringPackage.createPackageContents();

		// Initialize created meta-data
		theRefactoringPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRefactoringPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RefactoringPackage.eNS_URI, theRefactoringPackage);
		return theRefactoringPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Name() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Contains() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Imports() {
		return (EReference)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Name() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Attributes() {
		return (EReference)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Methods() {
		return (EReference)classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefactoring() {
		return refactoringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRenameFeature() {
		return renameFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameFeature_Name() {
		return (EAttribute)renameFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRenameFeature_AllRefactorings() {
		return (EReference)renameFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRenameClass() {
		return renameClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameClass_NewName() {
		return (EAttribute)renameClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRenameClass_ClassToBeRename() {
		return (EReference)renameClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_ImportURI() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_ElementType() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Name() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementType() {
		return elementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicType() {
		return basicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicType_TypeName() {
		return (EAttribute)basicTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassType() {
		return classTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassType_ClassType() {
		return (EReference)classTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRenameAttribute() {
		return renameAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameAttribute_NewName() {
		return (EAttribute)renameAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRenameAttribute_AttributeToBeRename() {
		return (EReference)renameAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRenameAttribute_SourceClass() {
		return (EReference)renameAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRenameMethod() {
		return renameMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameMethod_NewName() {
		return (EAttribute)renameMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRenameMethod_MethodToBeRename() {
		return (EReference)renameMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRenameMethod_SourceClass() {
		return (EReference)renameMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMovingFeaturesBetweenObjects() {
		return movingFeaturesBetweenObjectsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMovingFeaturesBetweenObjects_Name() {
		return (EAttribute)movingFeaturesBetweenObjectsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMovingFeaturesBetweenObjects_AllRefactorings() {
		return (EReference)movingFeaturesBetweenObjectsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveAttribute() {
		return moveAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoveAttribute_SourceClass() {
		return (EReference)moveAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoveAttribute_TargetClass() {
		return (EReference)moveAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoveAttribute_AttributeToBeMoved() {
		return (EReference)moveAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveMethod() {
		return moveMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoveMethod_SourceClass() {
		return (EReference)moveMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoveMethod_TargetClass() {
		return (EReference)moveMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoveMethod_MethodToBeMoved() {
		return (EReference)moveMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtractClass() {
		return extractClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtractClass_NewName() {
		return (EAttribute)extractClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtractClass_SourceClass() {
		return (EReference)extractClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtractClass_AttributesToBeMoved() {
		return (EReference)extractClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInlineClass() {
		return inlineClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInlineClass_ClassToGetAllFeatures() {
		return (EReference)inlineClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInlineClass_ClassToRemove() {
		return (EReference)inlineClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefactoringFactory getRefactoringFactory() {
		return (RefactoringFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__NAME);
		createEReference(modelEClass, MODEL__CONTAINS);
		createEReference(modelEClass, MODEL__IMPORTS);

		typeEClass = createEClass(TYPE);

		classEClass = createEClass(CLASS);
		createEAttribute(classEClass, CLASS__NAME);
		createEReference(classEClass, CLASS__ATTRIBUTES);
		createEReference(classEClass, CLASS__METHODS);

		refactoringEClass = createEClass(REFACTORING);

		renameFeatureEClass = createEClass(RENAME_FEATURE);
		createEAttribute(renameFeatureEClass, RENAME_FEATURE__NAME);
		createEReference(renameFeatureEClass, RENAME_FEATURE__ALL_REFACTORINGS);

		renameClassEClass = createEClass(RENAME_CLASS);
		createEAttribute(renameClassEClass, RENAME_CLASS__NEW_NAME);
		createEReference(renameClassEClass, RENAME_CLASS__CLASS_TO_BE_RENAME);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__IMPORT_URI);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEReference(attributeEClass, ATTRIBUTE__ELEMENT_TYPE);

		methodEClass = createEClass(METHOD);
		createEAttribute(methodEClass, METHOD__NAME);

		elementTypeEClass = createEClass(ELEMENT_TYPE);

		basicTypeEClass = createEClass(BASIC_TYPE);
		createEAttribute(basicTypeEClass, BASIC_TYPE__TYPE_NAME);

		classTypeEClass = createEClass(CLASS_TYPE);
		createEReference(classTypeEClass, CLASS_TYPE__CLASS_TYPE);

		renameAttributeEClass = createEClass(RENAME_ATTRIBUTE);
		createEAttribute(renameAttributeEClass, RENAME_ATTRIBUTE__NEW_NAME);
		createEReference(renameAttributeEClass, RENAME_ATTRIBUTE__ATTRIBUTE_TO_BE_RENAME);
		createEReference(renameAttributeEClass, RENAME_ATTRIBUTE__SOURCE_CLASS);

		renameMethodEClass = createEClass(RENAME_METHOD);
		createEAttribute(renameMethodEClass, RENAME_METHOD__NEW_NAME);
		createEReference(renameMethodEClass, RENAME_METHOD__METHOD_TO_BE_RENAME);
		createEReference(renameMethodEClass, RENAME_METHOD__SOURCE_CLASS);

		movingFeaturesBetweenObjectsEClass = createEClass(MOVING_FEATURES_BETWEEN_OBJECTS);
		createEAttribute(movingFeaturesBetweenObjectsEClass, MOVING_FEATURES_BETWEEN_OBJECTS__NAME);
		createEReference(movingFeaturesBetweenObjectsEClass, MOVING_FEATURES_BETWEEN_OBJECTS__ALL_REFACTORINGS);

		moveAttributeEClass = createEClass(MOVE_ATTRIBUTE);
		createEReference(moveAttributeEClass, MOVE_ATTRIBUTE__SOURCE_CLASS);
		createEReference(moveAttributeEClass, MOVE_ATTRIBUTE__TARGET_CLASS);
		createEReference(moveAttributeEClass, MOVE_ATTRIBUTE__ATTRIBUTE_TO_BE_MOVED);

		moveMethodEClass = createEClass(MOVE_METHOD);
		createEReference(moveMethodEClass, MOVE_METHOD__SOURCE_CLASS);
		createEReference(moveMethodEClass, MOVE_METHOD__TARGET_CLASS);
		createEReference(moveMethodEClass, MOVE_METHOD__METHOD_TO_BE_MOVED);

		extractClassEClass = createEClass(EXTRACT_CLASS);
		createEAttribute(extractClassEClass, EXTRACT_CLASS__NEW_NAME);
		createEReference(extractClassEClass, EXTRACT_CLASS__SOURCE_CLASS);
		createEReference(extractClassEClass, EXTRACT_CLASS__ATTRIBUTES_TO_BE_MOVED);

		inlineClassEClass = createEClass(INLINE_CLASS);
		createEReference(inlineClassEClass, INLINE_CLASS__CLASS_TO_GET_ALL_FEATURES);
		createEReference(inlineClassEClass, INLINE_CLASS__CLASS_TO_REMOVE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		classEClass.getESuperTypes().add(this.getType());
		refactoringEClass.getESuperTypes().add(this.getType());
		renameFeatureEClass.getESuperTypes().add(this.getRefactoring());
		renameClassEClass.getESuperTypes().add(this.getRenameFeature());
		basicTypeEClass.getESuperTypes().add(this.getElementType());
		classTypeEClass.getESuperTypes().add(this.getElementType());
		renameAttributeEClass.getESuperTypes().add(this.getRenameFeature());
		renameMethodEClass.getESuperTypes().add(this.getRenameFeature());
		movingFeaturesBetweenObjectsEClass.getESuperTypes().add(this.getRefactoring());
		moveAttributeEClass.getESuperTypes().add(this.getMovingFeaturesBetweenObjects());
		moveMethodEClass.getESuperTypes().add(this.getMovingFeaturesBetweenObjects());
		extractClassEClass.getESuperTypes().add(this.getMovingFeaturesBetweenObjects());
		inlineClassEClass.getESuperTypes().add(this.getMovingFeaturesBetweenObjects());

		// Initialize classes and features; add operations and parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Contains(), this.getType(), null, "contains", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Imports(), this.getImport(), null, "imports", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classEClass, com.br.refactoring.dsl.refactoring.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, com.br.refactoring.dsl.refactoring.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, com.br.refactoring.dsl.refactoring.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Methods(), this.getMethod(), null, "methods", null, 0, -1, com.br.refactoring.dsl.refactoring.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refactoringEClass, Refactoring.class, "Refactoring", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(renameFeatureEClass, RenameFeature.class, "RenameFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRenameFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, RenameFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRenameFeature_AllRefactorings(), this.getRenameFeature(), null, "allRefactorings", null, 0, -1, RenameFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(renameClassEClass, RenameClass.class, "RenameClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRenameClass_NewName(), ecorePackage.getEString(), "newName", null, 0, 1, RenameClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRenameClass_ClassToBeRename(), this.getClass_(), null, "classToBeRename", null, 0, 1, RenameClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_ElementType(), this.getElementType(), null, "elementType", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementTypeEClass, ElementType.class, "ElementType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(basicTypeEClass, BasicType.class, "BasicType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicType_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, BasicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classTypeEClass, ClassType.class, "ClassType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassType_ClassType(), this.getClass_(), null, "classType", null, 0, 1, ClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(renameAttributeEClass, RenameAttribute.class, "RenameAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRenameAttribute_NewName(), ecorePackage.getEString(), "newName", null, 0, 1, RenameAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRenameAttribute_AttributeToBeRename(), this.getAttribute(), null, "attributeToBeRename", null, 0, 1, RenameAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRenameAttribute_SourceClass(), this.getClass_(), null, "sourceClass", null, 0, 1, RenameAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(renameMethodEClass, RenameMethod.class, "RenameMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRenameMethod_NewName(), ecorePackage.getEString(), "newName", null, 0, 1, RenameMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRenameMethod_MethodToBeRename(), this.getMethod(), null, "methodToBeRename", null, 0, 1, RenameMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRenameMethod_SourceClass(), this.getClass_(), null, "sourceClass", null, 0, 1, RenameMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(movingFeaturesBetweenObjectsEClass, MovingFeaturesBetweenObjects.class, "MovingFeaturesBetweenObjects", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMovingFeaturesBetweenObjects_Name(), ecorePackage.getEString(), "name", null, 0, 1, MovingFeaturesBetweenObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMovingFeaturesBetweenObjects_AllRefactorings(), this.getMovingFeaturesBetweenObjects(), null, "allRefactorings", null, 0, -1, MovingFeaturesBetweenObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moveAttributeEClass, MoveAttribute.class, "MoveAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMoveAttribute_SourceClass(), this.getClass_(), null, "sourceClass", null, 0, 1, MoveAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMoveAttribute_TargetClass(), this.getClass_(), null, "targetClass", null, 0, 1, MoveAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMoveAttribute_AttributeToBeMoved(), this.getAttribute(), null, "attributeToBeMoved", null, 0, 1, MoveAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moveMethodEClass, MoveMethod.class, "MoveMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMoveMethod_SourceClass(), this.getClass_(), null, "sourceClass", null, 0, 1, MoveMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMoveMethod_TargetClass(), this.getClass_(), null, "targetClass", null, 0, 1, MoveMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMoveMethod_MethodToBeMoved(), this.getMethod(), null, "methodToBeMoved", null, 0, 1, MoveMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extractClassEClass, ExtractClass.class, "ExtractClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtractClass_NewName(), ecorePackage.getEString(), "newName", null, 0, 1, ExtractClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtractClass_SourceClass(), this.getClass_(), null, "sourceClass", null, 0, 1, ExtractClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtractClass_AttributesToBeMoved(), this.getAttribute(), null, "attributesToBeMoved", null, 0, -1, ExtractClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inlineClassEClass, InlineClass.class, "InlineClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInlineClass_ClassToGetAllFeatures(), this.getClass_(), null, "classToGetAllFeatures", null, 0, 1, InlineClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInlineClass_ClassToRemove(), this.getClass_(), null, "classToRemove", null, 0, 1, InlineClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RefactoringPackageImpl

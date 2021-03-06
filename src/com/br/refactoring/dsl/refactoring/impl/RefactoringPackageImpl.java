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
import com.br.refactoring.dsl.refactoring.DealingWithGeneralization;
import com.br.refactoring.dsl.refactoring.ElementType;
import com.br.refactoring.dsl.refactoring.EncapsulateField;
import com.br.refactoring.dsl.refactoring.ExtractClass;
import com.br.refactoring.dsl.refactoring.Import;
import com.br.refactoring.dsl.refactoring.InlineClass;
import com.br.refactoring.dsl.refactoring.Method;
import com.br.refactoring.dsl.refactoring.Model;
import com.br.refactoring.dsl.refactoring.MoveAttribute;
import com.br.refactoring.dsl.refactoring.MoveMethod;
import com.br.refactoring.dsl.refactoring.MovingFeaturesBetweenObjects;
import com.br.refactoring.dsl.refactoring.OrganizingData;
import com.br.refactoring.dsl.refactoring.PullUpAttribute;
import com.br.refactoring.dsl.refactoring.PullUpMethod;
import com.br.refactoring.dsl.refactoring.PushDownAttribute;
import com.br.refactoring.dsl.refactoring.PushDownMethod;
import com.br.refactoring.dsl.refactoring.Refactoring;
import com.br.refactoring.dsl.refactoring.RefactoringFactory;
import com.br.refactoring.dsl.refactoring.RefactoringPackage;
import com.br.refactoring.dsl.refactoring.RenameAttribute;
import com.br.refactoring.dsl.refactoring.RenameClass;
import com.br.refactoring.dsl.refactoring.RenameFeature;
import com.br.refactoring.dsl.refactoring.RenameMethod;
import com.br.refactoring.dsl.refactoring.ReplaceDataValueWithObject;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizingDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replaceDataValueWithObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encapsulateFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dealingWithGeneralizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pushDownMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pushDownAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pullUpAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pullUpMethodEClass = null;

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
	public EAttribute getRenameClass_ClassToBeRenamedName() {
		return (EAttribute)renameClassEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getRenameAttribute_SourceClassName() {
		return (EAttribute)renameAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameAttribute_AttributeToBeRenamedName() {
		return (EAttribute)renameAttributeEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getRenameMethod_SourceClassName() {
		return (EAttribute)renameMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameMethod_MethodToBeRenamedName() {
		return (EAttribute)renameMethodEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getMoveAttribute_SourceClassName() {
		return (EAttribute)moveAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveAttribute_TargetClassName() {
		return (EAttribute)moveAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveAttribute_AttributeToBeMovedName() {
		return (EAttribute)moveAttributeEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getMoveMethod_SourceClassName() {
		return (EAttribute)moveMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveMethod_TargetClassName() {
		return (EAttribute)moveMethodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveMethod_MethodToBeMovedName() {
		return (EAttribute)moveMethodEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getExtractClass_AttributesToBeMovedName() {
		return (EAttribute)extractClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtractClass_SourceClassName() {
		return (EAttribute)extractClassEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getInlineClass_ClassToGetAllFeaturesName() {
		return (EAttribute)inlineClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineClass_ClassToRemoveName() {
		return (EAttribute)inlineClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizingData() {
		return organizingDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizingData_Name() {
		return (EAttribute)organizingDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizingData_AllRefactorings() {
		return (EReference)organizingDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplaceDataValueWithObject() {
		return replaceDataValueWithObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplaceDataValueWithObject_SourceClass() {
		return (EReference)replaceDataValueWithObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplaceDataValueWithObject_AttributeToReplaceDataWithObject() {
		return (EReference)replaceDataValueWithObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplaceDataValueWithObject_NewAttributes() {
		return (EReference)replaceDataValueWithObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplaceDataValueWithObject_SourceClassName() {
		return (EAttribute)replaceDataValueWithObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplaceDataValueWithObject_AttributeToReplaceDataWithObjectName() {
		return (EAttribute)replaceDataValueWithObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplaceDataValueWithObject_NewAttributesName() {
		return (EAttribute)replaceDataValueWithObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncapsulateField() {
		return encapsulateFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncapsulateField_SourceClass() {
		return (EReference)encapsulateFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncapsulateField_AttributeToEncapsulate() {
		return (EReference)encapsulateFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncapsulateField_SourceClassName() {
		return (EAttribute)encapsulateFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncapsulateField_AttributeToEncapsulateName() {
		return (EAttribute)encapsulateFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDealingWithGeneralization() {
		return dealingWithGeneralizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDealingWithGeneralization_AllRefactorings() {
		return (EReference)dealingWithGeneralizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDealingWithGeneralization_Name() {
		return (EAttribute)dealingWithGeneralizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPushDownMethod() {
		return pushDownMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPushDownMethod_MethodToBePushed() {
		return (EReference)pushDownMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPushDownMethod_SourceClass() {
		return (EReference)pushDownMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPushDownMethod_TargetClass() {
		return (EReference)pushDownMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPushDownMethod_SourceClassName() {
		return (EAttribute)pushDownMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPushDownMethod_TargetClassName() {
		return (EAttribute)pushDownMethodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPushDownMethod_MethodToBePushedName() {
		return (EAttribute)pushDownMethodEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPushDownAttribute() {
		return pushDownAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPushDownAttribute_AttributeToBePushed() {
		return (EReference)pushDownAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPushDownAttribute_SourceClass() {
		return (EReference)pushDownAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPushDownAttribute_TargetClass() {
		return (EReference)pushDownAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPushDownAttribute_SourceClassName() {
		return (EAttribute)pushDownAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPushDownAttribute_TargetClassName() {
		return (EAttribute)pushDownAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPushDownAttribute_AttributeToBePushedName() {
		return (EAttribute)pushDownAttributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPullUpAttribute() {
		return pullUpAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPullUpAttribute_AttributeToBePulled() {
		return (EReference)pullUpAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPullUpAttribute_SourceClass() {
		return (EReference)pullUpAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPullUpAttribute_TargetClass() {
		return (EReference)pullUpAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPullUpAttribute_SourceClassName() {
		return (EAttribute)pullUpAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPullUpAttribute_TargetClassName() {
		return (EAttribute)pullUpAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPullUpAttribute_AttributeToBePulledName() {
		return (EAttribute)pullUpAttributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPullUpMethod() {
		return pullUpMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPullUpMethod_MethodToBePulled() {
		return (EReference)pullUpMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPullUpMethod_SourceClass() {
		return (EReference)pullUpMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPullUpMethod_TargetClass() {
		return (EReference)pullUpMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPullUpMethod_SourceClassName() {
		return (EAttribute)pullUpMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPullUpMethod_TargetClassName() {
		return (EAttribute)pullUpMethodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPullUpMethod_MethodToBePulledName() {
		return (EAttribute)pullUpMethodEClass.getEStructuralFeatures().get(5);
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
		createEAttribute(renameClassEClass, RENAME_CLASS__CLASS_TO_BE_RENAMED_NAME);

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
		createEAttribute(renameAttributeEClass, RENAME_ATTRIBUTE__SOURCE_CLASS_NAME);
		createEAttribute(renameAttributeEClass, RENAME_ATTRIBUTE__ATTRIBUTE_TO_BE_RENAMED_NAME);

		renameMethodEClass = createEClass(RENAME_METHOD);
		createEAttribute(renameMethodEClass, RENAME_METHOD__NEW_NAME);
		createEReference(renameMethodEClass, RENAME_METHOD__METHOD_TO_BE_RENAME);
		createEReference(renameMethodEClass, RENAME_METHOD__SOURCE_CLASS);
		createEAttribute(renameMethodEClass, RENAME_METHOD__SOURCE_CLASS_NAME);
		createEAttribute(renameMethodEClass, RENAME_METHOD__METHOD_TO_BE_RENAMED_NAME);

		movingFeaturesBetweenObjectsEClass = createEClass(MOVING_FEATURES_BETWEEN_OBJECTS);
		createEAttribute(movingFeaturesBetweenObjectsEClass, MOVING_FEATURES_BETWEEN_OBJECTS__NAME);
		createEReference(movingFeaturesBetweenObjectsEClass, MOVING_FEATURES_BETWEEN_OBJECTS__ALL_REFACTORINGS);

		moveAttributeEClass = createEClass(MOVE_ATTRIBUTE);
		createEReference(moveAttributeEClass, MOVE_ATTRIBUTE__SOURCE_CLASS);
		createEReference(moveAttributeEClass, MOVE_ATTRIBUTE__TARGET_CLASS);
		createEReference(moveAttributeEClass, MOVE_ATTRIBUTE__ATTRIBUTE_TO_BE_MOVED);
		createEAttribute(moveAttributeEClass, MOVE_ATTRIBUTE__SOURCE_CLASS_NAME);
		createEAttribute(moveAttributeEClass, MOVE_ATTRIBUTE__TARGET_CLASS_NAME);
		createEAttribute(moveAttributeEClass, MOVE_ATTRIBUTE__ATTRIBUTE_TO_BE_MOVED_NAME);

		moveMethodEClass = createEClass(MOVE_METHOD);
		createEReference(moveMethodEClass, MOVE_METHOD__SOURCE_CLASS);
		createEReference(moveMethodEClass, MOVE_METHOD__TARGET_CLASS);
		createEReference(moveMethodEClass, MOVE_METHOD__METHOD_TO_BE_MOVED);
		createEAttribute(moveMethodEClass, MOVE_METHOD__SOURCE_CLASS_NAME);
		createEAttribute(moveMethodEClass, MOVE_METHOD__TARGET_CLASS_NAME);
		createEAttribute(moveMethodEClass, MOVE_METHOD__METHOD_TO_BE_MOVED_NAME);

		extractClassEClass = createEClass(EXTRACT_CLASS);
		createEAttribute(extractClassEClass, EXTRACT_CLASS__NEW_NAME);
		createEReference(extractClassEClass, EXTRACT_CLASS__SOURCE_CLASS);
		createEReference(extractClassEClass, EXTRACT_CLASS__ATTRIBUTES_TO_BE_MOVED);
		createEAttribute(extractClassEClass, EXTRACT_CLASS__ATTRIBUTES_TO_BE_MOVED_NAME);
		createEAttribute(extractClassEClass, EXTRACT_CLASS__SOURCE_CLASS_NAME);

		inlineClassEClass = createEClass(INLINE_CLASS);
		createEReference(inlineClassEClass, INLINE_CLASS__CLASS_TO_GET_ALL_FEATURES);
		createEReference(inlineClassEClass, INLINE_CLASS__CLASS_TO_REMOVE);
		createEAttribute(inlineClassEClass, INLINE_CLASS__CLASS_TO_GET_ALL_FEATURES_NAME);
		createEAttribute(inlineClassEClass, INLINE_CLASS__CLASS_TO_REMOVE_NAME);

		organizingDataEClass = createEClass(ORGANIZING_DATA);
		createEAttribute(organizingDataEClass, ORGANIZING_DATA__NAME);
		createEReference(organizingDataEClass, ORGANIZING_DATA__ALL_REFACTORINGS);

		replaceDataValueWithObjectEClass = createEClass(REPLACE_DATA_VALUE_WITH_OBJECT);
		createEReference(replaceDataValueWithObjectEClass, REPLACE_DATA_VALUE_WITH_OBJECT__SOURCE_CLASS);
		createEReference(replaceDataValueWithObjectEClass, REPLACE_DATA_VALUE_WITH_OBJECT__ATTRIBUTE_TO_REPLACE_DATA_WITH_OBJECT);
		createEReference(replaceDataValueWithObjectEClass, REPLACE_DATA_VALUE_WITH_OBJECT__NEW_ATTRIBUTES);
		createEAttribute(replaceDataValueWithObjectEClass, REPLACE_DATA_VALUE_WITH_OBJECT__SOURCE_CLASS_NAME);
		createEAttribute(replaceDataValueWithObjectEClass, REPLACE_DATA_VALUE_WITH_OBJECT__ATTRIBUTE_TO_REPLACE_DATA_WITH_OBJECT_NAME);
		createEAttribute(replaceDataValueWithObjectEClass, REPLACE_DATA_VALUE_WITH_OBJECT__NEW_ATTRIBUTES_NAME);

		encapsulateFieldEClass = createEClass(ENCAPSULATE_FIELD);
		createEReference(encapsulateFieldEClass, ENCAPSULATE_FIELD__SOURCE_CLASS);
		createEReference(encapsulateFieldEClass, ENCAPSULATE_FIELD__ATTRIBUTE_TO_ENCAPSULATE);
		createEAttribute(encapsulateFieldEClass, ENCAPSULATE_FIELD__SOURCE_CLASS_NAME);
		createEAttribute(encapsulateFieldEClass, ENCAPSULATE_FIELD__ATTRIBUTE_TO_ENCAPSULATE_NAME);

		dealingWithGeneralizationEClass = createEClass(DEALING_WITH_GENERALIZATION);
		createEReference(dealingWithGeneralizationEClass, DEALING_WITH_GENERALIZATION__ALL_REFACTORINGS);
		createEAttribute(dealingWithGeneralizationEClass, DEALING_WITH_GENERALIZATION__NAME);

		pushDownMethodEClass = createEClass(PUSH_DOWN_METHOD);
		createEReference(pushDownMethodEClass, PUSH_DOWN_METHOD__METHOD_TO_BE_PUSHED);
		createEReference(pushDownMethodEClass, PUSH_DOWN_METHOD__SOURCE_CLASS);
		createEReference(pushDownMethodEClass, PUSH_DOWN_METHOD__TARGET_CLASS);
		createEAttribute(pushDownMethodEClass, PUSH_DOWN_METHOD__SOURCE_CLASS_NAME);
		createEAttribute(pushDownMethodEClass, PUSH_DOWN_METHOD__TARGET_CLASS_NAME);
		createEAttribute(pushDownMethodEClass, PUSH_DOWN_METHOD__METHOD_TO_BE_PUSHED_NAME);

		pushDownAttributeEClass = createEClass(PUSH_DOWN_ATTRIBUTE);
		createEReference(pushDownAttributeEClass, PUSH_DOWN_ATTRIBUTE__ATTRIBUTE_TO_BE_PUSHED);
		createEReference(pushDownAttributeEClass, PUSH_DOWN_ATTRIBUTE__SOURCE_CLASS);
		createEReference(pushDownAttributeEClass, PUSH_DOWN_ATTRIBUTE__TARGET_CLASS);
		createEAttribute(pushDownAttributeEClass, PUSH_DOWN_ATTRIBUTE__SOURCE_CLASS_NAME);
		createEAttribute(pushDownAttributeEClass, PUSH_DOWN_ATTRIBUTE__TARGET_CLASS_NAME);
		createEAttribute(pushDownAttributeEClass, PUSH_DOWN_ATTRIBUTE__ATTRIBUTE_TO_BE_PUSHED_NAME);

		pullUpAttributeEClass = createEClass(PULL_UP_ATTRIBUTE);
		createEReference(pullUpAttributeEClass, PULL_UP_ATTRIBUTE__ATTRIBUTE_TO_BE_PULLED);
		createEReference(pullUpAttributeEClass, PULL_UP_ATTRIBUTE__SOURCE_CLASS);
		createEReference(pullUpAttributeEClass, PULL_UP_ATTRIBUTE__TARGET_CLASS);
		createEAttribute(pullUpAttributeEClass, PULL_UP_ATTRIBUTE__SOURCE_CLASS_NAME);
		createEAttribute(pullUpAttributeEClass, PULL_UP_ATTRIBUTE__TARGET_CLASS_NAME);
		createEAttribute(pullUpAttributeEClass, PULL_UP_ATTRIBUTE__ATTRIBUTE_TO_BE_PULLED_NAME);

		pullUpMethodEClass = createEClass(PULL_UP_METHOD);
		createEReference(pullUpMethodEClass, PULL_UP_METHOD__METHOD_TO_BE_PULLED);
		createEReference(pullUpMethodEClass, PULL_UP_METHOD__SOURCE_CLASS);
		createEReference(pullUpMethodEClass, PULL_UP_METHOD__TARGET_CLASS);
		createEAttribute(pullUpMethodEClass, PULL_UP_METHOD__SOURCE_CLASS_NAME);
		createEAttribute(pullUpMethodEClass, PULL_UP_METHOD__TARGET_CLASS_NAME);
		createEAttribute(pullUpMethodEClass, PULL_UP_METHOD__METHOD_TO_BE_PULLED_NAME);
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
		organizingDataEClass.getESuperTypes().add(this.getRefactoring());
		replaceDataValueWithObjectEClass.getESuperTypes().add(this.getOrganizingData());
		encapsulateFieldEClass.getESuperTypes().add(this.getOrganizingData());
		dealingWithGeneralizationEClass.getESuperTypes().add(this.getRefactoring());
		pushDownMethodEClass.getESuperTypes().add(this.getDealingWithGeneralization());
		pushDownAttributeEClass.getESuperTypes().add(this.getDealingWithGeneralization());
		pullUpAttributeEClass.getESuperTypes().add(this.getDealingWithGeneralization());
		pullUpMethodEClass.getESuperTypes().add(this.getDealingWithGeneralization());

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
		initEAttribute(getRenameClass_ClassToBeRenamedName(), ecorePackage.getEString(), "classToBeRenamedName", null, 0, 1, RenameClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
		initEAttribute(getRenameAttribute_SourceClassName(), ecorePackage.getEString(), "sourceClassName", null, 0, 1, RenameAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenameAttribute_AttributeToBeRenamedName(), ecorePackage.getEString(), "attributeToBeRenamedName", null, 0, 1, RenameAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(renameMethodEClass, RenameMethod.class, "RenameMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRenameMethod_NewName(), ecorePackage.getEString(), "newName", null, 0, 1, RenameMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRenameMethod_MethodToBeRename(), this.getMethod(), null, "methodToBeRename", null, 0, 1, RenameMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRenameMethod_SourceClass(), this.getClass_(), null, "sourceClass", null, 0, 1, RenameMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenameMethod_SourceClassName(), ecorePackage.getEString(), "sourceClassName", null, 0, 1, RenameMethod.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenameMethod_MethodToBeRenamedName(), ecorePackage.getEString(), "methodToBeRenamedName", null, 0, 1, RenameMethod.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(movingFeaturesBetweenObjectsEClass, MovingFeaturesBetweenObjects.class, "MovingFeaturesBetweenObjects", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMovingFeaturesBetweenObjects_Name(), ecorePackage.getEString(), "name", null, 0, 1, MovingFeaturesBetweenObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMovingFeaturesBetweenObjects_AllRefactorings(), this.getMovingFeaturesBetweenObjects(), null, "allRefactorings", null, 0, -1, MovingFeaturesBetweenObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moveAttributeEClass, MoveAttribute.class, "MoveAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMoveAttribute_SourceClass(), this.getClass_(), null, "sourceClass", null, 0, 1, MoveAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMoveAttribute_TargetClass(), this.getClass_(), null, "targetClass", null, 0, 1, MoveAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMoveAttribute_AttributeToBeMoved(), this.getAttribute(), null, "attributeToBeMoved", null, 0, 1, MoveAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveAttribute_SourceClassName(), ecorePackage.getEString(), "sourceClassName", null, 0, 1, MoveAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveAttribute_TargetClassName(), ecorePackage.getEString(), "targetClassName", null, 0, 1, MoveAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveAttribute_AttributeToBeMovedName(), ecorePackage.getEString(), "attributeToBeMovedName", null, 0, 1, MoveAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(moveMethodEClass, MoveMethod.class, "MoveMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMoveMethod_SourceClass(), this.getClass_(), null, "sourceClass", null, 0, 1, MoveMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMoveMethod_TargetClass(), this.getClass_(), null, "targetClass", null, 0, 1, MoveMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMoveMethod_MethodToBeMoved(), this.getMethod(), null, "methodToBeMoved", null, 0, 1, MoveMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveMethod_SourceClassName(), ecorePackage.getEString(), "sourceClassName", null, 0, 1, MoveMethod.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveMethod_TargetClassName(), ecorePackage.getEString(), "targetClassName", null, 0, 1, MoveMethod.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveMethod_MethodToBeMovedName(), ecorePackage.getEString(), "methodToBeMovedName", null, 0, 1, MoveMethod.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(extractClassEClass, ExtractClass.class, "ExtractClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtractClass_NewName(), ecorePackage.getEString(), "newName", null, 0, 1, ExtractClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getExtractClass_SourceClass(), this.getClass_(), null, "sourceClass", null, 0, 1, ExtractClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtractClass_AttributesToBeMoved(), this.getAttribute(), null, "attributesToBeMoved", null, 0, -1, ExtractClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtractClass_AttributesToBeMovedName(), ecorePackage.getEString(), "attributesToBeMovedName", null, 0, 1, ExtractClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtractClass_SourceClassName(), ecorePackage.getEString(), "sourceClassName", null, 0, 1, ExtractClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(inlineClassEClass, InlineClass.class, "InlineClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInlineClass_ClassToGetAllFeatures(), this.getClass_(), null, "classToGetAllFeatures", null, 0, 1, InlineClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInlineClass_ClassToRemove(), this.getClass_(), null, "classToRemove", null, 0, 1, InlineClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineClass_ClassToGetAllFeaturesName(), ecorePackage.getEString(), "classToGetAllFeaturesName", null, 0, 1, InlineClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineClass_ClassToRemoveName(), ecorePackage.getEString(), "classToRemoveName", null, 0, 1, InlineClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(organizingDataEClass, OrganizingData.class, "OrganizingData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrganizingData_Name(), ecorePackage.getEString(), "name", null, 0, 1, OrganizingData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizingData_AllRefactorings(), this.getOrganizingData(), null, "allRefactorings", null, 0, -1, OrganizingData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(replaceDataValueWithObjectEClass, ReplaceDataValueWithObject.class, "ReplaceDataValueWithObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReplaceDataValueWithObject_SourceClass(), this.getClass_(), null, "sourceClass", null, 0, 1, ReplaceDataValueWithObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReplaceDataValueWithObject_AttributeToReplaceDataWithObject(), this.getAttribute(), null, "attributeToReplaceDataWithObject", null, 0, 1, ReplaceDataValueWithObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReplaceDataValueWithObject_NewAttributes(), this.getAttribute(), null, "newAttributes", null, 0, -1, ReplaceDataValueWithObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReplaceDataValueWithObject_SourceClassName(), ecorePackage.getEString(), "sourceClassName", null, 0, 1, ReplaceDataValueWithObject.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getReplaceDataValueWithObject_AttributeToReplaceDataWithObjectName(), ecorePackage.getEString(), "attributeToReplaceDataWithObjectName", null, 0, 1, ReplaceDataValueWithObject.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getReplaceDataValueWithObject_NewAttributesName(), ecorePackage.getEString(), "newAttributesName", null, 0, 1, ReplaceDataValueWithObject.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(encapsulateFieldEClass, EncapsulateField.class, "EncapsulateField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEncapsulateField_SourceClass(), this.getClass_(), null, "sourceClass", null, 0, 1, EncapsulateField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEncapsulateField_AttributeToEncapsulate(), this.getAttribute(), null, "attributeToEncapsulate", null, 0, 1, EncapsulateField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncapsulateField_SourceClassName(), ecorePackage.getEString(), "sourceClassName", null, 0, 1, EncapsulateField.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncapsulateField_AttributeToEncapsulateName(), ecorePackage.getEString(), "attributeToEncapsulateName", "", 0, 1, EncapsulateField.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dealingWithGeneralizationEClass, DealingWithGeneralization.class, "DealingWithGeneralization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDealingWithGeneralization_AllRefactorings(), this.getDealingWithGeneralization(), null, "allRefactorings", null, 0, -1, DealingWithGeneralization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDealingWithGeneralization_Name(), ecorePackage.getEString(), "name", null, 0, 1, DealingWithGeneralization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pushDownMethodEClass, PushDownMethod.class, "PushDownMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPushDownMethod_MethodToBePushed(), this.getMethod(), null, "methodToBePushed", null, 0, 1, PushDownMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPushDownMethod_SourceClass(), this.getClass_(), null, "sourceClass", null, 0, 1, PushDownMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPushDownMethod_TargetClass(), this.getClass_(), null, "targetClass", null, 0, 1, PushDownMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPushDownMethod_SourceClassName(), ecorePackage.getEString(), "sourceClassName", null, 0, 1, PushDownMethod.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPushDownMethod_TargetClassName(), ecorePackage.getEString(), "targetClassName", null, 0, 1, PushDownMethod.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPushDownMethod_MethodToBePushedName(), ecorePackage.getEString(), "methodToBePushedName", null, 0, 1, PushDownMethod.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(pushDownAttributeEClass, PushDownAttribute.class, "PushDownAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPushDownAttribute_AttributeToBePushed(), this.getAttribute(), null, "attributeToBePushed", null, 0, 1, PushDownAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPushDownAttribute_SourceClass(), this.getClass_(), null, "sourceClass", null, 0, 1, PushDownAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPushDownAttribute_TargetClass(), this.getClass_(), null, "targetClass", null, 0, 1, PushDownAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPushDownAttribute_SourceClassName(), ecorePackage.getEString(), "sourceClassName", null, 0, 1, PushDownAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPushDownAttribute_TargetClassName(), ecorePackage.getEString(), "targetClassName", null, 0, 1, PushDownAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPushDownAttribute_AttributeToBePushedName(), ecorePackage.getEString(), "attributeToBePushedName", null, 0, 1, PushDownAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(pullUpAttributeEClass, PullUpAttribute.class, "PullUpAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPullUpAttribute_AttributeToBePulled(), this.getAttribute(), null, "attributeToBePulled", null, 0, 1, PullUpAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPullUpAttribute_SourceClass(), this.getClass_(), null, "sourceClass", null, 0, 1, PullUpAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPullUpAttribute_TargetClass(), this.getClass_(), null, "targetClass", null, 0, 1, PullUpAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPullUpAttribute_SourceClassName(), ecorePackage.getEString(), "sourceClassName", null, 0, 1, PullUpAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPullUpAttribute_TargetClassName(), ecorePackage.getEString(), "targetClassName", null, 0, 1, PullUpAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPullUpAttribute_AttributeToBePulledName(), ecorePackage.getEString(), "attributeToBePulledName", null, 0, 1, PullUpAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(pullUpMethodEClass, PullUpMethod.class, "PullUpMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPullUpMethod_MethodToBePulled(), this.getMethod(), null, "methodToBePulled", null, 0, 1, PullUpMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPullUpMethod_SourceClass(), this.getClass_(), null, "sourceClass", null, 0, 1, PullUpMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPullUpMethod_TargetClass(), this.getClass_(), null, "targetClass", null, 0, 1, PullUpMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPullUpMethod_SourceClassName(), ecorePackage.getEString(), "sourceClassName", null, 0, 1, PullUpMethod.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPullUpMethod_TargetClassName(), ecorePackage.getEString(), "targetClassName", null, 0, 1, PullUpMethod.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPullUpMethod_MethodToBePulledName(), ecorePackage.getEString(), "methodToBePulledName", null, 0, 1, PullUpMethod.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RefactoringPackageImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br.refactoring.dsl.refactoring.util;

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
import com.br.refactoring.dsl.refactoring.PushDownAttribute;
import com.br.refactoring.dsl.refactoring.PushDownMethod;
import com.br.refactoring.dsl.refactoring.Refactoring;
import com.br.refactoring.dsl.refactoring.RefactoringPackage;
import com.br.refactoring.dsl.refactoring.RenameAttribute;
import com.br.refactoring.dsl.refactoring.RenameClass;
import com.br.refactoring.dsl.refactoring.RenameFeature;
import com.br.refactoring.dsl.refactoring.RenameMethod;
import com.br.refactoring.dsl.refactoring.ReplaceDataValueWithObject;
import com.br.refactoring.dsl.refactoring.Type;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage
 * @generated
 */
public class RefactoringAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RefactoringPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefactoringAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RefactoringPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefactoringSwitch<Adapter> modelSwitch =
		new RefactoringSwitch<Adapter>() {
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseClass(com.br.refactoring.dsl.refactoring.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseRefactoring(Refactoring object) {
				return createRefactoringAdapter();
			}
			@Override
			public Adapter caseRenameFeature(RenameFeature object) {
				return createRenameFeatureAdapter();
			}
			@Override
			public Adapter caseRenameClass(RenameClass object) {
				return createRenameClassAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseMethod(Method object) {
				return createMethodAdapter();
			}
			@Override
			public Adapter caseElementType(ElementType object) {
				return createElementTypeAdapter();
			}
			@Override
			public Adapter caseBasicType(BasicType object) {
				return createBasicTypeAdapter();
			}
			@Override
			public Adapter caseClassType(ClassType object) {
				return createClassTypeAdapter();
			}
			@Override
			public Adapter caseRenameAttribute(RenameAttribute object) {
				return createRenameAttributeAdapter();
			}
			@Override
			public Adapter caseRenameMethod(RenameMethod object) {
				return createRenameMethodAdapter();
			}
			@Override
			public Adapter caseMovingFeaturesBetweenObjects(MovingFeaturesBetweenObjects object) {
				return createMovingFeaturesBetweenObjectsAdapter();
			}
			@Override
			public Adapter caseMoveAttribute(MoveAttribute object) {
				return createMoveAttributeAdapter();
			}
			@Override
			public Adapter caseMoveMethod(MoveMethod object) {
				return createMoveMethodAdapter();
			}
			@Override
			public Adapter caseExtractClass(ExtractClass object) {
				return createExtractClassAdapter();
			}
			@Override
			public Adapter caseInlineClass(InlineClass object) {
				return createInlineClassAdapter();
			}
			@Override
			public Adapter caseOrganizingData(OrganizingData object) {
				return createOrganizingDataAdapter();
			}
			@Override
			public Adapter caseReplaceDataValueWithObject(ReplaceDataValueWithObject object) {
				return createReplaceDataValueWithObjectAdapter();
			}
			@Override
			public Adapter caseEncapsulateField(EncapsulateField object) {
				return createEncapsulateFieldAdapter();
			}
			@Override
			public Adapter caseDealingWithGeneralization(DealingWithGeneralization object) {
				return createDealingWithGeneralizationAdapter();
			}
			@Override
			public Adapter casePushDownMethod(PushDownMethod object) {
				return createPushDownMethodAdapter();
			}
			@Override
			public Adapter casePushDownAttribute(PushDownAttribute object) {
				return createPushDownAttributeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.br.refactoring.dsl.refactoring.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br.refactoring.dsl.refactoring.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br.refactoring.dsl.refactoring.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br.refactoring.dsl.refactoring.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br.refactoring.dsl.refactoring.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br.refactoring.dsl.refactoring.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br.refactoring.dsl.refactoring.Refactoring <em>Refactoring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br.refactoring.dsl.refactoring.Refactoring
	 * @generated
	 */
	public Adapter createRefactoringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br.refactoring.dsl.refactoring.RenameFeature <em>Rename Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br.refactoring.dsl.refactoring.RenameFeature
	 * @generated
	 */
	public Adapter createRenameFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br.refactoring.dsl.refactoring.RenameClass <em>Rename Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br.refactoring.dsl.refactoring.RenameClass
	 * @generated
	 */
	public Adapter createRenameClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br.refactoring.dsl.refactoring.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br.refactoring.dsl.refactoring.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br.refactoring.dsl.refactoring.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br.refactoring.dsl.refactoring.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br.refactoring.dsl.refactoring.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br.refactoring.dsl.refactoring.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br.refactoring.dsl.refactoring.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br.refactoring.dsl.refactoring.ElementType
	 * @generated
	 */
	public Adapter createElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br.refactoring.dsl.refactoring.BasicType <em>Basic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br.refactoring.dsl.refactoring.BasicType
	 * @generated
	 */
	public Adapter createBasicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br.refactoring.dsl.refactoring.ClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br.refactoring.dsl.refactoring.ClassType
	 * @generated
	 */
	public Adapter createClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br.refactoring.dsl.refactoring.RenameAttribute <em>Rename Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br.refactoring.dsl.refactoring.RenameAttribute
	 * @generated
	 */
	public Adapter createRenameAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br.refactoring.dsl.refactoring.RenameMethod <em>Rename Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br.refactoring.dsl.refactoring.RenameMethod
	 * @generated
	 */
	public Adapter createRenameMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br.refactoring.dsl.refactoring.MovingFeaturesBetweenObjects <em>Moving Features Between Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br.refactoring.dsl.refactoring.MovingFeaturesBetweenObjects
	 * @generated
	 */
	public Adapter createMovingFeaturesBetweenObjectsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br.refactoring.dsl.refactoring.MoveAttribute <em>Move Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br.refactoring.dsl.refactoring.MoveAttribute
	 * @generated
	 */
	public Adapter createMoveAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br.refactoring.dsl.refactoring.MoveMethod <em>Move Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br.refactoring.dsl.refactoring.MoveMethod
	 * @generated
	 */
	public Adapter createMoveMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br.refactoring.dsl.refactoring.ExtractClass <em>Extract Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br.refactoring.dsl.refactoring.ExtractClass
	 * @generated
	 */
	public Adapter createExtractClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br.refactoring.dsl.refactoring.InlineClass <em>Inline Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br.refactoring.dsl.refactoring.InlineClass
	 * @generated
	 */
	public Adapter createInlineClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br.refactoring.dsl.refactoring.OrganizingData <em>Organizing Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br.refactoring.dsl.refactoring.OrganizingData
	 * @generated
	 */
	public Adapter createOrganizingDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br.refactoring.dsl.refactoring.ReplaceDataValueWithObject <em>Replace Data Value With Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br.refactoring.dsl.refactoring.ReplaceDataValueWithObject
	 * @generated
	 */
	public Adapter createReplaceDataValueWithObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br.refactoring.dsl.refactoring.EncapsulateField <em>Encapsulate Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br.refactoring.dsl.refactoring.EncapsulateField
	 * @generated
	 */
	public Adapter createEncapsulateFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br.refactoring.dsl.refactoring.DealingWithGeneralization <em>Dealing With Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br.refactoring.dsl.refactoring.DealingWithGeneralization
	 * @generated
	 */
	public Adapter createDealingWithGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br.refactoring.dsl.refactoring.PushDownMethod <em>Push Down Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br.refactoring.dsl.refactoring.PushDownMethod
	 * @generated
	 */
	public Adapter createPushDownMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.br.refactoring.dsl.refactoring.PushDownAttribute <em>Push Down Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.br.refactoring.dsl.refactoring.PushDownAttribute
	 * @generated
	 */
	public Adapter createPushDownAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RefactoringAdapterFactory

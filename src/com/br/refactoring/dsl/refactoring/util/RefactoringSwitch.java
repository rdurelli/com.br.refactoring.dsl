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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.br.refactoring.dsl.refactoring.RefactoringPackage
 * @generated
 */
public class RefactoringSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RefactoringPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefactoringSwitch() {
		if (modelPackage == null) {
			modelPackage = RefactoringPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RefactoringPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringPackage.CLASS: {
				com.br.refactoring.dsl.refactoring.Class class_ = (com.br.refactoring.dsl.refactoring.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseType(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringPackage.REFACTORING: {
				Refactoring refactoring = (Refactoring)theEObject;
				T result = caseRefactoring(refactoring);
				if (result == null) result = caseType(refactoring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringPackage.RENAME_FEATURE: {
				RenameFeature renameFeature = (RenameFeature)theEObject;
				T result = caseRenameFeature(renameFeature);
				if (result == null) result = caseRefactoring(renameFeature);
				if (result == null) result = caseType(renameFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringPackage.RENAME_CLASS: {
				RenameClass renameClass = (RenameClass)theEObject;
				T result = caseRenameClass(renameClass);
				if (result == null) result = caseRenameFeature(renameClass);
				if (result == null) result = caseRefactoring(renameClass);
				if (result == null) result = caseType(renameClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringPackage.METHOD: {
				Method method = (Method)theEObject;
				T result = caseMethod(method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringPackage.ELEMENT_TYPE: {
				ElementType elementType = (ElementType)theEObject;
				T result = caseElementType(elementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringPackage.BASIC_TYPE: {
				BasicType basicType = (BasicType)theEObject;
				T result = caseBasicType(basicType);
				if (result == null) result = caseElementType(basicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringPackage.CLASS_TYPE: {
				ClassType classType = (ClassType)theEObject;
				T result = caseClassType(classType);
				if (result == null) result = caseElementType(classType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringPackage.RENAME_ATTRIBUTE: {
				RenameAttribute renameAttribute = (RenameAttribute)theEObject;
				T result = caseRenameAttribute(renameAttribute);
				if (result == null) result = caseRenameFeature(renameAttribute);
				if (result == null) result = caseRefactoring(renameAttribute);
				if (result == null) result = caseType(renameAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringPackage.RENAME_METHOD: {
				RenameMethod renameMethod = (RenameMethod)theEObject;
				T result = caseRenameMethod(renameMethod);
				if (result == null) result = caseRenameFeature(renameMethod);
				if (result == null) result = caseRefactoring(renameMethod);
				if (result == null) result = caseType(renameMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringPackage.MOVING_FEATURES_BETWEEN_OBJECTS: {
				MovingFeaturesBetweenObjects movingFeaturesBetweenObjects = (MovingFeaturesBetweenObjects)theEObject;
				T result = caseMovingFeaturesBetweenObjects(movingFeaturesBetweenObjects);
				if (result == null) result = caseRefactoring(movingFeaturesBetweenObjects);
				if (result == null) result = caseType(movingFeaturesBetweenObjects);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringPackage.MOVE_ATTRIBUTE: {
				MoveAttribute moveAttribute = (MoveAttribute)theEObject;
				T result = caseMoveAttribute(moveAttribute);
				if (result == null) result = caseMovingFeaturesBetweenObjects(moveAttribute);
				if (result == null) result = caseRefactoring(moveAttribute);
				if (result == null) result = caseType(moveAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringPackage.MOVE_METHOD: {
				MoveMethod moveMethod = (MoveMethod)theEObject;
				T result = caseMoveMethod(moveMethod);
				if (result == null) result = caseMovingFeaturesBetweenObjects(moveMethod);
				if (result == null) result = caseRefactoring(moveMethod);
				if (result == null) result = caseType(moveMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringPackage.EXTRACT_CLASS: {
				ExtractClass extractClass = (ExtractClass)theEObject;
				T result = caseExtractClass(extractClass);
				if (result == null) result = caseMovingFeaturesBetweenObjects(extractClass);
				if (result == null) result = caseRefactoring(extractClass);
				if (result == null) result = caseType(extractClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringPackage.INLINE_CLASS: {
				InlineClass inlineClass = (InlineClass)theEObject;
				T result = caseInlineClass(inlineClass);
				if (result == null) result = caseMovingFeaturesBetweenObjects(inlineClass);
				if (result == null) result = caseRefactoring(inlineClass);
				if (result == null) result = caseType(inlineClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringPackage.ORGANIZING_DATA: {
				OrganizingData organizingData = (OrganizingData)theEObject;
				T result = caseOrganizingData(organizingData);
				if (result == null) result = caseRefactoring(organizingData);
				if (result == null) result = caseType(organizingData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringPackage.REPLACE_DATA_VALUE_WITH_OBJECT: {
				ReplaceDataValueWithObject replaceDataValueWithObject = (ReplaceDataValueWithObject)theEObject;
				T result = caseReplaceDataValueWithObject(replaceDataValueWithObject);
				if (result == null) result = caseOrganizingData(replaceDataValueWithObject);
				if (result == null) result = caseRefactoring(replaceDataValueWithObject);
				if (result == null) result = caseType(replaceDataValueWithObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringPackage.ENCAPSULATE_FIELD: {
				EncapsulateField encapsulateField = (EncapsulateField)theEObject;
				T result = caseEncapsulateField(encapsulateField);
				if (result == null) result = caseOrganizingData(encapsulateField);
				if (result == null) result = caseRefactoring(encapsulateField);
				if (result == null) result = caseType(encapsulateField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringPackage.DEALING_WITH_GENERALIZATION: {
				DealingWithGeneralization dealingWithGeneralization = (DealingWithGeneralization)theEObject;
				T result = caseDealingWithGeneralization(dealingWithGeneralization);
				if (result == null) result = caseRefactoring(dealingWithGeneralization);
				if (result == null) result = caseType(dealingWithGeneralization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringPackage.PUSH_DOWN_METHOD: {
				PushDownMethod pushDownMethod = (PushDownMethod)theEObject;
				T result = casePushDownMethod(pushDownMethod);
				if (result == null) result = caseDealingWithGeneralization(pushDownMethod);
				if (result == null) result = caseRefactoring(pushDownMethod);
				if (result == null) result = caseType(pushDownMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringPackage.PUSH_DOWN_ATTRIBUTE: {
				PushDownAttribute pushDownAttribute = (PushDownAttribute)theEObject;
				T result = casePushDownAttribute(pushDownAttribute);
				if (result == null) result = caseDealingWithGeneralization(pushDownAttribute);
				if (result == null) result = caseRefactoring(pushDownAttribute);
				if (result == null) result = caseType(pushDownAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(com.br.refactoring.dsl.refactoring.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refactoring</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refactoring</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefactoring(Refactoring object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rename Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rename Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenameFeature(RenameFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rename Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rename Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenameClass(RenameClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementType(ElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicType(BasicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassType(ClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rename Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rename Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenameAttribute(RenameAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rename Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rename Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenameMethod(RenameMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Moving Features Between Objects</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Moving Features Between Objects</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMovingFeaturesBetweenObjects(MovingFeaturesBetweenObjects object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveAttribute(MoveAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveMethod(MoveMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extract Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extract Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtractClass(ExtractClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlineClass(InlineClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organizing Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organizing Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizingData(OrganizingData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replace Data Value With Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replace Data Value With Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplaceDataValueWithObject(ReplaceDataValueWithObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encapsulate Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encapsulate Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncapsulateField(EncapsulateField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dealing With Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dealing With Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDealingWithGeneralization(DealingWithGeneralization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Push Down Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Push Down Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePushDownMethod(PushDownMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Push Down Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Push Down Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePushDownAttribute(PushDownAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RefactoringSwitch

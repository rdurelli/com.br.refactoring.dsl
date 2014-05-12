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
import com.br.refactoring.dsl.refactoring.ExtractClass;
import com.br.refactoring.dsl.refactoring.Import;
import com.br.refactoring.dsl.refactoring.InlineClass;
import com.br.refactoring.dsl.refactoring.Method;
import com.br.refactoring.dsl.refactoring.Model;
import com.br.refactoring.dsl.refactoring.MoveAttribute;
import com.br.refactoring.dsl.refactoring.MoveMethod;
import com.br.refactoring.dsl.refactoring.MovingFeaturesBetweenObjects;
import com.br.refactoring.dsl.refactoring.OrganizingData;
import com.br.refactoring.dsl.refactoring.RefactoringFactory;
import com.br.refactoring.dsl.refactoring.RefactoringPackage;
import com.br.refactoring.dsl.refactoring.RenameAttribute;
import com.br.refactoring.dsl.refactoring.RenameClass;
import com.br.refactoring.dsl.refactoring.RenameFeature;

import com.br.refactoring.dsl.refactoring.RenameMethod;
import com.br.refactoring.dsl.refactoring.ReplaceDataValueWithObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefactoringFactoryImpl extends EFactoryImpl implements RefactoringFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RefactoringFactory init() {
		try {
			RefactoringFactory theRefactoringFactory = (RefactoringFactory)EPackage.Registry.INSTANCE.getEFactory("http://refactoring/1.0"); 
			if (theRefactoringFactory != null) {
				return theRefactoringFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RefactoringFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefactoringFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RefactoringPackage.MODEL: return createModel();
			case RefactoringPackage.CLASS: return createClass();
			case RefactoringPackage.RENAME_FEATURE: return createRenameFeature();
			case RefactoringPackage.RENAME_CLASS: return createRenameClass();
			case RefactoringPackage.IMPORT: return createImport();
			case RefactoringPackage.ATTRIBUTE: return createAttribute();
			case RefactoringPackage.METHOD: return createMethod();
			case RefactoringPackage.BASIC_TYPE: return createBasicType();
			case RefactoringPackage.CLASS_TYPE: return createClassType();
			case RefactoringPackage.RENAME_ATTRIBUTE: return createRenameAttribute();
			case RefactoringPackage.RENAME_METHOD: return createRenameMethod();
			case RefactoringPackage.MOVING_FEATURES_BETWEEN_OBJECTS: return createMovingFeaturesBetweenObjects();
			case RefactoringPackage.MOVE_ATTRIBUTE: return createMoveAttribute();
			case RefactoringPackage.MOVE_METHOD: return createMoveMethod();
			case RefactoringPackage.EXTRACT_CLASS: return createExtractClass();
			case RefactoringPackage.INLINE_CLASS: return createInlineClass();
			case RefactoringPackage.ORGANIZING_DATA: return createOrganizingData();
			case RefactoringPackage.REPLACE_DATA_VALUE_WITH_OBJECT: return createReplaceDataValueWithObject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.br.refactoring.dsl.refactoring.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameFeature createRenameFeature() {
		RenameFeatureImpl renameFeature = new RenameFeatureImpl();
		return renameFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameClass createRenameClass() {
		RenameClassImpl renameClass = new RenameClassImpl();
		return renameClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicType createBasicType() {
		BasicTypeImpl basicType = new BasicTypeImpl();
		return basicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType createClassType() {
		ClassTypeImpl classType = new ClassTypeImpl();
		return classType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameAttribute createRenameAttribute() {
		RenameAttributeImpl renameAttribute = new RenameAttributeImpl();
		return renameAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameMethod createRenameMethod() {
		RenameMethodImpl renameMethod = new RenameMethodImpl();
		return renameMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovingFeaturesBetweenObjects createMovingFeaturesBetweenObjects() {
		MovingFeaturesBetweenObjectsImpl movingFeaturesBetweenObjects = new MovingFeaturesBetweenObjectsImpl();
		return movingFeaturesBetweenObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveAttribute createMoveAttribute() {
		MoveAttributeImpl moveAttribute = new MoveAttributeImpl();
		return moveAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveMethod createMoveMethod() {
		MoveMethodImpl moveMethod = new MoveMethodImpl();
		return moveMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtractClass createExtractClass() {
		ExtractClassImpl extractClass = new ExtractClassImpl();
		return extractClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InlineClass createInlineClass() {
		InlineClassImpl inlineClass = new InlineClassImpl();
		return inlineClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizingData createOrganizingData() {
		OrganizingDataImpl organizingData = new OrganizingDataImpl();
		return organizingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplaceDataValueWithObject createReplaceDataValueWithObject() {
		ReplaceDataValueWithObjectImpl replaceDataValueWithObject = new ReplaceDataValueWithObjectImpl();
		return replaceDataValueWithObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefactoringPackage getRefactoringPackage() {
		return (RefactoringPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RefactoringPackage getPackage() {
		return RefactoringPackage.eINSTANCE;
	}

} //RefactoringFactoryImpl

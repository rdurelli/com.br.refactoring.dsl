/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br.refactoring.dsl.refactoring.impl;

import com.br.refactoring.dsl.refactoring.Attribute;
import com.br.refactoring.dsl.refactoring.EncapsulateField;
import com.br.refactoring.dsl.refactoring.RefactoringPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encapsulate Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.EncapsulateFieldImpl#getSourceClass <em>Source Class</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.EncapsulateFieldImpl#getAttributeToEncapsulate <em>Attribute To Encapsulate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EncapsulateFieldImpl extends OrganizingDataImpl implements EncapsulateField {
	/**
	 * The cached value of the '{@link #getSourceClass() <em>Source Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceClass()
	 * @generated
	 * @ordered
	 */
	protected com.br.refactoring.dsl.refactoring.Class sourceClass;

	/**
	 * The cached value of the '{@link #getAttributeToEncapsulate() <em>Attribute To Encapsulate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeToEncapsulate()
	 * @generated
	 * @ordered
	 */
	protected Attribute attributeToEncapsulate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncapsulateFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringPackage.Literals.ENCAPSULATE_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.br.refactoring.dsl.refactoring.Class getSourceClass() {
		if (sourceClass != null && sourceClass.eIsProxy()) {
			InternalEObject oldSourceClass = (InternalEObject)sourceClass;
			sourceClass = (com.br.refactoring.dsl.refactoring.Class)eResolveProxy(oldSourceClass);
			if (sourceClass != oldSourceClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringPackage.ENCAPSULATE_FIELD__SOURCE_CLASS, oldSourceClass, sourceClass));
			}
		}
		return sourceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.br.refactoring.dsl.refactoring.Class basicGetSourceClass() {
		return sourceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceClass(com.br.refactoring.dsl.refactoring.Class newSourceClass) {
		com.br.refactoring.dsl.refactoring.Class oldSourceClass = sourceClass;
		sourceClass = newSourceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.ENCAPSULATE_FIELD__SOURCE_CLASS, oldSourceClass, sourceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttributeToEncapsulate() {
		if (attributeToEncapsulate != null && attributeToEncapsulate.eIsProxy()) {
			InternalEObject oldAttributeToEncapsulate = (InternalEObject)attributeToEncapsulate;
			attributeToEncapsulate = (Attribute)eResolveProxy(oldAttributeToEncapsulate);
			if (attributeToEncapsulate != oldAttributeToEncapsulate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringPackage.ENCAPSULATE_FIELD__ATTRIBUTE_TO_ENCAPSULATE, oldAttributeToEncapsulate, attributeToEncapsulate));
			}
		}
		return attributeToEncapsulate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttributeToEncapsulate() {
		return attributeToEncapsulate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeToEncapsulate(Attribute newAttributeToEncapsulate) {
		Attribute oldAttributeToEncapsulate = attributeToEncapsulate;
		attributeToEncapsulate = newAttributeToEncapsulate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.ENCAPSULATE_FIELD__ATTRIBUTE_TO_ENCAPSULATE, oldAttributeToEncapsulate, attributeToEncapsulate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefactoringPackage.ENCAPSULATE_FIELD__SOURCE_CLASS:
				if (resolve) return getSourceClass();
				return basicGetSourceClass();
			case RefactoringPackage.ENCAPSULATE_FIELD__ATTRIBUTE_TO_ENCAPSULATE:
				if (resolve) return getAttributeToEncapsulate();
				return basicGetAttributeToEncapsulate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RefactoringPackage.ENCAPSULATE_FIELD__SOURCE_CLASS:
				setSourceClass((com.br.refactoring.dsl.refactoring.Class)newValue);
				return;
			case RefactoringPackage.ENCAPSULATE_FIELD__ATTRIBUTE_TO_ENCAPSULATE:
				setAttributeToEncapsulate((Attribute)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RefactoringPackage.ENCAPSULATE_FIELD__SOURCE_CLASS:
				setSourceClass((com.br.refactoring.dsl.refactoring.Class)null);
				return;
			case RefactoringPackage.ENCAPSULATE_FIELD__ATTRIBUTE_TO_ENCAPSULATE:
				setAttributeToEncapsulate((Attribute)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RefactoringPackage.ENCAPSULATE_FIELD__SOURCE_CLASS:
				return sourceClass != null;
			case RefactoringPackage.ENCAPSULATE_FIELD__ATTRIBUTE_TO_ENCAPSULATE:
				return attributeToEncapsulate != null;
		}
		return super.eIsSet(featureID);
	}

} //EncapsulateFieldImpl

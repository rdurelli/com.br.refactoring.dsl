/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br.refactoring.dsl.refactoring.impl;

import com.br.refactoring.dsl.refactoring.InlineClass;
import com.br.refactoring.dsl.refactoring.RefactoringPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inline Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.InlineClassImpl#getClassToGetAllFeatures <em>Class To Get All Features</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.InlineClassImpl#getClassToRemove <em>Class To Remove</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InlineClassImpl extends MovingFeaturesBetweenObjectsImpl implements InlineClass {
	/**
	 * The cached value of the '{@link #getClassToGetAllFeatures() <em>Class To Get All Features</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassToGetAllFeatures()
	 * @generated
	 * @ordered
	 */
	protected com.br.refactoring.dsl.refactoring.Class classToGetAllFeatures;

	/**
	 * The cached value of the '{@link #getClassToRemove() <em>Class To Remove</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassToRemove()
	 * @generated
	 * @ordered
	 */
	protected com.br.refactoring.dsl.refactoring.Class classToRemove;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InlineClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringPackage.Literals.INLINE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.br.refactoring.dsl.refactoring.Class getClassToGetAllFeatures() {
		if (classToGetAllFeatures != null && classToGetAllFeatures.eIsProxy()) {
			InternalEObject oldClassToGetAllFeatures = (InternalEObject)classToGetAllFeatures;
			classToGetAllFeatures = (com.br.refactoring.dsl.refactoring.Class)eResolveProxy(oldClassToGetAllFeatures);
			if (classToGetAllFeatures != oldClassToGetAllFeatures) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringPackage.INLINE_CLASS__CLASS_TO_GET_ALL_FEATURES, oldClassToGetAllFeatures, classToGetAllFeatures));
			}
		}
		return classToGetAllFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.br.refactoring.dsl.refactoring.Class basicGetClassToGetAllFeatures() {
		return classToGetAllFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassToGetAllFeatures(com.br.refactoring.dsl.refactoring.Class newClassToGetAllFeatures) {
		com.br.refactoring.dsl.refactoring.Class oldClassToGetAllFeatures = classToGetAllFeatures;
		classToGetAllFeatures = newClassToGetAllFeatures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.INLINE_CLASS__CLASS_TO_GET_ALL_FEATURES, oldClassToGetAllFeatures, classToGetAllFeatures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.br.refactoring.dsl.refactoring.Class getClassToRemove() {
		if (classToRemove != null && classToRemove.eIsProxy()) {
			InternalEObject oldClassToRemove = (InternalEObject)classToRemove;
			classToRemove = (com.br.refactoring.dsl.refactoring.Class)eResolveProxy(oldClassToRemove);
			if (classToRemove != oldClassToRemove) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringPackage.INLINE_CLASS__CLASS_TO_REMOVE, oldClassToRemove, classToRemove));
			}
		}
		return classToRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.br.refactoring.dsl.refactoring.Class basicGetClassToRemove() {
		return classToRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassToRemove(com.br.refactoring.dsl.refactoring.Class newClassToRemove) {
		com.br.refactoring.dsl.refactoring.Class oldClassToRemove = classToRemove;
		classToRemove = newClassToRemove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.INLINE_CLASS__CLASS_TO_REMOVE, oldClassToRemove, classToRemove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefactoringPackage.INLINE_CLASS__CLASS_TO_GET_ALL_FEATURES:
				if (resolve) return getClassToGetAllFeatures();
				return basicGetClassToGetAllFeatures();
			case RefactoringPackage.INLINE_CLASS__CLASS_TO_REMOVE:
				if (resolve) return getClassToRemove();
				return basicGetClassToRemove();
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
			case RefactoringPackage.INLINE_CLASS__CLASS_TO_GET_ALL_FEATURES:
				setClassToGetAllFeatures((com.br.refactoring.dsl.refactoring.Class)newValue);
				return;
			case RefactoringPackage.INLINE_CLASS__CLASS_TO_REMOVE:
				setClassToRemove((com.br.refactoring.dsl.refactoring.Class)newValue);
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
			case RefactoringPackage.INLINE_CLASS__CLASS_TO_GET_ALL_FEATURES:
				setClassToGetAllFeatures((com.br.refactoring.dsl.refactoring.Class)null);
				return;
			case RefactoringPackage.INLINE_CLASS__CLASS_TO_REMOVE:
				setClassToRemove((com.br.refactoring.dsl.refactoring.Class)null);
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
			case RefactoringPackage.INLINE_CLASS__CLASS_TO_GET_ALL_FEATURES:
				return classToGetAllFeatures != null;
			case RefactoringPackage.INLINE_CLASS__CLASS_TO_REMOVE:
				return classToRemove != null;
		}
		return super.eIsSet(featureID);
	}

} //InlineClassImpl

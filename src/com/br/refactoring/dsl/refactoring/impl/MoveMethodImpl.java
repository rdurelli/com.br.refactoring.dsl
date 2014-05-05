/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br.refactoring.dsl.refactoring.impl;

import com.br.refactoring.dsl.refactoring.Method;
import com.br.refactoring.dsl.refactoring.MoveMethod;
import com.br.refactoring.dsl.refactoring.RefactoringPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.MoveMethodImpl#getSourceClass <em>Source Class</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.MoveMethodImpl#getTargetClass <em>Target Class</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.MoveMethodImpl#getMethodToBeMoved <em>Method To Be Moved</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MoveMethodImpl extends MovingFeaturesBetweenObjectsImpl implements MoveMethod {
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
	 * The cached value of the '{@link #getTargetClass() <em>Target Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetClass()
	 * @generated
	 * @ordered
	 */
	protected com.br.refactoring.dsl.refactoring.Class targetClass;

	/**
	 * The cached value of the '{@link #getMethodToBeMoved() <em>Method To Be Moved</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodToBeMoved()
	 * @generated
	 * @ordered
	 */
	protected Method methodToBeMoved;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringPackage.Literals.MOVE_METHOD;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringPackage.MOVE_METHOD__SOURCE_CLASS, oldSourceClass, sourceClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.MOVE_METHOD__SOURCE_CLASS, oldSourceClass, sourceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.br.refactoring.dsl.refactoring.Class getTargetClass() {
		if (targetClass != null && targetClass.eIsProxy()) {
			InternalEObject oldTargetClass = (InternalEObject)targetClass;
			targetClass = (com.br.refactoring.dsl.refactoring.Class)eResolveProxy(oldTargetClass);
			if (targetClass != oldTargetClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringPackage.MOVE_METHOD__TARGET_CLASS, oldTargetClass, targetClass));
			}
		}
		return targetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.br.refactoring.dsl.refactoring.Class basicGetTargetClass() {
		return targetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetClass(com.br.refactoring.dsl.refactoring.Class newTargetClass) {
		com.br.refactoring.dsl.refactoring.Class oldTargetClass = targetClass;
		targetClass = newTargetClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.MOVE_METHOD__TARGET_CLASS, oldTargetClass, targetClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getMethodToBeMoved() {
		if (methodToBeMoved != null && methodToBeMoved.eIsProxy()) {
			InternalEObject oldMethodToBeMoved = (InternalEObject)methodToBeMoved;
			methodToBeMoved = (Method)eResolveProxy(oldMethodToBeMoved);
			if (methodToBeMoved != oldMethodToBeMoved) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringPackage.MOVE_METHOD__METHOD_TO_BE_MOVED, oldMethodToBeMoved, methodToBeMoved));
			}
		}
		return methodToBeMoved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetMethodToBeMoved() {
		return methodToBeMoved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodToBeMoved(Method newMethodToBeMoved) {
		Method oldMethodToBeMoved = methodToBeMoved;
		methodToBeMoved = newMethodToBeMoved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.MOVE_METHOD__METHOD_TO_BE_MOVED, oldMethodToBeMoved, methodToBeMoved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefactoringPackage.MOVE_METHOD__SOURCE_CLASS:
				if (resolve) return getSourceClass();
				return basicGetSourceClass();
			case RefactoringPackage.MOVE_METHOD__TARGET_CLASS:
				if (resolve) return getTargetClass();
				return basicGetTargetClass();
			case RefactoringPackage.MOVE_METHOD__METHOD_TO_BE_MOVED:
				if (resolve) return getMethodToBeMoved();
				return basicGetMethodToBeMoved();
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
			case RefactoringPackage.MOVE_METHOD__SOURCE_CLASS:
				setSourceClass((com.br.refactoring.dsl.refactoring.Class)newValue);
				return;
			case RefactoringPackage.MOVE_METHOD__TARGET_CLASS:
				setTargetClass((com.br.refactoring.dsl.refactoring.Class)newValue);
				return;
			case RefactoringPackage.MOVE_METHOD__METHOD_TO_BE_MOVED:
				setMethodToBeMoved((Method)newValue);
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
			case RefactoringPackage.MOVE_METHOD__SOURCE_CLASS:
				setSourceClass((com.br.refactoring.dsl.refactoring.Class)null);
				return;
			case RefactoringPackage.MOVE_METHOD__TARGET_CLASS:
				setTargetClass((com.br.refactoring.dsl.refactoring.Class)null);
				return;
			case RefactoringPackage.MOVE_METHOD__METHOD_TO_BE_MOVED:
				setMethodToBeMoved((Method)null);
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
			case RefactoringPackage.MOVE_METHOD__SOURCE_CLASS:
				return sourceClass != null;
			case RefactoringPackage.MOVE_METHOD__TARGET_CLASS:
				return targetClass != null;
			case RefactoringPackage.MOVE_METHOD__METHOD_TO_BE_MOVED:
				return methodToBeMoved != null;
		}
		return super.eIsSet(featureID);
	}

} //MoveMethodImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br.refactoring.dsl.refactoring.impl;

import com.br.refactoring.dsl.refactoring.Method;
import com.br.refactoring.dsl.refactoring.PullUpMethod;
import com.br.refactoring.dsl.refactoring.RefactoringPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pull Up Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.PullUpMethodImpl#getMethodToBePulled <em>Method To Be Pulled</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.PullUpMethodImpl#getSourceClass <em>Source Class</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.PullUpMethodImpl#getTargetClass <em>Target Class</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.PullUpMethodImpl#getSourceClassName <em>Source Class Name</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.PullUpMethodImpl#getTargetClassName <em>Target Class Name</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.PullUpMethodImpl#getMethodToBePulledName <em>Method To Be Pulled Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PullUpMethodImpl extends DealingWithGeneralizationImpl implements PullUpMethod {
	/**
	 * The cached value of the '{@link #getMethodToBePulled() <em>Method To Be Pulled</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodToBePulled()
	 * @generated
	 * @ordered
	 */
	protected Method methodToBePulled;

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
	 * The default value of the '{@link #getSourceClassName() <em>Source Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_CLASS_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTargetClassName() <em>Target Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_CLASS_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMethodToBePulledName() <em>Method To Be Pulled Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodToBePulledName()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_TO_BE_PULLED_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PullUpMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringPackage.Literals.PULL_UP_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getMethodToBePulled() {
		if (methodToBePulled != null && methodToBePulled.eIsProxy()) {
			InternalEObject oldMethodToBePulled = (InternalEObject)methodToBePulled;
			methodToBePulled = (Method)eResolveProxy(oldMethodToBePulled);
			if (methodToBePulled != oldMethodToBePulled) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringPackage.PULL_UP_METHOD__METHOD_TO_BE_PULLED, oldMethodToBePulled, methodToBePulled));
			}
		}
		return methodToBePulled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetMethodToBePulled() {
		return methodToBePulled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodToBePulled(Method newMethodToBePulled) {
		Method oldMethodToBePulled = methodToBePulled;
		methodToBePulled = newMethodToBePulled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.PULL_UP_METHOD__METHOD_TO_BE_PULLED, oldMethodToBePulled, methodToBePulled));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringPackage.PULL_UP_METHOD__SOURCE_CLASS, oldSourceClass, sourceClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.PULL_UP_METHOD__SOURCE_CLASS, oldSourceClass, sourceClass));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringPackage.PULL_UP_METHOD__TARGET_CLASS, oldTargetClass, targetClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.PULL_UP_METHOD__TARGET_CLASS, oldTargetClass, targetClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getSourceClassName() {
		return sourceClass.getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getTargetClassName() {
		return targetClass.getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getMethodToBePulledName() {
		return methodToBePulled.getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefactoringPackage.PULL_UP_METHOD__METHOD_TO_BE_PULLED:
				if (resolve) return getMethodToBePulled();
				return basicGetMethodToBePulled();
			case RefactoringPackage.PULL_UP_METHOD__SOURCE_CLASS:
				if (resolve) return getSourceClass();
				return basicGetSourceClass();
			case RefactoringPackage.PULL_UP_METHOD__TARGET_CLASS:
				if (resolve) return getTargetClass();
				return basicGetTargetClass();
			case RefactoringPackage.PULL_UP_METHOD__SOURCE_CLASS_NAME:
				return getSourceClassName();
			case RefactoringPackage.PULL_UP_METHOD__TARGET_CLASS_NAME:
				return getTargetClassName();
			case RefactoringPackage.PULL_UP_METHOD__METHOD_TO_BE_PULLED_NAME:
				return getMethodToBePulledName();
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
			case RefactoringPackage.PULL_UP_METHOD__METHOD_TO_BE_PULLED:
				setMethodToBePulled((Method)newValue);
				return;
			case RefactoringPackage.PULL_UP_METHOD__SOURCE_CLASS:
				setSourceClass((com.br.refactoring.dsl.refactoring.Class)newValue);
				return;
			case RefactoringPackage.PULL_UP_METHOD__TARGET_CLASS:
				setTargetClass((com.br.refactoring.dsl.refactoring.Class)newValue);
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
			case RefactoringPackage.PULL_UP_METHOD__METHOD_TO_BE_PULLED:
				setMethodToBePulled((Method)null);
				return;
			case RefactoringPackage.PULL_UP_METHOD__SOURCE_CLASS:
				setSourceClass((com.br.refactoring.dsl.refactoring.Class)null);
				return;
			case RefactoringPackage.PULL_UP_METHOD__TARGET_CLASS:
				setTargetClass((com.br.refactoring.dsl.refactoring.Class)null);
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
			case RefactoringPackage.PULL_UP_METHOD__METHOD_TO_BE_PULLED:
				return methodToBePulled != null;
			case RefactoringPackage.PULL_UP_METHOD__SOURCE_CLASS:
				return sourceClass != null;
			case RefactoringPackage.PULL_UP_METHOD__TARGET_CLASS:
				return targetClass != null;
			case RefactoringPackage.PULL_UP_METHOD__SOURCE_CLASS_NAME:
				return SOURCE_CLASS_NAME_EDEFAULT == null ? getSourceClassName() != null : !SOURCE_CLASS_NAME_EDEFAULT.equals(getSourceClassName());
			case RefactoringPackage.PULL_UP_METHOD__TARGET_CLASS_NAME:
				return TARGET_CLASS_NAME_EDEFAULT == null ? getTargetClassName() != null : !TARGET_CLASS_NAME_EDEFAULT.equals(getTargetClassName());
			case RefactoringPackage.PULL_UP_METHOD__METHOD_TO_BE_PULLED_NAME:
				return METHOD_TO_BE_PULLED_NAME_EDEFAULT == null ? getMethodToBePulledName() != null : !METHOD_TO_BE_PULLED_NAME_EDEFAULT.equals(getMethodToBePulledName());
		}
		return super.eIsSet(featureID);
	}

} //PullUpMethodImpl

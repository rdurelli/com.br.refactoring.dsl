/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br.refactoring.dsl.refactoring.impl;

import com.br.refactoring.dsl.refactoring.Method;
import com.br.refactoring.dsl.refactoring.PushDownMethod;
import com.br.refactoring.dsl.refactoring.RefactoringPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Push Down Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.PushDownMethodImpl#getMethodToBePushed <em>Method To Be Pushed</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.PushDownMethodImpl#getSourceClass <em>Source Class</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.PushDownMethodImpl#getTargetClass <em>Target Class</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.PushDownMethodImpl#getSourceClassName <em>Source Class Name</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.PushDownMethodImpl#getTargetClassName <em>Target Class Name</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.PushDownMethodImpl#getMethodToBePushedName <em>Method To Be Pushed Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PushDownMethodImpl extends DealingWithGeneralizationImpl implements PushDownMethod {
	/**
	 * The cached value of the '{@link #getMethodToBePushed() <em>Method To Be Pushed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodToBePushed()
	 * @generated
	 * @ordered
	 */
	protected Method methodToBePushed;

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
	 * The default value of the '{@link #getMethodToBePushedName() <em>Method To Be Pushed Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodToBePushedName()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_TO_BE_PUSHED_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PushDownMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringPackage.Literals.PUSH_DOWN_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getMethodToBePushed() {
		if (methodToBePushed != null && methodToBePushed.eIsProxy()) {
			InternalEObject oldMethodToBePushed = (InternalEObject)methodToBePushed;
			methodToBePushed = (Method)eResolveProxy(oldMethodToBePushed);
			if (methodToBePushed != oldMethodToBePushed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringPackage.PUSH_DOWN_METHOD__METHOD_TO_BE_PUSHED, oldMethodToBePushed, methodToBePushed));
			}
		}
		return methodToBePushed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetMethodToBePushed() {
		return methodToBePushed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodToBePushed(Method newMethodToBePushed) {
		Method oldMethodToBePushed = methodToBePushed;
		methodToBePushed = newMethodToBePushed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.PUSH_DOWN_METHOD__METHOD_TO_BE_PUSHED, oldMethodToBePushed, methodToBePushed));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringPackage.PUSH_DOWN_METHOD__SOURCE_CLASS, oldSourceClass, sourceClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.PUSH_DOWN_METHOD__SOURCE_CLASS, oldSourceClass, sourceClass));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringPackage.PUSH_DOWN_METHOD__TARGET_CLASS, oldTargetClass, targetClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.PUSH_DOWN_METHOD__TARGET_CLASS, oldTargetClass, targetClass));
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
	public String getMethodToBePushedName() {
		return methodToBePushed.getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefactoringPackage.PUSH_DOWN_METHOD__METHOD_TO_BE_PUSHED:
				if (resolve) return getMethodToBePushed();
				return basicGetMethodToBePushed();
			case RefactoringPackage.PUSH_DOWN_METHOD__SOURCE_CLASS:
				if (resolve) return getSourceClass();
				return basicGetSourceClass();
			case RefactoringPackage.PUSH_DOWN_METHOD__TARGET_CLASS:
				if (resolve) return getTargetClass();
				return basicGetTargetClass();
			case RefactoringPackage.PUSH_DOWN_METHOD__SOURCE_CLASS_NAME:
				return getSourceClassName();
			case RefactoringPackage.PUSH_DOWN_METHOD__TARGET_CLASS_NAME:
				return getTargetClassName();
			case RefactoringPackage.PUSH_DOWN_METHOD__METHOD_TO_BE_PUSHED_NAME:
				return getMethodToBePushedName();
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
			case RefactoringPackage.PUSH_DOWN_METHOD__METHOD_TO_BE_PUSHED:
				setMethodToBePushed((Method)newValue);
				return;
			case RefactoringPackage.PUSH_DOWN_METHOD__SOURCE_CLASS:
				setSourceClass((com.br.refactoring.dsl.refactoring.Class)newValue);
				return;
			case RefactoringPackage.PUSH_DOWN_METHOD__TARGET_CLASS:
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
			case RefactoringPackage.PUSH_DOWN_METHOD__METHOD_TO_BE_PUSHED:
				setMethodToBePushed((Method)null);
				return;
			case RefactoringPackage.PUSH_DOWN_METHOD__SOURCE_CLASS:
				setSourceClass((com.br.refactoring.dsl.refactoring.Class)null);
				return;
			case RefactoringPackage.PUSH_DOWN_METHOD__TARGET_CLASS:
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
			case RefactoringPackage.PUSH_DOWN_METHOD__METHOD_TO_BE_PUSHED:
				return methodToBePushed != null;
			case RefactoringPackage.PUSH_DOWN_METHOD__SOURCE_CLASS:
				return sourceClass != null;
			case RefactoringPackage.PUSH_DOWN_METHOD__TARGET_CLASS:
				return targetClass != null;
			case RefactoringPackage.PUSH_DOWN_METHOD__SOURCE_CLASS_NAME:
				return SOURCE_CLASS_NAME_EDEFAULT == null ? getSourceClassName() != null : !SOURCE_CLASS_NAME_EDEFAULT.equals(getSourceClassName());
			case RefactoringPackage.PUSH_DOWN_METHOD__TARGET_CLASS_NAME:
				return TARGET_CLASS_NAME_EDEFAULT == null ? getTargetClassName() != null : !TARGET_CLASS_NAME_EDEFAULT.equals(getTargetClassName());
			case RefactoringPackage.PUSH_DOWN_METHOD__METHOD_TO_BE_PUSHED_NAME:
				return METHOD_TO_BE_PUSHED_NAME_EDEFAULT == null ? getMethodToBePushedName() != null : !METHOD_TO_BE_PUSHED_NAME_EDEFAULT.equals(getMethodToBePushedName());
		}
		return super.eIsSet(featureID);
	}

} //PushDownMethodImpl

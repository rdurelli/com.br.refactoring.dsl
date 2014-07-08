/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br.refactoring.dsl.refactoring.impl;

import com.br.refactoring.dsl.refactoring.Attribute;
import com.br.refactoring.dsl.refactoring.PullUpAttribute;
import com.br.refactoring.dsl.refactoring.RefactoringPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pull Up Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.PullUpAttributeImpl#getAttributeToBePulled <em>Attribute To Be Pulled</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.PullUpAttributeImpl#getSourceClass <em>Source Class</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.PullUpAttributeImpl#getTargetClass <em>Target Class</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.PullUpAttributeImpl#getSourceClassName <em>Source Class Name</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.PullUpAttributeImpl#getTargetClassName <em>Target Class Name</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.PullUpAttributeImpl#getAttributeToBePulledName <em>Attribute To Be Pulled Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PullUpAttributeImpl extends DealingWithGeneralizationImpl implements PullUpAttribute {
	/**
	 * The cached value of the '{@link #getAttributeToBePulled() <em>Attribute To Be Pulled</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeToBePulled()
	 * @generated
	 * @ordered
	 */
	protected Attribute attributeToBePulled;

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
	 * The default value of the '{@link #getAttributeToBePulledName() <em>Attribute To Be Pulled Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeToBePulledName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_TO_BE_PULLED_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PullUpAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringPackage.Literals.PULL_UP_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttributeToBePulled() {
		if (attributeToBePulled != null && attributeToBePulled.eIsProxy()) {
			InternalEObject oldAttributeToBePulled = (InternalEObject)attributeToBePulled;
			attributeToBePulled = (Attribute)eResolveProxy(oldAttributeToBePulled);
			if (attributeToBePulled != oldAttributeToBePulled) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringPackage.PULL_UP_ATTRIBUTE__ATTRIBUTE_TO_BE_PULLED, oldAttributeToBePulled, attributeToBePulled));
			}
		}
		return attributeToBePulled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttributeToBePulled() {
		return attributeToBePulled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeToBePulled(Attribute newAttributeToBePulled) {
		Attribute oldAttributeToBePulled = attributeToBePulled;
		attributeToBePulled = newAttributeToBePulled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.PULL_UP_ATTRIBUTE__ATTRIBUTE_TO_BE_PULLED, oldAttributeToBePulled, attributeToBePulled));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringPackage.PULL_UP_ATTRIBUTE__SOURCE_CLASS, oldSourceClass, sourceClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.PULL_UP_ATTRIBUTE__SOURCE_CLASS, oldSourceClass, sourceClass));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringPackage.PULL_UP_ATTRIBUTE__TARGET_CLASS, oldTargetClass, targetClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.PULL_UP_ATTRIBUTE__TARGET_CLASS, oldTargetClass, targetClass));
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
	public String getAttributeToBePulledName() {
		return attributeToBePulled.getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefactoringPackage.PULL_UP_ATTRIBUTE__ATTRIBUTE_TO_BE_PULLED:
				if (resolve) return getAttributeToBePulled();
				return basicGetAttributeToBePulled();
			case RefactoringPackage.PULL_UP_ATTRIBUTE__SOURCE_CLASS:
				if (resolve) return getSourceClass();
				return basicGetSourceClass();
			case RefactoringPackage.PULL_UP_ATTRIBUTE__TARGET_CLASS:
				if (resolve) return getTargetClass();
				return basicGetTargetClass();
			case RefactoringPackage.PULL_UP_ATTRIBUTE__SOURCE_CLASS_NAME:
				return getSourceClassName();
			case RefactoringPackage.PULL_UP_ATTRIBUTE__TARGET_CLASS_NAME:
				return getTargetClassName();
			case RefactoringPackage.PULL_UP_ATTRIBUTE__ATTRIBUTE_TO_BE_PULLED_NAME:
				return getAttributeToBePulledName();
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
			case RefactoringPackage.PULL_UP_ATTRIBUTE__ATTRIBUTE_TO_BE_PULLED:
				setAttributeToBePulled((Attribute)newValue);
				return;
			case RefactoringPackage.PULL_UP_ATTRIBUTE__SOURCE_CLASS:
				setSourceClass((com.br.refactoring.dsl.refactoring.Class)newValue);
				return;
			case RefactoringPackage.PULL_UP_ATTRIBUTE__TARGET_CLASS:
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
			case RefactoringPackage.PULL_UP_ATTRIBUTE__ATTRIBUTE_TO_BE_PULLED:
				setAttributeToBePulled((Attribute)null);
				return;
			case RefactoringPackage.PULL_UP_ATTRIBUTE__SOURCE_CLASS:
				setSourceClass((com.br.refactoring.dsl.refactoring.Class)null);
				return;
			case RefactoringPackage.PULL_UP_ATTRIBUTE__TARGET_CLASS:
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
			case RefactoringPackage.PULL_UP_ATTRIBUTE__ATTRIBUTE_TO_BE_PULLED:
				return attributeToBePulled != null;
			case RefactoringPackage.PULL_UP_ATTRIBUTE__SOURCE_CLASS:
				return sourceClass != null;
			case RefactoringPackage.PULL_UP_ATTRIBUTE__TARGET_CLASS:
				return targetClass != null;
			case RefactoringPackage.PULL_UP_ATTRIBUTE__SOURCE_CLASS_NAME:
				return SOURCE_CLASS_NAME_EDEFAULT == null ? getSourceClassName() != null : !SOURCE_CLASS_NAME_EDEFAULT.equals(getSourceClassName());
			case RefactoringPackage.PULL_UP_ATTRIBUTE__TARGET_CLASS_NAME:
				return TARGET_CLASS_NAME_EDEFAULT == null ? getTargetClassName() != null : !TARGET_CLASS_NAME_EDEFAULT.equals(getTargetClassName());
			case RefactoringPackage.PULL_UP_ATTRIBUTE__ATTRIBUTE_TO_BE_PULLED_NAME:
				return ATTRIBUTE_TO_BE_PULLED_NAME_EDEFAULT == null ? getAttributeToBePulledName() != null : !ATTRIBUTE_TO_BE_PULLED_NAME_EDEFAULT.equals(getAttributeToBePulledName());
		}
		return super.eIsSet(featureID);
	}

} //PullUpAttributeImpl

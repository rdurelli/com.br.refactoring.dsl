/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br.refactoring.dsl.refactoring.impl;

import com.br.refactoring.dsl.refactoring.Attribute;
import com.br.refactoring.dsl.refactoring.MoveAttribute;
import com.br.refactoring.dsl.refactoring.RefactoringPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.MoveAttributeImpl#getSourceClass <em>Source Class</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.MoveAttributeImpl#getTargetClass <em>Target Class</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.MoveAttributeImpl#getAttributeToBeMoved <em>Attribute To Be Moved</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MoveAttributeImpl extends MovingFeaturesBetweenObjectsImpl implements MoveAttribute {
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
	 * The cached value of the '{@link #getAttributeToBeMoved() <em>Attribute To Be Moved</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeToBeMoved()
	 * @generated
	 * @ordered
	 */
	protected Attribute attributeToBeMoved;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringPackage.Literals.MOVE_ATTRIBUTE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringPackage.MOVE_ATTRIBUTE__SOURCE_CLASS, oldSourceClass, sourceClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.MOVE_ATTRIBUTE__SOURCE_CLASS, oldSourceClass, sourceClass));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringPackage.MOVE_ATTRIBUTE__TARGET_CLASS, oldTargetClass, targetClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.MOVE_ATTRIBUTE__TARGET_CLASS, oldTargetClass, targetClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttributeToBeMoved() {
		if (attributeToBeMoved != null && attributeToBeMoved.eIsProxy()) {
			InternalEObject oldAttributeToBeMoved = (InternalEObject)attributeToBeMoved;
			attributeToBeMoved = (Attribute)eResolveProxy(oldAttributeToBeMoved);
			if (attributeToBeMoved != oldAttributeToBeMoved) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringPackage.MOVE_ATTRIBUTE__ATTRIBUTE_TO_BE_MOVED, oldAttributeToBeMoved, attributeToBeMoved));
			}
		}
		return attributeToBeMoved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttributeToBeMoved() {
		return attributeToBeMoved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeToBeMoved(Attribute newAttributeToBeMoved) {
		Attribute oldAttributeToBeMoved = attributeToBeMoved;
		attributeToBeMoved = newAttributeToBeMoved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.MOVE_ATTRIBUTE__ATTRIBUTE_TO_BE_MOVED, oldAttributeToBeMoved, attributeToBeMoved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefactoringPackage.MOVE_ATTRIBUTE__SOURCE_CLASS:
				if (resolve) return getSourceClass();
				return basicGetSourceClass();
			case RefactoringPackage.MOVE_ATTRIBUTE__TARGET_CLASS:
				if (resolve) return getTargetClass();
				return basicGetTargetClass();
			case RefactoringPackage.MOVE_ATTRIBUTE__ATTRIBUTE_TO_BE_MOVED:
				if (resolve) return getAttributeToBeMoved();
				return basicGetAttributeToBeMoved();
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
			case RefactoringPackage.MOVE_ATTRIBUTE__SOURCE_CLASS:
				setSourceClass((com.br.refactoring.dsl.refactoring.Class)newValue);
				return;
			case RefactoringPackage.MOVE_ATTRIBUTE__TARGET_CLASS:
				setTargetClass((com.br.refactoring.dsl.refactoring.Class)newValue);
				return;
			case RefactoringPackage.MOVE_ATTRIBUTE__ATTRIBUTE_TO_BE_MOVED:
				setAttributeToBeMoved((Attribute)newValue);
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
			case RefactoringPackage.MOVE_ATTRIBUTE__SOURCE_CLASS:
				setSourceClass((com.br.refactoring.dsl.refactoring.Class)null);
				return;
			case RefactoringPackage.MOVE_ATTRIBUTE__TARGET_CLASS:
				setTargetClass((com.br.refactoring.dsl.refactoring.Class)null);
				return;
			case RefactoringPackage.MOVE_ATTRIBUTE__ATTRIBUTE_TO_BE_MOVED:
				setAttributeToBeMoved((Attribute)null);
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
			case RefactoringPackage.MOVE_ATTRIBUTE__SOURCE_CLASS:
				return sourceClass != null;
			case RefactoringPackage.MOVE_ATTRIBUTE__TARGET_CLASS:
				return targetClass != null;
			case RefactoringPackage.MOVE_ATTRIBUTE__ATTRIBUTE_TO_BE_MOVED:
				return attributeToBeMoved != null;
		}
		return super.eIsSet(featureID);
	}

} //MoveAttributeImpl

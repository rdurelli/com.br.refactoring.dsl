/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br.refactoring.dsl.refactoring.impl;

import com.br.refactoring.dsl.refactoring.MovingFeaturesBetweenObjects;
import com.br.refactoring.dsl.refactoring.RefactoringPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Moving Features Between Objects</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.MovingFeaturesBetweenObjectsImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.MovingFeaturesBetweenObjectsImpl#getAllRefactorings <em>All Refactorings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MovingFeaturesBetweenObjectsImpl extends RefactoringImpl implements MovingFeaturesBetweenObjects {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllRefactorings() <em>All Refactorings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllRefactorings()
	 * @generated
	 * @ordered
	 */
	protected EList<MovingFeaturesBetweenObjects> allRefactorings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MovingFeaturesBetweenObjectsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringPackage.Literals.MOVING_FEATURES_BETWEEN_OBJECTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.MOVING_FEATURES_BETWEEN_OBJECTS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MovingFeaturesBetweenObjects> getAllRefactorings() {
		if (allRefactorings == null) {
			allRefactorings = new EObjectContainmentEList<MovingFeaturesBetweenObjects>(MovingFeaturesBetweenObjects.class, this, RefactoringPackage.MOVING_FEATURES_BETWEEN_OBJECTS__ALL_REFACTORINGS);
		}
		return allRefactorings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RefactoringPackage.MOVING_FEATURES_BETWEEN_OBJECTS__ALL_REFACTORINGS:
				return ((InternalEList<?>)getAllRefactorings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefactoringPackage.MOVING_FEATURES_BETWEEN_OBJECTS__NAME:
				return getName();
			case RefactoringPackage.MOVING_FEATURES_BETWEEN_OBJECTS__ALL_REFACTORINGS:
				return getAllRefactorings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RefactoringPackage.MOVING_FEATURES_BETWEEN_OBJECTS__NAME:
				setName((String)newValue);
				return;
			case RefactoringPackage.MOVING_FEATURES_BETWEEN_OBJECTS__ALL_REFACTORINGS:
				getAllRefactorings().clear();
				getAllRefactorings().addAll((Collection<? extends MovingFeaturesBetweenObjects>)newValue);
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
			case RefactoringPackage.MOVING_FEATURES_BETWEEN_OBJECTS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RefactoringPackage.MOVING_FEATURES_BETWEEN_OBJECTS__ALL_REFACTORINGS:
				getAllRefactorings().clear();
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
			case RefactoringPackage.MOVING_FEATURES_BETWEEN_OBJECTS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RefactoringPackage.MOVING_FEATURES_BETWEEN_OBJECTS__ALL_REFACTORINGS:
				return allRefactorings != null && !allRefactorings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MovingFeaturesBetweenObjectsImpl

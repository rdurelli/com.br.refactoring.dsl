/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br.refactoring.dsl.refactoring.impl;

import com.br.refactoring.dsl.refactoring.DealingWithGeneralization;
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
 * An implementation of the model object '<em><b>Dealing With Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.DealingWithGeneralizationImpl#getAllRefactorings <em>All Refactorings</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.DealingWithGeneralizationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DealingWithGeneralizationImpl extends RefactoringImpl implements DealingWithGeneralization {
	/**
	 * The cached value of the '{@link #getAllRefactorings() <em>All Refactorings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllRefactorings()
	 * @generated
	 * @ordered
	 */
	protected EList<DealingWithGeneralization> allRefactorings;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DealingWithGeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringPackage.Literals.DEALING_WITH_GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DealingWithGeneralization> getAllRefactorings() {
		if (allRefactorings == null) {
			allRefactorings = new EObjectContainmentEList<DealingWithGeneralization>(DealingWithGeneralization.class, this, RefactoringPackage.DEALING_WITH_GENERALIZATION__ALL_REFACTORINGS);
		}
		return allRefactorings;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.DEALING_WITH_GENERALIZATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RefactoringPackage.DEALING_WITH_GENERALIZATION__ALL_REFACTORINGS:
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
			case RefactoringPackage.DEALING_WITH_GENERALIZATION__ALL_REFACTORINGS:
				return getAllRefactorings();
			case RefactoringPackage.DEALING_WITH_GENERALIZATION__NAME:
				return getName();
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
			case RefactoringPackage.DEALING_WITH_GENERALIZATION__ALL_REFACTORINGS:
				getAllRefactorings().clear();
				getAllRefactorings().addAll((Collection<? extends DealingWithGeneralization>)newValue);
				return;
			case RefactoringPackage.DEALING_WITH_GENERALIZATION__NAME:
				setName((String)newValue);
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
			case RefactoringPackage.DEALING_WITH_GENERALIZATION__ALL_REFACTORINGS:
				getAllRefactorings().clear();
				return;
			case RefactoringPackage.DEALING_WITH_GENERALIZATION__NAME:
				setName(NAME_EDEFAULT);
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
			case RefactoringPackage.DEALING_WITH_GENERALIZATION__ALL_REFACTORINGS:
				return allRefactorings != null && !allRefactorings.isEmpty();
			case RefactoringPackage.DEALING_WITH_GENERALIZATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //DealingWithGeneralizationImpl

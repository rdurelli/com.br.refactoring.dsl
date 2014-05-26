/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br.refactoring.dsl.refactoring.impl;

import com.br.refactoring.dsl.refactoring.Attribute;
import com.br.refactoring.dsl.refactoring.ExtractClass;
import com.br.refactoring.dsl.refactoring.RefactoringPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extract Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.ExtractClassImpl#getNewName <em>New Name</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.ExtractClassImpl#getSourceClass <em>Source Class</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.ExtractClassImpl#getAttributesToBeMoved <em>Attributes To Be Moved</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.ExtractClassImpl#getAttributesToBeMovedName <em>Attributes To Be Moved Name</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.ExtractClassImpl#getSourceClassName <em>Source Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtractClassImpl extends MovingFeaturesBetweenObjectsImpl implements ExtractClass {
	/**
	 * The default value of the '{@link #getNewName() <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewName()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewName() <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewName()
	 * @generated
	 * @ordered
	 */
	protected String newName = NEW_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getAttributesToBeMoved() <em>Attributes To Be Moved</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributesToBeMoved()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributesToBeMoved;

	/**
	 * The default value of the '{@link #getAttributesToBeMovedName() <em>Attributes To Be Moved Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributesToBeMovedName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTES_TO_BE_MOVED_NAME_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtractClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringPackage.Literals.EXTRACT_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewName() {
		return newName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewName(String newNewName) {
		String oldNewName = newName;
		newName = newNewName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.EXTRACT_CLASS__NEW_NAME, oldNewName, newName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringPackage.EXTRACT_CLASS__SOURCE_CLASS, oldSourceClass, sourceClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.EXTRACT_CLASS__SOURCE_CLASS, oldSourceClass, sourceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributesToBeMoved() {
		if (attributesToBeMoved == null) {
			attributesToBeMoved = new EObjectResolvingEList<Attribute>(Attribute.class, this, RefactoringPackage.EXTRACT_CLASS__ATTRIBUTES_TO_BE_MOVED);
		}
		return attributesToBeMoved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getAttributesToBeMovedName() {
		String attibutesToBeMovedName = "{";
		
		if (this.attributesToBeMoved.size() > 3) {
			
			attibutesToBeMovedName += this.attributesToBeMoved.get(0).getName()
					+ ", " + this.attributesToBeMoved.get(1).getName() + ", "
					+ this.attributesToBeMoved.get(2).getName() + "..."; 
			
		} else if (this.attributesToBeMoved.size() == 2) {
			
			attibutesToBeMovedName += this.attributesToBeMoved.get(0).getName()
					+ ", " + this.attributesToBeMoved.get(1).getName(); 
			
		} else if (this.attributesToBeMoved.size() == 3) {
			attibutesToBeMovedName += this.attributesToBeMoved.get(0).getName()
					+ ", " + this.attributesToBeMoved.get(1).getName() + ", "
					+ this.attributesToBeMoved.get(2).getName(); 
		} else if (this.attributesToBeMoved.size() == 1) {
			attibutesToBeMovedName += this.attributesToBeMoved.get(0).getName(); 
		}
		
		return attibutesToBeMovedName.concat("}");
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
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefactoringPackage.EXTRACT_CLASS__NEW_NAME:
				return getNewName();
			case RefactoringPackage.EXTRACT_CLASS__SOURCE_CLASS:
				if (resolve) return getSourceClass();
				return basicGetSourceClass();
			case RefactoringPackage.EXTRACT_CLASS__ATTRIBUTES_TO_BE_MOVED:
				return getAttributesToBeMoved();
			case RefactoringPackage.EXTRACT_CLASS__ATTRIBUTES_TO_BE_MOVED_NAME:
				return getAttributesToBeMovedName();
			case RefactoringPackage.EXTRACT_CLASS__SOURCE_CLASS_NAME:
				return getSourceClassName();
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
			case RefactoringPackage.EXTRACT_CLASS__NEW_NAME:
				setNewName((String)newValue);
				return;
			case RefactoringPackage.EXTRACT_CLASS__SOURCE_CLASS:
				setSourceClass((com.br.refactoring.dsl.refactoring.Class)newValue);
				return;
			case RefactoringPackage.EXTRACT_CLASS__ATTRIBUTES_TO_BE_MOVED:
				getAttributesToBeMoved().clear();
				getAttributesToBeMoved().addAll((Collection<? extends Attribute>)newValue);
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
			case RefactoringPackage.EXTRACT_CLASS__NEW_NAME:
				setNewName(NEW_NAME_EDEFAULT);
				return;
			case RefactoringPackage.EXTRACT_CLASS__SOURCE_CLASS:
				setSourceClass((com.br.refactoring.dsl.refactoring.Class)null);
				return;
			case RefactoringPackage.EXTRACT_CLASS__ATTRIBUTES_TO_BE_MOVED:
				getAttributesToBeMoved().clear();
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
			case RefactoringPackage.EXTRACT_CLASS__NEW_NAME:
				return NEW_NAME_EDEFAULT == null ? newName != null : !NEW_NAME_EDEFAULT.equals(newName);
			case RefactoringPackage.EXTRACT_CLASS__SOURCE_CLASS:
				return sourceClass != null;
			case RefactoringPackage.EXTRACT_CLASS__ATTRIBUTES_TO_BE_MOVED:
				return attributesToBeMoved != null && !attributesToBeMoved.isEmpty();
			case RefactoringPackage.EXTRACT_CLASS__ATTRIBUTES_TO_BE_MOVED_NAME:
				return ATTRIBUTES_TO_BE_MOVED_NAME_EDEFAULT == null ? getAttributesToBeMovedName() != null : !ATTRIBUTES_TO_BE_MOVED_NAME_EDEFAULT.equals(getAttributesToBeMovedName());
			case RefactoringPackage.EXTRACT_CLASS__SOURCE_CLASS_NAME:
				return SOURCE_CLASS_NAME_EDEFAULT == null ? getSourceClassName() != null : !SOURCE_CLASS_NAME_EDEFAULT.equals(getSourceClassName());
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
		result.append(" (newName: ");
		result.append(newName);
		result.append(')');
		return result.toString();
	}

} //ExtractClassImpl

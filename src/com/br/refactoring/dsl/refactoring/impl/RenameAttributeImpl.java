/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br.refactoring.dsl.refactoring.impl;

import com.br.refactoring.dsl.refactoring.Attribute;
import com.br.refactoring.dsl.refactoring.RefactoringPackage;
import com.br.refactoring.dsl.refactoring.RenameAttribute;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rename Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.RenameAttributeImpl#getNewName <em>New Name</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.RenameAttributeImpl#getAttributeToBeRename <em>Attribute To Be Rename</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.RenameAttributeImpl#getSourceClass <em>Source Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RenameAttributeImpl extends RenameFeatureImpl implements RenameAttribute {
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
	 * The cached value of the '{@link #getAttributeToBeRename() <em>Attribute To Be Rename</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeToBeRename()
	 * @generated
	 * @ordered
	 */
	protected Attribute attributeToBeRename;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenameAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringPackage.Literals.RENAME_ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.RENAME_ATTRIBUTE__NEW_NAME, oldNewName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttributeToBeRename() {
		if (attributeToBeRename != null && attributeToBeRename.eIsProxy()) {
			InternalEObject oldAttributeToBeRename = (InternalEObject)attributeToBeRename;
			attributeToBeRename = (Attribute)eResolveProxy(oldAttributeToBeRename);
			if (attributeToBeRename != oldAttributeToBeRename) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringPackage.RENAME_ATTRIBUTE__ATTRIBUTE_TO_BE_RENAME, oldAttributeToBeRename, attributeToBeRename));
			}
		}
		return attributeToBeRename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttributeToBeRename() {
		return attributeToBeRename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeToBeRename(Attribute newAttributeToBeRename) {
		Attribute oldAttributeToBeRename = attributeToBeRename;
		attributeToBeRename = newAttributeToBeRename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.RENAME_ATTRIBUTE__ATTRIBUTE_TO_BE_RENAME, oldAttributeToBeRename, attributeToBeRename));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringPackage.RENAME_ATTRIBUTE__SOURCE_CLASS, oldSourceClass, sourceClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.RENAME_ATTRIBUTE__SOURCE_CLASS, oldSourceClass, sourceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefactoringPackage.RENAME_ATTRIBUTE__NEW_NAME:
				return getNewName();
			case RefactoringPackage.RENAME_ATTRIBUTE__ATTRIBUTE_TO_BE_RENAME:
				if (resolve) return getAttributeToBeRename();
				return basicGetAttributeToBeRename();
			case RefactoringPackage.RENAME_ATTRIBUTE__SOURCE_CLASS:
				if (resolve) return getSourceClass();
				return basicGetSourceClass();
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
			case RefactoringPackage.RENAME_ATTRIBUTE__NEW_NAME:
				setNewName((String)newValue);
				return;
			case RefactoringPackage.RENAME_ATTRIBUTE__ATTRIBUTE_TO_BE_RENAME:
				setAttributeToBeRename((Attribute)newValue);
				return;
			case RefactoringPackage.RENAME_ATTRIBUTE__SOURCE_CLASS:
				setSourceClass((com.br.refactoring.dsl.refactoring.Class)newValue);
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
			case RefactoringPackage.RENAME_ATTRIBUTE__NEW_NAME:
				setNewName(NEW_NAME_EDEFAULT);
				return;
			case RefactoringPackage.RENAME_ATTRIBUTE__ATTRIBUTE_TO_BE_RENAME:
				setAttributeToBeRename((Attribute)null);
				return;
			case RefactoringPackage.RENAME_ATTRIBUTE__SOURCE_CLASS:
				setSourceClass((com.br.refactoring.dsl.refactoring.Class)null);
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
			case RefactoringPackage.RENAME_ATTRIBUTE__NEW_NAME:
				return NEW_NAME_EDEFAULT == null ? newName != null : !NEW_NAME_EDEFAULT.equals(newName);
			case RefactoringPackage.RENAME_ATTRIBUTE__ATTRIBUTE_TO_BE_RENAME:
				return attributeToBeRename != null;
			case RefactoringPackage.RENAME_ATTRIBUTE__SOURCE_CLASS:
				return sourceClass != null;
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

} //RenameAttributeImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br.refactoring.dsl.refactoring.impl;

import com.br.refactoring.dsl.refactoring.Attribute;
import com.br.refactoring.dsl.refactoring.RefactoringPackage;
import com.br.refactoring.dsl.refactoring.ReplaceDataValueWithObject;

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
 * An implementation of the model object '<em><b>Replace Data Value With Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.ReplaceDataValueWithObjectImpl#getSourceClass <em>Source Class</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.ReplaceDataValueWithObjectImpl#getAttributeToReplaceDataWithObject <em>Attribute To Replace Data With Object</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.ReplaceDataValueWithObjectImpl#getNewAttributes <em>New Attributes</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.ReplaceDataValueWithObjectImpl#getSourceClassName <em>Source Class Name</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.ReplaceDataValueWithObjectImpl#getAttributeToReplaceDataWithObjectName <em>Attribute To Replace Data With Object Name</em>}</li>
 *   <li>{@link com.br.refactoring.dsl.refactoring.impl.ReplaceDataValueWithObjectImpl#getNewAttributesName <em>New Attributes Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReplaceDataValueWithObjectImpl extends OrganizingDataImpl implements ReplaceDataValueWithObject {
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
	 * The cached value of the '{@link #getAttributeToReplaceDataWithObject() <em>Attribute To Replace Data With Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeToReplaceDataWithObject()
	 * @generated
	 * @ordered
	 */
	protected Attribute attributeToReplaceDataWithObject;

	/**
	 * The cached value of the '{@link #getNewAttributes() <em>New Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> newAttributes;

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
	 * The default value of the '{@link #getAttributeToReplaceDataWithObjectName() <em>Attribute To Replace Data With Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeToReplaceDataWithObjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_TO_REPLACE_DATA_WITH_OBJECT_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNewAttributesName() <em>New Attributes Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewAttributesName()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_ATTRIBUTES_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplaceDataValueWithObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringPackage.Literals.REPLACE_DATA_VALUE_WITH_OBJECT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringPackage.REPLACE_DATA_VALUE_WITH_OBJECT__SOURCE_CLASS, oldSourceClass, sourceClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.REPLACE_DATA_VALUE_WITH_OBJECT__SOURCE_CLASS, oldSourceClass, sourceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttributeToReplaceDataWithObject() {
		if (attributeToReplaceDataWithObject != null && attributeToReplaceDataWithObject.eIsProxy()) {
			InternalEObject oldAttributeToReplaceDataWithObject = (InternalEObject)attributeToReplaceDataWithObject;
			attributeToReplaceDataWithObject = (Attribute)eResolveProxy(oldAttributeToReplaceDataWithObject);
			if (attributeToReplaceDataWithObject != oldAttributeToReplaceDataWithObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringPackage.REPLACE_DATA_VALUE_WITH_OBJECT__ATTRIBUTE_TO_REPLACE_DATA_WITH_OBJECT, oldAttributeToReplaceDataWithObject, attributeToReplaceDataWithObject));
			}
		}
		return attributeToReplaceDataWithObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttributeToReplaceDataWithObject() {
		return attributeToReplaceDataWithObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeToReplaceDataWithObject(Attribute newAttributeToReplaceDataWithObject) {
		Attribute oldAttributeToReplaceDataWithObject = attributeToReplaceDataWithObject;
		attributeToReplaceDataWithObject = newAttributeToReplaceDataWithObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.REPLACE_DATA_VALUE_WITH_OBJECT__ATTRIBUTE_TO_REPLACE_DATA_WITH_OBJECT, oldAttributeToReplaceDataWithObject, attributeToReplaceDataWithObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getNewAttributes() {
		if (newAttributes == null) {
			newAttributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, RefactoringPackage.REPLACE_DATA_VALUE_WITH_OBJECT__NEW_ATTRIBUTES);
		}
		return newAttributes;
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
	public String getAttributeToReplaceDataWithObjectName() {

		return attributeToReplaceDataWithObject.getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getNewAttributesName() {
		
		String attributesNames = "{";
		
		if (this.newAttributes.size() > 3) {
			
			attributesNames += this.newAttributes.get(0).getName()
					+ ", " + this.newAttributes.get(1).getName() + ", "
					+ this.newAttributes.get(2).getName() + "..."; 
			
		} else if (this.newAttributes.size() == 2) {
			
			attributesNames += this.newAttributes.get(0).getName()
					+ ", " + this.newAttributes.get(1).getName(); 
			
		} else if (this.newAttributes.size() == 3) {
			attributesNames += this.newAttributes.get(0).getName()
					+ ", " + this.newAttributes.get(1).getName() + ", "
					+ this.newAttributes.get(2).getName(); 
		} else if (this.newAttributes.size() == 1) {
			attributesNames += this.newAttributes.get(0).getName(); 
		}
		
		return attributesNames.concat("}");
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RefactoringPackage.REPLACE_DATA_VALUE_WITH_OBJECT__NEW_ATTRIBUTES:
				return ((InternalEList<?>)getNewAttributes()).basicRemove(otherEnd, msgs);
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
			case RefactoringPackage.REPLACE_DATA_VALUE_WITH_OBJECT__SOURCE_CLASS:
				if (resolve) return getSourceClass();
				return basicGetSourceClass();
			case RefactoringPackage.REPLACE_DATA_VALUE_WITH_OBJECT__ATTRIBUTE_TO_REPLACE_DATA_WITH_OBJECT:
				if (resolve) return getAttributeToReplaceDataWithObject();
				return basicGetAttributeToReplaceDataWithObject();
			case RefactoringPackage.REPLACE_DATA_VALUE_WITH_OBJECT__NEW_ATTRIBUTES:
				return getNewAttributes();
			case RefactoringPackage.REPLACE_DATA_VALUE_WITH_OBJECT__SOURCE_CLASS_NAME:
				return getSourceClassName();
			case RefactoringPackage.REPLACE_DATA_VALUE_WITH_OBJECT__ATTRIBUTE_TO_REPLACE_DATA_WITH_OBJECT_NAME:
				return getAttributeToReplaceDataWithObjectName();
			case RefactoringPackage.REPLACE_DATA_VALUE_WITH_OBJECT__NEW_ATTRIBUTES_NAME:
				return getNewAttributesName();
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
			case RefactoringPackage.REPLACE_DATA_VALUE_WITH_OBJECT__SOURCE_CLASS:
				setSourceClass((com.br.refactoring.dsl.refactoring.Class)newValue);
				return;
			case RefactoringPackage.REPLACE_DATA_VALUE_WITH_OBJECT__ATTRIBUTE_TO_REPLACE_DATA_WITH_OBJECT:
				setAttributeToReplaceDataWithObject((Attribute)newValue);
				return;
			case RefactoringPackage.REPLACE_DATA_VALUE_WITH_OBJECT__NEW_ATTRIBUTES:
				getNewAttributes().clear();
				getNewAttributes().addAll((Collection<? extends Attribute>)newValue);
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
			case RefactoringPackage.REPLACE_DATA_VALUE_WITH_OBJECT__SOURCE_CLASS:
				setSourceClass((com.br.refactoring.dsl.refactoring.Class)null);
				return;
			case RefactoringPackage.REPLACE_DATA_VALUE_WITH_OBJECT__ATTRIBUTE_TO_REPLACE_DATA_WITH_OBJECT:
				setAttributeToReplaceDataWithObject((Attribute)null);
				return;
			case RefactoringPackage.REPLACE_DATA_VALUE_WITH_OBJECT__NEW_ATTRIBUTES:
				getNewAttributes().clear();
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
			case RefactoringPackage.REPLACE_DATA_VALUE_WITH_OBJECT__SOURCE_CLASS:
				return sourceClass != null;
			case RefactoringPackage.REPLACE_DATA_VALUE_WITH_OBJECT__ATTRIBUTE_TO_REPLACE_DATA_WITH_OBJECT:
				return attributeToReplaceDataWithObject != null;
			case RefactoringPackage.REPLACE_DATA_VALUE_WITH_OBJECT__NEW_ATTRIBUTES:
				return newAttributes != null && !newAttributes.isEmpty();
			case RefactoringPackage.REPLACE_DATA_VALUE_WITH_OBJECT__SOURCE_CLASS_NAME:
				return SOURCE_CLASS_NAME_EDEFAULT == null ? getSourceClassName() != null : !SOURCE_CLASS_NAME_EDEFAULT.equals(getSourceClassName());
			case RefactoringPackage.REPLACE_DATA_VALUE_WITH_OBJECT__ATTRIBUTE_TO_REPLACE_DATA_WITH_OBJECT_NAME:
				return ATTRIBUTE_TO_REPLACE_DATA_WITH_OBJECT_NAME_EDEFAULT == null ? getAttributeToReplaceDataWithObjectName() != null : !ATTRIBUTE_TO_REPLACE_DATA_WITH_OBJECT_NAME_EDEFAULT.equals(getAttributeToReplaceDataWithObjectName());
			case RefactoringPackage.REPLACE_DATA_VALUE_WITH_OBJECT__NEW_ATTRIBUTES_NAME:
				return NEW_ATTRIBUTES_NAME_EDEFAULT == null ? getNewAttributesName() != null : !NEW_ATTRIBUTES_NAME_EDEFAULT.equals(getNewAttributesName());
		}
		return super.eIsSet(featureID);
	}

} //ReplaceDataValueWithObjectImpl

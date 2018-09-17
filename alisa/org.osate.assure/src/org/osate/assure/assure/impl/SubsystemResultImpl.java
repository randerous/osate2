/**
 * Copyright 2015 Carnegie Mellon University. All Rights Reserved.
 * 
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE
 * MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO
 * WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY,
 * EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON
 * UNIVERSITY DOES NOT MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM
 * PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 * 
 * Released under the Eclipse Public License (http://www.eclipse.org/org/documents/epl-v10.php)
 * 
 * See COPYRIGHT file for full details.
 */
package org.osate.assure.assure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.Subcomponent;

import org.osate.assure.assure.AssurePackage;
import org.osate.assure.assure.ClaimResult;
import org.osate.assure.assure.SubsystemResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subsystem Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.assure.assure.impl.SubsystemResultImpl#getTargetSystem <em>Target System</em>}</li>
 *   <li>{@link org.osate.assure.assure.impl.SubsystemResultImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.osate.assure.assure.impl.SubsystemResultImpl#getClaimResult <em>Claim Result</em>}</li>
 *   <li>{@link org.osate.assure.assure.impl.SubsystemResultImpl#getSubsystemResult <em>Subsystem Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubsystemResultImpl extends AssureResultImpl implements SubsystemResult {
	/**
	 * The cached value of the '{@link #getTargetSystem() <em>Target System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSystem()
	 * @generated
	 * @ordered
	 */
	protected Subcomponent targetSystem;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClaimResult() <em>Claim Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimResult()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResult> claimResult;

	/**
	 * The cached value of the '{@link #getSubsystemResult() <em>Subsystem Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsystemResult()
	 * @generated
	 * @ordered
	 */
	protected EList<SubsystemResult> subsystemResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubsystemResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssurePackage.Literals.SUBSYSTEM_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subcomponent getTargetSystem() {
		if (targetSystem != null && ((EObject)targetSystem).eIsProxy()) {
			InternalEObject oldTargetSystem = (InternalEObject)targetSystem;
			targetSystem = (Subcomponent)eResolveProxy(oldTargetSystem);
			if (targetSystem != oldTargetSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssurePackage.SUBSYSTEM_RESULT__TARGET_SYSTEM, oldTargetSystem, targetSystem));
			}
		}
		return targetSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subcomponent basicGetTargetSystem() {
		return targetSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetSystem(Subcomponent newTargetSystem) {
		Subcomponent oldTargetSystem = targetSystem;
		targetSystem = newTargetSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssurePackage.SUBSYSTEM_RESULT__TARGET_SYSTEM, oldTargetSystem, targetSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssurePackage.SUBSYSTEM_RESULT__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResult> getClaimResult() {
		if (claimResult == null) {
			claimResult = new EObjectContainmentEList<ClaimResult>(ClaimResult.class, this, AssurePackage.SUBSYSTEM_RESULT__CLAIM_RESULT);
		}
		return claimResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubsystemResult> getSubsystemResult() {
		if (subsystemResult == null) {
			subsystemResult = new EObjectContainmentEList<SubsystemResult>(SubsystemResult.class, this, AssurePackage.SUBSYSTEM_RESULT__SUBSYSTEM_RESULT);
		}
		return subsystemResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssurePackage.SUBSYSTEM_RESULT__CLAIM_RESULT:
				return ((InternalEList<?>)getClaimResult()).basicRemove(otherEnd, msgs);
			case AssurePackage.SUBSYSTEM_RESULT__SUBSYSTEM_RESULT:
				return ((InternalEList<?>)getSubsystemResult()).basicRemove(otherEnd, msgs);
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
			case AssurePackage.SUBSYSTEM_RESULT__TARGET_SYSTEM:
				if (resolve) return getTargetSystem();
				return basicGetTargetSystem();
			case AssurePackage.SUBSYSTEM_RESULT__MESSAGE:
				return getMessage();
			case AssurePackage.SUBSYSTEM_RESULT__CLAIM_RESULT:
				return getClaimResult();
			case AssurePackage.SUBSYSTEM_RESULT__SUBSYSTEM_RESULT:
				return getSubsystemResult();
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
			case AssurePackage.SUBSYSTEM_RESULT__TARGET_SYSTEM:
				setTargetSystem((Subcomponent)newValue);
				return;
			case AssurePackage.SUBSYSTEM_RESULT__MESSAGE:
				setMessage((String)newValue);
				return;
			case AssurePackage.SUBSYSTEM_RESULT__CLAIM_RESULT:
				getClaimResult().clear();
				getClaimResult().addAll((Collection<? extends ClaimResult>)newValue);
				return;
			case AssurePackage.SUBSYSTEM_RESULT__SUBSYSTEM_RESULT:
				getSubsystemResult().clear();
				getSubsystemResult().addAll((Collection<? extends SubsystemResult>)newValue);
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
			case AssurePackage.SUBSYSTEM_RESULT__TARGET_SYSTEM:
				setTargetSystem((Subcomponent)null);
				return;
			case AssurePackage.SUBSYSTEM_RESULT__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case AssurePackage.SUBSYSTEM_RESULT__CLAIM_RESULT:
				getClaimResult().clear();
				return;
			case AssurePackage.SUBSYSTEM_RESULT__SUBSYSTEM_RESULT:
				getSubsystemResult().clear();
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
			case AssurePackage.SUBSYSTEM_RESULT__TARGET_SYSTEM:
				return targetSystem != null;
			case AssurePackage.SUBSYSTEM_RESULT__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case AssurePackage.SUBSYSTEM_RESULT__CLAIM_RESULT:
				return claimResult != null && !claimResult.isEmpty();
			case AssurePackage.SUBSYSTEM_RESULT__SUBSYSTEM_RESULT:
				return subsystemResult != null && !subsystemResult.isEmpty();
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
		result.append(" (message: ");
		result.append(message);
		result.append(')');
		return result.toString();
	}

} //SubsystemResultImpl

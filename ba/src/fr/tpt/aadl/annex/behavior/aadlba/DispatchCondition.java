/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tpt.aadl.annex.behavior.aadlba;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dispatch Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tpt.aadl.annex.behavior.aadlba.DispatchCondition#getDispatchTriggerConditionOwned <em>Dispatch Trigger Condition Owned</em>}</li>
 *   <li>{@link fr.tpt.aadl.annex.behavior.aadlba.DispatchCondition#getFrozenPorts <em>Frozen Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tpt.aadl.annex.behavior.aadlba.AadlBaPackage#getDispatchCondition()
 * @model
 * @generated
 */
public interface DispatchCondition extends BehaviorCondition {
	/**
	 * Returns the value of the '<em><b>Dispatch Trigger Condition Owned</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispatch Trigger Condition Owned</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispatch Trigger Condition Owned</em>' containment reference.
	 * @see #setDispatchTriggerConditionOwned(DispatchTriggerCondition)
	 * @see fr.tpt.aadl.annex.behavior.aadlba.AadlBaPackage#getDispatchCondition_DispatchTriggerConditionOwned()
	 * @model containment="true"
	 * @generated
	 */
	DispatchTriggerCondition getDispatchTriggerConditionOwned();

	/**
	 * Sets the value of the '{@link fr.tpt.aadl.annex.behavior.aadlba.DispatchCondition#getDispatchTriggerConditionOwned <em>Dispatch Trigger Condition Owned</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dispatch Trigger Condition Owned</em>' containment reference.
	 * @see #getDispatchTriggerConditionOwned()
	 * @generated
	 */
	void setDispatchTriggerConditionOwned(DispatchTriggerCondition value);

	/**
	 * Returns the value of the '<em><b>Frozen Ports</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tpt.aadl.annex.behavior.aadlba.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frozen Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frozen Ports</em>' containment reference list.
	 * @see #isSetFrozenPorts()
	 * @see #unsetFrozenPorts()
	 * @see fr.tpt.aadl.annex.behavior.aadlba.AadlBaPackage#getDispatchCondition_FrozenPorts()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	EList<Identifier> getFrozenPorts();

	/**
	 * Unsets the value of the '{@link fr.tpt.aadl.annex.behavior.aadlba.DispatchCondition#getFrozenPorts <em>Frozen Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrozenPorts()
	 * @see #getFrozenPorts()
	 * @generated
	 */
	void unsetFrozenPorts();

	/**
	 * Returns whether the value of the '{@link fr.tpt.aadl.annex.behavior.aadlba.DispatchCondition#getFrozenPorts <em>Frozen Ports</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frozen Ports</em>' containment reference list is set.
	 * @see #unsetFrozenPorts()
	 * @see #getFrozenPorts()
	 * @generated
	 */
	boolean isSetFrozenPorts();

} // DispatchCondition

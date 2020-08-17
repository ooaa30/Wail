/**
 * generated by Xtext 2.22.0
 */
package org.xtext.wesnoth.wail.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.wesnoth.wail.Aggression;
import org.xtext.wesnoth.wail.WailPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.wesnoth.wail.impl.AggressionImpl#getAggressionVal <em>Aggression Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggressionImpl extends MinimalEObjectImpl.Container implements Aggression
{
  /**
   * The default value of the '{@link #getAggressionVal() <em>Aggression Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggressionVal()
   * @generated
   * @ordered
   */
  protected static final String AGGRESSION_VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAggressionVal() <em>Aggression Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggressionVal()
   * @generated
   * @ordered
   */
  protected String aggressionVal = AGGRESSION_VAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AggressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return WailPackage.Literals.AGGRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAggressionVal()
  {
    return aggressionVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAggressionVal(String newAggressionVal)
  {
    String oldAggressionVal = aggressionVal;
    aggressionVal = newAggressionVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WailPackage.AGGRESSION__AGGRESSION_VAL, oldAggressionVal, aggressionVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case WailPackage.AGGRESSION__AGGRESSION_VAL:
        return getAggressionVal();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WailPackage.AGGRESSION__AGGRESSION_VAL:
        setAggressionVal((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case WailPackage.AGGRESSION__AGGRESSION_VAL:
        setAggressionVal(AGGRESSION_VAL_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case WailPackage.AGGRESSION__AGGRESSION_VAL:
        return AGGRESSION_VAL_EDEFAULT == null ? aggressionVal != null : !AGGRESSION_VAL_EDEFAULT.equals(aggressionVal);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (aggressionVal: ");
    result.append(aggressionVal);
    result.append(')');
    return result.toString();
  }

} //AggressionImpl

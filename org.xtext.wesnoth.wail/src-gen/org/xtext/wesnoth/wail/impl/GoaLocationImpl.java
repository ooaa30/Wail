/**
 * generated by Xtext 2.22.0
 */
package org.xtext.wesnoth.wail.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.wesnoth.wail.GoaLocation;
import org.xtext.wesnoth.wail.WailPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goa Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.wesnoth.wail.impl.GoaLocationImpl#getXAxis <em>XAxis</em>}</li>
 *   <li>{@link org.xtext.wesnoth.wail.impl.GoaLocationImpl#getYAxis <em>YAxis</em>}</li>
 *   <li>{@link org.xtext.wesnoth.wail.impl.GoaLocationImpl#getLocValue <em>Loc Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoaLocationImpl extends MinimalEObjectImpl.Container implements GoaLocation
{
  /**
   * The default value of the '{@link #getXAxis() <em>XAxis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXAxis()
   * @generated
   * @ordered
   */
  protected static final int XAXIS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getXAxis() <em>XAxis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXAxis()
   * @generated
   * @ordered
   */
  protected int xAxis = XAXIS_EDEFAULT;

  /**
   * The default value of the '{@link #getYAxis() <em>YAxis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYAxis()
   * @generated
   * @ordered
   */
  protected static final int YAXIS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getYAxis() <em>YAxis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYAxis()
   * @generated
   * @ordered
   */
  protected int yAxis = YAXIS_EDEFAULT;

  /**
   * The default value of the '{@link #getLocValue() <em>Loc Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocValue()
   * @generated
   * @ordered
   */
  protected static final int LOC_VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLocValue() <em>Loc Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocValue()
   * @generated
   * @ordered
   */
  protected int locValue = LOC_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GoaLocationImpl()
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
    return WailPackage.Literals.GOA_LOCATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getXAxis()
  {
    return xAxis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setXAxis(int newXAxis)
  {
    int oldXAxis = xAxis;
    xAxis = newXAxis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WailPackage.GOA_LOCATION__XAXIS, oldXAxis, xAxis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getYAxis()
  {
    return yAxis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setYAxis(int newYAxis)
  {
    int oldYAxis = yAxis;
    yAxis = newYAxis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WailPackage.GOA_LOCATION__YAXIS, oldYAxis, yAxis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getLocValue()
  {
    return locValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLocValue(int newLocValue)
  {
    int oldLocValue = locValue;
    locValue = newLocValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WailPackage.GOA_LOCATION__LOC_VALUE, oldLocValue, locValue));
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
      case WailPackage.GOA_LOCATION__XAXIS:
        return getXAxis();
      case WailPackage.GOA_LOCATION__YAXIS:
        return getYAxis();
      case WailPackage.GOA_LOCATION__LOC_VALUE:
        return getLocValue();
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
      case WailPackage.GOA_LOCATION__XAXIS:
        setXAxis((Integer)newValue);
        return;
      case WailPackage.GOA_LOCATION__YAXIS:
        setYAxis((Integer)newValue);
        return;
      case WailPackage.GOA_LOCATION__LOC_VALUE:
        setLocValue((Integer)newValue);
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
      case WailPackage.GOA_LOCATION__XAXIS:
        setXAxis(XAXIS_EDEFAULT);
        return;
      case WailPackage.GOA_LOCATION__YAXIS:
        setYAxis(YAXIS_EDEFAULT);
        return;
      case WailPackage.GOA_LOCATION__LOC_VALUE:
        setLocValue(LOC_VALUE_EDEFAULT);
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
      case WailPackage.GOA_LOCATION__XAXIS:
        return xAxis != XAXIS_EDEFAULT;
      case WailPackage.GOA_LOCATION__YAXIS:
        return yAxis != YAXIS_EDEFAULT;
      case WailPackage.GOA_LOCATION__LOC_VALUE:
        return locValue != LOC_VALUE_EDEFAULT;
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
    result.append(" (XAxis: ");
    result.append(xAxis);
    result.append(", YAxis: ");
    result.append(yAxis);
    result.append(", locValue: ");
    result.append(locValue);
    result.append(')');
    return result.toString();
  }

} //GoaLocationImpl

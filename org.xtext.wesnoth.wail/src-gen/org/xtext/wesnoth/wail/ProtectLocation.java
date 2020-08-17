/**
 * generated by Xtext 2.22.0
 */
package org.xtext.wesnoth.wail;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protect Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.wesnoth.wail.ProtectLocation#getXAxis <em>XAxis</em>}</li>
 *   <li>{@link org.xtext.wesnoth.wail.ProtectLocation#getYAxis <em>YAxis</em>}</li>
 *   <li>{@link org.xtext.wesnoth.wail.ProtectLocation#getLocValue <em>Loc Value</em>}</li>
 *   <li>{@link org.xtext.wesnoth.wail.ProtectLocation#getProcRad <em>Proc Rad</em>}</li>
 * </ul>
 *
 * @see org.xtext.wesnoth.wail.WailPackage#getProtectLocation()
 * @model
 * @generated
 */
public interface ProtectLocation extends Goal
{
  /**
   * Returns the value of the '<em><b>XAxis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>XAxis</em>' attribute.
   * @see #setXAxis(int)
   * @see org.xtext.wesnoth.wail.WailPackage#getProtectLocation_XAxis()
   * @model
   * @generated
   */
  int getXAxis();

  /**
   * Sets the value of the '{@link org.xtext.wesnoth.wail.ProtectLocation#getXAxis <em>XAxis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>XAxis</em>' attribute.
   * @see #getXAxis()
   * @generated
   */
  void setXAxis(int value);

  /**
   * Returns the value of the '<em><b>YAxis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>YAxis</em>' attribute.
   * @see #setYAxis(int)
   * @see org.xtext.wesnoth.wail.WailPackage#getProtectLocation_YAxis()
   * @model
   * @generated
   */
  int getYAxis();

  /**
   * Sets the value of the '{@link org.xtext.wesnoth.wail.ProtectLocation#getYAxis <em>YAxis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>YAxis</em>' attribute.
   * @see #getYAxis()
   * @generated
   */
  void setYAxis(int value);

  /**
   * Returns the value of the '<em><b>Loc Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loc Value</em>' attribute.
   * @see #setLocValue(int)
   * @see org.xtext.wesnoth.wail.WailPackage#getProtectLocation_LocValue()
   * @model
   * @generated
   */
  int getLocValue();

  /**
   * Sets the value of the '{@link org.xtext.wesnoth.wail.ProtectLocation#getLocValue <em>Loc Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loc Value</em>' attribute.
   * @see #getLocValue()
   * @generated
   */
  void setLocValue(int value);

  /**
   * Returns the value of the '<em><b>Proc Rad</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proc Rad</em>' attribute.
   * @see #setProcRad(int)
   * @see org.xtext.wesnoth.wail.WailPackage#getProtectLocation_ProcRad()
   * @model
   * @generated
   */
  int getProcRad();

  /**
   * Sets the value of the '{@link org.xtext.wesnoth.wail.ProtectLocation#getProcRad <em>Proc Rad</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Proc Rad</em>' attribute.
   * @see #getProcRad()
   * @generated
   */
  void setProcRad(int value);

} // ProtectLocation

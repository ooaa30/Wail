/**
 * generated by Xtext 2.22.0
 */
package org.xtext.wesnoth.wail;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defualt CA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.wesnoth.wail.Defualt_CA#getCaType <em>Ca Type</em>}</li>
 *   <li>{@link org.xtext.wesnoth.wail.Defualt_CA#getCost <em>Cost</em>}</li>
 * </ul>
 *
 * @see org.xtext.wesnoth.wail.WailPackage#getDefualt_CA()
 * @model
 * @generated
 */
public interface Defualt_CA extends EObject
{
  /**
   * Returns the value of the '<em><b>Ca Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ca Type</em>' attribute.
   * @see #setCaType(String)
   * @see org.xtext.wesnoth.wail.WailPackage#getDefualt_CA_CaType()
   * @model
   * @generated
   */
  String getCaType();

  /**
   * Sets the value of the '{@link org.xtext.wesnoth.wail.Defualt_CA#getCaType <em>Ca Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ca Type</em>' attribute.
   * @see #getCaType()
   * @generated
   */
  void setCaType(String value);

  /**
   * Returns the value of the '<em><b>Cost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cost</em>' attribute.
   * @see #setCost(int)
   * @see org.xtext.wesnoth.wail.WailPackage#getDefualt_CA_Cost()
   * @model
   * @generated
   */
  int getCost();

  /**
   * Sets the value of the '{@link org.xtext.wesnoth.wail.Defualt_CA#getCost <em>Cost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cost</em>' attribute.
   * @see #getCost()
   * @generated
   */
  void setCost(int value);

} // Defualt_CA

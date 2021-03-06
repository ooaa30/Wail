/**
 * generated by Xtext 2.22.0
 */
package org.xtext.wesnoth.wail;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.wesnoth.wail.Rule#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.wesnoth.wail.Rule#getFragments <em>Fragments</em>}</li>
 *   <li>{@link org.xtext.wesnoth.wail.Rule#getGoals <em>Goals</em>}</li>
 *   <li>{@link org.xtext.wesnoth.wail.Rule#getAggressionval <em>Aggressionval</em>}</li>
 *   <li>{@link org.xtext.wesnoth.wail.Rule#getCautionval <em>Cautionval</em>}</li>
 *   <li>{@link org.xtext.wesnoth.wail.Rule#getGroupingVal <em>Grouping Val</em>}</li>
 *   <li>{@link org.xtext.wesnoth.wail.Rule#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see org.xtext.wesnoth.wail.WailPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.wesnoth.wail.WailPackage#getRule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.wesnoth.wail.Rule#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Fragments</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.wesnoth.wail.Fragment}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fragments</em>' containment reference list.
   * @see org.xtext.wesnoth.wail.WailPackage#getRule_Fragments()
   * @model containment="true"
   * @generated
   */
  EList<Fragment> getFragments();

  /**
   * Returns the value of the '<em><b>Goals</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.wesnoth.wail.Goal}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goals</em>' containment reference list.
   * @see org.xtext.wesnoth.wail.WailPackage#getRule_Goals()
   * @model containment="true"
   * @generated
   */
  EList<Goal> getGoals();

  /**
   * Returns the value of the '<em><b>Aggressionval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aggressionval</em>' containment reference.
   * @see #setAggressionval(Aggression)
   * @see org.xtext.wesnoth.wail.WailPackage#getRule_Aggressionval()
   * @model containment="true"
   * @generated
   */
  Aggression getAggressionval();

  /**
   * Sets the value of the '{@link org.xtext.wesnoth.wail.Rule#getAggressionval <em>Aggressionval</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aggressionval</em>' containment reference.
   * @see #getAggressionval()
   * @generated
   */
  void setAggressionval(Aggression value);

  /**
   * Returns the value of the '<em><b>Cautionval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cautionval</em>' containment reference.
   * @see #setCautionval(Caution)
   * @see org.xtext.wesnoth.wail.WailPackage#getRule_Cautionval()
   * @model containment="true"
   * @generated
   */
  Caution getCautionval();

  /**
   * Sets the value of the '{@link org.xtext.wesnoth.wail.Rule#getCautionval <em>Cautionval</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cautionval</em>' containment reference.
   * @see #getCautionval()
   * @generated
   */
  void setCautionval(Caution value);

  /**
   * Returns the value of the '<em><b>Grouping Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Grouping Val</em>' containment reference.
   * @see #setGroupingVal(Grouping)
   * @see org.xtext.wesnoth.wail.WailPackage#getRule_GroupingVal()
   * @model containment="true"
   * @generated
   */
  Grouping getGroupingVal();

  /**
   * Sets the value of the '{@link org.xtext.wesnoth.wail.Rule#getGroupingVal <em>Grouping Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Grouping Val</em>' containment reference.
   * @see #getGroupingVal()
   * @generated
   */
  void setGroupingVal(Grouping value);

  /**
   * Returns the value of the '<em><b>Units</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.wesnoth.wail.Recruitment}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Units</em>' containment reference list.
   * @see org.xtext.wesnoth.wail.WailPackage#getRule_Units()
   * @model containment="true"
   * @generated
   */
  EList<Recruitment> getUnits();

} // Rule

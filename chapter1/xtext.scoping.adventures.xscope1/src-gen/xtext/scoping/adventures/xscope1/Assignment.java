/**
 */
package xtext.scoping.adventures.xscope1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xtext.scoping.adventures.xscope1.Assignment#getLhs <em>Lhs</em>}</li>
 *   <li>{@link xtext.scoping.adventures.xscope1.Assignment#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see xtext.scoping.adventures.xscope1.Xscope1Package#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Statement
{
  /**
   * Returns the value of the '<em><b>Lhs</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lhs</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' reference.
   * @see #setLhs(Variable)
   * @see xtext.scoping.adventures.xscope1.Xscope1Package#getAssignment_Lhs()
   * @model
   * @generated
   */
  Variable getLhs();

  /**
   * Sets the value of the '{@link xtext.scoping.adventures.xscope1.Assignment#getLhs <em>Lhs</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' reference.
   * @see #getLhs()
   * @generated
   */
  void setLhs(Variable value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rhs</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' reference.
   * @see #setRhs(Variable)
   * @see xtext.scoping.adventures.xscope1.Xscope1Package#getAssignment_Rhs()
   * @model
   * @generated
   */
  Variable getRhs();

  /**
   * Sets the value of the '{@link xtext.scoping.adventures.xscope1.Assignment#getRhs <em>Rhs</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(Variable value);

} // Assignment

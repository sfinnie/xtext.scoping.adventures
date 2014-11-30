/**
 */
package xtext.scoping.adventures.xscope1.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import xtext.scoping.adventures.xscope1.Assignment;
import xtext.scoping.adventures.xscope1.Variable;
import xtext.scoping.adventures.xscope1.Xscope1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xtext.scoping.adventures.xscope1.impl.AssignmentImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link xtext.scoping.adventures.xscope1.impl.AssignmentImpl#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentImpl extends StatementImpl implements Assignment
{
  /**
   * The cached value of the '{@link #getLhs() <em>Lhs</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLhs()
   * @generated
   * @ordered
   */
  protected Variable lhs;

  /**
   * The cached value of the '{@link #getRhs() <em>Rhs</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRhs()
   * @generated
   * @ordered
   */
  protected Variable rhs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignmentImpl()
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
    return Xscope1Package.Literals.ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getLhs()
  {
    if (lhs != null && lhs.eIsProxy())
    {
      InternalEObject oldLhs = (InternalEObject)lhs;
      lhs = (Variable)eResolveProxy(oldLhs);
      if (lhs != oldLhs)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xscope1Package.ASSIGNMENT__LHS, oldLhs, lhs));
      }
    }
    return lhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetLhs()
  {
    return lhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLhs(Variable newLhs)
  {
    Variable oldLhs = lhs;
    lhs = newLhs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xscope1Package.ASSIGNMENT__LHS, oldLhs, lhs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getRhs()
  {
    if (rhs != null && rhs.eIsProxy())
    {
      InternalEObject oldRhs = (InternalEObject)rhs;
      rhs = (Variable)eResolveProxy(oldRhs);
      if (rhs != oldRhs)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Xscope1Package.ASSIGNMENT__RHS, oldRhs, rhs));
      }
    }
    return rhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetRhs()
  {
    return rhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRhs(Variable newRhs)
  {
    Variable oldRhs = rhs;
    rhs = newRhs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xscope1Package.ASSIGNMENT__RHS, oldRhs, rhs));
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
      case Xscope1Package.ASSIGNMENT__LHS:
        if (resolve) return getLhs();
        return basicGetLhs();
      case Xscope1Package.ASSIGNMENT__RHS:
        if (resolve) return getRhs();
        return basicGetRhs();
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
      case Xscope1Package.ASSIGNMENT__LHS:
        setLhs((Variable)newValue);
        return;
      case Xscope1Package.ASSIGNMENT__RHS:
        setRhs((Variable)newValue);
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
      case Xscope1Package.ASSIGNMENT__LHS:
        setLhs((Variable)null);
        return;
      case Xscope1Package.ASSIGNMENT__RHS:
        setRhs((Variable)null);
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
      case Xscope1Package.ASSIGNMENT__LHS:
        return lhs != null;
      case Xscope1Package.ASSIGNMENT__RHS:
        return rhs != null;
    }
    return super.eIsSet(featureID);
  }

} //AssignmentImpl

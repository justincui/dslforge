/**
 */
package org.xtext.example.domainmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.domainmodel.DomainModel#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link org.xtext.example.domainmodel.DomainModel#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.domainmodel.DomainmodelPackage#getDomainModel()
 * @model
 * @generated
 */
public interface DomainModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import Section</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Section</em>' containment reference.
   * @see #setImportSection(ImportSection)
   * @see org.xtext.example.domainmodel.DomainmodelPackage#getDomainModel_ImportSection()
   * @model containment="true"
   * @generated
   */
  ImportSection getImportSection();

  /**
   * Sets the value of the '{@link org.xtext.example.domainmodel.DomainModel#getImportSection <em>Import Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import Section</em>' containment reference.
   * @see #getImportSection()
   * @generated
   */
  void setImportSection(ImportSection value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.domainmodel.AbstractElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.xtext.example.domainmodel.DomainmodelPackage#getDomainModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElements();

} // DomainModel

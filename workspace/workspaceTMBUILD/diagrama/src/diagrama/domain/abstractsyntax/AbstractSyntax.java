/**
 */
package diagrama.domain.abstractsyntax;

import diagrama.domain.Domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Syntax</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagrama.domain.abstractsyntax.AbstractSyntax#getLstMClassDiagram <em>Lst MClass Diagram</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.AbstractSyntax#getOwnedByDomain <em>Owned By Domain</em>}</li>
 * </ul>
 *
 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getAbstractSyntax()
 * @model
 * @generated
 */
public interface AbstractSyntax extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst MClass Diagram</b></em>' containment reference list.
	 * The list contents are of type {@link diagrama.domain.abstractsyntax.MClassDiagram}.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.abstractsyntax.MClassDiagram#getOwnedByAbstractSyntax <em>Owned By Abstract Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst MClass Diagram</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst MClass Diagram</em>' containment reference list.
	 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getAbstractSyntax_LstMClassDiagram()
	 * @see diagrama.domain.abstractsyntax.MClassDiagram#getOwnedByAbstractSyntax
	 * @model opposite="ownedByAbstractSyntax" containment="true"
	 * @generated
	 */
	EList<MClassDiagram> getLstMClassDiagram();

	/**
	 * Returns the value of the '<em><b>Owned By Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.Domain#getLstAbstractSyntax <em>Lst Abstract Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Domain</em>' container reference.
	 * @see #setOwnedByDomain(Domain)
	 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getAbstractSyntax_OwnedByDomain()
	 * @see diagrama.domain.Domain#getLstAbstractSyntax
	 * @model opposite="lstAbstractSyntax" transient="false"
	 * @generated
	 */
	Domain getOwnedByDomain();

	/**
	 * Sets the value of the '{@link diagrama.domain.abstractsyntax.AbstractSyntax#getOwnedByDomain <em>Owned By Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Domain</em>' container reference.
	 * @see #getOwnedByDomain()
	 * @generated
	 */
	void setOwnedByDomain(Domain value);

} // AbstractSyntax

/**
 */
package concrete;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MClass Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concrete.MClassDiagram#getName <em>Name</em>}</li>
 *   <li>{@link concrete.MClassDiagram#getLstMPackage <em>Lst MPackage</em>}</li>
 *   <li>{@link concrete.MClassDiagram#getLstMClass <em>Lst MClass</em>}</li>
 *   <li>{@link concrete.MClassDiagram#getLstMRelationship <em>Lst MRelationship</em>}</li>
 * </ul>
 *
 * @see concrete.ConcretePackage#getMClassDiagram()
 * @model annotation="gmf.diagram"
 * @generated
 */
public interface MClassDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see concrete.ConcretePackage#getMClassDiagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link concrete.MClassDiagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lst MPackage</b></em>' containment reference list.
	 * The list contents are of type {@link concrete.MPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst MPackage</em>' containment reference list.
	 * @see concrete.ConcretePackage#getMClassDiagram_LstMPackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<MPackage> getLstMPackage();

	/**
	 * Returns the value of the '<em><b>Lst MClass</b></em>' containment reference list.
	 * The list contents are of type {@link concrete.MClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst MClass</em>' containment reference list.
	 * @see concrete.ConcretePackage#getMClassDiagram_LstMClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<MClass> getLstMClass();

	/**
	 * Returns the value of the '<em><b>Lst MRelationship</b></em>' containment reference list.
	 * The list contents are of type {@link concrete.MRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst MRelationship</em>' containment reference list.
	 * @see concrete.ConcretePackage#getMClassDiagram_LstMRelationship()
	 * @model containment="true"
	 * @generated
	 */
	EList<MRelationship> getLstMRelationship();

} // MClassDiagram

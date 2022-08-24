/**
 */
package diagrama.domain.abstractsyntax;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagrama.domain.abstractsyntax.MPackage#getLstMClass <em>Lst MClass</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.MPackage#getName <em>Name</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.MPackage#getPath <em>Path</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.MPackage#getOwnedByMClassDiagram <em>Owned By MClass Diagram</em>}</li>
 * </ul>
 *
 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getMPackage()
 * @model
 * @generated
 */
public interface MPackage extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst MClass</b></em>' containment reference list.
	 * The list contents are of type {@link diagrama.domain.abstractsyntax.MClass}.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.abstractsyntax.MClass#getOwnedByMPackage <em>Owned By MPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst MClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst MClass</em>' containment reference list.
	 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getMPackage_LstMClass()
	 * @see diagrama.domain.abstractsyntax.MClass#getOwnedByMPackage
	 * @model opposite="ownedByMPackage" containment="true"
	 * @generated
	 */
	EList<MClass> getLstMClass();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getMPackage_Name()
	 * @model default=" " dataType="diagrama.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link diagrama.domain.abstractsyntax.MPackage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getMPackage_Path()
	 * @model default=" " dataType="diagrama.String"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link diagrama.domain.abstractsyntax.MPackage#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Owned By MClass Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.abstractsyntax.MClassDiagram#getLstMPackage <em>Lst MPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By MClass Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By MClass Diagram</em>' container reference.
	 * @see #setOwnedByMClassDiagram(MClassDiagram)
	 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getMPackage_OwnedByMClassDiagram()
	 * @see diagrama.domain.abstractsyntax.MClassDiagram#getLstMPackage
	 * @model opposite="lstMPackage" transient="false"
	 * @generated
	 */
	MClassDiagram getOwnedByMClassDiagram();

	/**
	 * Sets the value of the '{@link diagrama.domain.abstractsyntax.MPackage#getOwnedByMClassDiagram <em>Owned By MClass Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By MClass Diagram</em>' container reference.
	 * @see #getOwnedByMClassDiagram()
	 * @generated
	 */
	void setOwnedByMClassDiagram(MClassDiagram value);

} // MPackage

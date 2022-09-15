/**
 */
package concrete;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MAssociation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concrete.MAssociation#getSource <em>Source</em>}</li>
 *   <li>{@link concrete.MAssociation#getTarget <em>Target</em>}</li>
 *   <li>{@link concrete.MAssociation#getRelationshipType <em>Relationship Type</em>}</li>
 *   <li>{@link concrete.MAssociation#getMultiplicitySource <em>Multiplicity Source</em>}</li>
 *   <li>{@link concrete.MAssociation#getMultiplicityTarget <em>Multiplicity Target</em>}</li>
 *   <li>{@link concrete.MAssociation#getSourceRole <em>Source Role</em>}</li>
 *   <li>{@link concrete.MAssociation#getTargetRole <em>Target Role</em>}</li>
 *   <li>{@link concrete.MAssociation#getNavegabilitySource <em>Navegability Source</em>}</li>
 *   <li>{@link concrete.MAssociation#getNavegabilityTarget <em>Navegability Target</em>}</li>
 * </ul>
 *
 * @see concrete.ConcretePackage#getMAssociation()
 * @model annotation="gmf.link source='source' target='target' style='solid' width='1' color='255,0,0'"
 * @generated
 */
public interface MAssociation extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MClass)
	 * @see concrete.ConcretePackage#getMAssociation_Source()
	 * @model
	 * @generated
	 */
	MClass getSource();

	/**
	 * Sets the value of the '{@link concrete.MAssociation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MClass value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(MClass)
	 * @see concrete.ConcretePackage#getMAssociation_Target()
	 * @model
	 * @generated
	 */
	MClass getTarget();

	/**
	 * Sets the value of the '{@link concrete.MAssociation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(MClass value);

	/**
	 * Returns the value of the '<em><b>Relationship Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Type</em>' attribute.
	 * @see #setRelationshipType(String)
	 * @see concrete.ConcretePackage#getMAssociation_RelationshipType()
	 * @model
	 * @generated
	 */
	String getRelationshipType();

	/**
	 * Sets the value of the '{@link concrete.MAssociation#getRelationshipType <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Type</em>' attribute.
	 * @see #getRelationshipType()
	 * @generated
	 */
	void setRelationshipType(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicity Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity Source</em>' attribute.
	 * @see #setMultiplicitySource(String)
	 * @see concrete.ConcretePackage#getMAssociation_MultiplicitySource()
	 * @model
	 * @generated
	 */
	String getMultiplicitySource();

	/**
	 * Sets the value of the '{@link concrete.MAssociation#getMultiplicitySource <em>Multiplicity Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity Source</em>' attribute.
	 * @see #getMultiplicitySource()
	 * @generated
	 */
	void setMultiplicitySource(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicity Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity Target</em>' attribute.
	 * @see #setMultiplicityTarget(String)
	 * @see concrete.ConcretePackage#getMAssociation_MultiplicityTarget()
	 * @model
	 * @generated
	 */
	String getMultiplicityTarget();

	/**
	 * Sets the value of the '{@link concrete.MAssociation#getMultiplicityTarget <em>Multiplicity Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity Target</em>' attribute.
	 * @see #getMultiplicityTarget()
	 * @generated
	 */
	void setMultiplicityTarget(String value);

	/**
	 * Returns the value of the '<em><b>Source Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Role</em>' attribute.
	 * @see #setSourceRole(String)
	 * @see concrete.ConcretePackage#getMAssociation_SourceRole()
	 * @model
	 * @generated
	 */
	String getSourceRole();

	/**
	 * Sets the value of the '{@link concrete.MAssociation#getSourceRole <em>Source Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Role</em>' attribute.
	 * @see #getSourceRole()
	 * @generated
	 */
	void setSourceRole(String value);

	/**
	 * Returns the value of the '<em><b>Target Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Role</em>' attribute.
	 * @see #setTargetRole(String)
	 * @see concrete.ConcretePackage#getMAssociation_TargetRole()
	 * @model
	 * @generated
	 */
	String getTargetRole();

	/**
	 * Sets the value of the '{@link concrete.MAssociation#getTargetRole <em>Target Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Role</em>' attribute.
	 * @see #getTargetRole()
	 * @generated
	 */
	void setTargetRole(String value);

	/**
	 * Returns the value of the '<em><b>Navegability Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navegability Source</em>' attribute.
	 * @see #setNavegabilitySource(String)
	 * @see concrete.ConcretePackage#getMAssociation_NavegabilitySource()
	 * @model
	 * @generated
	 */
	String getNavegabilitySource();

	/**
	 * Sets the value of the '{@link concrete.MAssociation#getNavegabilitySource <em>Navegability Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navegability Source</em>' attribute.
	 * @see #getNavegabilitySource()
	 * @generated
	 */
	void setNavegabilitySource(String value);

	/**
	 * Returns the value of the '<em><b>Navegability Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navegability Target</em>' attribute.
	 * @see #setNavegabilityTarget(String)
	 * @see concrete.ConcretePackage#getMAssociation_NavegabilityTarget()
	 * @model
	 * @generated
	 */
	String getNavegabilityTarget();

	/**
	 * Sets the value of the '{@link concrete.MAssociation#getNavegabilityTarget <em>Navegability Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navegability Target</em>' attribute.
	 * @see #getNavegabilityTarget()
	 * @generated
	 */
	void setNavegabilityTarget(String value);

} // MAssociation

/**
 */
package abstracts;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see abstracts.AbstractsPackage
 * @generated
 */
public interface AbstractsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractsFactory eINSTANCE = abstracts.impl.AbstractsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MClass Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MClass Diagram</em>'.
	 * @generated
	 */
	MClassDiagram createMClassDiagram();

	/**
	 * Returns a new object of class '<em>MPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MPackage</em>'.
	 * @generated
	 */
	MPackage createMPackage();

	/**
	 * Returns a new object of class '<em>MClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MClass</em>'.
	 * @generated
	 */
	MClass createMClass();

	/**
	 * Returns a new object of class '<em>MRelationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MRelationship</em>'.
	 * @generated
	 */
	MRelationship createMRelationship();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AbstractsPackage getAbstractsPackage();

} //AbstractsFactory

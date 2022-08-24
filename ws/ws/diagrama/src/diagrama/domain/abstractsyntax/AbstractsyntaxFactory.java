/**
 */
package diagrama.domain.abstractsyntax;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage
 * @generated
 */
public interface AbstractsyntaxFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractsyntaxFactory eINSTANCE = diagrama.domain.abstractsyntax.impl.AbstractsyntaxFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MClass Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MClass Diagram</em>'.
	 * @generated
	 */
	MClassDiagram createMClassDiagram();

	/**
	 * Returns a new object of class '<em>MAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MAttribute</em>'.
	 * @generated
	 */
	MAttribute createMAttribute();

	/**
	 * Returns a new object of class '<em>MClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MClass</em>'.
	 * @generated
	 */
	MClass createMClass();

	/**
	 * Returns a new object of class '<em>MFunction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MFunction</em>'.
	 * @generated
	 */
	MFunction createMFunction();

	/**
	 * Returns a new object of class '<em>MPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MPackage</em>'.
	 * @generated
	 */
	MPackage createMPackage();

	/**
	 * Returns a new object of class '<em>MRelationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MRelationship</em>'.
	 * @generated
	 */
	MRelationship createMRelationship();

	/**
	 * Returns a new object of class '<em>Relationship Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship Factory</em>'.
	 * @generated
	 */
	RelationshipFactory createRelationshipFactory();

	/**
	 * Returns a new object of class '<em>Abstract Syntax</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Syntax</em>'.
	 * @generated
	 */
	AbstractSyntax createAbstractSyntax();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AbstractsyntaxPackage getAbstractsyntaxPackage();

} //AbstractsyntaxFactory

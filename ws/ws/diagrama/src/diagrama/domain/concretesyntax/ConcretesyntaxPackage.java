/**
 */
package diagrama.domain.concretesyntax;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see diagrama.domain.concretesyntax.ConcretesyntaxFactory
 * @model kind="package"
 * @generated
 */
public interface ConcretesyntaxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "concretesyntax";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///diagrama/domain/concretesyntax.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "diagrama.domain.concretesyntax";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConcretesyntaxPackage eINSTANCE = diagrama.domain.concretesyntax.impl.ConcretesyntaxPackageImpl.init();

	/**
	 * The meta object id for the '{@link diagrama.domain.concretesyntax.impl.ConcreteSyntaxImpl <em>Concrete Syntax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama.domain.concretesyntax.impl.ConcreteSyntaxImpl
	 * @see diagrama.domain.concretesyntax.impl.ConcretesyntaxPackageImpl#getConcreteSyntax()
	 * @generated
	 */
	int CONCRETE_SYNTAX = 0;

	/**
	 * The feature id for the '<em><b>Lst MClass Diagram</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX__LST_MCLASS_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Owned By Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX__OWNED_BY_DOMAIN = 1;

	/**
	 * The number of structural features of the '<em>Concrete Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link diagrama.domain.concretesyntax.ConcreteSyntax <em>Concrete Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Syntax</em>'.
	 * @see diagrama.domain.concretesyntax.ConcreteSyntax
	 * @generated
	 */
	EClass getConcreteSyntax();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama.domain.concretesyntax.ConcreteSyntax#getLstMClassDiagram <em>Lst MClass Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MClass Diagram</em>'.
	 * @see diagrama.domain.concretesyntax.ConcreteSyntax#getLstMClassDiagram()
	 * @see #getConcreteSyntax()
	 * @generated
	 */
	EReference getConcreteSyntax_LstMClassDiagram();

	/**
	 * Returns the meta object for the container reference '{@link diagrama.domain.concretesyntax.ConcreteSyntax#getOwnedByDomain <em>Owned By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Domain</em>'.
	 * @see diagrama.domain.concretesyntax.ConcreteSyntax#getOwnedByDomain()
	 * @see #getConcreteSyntax()
	 * @generated
	 */
	EReference getConcreteSyntax_OwnedByDomain();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConcretesyntaxFactory getConcretesyntaxFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link diagrama.domain.concretesyntax.impl.ConcreteSyntaxImpl <em>Concrete Syntax</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama.domain.concretesyntax.impl.ConcreteSyntaxImpl
		 * @see diagrama.domain.concretesyntax.impl.ConcretesyntaxPackageImpl#getConcreteSyntax()
		 * @generated
		 */
		EClass CONCRETE_SYNTAX = eINSTANCE.getConcreteSyntax();

		/**
		 * The meta object literal for the '<em><b>Lst MClass Diagram</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_SYNTAX__LST_MCLASS_DIAGRAM = eINSTANCE.getConcreteSyntax_LstMClassDiagram();

		/**
		 * The meta object literal for the '<em><b>Owned By Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_SYNTAX__OWNED_BY_DOMAIN = eINSTANCE.getConcreteSyntax_OwnedByDomain();

	}

} //ConcretesyntaxPackage

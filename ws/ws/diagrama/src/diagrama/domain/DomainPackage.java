/**
 */
package diagrama.domain;

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
 * @see diagrama.domain.DomainFactory
 * @model kind="package"
 * @generated
 */
public interface DomainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "domain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///diagrama/domain.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "diagrama.domain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainPackage eINSTANCE = diagrama.domain.impl.DomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link diagrama.domain.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama.domain.impl.DomainImpl
	 * @see diagrama.domain.impl.DomainPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>The Model Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Lst Abstract Syntax</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LST_ABSTRACT_SYNTAX = 1;

	/**
	 * The feature id for the '<em><b>Lst Concrete Syntax</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LST_CONCRETE_SYNTAX = 2;

	/**
	 * The feature id for the '<em><b>The UI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_UI = 3;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link diagrama.domain.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see diagrama.domain.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the container reference '{@link diagrama.domain.Domain#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Model Factory</em>'.
	 * @see diagrama.domain.Domain#getTheModelFactory()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheModelFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama.domain.Domain#getLstAbstractSyntax <em>Lst Abstract Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Abstract Syntax</em>'.
	 * @see diagrama.domain.Domain#getLstAbstractSyntax()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_LstAbstractSyntax();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama.domain.Domain#getLstConcreteSyntax <em>Lst Concrete Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Concrete Syntax</em>'.
	 * @see diagrama.domain.Domain#getLstConcreteSyntax()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_LstConcreteSyntax();

	/**
	 * Returns the meta object for the reference '{@link diagrama.domain.Domain#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The UI</em>'.
	 * @see diagrama.domain.Domain#getTheUI()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheUI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomainFactory getDomainFactory();

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
		 * The meta object literal for the '{@link diagrama.domain.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama.domain.impl.DomainImpl
		 * @see diagrama.domain.impl.DomainPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>The Model Factory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_MODEL_FACTORY = eINSTANCE.getDomain_TheModelFactory();

		/**
		 * The meta object literal for the '<em><b>Lst Abstract Syntax</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__LST_ABSTRACT_SYNTAX = eINSTANCE.getDomain_LstAbstractSyntax();

		/**
		 * The meta object literal for the '<em><b>Lst Concrete Syntax</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__LST_CONCRETE_SYNTAX = eINSTANCE.getDomain_LstConcreteSyntax();

		/**
		 * The meta object literal for the '<em><b>The UI</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_UI = eINSTANCE.getDomain_TheUI();

	}

} //DomainPackage

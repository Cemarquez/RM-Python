/**
 */
package diagrama.domain.impl;

import diagrama.diagramaPackage;

import diagrama.domain.Domain;
import diagrama.domain.DomainFactory;
import diagrama.domain.DomainPackage;

import diagrama.domain.abstractsyntax.AbstractsyntaxPackage;

import diagrama.domain.abstractsyntax.impl.AbstractsyntaxPackageImpl;

import diagrama.domain.concretesyntax.ConcretesyntaxPackage;

import diagrama.domain.concretesyntax.impl.ConcretesyntaxPackageImpl;

import diagrama.impl.diagramaPackageImpl;

import diagrama.ui.UiPackage;

import diagrama.ui.impl.UiPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainPackageImpl extends EPackageImpl implements DomainPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see diagrama.domain.DomainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DomainPackageImpl() {
		super(eNS_URI, DomainFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DomainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DomainPackage init() {
		if (isInited) return (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);

		// Obtain or create and register package
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DomainPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		diagramaPackageImpl thediagramaPackage = (diagramaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(diagramaPackage.eNS_URI) instanceof diagramaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(diagramaPackage.eNS_URI) : diagramaPackage.eINSTANCE);
		AbstractsyntaxPackageImpl theAbstractsyntaxPackage = (AbstractsyntaxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AbstractsyntaxPackage.eNS_URI) instanceof AbstractsyntaxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AbstractsyntaxPackage.eNS_URI) : AbstractsyntaxPackage.eINSTANCE);
		ConcretesyntaxPackageImpl theConcretesyntaxPackage = (ConcretesyntaxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConcretesyntaxPackage.eNS_URI) instanceof ConcretesyntaxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConcretesyntaxPackage.eNS_URI) : ConcretesyntaxPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);

		// Create package meta-data objects
		theDomainPackage.createPackageContents();
		thediagramaPackage.createPackageContents();
		theAbstractsyntaxPackage.createPackageContents();
		theConcretesyntaxPackage.createPackageContents();
		theUiPackage.createPackageContents();

		// Initialize created meta-data
		theDomainPackage.initializePackageContents();
		thediagramaPackage.initializePackageContents();
		theAbstractsyntaxPackage.initializePackageContents();
		theConcretesyntaxPackage.initializePackageContents();
		theUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDomainPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DomainPackage.eNS_URI, theDomainPackage);
		return theDomainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_TheModelFactory() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_LstAbstractSyntax() {
		return (EReference)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_LstConcreteSyntax() {
		return (EReference)domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_TheUI() {
		return (EReference)domainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainFactory getDomainFactory() {
		return (DomainFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		domainEClass = createEClass(DOMAIN);
		createEReference(domainEClass, DOMAIN__THE_MODEL_FACTORY);
		createEReference(domainEClass, DOMAIN__LST_ABSTRACT_SYNTAX);
		createEReference(domainEClass, DOMAIN__LST_CONCRETE_SYNTAX);
		createEReference(domainEClass, DOMAIN__THE_UI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AbstractsyntaxPackage theAbstractsyntaxPackage = (AbstractsyntaxPackage)EPackage.Registry.INSTANCE.getEPackage(AbstractsyntaxPackage.eNS_URI);
		ConcretesyntaxPackage theConcretesyntaxPackage = (ConcretesyntaxPackage)EPackage.Registry.INSTANCE.getEPackage(ConcretesyntaxPackage.eNS_URI);
		diagramaPackage thediagramaPackage = (diagramaPackage)EPackage.Registry.INSTANCE.getEPackage(diagramaPackage.eNS_URI);
		UiPackage theUiPackage = (UiPackage)EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theAbstractsyntaxPackage);
		getESubpackages().add(theConcretesyntaxPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_TheModelFactory(), thediagramaPackage.getModelFactory(), thediagramaPackage.getModelFactory_TheDomain(), "theModelFactory", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_LstAbstractSyntax(), theAbstractsyntaxPackage.getAbstractSyntax(), theAbstractsyntaxPackage.getAbstractSyntax_OwnedByDomain(), "lstAbstractSyntax", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_LstConcreteSyntax(), theConcretesyntaxPackage.getConcreteSyntax(), theConcretesyntaxPackage.getConcreteSyntax_OwnedByDomain(), "lstConcreteSyntax", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_TheUI(), theUiPackage.getUI(), theUiPackage.getUI_TheDomain(), "theUI", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(domainEClass, null, "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //DomainPackageImpl

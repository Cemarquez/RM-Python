/**
 */
package diagrama.domain.concretesyntax.impl;

import diagrama.diagramaPackage;

import diagrama.domain.DomainPackage;

import diagrama.domain.abstractsyntax.AbstractsyntaxPackage;

import diagrama.domain.abstractsyntax.impl.AbstractsyntaxPackageImpl;

import diagrama.domain.concretesyntax.ConcreteSyntax;
import diagrama.domain.concretesyntax.ConcretesyntaxFactory;
import diagrama.domain.concretesyntax.ConcretesyntaxPackage;

import diagrama.domain.impl.DomainPackageImpl;

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
public class ConcretesyntaxPackageImpl extends EPackageImpl implements ConcretesyntaxPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteSyntaxEClass = null;

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
	 * @see diagrama.domain.concretesyntax.ConcretesyntaxPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConcretesyntaxPackageImpl() {
		super(eNS_URI, ConcretesyntaxFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConcretesyntaxPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConcretesyntaxPackage init() {
		if (isInited) return (ConcretesyntaxPackage)EPackage.Registry.INSTANCE.getEPackage(ConcretesyntaxPackage.eNS_URI);

		// Obtain or create and register package
		ConcretesyntaxPackageImpl theConcretesyntaxPackage = (ConcretesyntaxPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConcretesyntaxPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConcretesyntaxPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		diagramaPackageImpl thediagramaPackage = (diagramaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(diagramaPackage.eNS_URI) instanceof diagramaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(diagramaPackage.eNS_URI) : diagramaPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		AbstractsyntaxPackageImpl theAbstractsyntaxPackage = (AbstractsyntaxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AbstractsyntaxPackage.eNS_URI) instanceof AbstractsyntaxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AbstractsyntaxPackage.eNS_URI) : AbstractsyntaxPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);

		// Create package meta-data objects
		theConcretesyntaxPackage.createPackageContents();
		thediagramaPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theAbstractsyntaxPackage.createPackageContents();
		theUiPackage.createPackageContents();

		// Initialize created meta-data
		theConcretesyntaxPackage.initializePackageContents();
		thediagramaPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theAbstractsyntaxPackage.initializePackageContents();
		theUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConcretesyntaxPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConcretesyntaxPackage.eNS_URI, theConcretesyntaxPackage);
		return theConcretesyntaxPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteSyntax() {
		return concreteSyntaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteSyntax_LstMClassDiagram() {
		return (EReference)concreteSyntaxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteSyntax_OwnedByDomain() {
		return (EReference)concreteSyntaxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcretesyntaxFactory getConcretesyntaxFactory() {
		return (ConcretesyntaxFactory)getEFactoryInstance();
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
		concreteSyntaxEClass = createEClass(CONCRETE_SYNTAX);
		createEReference(concreteSyntaxEClass, CONCRETE_SYNTAX__LST_MCLASS_DIAGRAM);
		createEReference(concreteSyntaxEClass, CONCRETE_SYNTAX__OWNED_BY_DOMAIN);
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
		DomainPackage theDomainPackage = (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(concreteSyntaxEClass, ConcreteSyntax.class, "ConcreteSyntax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcreteSyntax_LstMClassDiagram(), theAbstractsyntaxPackage.getMClassDiagram(), theAbstractsyntaxPackage.getMClassDiagram_OwnedByConcreteSyntax(), "lstMClassDiagram", null, 0, -1, ConcreteSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteSyntax_OwnedByDomain(), theDomainPackage.getDomain(), theDomainPackage.getDomain_LstConcreteSyntax(), "ownedByDomain", null, 0, 1, ConcreteSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ConcretesyntaxPackageImpl

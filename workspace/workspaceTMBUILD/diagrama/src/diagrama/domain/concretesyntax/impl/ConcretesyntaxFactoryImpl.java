/**
 */
package diagrama.domain.concretesyntax.impl;

import diagrama.domain.concretesyntax.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcretesyntaxFactoryImpl extends EFactoryImpl implements ConcretesyntaxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConcretesyntaxFactory init() {
		try {
			ConcretesyntaxFactory theConcretesyntaxFactory = (ConcretesyntaxFactory)EPackage.Registry.INSTANCE.getEFactory(ConcretesyntaxPackage.eNS_URI);
			if (theConcretesyntaxFactory != null) {
				return theConcretesyntaxFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConcretesyntaxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcretesyntaxFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConcretesyntaxPackage.CONCRETE_SYNTAX: return createConcreteSyntax();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteSyntax createConcreteSyntax() {
		ConcreteSyntaxImpl concreteSyntax = new ConcreteSyntaxImpl();
		return concreteSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcretesyntaxPackage getConcretesyntaxPackage() {
		return (ConcretesyntaxPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConcretesyntaxPackage getPackage() {
		return ConcretesyntaxPackage.eINSTANCE;
	}

} //ConcretesyntaxFactoryImpl

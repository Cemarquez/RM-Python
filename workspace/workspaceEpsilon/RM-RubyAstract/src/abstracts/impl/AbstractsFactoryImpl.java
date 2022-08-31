/**
 */
package abstracts.impl;

import abstracts.*;

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
public class AbstractsFactoryImpl extends EFactoryImpl implements AbstractsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AbstractsFactory init() {
		try {
			AbstractsFactory theAbstractsFactory = (AbstractsFactory)EPackage.Registry.INSTANCE.getEFactory(AbstractsPackage.eNS_URI);
			if (theAbstractsFactory != null) {
				return theAbstractsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AbstractsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractsFactoryImpl() {
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
			case AbstractsPackage.MCLASS_DIAGRAM: return createMClassDiagram();
			case AbstractsPackage.MPACKAGE: return createMPackage();
			case AbstractsPackage.MCLASS: return createMClass();
			case AbstractsPackage.MRELATIONSHIP: return createMRelationship();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MClassDiagram createMClassDiagram() {
		MClassDiagramImpl mClassDiagram = new MClassDiagramImpl();
		return mClassDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MPackage createMPackage() {
		MPackageImpl mPackage = new MPackageImpl();
		return mPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MClass createMClass() {
		MClassImpl mClass = new MClassImpl();
		return mClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MRelationship createMRelationship() {
		MRelationshipImpl mRelationship = new MRelationshipImpl();
		return mRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractsPackage getAbstractsPackage() {
		return (AbstractsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AbstractsPackage getPackage() {
		return AbstractsPackage.eINSTANCE;
	}

} //AbstractsFactoryImpl

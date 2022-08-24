/**
 */
package diagrama.domain.abstractsyntax.util;

import diagrama.domain.abstractsyntax.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage
 * @generated
 */
public class AbstractsyntaxAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AbstractsyntaxPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractsyntaxAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AbstractsyntaxPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractsyntaxSwitch<Adapter> modelSwitch =
		new AbstractsyntaxSwitch<Adapter>() {
			@Override
			public Adapter caseMClassDiagram(MClassDiagram object) {
				return createMClassDiagramAdapter();
			}
			@Override
			public Adapter caseMAttribute(MAttribute object) {
				return createMAttributeAdapter();
			}
			@Override
			public Adapter caseMClass(MClass object) {
				return createMClassAdapter();
			}
			@Override
			public Adapter caseMFunction(MFunction object) {
				return createMFunctionAdapter();
			}
			@Override
			public Adapter caseMPackage(MPackage object) {
				return createMPackageAdapter();
			}
			@Override
			public Adapter caseMRelationship(MRelationship object) {
				return createMRelationshipAdapter();
			}
			@Override
			public Adapter caseRelationshipFactory(RelationshipFactory object) {
				return createRelationshipFactoryAdapter();
			}
			@Override
			public Adapter caseAbstractSyntax(AbstractSyntax object) {
				return createAbstractSyntaxAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link diagrama.domain.abstractsyntax.MClassDiagram <em>MClass Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama.domain.abstractsyntax.MClassDiagram
	 * @generated
	 */
	public Adapter createMClassDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama.domain.abstractsyntax.MAttribute <em>MAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama.domain.abstractsyntax.MAttribute
	 * @generated
	 */
	public Adapter createMAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama.domain.abstractsyntax.MClass <em>MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama.domain.abstractsyntax.MClass
	 * @generated
	 */
	public Adapter createMClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama.domain.abstractsyntax.MFunction <em>MFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama.domain.abstractsyntax.MFunction
	 * @generated
	 */
	public Adapter createMFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama.domain.abstractsyntax.MPackage <em>MPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama.domain.abstractsyntax.MPackage
	 * @generated
	 */
	public Adapter createMPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama.domain.abstractsyntax.MRelationship <em>MRelationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama.domain.abstractsyntax.MRelationship
	 * @generated
	 */
	public Adapter createMRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama.domain.abstractsyntax.RelationshipFactory <em>Relationship Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama.domain.abstractsyntax.RelationshipFactory
	 * @generated
	 */
	public Adapter createRelationshipFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama.domain.abstractsyntax.AbstractSyntax <em>Abstract Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama.domain.abstractsyntax.AbstractSyntax
	 * @generated
	 */
	public Adapter createAbstractSyntaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AbstractsyntaxAdapterFactory

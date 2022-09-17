package diagrama.model;

import concrete.ConcretePackage;

public class TestClass {
	private static abstracts.ModelFactory modelFactoryAbstracta;
	public static void main(String[] args) {
		modelFactoryAbstracta = cargarAbstracta();
		System.out.println(modelFactoryAbstracta.getLstPackages().size());

	}
	
	public static abstracts.ModelFactory cargarAbstracta() {
		abstracts.ModelFactory modelFactory = null;
		String path = "/C/Users/cesar/Documents/RM-Ruby/workspace/runtime-EclipseApplication/modelProduction/src/model/model.abstracts";
		ConcretePackage whoownmePackage =  ConcretePackage.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(path);
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);

		try {
			resource.load(null);
			modelFactory = (abstracts.ModelFactory)resource.getContents().get(0);
			System.out.println("loaded: " + modelFactory);
		}
		catch (java.io.IOException e) {
			System.out.println("failed to read " + uri); 		
			System.out.println(e);
		}
		return modelFactory;
		
	
	}
	
}

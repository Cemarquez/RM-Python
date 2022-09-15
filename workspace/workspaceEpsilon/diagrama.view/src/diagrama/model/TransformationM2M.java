package diagrama.model;

import java.util.List;

import abstracts.AbstractsFactory;
import abstracts.MPackage;
import concrete.MClass;

public class TransformationM2M {
	private abstracts.ModelFactory modelFactoryAbstracta;
	private concrete.ModelFactory modelFactoryConcreta;
	
	public TransformationM2M(concrete.ModelFactory modelFactoryConcreta, abstracts.ModelFactory modelFactoryAbstracta) {
		super();
		this.modelFactoryAbstracta = modelFactoryAbstracta;
		this.modelFactoryConcreta = modelFactoryConcreta;
	}
	
	public String transformarM2M() {
		String mensaje = "Se ha realziado la transformación M2M";
		
		for(concrete.MClassDiagram dConcreta : modelFactoryConcreta.getLstMDiagrams()) {
			//crear los paquetes
			for(concrete.MPackage p : dConcreta.getLstMPackage()) {
				crearPaquete(p);
			}
			
			for(concrete.MClass c : dConcreta.getLstMClass()) {
				crearClase(c);
			}
			
			
		}
		
		return mensaje;
	}
	
	private void crearClase(concrete.MClass c) {
		String path = c.getPath();
		abstracts.MPackage p = buscarPaquete(path, modelFactoryAbstracta.getLstPackages().get(0));
		abstracts.MClass cl = buscarClase(path, c.getName(), p);
		if(cl==null) {
			abstracts.MClass newClass = AbstractsFactory.eINSTANCE.createMClass();
			newClass.setPath(c.getPath());
			newClass.setName(c.getName());
			newClass.setStereoType(c.getStereoType());
			newClass.setAbstracts(c.isAbstracts());
			newClass.setComments(c.getComments());
			newClass.setAccessModifier(c.getAccessModifier());
			p.getLstMClass().add(newClass);
		}
		
	}

	private abstracts.MClass buscarClase(String path, String name, abstracts.MPackage mp) {
		for(abstracts.MClass c : mp.getLstMClass()) {
			if(c.getName().equals(name) && c.getPath().equals(path)) {
				return c;
			}
		}
		
		return null;
	}

		
	private abstracts.MPackage buscarPaquete(String path, abstracts.MPackage parent) {
		for (abstracts.MPackage p : parent.getLstMPackage()) {
			if((p.getPath()+p.getName()).equals(path)) {
				return p;
			}
			if(!p.getLstMPackage().isEmpty()) {
				abstracts.MPackage paquete = buscarPaquete(path, p);
				if(paquete!=null) {
					return paquete;
				}
			}
		}
		
		
		return null;
	
	}
	

	
	private void crearPaquete(concrete.MPackage paquete) {
		String ruta = "";
		if(paquete.getPath()==null) {
			ruta = paquete.getName();
		}else {
			ruta = paquete.getPath()+paquete.getName();
		}
		String[] split = ruta.split("/");
		abstracts.MPackage paqueteParent = null;
		
		String nuevaRuta="";
		for(int i=0;i<split.length;i++) {
			String nombrePaquete = split[i];
			paqueteParent = obtenerPaqueteAbstracta(nombrePaquete, nuevaRuta, paqueteParent);
			nuevaRuta += split[i]+"/";
			
		}
	}
	

	
	private abstracts.MPackage obtenerPaqueteAbstracta(String nombrePaquete, String nuevaRuta,
			abstracts.MPackage paqueteParent) {
		
		if(paqueteParent == null) {
			for (int i = 0; i < modelFactoryAbstracta.getLstPackages().size(); i++) {
				if(modelFactoryAbstracta.getLstPackages().get(i).getName().equals(nombrePaquete)) {
					return modelFactoryAbstracta.getLstPackages().get(i);
				}
			}
			abstracts.MPackage nuevoPackage = AbstractsFactory.eINSTANCE.createMPackage();
			nuevoPackage.setName(nombrePaquete);
			nuevoPackage.setPath(nuevaRuta);
			modelFactoryAbstracta.getLstPackages().add(nuevoPackage);
			return nuevoPackage;

		}else {
			for (int i = 0; i < paqueteParent.getLstMPackage().size(); i++) {
				if(paqueteParent.getLstMPackage().get(i).getName().equals(nombrePaquete)) {
					if(paqueteParent.getLstMPackage().get(i).getPath().equals(nuevaRuta))
					{
						return paqueteParent.getLstMPackage().get(i);
					}
				}
			}
		}
		
		abstracts.MPackage nuevoPackage = AbstractsFactory.eINSTANCE.createMPackage();
		nuevoPackage.setName(nombrePaquete);
		nuevoPackage.setPath(nuevaRuta);
		paqueteParent.getLstMPackage().add(nuevoPackage);
		return nuevoPackage;
	}
	
}

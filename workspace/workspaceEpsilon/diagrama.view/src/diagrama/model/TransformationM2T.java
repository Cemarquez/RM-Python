package diagrama.model;

import java.io.File;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import abstracts.MClass;

public class TransformationM2T {
	private abstracts.ModelFactory modelFactoryAbstracta;
	private JFileChooser chooser = new JFileChooser();
	
	public TransformationM2T(abstracts.ModelFactory modelFactoryAbstracta) {
		super();
		this.modelFactoryAbstracta = modelFactoryAbstracta;
	}
	
	public String transformarM2T() {
		
		String mensaje = "Se ha realziado la transformación M2T";
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		
		int returnVal = chooser.showOpenDialog(null);
	    if(returnVal == JFileChooser.APPROVE_OPTION) {
	    	File f =  chooser.getSelectedFile();
	    	System.out.println("Creacion de paquetes:");
	    	crearCarpetas(f.getPath());
	    	System.out.println();
	    	System.out.println("Creacion de clases:");
			for (abstracts.MClass cl : modelFactoryAbstracta.getLstAllClass()) {
				 System.out.println(crearClase(f.getPath(), cl));
			}
	    	
	    }else {
	    	
	    	mensaje = "Debe seleccionar una ubicación para continuar!";
	    }
	   
	    
		return mensaje;
	}
	
	
	private String crearClase(String path, MClass cl) {
		StringBuilder textoCodigo = new StringBuilder();
		textoCodigo.append("class "+cl.getName() + "\n");
		if(!cl.getLstAttributes().isEmpty()) {
			String attr ="attr_accessor ";
			for(int i=0;i<cl.getLstAttributes().size();i++) {
				abstracts.MAttribute a = cl.getLstAttributes().get(i);
				if(i<cl.getLstAttributes().size()-1) {
					attr += ":" + a.getName() + ", ";
				}else {
					attr += ":" + a.getName();
				}
			}
			
			textoCodigo.append(attr +"\n");
		}
		
		
		
		
		guardarArchivo(textoCodigo.toString(), path, cl.getPath()+"/"+cl.getName());
		
		return "Se ha generado la clase "+cl.getName();
		
	}
	
	private void guardarArchivo(String cadena, String ruta , String nombre) {
		try
		{
			//Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
			
			File archivo=new File(ruta);
			//Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
			FileWriter escribir=new FileWriter(archivo+"/"+nombre+".rb",true);
			//Escribimos en el archivo con el metodo write 
			escribir.write(cadena);

			//Cerramos la conexion
			escribir.close();
		}

		//Si existe un problema al escribir cae aqui
		catch(Exception e)
		{
			System.out.println("Error al Guardar");
		}

	}


	private void crearCarpetas(String parentPath) {
		for(abstracts.MPackage mp : modelFactoryAbstracta.getLstAllPackage()) {
			File f = new File(parentPath+"/"+mp.getPath()+"/"+mp.getName());
			System.out.println(f.getPath());
			if(!f.exists()) {
				f.mkdirs();
				System.out.println("creada la carpeta: " + f.getName());
			}
		}
	}
}

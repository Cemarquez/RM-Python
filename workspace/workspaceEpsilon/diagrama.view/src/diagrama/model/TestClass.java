package diagrama.model;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class TestClass {
	    public static void main(String[] args){
	    String constructor ="amigo, ";
	    System.out.println(constructor.charAt(constructor.length()-2));
	    System.out.println(replaceLast(constructor, ",", " "));
	    }
	
	    public static String replaceLast(String text, String regex, String replacement) {
	        return text.replaceFirst("(?s)(.*)" + regex, "$1" + replacement);
	    }
}

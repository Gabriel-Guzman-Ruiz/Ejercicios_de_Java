package clases;

public class ClaseObjeto {
	

	// Atributos
	private String campo1;
	private String campo2;
	private String campo3;

	 // Constructor
	 public ClaseObjeto(String campo1, String campo2, String campo3) {
		 this.campo1 = campo1;
	     this.campo2 = campo2;
	     this.campo3 = campo3;
	 }

	 // Formato de salida del objeto
	 @Override
	 public String toString() {
	        return "CAMPO 1: " + campo1 + "\n" +
	               "CAMPO 2: " + campo2 + "\n" +
	               "CAMPO 3: " + campo3 + "\n";
	}

}

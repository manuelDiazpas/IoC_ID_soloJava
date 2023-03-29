package unique;

public class Main {

	public static void main(String[] args) {
		//Creamos un objeto del controlador
		Persona per = new Persona(new Madrid());
		System.out.println("Tengo un amigo llamado Pepito");
		//La clase, seleccionara los metodos de la clase utilizada con iterfaz "Mudanza"
		per.getVivia();
		per.getSeMuda(16);
		
	}

}

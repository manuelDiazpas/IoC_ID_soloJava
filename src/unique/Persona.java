package unique;

/*
 * Esta clase, sera el objeto que controlara las llamadas
 * del resto de clase para que, cuando este en la vista del
 * programa, organice que clase interferira en esta.
 */
public class Persona {
	// variable que hace referencia a la interfaz "Mudanza"
	Mudanza mud;
	/*
	 * El constructor de la clase. Recibira
	 * como valor una clase "Mudanza" para mas adelante
	 * mostrar y utilizar los metodos que estas posean
	 */
	public Persona(Mudanza mud) {
		setMud(mud);
	}

	public Mudanza getMud() {
		return mud;
	}

	public void setMud(Mudanza mud) {
		this.mud = mud;
	}
	
	public void getVivia() {
		mud.vivia();
	}

	public void getSeMuda(int dia) {
		mud.seMuda(dia);
	}
	
	
}

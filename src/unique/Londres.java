package unique;

/*
 * Esta clase implementa la interfaz "Mudanza"
 * para obtener los metodos de los que depende
 */
public class Londres implements Mudanza{

	@Override
	public void vivia() {
		System.out.println("Pepito vivia en Sevilla");
		
	}

	@Override
	public void seMuda(int dia) {
		System.out.println("Ahora se muda a Londres el " + dia + " de este mes");
		
	}

}

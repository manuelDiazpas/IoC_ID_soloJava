package unique;

/*
 * Esta clase implementa la interfaz "Mudanza"
 * para obtener los metodos de los que depende
 */
public class Madrid implements Mudanza{

	@Override
	public void vivia() {
		System.out.println("Pepito vivia en Sevilla");
		
	}

	@Override
	public void seMuda(int dia) {
		System.out.println("Ahora se muda a Madrid el " + dia + " de este mes");
		
	}

}

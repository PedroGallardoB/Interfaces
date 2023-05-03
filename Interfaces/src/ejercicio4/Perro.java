package ejercicio4;

/**
 * Clase que representa a un perro
 */
public class Perro extends AnimalDomestico {

	/**
	 * Hace que el perro ladre
	 */
	@Override
	public void hacerRuido() {
		System.out.println("GUAU");
	}

	/**
	 * Método que determina si el perro hace caso o no a las órdenes.
	 * 
	 * @return true si el perro hace caso, false si no lo hace.
	 */
	@Override
	boolean hacerCaso() {
		boolean haceCaso = false;
		if (Math.random() * 101 <= 90) {
			haceCaso = true;
		}
		return haceCaso;
	}

	/**
	 * Método que saca a pasear al perro
	 */
	public void sacarPaseo() {

	}
}

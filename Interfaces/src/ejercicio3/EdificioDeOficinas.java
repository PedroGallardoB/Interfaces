package ejercicio3;

/**
 * 
 * Clase que representa un Edificio de Oficinas
 */
class EdificioDeOficinas implements Edificio {

	/**
	 * Número de oficinas del edificio
	 */
	private int numOficinas;
	/**
	 * Superficie total del edificio
	 */
	private double superficieEdificio;

	/**
	 * Constructor de la clase EdificioDeOficinas
	 * @param numOficina Número de oficinas del edificio
	 * @param superficieEdificio Superficie total del edificio
	 */
	public EdificioDeOficinas(int numOficinas, double superficieEdificio) {
		if(numOficinas>0)
		this.numOficinas = numOficinas;
		if(superficieEdificio>0)
		this.superficieEdificio = superficieEdificio;
	}

	/**
	 * 
	 * Método para obtener la superficie del edificio
	 * @return Superficie del edificio
	 */
	@Override
	public double getSuperficieEdificio() {
		return superficieEdificio;
	}

	/**
	 * Método para obtener el número de oficinas del edificio
	 * @return Número de oficinas del edificio
	 */
	public int getNumOficinas() {
		return numOficinas;
	}

	/**
	 * Método para representar la información del edificio en formato String
	 * @return Cadena de texto que representa la información del edificio
	 */
	@Override
	public String toString() {
		return "Edificio de oficinas: numero de oficinas " + numOficinas + ", superficie de edificio "
				+ superficieEdificio;
	}
}
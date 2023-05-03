package ejercicio3;

/**
 * Clase que representa un polideportivo que implementa las interfaces
 * InstalacionDeportiva y Edificio.
 */
class Polideportivo implements InstalacionDeportiva, Edificio {
	private String nombre;
	private int tipoDeInstalacion;
	private double superficieEdificio;

	/**
	 * Constructor con los atributos de la clase.
	 * 
	 * @param nombre Nombre del polideportivo.
	 * @param tipoDeInstalacion Tipo de instalación deportiva del polideportivo.
	 * @param superficieEdificio Superficie del edificio del polideportivo.
	 */
	public Polideportivo(String nombre, int tipoDeInstalacion, double superficieEdificio) {
		if(nombre!=null&&nombre.length()>0)
		this.nombre = nombre;
		if(tipoDeInstalacion>=0)
		this.tipoDeInstalacion = tipoDeInstalacion;
		if(tipoDeInstalacion>=0)
		this.superficieEdificio = superficieEdificio;
	}

	/**
	 * Método que devuelve el tipo de instalación deportiva del polideportivo.
	 * 
	 * @return Tipo de instalación deportiva del polideportivo.
	 */
	@Override
	public int getTipoDeInstalacion() {
		return tipoDeInstalacion;
	}

	/**
	 * Método que devuelve la superficie del
	 * edificio del polideportivo.
	 * 
	 * @return Superficie del edificio del polideportivo.
	 */
	@Override
	public double getSuperficieEdificio() {
		return superficieEdificio;
	}

	/**
	 * Método que devuelve el nombre del polideportivo.
	 * @return Nombre del polideportivo.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método que devuelve la información del polideportivo.
	 * @return String con la información del polideportivo.
	 */
	@Override
	public String toString() {
		return "Polideportivo: nombre " + nombre + ", tipo de instalación " + tipoDeInstalacion
				+ ", superficie de edificio " + superficieEdificio;
	}
}
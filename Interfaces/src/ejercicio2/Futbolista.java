package ejercicio2;

public class Futbolista implements Comparable {
	/**
	 * Número de la camiseta del jugador
	 */
	private int numeroCamiseta = 0;
	/**
	 * Nombre del jugador
	 */
	private String nombre = "";
	/**
	 * Edad del jugador
	 */
	private int edad = 0;
	/**
	 * Numero del jugador
	 */
	private int numeroGoles = 0;
/**
 * Constructor con parámetros
 * @param numeroCamiseta Número de la camiseta del jugador
 * @param nombre Nombre del jugador
 * @param edad Edad del Jugador
 * @param numeroGoles Número de goles del jugador
 */
	public Futbolista(int numeroCamiseta, String nombre, int edad, int numeroGoles) {
		if(numeroCamiseta>0)
		this.numeroCamiseta = numeroCamiseta;
		if(nombre!=null&&nombre.length()>0)
		this.nombre = nombre;
		if(edad>0)
		this.edad = edad;
		if(numeroGoles>0)
		this.numeroGoles = numeroGoles;
	}
/**
 * Devuelve los datos en forma de String
 * @return Devuelve los datos como String
 * 
 */
	@Override
	public String toString() {
		return "Futbolista: numero de camisa " + numeroCamiseta + ", nombre " + nombre + ", edad " + edad
				+ ", número de goles " + numeroGoles;
	}

	/**
	 * Comprueba si dos objetos son iguales
	 * @return Booleano que devuelve true si son iguales
	 */
	@Override
	public boolean equals(Object futbolistaObj) {
		Futbolista futbolista = (Futbolista) futbolistaObj;
		boolean igual = false;
		if (futbolista.numeroCamiseta == this.numeroCamiseta && futbolista.nombre == this.nombre) {
			igual = true;
		}
		return igual;

	}

	/**
	 * Compara los objetos futbolista
	 * 
	 * @return numero negativo si es más pequeño, positivo si es más grande e
	 *         iguales si es 0
	 */
	@Override
	public int compareTo(Object futbolistaObj) {
		int res = 0;
		Futbolista futbolista = (Futbolista) futbolistaObj;
		if (this.numeroCamiseta > futbolista.numeroCamiseta) {
			res++;
		} else if (this.numeroCamiseta < futbolista.numeroCamiseta) {
			res--;
		} else {
			res += (this.nombre.compareTo(futbolista.nombre));
		}
		return res;
	}
}

package ejercicio1;
/**
 * Clase que representa socios
 * @author Rexil
 *
 */
public class Socio implements Comparable<Socio> {
	/**
	 * id del socio
	 */
    private int id;
    /**
     * nombre del socio
     */
    private String nombre;
    /**
     * valor de la edad del socio
     */
    private int edad;
    /**
     * Constructor del socio con parámetros
     * @param id id del socio
     * @param nombre nombre del socio
     * @param edad edad del socio
     */
    public Socio(int id, String nombre, int edad) {
    	if(id>0)
        this.id = id;
    	if(nombre!=null&&nombre.length()>0)
        this.nombre = nombre;
    	if(edad>0)
        this.edad = edad;
    }
/**
 * Getter del id
 * @return  Devuelve el id
 */
    public int getId() {
        return id;
    }
/**
 * Getter del nombre
 * @return Devuelve el nombre
 */
    public String getNombre() {
        return nombre;
    }
/**
 * Getter de la edad
 * @return Devuelve la edad
 */
    public int getEdad() {
        return edad;
    }
/**
 * Convierte los datos del socio en una String
 * @return Devuelve los datos del socio
 */
    @Override
    public String toString() {
        return "Socio: " + "id " + id +", nombre " + nombre + ", edad " + edad;
    }
/**
 * Compara los socios
 * @return numero negativo si es más pequeño, positivo si es más grande e iguales si es 0
 */
    @Override
    public int compareTo(Socio socio) {
        return this.id - socio.id;
    }
}

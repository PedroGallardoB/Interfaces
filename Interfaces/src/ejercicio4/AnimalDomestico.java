package ejercicio4;
/**
Clase abstracta que representa un animal doméstico que implementa la interfaz Animal.
*/
abstract public class AnimalDomestico implements Animal{

/** El nombre del animal 
 */
protected String nombre="";

/** 
 * La raza del animal 
 * */
protected String raza="";

/** 
 * El peso del animal 
 */
protected double peso=0;

/**
 * El color del animal
 */
protected String color="";

/**
Método abstracto que hace que el animal haga ruido
*/
@Override
abstract public void hacerRuido();
/**

Método que hace que el animal coma
*/
@Override
public void comer() {
}
/**

Método que hace que el animal duerma
*/
@Override
public void dormir() {
}
/**

Método que vacuna al animal
*/
protected void vacunar() {
}

/**
Método abstracto que indica si el animal hace caso o no.
@return boolean
*/
abstract boolean hacerCaso();
}
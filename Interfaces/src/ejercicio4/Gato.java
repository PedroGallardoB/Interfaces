package ejercicio4;

/**
Clase que representa a un Gato
*/
public class Gato extends AnimalDomestico{

/**
Método que implementa el ruido
*/
@Override
public void hacerRuido() {
System.out.println("MIAU");
}
/**

Método que indica si el gato hace caso o no
@return true si el gato hace caso, false si no
*/
@Override
boolean hacerCaso() {
boolean haceCaso=false;
if(Math.random()*101<5) {
haceCaso=true;
}
return haceCaso;
}
/**
Método que hace toser al gato una bola de pelo
*/
public void toserBolaPelo() {
// TODO implementar método
}
}
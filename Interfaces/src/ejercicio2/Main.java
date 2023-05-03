package ejercicio2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
//Array de futbolistas
		Futbolista futbolistas[] = { new Futbolista(11, "Messi", 30, 15), new Futbolista(1, "Juan", 18, 4),
				new Futbolista(3, "Mercedes", 23, 7), new Futbolista(11, "Luis", 31, 7),
				new Futbolista(9, "Alberto", 43, 23) };
//Ordenamos los futbolistas
		Arrays.sort(futbolistas);
		//Recorremos el array imprimiendolo
		for (Futbolista futbolista : futbolistas){
		System.out.println(futbolista.toString());	
		}
			
	}

}

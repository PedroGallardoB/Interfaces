package ejercicio1;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		//Creamos los socios
		Socio s1 = new Socio(1, "Juan", 30);
		Socio s2 = new Socio(2, "María", 25);
		Socio s3 = new Socio(3, "Pedro", 35);
		//Comparamos s1 y s2
		if (s1.compareTo(s2) < 0) {
			System.out.println(s2 + " es mayor que " + s1);
		} else if (s1.compareTo(s2) > 0) {
			System.out.println(s1 + " es mayor que " + s2);
		} else {
			System.out.println("Son iguales");
		}
		//Comparamos s2 y s3
		if (s2.compareTo(s3) < 0) {
			System.out.println(s3 + " es mayor que " +  s2);
		} else if (s2.compareTo(s3) > 0) {
			System.out.println(s2 + " es mayor que " + s3);
		} else {
			System.out.println("Son iguales");
		}
//Los ordenamos después de meterlos en un array
		Socio[] socios = { s1, s2, s3 };
		Arrays.sort(socios);
//Imprime los datos de todos los socios
		for (Socio socio : socios) {
			System.out.println(socio);
		}
	}
}

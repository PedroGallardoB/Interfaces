package ejercicio3;

public class Main {
	public static void main(String[] args) {
	    // Crear array de instalaciones deportivas
	    InstalacionDeportiva[] instalaciones = new InstalacionDeportiva[2];
	    instalaciones[0] = new Polideportivo("Polideportivo Municipal", 1, 1000);
	    instalaciones[1] = new Polideportivo("Polideportivo Calle Margarita", 2, 500);
	    // Crear array de edificios
	    Edificio[] edificios = new Edificio[2];
	    edificios[0] = new EdificioDeOficinas(10, 200.0);
	    edificios[1] = new EdificioDeOficinas(5, 100.0);
	    
	    // Recorrer array de instalaciones deportivas
	    for (InstalacionDeportiva instalacion : instalaciones) {
	        System.out.println(instalacion.toString());
	        System.out.println("Tipo de instalación: " + instalacion.getTipoDeInstalacion());
	    }

	    // Recorrer array de edificios
	    for (Edificio edificio : edificios) {
	        System.out.println(edificio.toString());
	        System.out.println("Superficie edificio: " + edificio.getSuperficieEdificio() + " metros cuadrados");
	    }
	}
}

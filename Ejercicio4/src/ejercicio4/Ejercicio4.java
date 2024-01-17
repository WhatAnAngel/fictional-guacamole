
package ejercicio4;

public class Concesionario {


    public static void main(String[] args) {
int precioFinal;
	Vehiculo miCoche = new Vehiculo("4200STN", "Polo", "Volkswagen", 30000, false, true, false, "Diesel");


	Vehiculo miCoche1 = new Vehiculo("6699STN", "Opel", "Corsa", 40000, false, true, true, "Electrico");


	

	// mostramos los datos

	System.out.println(miCoche.mostrarVehiculo());
	System.out.println(miCoche1.mostrarVehiculo());
	System.out.println(miCoche.precioFinal());
	System.out.println(miCoche1.precioFinal());
	

	}
}

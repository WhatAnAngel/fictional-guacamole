package actividad10t3;


public class Actividad10T3 {


    public static void main(String[] args) {
        
        Consumo viaje = new Consumo(300, 15, 10, 100, 1.5);

        System.out.println("Tiempo empleado en el viaje: " + viaje.getTiempo() + " horas");
        System.out.println("Consumo medio (litros/100km): " + viaje.consumoMedio() + " litros");
        System.out.println("Consumo medio (euros/100km): " + viaje.consumoEuros() + " euros");
    }

}

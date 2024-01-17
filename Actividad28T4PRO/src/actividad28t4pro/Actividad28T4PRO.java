package actividad28t4pro;

public class Actividad28T4PRO {

    public static void main(String[] args) {
        Vehiculo[] misVehiculos = new Vehiculo[4];
        Remolque miRemolque = new Remolque(5000);
        
        misVehiculos[0] = new Coche(4, "67978990H");
        misVehiculos[1] = new Coche(5, "678547675HG");
        misVehiculos[2] = new Camion("678547675HG");
        misVehiculos[3] = new Camion("678547675HG");

        for (Vehiculo miVehiculo : misVehiculos) {
            if (miVehiculo instanceof Camion) {
                ((Camion) miVehiculo).ponRemolque(miRemolque);
            }
            System.out.println(miVehiculo);   
        }
        
        System.out.println("----------------------------------------------");
        
        for (Vehiculo miVehiculo : misVehiculos) {
            miVehiculo.acelerar(120);
            System.out.println(miVehiculo);
        }
        

    }
    
}

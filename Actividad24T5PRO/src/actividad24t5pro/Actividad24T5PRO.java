package actividad24t5pro;
import objetos.*;

public class Actividad24T5PRO {

    public static void main(String[] args) {
    
    Empleado miEmpleado = new Empleado("Mar", "Martínez", "420", 1500);
    Encargado miEncargado = new Encargado("ElPutoCristian", "River", "666", 500, 10);

        System.out.println(miEmpleado);
        System.out.print(miEncargado);
        System.out.println("Sueldo final: " + miEncargado.getSueldoBase());

    }

}

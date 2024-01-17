package act4t4pro;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Act4T4PRO {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Introduce el sueldo del primer empleado: ");
        double sueldoEmpleado1 = miScanner.nextDouble();

        System.out.println("Introduce el sueldo del segundo empleado: ");
        double sueldoEmpleado2 = miScanner.nextDouble();

        // Compara los sueldos
        double sueldoMayor = Math.max(sueldoEmpleado1, sueldoEmpleado2);

        // Formatea el sueldo mayor en formato euro
        DecimalFormat formatoEuro = new DecimalFormat("#,##0.00 \u20AC"); 

        System.out.println("El sueldo mayor es: " + formatoEuro.format(sueldoMayor));

    }
}

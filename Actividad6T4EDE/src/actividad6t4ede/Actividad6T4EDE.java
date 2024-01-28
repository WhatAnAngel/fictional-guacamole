package actividad6t4ede;

import java.util.Scanner;

/* Actividad 6. Refactorizar todo lo posible el siguiente código para hacerlo 
más legible y eficiente. Consiguiendo que sea más fácil de mantener y que 
funcione más rápido. */
public class Actividad6T4EDE {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int num1;
        int num2;
        int opcion;
        int resultado = 0;

        System.out.println(
            " * * * * * * * * * * Menú principal * * * * * * * * * * * "
            + "\n1. Sumar"
            + "\n2. Restar"
            + "\n3. Multiplicar"
            + "\n4. Dividir"
            + "\n5. Salir"
            + "\nSeleccione una opción: ");
        opcion = tec.nextInt();

        if (opcion != 5) {

            System.out.print("Introduce número 1: ");
            num1 = tec.nextInt();
            System.out.print("Introduce número 2: ");
            num2 = tec.nextInt();

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    resultado = num1 / num2;
                    break;
            }

            System.out.println("El resultado es " + resultado);
        }

    }
}

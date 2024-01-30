package act2t4ede;

import java.util.Scanner;

public class Act2T4EDE {

    public static void main(String[] args) {

        int num1, num2;
        int operacion;
        int resultado = 0;
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Introduce número 1: ");
        num1 = miScanner.nextInt();
        System.out.println("Introduce número 2: ");
        num2 = miScanner.nextInt();

        System.out.println("¿Qué desea realizar? (1 = Sumar, 2 = Restar)");
        operacion = miScanner.nextInt();

        switch (operacion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
        }

        System.out.println(resultado);
    }

}

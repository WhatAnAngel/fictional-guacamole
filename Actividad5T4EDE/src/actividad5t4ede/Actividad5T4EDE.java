package actividad5t4ede;

import java.util.Scanner;

public class Actividad5T4EDE {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        String nombre;
        int edad;
        double altura;

        System.out.println("Introduce tu nombre:");
        nombre = tec.nextLine();
        System.out.println("Introduce tu edad:");
        edad = tec.nextInt();
        System.out.println("Introduce tu altura:");
        altura = tec.nextDouble();

        System.out.println("Tu nombre es " + nombre
                + "\nTu edad es " + edad
                + "\nTu altura es " + altura);
    }

}

package actividad7t6pro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Actividad7T6PRO {

    public static void main(String[] args) {

        String[] descripciones;
        descripciones = new String[10];

        for (String descripcion : descripciones) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce descripción del producto: ");
            descripcion = scanner.nextLine() + "\n";

            Fichero miFichero = new Fichero();
            miFichero.anadeLinea("productos.txt", descripcion);
        }

    }

    private static class Fichero {

        public void anadeLinea(String nombreFichero, String datos) {
            try {
                FileWriter fichero = new FileWriter(nombreFichero, true);
                BufferedWriter miBuffer = new BufferedWriter(fichero);
                miBuffer.write(datos);
                miBuffer.flush();
                miBuffer.close();
                fichero.close();
            } catch (IOException e) {
                System.out.println("Error de fichero");
            }
        }
    }

}

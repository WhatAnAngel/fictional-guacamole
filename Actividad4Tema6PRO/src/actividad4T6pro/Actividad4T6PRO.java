package actividad4T6pro;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Actividad4T6PRO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario el nombre del fichero alumno
        System.out.print("Introduce el nombre del fichero alumno (sin extensión): ");
        String nombreFichero = sc.nextLine();

        // Pedir al usuario la información de registro del alumno
        System.out.print("Introduce la información de registro del alumno: ");
        String informacionRegistro = sc.nextLine();
        informacionRegistro += "/n";

        // Concatenar la extensión ".txt" al nombre del fichero
        nombreFichero += ".txt";

        Fichero miFichero = new Fichero();
        miFichero.lee(nombreFichero);
        miFichero.lee(nombreFichero);
        miFichero.escribe(nombreFichero, informacionRegistro);
        miFichero.anade(nombreFichero, informacionRegistro);
    }
}

class Fichero {

    public void lee(String nombreFichero) {
        try {
            FileReader fichero = new FileReader(nombreFichero);
            int caracter = fichero.read();
            while (caracter != -1) {
                char letra = (char) caracter;
                System.out.print(letra);
                caracter = fichero.read();
            }
            fichero.close();
        } catch (IOException e) {
            System.out.println("Error de fichero.");
        }
    }

    public void escribe(String nombreFichero, String cadena) {
        try {
            FileWriter fichero = new FileWriter(nombreFichero);
            fichero.write(cadena);
            fichero.close();
        } catch (IOException e) {
            System.out.println("Error de Fichero");
        }
    }

    public void anade(String nombreFichero, String cadena) {
        try {
            FileWriter fichero = new FileWriter(nombreFichero, true);
            fichero.write(cadena);
            fichero.close();
        } catch (IOException e) {
            System.out.println("Error de Fichero");
        }
    }
}

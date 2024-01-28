package actividad5t6pro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Actividad5T6PRO {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del alumno: ");
        String nombreAlumno = scanner.nextLine() + "\n";
        
        Fichero miFichero = new Fichero();
        miFichero.anadeLinea("alumnos.txt", nombreAlumno);
    }
}

class Fichero {
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

package actividad6t6pro;

import java.io.*;

public class Actividad6T6PRO {

    public static void main(String[] args) {

        Fichero miFichero = new Fichero();
        miFichero.leeLinea("alumnos.txt");;

    }
}

class Fichero {

    public void leeLinea(String nombreFichero) {
        try {
            FileReader fichero = new FileReader(nombreFichero);
            BufferedReader miBuffer = new BufferedReader(fichero);
            String linea = miBuffer.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = miBuffer.readLine();
            }
            miBuffer.close();
            fichero.close();
        } catch (IOException e) {
            System.out.println("Error de Fichero");
        }
    }

}

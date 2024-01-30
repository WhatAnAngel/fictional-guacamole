package actividad8t6pro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Actividad8T6PRO {

    public static void main(String[] args) {

        Fichero miFichero = new Fichero();
        miFichero.leeLinea("productos.txt");;

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

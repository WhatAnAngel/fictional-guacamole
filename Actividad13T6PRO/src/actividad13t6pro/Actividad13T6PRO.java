package actividad13t6pro;

import java.io.*;
import java.util.Scanner;

public class Actividad13T6PRO {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Indique el nombre del archivo a copiar: ");
        File ficheroOrigen = new File(sn.nextLine());
        System.out.print("Indique el nuevo nombre del archivo: ");
        File ficheroDestino = new File(sn.nextLine());

        Fichero miFichero = new Fichero();
        miFichero.copiar(ficheroOrigen, ficheroDestino);

    }

}

class Fichero {

    public void copiar(File ficheroOrigen, File ficheroDestino) {
        if (ficheroOrigen.exists()) {
            try {
                FileInputStream origen = new FileInputStream(ficheroOrigen);
                FileOutputStream destino = new FileOutputStream(ficheroDestino);
                byte[] buffer = new byte[1024];
                int longitud;
                while ((longitud = origen.read(buffer)) > 0) {
                    destino.write(buffer, 0, longitud);
                }
                origen.close();
                destino.close();
                System.out.println("El fichero ha sido copiado con éxito");
            } catch (IOException e) {
                System.out.println("La tarea ha fallado con éxito");
            }
        }else {
            System.out.println("El fichero o directorio no existe");
        }
    }

}

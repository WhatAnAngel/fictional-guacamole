package actividad12t6pro;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Actividad12T6PRO {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce nombre del archivo o carpeta: ");
        File fichero = new File(sc.nextLine());
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        DecimalFormat format = new DecimalFormat("#,###");

        if (fichero.exists()) {
            String tipo = fichero.isFile() ? "Es un archivo" : "Es un directorio";
            Date lastModfDate = new Date(fichero.lastModified());
            String lastModf = "Última modificación: " + f.format(lastModfDate);
            String fileSize = "Tamaño del archivo: " + format.format(fichero.length()) + " bytes.";
            System.out.println("");
        }
    }

}

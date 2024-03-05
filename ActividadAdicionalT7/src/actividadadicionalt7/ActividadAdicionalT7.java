package actividadadicionalt7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class ActividadAdicionalT7 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //Nombre literal del fichero a leer
        String file = "temperaturas.csv";
        
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String[] datosFichero = new String[file.length()*3];
        String[] temperaturas = new String[file.length()];
        String[] provincia = new String[file.length()];
        String[] fecha = new String[file.length()];
        String textoFichero;
        int i = 0;
        int j = 0;

        
        while ((textoFichero=br.readLine()) != null){
            datosFichero[i] = textoFichero;
            i++;
        }
        
        String[] aaaa = datosFichero[0].split(",");
        
        System.out.println(Arrays.toString(aaaa));
        fr.close();
    }

}

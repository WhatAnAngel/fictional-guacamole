package simulacroproact2;

import java.io.*;

public class SimulacroPROAct2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        try {
            FileReader fr = new FileReader("helloworld.txt");
            while ((int caracter = fr.read()) != -1) {
                int caracterActual = caracter;
                String octal = Integer.toOctalString(caracterActual);
                System.out.println("Número leído: " + caracterActual);
                System.out.println("El número en octal es: " + octal);
                System.out.println("-----------------------------------------");
            }
            fr.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

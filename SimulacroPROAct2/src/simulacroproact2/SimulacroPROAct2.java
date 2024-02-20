package simulacroproact2;

import java.io.*;

public class SimulacroPROAct2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileReader fichero = new FileReader("helloworld.txt");
        BufferedReader br = new BufferedReader(fichero);
        try {
            String line;
            while ((line = br.readLine()) != null) {
                int numActual = Integer.parseInt(line);
                String octal = Integer.toOctalString(numActual);
                System.out.println("Número leído: " + numActual);
                System.out.println("Número en octal: " + octal);
                System.out.println("-----------------------------------------");
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        fichero.close();
    }

}

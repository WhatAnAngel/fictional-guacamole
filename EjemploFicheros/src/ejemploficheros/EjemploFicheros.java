package ejemploficheros;

import java.io.*;


public class EjemploFicheros {

    public static void main(String[] args) throws IOException {
        
        writeFile("datos.txt", "Hello, world!");
        addFile("datos.txt", "Bye, World!");
        readFile("datos.txt");
    }

    public static void readFile(String fileName) throws FileNotFoundException, IOException{
        //Creamos el flujo de comunicación sobre el fichero
        FileReader fr = new FileReader(fileName);
        
        //Utilizamo un bucle para leer caracter a caracter con .read()
        int codigoASCII;
        while((codigoASCII=fr.read())!=-1){
            System.out.print((char)codigoASCII);
        }
        //Cerramos el flujo
        fr.close();
    }
    
    public static void writeFile(String fileName, String textToWrite) throws IOException{
        //Creamos el flujo de escritura sobre el fichero
        FileWriter fw = new FileWriter(fileName);
        fw.write(textToWrite);
        fw.close();
    }
    
        public static void addFile(String fileName, String textToWrite) throws IOException{
        //Creamos el flujo de escritura sobre el fichero
        FileWriter fw = new FileWriter(fileName, true);
        fw.write(textToWrite);
        fw.close();   
    }
        
}


package ejemplofile;

import java.io.File;
import java.io.IOException;


public class EjemploFile {

    
    public static void main(String[] args) throws IOException {
        //Creamos instancia de tipo File
        File miFichero = new File("datos/archivo.txt");
        File tuFichero = new File("datos/archivoC.txt");
        File miCarpeta = new File("curso");
        File origen = new File(".");
        
        System.out.println("Ruta absoluta: " + miFichero.getAbsolutePath());
        System.out.println("Ruta relativa: " + miFichero.getPath());
        System.out.println("Nombre fichero: " + miFichero.getName());
        System.out.println("Directorio padre: " + miFichero.getParent());
        System.out.println("Tamaño: " + miFichero.length() + " bytes");
        
        if(miFichero.canExecute()){
            System.out.println("Permiso ejecución");
        }
        if(miFichero.canRead()){
            System.out.println("Permiso lectura");
        }
        if(miFichero.canWrite()){
            System.out.println("Permiso escritura");
        }
        if(miFichero.exists()){System.out.println("Existe! :)");
            if(miFichero.isFile()){
            System.out.println("Es un fichero");
            }else{System.out.println("Es un directorio");}  
        }else{System.out.println("No existe :(");}
        
        if(miFichero.renameTo(tuFichero)){
           System.out.println("Fichero renombrado"); 
        }
        if(tuFichero.delete()){
            System.out.println("Fichero borrado");
        } else {
            System.out.println("Fichero NO borrado");
        }
        
        miFichero.createNewFile();
        
        if(miCarpeta.mkdir()){
            System.out.println("Carpeta creada");
        } else {
            System.out.println("Carpeta no creada");
        }
        
        String[] listado = origen.list();
        for(String elemento:listado){
            System.out.println(elemento);
        }
    }
    
}

package copiarimagen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopiarImagen {


    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        //Creamos variables con los nombres del fichero
        String nombreOrigen="mono.jpg";
        String nombreDestino="copiamono.jpg";
        
        //Creamos flujo de lectura sobre el fichero de origen
        FileInputStream fi = 
                new FileInputStream(nombreOrigen);
        //Creamos flujo de escritura sobre el fichero de destino
        FileOutputStream fo = 
                new FileOutputStream(nombreDestino);
        int miByte;
        while((miByte=fi.read())!=-1){
            fo.write(miByte);
        }
        
        //Volcamos memoria al fichero
        fo.flush();
        //Cerramos flujos de lectura y escritura
        fo.close();
        fi.close();
        
    }
    
}

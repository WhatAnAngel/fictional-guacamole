package actividad19t6pro;

import java.io.File;


public class Actividad19T6PRO {

    
    public static void main(String[] args) {
        File origen = new File(".");
        
        String[] listado = origen.list();
        for (String archivo : listado) {
            System.out.println(archivo);
        }

    }

}

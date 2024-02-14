package actividad17t6pro;

import java.io.File;
import java.util.Scanner;


public class Actividad17T6PRO {

    
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Indique el nombre para el nuevo directorio: ");
        File miFichero = new File(sn.nextLine());
        
        if(miFichero.exists()){
            System.out.println("Ya existe una carpeta con el mismo nombre");
        }else{
            miFichero.mkdir();
            System.out.println("La carpeta ha sido creada con éxito");
        }

    }

}

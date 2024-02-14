package actividad14t6pro;

import java.io.File;
import java.util.Scanner;


public class Actividad14T6PRO {

    
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        System.out.print("Indique el nombre del archivo a copiar: ");
        File miFichero = new File(sn.nextLine());

        System.out.print("Indique el nuevo nombre del archivo: ");
        File tuFichero = new File(sn.nextLine());
        
        if(miFichero.exists()){
            miFichero.renameTo(tuFichero);
            System.out.println("El archivo ha sido renombrado con éxito");
        }else{
            System.out.println("El archivo indicado no existe");
        }
        
    }

}
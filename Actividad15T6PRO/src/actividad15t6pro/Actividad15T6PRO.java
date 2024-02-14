package actividad15t6pro;

import java.io.File;
import java.util.Scanner;


public class Actividad15T6PRO {

    
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Indique el nombre del archivo a eliminar: ");
        File miFichero = new File(sn.nextLine());
        
        if(miFichero.exists()){
            miFichero.delete();
            System.out.println("El archivo ha sido eliminado con éxito");
        }else{
            System.out.println("El archivo indicado no existe");
        }

    }

}

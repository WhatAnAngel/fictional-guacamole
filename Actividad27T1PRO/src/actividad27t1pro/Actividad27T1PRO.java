package actividad27t1pro;
import java.util.*;

//Ejercicio 27. Pedir dos fechas y mostrar el número de días que hay de 
//diferencia. Suponiendo todos los meses de 30 días.

public class Actividad27T1PRO {

    public static void main(String[] args) {
        
        ArrayList<Integer> fecha = new ArrayList<Integer>();
        int diasDiferencia = 0;
        
        for (int i=0; i<2; i++){
            Scanner input = new Scanner(System.in);
            
            System.out.println("Introduce día: ");
            int dia = input.nextInt();
            
            System.out.println("Introduce mes: ");
            int mes = input.nextInt() * 30;
            
            fecha.add(new Integer(dia + mes));     
        }
        
        System.out.println("Días de diferencia: " + diasDiferencia);
        

    }

}

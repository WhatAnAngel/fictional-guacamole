package actividad17t2pro;
import java.util.*;

//Ejercicio 17. Pedir un número y calcular su factorial.

public class Actividad17T2PRO {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num;
        int factorial = 1;
        int i;
        
        System.out.println("Introduce un número: ");  
        
        num = input.nextInt();
        
        for (i=1; i<=num; i++){
            factorial *=i;
        }
        
        System.out.println("factorial de " + num + ": " + factorial);
        
        
        

    }

}

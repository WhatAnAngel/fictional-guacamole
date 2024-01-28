package actividad19t2pro;
import java.util.*;
//Ejercicio 19. Pedir 10 sueldos. Mostrar su suma y cuantos 
//hay mayores de 1000€.
public class Actividad19T2PRO {    
    
    public static void main(String[] args) {
        
        int mayores1000 = 0;
        int sumaSueldo = 0;

        for (int i=0; i<10; i++){
            Scanner input = new Scanner(System.in);
            System.out.println("Introduce sueldo: ");
            int sueldo = input.nextInt();
            
                if (sueldo > 1000){
                    mayores1000++;
                }
            sumaSueldo+= sueldo;
        }
        
        System.out.println("La suma de los sueldos es: " + sumaSueldo);
        System.out.println("Sueldos mayores de 1000€: " + mayores1000);
    }

}

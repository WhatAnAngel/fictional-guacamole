package ejemploprograma;

import java.util.Scanner;

public class EjemploPrograma {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce numero: ");
        int num = teclado.nextInt();
        // esto se hace siempre después de pedir un valor por teclado 
        teclado.nextLine();
        // que no sea String:
        
        System.out.println("Introduce operación: ");
        String operacion = teclado.nextLine();
        int cuadrado = num* num;
        
        System.out.println("Cuadrado: " + cuadrado);
        System.out.println("La operación seleccionada es " + operacion);
    }
    
}

package actividad4t5pro;

import java.util.Scanner;


public class Actividad4T5PRO {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introducir numero 1: ");
        int num1 = Integer.parseInt(scanner.next());
        
        System.out.print("Introducir numero 2: ");
        int num2 = Integer.parseInt(scanner.next());
        
        System.out.print("¿Qué operación quieres realizar? ");
        String operacion = scanner.next();
        
        switch (operacion.toLowerCase()) {
            case "suma":
                mostrarResultados(num1 + num2);
                break;
            case "resta":
                mostrarResultados(num1 - num2);
                break;
            case "multiplicacion":
                mostrarResultados(num1 * num2);
                break;
            default:
                System.out.println("Operación no válida. Inténtelo de nuevo.");
        } 
    }
    
    private static void mostrarResultados(int resultado) {
        System.out.println("Resultado en Binario: " + Integer.toBinaryString(resultado));
        System.out.println("Resultado en Hexadecimal: " + Integer.toHexString(resultado));
        System.out.println("Resultado en Octal: " + Integer.toOctalString(resultado));
    }

}

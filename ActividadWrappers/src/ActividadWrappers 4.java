import java.util.Scanner;

public class ActividadWrappers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Pedir la base numérica
        System.out.print("Introducir base: ");
        int base = scanner.nextInt();

        // Pedir los números en la base especificada
        System.out.print("Introducir numero 1: ");
        String numero1Str = scanner.next();
        System.out.print("Introducir numero 2: ");
        String numero2Str = scanner.next();

        // Convertir los números a decimal
        int numero1 = Integer.parseInt(numero1Str, base);
        int numero2 = Integer.parseInt(numero2Str, base);

        // Calcular la suma
        int sumaDecimal = numero1 + numero2;

        // Mostrar la suma en diferentes bases
        System.out.println("Suma Decimal: " + sumaDecimal);
        System.out.println("Suma Octal: " + Integer.toOctalString(sumaDecimal));
        System.out.println("Suma Hexadecimal: " + Integer.toHexString(sumaDecimal).toUpperCase());
        System.out.println("Suma Binario: " + Integer.toBinaryString(sumaDecimal));
    }
}
package practicatema3pro;

import java.util.Scanner;


public class PracticaTema3PRO {

    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);

        Persona[ ] personas = new Persona[3];  //  array de 3 personas

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Ingrese los datos de la persona " + (i + 1)); // +1 porque empieza en 0
            
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = Integer.parseInt(scanner.nextLine());
            
            System.out.print("DNI (sin letra): ");
            String dni = scanner.nextLine();

            System.out.print("Sexo (M/F): ");
            char sexo = scanner.nextLine().charAt(0);

            System.out.print("Peso (en kg): ");
            double peso = Double.parseDouble(scanner.nextLine());

            System.out.print("Altura (en m): ");
            double altura = Double.parseDouble(scanner.nextLine());

            // Crear una instancia de Persona y almacenarla en el arreglo
            
           personas[i] = new Persona(nombre, edad, dni, sexo, peso, altura);
            
           System.out.println("Estado nutricional: " + personas[i].calcularIMC());
           System.out.println("Es mayor de edad: " + personas[i].esMayorDeEdad());
           System.out.println(personas[i]. mostrarDatos());
        }
 
    }

}

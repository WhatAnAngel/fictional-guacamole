package veterinario;
import objetos.*;

public class Veterinario {

    public static void main(String[] args) {
        
        // Creamos instancia de animal

        Animal animalCompania = new Animal("Paul", "Pulpo", "267837");
        
        // Creamos instancia de persona
        
        Persona miPersona = new Persona("Angel", "50505050M", 24, animalCompania);
        Persona miPrimo = new Persona("Legna", "05050505W", 42, animalCompania);
        
        System.out.println("Datos: " +  miPersona.mostrarDatos());
        System.out.println("Datos: " +  miPrimo.mostrarDatos());
        
        System.out.println(Persona.mostrarPersonas());
        System.out.println(Animal.mostrarAnimales());
        
    }

}

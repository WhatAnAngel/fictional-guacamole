package objetos;

public class Persona {

//    atributos
    
    private String nombre;
    private String dni;
    private int edad;
    private Animal animalCompania;
    private static int numPersonas = 0;
    
//    constructor 
    
    public Persona(String nombre, String dni, int edad, Animal animalCompania){
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.animalCompania = animalCompania;
        numPersonas++;
    }
    
//    setters
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setDni(String dni){
        this.dni = dni;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void animalCompania(Animal animalCompania){
        this.animalCompania = animalCompania;
    }
    
//    getters
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getDni(){
        return this.dni;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public Animal animalCompania(){
        return this.animalCompania;
    }
    
//    mostrar datos
    
    public String mostrarDatos(){
        String resultado = this.nombre + " - " + this.dni + " - " + this.edad + " - " + this.animalCompania.mostrarDatos();
        return resultado;
    }
            
    public static String mostrarPersonas(){
        String personas = "Número de personas: " + numPersonas;
        return personas;
    }
}

package objetos;

public class Animal {

//    atributos
    
    private String nombre;
    private String tipo;
    private String codChip;
    private static int numAnimales = 0;
    
//    constructor
    
    public Animal (String nombre, String tipo, String codChip){
        this.nombre = nombre;
        this.tipo = tipo;
        this.codChip = codChip;
        numAnimales++;
    }
    
//    setters
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public void setCodChip(String codChip){
        this.codChip = codChip;
    }
    
//    getters
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public String getCodChip(){
        return this.codChip;
    }
    
//    mostrar datos
    
    public String mostrarDatos(){
        String resultado = this.nombre + " - " + this.tipo + " - " + this.codChip;
        return resultado;
    }
    
//    método estático mostrarAnimales
    
    public static String mostrarAnimales(){
        String animales = "Número de animales: " + numAnimales;
        return animales;
    }
    
}

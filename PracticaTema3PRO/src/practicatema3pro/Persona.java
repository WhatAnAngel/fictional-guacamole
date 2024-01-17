package practicatema3pro;

public class Persona {
    
    //atributos
    
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;
    
    //constructor
    
public Persona (String nombre, int edad, String dni, char sexo, double peso, double altura){
    
    this.nombre = nombre;
    this.edad = edad;
    this.dni = dni + this.generaLetraDNI(dni);
    this.sexo = this.comprobarSexo(sexo);
    this.peso = peso;
    this.altura = altura;
    
}

//setters y getters

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
//métodos
    
    public double calcularIMC(){
        
        double imc = (peso/(altura*altura));
        int calculoImc;
        
        if (imc < 20){
            calculoImc = -1;
        } else if (imc>=20 && imc<=25){
            calculoImc = 0;
        } else {
            calculoImc = 1;
        }
        
        return calculoImc;
    }
    
    public boolean esMayorDeEdad(){
        
        boolean mayorEdad = (edad>=18);
        
        return mayorEdad;
        
    }
    
   public char comprobarSexo(char sexo){
        
       this.sexo = sexo;
       
       if (sexo != 'M' ){
           sexo = 'H';
       }
       
       return sexo;
    }
    
    public char generaLetraDNI(String dni){
        
      int numDni = Integer.parseInt(dni);
      char[ ] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};   
      
      return letras[numDni % 23];
        
    }
    
    public String mostrarDatos(){
        String resultado = (this.nombre + " - " +  this.edad + " - " + this.dni + " - " + this.sexo + " - " + this.peso +
                " - " + this.altura);
        
        return resultado;
    }
    
}

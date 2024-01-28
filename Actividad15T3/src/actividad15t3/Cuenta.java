package actividad15t3;
/*
Crear una clase principal main ejecutable:
PROGRAMACIÓN - CICLO FORMATIVO DAW - TEMA 3. PROGRAMACIÓN ORIENTADA A OBJETOS. OBJETOS. 5
 Crear una instancia del objeto Cuenta llamada cuentaParticular1 con el nombre del 
titular.
 Crear una instancia del objeto Cuenta llamada cuentaEmpresa1 con el nombre del 
titular y una cantidad inicial de dinero.
 Mostrar el titular de la instancia cuentaParticular1.
 Mostrar el saldo de la instancia cuentaEmpresa1.
 Ingresar 1000 € en la instancia cuentaParticular1.
 Retirar 500 € en la instancia cuentaEmpresa1.
 Mostrar los datos de las dos instancias del objeto Cuenta. */
public class Cuenta {
    private String titular;
    private double cantidad;
    
    //Constructores
    
    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }
    public Cuenta(String titular){
        this.titular = titular;
    }
    
    
    //Setters y getters
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    public String getTitular(){
        return this.titular;
    }
    
    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }
    
    public double getCantidad(){
        return this.cantidad;
    }
    
    public void ingresar(double ingreso){
        
        if (ingreso >0){
            this.cantidad += ingreso;
        }
    }
    public void retirar(double ingreso){
        
        if (ingreso >0){
            this.cantidad -= ingreso;
        }
    }
    
    
    //Mostrar datos
    
    public String mostrarDatos(){
        String resultado = this.titular + " - " + this.cantidad;
        return resultado;
    }
    
}

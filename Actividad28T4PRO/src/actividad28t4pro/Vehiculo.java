package actividad28t4pro;

public class Vehiculo {
    
    //Atributos
    private double velocidad;
    private String matricula;

    //Constructor
    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
    }
    
    //Setters y Getters
    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    //Metodo
    public void acelerar(double km){
        this.velocidad+=km;
    }

    //ToString
    @Override
    public String toString() {
        return "Vehiculo{" + "velocidad=" + velocidad + ", matricula=" + matricula + '}';
    }
    
    
    
}

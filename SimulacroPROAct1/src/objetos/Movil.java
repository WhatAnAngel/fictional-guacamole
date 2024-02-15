package objetos;

import java.time.LocalDate;

public class Movil extends Telefono{
    
    //Atributos
    private String operador;
    
    //Constructor
    public Movil(String operador, String marca, String modelo, LocalDate fechaFabricacion, Double importe) {
        super(marca, modelo, fechaFabricacion, importe);
        this.operador = operador;
    }
    
    //Setters y getters
    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
    
    //toString()
    @Override
    public String toString() {
        return super.toString() + " - Movil{" + "operador=" + operador + '}';
    } 
}

package objetos;

import java.time.LocalDate;

public class Telefono {
    
    //Atributos
    private String marca, modelo;
    private LocalDate fechaFabricacion;
    private Double importe;
    
    //Constructor
    public Telefono(String marca, String modelo, LocalDate fechaFabricacion, Double importe) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaFabricacion = fechaFabricacion;
        this.importe = importe;
    }
    
    //Setters y getters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }
    
    //toString()
    @Override
    public String toString() {
        return "Telefono{" + "marca=" + marca + ", modelo=" + modelo + ", fechaFabricacion=" + fechaFabricacion + ", importe=" + importe + '}';
    }
}

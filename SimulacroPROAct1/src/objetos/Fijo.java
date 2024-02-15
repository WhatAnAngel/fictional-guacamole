package objetos;

import java.time.LocalDate;

public class Fijo extends Telefono{
    
    //Atributos
    private Double longitudCable;

    public Fijo(Double longitudCable, String marca, String modelo, LocalDate fechaFabricacion, Double importe) {
        super(marca, modelo, fechaFabricacion, importe);
        this.longitudCable = longitudCable;
    }
    
    //Setters y getters
    public Double getLongitudCable() {
        return longitudCable;
    }

    public void setLongitudCable(Double longitudCable) {
        this.longitudCable = longitudCable;
    }
    
    //Métodos
    public Double importeLongitud(boolean inalambrico) {
        Double precio = super.getImporte();
        precio += inalambrico ? precio*0.15 : 0;
        return precio;
    }
    public Double importeLongitud(Double importe) {
        Double precio = super.getImporte();
        return precio += longitudCable * importe;
    }
    public Double importeLongitud(int porcentaje) {
        Double precio = super.getImporte();
        return precio += (precio * (porcentaje/100));
    }
    
    //toString()
    @Override
    public String toString() {
        return super.toString() + " - Fijo{" + "longitudCable=" + longitudCable + '}';
    }
}

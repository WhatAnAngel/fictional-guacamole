package concesionario;

public class Moto extends Vehiculo{

    //Atributos
    private boolean carenado;
    private int tiempos;
    private String transmision;

    //Constructor
    public Moto(boolean carenado, int tiempos, String transmision, String matricula, String marca, String modelo, String color, double cilindrada, double potencia, double velocidadMax, double precio) {
        super(matricula, marca, modelo, color, cilindrada, potencia, velocidadMax, precio);
        this.carenado = carenado;
        this.tiempos = tiempos;
        this.transmision = transmision;
    }

    //Getters y Setters
    public boolean isCarenado() {
        return carenado;
    }

    public void setCarenado(boolean carenado) {
        this.carenado = carenado;
    }

    public int getTiempos() {
        return tiempos;
    }

    public void setTiempos(int tiempos) {
        this.tiempos = tiempos;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    //Mostrar datos
    @Override
    public String toString() {
        return super.toString()+ " - Moto{" + "carenado=" + carenado + ", tiempos=" + tiempos + ", transmision=" + transmision + '}';
    }
    
    //Método importeExtra
    public double importeExtra(){
        double extras = 0;
        boolean cuatroTiempos = (tiempos == 4);
        
        if (cuatroTiempos){
            extras += 1500;
        }
        switch (transmision){
            case "cadena": extras+=500;break;
            case "correa": extras+=1000;break;
            case "cardan": extras+=1500; break;
        }
        
        return extras;
    }
    
}

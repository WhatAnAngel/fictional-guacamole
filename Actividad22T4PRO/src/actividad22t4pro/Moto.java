package actividad22t4pro;

public class Moto extends Vehiculo {

    private boolean carenado;
    private int tiempos;
    private String transmision;

    public Moto(boolean carenado, int tiempos, String transmision, String matricula, String marca, String modelo, String color, double cilindrada, double potencia, double velocidadMax, double precio) {
        super(matricula, marca, modelo, color, cilindrada, potencia, velocidadMax, precio);
        this.carenado = carenado;
        this.tiempos = tiempos;
        this.transmision = transmision;
    }
    
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

    @Override
    public String toString() {
        return super.toString() + " -Moto{" + "carenado=" + carenado + ", tiempos=" + tiempos + ", transmision=" + transmision + '}';
    }
 
}

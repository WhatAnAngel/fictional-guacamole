package actividad20t4pro;

public class Viaje {

    private int codigo;
    private String destino;
    private double kilometros;

    public Viaje(int codigo, String destino, double kilometros) {
        this.codigo = codigo;
        this.destino = destino;
        this.kilometros = kilometros;
    }
    
    //constructor copia
    
    public Viaje(Viaje viaje) {
        this.codigo = viaje.codigo ;
        this.destino = viaje.destino;
        this.kilometros = viaje.kilometros;
    }
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    @Override
    public String toString() {
        return "Viaje{" + "codigo=" + codigo + ", destino=" + destino + ", kilometros=" + kilometros + '}';
    }
    
    
    
    
}

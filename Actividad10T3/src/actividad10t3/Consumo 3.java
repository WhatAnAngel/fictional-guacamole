package actividad10t3;


public class Consumo {
    
    private double kilometros;
    private double litros;
    private double litrosConsumidos;
    private double vmed;
    private double pgas;
    
    //Constructor
    
    public Consumo(double kilometros, double litros, double litrosConsumidos, double vmed, double pgas) {
        this.kilometros = kilometros;
        this.litros = litros;
        this.litrosConsumidos = litrosConsumidos;
        this.vmed = vmed;
        this.pgas = pgas;
    }
    
    //Getters y setters

    public double getKilometros() {
        return kilometros;
    }
    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public double getLitros() {
        return litros;
    }
    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getLitrosConsumidos() {
        return litrosConsumidos;
    }
    public void setLitrosConsumidos(double litrosConsumidos) {
        this.litrosConsumidos = litrosConsumidos;
    }

    public double getVmed() {
        return vmed;
    }
    public void setVmed(double vmed) {
        this.vmed = vmed;
    }

    public double getPgas() {
        return pgas;
    }
    public void setPgas(double pgas) {
        this.pgas = pgas;
    }

    //Tiempo empleado en realizar el viaje
    public double getTiempo() {
        return this.getKilometros() / this.getVmed();
    }

    // Consumo medio del vehículo en litros cada 100 kilómetros
    public double consumoMedio() {
        return (this.getLitrosConsumidos() / this.getKilometros()) * 100.0;
    }

    // Consumo medio del vehículo en euros cada 100 kilómetros
    public double consumoEuros() {
        return (this.getLitrosConsumidos() * this.getPgas() / this.getKilometros()) * 100;
    }
    
    public String mostrarDatos(){
        String resultado = this.kilometros + " - " + this.litros + " - " + 
                this.litrosConsumidos + " - " + this.pgas + " - " + this.vmed;
        return resultado;
    }
    
}

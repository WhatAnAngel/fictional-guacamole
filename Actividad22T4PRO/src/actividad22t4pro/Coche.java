package actividad22t4pro;

public class Coche extends Vehiculo {
    
    private boolean elevalunasElectrico,airbag,cierreCentralizado;
    private String motor;

    public Coche(boolean elevalunasElectrico, boolean airbag, boolean cierreCentralizado, String motor, String matricula, String marca, String modelo, String color, double cilindrada, double potencia, double velocidadMax, double precio) {
        super(matricula, marca, modelo, color, cilindrada, potencia, velocidadMax, precio);
        this.elevalunasElectrico = elevalunasElectrico;
        this.airbag = airbag;
        this.cierreCentralizado = cierreCentralizado;
        this.motor = motor;
    }

    public boolean isElevalunasElectrico() {
        return elevalunasElectrico;
    }

    public void setElevalunasElectrico(boolean elevalunasElectrico) {
        this.elevalunasElectrico = elevalunasElectrico;
    }

    public boolean isAirbag() {
        return airbag;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    public boolean isCierreCentralizado() {
        return cierreCentralizado;
    }

    public void setCierreCentralizado(boolean cierreCentralizado) {
        this.cierreCentralizado = cierreCentralizado;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return super.toString() + " - Coche{" + "elevalunasElectrico=" + elevalunasElectrico + ", airbag=" + airbag + ", cierreCentralizado=" + cierreCentralizado + ", motor=" + motor + '}';
    }
    
    
    
}

public class Coche extends Vehiculo {

    private boolean elevElectrico;

    private boolean cierreCentralizado;

    private boolean airbag;

    private String motor;

    public Coche(boolean elevElectrico, boolean cierreCentralizado, boolean airbag, String motor, String matricula, String marca, String modelo, int cilindrada, int potencia, int velocidadMax, String color, double precio) {
        super(matricula, marca, modelo, cilindrada, potencia, velocidadMax, color, precio);
        this.elevElectrico = elevElectrico;
        this.cierreCentralizado = cierreCentralizado;
        this.airbag = airbag;
        this.motor = motor;
    }


    

    public double calculaIva() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double importeExtra() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

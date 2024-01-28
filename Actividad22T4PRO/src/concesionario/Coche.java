package concesionario;

public class Coche extends Vehiculo {

    //Atributos
    private boolean elevalunasE, airbag, cierreC;
    private String motor;

    //Constructor
    public Coche(boolean elevalunasE, boolean airbag, boolean cierreC, String motor, String matricula, String marca, String modelo, String color, double cilindrada, double potencia, double velocidadMax, double precio) {
        super(matricula, marca, modelo, color, cilindrada, potencia, velocidadMax, precio);
        this.elevalunasE = elevalunasE;
        this.airbag = airbag;
        this.cierreC = cierreC;
        this.motor = motor;
    }

    //Getters y Setters
    public boolean isElevalunasE() {
        return elevalunasE;
    }

    public void setElevalunasE(boolean elevalunasE) {
        this.elevalunasE = elevalunasE;
    }

    public boolean isAirbag() {
        return airbag;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    public boolean isCierreC() {
        return cierreC;
    }

    public void setCierreC(boolean cierreC) {
        this.cierreC = cierreC;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    //Mostrar datos
    @Override
    public String toString() {
        return super.toString() + " - Coche{" + "elevalunasE=" + elevalunasE + ", airbag=" + airbag + ", cierreC=" + cierreC + ", motor=" + motor + '}';
    }

    //Método importeExtra
    public double importeExtra(){
        double extras = 0;
        boolean diesel = motor.equals("diesel");
        
        if(diesel){
            extras +=2000;
        }
        if(cierreC){
            extras +=500;
        }
        if(elevalunasE){
            extras +=750;
        }
        
        return extras;
    }
}

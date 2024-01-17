package concesionario;

public class Autobus extends Vehiculo{

    //Atributos
    private int numPlazas;
    private boolean tacometro;

    //Constructor
    public Autobus(int numPlazas, boolean tacometro, String matricula, String marca, String modelo, String color, double cilindrada, double potencia, double velocidadMax, double precio) {
        super(matricula, marca, modelo, color, cilindrada, potencia, velocidadMax, precio);
        this.numPlazas = numPlazas;
        this.tacometro = tacometro;
    }
    
    //Getters y Setters

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public boolean isTacometro() {
        return tacometro;
    }

    public void setTacometro(boolean tacometro) {
        this.tacometro = tacometro;
    }

    @Override
    public String toString() {
        return super.toString() + " - Autobus{" + "numPlazas=" + numPlazas + ", tacometro=" + tacometro + '}';
    }
    
    //Método importeExtra
    public double importeExtra(){
        double extras = 0;
        
        if (numPlazas >= 40 && numPlazas <= 60){
            extras +=4000;
        } else if (numPlazas > 60){
            extras +=6500;
        }
        return extras;
    }
    
}

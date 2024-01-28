package actividad28t4pro;


public class Coche extends Vehiculo{
    
    //Atributos
    public int numPuertas;
    
    //Constructor
    public Coche(int numPuertas, String matricula) {
        super(matricula);
        this.numPuertas = numPuertas;
    }
    
    //Getters y Setters

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    
    //ToString
    @Override
    public String toString() {
        return super.toString() + " - Coche{" + "numPuertas=" + numPuertas + '}';
    }
    
    
}

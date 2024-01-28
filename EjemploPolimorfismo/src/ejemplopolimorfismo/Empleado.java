package ejemplopolimorfismo;

public class Empleado extends Persona{
    private double sueldoBase;

    public Empleado(double sueldoBase, String nombre) {
        super(nombre);
        this.sueldoBase = sueldoBase;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public String toString() {
        return super.toString() + " - Empleado{" + "sueldoBase=" + sueldoBase + '}';
    }
    
    

}

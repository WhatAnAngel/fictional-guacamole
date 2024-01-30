package objetos;

import objetos.Empleado;

public class Encargado extends Empleado{

    private double plusEncargado;

    public Encargado(String nombre, String apellido, String codigoEmpleado, double sueldoBase, double plusEncargado) {
        super(nombre, apellido, codigoEmpleado, sueldoBase);
        this.plusEncargado = plusEncargado;
    }

    public double getPlusEncargado() {
        return plusEncargado;
    }

    public void setPlusEncargado(double plusEncargado) {
        this.plusEncargado = plusEncargado;
    }

    @Override
    public String toString() {
        return super.toString() + " - Encargado{" + "plusEncargado=" + plusEncargado + "%" + '}';
    }
    
    @Override
    public double getSueldoBase() {
        return super.getSueldoBase() + (super.getSueldoBase() * (plusEncargado/100));
    }
}

package objetos;

public class Empleado {

    private String nombre, apellido, codigoEmpleado;
    private double sueldoBase;

    public Empleado(String nombre, String apellido, String codigoEmpleado, double sueldoBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoEmpleado = codigoEmpleado;
        this.sueldoBase = sueldoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", codigoEmpleado=" + codigoEmpleado + ", sueldoBase=" + sueldoBase + '}';
    }
    
}

package ejemplopolimorfismo;

public class Encargado  extends Empleado{
    private String seccion;

    public Encargado(String seccion, double sueldoBase, String nombre) {
        super(sueldoBase, nombre);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString() + " - Encargado{" + "seccion=" + seccion + '}';
    }
}

package objetos.academia;

public class Alumno {

    private String nia;
    private String nombre;
    private double nota;

    
    public Alumno(String nia, String nombre, double nota) {
        this.nia = nia;
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNia() {
        return nia;
    }

    public void setNia(String nia) {
        this.nia = nia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    
    @Override
    public String toString() {
        return "Alumno{" + "nia=" + nia + ", nombre=" + nombre + ", nota=" + nota + '}';
    }
    
    
}

package actividad22t5pro;

import java.time.LocalDate;

public class Trabajador {

    private int codigo;
    private String nombre, apellido;
    private LocalDate fechaAlta;

    public Trabajador(int codigo, String nombre, String apellido, LocalDate fechaAlta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaAlta = fechaAlta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaAlta=" + fechaAlta + '}';
    }
}

package objetos.biblioteca;

public class Libro {
    
    // Atributos
    private int id;
    private String titulo;
    private double precio;

    // Constructor
    
    public Libro(int id, String titulo, double precio) {
        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
    }
    
    //Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // toString
    
    @Override
    public String toString() {
        return "Libro{" + "id=" + id + ", titulo=" + titulo + ", precio=" + precio + '}';
    }
    
    
    
    
}

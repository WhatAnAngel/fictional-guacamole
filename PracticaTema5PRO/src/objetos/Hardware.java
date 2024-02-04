package objetos;

public abstract class Hardware {

    //Atributos de Hardware
    private int codigo;
    private String marca, modelo, descripcion;
    private double precio;

    // Constructor con parámetros
    protected Hardware(int codigo, String marca, String modelo, String descripcion, double precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
     // Constructor sin parámetros (inicializa el precio a 0)
    protected Hardware() {
        this.precio = 0;
    }

    // Métodos getter
    public int getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    // Métodos setter
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método toString
    @Override
    public String toString() {
        return "Código: " + codigo +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nDescripción: " + descripcion +
                "\nPrecio: " + precio;
    }
}

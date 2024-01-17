package equipos;

public class Equipo {
    
    //Atributos
    private String marca, modelo;
    private double precio;

    //Constructor
        public Equipo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    //Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //Métodos
    public void AumentaPrecio(double incremento){
        this.precio+=incremento;
    }

    //ToString
    @Override
    public String toString() {
        return "Equipo{" + "marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + '}';
    }

}

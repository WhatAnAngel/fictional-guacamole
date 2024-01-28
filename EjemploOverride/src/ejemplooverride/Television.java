package ejemplooverride;

public class Television {
    private String marca;
    private double precio;
    String toString;

    public Television(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Television{" + "marca=" + marca + ", precio=" + precio + '}';
    }
    
    public double calculaPrecio(){
        return precio*0.9;
    }

}

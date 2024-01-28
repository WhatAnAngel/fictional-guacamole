package concesionario;

public class Vehiculo {

    //Atributos
    private String matricula;
    private String marca, modelo, color;
    private double cilindrada, potencia, velocidadMax, precio;

    //Constructor 
    public Vehiculo(String matricula, String marca, String modelo, String color, double cilindrada, double potencia, double velocidadMax, double precio) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
        this.velocidadMax = velocidadMax;
        this.precio = precio;
    }

    //Getter y Setter
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Mostrar datos
    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", cilindrada=" + cilindrada + ", potencia=" + potencia + ", velocidadMax=" + velocidadMax + ", precio=" + precio + '}';
    }

    //Métodos
    public double calculaIVA() {
        double IVA = 21;
        double precioConIVA = this.precio * (IVA / 100);
        return precioConIVA;
    }
    
}

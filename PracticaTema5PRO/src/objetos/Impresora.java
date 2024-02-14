package objetos;


public class Impresora extends Hardware{

    //Atributos de Impresora
    private boolean color;
    private String tipo;
    private boolean recambioTinta;
    
    // Constructor con parámetros
    public Impresora(int codigo, String marca, String modelo, String descripcion, double precio, boolean color, String tipo, boolean recambioTinta) {
        super(codigo, marca, modelo, descripcion, precio);
        this.color = color;
        this.tipo = tipo;
        this.recambioTinta = recambioTinta;
    }

    // Constructor sin parámetros (inicializa color a true)
    public Impresora() {
        super();
        this.color = true;
    }

    // Métodos getter
    public boolean isColor() {
        return color;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isRecambioTinta() {
        return recambioTinta;
    }

    // Métodos setter
    public void setColor(boolean color) {
        this.color = color;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setRecambioTinta(boolean recambioTinta) {
        this.recambioTinta = recambioTinta;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() +
                "\nColor: " + color +
                "\nTipo: " + tipo +
                "\nRecambio de Tinta: " + recambioTinta;
    }
    
    // Método importeFinal sobrecargado
    public double importeFinal(double porcentajeIVA) {
        return getPrecio() * (1 + porcentajeIVA / 100);
    }

    public double importeFinal(double porcentajeDescuento, double porcentajeIVA) {
        return getPrecio() * (1 - porcentajeDescuento / 100) * (1 + porcentajeIVA / 100);
    }

    public double importeFinal(double porcentajeDescuento, double porcentajeIVA, boolean empleado) {
        if (empleado) {
            porcentajeDescuento += 10;
        }
        return getPrecio() * (1 - porcentajeDescuento / 100) * (1 + porcentajeIVA / 100);
    }

}

package ejemplosobrecarga;

public class Venta {
    private double cantidad;
    private double precio;

    public Venta(double cantidad, double precio) {
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Venta{" + "cantidad=" + cantidad + ", precio=" + precio + '}';
    }
    
    public double calculaPrecio(){
        return cantidad*precio;
    }
    
    public double calculaPrecio(double pIva){
        double precioBruto = cantidad * precio;
        double iva = precioBruto*pIva;
        return precioBruto+iva;
    }
    
}

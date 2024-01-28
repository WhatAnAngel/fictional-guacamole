package ejemplosobrecarga;

public class EjemploSobrecarga {

    public static void main(String[] args) {
        
        Venta miVenta = new Venta(10, 5);
        System.out.println("Precio: " + miVenta.calculaPrecio());
        System.out.println("Precio IVA: " + miVenta.calculaPrecio(0.21));
    }

}

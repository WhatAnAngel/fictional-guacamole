package actividad13t2;


public class Actividad13T2 {

    public static void main(String[] args) {
  
    Producto productoHardware = new Producto("42069", "RAM", "32GB",
    "Hardware", 230, 0.25, 500);
    double precioIvaH = productoHardware.ivaProducto() + 
        productoHardware.getPrecio();
    
    Producto productoSoftware = new Producto("69420", "Photoshop", "Premium",
    "Software", 120, 25, 100);
    double precioIvaS = productoSoftware.ivaProducto() + 
        productoSoftware.getPrecio();

    productoHardware.aumentaStock(12);
    productoSoftware.disminuyeStock(5);

    System.out.println(productoHardware.mostrarDatos());
    System.out.println(productoSoftware.mostrarDatos());
        
    //Mostrar los datos de las dos instancias del objeto Producto que hemos 
    //creado, así como sus importes de IVA y los precios finales de cada una de 
    //las instancias del objeto.
    
    System.out.println(productoHardware.mostrarDatos() + " - " + 
    productoHardware.ivaProducto() + " - " + precioIvaH);
    
    System.out.println(productoSoftware.mostrarDatos() + " - " + 
    productoSoftware.ivaProducto() + " - " + precioIvaS);
}
}

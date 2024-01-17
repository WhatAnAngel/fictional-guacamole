/*
Crear un objeto llamado Producto con las siguientes propiedades:
 codProducto
 nombreProducto
 descripcion
 categoria
 peso
 precio
 stock
Crear para el objeto Producto los siguiente métodos:
 Producto: Permite crear una instancia con los datos de un producto.
 aumentaStock: Permite aumentar el stock de unidades del producto. Se le pasa el 
dato de unidades que aumentamos.
 disminuyeStock: Permite disminuir el stock de unidades del producto. Se le pasa el 
dato de unidades que disminuimos.
 ivaProducto: Permite calcular el IVA aplicado al precio del producto. Se le pasa el 
dato del porcentaje de IVA.
 mostrarDatos: Muestra los datos del producto y de su proveedor.
PROGRAMACIÓN - CICLO FORMATIVO DAW - TEMA 3. PROGRAMACIÓN ORIENTADA A OBJETOS. OBJETOS. 4
Crear una clase principal main ejecutable que:
 Crear dos instancias del objeto llamado Producto llamados productoHardware y 
productoSoftware que pertenecen al Producto.
 Aumenta el stock de unidades del productoHardware en 12 unidades.
 Disminuir el stock de unidades del productoSoftware en 5 unidades.
 Mostrar los datos de las dos instancias del objeto Producto que hemos creado.
 Calcula el IVA de las dos instancias del objeto Producto que hemos creado.
 Mostrar los datos de las dos instancias del objeto Producto que hemos creado, así 
como sus importes de IVA y los precios finales de cada una de las instancias del
objeto.
 */
package actividad13t3;

public class Producto {
    
    //Atributos del producto
    
    private String codProducto;
    private String nombreProducto;
    private String descripcion;
    private String categoria;
    private double precio;
    private double peso;
    private int stock;
    
    //Constructor
    
    public Producto (String codProducto, String nombreProducto, String descripcion, 
            String categoria, double precio, double peso, int stock){
        
        this.codProducto = codProducto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
        this.peso = peso;
        this.stock = stock;
    }
    
    //Setters y Getters en pares
    
    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
}

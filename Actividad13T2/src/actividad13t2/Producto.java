package actividad13t2;


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
    
    //Constructor vacío
    public Producto(){};
    
    
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
    
    // Método para aumentar el stock
    public void aumentaStock(int unidades) {
        this.stock += unidades;
    }

    // Método para disminuir el stock
    public void disminuyeStock(int unidades) {
        this.stock -= unidades; }  
    
    // Método para calcular el IVA
    
    public double ivaProducto() {
        return precio * 0.21;
    }
    
    public String mostrarDatos(){
        String resultado = this.codProducto + " - " +
            this.nombreProducto + " - " +
            this.descripcion + " - " +
            this.categoria + " - " +
            this.precio + " - " + 
            this.peso + " - " +
            this.stock;
        return resultado;
    }
    
}

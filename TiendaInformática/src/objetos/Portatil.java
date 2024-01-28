package objetos;

public class Portatil {
    
    //Atributos
    private String codigo;
    private String descripcion;
    private int unidades;
    private double precio;
    private boolean defectuoso;
    //Static: es común a todas las instancias de Portatil
    private static int numDefectuosos = 0;
    
    //Constructores, no se mete el static
    
    //sin datos
    
    public Portatil(){
        this.defectuoso = false;
    }
    
    //con datos
    
    public Portatil(String codigo, String descripcion, int unidades, double 
            precio, boolean defectuoso){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.unidades = unidades;
        this.precio = precio;
        this.defectuoso = defectuoso;
    }
    
    //Setters y getters en pares

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    public int getUnidades() {
        return unidades;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getPrecio() {
        return precio;
    }
    
    public void setDefectuoso(boolean defectuoso) {
        this.defectuoso = defectuoso;
    }
    public boolean getDefectuoso() {
        return defectuoso;
    }

   // Métodos específicos
    public void anadeDefectuoso(){
        if(!this.defectuoso){
            this.defectuoso = true;
            numDefectuosos++;
        }
    }
        
    public void eliminadefectuoso(){
        if(this.defectuoso){
            this.defectuoso = false;
            numDefectuosos--;
        }
    }
   public static void muestraNumDefectuosos(){
       System.out.println("Portátiles defectuosos: " + numDefectuosos);
   }
   public String muestraPortatil(){
       String resultado;
       resultado = this.codigo + 
               " - " + this.descripcion + 
               " - " + this.unidades + 
               " - " + this.precio + 
               " - " + this.defectuoso;
       return resultado;
   }
}

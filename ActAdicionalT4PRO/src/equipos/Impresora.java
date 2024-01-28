package equipos;

public class Impresora extends Equipo{
    
    //Atributos
    private String tipo;
    
    //Constructor
    public Impresora(String tipo, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.tipo = tipo;
    }
    
    //Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //ToString
    @Override
    public String toString() {
        return super.toString() + " - Impresora{" + "tipo=" + tipo + '}';
    }
}

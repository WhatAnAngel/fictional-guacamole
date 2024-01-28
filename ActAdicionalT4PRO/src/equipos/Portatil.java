package equipos;

public class Portatil extends Equipo{
    private CPU cpu;
    
    //Constructor
    public Portatil(String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.cpu = null;
    }
    
    //Getters y Setters
    public CPU getCpu() {
        return cpu;
    }

    public void instalarCpu(CPU cpu) {
        this.cpu = cpu;
    }
    
    public void quitaCpu(CPU cpu) {
        this.cpu = null;
    }
    
    //Métodos
    @Override
    public void AumentaPrecio(double incremento){
        this.setPrecio(this.getPrecio()+incremento);
        if (this.getPrecio() > 600){
            this.setPrecio(this.getPrecio() * 0.9);
        } else {
            System.out.println("No se puede aplicar el descuento");
        }
    }
    
    //To String
    @Override
    public String toString() {
        return super.toString() + " - Portatil{" + "cpu=" + cpu + '}';
    }
    
    
    

}

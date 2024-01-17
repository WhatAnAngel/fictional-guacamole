package inmobiliaria.inmuebles;

public class Chalet extends Inmueble{

    //Atributos
    private double superficieParcela;
    private boolean piscina, paellero;
    
    //Constructor
    public Chalet(double superficieParcela, boolean piscina, boolean paellero, String codInmueble, String tipoInmueble, String direccion, double superficie, int numHab, int numAseos, int plGaraje, double precio) {
        super(codInmueble, tipoInmueble, direccion, superficie, numHab, numAseos, plGaraje, precio);
        this.superficieParcela = superficieParcela;
        this.piscina = piscina;
        this.paellero = paellero;
    }
    
    //Getters y Setters
    public double getSuperficieParcela() {
        return superficieParcela;
    }

    public void setSuperficieParcela(double superficieParcela) {
        this.superficieParcela = superficieParcela;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public boolean isPaellero() {
        return paellero;
    }

    public void setPaellero(boolean paellero) {
        this.paellero = paellero;
    }
    
    //Métodos
    public double comision(){
        setPrecio(getPrecio());
        double precio = getPrecio();
        precio=+(precio*0.1);
        if(piscina){
            precio+=1000;
        }
        if(paellero){
            precio+=500;
        }        
        return precio;
    }
    
    //ToString
    @Override
    public String toString() {
        return super.toString() + " - Chalet{" + "superficieParcela=" + superficieParcela + ", piscina=" + piscina + ", paellero=" + paellero + '}';
    }
    
}

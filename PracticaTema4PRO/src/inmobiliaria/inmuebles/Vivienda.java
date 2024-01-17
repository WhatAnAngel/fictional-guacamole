package inmobiliaria.inmuebles;

public class Vivienda extends Inmueble{

    //Atributos
    private double altura;
    private boolean balcon, exterior;
    
    //Constructor
    public Vivienda(double altura, boolean balcon, boolean exterior, String codInmueble, String tipoInmueble, String direccion, double superficie, int numHab, int numAseos, int plGaraje, double precio) {
        super(codInmueble, tipoInmueble, direccion, superficie, numHab, numAseos, plGaraje, precio);
        this.altura = altura;
        this.balcon = balcon;
        this.exterior = exterior;
    }
    
    //Getters y Setters
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isBalcon() {
        return balcon;
    }

    public void setBalcon(boolean balcon) {
        this.balcon = balcon;
    }

    public boolean isExterior() {
        return exterior;
    }

    public void setExterior(boolean exterior) {
        this.exterior = exterior;
    }
    
    //Métodos
    public double comision(){
        setPrecio(getPrecio());
        double precio = getPrecio();
        precio=+(precio*0.05);    
        return precio;
    }
    
    //ToString
    @Override
    public String toString() {
        return super.toString() + " - Vivienda{" + "altura=" + altura + ", balcon=" + balcon + ", exterior=" + exterior + '}';
    }
    
}

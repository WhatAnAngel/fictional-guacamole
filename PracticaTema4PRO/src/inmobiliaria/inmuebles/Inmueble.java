package inmobiliaria.inmuebles;

public class Inmueble {

    //Atributos
    private String codInmueble, tipoInmueble;
    private String direccion, poblacion;
    private double superficie;
    private int numHab, numAseos, plGaraje;
    private double precio;

    //Constructor
    public Inmueble(String codInmueble, String tipoInmueble, String direccion, double superficie, int numHab, int numAseos, int plGaraje, double precio) {
        this.codInmueble = codInmueble;
        this.tipoInmueble = tipoInmueble;
        this.direccion = direccion;
        this.superficie = superficie;
        this.numHab = numHab;
        this.numAseos = numAseos;
        this.plGaraje = plGaraje;
        this.precio = precio;
    }

    //Getters y setters
    public String getCodInmueble() {
        return codInmueble;
    }

    public void setCodInmueble(String codInmueble) {
        this.codInmueble = codInmueble;
    }

    public String getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(String tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public int getNumHab() {
        return numHab;
    }

    public void setNumHab(int numHab) {
        this.numHab = numHab;
    }

    public int getNumAseos() {
        return numAseos;
    }

    public void setNumAseos(int numAseos) {
        this.numAseos = numAseos;
    }

    public int getPlGaraje() {
        return plGaraje;
    }

    public void setPlGaraje(int plGaraje) {
        this.plGaraje = plGaraje;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Métodos
    public double calculaIVA() {
        double IVA = 0.21;
        return this.precio * IVA;
    }

    //ToString
    @Override
    public String toString() {
        return "Inmueble{" + "codInmueble=" + codInmueble + ", tipoInmueble="
                + tipoInmueble + ", direccion=" + direccion + ", poblacion="
                + poblacion + ", superficie=" + superficie + ", numHab="
                + numHab + ", numAseos=" + numAseos + ", plGaraje=" + plGaraje
                + ", precio=" + precio + '}';
    }

}

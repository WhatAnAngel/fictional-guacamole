package mapa.fisico;

public class Montana {

    public String nombre;
    public double alturaMaxima;
    public String pais;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Montana{" + "nombre=" + nombre + ", alturaMaxima=" + alturaMaxima + ", pais=" + pais + '}';
    }

}

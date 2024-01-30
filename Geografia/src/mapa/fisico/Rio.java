package mapa.fisico;

public class Rio {
    public String nombre;
    public double longitud;
    public int numAfluentes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int getNumAfluentes() {
        return numAfluentes;
    }

    public void setNumAfluentes(int numAfluentes) {
        this.numAfluentes = numAfluentes;
    }

    @Override
    public String toString() {
        return "Rio{" + "nombre=" + nombre + ", longitud=" + longitud + ", numAfluentes=" + numAfluentes + '}';
    }

    
}

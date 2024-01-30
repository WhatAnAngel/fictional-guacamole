package geografia.politico;

public class Pais {
    
public String nombre;
public String capital;
public String moneda;
public double extension;
public int habitantes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public double getExtension() {
        return extension;
    }

    public void setExtension(double extension) {
        this.extension = extension;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", capital=" + capital + ", moneda=" + moneda + ", extension=" + extension + ", habitantes=" + habitantes + '}';
    }


}

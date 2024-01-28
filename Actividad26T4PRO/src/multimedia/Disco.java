package multimedia;

public class Disco extends Multimedia {

    private String genero;

    public Disco(String genero, String titulo, String autor, String formato, int duracion) {
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString() + " - Disco{" + "genero=" + genero + '}';
    }

}

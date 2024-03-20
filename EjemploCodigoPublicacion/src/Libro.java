import java.time.LocalDate;

public class Libro extends Publicacion {

    private int numPaginas;

    public Libro(int id, String titulo, String tema, String autor, LocalDate fechaPublicacion) {
        super(id, titulo, tema, autor, fechaPublicacion);
    }

    public int setNumPaginas(int numPaginas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getNumPaginas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

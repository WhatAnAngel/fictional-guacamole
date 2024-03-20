import java.time.LocalDate;

public class Publicacion {

    private int id;

    private String titulo;

    private String tema;

    private String autor;

    private LocalDate fechaPublicacion;

    public Publicacion(int id, String titulo, String tema, String autor, LocalDate fechaPublicacion) {
    }

    public int setId(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

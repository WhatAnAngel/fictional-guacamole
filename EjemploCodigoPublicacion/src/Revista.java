import java.time.LocalDate;

public class Revista extends Publicacion {

    private boolean color;

    public Revista(boolean color, int id, String titulo, String tema, String autor, LocalDate fechaPublicacion) {
        super(id, titulo, tema, autor, fechaPublicacion);
        this.color = color;
    }

    public void setColor(boolean color) {
    }

    public boolean isColor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

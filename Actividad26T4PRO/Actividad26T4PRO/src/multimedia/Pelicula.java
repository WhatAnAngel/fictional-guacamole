package multimedia;

public class Pelicula extends Multimedia{
    private String mainActor, mainActress;

    public Pelicula(String mainActor, String mainActress, String titulo, String autor, String formato, int duracion) {
        super(titulo, autor, formato, duracion);
        this.mainActor = mainActor;
        this.mainActress = mainActress;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public String getMainActress() {
        return mainActress;
    }

    public void setMainActress(String mainActress) {
        this.mainActress = mainActress;
    }

    @Override
    public String toString() {
        return super.toString() + " - Pelicula{" + "mainActor=" + mainActor 
                + ", mainActress=" + mainActress + '}';
    }
    
    
}

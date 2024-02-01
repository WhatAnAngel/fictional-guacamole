
package actividad23t4pro;


public class Biblioteca {
    
    private int codigo;
    private String titulo;
    private int anoPublicacion;

    public Biblioteca(int codigo, String titulo, int anoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    @Override
    public String toString() {
        return "{" + "codigo=" + codigo + ", titulo=" + titulo + ", anoPublicacion=" + anoPublicacion + '}';
    }
    
    
    
}

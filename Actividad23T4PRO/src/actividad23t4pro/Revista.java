package actividad23t4pro;

public class Revista extends Biblioteca {

    private int numero;
    
    public Revista(int codigo, String titulo, int anoPublicacion, int numero) {
        super(codigo, titulo, anoPublicacion);
        
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString() + " - Revista{" + "numero=" + numero + '}';
    }
        
    }

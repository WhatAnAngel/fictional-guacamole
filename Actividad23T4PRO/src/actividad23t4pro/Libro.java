
package actividad23t4pro;


public class Libro extends Biblioteca implements InterfazLibro {
    
private boolean prestado;

    public Libro(int codigo, String titulo, int anoPublicacion) {
        super(codigo, titulo, anoPublicacion);
        
        this.prestado = false;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    
@Override
    public boolean Prestar(){
       return this.prestado = true;
    }
    
@Override
    public boolean Devolver(){
        return this.prestado = false;
    }
    
@Override
    public String Prestado(){
        String estado;
        
        if (this.prestado){
            estado = "Prestado";
        } else {
            estado = "No prestado";
        };
        
        return estado;
    }

    @Override
    public String toString() {
        return super.toString()+ " - Libro{" + "prestado=" + prestado + '}';
    }
    
}

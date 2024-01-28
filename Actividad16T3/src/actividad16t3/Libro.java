package actividad16t3;
public class Libro {
    //Atributos
    private String titulo;
    private String autor;
    private String editorial;
    private int numEjemplares;
    private int numPrestados;
    
    //Constructor
    public Libro(String titulo, String autor, String editorial, 
            int numEjemplares, int numPrestados){
        this.titulo = titulo; 
        this.autor = autor;
        this.editorial = editorial;   
        this.numEjemplares = numEjemplares; 
        this.numPrestados = numPrestados;
    }
    
    public Libro(){   
    }
    
    //Setter y Getter
    public void setTitulo(String titulo){
        this.titulo = titulo;        
    }
    public void setAutor(String autor){
        this.autor = autor;        
    }
    public void setEditorial(String editorial){
        this.editorial = editorial;        
    }
    public void setEjemplares(int numEjemplares){
        this.numEjemplares = numEjemplares;        
    }
    public void setPrestados(int numPrestados){
        this.numPrestados = numPrestados;        
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    public String autor(){
        return this.autor;
    }
    public String editorial(){
        return this.editorial;
    }
    public int getEjemplares(){
        return this.numEjemplares;
    }
    public int getPrestados(){
        return this.numPrestados;
    }
    public String mostrarDatos(){
        String resultado = this.titulo + " - " + this.autor + " - " + 
                this.editorial + " - " + this.numEjemplares + " - " + 
                this.numPrestados;
        return resultado;
    }
    public boolean prestado(){
        boolean esPrestado = false;
        if(this.numPrestados<this.numEjemplares){
            this.numPrestados++;
            esPrestado=true;
        }
        return esPrestado;
    }
   
    public boolean devolver(){
        boolean esDevuelto = false;
        if(numPrestados>0){
            this.numPrestados--;
            esDevuelto = true;
        }
        return esDevuelto;
    }
    public boolean perdido(){
        boolean esPerdido = false;
        if(numEjemplares>0){
            this.numEjemplares--;
            esPerdido = true;
        }
        return esPerdido;
    }
    
}

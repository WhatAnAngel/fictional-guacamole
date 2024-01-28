package multimedia;

public class ListaMultimedia {
    private Multimedia[] multimedia;
    private int objetos;
    int objetosMax;

    public ListaMultimedia(int objetosMax) {
        this.objetos= 0;
        this.objetosMax = objetosMax;
        this.multimedia = new Multimedia [objetosMax];
    }

    public Multimedia[] getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(Multimedia[] multimedia) {
        this.multimedia = multimedia;
    }

    public int getObjetos() {
        return objetos;
    }

    public void setObjetos(int objetos) {
        this.objetos = objetos;
    }
    
    public int size(){
        return this.objetos;
    }
    
    public boolean add(Multimedia m){
        if (this.objetosMax > this.objetos){
            this.multimedia[objetos] = m;
            objetos++;
            return true;
        } else {
            return false;
        }   
    }
    
    public Multimedia getMultimedia(int posicion) {
        return this.multimedia[posicion];
    }
    
    public int indexOf(Multimedia m){
        int posicion = -1;
        for (int i = 0; i < objetos; i++){
            if (this.multimedia[i] == m){
                posicion = i;
            }
        }
        return posicion;
    }

    @Override
    public String toString() { 
        String resultado="";
        for (int i=0; i<objetos; i++) {
            resultado += 
                ("Pelicula " + (i + 1 + ": ") 
                + multimedia[i].toString() + "\n");
        }
        return resultado;
    }
  
}

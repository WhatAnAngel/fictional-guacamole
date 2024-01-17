package multimedia;

public class ListaMultimedia {
    private Multimedia[] lista;
    private int objetos;

    public ListaMultimedia(int objetosMax) {
        this.objetos= 0;
        this.lista = new Multimedia [objetosMax];
    }

    public Multimedia[] getLista() {
        return lista;
    }

    public void setLista(Multimedia[] lista) {
        this.lista = lista;
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
        if (lista.length > this.objetos){
            this.lista[objetos] = m;
            objetos++;
            return true;
        } else {
            return false;
        }   
    }
    
    public Multimedia getMultimedia(int posicion) {
        return this.lista[posicion];
    }
    
    public int indexOf(Multimedia m){
        int posicion = -1;
        for (int i = 0; i < objetos; i++){
            if (
                this.lista[i].getTitulo().equals(m.getTitulo())
                &&
                this.lista[i].getAutor().equals(m.getAutor())
                )
            {
                posicion = i;
                break;
            }
        }
        return posicion;
    }
    
    @Override
    public String toString() { 
        String resultado="";
        for (int i=0; i < objetos; i++) {
            String tipo = lista[i].getClass().getSimpleName();
            resultado += 
                (tipo + " " + (i + 1 + ": ") 
                + lista[i] + "\n");
        }
        return resultado;
    }
  
}

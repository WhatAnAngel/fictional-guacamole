package equipos;

public class CPU {
    //Atributos
    private String procesador;
    private int memoria, discoDuro;
    
    //Contructor
    public CPU(String procesador, int memoria, int discoDuro) {
        this.procesador = procesador;
        this.memoria = memoria;
        this.discoDuro = discoDuro;
    }
    
    //Getter y Setter
    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }
    
    //ToString
    @Override
    public String toString() {
        return "CPU{" + "procesador=" + procesador + ", memoria=" + memoria + ", discoDuro=" + discoDuro + '}';
    }
}

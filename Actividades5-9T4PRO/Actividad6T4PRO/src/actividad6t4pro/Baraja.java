package actividad6t4pro;

public class Baraja {

    private int numero;
    private String palo;
    private String[] palos = {"oros", "copas", "espadas", "bastos"};

    public Baraja() {
       numero = (int) (Math.random() * 13)+1;
       palo = palos[(int) (Math.random() * palos.length)];
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String[] getPalos() {
        return palos;
    }

    public void setPalos(String[] palos) {
        this.palos = palos;
    }

    @Override
    public String toString() {
        return ("Su carta es el " + numero + " de " + palo);
    }
    
    
}

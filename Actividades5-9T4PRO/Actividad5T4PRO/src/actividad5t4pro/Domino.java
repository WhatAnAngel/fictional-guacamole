package actividad5t4pro;

public class Domino {
    
//    atributos
    
    private int lado1;
    private int lado2;

//    constructor
    
    public Domino() { 
        lado1 = (int) (Math.random()*7);
        lado2 = (int) (Math.random()*7);
    }

//    getters y setters
    
    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    @Override
    public String toString() {
        return "Domino{" + "lado1= " + lado1 + ", lado2= " + lado2 + '}';
    }
    
    
    
}

package sorteos;

public class Dado extends Sorteo{

    public String lanzar(){
       int resultado = (int) (Math.random() * 5) + 1;
       return("Resultado: " + resultado);
    }
}

package sorteos;

public class Moneda extends Sorteo{

    public String lanzar(){
       int resultado = (int) Math.random() * 1;
       String resultadoS = "Cruz";
       
       if (resultado == 0) {resultadoS = "Cara";}
       return("Resultado: " + resultadoS);
    }
}

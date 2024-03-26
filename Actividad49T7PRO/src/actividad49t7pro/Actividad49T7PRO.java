package actividad49t7pro;


public class Actividad49T7PRO {

    public static void main(String[] args) {
        String nombre = "Ángel Ilai Alcañiz García";
        int posicion;
        int inicio = 0;
        int numEspacios=0;
        
        while((posicion = nombre.indexOf(" ", inicio))!= -1){
            numEspacios++;
            inicio = posicion + 1;
        }
        
        System.out.println(numEspacios + 1);
    }

}

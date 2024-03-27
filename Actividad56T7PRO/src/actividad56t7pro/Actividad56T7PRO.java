package actividad56t7pro;

import java.util.ArrayList;


public class Actividad56T7PRO {

    public static void main(String[] args) {

        ArrayList<Ficha> archivador = new ArrayList<>();
        
        archivador.add(new Ficha("Ángel", "Alcañiz", 25));
        archivador.add(new Ficha("Andrea", "García", 30));
        archivador.add(new Ficha("Carlos", "LaPiedra", 25));
        
        System.out.println(archivador);
    }

}

package geografia;

import geografia.politico.Pais;
import mapa.fisico.Montana;
import mapa.fisico.Rio;

public class Geografia {

    public static void main(String[] args) {

        Rio miRio = new Rio();
        Montana miMontana = new Montana();
        Pais miPais = new Pais();
        
        System.out.println(miRio.toString());
        System.out.println(miMontana.toString());
        System.out.println(miPais.toString());
    }

}

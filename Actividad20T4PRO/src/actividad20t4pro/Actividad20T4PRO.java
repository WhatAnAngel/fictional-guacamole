package actividad20t4pro;


public class Actividad20T4PRO {

    public static void main(String[] args) {

        Viaje miViaje = new Viaje(1, "Madrid", 350);
        Viaje tuViaje  = new Viaje(miViaje);
        
        System.out.println(miViaje);
        System.out.println(tuViaje);
        
    }

}

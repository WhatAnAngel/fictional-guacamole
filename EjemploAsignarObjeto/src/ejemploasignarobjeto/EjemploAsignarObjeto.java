package ejemploasignarobjeto;


public class EjemploAsignarObjeto {

    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo(5,7);
        Rectangulo r2 = new Rectangulo(r1);
        
        r2.makeWider();
        r2.makeTaller();
        
        System.out.println("Widht r1: " + r1.getWidth());
        System.out.println("Height r1: " + r1.getHeight());
        
    }

}

package ejemplooverride;


public class EjemploOverride {

    public static void main(String[] args) {
        Television miTelevision = new Television("Sony", 1000);
        System.out.println("Precio TV: " + miTelevision.calculaPrecio());
    
        Television4K miTelevision4K = new Television4K("Sony", 1000);
        System.out.println("Precio TV4K: " + miTelevision4K.calculaPrecio());
    }

}

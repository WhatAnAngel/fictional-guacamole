package ejemploclaseabstracta;

public class Silla extends Mueble{

    private int patas;

    public Silla(int patas, String nombre, double precio) {
        super(nombre, precio);
        this.patas = patas;
    }
    
}

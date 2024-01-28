package ejemplooverride;

public class Television4K extends Television{

    public Television4K(String marca, double precio) {
        super(marca, precio);
    }

    @Override
    public String toString() {
        return super.toString + "Television4K{" + '}';
    }

    @Override
    public double calculaPrecio(){
        return this.getPrecio()*0.75;
    }
}

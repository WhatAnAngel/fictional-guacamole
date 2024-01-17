package ejemplointerface;

public class Cuadrado implements interFigura{
    
    private double lado;
    
    @Override
    public double area(){
        return lado*lado;
    }
    
    @Override
    public double perimetro(){
        return lado * 4;
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
    
    
    

}

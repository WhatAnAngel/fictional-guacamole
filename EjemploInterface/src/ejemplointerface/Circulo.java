package ejemplointerface;

public class Circulo implements interFigura{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    
    @Override
    public double area(){
        return (radio * radio)* PI;
    }
    
    @Override
    public double perimetro(){
        return 2*PI*radio;
    }
    
}

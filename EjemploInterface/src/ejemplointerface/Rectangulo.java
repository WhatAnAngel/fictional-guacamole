package ejemplointerface;

public class Rectangulo implements interFigura{
    
    private double ancho;
    private double alto;
    
    @Override
    public double area(){
        return ancho*alto;
    }
    
    @Override
    public double perimetro(){
        return (ancho*2)+(alto*2);
    }

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }
    
        public double getAlto() {
        return alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
        public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "ancho=" + ancho + ", alto=" + alto + '}';
    }

    
    

}


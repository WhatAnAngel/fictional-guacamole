package ejemplointerface;


public class EjemploInterface {

    public static void main(String[] args) {
        
        Cuadrado miCuadrado = new Cuadrado(5);
        System.out.println("El area del cuadrado es: " + miCuadrado.area());
        System.out.println("El perímetro del cuadrado es: " + miCuadrado.perimetro());
        
        Rectangulo miRectangulo = new Rectangulo (5,3);
        System.out.println("El area del rectangulo es: " + miRectangulo.area());
        System.out.println("El perímetro del rectangulo es: " + miRectangulo.perimetro());
        
        Circulo miCirculo = new Circulo(3);
        System.out.println("El area del círculo es: " + miCirculo.area());
        System.out.println("El perímetro del círculo es: " + miCirculo.perimetro());

    }

}

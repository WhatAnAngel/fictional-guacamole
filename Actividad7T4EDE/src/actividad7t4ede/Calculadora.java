package actividad7t4ede;

/**
 * Clase que permite realizar cálculos matemáticos
 * @author AngelIlaiAlcañizGarc
 * @see <a href="http://www.google.es"> Google </a> 
 * @version 4.20.69
 */
public class Calculadora {
    
     /**
      * Método que suma los dos números que se le pasan como parámetros
      * 
      * <pre> Uso: Resultado = miCalculadora.suma(2,2)</p>
      * 
      * @param num1 double primer número de la operacion
      * @param num2 double segundo número de la operación
      * @return double resultado de sumar num1 y num2
      */
    public double suma(double num1, double num2) {
        double suma = num1 + num2;
        return suma;
    }

    /**
     * Método que resta los dos números que se le pasan como parámetros
     * 
     * <pre> Uso: Resultado = miCalculadora.resta(4,2)</p>
     * 
     * @param num1 double primer número de la operacion
     * @param num2 double segundo número de la operación
     * @return double resultado de restar num2 a num1
     */
    public double resta(double num1, double num2) {
        double resta = num1 - num2;
        return resta;
    }

    /**
     * Método que multiplica los dos números que se le pasan como parámetros
     * 
     * <pre> Uso: Resultado = miCalculadora.multiplicacion(4,2)</p>
     * 
     * @param num1
     * @param num2
     * @return 
     */
    public double multiplicacion(double num1, double num2) {
        double multiplicacion = num1 * num2;
        return multiplicacion;
    }

    public double division(double num1, double num2) {
        double multiplicacion = num1 / num2;
        return multiplicacion;
    }

    public double potencia(double num1, double num2) {
        double potencia = Math.pow(num1, num2);
        return potencia;
    }

    public double factorial(double num1) {
        long factorial = 1;
        for (int i = 1; i <= num1; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public double sumatorio(double num1, double num2) {
        int i = (int) num1;
        while (i != 0) {
            num2 += i;
            i--;
        }
        return num2;
    }

}

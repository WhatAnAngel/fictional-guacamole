package ejemplomath;


public class EjemploMath {

    public static void main(String[] args) {
           double prestamo = -381.13;
           
           // Math.abs devuelve el valor sin signo  
            System.out.println(Math.abs(prestamo));
            
            //Math.PI valor constante pi
            System.out.println(Math.PI);
            
            //Math.max() devuelve mayor dos numeros
            System.out.println(Math.max(prestamo, 80));
        
            //Math.pow() devuelve potencia
            System.out.println(Math.pow(prestamo, 2));
            
            //Math.round() redondea al entero
            System.out.println(Math.round(4.49));
            
            //Redondear decimal especifico con Math.round
            double peso = 59.4534534;
            System.out.println(Math.round(peso*1000d)/1000d);
        
            System.out.println(numRound(peso, 6));

    }
               static public double numRound(double num, double dec){
                double round;
                double mult = Math.pow(10, dec);
                round = Math.round(num*mult)/mult;
                return round;
            }

}

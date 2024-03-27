package actividad54t7pro;

import java.util.ArrayList;


public class Actividad54T7PRO {

    public static void main(String[] args) {

        int numPersonasCola = (int) (50 * Math.random()+1);
        ArrayList<Double> precio = new ArrayList<>();      
        double precioFinal = 0;
        
        for(int i = 0; i<numPersonasCola;i++){
            int edad = (int) ((60 * Math.random())+6);
            double precioEntrada;
            if (edad <= 10){
                precioEntrada = 5.0;
            } else if (edad < 18){
                precioEntrada = 7.5;
            } else{
                precioEntrada = 9.5;
            }
            precio.add(precioEntrada);
            
            precioFinal+=precioEntrada;
        }
    
        System.out.println("Personas en la cola: " + numPersonasCola);
        System.out.println("Cantidad recaudada: " + precioFinal);
        
    }

}

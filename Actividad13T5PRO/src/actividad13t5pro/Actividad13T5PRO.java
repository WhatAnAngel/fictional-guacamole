package actividad13t5pro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Actividad13T5PRO {

    public static void main(String[] args) {

        //Fecha de hoy
        LocalDate hoy = LocalDate.now();
        //Formatos de Input y Output
        DateTimeFormatter formatoInput = 
                DateTimeFormatter.ofPattern("d/M/yyyy");
        DateTimeFormatter formatoOutput = 
                DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //Fecha random
        String caducidadString = ((int)((Math.random()*30)+1))+ "/"+
                ((int)((Math.random()*12)+1))+ "/" +
                "2024"; 
        //String parseado a fecha
        LocalDate fechaCaducidad = LocalDate.parse(caducidadString, formatoInput);
        String estadoCaducidad;
        
        if (hoy.isAfter(fechaCaducidad)){
            estadoCaducidad = "El producto está caducado.";
        } else if (hoy.isEqual(fechaCaducidad)){
            estadoCaducidad = "El producto caduca hoy.";
        } else {
            estadoCaducidad = "El producto no está caducado";
        }
        
        System.out.println("La fecha de caducidad es: " + formatoOutput.format(fechaCaducidad));
        System.out.println(estadoCaducidad);
    }

}

package actividad14t5pro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Actividad14T5PRO {

    public static void main(String[] args) {
        
        DateTimeFormatter formatoInput = 
                DateTimeFormatter.ofPattern("d/M/yyyy");
        DateTimeFormatter formatoOutput = 
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String fechaRandomString = ((int)((Math.random()*30)+1))+ "/"+
                ((int)((Math.random()*12)+1))+ "/" +
                "2024"; 
        LocalDate fechaInputFormat = LocalDate.parse(fechaRandomString, formatoInput);
        
        String fechaOutputFormat = formatoOutput.format(fechaInputFormat);
        
        System.out.println("Fecha: " + fechaOutputFormat);
    }

}

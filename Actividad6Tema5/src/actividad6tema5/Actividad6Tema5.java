package actividad6tema5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Actividad6Tema5 {

    public static void main(String[] args) {
        //Formato de input
        DateTimeFormatter formatoInput = 
            DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
        //Formatos de output
        String a = "MMMM dd, yyyy, K:mm a";
        String b = "MM.dd.yy";
        String c = "dd, M, yyyy";
        String d = "yyyyMMdd";
        String e = "HH-mm-ss, dd-MM-yy";
        String f = "E MMM dd HH:mm:ss";
        String g = "HH:mm:ss";
        
        
        String[] puntos = {a, b, c, d, e, f, g};
              
        //Fecha a formatear
        String fechaString = "10/03/2001 17:16:08";
        
        //Fecha formateada
        LocalDateTime fecha = LocalDateTime.parse(fechaString, formatoInput);
        
        for (int i=0; i<=6; i++){
            char puntoChar = ((char) ('a' + i));
            String punto = puntoChar + ") ";
            DateTimeFormatter form = DateTimeFormatter.ofPattern(puntos[i]);
            System.out.println( 
                punto +
                form.format(fecha) +
            "\n"
            );
        }
    }
    
}

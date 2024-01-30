package actividad17t5pro;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Actividad17T5PRO {

    public static void main(String[] args) {
        
        LocalDate hoy = LocalDate.now();
        LocalDate antes = ((hoy.minus
        (5, ChronoUnit.YEARS)).
        minus(11, ChronoUnit.MONTHS)).
        minus(18, ChronoUnit.DAYS);
        
        System.out.println("Hoy: " + hoy);
        System.out.println("Antes: " + antes);
        
    }
    
}

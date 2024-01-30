package actividad16t5pro;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Actividad16T5PRO {

    public static void main(String[] args) {

        LocalDate hoy = LocalDate.now();
        LocalDate luego = ((hoy.plus
        (10, ChronoUnit.YEARS)).
        plus(4, ChronoUnit.MONTHS)).
        plus(5, ChronoUnit.DAYS);
        
        System.out.println("Hoy: " + hoy);
        System.out.println("Luego: " + luego);
    }

}

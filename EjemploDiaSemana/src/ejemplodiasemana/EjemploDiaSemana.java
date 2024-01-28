package ejemplodiasemana;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class EjemploDiaSemana {

    public static void main(String[] args) {
        
        LocalDate miFecha = LocalDate.of(2024, 1, 4);
        
        if(miFecha.getDayOfWeek().equals(DayOfWeek.SUNDAY)){
            System.out.println("El día fue domingo"); 
        } else {
            System.out.println("El día NO fue domingo");
        }

    }

}

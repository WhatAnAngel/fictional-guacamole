package ejemplooperacionesfechas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EjemploOperacionesFechas {

    public static void main(String[] args) {
        LocalDate incarcelationDate = LocalDate.now();
        LocalDate releaseDate = 
                incarcelationDate.plus(7, ChronoUnit.YEARS).
                        plus(5, ChronoUnit.MONTHS).
                        plus(24, ChronoUnit.DAYS);
        System.out.println("Your release date is: " + releaseDate);       
        
        //Comparar fechas
        if (incarcelationDate.isEqual(releaseDate)){
            System.out.println("Las fechas son iguales");
        } else if(incarcelationDate.isBefore(releaseDate)){
            System.out.println("Fecha encarcelación anterior");
        } else if(incarcelationDate.isAfter(releaseDate)){
            System.out.println("Fecha encarcelación posterior");
        }
        
    }

}

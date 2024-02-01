package actividad20t5pro;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Actividad20T5PRO {

    public static void main(String[] args) {
        
        LocalDate fecha_nacimiento = LocalDate.of(1990, 10, 23);
        long edad = ChronoUnit.YEARS.between(fecha_nacimiento, LocalDate.now());;
        Alumno miAlumno = new Alumno(1, "Luis", "Mas Ros", fecha_nacimiento, 7.5);
        
        System.out.println(miAlumno + " Edad: " + edad);
    }
    
}

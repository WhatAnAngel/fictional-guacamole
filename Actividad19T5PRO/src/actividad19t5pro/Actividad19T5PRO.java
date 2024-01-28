package actividad19t5pro;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Actividad19T5PRO {

    public static void main(String[] args) {
        
        double precioDia = 55;
        double retencion = 12;
        double sueldoFinal, sueldoDia;
        
        LocalDate fechaInicio = LocalDate.of(2023, 1, 1);
        LocalDate fechaFin = fechaInicio.plus(15, ChronoUnit.DAYS);
    
        double diasTrabajados = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
    
        sueldoDia = (precioDia * diasTrabajados);
        sueldoFinal = (sueldoDia * (retencion/100));
    
        System.out.println("Días trabajados: " + diasTrabajados);
        System.out.println("Sueldo a recibir: " + sueldoFinal);
    }

}

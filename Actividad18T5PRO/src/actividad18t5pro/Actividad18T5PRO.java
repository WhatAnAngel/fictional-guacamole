package actividad18t5pro;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Actividad18T5PRO {

    public static void main(String[] args) {

        LocalDate diaTrabajado = LocalDate.of(2023, 5, 18);
        int horasTrabajadas = 8;
        int precioHora; 
        int sueldo;

        DayOfWeek diaSemana = diaTrabajado.getDayOfWeek();

        if ((diaSemana.equals(DayOfWeek.SATURDAY))
                || (diaSemana.equals(DayOfWeek.SATURDAY))) {
            precioHora = 20;
        } else {
            precioHora = 15;
        }
        
        sueldo = horasTrabajadas * precioHora;
        
        System.out.println("El día " + diaTrabajado + 
                " realizó " + horasTrabajadas + " horas.");
        System.out.println("El salario a pagar es: " + sueldo + "€.");

    }

}

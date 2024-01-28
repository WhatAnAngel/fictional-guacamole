package actividad15t5pro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Actividad15T5PRO {

    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now();
        LocalTime horaSalida = LocalTime.now();
        LocalDateTime fechaHoraActual = LocalDateTime.of(fechaActual, horaSalida);

        DateTimeFormatter formatoSalida = DateTimeFormatter.ofPattern("EEEE',' d ' de ' MMMM 'del' yyyy ' a las ' H':'m':'s");

        System.out.println(formatoSalida.format(fechaHoraActual));

    }

}

package ejemplolocaltime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EjemploLocalTime {

    public static void main(String[] args) {
        //Crear fecha de nacimiento
        LocalDate fechaNac = LocalDate.of(1990, 10, 23);
        System.out.println("Fecha de nacimiento: " + fechaNac);
        System.out.println("---------------------------------------------");
        
        //Sacar fecha actual
        System.out.println("Ejemplo LocalDate");
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Día actual: " + fechaActual.getDayOfMonth());
        System.out.println("Mes actual: " + fechaActual.getMonthValue());
        System.out.println("Año actual: " + fechaActual.getYear());
        System.out.println("---------------------------------------------");
        
        //Sacar hora actual
        System.out.println("Ejemplo LocalTime");
        LocalTime tiempoSalida = LocalTime.of(10, 35, 57);
        LocalTime tiempoActual = LocalTime.now();
        System.out.println("Hora actual: " + tiempoActual.getHour());
        System.out.println("Minuto actual: " + tiempoActual.getMinute());
        System.out.println("Segundo actual: " + tiempoActual.getSecond());
        System.out.println("---------------------------------------------");
        
        //Sacar fecha/hora actual
        System.out.println("Ejemplo LocalDateTime");
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        System.out.println("Día actual: " + fechaHoraActual.getDayOfMonth());
        System.out.println("Mes actual: " + fechaHoraActual.getMonthValue());
        System.out.println("Año actual: " + fechaHoraActual.getYear());
        System.out.println("Hora actual: " + fechaHoraActual.getHour());
        System.out.println("Minuto actual: " + fechaHoraActual.getMinute());
        System.out.println("Segundo actual: " + fechaHoraActual.getSecond());
        System.out.println("---------------------------------------------");
        
        //ChronoUnit para calcular tiempo transcurrido
        System.out.println("ejemplo ChronoUnit");
        long tiempo = ChronoUnit.YEARS.between(fechaNac, fechaActual);
        System.out.println("La edad es: " + tiempo + " años");
        System.out.println("---------------------------------------------");
        
        //Formatear fecha desde un String
        System.out.println("Ejemplo DateTimmeFormatter");
        DateTimeFormatter formatoInput = 
                DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoOutput = 
                DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
        String fechaString = "16/08/2016";
        LocalDate mifecha = LocalDate.parse(fechaString, formatoInput);
        System.out.println(formatoOutput.format(mifecha));
        //Lo anterior pero pidiendo el String por teclado
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la fecha en formato dd/MM/yyyy: ");
        String fechaInput = input.nextLine();
        LocalDate fechaFormateada = LocalDate.parse(fechaInput, formatoInput);
        System.out.println("String formateado en LocalDate: " + fechaFormateada);
        System.out.println("LocalDate formateado a un String para poder personalizarlo: " + 
                formatoOutput.format(fechaFormateada));
    }
    
}

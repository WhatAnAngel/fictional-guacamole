package actividad22t5pro;

import java.time.LocalDate;
import java.util.Random;

public class Actividad22T5PRO {

    public static void main(String[] args) {

        String[] nombres = {"Carlos", "Valentina", "Diego", "Ana", "Martín", "María", "Luis", "Eduardo", "Victoria", "Javier", "Gabriela"};
        String[] apellidos = {"Gómez", "Rodríguez", "Fernández", "López", "Martínez", "Pérez", "González", "Sánchez", "Ramírez", "Torres", "García"};

        LocalDate[] fechaAlta = new LocalDate[nombres.length];
        int retencion;

        Random random = new Random();

        for (int i = 0; i < nombres.length; i++) {
            int year = random.nextInt(70) + 1950; // Año aleatorio entre 1950 y 2020
            int month = random.nextInt(12) + 1;  // Mes aleatorio entre 1 y 12
            int day = random.nextInt(28) + 1;    // Día aleatorio entre 1 y 28 (suponiendo todos los meses con 28 días)

            fechaAlta[i] = LocalDate.of(year, month, day);

            if (fechaAlta[i].getYear()<1980){
                retencion = 20;
            } else if ((fechaAlta[i].getYear()>2000)){
                retencion = 15;
            } else retencion = 5;
            
            
            System.out.println(nombres[i] + " " + apellidos[i] + " - Fecha de alta: " + fechaAlta[i] + " - Retención: " + retencion + "%.");
        }
    }
}

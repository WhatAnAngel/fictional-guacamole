package ejemplodate;
 
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
 
public class EjemploDate {
 
    public static void main(String[] args) {
        
        Date mostRecentDate;

        Scanner input = new Scanner(System.in);
        
        System.out.print("¿Qué día del mes es hoy? ");
        int dia = input.nextInt();
        System.out.print("¿Qué mes es hoy? Introduce un número: ");
        int mes = input.nextInt();
        System.out.print("¿En qué año estamos? ");
        int ano = input.nextInt();
        Date fechaDeHoy = new Date ((ano - 1900), (mes - 1), dia);
        
        long milisegundosHoy = fechaDeHoy.getTime();
        
        System.out.print("¿Qué día del mes es hoy? ");
        int dia2 = input.nextInt();
        System.out.print("¿Qué mes es hoy? Introduce un número: ");
        int mes2 = input.nextInt();
        System.out.print("¿En qué año estamos? ");
        int ano2 = input.nextInt();
        Date fechaDeLuego = new Date ((ano2 - 1900), (mes2 - 1), dia2);
        long milisegundosLuego = fechaDeLuego.getTime();
        
        if (milisegundosHoy > milisegundosLuego){
            mostRecentDate = fechaDeHoy;
        } else {
            mostRecentDate = fechaDeLuego;
        }
        
        System.out.println("La fecha más actual es " + mostRecentDate);    
        
    }
 
}

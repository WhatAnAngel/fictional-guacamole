package act4t4ede;
import java.util.Scanner;

public class Act4T4EDE {

    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);
        int diaSemana;
        String tipoDia;
        
        System.out.println("Introduce el día de la semana en formato numérico (1-7)");
        diaSemana = miScanner.nextInt();
        
        if (diaSemana >0 && diaSemana <8){
            if (diaSemana%2==0){
                tipoDia = "Día par";
            } else { 
                tipoDia = "Día impar";
            }
        } else {   
            tipoDia = "Día incorrecto";
        }
        
        System.out.println(tipoDia);
    }

}

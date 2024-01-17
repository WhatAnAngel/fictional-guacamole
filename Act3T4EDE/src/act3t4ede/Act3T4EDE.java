package act3t4ede;
import java.util.Scanner;


public class Act3T4EDE {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        
        int[] numeros = new int[10];
        
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Introduce número " + (i+1));
            numeros[i] = tec.nextInt() * 2;
            System.out.println("[ " + numeros[i] + " ]");
        }
        
    }

}

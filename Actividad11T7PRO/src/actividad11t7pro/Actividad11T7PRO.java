package actividad11t7pro;

import java.util.Arrays;

public class Actividad11T7PRO {

    public static void main(String[] args) {

        int[] p = new int[10];
        int[] v = new int[10];

        int i = 0;
        for (int num : p) {
            num = (int) (Math.random() * 20) + 1;
            if (num > 10) {
                v[i] = num;
                i++;
            }
        }
        
        Arrays.sort(p);
        
        int j = 0;
        System.out.println("Números mayores de 10");
        for (int num : v) {
            if (num != 0) {
                System.out.print("Número: " + num);
                System.out.println(" - Posición en Vector p: " + j);
                j++;
            } else {
                break;
            }
        }


    }

}

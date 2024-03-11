package actividad11t7pro;

import java.util.Arrays;


public class Actividad11T7PRO {

    public static void main(String[] args) {

        int[] p = new int[10];
        int numsMayores10 = 0;

        
        for (int num:p){
            num = (int)(Math.random() * 20) + 1;
            System.out.println(num);
            if (num > 10) numsMayores10++;
        }         
        
        
        Arrays.sort(p);
        
        for (int num:p){
            int[] v = Arrays.copyOfRange(p, numsMayores, 5);
        }
    }

}

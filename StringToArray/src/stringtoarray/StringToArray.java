package stringtoarray;

import java.util.Arrays;


public class StringToArray {

    public static void main(String[] args) {
        //Creamos un string de nombres separados, por ejemplo, por comas
        
        String almunos = "Angel,Alcaniz,10";
        String arrayAlmunos[] = almunos.split(",");
        System.out.println(Arrays.toString(arrayAlmunos));
        
        
    }

}

package recursividad;


public class Ej18T4 {

    public static void main(String[] args) {

        int nums [] = {10, 5, 4};
        int longitud = nums.length - 1;
        System.out.println(sumatorioArray(nums, longitud));
        
    }
    
    public static double sumatorioArray(int nums[], int longitud){
        //caso base
        if(longitud<0){
            return 0;
        //caso recursivo
        } else {
            return nums[longitud] + sumatorioArray(nums, longitud-1);
        }

    }
}

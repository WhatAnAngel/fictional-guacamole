package ej19t4;


public class Ej19T4 {

    public static void main(String[] args) {

        int nums [] = {10, 5};
        int longitud = nums.length - 1;
        System.out.println(multArray(nums, longitud));
        
    }
    
    public static double multArray(int nums[], int longitud){
        //caso base
        if(longitud<0){
            return 1;
        //caso recursivo
        } else {
            return nums[longitud] * multArray(nums, longitud-1);
        }

    }
}
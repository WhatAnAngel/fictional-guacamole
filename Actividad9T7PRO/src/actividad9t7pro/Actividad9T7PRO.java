package actividad9t7pro;


public class Actividad9T7PRO {

    public static void main(String[] args) {
        
        int[] vector = new int[20];
        int numMasAlto = 0, posicionMasAlto = 0, i = 0;

        for (int num:vector){
            num = (int)(Math.random() * 20) + 1;
            System.out.println("El elemento en la posición " + i + " es: " + num);
            if (num > numMasAlto){
                numMasAlto = num;
                posicionMasAlto = i;
            }
            i++;
        }
        
        System.out.println("El número más alto es " + numMasAlto + 
                " y se encuentra en la posición " + posicionMasAlto);
        
    }

}

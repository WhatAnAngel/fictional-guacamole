package actividad10t7pro;

public class Actividad10T7PRO {

    public static void main(String[] args) {

        int[] vector = new int[20];
        int numComparado = -1;
        int i = 0;
        boolean hayNumRepetido = false;
        int numRepetidos = 0;

        for (int num : vector) {
            num = (int) (Math.random() * 20) + 1;
            if (i == 0) {
                numComparado = num;
            } else if (num == numComparado && !hayNumRepetido) {
                hayNumRepetido = true;
                numRepetidos++;
            }
            i++;
        }
        
            
    }
}

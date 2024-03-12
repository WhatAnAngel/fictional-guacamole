package actividad10t7pro;

public class Actividad10T7PRO {

    public static void main(String[] args) {

        //Array de 20 elementos con números aleatorios del 0 al 9
        int[] vector = new int[20];

        //Creamos array de repetidos con 10 posiciones (ya que son del 0 al 9)
        int[] repeticiones = new int[10];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        
        //Como los valores del array predeterminado son 0, si hay repetidos incrementamos
        for (int i = 0; i < vector.length; i++) {
            int posicion = vector[i];
            repeticiones[posicion]++;
        }

        for (int i = 0; i < repeticiones.length; i++) {
            if (repeticiones[i] > 1) {
                System.out.println("El valor " + i
                        + " aparece " + repeticiones[i] + " veces");
            }

        }
    }

}

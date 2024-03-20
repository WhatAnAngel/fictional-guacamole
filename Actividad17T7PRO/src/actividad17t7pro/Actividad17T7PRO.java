package actividad17t7pro;


public class Actividad17T7PRO {

    public static void main(String[] args) {
        
        // Paso 1: Crear los vectores V y P
        int[] V = new int[50];
        int[] P = new int[20];
        
        // Paso 2: Dar valores aleatorios a los vectores
        for (int i = 0; i < V.length; i++) {
            V[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < P.length; i++) {
            P[i] = (int) (Math.random() * 100);
        }
        
        //Paso 3: Generar M(50,20)
        int[][] M = new int[V.length][P.length];
        
        for (int i = 0; i < V.length; i++) {
            for (int j = 0; j < P.length; j++) {
                M[i][j] = V[i] * P[j];
            }
        }
        
        //Paso 4: Mostrar la matriz
        for (int[] vector : M) {
            for (int j = 0; j < vector.length; j++) {
                System.out.print(vector[j] + "\t");
            }
            System.out.println();
        }
    }

}

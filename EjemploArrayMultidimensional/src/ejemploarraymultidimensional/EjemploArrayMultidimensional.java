package ejemploarraymultidimensional;


public class EjemploArrayMultidimensional {

    public static void main(String[] args) {
        
        int[][] datos = {            
                            {5, 7, 2, 1},
                            {2, 9, 1, 7},
                            {2, 4, 6, 8}
                        };
        //Recorremos con un bucle anidado
        for(int i=0; i<datos.length; i++){
            for(int j=0; j<datos[i].length; j++){
                System.out.print(datos[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");
        //Recorremos el array multidimensional con un bucle mejorado
        for(int[] fila:datos){
            for(int valor:fila){
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
        
    }

}

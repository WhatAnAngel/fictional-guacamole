package ejemploarrays;

import java.util.Arrays;

public class EjemploArrays {

    public static void main(String[] args) {

        //Creamos un array de temperaturas        
        double temperaturas[] = {10.5, 6.9, 14.6, 18.4, 14.0, 17.8, 19.2};

        //Cambiamos temperatura de la posicion 0        
        temperaturas[0] = 3.5;

        //Mostramos temperatura        
        System.out.println(temperaturas[0]);

        System.out.println("----------------------------------");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println(temperaturas[i]);
        }

        System.out.println("----------------------------------");
        for (double temperatura : temperaturas) {
            System.out.println(temperatura);
        }

        //Numero de elementos
        System.out.println("----------------------------------");
        System.out.println(temperaturas.length);

        //Clonar array 
        double[] temperaturasClonadas = temperaturas.clone();

        //Mostrar contenido del array sin bucle
        System.out.println("----------------------------------");
        System.out.println(Arrays.toString(temperaturas));
        System.out.println(Arrays.toString(temperaturasClonadas));

        //Comprobar que los arrays contienen los mismos datos
        System.out.println("----------------------------------");
        if (Arrays.equals(temperaturas, temperaturasClonadas)) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Las arrays NO son iguales");
        }
        //.equals() sin el Arrays compararía si son la misma instancia, no si tiene los mismos valores

        temperaturas[0] = 10.5;

        //Comprobar que los arrays contienen los mismos datos después de cambiar un valor
        if (Arrays.equals(temperaturas, temperaturasClonadas)) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Las arrays NO son iguales");
        }

        //Ordenar array
        System.out.println("----------------------------------");
        Arrays.sort(temperaturasClonadas);
        System.out.println(Arrays.toString(temperaturasClonadas));

        //Ordenar posiciones concretas (desde la 2 hasta antes de la 5, o sea la 4)
        System.out.println("----------------------------------");
        System.out.println(Arrays.toString(temperaturas));
        Arrays.sort(temperaturas, 2, 5);
        System.out.println(Arrays.toString(temperaturas));

        //Búsqueda binaria: necesito el array ordenado
        System.out.println("----------------------------------");
        System.out.println("Posición del 18.4: "
                + Arrays.binarySearch(temperaturasClonadas, 18.4));

        //Array de nombres de alumnos
        String nombres[] = {"Luis", "Pedro", "Ana", "Rosa", "Angel"};

        //Arrays.fill() rellena las posiciones de un array con un valor
        System.out.println("----------------------------------");
        Arrays.fill(temperaturasClonadas, -1);
        System.out.println(Arrays.toString(temperaturasClonadas));

        //También sobre parte del array
        System.out.println("----------------------------------");
        Arrays.fill(nombres, 1, 4, "Nada");
        System.out.println(Arrays.toString(nombres));

        //Arrays.CopyOf() copia un array en otro modificando la cantidad de posiciones
        System.out.println("----------------------------------");
        String masNombres[] = Arrays.copyOf(nombres, 7);

        masNombres[5] = "Roberto";
        masNombres[6] = "Roberta";

        System.out.println(masNombres);

        //CopyOfRange() copia parte de un array en otro
        String menosNombres[] = Arrays.copyOfRange(masNombres, 2, 5);

        System.out.println(Arrays.toString(menosNombres));

        //arraycopy(Origen, posicionOrigen, destino, posicionDestino, elementos)
        int[] origen = {1, 22, 32, 34, 5, 6};
        int[] destino = {2, 3, 1, 56, 34, 23, 44, 69, 420};

        System.arraycopy(origen, 1, destino, 4, 3);

        System.out.println(Arrays.toString(destino));
    }

}

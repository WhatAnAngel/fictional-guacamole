package actividad53t7pro;

import java.util.ArrayList;
import java.util.Iterator;

public class Actividad53T7PRO {

    public static void main(String[] args) {
        //Crear el ArrayList
        ArrayList<Integer> misNumeros = new ArrayList<>();

        //Añadir los valores
        misNumeros.add(1);
        misNumeros.add(6);
        misNumeros.add(3);
        misNumeros.add(2);
        misNumeros.add(0);
        misNumeros.add(4);
        misNumeros.add(5);

        //Mostrar los datos
        System.out.println(misNumeros.toString());

        //Valor en posicion 5
        System.out.println(misNumeros.get(5));

        //Añadir 8 en posicion 4
        misNumeros.add(4, 8);
        System.out.println(misNumeros.get(4));

        //Cambiar valor posicion 1 por 9
        misNumeros.set(1, 9);
        System.out.println(misNumeros.get(1));

        //Eliminar el valor 5
        misNumeros.remove(new Integer(5));

        //Eliminar valor en posicion 3
        misNumeros.remove(3);

        //Recorrer array con bucle for
        System.out.println("Recorrer array con for:");
        for (int numero : misNumeros) {
            System.out.println(numero);
        }

        //Recorrer array con bucle iterator
        System.out.println("Recorrer array con iterator:");
        Iterator<Integer> bucle = misNumeros.iterator();
        while (bucle.hasNext()) {
            System.out.println(bucle.next());
        }
        
        //Comprobar si existe el elemento 0
        System.out.println("¿Existe elemento 0?: " + misNumeros.contains(0));
        
        //Comprobar si existe el elemento 7
        System.out.println("¿Existe elemento 0?: " + misNumeros.contains(7));
        
        //Clonar el ArrayList en copiaMisNumeros
        ArrayList<Integer> copiaArrayList = (ArrayList<Integer>)misNumeros.clone();

        //Añadir el elemento 9
        copiaArrayList.add(9);
        
        //Mostrar la primera ocurrencia del elemento 9
        System.out.println(copiaArrayList.indexOf(9));
        
        //Mostrar última ocurrencia de 9
        System.out.println(copiaArrayList.lastIndexOf(9));
        
        //Borrar todos los elementos del arraylist clonado
        copiaArrayList.clear();
        
        //Comprobar si está vacío
        System.out.println("¿Está vacío? " + copiaArrayList.isEmpty());
        
        //Convertir misNumeros en un array y recorrerlo con un bucle mejorado
        System.out.println("Convertir misNumeros en un array y recorrerlo con un bucle mejorado");
        Integer[] numeritos = new Integer[misNumeros.size()];
        misNumeros.toArray(numeritos);
        for (int numerito : numeritos){
            System.out.println(numerito);
        }
    }
}

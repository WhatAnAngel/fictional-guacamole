package ejemploarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class EjemploArrayList {

    public static void main(String[] args) {

        //Creamos el ArrayList de alumnos
        ArrayList<String> listaAlumnos = new ArrayList<>();
        
        //Mostramos la cantidad de elementos del ArrayList
        System.out.println("Elementos: " + listaAlumnos.size());
        listaAlumnos.add("Luis");
        listaAlumnos.add("Pedro");
        listaAlumnos.add("Ana");
        
        //Mostrar los datos en bruto del ArrayList
        System.out.println(listaAlumnos.toString());
        
        //Añadir en la posicion 2 a Rosa
        listaAlumnos.add(2,"Rosa");
        System.out.println(listaAlumnos.toString());
        System.out.println("Elementos: " + listaAlumnos.size());
        
        //Recuperamos un elemento con .get()
        System.out.println("Posición 2: " + listaAlumnos.get(2));
        
        //Modificamos con .set()
        listaAlumnos.set(2, "Marta");
        System.out.println("Posición 2: " + listaAlumnos.get(2));
        
        //Eliminamos con .remove()
        listaAlumnos.remove("Marta");
        System.out.println(listaAlumnos.toString());
        
        //.contains te dice si existe un elemento
        if(listaAlumnos.contains("Pedro")){
            System.out.println("Existe");
        } else{
            System.out.println("No existe");
        }
        
        //.indexOf() posicion de un elemento en un ArrayList la primera vez que
        // lo encuentra
        int posicion = listaAlumnos.indexOf("Pedro");
        System.out.println("¿Pedro?: " + posicion);
        posicion = listaAlumnos.indexOf("Ana");
        System.out.println("¿Ana?: " + posicion);
        
        //Método .lastIndexOf() última vez que encuentra el elemento
        listaAlumnos.add("Pedro");
        System.out.println(listaAlumnos.toString());
        posicion = listaAlumnos.lastIndexOf("Pedro");
        System.out.println("¿Último Pedro?: " + posicion);
        
        //isEmpty() devuelve si el arrayList está vacío
        System.out.println("¿Está vacío?: " + listaAlumnos.isEmpty());
        
        //Método .clear() vacía el ArrayList
        listaAlumnos.clear();
        System.out.println("¿Está vacío?: " + listaAlumnos.isEmpty());
        
        //Insertamos elementos
        listaAlumnos.add("Mario");
        listaAlumnos.add("Alejandro");
        listaAlumnos.add("JM");
        System.out.println(listaAlumnos.toString());
        
        //.clone() clona el ArrayList
        ArrayList<String> listaProfesores = (ArrayList<String>)listaAlumnos.clone();
        System.out.println(listaAlumnos.toString());
        
        //Recorrer ArrayList
        for(String profesor : listaProfesores){
            System.out.println(profesor);
        }
        
        //Recorrer con iterador
        Iterator<String> bucle = listaProfesores.iterator();
        while(bucle.hasNext()){
            System.out.println(bucle.next());
        }
        
        //Convertir arrayList en Array con toArray()
        String[] nombres = new String[listaProfesores.size()];
        listaProfesores.toArray(nombres);
        System.out.println(Arrays.toString(nombres));
    }

}

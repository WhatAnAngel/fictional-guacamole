package actividad26t4pro;

import multimedia.*;

public class Actividad26T4PRO {

    public static void main(String[] args) {

        /* Creamos un objeto de tipo ListaMultimedia, que es un array de 10 posiciones*/
        ListaMultimedia miLista = new ListaMultimedia(10);

        /* He creado un array de longitud 3 para meter las 3 películas que voy a crear
        y luego es más fácil para meterlo en miLista*/
        Pelicula[] peliculas = new Pelicula[3];

        /* Tres películas que las creo metiéndolas en el array */
        peliculas[0] = new Pelicula("Pepe", "Pepa", "Papa", "Pepita", "DVD", 120);
        peliculas[1] = new Pelicula("Pepe", "Pepa", "Papas", "Pepitas", "DVD", 120);
        peliculas[2] = new Pelicula("Pepe", "Pepa", "Papasa", "Pepitasa", "DVD", 120);

        /* Metemos cada elemento de este array de películas en la lista principal de
        elementos multimedia miLista (pelicula es un hijo de multimedia)*/
        for (Multimedia pelicula : peliculas) {
            miLista.add(pelicula);
        }

        /* Imprimimos el contenido de miLista */
        System.out.println(miLista);

        /* Creamos otra película más pero suelta, sin meterla en el array de pelis
        Y a esta le damos datos pero dos de ellos, el título y el autor, se los
        damos cogiéndolos de otra película llamándolos con el método get */
        Pelicula miPelicula = new Pelicula
            ("Ramón", "Ramona", peliculas[1].getTitulo(),
            peliculas[1].getAutor(), "wav", 120);

        /* Probamos el indexOf de esta película, que al no haberla añadido a miLista aún
        devolverá -1 */
        int index = miLista.indexOf(miPelicula);
        System.out.println(index);

        /* Ahora la añadimos a miLista */
        miLista.add(miPelicula);

        /* Y esta vez el indexOf nos dirá el índice en el array miLista de esta pelicula*/
        index = miLista.indexOf(miPelicula);
        System.out.println(index);

        /* Ahora le decimos un número y usamos el getMultimedia() para que nos diga
        el elemento que hay en la posición del array de ese número (yo he usado el entero index) */
        Multimedia peli = miLista.getMultimedia(index);

        /* Mostramos la película que ha encontrado anteriormente y su index*/
        System.out.println("Película: " + peli + "\nIndex: " + index);
        
        ListaMultimedia miListaDiscos = new ListaMultimedia(10);
        
        miListaDiscos.add(new Disco("Pop", "TituloDisco1", "AutorDisco1", "mp3", 4));
        miListaDiscos.add(new Disco("Pop", "TituloDisco1", "AutorDisco1", "mp3", 5));
        miListaDiscos.add(new Disco("Pop", "TituloDisco1", "AutorDisco1", "mp3", 6));
        
        System.out.println(miListaDiscos);
        
        Disco miDisco = new Disco("Pop", "TituloDisco1", "AutorDisco1", "mp3", 6);
        
        System.out.println("Posición miDisco: " + miListaDiscos.indexOf(miDisco));
        
        int posicionDisco = miListaDiscos.indexOf(miDisco);
        
        System.out.println(miListaDiscos.getMultimedia(posicionDisco));
    }

}

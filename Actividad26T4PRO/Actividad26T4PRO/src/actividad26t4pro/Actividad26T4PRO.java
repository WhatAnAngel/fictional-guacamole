package actividad26t4pro;
import multimedia.*;

public class Actividad26T4PRO {

    public static void main(String[] args) {
       
        ListaMultimedia miLista = new ListaMultimedia(10);
        
        Pelicula[] peliculas = new Pelicula[3];
        
        miLista.getMultimedia();
        
        peliculas[0] = new Pelicula("Pepe", "Pepa", "Papa", "Pepita", "DVD", 120);
        peliculas[1] = new Pelicula("Pepe", "Pepa", "Papas", "Pepitas", "DVD", 120);
        peliculas[2] = new Pelicula("Pepe", "Pepa", "Papasa", "Pepitasa", "DVD", 120);
    
        for (Multimedia pelicula : peliculas) {
            miLista.add(pelicula);
        }
        
        System.out.println(miLista);
        
        Pelicula miPelicula = new Pelicula
        ("Ramón", "Ramona", peliculas[1].getTitulo(), 
         peliculas[1].getAutor(), "wav", 120);
        
        miLista.add(miPelicula);

        int index = miLista.indexOf(miPelicula);
        System.out.println(index);
        
        Multimedia peli = miLista.getMultimedia(index);
        
        System.out.println("Película: " + peli + "\nIndex: " + index);
    }
    
}

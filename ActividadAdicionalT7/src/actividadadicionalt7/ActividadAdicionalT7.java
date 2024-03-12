package actividadadicionalt7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ActividadAdicionalT7 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String lineaFichero;
        
        int numLineas = 0;
        // Nombre literal del fichero a leer
        String file = "temperaturas.csv";

        // Abres la movida del FileFeader y el BufferedReader (...)
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        // (...) y lo usas para saber el número de líneas
        while ((lineaFichero = br.readLine()) != null) {
            numLineas++;
        }

        // Creas el array de temperaturas del tamaño del num del líneas del csv
        Temperatura[] temperaturas = new Temperatura[numLineas];

        // Hay que cerrar el BufferedReader actual o le da un chungo y explota
        br.close();

        // Vuelves a abrir el archivo y el BufferedReader para leerlo
        fr = new FileReader(file);
        br = new BufferedReader(fr);

        int i = 0; // Nunca sé dónde declarar los contadores así que lo meto aquí
        
        /* Bucle que lee cada línea del fichero csv, crea un objeto tipo Temperatura
        pasándole la línea como parámetro, y lo mete en el array de temperaturas
        que de hecho se llama temperaturas */
        while ((lineaFichero = br.readLine()) != null) {
            // En cada vuelta sobreescribe el valor de "temp" por decirlo así
            Temperatura temp = new Temperatura(lineaFichero);
            temperaturas[i] = temp; /* Mete en la posición "i" del array el valor 
            que tenga en esa iteración la variable "temp" */
            i++;
        }

        // Pedimos una ubicación por teclado
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una ubicación: ");
        String ubicacionIntroducida = sc.nextLine();
        
<<<<<<< HEAD
=======
        br.close();
        fr.close();

        // Pedimos una ubicación por teclado
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una ubicación: ");
        String ubicacionIntroducida = sc.nextLine();
        
>>>>>>> daf18df3b0133a880d389c8a2dd5381f5d4fee31
        /* Por cada objeto de tipo "Temperatura" (al cual llamaremos "tempr", por ejemplo, 
        para referirnos a él dentro del bucle) que hay en el array 
        de objetos de tipo "Temperatura" que se llama "temperaturas" (...) */
        for (Temperatura tempr : temperaturas) {
            
            // (...) pilla el valor de su atributo "ubicacion" usando el getUbicacion
            // y lo compara con el valor de la ubicación introducida por teclado
            if ((tempr.getUbicacion().toLowerCase()) // Los pasa a minúsculas para evitar errores
                    .equals(ubicacionIntroducida.toLowerCase())) {
                
                // Si coinciden, imprime el toString() de ese objeto Temperatura
                System.out.println(tempr.toString());
            }
        }

    }

}
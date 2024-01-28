package actividad10t1pro;
/* Ejercicio 10. Realiza un programa en Java que genere una letra de forma 
aleatoria y nos diga verdadero o falso si es vocal o consonante. */

public class Actividad10T1PRO {

    public static void main(String[] args) {
        
        char vocales[] = {'a', 'e', 'i', 'o', 'u'};
        
        int randomNumber = (int) (Math.random() * 26) + 'a';
        
        char letra = (char) randomNumber;
        
        boolean esVocal = false;
        
        int i = 0;
        
        for (i = 0; i< vocales.length; i++) {
            if (letra == vocales [i]) {
                esVocal = true;
            }
        } 
        
        System.out.println(letra + " es vocal: " + esVocal);
    }

}

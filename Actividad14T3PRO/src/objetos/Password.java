package objetos;
import java.util.*;

public class Password {

//    atributos:
    String clave = "";
    
//    constructor:
    public Password(){
        this.clave = generarClave(8);
    }
    
//    generar clave
    private String generarClave(int longitud) {
        
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//      creamos una instancia de la clase random
        Random random = new Random();
        
//      creamos una instancia de la clase stringbuilder y la llamamos sb
//      le pasamos de parametro la longitud
        StringBuilder sb = new StringBuilder(longitud);

//      bucle for para coger una letra random de la cadena de caracteres
//      el numero de veces que indique la longitud
//      y despues las appendee en el stringbuilder
        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
//          la sentencia anterior está diciendo que el indice 
//          del que se va a coger un caracter va a ser 
//          un numero random de entre 0 y la longitud del string

            sb.append(caracteres.charAt(index));
        }

        return sb.toString();
       }
}
   

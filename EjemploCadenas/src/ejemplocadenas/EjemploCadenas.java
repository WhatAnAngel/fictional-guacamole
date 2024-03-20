package ejemplocadenas;

import java.util.Arrays;


public class EjemploCadenas {

    public static void main(String[] args) {
        
        String nombre = "Angel";
        String apellido = "Alcañiz";
        String profesion = "Consultor informático";
        
        // .lenght()
        //Longitud
        System.out.println("nombre.lenght()");
        System.out.println("Longitud: " + nombre.length());
        System.out.println("-------------------------------------------------");
        
        
        // .concat()
        //Concatenar
        System.out.println("nombre.concat(apellido)");
        String nombreCompleto = nombre.concat(apellido);
        System.out.println("Nombre completo: " + nombreCompleto);
        
        System.out.println("");
        
        System.out.println("nombre + apellido");
        String nombreCompletoAlt = nombre + apellido;
        System.out.println("Nombre completo: " + nombreCompletoAlt);
        System.out.println("-------------------------------------------------");
        
        
        // .trim()
        //Eliminar espacios sobrantes delante y detrás
        System.out.println("poblacionProvincia=");
        String poblacionProvincia = "           Burjassot, Valencia           ";
        System.out.println(poblacionProvincia + ".");
        
        System.out.println("");
        
        System.out.println("poblacionProvincia.trim()");
        System.out.println(poblacionProvincia.trim() + ".");
        System.out.println("-------------------------------------------------");
        
        
        // .toLowerCase() y .toUpperCase()
        //Convertir a minúsculas y mayúsculas
        System.out.println("nombre.toLowerCase()");
        System.out.println(nombre.toLowerCase());
        
        System.out.println("");
        
        System.out.println("nombre.toUpperCase()");
        System.out.println(nombre.toUpperCase());
        System.out.println("-------------------------------------------------");
        
        
        // .replace()
        //Reemplazar un carácter o caracteres con otro
        System.out.println("Con chars:");
        System.out.println("nombreCompleto.replace(\'ñ\', \'n\')");
        System.out.println(nombreCompleto.replace('ñ', 'n'));
        
        System.out.println("");
        
        System.out.println("Con Strings: ");
        System.out.println("nombreCompleto.replace(\"ñiz\", \"nis\")");
        System.out.println(nombreCompleto.replace("ñiz", "nis"));
        System.out.println("-------------------------------------------------");
        
        
        // .substring()
        //Subtrings
        System.out.println("profesion = Consultor informático");
        
        System.out.println("");
        
        System.out.println("profesion.substring(10) // profesion.substring(10, profesion.lenght)");
        System.out.println(profesion.substring(10));
        
        System.out.println("");
        
        System.out.println("profesion.substring(5, 10)");
        System.out.println(profesion.substring(5, 10));
        System.out.println("-------------------------------------------------");
        
        
        // .startsWith()
        //Booleano que devuelve si empieza por ese String
        System.out.println("profesion = Consultor informático");
        System.out.println("profesion.startsWith(\"Consultor\")");
        System.out.println(profesion.startsWith("Consultor"));
        
        System.out.println("");
        
        System.out.println("profesion.startsWith(\"inf\")");
        System.out.println(profesion.startsWith("inf"));
        System.out.println("-------------------------------------------------");
        
        
        // .endsWith()
        //Booleano que devuelve si acaba por ese String
        System.out.println("profesion.endsWith(\"tico\")");
        System.out.println(profesion.endsWith("tico"));
        
        System.out.println("");
        
        System.out.println("profesion.endsWith(\"tuto\")");
        System.out.println(profesion.endsWith("tuto"));
        System.out.println("-------------------------------------------------");
        
        
        // .chatAt()
        // Devuelve el caracter(char) de una posición
        System.out.println("profesion.charAt(3)");
        System.out.println(profesion.charAt(3));
        System.out.println("-------------------------------------------------");
        
        
        // .indexOf()
        // Devuelve en qué posición aparece un texto en otro
        System.out.println("profesion = Consultor informático");
        System.out.println("profesion.indexOf(\"t\")");
        System.out.println(profesion.indexOf("t"));
        
        System.out.println("");
        
        System.out.println("(String, int: desde dónde busca)");
        System.out.println("profesion.indexOf(\"profesion.indexOf(\"t\", 10)\");");
        System.out.println(profesion.indexOf("t", 10));
        System.out.println("-------------------------------------------------");
        
        
        // .lastIndexOf()
        //En qué posición aparece la última coincidencia de un texto en otro
        System.out.println("profesion.lastIndexOf(\"t\")");
        System.out.println(profesion.lastIndexOf("t"));
        System.out.println("-------------------------------------------------");
        
        
        // toCharArray()
        //Convierte un String en array de tipo char
        System.out.println("char[] letras;\n" +
        "letras = profesion.toCharArray();");
        
        char[] letras;
        letras = profesion.toCharArray();
        System.out.println(Arrays.toString(letras));
        System.out.println("-------------------------------------------------");
        
        
        // valueOf()
        //Convertir int a String
        System.out.println("int altura = 178;\n" +
        "String alturaT = String.valueOf(altura);\n" +
        "alturaT.length()");
        
        int altura = 178;
        String alturaT = String.valueOf(altura);
        System.out.println(alturaT.length());
        System.out.println("-------------------------------------------------");
    }

}

package actividades43.pkg47pro;


public class Actividades4347PRO {

    public static void main(String[] args) {
        
        String nombre = "Agencia de Seguridad Nacional para la Defensa";
        
        //43
        System.out.println("43: ");
        System.out.println(nombre.substring(nombre.indexOf("Nacional")));
        System.out.println(nombre.substring(nombre.indexOf("S")));

        //44
        System.out.println("44: ");
        System.out.println("Posición de la palabra \"Seguridad\": " + 
                nombre.indexOf("Seguridad"));
        System.out.println("Última posición del carácter \"a\": " + 
                nombre.lastIndexOf("a"));
        
        //45
        System.out.println("45: ");
        String nombre2 = "Agencia de Seguridad Nacional";
        System.out.println("Las cadenas son iguales: " + nombre.equals(nombre2));

        //46
        System.out.println("46: ");
        String resultado = nombre.substring(nombre.indexOf("Nacional"), (nombre.indexOf("Nacional") + 17));
        System.out.println(resultado);
        System.out.println("Longitud: " + resultado.length());
        
        //47
        System.out.println("47: ");
        System.out.println(nombre.replace("Seguridad", "Tramitacion"));
    }

}

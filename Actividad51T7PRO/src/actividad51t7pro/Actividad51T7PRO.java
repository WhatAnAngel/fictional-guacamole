package actividad51t7pro;


public class Actividad51T7PRO {

    public static void main(String[] args) {

        String cadena = "3.500,00 €";
        String delante = "";
        while(cadena.length()<20){
            while(cadena.length() < (cadena.length()+(20-cadena.length())/2)){
                delante += "#";
            }
            cadena+="#";
        }
        System.out.println(cadena);
    }

}

package actividad51t7pro;

public class Actividad51T7PRO {

    public static void main(String[] args) {

        String cadena = "3.500,00 €";
        String almohadilla = "#";

        while (cadena.length() < 20) {
            cadena = (almohadilla.concat(cadena)); //aquí se la pone delante
            if (cadena.length() < 20) {
                cadena = cadena.concat(almohadilla); //aquí se la pone detrás
            }
        }
        System.out.println(cadena);
        System.out.println("Total caracteres: " + cadena.length());
    }

}

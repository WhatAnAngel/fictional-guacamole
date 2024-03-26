package actividad48t7pro;


public class Actividad48T7PRO {

    public static void main(String[] args) {

        String fechaHora = "Fecha: 23-12-2012 Hora: 19,45,00";
        fechaHora = fechaHora.replace(",", ":");
        System.out.println(fechaHora.replace("-", "/"));
    }

}

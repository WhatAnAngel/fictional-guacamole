package inmobiliaria;
import inmobiliaria.inmuebles.*;

public class Inmobiliaria {

    public static void main(String[] args) {
        
        //Creamos varias instancias
        Chalet miChalet = new Chalet(120, true, true, "5323556D", "Chalet", 
                "Paiporta", 500, 6, 3, 2, 30000);
        Chalet chaletColetas = new Chalet(120, false, true, "5366556D", "Chalet", 
        "Madiz", 5000, 15, 9, 3, 900000);
        Vivienda miVivienda = new Vivienda(180, true, false, "9999877X", "Vivienda", 
        "Castellón", 120, 2, 2, 0, 90000);
        Vivienda especulacion = new Vivienda(180, false, true, "420420F", "Vivienda", 
        "Barcelona", 100, 4, 1, 1, 70000);
        
        System.out.println(miChalet);
        System.out.println(chaletColetas);
        System.out.println(miVivienda);
        System.out.println(especulacion);
        
        miChalet.comision();
        chaletColetas.comision();
        miVivienda.comision();
        especulacion.comision();
        
        System.out.println("El precio final es de: " + miChalet.getPrecio());
        System.out.println("El precio final es de: " + chaletColetas.getPrecio());
        System.out.println("El precio final es de: " + miVivienda.getPrecio());
        System.out.println("El precio final es de: " + especulacion.getPrecio());
    }

}

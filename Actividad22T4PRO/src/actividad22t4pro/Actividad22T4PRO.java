package actividad22t4pro;

import concesionario.*;

public class Actividad22T4PRO {

    public static void main(String[] args) {

        Coche miCoche = new Coche(false, true, true, "gasolina", "55555555G", "Fiat", "500", "rojo", 2000, 1000, 150, 5450);
        Moto miMotico = new Moto(true, 4, "correa", "7878690G", "Suzuki", "nosenotengo", "negro", 2000, 1000, 150, 4450);
        Autobus miAutobus = new Autobus(80, true, "55555555G", "Fiat", "500", "amarillo", 2000, 1000, 150, 8450);

        System.out.println(miCoche);
        System.out.println("Precio final coche: " 
                + (miCoche.calculaIVA() + miCoche.getPrecio()));
        
        System.out.println(miMotico);
        System.out.println("Precio final moto: " 
                + (miMotico.calculaIVA() + miMotico.getPrecio()));
        
        System.out.println(miAutobus);
        System.out.println("Precio final autobús: " 
                + (miAutobus.calculaIVA() + miAutobus.getPrecio()));
    }

}

package actividad17t3;
import objetos.*;
import static objetos.Hospital.mostrarNumHospitales;

public class Actividad17T3 {

    public static void main(String[] args) {
        Hospital hospitalRibera = new Hospital ("O6679", "Hospital de la Ribera", "97663289", 130, 40);
         hospitalRibera.setHabTotales(100);
         System.out.println("Habitaciones totales en " + hospitalRibera.getNombreHospital() + ": " +  
                 hospitalRibera.getHabTotales());
         
         System.out.println("Se ha realizado el ingreso: " + hospitalRibera.ingreso());
         
         System.out.println("Habitaciones ocupadas en " + hospitalRibera.getNombreHospital() + ": " +  
         hospitalRibera.getHabOcupadas());
         
        System.out.println("Se ha realizado el alta: " + hospitalRibera.alta());
         
         System.out.println("Habitaciones ocupadas en " + hospitalRibera.getNombreHospital() + ": " +  
         hospitalRibera.getHabOcupadas());
         
         System.out.println("Datos del hospital: " + hospitalRibera.mostrarHospital());
         
        mostrarNumHospitales();
         
        }
        
    }

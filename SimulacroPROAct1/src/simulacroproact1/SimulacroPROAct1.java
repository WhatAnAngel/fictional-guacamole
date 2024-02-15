package simulacroproact1;
import java.time.LocalDate;
import java.time.Month;
import objetos.*;

public class SimulacroPROAct1 {
    
    public static void main(String[] args) {
        
        Telefono[] misTelefonos = new Telefono[3];        

        misTelefonos[0] = new Movil("Yoigo", "Motorola", "A2", LocalDate.of(2007, Month.MARCH, 12), 100.5);
        misTelefonos[1] = new Fijo(100.5, "MarcaA", "ModeloA", LocalDate.now(), 150.5);
        misTelefonos[2] = new Fijo(15.0, "MarcaB", "ModeloB", LocalDate.now(), 105.0);    
    
        ((Movil)misTelefonos[0]).setOperador("Orange");
        ((Fijo)misTelefonos[1]).setLongitudCable(110.0);
        
        for (Telefono telefono : misTelefonos){
            System.out.println(telefono);
        }   
    }
}

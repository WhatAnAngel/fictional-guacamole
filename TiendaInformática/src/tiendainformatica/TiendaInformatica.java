package tiendainformatica;
import objetos.*;
import static objetos.Portatil.*;

public class TiendaInformatica {

    public static void main(String[] args) {
    // Creamos instancia portAula1
    Portatil portAula1 = new Portatil();
    portAula1.setCodigo("HP4300");
    portAula1.setDescripcion("I3 4GB RAM 500 GB Disco Duro");
    portAula1.setUnidades(33);
    portAula1.setPrecio(1050.66);
    portAula1.setDefectuoso(false);
    
    //Creamos instancia portAula2
    
    Portatil portAula2 = new Portatil("Asus Z450", "I5 8GB RAM 1TB Disco Duro", 100, 980.56, false);
    
    portAula1.anadeDefectuoso();
    
    //es un método general de todas las instancias, por eso se llama a la instancia tal cual y no a un objeto concreto
    
    muestraNumDefectuosos() ;
   
    //portAula2 defectuoso
    
    portAula2.anadeDefectuoso();
    
    muestraNumDefectuosos();
    
    //Arreglado portatil 2
    
    portAula2.eliminadefectuoso();
    
    muestraNumDefectuosos();
    
    //Mostrar todos los datos
    
        System.out.println(portAula1.muestraPortatil());
        System.out.println(portAula2.muestraPortatil());
    
    }

}

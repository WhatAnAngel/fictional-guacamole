package actividad18t3;
<<<<<<< HEAD
import objetos.*;

public class Actividad18T3 {

    public static void main(String[] args) {
    Medico medicoDigestivo = new Medico ("8978",  "Belén", "González",  "Digestivo" , 2560.50);
    
        
        

=======


public class Actividad18T3 {


    public static void main(String[] args) {

        Medico medicoDigestivo = new Medico("123456", "Digestivo", 
            "María", "Gutiérrez", "50607080A", "Calle Árbol Azul, 53", "46200",
            "Godella","666777888","11/11/1999", 2100);
        
        Medico medicoTraumatologo = new Medico("654321", "Traumatólogo", 
            "Mario", "Ramírez", "80706050Z", "Calle Árbol Rojo, 35", "46100",
            "Burjassot","677877988","12/12/1989", 2050);
        
        //Cambia el sueldo del médico traumatólogo
        
        medicoTraumatologo.setSueldo(2200);
        
        //Muestra el sueldo
        
        System.out.println("El sueldo de " + medicoTraumatologo.getNombre() + 
        " "  + medicoTraumatologo.getApellidos() + ", " + 
        medicoTraumatologo.getEspecialidad() + ", es: " + 
        medicoTraumatologo.getSueldo() + " euros");
        
        //Cambia DNI digestivo
        
        medicoDigestivo.setDni("99009900A");
        
        //Muestra DNI digestivo
        
        System.out.println("El DNI de " + medicoDigestivo.getNombre() + 
        " " + medicoDigestivo.getApellidos() + ", " + 
        medicoDigestivo.getEspecialidad() + ", es: " + 
        medicoDigestivo.getDni());
            
        //Calculamos retenciones
        
        double retencionDig = medicoDigestivo.retencionMedico(5);
        double retencionTrau = medicoTraumatologo.retencionMedico(10);
        
        //Mostrar datos
        
        System.out.println(medicoDigestivo.mostrarDatos() + " euros - " + 
        retencionDig + " euros - " + (medicoDigestivo.getSueldo() - 
        retencionDig) + " euros");
        
        System.out.println(medicoTraumatologo.mostrarDatos() + " euros - " +  
        retencionTrau + " euros - " + (medicoTraumatologo.getSueldo() - 
        retencionTrau) + " euros");
>>>>>>> 9ff85f11c269ec7825a321e424d86c5c59c3bd9d
    }

}

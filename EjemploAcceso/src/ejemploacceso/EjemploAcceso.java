package ejemploacceso;
import objetos.Alumno;


public class EjemploAcceso {

    public static void main(String[] args) {
        
        //    desde fuera del paquete se puede acceder solo al public
        Alumno miAlumno = new Alumno();
        System.out.println(miAlumno.nota);
        
    }

}

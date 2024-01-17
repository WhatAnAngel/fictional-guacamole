package objetos;

public class Personas {
    public void ejemplo() {
        Alumno miAlumno = new Alumno();
        
        //    desde cualquier clase del mismo paquete se puede acceder al public y al protected
        System.out.println(miAlumno.nota);
        System.out.println(miAlumno.nombre);
    }
    
}

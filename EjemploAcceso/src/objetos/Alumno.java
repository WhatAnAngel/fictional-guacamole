package objetos;

public class Alumno {

    private int nia;
    protected String nombre;
    public double nota;
    
    
//    independientemente del tipo, dentro de la propia clase se pueden acceder siempre
    public void miAcceso(){
        System.out.println(this.nia);
        System.out.println(this.nombre);
        System.out.println(this.nota);
    }
}

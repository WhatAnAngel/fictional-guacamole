package objetos;

public class Medico {
    
    private String codMedico, nombre, apellidos, especialidad;
    private double sueldo;
    
    public Medico(String codMedico, String nombre, String apellidos, String especialidad, double precio){
        this.codMedico = codMedico;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }

    public String getCodMedico() {
        return codMedico;
    }
    public void setCodMedico(String codMedico) {
        this.codMedico = codMedico;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String mostrarDatos(){
       String resultado = this.codMedico + " - "+ this.nombre + " - " +  this.apellidos + " - " +  this.especialidad + " - " +  
                this.sueldo;
        return resultado;
    }
    
    
    
    
    }
    
    



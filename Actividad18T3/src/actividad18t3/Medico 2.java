package actividad18t3;


public class Medico {
    
    //Propiedades:
    
    private String codMedico;
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private String telefono;
    private String poblacion;
    private String codPostal;
    private String fechaNacimiento;
    private String especialidad;
    private double sueldo;
    
    //Constructor:
    
    public Medico(String codMedico, String especialidad, String nombre, 
            String apellidos, String dni, String direccion, String codPostal,
             String poblacion, String telefono, String fechaNacimiento,
             double sueldo){
        
        this.codMedico = codMedico;
        this.especialidad = especialidad;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.codPostal = codPostal;
        this.poblacion = poblacion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.sueldo = sueldo;
    }
    
    //Métodos
    
        //Getters y Setters
    
    public String getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(String codMedico) {
        this.codMedico = codMedico;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }
   
    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
        //Calcular retención
    
    public double retencionMedico(double porcRetencion){
        double retencion = this.sueldo * (porcRetencion / 100);
        return retencion;
    }
    
        //Mostrar datos
    
    public String mostrarDatos(){
        String resultado = (this.codMedico + " - " + this.especialidad + " - " 
                + this.nombre + " - " + this.apellidos + " - " + this.dni + 
                " - " + this.direccion + " - " + this.codPostal + " - " + 
                this.poblacion + " - " + this.telefono + " - " + 
                this.fechaNacimiento + " - " + this.sueldo);
        return resultado;
    }
    
    
}

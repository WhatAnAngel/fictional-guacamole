package actividad.pkg21t4pro;

public class Empleado implements interEmpleado {
    
    //atributos
    private int codigo, catLaboral;
    private String nombre, apellidos;
    private int numHijos;
    private boolean desplazamiento;
    private double sueldo;

    //constructor

    public Empleado(int codigo, int catLaboral, String nombre, String apellidos, int numHijos, boolean desplazamiento, double sueldo) {
        this.codigo = codigo;
        this.catLaboral = catLaboral;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numHijos = numHijos;
        this.desplazamiento = desplazamiento;
        this.sueldo = sueldo;
    }
    
    //setters y getters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCatLaboral() {
        return catLaboral;
    }

    public void setCatLaboral(int catLaboral) {
        this.catLaboral = catLaboral;
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

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public boolean isDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(boolean desplazamiento) {
        this.desplazamiento = desplazamiento;
    }
    
        public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    
    @Override
    public String toString() {
        return "Empleado{" + "codigo=" + codigo + ", catLaboral=" + catLaboral + ", nombre=" + nombre + ", apellidos=" + apellidos + ", numHijos=" + numHijos + ", desplazamiento=" + desplazamiento + '}';
    }    
 
    @Override
    public double calculaRetencion() {
        double retencion = 0;
        switch (catLaboral){
            case 1: retencion = 10; break;
            case 2: retencion = 15; break;
            case 3: retencion = 20; break;
            case 4: retencion = 30; break;
        }
        return (retencion/100)*sueldo;
    }
    
    @Override
     public double calculaPlus() {
        double plus;
        
        if (desplazamiento) {
            if (numHijos == 0){ plus = 8; } 
            else { plus = 10; }
            
        } else {
            if (numHijos == 0){ plus = 3; } 
            else { plus = 5; }
        }
        
        return (plus/100)*sueldo;
    }

    
}

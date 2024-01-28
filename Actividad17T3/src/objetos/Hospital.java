package objetos;

public class Hospital {
    
    // Atributos
    
    public String codHospital, nombreHospital, telefono;
    public int habTotales, habOcupadas;
    private static int numHospitales = 0;
    /*  static = ese valor no es único de una instancia (hospital), es común a todas */

    // Constructor
    
    public Hospital(String codHospital, String nombreHospital, String telefono, int habTotales, int habOcupadas){
        this.codHospital = codHospital;
        this.nombreHospital = nombreHospital;
        this.telefono = telefono;
        this.habTotales = habTotales;
        this.habOcupadas = habOcupadas;
        numHospitales++;
    }
    
    // Setters y getters
    
    public void setCodHospital(String codHospital){
        this.codHospital = codHospital;
    }
    public String getCodHorpital(){
        return this.codHospital;
    }
    
    public void setNombreHospital(String nombreHospital){
        this.nombreHospital = nombreHospital;
    }
    public String getNombreHospital(){
        return this.nombreHospital;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }
    
    public void setHabTotales(int habTotales){
        this.habTotales = habTotales;
    }
    public int getHabTotales(){
        return this.habTotales;
    }
    
    public void setHabOcupadas(int habTotales){
        this.habTotales = habTotales;
    }
    public int getHabOcupadas(){
        return this.habOcupadas;
    }

    // mostrar datos:
    
public String mostrarHospital(){
        String resultado = this.codHospital + " - " + this.nombreHospital + " - " + this.telefono + " - " + this.habTotales + 
                " - " +  this.habOcupadas;
        
        return resultado;
}    

public static void mostrarNumHospitales(){
        System.out.println("Numero de hospitales: " + numHospitales);
}

public boolean ingreso() {
    boolean ingresoRealizado = false;
    // solo incrementa si quedan habitaciones libres, es decir, si las ocupadas son menores a las totales
        if (this.habOcupadas < this.habTotales){
            this.habOcupadas++;
            ingresoRealizado = true;
        }
    return ingresoRealizado;
}

public boolean alta(){
    boolean altaRealizada = false;
    
    if (this.habOcupadas > 0) {
        this.habOcupadas--;
        altaRealizada = true;
    }
    return altaRealizada;
}
    
}

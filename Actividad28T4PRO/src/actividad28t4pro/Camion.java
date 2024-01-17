package actividad28t4pro;

public class Camion extends Vehiculo{
    
    //Atributos
    private Remolque remolque;
    
    //Constructor
    public Camion(String matricula) {
        super(matricula);
        this.remolque = null;
    }
    
    //Getters y setters
    public Remolque getRemolque() {
        return remolque;
    }

    public void setRemolque(Remolque remolque) {
        this.remolque = remolque;
    }
    
    //Metodos
    public void ponRemolque(Remolque remolque){
        this.remolque = remolque;
    }
    
    public void quitaRemolque(){
        this.remolque = null;
    }
    
    @Override
    public void acelerar(double km){
        boolean hayRemolque = (remolque !=null);
        double velocidad = getVelocidad();
        
        if(hayRemolque){
            if((velocidad + km)>100){
                System.out.println("No se puede acelerar más");
            }
        }
    }
    
    //ToString
    @Override
    public String toString() {
        return super.toString() + " - Camion{" + "remolque=" + remolque + '}';
    }
    
}

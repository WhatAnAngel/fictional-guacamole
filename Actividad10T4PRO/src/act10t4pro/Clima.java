package act10t4pro;

public class Clima {
    
    public static String calculaTiempo(){
        
        int clima = (int) (Math.random()*100)+1; 
        String climaHoy;
        
        if(clima <=65){
            climaHoy = "soleado";
        } else if (clima <=(65+25)){
            climaHoy = "lluvioso";
        } else {
            climaHoy = "nieve";
        }
        
        return ("El clima de hoy será: " + climaHoy);
    }

}



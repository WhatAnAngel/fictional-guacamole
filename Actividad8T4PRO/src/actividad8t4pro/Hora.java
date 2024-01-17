package actividad8t4pro;

import java.text.DecimalFormat;

public class Hora {
    private String[] hora = new String[3];

    public Hora() {
    }

    public String[] getHora() {
        return hora;
    }

    public void setHora(String[] hora) {
        this.hora = hora;
    }    

    public String calculaHora() {
        int num;
        String laHora;
        DecimalFormat patron = new DecimalFormat("00");
        for (int i = 0; i < hora.length; i++) {
            if (i == 0){
                num = (int) (Math.random()*24);
            } else {
                num = (int) (Math.random()*60);
            }
            patron.format(num);
            hora [i] = patron.format(num);
        }
        
        laHora = hora[0] + ":" + hora[1] + ":" + hora[2];
        return laHora;
    }

    @Override
    public String toString() {
        return calculaHora();
    }
    
    
}

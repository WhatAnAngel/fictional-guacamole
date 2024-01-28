package actividad9t4pro;

import java.text.DecimalFormat;

public class Fecha {

    private String fecha;
    private int dia;
    private int mes;
    private int ano;

    public Fecha() {
    }

    public String[] getFecha() {
        return fecha;
    }

    public void setFecha(String[] fecha) {
        this.fecha = fecha;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String calculaFecha() {
        DecimalFormat patron = new DecimalFormat("00/00/0000");

        int mes = (int) (Math.random() * 12);
        int numDias;
        
        switch (mes) {
            case 2:
                numDias = 28;
                break;
                
            case 4:
            case 6:
            case 9:
            case 11:
                numDias = 28;
                break;
                
            default:
                numDias = 31;
                break;
        }
        
        int dia = (int) (Math.random() * numDias);
    
        int ano = (int) (Math.random() * 3000);
        
        fecha = dia + mes + ano;
        patron.format(fecha);
        
    }

    @Override
    public String toString() {
        return "Fecha{" + "fecha=" + fecha + ", dia=" + dia + ", mes=" + mes + ", ano=" + ano + '}';
    }

}

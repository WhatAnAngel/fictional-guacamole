package actividadadicionalt7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Temperatura {

    //Atributos de la clase temperatura
    private double temperatura;
    private String ubicacion;
    private LocalDate fecha;

    /* Constructor al que se le pasa un String que corresponde a una línea de un
    archivo csv y que contiene una fecha en formato dd/MM/aaaa, una ubicación y 
    la temperatura */
    public Temperatura(String lineaCsv) {

        //Separamos los tres datos del csv splitteando por la coma
        String[] rawData = lineaCsv.split(",");

        /* Le asignamos el valor de cada uno de los datos de este array, según 
        su orden, a los atributos de fecha, ubicacion y temperatura de la clase */
        String fechaString = rawData[0]; //Formateamos la fecha a LocalDate        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fecha = LocalDate.parse(fechaString, formatter);
        this.ubicacion = rawData[1];
        this.temperatura = Double.parseDouble(rawData[2]);//Parseamos a double
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    // He hecho un método sobrecargado para el setter
    public void setFecha(String fechaString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fecha = LocalDate.parse(fechaString, formatter);
    }

    @Override
    public String toString() {
        return "Temperatura= " + temperatura + ", Ubicacion= " + ubicacion + ", Fecha= " + fecha;
    }

<<<<<<< HEAD
}
=======
}
>>>>>>> daf18df3b0133a880d389c8a2dd5381f5d4fee31

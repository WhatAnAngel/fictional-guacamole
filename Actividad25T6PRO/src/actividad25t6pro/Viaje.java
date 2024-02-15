package actividad25t6pro;

public class Viaje {
    //Atributos
    private String codigo, destino, hotel, regAlojamiento;
    private int dias;
    private double precio;

    public Viaje(String codigo, String destino, String hotel, String regAlojamiento, int dias, double precio) {
        this.codigo = codigo;
        this.destino = destino;
        this.hotel = hotel;
        this.regAlojamiento = regAlojamiento;
        this.dias = dias;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getRegAlojamiento() {
        return regAlojamiento;
    }

    public void setRegAlojamiento(String regAlojamiento) {
        this.regAlojamiento = regAlojamiento;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Código de viaje: " + codigo + 
                "\nDestino: " + destino + 
                "\nHotel: " + hotel + 
                "\n" + regAlojamiento + 
                "\nDías: " + dias + 
                "\nPrecio: " + precio + "€";
    }
    
}

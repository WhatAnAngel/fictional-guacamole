package calculaimportes;

public class CalculaImportes{
    
    public double calculaDto(double precio, double porcDescuento){
        double descuento = precio * (porcDescuento  / 100);
        return descuento ;
    }
    
    public double calculaIva(double precio, double porcIva){
        double iva = precio * (porcIva / 100);
        return iva;
    }
    
    public double calculaPrecioFinal(double precio, double porcDescuento, double porcIva){
        double descuento = precio * (porcDescuento/100);
        double precioDescuento = precio - descuento;
        double iva = precioDescuento * (porcIva/100);
        double precioFinal = precioDescuento + iva;
        return precioFinal;
    }
   
}
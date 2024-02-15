package actividad25t6pro;


public class Actividad25T6PRO {
    
    public static void main(String[] args) {

         Viaje[] misViajes = {
            new Viaje("VJ001", "París", "Hotel ABC", "Desayuno incluido", 7, 1500.00),
            new Viaje("VJ002", "Nueva York", "Hotel XYZ", "Media pensión", 5, 2000.50),
            new Viaje("VJ003", "Tokio", "Hotel EFG", "Todo incluido", 10, 3000.75),
            new Viaje("VJ004", "Roma", "Hotel LMN", "Solo alojamiento", 3, 1200.25),
            new Viaje("VJ005", "Londres", "Hotel OPQ", "Desayuno incluido", 4, 1800.00)
        };
        
        Formulario miFormulario = new Formulario(misViajes);
        miFormulario.setVisible(true);
        
    }
}

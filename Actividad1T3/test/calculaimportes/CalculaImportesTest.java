package calculaimportes;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculaImportesTest {
    
    public CalculaImportesTest() {
    }

    @Test
    public void testCalculaDto() {
        //Creamos instancia de la clase
        CalculaImportes miCalculadora = new CalculaImportes();
        
        //Realizamos la llamada al método CalculaDto()
        double resultado = miCalculadora.calculaDto(10,50);
        
        //Creamos variable con el resultado esperado
        double resultadoEsperado = 5;
        
        //Llamamos a la aserción para realizar el test
        assertEquals(
                "ERROR: El método no devuelve el valor esperado :(", resultadoEsperado, resultado, 0.01);
    }
    
    @Test
    public void testCalculaIva() {
        //Creamos instancia de la clase
        CalculaImportes miCalculadora = new CalculaImportes();
        
        //Realizamos la llamada al método CalculaIva()
        double resultado = miCalculadora.calculaIva(50,10);
        
        //Creamos variable con el resultado esperado
        double resultadoEsperado = 5;
        
        //Llamamos a la aserción para realizar el test
        assertEquals(
                "ERROR: El método no devuelve el valor esperado :(", resultadoEsperado, resultado, 0.01);
    }
    
    @Test
    public void testCalculaPrecioFinal() {
        //Creamos instancia de la clase
        CalculaImportes miCalculadora = new CalculaImportes();
        
        //Realizamos la llamada al método CalculaPrecioFinal()
        double resultado = miCalculadora.calculaPrecioFinal(100,50,10);
        
        //Creamos variable con el resultado esperado
        double resultadoEsperado = 55;
        
        //Llamamos a la aserción para realizar el test
        assertEquals(
                "ERROR: El método no devuelve el valor esperado :(", resultadoEsperado, resultado, 0.01);
    }
    
}

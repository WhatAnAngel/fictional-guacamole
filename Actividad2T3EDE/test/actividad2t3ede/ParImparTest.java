package actividad2t3ede;

import org.junit.Test;
import static org.junit.Assert.*;

public class ParImparTest {
    
    public ParImparTest() {
    }

    @Test
    public void testEsPar() {
        ParImpar miParImpar = new ParImpar();
        boolean resultado = miParImpar.esPar(2);
        boolean resultadoEsperado = true;
        assertEquals("ERROR: El resultado no es el esperado", resultadoEsperado, resultado);
    }

    @Test
    public void testEsImpar() {
        ParImpar miParImpar = new ParImpar();
        boolean resultado = miParImpar.esImpar(3);
        boolean resultadoEsperado = true;
        assertEquals("ERROR: El resultado no es el esperado", resultadoEsperado, resultado);
        
    }

    @Test
    public void testEsCero() {
        ParImpar miParImpar = new ParImpar();
        boolean resultado = miParImpar.esCero(1);
        boolean resultadoEsperado = false;
        assertEquals("ERROR: El resultado no es el esperado", resultadoEsperado, resultado);
    }
    
}

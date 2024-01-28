/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojunit;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void testSumar() {
        //Creamos instancia de la clase
        Calculadora miCalculadora = new Calculadora();
        
        //Realizamos la llamada al método sumar()
        int resultado = miCalculadora.sumar(7,3);
        
        //Creamos variable con el resultado esperado
        int resultadoEsperado = 10;
        
        //Llamamos a la aserción para realizar el test
        assertEquals(
                "ERROR: El método suma no devuelve el valor esperado :(", resultadoEsperado, resultado);
    }
    
    @Test
    public void testRestar() {
        //Creamos instancia de la clase
        Calculadora miCalculadora = new Calculadora();

        //Realizamos la llamada al método sumar()
        int resultado = miCalculadora.restar(7,3);

        //Creamos variable con el resultado esperado
        int resultadoEsperado = 4;

        //Llamamos a la aserción para realizar el test
        assertEquals(
                "ERROR: El método resta no devuelve el valor esperado :(", resultadoEsperado, resultado);
    }
    
    @Test
    public void testMultiplicar() {
        //Creamos instancia de la clase
        Calculadora miCalculadora = new Calculadora();

        //Realizamos la llamada al método sumar()
        int resultado = miCalculadora.multiplicar(7,3);

        //Creamos variable con el resultado esperado
        int resultadoEsperado = 21;

        //Llamamos a la aserción para realizar el test
        assertEquals(
                "ERROR: El método multiplicar no devuelve el valor esperado :(", resultadoEsperado, resultado);
    }
    
    @Test
    public void testDividir() {
        //Creamos instancia de la clase
        Calculadora miCalculadora = new Calculadora();

        //Realizamos la llamada al método sumar()
        int resultado = miCalculadora.dividir(10,5);

        //Creamos variable con el resultado esperado
        int resultadoEsperado = 2;

        //Llamamos a la aserción para realizar el test
        assertEquals(
                "ERROR: El método dividir no devuelve el valor esperado :(", resultadoEsperado, resultado);
    }
    
}

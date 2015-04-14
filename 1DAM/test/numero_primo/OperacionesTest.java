package numero_primo;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperacionesTest {

	@Test
    public void testEsPrimo(){
        int numero = 7;
        assertTrue(Operaciones.esPrimo(numero));
        numero = 4;
        assertFalse(Operaciones.esPrimo(numero));
    }
}

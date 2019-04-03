import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercise1 {

    @Test
    public void suma2numeros(){
        assertEquals(4, 2+2);
    }

    @Test
    public void multiplica2numeros(){
        assertEquals(4, 2*2);
    }

    @Test
    public void string2minus(){
        String cadena = "Todo a MINÚSCULAS";
        assertEquals("todo a minúsculas", cadena.toLowerCase());
    }
}

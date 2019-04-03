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

    public void calcularPorcentaje(){
        assertEquals(0, 1/2*100);
    }
    public void string2minus(){
        String cadena = "Todo a MINÚSCULAS";
        assertEquals("todo a minúsculas", cadena.toLowerCase());
    }

    @Test
    public void intercambiar(){
        Long a = new Long(1);
        Long b = new Long(2);

        Long c = a;
        a = b;
        b = c;

        assertEquals(new Long(2), a);
        assertEquals(new Long(1), b);

    }
}

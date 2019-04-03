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
}

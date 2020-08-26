package tutorial4;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalc extends Calc{


    @Test
    public void testadd(){
        assertEquals(20, Calc.add(10, 10));
    }

    @Test
    public void testsubract(){
        assertEquals(10, Calc.add(20, 10));
    }


}
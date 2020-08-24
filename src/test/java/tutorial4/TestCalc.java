
import org.junit.jupiter;
import org.junit.Assert;

public class TestCalc {


    @Test
    public void testadd(){
        assertEquals(20, Calc.add(10, 10));
    }

    @Test
    public void testsubract(){
        assertEquals(10, Calc.add(20, 10));
    }


}
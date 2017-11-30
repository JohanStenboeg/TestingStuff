import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testTest {
    @Test
    public void testCheckOverførsel(){
        test test1 = new test();
        String navn = test1.overførBeløb(1000);
        assertEquals("Overførselse succesfuld", navn);
    }


}

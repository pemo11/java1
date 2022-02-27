/**
* JUnit-Tests für Aufgabe 1/Level A
*/
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
    
    @Test
    public void testSchaltjahrTest1() {
        boolean result = App.schaltjahrTest(1900);
        assertTrue("Prüfe Jahr 1900", result);
    }

    @Test
    public void testSchaltjahrTest2() {
        boolean result = App.schaltjahrTest(2000);
        assertFalse("Prüfe Jahr 2000", result);
    }

    @Test
    public void testSchaltjahrTest3() {
        boolean result = App.schaltjahrTest(2001);
        assertFalse("Prüfe Jahr 2001", result);
    }


    
}

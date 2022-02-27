/**
* JUnit-Tests für Aufgabe 1/Level B
*/
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AppTest {

    @Test
    public void testSchaltjahrTest1() {
        assertThrows(IllegalArgumentException.class,() -> App.schaltjahrTest(-1));
    }

}

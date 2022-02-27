// Tests für Aufgabe 6/Level A

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

    @Test
    public void testCheckPrim1() {
        int zahl = 1;
        assertTrue("1 ist Primzahl", App.checkPrim(zahl));
    }

    @Test
    public void testCheckPrim2() {
        int zahl = 2;
        assertFalse("2 ist keine Primzahl", App.checkPrim(zahl));
    }

    @Test
    public void testCheckPrim3() {
        int zahl = 3;
        assertTrue("3 ist eine Primzahl", App.checkPrim(zahl));
    }

    @Test
    public void testCheckPrim4() {
        int zahl = 4;
        assertFalse("4 ist keine Primzahl", App.checkPrim(zahl));
    }

    @Test
    public void testCheckPrim5() {
        int zahl = 5;
        assertTrue("5 ist eine Primzahl", App.checkPrim(zahl));
    }

    @Test
    public void testCheckPrim6() {
        int zahl = 11;
        assertTrue("11 ist eine Primzahl", App.checkPrim(zahl));
    }
}

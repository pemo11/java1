// Tests für Aufgabe 6/Level B

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class AppTest {

    @Test
    public void testHolePrimzahlen1() {
        boolean[] prims = App.holePrimzahlen(100);
        int primCount = 0;
        for(boolean primFlag : prims) {
            primCount += primFlag ? 1 : 0;
        }
        assertTrue(primCount == 24);
    }

    @Test
    public void testHolePrimzahlen2() {
        boolean[] prims = App.holePrimzahlen(200);
        int primCount = 0;
        for(boolean primFlag : prims) {
            primCount += primFlag ? 1 : 0;
        }
        assertTrue(primCount == 45);
    }

    @Test
    public void testHolePrimzahlen3() {
        boolean[] prims = App.holePrimzahlen(3);
        assertTrue(prims.length == 3);
    }

}

// Tests für Aufgabe 4/Level A

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

    @Test
    public void testVergleicheZah1() {
        App.rateZahl = 100;
        int zahl = 99;
        int result = App.vergleicheZahl(zahl);
        assertTrue(result == -1);
    }

    @Test
    public void testVergleicheZah2() {
        App.rateZahl = 100;
        int zahl = 101;
        int result = App.vergleicheZahl(zahl);
        assertTrue(result == 1);
    }

    @Test
    public void testVergleicheZahl3() {
        App.rateZahl = 100;
        int zahl = 100;
        int result = App.vergleicheZahl(zahl);
        assertTrue(result == 0);
    }

    @Test
    public void testRateZahl1() {
        App.rateZahl = 100;
        int[][]zahlen = {{200,1},{50,-1},{100,0}};
        boolean result = true;
        for (var t : zahlen) {
            result = result && t[1] == App.vergleicheZahl(t[0]);
        }
        assertTrue(result);
    }

    @Test
    public void testRateZahl2() {
        App.rateZahl = 500;
        int[][]zahlen = {{1000,1},{50,-1},{750,1},{250,-1},{600,1},{400,-1},{500,0}};
        boolean result = true;
        for (var t : zahlen) {
            result = result && t[1] == App.vergleicheZahl(t[0]);
        }
        assertTrue(result);
    }
}

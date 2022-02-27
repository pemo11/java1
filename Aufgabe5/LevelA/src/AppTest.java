// Tests für Aufgabe 5/Level A

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    @Test
    public void testCalculatePopulation1() {
        int jahr = 2001;
        double result = 6.21;
        // Bei assertEquals mit einem float muss auch ein delta übergeben werden
        assertEquals(result, App.calculatePopulation(jahr), 0.1);
    }

    @Test
    public void testCalculatePopulation2() {
        int jahr = 2020;
        double result = 7.79;
        // Bei assertEquals mit einem flot muss auch ein delta übergeben werden
        assertEquals(result, App.calculatePopulation(jahr), 0.1);
    }
}

// Tests für Aufgabe 5/Level B

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

public class AppTest {

    @Test
    public void testCalculatePopulation1() {
        int anfang = 2000;
        int ende = 2015;
        int jahr = 2011;
        HashMap<Integer, Double> map = App.calculatePopulation(anfang, ende);
        assertEquals(map.get(jahr), 7.0, 0.1);
    }
    
}

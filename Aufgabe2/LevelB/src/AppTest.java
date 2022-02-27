/**
* JUnit-Tests für Aufgabe 2/Level B
*/
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

    @Test
    public void testBerechneAnzahlSpeichermedien1() {
        String medium = "DVD";
        String groesse = "10TB";
        int anzahl = App.berechneAnzahlSpeichermedien(groesse, medium);
        assertTrue("Berechnung 1", anzahl == 2179);

    }

    @Test
    public void testBerechneAnzahlSpeichermedien2() {
        String medium = "DVD";
        String groesse = "10GB";
        int anzahl = App.berechneAnzahlSpeichermedien(groesse, medium);
        assertTrue("Berechnung 2", anzahl == 3);
    }

    @Test
    public void testBerechneAnzahlSpeichermedien3() {
        String medium = "CD";
        String groesse = "2GB";
        int anzahl = App.berechneAnzahlSpeichermedien(groesse, medium);
        assertTrue("Berechnung 3", anzahl == 3);
    }

}
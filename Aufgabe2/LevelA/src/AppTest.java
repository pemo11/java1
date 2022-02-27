/**
* JUnit-Tests für Aufgabe 2/Level A
*/
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
    @Test
    public void testBerechneAnzahlSpeichermedien1() {
        String medium = "DVD";
        String einheit = "TB";
        long groesse = 10;
        int anzahl = App.berechneAnzahlSpeichermedien(groesse, einheit, medium);
        assertTrue("Berechnung 1", anzahl == 2179);

    }

    @Test
    public void testBerechneAnzahlSpeichermedien2() {
        String medium = "DVD";
        String einheit = "GB";
        long groesse = 10;
        int anzahl = App.berechneAnzahlSpeichermedien(groesse, einheit, medium);
        assertTrue("Berechnung 2", anzahl == 3);
    }

    @Test
    public void testBerechneAnzahlSpeichermedien3() {
        String medium = "CD";
        String einheit = "GB";
        long groesse = 2;
        int anzahl = App.berechneAnzahlSpeichermedien(groesse, einheit, medium);
        assertTrue("Berechnung 3", anzahl == 3);
    }
}

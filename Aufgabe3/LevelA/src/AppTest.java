// Tests für Aufgabe 3/Level A

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    
    @Test
    public void testHoleBundepraesident1() {
        int jahr = 1950;
        String name = App.holeBundepraesident(jahr);
        assertEquals("Theodor Heuss", name);
    }
    @Test
    public void testHoleBundepraesident2() {
        int jahr = 1960;
        String name = App.holeBundepraesident(jahr);
        assertEquals("Walter Lübke", name);
    }

    @Test
    public void testHoleBundepraesident3() {
        int jahr = 1970;
        String name = App.holeBundepraesident(jahr);
        assertEquals("Gustav Heinemann", name);
    }

    @Test
    public void testHoleBundepraesident4() {
        int jahr = 1976;
        String name = App.holeBundepraesident(jahr);
        assertEquals("Walter Scheel", name);
    }

    @Test
    public void testHoleBundepraesident5() {
        int jahr = 1980;
        String name = App.holeBundepraesident(jahr);
        assertEquals("Karl Carstens", name);
    }

    @Test
    public void testHoleBundepraesident6() {
        int jahr = 1990;
        String name = App.holeBundepraesident(jahr);
        assertEquals("Richard von Weizäcker", name);
    }

    @Test
    public void testHoleBundepraesident7() {
        int jahr = 1996;
        String name = App.holeBundepraesident(jahr);
        assertEquals("Roman Herzog", name);
    }

    @Test
    public void testHoleBundepraesident8() {
        int jahr = 2000;
        String name = App.holeBundepraesident(jahr);
        assertEquals("Johannes Rau", name);
    }

    @Test
    public void testHoleBundepraesident9() {
        int jahr = 2006;
        String name = App.holeBundepraesident(jahr);
        assertEquals("Horst Köhler", name);
    }

    @Test
    public void testHoleBundepraesident10() {
        int jahr = 2011;
        String name = App.holeBundepraesident(jahr);
        assertEquals("Christian Wulff", name);
    }

    @Test
    public void testHoleBundepraesident11() {
        int jahr = 2016;
        String name = App.holeBundepraesident(jahr);
        assertEquals("Joachim Gauck", name);
    }

    @Test
    public void testHoleBundepraesident12() {
        int jahr = 2020;
        String name = App.holeBundepraesident(jahr);
        assertEquals("Frank Walter Steinmeier", name);
    }

}

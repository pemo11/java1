import java.time.LocalDate;
import java.util.Scanner;

/** Aufgabe 3 - Bundespräsidentenausgabe (Level A)
* @author Teacher
*/
public class App {

    /**
     * Gibt den amtierenden Bundespräsidenten des Jahres zurück
     * @param jahr
     * @return
     */
    public static String holeBundepraesident(int jahr) {
        if (jahr >= 1949 && jahr <= 1959) {
            return "Theodor Heuss";
        } else if (jahr > 1959 && jahr <=1969) {
            return "Walter Lübke";
        } else if (jahr > 1969 && jahr < 1974) {
            return "Gustav Heinemann";
        } else if (jahr > 1974 && jahr <= 1979) {
            return "Walter Scheel";
        } else if (jahr > 1979 && jahr <= 1984) {
            return "Karl Carstens";
        } else if (jahr > 1984 && jahr <= 1994) {
            return "Richard von Weizäcker";
        } else if (jahr > 1994 && jahr <= 1999) {
            return "Roman Herzog";
        } else if (jahr > 1999 && jahr <= 2004) {
            return "Johannes Rau";
        } else if (jahr > 2004 && jahr <= 2010) {
            return "Horst Köhler";
        } else if (jahr > 2010 && jahr <= 2012) {
            return "Christian Wulff";
        } else if (jahr > 2012 && jahr <= 2017) {
            return "Joachim Gauck";
        } else if (jahr > 2018) {
            return "Frank Walter Steinmeier";
        } else {
            return "";
        }  
    }
    public static void main(String[] args) throws Exception {
        LocalDate heute = LocalDate.now();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jahr?");
        int jahr = scanner.nextInt();
        String bupraesi = holeBundepraesident(jahr);
        if (jahr == heute.getYear()) {
            System.out.println(String.format("Der Bundespräsident im Jahr %d ist %s.", jahr, bupraesi));
        } else {
            System.out.println(String.format("Der Bundespräsident im Jahr %d war %s.", jahr, bupraesi));
        }
        scanner.close();
    }
}

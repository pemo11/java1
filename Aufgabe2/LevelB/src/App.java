import java.util.Scanner;

/** Aufgabe 2 (Level B)
* Speichermedienplatzbedarf
* @author Teacher
*/
public class App {

    /**
     * Berechnet die Anzahl an Speichermedien
     * @param Groesse
     * @param Medium
     * @return
     */
    public static int berechneAnzahlSpeichermedien(String groesse, String medium) {
        long groesseMB;
        long groesseEinheit;
        // Zwei Buchstaben als Einheit abtrennen
        groesseEinheit = Integer.parseInt(groesse.substring(0, groesse.length()- 2));
        String einheit = groesse.substring(groesse.length() - 2).toUpperCase();
        // Die Eingabe auf MB umrechnen
        switch(einheit) {
            case "KB":
                // 1 MB / 1024 = 1KB
                groesseMB = groesseEinheit / 1024;
                break;
            case "MB":
                // 1 MB = 1 MB - der Zweig könnte auch entfallen
                groesseMB = groesseEinheit;
                break;
            case "GB":
                // 1 MB * 1024 = 1 GB
                groesseMB = groesseEinheit * 1024;
                break;
            case "TB":
                // 1 MB * 1024 * 1024 = 1 TB 
                groesseMB = groesseEinheit * 1024 * 1024;
                break;
            default:
                // Byte
                groesseMB = groesseEinheit / (1024 * 1024);
                break;
        }
        if (medium.equals("CD")) {
            return (int)(groesseMB / 770) + 1;
        } else if (medium.equals("DVD")) {
            return (int)(groesseMB / (4.7 * 1024)) + 1;
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Speichergröße (z.B. 200GB): ");
        String groesse = scanner.nextLine();
        System.out.println("Medium (CD oder DVD)?");
        String medium = scanner.nextLine();
        int anzahlMedien = berechneAnzahlSpeichermedien(groesse, medium);
        System.out.println("Anzahl der erforderlichen Speichermedien: " + anzahlMedien);
        scanner.close();
    }
}

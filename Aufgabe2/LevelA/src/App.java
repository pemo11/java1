import java.util.Scanner;

/** Aufgabe 2 (Level A)
* Speichermedienplatzbedarf-Berechnung
* @author Teacher
*/
public class App {

    /**
     * Berechnet die Anzahl an Speichermedien
     * @param Groesse
     * @param Einheit
     * @param Medium
     * @return
     */
    public static int berechneAnzahlSpeichermedien(long groesse, String einheit, String medium) {
        long groesseMB;
        // Die Eingabe auf MB umrechnen
        switch(einheit) {
            case "KB":
                // 1 MB / 1024 = 1KB
                groesseMB = groesse / 1024;
                break;
            case "MB":
                // 1 MB = 1 MB - der Zweig könnte auch entfallen
                groesseMB = groesse;
                break;
            case "GB":
                // 1 MB * 1024 = 1 GB
                groesseMB = groesse * 1024;
                break;
            case "TB":
                // 1 MB * 1024 * 1024 = 1 TB 
                groesseMB = groesse * 1024 * 1024;
                break;
            default:
                // Byte
                groesseMB = groesse / (1024 * 1024);
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
        System.out.println("Speichergröße als Zahl:");
        long groesse = scanner.nextLong();
        // Line Feed einlesen
        scanner.nextLine();
        System.out.println("Einheit (KB,MB,GB oder TB)?");
        String einheit = scanner.nextLine();
        System.out.println("Medium (CD oder DVD)?");
        String medium = scanner.nextLine();
        int anzahlMedien = berechneAnzahlSpeichermedien(groesse, einheit, medium);
        System.out.println("Anzahl der erforderlichen Speichermedien: " + anzahlMedien);
        scanner.close();
    }
}

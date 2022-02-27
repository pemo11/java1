import java.util.Scanner;

/** Aufgabe 4 (Level A)
* Zahlenratespiel
* @author Teacher
*/
public class App {
    public static int rateZahl = 0;

    public static int vergleicheZahl(int zahl) {
        if (zahl == rateZahl) {
            return 0;
        } else if (zahl < rateZahl) {
            return -1; 
        } else {
            return 1;
        }
    }

    public static void main(String[] args) throws Exception {
        int anzahlVersuche = 0;
        boolean abbruch = false;
        rateZahl = (int)Math.floor(Math.random() * 1024) + 1;
        Scanner scanner = new Scanner(System.in);
        while (!abbruch) {
            System.out.println("Zahl (1-1024)? ");
            int zahl = scanner.nextInt();
            anzahlVersuche++;
            if (vergleicheZahl(zahl) == 1) {
                System.out.println("*** Die Zahl ist zu groß ***");
            } else if(vergleicheZahl(zahl) == -1) {
                System.out.println("*** Die Zahl ist zu klein ***");
            } else {
                abbruch = true;
            }
        }
        System.out.println(String.format("Eraten nach %d Versuchen.", anzahlVersuche));
    }
}

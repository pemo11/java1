import java.util.Scanner;
/**
 * Aufgabe 1 - Schaltjahr-Check (Level A)
 @author Teacher
 */
public class App {

    /**
     * Gibt an, ob ein Jahr ein Schaltjahr ist
     * @param jahr
     * @return
     */
    public static boolean schaltjahrTest(int jahr) {
        return jahr % 4 == 0 && jahr % 400 != 0;
    }

    /**
     * Einsprungpunkt der Anwendung
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jahr?");
        int jahr = scanner.nextInt();
        boolean istSchaltjahr = schaltjahrTest(jahr);
        System.out.println(istSchaltjahr);
        scanner.close();
    }
}

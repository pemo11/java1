import java.util.Scanner;

/** Aufgabe 6 - Level A
* Primzahlentester
* @author Teacher
*/
public class App {

    public static boolean checkPrim(int zahl) {
        boolean istPrim = true;
        for (int i=2;i<=Math.floor(Math.sqrt(zahl)+1);i++) {
            if (zahl % i == 0) {
                istPrim = false;
                return istPrim;
            }
        }
        return istPrim;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zahl? ");
        int zahl = scanner.nextInt();
        boolean result = checkPrim(zahl);
        if (result) {
            System.out.println(String.format("Die Zahl %d ist eine Primazhl.", zahl));
        } else {
            System.out.println(String.format("Die Zahl %d ist keine Primzahl.", zahl));
        }
        scanner.close();
    }
}

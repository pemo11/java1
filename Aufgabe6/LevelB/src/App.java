import java.util.Arrays;
import java.util.Scanner;

/*
* Aufgabe 6 - Sieb des Eratosthenes (Level B)
* @author Teacher
*/
public class App {

    public static boolean[] holePrimzahlen(int grenze) {
        boolean[] zahlen = new boolean[grenze];
        Arrays.fill(zahlen, true);
        zahlen[0] =false;
        zahlen[1] = false;
        zahlen[2] = false;
        for(int i=2;i<Math.floor(Math.sqrt(grenze));i++) {
            for(int j=2;i*j < grenze;j++) {
                zahlen[i*j] = false;
            }
        }
        return zahlen;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Obergrenze? ");
        int grenze = scanner.nextInt();
        int primCount = 0;
        boolean[] primzahlen = holePrimzahlen(grenze);
        for(int i=1;i<primzahlen.length;i++) {
            if (primzahlen[i]) {
                System.out.print(String.format(" %d", i));
                primCount++;
            }
        }
        System.out.println(String.format("\n%d Primzahlen", primCount));
    }
}

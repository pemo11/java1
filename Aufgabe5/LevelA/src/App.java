import java.util.Scanner;

/** Aufgabe 5 - Level A
* Expontentielles Wachstum
* Es gilt die Annahme, dass die Weltbevölkerung jedes Jahr um 1.2% wächst
* @author Teacher
*/
public class App {

    public static double calculatePopulation(int jahr) {
        double population2000 = 6.14E09;
        double growthRate = 1.2;
        int t = jahr - 2000;
        double population = population2000 * Math.pow(1 + growthRate / 100, t) / 1E9;
        return population;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jahr (z.B. 2000)? ");
        int jahr = scanner.nextInt();
        if (jahr < 2000 ) {
            System.out.println("Fehler - das Jahr muss größer als 2000 sein, z.B. 2050");
        } else {
            double population = calculatePopulation(jahr);
            System.out.println(String.format("Im Jahr %d leben bei einer Wachstumsrate von 1.2%% %.2f Mrd. Menschen auf der Erde.", jahr, population)); 
        }
        scanner.close();
    }
}

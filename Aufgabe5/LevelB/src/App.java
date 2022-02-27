import java.util.HashMap;
import java.util.Scanner;

/* Aufgabe 5 - Level B
* Exponentielles Wachstum - Annahme, dass die Weltbevölkerung jedes Jahr um 1.2% wächst
* @author Teacher
*/
public class App {

    public static HashMap<Integer, Double> calculatePopulation(int anfang, int ende) {
        double population2000 = 6.14E09;
        double growthRate = 1.2;
        HashMap<Integer, Double> populationCount = new HashMap<>();
        for(int jahr=anfang;jahr<=ende;jahr++) {
            int t = jahr - 2000;
            double population = population2000 * Math.pow(1 + growthRate / 100, t) / 1E9;
            populationCount.put(jahr, population);
        }
        return populationCount;

    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Beginn (z.B. 2000)? ");
        int jahrBeginn = scanner.nextInt();
        System.out.println("Ende? (z.B. 2030) ");
        int jahrEnde = scanner.nextInt();
        if (jahrBeginn < 2000 || jahrEnde < 2000) {
            System.out.println("Fehler - das Jahr muss größer als 2000 sein, z.B. 2050");
            System.exit(-1);
        }
        if (jahrBeginn >= jahrEnde) {
            System.out.println("Fehler - das Anfangsjahr muss kleiner als das Endjahr sein");
            System.exit(-1);
        }
        HashMap<Integer, Double> populations = calculatePopulation(jahrBeginn, jahrEnde);
        for (int jahr : populations.keySet()) {
            System.out.println(String.format("Im Jahr %d leben bei einer Wachstumsrate von 1.2%% %.2f Mrd. Menschen auf der Erde.", jahr, populations.get(jahr))); 
        }
        scanner.close();
    }
}

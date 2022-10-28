
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        ArrayList<Double> L = new ArrayList<>();
        while (true) {
            System.out.println("Unesite broj (\"stop\" za prekid unosa): ");
            if (unos.hasNextDouble()) {
                L.add(unos.nextDouble());
                continue;
            }

            if (unos.next().equalsIgnoreCase("stop"))
                break;
        }

        double standardnaDevijacija = 0, srednjaVrijednost = 0;

        for (Double el : L)
                srednjaVrijednost += el;
        srednjaVrijednost /= L.size();

        for (Double el : L)
            standardnaDevijacija += Math.pow((el - srednjaVrijednost),2);
        standardnaDevijacija /= L.size();
        standardnaDevijacija = Math.sqrt(standardnaDevijacija);


        System.out.println("Elementi liste (uneseni brojevi): ");
        for (Double el : L)
            System.out.print(el + " ");
        System.out.println("\nMaksimalni element liste: " + Collections.max(L));
        System.out.println("Minimalni element liste: " + Collections.min(L));
        System.out.println("Srednja vrijednost elemenata liste: " + srednjaVrijednost);
        System.out.println("Standardna devijacija elemenata liste: " + standardnaDevijacija);
    }
}

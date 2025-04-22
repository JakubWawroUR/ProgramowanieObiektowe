import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> pair = new HashMap<>();

        System.out.println("Wprowadzaj pary imion (wpisz '-' jako imię, aby zakończyć):");

        while (true) {
            System.out.print("Podaj pierwsze imię pary: ");
            String name1 = scanner.nextLine().trim();

            if (name1.equals("-")) {
                break;
            }

            System.out.print("Podaj drugie imię pary: ");
            String name2 = scanner.nextLine().trim();

            if (name2.equals("-")) {
                break;
            }
            pair.put(name1, name2);
            pair.put(name2, name1);
        }

        System.out.print("\nPodaj imię, dla którego chcesz znaleźć partnera: ");
        String szukaneImie = scanner.nextLine().trim();

        if (pair.containsKey(szukaneImie)) {
            System.out.println("Partner dla " + szukaneImie + " to: " + pair.get(szukaneImie));
        } else {
            System.out.println("Nie znaleziono partnera dla " + szukaneImie);
        }
    }
}
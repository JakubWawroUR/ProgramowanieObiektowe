import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> uniqueNames = new HashSet<>();

        System.out.println("Wprowadzaj imiona (wpisz '-' aby zakończyć):");

        while (true) {
            System.out.print("Podaj imię: ");
            String name = scanner.nextLine();

            if (name.equals("-")) {
                break;
            }

            if (!name.isEmpty()) {
                uniqueNames.add(name);
            }
        }

        System.out.println("Liczba unikalnych imion: " + uniqueNames.size());
    }
}
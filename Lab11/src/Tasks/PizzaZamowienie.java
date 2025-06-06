package Tasks;

import java.util.InputMismatchException;
import java.util.Scanner; // Importujemy Scanner

public class PizzaZamowienie { // Zmieniona nazwa klasy

    // Usunięto pole private Scanner scanner;
    // Usunięto konstruktor public PizzaOrder(Scanner scanner)

    public void uruchom() {
        Scanner scanner = new Scanner(System.in); // Tworzymy LOKALNĄ instancję Scannera

        System.out.println("\n--- Zamówienie Pizzy ---");
        System.out.println("Dostępne rozmiary pizz:");
        // Wyświetlanie opcji dla użytkownika
        for (int i = 0; i < PizzaSize.values().length; i++) {
            PizzaSize size = PizzaSize.values()[i];
            System.out.println((i + 1) + ". " + size.name() + " (Średnica: " + size.getSrednica() + " cm, Cena: " + String.format("%.2f", size.getCena()) + " zł)");
        }
        System.out.println("0. Powrót do menu głównego");
        System.out.print("Wybierz rozmiar pizzy (numer): ");

        int wybor;
        do {
            while (true) {
                try {
                    wybor = scanner.nextInt();
                    scanner.nextLine(); // Pochłaniamy znak nowej linii
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Błąd: Wprowadź liczbę całkowitą.");
                    scanner.nextLine();
                }
            }

            if (wybor > 0 && wybor <= PizzaSize.values().length) {
                PizzaSize wybranyRozmiar = PizzaSize.values()[wybor - 1];
                System.out.println("Wybrano: " + wybranyRozmiar.name());
                System.out.println("Średnica: " + wybranyRozmiar.getSrednica() + " cm");
                System.out.println("Cena: " + String.format("%.2f", wybranyRozmiar.getCena()) + " zł");
            } else if (wybor == 0) {
                System.out.println("Powrót do menu głównego.");
            } else {
                System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
            }
        } while (wybor != 0);

        scanner.close(); // Zamykamy LOKALNY scanner po zakończeniu działania PizzaOrder
        // UWAGA: To może spowodować problemy w innych częściach programu,
        // jeśli spróbują one czytać z System.in po zamknięciu go tutaj.
    }
}
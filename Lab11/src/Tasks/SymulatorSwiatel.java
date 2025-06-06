package Tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SymulatorSwiatel {



    public void uruchom() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Symulator Światła ---");
        System.out.println("Dostępne światła:");
        for (int i = 0; i < Swiatlo.values().length; i++) {
            System.out.println((i + 1) + ". " + Swiatlo.values()[i]);
        }
        System.out.println("0. Powrót do menu głównego");
        System.out.print("Wybierz światło (numer): ");

        int wybor;
        do {
            while (true) {
                try {
                    wybor = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Błąd: Wprowadź liczbę całkowitą.");
                    scanner.nextLine();
                }
            }

            if (wybor > 0 && wybor <= Swiatlo.values().length) {
                Swiatlo aktualneSwiatlo = Swiatlo.values()[wybor - 1];
                System.out.println("Wybrano: " + aktualneSwiatlo + " -> " + aktualneSwiatlo.getKomunikat());
            }
             else {
                System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
            }
        } while (wybor != 0);

        scanner.close();
    }
}
package Tasks;

import RunInput.Input;
import java.util.HashMap;
import java.util.Map;

public class ZarzadzanieUzytkownikami {

    private Map<String, String> daneUzytkownikow;
    private Input input;

    public ZarzadzanieUzytkownikami() {
        this.daneUzytkownikow = new HashMap<>();
        this.input = new Input();
    }

    public void dodajUzytkownika() {
        System.out.println("\n--- Dodawanie nowego użytkownika ---");
        System.out.print("Podaj login: ");
        String login = input.InputString();

        if (daneUzytkownikow.containsKey(login)) {
            System.out.println("Błąd: Użytkownik o podanym loginie już istnieje.");
            return;
        }

        System.out.print("Podaj hasło: ");
        String haslo = input.InputString();

        daneUzytkownikow.put(login, haslo);
        System.out.println("Użytkownik '" + login + "' został pomyślnie dodany.");
    }

    public void zalogujUzytkownika() {
        System.out.println("\n--- Logowanie ---");
        System.out.print("Podaj login: ");
        String login = input.InputString();

        System.out.print("Podaj hasło: ");
        String haslo = input.InputString();

        if (daneUzytkownikow.containsKey(login)) {
            String poprawneHaslo = daneUzytkownikow.get(login);
            if (poprawneHaslo.equals(haslo)) {
                System.out.println("Zalogowano pomyślnie! Witaj, " + login + "!");
            } else {
                System.out.println("Błąd logowania: Nieprawidłowe hasło.");
            }
        } else {
            System.out.println("Błąd logowania: Użytkownik o podanym loginie nie istnieje.");
        }
    }

    public void uruchom() {
        int wybor;
        do {
            System.out.println("\n--- Zarządzanie użytkownikami ---");
            System.out.println("1. Dodaj nowego użytkownika");
            System.out.println("2. Zaloguj istniejącego użytkownika");
            System.out.println("0. Powrót do menu głównego");
            System.out.print("Wybierz opcję: ");

            wybor = input.InputInt();
            input.InputString();

            switch (wybor) {
                case 1:
                    dodajUzytkownika();
                    break;
                case 2:
                    zalogujUzytkownika();
                    break;
                case 0:
                    System.out.println("Powrót do menu głównego.");
                    break;
                default:
                    System.out.println("Nieprawidłowa opcja. Spróbuj ponownie.");
            }
        } while (wybor != 0);

    }
}
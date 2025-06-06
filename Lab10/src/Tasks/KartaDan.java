package Tasks;

import RunInput.Input;
import java.util.HashMap;
import java.util.Map;

public class KartaDan {

    private Map<String, Double> menu;
    private Input input;

    public KartaDan() {
        this.menu = new HashMap<>();
        this.input = new Input();
    }

    public void dodajDanie() {
        System.out.println("\n--- Dodawanie nowego dania ---");
        System.out.print("Podaj nazwę dania: ");
        String nazwaDania = input.InputString();

        if (menu.containsKey(nazwaDania)) {
            System.out.println("Danie o podanej nazwie już istnieje. Zaktualizuję cenę.");
        }

        System.out.print("Podaj cenę dania (np. 25.00): ");
        double cenaDania = input.InputDouble();


        menu.put(nazwaDania, cenaDania);
        System.out.println("Danie '" + nazwaDania + "' za " + String.format("%.2f", cenaDania) + " zł zostało dodane/zaktualizowane.");
    }

    public void wyswietlKarte() {
        System.out.println("\n--- Nasza Karta Dań ---");
        if (menu.isEmpty()) {
            System.out.println("Karta dań jest pusta.");
            return;
        }
        for (Map.Entry<String, Double> entry : menu.entrySet()) {
            System.out.println(entry.getKey() + " - " + String.format("%.2f", entry.getValue()) + " zł");
        }
    }

    public void usunDanie() {
        System.out.println("\n--- Usuwanie dania ---");
        System.out.print("Podaj nazwę dania do usunięcia: ");
        String nazwaDania = input.InputString();

        if (menu.containsKey(nazwaDania)) {
            menu.remove(nazwaDania);
            System.out.println("Danie '" + nazwaDania + "' zostało usunięte.");
        } else {
            System.out.println("Dania o nazwie '" + nazwaDania + "' nie ma w karcie.");
        }
    }

    public void obliczRachunek() {
        System.out.println("\n--- Obliczanie rachunku ---");
        if (menu.isEmpty()) {
            System.out.println("Karta dań jest pusta. Nie można obliczyć rachunku.");
            return;
        }

        wyswietlKarte();

        double calkowityRachunek = 0.0;
        Map<String, Integer> wybraneDania = new HashMap<>();

        System.out.println("Wpisuj nazwy dań (lub 'koniec' aby zakończyć):");
        while (true) {
            System.out.print("Nazwa dania (lub 'koniec'): ");
            String nazwa = input.InputString();
            if (nazwa.equalsIgnoreCase("koniec")) {
                break;
            }

            if (menu.containsKey(nazwa)) {
                System.out.print("Podaj ilość dla '" + nazwa + "': ");
                int ilosc = input.InputInt();


                if (ilosc > 0) {
                    wybraneDania.put(nazwa, wybraneDania.getOrDefault(nazwa, 0) + ilosc);
                    calkowityRachunek += menu.get(nazwa) * ilosc;
                    System.out.println("Dodano " + ilosc + " x " + nazwa);
                } else {
                    System.out.println("Ilość musi być większa od zera.");
                }
            } else {
                System.out.println("Dania '" + nazwa + "' nie ma w karcie. Spróbuj ponownie.");
            }
        }

        System.out.println("\n--- Twój rachunek ---");
        if (wybraneDania.isEmpty()) {
            System.out.println("Nie wybrano żadnych dań.");
        } else {
            System.out.print("Wybrane dania: [");
            boolean first = true;
            for (Map.Entry<String, Integer> entry : wybraneDania.entrySet()) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(entry.getValue() + "x " + entry.getKey());
                first = false;
            }
            System.out.println("]");
            System.out.println("Całkowity rachunek: " + String.format("%.2f", calkowityRachunek) + " zł");
        }
    }

    public void uruchom() {
        int wybor;
        do {
            System.out.println("\n--- Karta Dań ---");
            System.out.println("1. Dodaj nowe danie");
            System.out.println("2. Wyświetl całą kartę");
            System.out.println("3. Usuń danie");
            System.out.println("4. Oblicz rachunek");
            System.out.println("0. Powrót do menu głównego");
            System.out.print("Wybierz opcję: ");

            wybor = input.InputInt();
            input.InputString();

            switch (wybor) {
                case 1:
                    dodajDanie();
                    break;
                case 2:
                    wyswietlKarte();
                    break;
                case 3:
                    usunDanie();
                    break;
                case 4:
                    obliczRachunek();
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
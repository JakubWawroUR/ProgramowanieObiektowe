import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Pojazd> pojazdy = new ArrayList<>();
        pojazdy.add(new Samochod("S1", "Toyota"));
        pojazdy.add(new SamochodElektryczny("SE0001", "Kia"));
        pojazdy.add(new RowerElektryczny("RE001", "Romet"));

        boolean running = true;

        while (running) {
            System.out.println("\n*********** MENU ***********");
            System.out.println("1. Wyświetl dostępne pojazdy");
            System.out.println("2. Wypożycz pojazd");
            System.out.println("3. Zwróć pojazd");
            System.out.println("4. Naładuj pojazd elektryczny");
            System.out.println("5. Wyjście");
            System.out.print("Twój wybór: ");
            int wybor = scanner.nextInt();
            scanner.nextLine();

            switch (wybor) {
                case 1:
                    viewPojazdy(pojazdy);
                    break;
                case 2:
                    wypozyczPojazd(pojazdy);
                    break;
                case 3:
                    zwrocPojazd(pojazdy);
                    break;
                case 4:
                    naladujPojazd(pojazdy);
                    break;
                case 5:
                    running = false;
                    System.out.println("Do widzenia!");
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór, spróbuj ponownie.");
            }
        }
    }

    private static void wypozyczPojazd(List<Pojazd> pojazdy) {
        System.out.print("Podaj ID pojazdu do wypożyczenia: ");
        String idWyp = scanner.nextLine();
        for (Pojazd p : pojazdy) {
            if (p.getId().equals(idWyp) && p.isCzyDostepny()) {
                System.out.print("Na ile godzin chcesz wypożyczyć pojazd: ");
                int godz = scanner.nextInt();
                scanner.nextLine();
                p.wypozycz();
                System.out.println("Koszt wypożyczenia: " + p.obliczKoszt(godz) + " zł");
                return;
            }
        }
        System.out.println("Pojazd niedostępny lub nieznaleziony.");
    }

    private static void zwrocPojazd(List<Pojazd> pojazdy) {
        System.out.print("Podaj ID pojazdu do zwrotu: ");
        String idZwrotu = scanner.nextLine();
        for (Pojazd p : pojazdy) {
            if (p.getId().equals(idZwrotu) && !p.isCzyDostepny()) {
                p.zwroc();
                System.out.println("Pojazd został zwrócony.");
                return;
            }
        }
        System.out.println("Pojazd nie był wypożyczony lub nieznaleziony.");
    }

    private static void viewPojazdy(List<Pojazd> pojazdy) {
        for (Pojazd p : pojazdy) {
            System.out.println(p.getId() + " " + p.getModel() + " - " + (p.isCzyDostepny() ? "Dostępny" : "Niedostępny"));
        }
    }

    private static void naladujPojazd(List<Pojazd> pojazdy) {
        System.out.print("Podaj ID pojazdu do naładowania: ");
        String idLadu = scanner.nextLine();
        for (Pojazd p : pojazdy) {
            if (p.getId().equals(idLadu)) {
                if (p instanceof Elektryczny) {
                    ((Elektryczny) p).naladuj();
                    System.out.println("Pojazd naładowany do 100%");
                } else {
                    System.out.println("Ten pojazd nie jest elektryczny.");
                }
                return;
            }
        }
        System.out.println("Pojazd nieznaleziony.");
    }
}
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<Pojazd> pojazdy = new ArrayList<>();
        pojazdy.add(new Samochod("S1","Toyota"));
        pojazdy.add(new SamochodElektryczny("SE0001","Kia"));
        pojazdy.add(new RowerElektryczny("RE001","Romet"));


        System.out.println("\n*********** MENU ***********");
        System.out.println("1. Wyświetl dostępne pojazdy");
        System.out.println("2. Wypożycz pojazd");
        System.out.println("3. Zwróć pojazd");
        System.out.println("4. Naładuj pojazd elektryczny");
        System.out.println("5. Wyjście");
        System.out.println("Twój wybór:");
        int wybor = scanner.nextInt();


        switch (wybor){
            case 1: viewPojazdy(); break;
            case 2: wypozyczycPojazd();break;
            case 3: naladujPojazd();break;
        }
    }
    private void wypozyczycPojazd(List<Pojazd> pojazdy){
        System.out.println("Podaj ID pojazdu do wypozyczenia: ");
        String idWyp = scanner.nextLine();
        for(Pojazd p : pojazdy){
            if(p.getId().equals(idWyp)&&p.isCzyDostepny()){
                System.out.println("Na ile godzin chcesz wypozyczyc pojazd: ");
                int godz = scanner.nextInt();
                p.wypozycz();
                System.out.println("Koszt wypozyczenia "+ p.obliczKoszt(godz)+"zł");
            }
        }
    }

    private void viewPojazdy(List<Pojazd> pojazdy){
        for(Pojazd p : pojazdy){
            System.out.println((p.getId() + " "+ p.getModel()+" - "+(p.isCzyDostepny()? "Dostepny" : "Niedostepny")));

        }
    }
    private void naladujPojazd(List<Pojazd> pojazdy){
        System.out.println("Podaj ID pojazdu do naładaowania: ");
        String idLadu = scanner.nextLine();
        for(Pojazd p : pojazdy){
            if(p.getId().equals(idLadu)&& p instanceof  Elektryczny){
                ((Elektryczny) p).naladuj();
                System.out.println("Pojazd naładowany do 100%");
            }
        }
    }
}
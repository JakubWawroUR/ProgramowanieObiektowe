import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        int liczbaN = 0;

        System.out.print("Podaj liczbę całkowitą N: ");
        liczbaN = skaner.nextInt();
        skaner.close();
        if (liczbaN < 0) {
            System.out.println("Ostrzeżenie: Podana liczba N jest ujemna. Obliczenia mogą dać nieoczekiwane wyniki dla sumy i silni.");
        }

        WatekSumy watekSumy = new WatekSumy(liczbaN);
        WatekSilni watekSilni = new WatekSilni(liczbaN);

        watekSumy.start();
        watekSilni.start();

        System.out.println("\n--- Wyniki końcowe ---");
        System.out.println("Suma od 1 do " + liczbaN + ": " + watekSumy.getWynikSumy());
        System.out.println("Silnia z " + liczbaN + ": " + watekSilni.getWynikSilni());
    }
}
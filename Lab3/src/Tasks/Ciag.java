package Tasks;

import RunInput.Input;

import java.util.Random;

public class Ciag {
    public static void SumaCiagu() {
        Input input = new Input();
        int dlugoscCiagu = 0, sumaCiagu = 0, pierwszyWyraz = 0, roznica = 0, wyraz = 0;
        System.out.println("Podaj dlugosc ciagu: ");
        dlugoscCiagu = input.InputInt();
        System.out.println("Podaj pierwszy wyraz: ");
        pierwszyWyraz = input.InputInt();
        wyraz = pierwszyWyraz;
        System.out.println("Podaj roznice ciagu: ");
        roznica = input.InputInt();
        for (int i = 1; i <= dlugoscCiagu; i++) {
            if (wyraz % 2 == 0) {
                sumaCiagu += wyraz;
            }
            wyraz += roznica;
        }
        System.out.println("Suma ciagu: " + sumaCiagu);
    }
    public static void LosowanieCiagu() {
        Random rand = new Random();
        Input input = new Input();
        int suma = 0,liczba;
        int dlugoscCiagu = input.InputInt();
        for (int i = 1; i <= dlugoscCiagu; i++) {
            liczba = rand.nextInt(55)-10;
            if (liczba % 2 == 0) {
                suma += liczba;
            }
            System.out.println(liczba);
        }
        System.out.println("Suma ciagu: " + suma);
    }
}

package Tasks;

public class TablicaDzialania {
    public static void Dzialania(int[] Tablica) {
        int Suma = 0,Srednia;

        for (int i = 0; i < Tablica.length; i++) {
            Suma += Tablica[i];
        }
        Srednia = Suma/Tablica.length;
        System.out.println("Suma: " + Suma +  " Srednia: " + Srednia);
    }
}

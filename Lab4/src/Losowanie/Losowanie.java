package Losowanie;

import RunInput.Input;
import java.util.Random;
import Tasks.TablicaDzialania;

public class Losowanie {
    public static void Losowanie(){
        Random rand = new Random();
        Input input = new Input();
        System.out.println("Podaj zakres losowania:");
        int a = input.InputInt();
        int b = input.InputInt();

        System.out.println("Podaj ile ma byc wylosowanych liczb: ");
        int iloscLiczb = input.InputInt();
        int[]  Tablica = new int[iloscLiczb];
        for(int i=0;i<iloscLiczb;i++){
            Tablica[i] = rand.nextInt(b-a+1)+a;
        }
        TablicaDzialania.Dzialania(Tablica);
    }
}

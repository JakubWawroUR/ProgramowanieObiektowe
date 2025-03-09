package RunInput;

import Losowanie.Losowanie;
import Tasks.TablicaElemnty;
import Tasks.TablicaLitery;
import Tasks.TablicaOdwrotnosc;

public class Run {
    public void RunTasks() {
        Input input = new Input();
        System.out.println("Wybierz zadanie do rozwiązania:");
        int wybor = input.InputInt();

        switch (wybor) {
            case 1:
                Losowanie.Losowanie();
                break;
            case 2:
                TablicaElemnty.wypisanieElementów();
                break;
            case 3:
                TablicaLitery.DuzeLitery();
                break;
            case 4:
                TablicaOdwrotnosc.Zamiana();
                break;
        }

    }
}

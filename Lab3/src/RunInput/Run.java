package RunInput;

import Tasks.*;

public class Run {
    public void RunTasks() {
        Input input = new Input();
        System.out.println("Wybierz zadanie do rozwiązania:");
        int wybor = input.InputInt();

        switch (wybor) {
            case 1:
                Student.ObliczSredniaOcen();
                break;
            case 2:
                Suma.Sumy();
                break;
            case 3:
                Ciag.SumaCiagu();
                break;
            case 4:
                Ciag.LosowanieCiagu();
                break;
            case 5:
                Palindrom.SprawdzaniePalindrom();
                break;
        }

    }
}

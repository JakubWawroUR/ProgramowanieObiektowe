package RunInput;

import Budynek.Budynki;
import FiguryGeometryczne.*;

public class Run {
    public void RunTasks() {
        Input input = new Input();
        System.out.println("Wybierz zadanie do rozwiązania:");
        int wybor = input.InputInt();

        switch (wybor) {
            case 1:
                switch (wybor) {
                    case 1:
                        System.out.println("Podaj promień koła:");
                        double promienKola = input.InputDouble();
                        Kolo kolo = new Kolo(promienKola);
                        kolo.wyswietlDane();
                        break;
                    case 2:
                        System.out.println("Podaj bok kwadratu:");
                        double kwadratA = input.InputDouble();
                        Kwadrat kwadrat = new Kwadrat(kwadratA);
                        kwadrat.wyswietlDane();
                        break;
                    case 3:
                        System.out.println("Podaj boki prostokata: ");
                        double prostokatA = input.InputDouble();
                        double prostokatB = input.InputDouble();
                        Prostokat prostokat = new Prostokat(prostokatA,prostokatB);
                        prostokat.wyswietlDane();
                        break;
                    case 4:
                        System.out.println("Podaj promien kuli: ");
                        double promienKuli = input.InputDouble();
                        Kula kula = new Kula(promienKuli);
                        kula.wyswietlDane();
                        break;
                    case 5:
                        System.out.println("Podaj 3 boki prostopadloscianu: ");
                        double prostopadloscianA = input.InputDouble();
                        double prostopadloscianB = input.InputDouble();
                        double prostopadloscianC = input.InputDouble();
                        Prostopadloscian prostopadloscian = new Prostopadloscian(prostopadloscianA,prostopadloscianB,prostopadloscianC);
                        prostopadloscian.wyswietlDane();
                        break;
                    case 6:
                        System.out.println("Podaj promein stozka wysokosc i dlugosc laczaca krawedz podstawy z czubkiem stozka: ");
                        double promienSotzka = input.InputDouble();
                        double wysokoscStozka = input.InputDouble();
                        double stozekL = input.InputDouble();
                        Stozek stozek = new Stozek(promienSotzka,wysokoscStozka,stozekL);
                        stozek.wyswietlDane();
                        break;
                    default:
                        System.out.println("Źle wprowadzone dane");
                        break;
                }
            case 2:
                Budynki.Budynki();

                break;
        }


    }
}

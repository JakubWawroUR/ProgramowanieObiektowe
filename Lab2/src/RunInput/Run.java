package RunInput;
import Tasks.Tasks;

public class Run {
    public void RunTasks() {

        Input input = new Input();
        System.out.println("Wybierz zadanie do rozwiązania:");
        int wybor = input.InputInt();
        String wynik;
        int x,y,z,a,b,c;
        switch (wybor){
            case 1:
                System.out.println("Podaj a,b,c aby rozwiązać równanie kwadratowe:");
                a =  input.InputInt();
                b = input.InputInt();
                c = input.InputInt();
                wynik = Tasks.RownanieKwadratowe(a,b,c);
                System.out.println(wynik);
                break;
            case 2:
                System.out.println("Podaj wartosc x aby wyznaczyc warrtosci funkcji:");
                x = input.InputInt();
                wynik = Tasks.WyznaczanieWartosciFunkcji(x);
                System.out.println(wynik);
                break;
            case 3:
                System.out.println("Podaj wartosci x,y,z a zostaną posegregowane wielkościowo:");
                x = input.InputInt();
                y = input.InputInt();
                z = input.InputInt();
                int[] wartosci = {x,y,z};
                wynik = Tasks.Segregacja(wartosci);
                System.out.println(wynik);
                break;
            case 4:
                System.out.println("Wybierz wartośći zależnie od zdarzenia:\nJeśli pada deszcz to wybierz true jeśli go nie ma wybierz false");
                boolean padaDeszcz = input.InputBool();
                System.out.println("Jeśli jest autobus to wybierz true jeśli go nie ma wybierz false");
                boolean jestAutobus = input.InputBool();
                wynik = Tasks.Uczelnia(padaDeszcz,jestAutobus);
                System.out.println(wynik);
                break;
            case 5:
                System.out.println("Wybierz wartości zależnie od zdarzenia:\nJeśli jest zniżka to wybierz true jeśli go nie ma wybierz false");
                boolean znizka = input.InputBool();
                System.out.println("Otrzymales podwyżke jesli tak to wybierz true jeśli nie otrzymałes wybierz false");
                boolean premia = input.InputBool();
                wynik = Tasks.Samochod(znizka,premia);
                System.out.println(wynik);
            case 6:
                int wyborOperacji;
                double liczba1;
                double liczba2;
                double wynikDzialania;
                while(true){


                    System.out.println("Wybierz operacje którą chcesz wykonać:\n1.dodawanie\n2.odejmowanie\n3.iloczyn\n4.iloraz\n5.reszte z dzielenia\n6.przerwij");
                    wyborOperacji =  input.InputInt();
                    if(wyborOperacji==6){
                        break;
                    }else if(wyborOperacji == 1){
                        System.out.println("Wybrałeś dodawanie podaj 2 liczby które chcesz dodać");

                    }else if(wyborOperacji == 2){
                        System.out.println("Wybrałeś odejmowanie podaj 2 liczby ktore chcesz odjąć od siebie");
                    }else if(wyborOperacji == 3){
                        System.out.println("Wybrałeś operacje iloczynu podaj 2 liczby które chcesz pomnożyć");
                    }else if (wyborOperacji == 4){
                        System.out.println("Wybrałeś operacje ilorazu podaj 2 liczby które chcesz podzielić");
                    }else if(wyborOperacji == 5){
                        System.out.println("Wybrałeś operacje reszty z dzielenia podaj 2 liczby które chcesz podzielić i otrzymać ich resztę z dzielenia");
                    }
                    liczba1 = input.InputInt();
                    liczba2 = input.InputInt();
                    wynikDzialania = Tasks.OperacjeMatemtyczne(liczba1,liczba2,wyborOperacji);
                    System.out.println(wynikDzialania);
                }
        }

    }
}

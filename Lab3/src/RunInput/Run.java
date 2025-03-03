package RunInput;

import Tasks.Tasks;

public class Run {
    public void RunTasks(){
        Input input = new Input();
        System.out.println("Wybierz zadanie do rozwiązania:");
        int wybor = input.InputInt();
        double wynik;
        switch (wybor){
            case 1:
                System.out.println("Podaj liczbe studentow");
                int n = input.InputInt();
                int i = 0;
                int SumaPuntkow = 0;
                int punkty;

                while(n>i){
                    System.out.println("Wprowadz punkty dla studenta nr:" +(i+1));

                    punkty = input.InputInt();
                    if(punkty>=0 && punkty<=10){
                        ++i;
                        SumaPuntkow =SumaPuntkow+ punkty;
                    }
                    wynik = Tasks.Losowanie(n,SumaPuntkow);
                    System.out.println("Średnia ocen wynosi: " + wynik);
                }break;
            case 2:
                int n = 0;
                int SumaDodatnich = 0;
                int SumaUjemnych = 0;
                int Liczba;
                int Dodatnie = 0;
                int Ujemne = 0;
                while(n>10){
                    Liczba = input.InputInt();
                    if(Liczba>=0){
                        Dodatnie++;
                        SumaDodatnich = SumaDodatnich + Liczba;
                    }else {
                        SumaUjemnych = SumaUjemnych + Liczba;
                        Ujemne++;
                    }
                    n++;
                }
                wynik = Tasks.Suma(SumaDodatnich,SumaUjemnych,Dodatnie,Ujemne);
                System.out.println(wynik);
                break;
                }
        }
    }


}

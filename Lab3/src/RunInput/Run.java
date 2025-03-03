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
                }
                wynik = Tasks.Losowanie(n,SumaPuntkow);
                System.out.println("Średnia ocen wynosi: " + wynik);
        }
    }


}

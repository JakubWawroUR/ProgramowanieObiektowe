package RunInput;
import Task.Tasks;
import java.util.Random;


public class Run {

    public void RunTask(){
        Tasks tasks = new Tasks();
        Input input = new Input();

        System.out.println("Laboratorium 1\n");
        System.out.println("Zadanie 1");
        System.out.println("Zadanie 2");
        System.out.println("Zadanie 3");
        System.out.println("Zadanie 4");
        System.out.println("Zadanie 5");
        System.out.println("Zadanie 6");
        System.out.println("Zadanie 7");
        System.out.println("Wybierz zadananie:");


        int wybor = input.InputInt();
        switch (wybor){
            case 1:
                System.out.println(tasks.DataUser());
            case 2:
                System.out.println("Podaj 1 liczbe:");
                int liczba1 = input.InputInt();
                System.out.println("Podaj 2 liczbe:");
                int liczba2 = input.InputInt();
                System.out.println(tasks.Dzialania(liczba1,liczba2));
            case 3:
                System.out.println("Podaj 1 liczbe:");
                int liczba3 = input.InputInt();
                System.out.println(tasks.Parzystosc(liczba3));
            case 4:
                System.out.println("Podaj 1 liczbe:");
                int liczba4 = input.InputInt();
                System.out.println(tasks.Podzielna(liczba4));
            case 5:
                System.out.println("Podaj 1 liczbe:");
                int liczba5 = input.InputInt();
                System.out.println(tasks.Potega3(liczba5));
            case 6:
                System.out.println("Podaj 1 liczbe:");
                int liczba6 = input.InputInt();
                System.out.println(tasks.Pierwiastek(liczba6));
            case 7:
                System.out.println("Podaj 1 liczbe:");
                int liczba7 = input.InputInt();
                System.out.println("Podaj 2 liczbe");
                int liczba8 = input.InputInt();
                Random random = new Random();
                int number1 = random.nextInt(liczba7,liczba8+1);
                int number2 = random.nextInt(liczba7,liczba8+1);
                int number3 = random.nextInt(liczba7,liczba8+1);
                System.out.println(number1 + " " + number2 + " " + number3);
                System.out.println(tasks.TrojkatProstokatny(number1,number2,number3));
                break;
            default: System.out.println("Nie ma takiego zadania");

        }
    }

}

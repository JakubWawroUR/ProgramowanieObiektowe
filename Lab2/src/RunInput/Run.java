package RunInput;
import Tasks.Tasks;

public class Run {
    public void RunTasks() {
        Tasks tasks = new Tasks();
        Input input = new Input();
        System.out.println("Wybierz zadanie do rozwiązania:");
        int wybor = input.InputInt();
        switch (wybor){
            case 1:
                System.out.println("Podaj a,b,c aby rozwiązać równanie kwadratowe:");
                int a =  input.InputInt();
                int b = input.InputInt();
                int c = input.InputInt();
                String wynik = tasks.RownanieKwadratowe(a,b,c);
                System.out.println(wynik);
        }
    }
}

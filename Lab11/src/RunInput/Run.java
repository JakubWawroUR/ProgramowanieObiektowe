package RunInput;


import Tasks.PizzaZamowienie;
import Tasks.SymulatorSwiatel;

public class Run {

    public void RunTask(){
        Input input = new Input();

        System.out.println("Laboratorium 10\n");
        System.out.println("Zadanie 1");
        System.out.println("Zadanie 2");
        System.out.println("Zadanie 3");
        System.out.println("Wybierz zadananie:");


        int wybor = input.InputInt();
        switch (wybor){
            case 1:
                SymulatorSwiatel symulatorSwiatel = new SymulatorSwiatel();
                symulatorSwiatel.uruchom();
            case 2:
                PizzaZamowienie pizzaZamowienie = new PizzaZamowienie();
                pizzaZamowienie.uruchom();
            default: System.out.println("Nie ma takiego zadania");

        }
    }

}

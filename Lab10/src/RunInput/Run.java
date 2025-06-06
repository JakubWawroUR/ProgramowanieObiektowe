package RunInput;


import RunInput.ZliczanieSlow;

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
                ZliczanieSlow zs = new ZliczanieSlow();
                zs.ZliczSlowa();
            case 2:

            case 3:
                break;
            default: System.out.println("Nie ma takiego zadania");

        }
    }

}

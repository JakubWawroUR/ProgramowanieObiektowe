package RunInput;
import Tasks.KartaDan;
import Tasks.ZarzadzanieUzytkownikami;
import Tasks.ZliczanieSlow;

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
                ZliczanieSlow zliczanieSlow = new ZliczanieSlow();
                zliczanieSlow.ZliczSlowa();
            case 2:
                ZarzadzanieUzytkownikami zarzadzanieUzytkownikami = new ZarzadzanieUzytkownikami();
                zarzadzanieUzytkownikami.uruchom();
            case 3:
                KartaDan kartaDan = new KartaDan();
                kartaDan.uruchom();
            default: System.out.println("Nie ma takiego zadania");

        }
    }

}

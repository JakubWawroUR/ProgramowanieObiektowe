package Tasks;

import RunInput.Input;

public class Student {
    public static void ObliczSredniaOcen() {
        Input input = new Input();
        System.out.println("Podaj liczbę studentów");
        int liczbaStudent = input.InputInt();
        int Ocena;
        int SumaOcen = 0;
        double SredniaStudentow;
        for (int i = 0; i < liczbaStudent; i++) {
            System.out.println("Podaj ocene studenta numer: " + (i + 1));
            Ocena = input.InputInt();
            if (Ocena > 0 && Ocena <= 6) {
                SumaOcen += Ocena;
            }else i--;
        }
        SredniaStudentow = (double) SumaOcen/liczbaStudent;
        System.out.println("Średnia studentów wynosi:" +SredniaStudentow);
    }
}

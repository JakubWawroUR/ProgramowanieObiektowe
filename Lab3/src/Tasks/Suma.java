package Tasks;

import RunInput.Input;

public class Suma {
    public static void Sumy(){
        Input input = new Input();
        System.out.println("Podaj 10 kolejnych liczb:\n");
        int SumaDodatnich = 0, SumaUjemnych = 0,IloscDodatnich = 0,IloscUjemnych = 0;
        for (int i = 1; i <= 10; i++) {
            int liczba =  input.InputInt();
            if (liczba >= 0) {
                SumaDodatnich += liczba;
                IloscDodatnich++;
            }else{
                SumaUjemnych += liczba;
                IloscUjemnych++;
            }
        }
        System.out.println("Suma dodatnich: " + SumaDodatnich +" Ilosc dodatnich: " + IloscDodatnich+ "\nSuma ujemnych: " + SumaUjemnych +" Ilosc ujemnych: " + IloscUjemnych);
    }

}

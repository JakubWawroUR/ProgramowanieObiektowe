package Tasks;

import RunInput.Input;

public class TablicaOdwrotnosc {
    public static void Zamiana(){
        String[] Tablica = new String[5];
        Input input = new Input();
        String slowo;
        for (int i = 0; i<5;i++){
            Tablica[i] = input.InputString();
        }
        for(int i=Tablica.length -1;i>=0;i--){
            slowo = Tablica[i];
            String reversed = new StringBuilder(slowo).reverse().toString();
            System.out.println(reversed);
        }
    }
}

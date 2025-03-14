package Biologia;

import Budynek.Budynek;
import RunInput.Input;

import java.util.ArrayList;
import java.util.Arrays;

public class Gatunki {
    public static void Gatunki(){
        Input input = new Input();
        ArrayList<Gatunek> gatunki = new ArrayList<>(Arrays.asList(
                new Gatunek("Homo","sapiens","Gatunek ssaka z rodziny człowiekowatych, charakteryzujący się wysokim poziomem inteligencji i zdolnością do tworzenia skomplikowanych narzędzi",46,23),
                new Gatunek("Canis","lupus","Gatunek drapieżnego ssaka z rodziny psowatych, zamieszkujący lasy, tundry i stepy półkuli północnej",78,39),
                new Gatunek("Drosophila","melanogaster","Gatunek owada z rodziny muszkowatych, często wykorzystywany w badaniach genetycznych ze względu na krótki cykl życiowy i prostą budowę genetyczną",8,4)
        ));
        System.out.println("Wybierz jaki zadanie ma wykonać");
        int wybor = input.InputInt();
        switch(wybor){
            case 1:
                System.out.println("wybierz ktory gatunek wybrac");
                wybor = input.InputInt();
                gatunki.get(wybor).wszystkieDane();
                break;
            case 2:
                System.out.println("wybierz ktory gatunek wybrac");
                wybor = input.InputInt();
                gatunki.get(wybor).haploidlnaLiczbaChromosomowN();
                break;
            case 3:
                System.out.println("wybierz ktory gatunek wybrac");
                wybor = input.InputInt();
                gatunki.get(wybor).pelnaNazwa();

        }

    }
}

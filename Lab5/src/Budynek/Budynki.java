package Budynek;

import RunInput.Input;

import java.util.ArrayList;
import java.util.Arrays;

public class Budynki {
    public static void Budynki(){
        Input input = new Input();
        ArrayList<Budynek> budynki = new ArrayList<>(Arrays.asList(
                new Budynek("Budynek 1", 2000, 6),
                new Budynek("Budynek 2", 2012, 10),
                new Budynek("Budynek 3", 1992, 3),
                new Budynek("Budynek 4", 1995, 7),
                new Budynek("Budynek 5", 1998, 8),
                new Budynek("Budynek 6", 1999, 9)
        ));
        System.out.println("Wybierz budynek ktory chcesz wyświetlić od 0-5");
        int wybor = input.InputInt();
        budynki.get(wybor).wyswietlDane();
    }
}

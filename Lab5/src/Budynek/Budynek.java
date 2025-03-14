package Budynek;

import java.time.LocalDate;
public class Budynek {
    String nazwa;
    int rokBudowy;
    int liczbaPieter;

    public Budynek(String nazwa, int rokBudowy, int liczbaPieter) {
        this.nazwa = nazwa;
        this.rokBudowy = rokBudowy;
        this.liczbaPieter = liczbaPieter;
    }
    public void wyswietlDane() {
        System.out.println("Nazwa budynek: " + nazwa);
        System.out.println("Rok budowy: " + rokBudowy);
        System.out.println("Liczba pieter: " + liczbaPieter);
        System.out.println("Budynek powstał: " + wiekBudynku() + " lat temu");
    }
    public int wiekBudynku(){
        final int obecnyRok = LocalDate.now().getYear();
        return  obecnyRok - rokBudowy;
    }
}
